package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QShortcutEvent class provides an event which is generated when the user presses a key combination. Normally you don't need to use this class directly; {@link com.trolltech.qt.gui.QShortcut QShortcut} provides a higher-level interface to handle shortcut keys. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QShortcut QShortcut}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QShortcutEvent extends com.trolltech.qt.core.QEvent
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }


/**
Constructs a shortcut event for the given <tt>key</tt> press, associated with the {@link com.trolltech.qt.gui.QShortcut QShortcut} ID <tt>id</tt>. <p><tt>ambiguous</tt> specifies whether there is more than one {@link com.trolltech.qt.gui.QShortcut QShortcut} for the same key sequence.
*/

    public QShortcutEvent(com.trolltech.qt.gui.QKeySequence key, int id) {
        this(key, id, (boolean)false);
    }
/**
Constructs a shortcut event for the given <tt>key</tt> press, associated with the {@link com.trolltech.qt.gui.QShortcut QShortcut} ID <tt>id</tt>. <p><tt>ambiguous</tt> specifies whether there is more than one {@link com.trolltech.qt.gui.QShortcut QShortcut} for the same key sequence.
*/

    public QShortcutEvent(com.trolltech.qt.gui.QKeySequence key, int id, boolean ambiguous){
        super((QPrivateConstructor)null);
        __qt_QShortcutEvent_QKeySequence_int_boolean(key == null ? 0 : key.nativeId(), id, ambiguous);
    }

    native void __qt_QShortcutEvent_QKeySequence_int_boolean(long key, int id, boolean ambiguous);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean isAmbiguous()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAmbiguous(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAmbiguous(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QKeySequence key()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_key(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QKeySequence __qt_key(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int shortcutId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_shortcutId(nativeId());
    }
    @QtBlockedSlot
    native int __qt_shortcutId(long __this__nativeId);

/**
Constructs a shortcut event for the given <tt>sequence</tt>.
*/

    @QtBlockedSlot
    protected final void setSequence(com.trolltech.qt.gui.QKeySequence sequence)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSequence_QKeySequence(nativeId(), sequence == null ? 0 : sequence.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSequence_QKeySequence(long __this__nativeId, long sequence);

/**
Returns the key sequence (QKeySequence) for this QShortcutEvent.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QKeySequence sequence()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sequence(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QKeySequence __qt_sequence(long __this__nativeId);

/**
Sets this QShortcutEvent's ID to <tt>sid</tt>.
*/

    @QtBlockedSlot
    protected final void setSid(int sid)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSid_int(nativeId(), sid);
    }
    @QtBlockedSlot
    native void __qt_setSid_int(long __this__nativeId, int sid);

/**
Returns this QShortcutEvent's ID.
*/

    @QtBlockedSlot
    protected final int sid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sid(nativeId());
    }
    @QtBlockedSlot
    native int __qt_sid(long __this__nativeId);

/**
Sets this QShortcutEvent as having an ambiguous key sequence.
*/

    @QtBlockedSlot
    protected final void setAmbig(boolean ambig)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAmbig_boolean(nativeId(), ambig);
    }
    @QtBlockedSlot
    native void __qt_setAmbig_boolean(long __this__nativeId, boolean ambig);

/**
Returns true if the key sequence that triggered the event is
ambiguous.
*/

    @QtBlockedSlot
    protected final boolean ambig()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ambig(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_ambig(long __this__nativeId);

/**
@exclude
*/

    public static native QShortcutEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QShortcutEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QShortcutEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
