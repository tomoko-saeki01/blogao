package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyledItemDelegate class provides display and editing facilities for data items from a model. When displaying data from models in Qt item views, e.g., a {@link com.trolltech.qt.gui.QTableView QTableView}, the individual items are drawn by a delegate. Also, when an item is edited, it provides an editor widget, which is placed on top of the item view while editing takes place. QStyledItemDelegate is the default delegate for all Qt item views, and is installed upon them when they are created. <p>The QStyledItemDelegate class is one of the {@link <a href="../model-view.html">Model/View Classes</a>} and is part of Qt's {@link <a href="../model-view-programming.html">model/view framework</a>}. The delegate allows the display and editing of items to be developed independently from the model and view. <p>The data of items in models are assigned an {@link com.trolltech.qt.core.Qt.ItemDataRole ItemDataRole }; each item can store a {@link com.trolltech.qt.QVariant QVariant} for each role. QStyledItemDelegate implements display and editing for the most common datatypes expected by users, including booleans, integers, and strings. <p>The data will be drawn differently depending on which role they have in the model. The following table describes the roles and the data types the delegate can handle for each of them. It is often sufficient to ensure that the model returns appropriate data for each of the roles to determine the appearance of items in views. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Role</center></th><th><center> Accepted Types</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::BackgroundRole }</td><td> {@link com.trolltech.qt.gui.QBrush QBrush}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::BackgroundColorRole }</td><td> {@link com.trolltech.qt.gui.QColor QColor} (obsolete; use {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::BackgroundRole } instead)</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::CheckStateRole }</td><td> {@link com.trolltech.qt.core.Qt.CheckState Qt::CheckState }</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DecorationRole }</td><td> {@link com.trolltech.qt.gui.QIcon QIcon} and {@link com.trolltech.qt.gui.QColor QColor}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole }</td><td> QString and types with a string representation</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::EditRole }</td><td> See {@link com.trolltech.qt.gui.QItemEditorFactory QItemEditorFactory} for details</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::FontRole }</td><td> {@link com.trolltech.qt.gui.QFont QFont}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::SizeHintRole }</td><td> {@link com.trolltech.qt.core.QSize QSize}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::TextAlignmentRole }</td><td> Qt::Alignment</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ForegroundRole }</td><td> {@link com.trolltech.qt.gui.QBrush QBrush}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::TextColorRole }</td><td> {@link com.trolltech.qt.gui.QColor QColor} (obsolete; use {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::ForegroundRole } instead)</td></tr></table> Editors are created with a {@link com.trolltech.qt.gui.QItemEditorFactory QItemEditorFactory}; a default static instance provided by {@link com.trolltech.qt.gui.QItemEditorFactory QItemEditorFactory} is installed on all item delegates. You can set a custom factory using {@link com.trolltech.qt.gui.QStyledItemDelegate#setItemEditorFactory(com.trolltech.qt.gui.QItemEditorFactory) setItemEditorFactory()} or set a new default factory with {@link com.trolltech.qt.gui.QItemEditorFactory#setDefaultFactory(com.trolltech.qt.gui.QItemEditorFactory) QItemEditorFactory::setDefaultFactory()}. It is the data stored in the item model with the {@link com.trolltech.qt.core.Qt.ItemDataRole EditRole } that is edited. See the {@link com.trolltech.qt.gui.QItemEditorFactory QItemEditorFactory} class for a more high-level introduction to item editor factories. The {@link <a href="../qtjambi-coloreditorfactory.html">Color Editor Factory</a>} example shows how to create custom editors with a factory.<a name="subclassing-qstyleditemdelegate"><h2>Subclassing QStyledItemDelegate</h2> If the delegate does not support painting of the data types you need or you want to customize the drawing of items, you need to subclass QStyledItemDelegate, and reimplement paint() and possibly sizeHint(). The paint() function is called individually for each item, and with sizeHint(), you can specify the hint for each of them. <p>When reimplementing paint(), one would typically handle the datatypes one would like to draw and use the superclass implementation for other types. <p>The painting of check box indicators are performed by the current style. The style also specifies the size and the bounding rectangles in which to draw the data for the different data roles. The bounding rectangle of the item itself is also calculated by the style. When drawing already supported datatypes, it is therefore a good idea to ask the style for these bounding rectangles. The {@link com.trolltech.qt.gui.QStyle QStyle} class description describes this in more detail. <p>If you wish to change any of the bounding rectangles calculated by the style or the painting of check box indicators, you can subclass {@link com.trolltech.qt.gui.QStyle QStyle}. Note, however, that the size of the items can also be affected by reimplementing sizeHint(). <p>It is possible for a custom delegate to provide editors without the use of an editor item factory. In this case, the following virtual functions must be reimplemented: <ul><li> createEditor() returns the widget used to change data from the model and can be reimplemented to customize editing behavior.</li><li> setEditorData() provides the widget with data to manipulate.</li><li> updateEditorGeometry() ensures that the editor is displayed correctly with respect to the item view.</li><li> setModelData() returns updated data to the model.</li></ul> The {@link <a href="../qtjambi-stardelegate.html">Star Delegate</a>} example creates editors by reimplementing these methods.<a name="qstyleditemdelegate-and-qitemdelegate"><h2>QStyledItemDelegate and QItemDelegate</h2> QStyledItemDelegate has taken over the job as default delegate - leaving {@link com.trolltech.qt.gui.QItemDelegate QItemDelegate} behind. They will now co-exist peacefully as independent alternatives to painting and providing editors for items in views. The difference between them is that the new delegate uses the current style to paint its items. We therefore recommend using QStyledItemDelegate as base when implementing custom delegates. The code required should be equal unless the custom delegate also wishes to use the style for drawing. <p>If you wish to customize the painting of item views, you should implement a custom style. Please see the {@link com.trolltech.qt.gui.QStyle QStyle} class documentation for details. <p><DT><b>See also:</b><br><DD>{@link <a href="../model-view-delegate.html">Delegate Classes</a>}, {@link com.trolltech.qt.gui.QItemDelegate QItemDelegate}, {@link com.trolltech.qt.gui.QAbstractItemDelegate QAbstractItemDelegate}, {@link com.trolltech.qt.gui.QStyle QStyle}, {@link <a href="../itemviews-spinboxdelegate.html">Spin Box Delegate Example</a>}, {@link <a href="../qtjambi-stardelegate.html">Star Delegate Example</a>}, and {@link <a href="../qtjambi-coloreditorfactory.html">Color Editor Factory Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyledItemDelegate extends com.trolltech.qt.gui.QAbstractItemDelegate
{

    private Object __rcItemEditorFactory = null;


/**
Constructs an item delegate with the given <tt>parent</tt>.
*/

    public QStyledItemDelegate() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an item delegate with the given <tt>parent</tt>.
*/

    public QStyledItemDelegate(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QStyledItemDelegate_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QStyledItemDelegate_QObject(long parent);

/**
Returns the editor factory used by the item delegate. If no editor factory is set, the function will return null. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyledItemDelegate#setItemEditorFactory(com.trolltech.qt.gui.QItemEditorFactory) setItemEditorFactory()}. <br></DD></DT>
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
Sets the editor factory to be used by the item delegate to be the <tt>factory</tt> specified. If no editor factory is set, the item delegate will use the default editor factory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyledItemDelegate#itemEditorFactory() itemEditorFactory()}. <br></DD></DT>
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
    public com.trolltech.qt.gui.QWidget createEditor(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createEditor_QWidget_QStyleOptionViewItem_QModelIndex(nativeId(), parent == null ? 0 : parent.nativeId(), option == null ? 0 : option.nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_createEditor_QWidget_QStyleOptionViewItem_QModelIndex(long __this__nativeId, long parent, long option, com.trolltech.qt.core.QModelIndex index);

/**
This function returns the string that the delegate will use to display the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole } of the model in <tt>locale</tt>. <tt>value</tt> is the value of the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole } provided by the model. <p>The default implementation uses the QLocale::toString to convert <tt>value</tt> into a QString.
*/

    @QtBlockedSlot
    public java.lang.String displayText(java.lang.Object value, com.trolltech.qt.core.QLocale locale)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_displayText_Object_QLocale(nativeId(), value, locale == null ? 0 : locale.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_displayText_Object_QLocale(long __this__nativeId, java.lang.Object value, long locale);

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
Initialize <tt>option</tt> with the values using the index <tt>index</tt>. This method is useful for subclasses when they need a {@link com.trolltech.qt.gui.QStyleOptionViewItem QStyleOptionViewItem}, but don't want to fill in all the information themselves. This function will check the version of the {@link com.trolltech.qt.gui.QStyleOptionViewItem QStyleOptionViewItem} and fill in the additional values for a {@link com.trolltech.qt.gui.QStyleOptionViewItemV2 QStyleOptionViewItemV2}, {@link com.trolltech.qt.gui.QStyleOptionViewItemV3 QStyleOptionViewItemV3} and {@link com.trolltech.qt.gui.QStyleOptionViewItemV4 QStyleOptionViewItemV4}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption#initFrom(com.trolltech.qt.gui.QWidget) QStyleOption::initFrom()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void initStyleOption(com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer_QModelIndex(nativeId(), option, index);
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer_QModelIndex(long __this__nativeId, com.trolltech.qt.gui.QStyleOptionViewItem option, com.trolltech.qt.core.QModelIndex index);

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

    public static native QStyledItemDelegate fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyledItemDelegate(QPrivateConstructor p) { super(p); } 
}
