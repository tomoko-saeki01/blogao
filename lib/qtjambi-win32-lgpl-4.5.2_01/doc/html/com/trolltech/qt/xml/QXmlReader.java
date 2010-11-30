package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlReader class provides an interface for XML readers (i. . parsers). This abstract class provides an interface for all of Qt's XML readers. Currently there is only one implementation of a reader included in Qt's XML module: {@link com.trolltech.qt.xml.QXmlSimpleReader QXmlSimpleReader}. In future releases there might be more readers with different properties available (e.g. a validating parser). <p>The design of the XML classes follows the SAX2 Java interface, with the names adapted to fit Qt naming conventions. It should be very easy for anybody who has worked with SAX2 to get started with the Qt XML classes. <p>All readers use the class {@link com.trolltech.qt.xml.QXmlInputSource QXmlInputSource} to read the input document. Since you are normally interested in particular content in the XML document, the reader reports the content through special handler classes ({@link com.trolltech.qt.xml.QXmlDTDHandler QXmlDTDHandler}, {@link com.trolltech.qt.xml.QXmlDeclHandler QXmlDeclHandler}, {@link com.trolltech.qt.xml.QXmlContentHandler QXmlContentHandler}, {@link com.trolltech.qt.xml.QXmlEntityResolver QXmlEntityResolver}, {@link com.trolltech.qt.xml.QXmlErrorHandler QXmlErrorHandler} and {@link com.trolltech.qt.xml.QXmlLexicalHandler QXmlLexicalHandler}), which you must subclass, if you want to process the contents. <p>Since the handler classes only describe interfaces you must implement all the functions. We provide the {@link com.trolltech.qt.xml.QXmlDefaultHandler QXmlDefaultHandler} class to make this easier: it implements a default behavior (do nothing) for all functions, so you can subclass it and just implement the functions you are interested in. <p>Features and properties of the reader can be set with {@link com.trolltech.qt.xml.QXmlReader#setFeature(java.lang.String, boolean) setFeature()} and setProperty() respectively. You can set the reader to use your own subclasses with {@link com.trolltech.qt.xml.QXmlReader#setEntityResolver(com.trolltech.qt.xml.QXmlEntityResolverInterface) setEntityResolver()}, {@link com.trolltech.qt.xml.QXmlReader#setDTDHandler(com.trolltech.qt.xml.QXmlDTDHandlerInterface) setDTDHandler()}, {@link com.trolltech.qt.xml.QXmlReader#setContentHandler(com.trolltech.qt.xml.QXmlContentHandlerInterface) setContentHandler()}, {@link com.trolltech.qt.xml.QXmlReader#setErrorHandler(com.trolltech.qt.xml.QXmlErrorHandlerInterface) setErrorHandler()}, {@link com.trolltech.qt.xml.QXmlReader#setLexicalHandler(com.trolltech.qt.xml.QXmlLexicalHandlerInterface) setLexicalHandler()} and {@link com.trolltech.qt.xml.QXmlReader#setDeclHandler(com.trolltech.qt.xml.QXmlDeclHandlerInterface) setDeclHandler()}. The parse itself is started with a call to {@link com.trolltech.qt.xml.QXmlReader#parse(com.trolltech.qt.xml.QXmlInputSource) parse()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlSimpleReader QXmlSimpleReader}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QXmlReader extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.xml.QXmlReader {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.xml.QXmlDTDHandlerInterface DTDHandler() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_DTDHandler(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.xml.QXmlContentHandlerInterface contentHandler() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_contentHandler(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.xml.QXmlDeclHandlerInterface declHandler() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_declHandler(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.xml.QXmlEntityResolverInterface entityResolver() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_entityResolver(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.xml.QXmlErrorHandlerInterface errorHandler() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_errorHandler(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean feature(java.lang.String name) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_feature_String_nativepointer(nativeId(), name);
        }

        @Override
        @QtBlockedSlot
        public boolean hasFeature(java.lang.String name) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_hasFeature_String(nativeId(), name);
        }

        @Override
        @QtBlockedSlot
        public boolean hasProperty(java.lang.String name) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_hasProperty_String(nativeId(), name);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.xml.QXmlLexicalHandlerInterface lexicalHandler() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_lexicalHandler(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean parse(com.trolltech.qt.xml.QXmlInputSource input) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_parse_QXmlInputSource(nativeId(), input == null ? 0 : input.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void setContentHandler(com.trolltech.qt.xml.QXmlContentHandlerInterface handler) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setContentHandler_QXmlContentHandler(nativeId(), handler == null ? 0 : handler.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void setDTDHandler(com.trolltech.qt.xml.QXmlDTDHandlerInterface handler) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setDTDHandler_QXmlDTDHandler(nativeId(), handler == null ? 0 : handler.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void setDeclHandler(com.trolltech.qt.xml.QXmlDeclHandlerInterface handler) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setDeclHandler_QXmlDeclHandler(nativeId(), handler == null ? 0 : handler.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void setEntityResolver(com.trolltech.qt.xml.QXmlEntityResolverInterface handler) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setEntityResolver_QXmlEntityResolver(nativeId(), handler == null ? 0 : handler.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void setErrorHandler(com.trolltech.qt.xml.QXmlErrorHandlerInterface handler) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setErrorHandler_QXmlErrorHandler(nativeId(), handler == null ? 0 : handler.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void setFeature(java.lang.String name, boolean value) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setFeature_String_boolean(nativeId(), name, value);
        }

        @Override
        @QtBlockedSlot
        public void setLexicalHandler(com.trolltech.qt.xml.QXmlLexicalHandlerInterface handler) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setLexicalHandler_QXmlLexicalHandler(nativeId(), handler == null ? 0 : handler.nativeId());
        }
    }


/**
Creates a new QXmlReader.
*/

    public QXmlReader(){
        super((QPrivateConstructor)null);
        __qt_QXmlReader();
    }

    native void __qt_QXmlReader();

/**
Returns the DTD handler or 0 if none was set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#setDTDHandler(com.trolltech.qt.xml.QXmlDTDHandlerInterface) setDTDHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.xml.QXmlDTDHandlerInterface DTDHandler();
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlDTDHandlerInterface __qt_DTDHandler(long __this__nativeId);

/**
Returns the content handler or 0 if none was set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#setContentHandler(com.trolltech.qt.xml.QXmlContentHandlerInterface) setContentHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.xml.QXmlContentHandlerInterface contentHandler();
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlContentHandlerInterface __qt_contentHandler(long __this__nativeId);

/**
Returns the declaration handler or 0 if none was set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#setDeclHandler(com.trolltech.qt.xml.QXmlDeclHandlerInterface) setDeclHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.xml.QXmlDeclHandlerInterface declHandler();
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlDeclHandlerInterface __qt_declHandler(long __this__nativeId);

/**
Returns the entity resolver or 0 if none was set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#setEntityResolver(com.trolltech.qt.xml.QXmlEntityResolverInterface) setEntityResolver()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.xml.QXmlEntityResolverInterface entityResolver();
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlEntityResolverInterface __qt_entityResolver(long __this__nativeId);

/**
Returns the error handler or 0 if none is set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#setErrorHandler(com.trolltech.qt.xml.QXmlErrorHandlerInterface) setErrorHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.xml.QXmlErrorHandlerInterface errorHandler();
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlErrorHandlerInterface __qt_errorHandler(long __this__nativeId);

/**
If the reader has the feature called <tt>name</tt>, the feature's value is returned. If no such feature exists the return value is undefined. <p>If <tt>ok</tt> is not 0: <tt>*</tt><tt>ok</tt> is set to true if the reader has the feature called <tt>name</tt>; otherwise <tt>*</tt><tt>ok</tt> is set to false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#setFeature(java.lang.String, boolean) setFeature()}, and {@link com.trolltech.qt.xml.QXmlReader#hasFeature(java.lang.String) hasFeature()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean feature(java.lang.String name);
    @QtBlockedSlot
    native boolean __qt_feature_String_nativepointer(long __this__nativeId, java.lang.String name);

/**
Returns <tt>true</tt> if the reader has the feature called <tt>name</tt>; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#feature(java.lang.String) feature()}, and {@link com.trolltech.qt.xml.QXmlReader#setFeature(java.lang.String, boolean) setFeature()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean hasFeature(java.lang.String name);
    @QtBlockedSlot
    native boolean __qt_hasFeature_String(long __this__nativeId, java.lang.String name);

/**
Returns true if the reader has the property <tt>name</tt>; otherwise returns false. <p><DT><b>See also:</b><br><DD>property(), and setProperty(). <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean hasProperty(java.lang.String name);
    @QtBlockedSlot
    native boolean __qt_hasProperty_String(long __this__nativeId, java.lang.String name);

/**
Returns the lexical handler or 0 if none was set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#setLexicalHandler(com.trolltech.qt.xml.QXmlLexicalHandlerInterface) setLexicalHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.xml.QXmlLexicalHandlerInterface lexicalHandler();
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlLexicalHandlerInterface __qt_lexicalHandler(long __this__nativeId);

/**
Parses the given <tt>input</tt>.
*/

    @QtBlockedSlot
    public abstract boolean parse(com.trolltech.qt.xml.QXmlInputSource input);
    @QtBlockedSlot
    native boolean __qt_parse_QXmlInputSource(long __this__nativeId, long input);

/**
Sets the content handler to <tt>handler</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#contentHandler() contentHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void setContentHandler(com.trolltech.qt.xml.QXmlContentHandlerInterface handler);
    @QtBlockedSlot
    native void __qt_setContentHandler_QXmlContentHandler(long __this__nativeId, long handler);

/**
Sets the DTD handler to <tt>handler</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#DTDHandler() DTDHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void setDTDHandler(com.trolltech.qt.xml.QXmlDTDHandlerInterface handler);
    @QtBlockedSlot
    native void __qt_setDTDHandler_QXmlDTDHandler(long __this__nativeId, long handler);

/**
Sets the declaration handler to <tt>handler</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#declHandler() declHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void setDeclHandler(com.trolltech.qt.xml.QXmlDeclHandlerInterface handler);
    @QtBlockedSlot
    native void __qt_setDeclHandler_QXmlDeclHandler(long __this__nativeId, long handler);

/**
Sets the entity resolver to <tt>handler</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#entityResolver() entityResolver()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void setEntityResolver(com.trolltech.qt.xml.QXmlEntityResolverInterface handler);
    @QtBlockedSlot
    native void __qt_setEntityResolver_QXmlEntityResolver(long __this__nativeId, long handler);

/**
Sets the error handler to <tt>handler</tt>. Clears the error handler if <tt>handler</tt> is 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#errorHandler() errorHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void setErrorHandler(com.trolltech.qt.xml.QXmlErrorHandlerInterface handler);
    @QtBlockedSlot
    native void __qt_setErrorHandler_QXmlErrorHandler(long __this__nativeId, long handler);

/**
Sets the feature called <tt>name</tt> to the given <tt>value</tt>. If the reader doesn't have the feature nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#feature(java.lang.String) feature()}, and {@link com.trolltech.qt.xml.QXmlReader#hasFeature(java.lang.String) hasFeature()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void setFeature(java.lang.String name, boolean value);
    @QtBlockedSlot
    native void __qt_setFeature_String_boolean(long __this__nativeId, java.lang.String name, boolean value);

/**
Sets the lexical handler to <tt>handler</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader#lexicalHandler() lexicalHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void setLexicalHandler(com.trolltech.qt.xml.QXmlLexicalHandlerInterface handler);
    @QtBlockedSlot
    native void __qt_setLexicalHandler_QXmlLexicalHandler(long __this__nativeId, long handler);

/**
@exclude
*/

    public static native QXmlReader fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlReader(QPrivateConstructor p) { super(p); } 
}
