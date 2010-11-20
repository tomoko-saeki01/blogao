package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStatusTipEvent class provides an event that is used to show messages in a status bar. Status tips can be set on a widget using the {@link QWidget#setStatusTip(java.lang.String) QWidget::setStatusTip()} function. They are shown in the status bar when the mouse cursor enters the widget. For example: <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td> <pre class="snippet">
    public main()
    {
    
        QWidget myWidget = new QWidget();
        myWidget.setStatusTip(tr("This is my widget."));

        setCentralWidget(myWidget);
    ...
    }
    </pre></td><td> <br><center><img src="../images/qstatustipevent-widget.png"></center><br></td></tr></table> Status tips can also be set on actions using the {@link QAction#setStatusTip(java.lang.String) QAction::setStatusTip()} function: <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td> <pre class="snippet"> 
    public main()
    {
    
        QMenu fileMenu = menuBar().addMenu(tr("File"));

        QAction newAct = new QAction(tr("New"), this);
        newAct.setStatusTip(tr("Create a new file."));
        fileMenu.addAction(newAct);
    ...
    }
    </pre></td><td> <br><center><img src="../images/qstatustipevent-action.png"></center><br></td></tr></table> Finally, status tips are supported for the item view classes through the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::StatusTipRole } enum value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar QStatusBar}, {@link com.trolltech.qt.gui.QHelpEvent QHelpEvent}, and {@link com.trolltech.qt.gui.QWhatsThisClickedEvent QWhatsThisClickedEvent}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStatusTipEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a status tip event with the text specified by <tt>tip</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusTipEvent#tip() tip()}. <br></DD></DT>
*/

    public QStatusTipEvent(java.lang.String tip){
        super((QPrivateConstructor)null);
        __qt_QStatusTipEvent_String(tip);
    }

    native void __qt_QStatusTipEvent_String(java.lang.String tip);

/**
Returns the message to show in the status bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStatusBar#showMessage(java.lang.String) QStatusBar::showMessage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String tip()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tip(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_tip(long __this__nativeId);

/**
@exclude
*/

    public static native QStatusTipEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStatusTipEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QStatusTipEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
