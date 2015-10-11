import subprocess
import sys
from cd import cd
import call

def exit(code):
	sys.exit(code)

def appendToFile(directory, fileName, content):
	if not(content.isspace()) and content: #not empty or spaces
		with cd(directory):
			with open(fileName, "a") as f:
				f.write('\n' + content.strip() + '\n\n')

def errorDump(message, output):
	if not(output.isspace()) and output:
		combinedOutput = message + '\n-----\n' + output.strip()
		appendToFile("errors", seed, combinedOutput)

try:
	seed = sys.argv[1]
except IndexError:
	seed = "0"

#generate a basic query
out = call.cmd(["python gen-query.py " + seed])
errorDump("error in query generation", out[1])
appendToFile("queries", seed, out[0])
call.cmd([r"sed -i 's/(/\n(\n/g;s/)/\n)\n/g' queries/" + seed])

#fuzz query
with cd("/home/calli/project/antlr4/"):
	queryFile = "~/project/scripts/queries/" + seed
	out = call.cmd(["java fuzzer.Main " + seed + " " + queryFile])
errorDump("error in query fuzzing", out[1])
appendToFile("fuzzed", seed, out[0])

#run mysql
out = call.cmd(["mysql -h 127.0.0.1 -P 19300 -u root -D test -N -B < fuzzed/" + seed])
errorDump("error in mysql", out[1])
appendToFile("mysql_logs", seed, out[0])
call.cmd(["sort mysql_logs/" + seed + " -o mysql_logs/" + seed])
call.cmd(["sed -i -- 's/NULL/    /g' mysql_logs/" + seed])

#run sqlite
out = call.cmd(["sqlite3 db.sqlite -column < fuzzed/" + seed])
errorDump("error in sqlite", out[1])
appendToFile("sqlite_logs", seed, out[0])
call.cmd(["sort sqlite_logs/" + seed + " -o sqlite_logs/" + seed])

#find diff
out = call.cmd(["cmp mysql_logs/" + seed + " sqlite_logs/" + seed])
errorDump("error in diff", out[1])
appendToFile("diff", seed, out[0])
