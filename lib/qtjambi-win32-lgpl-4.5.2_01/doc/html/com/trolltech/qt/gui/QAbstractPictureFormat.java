package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public abstract class QAbstractPictureFormat extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QAbstractPictureFormatInterface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractPictureFormat {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public boolean installIOHandler(java.lang.String arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_installIOHandler_String(nativeId(), arg__1);
        }

        @Override
        @QtBlockedSlot
        public java.util.List<java.lang.String> keys() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_keys(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean loadPicture(java.lang.String format, java.lang.String filename, com.trolltech.qt.gui.QPicture arg__3) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_loadPicture_String_String_nativepointer(nativeId(), format, filename, arg__3);
        }

        @Override
        @QtBlockedSlot
        public boolean savePicture(java.lang.String format, java.lang.String filename, com.trolltech.qt.gui.QPicture arg__3) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_savePicture_String_String_QPicture(nativeId(), format, filename, arg__3 == null ? 0 : arg__3.nativeId());
        }
    }


/**

*/

    public QAbstractPictureFormat(){
        super((QPrivateConstructor)null);
        __qt_QAbstractPictureFormat();
    }

    native void __qt_QAbstractPictureFormat();

/**
Installs a {@link com.trolltech.qt.gui.QPictureIO QPictureIO} picture I/O handler for the picture format <tt>format</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureFormatPlugin#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean installIOHandler(java.lang.String arg__1);
    @QtBlockedSlot
    native boolean __qt_installIOHandler_String(long __this__nativeId, java.lang.String arg__1);

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
    public abstract boolean loadPicture(java.lang.String format, java.lang.String filename, com.trolltech.qt.gui.QPicture arg__3);
    @QtBlockedSlot
    native boolean __qt_loadPicture_String_String_nativepointer(long __this__nativeId, java.lang.String format, java.lang.String filename, com.trolltech.qt.gui.QPicture arg__3);

/**
Saves the given <tt>picture</tt> into the file called <tt>fileName</tt>, using the specified <tt>format</tt>. Returns true on success; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureFormatPlugin#loadPicture(java.lang.String, java.lang.String, com.trolltech.qt.gui.QPicture) loadPicture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean savePicture(java.lang.String format, java.lang.String filename, com.trolltech.qt.gui.QPicture arg__3);
    @QtBlockedSlot
    native boolean __qt_savePicture_String_String_QPicture(long __this__nativeId, java.lang.String format, java.lang.String filename, long arg__3);

/**
@exclude
*/

    public static native QAbstractPictureFormat fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractPictureFormat(QPrivateConstructor p) { super(p); } 

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
