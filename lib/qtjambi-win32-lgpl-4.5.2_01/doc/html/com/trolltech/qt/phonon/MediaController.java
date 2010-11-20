package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class MediaController extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }
    @QtBlockedEnum
    public enum Feature implements com.trolltech.qt.QtEnumerator {
        Angles(1),
        Chapters(2),
        Titles(4);

        Feature(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.phonon.MediaController$Features with the specified <tt>com.trolltech.qt.phonon.MediaController$Feature[]</tt> MediaController$Feature values set.</brief>
*/

        public static Features createQFlags(Feature ... values) {
            return new Features(values);
        }
/**
<brief>Returns the MediaController$Feature constant with the specified <tt>int</tt>.</brief>
*/

        public static Feature resolve(int value) {
            return (Feature) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Angles;
            case 2: return Chapters;
            case 4: return Titles;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class Features extends com.trolltech.qt.QFlags<Feature> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a MediaController-Features with the specified <tt>com.trolltech.qt.phonon.MediaController.Feature[]</tt>. flags set.</brief>
*/

        public Features(Feature ... args) { super(args); }
        public Features(int value) { setValue(value); }
    }


/**

*/

    public final Signal1<java.lang.Integer> angleChanged = new Signal1<java.lang.Integer>();

    private final void angleChanged(int angleNumber)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_angleChanged_int(nativeId(), angleNumber);
    }
    native void __qt_angleChanged_int(long __this__nativeId, int angleNumber);
/**

*/

    public final Signal1<java.lang.Integer> availableAnglesChanged = new Signal1<java.lang.Integer>();

    private final void availableAnglesChanged(int availableAngles)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_availableAnglesChanged_int(nativeId(), availableAngles);
    }
    native void __qt_availableAnglesChanged_int(long __this__nativeId, int availableAngles);
/**

*/

    public final Signal0 availableAudioChannelsChanged = new Signal0();

    private final void availableAudioChannelsChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_availableAudioChannelsChanged(nativeId());
    }
    native void __qt_availableAudioChannelsChanged(long __this__nativeId);
/**

*/

    public final Signal1<java.lang.Integer> availableChaptersChanged = new Signal1<java.lang.Integer>();

    private final void availableChaptersChanged(int availableChapters)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_availableChaptersChanged_int(nativeId(), availableChapters);
    }
    native void __qt_availableChaptersChanged_int(long __this__nativeId, int availableChapters);
/**

*/

    public final Signal0 availableSubtitlesChanged = new Signal0();

    private final void availableSubtitlesChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_availableSubtitlesChanged(nativeId());
    }
    native void __qt_availableSubtitlesChanged(long __this__nativeId);
/**

*/

    public final Signal1<java.lang.Integer> availableTitlesChanged = new Signal1<java.lang.Integer>();

    private final void availableTitlesChanged(int availableTitles)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_availableTitlesChanged_int(nativeId(), availableTitles);
    }
    native void __qt_availableTitlesChanged_int(long __this__nativeId, int availableTitles);
/**

*/

    public final Signal1<java.lang.Integer> chapterChanged = new Signal1<java.lang.Integer>();

    private final void chapterChanged(int chapterNumber)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_chapterChanged_int(nativeId(), chapterNumber);
    }
    native void __qt_chapterChanged_int(long __this__nativeId, int chapterNumber);
/**

*/

    public final Signal1<java.lang.Integer> titleChanged = new Signal1<java.lang.Integer>();

    private final void titleChanged(int titleNumber)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_titleChanged_int(nativeId(), titleNumber);
    }
    native void __qt_titleChanged_int(long __this__nativeId, int titleNumber);

/**
This is an overloaded method provided for convenience.
*/

    public MediaController(com.trolltech.qt.phonon.MediaObject parent){
        super((QPrivateConstructor)null);
        __qt_MediaController_MediaObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_MediaController_MediaObject(long parent);

/**
Returns true if titles will automatically be played when the media is played; otherwise returns false. <p>The media controller will play the titles of the media source in sequence when the media object's {@link com.trolltech.qt.phonon.MediaObject#play() play()} function is called. If the autoplay option is disabled, the media object will play the {@link com.trolltech.qt.phonon.MediaController#currentTitle() MediaController::currentTitle()}{current title} and then finish the playback. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaController#setAutoplayTitles(boolean) setAutoplayTitles()}, and {@link com.trolltech.qt.phonon.MediaController#currentTitle() currentTitle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean autoplayTitles()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoplayTitles(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoplayTitles(long __this__nativeId);

/**
Returns the available angles that is available for the current media source. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaController.Feature Feature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int availableAngles()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_availableAngles(nativeId());
    }
    @QtBlockedSlot
    native int __qt_availableAngles(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.AudioChannelDescription> availableAudioChannels()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_availableAudioChannels(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.AudioChannelDescription> __qt_availableAudioChannels(long __this__nativeId);

/**
Returns the number of chapters the current media source contains. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaController.Feature Feature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int availableChapters()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_availableChapters(nativeId());
    }
    @QtBlockedSlot
    native int __qt_availableChapters(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.SubtitleDescription> availableSubtitles()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_availableSubtitles(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.SubtitleDescription> __qt_availableSubtitles(long __this__nativeId);

/**
Returns the number of titles that the current media source contains. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaController.Feature Feature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int availableTitles()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_availableTitles(nativeId());
    }
    @QtBlockedSlot
    native int __qt_availableTitles(long __this__nativeId);

/**
Returns the angle that is currently used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaController#setCurrentAngle(int) setCurrentAngle()}, and {@link com.trolltech.qt.phonon.MediaController.Feature Feature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int currentAngle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentAngle(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentAngle(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.AudioChannelDescription currentAudioChannel()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentAudioChannel(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.phonon.AudioChannelDescription __qt_currentAudioChannel(long __this__nativeId);

/**
Returns the chapter that is currently being played back. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaController#setCurrentChapter(int) setCurrentChapter()}, and {@link com.trolltech.qt.phonon.MediaController.Feature Feature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int currentChapter()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentChapter(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentChapter(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.SubtitleDescription currentSubtitle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentSubtitle(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.phonon.SubtitleDescription __qt_currentSubtitle(long __this__nativeId);

/**
Returns the title that is currently played back. <p>The current title is 0 (the first) by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaController#setCurrentTitle(int) setCurrentTitle()}, and {@link com.trolltech.qt.phonon.MediaController.Feature Feature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int currentTitle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentTitle(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentTitle(long __this__nativeId);

/**
Skips to the next title. <p>If it was playing before the title change it will start playback on the next title if autoplayTitles is enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaController.Feature Feature }. <br></DD></DT>
*/

    public final void nextTitle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_nextTitle(nativeId());
    }
    native void __qt_nextTitle(long __this__nativeId);

/**
Skips to the previous title. <p>If it was playing before the title change it will start playback on the previous title if autoplayTitles is enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaController.Feature Feature }. <br></DD></DT>
*/

    public final void previousTitle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_previousTitle(nativeId());
    }
    native void __qt_previousTitle(long __this__nativeId);

/**

*/

    public final void setAutoplayTitles(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoplayTitles_boolean(nativeId(), arg__1);
    }
    native void __qt_setAutoplayTitles_boolean(long __this__nativeId, boolean arg__1);

/**
Sets the current angle to the given <tt>angleNumber</tt> if the media file or device supports navigation by angle number. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaController#currentAngle() currentAngle()}, and {@link com.trolltech.qt.phonon.MediaController.Feature Feature }. <br></DD></DT>
*/

    public final void setCurrentAngle(int angleNumber)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentAngle_int(nativeId(), angleNumber);
    }
    native void __qt_setCurrentAngle_int(long __this__nativeId, int angleNumber);

/**

*/

    @QtBlockedSlot
    public final void setCurrentAudioChannel(com.trolltech.qt.phonon.AudioChannelDescription stream)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentAudioChannel_AudioChannelDescription(nativeId(), stream == null ? 0 : stream.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCurrentAudioChannel_AudioChannelDescription(long __this__nativeId, long stream);

/**
Sets the current chapter to the given <tt>chapterNumber</tt> if the media file or device supports navigation by chapter number. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaController#currentChapter() currentChapter()}, and {@link com.trolltech.qt.phonon.MediaController.Feature Feature }. <br></DD></DT>
*/

    public final void setCurrentChapter(int chapterNumber)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentChapter_int(nativeId(), chapterNumber);
    }
    native void __qt_setCurrentChapter_int(long __this__nativeId, int chapterNumber);

/**

*/

    @QtBlockedSlot
    public final void setCurrentSubtitle(com.trolltech.qt.phonon.SubtitleDescription stream)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentSubtitle_SubtitleDescription(nativeId(), stream == null ? 0 : stream.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCurrentSubtitle_SubtitleDescription(long __this__nativeId, long stream);

/**
Skips to the given title <tt>titleNumber</tt>. <p>If it was playing before the title change it will start playback on the new title if autoplayTitles is enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaController#currentTitle() currentTitle()}, and {@link com.trolltech.qt.phonon.MediaController.Feature Feature }. <br></DD></DT>
*/

    public final void setCurrentTitle(int titleNumber)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentTitle_int(nativeId(), titleNumber);
    }
    native void __qt_setCurrentTitle_int(long __this__nativeId, int titleNumber);

/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.MediaController.Features supportedFeatures()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.phonon.MediaController.Features(__qt_supportedFeatures(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_supportedFeatures(long __this__nativeId);

/**
@exclude
*/

    public static native MediaController fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected MediaController(QPrivateConstructor p) { super(p); } 
}
