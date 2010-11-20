package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QTextDecoder class provides a state-based decoder. A text decoder converts text from an encoded text format into Unicode using a specific codec. <p>The decoder converts text in this format into Unicode, remembering any state that is required between calls. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextCodec#makeDecoder() QTextCodec::makeDecoder()}, and {@link com.trolltech.qt.core.QTextEncoder QTextEncoder}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextDecoder extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a text decoder for the given <tt>codec</tt>.
*/

    public QTextDecoder(com.trolltech.qt.core.QTextCodec codec){
        super((QPrivateConstructor)null);
        __qt_QTextDecoder_QTextCodec(codec == null ? 0 : codec.nativeId());
    }

    native void __qt_QTextDecoder_QTextCodec(long codec);

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
This is an overloaded member function, provided for convenience. <p>Converts the bytes in the byte array specified by <tt>ba</tt> to Unicode and returns the result.
*/

    @QtBlockedSlot
    public final java.lang.String toUnicode(com.trolltech.qt.core.QByteArray ba)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toUnicode_QByteArray(nativeId(), ba == null ? 0 : ba.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toUnicode_QByteArray(long __this__nativeId, long ba);

/**
@exclude
*/

    public static native QTextDecoder fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextDecoder(QPrivateConstructor p) { super(p); } 
}
