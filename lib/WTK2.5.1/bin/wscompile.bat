@echo off

rem Get command line arguments and save them
set CMD_LINE_ARGS=
:setArgs
if ""%1""=="""" goto doneSetArgs
set CMD_LINE_ARGS=%CMD_LINE_ARGS% %1
shift
goto setArgs
:doneSetArgs

C:\PROGRA~1\Java\JDK16~1.0_2\bin\java.exe -Dkvem.home="C:\WTK2.5.1" -cp "C:\WTK25~1.1"/wtklib/ktools.zip;"C:\WTK25~1.1"/wtklib/kenv.zip;"C:\WTK25~1.1"/bin/j2me_sg_ri.jar;"C:\WTK25~1.1"/bin/schema2beansdev.jar;"C:\WTK25~1.1"/lib/j2me-ws.jar;"C:\WTK25~1.1"/lib/j2me-xmlrpc.jar;"C:\WTK25~1.1"/bin/jaxrpc-impl.jar;"C:\WTK25~1.1"/bin/jaxrpc-api.jar;"C:\WTK25~1.1"/bin/jaxrpc-spi.jar;"C:\WTK25~1.1"/bin/activation.jar;"C:\WTK25~1.1"/bin/mail.jar;"C:\WTK25~1.1"/bin/saaj-api.jar;"C:\WTK25~1.1"/bin/saaj-impl.jar;"C:\WTK25~1.1"/bin/xsdlib.jar com.sun.kvem.ktools.WSCompile %CMD_LINE_ARGS%
