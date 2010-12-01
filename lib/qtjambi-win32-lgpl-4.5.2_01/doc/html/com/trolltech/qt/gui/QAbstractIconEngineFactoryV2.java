package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public abstract class QAbstractIconEngineFactoryV2 extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QAbstractIconEngineFactoryV2Interface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractIconEngineFactoryV2 {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QIconEngineV2 create(java.lang.String filename) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_create_String(nativeId(), filename);
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

    public QAbstractIconEngineFactoryV2(){
        super((QPrivateConstructor)null);
        __qt_QAbstractIconEngineFactoryV2();
    }

    native void __qt_QAbstractIconEngineFactoryV2();


/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIconEngineV2 create() {
        return create((java.lang.String)null);
    }
/**

*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QIconEngineV2 create(java.lang.String filename);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIconEngineV2 __qt_create_String(long __this__nativeId, java.lang.String filename);

/**
Returns a list of icon engine keys that this plugin supports. The keys correspond to the suffix of the file or resource name used when the plugin was created. Keys are case insensitive. <p><DT><b>See also:</b><br><DD>create(). <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> keys();
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_keys(long __this__nativeId);

/**
@exclude
*/

    public static native QAbstractIconEngineFactoryV2 fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractIconEngineFactoryV2(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractIconEngineFactoryV2(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractFactory(long ptr);
}
