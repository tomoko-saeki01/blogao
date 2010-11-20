package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QStringMatcher class holds a sequence of characters that can be quickly matched in a Unicode string. This class is useful when you have a sequence of QChars that you want to repeatedly match against some strings (perhaps in a loop), or when you want to search for the same sequence of characters multiple times in the same string. Using a matcher object and {@link com.trolltech.qt.core.QStringMatcher#indexIn(java.lang.String) indexIn()} is faster than matching a plain QString with QString::indexOf() if repeated matching takes place. This class offers no benefit if you are doing one-off string matches. <p>Create the QStringMatcher with the QString you want to search for. Then call {@link com.trolltech.qt.core.QStringMatcher#indexIn(java.lang.String) indexIn()} on the QString that you want to search. <p><DT><b>See also:</b><br><DD>QString, {@link com.trolltech.qt.core.QByteArrayMatcher QByteArrayMatcher}, and {@link com.trolltech.qt.core.QRegExp QRegExp}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStringMatcher extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty string matcher that won't match anything. Call {@link com.trolltech.qt.core.QStringMatcher#setPattern(java.lang.String) setPattern()} to give it a pattern to match.
*/

    public QStringMatcher(){
        super((QPrivateConstructor)null);
        __qt_QStringMatcher();
    }

    native void __qt_QStringMatcher();


/**
Constructs a string matcher that will search for <tt>pattern</tt>, with case sensitivity <tt>cs</tt>. <p>Call {@link com.trolltech.qt.core.QStringMatcher#indexIn(java.lang.String) indexIn()} to perform a search.
*/

    public QStringMatcher(java.lang.String pattern) {
        this(pattern, com.trolltech.qt.core.Qt.CaseSensitivity.CaseSensitive);
    }
/**
Constructs a string matcher that will search for <tt>pattern</tt>, with case sensitivity <tt>cs</tt>. <p>Call {@link com.trolltech.qt.core.QStringMatcher#indexIn(java.lang.String) indexIn()} to perform a search.
*/

    public QStringMatcher(java.lang.String pattern, com.trolltech.qt.core.Qt.CaseSensitivity cs){
        super((QPrivateConstructor)null);
        __qt_QStringMatcher_String_CaseSensitivity(pattern, cs.value());
    }

    native void __qt_QStringMatcher_String_CaseSensitivity(java.lang.String pattern, int cs);

/**
Copies the <tt>other</tt> string matcher to this string matcher.
*/

    public QStringMatcher(com.trolltech.qt.core.QStringMatcher other){
        super((QPrivateConstructor)null);
        __qt_QStringMatcher_QStringMatcher(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStringMatcher_QStringMatcher(long other);

/**
Returns the case sensitivity setting for this string matcher. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QStringMatcher#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.CaseSensitivity caseSensitivity()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.CaseSensitivity.resolve(__qt_caseSensitivity(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_caseSensitivity(long __this__nativeId);


/**
Searches the string <tt>str</tt> from character position <tt>from</tt> (default 0, i. . from the first character), for the string {@link com.trolltech.qt.core.QStringMatcher#pattern() pattern()} that was set in the constructor or in the most recent call to {@link com.trolltech.qt.core.QStringMatcher#setPattern(java.lang.String) setPattern()}. Returns the position where the {@link com.trolltech.qt.core.QStringMatcher#pattern() pattern()} matched in <tt>str</tt>, or -1 if no match was found. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QStringMatcher#setPattern(java.lang.String) setPattern()}, and {@link com.trolltech.qt.core.QStringMatcher#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indexIn(java.lang.String str) {
        return indexIn(str, (int)0);
    }
/**
Searches the string <tt>str</tt> from character position <tt>from</tt> (default 0, i. . from the first character), for the string {@link com.trolltech.qt.core.QStringMatcher#pattern() pattern()} that was set in the constructor or in the most recent call to {@link com.trolltech.qt.core.QStringMatcher#setPattern(java.lang.String) setPattern()}. Returns the position where the {@link com.trolltech.qt.core.QStringMatcher#pattern() pattern()} matched in <tt>str</tt>, or -1 if no match was found. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QStringMatcher#setPattern(java.lang.String) setPattern()}, and {@link com.trolltech.qt.core.QStringMatcher#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indexIn(java.lang.String str, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexIn_String_int(nativeId(), str, from);
    }
    @QtBlockedSlot
    native int __qt_indexIn_String_int(long __this__nativeId, java.lang.String str, int from);

/**
Returns the string pattern that this string matcher will search for. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QStringMatcher#setPattern(java.lang.String) setPattern()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String pattern()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pattern(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_pattern(long __this__nativeId);

/**
Sets the case sensitivity setting of this string matcher to <tt>cs</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QStringMatcher#caseSensitivity() caseSensitivity()}, {@link com.trolltech.qt.core.QStringMatcher#setPattern(java.lang.String) setPattern()}, and {@link com.trolltech.qt.core.QStringMatcher#indexIn(java.lang.String) indexIn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity cs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCaseSensitivity_CaseSensitivity(nativeId(), cs.value());
    }
    @QtBlockedSlot
    native void __qt_setCaseSensitivity_CaseSensitivity(long __this__nativeId, int cs);

/**
Sets the string that this string matcher will search for to <tt>pattern</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QStringMatcher#pattern() pattern()}, {@link com.trolltech.qt.core.QStringMatcher#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}, and {@link com.trolltech.qt.core.QStringMatcher#indexIn(java.lang.String) indexIn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPattern(java.lang.String pattern)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPattern_String(nativeId(), pattern);
    }
    @QtBlockedSlot
    native void __qt_setPattern_String(long __this__nativeId, java.lang.String pattern);

/**
@exclude
*/

    public static native QStringMatcher fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStringMatcher(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStringMatcher array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStringMatcher clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStringMatcher __qt_clone(long __this_nativeId);
}
