package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public interface AbstractVideoOutputInterface extends QtJambiInterface, com.trolltech.qt.phonon.MediaNodeInterface
{

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<com.trolltech.qt.phonon.Path> inputPaths();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean isValid();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<com.trolltech.qt.phonon.Path> outputPaths();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_AbstractVideoOutput(long ptr);
}
