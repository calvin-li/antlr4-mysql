java -Xmx500M -cp "/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH" org.antlr.v4.Tool -o gen mysql_expressions.g4
javac gen/mysql_expressions*.java
cd gen
java org.antlr.v4.runtime.misc.TestRig mysql_expressions query < ../query.txt
cd ..
