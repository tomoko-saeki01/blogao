package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public interface PlatformPluginInterface extends QtJambiInterface
{

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.String applicationName();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QObject createBackend();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QObject createBackend(java.lang.String library, java.lang.String version);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.phonon.AbstractMediaStream createMediaStream(com.trolltech.qt.core.QUrl url, com.trolltech.qt.core.QObject parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<com.trolltech.qt.QPair<com.trolltech.qt.core.QByteArray, java.lang.String>> deviceAccessListFor(com.trolltech.qt.phonon.AudioOutputDevice arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QIcon icon(java.lang.String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean isMimeTypeAvailable(java.lang.String mimeType);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public double loadVolume(java.lang.String outputName);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void notification(java.lang.String notificationName, java.lang.String text, java.util.List<java.lang.String> actions, com.trolltech.qt.core.QObject receiver, java.lang.String actionSlot);

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
    public void saveVolume(java.lang.String outputName, double volume);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_PlatformPlugin(long ptr);
}
