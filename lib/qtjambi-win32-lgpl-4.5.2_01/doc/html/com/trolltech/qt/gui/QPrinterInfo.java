package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPrinterInfo class gives access to information about existing printers. Use the static functions to generate a list of QPrinterInfo objects. Each QPrinterInfo object in the list represents a single printer and can be queried for name, supported paper sizes, and whether or not it is the default printer.
*/
@QtJambiGeneratedClass
public class QPrinterInfo extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty QPrinterInfo object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinterInfo#isNull() isNull()}. <br></DD></DT>
*/

    public QPrinterInfo(){
        super((QPrivateConstructor)null);
        __qt_QPrinterInfo();
    }

    native void __qt_QPrinterInfo();

/**
Constructs a QPrinterInfo object from <tt>printer</tt>.
*/

    public QPrinterInfo(com.trolltech.qt.gui.QPrinter printer){
        super((QPrivateConstructor)null);
        __qt_QPrinterInfo_QPrinter(printer == null ? 0 : printer.nativeId());
    }

    native void __qt_QPrinterInfo_QPrinter(long printer);

/**
Constructs a copy of <tt>src</tt>.
*/

    public QPrinterInfo(com.trolltech.qt.gui.QPrinterInfo src){
        super((QPrivateConstructor)null);
        __qt_QPrinterInfo_QPrinterInfo(src == null ? 0 : src.nativeId());
    }

    native void __qt_QPrinterInfo_QPrinterInfo(long src);

/**
Returns whether this printer is the default printer.
*/

    @QtBlockedSlot
    public final boolean isDefault()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDefault(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDefault(long __this__nativeId);

/**
Returns whether this QPrinterInfo object holds a printer definition. <p>An empty QPrinterInfo object could result for example from calling {@link com.trolltech.qt.gui.QPrinterInfo#defaultPrinter() defaultPrinter()} when there are no printers on the system.
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

/**
Returns the name of the printer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setPrinterName(java.lang.String) QPrinter::setPrinterName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String printerName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_printerName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_printerName(long __this__nativeId);

/**
Returns a list of supported paper sizes by the printer. <p>Not all printer drivers support this query, so the list may be empty. On Mac OS X 10.3, this function always returns an empty list.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QPrinter.PageSize> supportedPaperSizes()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportedPaperSizes(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QPrinter.PageSize> __qt_supportedPaperSizes(long __this__nativeId);

/**
Returns a list of available printers on the system.
*/

    public native static java.util.List<com.trolltech.qt.gui.QPrinterInfo> availablePrinters();

/**
Returns the default printer on the system. <p>The return value should be checked using {@link com.trolltech.qt.gui.QPrinterInfo#isNull() isNull()} before being used, in case there is no default printer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinterInfo#isNull() isNull()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QPrinterInfo defaultPrinter();

/**
@exclude
*/

    public static native QPrinterInfo fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPrinterInfo(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QPrinterInfo array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QPrinterInfo clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QPrinterInfo __qt_clone(long __this_nativeId);
}
