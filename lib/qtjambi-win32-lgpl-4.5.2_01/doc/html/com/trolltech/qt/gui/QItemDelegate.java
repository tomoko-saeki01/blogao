package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QItemDelegate class provides display and editing facilities for data items from a model. QItemDelegate can be used to provide custom display features and editor widgets for item views based on {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView} subclasses. Using a delegate for this purpose allows the display and editing mechanisms to be customized and developed independently from the model and view. <p>The QItemDelegate class is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view framework</a>}. <p>When displaying items from a custom model in a standard view, it is often sufficient to simply ensure that the model returns appropriate data for each of the {@link com.trolltech.qt.core.Qt.ItemDataRole roles } that determine the appearance of items in views. The default delegate used by Qt's standard views uses this role information to display items in most of the common forms expected by users. However, it is sometimes necessary to have even more control over the appearance of items than the default delegate can provide. <p>This class provides default implementations of the functions for painting item data in a view and editing data from item models. Default implementations of the paint() and sizeHint() virtual functions, defined in {@link com.trolltech.qt.gui.QAbstractItemDelegate QAbstractItemDelegate}, are provided to ensure that the delegate implements the correct basic behavior expected by views. You can reimplement these functions in subclasses to customize the appearance of items. <p>When editing data in an item view, QItemDelegate provides an editor widget, which is a widget that is placed on top of the view while editing takes place. Editors are created with a {@link com.trolltech.qt.gui.QItemEditorFactory QItemEditorFactory}; a default static instance provided by {@link com.trolltech.qt.gui.QItemEditorFactory QItemEditorFactory} is installed on all item delagates. You can set a custom factory using {@link com.trolltech.qt.gui.QItemDelegate#setItemEditorFactory(com.trolltech.qt.gui.QItemEditorFactory) setItemEditorFactory()} or set a new default factory with {@link com.trolltech.qt.gui.QItemEditorFactory#setDefaultFactory(com.trolltech.qt.gui.QItemEditorFactory) QItemEditorFactory::setDefaultFactory()}. It is the data stored in the item model with the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::EditRole } that is edited. <p>Only the standard editing functions for widget-based delegates are reimplemented here: <ul><li> createEditor() returns the widget used to change data from the model and can be reimplemented to customize editing behavior.</li><li> setEditorData() provides the widget with data to manipulate.</li><li> updateEditorGeometry() ensures that the editor is displayed correctly with respect to the item view.</li><li> setModelData() returns updated data to the model.</li></ul> The {@link com.trolltech.qt.gui.QAbstractItemDelegate#closeEditor closeEditor() } signal indicates that the user has completed editing the data, and that the editor widget can be destroyed.<a name="standard-roles-and-data-types"><h2>Standard Roles and Data Types</h2> The default delegate used by the standard views supplied with Qt associates each standard role (defined by {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ItemDataRole }) with certain data types. Models that return data in these types can influence the appearance of the delegate as described in the following table. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Role</center></th><th><center> Accepted Types</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::BackgroundRole }</td><td> {@link com.trolltech.qt.gui.QBrush QBrush}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::BackgroundColorRole }</td><td> {@link com.trolltech.qt.gui.QColor QColor} (obsolete; use {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::BackgroundRole } instead)</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::CheckStateRole }</td><td> {@link com.trolltech.qt.core.Qt.CheckState Qt::CheckState }</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DecorationRole }</td><td> {@link com.trolltech.qt.gui.QIcon QIcon} and {@link com.trolltech.qt.gui.QColor QColor}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole }</td><td> QString and types with a string representation</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::EditRole }</td><td> See {@link com.trolltech.qt.gui.QItemEditorFactory QItemEditorFactory} for details</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::FontRole }</td><td> {@link com.trolltech.qt.gui.QFont QFont}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::SizeHintRole }</td><td> {@link com.trolltech.qt.core.QSize QSize}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::TextAlignmentRole }</td><td> Qt::Alignment</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ForegroundRole }</td><td> {@link com.trolltech.qt.gui.QBrush QBrush}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::TextColorRole }</td><td> {@link com.trolltech.qt.gui.QColor QColor} (obsolete; use {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ForegroundRole } instead)</td></tr></table> If the default delegate does not allow the level of customization that you need, either for display purposes or for editing data, it is possible to subclass QItemDelegate to implement the desired behavior.<a name="subclassing"><h2>Subclassing</h2> When subclassing QItemDelegate to create a delegate that displays items using a custom renderer, it is important to ensure that the delegate can render items suitably for all the required states; e.g. selected, disabled, checked. The documentation for the paint() function contains some hints to show how this can be achieved. <p>You can provide custom editors by using a {@link com.trolltech.qt.gui.QItemEditorFactory QItemEditorFactory}. The {@link <a href="../qtjambi-coloreditorfactory.html">Color Editor Factory Example</a>} shows how a custom editor can be made available to delegates with the default item editor factory. This way, there is no need to subclass QItemDelegate. An alternative is to reimplement createEditor(), setEditorData(), setModelData(), and updateEditorGeometry(). This process is described in the {@link <a href="../itemviews-spinboxdelegate.html">Spin Box Delegate Example</a>}. <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-delegate.html">Delegate Classes</a>}, {@link com.trolltech.qt.gui.QStyledItemDelegate QStyledItemDelegate}, {@link com.trolltech.qt.gui.QAbstractItemDelegate QAbstractItemDelegate}, {@link <a href="../itemviews-spinboxdelegate.html">Spin Box Delegate Example</a>}, {@link <a href="../tools-settingseditor.html">Settings Editor Example</a>}, and {@link <a href="../qtjambi-icons.html">Icons Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QItemDelegate extends com.trolltech.qt.gui.QAbstractItemDelegate
{

    private Object __rcItemEditorFactory = null;


/**
Constructs an item delegate with the given <tt>parent</tt>.
*/

    public QItemDelegate() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an item delegate with the given <tt>parent</tt>.
*/

    public QItemDelegate(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QItemDelegate_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QItemDelegate_QObject(long parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QRect check(com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QRect bounding, java.lang.Object variant)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_check_QStyleOptionViewItem_QRect_Object(nativeId(), option == null ? 0 : option.nativeId(), bounding == null ? 0 : bounding.nativeId(), variant);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_check_QStyleOptionViewItem_QRect_Object(long __this__nativeId, long option, long bounding, java.lang.Object variant);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QPixmap decoration(com.trolltech.qt.gui.QStyleOptionViewItem option, java.lang.Object variant)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_decoration_QStyleOptionViewItem_Object(nativeId(), option == null ? 0 : option.nativeId(), variant);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_decoration_QStyleOptionViewItem_Object(long __this__nativeId, long option, java.lang.Object variant);

/**
Renders the item background for the given <tt>index</tt>, using the given <tt>painter</tt> and style <tt>option</tt>.
*/

    @QtBlockedSlot
    protected final void drawBackground(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawBackground_QPainter_QStyleOptionViewItem_QModelIndex(nativeId(), painter == null ? 0 : painter.nativeId(), option == null ? 0 : option.nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_drawBackground_QPainter_QStyleOptionViewItem_QModelIndex(long __this__nativeId, long painter, long option, com.trolltech.qt.core.QModelIndex index);

/**
This property holds if the delegate should clip the paint events. This property will set the paint clip to the size of the item. The default value is on. It is useful for cases such as when images are larger than the size of the item.
*/

    @com.trolltech.qt.QtPropertyReader(name="clipping")
    @QtBlockedSlot
    public final boolean hasClipping()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasClipping(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasClipping(long __this__nativeId);

/**
Returns the editor factory used by the item delegate. If no editor factory is set, the function will return null. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemDelegate#setItemEditorFactory(com.trolltech.qt.gui.QItemEditorFactory) setItemEditorFactory()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QItemEditorFactory itemEditorFactory()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemEditorFactory(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemEditorFactory __qt_itemEditorFactory(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QRect rect(com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rect_QStyleOptionViewItem_QModelIndex_int(nativeId(), option == null ? 0 : option.nativeId(), index, role);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_rect_QStyleOptionViewItem_QModelIndex_int(long __this__nativeId, long option, com.trolltech.qt.core.QModelIndex index, int role);

/**
This property holds if the delegate should clip the paint events. This property will set the paint clip to the size of the item. The default value is on. It is useful for cases such as when images are larger than the size of the item.
*/

    @com.trolltech.qt.QtPropertyWriter(name="clipping")
    @QtBlockedSlot
    public final void setClipping(boolean clip)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setClipping_boolean(nativeId(), clip);
    }
    @QtBlockedSlot
    native void __qt_setClipping_boolean(long __this__nativeId, boolean clip);

/**
Sets the editor factory to be used by the item delegate to be the <tt>factory</tt> specified. If no editor factory is set, the item delegate will use the default editor factory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemDelegate#itemEditorFactory() itemEditorFactory()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemEditorFactory(com.trolltech.qt.gui.QItemEditorFactory factory)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcItemEditorFactory = factory;
        }
        __qt_setItemEditorFactory_QItemEditorFactory(nativeId(), factory == null ? 0 : factory.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItemEditorFactory_QItemEditorFactory(long __this__nativeId, long factory);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QStyleOptionViewItem setOptions(com.trolltech.qt.core.QModelIndex index, com.trolltech.qt.gui.QStyleOptionViewItem option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setOptions_QModelIndex_QStyleOptionViewItem(nativeId(), index, option == null ? 0 : option.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStyleOptionViewItem __qt_setOptions_QModelIndex_QStyleOptionViewItem(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, long option);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QRect textRectangle(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRect rect, com.trolltech.qt.gui.QFont font, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textRectangle_QPainter_QRect_QFont_String(nativeId(), painter == null ? 0 : painter.nativeId(), rect == null ? 0 : rect.nativeId(), font == null ? 0 : font.nativeId(), text);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_textRectangle_QPainter_QRect_QFont_String(long __this__nativeId, long painter, long rect, long font, java.lang.String text);

/**
This method is internal to Qt Jambi. 

	@exclude
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
Renders a check indicator within the rectangle specified by <tt>rect</tt>, using the given <tt>painter</tt> and style <tt>option</tt>, using the given <tt>state</tt>.
*/

    @QtBlockedSlot
    protected void drawCheck(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QRect rect, com.trolltech.qt.core.Qt.CheckState state)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawCheck_QPainter_QStyleOptionViewItem_QRect_CheckState(nativeId(), painter == null ? 0 : painter.nativeId(), option == null ? 0 : option.nativeId(), rect == null ? 0 : rect.nativeId(), state.value());
    }
    @QtBlockedSlot
    native void __qt_drawCheck_QPainter_QStyleOptionViewItem_QRect_CheckState(long __this__nativeId, long painter, long option, long rect, int state);

/**
Renders the decoration <tt>pixmap</tt> within the rectangle specified by <tt>rect</tt> using the given <tt>painter</tt> and style <tt>option</tt>.
*/

    @QtBlockedSlot
    protected void drawDecoration(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QRect rect, com.trolltech.qt.gui.QPixmap pixmap)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawDecoration_QPainter_QStyleOptionViewItem_QRect_QPixmap(nativeId(), painter == null ? 0 : painter.nativeId(), option == null ? 0 : option.nativeId(), rect == null ? 0 : rect.nativeId(), pixmap == null ? 0 : pixmap.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawDecoration_QPainter_QStyleOptionViewItem_QRect_QPixmap(long __this__nativeId, long painter, long option, long rect, long pixmap);

/**
Renders the item view <tt>text</tt> within the rectangle specified by <tt>rect</tt> using the given <tt>painter</tt> and style <tt>option</tt>.
*/

    @QtBlockedSlot
    protected void drawDisplay(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QRect rect, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawDisplay_QPainter_QStyleOptionViewItem_QRect_String(nativeId(), painter == null ? 0 : painter.nativeId(), option == null ? 0 : option.nativeId(), rect == null ? 0 : rect.nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_drawDisplay_QPainter_QStyleOptionViewItem_QRect_String(long __this__nativeId, long painter, long option, long rect, java.lang.String text);

/**
Renders the region within the rectangle specified by <tt>rect</tt>, indicating that it has the focus, using the given <tt>painter</tt> and style <tt>option</tt>.
*/

    @QtBlockedSlot
    protected void drawFocus(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QRect rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawFocus_QPainter_QStyleOptionViewItem_QRect(nativeId(), painter == null ? 0 : painter.nativeId(), option == null ? 0 : option.nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawFocus_QPainter_QStyleOptionViewItem_QRect(long __this__nativeId, long painter, long option, long rect);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean eventFilter(com.trolltech.qt.core.QObject object, com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_eventFilter_QObject_QEvent(nativeId(), object == null ? 0 : object.nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_eventFilter_QObject_QEvent(long __this__nativeId, long object, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void paint(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paint_QPainter_QStyleOptionViewItem_QModelIndex(nativeId(), painter == null ? 0 : painter.nativeId(), option == null ? 0 : option.nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_paint_QPainter_QStyleOptionViewItem_QModelIndex(long __this__nativeId, long painter, long option, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize sizeHint(com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint_QStyleOptionViewItem_QModelIndex(nativeId(), option == null ? 0 : option.nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint_QStyleOptionViewItem_QModelIndex(long __this__nativeId, long option, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
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

    public static native QItemDelegate fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QItemDelegate(QPrivateConstructor p) { super(p); } 
}
