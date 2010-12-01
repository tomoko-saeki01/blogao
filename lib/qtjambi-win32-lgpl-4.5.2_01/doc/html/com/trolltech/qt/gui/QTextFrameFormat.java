package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextFrameFormat class provides formatting information for frames in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. A text frame groups together one or more blocks of text, providing a layer of structure larger than the paragraph. The format of a frame specifies how it is rendered and positioned on the screen. It does not directly specify the behavior of the text formatting within, but provides constraints on the layout of its children. <p>The frame format defines the {@link com.trolltech.qt.gui.QTextFrameFormat#width() width()} and {@link com.trolltech.qt.gui.QTextFrameFormat#height() height()} of the frame on the screen. Each frame can have a {@link com.trolltech.qt.gui.QTextFrameFormat#border() border()} that surrounds its contents with a rectangular box. The border is surrounded by a {@link com.trolltech.qt.gui.QTextFrameFormat#margin() margin()} around the frame, and the contents of the frame are kept separate from the border by the frame's {@link com.trolltech.qt.gui.QTextFrameFormat#padding() padding()}. This scheme is similar to the box model used by Cascading Style Sheets for HTML pages. <br><center><img src="../images/qtextframe-style.png"></center><br> The {@link com.trolltech.qt.gui.QTextFrameFormat#position() position()} of a frame is set using {@link com.trolltech.qt.gui.QTextFrameFormat#setPosition(com.trolltech.qt.gui.QTextFrameFormat.Position) setPosition()} and determines how it is located relative to the surrounding text. <p>The validity of a QTextFrameFormat object can be determined with the isValid() function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrame QTextFrame}, and {@link com.trolltech.qt.gui.QTextBlockFormat QTextBlockFormat}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextFrameFormat extends com.trolltech.qt.gui.QTextFormat
    implements java.lang.Cloneable
{
    public enum Position implements com.trolltech.qt.QtEnumerator {
/**

*/

        InFlow(0),
/**

*/

        FloatLeft(1),
/**

*/

        FloatRight(2);

        Position(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextFrameFormat$Position constant with the specified <tt>int</tt>.</brief>
*/

        public static Position resolve(int value) {
            return (Position) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return InFlow;
            case 1: return FloatLeft;
            case 2: return FloatRight;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum BorderStyle implements com.trolltech.qt.QtEnumerator {
/**

*/

        BorderStyle_None(0),
/**

*/

        BorderStyle_Dotted(1),
/**

*/

        BorderStyle_Dashed(2),
/**

*/

        BorderStyle_Solid(3),
/**

*/

        BorderStyle_Double(4),
/**

*/

        BorderStyle_DotDash(5),
/**

*/

        BorderStyle_DotDotDash(6),
/**

*/

        BorderStyle_Groove(7),
/**

*/

        BorderStyle_Ridge(8),
/**

*/

        BorderStyle_Inset(9),
/**

*/

        BorderStyle_Outset(10);

        BorderStyle(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextFrameFormat$BorderStyle constant with the specified <tt>int</tt>.</brief>
*/

        public static BorderStyle resolve(int value) {
            return (BorderStyle) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return BorderStyle_None;
            case 1: return BorderStyle_Dotted;
            case 2: return BorderStyle_Dashed;
            case 3: return BorderStyle_Solid;
            case 4: return BorderStyle_Double;
            case 5: return BorderStyle_DotDash;
            case 6: return BorderStyle_DotDotDash;
            case 7: return BorderStyle_Groove;
            case 8: return BorderStyle_Ridge;
            case 9: return BorderStyle_Inset;
            case 10: return BorderStyle_Outset;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a text frame format object with the default properties.
*/

    public QTextFrameFormat(){
        super((QPrivateConstructor)null);
        __qt_QTextFrameFormat();
    }

    native void __qt_QTextFrameFormat();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextFrameFormat(com.trolltech.qt.gui.QTextFormat fmt){
        super((QPrivateConstructor)null);
        __qt_QTextFrameFormat_QTextFormat(fmt == null ? 0 : fmt.nativeId());
    }

    native void __qt_QTextFrameFormat_QTextFormat(long fmt);

/**
Returns the width of the border in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#setBorder(double) setBorder()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double border()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_border(nativeId());
    }
    @QtBlockedSlot
    native double __qt_border(long __this__nativeId);

/**
Returns the brush used for the frame's border. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#setBorderBrush(com.trolltech.qt.gui.QBrush) setBorderBrush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush borderBrush()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_borderBrush(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_borderBrush(long __this__nativeId);

/**
Returns the style of the frame's border. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#setBorderStyle(com.trolltech.qt.gui.QTextFrameFormat.BorderStyle) setBorderStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrameFormat.BorderStyle borderStyle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTextFrameFormat.BorderStyle.resolve(__qt_borderStyle(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_borderStyle(long __this__nativeId);

/**
Returns the width of the frame's bottom margin in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#setBottomMargin(double) setBottomMargin()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double bottomMargin()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottomMargin(nativeId());
    }
    @QtBlockedSlot
    native double __qt_bottomMargin(long __this__nativeId);

/**
Returns the height of the frame's border rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#setHeight(com.trolltech.qt.gui.QTextLength) setHeight()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextLength height()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_height(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextLength __qt_height(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns the width of the frame's left margin in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#setLeftMargin(double) setLeftMargin()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double leftMargin()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_leftMargin(nativeId());
    }
    @QtBlockedSlot
    native double __qt_leftMargin(long __this__nativeId);

/**
Returns the width of the frame's external margin in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#setMargin(double) setMargin()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double margin()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_margin(nativeId());
    }
    @QtBlockedSlot
    native double __qt_margin(long __this__nativeId);

/**
Returns the width of the frame's internal padding in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#setPadding(double) setPadding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double padding()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_padding(nativeId());
    }
    @QtBlockedSlot
    native double __qt_padding(long __this__nativeId);

/**
Returns the currently set page break policy for the frame/table. The default is {@link com.trolltech.qt.gui.QTextFormat.PageBreakFlag QTextFormat::PageBreak_Auto }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#setPageBreakPolicy(com.trolltech.qt.gui.QTextFormat.PageBreakFlag[]) setPageBreakPolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFormat.PageBreakFlags pageBreakPolicy()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QTextFormat.PageBreakFlags(__qt_pageBreakPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_pageBreakPolicy(long __this__nativeId);

/**
Returns the positioning policy for frames with this frame format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#setPosition(com.trolltech.qt.gui.QTextFrameFormat.Position) setPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFrameFormat.Position position()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTextFrameFormat.Position.resolve(__qt_position(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_position(long __this__nativeId);

/**
Returns the width of the frame's right margin in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#setRightMargin(double) setRightMargin()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double rightMargin()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rightMargin(nativeId());
    }
    @QtBlockedSlot
    native double __qt_rightMargin(long __this__nativeId);

/**
Sets the <tt>width</tt> (in pixels) of the frame's border. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#border() border()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBorder(double border)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBorder_double(nativeId(), border);
    }
    @QtBlockedSlot
    native void __qt_setBorder_double(long __this__nativeId, double border);

/**
Sets the <tt>brush</tt> used for the frame's border. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#borderBrush() borderBrush()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBorderBrush(com.trolltech.qt.gui.QBrush brush)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBorderBrush_QBrush(nativeId(), brush == null ? 0 : brush.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBorderBrush_QBrush(long __this__nativeId, long brush);

/**
Sets the <tt>style</tt> of the frame's border. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#borderStyle() borderStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBorderStyle(com.trolltech.qt.gui.QTextFrameFormat.BorderStyle style)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBorderStyle_BorderStyle(nativeId(), style.value());
    }
    @QtBlockedSlot
    native void __qt_setBorderStyle_BorderStyle(long __this__nativeId, int style);

/**
Sets the frame's bottom <tt>margin</tt> in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#bottomMargin() bottomMargin()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBottomMargin(double margin)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBottomMargin_double(nativeId(), margin);
    }
    @QtBlockedSlot
    native void __qt_setBottomMargin_double(long __this__nativeId, double margin);

/**
Sets the frame's <tt>height</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#height() height()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHeight(com.trolltech.qt.gui.QTextLength height)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeight_QTextLength(nativeId(), height == null ? 0 : height.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setHeight_QTextLength(long __this__nativeId, long height);

/**
This is an overloaded member function, provided for convenience. <p>Sets the frame's <tt>height</tt>.
*/

    @QtBlockedSlot
    public final void setHeight(double height)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeight_double(nativeId(), height);
    }
    @QtBlockedSlot
    native void __qt_setHeight_double(long __this__nativeId, double height);

/**
Sets the frame's left <tt>margin</tt> in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#leftMargin() leftMargin()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLeftMargin(double margin)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLeftMargin_double(nativeId(), margin);
    }
    @QtBlockedSlot
    native void __qt_setLeftMargin_double(long __this__nativeId, double margin);

/**
Sets the frame's <tt>margin</tt> in pixels. This method also sets the left, right, top and bottom margins of the frame to the same value. The individual margins override the general margin. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#margin() margin()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMargin(double margin)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMargin_double(nativeId(), margin);
    }
    @QtBlockedSlot
    native void __qt_setMargin_double(long __this__nativeId, double margin);

/**
Sets the <tt>width</tt> of the frame's internal padding in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#padding() padding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPadding(double padding)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPadding_double(nativeId(), padding);
    }
    @QtBlockedSlot
    native void __qt_setPadding_double(long __this__nativeId, double padding);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setPageBreakPolicy(com.trolltech.qt.gui.QTextFormat.PageBreakFlag ... flags) {
        this.setPageBreakPolicy(new com.trolltech.qt.gui.QTextFormat.PageBreakFlags(flags));
    }
/**
Sets the page break policy for the frame/table to <tt>policy</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#pageBreakPolicy() pageBreakPolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPageBreakPolicy(com.trolltech.qt.gui.QTextFormat.PageBreakFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPageBreakPolicy_PageBreakFlags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_setPageBreakPolicy_PageBreakFlags(long __this__nativeId, int flags);

/**
Sets the <tt>policy</tt> for positioning frames with this frame format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#position() position()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPosition(com.trolltech.qt.gui.QTextFrameFormat.Position f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPosition_Position(nativeId(), f.value());
    }
    @QtBlockedSlot
    native void __qt_setPosition_Position(long __this__nativeId, int f);

/**
Sets the frame's right <tt>margin</tt> in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#rightMargin() rightMargin()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRightMargin(double margin)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRightMargin_double(nativeId(), margin);
    }
    @QtBlockedSlot
    native void __qt_setRightMargin_double(long __this__nativeId, double margin);

/**
Sets the frame's top <tt>margin</tt> in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#topMargin() topMargin()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTopMargin(double margin)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTopMargin_double(nativeId(), margin);
    }
    @QtBlockedSlot
    native void __qt_setTopMargin_double(long __this__nativeId, double margin);

/**
Sets the frame's border rectangle's <tt>width</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#width() width()}, and {@link com.trolltech.qt.gui.QTextLength QTextLength}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWidth(com.trolltech.qt.gui.QTextLength length)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidth_QTextLength(nativeId(), length == null ? 0 : length.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setWidth_QTextLength(long __this__nativeId, long length);

/**
This is an overloaded member function, provided for convenience. <p>Convenience method that sets the width of the frame's border rectangle's width to the specified fixed <tt>width</tt>.
*/

    @QtBlockedSlot
    public final void setWidth(double width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidth_double(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setWidth_double(long __this__nativeId, double width);

/**
Returns the width of the frame's top margin in pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#setTopMargin(double) setTopMargin()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double topMargin()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topMargin(nativeId());
    }
    @QtBlockedSlot
    native double __qt_topMargin(long __this__nativeId);

/**
Returns the width of the frame's border rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFrameFormat#setWidth(com.trolltech.qt.gui.QTextLength) setWidth()}, and {@link com.trolltech.qt.gui.QTextLength QTextLength}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextLength width()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_width(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextLength __qt_width(long __this__nativeId);

/**
@exclude
*/

    public static native QTextFrameFormat fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextFrameFormat(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextFrameFormat array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextFrameFormat clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextFrameFormat __qt_clone(long __this_nativeId);
}
