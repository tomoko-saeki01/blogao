package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class Path extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    private java.util.Collection<Object> __rcEffects = new java.util.ArrayList<Object>();

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

    public Path(){
        super((QPrivateConstructor)null);
        __qt_Path();
    }

    native void __qt_Path();

/**
This is an overloaded method provided for convenience.
*/

    public Path(com.trolltech.qt.phonon.Path arg__1){
        super((QPrivateConstructor)null);
        __qt_Path_Path(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_Path_Path(long arg__1);

/**

*/

    @QtBlockedSlot
/**
Creates an invalid path. <p>You can still make it a valid path by calling reconnect. To create a path you should use createPath, though. <p><DT><b>See also:</b><br><DD>Phonon::createPath(), and {@link com.trolltech.qt.phonon.Path#isValid() isValid()}. <br></DD></DT>
*/

    public final boolean disconnectPath()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_disconnectPath(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_disconnectPath(long __this__nativeId);

/**
Returns a list of Effect objects that are currently used as effects. The order in the list determines the order the signal is sent through the effects. <p>Returns A list with all current effects. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.Path#insertEffect(com.trolltech.qt.phonon.Effect) insertEffect()}, and {@link com.trolltech.qt.phonon.Path#removeEffect(com.trolltech.qt.phonon.Effect) removeEffect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.Effect> effects()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_effects(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.Effect> __qt_effects(long __this__nativeId);


/**

*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final boolean insertEffect(com.trolltech.qt.phonon.Effect newEffect) {
        return insertEffect(newEffect, (com.trolltech.qt.phonon.Effect)null);
    }
/**

*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final boolean insertEffect(com.trolltech.qt.phonon.Effect newEffect, com.trolltech.qt.phonon.Effect insertBefore)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (newEffect != null) {
            __rcEffects.add(newEffect);
        }
        return __qt_insertEffect_Effect_Effect(nativeId(), newEffect == null ? 0 : newEffect.nativeId(), insertBefore == null ? 0 : insertBefore.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native boolean __qt_insertEffect_Effect_Effect(long __this__nativeId, long newEffect, long insertBefore);


/**

*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final com.trolltech.qt.phonon.Effect insertEffect(com.trolltech.qt.phonon.EffectDescription desc) {
        return insertEffect(desc, (com.trolltech.qt.phonon.Effect)null);
    }
/**

*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final com.trolltech.qt.phonon.Effect insertEffect(com.trolltech.qt.phonon.EffectDescription desc, com.trolltech.qt.phonon.Effect insertBefore)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (desc != null) {
            __rcEffects.add(desc);
        }
        return __qt_insertEffect_EffectDescription_Effect(nativeId(), desc == null ? 0 : desc.nativeId(), insertBefore == null ? 0 : insertBefore.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native com.trolltech.qt.phonon.Effect __qt_insertEffect_EffectDescription_Effect(long __this__nativeId, long desc, long insertBefore);

/**
Returns true if the backend provides an implementation of this class; otherwise, returns false.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.phonon.Path p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_Path(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_Path(long __this__nativeId, long p);

/**

*/

    @QtBlockedSlot
    public final boolean reconnect(com.trolltech.qt.phonon.MediaNodeInterface source, com.trolltech.qt.phonon.MediaNodeInterface sink)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_reconnect_MediaNode_MediaNode(nativeId(), source == null ? 0 : source.nativeId(), sink == null ? 0 : sink.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_reconnect_MediaNode_MediaNode(long __this__nativeId, long source, long sink);

/**

*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final boolean removeEffect(com.trolltech.qt.phonon.Effect effect)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (effect != null) {
            while (__rcEffects.remove(effect)) ;
        }
        return __qt_removeEffect_Effect(nativeId(), effect == null ? 0 : effect.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native boolean __qt_removeEffect_Effect(long __this__nativeId, long effect);

/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.MediaNodeInterface sink()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sink(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.phonon.MediaNodeInterface __qt_sink(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.MediaNodeInterface source()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_source(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.phonon.MediaNodeInterface __qt_source(long __this__nativeId);

/**
@exclude
*/

    public static native Path fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected Path(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(Path array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.phonon.Path)
        return operator_equal((com.trolltech.qt.phonon.Path) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public Path clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native Path __qt_clone(long __this_nativeId);
}
