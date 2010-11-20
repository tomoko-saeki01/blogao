package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAccessiblePlugin class provides an abstract base for accessibility plugins. Writing an accessibility plugin is achieved by subclassing this base class, reimplementing the pure virtual functions {@link com.trolltech.qt.gui.QAccessiblePlugin#keys() keys()} and {@link com.trolltech.qt.gui.QAccessiblePlugin#create(java.lang.String, com.trolltech.qt.core.QObject) create()}, and exporting the class with the Q_EXPORT_PLUGIN2() macro. <p><DT><b>See also:</b><br><DD>QAccessibleBridgePlugin, and {@link <a href="../plugins-howto.html">How to Create Qt Plugins</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAccessiblePlugin extends com.trolltech.qt.core.QObject
    implements com.trolltech.qt.gui.QAbstractAccessibleFactoryInterface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAccessiblePlugin {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessibleInterface create(java.lang.String key, com.trolltech.qt.core.QObject object) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_create_String_QObject(nativeId(), key, object == null ? 0 : object.nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.util.List<java.lang.String> keys() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_keys(nativeId());
        }
    }



/**
Constructs an accessibility plugin with the given <tt>parent</tt>. This is invoked automatically by the Q_EXPORT_PLUGIN2() macro.
*/

    public QAccessiblePlugin() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an accessibility plugin with the given <tt>parent</tt>. This is invoked automatically by the Q_EXPORT_PLUGIN2() macro.
*/

    public QAccessiblePlugin(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QAccessiblePlugin_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAccessiblePlugin_QObject(long parent);

/**
Creates and returns a {@link com.trolltech.qt.gui.QAccessibleInterface QAccessibleInterface} implementation for the class <tt>key</tt> and the object <tt>object</tt>. Keys are case sensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessiblePlugin#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QAccessibleInterface create(java.lang.String key, com.trolltech.qt.core.QObject object);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAccessibleInterface __qt_create_String_QObject(long __this__nativeId, java.lang.String key, long object);

/**
Returns the list of keys this plugin supports. <p>These keys must be the class names that this plugin provides an accessibility implementation for. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessiblePlugin#create(java.lang.String, com.trolltech.qt.core.QObject) create()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> keys();
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_keys(long __this__nativeId);

/**
@exclude
*/

    public static native QAccessiblePlugin fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAccessiblePlugin(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractAccessibleFactory(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractFactory(long ptr);
}
