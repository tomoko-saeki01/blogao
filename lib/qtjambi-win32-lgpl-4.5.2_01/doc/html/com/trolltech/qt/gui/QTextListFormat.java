package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextListFormat class provides formatting information for lists in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. A list is composed of one or more items, represented as text blocks. The list's format specifies the appearance of items in the list. In particular, it determines the indentation and the style of each item. <p>The indentation of the items is an integer value that causes each item to be offset from the left margin by a certain amount. This value is read with {@link com.trolltech.qt.gui.QTextListFormat#indent() indent()} and set with {@link com.trolltech.qt.gui.QTextListFormat#setIndent(int) setIndent()}. <p>The style used to decorate each item is set with {@link com.trolltech.qt.gui.QTextListFormat#setStyle(com.trolltech.qt.gui.QTextListFormat.Style) setStyle()} and can be read with the {@link com.trolltech.qt.gui.QTextListFormat#style() style()} function. The style controls the type of bullet points and numbering scheme used for items in the list. Note that lists that use the decimal numbering scheme begin counting at 1 rather than 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextList QTextList}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextListFormat extends com.trolltech.qt.gui.QTextFormat
    implements java.lang.Cloneable
{
/**
This enum describes the symbols used to decorate list items.
*/

    public enum Style implements com.trolltech.qt.QtEnumerator {
/**
 a filled circle
*/

        ListDisc(-1),
/**
 an empty circle
*/

        ListCircle(-2),
/**
 a filled square
*/

        ListSquare(-3),
/**
 decimal values in ascending order
*/

        ListDecimal(-4),
/**
 lower case Latin characters in alphabetical order
*/

        ListLowerAlpha(-5),
/**
 upper case Latin characters in alphabetical order
*/

        ListUpperAlpha(-6),
        ListStyleUndefined(0);

        Style(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextListFormat$Style constant with the specified <tt>int</tt>.</brief>
*/

        public static Style resolve(int value) {
            return (Style) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case -1: return ListDisc;
            case -2: return ListCircle;
            case -3: return ListSquare;
            case -4: return ListDecimal;
            case -5: return ListLowerAlpha;
            case -6: return ListUpperAlpha;
            case 0: return ListStyleUndefined;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a new list format object.
*/

    public QTextListFormat(){
        super((QPrivateConstructor)null);
        __qt_QTextListFormat();
    }

    native void __qt_QTextListFormat();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextListFormat(com.trolltech.qt.gui.QTextFormat fmt){
        super((QPrivateConstructor)null);
        __qt_QTextListFormat_QTextFormat(fmt == null ? 0 : fmt.nativeId());
    }

    native void __qt_QTextListFormat_QTextFormat(long fmt);

/**
Returns the list format's indentation. The indentation is multiplied by the {@link QTextDocument#indentWidth() QTextDocument::indentWidth} property to get the effective indent in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextListFormat#setIndent(int) setIndent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indent(nativeId());
    }
    @QtBlockedSlot
    native int __qt_indent(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
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
Sets the list format's <tt>indentation</tt>. The indentation is multiplied by the {@link QTextDocument#indentWidth() QTextDocument::indentWidth} property to get the effective indent in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextListFormat#indent() indent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setIndent(int indent)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIndent_int(nativeId(), indent);
    }
    @QtBlockedSlot
    native void __qt_setIndent_int(long __this__nativeId, int indent);

/**
Sets the list format's <tt>style</tt>. See <tt>Style</tt> for the available styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextListFormat#style() style()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStyle(com.trolltech.qt.gui.QTextListFormat.Style style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStyle_Style(nativeId(), style.value());
    }
    @QtBlockedSlot
    native void __qt_setStyle_Style(long __this__nativeId, int style);

/**
Returns the list format's style. See <tt>Style</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextListFormat#setStyle(com.trolltech.qt.gui.QTextListFormat.Style) setStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextListFormat.Style style()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTextListFormat.Style.resolve(__qt_style(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_style(long __this__nativeId);

/**
@exclude
*/

    public static native QTextListFormat fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextListFormat(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextListFormat array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextListFormat clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextListFormat __qt_clone(long __this_nativeId);
}
