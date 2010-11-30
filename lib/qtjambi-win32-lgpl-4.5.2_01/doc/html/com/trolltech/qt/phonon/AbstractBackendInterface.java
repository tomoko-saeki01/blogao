package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public interface AbstractBackendInterface extends QtJambiInterface
{

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> availableMimeTypes();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean connectNodes(com.trolltech.qt.core.QObject arg__1, com.trolltech.qt.core.QObject arg__2);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QObject createObject(com.trolltech.qt.phonon.AbstractBackend.Class c, com.trolltech.qt.core.QObject parent, java.util.List<java.lang.Object> args);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean disconnectNodes(com.trolltech.qt.core.QObject arg__1, com.trolltech.qt.core.QObject arg__2);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean endConnectionChange(java.util.Set<com.trolltech.qt.core.QObject> arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<java.lang.Integer> objectDescriptionIndexes(com.trolltech.qt.phonon.Phonon.ObjectDescriptionType type);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.HashMap<com.trolltech.qt.core.QByteArray, java.lang.Object> objectDescriptionProperties(com.trolltech.qt.phonon.Phonon.ObjectDescriptionType type, int index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean startConnectionChange(java.util.Set<com.trolltech.qt.core.QObject> arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_AbstractBackend(long ptr);
}
