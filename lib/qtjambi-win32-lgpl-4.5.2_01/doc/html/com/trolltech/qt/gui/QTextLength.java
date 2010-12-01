package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextLength class encapsulates the different types of length used in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. When we specify a value for the length of an element in a text document, we often need to provide some other information so that the length is used in the way we expect. For example, when we specify a table width, the value can represent a fixed number of pixels, or it can be a percentage value. This information changes both the meaning of the value and the way it is used. <p>Generally, this class is used to specify table widths. These can be specified either as a fixed amount of pixels, as a percentage of the containing frame's width, or by a variable width that allows it to take up just the space it requires. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTable QTextTable}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextLength extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    public enum Type implements com.trolltech.qt.QtEnumerator {
/**

*/

        VariableLength(0),
/**

*/

        FixedLength(1),
/**

*/

        PercentageLength(2);

        Type(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextLength$Type constant with the specified <tt>int</tt>.</brief>
*/

        public static Type resolve(int value) {
            return (Type) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return VariableLength;
            case 1: return FixedLength;
            case 2: return PercentageLength;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a new length object which represents a variable size.
*/

    public QTextLength(){
        super((QPrivateConstructor)null);
        __qt_QTextLength();
    }

    native void __qt_QTextLength();

/**
Constructs a new length object of the given <tt>type</tt> and <tt>value</tt>.
*/

    public QTextLength(com.trolltech.qt.gui.QTextLength.Type type, double value){
        super((QPrivateConstructor)null);
        __qt_QTextLength_Type_double(type.value(), value);
    }

    native void __qt_QTextLength_Type_double(int type, double value);

/**
<brief>Writes thisQTextLength
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.gui.QTextLength other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QTextLength(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QTextLength(long __this__nativeId, long other);

/**
<brief>Reads a QTextLength
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long arg__1);

/**
Returns the constraint value that is specific for the type of the length. If the length is {@link com.trolltech.qt.gui.QTextLength.Type QTextLength::PercentageLength } then the raw value is in percent, in the range of 0 to 100. If the length is {@link com.trolltech.qt.gui.QTextLength.Type QTextLength::FixedLength } then that fixed amount is returned. For variable lengths, zero is returned.
*/

    @QtBlockedSlot
    public final double rawValue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rawValue(nativeId());
    }
    @QtBlockedSlot
    native double __qt_rawValue(long __this__nativeId);

/**
Returns the type of length. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLength.Type QTextLength::Type }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextLength.Type type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTextLength.Type.resolve(__qt_type(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
Returns the effective length, constrained by the type of the length object and the specified <tt>maximumLength</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLength#type() type()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double value(double maximumLength)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_double(nativeId(), maximumLength);
    }
    @QtBlockedSlot
    native double __qt_value_double(long __this__nativeId, double maximumLength);

/**
@exclude
*/

    public static native QTextLength fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextLength(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextLength array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QTextLength)
        return operator_equal((com.trolltech.qt.gui.QTextLength) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextLength clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextLength __qt_clone(long __this_nativeId);
}
