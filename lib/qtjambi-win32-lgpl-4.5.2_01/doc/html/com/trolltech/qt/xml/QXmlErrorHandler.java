package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlErrorHandler class provides an interface to report errors in XML data. If you want your application to report errors to the user or to perform customized error handling, you should subclass this class. <p>You can set the error handler with {@link com.trolltech.qt.xml.QXmlReader#setErrorHandler(com.trolltech.qt.xml.QXmlErrorHandlerInterface) QXmlReader::setErrorHandler()}. <p>Errors can be reported using {@link com.trolltech.qt.xml.QXmlErrorHandler#warning(com.trolltech.qt.xml.QXmlParseException) warning()}, {@link com.trolltech.qt.xml.QXmlErrorHandler#error(com.trolltech.qt.xml.QXmlParseException) error()} and {@link com.trolltech.qt.xml.QXmlErrorHandler#fatalError(com.trolltech.qt.xml.QXmlParseException) fatalError()}, with the error text being reported with {@link com.trolltech.qt.xml.QXmlErrorHandler#errorString() errorString()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlDTDHandler QXmlDTDHandler}, {@link com.trolltech.qt.xml.QXmlDeclHandler QXmlDeclHandler}, {@link com.trolltech.qt.xml.QXmlContentHandler QXmlContentHandler}, {@link com.trolltech.qt.xml.QXmlEntityResolver QXmlEntityResolver}, {@link com.trolltech.qt.xml.QXmlLexicalHandler QXmlLexicalHandler}, and {@link <a href="../qtxml.html">Introduction to SAX2</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QXmlErrorHandler extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.xml.QXmlErrorHandlerInterface
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.xml.QXmlErrorHandler {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public boolean error(com.trolltech.qt.xml.QXmlParseException exception) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_error_QXmlParseException(nativeId(), exception == null ? 0 : exception.nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.lang.String errorString() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_errorString(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean fatalError(com.trolltech.qt.xml.QXmlParseException exception) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_fatalError_QXmlParseException(nativeId(), exception == null ? 0 : exception.nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean warning(com.trolltech.qt.xml.QXmlParseException exception) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_warning_QXmlParseException(nativeId(), exception == null ? 0 : exception.nativeId());
        }
    }


/**
Creates a new QXmlErrorHandler.
*/

    public QXmlErrorHandler(){
        super((QPrivateConstructor)null);
        __qt_QXmlErrorHandler();
    }

    native void __qt_QXmlErrorHandler();

/**
A reader might use this function to report a recoverable error. A recoverable error corresponds to the definiton of "error" in section 1.2 of the XML 1.0 specification. Details of the error are stored in <tt>exception</tt>. <p>The reader must continue to provide normal parsing events after invoking this function. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlErrorHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public abstract boolean error(com.trolltech.qt.xml.QXmlParseException exception);
    @QtBlockedSlot
    native boolean __qt_error_QXmlParseException(long __this__nativeId, long exception);

/**
The reader calls this function to get an error string if any of the handler functions returns false.
*/

    @QtBlockedSlot
    public abstract java.lang.String errorString();
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
A reader must use this function to report a non-recoverable error. Details of the error are stored in <tt>exception</tt>. <p>If this function returns true the reader might try to go on parsing and reporting further errors, but no regular parsing events are reported.
*/

    @QtBlockedSlot
    public abstract boolean fatalError(com.trolltech.qt.xml.QXmlParseException exception);
    @QtBlockedSlot
    native boolean __qt_fatalError_QXmlParseException(long __this__nativeId, long exception);

/**
A reader might use this function to report a warning. Warnings are conditions that are not errors or fatal errors as defined by the XML 1.0 specification. Details of the warning are stored in <tt>exception</tt>. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlErrorHandler#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public abstract boolean warning(com.trolltech.qt.xml.QXmlParseException exception);
    @QtBlockedSlot
    native boolean __qt_warning_QXmlParseException(long __this__nativeId, long exception);

/**
@exclude
*/

    public static native QXmlErrorHandler fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlErrorHandler(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QXmlErrorHandler(long ptr);
}
