package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPrintEngine class defines an interface for how {@link com.trolltech.qt.gui.QPrinter QPrinter} interacts with a given printing subsystem. The common case when creating your own print engine is to derive from both {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} and QPrintEngine. Various properties of a print engine are given with {@link com.trolltech.qt.gui.QPrintEngine#property(com.trolltech.qt.gui.QPrintEngine.PrintEnginePropertyKey) property()} and set with {@link com.trolltech.qt.gui.QPrintEngine#setProperty(com.trolltech.qt.gui.QPrintEngine.PrintEnginePropertyKey, java.lang.Object) setProperty()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngine QPaintEngine}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QPrintEngine extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QPrintEngine {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public boolean abort() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_abort(nativeId());
        }

        @Override
        @QtBlockedSlot
        public int metric(com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_metric_PaintDeviceMetric(nativeId(), arg__1.value());
        }

        @Override
        @QtBlockedSlot
        public boolean newPage() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_newPage(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QPrinter.PrinterState printerState() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return com.trolltech.qt.gui.QPrinter.PrinterState.resolve(super.__qt_printerState(nativeId()));
        }

        @Override
        @QtBlockedSlot
        public java.lang.Object property(com.trolltech.qt.gui.QPrintEngine.PrintEnginePropertyKey key) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_property_PrintEnginePropertyKey(nativeId(), key.value());
        }

        @Override
        @QtBlockedSlot
        public void setProperty(com.trolltech.qt.gui.QPrintEngine.PrintEnginePropertyKey key, java.lang.Object value) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setProperty_PrintEnginePropertyKey_Object(nativeId(), key.value(), value);
        }
    }
/**
This enum is used to communicate properties between the print engine and {@link com.trolltech.qt.gui.QPrinter QPrinter}. A property may or may not be supported by a given print engine.
*/


    public enum PrintEnginePropertyKey implements com.trolltech.qt.QtEnumerator {
/**
 A boolean value indicating whether the printout should be collated or not.
*/

        PPK_CollateCopies(0),
/**
 Refers to {@link com.trolltech.qt.gui.QPrinter.ColorMode QPrinter::ColorMode }, either color or monochrome.
*/

        PPK_ColorMode(1),
/**
 A string describing the document's creator.
*/

        PPK_Creator(2),
/**
 A string describing the document name in the spooler.
*/

        PPK_DocumentName(3),
/**
 A boolean describing if the printer should be full page or not.
*/

        PPK_FullPage(4),
/**
 An integer specifying the number of copies
*/

        PPK_NumberOfCopies(5),
/**
 Specifies a {@link com.trolltech.qt.gui.QPrinter.Orientation QPrinter::Orientation } value.
*/

        PPK_Orientation(6),
/**
 The output file name as a string. An empty file name indicates that the printer should not print to a file.
*/

        PPK_OutputFileName(7),
/**
 Specifies a {@link com.trolltech.qt.gui.QPrinter.PageOrder QPrinter::PageOrder } value.
*/

        PPK_PageOrder(8),
/**
 A {@link com.trolltech.qt.core.QRect QRect} specifying the page rectangle
*/

        PPK_PageRect(9),
/**
 Obsolete. Use {@link com.trolltech.qt.gui.QPrintEngine.PrintEnginePropertyKey PPK_PaperSize } instead.
*/

        PPK_PageSize(10),
/**
 A {@link com.trolltech.qt.core.QRect QRect} specifying the paper rectangle.
*/

        PPK_PaperRect(11),
/**
 Specifies a {@link com.trolltech.qt.gui.QPrinter.PaperSource QPrinter::PaperSource } value.
*/

        PPK_PaperSource(12),
/**
 A string specifying the name of the printer.
*/

        PPK_PrinterName(13),
/**
 A string specifying the name of the printer program used for printing,
*/

        PPK_PrinterProgram(14),
/**
 An integer describing the dots per inch for this printer.
*/

        PPK_Resolution(15),
/**

*/

        PPK_SelectionOption(16),
/**
 A list of integer QVariants describing the set of supported resolutions that the printer has.
*/

        PPK_SupportedResolutions(17),
/**
 An integer specifying a DM_PAPER entry on Windows.
*/

        PPK_WindowsPageSize(18),
/**
 A boolean value indicating whether data for the document's fonts should be embedded in the data sent to the printer.
*/

        PPK_FontEmbedding(19),
/**
 Suppress the built-in dialog for showing printing progress. As of 4.1 this only has effect on Mac OS X where, by default, a status dialog is shown.
*/

        PPK_SuppressSystemPrintStatus(20),
/**
 A boolean value indicating whether both sides of the printer paper should be used for the printout.
*/

        PPK_Duplex(21),
/**
 Specifies more than one {@link com.trolltech.qt.gui.QPrinter.PaperSource QPrinter::PaperSource } value.
*/

        PPK_PaperSources(22),
/**
 A {@link com.trolltech.qt.core.QSizeF QSizeF} specifying a custom paper size in the {@link com.trolltech.qt.gui.QPrinter.Unit QPrinter::Point } unit.
*/

        PPK_CustomPaperSize(23),
/**
 A QList&lt;{@link com.trolltech.qt.QVariant QVariant}&gt; containing the left, top, right and bottom margin values.
*/

        PPK_PageMargins(24),
/**
 Basis for extension.
*/

        PPK_CustomBase(65280);

        PrintEnginePropertyKey(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrintEngine$PrintEnginePropertyKey constant with the specified <tt>int</tt>.</brief>
*/

        public static PrintEnginePropertyKey resolve(int value) {
            return (PrintEnginePropertyKey) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return PPK_CollateCopies;
            case 1: return PPK_ColorMode;
            case 2: return PPK_Creator;
            case 3: return PPK_DocumentName;
            case 4: return PPK_FullPage;
            case 5: return PPK_NumberOfCopies;
            case 6: return PPK_Orientation;
            case 7: return PPK_OutputFileName;
            case 8: return PPK_PageOrder;
            case 9: return PPK_PageRect;
            case 10: return PPK_PageSize;
            case 11: return PPK_PaperRect;
            case 12: return PPK_PaperSource;
            case 13: return PPK_PrinterName;
            case 14: return PPK_PrinterProgram;
            case 15: return PPK_Resolution;
            case 16: return PPK_SelectionOption;
            case 17: return PPK_SupportedResolutions;
            case 18: return PPK_WindowsPageSize;
            case 19: return PPK_FontEmbedding;
            case 20: return PPK_SuppressSystemPrintStatus;
            case 21: return PPK_Duplex;
            case 22: return PPK_PaperSources;
            case 23: return PPK_CustomPaperSize;
            case 24: return PPK_PageMargins;
            case 65280: return PPK_CustomBase;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
This is an overloaded method provided for convenience.
*/

    public QPrintEngine(){
        super((QPrivateConstructor)null);
        __qt_QPrintEngine();
    }

    native void __qt_QPrintEngine();

/**
Instructs the print engine to abort the printing process. Returns true if successful; otherwise returns false.
*/

    @QtBlockedSlot
    public abstract boolean abort();
    @QtBlockedSlot
    native boolean __qt_abort(long __this__nativeId);

/**
Returns the metric for the given <tt>id</tt>.
*/

    @QtBlockedSlot
    public abstract int metric(com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric arg__1);
    @QtBlockedSlot
    native int __qt_metric_PaintDeviceMetric(long __this__nativeId, int arg__1);

/**
Instructs the print engine to start a new page. Returns true if the printer was able to create the new page; otherwise returns false.
*/

    @QtBlockedSlot
    public abstract boolean newPage();
    @QtBlockedSlot
    native boolean __qt_newPage(long __this__nativeId);

/**
Returns the current state of the printer being used by the print engine.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QPrinter.PrinterState printerState();
    @QtBlockedSlot
    native int __qt_printerState(long __this__nativeId);

/**
Returns the print engine's property specified by <tt>key</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintEngine#setProperty(com.trolltech.qt.gui.QPrintEngine.PrintEnginePropertyKey, java.lang.Object) setProperty()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.lang.Object property(com.trolltech.qt.gui.QPrintEngine.PrintEnginePropertyKey key);
    @QtBlockedSlot
    native java.lang.Object __qt_property_PrintEnginePropertyKey(long __this__nativeId, int key);

/**
Sets the print engine's property specified by <tt>key</tt> to the given <tt>value</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintEngine#property(com.trolltech.qt.gui.QPrintEngine.PrintEnginePropertyKey) property()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void setProperty(com.trolltech.qt.gui.QPrintEngine.PrintEnginePropertyKey key, java.lang.Object value);
    @QtBlockedSlot
    native void __qt_setProperty_PrintEnginePropertyKey_Object(long __this__nativeId, int key, java.lang.Object value);

/**
@exclude
*/

    public static native QPrintEngine fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPrintEngine(QPrivateConstructor p) { super(p); } 
}
