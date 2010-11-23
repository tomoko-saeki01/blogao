@echo off
C:\PROGRA~1\Java\JDK16~1.0_2\bin\java.exe -Dkvem.home="C:\WTK2.5.1" -Djava.library.path="C:\WTK25~1.1"/bin;%MEDIA_PLAYER_DM% -Dsun.java2d.ddlock=true -Dsun.java2d.gdiblit=false -cp "C:\WTK25~1.1"/wtklib/kenv.zip;"C:\WTK25~1.1"/wtklib/ktools.zip;"C:\WTK25~1.1"/wtklib/customjmf.jar;%MEDIA_PLAYER_DM%/QTJava.zip com.sun.kvem.environment.EmulatorWrapper %*
