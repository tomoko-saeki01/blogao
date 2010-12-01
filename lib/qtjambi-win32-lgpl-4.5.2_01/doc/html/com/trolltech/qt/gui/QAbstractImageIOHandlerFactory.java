package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public abstract class QAbstractImageIOHandlerFactory extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QAbstractImageIOHandlerFactoryInterface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractImageIOHandlerFactory {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QImageIOHandler create(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.core.QByteArray format) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_create_QIODevice_QByteArray(nativeId(), device == null ? 0 : device.nativeId(), format == null ? 0 : format.nativeId());
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

*/

    public QAbstractImageIOHandlerFactory(){
        super((QPrivateConstructor)null);
        __qt_QAbstractImageIOHandlerFactory();
    }

    native void __qt_QAbstractImageIOHandlerFactory();


/**
Creates and returns a {@link com.trolltech.qt.gui.QImageIOHandler QImageIOHandler} subclass, with <tt>device</tt> and <tt>format</tt> set. The <tt>format</tt> must come from the list returned by {@link com.trolltech.qt.gui.QImageIOPlugin#keys() keys()}. Format names are case sensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOPlugin#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImageIOHandler create(com.trolltech.qt.core.QIODevice device) {
        return create(device, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Creates and returns a {@link com.trolltech.qt.gui.QImageIOHandler QImageIOHandler} subclass, with <tt>device</tt> and <tt>format</tt> set. The <tt>format</tt> must come from the list returned by {@link com.trolltech.qt.gui.QImageIOPlugin#keys() keys()}. Format names are case sensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOPlugin#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QImageIOHandler create(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.core.QByteArray format);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImageIOHandler __qt_create_QIODevice_QByteArray(long __this__nativeId, long device, long format);

/**
Returns the list of image keys this plugin supports. <p>These keys are usually the names of the image formats that are implemented in the plugin (e.g., "jpg" or "gif"). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOPlugin#capabilities(com.trolltech.qt.core.QIODevice, com.trolltech.qt.core.QByteArray) capabilities()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> keys();
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_keys(long __this__nativeId);

/**
@exclude
*/

    public static native QAbstractImageIOHandlerFactory fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractImageIOHandlerFactory(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractImageIOHandlerFactory(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractFactory(long ptr);
}
