call antlr4 -o fuzzer/gen -package fuzzer.gen -visitor mysql_expressions.g4
javac fuzzer/*.java
javac fuzzer/gen/*.java
grun fuzzer.gen.mysql_expressions query -gui < query.txt
REM java fuzzer.Main query.txt