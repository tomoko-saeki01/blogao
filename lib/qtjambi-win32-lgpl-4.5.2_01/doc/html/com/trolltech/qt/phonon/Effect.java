package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class Effect extends com.trolltech.qt.core.QObject
    implements com.trolltech.qt.phonon.MediaNodeInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }


/**
This is an overloaded method provided for convenience.
*/

    public Effect(com.trolltech.qt.phonon.EffectDescription description) {
        this(description, (com.trolltech.qt.core.QObject)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public Effect(com.trolltech.qt.phonon.EffectDescription description, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_Effect_EffectDescription_QObject(description == null ? 0 : description.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_Effect_EffectDescription_QObject(long description, long parent);

/**
Returns the description of this effect. This is the same description that was passed to the constructor.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.EffectDescription description()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_description(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.phonon.EffectDescription __qt_description(long __this__nativeId);

/**
Returns the paths that inputs multimedia to this media node. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaNode#outputPaths() outputPaths()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.Path> inputPaths()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputPaths(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.Path> __qt_inputPaths(long __this__nativeId);

/**
Returns true if the backend provides an implementation of this class; otherwise returns false. <p>This does not guarantee that instances of the class works as expected, but that the backend has implemented the functionality for this class. For instance, Qt's GStreamer backend will return true for instances of the {@link com.trolltech.qt.phonon.AudioOutput AudioOutput} class, even if there is a problem with GStreamer and it could not play sound.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns the paths to which this media node outputs media. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaNode#inputPaths() inputPaths()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.Path> outputPaths()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_outputPaths(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.Path> __qt_outputPaths(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final java.lang.Object parameterValue(com.trolltech.qt.phonon.EffectParameter arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parameterValue_EffectParameter(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_parameterValue_EffectParameter(long __this__nativeId, long arg__1);

/**
Returns a list of parameters that this effect provides to control its behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.EffectParameter EffectParameter}, and {@link com.trolltech.qt.phonon.EffectWidget EffectWidget}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.EffectParameter> parameters()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parameters(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.EffectParameter> __qt_parameters(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final void setParameterValue(com.trolltech.qt.phonon.EffectParameter arg__1, java.lang.Object value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setParameterValue_EffectParameter_Object(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_setParameterValue_EffectParameter_Object(long __this__nativeId, long arg__1, java.lang.Object value);

/**
@exclude
*/

    public static native Effect fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected Effect(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_MediaNode(long ptr);
}
