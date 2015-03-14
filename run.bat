xcopy /y java gen
call antlr4 -o gen -package gen mysql_expressions.g4
javac gen/*.java
grun gen.mysql_expressions query -gui < query.txt
