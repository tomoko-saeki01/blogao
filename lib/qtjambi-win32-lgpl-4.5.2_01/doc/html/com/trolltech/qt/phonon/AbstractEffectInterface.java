package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public interface AbstractEffectInterface extends QtJambiInterface
{

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object parameterValue(com.trolltech.qt.phonon.EffectParameter arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<com.trolltech.qt.phonon.EffectParameter> parameters();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setParameterValue(com.trolltech.qt.phonon.EffectParameter arg__1, java.lang.Object newValue);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_AbstractEffect(long ptr);
}
