package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public interface AbstractVolumeFaderInterface extends QtJambiInterface
{

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.phonon.VolumeFaderEffect.FadeCurve fadeCurve();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void fadeTo(float arg__1, int arg__2);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setFadeCurve(com.trolltech.qt.phonon.VolumeFaderEffect.FadeCurve arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setVolume(float arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public float volume();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_AbstractVolumeFader(long ptr);
}
