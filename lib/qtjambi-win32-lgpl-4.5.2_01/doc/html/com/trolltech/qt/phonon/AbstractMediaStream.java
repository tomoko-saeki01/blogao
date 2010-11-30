package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public abstract class AbstractMediaStream extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.phonon.AbstractMediaStream {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        protected void needData() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_needData(nativeId());
        }

        @Override
        @QtBlockedSlot
        protected void reset() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_reset(nativeId());
        }
    }



/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected AbstractMediaStream() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected AbstractMediaStream(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_AbstractMediaStream_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_AbstractMediaStream_QObject(long parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void endOfData()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_endOfData(nativeId());
    }
    @QtBlockedSlot
    native void __qt_endOfData(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void error(com.trolltech.qt.phonon.Phonon.ErrorType errorType, java.lang.String errorString)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_error_ErrorType_String(nativeId(), errorType.value(), errorString);
    }
    @QtBlockedSlot
    native void __qt_error_ErrorType_String(long __this__nativeId, int errorType, java.lang.String errorString);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setStreamSeekable(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStreamSeekable_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setStreamSeekable_boolean(long __this__nativeId, boolean arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setStreamSize(long arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStreamSize_long(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setStreamSize_long(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final boolean streamSeekable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_streamSeekable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_streamSeekable(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final long streamSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_streamSize(nativeId());
    }
    @QtBlockedSlot
    native long __qt_streamSize(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void writeData(com.trolltech.qt.core.QByteArray data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeData_QByteArray(nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeData_QByteArray(long __this__nativeId, long data);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void enoughData()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
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
    protected abstract void needData();
    @QtBlockedSlot
    native void __qt_needData(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected abstract void reset();
    @QtBlockedSlot
    native void __qt_reset(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void seekStream(long offset)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_seekStream_long(nativeId(), offset);
    }
    @QtBlockedSlot
    native void __qt_seekStream_long(long __this__nativeId, long offset);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native AbstractMediaStream fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected AbstractMediaStream(QPrivateConstructor p) { super(p); } 
}
