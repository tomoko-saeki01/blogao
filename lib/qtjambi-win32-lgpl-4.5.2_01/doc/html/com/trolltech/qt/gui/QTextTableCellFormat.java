package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextTableCellFormat class provides formatting information for table cells in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. The table cell format of a table cell in a document specifies the visual properties of the table cell. <p>The padding properties of a table cell are controlled by {@link com.trolltech.qt.gui.QTextTableCellFormat#setLeftPadding(double) setLeftPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#setRightPadding(double) setRightPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#setTopPadding(double) setTopPadding()}, and {@link com.trolltech.qt.gui.QTextTableCellFormat#setBottomPadding(double) setBottomPadding()}. All the paddings can be set at once using {@link com.trolltech.qt.gui.QTextTableCellFormat#setPadding(double) setPadding()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextFormat QTextFormat}, {@link com.trolltech.qt.gui.QTextBlockFormat QTextBlockFormat}, {@link com.trolltech.qt.gui.QTextTableFormat QTextTableFormat}, and {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextTableCellFormat extends com.trolltech.qt.gui.QTextCharFormat
    implements java.lang.Cloneable
{

/**
Constructs a new table cell format object.
*/

    public QTextTableCellFormat(){
        super((QPrivateConstructor)null);
        __qt_QTextTableCellFormat();
    }

    native void __qt_QTextTableCellFormat();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextTableCellFormat(com.trolltech.qt.gui.QTextFormat fmt){
        super((QPrivateConstructor)null);
        __qt_QTextTableCellFormat_QTextFormat(fmt == null ? 0 : fmt.nativeId());
    }

    native void __qt_QTextTableCellFormat_QTextFormat(long fmt);

/**
Gets the bottom padding of the table cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCellFormat#setBottomPadding(double) setBottomPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#leftPadding() leftPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#rightPadding() rightPadding()}, and {@link com.trolltech.qt.gui.QTextTableCellFormat#topPadding() topPadding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double bottomPadding()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bottomPadding(nativeId());
    }
    @QtBlockedSlot
    native double __qt_bottomPadding(long __this__nativeId);

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
Gets the left padding of the table cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCellFormat#setLeftPadding(double) setLeftPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#rightPadding() rightPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#topPadding() topPadding()}, and {@link com.trolltech.qt.gui.QTextTableCellFormat#bottomPadding() bottomPadding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double leftPadding()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_leftPadding(nativeId());
    }
    @QtBlockedSlot
    native double __qt_leftPadding(long __this__nativeId);

/**
Gets the right padding of the table cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCellFormat#setRightPadding(double) setRightPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#leftPadding() leftPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#topPadding() topPadding()}, and {@link com.trolltech.qt.gui.QTextTableCellFormat#bottomPadding() bottomPadding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double rightPadding()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rightPadding(nativeId());
    }
    @QtBlockedSlot
    native double __qt_rightPadding(long __this__nativeId);

/**
Sets the bottom <tt>padding</tt> of the table cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCellFormat#bottomPadding() bottomPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#setLeftPadding(double) setLeftPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#setRightPadding(double) setRightPadding()}, and {@link com.trolltech.qt.gui.QTextTableCellFormat#setTopPadding(double) setTopPadding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBottomPadding(double padding)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBottomPadding_double(nativeId(), padding);
    }
    @QtBlockedSlot
    native void __qt_setBottomPadding_double(long __this__nativeId, double padding);

/**
Sets the left <tt>padding</tt> of the table cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCellFormat#leftPadding() leftPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#setRightPadding(double) setRightPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#setTopPadding(double) setTopPadding()}, and {@link com.trolltech.qt.gui.QTextTableCellFormat#setBottomPadding(double) setBottomPadding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLeftPadding(double padding)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLeftPadding_double(nativeId(), padding);
    }
    @QtBlockedSlot
    native void __qt_setLeftPadding_double(long __this__nativeId, double padding);

/**
Sets the left, right, top, and bottom <tt>padding</tt> of the table cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCellFormat#setLeftPadding(double) setLeftPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#setRightPadding(double) setRightPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#setTopPadding(double) setTopPadding()}, and {@link com.trolltech.qt.gui.QTextTableCellFormat#setBottomPadding(double) setBottomPadding()}. <br></DD></DT>
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
Sets the right <tt>padding</tt> of the table cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCellFormat#rightPadding() rightPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#setLeftPadding(double) setLeftPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#setTopPadding(double) setTopPadding()}, and {@link com.trolltech.qt.gui.QTextTableCellFormat#setBottomPadding(double) setBottomPadding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRightPadding(double padding)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRightPadding_double(nativeId(), padding);
    }
    @QtBlockedSlot
    native void __qt_setRightPadding_double(long __this__nativeId, double padding);

/**
Sets the top <tt>padding</tt> of the table cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCellFormat#topPadding() topPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#setLeftPadding(double) setLeftPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#setRightPadding(double) setRightPadding()}, and {@link com.trolltech.qt.gui.QTextTableCellFormat#setBottomPadding(double) setBottomPadding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTopPadding(double padding)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTopPadding_double(nativeId(), padding);
    }
    @QtBlockedSlot
    native void __qt_setTopPadding_double(long __this__nativeId, double padding);

/**
Gets the top padding of the table cell. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextTableCellFormat#setTopPadding(double) setTopPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#leftPadding() leftPadding()}, {@link com.trolltech.qt.gui.QTextTableCellFormat#rightPadding() rightPadding()}, and {@link com.trolltech.qt.gui.QTextTableCellFormat#bottomPadding() bottomPadding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double topPadding()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topPadding(nativeId());
    }
    @QtBlockedSlot
    native double __qt_topPadding(long __this__nativeId);

/**
@exclude
*/

    public static native QTextTableCellFormat fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextTableCellFormat(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextTableCellFormat array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextTableCellFormat clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextTableCellFormat __qt_clone(long __this_nativeId);
}
