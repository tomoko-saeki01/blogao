package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QImageIOPlugin class defines an interface for writing an image format plugin. QImageIOPlugin is a factory for creating {@link com.trolltech.qt.gui.QImageIOHandler QImageIOHandler} objects, which are used internally by {@link com.trolltech.qt.gui.QImageReader QImageReader} and {@link com.trolltech.qt.gui.QImageWriter QImageWriter} to add support for different image formats to Qt. <p>Writing an image I/O plugin is achieved by subclassing this base class, reimplementing the pure virtual functions {@link com.trolltech.qt.gui.QImageIOPlugin#capabilities(com.trolltech.qt.core.QIODevice, com.trolltech.qt.core.QByteArray) capabilities()}, {@link com.trolltech.qt.gui.QImageIOPlugin#create(com.trolltech.qt.core.QIODevice, com.trolltech.qt.core.QByteArray) create()}, and {@link com.trolltech.qt.gui.QImageIOPlugin#keys() keys()}, and exporting the class with the Q_EXPORT_PLUGIN2() macro. See {@link <a href="../plugins-howto.html">How to Create Qt Plugins</a>} for details. <p>An image format plugin can support three capabilities: reading ({@link com.trolltech.qt.gui.QImageIOPlugin.Capability CanRead }), writing ({@link com.trolltech.qt.gui.QImageIOPlugin.Capability CanWrite }) and incremental reading ({@link com.trolltech.qt.gui.QImageIOPlugin.Capability CanReadIncremental }). Reimplement {@link com.trolltech.qt.gui.QImageIOPlugin#capabilities(com.trolltech.qt.core.QIODevice, com.trolltech.qt.core.QByteArray) capabilities()} in you subclass to expose the capabilities of your image format. <p>{@link com.trolltech.qt.gui.QImageIOPlugin#create(com.trolltech.qt.core.QIODevice, com.trolltech.qt.core.QByteArray) create()} should create an instance of your {@link com.trolltech.qt.gui.QImageIOHandler QImageIOHandler} subclass, with the provided device and format properly set, and return this handler. You must also reimplement {@link com.trolltech.qt.gui.QImageIOPlugin#keys() keys()} so that Qt knows which image formats your plugin supports. <p>Different plugins can support different capabilities. For example, you may have one plugin that supports reading the GIF format, and another that supports writing. Qt will select the correct plugin for the job, depending on the return value of {@link com.trolltech.qt.gui.QImageIOPlugin#capabilities(com.trolltech.qt.core.QIODevice, com.trolltech.qt.core.QByteArray) capabilities()}. If several plugins support the same capability, Qt will select one arbitrarily. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOHandler QImageIOHandler}, and {@link <a href="../plugins-howto.html">How to Create Qt Plugins</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QImageIOPlugin extends com.trolltech.qt.core.QObject
    implements com.trolltech.qt.gui.QAbstractImageIOHandlerFactoryInterface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QImageIOPlugin {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QImageIOPlugin.Capabilities capabilities(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.core.QByteArray format) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return new com.trolltech.qt.gui.QImageIOPlugin.Capabilities(super.__qt_capabilities_QIODevice_QByteArray(nativeId(), device == null ? 0 : device.nativeId(), format == null ? 0 : format.nativeId()));
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QImageIOHandler create(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.core.QByteArray format) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_create_QIODevice_QByteArray(nativeId(), device == null ? 0 : device.nativeId(), format == null ? 0 : format.nativeId());
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
This enum describes the capabilities of a {@link com.trolltech.qt.gui.QImageIOPlugin QImageIOPlugin}.
*/
@QtBlockedEnum
    public enum Capability implements com.trolltech.qt.QtEnumerator {
/**
 The plugin can read images.
*/

        CanRead(1),
/**
 The plugin can write images.
*/

        CanWrite(2),
/**
 The plugin can read images incrementally.
*/

        CanReadIncremental(4);

        Capability(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QImageIOPlugin$Capabilities with the specified <tt>com.trolltech.qt.gui.QImageIOPlugin$Capability[]</tt> QImageIOPlugin$Capability values set.</brief>
*/

        public static Capabilities createQFlags(Capability ... values) {
            return new Capabilities(values);
        }
/**
<brief>Returns the QImageIOPlugin$Capability constant with the specified <tt>int</tt>.</brief>
*/

        public static Capability resolve(int value) {
            return (Capability) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return CanRead;
            case 2: return CanWrite;
            case 4: return CanReadIncremental;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class Capabilities extends com.trolltech.qt.QFlags<Capability> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QImageIOPlugin-Capabilities with the specified <tt>com.trolltech.qt.gui.QImageIOPlugin.Capability[]</tt>. flags set.</brief>
*/

        public Capabilities(Capability ... args) { super(args); }
        public Capabilities(int value) { setValue(value); }
    }




/**
Constructs an image plugin with the given <tt>parent</tt>. This is invoked automatically by the Q_EXPORT_PLUGIN2() macro.
*/

    public QImageIOPlugin() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an image plugin with the given <tt>parent</tt>. This is invoked automatically by the Q_EXPORT_PLUGIN2() macro.
*/

    public QImageIOPlugin(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QImageIOPlugin_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QImageIOPlugin_QObject(long parent);

/**
Returns the capabilities on the plugin, based on the data in <tt>device</tt> and the format <tt>format</tt>. For example, if the {@link com.trolltech.qt.gui.QImageIOHandler QImageIOHandler} supports the BMP format, and the data in the device starts with the characters "BM", this function should return {@link com.trolltech.qt.gui.QImageIOPlugin.Capability CanRead }. If <tt>format</tt> is "bmp" and the handler supports both reading and writing, this function should return {@link com.trolltech.qt.gui.QImageIOPlugin.Capability CanRead } | {@link com.trolltech.qt.gui.QImageIOPlugin.Capability CanWrite }.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QImageIOPlugin.Capabilities capabilities(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.core.QByteArray format);
    @QtBlockedSlot
    native int __qt_capabilities_QIODevice_QByteArray(long __this__nativeId, long device, long format);

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

    public static native QImageIOPlugin fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QImageIOPlugin(QPrivateConstructor p) { super(p); } 

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
