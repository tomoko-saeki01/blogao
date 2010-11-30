package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextBlockFormat class provides formatting information for blocks of text in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. A document is composed of a list of blocks, represented by {@link com.trolltech.qt.gui.QTextBlock QTextBlock} objects. Each block can contain an item of some kind, such as a paragraph of text, a table, a list, or an image. Every block has an associated QTextBlockFormat that specifies its characteristics. <p>To cater for left-to-right and right-to-left languages you can set a block's direction with setDirection(). Paragraph alignment is set with {@link com.trolltech.qt.gui.QTextBlockFormat#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. Margins are controlled by {@link com.trolltech.qt.gui.QTextBlockFormat#setTopMargin(double) setTopMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setBottomMargin(double) setBottomMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setLeftMargin(double) setLeftMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setRightMargin(double) setRightMargin()}. Overall indentation is set with {@link com.trolltech.qt.gui.QTextBlockFormat#setIndent(int) setIndent()}, the indentation of the first line with {@link com.trolltech.qt.gui.QTextBlockFormat#setTextIndent(double) setTextIndent()}. <p>Line breaking can be enabled and disabled with {@link com.trolltech.qt.gui.QTextBlockFormat#setNonBreakableLines(boolean) setNonBreakableLines()}. <p>The brush used to paint the paragraph's background is set with {@link com.trolltech.qt.gui.QTextFormat#setBackground(com.trolltech.qt.gui.QBrush) setBackground()}, and other aspects of the text's appearance can be customized by using the {@link com.trolltech.qt.gui.QTextFormat#setProperty(int, java.lang.Object) setProperty()} function with the <tt>OutlinePen</tt>, <tt>ForegroundBrush</tt>, and <tt>BackgroundBrush</tt>{@link com.trolltech.qt.gui.QTextFormat.Property QTextFormat::Property } values. <p>If a text block is part of a list, it can also have a list format that is accessible with the listFormat() function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock QTextBlock}, and {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextBlockFormat extends com.trolltech.qt.gui.QTextFormat
    implements java.lang.Cloneable
{

/**
Constructs a new QTextBlockFormat.
*/

    public QTextBlockFormat(){
        super((QPrivateConstructor)null);
        __qt_QTextBlockFormat();
    }

    native void __qt_QTextBlockFormat();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextBlockFormat(com.trolltech.qt.gui.QTextFormat fmt){
        super((QPrivateConstructor)null);
        __qt_QTextBlockFormat_QTextFormat(fmt == null ? 0 : fmt.nativeId());
    }

    native void __qt_QTextBlockFormat_QTextFormat(long fmt);

/**
Returns the paragraph's alignment. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment alignment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_alignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_alignment(long __this__nativeId);

/**
Returns the paragraph's bottom margin. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#setBottomMargin(double) setBottomMargin()}, and {@link com.trolltech.qt.gui.QTextBlockFormat#topMargin() topMargin()}. <br></DD></DT>
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
Returns the paragraph's indent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#setIndent(int) setIndent()}. <br></DD></DT>
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
Returns the paragraph's left margin. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#setLeftMargin(double) setLeftMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#rightMargin() rightMargin()}, and {@link com.trolltech.qt.gui.QTextBlockFormat#indent() indent()}. <br></DD></DT>
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
Returns true if the lines in the paragraph are non-breakable; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#setNonBreakableLines(boolean) setNonBreakableLines()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean nonBreakableLines()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nonBreakableLines(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_nonBreakableLines(long __this__nativeId);

/**
Returns the currently set page break policy for the paragraph. The default is {@link com.trolltech.qt.gui.QTextFormat.PageBreakFlag QTextFormat::PageBreak_Auto }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#setPageBreakPolicy(com.trolltech.qt.gui.QTextFormat.PageBreakFlag[]) setPageBreakPolicy()}. <br></DD></DT>
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
Returns the paragraph's right margin. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#setRightMargin(double) setRightMargin()}, and {@link com.trolltech.qt.gui.QTextBlockFormat#leftMargin() leftMargin()}. <br></DD></DT>
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
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.setAlignment(new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
Sets the paragraph's <tt>alignment</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#alignment() alignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.Alignment alignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_Alignment(nativeId(), alignment.value());
    }
    @QtBlockedSlot
    native void __qt_setAlignment_Alignment(long __this__nativeId, int alignment);

/**
Sets the paragraph's bottom <tt>margin</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#bottomMargin() bottomMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setTopMargin(double) setTopMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setLeftMargin(double) setLeftMargin()}, and {@link com.trolltech.qt.gui.QTextBlockFormat#setRightMargin(double) setRightMargin()}. <br></DD></DT>
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
Sets the paragraph's <tt>indentation</tt>. Margins are set independently of indentation with {@link com.trolltech.qt.gui.QTextBlockFormat#setLeftMargin(double) setLeftMargin()} and {@link com.trolltech.qt.gui.QTextBlockFormat#setTextIndent(double) setTextIndent()}. The <tt>indentation</tt> is an integer that is multiplied with the document-wide standard indent, resulting in the actual indent of the paragraph. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#indent() indent()}, and {@link QTextDocument#indentWidth() QTextDocument::indentWidth()}. <br></DD></DT>
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
Sets the paragraph's left <tt>margin</tt>. Indentation can be applied separately with {@link com.trolltech.qt.gui.QTextBlockFormat#setIndent(int) setIndent()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#leftMargin() leftMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setRightMargin(double) setRightMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setTopMargin(double) setTopMargin()}, and {@link com.trolltech.qt.gui.QTextBlockFormat#setBottomMargin(double) setBottomMargin()}. <br></DD></DT>
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
If <tt>b</tt> is true, the lines in the paragraph are treated as non-breakable; otherwise they are breakable. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#nonBreakableLines() nonBreakableLines()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNonBreakableLines(boolean b)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNonBreakableLines_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setNonBreakableLines_boolean(long __this__nativeId, boolean b);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setPageBreakPolicy(com.trolltech.qt.gui.QTextFormat.PageBreakFlag ... flags) {
        this.setPageBreakPolicy(new com.trolltech.qt.gui.QTextFormat.PageBreakFlags(flags));
    }
/**
Sets the page break policy for the paragraph to <tt>policy</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#pageBreakPolicy() pageBreakPolicy()}. <br></DD></DT>
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
Sets the paragraph's right <tt>margin</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#rightMargin() rightMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setLeftMargin(double) setLeftMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setTopMargin(double) setTopMargin()}, and {@link com.trolltech.qt.gui.QTextBlockFormat#setBottomMargin(double) setBottomMargin()}. <br></DD></DT>
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
Sets the tab positions for the text block to those specified by <tt>tabs</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#tabPositions() tabPositions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTabPositions(java.util.List<com.trolltech.qt.gui.QTextOption_Tab> tabs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabPositions_List(nativeId(), tabs);
    }
    @QtBlockedSlot
    native void __qt_setTabPositions_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QTextOption_Tab> tabs);

/**
Sets the <tt>indent</tt> for the first line in the block. This allows the first line of a paragraph to be indented differently to the other lines, enhancing the readability of the text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#textIndent() textIndent()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setLeftMargin(double) setLeftMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setRightMargin(double) setRightMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setTopMargin(double) setTopMargin()}, and {@link com.trolltech.qt.gui.QTextBlockFormat#setBottomMargin(double) setBottomMargin()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTextIndent(double aindent)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextIndent_double(nativeId(), aindent);
    }
    @QtBlockedSlot
    native void __qt_setTextIndent_double(long __this__nativeId, double aindent);

/**
Sets the paragraph's top <tt>margin</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#topMargin() topMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setBottomMargin(double) setBottomMargin()}, {@link com.trolltech.qt.gui.QTextBlockFormat#setLeftMargin(double) setLeftMargin()}, and {@link com.trolltech.qt.gui.QTextBlockFormat#setRightMargin(double) setRightMargin()}. <br></DD></DT>
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
Returns a list of tab positions defined for the text block. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#setTabPositions(java.util.List) setTabPositions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTextOption_Tab> tabPositions()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabPositions(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTextOption_Tab> __qt_tabPositions(long __this__nativeId);

/**
Returns the paragraph's text indent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#setTextIndent(double) setTextIndent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double textIndent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textIndent(nativeId());
    }
    @QtBlockedSlot
    native double __qt_textIndent(long __this__nativeId);

/**
Returns the paragraph's top margin. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlockFormat#setTopMargin(double) setTopMargin()}, and {@link com.trolltech.qt.gui.QTextBlockFormat#bottomMargin() bottomMargin()}. <br></DD></DT>
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
@exclude
*/

    public static native QTextBlockFormat fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextBlockFormat(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextBlockFormat array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextBlockFormat clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextBlockFormat __qt_clone(long __this_nativeId);
}
