package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QToolBox class provides a column of tabbed widget items. A toolbox is a widget that displays a column of tabs one above the other, with the current item displayed below the current tab. Every tab has an index position within the column of tabs. A tab's item is a {@link com.trolltech.qt.gui.QWidget QWidget}. <p>Each item has an {@link com.trolltech.qt.gui.QToolBox#itemText(int) itemText()}, an optional {@link com.trolltech.qt.gui.QToolBox#itemIcon(int) itemIcon()}, an optional {@link com.trolltech.qt.gui.QToolBox#itemToolTip(int) itemToolTip()}, and a {@link com.trolltech.qt.gui.QToolBox#widget(int) widget()}. The item's attributes can be changed with {@link com.trolltech.qt.gui.QToolBox#setItemText(int, java.lang.String) setItemText()}, {@link com.trolltech.qt.gui.QToolBox#setItemIcon(int, com.trolltech.qt.gui.QIcon) setItemIcon()}, and {@link com.trolltech.qt.gui.QToolBox#setItemToolTip(int, java.lang.String) setItemToolTip()}. Each item can be enabled or disabled individually with {@link com.trolltech.qt.gui.QToolBox#setItemEnabled(int, boolean) setItemEnabled()}. <p>Items are added using {@link com.trolltech.qt.gui.QToolBox#addItem(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) addItem()}, or inserted at particular positions using {@link com.trolltech.qt.gui.QToolBox#insertItem(int, com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) insertItem()}. The total number of items is given by {@link com.trolltech.qt.gui.QToolBox#count() count()}. Items can be deleted with delete, or removed from the toolbox with {@link com.trolltech.qt.gui.QToolBox#removeItem(int) removeItem()}. Combining {@link com.trolltech.qt.gui.QToolBox#removeItem(int) removeItem()} and {@link com.trolltech.qt.gui.QToolBox#insertItem(int, com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) insertItem()} allows you to move items to different positions. <p>The index of the current item widget is returned by {@link com.trolltech.qt.gui.QToolBox#currentIndex() currentIndex()}, and set with {@link com.trolltech.qt.gui.QToolBox#setCurrentIndex(int) setCurrentIndex()}. The index of a particular item can be found using {@link com.trolltech.qt.gui.QToolBox#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}, and the item at a given index is returned by item(). <p>The {@link com.trolltech.qt.gui.QToolBox#currentChanged currentChanged() } signal is emitted when the current item is changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget QTabWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QToolBox extends com.trolltech.qt.gui.QFrame
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: index)&gt;:<p> This signal is emitted when the current item is changed. The new current item's index is passed in <tt>index</tt>, or -1 if there is no current item.
*/

    public final Signal1<java.lang.Integer> currentChanged = new Signal1<java.lang.Integer>();

    private final void currentChanged(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentChanged_int(nativeId(), index);
    }
    native void __qt_currentChanged_int(long __this__nativeId, int index);


/**
This is an overloaded method provided for convenience.
*/

    public QToolBox(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... f) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(f));
    }

/**
Constructs a new toolbox with the given <tt>parent</tt> and the flags, <tt>f</tt>.
*/

    public QToolBox(com.trolltech.qt.gui.QWidget parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a new toolbox with the given <tt>parent</tt> and the flags, <tt>f</tt>.
*/

    public QToolBox() {
        this((com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a new toolbox with the given <tt>parent</tt> and the flags, <tt>f</tt>.
*/

    public QToolBox(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags f){
        super((QPrivateConstructor)null);
        __qt_QToolBox_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), f.value());
    }

    native void __qt_QToolBox_QWidget_WindowFlags(long parent, int f);

/**
Adds the <tt>widget</tt> in a new tab at bottom of the toolbox. The new tab's text is set to <tt>text</tt>, and the <tt>iconSet</tt> is displayed to the left of the <tt>text</tt>. Returns the new tab's index.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int addItem(com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.gui.QIcon icon, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addItem_QWidget_QIcon_String(nativeId(), widget == null ? 0 : widget.nativeId(), icon == null ? 0 : icon.nativeId(), text);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_addItem_QWidget_QIcon_String(long __this__nativeId, long widget, long icon, java.lang.String text);

/**
This is an overloaded member function, provided for convenience. <p>Adds the widget <tt>w</tt> in a new tab at bottom of the toolbox. The new tab's text is set to <tt>text</tt>. Returns the new tab's index.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int addItem(com.trolltech.qt.gui.QWidget widget, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addItem_QWidget_String(nativeId(), widget == null ? 0 : widget.nativeId(), text);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_addItem_QWidget_String(long __this__nativeId, long widget, java.lang.String text);

/**
This property holds The number of items contained in the toolbox.  By default, this property has a value of 0.
*/

    @com.trolltech.qt.QtPropertyReader(name="count")
    @QtBlockedSlot
    public final int count()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
This property holds the index of the current item. By default, for an empty toolbox, this property has a value of -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBox#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}, and {@link com.trolltech.qt.gui.QToolBox#widget(int) widget()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="currentIndex")
    @QtBlockedSlot
    public final int currentIndex()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentIndex(long __this__nativeId);

/**
Returns a pointer to the current widget, or 0 if there is no such item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBox#currentIndex() currentIndex()}, and {@link com.trolltech.qt.gui.QToolBox#setCurrentWidget(com.trolltech.qt.gui.QWidget) setCurrentWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget currentWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_currentWidget(long __this__nativeId);

/**
Returns the index of <tt>widget</tt>, or -1 if the item does not exist.
*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOf_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native int __qt_indexOf_QWidget(long __this__nativeId, long widget);

/**
Inserts the <tt>widget</tt> at position <tt>index</tt>, or at the bottom of the toolbox if <tt>index</tt> is out of range. The new item's text is set to <tt>text</tt>, and the <tt>icon</tt> is displayed to the left of the <tt>text</tt>. Returns the new item's index.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int insertItem(int index, com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.gui.QIcon icon, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertItem_int_QWidget_QIcon_String(nativeId(), index, widget == null ? 0 : widget.nativeId(), icon == null ? 0 : icon.nativeId(), text);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_insertItem_int_QWidget_QIcon_String(long __this__nativeId, int index, long widget, long icon, java.lang.String text);

/**
This is an overloaded member function, provided for convenience. <p>Inserts the <tt>widget</tt> at position <tt>index</tt>, or at the bottom of the toolbox if <tt>index</tt> is out of range. The new item's text is set to <tt>text</tt>. Returns the new item's index.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int insertItem(int index, com.trolltech.qt.gui.QWidget widget, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertItem_int_QWidget_String(nativeId(), index, widget == null ? 0 : widget.nativeId(), text);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_insertItem_int_QWidget_String(long __this__nativeId, int index, long widget, java.lang.String text);

/**
Returns true if the item at position <tt>index</tt> is enabled; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isItemEnabled(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isItemEnabled_int(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_isItemEnabled_int(long __this__nativeId, int index);

/**
Returns the icon of the item at position <tt>index</tt>, or a null icon if <tt>index</tt> is out of range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBox#setItemIcon(int, com.trolltech.qt.gui.QIcon) setItemIcon()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon itemIcon(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemIcon_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_itemIcon_int(long __this__nativeId, int index);

/**
Returns the text of the item at position <tt>index</tt>, or an empty string if <tt>index</tt> is out of range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBox#setItemText(int, java.lang.String) setItemText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String itemText(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemText_int(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_itemText_int(long __this__nativeId, int index);

/**
Returns the tooltip of the item at position <tt>index</tt>, or an empty string if <tt>index</tt> is out of range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBox#setItemToolTip(int, java.lang.String) setItemToolTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String itemToolTip(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemToolTip_int(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_itemToolTip_int(long __this__nativeId, int index);

/**
Removes the item at position <tt>index</tt> from the toolbox. Note that the widget is not deleted.
*/

    @QtBlockedSlot
    public final void removeItem(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeItem_int(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_removeItem_int(long __this__nativeId, int index);

/**
This property holds the index of the current item. By default, for an empty toolbox, this property has a value of -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBox#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}, and {@link com.trolltech.qt.gui.QToolBox#widget(int) widget()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="currentIndex")
    public final void setCurrentIndex(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentIndex_int(nativeId(), index);
    }
    native void __qt_setCurrentIndex_int(long __this__nativeId, int index);

/**
Makes<tt>widget</tt> the current widget. The <tt>widget</tt> must be an item in this tool box. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBox#addItem(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) addItem()}, {@link com.trolltech.qt.gui.QToolBox#setCurrentIndex(int) setCurrentIndex()}, and {@link com.trolltech.qt.gui.QToolBox#currentWidget() currentWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public final void setCurrentWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    native void __qt_setCurrentWidget_QWidget(long __this__nativeId, long widget);

/**
If <tt>enabled</tt> is true then the item at position <tt>index</tt> is enabled; otherwise the item at position <tt>index</tt> is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBox#isItemEnabled(int) isItemEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemEnabled(int index, boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemEnabled_int_boolean(nativeId(), index, enabled);
    }
    @QtBlockedSlot
    native void __qt_setItemEnabled_int_boolean(long __this__nativeId, int index, boolean enabled);

/**
Sets the icon of the item at position <tt>index</tt> to <tt>icon</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBox#itemIcon(int) itemIcon()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemIcon(int index, com.trolltech.qt.gui.QIcon icon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemIcon_int_QIcon(nativeId(), index, icon == null ? 0 : icon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItemIcon_int_QIcon(long __this__nativeId, int index, long icon);

/**
Sets the text of the item at position <tt>index</tt> to <tt>text</tt>. <p>If the provided text contains an ampersand character ('&'), a mnemonic is automatically created for it. The character that follows the '&' will be used as the shortcut key. Any previous mnemonic will be overwritten, or cleared if no mnemonic is defined by the text. See the {@link com.trolltech.qt.gui.QShortcut QShortcut} documentation for details (to display an actual ampersand, use '&&'). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBox#itemText(int) itemText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemText(int index, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemText_int_String(nativeId(), index, text);
    }
    @QtBlockedSlot
    native void __qt_setItemText_int_String(long __this__nativeId, int index, java.lang.String text);

/**
Sets the tooltip of the item at position <tt>index</tt> to <tt>toolTip</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBox#itemToolTip(int) itemToolTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemToolTip(int index, java.lang.String toolTip)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemToolTip_int_String(nativeId(), index, toolTip);
    }
    @QtBlockedSlot
    native void __qt_setItemToolTip_int_String(long __this__nativeId, int index, java.lang.String toolTip);

/**
Returns the widget at position <tt>index</tt>, or 0 if there is no such item.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget widget(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widget_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widget_int(long __this__nativeId, int index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

/**
This virtual handler is called after a new item was added or inserted at position <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBox#itemRemoved(int) itemRemoved()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void itemInserted(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemInserted_int(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_itemInserted_int(long __this__nativeId, int index);

/**
This virtual handler is called after an item was removed from position <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolBox#itemInserted(int) itemInserted()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void itemRemoved(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemRemoved_int(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_itemRemoved_int(long __this__nativeId, int index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void showEvent(com.trolltech.qt.gui.QShowEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showEvent_QShowEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_showEvent_QShowEvent(long __this__nativeId, long e);

/**
@exclude
*/

    public static native QToolBox fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QToolBox(QPrivateConstructor p) { super(p); } 
}
