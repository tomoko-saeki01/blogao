@ECHO OFF
IF "%1" == "" GOTO DEFAULT

SET project="%1"
GOTO RUN

:DEFAULT
SET project=..\appdb

:RUN
ECHO Loading resources from %project%
C:\PROGRA~1\Java\JDK16~1.0_2\bin\java.exe -Dkvem.home="C:\WTK2.5.1" -cp "C:\WTK25~1.1"/wtklib/kvem.jar;"C:\WTK25~1.1"/wtklib/kenv.zip;"C:\WTK25~1.1"/wtklib/ktools.zip com.sun.kvem.global.ui.MIAManagerDialog %project%
