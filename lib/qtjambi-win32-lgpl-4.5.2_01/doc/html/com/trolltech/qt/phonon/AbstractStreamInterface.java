package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public interface AbstractStreamInterface extends QtJambiInterface
{

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void connectToSource(com.trolltech.qt.phonon.MediaSource mediaSource);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void enoughData();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void needData();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void reset();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void seekStream(long seekTo);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void endOfData();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setStreamSeekable(boolean s);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setStreamSize(long newSize);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void writeData(com.trolltech.qt.core.QByteArray data);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_AbstractStream(long ptr);
}
