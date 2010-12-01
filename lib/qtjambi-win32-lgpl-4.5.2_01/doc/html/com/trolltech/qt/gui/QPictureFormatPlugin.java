package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPictureFormatPlugin class provides an abstract base for custom picture format plugins. The picture format plugin is a simple plugin interface that makes it easy to create custom picture formats that can be used transparently by applications. <p>Writing an picture format plugin is achieved by subclassing this base class, reimplementing the pure virtual functions {@link com.trolltech.qt.gui.QPictureFormatPlugin#keys() keys()}, {@link com.trolltech.qt.gui.QPictureFormatPlugin#loadPicture(java.lang.String, java.lang.String, com.trolltech.qt.gui.QPicture) loadPicture()}, {@link com.trolltech.qt.gui.QPictureFormatPlugin#savePicture(java.lang.String, java.lang.String, com.trolltech.qt.gui.QPicture) savePicture()}, and {@link com.trolltech.qt.gui.QPictureFormatPlugin#installIOHandler(java.lang.String) installIOHandler()}, and exporting the class with the Q_EXPORT_PLUGIN2() macro. <p><DT><b>See also:</b><br><DD>{@link <a href="../plugins-howto.html">How to Create Qt Plugins</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QPictureFormatPlugin extends com.trolltech.qt.core.QObject
    implements com.trolltech.qt.gui.QAbstractPictureFormatInterface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QPictureFormatPlugin {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public boolean installIOHandler(java.lang.String format) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_installIOHandler_String(nativeId(), format);
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
Constructs an picture format plugin with the given <tt>parent</tt>. This is invoked automatically by the Q_EXPORT_PLUGIN2() macro.
*/

    public QPictureFormatPlugin() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an picture format plugin with the given <tt>parent</tt>. This is invoked automatically by the Q_EXPORT_PLUGIN2() macro.
*/

    public QPictureFormatPlugin(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QPictureFormatPlugin_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QPictureFormatPlugin_QObject(long parent);

/**
Installs a {@link com.trolltech.qt.gui.QPictureIO QPictureIO} picture I/O handler for the picture format <tt>format</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureFormatPlugin#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean installIOHandler(java.lang.String format);
    @QtBlockedSlot
    native boolean __qt_installIOHandler_String(long __this__nativeId, java.lang.String format);

/**
Returns the list of picture formats this plugin supports. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureFormatPlugin#installIOHandler(java.lang.String) installIOHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> keys();
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_keys(long __this__nativeId);

/**
Loads the picture stored in the file called <tt>fileName</tt>, with the given <tt>format</tt>, into *<tt>picture</tt>. Returns true on success; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureFormatPlugin#savePicture(java.lang.String, java.lang.String, com.trolltech.qt.gui.QPicture) savePicture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean loadPicture(java.lang.String format, java.lang.String filename, com.trolltech.qt.gui.QPicture pic)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_loadPicture_String_String_nativepointer(nativeId(), format, filename, pic);
    }
    @QtBlockedSlot
    native boolean __qt_loadPicture_String_String_nativepointer(long __this__nativeId, java.lang.String format, java.lang.String filename, com.trolltech.qt.gui.QPicture pic);

/**
Saves the given <tt>picture</tt> into the file called <tt>fileName</tt>, using the specified <tt>format</tt>. Returns true on success; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureFormatPlugin#loadPicture(java.lang.String, java.lang.String, com.trolltech.qt.gui.QPicture) loadPicture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean savePicture(java.lang.String format, java.lang.String filename, com.trolltech.qt.gui.QPicture pic)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_savePicture_String_String_QPicture(nativeId(), format, filename, pic == null ? 0 : pic.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_savePicture_String_String_QPicture(long __this__nativeId, java.lang.String format, java.lang.String filename, long pic);

/**
@exclude
*/

    public static native QPictureFormatPlugin fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPictureFormatPlugin(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractPictureFormat(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractFactory(long ptr);
}
