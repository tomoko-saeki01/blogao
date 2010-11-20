package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPrinter class is a paint device that paints on a printer. This device represents a series of pages of printed output, and is used in almost exactly the same way as other paint devices such as {@link com.trolltech.qt.gui.QWidget QWidget} and {@link com.trolltech.qt.gui.QPixmap QPixmap}. A set of additional functions are provided to manage device-specific features, such as orientation and resolution, and to step through the pages in a document as it is generated. <p>When printing directly to a printer on Windows or Mac OS X, QPrinter uses the built-in printer drivers. On X11, QPrinter uses the {@link <a href="../http-www-cups-org.html">Common Unix Printing System (CUPS)</a>} or the standard Unix {@link <a href="../http-www-ietf-org-rfc-rfc1179-txt.html">lpr</a>} utility to send PostScript or PDF output to the printer. As an alternative, the {@link com.trolltech.qt.gui.QPrinter#printProgram() printProgram()} function can be used to specify the command or utility to use instead of the system default. <p>QPrinter supports a number of parameters, most of which can be changed by the end user through a {@link com.trolltech.qt.gui.QPrintDialog print dialog}. In general, QPrinter passes these functions onto the underlying {@link com.trolltech.qt.gui.QPrintEngine QPrintEngine}. <p>The most important parameters are: <ul><li> {@link com.trolltech.qt.gui.QPrinter#setOrientation(com.trolltech.qt.gui.QPrinter.Orientation) setOrientation()} tells QPrinter which page orientation to use.</li><li> {@link com.trolltech.qt.gui.QPrinter#setPaperSize(com.trolltech.qt.gui.QPrinter.PageSize) setPaperSize()} tells QPrinter what paper size to expect from the printer.</li><li> {@link com.trolltech.qt.gui.QPrinter#setResolution(int) setResolution()} tells QPrinter what resolution you wish the printer to provide, in dots per inch (DPI).</li><li> {@link com.trolltech.qt.gui.QPrinter#setFullPage(boolean) setFullPage()} tells QPrinter whether you want to deal with the full page or just with the part the printer can draw on.</li><li> {@link com.trolltech.qt.gui.QPrinter#setNumCopies(int) setNumCopies()} tells QPrinter how many copies of the document it should print.</li></ul> Many of these functions can only be called before the actual printing begins (i.e., before {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) QPainter::begin()} is called). This usually makes sense because, for example, it's not possible to change the number of copies when you are halfway through printing. There are also some settings that the user sets (through the printer dialog) and that applications are expected to obey. See {@link com.trolltech.qt.gui.QAbstractPrintDialog QAbstractPrintDialog}'s documentation for more details. <p>When {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) QPainter::begin()} is called, the QPrinter it operates on is prepared for a new page, enabling the {@link com.trolltech.qt.gui.QPainter QPainter} to be used immediately to paint the first page in a document. Once the first page has been painted, {@link com.trolltech.qt.gui.QPrinter#newPage() newPage()} can be called to request a new blank page to paint on, or {@link com.trolltech.qt.gui.QPainter#end() QPainter::end()} can be called to finish printing. The second page and all following pages are prepared using a call to {@link com.trolltech.qt.gui.QPrinter#newPage() newPage()} before they are painted. <p>The first page in a document does not need to be preceded by a call to {@link com.trolltech.qt.gui.QPrinter#newPage() newPage()}. You only need to calling {@link com.trolltech.qt.gui.QPrinter#newPage() newPage()} after {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) QPainter::begin()} if you need to insert a blank page at the beginning of a printed document. Similarly, calling {@link com.trolltech.qt.gui.QPrinter#newPage() newPage()} after the last page in a document is painted will result in a trailing blank page appended to the end of the printed document. <p>If you want to abort the print job, {@link com.trolltech.qt.gui.QPrinter#abort() abort()} will try its best to stop printing. It may cancel the entire job or just part of it. <p>Since QPrinter can print to any {@link com.trolltech.qt.gui.QPrintEngine QPrintEngine} subclass, it is possible to extend printing support to cover new types of printing subsystem by subclassing {@link com.trolltech.qt.gui.QPrintEngine QPrintEngine} and reimplementing its interface. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintDialog QPrintDialog}, and {@link <a href="../printing.html">Printing with Qt</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPrinter extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QPaintDeviceInterface
{

    private Object __rcPaintEngine = null;

    private Object __rcPrintEngine = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
The {@link com.trolltech.qt.gui.QPrinter.OutputFormat OutputFormat } enum is used to describe the format {@link com.trolltech.qt.gui.QPrinter QPrinter} should use for printing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#outputFormat() outputFormat()}, {@link com.trolltech.qt.gui.QPrinter#setOutputFormat(com.trolltech.qt.gui.QPrinter.OutputFormat) setOutputFormat()}, and {@link com.trolltech.qt.gui.QPrinter#setOutputFileName(java.lang.String) setOutputFileName()}. <br></DD></DT>
*/

    public enum OutputFormat implements com.trolltech.qt.QtEnumerator {
/**
 {@link com.trolltech.qt.gui.QPrinter QPrinter} will print output using a method defined by the platform it is running on. This mode is the default when printing directly to a printer.
*/

        NativeFormat(0),
/**
 {@link com.trolltech.qt.gui.QPrinter QPrinter} will generate its output as a searchable PDF file. This mode is the default when printing to a file.
*/

        PdfFormat(1),
/**
 {@link com.trolltech.qt.gui.QPrinter QPrinter} will generate its output as in the PostScript format. (This feature was introduced in Qt 4.2.)
*/

        PostScriptFormat(2);

        OutputFormat(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrinter$OutputFormat constant with the specified <tt>int</tt>.</brief>
*/

        public static OutputFormat resolve(int value) {
            return (OutputFormat) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NativeFormat;
            case 1: return PdfFormat;
            case 2: return PostScriptFormat;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used to indicate whether printing will occur on one or both sides of each sheet of paper (simplex or duplex printing).
*/

    public enum DuplexMode implements com.trolltech.qt.QtEnumerator {
/**
 Single sided (simplex) printing only.
*/

        DuplexNone(0),
/**
 The printer's default setting is used to determine whether duplex printing is used.
*/

        DuplexAuto(1),
/**
 Both sides of each sheet of paper are used for printing. The paper is turned over its longest edge before the second side is printed
*/

        DuplexLongSide(2),
/**
 Both sides of each sheet of paper are used for printing. The paper is turned over its shortest edge before the second side is printed
*/

        DuplexShortSide(3);

        DuplexMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrinter$DuplexMode constant with the specified <tt>int</tt>.</brief>
*/

        public static DuplexMode resolve(int value) {
            return (DuplexMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return DuplexNone;
            case 1: return DuplexAuto;
            case 2: return DuplexLongSide;
            case 3: return DuplexShortSide;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Used to specify the print range selection option. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractPrintDialog.PrintRange QAbstractPrintDialog::PrintRange }. <br></DD></DT>
*/

    public enum PrintRange implements com.trolltech.qt.QtEnumerator {
/**
 All pages should be printed.
*/

        AllPages(0),
/**
 Only the selection should be printed.
*/

        Selection(1),
/**
 The specified page range should be printed.
*/

        PageRange(2);

        PrintRange(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrinter$PrintRange constant with the specified <tt>int</tt>.</brief>
*/

        public static PrintRange resolve(int value) {
            return (PrintRange) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AllPages;
            case 1: return Selection;
            case 2: return PageRange;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type is used to specify the measurement unit for page and paper sizes. Note the difference between Point and {@link com.trolltech.qt.gui.QPrinter.Unit DevicePixel }. The Point unit is defined to be 1/72th of an inch, while the {@link com.trolltech.qt.gui.QPrinter.Unit DevicePixel } unit is resolution dependant and is based on the actual pixels, or dots, on the printer.
*/

    public enum Unit implements com.trolltech.qt.QtEnumerator {
/**

*/

        Millimeter(0),
/**

*/

        Point(1),
/**

*/

        Inch(2),
/**

*/

        Pica(3),
/**

*/

        Didot(4),
/**

*/

        Cicero(5),
/**

*/

        DevicePixel(6);

        Unit(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrinter$Unit constant with the specified <tt>int</tt>.</brief>
*/

        public static Unit resolve(int value) {
            return (Unit) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Millimeter;
            case 1: return Point;
            case 2: return Inch;
            case 3: return Pica;
            case 4: return Didot;
            case 5: return Cicero;
            case 6: return DevicePixel;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the mode the printer should work in. It basically presets a certain resolution and working mode. <b>Note:</b> When rendering text on a {@link com.trolltech.qt.gui.QPrinter QPrinter} device, it is important to realize that the size of text, when specified in points, is independent of the resolution specified for the device itself. Therefore, it may be useful to specify the font size in pixels when combining text with graphics to ensure that their relative sizes are what you expect.
*/

    public enum PrinterMode implements com.trolltech.qt.QtEnumerator {
/**
 Sets the resolution of the print device to the screen resolution. This has the big advantage that the results obtained when painting on the printer will match more or less exactly the visible output on the screen. It is the easiest to use, as font metrics on the screen and on the printer are the same. This is the default value. {@link com.trolltech.qt.gui.QPrinter.PrinterMode ScreenResolution } will produce a lower quality output than {@link com.trolltech.qt.gui.QPrinter.PrinterMode HighResolution } and should only be used for drafts.
*/

        ScreenResolution(0),
/**
 This value is deprecated. Is is equivalent to {@link com.trolltech.qt.gui.QPrinter.PrinterMode ScreenResolution } on Unix and {@link com.trolltech.qt.gui.QPrinter.PrinterMode HighResolution } on Windows and Mac. Due do the difference between {@link com.trolltech.qt.gui.QPrinter.PrinterMode ScreenResolution } and {@link com.trolltech.qt.gui.QPrinter.PrinterMode HighResolution }, use of this value may lead to non-portable printer code.
*/

        PrinterResolution(1),
/**
 On Windows, sets the printer resolution to that defined for the printer in use. For PostScript printing, sets the resolution of the PostScript driver to 1200 dpi.
*/

        HighResolution(2);

        PrinterMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrinter$PrinterMode constant with the specified <tt>int</tt>.</brief>
*/

        public static PrinterMode resolve(int value) {
            return (PrinterMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ScreenResolution;
            case 1: return PrinterResolution;
            case 2: return HighResolution;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type (not to be confused with <tt>Orientation</tt>) is used to specify each page's orientation. This type interacts with {@link com.trolltech.qt.gui.QPrinter.PaperSize QPrinter::PaperSize } and {@link com.trolltech.qt.gui.QPrinter#setFullPage(boolean) QPrinter::setFullPage()} to determine the final size of the page available to the application.
*/

    public enum Orientation implements com.trolltech.qt.QtEnumerator {
/**
 the page's height is greater than its width.
*/

        Portrait(0),
/**
 the page's width is greater than its height.
*/

        Landscape(1);

        Orientation(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrinter$Orientation constant with the specified <tt>int</tt>.</brief>
*/

        public static Orientation resolve(int value) {
            return (Orientation) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Portrait;
            case 1: return Landscape;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum PrinterState implements com.trolltech.qt.QtEnumerator {
/**

*/

        Idle(0),
/**

*/

        Active(1),
/**

*/

        Aborted(2),
/**

*/

        Error(3);

        PrinterState(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrinter$PrinterState constant with the specified <tt>int</tt>.</brief>
*/

        public static PrinterState resolve(int value) {
            return (PrinterState) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Idle;
            case 1: return Active;
            case 2: return Aborted;
            case 3: return Error;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type is used to indicate whether {@link com.trolltech.qt.gui.QPrinter QPrinter} should print in color or not.
*/

    public enum
/**
 print in color if available, otherwise in grayscale.
*/
 ColorMode implements com.trolltech.qt.QtEnumerator {
/**
 print in grayscale, even on color printers.
*/

        GrayScale(0),
        Color(1);

        ColorMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrinter$ColorMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ColorMode resolve(int value) {
            return (ColorMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return GrayScale;
            case 1: return Color;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type specifies what paper source {@link com.trolltech.qt.gui.QPrinter QPrinter} is to use. {@link com.trolltech.qt.gui.QPrinter QPrinter} does not check that the paper source is available; it just uses this information to try and set the paper source. Whether it will set the paper source depends on whether the printer has that particular source. <p><b>Warning:</b> This is currently only implemented for Windows.
*/

    public enum PaperSource implements com.trolltech.qt.QtEnumerator {
/**

*/

        OnlyOne(0),
/**

*/

        Lower(1),
/**

*/

        Middle(2),
/**

*/

        Manual(3),
/**

*/

        Envelope(4),
/**

*/

        EnvelopeManual(5),
/**

*/

        Auto(6),
/**

*/

        Tractor(7),
/**

*/

        SmallFormat(8),
/**

*/

        LargeFormat(9),
/**

*/

        LargeCapacity(10),
/**

*/

        Cassette(11),
/**

*/

        FormSource(12),
/**

*/

        MaxPageSource(13);

        PaperSource(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrinter$PaperSource constant with the specified <tt>int</tt>.</brief>
*/

        public static PaperSource resolve(int value) {
            return (PaperSource) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return OnlyOne;
            case 1: return Lower;
            case 2: return Middle;
            case 3: return Manual;
            case 4: return Envelope;
            case 5: return EnvelopeManual;
            case 6: return Auto;
            case 7: return Tractor;
            case 8: return SmallFormat;
            case 9: return LargeFormat;
            case 10: return LargeCapacity;
            case 11: return Cassette;
            case 12: return FormSource;
            case 13: return MaxPageSource;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type is used by {@link com.trolltech.qt.gui.QPrinter QPrinter} to tell the application program how to print.
*/

    public enum PageOrder implements com.trolltech.qt.QtEnumerator {
/**
 the lowest-numbered page should be printed first.
*/

        FirstPageFirst(0),
/**
 the highest-numbered page should be printed first.
*/

        LastPageFirst(1);

        PageOrder(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrinter$PageOrder constant with the specified <tt>int</tt>.</brief>
*/

        public static PageOrder resolve(int value) {
            return (PageOrder) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return FirstPageFirst;
            case 1: return LastPageFirst;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Use {@link com.trolltech.qt.gui.QPrinter.PaperSize QPrinter::PaperSize } instead.
*/

    public enum PageSize implements com.trolltech.qt.QtEnumerator {
/**
 210 x 297 mm, 8.26 x 11.69 inches
*/

        A4(0),
/**
 182 x 257 mm, 7.17 x 10.13 inches
*/

        B5(1),
/**
 8.5 x 11 inches, 216 x 279 mm
*/

        Letter(2),
/**
 8.5 x 14 inches, 216 x 356 mm
*/

        Legal(3),
/**
 7.5 x 10 inches, 191 x 254 mm
*/

        Executive(4),
/**
 841 x 1189 mm
*/

        A0(5),
/**
 594 x 841 mm
*/

        A1(6),
/**
 420 x 594 mm
*/

        A2(7),
/**
 297 x 420 mm
*/

        A3(8),
/**
 148 x 210 mm
*/

        A5(9),
/**
 105 x 148 mm
*/

        A6(10),
/**
 74 x 105 mm
*/

        A7(11),
/**
 52 x 74 mm
*/

        A8(12),
/**
 37 x 52 mm
*/

        A9(13),
/**
 1030 x 1456 mm
*/

        B0(14),
/**
 728 x 1030 mm
*/

        B1(15),
/**
 32 x 45 mm
*/

        B10(16),
/**
 515 x 728 mm
*/

        B2(17),
/**
 364 x 515 mm
*/

        B3(18),
/**
 257 x 364 mm
*/

        B4(19),
/**
 128 x 182 mm
*/

        B6(20),
/**
 91 x 128 mm
*/

        B7(21),
/**
 64 x 91 mm
*/

        B8(22),
/**
 45 x 64 mm
*/

        B9(23),
/**
 163 x 229 mm
*/

        C5E(24),
/**
 105 x 241 mm, U.S. Common 10 Envelope
*/

        Comm10E(25),
/**
 110 x 220 mm
*/

        DLE(26),
/**
 210 x 330 mm
*/

        Folio(27),
/**
 432 x 279 mm
*/

        Ledger(28),
/**
 279 x 432 mm
*/

        Tabloid(29),
/**
 Unknown, or a user defined size.
*/

        Custom(30),
;

        PageSize(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrinter$PageSize constant with the specified <tt>int</tt>.</brief>
*/

        public static PageSize resolve(int value) {
            return (PageSize) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return A4;
            case 1: return B5;
            case 2: return Letter;
            case 3: return Legal;
            case 4: return Executive;
            case 5: return A0;
            case 6: return A1;
            case 7: return A2;
            case 8: return A3;
            case 9: return A5;
            case 10: return A6;
            case 11: return A7;
            case 12: return A8;
            case 13: return A9;
            case 14: return B0;
            case 15: return B1;
            case 16: return B10;
            case 17: return B2;
            case 18: return B3;
            case 19: return B4;
            case 20: return B6;
            case 21: return B7;
            case 22: return B8;
            case 23: return B9;
            case 24: return C5E;
            case 25: return Comm10E;
            case 26: return DLE;
            case 27: return Folio;
            case 28: return Ledger;
            case 29: return Tabloid;
            case 30: return Custom;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Creates a new printer object with the given <tt>mode</tt>.
*/

    public QPrinter() {
        this(com.trolltech.qt.gui.QPrinter.PrinterMode.ScreenResolution);
    }
/**
Creates a new printer object with the given <tt>mode</tt>.
*/

    public QPrinter(com.trolltech.qt.gui.QPrinter.PrinterMode mode){
        super((QPrivateConstructor)null);
        __qt_QPrinter_PrinterMode(mode.value());
    }

    native void __qt_QPrinter_PrinterMode(int mode);


/**
Creates a new printer object with the given <tt>printer</tt> and <tt>mode</tt>.
*/

    public QPrinter(com.trolltech.qt.gui.QPrinterInfo printer) {
        this(printer, com.trolltech.qt.gui.QPrinter.PrinterMode.ScreenResolution);
    }
/**
Creates a new printer object with the given <tt>printer</tt> and <tt>mode</tt>.
*/

    public QPrinter(com.trolltech.qt.gui.QPrinterInfo printer, com.trolltech.qt.gui.QPrinter.PrinterMode mode){
        super((QPrivateConstructor)null);
        __qt_QPrinter_QPrinterInfo_PrinterMode(printer == null ? 0 : printer.nativeId(), mode.value());
    }

    native void __qt_QPrinter_QPrinterInfo_PrinterMode(long printer, int mode);

/**
Aborts the current print run. Returns true if the print run was successfully aborted and {@link com.trolltech.qt.gui.QPrinter#printerState() printerState()} will return {@link com.trolltech.qt.gui.QPrinter.PrinterState QPrinter::Aborted }; otherwise returns false. <p>It is not always possible to abort a print job. For example, all the data has gone to the printer but the printer cannot or will not cancel the job when asked to.
*/

    @QtBlockedSlot
    public final boolean abort()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_abort(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_abort(long __this__nativeId);

/**
Returns true if collation is turned on when multiple copies is selected. Returns false if it is turned off when multiple copies is selected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setCollateCopies(boolean) setCollateCopies()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean collateCopies()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_collateCopies(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_collateCopies(long __this__nativeId);

/**
Returns the current color mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setColorMode(com.trolltech.qt.gui.QPrinter.ColorMode) setColorMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrinter.ColorMode colorMode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPrinter.ColorMode.resolve(__qt_colorMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_colorMode(long __this__nativeId);

/**
Returns the name of the application that created the document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setCreator(java.lang.String) setCreator()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String creator()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_creator(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_creator(long __this__nativeId);

/**
Returns the bit depth (number of bit planes) of the paint device.
*/

    @QtBlockedSlot
    public final int depth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_depth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_depth(long __this__nativeId);

/**
Returns the document name. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setDocName(java.lang.String) setDocName()}, and {@link com.trolltech.qt.gui.QPrintEngine.PrintEnginePropertyKey QPrintEngine::PrintEnginePropertyKey }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String docName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_docName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_docName(long __this__nativeId);

/**
Returns true if double side printing is enabled. <p>Currently this option is only supported on X11. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setDoubleSidedPrinting(boolean) setDoubleSidedPrinting()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean doubleSidedPrinting()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_doubleSidedPrinting(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_doubleSidedPrinting(long __this__nativeId);

/**
Returns the current duplex mode. <p>Currently this option is only supported on X11. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setDuplex(com.trolltech.qt.gui.QPrinter.DuplexMode) setDuplex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrinter.DuplexMode duplex()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPrinter.DuplexMode.resolve(__qt_duplex(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_duplex(long __this__nativeId);

/**
Returns true if font embedding is enabled. <p>Currently this option is only supported on X11. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setFontEmbeddingEnabled(boolean) setFontEmbeddingEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fontEmbeddingEnabled()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontEmbeddingEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fontEmbeddingEnabled(long __this__nativeId);

/**
Returns the number of the first page in a range of pages to be printed (the "from page" setting). Pages in a document are numbered according to the convention that the first page is page 1. <p>By default, this function returns a special value of 0, meaning that the "from page" setting is unset. <p><b>Note:</b> If {@link com.trolltech.qt.gui.QPrinter#fromPage() fromPage()} and {@link com.trolltech.qt.gui.QPrinter#toPage() toPage()} both return 0, this indicates that the whole document will be printed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setFromTo(int, int) setFromTo()}, and {@link com.trolltech.qt.gui.QPrinter#toPage() toPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int fromPage()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fromPage(nativeId());
    }
    @QtBlockedSlot
    native int __qt_fromPage(long __this__nativeId);

/**
Returns true if the origin of the printer's coordinate system is at the corner of the page and false if it is at the edge of the printable area. <p>See {@link com.trolltech.qt.gui.QPrinter#setFullPage(boolean) setFullPage()} for details and caveats. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setFullPage(boolean) setFullPage()}, and {@link com.trolltech.qt.gui.QPrinter.PaperSize PaperSize }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fullPage()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fullPage(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fullPage(long __this__nativeId);

    @QtBlockedSlot
    private final void getPageMargins(com.trolltech.qt.QNativePointer left, com.trolltech.qt.QNativePointer top, com.trolltech.qt.QNativePointer right, com.trolltech.qt.QNativePointer bottom, com.trolltech.qt.gui.QPrinter.Unit unit)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_getPageMargins_nativepointer_nativepointer_nativepointer_nativepointer_Unit(nativeId(), left, top, right, bottom, unit.value());
    }
    @QtBlockedSlot
    native void __qt_getPageMargins_nativepointer_nativepointer_nativepointer_nativepointer_Unit(long __this__nativeId, com.trolltech.qt.QNativePointer left, com.trolltech.qt.QNativePointer top, com.trolltech.qt.QNativePointer right, com.trolltech.qt.QNativePointer bottom, int unit);

/**
Returns the height of the paint device in default coordinate system units (e. . pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and {@link com.trolltech.qt.gui.QWidget QWidget}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int height()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_height(nativeId());
    }
    @QtBlockedSlot
    native int __qt_height(long __this__nativeId);

/**
Returns the height of the paint device in millimeters. Due to platform limitations it may not be possible to use this function to determine the actual physical size of a widget on the screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#height() height()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int heightMM()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_heightMM(nativeId());
    }
    @QtBlockedSlot
    native int __qt_heightMM(long __this__nativeId);

/**
Returns true if the printer currently selected is a valid printer in the system, or a pure PDF/PostScript printer; otherwise returns false. <p>To detect other failures check the output of {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) QPainter::begin()} or QPainter::nextPage().<br><br>The following code example is written in c++.<br> <pre class="snippet">
    QPrinter printer;
    printer.setOutputFormat(QPrinter::PdfFormat);
    printer.setOutputFileName("/foobar/nonwritable.pdf");
    QPainter painter;
    if (! painter.begin(&printer)) { // failed to open file
        qWarning("failed to open file, is it writable?");
        return 1;
    }
    painter.drawText(10, 10, "Test");
    if (! printer.newPage()) {
        qWarning("failed in flushing page to disk, disk full?");
        return 1;
    }
    painter.drawText(10, 10, "Test 2");
    painter.end();
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setPrinterName(java.lang.String) setPrinterName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns the horizontal resolution of the device in dots per inch, which is used when computing font sizes. For X11, this is usually the same as could be computed from {@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()}. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}, and {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int logicalDpiX()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_logicalDpiX(nativeId());
    }
    @QtBlockedSlot
    native int __qt_logicalDpiX(long __this__nativeId);

/**
Returns the vertical resolution of the device in dots per inch, which is used when computing font sizes. For X11, this is usually the same as could be computed from {@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()}. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}, and {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int logicalDpiY()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_logicalDpiY(nativeId());
    }
    @QtBlockedSlot
    native int __qt_logicalDpiY(long __this__nativeId);

/**
Tells the printer to eject the current page and to continue printing on a new page. Returns true if this was successful; otherwise returns false. <p>Calling {@link com.trolltech.qt.gui.QPrinter#newPage() newPage()} on an inactive QPrinter object will always fail.
*/

    @QtBlockedSlot
    public final boolean newPage()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_newPage(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_newPage(long __this__nativeId);

/**
Returns the number of different colors available for the paint device. Since this value is an int, it will not be sufficient to represent the number of colors on 32 bit displays, in this case INT_MAX is returned instead.
*/

    @QtBlockedSlot
    public final int numColors()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_numColors(nativeId());
    }
    @QtBlockedSlot
    native int __qt_numColors(long __this__nativeId);

/**
Returns the number of copies to be printed. The default value is 1. <p>On Windows, Mac OS X and X11 systems that support CUPS, this will always return 1 as these operating systems can internally handle the number of copies. <p>On X11, this value will return the number of times the application is required to print in order to match the number specified in the printer setup dialog. This has been done since some printer drivers are not capable of buffering up the copies and in those cases the application must make an explicit call to the print code for each copy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setNumCopies(int) setNumCopies()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int numCopies()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_numCopies(nativeId());
    }
    @QtBlockedSlot
    native int __qt_numCopies(long __this__nativeId);

/**
Returns the orientation setting. This is driver-dependent, but is usually {@link com.trolltech.qt.gui.QPrinter.Orientation QPrinter::Portrait }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setOrientation(com.trolltech.qt.gui.QPrinter.Orientation) setOrientation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrinter.Orientation orientation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPrinter.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
Returns the name of the output file. By default, this is an empty string (indicating that the printer shouldn't print to file). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setOutputFileName(java.lang.String) setOutputFileName()}, and {@link com.trolltech.qt.gui.QPrintEngine.PrintEnginePropertyKey QPrintEngine::PrintEnginePropertyKey }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String outputFileName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_outputFileName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_outputFileName(long __this__nativeId);

/**
Returns the output format for this printer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setOutputFormat(com.trolltech.qt.gui.QPrinter.OutputFormat) setOutputFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrinter.OutputFormat outputFormat()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPrinter.OutputFormat.resolve(__qt_outputFormat(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_outputFormat(long __this__nativeId);

/**
Returns the current page order. <p>The default page order is <tt>FirstPageFirst</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setPageOrder(com.trolltech.qt.gui.QPrinter.PageOrder) setPageOrder()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrinter.PageOrder pageOrder()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPrinter.PageOrder.resolve(__qt_pageOrder(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_pageOrder(long __this__nativeId);

/**
Returns the page's rectangle; this is usually smaller than the {@link com.trolltech.qt.gui.QPrinter#paperRect() paperRect()} since the page normally has margins between its borders and the paper. <p>The unit of the returned rectangle is {@link com.trolltech.qt.gui.QPrinter.Unit DevicePixel }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#paperSize() paperSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect pageRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pageRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_pageRect(long __this__nativeId);

/**
Returns the page's rectangle in <tt>unit</tt>; this is usually smaller than the {@link com.trolltech.qt.gui.QPrinter#paperRect() paperRect()} since the page normally has margins between its borders and the paper. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#paperSize() paperSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF pageRect(com.trolltech.qt.gui.QPrinter.Unit arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pageRect_Unit(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_pageRect_Unit(long __this__nativeId, int arg__1);

/**
Returns the printer page size. The default value is driver-dependent. <p>Use {@link com.trolltech.qt.gui.QPrinter#paperSize() paperSize()} instead. <p><DT><b>See also:</b><br><DD>setPageSize(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrinter.PageSize pageSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPrinter.PageSize.resolve(__qt_pageSize(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_pageSize(long __this__nativeId);

/**
Returns true if the device is currently being painted on, i. . someone has called {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) QPainter::begin()} but not yet called {@link com.trolltech.qt.gui.QPainter#end() QPainter::end()} for this device; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#isActive() QPainter::isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean paintingActive()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paintingActive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_paintingActive(long __this__nativeId);

/**
Returns the paper's rectangle; this is usually larger than the {@link com.trolltech.qt.gui.QPrinter#pageRect() pageRect()}. <p>The unit of the returned rectangle is {@link com.trolltech.qt.gui.QPrinter.Unit DevicePixel }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#pageRect() pageRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect paperRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paperRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_paperRect(long __this__nativeId);

/**
Returns the paper's rectangle in <tt>unit</tt>; this is usually larger than the {@link com.trolltech.qt.gui.QPrinter#pageRect() pageRect()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#pageRect() pageRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRectF paperRect(com.trolltech.qt.gui.QPrinter.Unit arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paperRect_Unit(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRectF __qt_paperRect_Unit(long __this__nativeId, int arg__1);

/**
Returns the printer paper size. The default value is driver-dependent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setPaperSize(com.trolltech.qt.gui.QPrinter.PageSize) setPaperSize()}, {@link com.trolltech.qt.gui.QPrinter#pageRect() pageRect()}, and {@link com.trolltech.qt.gui.QPrinter#paperRect() paperRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrinter.PageSize paperSize()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPrinter.PageSize.resolve(__qt_paperSize(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_paperSize(long __this__nativeId);

/**
Returns the paper size in <tt>unit</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setPaperSize(com.trolltech.qt.gui.QPrinter.PageSize) setPaperSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSizeF paperSize(com.trolltech.qt.gui.QPrinter.Unit unit)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paperSize_Unit(nativeId(), unit.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSizeF __qt_paperSize_Unit(long __this__nativeId, int unit);

/**
Returns the printer's paper source. This is <tt>Manual</tt> or a printer tray or paper cassette. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setPaperSource(com.trolltech.qt.gui.QPrinter.PaperSource) setPaperSource()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrinter.PaperSource paperSource()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPrinter.PaperSource.resolve(__qt_paperSource(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_paperSource(long __this__nativeId);

/**
Returns the horizontal resolution of the device in dots per inch. For example, when printing, this resolution refers to the physical printer's resolution. The logical DPI on the other hand, refers to the resolution used by the actual paint engine. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}, and {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int physicalDpiX()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_physicalDpiX(nativeId());
    }
    @QtBlockedSlot
    native int __qt_physicalDpiX(long __this__nativeId);

/**
Returns the horizontal resolution of the device in dots per inch. For example, when printing, this resolution refers to the physical printer's resolution. The logical DPI on the other hand, refers to the resolution used by the actual paint engine. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}, and {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int physicalDpiY()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_physicalDpiY(nativeId());
    }
    @QtBlockedSlot
    native int __qt_physicalDpiY(long __this__nativeId);

/**
Returns the print engine used by the printer.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrintEngine printEngine()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_printEngine(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPrintEngine __qt_printEngine(long __this__nativeId);

/**
Returns the name of the program that sends the print output to the printer. <p>The default is to return an empty string; meaning that QPrinter will try to be smart in a system-dependent way. On X11 only, you can set it to something different to use a specific print program. On the other platforms, this returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setPrintProgram(java.lang.String) setPrintProgram()}, and setPrinterSelectionOption(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String printProgram()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_printProgram(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_printProgram(long __this__nativeId);

/**
Returns the page range of the QPrinter. After the print setup dialog has been opened, this function returns the value selected by the user. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setPrintRange(com.trolltech.qt.gui.QPrinter.PrintRange) setPrintRange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrinter.PrintRange printRange()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPrinter.PrintRange.resolve(__qt_printRange(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_printRange(long __this__nativeId);

/**
Returns the printer name. This value is initially set to the name of the default printer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setPrinterName(java.lang.String) setPrinterName()}. <br></DD></DT>
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
Returns the current state of the printer. This may not always be accurate (for example if the printer doesn't have the capability of reporting its state to the operating system).
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrinter.PrinterState printerState()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPrinter.PrinterState.resolve(__qt_printerState(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_printerState(long __this__nativeId);

/**
Returns the current assumed resolution of the printer, as set by {@link com.trolltech.qt.gui.QPrinter#setResolution(int) setResolution()} or by the printer driver. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setResolution(int) setResolution()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int resolution()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resolution(nativeId());
    }
    @QtBlockedSlot
    native int __qt_resolution(long __this__nativeId);

/**
Sets the default value for collation checkbox when the print dialog appears. If <tt>collate</tt> is true, it will enable setCollateCopiesEnabled(). The default value is false. This value will be changed by what the user presses in the print dialog. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#collateCopies() collateCopies()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCollateCopies(boolean collate)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCollateCopies_boolean(nativeId(), collate);
    }
    @QtBlockedSlot
    native void __qt_setCollateCopies_boolean(long __this__nativeId, boolean collate);

/**
Sets the printer's color mode to <tt>newColorMode</tt>, which can be either <tt>Color</tt> or <tt>GrayScale</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#colorMode() colorMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColorMode(com.trolltech.qt.gui.QPrinter.ColorMode arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColorMode_ColorMode(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setColorMode_ColorMode(long __this__nativeId, int arg__1);

/**
Sets the name of the application that created the document to <tt>creator</tt>. <p>This function is only applicable to the X11 version of Qt. If no creator name is specified, the creator will be set to "Qt" followed by some version number. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#creator() creator()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCreator(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCreator_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setCreator_String(long __this__nativeId, java.lang.String arg__1);

/**
Sets the document name to <tt>name</tt>. <p>On X11, the document name is for example used as the default output filename in {@link com.trolltech.qt.gui.QPrintDialog QPrintDialog}. Note that the document name does not affect the file name if the printer is printing to a file. Use the setOutputFile() function for this. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#docName() docName()}, and {@link com.trolltech.qt.gui.QPrintEngine.PrintEnginePropertyKey QPrintEngine::PrintEnginePropertyKey }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDocName(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDocName_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setDocName_String(long __this__nativeId, java.lang.String arg__1);

/**
Enables double sided printing if <tt>doubleSided</tt> is true; otherwise disables it. <p>Currently this option is only supported on X11. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#doubleSidedPrinting() doubleSidedPrinting()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDoubleSidedPrinting(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDoubleSidedPrinting_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setDoubleSidedPrinting_boolean(long __this__nativeId, boolean enable);

/**
Enables double sided printing based on the <tt>duplex</tt> mode. <p>Currently this option is only supported on X11. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#duplex() duplex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDuplex(com.trolltech.qt.gui.QPrinter.DuplexMode duplex)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDuplex_DuplexMode(nativeId(), duplex.value());
    }
    @QtBlockedSlot
    native void __qt_setDuplex_DuplexMode(long __this__nativeId, int duplex);

/**
This function is used by subclasses of QPrinter to specify custom print and paint engines (<tt>printEngine</tt> and <tt>paintEngine</tt>, respectively). <p>QPrinter does not take ownership of the engines, so you need to manage these engine instances yourself. <p>Note that changing the engines will reset the printer state and all its properties. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#printEngine() printEngine()}, {@link com.trolltech.qt.gui.QPrinter#paintEngine() paintEngine()}, and {@link com.trolltech.qt.gui.QPrinter#setOutputFormat(com.trolltech.qt.gui.QPrinter.OutputFormat) setOutputFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setEngines(com.trolltech.qt.gui.QPrintEngine printEngine, com.trolltech.qt.gui.QPaintEngine paintEngine)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcPrintEngine = printEngine;
        }
        {
            __rcPaintEngine = paintEngine;
        }
        __qt_setEngines_QPrintEngine_QPaintEngine(nativeId(), printEngine == null ? 0 : printEngine.nativeId(), paintEngine == null ? 0 : paintEngine.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setEngines_QPrintEngine_QPaintEngine(long __this__nativeId, long printEngine, long paintEngine);

/**
Enabled or disables font embedding depending on <tt>enable</tt>. <p>Currently this option is only supported on X11. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#fontEmbeddingEnabled() fontEmbeddingEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFontEmbeddingEnabled(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFontEmbeddingEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setFontEmbeddingEnabled_boolean(long __this__nativeId, boolean enable);

/**
Sets the range of pages to be printed to cover the pages with numbers specified by <tt>from</tt> and <tt>to</tt>, where <tt>from</tt> corresponds to the first page in the range and <tt>to</tt> corresponds to the last. <p><b>Note:</b> Pages in a document are numbered according to the convention that the first page is page 1. However, if <tt>from</tt> and <tt>to</tt> are both set to 0, the whole document will be printed. <p>This function is mostly used to set a default value that the user can override in the print dialog when you call setup(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#fromPage() fromPage()}, and {@link com.trolltech.qt.gui.QPrinter#toPage() toPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFromTo(int fromPage, int toPage)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFromTo_int_int(nativeId(), fromPage, toPage);
    }
    @QtBlockedSlot
    native void __qt_setFromTo_int_int(long __this__nativeId, int fromPage, int toPage);

/**
If <tt>fp</tt> is true, enables support for painting over the entire page; otherwise restricts painting to the printable area reported by the device. <p>By default, full page printing is disabled. In this case, the origin of the QPrinter's coordinate system coincides with the top-left corner of the printable area. <p>If full page printing is enabled, the origin of the QPrinter's coordinate system coincides with the top-left corner of the paper itself. In this case, the {@link com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric device metrics } will report the exact same dimensions as indicated by {@link com.trolltech.qt.gui.QPrinter.PaperSize PaperSize }. It may not be possible to print on the entire physical page because of the printer's margins, so the application must account for the margins itself. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#fullPage() fullPage()}, {@link com.trolltech.qt.gui.QPrinter#setPaperSize(com.trolltech.qt.gui.QPrinter.PageSize) setPaperSize()}, {@link com.trolltech.qt.gui.QPaintDevice#width() width()}, {@link com.trolltech.qt.gui.QPaintDevice#height() height()}, and {@link <a href="../printing.html">Printing with Qt</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFullPage(boolean arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFullPage_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setFullPage_boolean(long __this__nativeId, boolean arg__1);

/**
Sets the number of copies to be printed to <tt>numCopies</tt>. <p>The printer driver reads this setting and prints the specified number of copies. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#numCopies() numCopies()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNumCopies(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNumCopies_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setNumCopies_int(long __this__nativeId, int arg__1);

/**
Sets the print orientation to <tt>orientation</tt>. <p>The orientation can be either {@link com.trolltech.qt.gui.QPrinter.Orientation QPrinter::Portrait } or {@link com.trolltech.qt.gui.QPrinter.Orientation QPrinter::Landscape }. <p>The printer driver reads this setting and prints using the specified orientation. <p>On Windows, this option can be changed while printing and will take effect from the next call to {@link com.trolltech.qt.gui.QPrinter#newPage() newPage()}. <p>On Mac OS X, changing the orientation during a print job has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#orientation() orientation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOrientation(com.trolltech.qt.gui.QPrinter.Orientation arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setOrientation_Orientation(long __this__nativeId, int arg__1);

/**
Sets the name of the output file to <tt>fileName</tt>. <p>Setting a null or empty name (0 or "") disables printing to a file. Setting a non-empty name enables printing to a file. <p>This can change the value of {@link com.trolltech.qt.gui.QPrinter#outputFormat() outputFormat()}. If the file name has the suffix ".ps" then PostScript is automatically selected as output format. If the file name has the ".pdf" suffix PDF is generated. If the file name has a suffix other than ".ps" and ".pdf", the output format used is the one set with {@link com.trolltech.qt.gui.QPrinter#setOutputFormat(com.trolltech.qt.gui.QPrinter.OutputFormat) setOutputFormat()}. <p>QPrinter uses Qt's cross-platform PostScript or PDF print engines respectively. If you can produce this format natively, for example Mac OS X can generate PDF's from its print engine, set the output format back to {@link com.trolltech.qt.gui.QPrinter.OutputFormat NativeFormat }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#outputFileName() outputFileName()}, setOutputToFile(), and {@link com.trolltech.qt.gui.QPrinter#setOutputFormat(com.trolltech.qt.gui.QPrinter.OutputFormat) setOutputFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOutputFileName(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOutputFileName_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setOutputFileName_String(long __this__nativeId, java.lang.String arg__1);

/**
Sets the output format for this printer to <tt>format</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#outputFormat() outputFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOutputFormat(com.trolltech.qt.gui.QPrinter.OutputFormat format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOutputFormat_OutputFormat(nativeId(), format.value());
    }
    @QtBlockedSlot
    native void __qt_setOutputFormat_OutputFormat(long __this__nativeId, int format);

/**
This function sets the <tt>left</tt>, <tt>top</tt>, <tt>right</tt> and <tt>bottom</tt> page margins for this printer. The unit of the margins are specified with the <tt>unit</tt> parameter.
*/

    @QtBlockedSlot
    public final void setPageMargins(double left, double top, double right, double bottom, com.trolltech.qt.gui.QPrinter.Unit unit)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPageMargins_double_double_double_double_Unit(nativeId(), left, top, right, bottom, unit.value());
    }
    @QtBlockedSlot
    native void __qt_setPageMargins_double_double_double_double_Unit(long __this__nativeId, double left, double top, double right, double bottom, int unit);

/**
Sets the page order to <tt>pageOrder</tt>. <p>The page order can be {@link com.trolltech.qt.gui.QPrinter.PageOrder QPrinter::FirstPageFirst } or {@link com.trolltech.qt.gui.QPrinter.PageOrder QPrinter::LastPageFirst }. The application is responsible for reading the page order and printing accordingly. <p>This function is mostly useful for setting a default value that the user can override in the print dialog. <p>This function is only supported under X11. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#pageOrder() pageOrder()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPageOrder(com.trolltech.qt.gui.QPrinter.PageOrder arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPageOrder_PageOrder(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setPageOrder_PageOrder(long __this__nativeId, int arg__1);

/**
Sets the printer page size based on <tt>newPageSize</tt>. <p>Use {@link com.trolltech.qt.gui.QPrinter#setPaperSize(com.trolltech.qt.gui.QPrinter.PageSize) setPaperSize()} instead. <p><DT><b>See also:</b><br><DD>pageSize(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPageSize(com.trolltech.qt.gui.QPrinter.PageSize arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPageSize_PageSize(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setPageSize_PageSize(long __this__nativeId, int arg__1);

/**
Sets the printer paper size to <tt>arg_1</tt> if that size is supported. The result is undefined if <tt>newPaperSize</tt> is not supported. <p>The default paper size is driver-dependent. <p>This function is useful mostly for setting a default value that the user can override in the print dialog. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#paperSize() paperSize()}, {@link com.trolltech.qt.gui.QPrinter.PaperSize PaperSize }, {@link com.trolltech.qt.gui.QPrinter#setFullPage(boolean) setFullPage()}, {@link com.trolltech.qt.gui.QPrinter#setResolution(int) setResolution()}, {@link com.trolltech.qt.gui.QPrinter#pageRect() pageRect()}, and {@link com.trolltech.qt.gui.QPrinter#paperRect() paperRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPaperSize(com.trolltech.qt.gui.QPrinter.PageSize arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPaperSize_PageSize(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setPaperSize_PageSize(long __this__nativeId, int arg__1);

/**
Sets the paper size based on <tt>paperSize</tt> in <tt>unit</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#paperSize() paperSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPaperSize(com.trolltech.qt.core.QSizeF paperSize, com.trolltech.qt.gui.QPrinter.Unit unit)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPaperSize_QSizeF_Unit(nativeId(), paperSize == null ? 0 : paperSize.nativeId(), unit.value());
    }
    @QtBlockedSlot
    native void __qt_setPaperSize_QSizeF_Unit(long __this__nativeId, long paperSize, int unit);

/**
Sets the paper source setting to <tt>source</tt>. <p>Windows only: This option can be changed while printing and will take effect from the next call to {@link com.trolltech.qt.gui.QPrinter#newPage() newPage()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#paperSource() paperSource()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPaperSource(com.trolltech.qt.gui.QPrinter.PaperSource arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPaperSource_PaperSource(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setPaperSource_PaperSource(long __this__nativeId, int arg__1);

/**
Sets the name of the program that should do the print job to <tt>printProg</tt>. <p>On X11, this function sets the program to call with the PostScript output. On other platforms, it has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#printProgram() printProgram()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrintProgram(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrintProgram_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setPrintProgram_String(long __this__nativeId, java.lang.String arg__1);

/**
Sets the print range option in to be <tt>range</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#printRange() printRange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrintRange(com.trolltech.qt.gui.QPrinter.PrintRange range)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrintRange_PrintRange(nativeId(), range.value());
    }
    @QtBlockedSlot
    native void __qt_setPrintRange_PrintRange(long __this__nativeId, int range);

/**
Sets the printer name to <tt>name</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#printerName() printerName()}, and {@link com.trolltech.qt.gui.QPrinter#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrinterName(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrinterName_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setPrinterName_String(long __this__nativeId, java.lang.String arg__1);

/**
Requests that the printer prints at <tt>dpi</tt> or as near to <tt>dpi</tt> as possible. <p>This setting affects the coordinate system as returned by, for example {@link com.trolltech.qt.gui.QPainter#viewport() QPainter::viewport()}. <p>This function must be called before {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) QPainter::begin()} to have an effect on all platforms. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#resolution() resolution()}, and {@link com.trolltech.qt.gui.QPrinter#setPaperSize(com.trolltech.qt.gui.QPrinter.PageSize) setPaperSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setResolution(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setResolution_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setResolution_int(long __this__nativeId, int arg__1);

/**
Returns a list of the resolutions (a list of dots-per-inch integers) that the printer says it supports. <p>For X11 where all printing is directly to postscript, this function will always return a one item list containing only the postscript resolution, i.e., 72 (72 dpi -- but see {@link com.trolltech.qt.gui.QPrinter.PrinterMode PrinterMode }).
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.Integer> supportedResolutions()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportedResolutions(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.Integer> __qt_supportedResolutions(long __this__nativeId);

/**
Returns the number of the last page in a range of pages to be printed (the "to page" setting). Pages in a document are numbered according to the convention that the first page is page 1. <p>By default, this function returns a special value of 0, meaning that the "to page" setting is unset. <p><b>Note:</b> If {@link com.trolltech.qt.gui.QPrinter#fromPage() fromPage()} and {@link com.trolltech.qt.gui.QPrinter#toPage() toPage()} both return 0, this indicates that the whole document will be printed. <p>The programmer is responsible for reading this setting and printing accordingly. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter#setFromTo(int, int) setFromTo()}, and {@link com.trolltech.qt.gui.QPrinter#fromPage() fromPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int toPage()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toPage(nativeId());
    }
    @QtBlockedSlot
    native int __qt_toPage(long __this__nativeId);

/**
Returns the width of the paint device in default coordinate system units (e. . pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and {@link com.trolltech.qt.gui.QWidget QWidget}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int width()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_width(nativeId());
    }
    @QtBlockedSlot
    native int __qt_width(long __this__nativeId);

/**
Returns the width of the paint device in millimeters. Due to platform limitations it may not be possible to use this function to determine the actual physical size of a widget on the screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#width() width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int widthMM()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widthMM(nativeId());
    }
    @QtBlockedSlot
    native int __qt_widthMM(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int devType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_devType(nativeId());
    }
    @QtBlockedSlot
    native int __qt_devType(long __this__nativeId);

/**
Returns the metric information for the given paint device <tt>metric</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric PaintDeviceMetric }. <br></DD></DT>
*/

    @QtBlockedSlot
    public int metric(com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_metric_PaintDeviceMetric(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native int __qt_metric_PaintDeviceMetric(long __this__nativeId, int arg__1);

/**
Returns a pointer to the paint engine used for drawing on the device.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QPaintEngine paintEngine()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paintEngine(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPaintEngine __qt_paintEngine(long __this__nativeId);

/**
@exclude
*/

    public static native QPrinter fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPrinter(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QPaintDevice(long ptr);

    /**
     * Returns the page margins for this printer.
     * The unit of the returned margins are specified with the unit parameter.
     * This function was introduced in Qt 4.4.
     *
     * @param unit Specifies the unit of the returned margins.
     * @return The page margins for this printer.
     */
    public final QMarginsF getPageMargins(QPrinter.Unit unit) {
        QNativePointer left = new QNativePointer(QNativePointer.Type.Double);
        QNativePointer top = new QNativePointer(QNativePointer.Type.Double);
        QNativePointer right = new QNativePointer(QNativePointer.Type.Double);
        QNativePointer bottom = new QNativePointer(QNativePointer.Type.Double);

        getPageMargins(left, top, right, bottom, unit);
        return new QMarginsF(left.doubleValue(), top.doubleValue(), right.doubleValue(), bottom.doubleValue());
    }

}
