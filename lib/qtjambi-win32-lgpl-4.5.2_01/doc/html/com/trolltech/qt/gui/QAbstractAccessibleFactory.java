package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The {@link com.trolltech.qt.gui.QAccessiblePlugin QAccessiblePlugin} class provides an abstract base for accessibility plugins. Writing an accessibility plugin is achieved by subclassing this base class, reimplementing the pure virtual functions {@link com.trolltech.qt.gui.QAccessiblePlugin#keys() keys()} and {@link com.trolltech.qt.gui.QAccessiblePlugin#create(java.lang.String, com.trolltech.qt.core.QObject) create()}, and exporting the class with the Q_EXPORT_PLUGIN2() macro. <p><DT><b>See also:</b><br><DD>QAccessibleBridgePlugin, and {@link <a href="../plugins-howto.html">How to Create Qt Plugins</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractAccessibleFactory extends com.trolltech.qt.gui.QAccessible
    implements com.trolltech.qt.gui.QAbstractAccessibleFactoryInterface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractAccessibleFactory {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessibleInterface create(java.lang.String key, com.trolltech.qt.core.QObject object) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_create_String_QObject(nativeId(), key, object == null ? 0 : object.nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.util.List<java.lang.String> keys() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_keys(nativeId());
        }
    }


/**
This is an overloaded method provided for convenience.
*/

    public QAbstractAccessibleFactory(){
        super((QPrivateConstructor)null);
        __qt_QAbstractAccessibleFactory();
    }

    native void __qt_QAbstractAccessibleFactory();

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

    public static native QAbstractAccessibleFactory fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractAccessibleFactory(QPrivateConstructor p) { super(p); } 

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
