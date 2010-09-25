@echo off
set DO=java -cp .;lib\easyaccept.jar easyaccept.EasyAccept build.br.edu.ufcg.blogao.webservice.BlogWSImpl
set LO=test\easyaccepttests\

echo Testando US 1
%DO% %LO%us1.txt
echo Testando US 2
%DO% %LO%us2.txt
echo Testando US 3
%DO% %LO%us3.txt
echo Testando US 4
%DO% %LO%us4.txt
echo Testando US 5
%DO% %LO%us5.txt
echo Testando US 6
%DO% %LO%us6.txt
echo Testando US 7
%DO% %LO%us7.txt
echo Testando US 8
%DO% %LO%us8.txt
echo Testando US 9
%DO% %LO%us9.txt
echo Testando US 10
%DO% %LO%us10.txt
echo Testando US 11
%DO% %LO%us11.txt
echo Testando US 12
%DO% %LO%us12.txt
echo Testando US 13
%DO% %LO%us13.txt
echo Testando US 14
%DO% %LO%us14.txt