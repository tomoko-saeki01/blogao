package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QByteArrayMatcher class holds a sequence of bytes that can be quickly matched in a byte array. This class is useful when you have a sequence of bytes that you want to repeatedly match against some byte arrays (perhaps in a loop), or when you want to search for the same sequence of bytes multiple times in the same byte array. Using a matcher object and {@link com.trolltech.qt.core.QByteArrayMatcher#indexIn(com.trolltech.qt.core.QByteArray) indexIn()} is faster than matching a plain {@link com.trolltech.qt.core.QByteArray QByteArray} with {@link com.trolltech.qt.core.QByteArray#indexOf(byte) QByteArray::indexOf()} if repeated matching takes place. This class offers no benefit if you are doing one-off byte array matches. <p>Create the QByteArrayMatcher with the {@link com.trolltech.qt.core.QByteArray QByteArray} you want to search for. Then call {@link com.trolltech.qt.core.QByteArrayMatcher#indexIn(com.trolltech.qt.core.QByteArray) indexIn()} on the {@link com.trolltech.qt.core.QByteArray QByteArray} that you want to search. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray QByteArray}, and {@link com.trolltech.qt.core.QStringMatcher QStringMatcher}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QByteArrayMatcher extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty byte array matcher that won't match anything. Call {@link com.trolltech.qt.core.QByteArrayMatcher#setPattern(com.trolltech.qt.core.QByteArray) setPattern()} to give it a pattern to match.
*/

    public QByteArrayMatcher(){
        super((QPrivateConstructor)null);
        __qt_QByteArrayMatcher();
    }

    native void __qt_QByteArrayMatcher();

/**
Constructs a byte array matcher that will search for <tt>pattern</tt>. Call {@link com.trolltech.qt.core.QByteArrayMatcher#indexIn(com.trolltech.qt.core.QByteArray) indexIn()} to perform a search.
*/

    public QByteArrayMatcher(com.trolltech.qt.core.QByteArray pattern){
        super((QPrivateConstructor)null);
        __qt_QByteArrayMatcher_QByteArray(pattern == null ? 0 : pattern.nativeId());
    }

    native void __qt_QByteArrayMatcher_QByteArray(long pattern);

/**
Copies the <tt>other</tt> byte array matcher to this byte array matcher.
*/

    public QByteArrayMatcher(com.trolltech.qt.core.QByteArrayMatcher other){
        super((QPrivateConstructor)null);
        __qt_QByteArrayMatcher_QByteArrayMatcher(other == null ? 0 : other.nativeId());
    }

    native void __qt_QByteArrayMatcher_QByteArrayMatcher(long other);


/**
Searches the byte array <tt>ba</tt>, from byte position <tt>from</tt> (default 0, i. . from the first byte), for the byte array {@link com.trolltech.qt.core.QByteArrayMatcher#pattern() pattern()} that was set in the constructor or in the most recent call to {@link com.trolltech.qt.core.QByteArrayMatcher#setPattern(com.trolltech.qt.core.QByteArray) setPattern()}. Returns the position where the {@link com.trolltech.qt.core.QByteArrayMatcher#pattern() pattern()} matched in <tt>ba</tt>, or -1 if no match was found.
*/

    @QtBlockedSlot
    public final int indexIn(com.trolltech.qt.core.QByteArray ba) {
        return indexIn(ba, (int)0);
    }
/**
Searches the byte array <tt>ba</tt>, from byte position <tt>from</tt> (default 0, i. . from the first byte), for the byte array {@link com.trolltech.qt.core.QByteArrayMatcher#pattern() pattern()} that was set in the constructor or in the most recent call to {@link com.trolltech.qt.core.QByteArrayMatcher#setPattern(com.trolltech.qt.core.QByteArray) setPattern()}. Returns the position where the {@link com.trolltech.qt.core.QByteArrayMatcher#pattern() pattern()} matched in <tt>ba</tt>, or -1 if no match was found.
*/

    @QtBlockedSlot
    public final int indexIn(com.trolltech.qt.core.QByteArray ba, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexIn_QByteArray_int(nativeId(), ba == null ? 0 : ba.nativeId(), from);
    }
    @QtBlockedSlot
    native int __qt_indexIn_QByteArray_int(long __this__nativeId, long ba, int from);

/**
Returns the byte array pattern that this byte array matcher will search for. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArrayMatcher#setPattern(com.trolltech.qt.core.QByteArray) setPattern()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray pattern()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pattern(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_pattern(long __this__nativeId);

/**
Sets the byte array that this byte array matcher will search for to <tt>pattern</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArrayMatcher#pattern() pattern()}, and {@link com.trolltech.qt.core.QByteArrayMatcher#indexIn(com.trolltech.qt.core.QByteArray) indexIn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPattern(com.trolltech.qt.core.QByteArray pattern)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPattern_QByteArray(nativeId(), pattern == null ? 0 : pattern.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPattern_QByteArray(long __this__nativeId, long pattern);

/**
@exclude
*/

    public static native QByteArrayMatcher fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QByteArrayMatcher(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QByteArrayMatcher array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QByteArrayMatcher clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QByteArrayMatcher __qt_clone(long __this_nativeId);
}
