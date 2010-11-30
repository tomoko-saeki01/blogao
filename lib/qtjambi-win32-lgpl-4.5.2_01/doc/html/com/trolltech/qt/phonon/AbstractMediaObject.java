package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public abstract class AbstractMediaObject extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.phonon.AbstractMediaObjectInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.phonon.AbstractMediaObject {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public long currentTime() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_currentTime(nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.lang.String errorString() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_errorString(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.phonon.Phonon.ErrorType errorType() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return com.trolltech.qt.phonon.Phonon.ErrorType.resolve(super.__qt_errorType(nativeId()));
        }

        @Override
        @QtBlockedSlot
        public boolean hasVideo() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_hasVideo(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean isSeekable() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_isSeekable(nativeId());
        }

        @Override
        @QtBlockedSlot
        public void pause() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_pause(nativeId());
        }

        @Override
        @QtBlockedSlot
        public void play() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_play(nativeId());
        }

        @Override
        @QtBlockedSlot
        public int prefinishMark() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_prefinishMark(nativeId());
        }

        @Override
        @QtBlockedSlot
        public void seek(long milliseconds) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_seek_long(nativeId(), milliseconds);
        }

        @Override
        @QtBlockedSlot
        public void setNextSource(com.trolltech.qt.phonon.MediaSource source) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setNextSource_MediaSource(nativeId(), source == null ? 0 : source.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void setPrefinishMark(int arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setPrefinishMark_int(nativeId(), arg__1);
        }

        @Override
        @QtBlockedSlot
        public void setSource(com.trolltech.qt.phonon.MediaSource arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setSource_MediaSource(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void setTickInterval(int interval) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setTickInterval_int(nativeId(), interval);
        }

        @Override
        @QtBlockedSlot
        public void setTransitionTime(int arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setTransitionTime_int(nativeId(), arg__1);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.phonon.MediaSource source() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_source(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.phonon.Phonon.State state() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return com.trolltech.qt.phonon.Phonon.State.resolve(super.__qt_state(nativeId()));
        }

        @Override
        @QtBlockedSlot
        public void stop() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_stop(nativeId());
        }

        @Override
        @QtBlockedSlot
        public int tickInterval() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_tickInterval(nativeId());
        }

        @Override
        @QtBlockedSlot
        public long totalTime() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_totalTime(nativeId());
        }

        @Override
        @QtBlockedSlot
        public int transitionTime() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_transitionTime(nativeId());
        }
    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public AbstractMediaObject(){
        super((QPrivateConstructor)null);
        __qt_AbstractMediaObject();
    }

    native void __qt_AbstractMediaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract long currentTime();
    @QtBlockedSlot
    native long __qt_currentTime(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract java.lang.String errorString();
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.phonon.Phonon.ErrorType errorType();
    @QtBlockedSlot
    native int __qt_errorType(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract boolean hasVideo();
    @QtBlockedSlot
    native boolean __qt_hasVideo(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract boolean isSeekable();
    @QtBlockedSlot
    native boolean __qt_isSeekable(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void pause();
    @QtBlockedSlot
    native void __qt_pause(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void play();
    @QtBlockedSlot
    native void __qt_play(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract int prefinishMark();
    @QtBlockedSlot
    native int __qt_prefinishMark(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long remainingTime()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_remainingTime(nativeId());
    }
    @QtBlockedSlot
    native long __qt_remainingTime(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void seek(long milliseconds);
    @QtBlockedSlot
    native void __qt_seek_long(long __this__nativeId, long milliseconds);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setNextSource(com.trolltech.qt.phonon.MediaSource source);
    @QtBlockedSlot
    native void __qt_setNextSource_MediaSource(long __this__nativeId, long source);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setPrefinishMark(int arg__1);
    @QtBlockedSlot
    native void __qt_setPrefinishMark_int(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setSource(com.trolltech.qt.phonon.MediaSource arg__1);
    @QtBlockedSlot
    native void __qt_setSource_MediaSource(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setTickInterval(int interval);
    @QtBlockedSlot
    native void __qt_setTickInterval_int(long __this__nativeId, int interval);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void setTransitionTime(int arg__1);
    @QtBlockedSlot
    native void __qt_setTransitionTime_int(long __this__nativeId, int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.phonon.MediaSource source();
    @QtBlockedSlot
    native com.trolltech.qt.phonon.MediaSource __qt_source(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.phonon.Phonon.State state();
    @QtBlockedSlot
    native int __qt_state(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void stop();
    @QtBlockedSlot
    native void __qt_stop(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract int tickInterval();
    @QtBlockedSlot
    native int __qt_tickInterval(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract long totalTime();
    @QtBlockedSlot
    native long __qt_totalTime(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract int transitionTime();
    @QtBlockedSlot
    native int __qt_transitionTime(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native AbstractMediaObject fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected AbstractMediaObject(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_AbstractMediaObject(long ptr);
}
