import call
import subprocess
import sys
import os

seed = sys.argv[1]

with call.cd("~/project/randgen"):
	o = call.cmd(["../scripts/gensql.sh " + seed])
	print o[0]
	print >>sys.stderr, o[1]
