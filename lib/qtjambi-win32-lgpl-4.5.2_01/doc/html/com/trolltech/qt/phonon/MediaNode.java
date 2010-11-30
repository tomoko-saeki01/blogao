package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public final class MediaNode extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.phonon.MediaNodeInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

/**
Returns the paths that inputs multimedia to this media node. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaNode#outputPaths() outputPaths()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.Path> inputPaths()    {
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
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_outputPaths(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.Path> __qt_outputPaths(long __this__nativeId);

/**
@exclude
*/

    public static native MediaNode fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected MediaNode(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_MediaNode(long ptr);
}
