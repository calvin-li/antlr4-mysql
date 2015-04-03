import os
seed=1
os.system("./run.sh")
while True:
	errorfile = "errors/" + str(seed) + ".txt"
	logfile = "logs/" + str(seed) + ".txt"
	os.system("~/project/antlr4/gen-query " + str(seed) + " 2>" + errorfile)
	if os.stat(errorfile).st_size == 0:
		os.remove(errorfile)
	if os.stat(logfile).st_size == 0:
		os.remove(logfile)
	seed = seed + 1
