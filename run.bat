call antlr4 -o fuzzer/gen -package fuzzer.gen -visitor mysql_expressions.g4
javac fuzzer/*.java
javac fuzzer/gen/*.java
java fuzzer.Main query.txt