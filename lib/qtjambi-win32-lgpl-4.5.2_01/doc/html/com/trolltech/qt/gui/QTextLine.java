package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextLine class represents a line of text inside a {@link com.trolltech.qt.gui.QTextLayout QTextLayout}. A text line is usually created by {@link com.trolltech.qt.gui.QTextLayout#createLine() QTextLayout::createLine()}. <p>After being created, the line can be filled using the {@link com.trolltech.qt.gui.QTextLine#setLineWidth(double) setLineWidth()} or {@link com.trolltech.qt.gui.QTextLine#setNumColumns(int) setNumColumns()} functions. A line has a number of attributes including the rectangle it occupies, {@link com.trolltech.qt.gui.QTextLine#rect() rect()}, its coordinates, {@link com.trolltech.qt.gui.QTextLine#x() x()} and {@link com.trolltech.qt.gui.QTextLine#y() y()}, its {@link com.trolltech.qt.gui.QTextLine#textLength() textLength()}, {@link com.trolltech.qt.gui.QTextLine#width() width()} and {@link com.trolltech.qt.gui.QTextLine#naturalTextWidth() naturalTextWidth()}, and its {@link com.trolltech.qt.gui.QTextLine#ascent() ascent()} and decent() relative to the text. The position of the cursor in terms of the line is available from {@link com.trolltech.qt.gui.QTextLine#cursorToX(int) cursorToX()} and its inverse from {@link com.trolltech.qt.gui.QTextLine#xToCursor(double) xToCursor()}. A line can be moved with {@link com.trolltech.qt.gui.QTextLine#setPosition(com.trolltech.qt.core.QPointF) setPosition()}.
*/
@QtJambiGeneratedClass
public class QTextLine extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    public enum Edge implements com.trolltech.qt.QtEnumerator {
/**

*/

        Leading(0),
/**

*/

        Trailing(1);

        Edge(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextLine$Edge constant with the specified <tt>int</tt>.</brief>
*/

        public static Edge resolve(int value) {
            return (Edge) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Leading;
            case 1: return Trailing;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum CursorPosition implements com.trolltech.qt.QtEnumerator {
/**

*/

        CursorBetweenCharacters(0),
/**

*/

        CursorOnCharacter(1);

        CursorPosition(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextLine$CursorPosition constant with the specified <tt>int</tt>.</brief>
*/

        public static CursorPosition resolve(int value) {
            return (CursorPosition) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CursorBetweenCharacters;
            case 1: return CursorOnCharacter;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Creates an invalid line.
*/

    public QTextLine(){
        super((QPrivateConstructor)null);
        __qt_QTextLine();
    }

    native void __qt_QTextLine();

/**
Returns the line's ascent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#descent() descent()}, and {@link com.trolltech.qt.gui.QTextLine#height() height()}. <br></DD></DT>
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
Converts the cursor position <tt>cursorPos</tt> to the corresponding x position inside the line, taking account of the <tt>edge</tt>. <p>If <tt>cursorPos</tt> is not a valid cursor position, the nearest valid cursor position will be used instead, and cpos will be modified to point to this valid cursor position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#xToCursor(double) xToCursor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double cursorToX(int cursorPos) {
        return cursorToX(cursorPos, com.trolltech.qt.gui.QTextLine.Edge.Leading);
    }
/**
Converts the cursor position <tt>cursorPos</tt> to the corresponding x position inside the line, taking account of the <tt>edge</tt>. <p>If <tt>cursorPos</tt> is not a valid cursor position, the nearest valid cursor position will be used instead, and cpos will be modified to point to this valid cursor position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#xToCursor(double) xToCursor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double cursorToX(int cursorPos, com.trolltech.qt.gui.QTextLine.Edge edge)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cursorToX_int_Edge(nativeId(), cursorPos, edge.value());
    }
    @QtBlockedSlot
    native double __qt_cursorToX_int_Edge(long __this__nativeId, int cursorPos, int edge);

/**
Returns the line's descent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#ascent() ascent()}, and {@link com.trolltech.qt.gui.QTextLine#height() height()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double descent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_descent(nativeId());
    }
    @QtBlockedSlot
    native double __qt_descent(long __this__nativeId);

    @QtBlockedSlot
    private final void draw(com.trolltech.qt.gui.QPainter p, com.trolltech.qt.core.QPointF point, com.trolltech.qt.QNativePointer selection)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_draw_QPainter_QPointF_nativepointer(nativeId(), p == null ? 0 : p.nativeId(), point == null ? 0 : point.nativeId(), selection);
    }
    @QtBlockedSlot
    native void __qt_draw_QPainter_QPointF_nativepointer(long __this__nativeId, long p, long point, com.trolltech.qt.QNativePointer selection);

/**
Returns the line's height. This is equal to {@link com.trolltech.qt.gui.QTextLine#ascent() ascent()} + {@link com.trolltech.qt.gui.QTextLine#descent() descent()} + 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#ascent() ascent()}, and {@link com.trolltech.qt.gui.QTextLine#descent() descent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double height()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_height(nativeId());
    }
    @QtBlockedSlot
    native double __qt_height(long __this__nativeId);

/**
Returns true if this text line is valid; otherwise returns false.
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
Returns the position of the line in the text engine.
*/

    @QtBlockedSlot
    public final int lineNumber()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineNumber(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lineNumber(long __this__nativeId);

/**
Returns the rectangle covered by the line.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF naturalTextRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_naturalTextRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_naturalTextRect(long __this__nativeId);

/**
Returns the width of the line that is occupied by text. This is always &lt;= to {@link com.trolltech.qt.gui.QTextLine#width() width()}, and is the minimum width that could be used by layout() without changing the line break position.
*/

    @QtBlockedSlot
    public final double naturalTextWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_naturalTextWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_naturalTextWidth(long __this__nativeId);

/**
Returns the line's position relative to the text layout's position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#setPosition(com.trolltech.qt.core.QPointF) setPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF position()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_position(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_position(long __this__nativeId);

/**
Returns the line's bounding rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#x() x()}, {@link com.trolltech.qt.gui.QTextLine#y() y()}, {@link com.trolltech.qt.gui.QTextLine#textLength() textLength()}, and {@link com.trolltech.qt.gui.QTextLine#width() width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF rect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_rect(long __this__nativeId);

/**
Lays out the line with the given <tt>width</tt>. The line is filled from its starting position with as many characters as will fit into the line. In case the text cannot be split at the end of the line, it will be filled with additional characters to the next whitespace or end of the text.
*/

    @QtBlockedSlot
    public final void setLineWidth(double width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLineWidth_double(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setLineWidth_double(long __this__nativeId, double width);

/**
Lays out the line. The line is filled from its starting position with as many characters as are specified by <tt>numColumns</tt>. In case the text cannot be split until <tt>numColumns</tt> characters, the line will be filled with as many characters to the next whitespace or end of the text.
*/

    @QtBlockedSlot
    public final void setNumColumns(int columns)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNumColumns_int(nativeId(), columns);
    }
    @QtBlockedSlot
    native void __qt_setNumColumns_int(long __this__nativeId, int columns);

/**
Lays out the line. The line is filled from its starting position with as many characters as are specified by <tt>numColumns</tt>. In case the text cannot be split until <tt>numColumns</tt> characters, the line will be filled with as many characters to the next whitespace or end of the text. The provided <tt>alignmentWidth</tt> is used as reference width for alignment.
*/

    @QtBlockedSlot
    public final void setNumColumns(int columns, double alignmentWidth)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNumColumns_int_double(nativeId(), columns, alignmentWidth);
    }
    @QtBlockedSlot
    native void __qt_setNumColumns_int_double(long __this__nativeId, int columns, double alignmentWidth);

/**
Moves the line to position <tt>pos</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#position() position()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPosition(com.trolltech.qt.core.QPointF pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPosition_QPointF(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPosition_QPointF(long __this__nativeId, long pos);

/**
Returns the length of the text in the line. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#naturalTextWidth() naturalTextWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int textLength()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textLength(nativeId());
    }
    @QtBlockedSlot
    native int __qt_textLength(long __this__nativeId);

/**
Returns the start of the line from the beginning of the string passed to the {@link com.trolltech.qt.gui.QTextLayout QTextLayout}.
*/

    @QtBlockedSlot
    public final int textStart()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textStart(nativeId());
    }
    @QtBlockedSlot
    native int __qt_textStart(long __this__nativeId);

/**
Returns the line's width as specified by the layout() function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#naturalTextWidth() naturalTextWidth()}, {@link com.trolltech.qt.gui.QTextLine#x() x()}, {@link com.trolltech.qt.gui.QTextLine#y() y()}, {@link com.trolltech.qt.gui.QTextLine#textLength() textLength()}, and {@link com.trolltech.qt.gui.QTextLine#rect() rect()}. <br></DD></DT>
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
Returns the line's x position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#rect() rect()}, {@link com.trolltech.qt.gui.QTextLine#y() y()}, {@link com.trolltech.qt.gui.QTextLine#textLength() textLength()}, and {@link com.trolltech.qt.gui.QTextLine#width() width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double x()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_x(nativeId());
    }
    @QtBlockedSlot
    native double __qt_x(long __this__nativeId);


/**
Converts the x-coordinate <tt>x</tt>, to the nearest matching cursor position, depending on the cursor position type, <tt>cpos</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#cursorToX(int) cursorToX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int xToCursor(double x) {
        return xToCursor(x, com.trolltech.qt.gui.QTextLine.CursorPosition.CursorBetweenCharacters);
    }
/**
Converts the x-coordinate <tt>x</tt>, to the nearest matching cursor position, depending on the cursor position type, <tt>cpos</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#cursorToX(int) cursorToX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int xToCursor(double x, com.trolltech.qt.gui.QTextLine.CursorPosition arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_xToCursor_double_CursorPosition(nativeId(), x, arg__2.value());
    }
    @QtBlockedSlot
    native int __qt_xToCursor_double_CursorPosition(long __this__nativeId, double x, int arg__2);

/**
Returns the line's y position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLine#x() x()}, {@link com.trolltech.qt.gui.QTextLine#rect() rect()}, {@link com.trolltech.qt.gui.QTextLine#textLength() textLength()}, and {@link com.trolltech.qt.gui.QTextLine#width() width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double y()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_y(nativeId());
    }
    @QtBlockedSlot
    native double __qt_y(long __this__nativeId);

/**
@exclude
*/

    public static native QTextLine fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextLine(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextLine array[]);

/**
This is an overloaded method provided for convenience.
*/

    public final void draw(QPainter painter, com.trolltech.qt.core.QPointF position) {
        draw(painter, position, null);
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextLine clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextLine __qt_clone(long __this_nativeId);
}
