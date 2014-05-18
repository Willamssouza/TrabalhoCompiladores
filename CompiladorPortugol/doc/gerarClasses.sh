echo SableCC estar gerando as classes.
java -jar sablecc.jar EspecificacaoPortugol.txt
rm -rf ../src/lexer/ ../src/parser/ ../src/node/ ../src/analysis/
echo Classes geradas com sucesso.

echo Movendo arquivos gerados.
mv -v lexer/ ../src/lexer/
mv -v parser/ ../src/parser/
mv -v node/ ../src/node/
mv -v analysis/ ../src/analysis

