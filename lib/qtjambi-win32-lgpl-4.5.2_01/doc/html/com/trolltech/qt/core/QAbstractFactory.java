package com.trolltech.qt.core;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public abstract class QAbstractFactory extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.core.QAbstractFactory {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public java.util.List<java.lang.String> keys() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_keys(nativeId());
        }
    }


/**

*/

    public QAbstractFactory(){
        super((QPrivateConstructor)null);
        __qt_QAbstractFactory();
    }

    native void __qt_QAbstractFactory();

/**
Returns the list of keys this abstract factory supports. Each key represents an object the factory can produce.
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> keys();
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_keys(long __this__nativeId);

/**
@exclude
*/

    public static native QAbstractFactory fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractFactory(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractFactory(long ptr);
}
