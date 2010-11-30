package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAbstractItemDelegate class is used to display and edit data items from a model. A QAbstractItemDelegate provides the interface and common functionality for delegates in the model/view architecture. Delegates display individual items in views, and handle the editing of model data. <p>The QAbstractItemDelegate class is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view framework</a>}. <p>To render an item in a custom way, you must implement {@link com.trolltech.qt.gui.QAbstractItemDelegate#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionViewItem, com.trolltech.qt.core.QModelIndex) paint()} and {@link com.trolltech.qt.gui.QAbstractItemDelegate#sizeHint(com.trolltech.qt.gui.QStyleOptionViewItem, com.trolltech.qt.core.QModelIndex) sizeHint()}. The {@link com.trolltech.qt.gui.QItemDelegate QItemDelegate} class provides default implementations for these functions; if you do not need custom rendering, subclass that class instead. <p>We give an example of drawing a progress bar in items; in our case for a package management program. <br><center><img src="../images/widgetdelegate.png"></center><br> We create the <tt>WidgetDelegate</tt> class, which inherits from {@link com.trolltech.qt.gui.QStyledItemDelegate QStyledItemDelegate}. We do the drawing in the {@link com.trolltech.qt.gui.QAbstractItemDelegate#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionViewItem, com.trolltech.qt.core.QModelIndex) paint()} function:<br><br>The following code example is written in c++.<br> <pre class="snippet">
void WidgetDelegate::paint(QPainter *painter, const QStyleOptionViewItem &option,
                           const QModelIndex &index) const
{
    if (index.column() == 1) {
        int progress = index.data().toInt();

        QStyleOptionProgressBar progressBarOption;
        progressBarOption.rect = option.rect;
        progressBarOption.minimum = 0;
        progressBarOption.maximum = 100;
        progressBarOption.progress = progress;
        progressBarOption.text = QString::number(progress) + "%";
        progressBarOption.textVisible = true;

        QApplication::style()-&gt;drawControl(QStyle::CE_ProgressBar,
                                           &progressBarOption, painter);
    } else
        QStyledItemDelegate::paint(painter, option, index);

</pre> Notice that we use a {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar} and initialize its members. We can then use the current {@link com.trolltech.qt.gui.QStyle QStyle} to draw it. <p>To provide custom editing, there are two approaches that can be used. The first approach is to create an editor widget and display it directly on top of the item. To do this you must reimplement {@link com.trolltech.qt.gui.QAbstractItemDelegate#createEditor(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QStyleOptionViewItem, com.trolltech.qt.core.QModelIndex) createEditor()} to provide an editor widget, {@link com.trolltech.qt.gui.QAbstractItemDelegate#setEditorData(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QModelIndex) setEditorData()} to populate the editor with the data from the model, and {@link com.trolltech.qt.gui.QAbstractItemDelegate#setModelData(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QAbstractItemModel, com.trolltech.qt.core.QModelIndex) setModelData()} so that the delegate can update the model with data from the editor. <p>The second approach is to handle user events directly by reimplementing {@link com.trolltech.qt.gui.QAbstractItemDelegate#editorEvent(com.trolltech.qt.core.QEvent, com.trolltech.qt.core.QAbstractItemModel, com.trolltech.qt.gui.QStyleOptionViewItem, com.trolltech.qt.core.QModelIndex) editorEvent()}. <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-programming.html">Model/View Programming</a>}, {@link com.trolltech.qt.gui.QItemDelegate QItemDelegate}, {@link <a href="../itemviews-pixelator.html">Pixelator Example</a>}, {@link com.trolltech.qt.gui.QStyledItemDelegate QStyledItemDelegate}, and {@link com.trolltech.qt.gui.QStyle QStyle}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractItemDelegate extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractItemDelegate {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void paint(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_paint_QPainter_QStyleOptionViewItem_QModelIndex(nativeId(), painter == null ? 0 : painter.nativeId(), option == null ? 0 : option.nativeId(), index);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QSize sizeHint(com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_sizeHint_QStyleOptionViewItem_QModelIndex(nativeId(), option == null ? 0 : option.nativeId(), index);
        }
    }

    
/**
This enum describes the different hints that the delegate can give to the model and view components to make editing data in a model a comfortable experience for the user. These hints let the delegate influence the behavior of the view: Note that custom views may interpret the concepts of next and previous differently. <p>The following hints are most useful when models are used that cache data, such as those that manipulate data locally in order to increase performance or conserve network bandwidth. Although models and views should respond to these hints in appropriate ways, custom components may ignore any or all of them if they are not relevant.
*/
@QtBlockedEnum
    public enum EndEditHint implements com.trolltech.qt.QtEnumerator {
/**
 There is no recommended action to be performed.
*/

        NoHint(0),
/**
 The view should use the delegate to open an editor on the next item in the view.
*/

        EditNextItem(1),
/**
 The view should use the delegate to open an editor on the previous item in the view.
*/

        EditPreviousItem(2),
/**
 If the model caches data, it should write out cached data to the underlying data store.
*/

        SubmitModelCache(3),
/**
 If the model caches data, it should discard cached data and replace it with data from the underlying data store.
*/

        RevertModelCache(4);

        EndEditHint(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractItemDelegate$EndEditHint constant with the specified <tt>int</tt>.</brief>
*/

        public static EndEditHint resolve(int value) {
            return (EndEditHint) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoHint;
            case 1: return EditNextItem;
            case 2: return EditPreviousItem;
            case 3: return SubmitModelCache;
            case 4: return RevertModelCache;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QWidget(named: editor), com.trolltech.qt.gui.QAbstractItemDelegate$EndEditHint(named: hint)&gt;:<p> This signal is emitted when the user has finished editing an item using the specified <tt>editor</tt>. <p>The <tt>hint</tt> provides a way for the delegate to influence how the model and view behave after editing is completed. It indicates to these components what action should be performed next to provide a comfortable editing experience for the user. For example, if <tt>EditNextItem</tt> is specified, the view should use a delegate to open an editor on the next item in the model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemDelegate.EndEditHint EndEditHint }. <br></DD></DT>
*/

    public final Signal2<com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QAbstractItemDelegate.EndEditHint> closeEditor = new Signal2<com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QAbstractItemDelegate.EndEditHint>();


    private final void closeEditor(com.trolltech.qt.gui.QWidget editor) {
        closeEditor(editor, com.trolltech.qt.gui.QAbstractItemDelegate.EndEditHint.NoHint);
    }
    private final void closeEditor(com.trolltech.qt.gui.QWidget editor, com.trolltech.qt.gui.QAbstractItemDelegate.EndEditHint hint)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeEditor_QWidget_EndEditHint(nativeId(), editor == null ? 0 : editor.nativeId(), hint.value());
    }
    native void __qt_closeEditor_QWidget_EndEditHint(long __this__nativeId, long editor, int hint);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QWidget(named: editor)&gt;:<p> This signal must be emitted when the <tt>editor</tt> widget has completed editing the data, and wants to write it back into the model.
*/

    public final Signal1<com.trolltech.qt.gui.QWidget> commitData = new Signal1<com.trolltech.qt.gui.QWidget>();

    private final void commitData(com.trolltech.qt.gui.QWidget editor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_commitData_QWidget(nativeId(), editor == null ? 0 : editor.nativeId());
    }
    native void __qt_commitData_QWidget(long __this__nativeId, long editor);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: index)&gt;:<p> This signal must be emitted when the {@link com.trolltech.qt.gui.QAbstractItemDelegate#sizeHint(com.trolltech.qt.gui.QStyleOptionViewItem, com.trolltech.qt.core.QModelIndex) sizeHint()} of <tt>index</tt> changed. <p>Views automatically connect to this signal and relayout items as necessary.
*/

    public final Signal1<com.trolltech.qt.core.QModelIndex> sizeHintChanged = new Signal1<com.trolltech.qt.core.QModelIndex>();

    private final void sizeHintChanged(com.trolltech.qt.core.QModelIndex arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sizeHintChanged_QModelIndex(nativeId(), arg__1);
    }
    native void __qt_sizeHintChanged_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex arg__1);


/**
Creates a new abstract item delegate with the given <tt>parent</tt>.
*/

    public QAbstractItemDelegate() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Creates a new abstract item delegate with the given <tt>parent</tt>.
*/

    public QAbstractItemDelegate(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractItemDelegate_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractItemDelegate_QObject(long parent);

/**
Whenever a help event occurs, this function is called with the <tt>event</tt><tt>view</tt><tt>option</tt> and the <tt>index</tt> that corresponds to the item where the event occurs. <p>Returns true if the delegate can handle the event; otherwise returns false. A return value of true indicates that the data obtained using the index had the required role. <p>For {@link com.trolltech.qt.core.QEvent.Type QEvent::ToolTip } and {@link com.trolltech.qt.core.QEvent.Type QEvent::WhatsThis } events that were handled successfully, the relevant popup may be shown depending on the user's system configuration. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHelpEvent QHelpEvent}. <br></DD></DT>
*/

    public final boolean helpEvent(com.trolltech.qt.gui.QHelpEvent event, com.trolltech.qt.gui.QAbstractItemView view, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_helpEvent_QHelpEvent_QAbstractItemView_QStyleOptionViewItem_QModelIndex(nativeId(), event == null ? 0 : event.nativeId(), view == null ? 0 : view.nativeId(), option == null ? 0 : option.nativeId(), index);
    }
    native boolean __qt_helpEvent_QHelpEvent_QAbstractItemView_QStyleOptionViewItem_QModelIndex(long __this__nativeId, long event, long view, long option, com.trolltech.qt.core.QModelIndex index);

/**
Returns the editor to be used for editing the data item with the given <tt>index</tt>. Note that the index contains information about the model being used. The editor's parent widget is specified by <tt>parent</tt>, and the item options by <tt>option</tt>. <p>The base implementation returns 0. If you want custom editing you will need to reimplement this function. <p>The returned editor widget should have {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::StrongFocus }; otherwise, {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}s received by the widget will propagate to the view. The view's background will shine through unless the editor paints its own background (e.g., with {@link QWidget#setAutoFillBackground(boolean) setAutoFillBackground()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemDelegate#setModelData(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QAbstractItemModel, com.trolltech.qt.core.QModelIndex) setModelData()}, and {@link com.trolltech.qt.gui.QAbstractItemDelegate#setEditorData(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QModelIndex) setEditorData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QWidget createEditor(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createEditor_QWidget_QStyleOptionViewItem_QModelIndex(nativeId(), parent == null ? 0 : parent.nativeId(), option == null ? 0 : option.nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_createEditor_QWidget_QStyleOptionViewItem_QModelIndex(long __this__nativeId, long parent, long option, com.trolltech.qt.core.QModelIndex index);

/**
Whenever an event occurs, this function is called with the <tt>event</tt><tt>model</tt><tt>option</tt> and the <tt>index</tt> that corresponds to the item being edited. <p>The base implementation returns false (indicating that it has not handled the event).
*/

    @QtBlockedSlot
    public boolean editorEvent(com.trolltech.qt.core.QEvent event, com.trolltech.qt.core.QAbstractItemModel model, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_editorEvent_QEvent_QAbstractItemModel_QStyleOptionViewItem_QModelIndex(nativeId(), event == null ? 0 : event.nativeId(), model == null ? 0 : model.nativeId(), option == null ? 0 : option.nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_editorEvent_QEvent_QAbstractItemModel_QStyleOptionViewItem_QModelIndex(long __this__nativeId, long event, long model, long option, com.trolltech.qt.core.QModelIndex index);

/**
This pure abstract function must be reimplemented if you want to provide custom rendering. Use the <tt>painter</tt> and style <tt>option</tt> to render the item specified by the item <tt>index</tt>. <p>If you reimplement this you must also reimplement {@link com.trolltech.qt.gui.QAbstractItemDelegate#sizeHint(com.trolltech.qt.gui.QStyleOptionViewItem, com.trolltech.qt.core.QModelIndex) sizeHint()}.
*/

    @QtBlockedSlot
    public abstract void paint(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index);
    @QtBlockedSlot
    native void __qt_paint_QPainter_QStyleOptionViewItem_QModelIndex(long __this__nativeId, long painter, long option, com.trolltech.qt.core.QModelIndex index);

/**
Sets the contents of the given <tt>editor</tt> to the data for the item at the given <tt>index</tt>. Note that the index contains information about the model being used. <p>The base implementation does nothing. If you want custom editing you will need to reimplement this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemDelegate#setModelData(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QAbstractItemModel, com.trolltech.qt.core.QModelIndex) setModelData()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public void setEditorData(com.trolltech.qt.gui.QWidget editor, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEditorData_QWidget_QModelIndex(nativeId(), editor == null ? 0 : editor.nativeId(), index);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setEditorData_QWidget_QModelIndex(long __this__nativeId, long editor, com.trolltech.qt.core.QModelIndex index);

/**
Sets the data for the item at the given <tt>index</tt> in the <tt>model</tt> to the contents of the given <tt>editor</tt>. <p>The base implementation does nothing. If you want custom editing you will need to reimplement this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractItemDelegate#setEditorData(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QModelIndex) setEditorData()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public void setModelData(com.trolltech.qt.gui.QWidget editor, com.trolltech.qt.core.QAbstractItemModel model, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setModelData_QWidget_QAbstractItemModel_QModelIndex(nativeId(), editor == null ? 0 : editor.nativeId(), model == null ? 0 : model.nativeId(), index);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setModelData_QWidget_QAbstractItemModel_QModelIndex(long __this__nativeId, long editor, long model, com.trolltech.qt.core.QModelIndex index);

/**
This pure abstract function must be reimplemented if you want to provide custom rendering. The options are specified by <tt>option</tt> and the model item by <tt>index</tt>. <p>If you reimplement this you must also reimplement {@link com.trolltech.qt.gui.QAbstractItemDelegate#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.gui.QStyleOptionViewItem, com.trolltech.qt.core.QModelIndex) paint()}.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QSize sizeHint(com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index);
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint_QStyleOptionViewItem_QModelIndex(long __this__nativeId, long option, com.trolltech.qt.core.QModelIndex index);

/**
Updates the geometry of the <tt>editor</tt> for the item with the given <tt>index</tt>, according to the rectangle specified in the <tt>option</tt>. If the item has an internal layout, the editor will be laid out accordingly. Note that the index contains information about the model being used. <p>The base implementation does nothing. If you want custom editing you must reimplement this function.
*/

    @QtBlockedSlot
    public void updateEditorGeometry(com.trolltech.qt.gui.QWidget editor, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateEditorGeometry_QWidget_QStyleOptionViewItem_QModelIndex(nativeId(), editor == null ? 0 : editor.nativeId(), option == null ? 0 : option.nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_updateEditorGeometry_QWidget_QStyleOptionViewItem_QModelIndex(long __this__nativeId, long editor, long option, com.trolltech.qt.core.QModelIndex index);

/**
@exclude
*/

    public static native QAbstractItemDelegate fromNativePointer(QNativePointer nativePointer);

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

    protected QAbstractItemDelegate(QPrivateConstructor p) { super(p); } 
}
