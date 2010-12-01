package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlEntityResolver class provides an interface to resolve external entities contained in XML data. If an application needs to implement customized handling for external entities, it must implement this interface, i.e. {@link com.trolltech.qt.xml.QXmlEntityResolver#resolveEntity(java.lang.String, java.lang.String) resolveEntity()}, and register it with {@link com.trolltech.qt.xml.QXmlReader#setEntityResolver(com.trolltech.qt.xml.QXmlEntityResolverInterface) QXmlReader::setEntityResolver()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlDTDHandler QXmlDTDHandler}, {@link com.trolltech.qt.xml.QXmlDeclHandler QXmlDeclHandler}, {@link com.trolltech.qt.xml.QXmlContentHandler QXmlContentHandler}, {@link com.trolltech.qt.xml.QXmlErrorHandler QXmlErrorHandler}, {@link com.trolltech.qt.xml.QXmlLexicalHandler QXmlLexicalHandler}, and {@link <a href="../qtxml.html">Introduction to SAX2</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QXmlEntityResolver extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.xml.QXmlEntityResolverInterface
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.xml.QXmlEntityResolver {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public java.lang.String errorString() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_errorString(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.xml.QXmlEntityResolver.ResolvedEntity resolveEntity(java.lang.String publicId, java.lang.String systemId) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_resolveEntity_String_String_QXmlInputSource(nativeId(), publicId, systemId);
        }
    }


/**
Creates a new QXmlEntityResolver.
*/

    public QXmlEntityResolver(){
        super((QPrivateConstructor)null);
        __qt_QXmlEntityResolver();
    }

    native void __qt_QXmlEntityResolver();

/**
The reader calls this function to get an error string if any of the handler functions returns false.
*/

    @QtBlockedSlot
    public abstract java.lang.String errorString();
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
The reader calls this function before it opens any external entity, except the top-level document entity. The application may request the reader to resolve the entity itself (<tt>ret</tt> is 0) or to use an entirely different input source (<tt>ret</tt> points to the input source). <p>The reader deletes the input source <tt>ret</tt> when it no longer needs it, so you should allocate it on the heap with <tt>new</tt>. <p>The argument <tt>publicId</tt> is the public identifier of the external entity, <tt>systemId</tt> is the system identifier of the external entity and <tt>ret</tt> is the return value of this function. If <tt>ret</tt> is 0 the reader should resolve the entity itself, if it is non-zero it must point to an input source which the reader uses instead. <p>If this function returns false the reader stops parsing and reports an error. The reader uses the function {@link com.trolltech.qt.xml.QXmlEntityResolver#errorString() errorString()} to get the error message.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.xml.QXmlEntityResolver.ResolvedEntity resolveEntity(java.lang.String publicId, java.lang.String systemId);
    @QtBlockedSlot
    native com.trolltech.qt.xml.QXmlEntityResolver.ResolvedEntity __qt_resolveEntity_String_String_QXmlInputSource(long __this__nativeId, java.lang.String publicId, java.lang.String systemId);

/**
@exclude
*/

    public static native QXmlEntityResolver fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlEntityResolver(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QXmlEntityResolver(long ptr);

    public static class ResolvedEntity {
        public boolean error;
        public QXmlInputSource inputSource;

        public ResolvedEntity(boolean error, QXmlInputSource inputSource) {
            this.error = error;
            this.inputSource = inputSource;

        }

    }

}
