from call import cd, cmd

#pre processing
cmd(["./clear-all"])	#clear old logs.
#with cd("/home/calli/project/antlr4/"):
	#cmd(["./compile-fuzzer.sh"])

seed = 1
while True:
	cmd(["python ~/project/scripts/main.py " + str(seed)])
	seed = seed + 1
