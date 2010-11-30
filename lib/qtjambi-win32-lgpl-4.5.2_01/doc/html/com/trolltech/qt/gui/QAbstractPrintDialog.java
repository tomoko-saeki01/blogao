package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAbstractPrintDialog class provides a base implementation for print dialogs used to configure printers. This class implements getter and setter functions that are used to customize settings shown in print dialogs, but it is not used directly. Use {@link com.trolltech.qt.gui.QPrintDialog QPrintDialog} to display a print dialog in your application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintDialog QPrintDialog}, {@link com.trolltech.qt.gui.QPrinter QPrinter}, and {@link <a href="../printing.html">Printing with Qt</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractPrintDialog extends com.trolltech.qt.gui.QDialog
{

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractPrintDialog {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public int exec() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_exec(nativeId());
        }
    }

    
/**
Used to specify the print range selection option. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter.PrintRange QPrinter::PrintRange }. <br></DD></DT>
*/
@QtBlockedEnum
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
<brief>Returns the QAbstractPrintDialog$PrintRange constant with the specified <tt>int</tt>.</brief>
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
Used to specify which parts of the print dialog should be visible. This value is obsolete and does nothing since Qt 4.5:
*/
@QtBlockedEnum
    public enum PrintDialogOption implements com.trolltech.qt.QtEnumerator {
/**
 None of the options are enabled.
*/

        None(0),
/**
 The print to file option is enabled.
*/

        PrintToFile(1),
/**
 The print selection option is enabled.
*/

        PrintSelection(2),
/**
 The page range selection option is enabled.
*/

        PrintPageRange(4),
/**
 Show the page size + margins page only if this is enabled.
*/

        PrintShowPageSize(8),
/**

*/

        PrintCollateCopies(16),
/**
 In previous versions of Qt, exec() the print dialog would create a sheet by default the dialog was given a parent. This is no longer supported in Qt 4.5. If you want to use sheets, use QPrintDialog::open() instead.
*/

        DontUseSheet(32);

        PrintDialogOption(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QAbstractPrintDialog$PrintDialogOptions with the specified <tt>com.trolltech.qt.gui.QAbstractPrintDialog$PrintDialogOption[]</tt> QAbstractPrintDialog$PrintDialogOption values set.</brief>
*/

        public static PrintDialogOptions createQFlags(PrintDialogOption ... values) {
            return new PrintDialogOptions(values);
        }
/**
<brief>Returns the QAbstractPrintDialog$PrintDialogOption constant with the specified <tt>int</tt>.</brief>
*/

        public static PrintDialogOption resolve(int value) {
            return (PrintDialogOption) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return None;
            case 1: return PrintToFile;
            case 2: return PrintSelection;
            case 4: return PrintPageRange;
            case 8: return PrintShowPageSize;
            case 16: return PrintCollateCopies;
            case 32: return DontUseSheet;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class PrintDialogOptions extends com.trolltech.qt.QFlags<PrintDialogOption> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QAbstractPrintDialog-PrintDialogOptions with the specified <tt>com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption[]</tt>. flags set.</brief>
*/

        public PrintDialogOptions(PrintDialogOption ... args) { super(args); }
        public PrintDialogOptions(int value) { setValue(value); }
    }




/**
Constructs an abstract print dialog for <tt>printer</tt> with <tt>parent</tt> as parent widget.
*/

    public QAbstractPrintDialog(com.trolltech.qt.gui.QPrinter printer) {
        this(printer, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an abstract print dialog for <tt>printer</tt> with <tt>parent</tt> as parent widget.
*/

    public QAbstractPrintDialog(com.trolltech.qt.gui.QPrinter printer, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractPrintDialog_QPrinter_QWidget(printer == null ? 0 : printer.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractPrintDialog_QPrinter_QWidget(long printer, long parent);

/**
Use QPrintDialog.:setOption(<tt>option</tt>, true) instead.
*/

    @QtBlockedSlot
    public final void addEnabledOption(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addEnabledOption_PrintDialogOption(nativeId(), option.value());
    }
    @QtBlockedSlot
    native void __qt_addEnabledOption_PrintDialogOption(long __this__nativeId, int option);

/**
Use {@link QPrintDialog#options() QPrintDialog.:options()} instead. <p><DT><b>See also:</b><br><DD>setEnabledOptions(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOptions enabledOptions()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOptions(__qt_enabledOptions(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_enabledOptions(long __this__nativeId);

/**
Returns the first page to be printed By default, this value is set to 0.
*/

    @QtBlockedSlot
    public final int fromPage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fromPage(nativeId());
    }
    @QtBlockedSlot
    native int __qt_fromPage(long __this__nativeId);

/**
Use QPrintDialog.:testOption(<tt>option</tt>) instead.
*/

    @QtBlockedSlot
    public final boolean isOptionEnabled(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isOptionEnabled_PrintDialogOption(nativeId(), option.value());
    }
    @QtBlockedSlot
    native boolean __qt_isOptionEnabled_PrintDialogOption(long __this__nativeId, int option);

/**
Returns the maximum page in the page range. As of Qt 4.4, this function returns INT_MAX by default. Previous versions returned 1 by default.
*/

    @QtBlockedSlot
    public final int maxPage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maxPage(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maxPage(long __this__nativeId);

/**
Returns the minimum page in the page range. By default, this value is set to 1.
*/

    @QtBlockedSlot
    public final int minPage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minPage(nativeId());
    }
    @QtBlockedSlot
    native int __qt_minPage(long __this__nativeId);

/**
Returns the print range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractPrintDialog#setPrintRange(com.trolltech.qt.gui.QAbstractPrintDialog.PrintRange) setPrintRange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractPrintDialog.PrintRange printRange()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QAbstractPrintDialog.PrintRange.resolve(__qt_printRange(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_printRange(long __this__nativeId);

/**
Returns the printer that this printer dialog operates on.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrinter printer()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_printer(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPrinter __qt_printer(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setEnabledOptions(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption ... options) {
        this.setEnabledOptions(new com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOptions(options));
    }
/**
Use {@link QPrintDialog#setOptions(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption[]) QPrintDialog::setOptions()} instead. <p><DT><b>See also:</b><br><DD>enabledOptions(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEnabledOptions(com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOptions options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEnabledOptions_PrintDialogOptions(nativeId(), options.value());
    }
    @QtBlockedSlot
    native void __qt_setEnabledOptions_PrintDialogOptions(long __this__nativeId, int options);

/**
Sets the range in the print dialog to be from <tt>from</tt> to <tt>to</tt>.
*/

    @QtBlockedSlot
    public final void setFromTo(int fromPage, int toPage)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFromTo_int_int(nativeId(), fromPage, toPage);
    }
    @QtBlockedSlot
    native void __qt_setFromTo_int_int(long __this__nativeId, int fromPage, int toPage);

/**
Sets the page range in this dialog to be from <tt>min</tt> to <tt>max</tt>. This also enables the {@link com.trolltech.qt.gui.QAbstractPrintDialog.PrintDialogOption PrintPageRange } option.
*/

    @QtBlockedSlot
    public final void setMinMax(int min, int max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinMax_int_int(nativeId(), min, max);
    }
    @QtBlockedSlot
    native void __qt_setMinMax_int_int(long __this__nativeId, int min, int max);

/**
Set a list of widgets as <tt>tabs</tt> to be shown on the print dialog, if supported. <p>Currently this option is only supported on X11. <p>Setting the option tabs will transfer their ownership to the print dialog.
*/

    @QtBlockedSlot
    public final void setOptionTabs(java.util.List<com.trolltech.qt.gui.QWidget> tabs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOptionTabs_List(nativeId(), tabs);
    }
    @QtBlockedSlot
    native void __qt_setOptionTabs_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QWidget> tabs);

/**
Sets the print range option in to be <tt>range</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractPrintDialog#printRange() printRange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrintRange(com.trolltech.qt.gui.QAbstractPrintDialog.PrintRange range)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrintRange_PrintRange(nativeId(), range.value());
    }
    @QtBlockedSlot
    native void __qt_setPrintRange_PrintRange(long __this__nativeId, int range);

/**
Returns the last page to be printed. By default, this value is set to 0.
*/

    @QtBlockedSlot
    public final int toPage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toPage(nativeId());
    }
    @QtBlockedSlot
    native int __qt_toPage(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract int exec();
    @QtBlockedSlot
    native int __qt_exec(long __this__nativeId);

/**
@exclude
*/

    public static native QAbstractPrintDialog fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractPrintDialog(QPrivateConstructor p) { super(p); } 
}
