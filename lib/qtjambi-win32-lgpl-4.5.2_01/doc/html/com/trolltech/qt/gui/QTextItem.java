package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextItem class provides all the information required to draw text in a custom paint engine. When you reimplement your own paint engine, you must reimplement {@link com.trolltech.qt.gui.QPaintEngine#drawTextItem(com.trolltech.qt.core.QPointF, com.trolltech.qt.gui.QTextItem) QPaintEngine::drawTextItem()}, a function that takes a QTextItem as one of its arguments.
*/
@QtJambiGeneratedClass
public class QTextItem extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    public enum RenderFlag implements com.trolltech.qt.QtEnumerator {
/**
 Render the text from right to left.
*/

        RightToLeft(1),
/**
 Paint a line above the text.
*/

        Overline(16),
/**
 Paint a line under the text.
*/

        Underline(32),
/**
 Paint a line through the text.
*/

        StrikeOut(64),
        Dummy(-1);

        RenderFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QTextItem$RenderFlags with the specified <tt>com.trolltech.qt.gui.QTextItem$RenderFlag[]</tt> QTextItem$RenderFlag values set.</brief>
*/

        public static RenderFlags createQFlags(RenderFlag ... values) {
            return new RenderFlags(values);
        }
/**
<brief>Returns the QTextItem$RenderFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static RenderFlag resolve(int value) {
            return (RenderFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return RightToLeft;
            case 16: return Overline;
            case 32: return Underline;
            case 64: return StrikeOut;
            case -1: return Dummy;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class RenderFlags extends com.trolltech.qt.QFlags<RenderFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QTextItem-RenderFlags with the specified <tt>com.trolltech.qt.gui.QTextItem.RenderFlag[]</tt>. flags set.</brief>
*/

        public RenderFlags(RenderFlag ... args) { super(args); }
        public RenderFlags(int value) { setValue(value); }
    }



/**
This is an overloaded method provided for convenience.
*/

    public QTextItem(){
        super((QPrivateConstructor)null);
        __qt_QTextItem();
    }

    native void __qt_QTextItem();

/**
Corresponds to the {@link com.trolltech.qt.gui.QFontMetrics#ascent() ascent} of the piece of text that is drawn.
*/

    @QtBlockedSlot
    public final double ascent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ascent(nativeId());
    }
    @QtBlockedSlot
    native double __qt_ascent(long __this__nativeId);

/**
Corresponds to the {@link com.trolltech.qt.gui.QFontMetrics#descent() descent} of the piece of text that is drawn.
*/

    @QtBlockedSlot
    public final double descent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_descent(nativeId());
    }
    @QtBlockedSlot
    native double __qt_descent(long __this__nativeId);

/**
Returns the font that should be used to draw the text.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont font()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_font(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_font(long __this__nativeId);

/**
Returns the render flags used.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextItem.RenderFlags renderFlags()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QTextItem.RenderFlags(__qt_renderFlags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_renderFlags(long __this__nativeId);

/**
Returns the text that should be drawn.
*/

    @QtBlockedSlot
    public final java.lang.String text()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
Specifies the total width of the text to be drawn.
*/

    @QtBlockedSlot
    public final double width()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_width(nativeId());
    }
    @QtBlockedSlot
    native double __qt_width(long __this__nativeId);

/**
@exclude
*/

    public static native QTextItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextItem(QPrivateConstructor p) { super(p); } 
}
