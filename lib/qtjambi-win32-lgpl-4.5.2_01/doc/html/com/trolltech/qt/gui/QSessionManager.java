package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QSessionManager class provides access to the session manager. A session manager in a desktop environment (in which Qt GUI applications live) keeps track of a session, which is a group of running applications, each of which has a particular state. The state of an application contains (most notably) the documents the application has open and the position and size of its windows. <p>The session manager is used to save the session, e.g. when the machine is shut down, and to restore a session, e.g. when the machine is started up. We recommend that you use {@link com.trolltech.qt.core.QSettings QSettings} to save an individual application's settings, e.g. window positions, recently used files, etc. When the application is restarted by the session manager, you can restore the settings. <p>QSessionManager provides an interface between the application and the session manager so that the program can work well with the session manager. In Qt, session management requests for action are handled by the two virtual functions {@link com.trolltech.qt.gui.QApplication#commitData(com.trolltech.qt.gui.QSessionManager) QApplication::commitData()} and {@link com.trolltech.qt.gui.QApplication#saveState(com.trolltech.qt.gui.QSessionManager) QApplication::saveState()}. Both provide a reference to a session manager object as argument, to allow the application to communicate with the session manager. The session manager can only be accessed through these functions. <p>No user interaction is possible unless the application gets explicit permission from the session manager. You ask for permission by calling {@link com.trolltech.qt.gui.QSessionManager#allowsInteraction() allowsInteraction()} or, if it's really urgent, {@link com.trolltech.qt.gui.QSessionManager#allowsErrorInteraction() allowsErrorInteraction()}. Qt does not enforce this, but the session manager may. <p>You can try to abort the shutdown process by calling {@link com.trolltech.qt.gui.QSessionManager#cancel() cancel()}. The default commitData() function does this if some top-level window rejected its closeEvent(). <p>For sophisticated session managers provided on Unix/X11, QSessionManager offers further possibilities to fine-tune an application's session management behavior: {@link com.trolltech.qt.gui.QSessionManager#setRestartCommand(java.util.List) setRestartCommand()}, {@link com.trolltech.qt.gui.QSessionManager#setDiscardCommand(java.util.List) setDiscardCommand()}, {@link com.trolltech.qt.gui.QSessionManager#setRestartHint(com.trolltech.qt.gui.QSessionManager.RestartHint) setRestartHint()}, {@link com.trolltech.qt.core.QObject#setProperty(java.lang.String, java.lang.Object) setProperty()}, {@link com.trolltech.qt.gui.QSessionManager#requestPhase2() requestPhase2()}. See the respective function descriptions for further details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication QApplication}, and {@link <a href="../session.html">Session Management</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public final class QSessionManager extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    
/**
This enum type defines the circumstances under which this application wants to be restarted by the session manager. The current values are The default hint is <tt>RestartIfRunning</tt>.
*/
@QtBlockedEnum
    public enum RestartHint implements com.trolltech.qt.QtEnumerator {
/**
 if the application is still running when the session is shut down, it wants to be restarted at the start of the next session.
*/

        RestartIfRunning(0),
/**
 the application wants to be started at the start of the next session, no matter what. (This is useful for utilities that run just after startup and then quit.)
*/

        RestartAnyway(1),
/**
 the application wants to be started immediately whenever it is not running.
*/

        RestartImmediately(2),
/**
 the application does not want to be restarted automatically.
*/

        RestartNever(3);

        RestartHint(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSessionManager$RestartHint constant with the specified <tt>int</tt>.</brief>
*/

        public static RestartHint resolve(int value) {
            return (RestartHint) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return RestartIfRunning;
            case 1: return RestartAnyway;
            case 2: return RestartImmediately;
            case 3: return RestartNever;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Returns true if error interaction is permitted; otherwise returns false. <p>This is similar to {@link com.trolltech.qt.gui.QSessionManager#allowsInteraction() allowsInteraction()}, but also enables the application to tell the user about any errors that occur. Session managers may give error interaction requests higher priority, which means that it is more likely that an error interaction is permitted. However, you are still not guaranteed that the session manager will allow interaction. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSessionManager#allowsInteraction() allowsInteraction()}, {@link com.trolltech.qt.gui.QSessionManager#release() release()}, and {@link com.trolltech.qt.gui.QSessionManager#cancel() cancel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean allowsErrorInteraction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_allowsErrorInteraction(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_allowsErrorInteraction(long __this__nativeId);

/**
Asks the session manager for permission to interact with the user. Returns true if interaction is permitted; otherwise returns false. <p>The rationale behind this mechanism is to make it possible to synchronize user interaction during a shutdown. Advanced session managers may ask all applications simultaneously to commit their data, resulting in a much faster shutdown. <p>When the interaction is completed we strongly recommend releasing the user interaction semaphore with a call to {@link com.trolltech.qt.gui.QSessionManager#release() release()}. This way, other applications may get the chance to interact with the user while your application is still busy saving data. (The semaphore is implicitly released when the application exits.) <p>If the user decides to cancel the shutdown process during the interaction phase, you must tell the session manager that this has happened by calling {@link com.trolltech.qt.gui.QSessionManager#cancel() cancel()}. <p>Here's an example of how an application's {@link com.trolltech.qt.gui.QApplication#commitData(com.trolltech.qt.gui.QSessionManager) QApplication::commitData()} might be implemented: <pre class="snippet">
        public final void commitData(QSessionManager manager)
        {
            if (manager.allowsInteraction()) {
                QMessageBox.StandardButton ret = QMessageBox.warning(
                                                    mainWindow,
                                                    tr("My Application"),
                                                    tr("Save changes to document?"),
                                                    QMessageBox.StandardButton.createQFlags(
                                                            QMessageBox.StandardButton.Save,
                                                            QMessageBox.StandardButton.Discard,
                                                            QMessageBox.StandardButton.Cancel)
                                                 );

                switch (ret) {
                case Save:
                    manager.release();
                    if (!saveDocument())
                        manager.cancel();
                    break;
                case Discard:
                    break;
                case Cancel:
                default:
                    manager.cancel();
                }
            } else {
                // we did not get permission to interact, then
                // do something reasonable instead
            }
        }
</pre> If an error occurred within the application while saving its data, you may want to try {@link com.trolltech.qt.gui.QSessionManager#allowsErrorInteraction() allowsErrorInteraction()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#commitData(com.trolltech.qt.gui.QSessionManager) QApplication::commitData()}, {@link com.trolltech.qt.gui.QSessionManager#release() release()}, and {@link com.trolltech.qt.gui.QSessionManager#cancel() cancel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean allowsInteraction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_allowsInteraction(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_allowsInteraction(long __this__nativeId);

/**
Tells the session manager to cancel the shutdown process. Applications should not call this function without first asking the user. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSessionManager#allowsInteraction() allowsInteraction()}, and {@link com.trolltech.qt.gui.QSessionManager#allowsErrorInteraction() allowsErrorInteraction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void cancel()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cancel(nativeId());
    }
    @QtBlockedSlot
    native void __qt_cancel(long __this__nativeId);

/**
Returns the currently set discard command. <p>To iterate over the list, you can use the {@link <a href="../containers.html">foreach</a>} pseudo-keyword: <pre class="snippet">
        for (String command : mySession.discardCommand())
            do_something(command);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSessionManager#setDiscardCommand(java.util.List) setDiscardCommand()}, {@link com.trolltech.qt.gui.QSessionManager#restartCommand() restartCommand()}, and {@link com.trolltech.qt.gui.QSessionManager#setRestartCommand(java.util.List) setRestartCommand()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> discardCommand()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_discardCommand(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_discardCommand(long __this__nativeId);

/**
Returns true if the session manager is currently performing a second session management phase; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSessionManager#requestPhase2() requestPhase2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isPhase2()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isPhase2(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isPhase2(long __this__nativeId);

/**
Releases the session manager's interaction semaphore after an interaction phase. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSessionManager#allowsInteraction() allowsInteraction()}, and {@link com.trolltech.qt.gui.QSessionManager#allowsErrorInteraction() allowsErrorInteraction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void release()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_release(nativeId());
    }
    @QtBlockedSlot
    native void __qt_release(long __this__nativeId);

/**
Requests a second session management phase for the application. The application may then return immediately from the {@link com.trolltech.qt.gui.QApplication#commitData(com.trolltech.qt.gui.QSessionManager) QApplication::commitData()} or {@link com.trolltech.qt.gui.QApplication#saveState(com.trolltech.qt.gui.QSessionManager) QApplication::saveState()} function, and they will be called again once most or all other applications have finished their session management. <p>The two phases are useful for applications such as the X11 window manager that need to store information about another application's windows and therefore have to wait until these applications have completed their respective session management tasks. <p>Note that if another application has requested a second phase it may get called before, simultaneously with, or after your application's second phase. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSessionManager#isPhase2() isPhase2()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void requestPhase2()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_requestPhase2(nativeId());
    }
    @QtBlockedSlot
    native void __qt_requestPhase2(long __this__nativeId);

/**
Returns the currently set restart command. <p>To iterate over the list, you can use the {@link <a href="../containers.html">foreach</a>} pseudo-keyword: <pre class="snippet">
            for (String command : mySession.restartCommand())
                do_something(command);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSessionManager#setRestartCommand(java.util.List) setRestartCommand()}, and {@link com.trolltech.qt.gui.QSessionManager#restartHint() restartHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> restartCommand()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_restartCommand(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_restartCommand(long __this__nativeId);

/**
Returns the application's current restart hint. The default is <tt>RestartIfRunning</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSessionManager#setRestartHint(com.trolltech.qt.gui.QSessionManager.RestartHint) setRestartHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QSessionManager.RestartHint restartHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QSessionManager.RestartHint.resolve(__qt_restartHint(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_restartHint(long __this__nativeId);

/**
Returns the identifier of the current session. <p>If the application has been restored from an earlier session, this identifier is the same as it was in that earlier session. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSessionManager#sessionKey() sessionKey()}, and {@link com.trolltech.qt.gui.QApplication#sessionId() QApplication::sessionId()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String sessionId()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sessionId(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_sessionId(long __this__nativeId);

/**
Returns the session key in the current session. <p>If the application has been restored from an earlier session, this key is the same as it was when the previous session ended. <p>The session key changes with every call of commitData() or saveState(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSessionManager#sessionId() sessionId()}, and {@link com.trolltech.qt.gui.QApplication#sessionKey() QApplication::sessionKey()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String sessionKey()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sessionKey(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_sessionKey(long __this__nativeId);

/**
Sets the discard command to the given <tt>list</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSessionManager#discardCommand() discardCommand()}, and {@link com.trolltech.qt.gui.QSessionManager#setRestartCommand(java.util.List) setRestartCommand()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDiscardCommand(java.util.List<java.lang.String> arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDiscardCommand_List(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setDiscardCommand_List(long __this__nativeId, java.util.List<java.lang.String> arg__1);

/**
This is an overloaded member function, provided for convenience. <p>Low-level write access to the application's identification and state records are kept in the session manager. <p>The property called <tt>name</tt> has its value set to the string <tt>value</tt>.
*/

    @QtBlockedSlot
    public final void setManagerProperty(java.lang.String name, java.lang.String value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setManagerProperty_String_String(nativeId(), name, value);
    }
    @QtBlockedSlot
    native void __qt_setManagerProperty_String_String(long __this__nativeId, java.lang.String name, java.lang.String value);

/**
Low-level write access to the application's identification and state record are kept in the session manager. <p>The property called <tt>name</tt> has its value set to the string list <tt>value</tt>.
*/

    @QtBlockedSlot
    public final void setManagerProperty(java.lang.String name, java.util.List<java.lang.String> value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setManagerProperty_String_List(nativeId(), name, value);
    }
    @QtBlockedSlot
    native void __qt_setManagerProperty_String_List(long __this__nativeId, java.lang.String name, java.util.List<java.lang.String> value);

/**
If the session manager is capable of restoring sessions it will execute <tt>command</tt> in order to restore the application. The command defaults to <pre class="snippet">
        appname -session id
</pre> The <tt>-session</tt> option is mandatory; otherwise {@link com.trolltech.qt.gui.QApplication QApplication} cannot tell whether it has been restored or what the current session identifier is. See {@link com.trolltech.qt.gui.QApplication#isSessionRestored() QApplication::isSessionRestored()} and {@link com.trolltech.qt.gui.QApplication#sessionId() QApplication::sessionId()} for details. <p>If your application is very simple, it may be possible to store the entire application state in additional command line options. This is usually a very bad idea because command lines are often limited to a few hundred bytes. Instead, use {@link com.trolltech.qt.core.QSettings QSettings}, or temporary files or a database for this purpose. By marking the data with the unique {@link com.trolltech.qt.gui.QSessionManager#sessionId() sessionId()}, you will be able to restore the application in a future session. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSessionManager#restartCommand() restartCommand()}, {@link com.trolltech.qt.gui.QSessionManager#setDiscardCommand(java.util.List) setDiscardCommand()}, and {@link com.trolltech.qt.gui.QSessionManager#setRestartHint(com.trolltech.qt.gui.QSessionManager.RestartHint) setRestartHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRestartCommand(java.util.List<java.lang.String> arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRestartCommand_List(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setRestartCommand_List(long __this__nativeId, java.util.List<java.lang.String> arg__1);

/**
Sets the application's restart hint to <tt>hint</tt>. On application startup the hint is set to <tt>RestartIfRunning</tt>. <p>Note that these flags are only hints, a session manager may or may not respect them. <p>We recommend setting the restart hint in {@link com.trolltech.qt.gui.QApplication#saveState(com.trolltech.qt.gui.QSessionManager) QApplication::saveState()} because most session managers perform a checkpoint shortly after an application's startup. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSessionManager#restartHint() restartHint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRestartHint(com.trolltech.qt.gui.QSessionManager.RestartHint arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRestartHint_RestartHint(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setRestartHint_RestartHint(long __this__nativeId, int arg__1);

/**
@exclude
*/

    public static native QSessionManager fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSessionManager(QPrivateConstructor p) { super(p); } 
}
