package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QFileIconProvider class provides file icons for the {@link com.trolltech.qt.gui.QDirModel QDirModel} class.
*/
@QtJambiGeneratedClass
public class QFileIconProvider extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    public enum IconType implements com.trolltech.qt.QtEnumerator {
/**

*/

        Computer(0),
/**

*/

        Desktop(1),
/**

*/

        Trashcan(2),
/**

*/

        Network(3),
/**

*/

        Drive(4),
/**

*/

        Folder(5),
/**

*/

        File(6);

        IconType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFileIconProvider$IconType constant with the specified <tt>int</tt>.</brief>
*/

        public static IconType resolve(int value) {
            return (IconType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Computer;
            case 1: return Desktop;
            case 2: return Trashcan;
            case 3: return Network;
            case 4: return Drive;
            case 5: return Folder;
            case 6: return File;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a file icon provider.
*/

    public QFileIconProvider(){
        super((QPrivateConstructor)null);
        __qt_QFileIconProvider();
    }

    native void __qt_QFileIconProvider();

/**
Returns an icon set for the given <tt>type</tt>.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QIcon icon(com.trolltech.qt.gui.QFileIconProvider.IconType type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_icon_IconType(nativeId(), type.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon_IconType(long __this__nativeId, int type);

/**
Returns an icon for the file described by <tt>info</tt>.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QIcon icon(com.trolltech.qt.core.QFileInfo info)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_icon_QFileInfo(nativeId(), info == null ? 0 : info.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon_QFileInfo(long __this__nativeId, long info);

/**
Returns the type of the file described by <tt>info</tt>.
*/

    @QtBlockedSlot
    public java.lang.String type(com.trolltech.qt.core.QFileInfo info)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type_QFileInfo(nativeId(), info == null ? 0 : info.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_type_QFileInfo(long __this__nativeId, long info);

/**
@exclude
*/

    public static native QFileIconProvider fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFileIconProvider(QPrivateConstructor p) { super(p); } 
}
