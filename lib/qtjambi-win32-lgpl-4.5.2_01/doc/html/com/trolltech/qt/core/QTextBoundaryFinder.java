package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QTextBoundaryFinder class provides a way of finding Unicode text boundaries in a string. QTextBoundaryFinder allows to find Unicode text boundaries in a string, similar to the Unicode text boundary specification (see http://www.unicode.org/reports/tr29/tr29-11.html). <p>QTextBoundaryFinder can operate on a QString in four possible modes depending on the value of <tt>BoundaryType</tt>. <p>Units of Unicode characters that make up what the user thinks of as a character or basic unit of the language are here called Grapheme clusters. The two unicode characters 'A' + diaeresis do for example form one grapheme cluster as the user thinks of them as one character, yet it is in this case represented by two unicode code points. <p>Word boundaries are there to locate the start and end of what a language considers to be a word. <p>Line break boundaries give possible places where a line break might happen and sentence boundaries will show the beginning and end of whole sentences.
*/
@QtJambiGeneratedClass
public class QTextBoundaryFinder extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
    public enum BoundaryReason implements com.trolltech.qt.QtEnumerator {
/**
 The boundary finder is not at a boundary position.
*/

        NotAtBoundary(0),
/**
 The boundary finder is at the start of a word.
*/

        StartWord(1),
/**
 The boundary finder is at the end of a word.
*/

        EndWord(2);

        BoundaryReason(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.QTextBoundaryFinder$BoundaryReasons with the specified <tt>com.trolltech.qt.core.QTextBoundaryFinder$BoundaryReason[]</tt> QTextBoundaryFinder$BoundaryReason values set.</brief>
*/

        public static BoundaryReasons createQFlags(BoundaryReason ... values) {
            return new BoundaryReasons(values);
        }
/**
<brief>Returns the QTextBoundaryFinder$BoundaryReason constant with the specified <tt>int</tt>.</brief>
*/

        public static BoundaryReason resolve(int value) {
            return (BoundaryReason) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NotAtBoundary;
            case 1: return StartWord;
            case 2: return EndWord;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class BoundaryReasons extends com.trolltech.qt.QFlags<BoundaryReason> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QTextBoundaryFinder-BoundaryReasons with the specified <tt>com.trolltech.qt.core.QTextBoundaryFinder.BoundaryReason[]</tt>. flags set.</brief>
*/

        public BoundaryReasons(BoundaryReason ... args) { super(args); }
        public BoundaryReasons(int value) { setValue(value); }
    }

    public enum BoundaryType implements com.trolltech.qt.QtEnumerator {
/**
 Finds a grapheme which is the smallest boundary. It including letters, punctation marks, numerals and more.
*/

        Grapheme(0),
/**
 Finds a word.
*/

        Word(1),
/**
 Finds possible positions for breaking the text into multiple lines.
*/

        Line(2),
/**
 Finds sentence boundaries. These include periods, question marks etc.
*/

        Sentence(3);

        BoundaryType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextBoundaryFinder$BoundaryType constant with the specified <tt>int</tt>.</brief>
*/

        public static BoundaryType resolve(int value) {
            return (BoundaryType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Grapheme;
            case 1: return Word;
            case 2: return Line;
            case 3: return Sentence;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an invalid QTextBoundaryFinder object.
*/

    public QTextBoundaryFinder(){
        super((QPrivateConstructor)null);
        __qt_QTextBoundaryFinder();
    }

    native void __qt_QTextBoundaryFinder();

/**
Creates a QTextBoundaryFinder object of <tt>type</tt> operating on <tt>string</tt>.
*/

    public QTextBoundaryFinder(com.trolltech.qt.core.QTextBoundaryFinder.BoundaryType type, java.lang.String string){
        super((QPrivateConstructor)null);
        __qt_QTextBoundaryFinder_BoundaryType_String(type.value(), string);
    }

    native void __qt_QTextBoundaryFinder_BoundaryType_String(int type, java.lang.String string);

/**
Copies the QTextBoundaryFinder object, <tt>other</tt>.
*/

    public QTextBoundaryFinder(com.trolltech.qt.core.QTextBoundaryFinder other){
        super((QPrivateConstructor)null);
        __qt_QTextBoundaryFinder_QTextBoundaryFinder(other == null ? 0 : other.nativeId());
    }

    native void __qt_QTextBoundaryFinder_QTextBoundaryFinder(long other);

/**
Returns the reasons for the boundary finder to have chosen the current position as a boundary.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextBoundaryFinder.BoundaryReasons boundaryReasons()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QTextBoundaryFinder.BoundaryReasons(__qt_boundaryReasons(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_boundaryReasons(long __this__nativeId);

/**
Returns true if the object's {@link com.trolltech.qt.core.QTextBoundaryFinder#position() position()} is currently at a valid text boundary.
*/

    @QtBlockedSlot
    public final boolean isAtBoundary()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAtBoundary(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAtBoundary(long __this__nativeId);

/**
Returns true if the text boundary finder is valid; otherwise returns false. A default QTextBoundaryFinder is invalid.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns the current position of the QTextBoundaryFinder. <p>The range is from 0 (the beginning of the string) to the length of the string inclusive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextBoundaryFinder#setPosition(int) setPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int position()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_position(nativeId());
    }
    @QtBlockedSlot
    native int __qt_position(long __this__nativeId);

/**
Sets the current position of the QTextBoundaryFinder to <tt>position</tt>. <p>If <tt>position</tt> is out of bounds, it will be bound to only valid positions. In this case, valid positions are from 0 to the length of the string inclusive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextBoundaryFinder#position() position()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPosition(int position)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPosition_int(nativeId(), position);
    }
    @QtBlockedSlot
    native void __qt_setPosition_int(long __this__nativeId, int position);

/**
Returns the string the QTextBoundaryFinder object operates on.
*/

    @QtBlockedSlot
    public final java.lang.String string()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_string(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_string(long __this__nativeId);

/**
Moves the finder to the end of the string. This is equivalent to setPosition(string.length()). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextBoundaryFinder#setPosition(int) setPosition()}, and {@link com.trolltech.qt.core.QTextBoundaryFinder#position() position()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void toEnd()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toEnd(nativeId());
    }
    @QtBlockedSlot
    native void __qt_toEnd(long __this__nativeId);

/**
Moves the QTextBoundaryFinder to the next boundary position and returns that position. <p>Returns -1 is there is no next boundary.
*/

    @QtBlockedSlot
    public final int toNextBoundary()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toNextBoundary(nativeId());
    }
    @QtBlockedSlot
    native int __qt_toNextBoundary(long __this__nativeId);

/**
Moves the QTextBoundaryFinder to the previous boundary position and returns that position. <p>Returns -1 is there is no previous boundary.
*/

    @QtBlockedSlot
    public final int toPreviousBoundary()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toPreviousBoundary(nativeId());
    }
    @QtBlockedSlot
    native int __qt_toPreviousBoundary(long __this__nativeId);

/**
Moves the finder to the start of the string. This is equivalent to setPosition(0). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextBoundaryFinder#setPosition(int) setPosition()}, and {@link com.trolltech.qt.core.QTextBoundaryFinder#position() position()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void toStart()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toStart(nativeId());
    }
    @QtBlockedSlot
    native void __qt_toStart(long __this__nativeId);

/**
Returns the type of the QTextBoundaryFinder.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextBoundaryFinder.BoundaryType type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QTextBoundaryFinder.BoundaryType.resolve(__qt_type(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
@exclude
*/

    public static native QTextBoundaryFinder fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextBoundaryFinder(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextBoundaryFinder array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextBoundaryFinder clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextBoundaryFinder __qt_clone(long __this_nativeId);
}
