package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextLayout class is used to lay out and paint a single paragraph of text. It offers most features expected from a modern text layout engine, including Unicode compliant rendering, line breaking and handling of cursor positioning. It can also produce and render device independent layout, something that is important for WYSIWYG applications. <p>The class has a rather low level API and unless you intend to implement your own text rendering for some specialized widget, you probably won't need to use it directly. <p>QTextLayout can currently deal with plain text and rich text paragraphs that are part of a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. <p>QTextLayout can be used to create a sequence of {@link com.trolltech.qt.gui.QTextLine QTextLine}'s with given widths and can position them independently on the screen. Once the layout is done, these lines can be drawn on a paint device. <p>Here's some pseudo code that presents the layout phase: <pre class="snippet">
        int leading = fontMetrics.leading();
        double height = 0;
        double widthUsed = 0;
        textLayout.beginLayout();
        while (1==1) {
            QTextLine line = textLayout.createLine();
            if (!line.isValid())
                break;

            line.setLineWidth(lineWidth);
            height += leading;
            line.setPosition(new QPointF(0.0, height));
            height += line.height();
            widthUsed = Math.max(widthUsed, line.naturalTextWidth());
        }
        textLayout.endLayout();
</pre> The text can be drawn by calling the layout's {@link com.trolltech.qt.gui.QTextLayout#draw(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QPointF, java.util.List) draw()} function: <pre class="snippet">
        QPainter painter = new QPainter();
        textLayout.draw(painter,new QPointF(), new ArrayList&lt;QTextLayout_FormatRange&gt;());
</pre> The text layout's text is set in the constructor or with {@link com.trolltech.qt.gui.QTextLayout#setText(java.lang.String) setText()}. The layout can be seen as a sequence of {@link com.trolltech.qt.gui.QTextLine QTextLine} objects; use {@link com.trolltech.qt.gui.QTextLayout#lineAt(int) lineAt()} or {@link com.trolltech.qt.gui.QTextLayout#lineForTextPosition(int) lineForTextPosition()} to get a {@link com.trolltech.qt.gui.QTextLine QTextLine}, {@link com.trolltech.qt.gui.QTextLayout#createLine() createLine()} to create one. For a given position in the text you can find a valid cursor position with {@link com.trolltech.qt.gui.QTextLayout#isValidCursorPosition(int) isValidCursorPosition()}, {@link com.trolltech.qt.gui.QTextLayout#nextCursorPosition(int) nextCursorPosition()}, and {@link com.trolltech.qt.gui.QTextLayout#previousCursorPosition(int) previousCursorPosition()}. The layout itself can be positioned with {@link com.trolltech.qt.gui.QTextLayout#setPosition(com.trolltech.qt.core.QPointF) setPosition()}; it has a {@link com.trolltech.qt.gui.QTextLayout#boundingRect() boundingRect()}, and a {@link com.trolltech.qt.gui.QTextLayout#minimumWidth() minimumWidth()} and a {@link com.trolltech.qt.gui.QTextLayout#maximumWidth() maximumWidth()}. A text layout can be drawn on a painter device using {@link com.trolltech.qt.gui.QTextLayout#draw(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QPointF, java.util.List) draw()}.
*/
@QtJambiGeneratedClass
public class QTextLayout extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    public enum CursorMode implements com.trolltech.qt.QtEnumerator {
/**

*/

        SkipCharacters(0),
/**

*/

        SkipWords(1);

        CursorMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextLayout$CursorMode constant with the specified <tt>int</tt>.</brief>
*/

        public static CursorMode resolve(int value) {
            return (CursorMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SkipCharacters;
            case 1: return SkipWords;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an empty text layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#setText(java.lang.String) setText()}. <br></DD></DT>
*/

    public QTextLayout(){
        super((QPrivateConstructor)null);
        __qt_QTextLayout();
    }

    native void __qt_QTextLayout();

/**
Constructs a text layout to lay out the given <tt>text</tt>.
*/

    public QTextLayout(java.lang.String text){
        super((QPrivateConstructor)null);
        __qt_QTextLayout_String(text);
    }

    native void __qt_QTextLayout_String(java.lang.String text);


/**
Constructs a text layout to lay out the given <tt>text</tt> with the specified <tt>font</tt>. <p>All the metric and layout calculations will be done in terms of the paint device, <tt>paintdevice</tt>. If <tt>paintdevice</tt> is 0 the calculations will be done in screen metrics.
*/

    public QTextLayout(java.lang.String text, com.trolltech.qt.gui.QFont font) {
        this(text, font, (com.trolltech.qt.gui.QPaintDevice)null);
    }
/**
Constructs a text layout to lay out the given <tt>text</tt> with the specified <tt>font</tt>. <p>All the metric and layout calculations will be done in terms of the paint device, <tt>paintdevice</tt>. If <tt>paintdevice</tt> is 0 the calculations will be done in screen metrics.
*/

    public QTextLayout(java.lang.String text, com.trolltech.qt.gui.QFont font, com.trolltech.qt.gui.QPaintDeviceInterface paintdevice){
        super((QPrivateConstructor)null);
        __qt_QTextLayout_String_QFont_QPaintDevice(text, font == null ? 0 : font.nativeId(), paintdevice == null ? 0 : paintdevice.nativeId());
    }

    native void __qt_QTextLayout_String_QFont_QPaintDevice(java.lang.String text, long font, long paintdevice);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QTextLayout(com.trolltech.qt.gui.QTextBlock b){
        super((QPrivateConstructor)null);
        __qt_QTextLayout_QTextBlock(b == null ? 0 : b.nativeId());
    }

    native void __qt_QTextLayout_QTextBlock(long b);

/**
Returns the list of additional formats supported by the text layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#setAdditionalFormats(java.util.List) setAdditionalFormats()}, and {@link com.trolltech.qt.gui.QTextLayout#clearAdditionalFormats() clearAdditionalFormats()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTextLayout_FormatRange> additionalFormats()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_additionalFormats(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTextLayout_FormatRange> __qt_additionalFormats(long __this__nativeId);

/**
Begins the layout process.
*/

    @QtBlockedSlot
    public final void beginLayout()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_beginLayout(nativeId());
    }
    @QtBlockedSlot
    native void __qt_beginLayout(long __this__nativeId);

/**
The smallest rectangle that contains all the lines in the layout.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF boundingRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_boundingRect(long __this__nativeId);

/**
Returns true if the complete layout information is cached; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#setCacheEnabled(boolean) setCacheEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean cacheEnabled()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cacheEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_cacheEnabled(long __this__nativeId);

/**
Clears the list of additional formats supported by the text layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#additionalFormats() additionalFormats()}, and {@link com.trolltech.qt.gui.QTextLayout#setAdditionalFormats(java.util.List) setAdditionalFormats()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearAdditionalFormats()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearAdditionalFormats(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearAdditionalFormats(long __this__nativeId);

/**
Clears the line information in the layout. After having called this function, {@link com.trolltech.qt.gui.QTextLayout#lineCount() lineCount()} returns 0.
*/

    @QtBlockedSlot
    public final void clearLayout()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearLayout(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearLayout(long __this__nativeId);

/**
Returns a new text line to be laid out if there is text to be inserted into the layout; otherwise returns an invalid text line. <p>The text layout creates a new line object that starts after the last line in the layout, or at the beginning if the layout is empty. The layout maintains an internal cursor, and each line is filled with text from the cursor position onwards when the {@link com.trolltech.qt.gui.QTextLine#setLineWidth(double) QTextLine::setLineWidth()} function is called. <p>Once {@link com.trolltech.qt.gui.QTextLine#setLineWidth(double) QTextLine::setLineWidth()} is called, a new line can be created and filled with text. Repeating this process will lay out the whole block of text contained in the QTextLayout. If there is no text left to be inserted into the layout, the {@link com.trolltech.qt.gui.QTextLine QTextLine} returned will not be valid (isValid() will return false).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextLine createLine()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createLine(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextLine __qt_createLine(long __this__nativeId);


/**
Draws the whole layout on the painter <tt>p</tt> at the position
specified by <tt>pos</tt>.  The rendered layout includes the given
<tt>selections</tt>.
*/

    @QtBlockedSlot
    public final void draw(com.trolltech.qt.gui.QPainter p, com.trolltech.qt.core.QPointF pos, java.util.List<com.trolltech.qt.gui.QTextLayout_FormatRange> selections) {
        draw(p, pos, selections, (com.trolltech.qt.core.QRectF)new com.trolltech.qt.core.QRectF());
    }
/**
Draws the whole layout on the painter <tt>p</tt> at the position specified by <tt>pos</tt>. The rendered layout includes the given <tt>selections</tt> and is clipped within the rectangle specified by <tt>clip</tt>.
*/

    @QtBlockedSlot
    public final void draw(com.trolltech.qt.gui.QPainter p, com.trolltech.qt.core.QPointF pos, java.util.List<com.trolltech.qt.gui.QTextLayout_FormatRange> selections, com.trolltech.qt.core.QRectF clip)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_draw_QPainter_QPointF_List_QRectF(nativeId(), p == null ? 0 : p.nativeId(), pos == null ? 0 : pos.nativeId(), selections, clip == null ? 0 : clip.nativeId());
    }
    @QtBlockedSlot
    native void __qt_draw_QPainter_QPointF_List_QRectF(long __this__nativeId, long p, long pos, java.util.List<com.trolltech.qt.gui.QTextLayout_FormatRange> selections, long clip);

/**
This is an overloaded member function, provided for convenience. <p>Draws a text cursor with the current pen at the given <tt>position</tt> using the <tt>painter</tt> specified. The corresponding position within the text is specified by <tt>cursorPosition</tt>.
*/

    @QtBlockedSlot
    public final void drawCursor(com.trolltech.qt.gui.QPainter p, com.trolltech.qt.core.QPointF pos, int cursorPosition)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawCursor_QPainter_QPointF_int(nativeId(), p == null ? 0 : p.nativeId(), pos == null ? 0 : pos.nativeId(), cursorPosition);
    }
    @QtBlockedSlot
    native void __qt_drawCursor_QPainter_QPointF_int(long __this__nativeId, long p, long pos, int cursorPosition);

/**
Draws a text cursor with the current pen and the specified <tt>width</tt> at the given <tt>position</tt> using the <tt>painter</tt> specified. The corresponding position within the text is specified by <tt>cursorPosition</tt>.
*/

    @QtBlockedSlot
    public final void drawCursor(com.trolltech.qt.gui.QPainter p, com.trolltech.qt.core.QPointF pos, int cursorPosition, int width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawCursor_QPainter_QPointF_int_int(nativeId(), p == null ? 0 : p.nativeId(), pos == null ? 0 : pos.nativeId(), cursorPosition, width);
    }
    @QtBlockedSlot
    native void __qt_drawCursor_QPainter_QPointF_int_int(long __this__nativeId, long p, long pos, int cursorPosition, int width);

/**
Ends the layout process.
*/

    @QtBlockedSlot
    public final void endLayout()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_endLayout(nativeId());
    }
    @QtBlockedSlot
    native void __qt_endLayout(long __this__nativeId);

/**
Returns the current font that is used for the layout, or a default font if none is set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
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
Returns true if position <tt>pos</tt> is a valid cursor position. <p>In a Unicode context some positions in the text are not valid cursor positions, because the position is inside a Unicode surrogate or a grapheme cluster. <p>A grapheme cluster is a sequence of two or more Unicode characters that form one indivisible entity on the screen. For example the latin character `&Auml;' can be represented in Unicode by two characters, `A' (0x41), and the combining diaresis (0x308). A text cursor can only validly be positioned before or after these two characters, never between them since that wouldn't make sense. In indic languages every syllable forms a grapheme cluster.
*/

    @QtBlockedSlot
    public final boolean isValidCursorPosition(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValidCursorPosition_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native boolean __qt_isValidCursorPosition_int(long __this__nativeId, int pos);

/**
Returns the <tt>i</tt>-th line of text in this text layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#lineCount() lineCount()}, and {@link com.trolltech.qt.gui.QTextLayout#lineForTextPosition(int) lineForTextPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextLine lineAt(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineAt_int(nativeId(), i);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextLine __qt_lineAt_int(long __this__nativeId, int i);

/**
Returns the number of lines in this text layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#lineAt(int) lineAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lineCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lineCount(long __this__nativeId);

/**
Returns the line that contains the cursor position specified by <tt>pos</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#isValidCursorPosition(int) isValidCursorPosition()}, and {@link com.trolltech.qt.gui.QTextLayout#lineAt(int) lineAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextLine lineForTextPosition(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineForTextPosition_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextLine __qt_lineForTextPosition_int(long __this__nativeId, int pos);

/**
The maximum width the layout could expand to; this is essentially the width of the entire text. <p><b>Warning:</b> This function only returns a valid value after the layout has been done. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#minimumWidth() minimumWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double maximumWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_maximumWidth(long __this__nativeId);

/**
The minimum width the layout needs. This is the width of the layout's smallest non-breakable substring. <p><b>Warning:</b> This function only returns a valid value after the layout has been done. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#maximumWidth() maximumWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double minimumWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumWidth(nativeId());
    }
    @QtBlockedSlot
    native double __qt_minimumWidth(long __this__nativeId);


/**
Returns the next valid cursor position after <tt>oldPos</tt> that respects the given cursor <tt>mode</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#isValidCursorPosition(int) isValidCursorPosition()}, and {@link com.trolltech.qt.gui.QTextLayout#previousCursorPosition(int) previousCursorPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int nextCursorPosition(int oldPos) {
        return nextCursorPosition(oldPos, com.trolltech.qt.gui.QTextLayout.CursorMode.SkipCharacters);
    }
/**
Returns the next valid cursor position after <tt>oldPos</tt> that respects the given cursor <tt>mode</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#isValidCursorPosition(int) isValidCursorPosition()}, and {@link com.trolltech.qt.gui.QTextLayout#previousCursorPosition(int) previousCursorPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int nextCursorPosition(int oldPos, com.trolltech.qt.gui.QTextLayout.CursorMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nextCursorPosition_int_CursorMode(nativeId(), oldPos, mode.value());
    }
    @QtBlockedSlot
    native int __qt_nextCursorPosition_int_CursorMode(long __this__nativeId, int oldPos, int mode);

/**
The global position of the layout. This is independent of the bounding rectangle and of the layout process. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#setPosition(com.trolltech.qt.core.QPointF) setPosition()}. <br></DD></DT>
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
Returns the position of the area in the text layout that will be processed before editing occurs.
*/

    @QtBlockedSlot
    public final int preeditAreaPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_preeditAreaPosition(nativeId());
    }
    @QtBlockedSlot
    native int __qt_preeditAreaPosition(long __this__nativeId);

/**
Returns the text that is inserted in the layout before editing occurs.
*/

    @QtBlockedSlot
    public final java.lang.String preeditAreaText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_preeditAreaText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_preeditAreaText(long __this__nativeId);


/**
Returns the first valid cursor position before <tt>oldPos</tt> that respects the given cursor <tt>mode</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#isValidCursorPosition(int) isValidCursorPosition()}, and {@link com.trolltech.qt.gui.QTextLayout#nextCursorPosition(int) nextCursorPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int previousCursorPosition(int oldPos) {
        return previousCursorPosition(oldPos, com.trolltech.qt.gui.QTextLayout.CursorMode.SkipCharacters);
    }
/**
Returns the first valid cursor position before <tt>oldPos</tt> that respects the given cursor <tt>mode</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#isValidCursorPosition(int) isValidCursorPosition()}, and {@link com.trolltech.qt.gui.QTextLayout#nextCursorPosition(int) nextCursorPosition()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int previousCursorPosition(int oldPos, com.trolltech.qt.gui.QTextLayout.CursorMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_previousCursorPosition_int_CursorMode(nativeId(), oldPos, mode.value());
    }
    @QtBlockedSlot
    native int __qt_previousCursorPosition_int_CursorMode(long __this__nativeId, int oldPos, int mode);

/**
Sets the additional formats supported by the text layout to <tt>formatList</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#additionalFormats() additionalFormats()}, and {@link com.trolltech.qt.gui.QTextLayout#clearAdditionalFormats() clearAdditionalFormats()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAdditionalFormats(java.util.List<com.trolltech.qt.gui.QTextLayout_FormatRange> overrides)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAdditionalFormats_List(nativeId(), overrides);
    }
    @QtBlockedSlot
    native void __qt_setAdditionalFormats_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QTextLayout_FormatRange> overrides);

/**
Enables caching of the complete layout information if <tt>enable</tt> is true; otherwise disables layout caching. Usually QTextLayout throws most of the layouting information away after a call to {@link com.trolltech.qt.gui.QTextLayout#endLayout() endLayout()} to reduce memory consumption. If you however want to draw the laid out text directly afterwards enabling caching might speed up drawing significantly. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#cacheEnabled() cacheEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCacheEnabled(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCacheEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setCacheEnabled_boolean(long __this__nativeId, boolean enable);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setFlags(int flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFlags_int(nativeId(), flags);
    }
    @QtBlockedSlot
    native void __qt_setFlags_int(long __this__nativeId, int flags);

/**
Sets the layout's font to the given <tt>font</tt>. The layout is invalidated and must be laid out again. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#font() font()}, and {@link com.trolltech.qt.gui.QTextLayout#text() text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFont(com.trolltech.qt.gui.QFont f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFont_QFont(nativeId(), f == null ? 0 : f.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFont_QFont(long __this__nativeId, long f);

/**
Moves the text layout to point <tt>p</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#position() position()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPosition(com.trolltech.qt.core.QPointF p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPosition_QPointF(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPosition_QPointF(long __this__nativeId, long p);

/**
Sets the <tt>position</tt> and <tt>text</tt> of the area in the layout that is processed before editing occurs.
*/

    @QtBlockedSlot
    public final void setPreeditArea(int position, java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPreeditArea_int_String(nativeId(), position, text);
    }
    @QtBlockedSlot
    native void __qt_setPreeditArea_int_String(long __this__nativeId, int position, java.lang.String text);

/**
Sets the layout's text to the given <tt>string</tt>. The layout is invalidated and must be laid out again. <p>Notice that when using this QTextLayout as part of a {@link com.trolltech.qt.gui.QTextDocument QTextDocument} this method will have no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#text() text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setText(java.lang.String string)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String(nativeId(), string);
    }
    @QtBlockedSlot
    native void __qt_setText_String(long __this__nativeId, java.lang.String string);

/**
Sets the text option structure that controls the layout process to the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#textOption() textOption()}, and {@link com.trolltech.qt.gui.QTextOption QTextOption}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTextOption(com.trolltech.qt.gui.QTextOption option)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextOption_QTextOption(nativeId(), option == null ? 0 : option.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTextOption_QTextOption(long __this__nativeId, long option);

/**
Returns the layout's text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#setText(java.lang.String) setText()}. <br></DD></DT>
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
Returns the current text option used to control the layout process. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextLayout#setTextOption(com.trolltech.qt.gui.QTextOption) setTextOption()}, and {@link com.trolltech.qt.gui.QTextOption QTextOption}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextOption textOption()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textOption(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextOption __qt_textOption(long __this__nativeId);

/**
@exclude
*/

    public static native QTextLayout fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextLayout(QPrivateConstructor p) { super(p); } 
}
