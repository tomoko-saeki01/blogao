package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QShortcut class is used to create keyboard shortcuts. The QShortcut class provides a way of connecting keyboard shortcuts to Qt's {@link <a href="../qtjambi-signalsandslots.html">signals and slots</a>} mechanism, so that objects can be informed when a shortcut is executed. The shortcut can be set up to contain all the key presses necessary to describe a keyboard shortcut, including the states of modifier keys such as <b>Shift</b>, <b>Ctrl</b>, and <b>Alt</b>.<a name="mnemonic"> On certain widgets, using '&' in front of a character will automatically create a mnemonic (a shortcut) for that character, e.g. "E&xit" will create the shortcut <b>Alt+X</b> (use '&&' to display an actual ampersand). The widget might consume and perform an action on a given shortcut. On X11 the ampersand will not be shown and the character will be underlined. On Windows, shortcuts are normally not displayed until the user presses the <b>Alt</b> key, but this is a setting the user can change. On Mac, shortcuts are disabled by default. Call qt_set_sequence_auto_mnemonic() to enable them. However, because mnemonic shortcuts do not fit in with Aqua's guidelines, Qt will not show the shortcut character underlined. <p>For applications that use menus, it may be more convenient to use the convenience functions provided in the {@link com.trolltech.qt.gui.QMenu QMenu} class to assign keyboard shortcuts to menu items as they are created. Alternatively, shortcuts may be associated with other types of actions in the {@link com.trolltech.qt.gui.QAction QAction} class. <p>The simplest way to create a shortcut for a particular widget is to construct the shortcut with a key sequence. For example: <pre class="snippet">
        shortcut = new QShortcut(new QKeySequence(tr("Ctrl+O", "File|Open")),
                                 parent);
</pre> When the user types the {@link com.trolltech.qt.gui.QKeySequence key sequence} for a given shortcut, the shortcut's {@link com.trolltech.qt.gui.QShortcut#activated activated() } signal is emitted. (In the case of ambiguity, the {@link com.trolltech.qt.gui.QShortcut#activatedAmbiguously activatedAmbiguously() } signal is emitted.) A shortcut is "listened for" by Qt's event loop when the shortcut's parent widget is receiving events. <p>A shortcut's key sequence can be set with {@link com.trolltech.qt.gui.QShortcut#setKey(com.trolltech.qt.gui.QKeySequence) setKey()} and retrieved with {@link com.trolltech.qt.gui.QShortcut#key() key()}. A shortcut can be enabled or disabled with {@link com.trolltech.qt.gui.QShortcut#setEnabled(boolean) setEnabled()}, and can have "What's This?" help text set with {@link com.trolltech.qt.gui.QShortcut#setWhatsThis(java.lang.String) setWhatsThis()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QShortcutEvent QShortcutEvent}, {@link com.trolltech.qt.gui.QKeySequence QKeySequence}, and {@link com.trolltech.qt.gui.QAction QAction}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QShortcut extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
 This signal is emitted when the user types the shortcut's key sequence. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QShortcut#activatedAmbiguously activatedAmbiguously() }. <br></DD></DT>
*/

    public final Signal0 activated = new Signal0();

    private final void activated()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activated(nativeId());
    }
    native void __qt_activated(long __this__nativeId);
/**
 This signal is emitted when the user types the shortcut's key sequence. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QShortcut#activatedAmbiguously activatedAmbiguously() }. <br></DD></DT>
*/

    public final Signal0 activatedAmbiguously = new Signal0();

    private final void activatedAmbiguously()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activatedAmbiguously(nativeId());
    }
    native void __qt_activatedAmbiguously(long __this__nativeId);

/**
Constructs a QShortcut object for the <tt>parent</tt> widget. Since no shortcut key sequence is specified, the shortcut will not emit any signals. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QShortcut#setKey(com.trolltech.qt.gui.QKeySequence) setKey()}. <br></DD></DT>
*/

    public QShortcut(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QShortcut_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QShortcut_QWidget(long parent);

    private QShortcut(com.trolltech.qt.gui.QKeySequence key, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.QNativePointer member, com.trolltech.qt.QNativePointer ambiguousMember, com.trolltech.qt.core.Qt.ShortcutContext context){
        super((QPrivateConstructor)null);
        __qt_QShortcut_QKeySequence_QWidget_nativepointer_nativepointer_ShortcutContext(key == null ? 0 : key.nativeId(), parent == null ? 0 : parent.nativeId(), member, ambiguousMember, context.value());
    }

    native void __qt_QShortcut_QKeySequence_QWidget_nativepointer_nativepointer_ShortcutContext(long key, long parent, com.trolltech.qt.QNativePointer member, com.trolltech.qt.QNativePointer ambiguousMember, int context);

/**
This property holds whether the shortcut can auto repeat. If true, the shortcut will auto repeat when the keyboard shortcut combination is held down, provided that keyboard auto repeat is enabled on the system. The default value is true.
*/

    @com.trolltech.qt.QtPropertyReader(name="autoRepeat")
    @QtBlockedSlot
    public final boolean autoRepeat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoRepeat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoRepeat(long __this__nativeId);

/**
This property holds the context in which the shortcut is valid. A shortcut's context decides in which circumstances a shortcut is allowed to be triggered. The normal context is {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WindowShortcut }, which allows the shortcut to trigger if the parent (the widget containing the shortcut) is a subwidget of the active top-level window. <p>By default, this property is set to {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WindowShortcut }.
*/

    @com.trolltech.qt.QtPropertyReader(name="context")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ShortcutContext context()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ShortcutContext.resolve(__qt_context(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_context(long __this__nativeId);

/**
Returns the shortcut's ID. <p><DT><b>See also:</b><br><DD>QShortcutEvent::shortcutId(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final int id()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_id(nativeId());
    }
    @QtBlockedSlot
    native int __qt_id(long __this__nativeId);

/**
This property holds whether the shortcut is enabled. An enabled shortcut emits the {@link com.trolltech.qt.gui.QShortcut#activated activated() } or {@link com.trolltech.qt.gui.QShortcut#activatedAmbiguously activatedAmbiguously() } signal when a {@link com.trolltech.qt.gui.QShortcutEvent QShortcutEvent} occurs that matches the shortcut's {@link com.trolltech.qt.gui.QShortcut#key() key()} sequence. <p>If the application is in <tt>WhatsThis</tt> mode the shortcut will not emit the signals, but will show the "What's This?" text instead. <p>By default, this property is true. <p><DT><b>See also:</b><br><DD>{@link QShortcut#whatsThis() whatsThis}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="enabled")
    @QtBlockedSlot
    public final boolean isEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEnabled(long __this__nativeId);

/**
This property holds the shortcut's key sequence. This is a key sequence with an optional combination of Shift, Ctrl, and Alt. The key sequence may be supplied in a number of ways: <pre class="snippet">
        shortcut.setKey(new QKeySequence(0));                  // no signal emitted
        shortcut.setKey(new QKeySequence());                   // no signal emitted
        shortcut.setKey(new QKeySequence(0x3b1));              // Greek letter alpha
        shortcut.setKey(new QKeySequence(Qt.Key.Key_D.value()));       // 'd', e.g. to delete
        shortcut.setKey(new QKeySequence('q'));                // 'q', e.g. to quit
        shortcut.setKey(new QKeySequence(Qt.KeyboardModifier.AltModifier.value() + Qt.Key.Key_P.value()));       // Ctrl+P, e.g. to print document
        shortcut.setKey(new QKeySequence("Ctrl+P"));           // Ctrl+P, e.g. to print document
</pre> By default, this property contains an empty key sequence.
*/

    @com.trolltech.qt.QtPropertyReader(name="key")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QKeySequence key()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_key(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QKeySequence __qt_key(long __this__nativeId);

/**
Returns the shortcut's parent widget.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget parentWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parentWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_parentWidget(long __this__nativeId);

/**
This property holds whether the shortcut can auto repeat. If true, the shortcut will auto repeat when the keyboard shortcut combination is held down, provided that keyboard auto repeat is enabled on the system. The default value is true.
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoRepeat")
    @QtBlockedSlot
    public final void setAutoRepeat(boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoRepeat_boolean(nativeId(), on);
    }
    @QtBlockedSlot
    native void __qt_setAutoRepeat_boolean(long __this__nativeId, boolean on);

/**
This property holds the context in which the shortcut is valid. A shortcut's context decides in which circumstances a shortcut is allowed to be triggered. The normal context is {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WindowShortcut }, which allows the shortcut to trigger if the parent (the widget containing the shortcut) is a subwidget of the active top-level window. <p>By default, this property is set to {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WindowShortcut }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="context")
    @QtBlockedSlot
    public final void setContext(com.trolltech.qt.core.Qt.ShortcutContext context)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setContext_ShortcutContext(nativeId(), context.value());
    }
    @QtBlockedSlot
    native void __qt_setContext_ShortcutContext(long __this__nativeId, int context);

/**
This property holds whether the shortcut is enabled. An enabled shortcut emits the {@link com.trolltech.qt.gui.QShortcut#activated activated() } or {@link com.trolltech.qt.gui.QShortcut#activatedAmbiguously activatedAmbiguously() } signal when a {@link com.trolltech.qt.gui.QShortcutEvent QShortcutEvent} occurs that matches the shortcut's {@link com.trolltech.qt.gui.QShortcut#key() key()} sequence. <p>If the application is in <tt>WhatsThis</tt> mode the shortcut will not emit the signals, but will show the "What's This?" text instead. <p>By default, this property is true. <p><DT><b>See also:</b><br><DD>{@link QShortcut#whatsThis() whatsThis}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="enabled")
    @QtBlockedSlot
    public final void setEnabled(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setEnabled_boolean(long __this__nativeId, boolean enable);

/**
This property holds the shortcut's key sequence. This is a key sequence with an optional combination of Shift, Ctrl, and Alt. The key sequence may be supplied in a number of ways: <pre class="snippet">
        shortcut.setKey(new QKeySequence(0));                  // no signal emitted
        shortcut.setKey(new QKeySequence());                   // no signal emitted
        shortcut.setKey(new QKeySequence(0x3b1));              // Greek letter alpha
        shortcut.setKey(new QKeySequence(Qt.Key.Key_D.value()));       // 'd', e.g. to delete
        shortcut.setKey(new QKeySequence('q'));                // 'q', e.g. to quit
        shortcut.setKey(new QKeySequence(Qt.KeyboardModifier.AltModifier.value() + Qt.Key.Key_P.value()));       // Ctrl+P, e.g. to print document
        shortcut.setKey(new QKeySequence("Ctrl+P"));           // Ctrl+P, e.g. to print document
</pre> By default, this property contains an empty key sequence.
*/

    @com.trolltech.qt.QtPropertyWriter(name="key")
    @QtBlockedSlot
    public final void setKey(com.trolltech.qt.gui.QKeySequence key)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setKey_QKeySequence(nativeId(), key == null ? 0 : key.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setKey_QKeySequence(long __this__nativeId, long key);

/**
This property holds the shortcut's "What's This?" help text. The text will be shown when the application is in "What's This?" mode and the user types the shortcut {@link com.trolltech.qt.gui.QShortcut#key() key()} sequence. <p>To set "What's This?" help on a menu item (with or without a shortcut key), set the help on the item's action. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThis#inWhatsThisMode() QWhatsThis::inWhatsThisMode()}, and {@link QAction#setWhatsThis(java.lang.String) QAction::setWhatsThis()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="whatsThis")
    @QtBlockedSlot
    public final void setWhatsThis(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWhatsThis_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setWhatsThis_String(long __this__nativeId, java.lang.String text);

/**
This property holds the shortcut's "What's This?" help text. The text will be shown when the application is in "What's This?" mode and the user types the shortcut {@link com.trolltech.qt.gui.QShortcut#key() key()} sequence. <p>To set "What's This?" help on a menu item (with or without a shortcut key), set the help on the item's action. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThis#inWhatsThisMode() QWhatsThis::inWhatsThisMode()}, and {@link QAction#setWhatsThis(java.lang.String) QAction::setWhatsThis()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="whatsThis")
    @QtBlockedSlot
    public final java.lang.String whatsThis()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_whatsThis(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_whatsThis(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

/**
@exclude
*/

    public static native QShortcut fromNativePointer(QNativePointer nativePointer);

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

    protected QShortcut(QPrivateConstructor p) { super(p); } 

/**
This is an overloaded constructor provided for convenience.
*/

    public QShortcut(QKeySequence key, QWidget parent) {
        this(key, parent, null, null, com.trolltech.qt.core.Qt.ShortcutContext.WindowShortcut);
    }

/**
Constructs a QShortcut object for the <tt>parent</tt> widget. The shortcut operates on its parent, listening for {@link com.trolltech.qt.gui.QShortcutEvent QShortcutEvent}s that match the <tt>key</tt> sequence. Depending on the ambiguity of the event, the shortcut will call the <tt>member</tt> function, or the <tt>ambiguousMember</tt> function, if the key press was in the shortcut's <tt>context</tt>.
*/

    public QShortcut(QKeySequence key, QWidget parent, com.trolltech.qt.core.Qt.ShortcutContext context) {
        this(key, parent, null, null, context);
    }

}
