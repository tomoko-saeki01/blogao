package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class SeekSlider extends com.trolltech.qt.gui.QWidget
{

    private Object __rcMediaObject = null;

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }


/**
This is an overloaded method provided for convenience.
*/

    public SeekSlider(com.trolltech.qt.phonon.MediaObject media) {
        this(media, (com.trolltech.qt.gui.QWidget)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public SeekSlider(com.trolltech.qt.phonon.MediaObject media, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_SeekSlider_MediaObject_QWidget(media == null ? 0 : media.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_SeekSlider_MediaObject_QWidget(long media, long parent);


/**
This is an overloaded method provided for convenience.
*/

    public SeekSlider() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public SeekSlider(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_SeekSlider_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_SeekSlider_QWidget(long parent);

/**
This property holds whether slider tracking is enabled. If tracking is enabled (the default), the media seeks while the slider is being dragged. If tracking is disabled, the media seeks only when the user releases the slider.
*/

    @com.trolltech.qt.QtPropertyReader(name="tracking")
    @QtBlockedSlot
    public final boolean hasTracking()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasTracking(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasTracking(long __this__nativeId);

/**
This property holds the icon size used for the mute button/icon.  The default size is defined by the GUI style.
*/

    @com.trolltech.qt.QtPropertyReader(name="iconSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize iconSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_iconSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_iconSize(long __this__nativeId);

/**
This property holds whether the icon next to the slider is visible. By default the icon is visible if the platform provides an icon; else it's hidden.
*/

    @com.trolltech.qt.QtPropertyReader(name="iconVisible")
    @QtBlockedSlot
    public final boolean isIconVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isIconVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isIconVisible(long __this__nativeId);

/**
Return the media object this SeekSlider controls. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.SeekSlider#setMediaObject(com.trolltech.qt.phonon.MediaObject) setMediaObject()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.MediaObject mediaObject()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mediaObject(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.phonon.MediaObject __qt_mediaObject(long __this__nativeId);

/**
This property holds the orientation of the slider. The orientation must be {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } or {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } (the default).
*/

    @com.trolltech.qt.QtPropertyReader(name="orientation")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientation orientation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
This property holds the page step interval. The larger of two natural steps that a slider provides and typically corresponds to the user pressing PageUp or PageDown. <p>Defaults to 5 seconds.
*/

    @com.trolltech.qt.QtPropertyReader(name="pageStep")
    @QtBlockedSlot
    public final int pageStep()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pageStep(nativeId());
    }
    @QtBlockedSlot
    native int __qt_pageStep(long __this__nativeId);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="iconSize")
    public final void setIconSize(com.trolltech.qt.core.QSize size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIconSize_QSize(nativeId(), size == null ? 0 : size.nativeId());
    }
    native void __qt_setIconSize_QSize(long __this__nativeId, long size);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="iconVisible")
    public final void setIconVisible(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIconVisible_boolean(nativeId(), arg__1);
    }
    native void __qt_setIconVisible_boolean(long __this__nativeId, boolean arg__1);

/**

*/

    public final void setMediaObject(com.trolltech.qt.phonon.MediaObject arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcMediaObject = arg__1;
        }
        __qt_setMediaObject_MediaObject(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_setMediaObject_MediaObject(long __this__nativeId, long arg__1);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="orientation")
    public final void setOrientation(com.trolltech.qt.core.Qt.Orientation arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), arg__1.value());
    }
    native void __qt_setOrientation_Orientation(long __this__nativeId, int arg__1);

/**
This property holds the page step interval. The larger of two natural steps that a slider provides and typically corresponds to the user pressing PageUp or PageDown. <p>Defaults to 5 seconds.
*/

    @com.trolltech.qt.QtPropertyWriter(name="pageStep")
    @QtBlockedSlot
    public final void setPageStep(int milliseconds)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPageStep_int(nativeId(), milliseconds);
    }
    @QtBlockedSlot
    native void __qt_setPageStep_int(long __this__nativeId, int milliseconds);

/**
This property holds the single step interval. The smaller of two natural steps that a slider provides and typically corresponds to the user pressing an arrow key. <p>Defaults to 0.5 seconds.
*/

    @com.trolltech.qt.QtPropertyWriter(name="singleStep")
    @QtBlockedSlot
    public final void setSingleStep(int milliseconds)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSingleStep_int(nativeId(), milliseconds);
    }
    @QtBlockedSlot
    native void __qt_setSingleStep_int(long __this__nativeId, int milliseconds);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="tracking")
    @QtBlockedSlot
    public final void setTracking(boolean tracking)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTracking_boolean(nativeId(), tracking);
    }
    @QtBlockedSlot
    native void __qt_setTracking_boolean(long __this__nativeId, boolean tracking);

/**
This property holds the single step interval. The smaller of two natural steps that a slider provides and typically corresponds to the user pressing an arrow key. <p>Defaults to 0.5 seconds.
*/

    @com.trolltech.qt.QtPropertyReader(name="singleStep")
    @QtBlockedSlot
    public final int singleStep()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_singleStep(nativeId());
    }
    @QtBlockedSlot
    native int __qt_singleStep(long __this__nativeId);

/**
@exclude
*/

    public static native SeekSlider fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected SeekSlider(QPrivateConstructor p) { super(p); } 
}
