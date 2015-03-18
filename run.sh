java -Xmx500M -cp "/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH" org.antlr.v4.Tool -o fuzzer/gen -package "fuzzer.gen" -visitor mysql_expressions.g4
javac fuzzer/gen/*.java
javac fuzzer/*.java
java fuzzer.Main query.txt
