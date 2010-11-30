package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The {@link com.trolltech.qt.gui.QStyleFactory QStyleFactory} class creates {@link com.trolltech.qt.gui.QStyle QStyle} objects. The {@link com.trolltech.qt.gui.QStyle QStyle} class is an abstract base class that encapsulates the look and feel of a GUI. {@link com.trolltech.qt.gui.QStyleFactory QStyleFactory} creates a {@link com.trolltech.qt.gui.QStyle QStyle} object using the {@link com.trolltech.qt.gui.QStyleFactory#create(java.lang.String) create()} function and a key identifying the style. The styles are either built-in or dynamically loaded from a style plugin (see {@link com.trolltech.qt.gui.QStylePlugin QStylePlugin}). <p>The valid keys can be retrieved using the {@link com.trolltech.qt.gui.QStyleFactory#keys() keys()} function. Typically they include "windows", "motif", "cde", "plastique" and "cleanlooks". Depending on the platform, "windowsxp", "windowsvista" and "macintosh" may be available. Note that keys are case insensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle QStyle}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractStyleFactory extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QAbstractStyleFactoryInterface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractStyleFactory {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QStyle create(java.lang.String key) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_create_String(nativeId(), key);
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

    public QAbstractStyleFactory(){
        super((QPrivateConstructor)null);
        __qt_QAbstractStyleFactory();
    }

    native void __qt_QAbstractStyleFactory();

/**
Creates and returns a {@link com.trolltech.qt.gui.QStyle QStyle} object that matches the given <tt>key</tt>, or returns 0 if no matching style is found. <p>Both built-in styles and styles from style plugins are queried for a matching style. <p><b>Note:</b> The keys used are case insensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleFactory#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QStyle create(java.lang.String key);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStyle __qt_create_String(long __this__nativeId, java.lang.String key);

/**
Returns the list of valid keys, i. . the keys this factory can create styles for. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleFactory#create(java.lang.String) create()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> keys();
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_keys(long __this__nativeId);

/**
@exclude
*/

    public static native QAbstractStyleFactory fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractStyleFactory(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractStyleFactory(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractFactory(long ptr);
}
