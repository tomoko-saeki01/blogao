package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public abstract class AbstractStream extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.phonon.AbstractStreamInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.phonon.AbstractStream {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void endOfData() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_endOfData(nativeId());
        }

        @Override
        @QtBlockedSlot
        public void setStreamSeekable(boolean s) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setStreamSeekable_boolean(nativeId(), s);
        }

        @Override
        @QtBlockedSlot
        public void setStreamSize(long newSize) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setStreamSize_long(nativeId(), newSize);
        }

        @Override
        @QtBlockedSlot
        public void writeData(com.trolltech.qt.core.QByteArray data) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_writeData_QByteArray(nativeId(), data == null ? 0 : data.nativeId());
        }
    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public AbstractStream(){
        super((QPrivateConstructor)null);
        __qt_AbstractStream();
    }

    native void __qt_AbstractStream();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void connectToSource(com.trolltech.qt.phonon.MediaSource mediaSource)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_connectToSource_MediaSource(nativeId(), mediaSource == null ? 0 : mediaSource.nativeId());
    }
    @QtBlockedSlot
    native void __qt_connectToSource_MediaSource(long __this__nativeId, long mediaSource);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void enoughData()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_enoughData(nativeId());
    }
    @QtBlockedSlot
    native void __qt_enoughData(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void needData()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_needData(nativeId());
    }
    @QtBlockedSlot
    native void __qt_needData(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void reset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    @QtBlockedSlot
    native void __qt_reset(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void seekStream(long seekTo)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_seekStream_long(nativeId(), seekTo);
    }
    @QtBlockedSlot
    native void __qt_seekStream_long(long __this__nativeId, long seekTo);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void endOfData();
    @QtBlockedSlot
    native void __qt_endOfData(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setStreamSeekable(boolean s);
    @QtBlockedSlot
    native void __qt_setStreamSeekable_boolean(long __this__nativeId, boolean s);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setStreamSize(long newSize);
    @QtBlockedSlot
    native void __qt_setStreamSize_long(long __this__nativeId, long newSize);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void writeData(com.trolltech.qt.core.QByteArray data);
    @QtBlockedSlot
    native void __qt_writeData_QByteArray(long __this__nativeId, long data);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native AbstractStream fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected AbstractStream(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_AbstractStream(long ptr);
}
