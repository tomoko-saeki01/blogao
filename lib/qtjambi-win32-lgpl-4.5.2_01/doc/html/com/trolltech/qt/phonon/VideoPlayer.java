package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class VideoPlayer extends com.trolltech.qt.gui.QWidget
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }
/**

*/

    public final Signal0 finished = new Signal0();

    private final void finished()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_finished(nativeId());
    }
    native void __qt_finished(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    public VideoPlayer(com.trolltech.qt.phonon.Phonon.Category category) {
        this(category, (com.trolltech.qt.gui.QWidget)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public VideoPlayer(com.trolltech.qt.phonon.Phonon.Category category, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_VideoPlayer_Category_QWidget(category.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_VideoPlayer_Category_QWidget(int category, long parent);


/**
This is an overloaded method provided for convenience.
*/

    public VideoPlayer() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public VideoPlayer(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_VideoPlayer_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_VideoPlayer_QWidget(long parent);

/**
Returns the audio output object being used by the player.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.AudioOutput audioOutput()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_audioOutput(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.phonon.AudioOutput __qt_audioOutput(long __this__nativeId);

/**
Get the current time (in milliseconds) of the file currently being played.
*/

    @QtBlockedSlot
    public final long currentTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentTime(nativeId());
    }
    @QtBlockedSlot
    native long __qt_currentTime(long __this__nativeId);

/**
Returns true if it is currently paused; otherwise returns false if it is currently playing or stopped.
*/

    @QtBlockedSlot
    public final boolean isPaused()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isPaused(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isPaused(long __this__nativeId);

/**
Returns true if it is currently playing; otherwise returns false if it is currently stopped or paused
*/

    @QtBlockedSlot
    public final boolean isPlaying()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isPlaying(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isPlaying(long __this__nativeId);

/**

*/

    public final void load(com.trolltech.qt.phonon.MediaSource source)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_load_MediaSource(nativeId(), source == null ? 0 : source.nativeId());
    }
    native void __qt_load_MediaSource(long __this__nativeId, long source);

/**
Returns the media object being used by the player. <p>The media object can be accessed directly instead of using the VideoPlayers convenience functions, e.g., {@link com.trolltech.qt.phonon.VideoPlayer#play() play()} and {@link com.trolltech.qt.phonon.VideoPlayer#stop() stop()}. It is also possible to give the object to other Phonon widgets, e.g., a {@link com.trolltech.qt.phonon.SeekSlider SeekSlider} or a {@link com.trolltech.qt.phonon.VolumeSlider VolumeSlider}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.SeekSlider Phonon::SeekSlider}, and {@link com.trolltech.qt.phonon.MediaObject Phonon::MediaObject}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.MediaObject mediaObject()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mediaObject(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.phonon.MediaObject __qt_mediaObject(long __this__nativeId);

/**
Pauses the playback. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#pause() MediaObject::pause()}. <br></DD></DT>
*/

    public final void pause()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_pause(nativeId());
    }
    native void __qt_pause(long __this__nativeId);

/**
Continues playback of paused media. Restarts playback of a stopped (or newly loaded) media. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#play() MediaObject::play()}, and {@link com.trolltech.qt.phonon.VideoPlayer#play() play()}. <br></DD></DT>
*/

    public final void play()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_play(nativeId());
    }
    native void __qt_play(long __this__nativeId);

/**
This is an overloaded method provided for convenience.
*/

    public final void play(com.trolltech.qt.phonon.MediaSource source)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_play_MediaSource(nativeId(), source == null ? 0 : source.nativeId());
    }
    native void __qt_play_MediaSource(long __this__nativeId, long source);

/**
Seeks to the requested time. Note that the backend is free to ignore the seek request if the media source isn't seekable; you can check this by asking the media object of the VideoPlayer.<br><br>The following code example is written in c++.<br> <pre class="snippet">
    player-&gt;mediaObject()-&gt;isSeekable();
</pre> The <tt>ms</tt> parameter is the time in milliseconds from the start of the media. <p>The call is asynchronous, so {@link com.trolltech.qt.phonon.VideoPlayer#currentTime() currentTime()} can still be the old value right after this method was called. If all you need is a slider that shows the current position and allows the user to seek, use the class {@link com.trolltech.qt.phonon.SeekSlider SeekSlider}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#seek(long) MediaObject::seek()}, {@link com.trolltech.qt.phonon.MediaObject#isSeekable() MediaObject::isSeekable()}, and {@link com.trolltech.qt.phonon.VideoPlayer#mediaObject() mediaObject()}. <br></DD></DT>
*/

    public final void seek(long ms)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_seek_long(nativeId(), ms);
    }
    native void __qt_seek_long(long __this__nativeId, long ms);

/**
Sets the <tt>volume</tt> of the output as voltage factor. <p>1.0 means 100%, 0.5 means 50% voltage/25% power, 0.0 means 0% <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.VideoPlayer#volume() volume()}. <br></DD></DT>
*/

    public final void setVolume(float volume)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVolume_float(nativeId(), volume);
    }
    native void __qt_setVolume_float(long __this__nativeId, float volume);

/**
Stops the playback. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#stop() MediaObject::stop()}. <br></DD></DT>
*/

    public final void stop()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stop(nativeId());
    }
    native void __qt_stop(long __this__nativeId);

/**
Get the total time (in milliseconds) of the file currently being played.
*/

    @QtBlockedSlot
    public final long totalTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_totalTime(nativeId());
    }
    @QtBlockedSlot
    native long __qt_totalTime(long __this__nativeId);

/**
Returns the video widget being used by the player.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.VideoWidget videoWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_videoWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.phonon.VideoWidget __qt_videoWidget(long __this__nativeId);

/**
This is the current volume of the output as voltage factor. <p>1.0 means 100%, 0.5 means 50% voltage/25% power, 0.0 means 0% <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.VideoPlayer#setVolume(float) setVolume()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final float volume()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_volume(nativeId());
    }
    @QtBlockedSlot
    native float __qt_volume(long __this__nativeId);

/**
@exclude
*/

    public static native VideoPlayer fromNativePointer(QNativePointer nativePointer);

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

    protected VideoPlayer(QPrivateConstructor p) { super(p); } 
}
