package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class BackendCapabilities
{

    static {
        com.trolltech.qt.QtJambi_LibraryInitializer.init();
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public native static java.util.List<com.trolltech.qt.phonon.AudioCaptureDevice> availableAudioCaptureDevices();

/**
Returns descriptions for the audio effects the backend supports. <p>Returns A list of AudioEffectDescription objects that give a name and description for every supported audio effect.
*/

    public native static java.util.List<com.trolltech.qt.phonon.EffectDescription> availableAudioEffects();

/**
Returns the audio output devices the backend supports. <p>Returns A list of AudioOutputDevice objects that give a name and description for every supported audio output device.
*/

    public native static java.util.List<com.trolltech.qt.phonon.AudioOutputDevice> availableAudioOutputDevices();

/**
Returns a list of mime types that the Backend can decode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.BackendCapabilities#isMimeTypeAvailable(java.lang.String) isMimeTypeAvailable()}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> availableMimeTypes();

/**

*/

    public native static boolean isMimeTypeAvailable(java.lang.String mimeType);
}
