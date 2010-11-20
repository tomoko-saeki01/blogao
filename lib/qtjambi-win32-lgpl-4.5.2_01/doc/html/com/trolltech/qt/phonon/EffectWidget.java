package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class EffectWidget extends com.trolltech.qt.gui.QWidget
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }


/**
This is an overloaded method provided for convenience.
*/

    public EffectWidget(com.trolltech.qt.phonon.Effect effect) {
        this(effect, (com.trolltech.qt.gui.QWidget)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public EffectWidget(com.trolltech.qt.phonon.Effect effect, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_EffectWidget_Effect_QWidget(effect == null ? 0 : effect.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_EffectWidget_Effect_QWidget(long effect, long parent);

/**
@exclude
*/

    public static native EffectWidget fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected EffectWidget(QPrivateConstructor p) { super(p); } 
}
