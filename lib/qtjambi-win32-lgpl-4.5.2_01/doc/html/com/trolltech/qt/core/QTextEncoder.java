package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QTextEncoder class provides a state-based encoder. A text encoder converts text from Unicode into an encoded text format using a specific codec. <p>The encoder converts Unicode into another format, remembering any state that is required between calls. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextCodec#makeEncoder() QTextCodec::makeEncoder()}, and {@link com.trolltech.qt.core.QTextDecoder QTextDecoder}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextEncoder extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a text encoder for the given <tt>codec</tt>.
*/

    public QTextEncoder(com.trolltech.qt.core.QTextCodec codec){
        super((QPrivateConstructor)null);
        __qt_QTextEncoder_QTextCodec(codec == null ? 0 : codec.nativeId());
    }

    native void __qt_QTextEncoder_QTextCodec(long codec);

/**
Converts the Unicode string <tt>str</tt> into an encoded {@link com.trolltech.qt.core.QByteArray QByteArray}.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray fromUnicode(java.lang.String str)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fromUnicode_String(nativeId(), str);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_fromUnicode_String(long __this__nativeId, java.lang.String str);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean hasFailure()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasFailure(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasFailure(long __this__nativeId);

/**
@exclude
*/

    public static native QTextEncoder fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextEncoder(QPrivateConstructor p) { super(p); } 
}
