package com.trolltech.qt.gui;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QSplitter class implements a splitter widget. A splitter lets the user control the size of child widgets by dragging the boundary between the children. Any number of widgets may be controlled by a single splitter. The typical use of a QSplitter is to create several widgets and add them using {@link com.trolltech.qt.gui.QSplitter#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()} or {@link com.trolltech.qt.gui.QSplitter#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}. <p>The following example will show a {@link com.trolltech.qt.gui.QListView QListView}, {@link com.trolltech.qt.gui.QTreeView QTreeView}, and {@link com.trolltech.qt.gui.QTextEdit QTextEdit} side by side, with two splitter handles: <pre class="snippet">
        QSplitter splitter = new QSplitter(parent);
        QListView listview = new QListView();
        QTreeView treeview = new QTreeView();
        QTextEdit textedit = new QTextEdit();
        splitter.addWidget(listview);
        splitter.addWidget(treeview);
        splitter.addWidget(textedit);
    </pre> If a widget is already inside a QSplitter when {@link com.trolltech.qt.gui.QSplitter#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()} or {@link com.trolltech.qt.gui.QSplitter#addWidget(com.trolltech.qt.gui.QWidget) addWidget()} is called, it will move to the new position. This can be used to reorder widgets in the splitter later. You can use {@link com.trolltech.qt.gui.QSplitter#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}, {@link com.trolltech.qt.gui.QSplitter#widget(int) widget()}, and {@link com.trolltech.qt.gui.QSplitter#count() count()} to get access to the widgets inside the splitter. <p>A default QSplitter lays out its children horizontally (side by side); you can use setOrientation({@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical }) to lay its children out vertically. <p>By default, all widgets can be as large or as small as the user wishes, between the minimumSizeHint() (or minimumSize()) and maximumSize() of the widgets. <p>QSplitter resizes its children dynamically by default. If you would rather have QSplitter resize the children only at the end of a resize operation, call setOpaqueResize(false). <p>The initial distribution of size between the widgets is determined by multiplying the initial size with the stretch factor. You can also use {@link com.trolltech.qt.gui.QSplitter#setSizes(java.util.List) setSizes()} to set the sizes of all the widgets. The function {@link com.trolltech.qt.gui.QSplitter#sizes() sizes()} returns the sizes set by the user. Alternatively, you can save and restore the sizes of the widgets from a {@link com.trolltech.qt.core.QByteArray QByteArray} using {@link com.trolltech.qt.gui.QSplitter#saveState() saveState()} and {@link com.trolltech.qt.gui.QSplitter#restoreState(com.trolltech.qt.core.QByteArray) restoreState()} respectively. <p>When you {@link com.trolltech.qt.gui.QWidget#hide() hide()} a child its space will be distributed among the other children. It will be reinstated when you {@link com.trolltech.qt.gui.QWidget#show() show()} it again. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitterHandle QSplitterHandle}, {@link com.trolltech.qt.gui.QHBoxLayout QHBoxLayout}, {@link com.trolltech.qt.gui.QVBoxLayout QVBoxLayout}, and {@link com.trolltech.qt.gui.QTabWidget QTabWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSplitter extends com.trolltech.qt.gui.QFrame
{
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: pos), java.lang.Integer(named: index)&gt;:<p> This signal is emitted when the splitter handle at a particular <tt>index</tt> has been moved to position <tt>pos</tt>. <p>For right-to-left languages such as Arabic and Hebrew, the layout of horizontal splitters is reversed. <tt>pos</tt> is then the distance from the right edge of the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#moveSplitter(int, int) moveSplitter()}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> splitterMoved = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void splitterMoved(int pos, int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_splitterMoved_int_int(nativeId(), pos, index);
    }
    native void __qt_splitterMoved_int_int(long __this__nativeId, int pos, int index);


/**
Constructs a horizontal splitter with the <tt>parent</tt> arguments is passed on to the {@link com.trolltech.qt.gui.QFrame QFrame} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#setOrientation(com.trolltech.qt.core.Qt.Orientation) setOrientation()}. <br></DD></DT>
*/

    public QSplitter() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a horizontal splitter with the <tt>parent</tt> arguments is passed on to the {@link com.trolltech.qt.gui.QFrame QFrame} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#setOrientation(com.trolltech.qt.core.Qt.Orientation) setOrientation()}. <br></DD></DT>
*/

    public QSplitter(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QSplitter_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSplitter_QWidget(long parent);


/**
Constructs a splitter with the given <tt>orientation</tt> and <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#setOrientation(com.trolltech.qt.core.Qt.Orientation) setOrientation()}. <br></DD></DT>
*/

    public QSplitter(com.trolltech.qt.core.Qt.Orientation arg__1) {
        this(arg__1, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a splitter with the given <tt>orientation</tt> and <tt>parent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#setOrientation(com.trolltech.qt.core.Qt.Orientation) setOrientation()}. <br></DD></DT>
*/

    public QSplitter(com.trolltech.qt.core.Qt.Orientation arg__1, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QSplitter_Orientation_QWidget(arg__1.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSplitter_Orientation_QWidget(int arg__1, long parent);

/**
Adds the given <tt>widget</tt> to the splitter's layout after all the other items. <p>If <tt>widget</tt> is already in the splitter, it will be moved to the new position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()}, {@link com.trolltech.qt.gui.QSplitter#widget(int) widget()}, and {@link com.trolltech.qt.gui.QSplitter#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addWidget_QWidget(long __this__nativeId, long widget);

/**
This property holds whether child widgets can be resized down to size 0 by the user. By default, children are collapsible. It is possible to enable and disable the collapsing of individual children using {@link com.trolltech.qt.gui.QSplitter#setCollapsible(int, boolean) setCollapsible()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#setCollapsible(int, boolean) setCollapsible()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="childrenCollapsible")
    @QtBlockedSlot
    public final boolean childrenCollapsible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childrenCollapsible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_childrenCollapsible(long __this__nativeId);

/**
Returns the closest legal position to <tt>pos</tt> of the widget with index <tt>index</tt>. <p>For right-to-left languages such as Arabic and Hebrew, the layout of horizontal splitters is reversed. Positions are then measured from the right edge of the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#getRange(int) getRange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final int closestLegalPosition(int arg__1, int arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_closestLegalPosition_int_int(nativeId(), arg__1, arg__2);
    }
    @QtBlockedSlot
    native int __qt_closestLegalPosition_int_int(long __this__nativeId, int arg__1, int arg__2);

/**
Returns the number of widgets contained in the splitter's layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#widget(int) widget()}, and {@link com.trolltech.qt.gui.QSplitter#handle(int) handle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int count()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

    @QtBlockedSlot
    private final void getRange(int index, com.trolltech.qt.QNativePointer arg__2, com.trolltech.qt.QNativePointer arg__3)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_getRange_int_nativepointer_nativepointer(nativeId(), index, arg__2, arg__3);
    }
    @QtBlockedSlot
    native void __qt_getRange_int_nativepointer_nativepointer(long __this__nativeId, int index, com.trolltech.qt.QNativePointer arg__2, com.trolltech.qt.QNativePointer arg__3);

/**
Returns the handle to the left (or above) for the item in the splitter's layout at the given <tt>index</tt>. The handle at index 0 is always hidden. <p>For right-to-left languages such as Arabic and Hebrew, the layout of horizontal splitters is reversed. The handle will be to the right of the widget at <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#count() count()}, {@link com.trolltech.qt.gui.QSplitter#widget(int) widget()}, {@link com.trolltech.qt.gui.QSplitter#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}, {@link com.trolltech.qt.gui.QSplitter#createHandle() createHandle()}, and {@link com.trolltech.qt.gui.QSplitter#setHandleWidth(int) setHandleWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QSplitterHandle handle(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handle_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QSplitterHandle __qt_handle_int(long __this__nativeId, int index);

/**
This property holds the width of the splitter handles. By default, this property contains a value that depends on the user's platform and style preferences.
*/

    @com.trolltech.qt.QtPropertyReader(name="handleWidth")
    @QtBlockedSlot
    public final int handleWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handleWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_handleWidth(long __this__nativeId);

/**
Returns the index in the splitter's layout of the specified <tt>widget</tt>. This also works for handles. <p>Handles are numbered from 0. There are as many handles as there are child widgets, but the handle at position 0 is always hidden. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#count() count()}, and {@link com.trolltech.qt.gui.QSplitter#widget(int) widget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOf_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @QtBlockedSlot
    native int __qt_indexOf_QWidget(long __this__nativeId, long w);

/**
Inserts the <tt>widget</tt> specified into the splitter's layout at the given <tt>index</tt>. <p>If <tt>widget</tt> is already in the splitter, it will be moved to the new position. <p>if <tt>index</tt> is an invalid index, then the widget will be inserted at the end. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}, {@link com.trolltech.qt.gui.QSplitter#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}, and {@link com.trolltech.qt.gui.QSplitter#widget(int) widget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertWidget(int index, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertWidget_int_QWidget(nativeId(), index, widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertWidget_int_QWidget(long __this__nativeId, int index, long widget);

/**
Returns true if the widget at <tt>index</tt> is collapsible, otherwise returns false
*/

    @QtBlockedSlot
    public final boolean isCollapsible(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCollapsible_int(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_isCollapsible_int(long __this__nativeId, int index);

/**
Moves the left or top edge of the splitter handle at <tt>index</tt> as close as possible to position <tt>pos</tt>, which is the distance from the left or top edge of the widget. <p>For right-to-left languages such as Arabic and Hebrew, the layout of horizontal splitters is reversed. <tt>pos</tt> is then the distance from the right edge of the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#splitterMoved splitterMoved() }, {@link com.trolltech.qt.gui.QSplitter#closestLegalPosition(int, int) closestLegalPosition()}, and {@link com.trolltech.qt.gui.QSplitter#getRange(int) getRange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void moveSplitter(int pos, int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveSplitter_int_int(nativeId(), pos, index);
    }
    @QtBlockedSlot
    native void __qt_moveSplitter_int_int(long __this__nativeId, int pos, int index);

/**
This property holds whether resizing is opaque. Opaque resizing is on by default.
*/

    @com.trolltech.qt.QtPropertyReader(name="opaqueResize")
    @QtBlockedSlot
    public final boolean opaqueResize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_opaqueResize(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_opaqueResize(long __this__nativeId);

/**
<brief>Writes thisQSplitter
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QTextStream arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QTextStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QTextStream(long __this__nativeId, long arg__1);

/**
<brief>Reads a QSplitter
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QTextStream arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QTextStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QTextStream(long __this__nativeId, long arg__1);

/**
This property holds the orientation of the splitter. By default the orientation is horizontal (i.e., the widgets are laid out side by side). The possible orientations are {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } and {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitterHandle#orientation() QSplitterHandle::orientation()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="orientation")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientation orientation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
Updates the splitter's state. You should not need to call this function.
*/

    @QtBlockedSlot
    public final void refresh()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_refresh(nativeId());
    }
    @QtBlockedSlot
    native void __qt_refresh(long __this__nativeId);

/**
Restores the splitter's layout to the <tt>state</tt> specified. Returns true if the state is restored; otherwise returns false. <p>Typically this is used in conjunction with {@link com.trolltech.qt.core.QSettings QSettings} to restore the size from a past session. Here is an example: <p>Restore the splitters's state: <pre class="snippet">
        QSettings settings = new QSettings();
        splitter.restoreState((QByteArray) settings.value("splitterSizes"));
    </pre> A failure to restore the splitter's layout may result from either invalid or out-of-date data in the supplied byte array. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#saveState() saveState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean restoreState(com.trolltech.qt.core.QByteArray state)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_restoreState_QByteArray(nativeId(), state == null ? 0 : state.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_restoreState_QByteArray(long __this__nativeId, long state);

/**
Saves the state of the splitter's layout. <p>Typically this is used in conjunction with {@link com.trolltech.qt.core.QSettings QSettings} to remember the size for a future session. A version number is stored as part of the data. Here is an example: <pre class="snippet">
        QSettings settings = new QSettings();
        settings.setValue("splitterSizes", splitter.saveState());
    </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#restoreState(com.trolltech.qt.core.QByteArray) restoreState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray saveState()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_saveState(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_saveState(long __this__nativeId);

/**
This property holds whether child widgets can be resized down to size 0 by the user. By default, children are collapsible. It is possible to enable and disable the collapsing of individual children using {@link com.trolltech.qt.gui.QSplitter#setCollapsible(int, boolean) setCollapsible()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#setCollapsible(int, boolean) setCollapsible()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="childrenCollapsible")
    @QtBlockedSlot
    public final void setChildrenCollapsible(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setChildrenCollapsible_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setChildrenCollapsible_boolean(long __this__nativeId, boolean arg__1);

/**
Sets whether the child widget at index <tt>index</tt> is collapsible to <tt>collapse</tt>. <p>By default, children are collapsible, meaning that the user can resize them down to size 0, even if they have a non-zero minimumSize() or minimumSizeHint(). This behavior can be changed on a per-widget basis by calling this function, or globally for all the widgets in the splitter by setting the {@link QSplitter#childrenCollapsible() childrenCollapsible} property. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#isCollapsible(int) isCollapsible()}, and {@link QSplitter#childrenCollapsible() childrenCollapsible}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCollapsible(int index, boolean arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCollapsible_int_boolean(nativeId(), index, arg__2);
    }
    @QtBlockedSlot
    native void __qt_setCollapsible_int_boolean(long __this__nativeId, int index, boolean arg__2);

/**
This property holds the width of the splitter handles. By default, this property contains a value that depends on the user's platform and style preferences.
*/

    @com.trolltech.qt.QtPropertyWriter(name="handleWidth")
    @QtBlockedSlot
    public final void setHandleWidth(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHandleWidth_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setHandleWidth_int(long __this__nativeId, int arg__1);


/**
This property holds whether resizing is opaque. Opaque resizing is on by default.
*/

    @QtBlockedSlot
    public final void setOpaqueResize() {
        setOpaqueResize((boolean)true);
    }
/**
This property holds whether resizing is opaque. Opaque resizing is on by default.
*/

    @com.trolltech.qt.QtPropertyWriter(name="opaqueResize")
    @QtBlockedSlot
    public final void setOpaqueResize(boolean opaque)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOpaqueResize_boolean(nativeId(), opaque);
    }
    @QtBlockedSlot
    native void __qt_setOpaqueResize_boolean(long __this__nativeId, boolean opaque);

/**
This property holds the orientation of the splitter. By default the orientation is horizontal (i.e., the widgets are laid out side by side). The possible orientations are {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } and {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitterHandle#orientation() QSplitterHandle::orientation()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="orientation")
    @QtBlockedSlot
    public final void setOrientation(com.trolltech.qt.core.Qt.Orientation arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setOrientation_Orientation(long __this__nativeId, int arg__1);

/**
Displays a rubber band at position <tt>pos</tt>. If <tt>pos</tt> is negative, the rubber band is removed.
*/

    @QtBlockedSlot
    protected final void setRubberBand(int position)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRubberBand_int(nativeId(), position);
    }
    @QtBlockedSlot
    native void __qt_setRubberBand_int(long __this__nativeId, int position);

/**
Sets the child widgets respective sizes to the values given in the <tt>list</tt>. <p>If the splitter is horizontal, the values set the widths of each widget in pixels, from left to right. If the splitter is vertical, the heights of each widget is set, from top to bottom. <p>Extra values in the <tt>list</tt> are ignored. If <tt>list</tt> contains too few values, the result is undefined but the program will still be well-behaved. <p>The overall size of the splitter widget is not affected. Instead, any additional/missing space is distributed amongst the widgets according to the relative weight of the sizes. <p>If you specify a size of 0, the widget will be invisible. The size policies of the widgets are preserved. That is, a value smaller then the minimal size hint of the respective widget will be replaced by the value of the hint. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#sizes() sizes()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSizes(java.util.List<java.lang.Integer> list)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizes_List(nativeId(), list);
    }
    @QtBlockedSlot
    native void __qt_setSizes_List(long __this__nativeId, java.util.List<java.lang.Integer> list);

/**
Updates the size policy of the widget at position <tt>index</tt> to have a stretch factor of <tt>stretch</tt>. <p><tt>stretch</tt> is not the effective stretch factor; the effective stretch factor is calculated by taking the initial size of the widget and multiplying it with <tt>stretch</tt>. <p>This function is provided for convenience. It is equivalent to <pre class="snippet">
        QWidget widget = splitter.widget(index);
        QSizePolicy policy = widget.sizePolicy();
        policy.setHorizontalStretch(stretch);
        policy.setVerticalStretch(stretch);
        widget.setSizePolicy(policy);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#setSizes(java.util.List) setSizes()}, and {@link com.trolltech.qt.gui.QSplitter#widget(int) widget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStretchFactor(int index, int stretch)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStretchFactor_int_int(nativeId(), index, stretch);
    }
    @QtBlockedSlot
    native void __qt_setStretchFactor_int_int(long __this__nativeId, int index, int stretch);

/**
Returns a list of the size parameters of all the widgets in this splitter. <p>If the splitter's orientation is horizontal, the list contains the widgets width in pixels, from left to right; if the orientation is vertical, the list contains the widgets height in pixels, from top to bottom. <p>Giving the values to another splitter's {@link com.trolltech.qt.gui.QSplitter#setSizes(java.util.List) setSizes()} function will produce a splitter with the same layout as this one. <p>Note that invisible widgets have a size of 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#setSizes(java.util.List) setSizes()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.Integer> sizes()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizes(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.Integer> __qt_sizes(long __this__nativeId);

/**
Returns the widget at the given <tt>index</tt> in the splitter's layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#count() count()}, {@link com.trolltech.qt.gui.QSplitter#handle(int) handle()}, {@link com.trolltech.qt.gui.QSplitter#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}, and {@link com.trolltech.qt.gui.QSplitter#insertWidget(int, com.trolltech.qt.gui.QWidget) insertWidget()}. <br></DD></DT>
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
    protected void childEvent(com.trolltech.qt.core.QChildEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_childEvent_QChildEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_childEvent_QChildEvent(long __this__nativeId, long arg__1);

/**
Returns a new splitter handle as a child widget of this splitter. This function can be reimplemented in subclasses to provide support for custom handles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSplitter#handle(int) handle()}, and {@link com.trolltech.qt.gui.QSplitter#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected com.trolltech.qt.gui.QSplitterHandle createHandle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createHandle(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QSplitterHandle __qt_createHandle(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize minimumSizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_minimumSizeHint(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long arg__1);

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
@exclude
*/

    public static native QSplitter fromNativePointer(QNativePointer nativePointer);

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

    protected QSplitter(QPrivateConstructor p) { super(p); } 

    public static class Range {
        public Range(int min, int max) {
            minimum = min;
            maximum = max;
        }

        public int minimum;
        public int maximum;
    }

/**
Returns the valid range of the splitter with index <tt>index</tt>.
*/

    public final Range getRange(int index) {
        QNativePointer min = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer max = new QNativePointer(QNativePointer.Type.Int);

        getRange(index, min, max);

        return new Range(min.intValue(), max.intValue());
    }

}
