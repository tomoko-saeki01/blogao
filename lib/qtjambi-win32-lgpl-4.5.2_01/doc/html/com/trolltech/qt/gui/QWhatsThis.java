package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QWhatsThis class provides a simple description of any widget, i. . answering the question "What's This?". "What's This?" help is part of an application's online help system, and provides users with information about the functionality and usage of a particular widget. "What's This?" help texts are typically longer and more detailed than {@link com.trolltech.qt.gui.QToolTip tooltips}, but generally provide less information than that supplied by separate help windows. <p>QWhatsThis provides a single window with an explanatory text that pops up when the user asks "What's This?". The default way for users to ask the question is to move the focus to the relevant widget and press Shift+F1. The help text appears immediately; it goes away as soon as the user does something else. (Note that if there is a shortcut for Shift+F1, this mechanism will not work.) Some dialogs provide a "?" button that users can click to enter "What's This?" mode; they then click the relevant widget to pop up the "What's This?" window. It is also possible to provide a a menu option or toolbar button to switch into "What's This?" mode. <p>To add "What's This?" text to a widget or an action, you simply call {@link QWidget#setWhatsThis(java.lang.String) QWidget::setWhatsThis()} or {@link QAction#setWhatsThis(java.lang.String) QAction::setWhatsThis()}. <p>The text can be either rich text or plain text. If you specify a rich text formatted string, it will be rendered using the default stylesheet, making it possible to embed images in the displayed text. To be as fast as possible, the default stylesheet uses a simple method to determine whether the text can be rendered as plain text. See Qt::mightBeRichText() for details. <pre class="snippet">
        newAct = new QAction(tr("New"), this);
        newAct.setShortcut(tr("Ctrl+N"));
        newAct.setStatusTip(tr("Create a new file"));
        newAct.setWhatsThis(tr("Click this option to create a new file."));
    </pre> An alternative way to enter "What's This?" mode is to call {@link com.trolltech.qt.gui.QWhatsThis#createAction() createAction()}, and add the returned {@link com.trolltech.qt.gui.QAction QAction} to either a menu or a tool bar. By invoking this context help action (in the picture below, the button with the arrow and question mark icon) the user switches into "What's This?" mode. If they now click on a widget the appropriate help text is shown. The mode is left when help is given or when the user presses Esc. <br><center><img src="../images/whatsthis.png"></center><br> You can enter "What's This?" mode programmatically with {@link com.trolltech.qt.gui.QWhatsThis#enterWhatsThisMode() enterWhatsThisMode()}, check the mode with {@link com.trolltech.qt.gui.QWhatsThis#inWhatsThisMode() inWhatsThisMode()}, and return to normal mode with {@link com.trolltech.qt.gui.QWhatsThis#leaveWhatsThisMode() leaveWhatsThisMode()}. <p>If you want to control the "What's This?" behavior of a widget manually see {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_CustomWhatsThis }. <p>It is also possible to show different help texts for different regions of a widget, by using a {@link com.trolltech.qt.gui.QHelpEvent QHelpEvent} of type {@link com.trolltech.qt.core.QEvent.Type QEvent::WhatsThis }. Intercept the help event in your widget's QWidget::event() function and call {@link com.trolltech.qt.gui.QWhatsThis#showText(com.trolltech.qt.core.QPoint, java.lang.String) QWhatsThis::showText()} with the text you want to display for the position specified in {@link com.trolltech.qt.gui.QHelpEvent#pos() QHelpEvent::pos()}. If the text is rich text and the user clicks on a link, the widget also receives a {@link com.trolltech.qt.gui.QWhatsThisClickedEvent QWhatsThisClickedEvent} with the link's reference as {@link com.trolltech.qt.gui.QWhatsThisClickedEvent#href() QWhatsThisClickedEvent::href()}. If a {@link com.trolltech.qt.gui.QWhatsThisClickedEvent QWhatsThisClickedEvent} is handled (i.e. QWidget::event() returns true), the help window remains visible. Call {@link com.trolltech.qt.gui.QWhatsThis#hideText() QWhatsThis::hideText()} to hide it explicitly. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolTip QToolTip}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public final class QWhatsThis extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }


/**
Returns a ready-made {@link com.trolltech.qt.gui.QAction QAction}, used to invoke "What's This?" context help, with the given <tt>parent</tt>. <p>The returned {@link com.trolltech.qt.gui.QAction QAction} provides a convenient way to let users enter "What's This?" mode.
*/

    public static com.trolltech.qt.gui.QAction createAction() {
        return createAction((com.trolltech.qt.core.QObject)null);
    }
/**
Returns a ready-made {@link com.trolltech.qt.gui.QAction QAction}, used to invoke "What's This?" context help, with the given <tt>parent</tt>. <p>The returned {@link com.trolltech.qt.gui.QAction QAction} provides a convenient way to let users enter "What's This?" mode.
*/

    public static com.trolltech.qt.gui.QAction createAction(com.trolltech.qt.core.QObject parent)    {
        return __qt_createAction_QObject(parent == null ? 0 : parent.nativeId());
    }
    native static com.trolltech.qt.gui.QAction __qt_createAction_QObject(long parent);

/**
This function switches the user interface into "What's This?" mode. The user interface can be switched back into normal mode by the user (e.g. by them clicking or pressing Esc), or programmatically by calling {@link com.trolltech.qt.gui.QWhatsThis#leaveWhatsThisMode() leaveWhatsThisMode()}. <p>When entering "What's This?" mode, a {@link com.trolltech.qt.core.QEvent QEvent} of type Qt::EnterWhatsThisMode is sent to all toplevel widgets. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThis#inWhatsThisMode() inWhatsThisMode()}, and {@link com.trolltech.qt.gui.QWhatsThis#leaveWhatsThisMode() leaveWhatsThisMode()}. <br></DD></DT>
*/

    public native static void enterWhatsThisMode();

/**
If a "What's This?" window is showing, this destroys it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThis#showText(com.trolltech.qt.core.QPoint, java.lang.String) showText()}. <br></DD></DT>
*/

    public native static void hideText();

/**
Returns true if the user interface is in "What's This?" mode; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThis#enterWhatsThisMode() enterWhatsThisMode()}. <br></DD></DT>
*/

    public native static boolean inWhatsThisMode();

/**
If the user interface is in "What's This?" mode, this function switches back to normal mode; otherwise it does nothing. <p>When leaving "What's This?" mode, a {@link com.trolltech.qt.core.QEvent QEvent} of type Qt::LeaveWhatsThisMode is sent to all toplevel widgets. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThis#enterWhatsThisMode() enterWhatsThisMode()}, and {@link com.trolltech.qt.gui.QWhatsThis#inWhatsThisMode() inWhatsThisMode()}. <br></DD></DT>
*/

    public native static void leaveWhatsThisMode();


/**
Shows <tt>text</tt> as a "What's This?" window, at global position <tt>pos</tt>. The optional widget argument, <tt>w</tt>, is used to determine the appropriate screen on multi-head systems. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThis#hideText() hideText()}. <br></DD></DT>
*/

    public static void showText(com.trolltech.qt.core.QPoint pos, java.lang.String text) {
        showText(pos, text, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Shows <tt>text</tt> as a "What's This?" window, at global position <tt>pos</tt>. The optional widget argument, <tt>w</tt>, is used to determine the appropriate screen on multi-head systems. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThis#hideText() hideText()}. <br></DD></DT>
*/

    public static void showText(com.trolltech.qt.core.QPoint pos, java.lang.String text, com.trolltech.qt.gui.QWidget w)    {
        __qt_showText_QPoint_String_QWidget(pos == null ? 0 : pos.nativeId(), text, w == null ? 0 : w.nativeId());
    }
    native static void __qt_showText_QPoint_String_QWidget(long pos, java.lang.String text, long w);

/**
@exclude
*/

    public static native QWhatsThis fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWhatsThis(QPrivateConstructor p) { super(p); } 
}
