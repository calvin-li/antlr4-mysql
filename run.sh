cp java/*.java gen/
java -Xmx500M -cp "/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH" org.antlr.v4.Tool -o gen -package "gen" mysql_expressions.g4
javac gen/*.java
java org.antlr.v4.runtime.misc.TestRig gen.mysql_expressions query < query.txt
