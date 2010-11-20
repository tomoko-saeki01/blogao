package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QItemEditorFactory class provides widgets for editing item data in views and delegates. When editing data in an item view, editors are created and displayed by a delegate. {@link com.trolltech.qt.gui.QItemDelegate QItemDelegate}, which is the delegate by default installed on Qt's item views, uses a QItemEditorFactory to create editors for it. A default unique instance provided by QItemEditorFactory is used by all item delegates. If you set a new default factory with {@link com.trolltech.qt.gui.QItemEditorFactory#setDefaultFactory(com.trolltech.qt.gui.QItemEditorFactory) setDefaultFactory()}, the new factory will be used by existing and new delegates. <p>A factory keeps a collection of {@link com.trolltech.qt.gui.QItemEditorCreatorBase QItemEditorCreatorBase} instances, which are specialized editors that produce editors for one particular {@link com.trolltech.qt.QVariant QVariant} data type (All Qt models store their data in {@link com.trolltech.qt.QVariant QVariant}s).<a name="standard-editing-widgets"><h2>Standard Editing Widgets</h2> The standard factory implementation provides editors for a variety of data types. These are created whenever a delegate needs to provide an editor for data supplied by a model. The following table shows the relationship between types and the standard editors provided. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Type</center></th><th><center> Editor Widget</center></th></tr></thead><tr valign="top" class="even"><td> bool</td><td> {@link com.trolltech.qt.gui.QComboBox QComboBox}</td></tr><tr valign="top" class="odd"><td> double</td><td> {@link com.trolltech.qt.gui.QDoubleSpinBox QDoubleSpinBox}</td></tr><tr valign="top" class="even"><td> int</td><td rowspan=2> {@link com.trolltech.qt.gui.QSpinBox QSpinBox}</td></tr><tr valign="top" class="odd"><td> unsigned int</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.QDate QDate}</td><td> {@link com.trolltech.qt.gui.QDateEdit QDateEdit}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QDateTime QDateTime}</td><td> {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QPixmap QPixmap}</td><td> {@link com.trolltech.qt.gui.QLabel QLabel}</td></tr><tr valign="top" class="odd"><td> QString</td><td> {@link com.trolltech.qt.gui.QLineEdit QLineEdit}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.QTime QTime}</td><td> {@link com.trolltech.qt.gui.QTimeEdit QTimeEdit}</td></tr></table> Additional editors can be registered with the {@link com.trolltech.qt.gui.QItemEditorFactory#registerEditor(int, com.trolltech.qt.gui.QItemEditorCreatorBase) registerEditor()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemDelegate QItemDelegate}, {@link <a href="../model-view-programming.html">Model/View Programming</a>}, and {@link <a href="../qtjambi-coloreditorfactory.html">Color Editor Factory Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QItemEditorFactory extends com.trolltech.qt.QtJambiObject
{

    private static Object __rcDefaultItemEditorFactory = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a new item editor factory.
*/

    public QItemEditorFactory(){
        super((QPrivateConstructor)null);
        __qt_QItemEditorFactory();
    }

    native void __qt_QItemEditorFactory();

/**
Registers an item editor creator specified by <tt>creator</tt> for the given <tt>type</tt> of data. <p><b>Note:</b> The factory takes ownership of the item editor creator and will destroy it if a new creator for the same type is registered later. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemEditorFactory#createEditor(int, com.trolltech.qt.gui.QWidget) createEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void registerEditor(int type, com.trolltech.qt.gui.QItemEditorCreatorBase creator)    {
        if (creator != null) {
            creator.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_registerEditor_int_QItemEditorCreatorBase(nativeId(), type, creator == null ? 0 : creator.nativeId());
    }
    @QtBlockedSlot
    native void __qt_registerEditor_int_QItemEditorCreatorBase(long __this__nativeId, int type, long creator);

/**
Creates an editor widget with the given <tt>parent</tt> for the specified <tt>type</tt> of data, and returns it as a {@link com.trolltech.qt.gui.QWidget QWidget}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemEditorFactory#registerEditor(int, com.trolltech.qt.gui.QItemEditorCreatorBase) registerEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QWidget createEditor(int type, com.trolltech.qt.gui.QWidget parent)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createEditor_int_QWidget(nativeId(), type, parent == null ? 0 : parent.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_createEditor_int_QWidget(long __this__nativeId, int type, long parent);

/**
Returns the property name used to access data for the given <tt>type</tt> of data.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QByteArray valuePropertyName(int type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valuePropertyName_int(nativeId(), type);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_valuePropertyName_int(long __this__nativeId, int type);

/**
Returns the default item editor factory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemEditorFactory#setDefaultFactory(com.trolltech.qt.gui.QItemEditorFactory) setDefaultFactory()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QItemEditorFactory defaultFactory();

/**
Sets the default item editor factory to the given <tt>factory</tt>. Both new and existing delegates will use the new factory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QItemEditorFactory#defaultFactory() defaultFactory()}. <br></DD></DT>
*/

    public static void setDefaultFactory(com.trolltech.qt.gui.QItemEditorFactory factory)    {
        {
            __rcDefaultItemEditorFactory = factory;
        }
        __qt_setDefaultFactory_QItemEditorFactory(factory == null ? 0 : factory.nativeId());
    }
    native static void __qt_setDefaultFactory_QItemEditorFactory(long factory);

/**
@exclude
*/

    public static native QItemEditorFactory fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QItemEditorFactory(QPrivateConstructor p) { super(p); } 
}
