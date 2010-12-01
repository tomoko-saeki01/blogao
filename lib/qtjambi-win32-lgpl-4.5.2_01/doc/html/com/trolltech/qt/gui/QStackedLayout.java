package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStackedLayout class provides a stack of widgets where only one widget is visible at a time. QStackedLayout can be used to create a user interface similar to the one provided by {@link com.trolltech.qt.gui.QTabWidget QTabWidget}. There is also a convenience {@link com.trolltech.qt.gui.QStackedWidget QStackedWidget} class built on top of QStackedLayout. <p>A QStackedLayout can be populated with a number of child widgets ("pages"). For example: <pre class="snippet">
        QWidget firstPageWidget = new QWidget();
        QWidget secondPageWidget = new QWidget();
        QWidget thirdPageWidget = new QWidget();

        QStackedLayout stackedLayout = new QStackedLayout();
        stackedLayout.addWidget(firstPageWidget);
        stackedLayout.addWidget(secondPageWidget);
        stackedLayout.addWidget(thirdPageWidget);

<br>
        QVBoxLayout mainLayout = new QVBoxLayout();

        mainLayout.addLayout(stackedLayout);
        setLayout(mainLayout);
</pre> QStackedLayout provides no intrinsic means for the user to switch page. This is typically done through a {@link com.trolltech.qt.gui.QComboBox QComboBox} or a {@link com.trolltech.qt.gui.QListWidget QListWidget} that stores the titles of the QStackedLayout's pages. For example: <pre class="snippet">
        QComboBox pageComboBox = new QComboBox();
        pageComboBox.addItem(tr("Page 1"));
        pageComboBox.addItem(tr("Page 2"));
        pageComboBox.addItem(tr("Page 3"));
        pageComboBox.activated.connect(stackedLayout, "setCurrentIndex(int)");
</pre> When populating a layout, the widgets are added to an internal list. The {@link com.trolltech.qt.gui.QLayout#indexOf(com.trolltech.qt.gui.QWidget) indexOf()} function returns the index of a widget in that list. The widgets can either be added to the end of the list using the addWidget() function, or inserted at a given index using the {@link com.trolltech.qt.gui.QStackedLayout#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()} function. The {@link com.trolltech.qt.gui.QLayout#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()} function removes the widget at the given index from the layout. The number of widgets contained in the layout, can be obtained using the count() function. <p>The {@link com.trolltech.qt.gui.QStackedLayout#widget(int) widget()} function returns the widget at a given index position. The index of the widget that is shown on screen is given by {@link com.trolltech.qt.gui.QStackedLayout#currentIndex() currentIndex()} and can be changed using {@link com.trolltech.qt.gui.QStackedLayout#setCurrentIndex(int) setCurrentIndex()}. In a similar manner, the currently shown widget can be retrieved using the {@link com.trolltech.qt.gui.QStackedLayout#currentWidget() currentWidget()} function, and altered using the {@link com.trolltech.qt.gui.QStackedLayout#setCurrentWidget(com.trolltech.qt.gui.QWidget) setCurrentWidget()} function. <p>Whenever the current widget in the layout changes or a widget is removed from the layout, the {@link com.trolltech.qt.gui.QStackedLayout#currentChanged currentChanged() } and {@link com.trolltech.qt.gui.QStackedLayout#widgetRemoved widgetRemoved() } signals are emitted respectively. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget QStackedWidget}, and {@link com.trolltech.qt.gui.QTabWidget QTabWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStackedLayout extends com.trolltech.qt.gui.QLayout
{
/**
This enum specifies how the layout handles its child widgets regarding their visibility.
*/

    public enum StackingMode implements com.trolltech.qt.QtEnumerator {
/**
 Only the current widget is visible. This is the default.
*/

        StackOne(0),
/**
 All widgets are visible. The current widget is merely raised.
*/

        StackAll(1);

        StackingMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStackedLayout$StackingMode constant with the specified <tt>int</tt>.</brief>
*/

        public static StackingMode resolve(int value) {
            return (StackingMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return StackOne;
            case 1: return StackAll;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: index)&gt;:<p> This signal is emitted whenever the current widget in the layout changes. The <tt>index</tt> specifies the index of the new current widget, or -1 if there isn't a new one (for example, if there are no widgets in the QStackedLayout) <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedLayout#currentWidget() currentWidget()}, and {@link com.trolltech.qt.gui.QStackedLayout#setCurrentWidget(com.trolltech.qt.gui.QWidget) setCurrentWidget()}. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: index)&gt;:<p> This signal is emitted whenever a widget is removed from the layout. The widget's <tt>index</tt> is passed as parameter. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> widgetRemoved = new Signal1<java.lang.Integer>();

    private final void widgetRemoved(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_widgetRemoved_int(nativeId(), index);
    }
    native void __qt_widgetRemoved_int(long __this__nativeId, int index);

/**
Constructs a QStackedLayout with no parent. <p>This QStackedLayout must be installed on a widget later on to become effective. <p><DT><b>See also:</b><br><DD>addWidget(), and {@link com.trolltech.qt.gui.QStackedLayout#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()}. <br></DD></DT>
*/

    public QStackedLayout(){
        super((QPrivateConstructor)null);
        __qt_QStackedLayout();
    }

    native void __qt_QStackedLayout();

/**
Constructs a new QStackedLayout and inserts it into the given <tt>parentLayout</tt>.
*/

    public QStackedLayout(com.trolltech.qt.gui.QLayout parentLayout){
        super((QPrivateConstructor)null);
        __qt_QStackedLayout_QLayout(parentLayout == null ? 0 : parentLayout.nativeId());
    }

    native void __qt_QStackedLayout_QLayout(long parentLayout);

/**
Constructs a new QStackedLayout with the given <tt>parent</tt>. <p>This layout will install itself on the <tt>parent</tt> widget and manage the geometry of its children.
*/

    public QStackedLayout(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QStackedLayout_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QStackedLayout_QWidget(long parent);

/**
Adds the given <tt>widget</tt> to the end of this layout and returns the index position of the <tt>widget</tt>. <p>If the QStackedLayout is empty before this function is called, the given <tt>widget</tt> becomes the current widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedLayout#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()}, {@link com.trolltech.qt.gui.QLayout#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}, and {@link com.trolltech.qt.gui.QStackedLayout#setCurrentWidget(com.trolltech.qt.gui.QWidget) setCurrentWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int addStackedWidget(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (w == null)
            throw new NullPointerException("Argument 'w': null not expected.");
        java.util.Collection<Object> __rcTmp = (java.util.Collection<Object>)com.trolltech.qt.GeneratorUtilities.fetchField(this,
                                                                         QLayout.class,
                                                                         "__rcWidgets");
        if (w != null) {
            __rcTmp.add(w);
        }
        return __qt_addStackedWidget_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_addStackedWidget_QWidget(long __this__nativeId, long w);

/**
This property holds the index position of the widget that is visible. The current index is -1 if there is no current widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedLayout#currentWidget() currentWidget()}, and {@link com.trolltech.qt.gui.QLayout#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}. <br></DD></DT>
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
Returns the current widget, or 0 if there are no widgets in this layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedLayout#currentIndex() currentIndex()}, and {@link com.trolltech.qt.gui.QStackedLayout#setCurrentWidget(com.trolltech.qt.gui.QWidget) setCurrentWidget()}. <br></DD></DT>
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
Inserts the given <tt>widget</tt> at the given <tt>index</tt> in this QStackedLayout. If <tt>index</tt> is out of range, the widget is appended (in which case it is the actual index of the <tt>widget</tt> that is returned). <p>If the QStackedLayout is empty before this function is called, the given <tt>widget</tt> becomes the current widget. <p>Inserting a new widget at an index less than or equal to the current index will increment the current index, but keep the current widget. <p><DT><b>See also:</b><br><DD>addWidget(), {@link com.trolltech.qt.gui.QLayout#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}, and {@link com.trolltech.qt.gui.QStackedLayout#setCurrentWidget(com.trolltech.qt.gui.QWidget) setCurrentWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int insertWidget(int index, com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (w == null)
            throw new NullPointerException("Argument 'w': null not expected.");
        java.util.Collection<Object> __rcTmp = (java.util.Collection<Object>)com.trolltech.qt.GeneratorUtilities.fetchField(this,
                                                                         QLayout.class,
                                                                         "__rcWidgets");
        if (w != null) {
            __rcTmp.add(w);
        }
        return __qt_insertWidget_int_QWidget(nativeId(), index, w == null ? 0 : w.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_insertWidget_int_QWidget(long __this__nativeId, int index, long w);

/**
This property holds the index position of the widget that is visible. The current index is -1 if there is no current widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedLayout#currentWidget() currentWidget()}, and {@link com.trolltech.qt.gui.QLayout#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}. <br></DD></DT>
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
Sets the current widget to be the specified <tt>widget</tt>. The new current widget must already be contained in this stacked layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedLayout#setCurrentIndex(int) setCurrentIndex()}, and {@link com.trolltech.qt.gui.QStackedLayout#currentWidget() currentWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public final void setCurrentWidget(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentWidget_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @SuppressWarnings("unchecked")
    native void __qt_setCurrentWidget_QWidget(long __this__nativeId, long w);

/**
This property determines the way visibility of child widgets are handled.  The default value is {@link com.trolltech.qt.gui.QStackedLayout.StackingMode StackOne }. Setting the property to {@link com.trolltech.qt.gui.QStackedLayout.StackingMode StackAll } allows you to make use of the layout for overlay widgets that do additional drawing on top of other widgets, for example, graphical editors.
*/

    @com.trolltech.qt.QtPropertyWriter(name="stackingMode")
    @QtBlockedSlot
    public final void setStackingMode(com.trolltech.qt.gui.QStackedLayout.StackingMode stackingMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStackingMode_StackingMode(nativeId(), stackingMode.value());
    }
    @QtBlockedSlot
    native void __qt_setStackingMode_StackingMode(long __this__nativeId, int stackingMode);

/**
This property determines the way visibility of child widgets are handled.  The default value is {@link com.trolltech.qt.gui.QStackedLayout.StackingMode StackOne }. Setting the property to {@link com.trolltech.qt.gui.QStackedLayout.StackingMode StackAll } allows you to make use of the layout for overlay widgets that do additional drawing on top of other widgets, for example, graphical editors.
*/

    @com.trolltech.qt.QtPropertyReader(name="stackingMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStackedLayout.StackingMode stackingMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStackedLayout.StackingMode.resolve(__qt_stackingMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_stackingMode(long __this__nativeId);

/**
Returns the widget at the given <tt>index</tt>, or 0 if there is no widget at the given position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedLayout#currentWidget() currentWidget()}, and {@link com.trolltech.qt.gui.QLayout#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget widget(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widget_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widget_int(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void addItem(com.trolltech.qt.gui.QLayoutItemInterface item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addItem_QLayoutItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addItem_QLayoutItem(long __this__nativeId, long item);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int count()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QLayoutItemInterface itemAt(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        com.trolltech.qt.gui.QLayoutItemInterface __qt_return_value = __qt_itemAt_int(nativeId(), arg__1);
        if (__qt_return_value != null) {
            __qt_return_value.disableGarbageCollection();
        }
        return __qt_return_value;
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayoutItemInterface __qt_itemAt_int(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize minimumSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_minimumSize(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setGeometry(com.trolltech.qt.core.QRect rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGeometry_QRect(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setGeometry_QRect(long __this__nativeId, long rect);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize sizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QLayoutItemInterface takeAt(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_takeAt_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayoutItemInterface __qt_takeAt_int(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QWidget widget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widget(long __this__nativeId);

/**
@exclude
*/

    public static native QStackedLayout fromNativePointer(QNativePointer nativePointer);

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

    protected QStackedLayout(QPrivateConstructor p) { super(p); } 
}
