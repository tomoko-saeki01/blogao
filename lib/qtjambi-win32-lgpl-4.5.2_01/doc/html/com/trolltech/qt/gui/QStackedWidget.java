package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStackedWidget class provides a stack of widgets where only one widget is visible at a time. QStackedWidget can be used to create a user interface similar to the one provided by {@link com.trolltech.qt.gui.QTabWidget QTabWidget}. It is a convenience layout widget built on top of the {@link com.trolltech.qt.gui.QStackedLayout QStackedLayout} class. <p>Like {@link com.trolltech.qt.gui.QStackedLayout QStackedLayout}, QStackedWidget can be constructed and populated with a number of child widgets ("pages"): <pre class="snippet">
        QWidget firstPageWidget = new QWidget();
        QWidget secondPageWidget = new QWidget();
        QWidget thirdPageWidget = new QWidget();

        QStackedWidget stackedWidget = new QStackedWidget();
        stackedWidget.addWidget(firstPageWidget);
        stackedWidget.addWidget(secondPageWidget);
        stackedWidget.addWidget(thirdPageWidget);


        QVBoxLayout layout = new QVBoxLayout();

        layout.addWidget(stackedWidget);
        setLayout(layout);
</pre> QStackedWidget provides no intrinsic means for the user to switch page. This is typically done through a {@link com.trolltech.qt.gui.QComboBox QComboBox} or a {@link com.trolltech.qt.gui.QListWidget QListWidget} that stores the titles of the QStackedWidget's pages. For example: <pre class="snippet">
        QComboBox pageComboBox = new QComboBox();
        pageComboBox.addItem(tr("Page 1"));
        pageComboBox.addItem(tr("Page 2"));
        pageComboBox.addItem(tr("Page 3"));
        pageComboBox.activated.connect(stackedWidget, "setCurrentIndex(int)");
</pre> When populating a stacked widget, the widgets are added to an internal list. The {@link com.trolltech.qt.gui.QStackedWidget#indexOf(com.trolltech.qt.gui.QWidget) indexOf()} function returns the index of a widget in that list. The widgets can either be added to the end of the list using the {@link com.trolltech.qt.gui.QStackedWidget#addWidget(com.trolltech.qt.gui.QWidget) addWidget()} function, or inserted at a given index using the {@link com.trolltech.qt.gui.QStackedWidget#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()} function. The {@link com.trolltech.qt.gui.QStackedWidget#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()} function removes a widget from the stacked widget. The number of widgets contained in the stacked widget, can be obtained using the {@link com.trolltech.qt.gui.QStackedWidget#count() count()} function. <p>The {@link com.trolltech.qt.gui.QStackedWidget#widget(int) widget()} function returns the widget at a given index position. The index of the widget that is shown on screen is given by {@link com.trolltech.qt.gui.QStackedWidget#currentIndex() currentIndex()} and can be changed using {@link com.trolltech.qt.gui.QStackedWidget#setCurrentIndex(int) setCurrentIndex()}. In a similar manner, the currently shown widget can be retrieved using the {@link com.trolltech.qt.gui.QStackedWidget#currentWidget() currentWidget()} function, and altered using the {@link com.trolltech.qt.gui.QStackedWidget#setCurrentWidget(com.trolltech.qt.gui.QWidget) setCurrentWidget()} function. <p>Whenever the current widget in the stacked widget changes or a widget is removed from the stacked widget, the {@link com.trolltech.qt.gui.QStackedWidget#currentChanged currentChanged() } and {@link com.trolltech.qt.gui.QStackedWidget#widgetRemoved widgetRemoved() } signals are emitted respectively. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedLayout QStackedLayout}, {@link com.trolltech.qt.gui.QTabWidget QTabWidget}, and {@link <a href="../qtjambi-configdialog.html">Config Dialog Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStackedWidget extends com.trolltech.qt.gui.QFrame
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: index)&gt;:<p> This signal is emitted whenever the current widget changes. <p>The parameter holds the <tt>index</tt> of the new current widget, or -1 if there isn't a new one (for example, if there are no widgets in the QStackedWidget). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#currentWidget() currentWidget()}, and {@link com.trolltech.qt.gui.QStackedWidget#setCurrentWidget(com.trolltech.qt.gui.QWidget) setCurrentWidget()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> currentChanged = new Signal1<java.lang.Integer>();

    private final void currentChanged(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentChanged_int(nativeId(), arg__1);
    }
    native void __qt_currentChanged_int(long __this__nativeId, int arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: index)&gt;:<p> This signal is emitted whenever a widget is removed. The widget's <tt>index</tt> is passed as parameter. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}. <br></DD></DT>
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
Constructs a QStackedWidget with the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}, and {@link com.trolltech.qt.gui.QStackedWidget#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()}. <br></DD></DT>
*/

    public QStackedWidget() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a QStackedWidget with the given <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}, and {@link com.trolltech.qt.gui.QStackedWidget#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()}. <br></DD></DT>
*/

    public QStackedWidget(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QStackedWidget_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QStackedWidget_QWidget(long parent);

/**
Appends the given <tt>widget</tt> to the QStackedWidget and returns the index position. Ownership of <tt>widget</tt> is passed on to the QStackedWidget. <p>If the QStackedWidget is empty before this function is called, <tt>widget</tt> becomes the current widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()}, {@link com.trolltech.qt.gui.QStackedWidget#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}, and {@link com.trolltech.qt.gui.QStackedWidget#setCurrentWidget(com.trolltech.qt.gui.QWidget) setCurrentWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int addWidget(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addWidget_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_addWidget_QWidget(long __this__nativeId, long w);

/**
This property holds the number of widgets contained by this stacked widget. By default, this property contains a value of 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#currentIndex() currentIndex()}, and {@link com.trolltech.qt.gui.QStackedWidget#widget(int) widget()}. <br></DD></DT>
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
This property holds the index position of the widget that is visible. The current index is -1 if there is no current widget. <p>By default, this property contains a value of -1 because the stack is initially empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#currentWidget() currentWidget()}, and {@link com.trolltech.qt.gui.QStackedWidget#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}. <br></DD></DT>
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
Returns the current widget, or 0 if there are no child widgets. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#currentIndex() currentIndex()}, and {@link com.trolltech.qt.gui.QStackedWidget#setCurrentWidget(com.trolltech.qt.gui.QWidget) setCurrentWidget()}. <br></DD></DT>
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
Returns the index of the given <tt>widget</tt>, or -1 if the given <tt>widget</tt> is not a child of the QStackedWidget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#currentIndex() currentIndex()}, and {@link com.trolltech.qt.gui.QStackedWidget#widget(int) widget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.gui.QWidget arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOf_QWidget(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native int __qt_indexOf_QWidget(long __this__nativeId, long arg__1);

/**
Inserts the given <tt>widget</tt> at the given <tt>index</tt> in the QStackedWidget. Ownership of <tt>widget</tt> is passed on to the QStackedWidget. If <tt>index</tt> is out of range, the <tt>widget</tt> is appended (in which case it is the actual index of the <tt>widget</tt> that is returned). <p>If the QStackedWidget was empty before this function is called, the given <tt>widget</tt> becomes the current widget. <p>Inserting a new widget at an index less than or equal to the current index will increment the current index, but keep the current widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}, {@link com.trolltech.qt.gui.QStackedWidget#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}, and {@link com.trolltech.qt.gui.QStackedWidget#setCurrentWidget(com.trolltech.qt.gui.QWidget) setCurrentWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int insertWidget(int index, com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertWidget_int_QWidget(nativeId(), index, w == null ? 0 : w.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_insertWidget_int_QWidget(long __this__nativeId, int index, long w);

/**
Removes the given <tt>widget</tt> from the QStackedWidget. The widget is not deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}, {@link com.trolltech.qt.gui.QStackedWidget#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()}, and {@link com.trolltech.qt.gui.QStackedWidget#currentWidget() currentWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeWidget(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeWidget_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeWidget_QWidget(long __this__nativeId, long w);

/**
This property holds the index position of the widget that is visible. The current index is -1 if there is no current widget. <p>By default, this property contains a value of -1 because the stack is initially empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#currentWidget() currentWidget()}, and {@link com.trolltech.qt.gui.QStackedWidget#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}. <br></DD></DT>
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
Sets the current widget to be the specified <tt>widget</tt>. The new current widget must already be contained in this stacked widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#currentWidget() currentWidget()}, and {@link com.trolltech.qt.gui.QStackedWidget#setCurrentIndex(int) setCurrentIndex()}. <br></DD></DT>
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
Returns the widget at the given <tt>index</tt>, or 0 if there is no such widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStackedWidget#currentWidget() currentWidget()}, and {@link com.trolltech.qt.gui.QStackedWidget#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}. <br></DD></DT>
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
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

/**
@exclude
*/

    public static native QStackedWidget fromNativePointer(QNativePointer nativePointer);

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

    protected QStackedWidget(QPrivateConstructor p) { super(p); } 
}
