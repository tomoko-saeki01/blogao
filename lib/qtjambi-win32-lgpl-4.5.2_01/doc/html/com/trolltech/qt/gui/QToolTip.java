package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QToolTip class provides tool tips (balloon help) for any widget. The tip is a short piece of text reminding the user of the widget's function. It is drawn immediately below the given position in a distinctive black-on-yellow color combination. The tip can be any {@link com.trolltech.qt.gui.QTextEdit rich text} formatted string. <p>Rich text displayed in a tool tip is implicitly word-wrapped unless specified differently with <tt>&lt;p style='white-space:pre'&gt;</tt>. <p>The simplest and most common way to set a widget's tool tip is by calling its {@link QWidget#setToolTip(java.lang.String) QWidget::setToolTip()} function. <p>It is also possible to show different tool tips for different regions of a widget, by using a {@link com.trolltech.qt.gui.QHelpEvent QHelpEvent} of type {@link com.trolltech.qt.core.QEvent.Type QEvent::ToolTip }. Intercept the help event in your widget's event() function and call {@link com.trolltech.qt.gui.QToolTip#showText(com.trolltech.qt.core.QPoint, java.lang.String) QToolTip::showText()} with the text you want to display. The {@link <a href="../widgets-tooltips.html">Tooltips</a>} example illustrates this technique. <p>If you are calling {@link com.trolltech.qt.gui.QToolTip#hideText() QToolTip::hideText()}, or {@link com.trolltech.qt.gui.QToolTip#showText(com.trolltech.qt.core.QPoint, java.lang.String) QToolTip::showText()} with an empty string, as a result of a {@link com.trolltech.qt.core.QEvent.Type ToolTip }-event you should also call {@link com.trolltech.qt.core.QEvent#ignore() ignore()} on the event, to signal that you don't want to start any tooltip specific modes. <p>Note that, if you want to show tooltips in an item view, the model/view architecture provides functionality to set an item's tool tip; e.g., the {@link com.trolltech.qt.gui.QTableWidgetItem#setToolTip(java.lang.String) QTableWidgetItem::setToolTip()} function. However, if you want to provide custom tool tips in an item view, you must intercept the help event in the QAbstractItemView::viewportEvent() function and handle it yourself. <p>The default tool tip color and font can be customized with {@link com.trolltech.qt.gui.QToolTip#setPalette(com.trolltech.qt.gui.QPalette) setPalette()} and {@link com.trolltech.qt.gui.QToolTip#setFont(com.trolltech.qt.gui.QFont) setFont()}. When a tooltip is currently on display, {@link com.trolltech.qt.gui.QToolTip#isVisible() isVisible()} returns true and {@link com.trolltech.qt.gui.QToolTip#text() text()} the currently visible text. <p><b>Note:</b> Tool tips use the inactive color group of {@link com.trolltech.qt.gui.QPalette QPalette}, because tool tips are not active windows. <p><DT><b>See also:</b><br><DD>{@link QWidget#toolTip() QWidget::toolTip}, {@link QAction#toolTip() QAction::toolTip}, and {@link <a href="../widgets-tooltips.html">Tool Tips Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public final class QToolTip extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Returns the font used to render tooltips. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolTip#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QFont font();

/**
Hides the tool tip. This is the same as calling {@link com.trolltech.qt.gui.QToolTip#showText(com.trolltech.qt.core.QPoint, java.lang.String) showText()} with an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolTip#showText(com.trolltech.qt.core.QPoint, java.lang.String) showText()}. <br></DD></DT>
*/

    public native static void hideText();

/**
Returns true if this tooltip is currently shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolTip#showText(com.trolltech.qt.core.QPoint, java.lang.String) showText()}. <br></DD></DT>
*/

    public native static boolean isVisible();

/**
Returns the palette used to render tooltips. <p><b>Note:</b> Tool tips use the inactive color group of {@link com.trolltech.qt.gui.QPalette QPalette}, because tool tips are not active windows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolTip#setPalette(com.trolltech.qt.gui.QPalette) setPalette()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QPalette palette();

/**
Sets the <tt>font</tt> used to render tooltips. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolTip#font() font()}. <br></DD></DT>
*/

    public static void setFont(com.trolltech.qt.gui.QFont arg__1)    {
        __qt_setFont_QFont(arg__1 == null ? 0 : arg__1.nativeId());
    }
    native static void __qt_setFont_QFont(long arg__1);

/**
Sets the <tt>palette</tt> used to render tooltips. <p><b>Note:</b> Tool tips use the inactive color group of {@link com.trolltech.qt.gui.QPalette QPalette}, because tool tips are not active windows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolTip#palette() palette()}. <br></DD></DT>
*/

    public static void setPalette(com.trolltech.qt.gui.QPalette arg__1)    {
        __qt_setPalette_QPalette(arg__1 == null ? 0 : arg__1.nativeId());
    }
    native static void __qt_setPalette_QPalette(long arg__1);


/**
This is an overloaded member function, provided for convenience. <p>This is analogous to calling QToolTip::showText(<tt>pos</tt>, <tt>text</tt>, <tt>w</tt>, QRect())
*/

    public static void showText(com.trolltech.qt.core.QPoint pos, java.lang.String text) {
        showText(pos, text, (com.trolltech.qt.gui.QWidget)null);
    }
/**
This is an overloaded member function, provided for convenience. <p>This is analogous to calling QToolTip::showText(<tt>pos</tt>, <tt>text</tt>, <tt>w</tt>, QRect())
*/

    public static void showText(com.trolltech.qt.core.QPoint pos, java.lang.String text, com.trolltech.qt.gui.QWidget w)    {
        __qt_showText_QPoint_String_QWidget(pos == null ? 0 : pos.nativeId(), text, w == null ? 0 : w.nativeId());
    }
    native static void __qt_showText_QPoint_String_QWidget(long pos, java.lang.String text, long w);

/**
Shows <tt>text</tt> as a tool tip, with the global position <tt>pos</tt> as the point of interest. The tool tip will be shown with a platform specific offset from this point of interest. <p>If you specify a non-empty rect the tip will be hidden as soon as you move your cursor out of this area. <p>The <tt>rect</tt> is in the coordinates of the widget you specify with <tt>w</tt>. If the <tt>rect</tt> is not empty you must specify a widget. Otherwise this argument can be 0 but it is used to determine the appropriate screen on multi-head systems. <p>If <tt>text</tt> is empty the tool tip is hidden. If the text is the same as the currently shown tooltip, the tip will not move. You can force moving by first hiding the tip with an empty text, and then showing the new tip at the new position.
*/

    public static void showText(com.trolltech.qt.core.QPoint pos, java.lang.String text, com.trolltech.qt.gui.QWidget w, com.trolltech.qt.core.QRect rect)    {
        __qt_showText_QPoint_String_QWidget_QRect(pos == null ? 0 : pos.nativeId(), text, w == null ? 0 : w.nativeId(), rect == null ? 0 : rect.nativeId());
    }
    native static void __qt_showText_QPoint_String_QWidget_QRect(long pos, java.lang.String text, long w, long rect);

/**
Returns the tooltip text, if a tooltip is visible, or an empty string if a tooltip is not visible.
*/

    public native static java.lang.String text();

/**
@exclude
*/

    public static native QToolTip fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QToolTip(QPrivateConstructor p) { super(p); } 
}
