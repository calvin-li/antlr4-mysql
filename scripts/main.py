import subprocess
import sys
from cd import cd
import call

def exit(code):
	sys.exit(code)

def appendToFile(directory, fileName, content):
	if not(content.isspace()):
		with cd(directory):
			with open(fileName, "a") as f:
				f.write('\n' + content.strip() + '\n\n')

def errorDump(message, output):
	if not(output[1].isspace()):
		combinedOutput = message + '\n-----\n' + output[1].strip()
		appendToFile("errors", seed, combinedOutput)

try:
	seed = sys.argv[1]
except IndexError:
	seed = "0"

#generate a basic query
out = call.cmd(["python gen-query.py " + seed])
errorDump("error in query generation", out)
appendToFile("queries", seed, out[0])

#fuzz query
with cd("/home/calli/project/antlr4/"):
	queryFile = "~/project/scripts/queries/" + seed
	out = call.cmd(["java fuzzer.Main " + seed + " " + queryFile])
errorDump("error in query fuzzing", out)
appendToFile("fuzzed", seed, out[0])

#run mysql
out = call.cmd(["mysql -h 127.0.0.1 -P 19300 -u root -D test < fuzzed/" + seed])
errorDump("error in mysql", out)
appendToFile("mysql_logs", seed, out[0])

#run sqlite
out = call.cmd(["sqlite3 db.sqlite < fuzzed/" + seed])
errorDump("error in sqlite", out)
appendToFile("sqlite_logs", seed, out[0])

#find diff
out = call.cmd(["diff mysql_logs/" + seed + " sqlite_logs/" + seed])
errorDump("error in diff", out)
appendToFile("diff", seed, out[0])
