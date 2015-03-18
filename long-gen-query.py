from os import system
seed=1
while True:
	system("~/project/antlr4/gen-query " + str(seed) + " 2>errors/" + str(seed) + ".txt")
	seed = seed + 1
