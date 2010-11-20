package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QInputContext class abstracts the input method dependent data and composing state. An input method is responsible to input complex text that cannot be inputted via simple keymap. It converts a sequence of input events (typically key events) into a text string through the input method specific converting process. The class of the processes are widely ranging from simple finite state machine to complex text translator that pools a whole paragraph of a text with text editing capability to perform grammar and semantic analysis. <p>To abstract such different input method specific intermediate information, Qt offers the QInputContext as base class. The concept is well known as 'input context' in the input method domain. an input context is created for a text widget in response to a demand. It is ensured that an input context is prepared for an input method before input to a text widget. <p>Multiple input contexts that is belonging to a single input method may concurrently coexist. Suppose multi-window text editor. Each text widget of window A and B holds different QInputContext instance which contains different state information such as partially composed text.<a name="groups-of-functions"><h2>Groups of Functions</h2> <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Context</center></th><th><center> Functions</center></th></tr></thead><tr valign="top" class="even"><td> Receiving information</td><td> x11FilterEvent(), {@link com.trolltech.qt.gui.QInputContext#filterEvent(com.trolltech.qt.core.QEvent) filterEvent()}, {@link com.trolltech.qt.gui.QInputContext#mouseHandler(int, com.trolltech.qt.gui.QMouseEvent) mouseHandler()}</td></tr><tr valign="top" class="odd"><td> Sending back composed text</td><td> {@link com.trolltech.qt.gui.QInputContext#sendEvent(com.trolltech.qt.gui.QInputMethodEvent) sendEvent()}</td></tr><tr valign="top" class="even"><td> State change notification</td><td> setFocusWidget(), {@link com.trolltech.qt.gui.QInputContext#reset() reset()}</td></tr><tr valign="top" class="odd"><td> Context information</td><td> {@link com.trolltech.qt.gui.QInputContext#identifierName() identifierName()}, {@link com.trolltech.qt.gui.QInputContext#language() language()}, {@link com.trolltech.qt.gui.QInputContext#font() font()}, {@link com.trolltech.qt.gui.QInputContext#isComposing() isComposing()}</td></tr></table>Copyright (C) 2003-2004 immodule for Qt Project. All rights reserved.This file is written to contribute to Nokia Corporation and/or its subsidiary(-ies) under their own license. You may use this file under your Qt license. Following description is copied from their original file headers. Contact immodule-qt@freedesktop.org if any conditions of this licensing are not clear to you. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextPlugin QInputContextPlugin}, {@link com.trolltech.qt.gui.QInputContextFactory QInputContextFactory}, and {@link com.trolltech.qt.gui.QApplication#setInputContext(com.trolltech.qt.gui.QInputContext) QApplication::setInputContext()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QInputContext extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QInputContext {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public java.lang.String identifierName() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_identifierName(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean isComposing() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_isComposing(nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.lang.String language() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_language(nativeId());
        }

        @Override
        @QtBlockedSlot
        public void reset() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_reset(nativeId());
        }
    }

    
/**
<p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QInputContext#standardFormat(com.trolltech.qt.gui.QInputContext.StandardFormat) standardFormat()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum StandardFormat implements com.trolltech.qt.QtEnumerator {
/**
 The preedit text.
*/

        PreeditFormat(0),
/**
 The selection text.
*/

        SelectionFormat(1);

        StandardFormat(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QInputContext$StandardFormat constant with the specified <tt>int</tt>.</brief>
*/

        public static StandardFormat resolve(int value) {
            return (StandardFormat) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return PreeditFormat;
            case 1: return SelectionFormat;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs an input context with the given <tt>parent</tt>.
*/

    public QInputContext() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an input context with the given <tt>parent</tt>.
*/

    public QInputContext(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QInputContext_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QInputContext_QObject(long parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget focusWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_focusWidget(long __this__nativeId);

/**
Sends an input method event specified by <tt>event</tt> to the current focus widget. Implementations of QInputContext should call this method to send the generated input method events and not {@link com.trolltech.qt.core.QCoreApplication#sendEvent(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) QApplication::sendEvent()}, as the events might have to get dispatched to a different application on some platforms. <p>Some complex input methods route the handling to several child contexts (e.g. to enable language switching). To account for this, QInputContext will check if the parent object is a QInputContext. If yes, it will call the parents {@link com.trolltech.qt.gui.QInputContext#sendEvent(com.trolltech.qt.gui.QInputMethodEvent) sendEvent()} implementation instead of sending the event directly. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputMethodEvent QInputMethodEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void sendEvent(com.trolltech.qt.gui.QInputMethodEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sendEvent_QInputMethodEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_sendEvent_QInputMethodEvent(long __this__nativeId, long event);

/**
Returns a {@link com.trolltech.qt.gui.QTextFormat QTextFormat} object that specifies the format for component <tt>s</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextFormat standardFormat(com.trolltech.qt.gui.QInputContext.StandardFormat s)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_standardFormat_StandardFormat(nativeId(), s.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextFormat __qt_standardFormat_StandardFormat(long __this__nativeId, int s);

/**
This is a preliminary interface for Qt 4.
*/

    @QtBlockedSlot
    public java.util.List<com.trolltech.qt.gui.QAction> actions()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_actions(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QAction> __qt_actions(long __this__nativeId);

/**
This function can be reimplemented in a subclass to filter input events. <p>Return true if the <tt>event</tt> has been consumed. Otherwise, the unfiltered <tt>event</tt> will be forwarded to widgets as ordinary way. Although the input events have accept() and ignore() methods, leave it untouched. <p><tt>event</tt> is currently restricted to {@link com.trolltech.qt.gui.QKeyEvent QKeyEvent}. But some input method related events such as {@link com.trolltech.qt.gui.QWheelEvent QWheelEvent} or {@link com.trolltech.qt.gui.QTabletEvent QTabletEvent} may be added in future. <p>The filtering opportunity is always given to the input context as soon as possible. It has to be taken place before any other key event consumers such as eventfilters and accelerators because some input methods require quite various key combination and sequences. It often conflicts with accelerators and so on, so we must give the input context the filtering opportunity first to ensure all input methods work properly regardless of application design. <p>Ordinary input methods require discrete key events to work properly, so Qt's key compression is always disabled for any input contexts. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QKeyEvent QKeyEvent}, and x11FilterEvent(). <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean filterEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_filterEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_filterEvent_QEvent(long __this__nativeId, long event);

/**
Returns the font of the current input widget
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QFont font()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_font(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_font(long __this__nativeId);

/**
This function must be implemented in any subclasses to return the identifier name of the input method. <p>Return value is the name to identify and specify input methods for the input method switching mechanism and so on. The name has to be consistent with {@link com.trolltech.qt.gui.QInputContextPlugin#keys() QInputContextPlugin::keys()}. The name has to consist of ASCII characters only. <p>There are two different names with different responsibility in the input method domain. This function returns one of them. Another name is called 'display name' that stands for the name for endusers appeared in a menu and so on. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextPlugin#keys() QInputContextPlugin::keys()}, and {@link com.trolltech.qt.gui.QInputContextPlugin#displayName(java.lang.String) QInputContextPlugin::displayName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.lang.String identifierName();
    @QtBlockedSlot
    native java.lang.String __qt_identifierName(long __this__nativeId);

/**
This function indicates whether InputMethodStart event had been sent to the current focus widget. It is ensured that an input context can send InputMethodCompose or InputMethodEnd event safely if this function returned true. <p>The state is automatically being tracked through {@link com.trolltech.qt.gui.QInputContext#sendEvent(com.trolltech.qt.gui.QInputMethodEvent) sendEvent()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContext#sendEvent(com.trolltech.qt.gui.QInputMethodEvent) sendEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean isComposing();
    @QtBlockedSlot
    native boolean __qt_isComposing(long __this__nativeId);

/**
This function must be implemented in any subclasses to return a language code (e. . "zh_CN", "zh_TW", "zh_HK", "ja", "ko", ...) of the input context. If the input context can handle multiple languages, return the currently used one. The name has to be consistent with QInputContextPlugin::language(). <p>This information will be used by language tagging feature in {@link com.trolltech.qt.gui.QInputMethodEvent QInputMethodEvent}. It is required to distinguish unified han characters correctly. It enables proper font and character code handling. Suppose CJK-awared multilingual web browser (that automatically modifies fonts in CJK-mixed text) and XML editor (that automatically inserts lang attr).
*/

    @QtBlockedSlot
    public abstract java.lang.String language();
    @QtBlockedSlot
    native java.lang.String __qt_language(long __this__nativeId);

/**
This function can be reimplemented in a subclass to handle mouse press, release, double-click, and move events within the preedit text. You can use the function to implement mouse-oriented user interface such as text selection or popup menu for candidate selection. <p>The <tt>x</tt> parameter is the offset within the string that was sent with the InputMethodCompose event. The alteration boundary of <tt>x</tt> is ensured as character boundary of preedit string accurately. <p>The <tt>event</tt> parameter is the event that was sent to the editor widget. The event type is {@link com.trolltech.qt.core.QEvent.Type QEvent::MouseButtonPress }, {@link com.trolltech.qt.core.QEvent.Type QEvent::MouseButtonRelease }, {@link com.trolltech.qt.core.QEvent.Type QEvent::MouseButtonDblClick } or QEvent::MouseButtonMove. The event's button and state indicate the kind of operation that was performed.
*/

    @QtBlockedSlot
    public void mouseHandler(int x, com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseHandler_int_QMouseEvent(nativeId(), x, event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseHandler_int_QMouseEvent(long __this__nativeId, int x, long event);

/**
This function can be reimplemented in a subclass to reset the state of the input method. <p>This function is called by several widgets to reset input state. For example, a text widget call this function before inserting a text to make widget ready to accept a text. <p>Default implementation is sufficient for simple input method. You can override this function to reset external input method engines in complex input method. In the case, call {@link com.trolltech.qt.gui.QInputContext#reset() QInputContext::reset()} to ensure proper termination of inputting. <p>You must not send any {@link com.trolltech.qt.gui.QInputMethodEvent QInputMethodEvent} except empty InputMethodEnd event using {@link com.trolltech.qt.gui.QInputContext#reset() QInputContext::reset()} at reimplemented {@link com.trolltech.qt.gui.QInputContext#reset() reset()}. It will break input state consistency.
*/

    @QtBlockedSlot
    public abstract void reset();
    @QtBlockedSlot
    native void __qt_reset(long __this__nativeId);

/**
This virtual function is called when a state in the focus widget has changed. QInputContext can then use {@link com.trolltech.qt.gui.QWidget#inputMethodQuery(com.trolltech.qt.core.Qt.InputMethodQuery) QWidget::inputMethodQuery()} to query the new state of the widget.
*/

    @QtBlockedSlot
    public void update()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_update(nativeId());
    }
    @QtBlockedSlot
    native void __qt_update(long __this__nativeId);

/**
This virtual function is called when the specified <tt>widget</tt> is destroyed. The <tt>widget</tt> is a widget on which this input context is installed.
*/

    @QtBlockedSlot
    public void widgetDestroyed(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_widgetDestroyed_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @QtBlockedSlot
    native void __qt_widgetDestroyed_QWidget(long __this__nativeId, long w);

/**
@exclude
*/

    public static native QInputContext fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QInputContext(QPrivateConstructor p) { super(p); } 
}
