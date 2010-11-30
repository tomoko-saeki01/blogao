package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public abstract class AbstractEffect extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.phonon.AbstractEffectInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.phonon.AbstractEffect {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public java.lang.Object parameterValue(com.trolltech.qt.phonon.EffectParameter arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_parameterValue_EffectParameter(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.util.List<com.trolltech.qt.phonon.EffectParameter> parameters() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_parameters(nativeId());
        }

        @Override
        @QtBlockedSlot
        public void setParameterValue(com.trolltech.qt.phonon.EffectParameter arg__1, java.lang.Object newValue) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setParameterValue_EffectParameter_Object(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), newValue);
        }
    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public AbstractEffect(){
        super((QPrivateConstructor)null);
        __qt_AbstractEffect();
    }

    native void __qt_AbstractEffect();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract java.lang.Object parameterValue(com.trolltech.qt.phonon.EffectParameter arg__1);
    @QtBlockedSlot
    native java.lang.Object __qt_parameterValue_EffectParameter(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract java.util.List<com.trolltech.qt.phonon.EffectParameter> parameters();
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.EffectParameter> __qt_parameters(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setParameterValue(com.trolltech.qt.phonon.EffectParameter arg__1, java.lang.Object newValue);
    @QtBlockedSlot
    native void __qt_setParameterValue_EffectParameter_Object(long __this__nativeId, long arg__1, java.lang.Object newValue);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native AbstractEffect fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected AbstractEffect(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_AbstractEffect(long ptr);
}
