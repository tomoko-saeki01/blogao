package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAbstractPageSetupDialog class provides a base for implementations of page setup dialogs.
*/
@QtJambiGeneratedClass
public abstract class QAbstractPageSetupDialog extends com.trolltech.qt.gui.QDialog
{

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractPageSetupDialog {
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
This method is internal to Qt Jambi. 

	@exclude
*/

    public QAbstractPageSetupDialog(com.trolltech.qt.gui.QPrinter printer) {
        this(printer, (com.trolltech.qt.gui.QWidget)null);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QAbstractPageSetupDialog(com.trolltech.qt.gui.QPrinter printer, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractPageSetupDialog_QPrinter_QWidget(printer == null ? 0 : printer.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractPageSetupDialog_QPrinter_QWidget(long printer, long parent);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void done(int result)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_done_int(nativeId(), result);
    }
    @QtBlockedSlot
    native void __qt_done_int(long __this__nativeId, int result);

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

    public static native QAbstractPageSetupDialog fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractPageSetupDialog(QPrivateConstructor p) { super(p); } 
}
