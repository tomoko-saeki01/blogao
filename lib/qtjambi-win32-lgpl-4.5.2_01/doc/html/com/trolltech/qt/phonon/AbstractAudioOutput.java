package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public class AbstractAudioOutput extends com.trolltech.qt.core.QObject
    implements com.trolltech.qt.phonon.MediaNodeInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

    /**
     * This constructor is a place holder intended to prevent
     * users from subclassing the class. Certain classes can
     * unfortunately only be subclasses internally. The constructor
     * will indiscriminately throw an exception if called. If the
     * exception is ignored, any use of the constructed object will
     * cause an exception to occur.

     * @throws QClassCannotBeSubclassedException
     **/
    protected AbstractAudioOutput() throws QClassCannotBeSubclassedException {
        throw new QClassCannotBeSubclassedException(AbstractAudioOutput.class);
    }


    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.Path> inputPaths()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputPaths(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.Path> __qt_inputPaths(long __this__nativeId);

    @QtBlockedSlot
    public final boolean isValid()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.Path> outputPaths()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_outputPaths(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.Path> __qt_outputPaths(long __this__nativeId);

    public static native AbstractAudioOutput fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    protected AbstractAudioOutput(QPrivateConstructor p) { super(p); } 

    @QtBlockedSlot public native long __qt_cast_to_MediaNode(long ptr);
}
