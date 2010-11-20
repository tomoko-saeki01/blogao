package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public interface AbstractMediaObjectInterface extends QtJambiInterface
{

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long currentTime();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.String errorString();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.phonon.Phonon.ErrorType errorType();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean hasVideo();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean isSeekable();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void pause();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void play();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int prefinishMark();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long remainingTime();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void seek(long milliseconds);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setNextSource(com.trolltech.qt.phonon.MediaSource source);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setPrefinishMark(int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setSource(com.trolltech.qt.phonon.MediaSource arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setTickInterval(int interval);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setTransitionTime(int arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.phonon.MediaSource source();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.phonon.Phonon.State state();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void stop();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int tickInterval();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long totalTime();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int transitionTime();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_AbstractMediaObject(long ptr);
}
