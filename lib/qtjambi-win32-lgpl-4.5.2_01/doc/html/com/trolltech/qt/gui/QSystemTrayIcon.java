package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QSystemTrayIcon class provides an icon for an application in the system tray. Modern operating systems usually provide a special area on the desktop, called the system tray or notification area, where long-running applications can display icons and short messages. <br><center><img src="../images/system-tray.png"></center><br> The QSystemTrayIcon class can be used on the following platforms: <ul><li> All supported versions of Windows.</li><li> All window managers for X11 that implement the {@link <a href="../http-www-freedesktop-org.html">freedesktop.org</a>} system tray specification, including recent versions of KDE and GNOME.</li><li> All supported versions of Mac OS X. Note that the Growl notification system must be installed for {@link com.trolltech.qt.gui.QSystemTrayIcon#showMessage(java.lang.String, java.lang.String, com.trolltech.qt.gui.QSystemTrayIcon.MessageIcon) QSystemTrayIcon::showMessage()} to display messages.</li></ul> To check whether a system tray is present on the user's desktop, call the {@link com.trolltech.qt.gui.QSystemTrayIcon#isSystemTrayAvailable() QSystemTrayIcon::isSystemTrayAvailable()} static function. <p>To add a system tray entry, create a QSystemTrayIcon object, call {@link com.trolltech.qt.gui.QSystemTrayIcon#setContextMenu(com.trolltech.qt.gui.QMenu) setContextMenu()} to provide a context menu for the icon, and call {@link com.trolltech.qt.gui.QSystemTrayIcon#show() show()} to make it visible in the system tray. Status notification messages ("balloon messages") can be displayed at any time using {@link com.trolltech.qt.gui.QSystemTrayIcon#showMessage(java.lang.String, java.lang.String, com.trolltech.qt.gui.QSystemTrayIcon.MessageIcon) showMessage()}. <p>If the system tray is unavailable when a system tray icon is constructed, but becomes available later, QSystemTrayIcon will automatically add an entry for the application in the system tray if the icon is {@link QSystemTrayIcon#isVisible() visible}. <p>The {@link com.trolltech.qt.gui.QSystemTrayIcon#activated activated() } signal is emitted when the user activates the icon. <p>Only on X11, when a tooltip is requested, the QSystemTrayIcon receives a {@link com.trolltech.qt.gui.QHelpEvent QHelpEvent} of type {@link com.trolltech.qt.core.QEvent.Type QEvent::ToolTip }. Additionally, the QSystemTrayIcon receives wheel events of type {@link com.trolltech.qt.core.QEvent.Type QEvent::Wheel }. These are not supported on any other platform. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDesktopServices QDesktopServices}, {@link com.trolltech.qt.gui.QDesktopWidget QDesktopWidget}, {@link <a href="../desktop-integration.html">Desktop Integration</a>}, and {@link <a href="../qtjambi-systemtrayexample.html">System Tray Icon Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSystemTrayIcon extends com.trolltech.qt.core.QObject
{

    private Object __rcContextMenu = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    
/**
This enum describes the icon that is shown when a balloon message is displayed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMessageBox QMessageBox}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum MessageIcon implements com.trolltech.qt.QtEnumerator {
/**
 No icon is shown.
*/

        NoIcon(0),
/**
 An information icon is shown.
*/

        Information(1),
/**
 A standard warning icon is shown.
*/

        Warning(2),
/**
 A critical warning icon is shown.
*/

        Critical(3);

        MessageIcon(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSystemTrayIcon$MessageIcon constant with the specified <tt>int</tt>.</brief>
*/

        public static MessageIcon resolve(int value) {
            return (MessageIcon) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoIcon;
            case 1: return Information;
            case 2: return Warning;
            case 3: return Critical;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the reason the system tray was activated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSystemTrayIcon#activated activated() }. <br></DD></DT>
*/
@QtBlockedEnum
    public enum ActivationReason implements com.trolltech.qt.QtEnumerator {
/**
 Unknown reason
*/

        Unknown(0),
/**
 The context menu for the system tray entry was requested
*/

        Context(1),
/**
 The system tray entry was double clicked
*/

        DoubleClick(2),
/**
 The system tray entry was clicked
*/

        Trigger(3),
/**
 The system tray entry was clicked with the middle mouse button
*/

        MiddleClick(4);

        ActivationReason(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSystemTrayIcon$ActivationReason constant with the specified <tt>int</tt>.</brief>
*/

        public static ActivationReason resolve(int value) {
            return (ActivationReason) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Unknown;
            case 1: return Context;
            case 2: return DoubleClick;
            case 3: return Trigger;
            case 4: return MiddleClick;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QSystemTrayIcon$ActivationReason(named: reason)&gt;:<p> This signal is emitted when the user activates the system tray icon. <tt>reason</tt> specifies the reason for activation. {@link com.trolltech.qt.gui.QSystemTrayIcon.ActivationReason QSystemTrayIcon::ActivationReason } enumerates the various reasons. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSystemTrayIcon.ActivationReason QSystemTrayIcon::ActivationReason }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QSystemTrayIcon.ActivationReason> activated = new Signal1<com.trolltech.qt.gui.QSystemTrayIcon.ActivationReason>();

    private final void activated(com.trolltech.qt.gui.QSystemTrayIcon.ActivationReason reason)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activated_ActivationReason(nativeId(), reason.value());
    }
    native void __qt_activated_ActivationReason(long __this__nativeId, int reason);
/**
 This signal is emitted when the message displayed using {@link com.trolltech.qt.gui.QSystemTrayIcon#showMessage(java.lang.String, java.lang.String, com.trolltech.qt.gui.QSystemTrayIcon.MessageIcon) showMessage()} was clicked by the user. <p>Currently this signal is not sent on Mac OS X. <p><b>Note:</b> We follow Microsoft Windows XP/Vista behavior, so the signal is also emitted when the user clicks on a tray icon with a balloon message displayed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSystemTrayIcon#activated activated() }. <br></DD></DT>
*/

    public final Signal0 messageClicked = new Signal0();

    private final void messageClicked()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_messageClicked(nativeId());
    }
    native void __qt_messageClicked(long __this__nativeId);


/**
Constructs a QSystemTrayIcon object with the given <tt>parent</tt>. <p>The icon is initially invisible. <p><DT><b>See also:</b><br><DD>{@link QSystemTrayIcon#isVisible() visible}. <br></DD></DT>
*/

    public QSystemTrayIcon() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QSystemTrayIcon object with the given <tt>parent</tt>. <p>The icon is initially invisible. <p><DT><b>See also:</b><br><DD>{@link QSystemTrayIcon#isVisible() visible}. <br></DD></DT>
*/

    public QSystemTrayIcon(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSystemTrayIcon_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSystemTrayIcon_QObject(long parent);


/**
Constructs a QSystemTrayIcon object with the given <tt>icon</tt> and <tt>parent</tt>. <p>The icon is initially invisible. <p><DT><b>See also:</b><br><DD>{@link QSystemTrayIcon#isVisible() visible}. <br></DD></DT>
*/

    public QSystemTrayIcon(com.trolltech.qt.gui.QIcon icon) {
        this(icon, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QSystemTrayIcon object with the given <tt>icon</tt> and <tt>parent</tt>. <p>The icon is initially invisible. <p><DT><b>See also:</b><br><DD>{@link QSystemTrayIcon#isVisible() visible}. <br></DD></DT>
*/

    public QSystemTrayIcon(com.trolltech.qt.gui.QIcon icon, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSystemTrayIcon_QIcon_QObject(icon == null ? 0 : icon.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSystemTrayIcon_QIcon_QObject(long icon, long parent);

/**
Returns the current context menu for the system tray entry. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSystemTrayIcon#setContextMenu(com.trolltech.qt.gui.QMenu) setContextMenu()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMenu contextMenu()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contextMenu(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMenu __qt_contextMenu(long __this__nativeId);

/**
Returns the geometry of the system tray icon in screen coordinates. <p><DT><b>See also:</b><br><DD>{@link QSystemTrayIcon#isVisible() visible}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect geometry()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_geometry(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_geometry(long __this__nativeId);

/**
Hides the system tray entry. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSystemTrayIcon#show() show()}, and {@link QSystemTrayIcon#isVisible() visible}. <br></DD></DT>
*/

    public final void hide()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hide(nativeId());
    }
    native void __qt_hide(long __this__nativeId);

/**
This property holds the system tray icon. On Windows, the system tray icon size is 16x16; on X11, the preferred size is 22x22. The icon will be scaled to the appropriate size as necessary.
*/

    @com.trolltech.qt.QtPropertyReader(name="icon")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon icon()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_icon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon(long __this__nativeId);

/**
This property holds whether the system tray entry is visible. Setting this property to true or calling {@link com.trolltech.qt.gui.QSystemTrayIcon#show() show()} makes the system tray icon visible; setting this property to false or calling {@link com.trolltech.qt.gui.QSystemTrayIcon#hide() hide()} hides it.
*/

    @com.trolltech.qt.QtPropertyReader(name="visible")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final boolean isVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isVisible(long __this__nativeId);

/**
Sets the specified <tt>menu</tt> to be the context menu for the system tray icon. <p>The menu will pop up when the user requests the context menu for the system tray icon by clicking the mouse button. <p>On Mac OS X, this is currenly converted to a NSMenu, so the aboutToHide() signal is not emitted. <p><b>Note:</b> The system tray icon does not take ownership of the menu. You must ensure that it is deleted at the appropriate time by, for example, creating the menu with a suitable parent object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSystemTrayIcon#contextMenu() contextMenu()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setContextMenu(com.trolltech.qt.gui.QMenu menu)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcContextMenu = menu;
        }
        __qt_setContextMenu_QMenu(nativeId(), menu == null ? 0 : menu.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setContextMenu_QMenu(long __this__nativeId, long menu);

/**
This property holds the system tray icon. On Windows, the system tray icon size is 16x16; on X11, the preferred size is 22x22. The icon will be scaled to the appropriate size as necessary.
*/

    @com.trolltech.qt.QtPropertyWriter(name="icon")
    @QtBlockedSlot
    public final void setIcon(com.trolltech.qt.gui.QIcon icon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIcon_QIcon(nativeId(), icon == null ? 0 : icon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIcon_QIcon(long __this__nativeId, long icon);

/**
This property holds the tooltip for the system tray entry. On some systems, the tooltip's length is limited. The tooltip will be truncated if necessary.
*/

    @com.trolltech.qt.QtPropertyWriter(name="toolTip")
    @QtBlockedSlot
    public final void setToolTip(java.lang.String tip)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolTip_String(nativeId(), tip);
    }
    @QtBlockedSlot
    native void __qt_setToolTip_String(long __this__nativeId, java.lang.String tip);

/**
This property holds whether the system tray entry is visible. Setting this property to true or calling {@link com.trolltech.qt.gui.QSystemTrayIcon#show() show()} makes the system tray icon visible; setting this property to false or calling {@link com.trolltech.qt.gui.QSystemTrayIcon#hide() hide()} hides it.
*/

    @com.trolltech.qt.QtPropertyWriter(name="visible")
    public final void setVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), visible);
    }
    native void __qt_setVisible_boolean(long __this__nativeId, boolean visible);

/**
Shows the icon in the system tray. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSystemTrayIcon#hide() hide()}, and {@link QSystemTrayIcon#isVisible() visible}. <br></DD></DT>
*/

    public final void show()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_show(nativeId());
    }
    native void __qt_show(long __this__nativeId);


/**
Shows a balloon message for the entry with the given <tt>title</tt>, <tt>message</tt> and <tt>icon</tt> for the time specified in <tt>millisecondsTimeoutHint</tt>. <tt>title</tt> and <tt>message</tt> must be plain text strings. <p>Message can be clicked by the user; the {@link com.trolltech.qt.gui.QSystemTrayIcon#messageClicked messageClicked() } signal will emitted when this occurs. <p>Note that display of messages are dependent on the system configuration and user preferences, and that messages may not appear at all. Hence, it should not be relied upon as the sole means for providing critical information. <p>On Windows, the <tt>millisecondsTimeoutHint</tt> is usually ignored by the system when the application has focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSystemTrayIcon#show() show()}, and {@link com.trolltech.qt.gui.QSystemTrayIcon#supportsMessages() supportsMessages()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void showMessage(java.lang.String title, java.lang.String msg, com.trolltech.qt.gui.QSystemTrayIcon.MessageIcon icon) {
        showMessage(title, msg, icon, (int)10000);
    }

/**
Shows a balloon message for the entry with the given <tt>title</tt>, <tt>message</tt> and <tt>icon</tt> for the time specified in <tt>millisecondsTimeoutHint</tt>. <tt>title</tt> and <tt>message</tt> must be plain text strings. <p>Message can be clicked by the user; the {@link com.trolltech.qt.gui.QSystemTrayIcon#messageClicked messageClicked() } signal will emitted when this occurs. <p>Note that display of messages are dependent on the system configuration and user preferences, and that messages may not appear at all. Hence, it should not be relied upon as the sole means for providing critical information. <p>On Windows, the <tt>millisecondsTimeoutHint</tt> is usually ignored by the system when the application has focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSystemTrayIcon#show() show()}, and {@link com.trolltech.qt.gui.QSystemTrayIcon#supportsMessages() supportsMessages()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void showMessage(java.lang.String title, java.lang.String msg) {
        showMessage(title, msg, com.trolltech.qt.gui.QSystemTrayIcon.MessageIcon.Information, (int)10000);
    }
/**
Shows a balloon message for the entry with the given <tt>title</tt>, <tt>message</tt> and <tt>icon</tt> for the time specified in <tt>millisecondsTimeoutHint</tt>. <tt>title</tt> and <tt>message</tt> must be plain text strings. <p>Message can be clicked by the user; the {@link com.trolltech.qt.gui.QSystemTrayIcon#messageClicked messageClicked() } signal will emitted when this occurs. <p>Note that display of messages are dependent on the system configuration and user preferences, and that messages may not appear at all. Hence, it should not be relied upon as the sole means for providing critical information. <p>On Windows, the <tt>millisecondsTimeoutHint</tt> is usually ignored by the system when the application has focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSystemTrayIcon#show() show()}, and {@link com.trolltech.qt.gui.QSystemTrayIcon#supportsMessages() supportsMessages()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void showMessage(java.lang.String title, java.lang.String msg, com.trolltech.qt.gui.QSystemTrayIcon.MessageIcon icon, int msecs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showMessage_String_String_MessageIcon_int(nativeId(), title, msg, icon.value(), msecs);
    }
    @QtBlockedSlot
    native void __qt_showMessage_String_String_MessageIcon_int(long __this__nativeId, java.lang.String title, java.lang.String msg, int icon, int msecs);

/**
This property holds the tooltip for the system tray entry. On some systems, the tooltip's length is limited. The tooltip will be truncated if necessary.
*/

    @com.trolltech.qt.QtPropertyReader(name="toolTip")
    @QtBlockedSlot
    public final java.lang.String toolTip()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toolTip(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toolTip(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long event);

/**
Returns true if the system tray is available; otherwise returns false. <p>If the system tray is currently unavailable but becomes available later, QSystemTrayIcon will automatically add an entry in the system tray if it is {@link QSystemTrayIcon#isVisible() visible}.
*/

    public native static boolean isSystemTrayAvailable();

/**
Returns true if the system tray supports balloon messages; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSystemTrayIcon#showMessage(java.lang.String, java.lang.String, com.trolltech.qt.gui.QSystemTrayIcon.MessageIcon) showMessage()}. <br></DD></DT>
*/

    public native static boolean supportsMessages();

/**
@exclude
*/

    public static native QSystemTrayIcon fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSystemTrayIcon(QPrivateConstructor p) { super(p); } 
}
