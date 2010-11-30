package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QItemEditorCreatorBase class provides an abstract base class that must be subclassed when implementing new item editor creators. QItemEditorCreatorBase objects are specialized widget factories that provide editor widgets for one particular {@link com.trolltech.qt.QVariant QVariant} data type. They are used by {@link com.trolltech.qt.gui.QItemEditorFactory QItemEditorFactory} to create editors for {@link com.trolltech.qt.gui.QItemDelegate QItemDelegate}s. Creator bases must be registered with {@link com.trolltech.qt.gui.QItemEditorFactory#registerEditor(int, com.trolltech.qt.gui.QItemEditorCreatorBase) QItemEditorFactory::registerEditor()}. <p>An editor should provide a user property for the data it edits. QItemDelagates can then access the property using Qt's {@link <a href="../metaobjects.html">meta-object system</a>} to set and retrieve the editing data. A property is set as the user property with the USER keyword: <pre class="snippet">
    &#64;QtPropertyReader
    &#64;QtPropertyUser
    public QColor color() { return color; }

    &#64;QtPropertyWriter
    public void setColor(QColor color) { this.color = color; }
</pre> If the editor does not provide a user property, it must return the name of the property from {@link com.trolltech.qt.gui.QItemEditorCreatorBase#valuePropertyName() valuePropertyName()}; delegates will then use the name to access the property. If a user property exists, item delegates will not call {@link com.trolltech.qt.gui.QItemEditorCreatorBase#valuePropertyName() valuePropertyName()}. <p>{@link com.trolltech.qt.gui.QStandardItemEditorCreator QStandardItemEditorCreator} is a convenience template class that can be used to register widgets without the need to subclass QItemEditorCreatorBase. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStandardItemEditorCreator QStandardItemEditorCreator}, {@link com.trolltech.qt.gui.QItemEditorFactory QItemEditorFactory}, {@link <a href="../model-view-programming.html">Model/View Programming</a>}, and {@link <a href="../qtjambi-coloreditorfactory.html">Color Editor Factory Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QItemEditorCreatorBase extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QItemEditorCreatorBase {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QWidget createWidget(com.trolltech.qt.gui.QWidget parent) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_createWidget_QWidget(nativeId(), parent == null ? 0 : parent.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QByteArray valuePropertyName() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_valuePropertyName(nativeId());
        }
    }


/**
This is an overloaded method provided for convenience.
*/

    public QItemEditorCreatorBase(){
        super((QPrivateConstructor)null);
        __qt_QItemEditorCreatorBase();
    }

    native void __qt_QItemEditorCreatorBase();

/**
Returns an editor widget with the given <tt>parent</tt>. <p>When implementing this function in subclasses of this class, you must construct and return new editor widgets with the parent widget specified.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QWidget createWidget(com.trolltech.qt.gui.QWidget parent);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_createWidget_QWidget(long __this__nativeId, long parent);

/**
Returns the name of the property used to get and set values in the creator's editor widgets. <p>When implementing this function in subclasses, you must ensure that the editor widget's property specified by this function can accept the type the creator is registered for. For example, a creator which constructs {@link com.trolltech.qt.gui.QCheckBox QCheckBox} widgets to edit boolean values would return the {@link QAbstractButton#isCheckable() checkable} property name from this function, and must be registered in the item editor factory for the {@link com.trolltech.qt.QVariant.Type QVariant::Bool } type. <p>Note: Since Qt 4.2 the item delegates query the user property of widgets, and only call this function if the widget has no user property. You can override this behavior by reimplementing {@link com.trolltech.qt.gui.QAbstractItemDelegate#setModelData(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QAbstractItemModel, com.trolltech.qt.core.QModelIndex) QAbstractItemDelegate::setModelData()} and {@link com.trolltech.qt.gui.QAbstractItemDelegate#setEditorData(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QModelIndex) QAbstractItemDelegate::setEditorData()}. <p><DT><b>See also:</b><br><DD>QMetaObject::userProperty(), and {@link com.trolltech.qt.gui.QItemEditorFactory#registerEditor(int, com.trolltech.qt.gui.QItemEditorCreatorBase) QItemEditorFactory::registerEditor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QByteArray valuePropertyName();
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_valuePropertyName(long __this__nativeId);

/**
@exclude
*/

    public static native QItemEditorCreatorBase fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QItemEditorCreatorBase(QPrivateConstructor p) { super(p); } 
}
