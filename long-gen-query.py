import os
seed=1
os.system("./clear-all")
os.system("./run.sh")
while True:
	outputFiles = []
	outputFiles.append("errors/" + str(seed))
	outputFiles.append("mysql_logs/" + str(seed))
	outputFiles.append("sqlite_logs/" + str(seed))
	outputFiles.append("diff/" + str(seed))
	os.system("~/project/antlr4/gen-query " + str(seed) + " 2>" + outputFiles[0])
	for f in outputFiles:
		if os.path.exists(f):
			if os.stat(f).st_size == 0:
				os.remove(f)
	seed = seed + 1
