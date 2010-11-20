package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public abstract class QAbstractXmlReceiver extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xmlpatterns.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.xmlpatterns.QAbstractXmlReceiver {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void atomicValue(java.lang.Object value) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_atomicValue_Object(nativeId(), value);
        }

        @Override
        @QtBlockedSlot
        public void attribute(com.trolltech.qt.xmlpatterns.QXmlName name, java.lang.String value) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_attribute_QXmlName_String(nativeId(), name == null ? 0 : name.nativeId(), value);
        }

        @Override
        @QtBlockedSlot
        public void characters(java.lang.String value) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_characters_String(nativeId(), value);
        }

        @Override
        @QtBlockedSlot
        public void comment(java.lang.String value) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_comment_String(nativeId(), value);
        }

        @Override
        @QtBlockedSlot
        public void endDocument() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_endDocument(nativeId());
        }

        @Override
        @QtBlockedSlot
        public void endElement() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_endElement(nativeId());
        }

        @Override
        @QtBlockedSlot
        public void endOfSequence() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_endOfSequence(nativeId());
        }

        @Override
        @QtBlockedSlot
        public void namespaceBinding(com.trolltech.qt.xmlpatterns.QXmlName name) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_namespaceBinding_QXmlName(nativeId(), name == null ? 0 : name.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void processingInstruction(com.trolltech.qt.xmlpatterns.QXmlName target, java.lang.String value) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_processingInstruction_QXmlName_String(nativeId(), target == null ? 0 : target.nativeId(), value);
        }

        @Override
        @QtBlockedSlot
        public void startDocument() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_startDocument(nativeId());
        }

        @Override
        @QtBlockedSlot
        public void startElement(com.trolltech.qt.xmlpatterns.QXmlName name) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_startElement_QXmlName(nativeId(), name == null ? 0 : name.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void startOfSequence() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_startOfSequence(nativeId());
        }
    }


/**

*/

    public QAbstractXmlReceiver(){
        super((QPrivateConstructor)null);
        __qt_QAbstractXmlReceiver();
    }

    native void __qt_QAbstractXmlReceiver();

/**

*/

    @QtBlockedSlot
    public abstract void atomicValue(java.lang.Object value);
    @QtBlockedSlot
    native void __qt_atomicValue_Object(long __this__nativeId, java.lang.Object value);

/**

*/

    @QtBlockedSlot
    public abstract void attribute(com.trolltech.qt.xmlpatterns.QXmlName name, java.lang.String value);
    @QtBlockedSlot
    native void __qt_attribute_QXmlName_String(long __this__nativeId, long name, java.lang.String value);

/**

*/

    @QtBlockedSlot
    public abstract void characters(java.lang.String value);
    @QtBlockedSlot
    native void __qt_characters_String(long __this__nativeId, java.lang.String value);

/**

*/

    @QtBlockedSlot
    public abstract void comment(java.lang.String value);
    @QtBlockedSlot
    native void __qt_comment_String(long __this__nativeId, java.lang.String value);

/**

*/

    @QtBlockedSlot
    public abstract void endDocument();
    @QtBlockedSlot
    native void __qt_endDocument(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public abstract void endElement();
    @QtBlockedSlot
    native void __qt_endElement(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public abstract void endOfSequence();
    @QtBlockedSlot
    native void __qt_endOfSequence(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public abstract void namespaceBinding(com.trolltech.qt.xmlpatterns.QXmlName name);
    @QtBlockedSlot
    native void __qt_namespaceBinding_QXmlName(long __this__nativeId, long name);

/**

*/

    @QtBlockedSlot
    public abstract void processingInstruction(com.trolltech.qt.xmlpatterns.QXmlName target, java.lang.String value);
    @QtBlockedSlot
    native void __qt_processingInstruction_QXmlName_String(long __this__nativeId, long target, java.lang.String value);

/**

*/

    @QtBlockedSlot
    public abstract void startDocument();
    @QtBlockedSlot
    native void __qt_startDocument(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public abstract void startElement(com.trolltech.qt.xmlpatterns.QXmlName name);
    @QtBlockedSlot
    native void __qt_startElement_QXmlName(long __this__nativeId, long name);

/**

*/

    @QtBlockedSlot
    public abstract void startOfSequence();
    @QtBlockedSlot
    native void __qt_startOfSequence(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public void whitespaceOnly(java.lang.String value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_whitespaceOnly_String(nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_whitespaceOnly_String(long __this__nativeId, java.lang.String value);

/**
@exclude
*/

    public static native QAbstractXmlReceiver fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractXmlReceiver(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QAbstractXmlReceiver array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QAbstractXmlReceiver clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QAbstractXmlReceiver __qt_clone(long __this_nativeId);
}
