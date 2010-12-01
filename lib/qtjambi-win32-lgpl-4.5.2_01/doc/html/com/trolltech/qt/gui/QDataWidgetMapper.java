package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDataWidgetMapper class provides mapping between a section of a data model to widgets. QDataWidgetMapper can be used to create data-aware widgets by mapping them to sections of an item model. A section is a column of a model if the orientation is horizontal (the default), otherwise a row. <p>Every time the current index changes, each widget is updated with data from the model via the property specified when its mapping was made. If the user edits the contents of a widget, the changes are read using the same property and written back to the model. By default, each widget's user property is used to transfer data between the model and the widget. Since Qt 4.3, an additional {@link com.trolltech.qt.gui.QDataWidgetMapper#addMapping(com.trolltech.qt.gui.QWidget, int) addMapping()} function enables a named property to be used instead of the default user property. <p>It is possible to set an item delegate to support custom widgets. By default, a {@link com.trolltech.qt.gui.QItemDelegate QItemDelegate} is used to synchronize the model with the widgets. <p>Let us assume that we have an item model named <tt>model</tt> with the following contents: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> 1</td><td> Nokia Corporation and/or its subsidiary(-ies)</td><td> Oslo</td></tr><tr valign="top" class="odd"><td> 2</td><td> Trolltech Pty</td><td> Brisbane</td></tr><tr valign="top" class="even"><td> 3</td><td> Trolltech Inc</td><td> Palo Alto</td></tr><tr valign="top" class="odd"><td> 4</td><td> Trolltech China</td><td> Beijing</td></tr><tr valign="top" class="even"><td> 5</td><td> Trolltech GmbH</td><td> Berlin</td></tr></table> The following code will map the columns of the model to widgets called <tt>mySpinBox</tt>, <tt>myLineEdit</tt> and <tt>myCountryChooser</tt>: <pre class="snippet">
    QDataWidgetMapper mapper = new QDataWidgetMapper();
    mapper.setModel(model);
    mapper.addMapping(mySpinBox, 0);
    mapper.addMapping(myLineEdit, 1);
    mapper.addMapping(myCountryChooser, 2);
    mapper.toFirst();
</pre> After the call to {@link com.trolltech.qt.gui.QDataWidgetMapper#toFirst() toFirst()}, <tt>mySpinBox</tt> displays the value <tt>1</tt>, <tt>myLineEdit</tt> displays <tt>Nokia Corporation and/or its subsidiary(-ies)</tt> and <tt>myCountryChooser</tt> displays <tt>Oslo</tt>. The navigational functions {@link com.trolltech.qt.gui.QDataWidgetMapper#toFirst() toFirst()}, {@link com.trolltech.qt.gui.QDataWidgetMapper#toNext() toNext()}, {@link com.trolltech.qt.gui.QDataWidgetMapper#toPrevious() toPrevious()}, {@link com.trolltech.qt.gui.QDataWidgetMapper#toLast() toLast()} and {@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentIndex(int) setCurrentIndex()} can be used to navigate in the model and update the widgets with contents from the model. <p>The {@link com.trolltech.qt.gui.QDataWidgetMapper#setRootIndex(com.trolltech.qt.core.QModelIndex) setRootIndex()} function enables a particular item in a model to be specified as the root index - children of this item will be mapped to the relevant widgets in the user interface. <p>QDataWidgetMapper supports two submit policies, <tt>AutoSubmit</tt> and <tt>ManualSubmit</tt>. <tt>AutoSubmit</tt> will update the model as soon as the current widget loses focus, <tt>ManualSubmit</tt> will not update the model unless {@link com.trolltech.qt.gui.QDataWidgetMapper#submit() submit()} is called. <tt>ManualSubmit</tt> is useful when displaying a dialog that lets the user cancel all modifications. Also, other views that display the model won't update until the user finishes all their modifications and submits. <p>Note that QDataWidgetMapper keeps track of external modifications. If the contents of the model are updated in another module of the application, the widgets are updated as well. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, and {@link com.trolltech.qt.gui.QAbstractItemDelegate QAbstractItemDelegate}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDataWidgetMapper extends com.trolltech.qt.core.QObject
{

    private Object __rcModel = null;

    private java.util.Collection<Object> __rcMappings = new java.util.ArrayList<Object>();

    private Object __rcItemDelegate = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the possible submit policies a {@link com.trolltech.qt.gui.QDataWidgetMapper QDataWidgetMapper} supports.
*/

    public enum SubmitPolicy implements com.trolltech.qt.QtEnumerator {
/**
 Whenever a widget loses focus, the widget's current value is set to the item model.
*/

        AutoSubmit(0),
/**
 The model is not updated until {@link com.trolltech.qt.gui.QDataWidgetMapper#submit() submit()} is called.
*/

        ManualSubmit(1);

        SubmitPolicy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QDataWidgetMapper$SubmitPolicy constant with the specified <tt>int</tt>.</brief>
*/

        public static SubmitPolicy resolve(int value) {
            return (SubmitPolicy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AutoSubmit;
            case 1: return ManualSubmit;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: index)&gt;:<p> This signal is emitted after the current index has changed and all widgets were populated with new data. <tt>index</tt> is the new current index. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#currentIndex() currentIndex()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentIndex(int) setCurrentIndex()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> currentIndexChanged = new Signal1<java.lang.Integer>();

    private final void currentIndexChanged(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentIndexChanged_int(nativeId(), index);
    }
    native void __qt_currentIndexChanged_int(long __this__nativeId, int index);


/**
Constructs a new QDataWidgetMapper with parent object <tt>parent</tt>. By default, the orientation is horizontal and the submit policy is <tt>AutoSubmit</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#setOrientation(com.trolltech.qt.core.Qt.Orientation) setOrientation()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#setSubmitPolicy(com.trolltech.qt.gui.QDataWidgetMapper.SubmitPolicy) setSubmitPolicy()}. <br></DD></DT>
*/

    public QDataWidgetMapper() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new QDataWidgetMapper with parent object <tt>parent</tt>. By default, the orientation is horizontal and the submit policy is <tt>AutoSubmit</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#setOrientation(com.trolltech.qt.core.Qt.Orientation) setOrientation()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#setSubmitPolicy(com.trolltech.qt.gui.QDataWidgetMapper.SubmitPolicy) setSubmitPolicy()}. <br></DD></DT>
*/

    public QDataWidgetMapper(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QDataWidgetMapper_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDataWidgetMapper_QObject(long parent);

/**
Adds a mapping between a <tt>widget</tt> and a <tt>section</tt> from the model. The <tt>section</tt> is a column in the model if the orientation is horizontal (the default), otherwise a row. <p>For the following example, we assume a model <tt>myModel</tt> that has two columns: the first one contains the names of people in a group, and the second column contains their ages. The first column is mapped to the {@link com.trolltech.qt.gui.QLineEdit QLineEdit}<tt>nameLineEdit</tt>, and the second is mapped to the {@link com.trolltech.qt.gui.QSpinBox QSpinBox}<tt>ageSpinBox</tt>: <pre class="snippet">
    QDataWidgetMapper mapper = new QDataWidgetMapper();
    mapper.setModel(model);
    mapper.addMapping(nameLineEdit, 0);
    mapper.addMapping(ageSpinBox, 1);
</pre> <b>Notes:</b> <ul><li> If the <tt>widget</tt> is already mapped to a section, the old mapping will be replaced by the new one.</li><li> Only one-to-one mappings between sections and widgets are allowed. It is not possible to map a single section to multiple widgets, or to map a single widget to multiple sections.</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#removeMapping(com.trolltech.qt.gui.QWidget) removeMapping()}, {@link com.trolltech.qt.gui.QDataWidgetMapper#mappedSection(com.trolltech.qt.gui.QWidget) mappedSection()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#clearMapping() clearMapping()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addMapping(com.trolltech.qt.gui.QWidget widget, int section)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (widget != null) {
            __rcMappings.add(widget);
        }
        __qt_addMapping_QWidget_int(nativeId(), widget == null ? 0 : widget.nativeId(), section);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addMapping_QWidget_int(long __this__nativeId, long widget, int section);

/**
Essentially the same as {@link com.trolltech.qt.gui.QDataWidgetMapper#addMapping(com.trolltech.qt.gui.QWidget, int) addMapping()}, but adds the possibility to specify the property to use specifying <tt>propertyName</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#addMapping(com.trolltech.qt.gui.QWidget, int) addMapping()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addMapping(com.trolltech.qt.gui.QWidget widget, int section, com.trolltech.qt.core.QByteArray propertyName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (widget != null) {
            __rcMappings.add(widget);
        }
        __qt_addMapping_QWidget_int_QByteArray(nativeId(), widget == null ? 0 : widget.nativeId(), section, propertyName == null ? 0 : propertyName.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addMapping_QWidget_int_QByteArray(long __this__nativeId, long widget, int section, long propertyName);

/**
Clears all mappings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#addMapping(com.trolltech.qt.gui.QWidget, int) addMapping()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#removeMapping(com.trolltech.qt.gui.QWidget) removeMapping()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearMapping()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearMapping(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearMapping(long __this__nativeId);

/**
This property holds the current row or column. The widgets are populated with with data from the row at <tt>index</tt> if the orientation is horizontal (the default), otherwise with data from the column at <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentModelIndex(com.trolltech.qt.core.QModelIndex) setCurrentModelIndex()}, {@link com.trolltech.qt.gui.QDataWidgetMapper#toFirst() toFirst()}, {@link com.trolltech.qt.gui.QDataWidgetMapper#toNext() toNext()}, {@link com.trolltech.qt.gui.QDataWidgetMapper#toPrevious() toPrevious()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#toLast() toLast()}. <br></DD></DT>
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
Returns the current item delegate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#setItemDelegate(com.trolltech.qt.gui.QAbstractItemDelegate) setItemDelegate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemDelegate itemDelegate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemDelegate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractItemDelegate __qt_itemDelegate(long __this__nativeId);

/**
Returns the name of the property that is used when mapping data to the given <tt>widget</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#mappedSection(com.trolltech.qt.gui.QWidget) mappedSection()}, {@link com.trolltech.qt.gui.QDataWidgetMapper#addMapping(com.trolltech.qt.gui.QWidget, int) addMapping()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#removeMapping(com.trolltech.qt.gui.QWidget) removeMapping()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray mappedPropertyName(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mappedPropertyName_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_mappedPropertyName_QWidget(long __this__nativeId, long widget);

/**
Returns the section the <tt>widget</tt> is mapped to or -1 if the widget is not mapped. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#addMapping(com.trolltech.qt.gui.QWidget, int) addMapping()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#removeMapping(com.trolltech.qt.gui.QWidget) removeMapping()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int mappedSection(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mappedSection_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native int __qt_mappedSection_QWidget(long __this__nativeId, long widget);

/**
Returns the widget that is mapped at <tt>section</tt>, or 0 if no widget is mapped at that section. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#addMapping(com.trolltech.qt.gui.QWidget, int) addMapping()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#removeMapping(com.trolltech.qt.gui.QWidget) removeMapping()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget mappedWidgetAt(int section)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mappedWidgetAt_int(nativeId(), section);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_mappedWidgetAt_int(long __this__nativeId, int section);

/**
Returns the current model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QAbstractItemModel model()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_model(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QAbstractItemModel __qt_model(long __this__nativeId);

/**
This property holds the orientation of the model. If the orientation is {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } (the default), a widget is mapped to a column of a data model. The widget will be populated with the model's data from its mapped column and the row that {@link com.trolltech.qt.gui.QDataWidgetMapper#currentIndex() currentIndex()} points at. <p>Use {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } for tabular data that looks like this: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> 1</td><td> Nokia Corporation and/or its subsidiary(-ies)</td><td> Oslo</td></tr><tr valign="top" class="odd"><td> 2</td><td> Trolltech Pty</td><td> Brisbane</td></tr><tr valign="top" class="even"><td> 3</td><td> Trolltech Inc</td><td> Silicon Valley</td></tr><tr valign="top" class="odd"><td> 4</td><td> Trolltech China</td><td> Beijing</td></tr><tr valign="top" class="even"><td> 5</td><td> Trolltech GmbH</td><td> Berlin</td></tr></table> If the orientation is set to {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical }, a widget is mapped to a row. Calling {@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentIndex(int) setCurrentIndex()} will change the current column. The widget will be populates with the model's data from its mapped row and the column that {@link com.trolltech.qt.gui.QDataWidgetMapper#currentIndex() currentIndex()} points at. <p>Use {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } for tabular data that looks like this: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> 1</td><td> 2</td><td> 3</td><td> 4</td><td> 5</td></tr><tr valign="top" class="odd"><td> Nokia Corporation and/or its subsidiary(-ies)</td><td> Trolltech Pty</td><td> Trolltech Inc</td><td> Trolltech China</td><td> Trolltech GmbH</td></tr><tr valign="top" class="even"><td> Oslo</td><td> Brisbane</td><td> Silicon Valley</td><td> Beijing</td><td> Berlin</td></tr></table> Changing the orientation clears all existing mappings.
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
Removes the mapping for the given <tt>widget</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#addMapping(com.trolltech.qt.gui.QWidget, int) addMapping()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#clearMapping() clearMapping()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeMapping(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (widget != null) {
            while (__rcMappings.remove(widget)) ;
        }
        __qt_removeMapping_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeMapping_QWidget(long __this__nativeId, long widget);

/**
Repopulates all widgets with the current data of the model. All unsubmitted changes will be lost. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#submit() submit()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#setSubmitPolicy(com.trolltech.qt.gui.QDataWidgetMapper.SubmitPolicy) setSubmitPolicy()}. <br></DD></DT>
*/

    public final void revert()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_revert(nativeId());
    }
    native void __qt_revert(long __this__nativeId);

/**
Returns the current root index. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#setRootIndex(com.trolltech.qt.core.QModelIndex) setRootIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex rootIndex()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rootIndex(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_rootIndex(long __this__nativeId);

/**
Sets the current index to the row of the <tt>index</tt> if the orientation is horizontal (the default), otherwise to the column of the <tt>index</tt>. <p>Calls {@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentIndex(int) setCurrentIndex()} internally. This convenience slot can be connected to the signal {@link com.trolltech.qt.gui.QItemSelectionModel#currentRowChanged currentRowChanged() } or {@link com.trolltech.qt.gui.QItemSelectionModel#currentColumnChanged currentColumnChanged() } of another view's {@link com.trolltech.qt.gui.QItemSelectionModel selection model}. <p>The following example illustrates how to update all widgets with new data whenever the selection of a {@link com.trolltech.qt.gui.QTableView QTableView} named <tt>myTableView</tt> changes: <pre class="snippet">
    QDataWidgetMapper mapper = new QDataWidgetMapper();
    myTableView.selectionModel().currentRowChanged.connect(mapper, "setCurrentModelIndex(QModelIndex)");
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#currentIndex() currentIndex()}. <br></DD></DT>
*/

    public final void setCurrentModelIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentModelIndex_QModelIndex(nativeId(), index);
    }
    native void __qt_setCurrentModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Sets the item delegate to <tt>delegate</tt>. The delegate will be used to write data from the model into the widget and from the widget to the model, using {@link com.trolltech.qt.gui.QAbstractItemDelegate#setEditorData(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QModelIndex) QAbstractItemDelegate::setEditorData()} and {@link com.trolltech.qt.gui.QAbstractItemDelegate#setModelData(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QAbstractItemModel, com.trolltech.qt.core.QModelIndex) QAbstractItemDelegate::setModelData()}. <p>The delegate also decides when to apply data and when to change the editor, using {@link com.trolltech.qt.gui.QAbstractItemDelegate#commitData QAbstractItemDelegate::commitData() } and {@link com.trolltech.qt.gui.QAbstractItemDelegate#closeEditor QAbstractItemDelegate::closeEditor() }. <p><b>Warning:</b> You should not share the same instance of a delegate between widget mappers or views. Doing so can cause incorrect or unintuitive editing behavior since each view connected to a given delegate may receive the {@link com.trolltech.qt.gui.QAbstractItemDelegate#closeEditor closeEditor() } signal, and attempt to access, modify or close an editor that has already been closed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#itemDelegate() itemDelegate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemDelegate(com.trolltech.qt.gui.QAbstractItemDelegate delegate)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcItemDelegate = delegate;
        }
        __qt_setItemDelegate_QAbstractItemDelegate(nativeId(), delegate == null ? 0 : delegate.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItemDelegate_QAbstractItemDelegate(long __this__nativeId, long delegate);

/**
Sets the current model to <tt>model</tt>. If another model was set, all mappings to that old model are cleared. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#model() model()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setModel(com.trolltech.qt.core.QAbstractItemModel model)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcModel = model;
        }
        __qt_setModel_QAbstractItemModel(nativeId(), model == null ? 0 : model.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setModel_QAbstractItemModel(long __this__nativeId, long model);

/**
This property holds the orientation of the model. If the orientation is {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } (the default), a widget is mapped to a column of a data model. The widget will be populated with the model's data from its mapped column and the row that {@link com.trolltech.qt.gui.QDataWidgetMapper#currentIndex() currentIndex()} points at. <p>Use {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } for tabular data that looks like this: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> 1</td><td> Nokia Corporation and/or its subsidiary(-ies)</td><td> Oslo</td></tr><tr valign="top" class="odd"><td> 2</td><td> Trolltech Pty</td><td> Brisbane</td></tr><tr valign="top" class="even"><td> 3</td><td> Trolltech Inc</td><td> Silicon Valley</td></tr><tr valign="top" class="odd"><td> 4</td><td> Trolltech China</td><td> Beijing</td></tr><tr valign="top" class="even"><td> 5</td><td> Trolltech GmbH</td><td> Berlin</td></tr></table> If the orientation is set to {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical }, a widget is mapped to a row. Calling {@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentIndex(int) setCurrentIndex()} will change the current column. The widget will be populates with the model's data from its mapped row and the column that {@link com.trolltech.qt.gui.QDataWidgetMapper#currentIndex() currentIndex()} points at. <p>Use {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } for tabular data that looks like this: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> 1</td><td> 2</td><td> 3</td><td> 4</td><td> 5</td></tr><tr valign="top" class="odd"><td> Nokia Corporation and/or its subsidiary(-ies)</td><td> Trolltech Pty</td><td> Trolltech Inc</td><td> Trolltech China</td><td> Trolltech GmbH</td></tr><tr valign="top" class="even"><td> Oslo</td><td> Brisbane</td><td> Silicon Valley</td><td> Beijing</td><td> Berlin</td></tr></table> Changing the orientation clears all existing mappings.
*/

    @com.trolltech.qt.QtPropertyWriter(name="orientation")
    @QtBlockedSlot
    public final void setOrientation(com.trolltech.qt.core.Qt.Orientation aOrientation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), aOrientation.value());
    }
    @QtBlockedSlot
    native void __qt_setOrientation_Orientation(long __this__nativeId, int aOrientation);

/**
Sets the root item to <tt>index</tt>. This can be used to display a branch of a tree. Pass an invalid model index to display the top-most branch. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#rootIndex() rootIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRootIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRootIndex_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_setRootIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This property holds the current submit policy. Changing the current submit policy will revert all widgets to the current data from the model.
*/

    @com.trolltech.qt.QtPropertyWriter(name="submitPolicy")
    @QtBlockedSlot
    public final void setSubmitPolicy(com.trolltech.qt.gui.QDataWidgetMapper.SubmitPolicy policy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSubmitPolicy_SubmitPolicy(nativeId(), policy.value());
    }
    @QtBlockedSlot
    native void __qt_setSubmitPolicy_SubmitPolicy(long __this__nativeId, int policy);

/**
Submits all changes from the mapped widgets to the model. <p>For every mapped section, the item delegate reads the current value from the widget and sets it in the model. Finally, the model's {@link com.trolltech.qt.core.QAbstractItemModel#submit() submit()} method is invoked. <p>Returns true if all the values were submitted, otherwise false. <p>Note: For database models, {@link com.trolltech.qt.sql.QSqlQueryModel#lastError() QSqlQueryModel::lastError()} can be used to retrieve the last error. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#revert() revert()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#setSubmitPolicy(com.trolltech.qt.gui.QDataWidgetMapper.SubmitPolicy) setSubmitPolicy()}. <br></DD></DT>
*/

    public final boolean submit()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_submit(nativeId());
    }
    native boolean __qt_submit(long __this__nativeId);

/**
This property holds the current submit policy. Changing the current submit policy will revert all widgets to the current data from the model.
*/

    @com.trolltech.qt.QtPropertyReader(name="submitPolicy")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QDataWidgetMapper.SubmitPolicy submitPolicy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QDataWidgetMapper.SubmitPolicy.resolve(__qt_submitPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_submitPolicy(long __this__nativeId);

/**
Populates the widgets with data from the first row of the model if the orientation is horizontal (the default), otherwise with data from the first column. <p>This is equivalent to calling <tt>setCurrentIndex(0)</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#toLast() toLast()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentIndex(int) setCurrentIndex()}. <br></DD></DT>
*/

    public final void toFirst()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toFirst(nativeId());
    }
    native void __qt_toFirst(long __this__nativeId);

/**
Populates the widgets with data from the last row of the model if the orientation is horizontal (the default), otherwise with data from the last column. <p>Calls {@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentIndex(int) setCurrentIndex()} internally. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#toFirst() toFirst()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentIndex(int) setCurrentIndex()}. <br></DD></DT>
*/

    public final void toLast()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toLast(nativeId());
    }
    native void __qt_toLast(long __this__nativeId);

/**
Populates the widgets with data from the next row of the model if the orientation is horizontal (the default), otherwise with data from the next column. <p>Calls {@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentIndex(int) setCurrentIndex()} internally. Does nothing if there is no next row in the model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#toPrevious() toPrevious()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentIndex(int) setCurrentIndex()}. <br></DD></DT>
*/

    public final void toNext()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toNext(nativeId());
    }
    native void __qt_toNext(long __this__nativeId);

/**
Populates the widgets with data from the previous row of the model if the orientation is horizontal (the default), otherwise with data from the previous column. <p>Calls {@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentIndex(int) setCurrentIndex()} internally. Does nothing if there is no previous row in the model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#toNext() toNext()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentIndex(int) setCurrentIndex()}. <br></DD></DT>
*/

    public final void toPrevious()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toPrevious(nativeId());
    }
    native void __qt_toPrevious(long __this__nativeId);

/**
This property holds the current row or column. The widgets are populated with with data from the row at <tt>index</tt> if the orientation is horizontal (the default), otherwise with data from the column at <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDataWidgetMapper#setCurrentModelIndex(com.trolltech.qt.core.QModelIndex) setCurrentModelIndex()}, {@link com.trolltech.qt.gui.QDataWidgetMapper#toFirst() toFirst()}, {@link com.trolltech.qt.gui.QDataWidgetMapper#toNext() toNext()}, {@link com.trolltech.qt.gui.QDataWidgetMapper#toPrevious() toPrevious()}, and {@link com.trolltech.qt.gui.QDataWidgetMapper#toLast() toLast()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="currentIndex")
    public void setCurrentIndex(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentIndex_int(nativeId(), index);
    }
    native void __qt_setCurrentIndex_int(long __this__nativeId, int index);

/**
@exclude
*/

    public static native QDataWidgetMapper fromNativePointer(QNativePointer nativePointer);

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

    protected QDataWidgetMapper(QPrivateConstructor p) { super(p); } 
}
