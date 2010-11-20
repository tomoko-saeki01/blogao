package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public abstract class AbstractVideoWidget extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.phonon.AbstractVideoWidgetInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.phonon.AbstractVideoWidget {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.phonon.VideoWidget.AspectRatio aspectRatio() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return com.trolltech.qt.phonon.VideoWidget.AspectRatio.resolve(super.__qt_aspectRatio(nativeId()));
        }

        @Override
        @QtBlockedSlot
        public double brightness() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_brightness(nativeId());
        }

        @Override
        @QtBlockedSlot
        public double contrast() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_contrast(nativeId());
        }

        @Override
        @QtBlockedSlot
        public double hue() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_hue(nativeId());
        }

        @Override
        @QtBlockedSlot
        public double saturation() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_saturation(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.phonon.VideoWidget.ScaleMode scaleMode() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return com.trolltech.qt.phonon.VideoWidget.ScaleMode.resolve(super.__qt_scaleMode(nativeId()));
        }

        @Override
        @QtBlockedSlot
        public void setAspectRatio(com.trolltech.qt.phonon.VideoWidget.AspectRatio arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setAspectRatio_AspectRatio(nativeId(), arg__1.value());
        }

        @Override
        @QtBlockedSlot
        public void setBrightness(double arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setBrightness_double(nativeId(), arg__1);
        }

        @Override
        @QtBlockedSlot
        public void setContrast(double arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setContrast_double(nativeId(), arg__1);
        }

        @Override
        @QtBlockedSlot
        public void setHue(double arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setHue_double(nativeId(), arg__1);
        }

        @Override
        @QtBlockedSlot
        public void setSaturation(double arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setSaturation_double(nativeId(), arg__1);
        }

        @Override
        @QtBlockedSlot
        public void setScaleMode(com.trolltech.qt.phonon.VideoWidget.ScaleMode arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setScaleMode_ScaleMode(nativeId(), arg__1.value());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QWidget widget() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_widget(nativeId());
        }
    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public AbstractVideoWidget(){
        super((QPrivateConstructor)null);
        __qt_AbstractVideoWidget();
    }

    native void __qt_AbstractVideoWidget();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.phonon.VideoWidget.AspectRatio aspectRatio();
    @QtBlockedSlot
    native int __qt_aspectRatio(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract double brightness();
    @QtBlockedSlot
    native double __qt_brightness(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract double contrast();
    @QtBlockedSlot
    native double __qt_contrast(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract double hue();
    @QtBlockedSlot
    native double __qt_hue(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract double saturation();
    @QtBlockedSlot
    native double __qt_saturation(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.phonon.VideoWidget.ScaleMode scaleMode();
    @QtBlockedSlot
    native int __qt_scaleMode(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setAspectRatio(com.trolltech.qt.phonon.VideoWidget.AspectRatio arg__1);
    @QtBlockedSlot
    native void __qt_setAspectRatio_AspectRatio(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setBrightness(double arg__1);
    @QtBlockedSlot
    native void __qt_setBrightness_double(long __this__nativeId, double arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setContrast(double arg__1);
    @QtBlockedSlot
    native void __qt_setContrast_double(long __this__nativeId, double arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setHue(double arg__1);
    @QtBlockedSlot
    native void __qt_setHue_double(long __this__nativeId, double arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setSaturation(double arg__1);
    @QtBlockedSlot
    native void __qt_setSaturation_double(long __this__nativeId, double arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setScaleMode(com.trolltech.qt.phonon.VideoWidget.ScaleMode arg__1);
    @QtBlockedSlot
    native void __qt_setScaleMode_ScaleMode(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QWidget widget();
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widget(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native AbstractVideoWidget fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected AbstractVideoWidget(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_AbstractVideoWidget(long ptr);
}
