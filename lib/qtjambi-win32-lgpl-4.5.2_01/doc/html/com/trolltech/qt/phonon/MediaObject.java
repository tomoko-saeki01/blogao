package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class MediaObject extends com.trolltech.qt.core.QObject
    implements com.trolltech.qt.phonon.MediaNodeInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }
/**

*/

    public final Signal0 aboutToFinish = new Signal0();

    private final void aboutToFinish()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_aboutToFinish(nativeId());
    }
    native void __qt_aboutToFinish(long __this__nativeId);
/**

*/

    public final Signal1<java.lang.Integer> bufferStatus = new Signal1<java.lang.Integer>();

    private final void bufferStatus(int percentFilled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_bufferStatus_int(nativeId(), percentFilled);
    }
    native void __qt_bufferStatus_int(long __this__nativeId, int percentFilled);
/**

*/

    public final Signal1<com.trolltech.qt.phonon.MediaSource> currentSourceChanged = new Signal1<com.trolltech.qt.phonon.MediaSource>();

    private final void currentSourceChanged(com.trolltech.qt.phonon.MediaSource newSource)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentSourceChanged_MediaSource(nativeId(), newSource == null ? 0 : newSource.nativeId());
    }
    native void __qt_currentSourceChanged_MediaSource(long __this__nativeId, long newSource);
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

*/

    public final Signal1<java.lang.Boolean> hasVideoChanged = new Signal1<java.lang.Boolean>();

    private final void hasVideoChanged(boolean hasVideo)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hasVideoChanged_boolean(nativeId(), hasVideo);
    }
    native void __qt_hasVideoChanged_boolean(long __this__nativeId, boolean hasVideo);
/**

*/

    public final Signal0 metaDataChanged = new Signal0();

    private final void metaDataChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_metaDataChanged(nativeId());
    }
    native void __qt_metaDataChanged(long __this__nativeId);
/**

*/

    public final Signal1<java.lang.Integer> prefinishMarkReached = new Signal1<java.lang.Integer>();

    private final void prefinishMarkReached(int msecToEnd)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_prefinishMarkReached_int(nativeId(), msecToEnd);
    }
    native void __qt_prefinishMarkReached_int(long __this__nativeId, int msecToEnd);
/**

*/

    public final Signal1<java.lang.Boolean> seekableChanged = new Signal1<java.lang.Boolean>();

    private final void seekableChanged(boolean isSeekable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_seekableChanged_boolean(nativeId(), isSeekable);
    }
    native void __qt_seekableChanged_boolean(long __this__nativeId, boolean isSeekable);
/**

*/

    public final Signal2<com.trolltech.qt.phonon.Phonon.State, com.trolltech.qt.phonon.Phonon.State> stateChanged = new Signal2<com.trolltech.qt.phonon.Phonon.State, com.trolltech.qt.phonon.Phonon.State>();

    private final void stateChanged(com.trolltech.qt.phonon.Phonon.State newstate, com.trolltech.qt.phonon.Phonon.State oldstate)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stateChanged_State_State(nativeId(), newstate.value(), oldstate.value());
    }
    native void __qt_stateChanged_State_State(long __this__nativeId, int newstate, int oldstate);
/**

*/

    public final Signal1<java.lang.Long> tick = new Signal1<java.lang.Long>();

    private final void tick(long time)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_tick_long(nativeId(), time);
    }
    native void __qt_tick_long(long __this__nativeId, long time);
/**

*/

    public final Signal1<java.lang.Long> totalTimeChanged = new Signal1<java.lang.Long>();

    private final void totalTimeChanged(long newTotalTime)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_totalTimeChanged_long(nativeId(), newTotalTime);
    }
    native void __qt_totalTimeChanged_long(long __this__nativeId, long newTotalTime);


/**
This is an overloaded method provided for convenience.
*/

    public MediaObject() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public MediaObject(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_MediaObject_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_MediaObject_QObject(long parent);

/**

*/

    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    native void __qt_clear(long __this__nativeId);

/**
Clears the queue of media sources. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#queue() queue()}, and {@link com.trolltech.qt.phonon.MediaObject#enqueue(com.trolltech.qt.phonon.MediaSource) enqueue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearQueue()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearQueue(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearQueue(long __this__nativeId);

/**
Returns the current media source, i. ., the media source that is being played back. The current source is either set with {@link com.trolltech.qt.phonon.MediaObject#setCurrentSource(com.trolltech.qt.phonon.MediaSource) setCurrentSource()} or taken from the media {@link com.trolltech.qt.phonon.MediaObject#queue() queue()} when a media source has finished playing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#setCurrentSource(com.trolltech.qt.phonon.MediaSource) setCurrentSource()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.MediaSource currentSource()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentSource(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.phonon.MediaSource __qt_currentSource(long __this__nativeId);

/**
Returns the current time (in milliseconds), i. ., position in the media stream, of the file currently being played. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#tick tick() }, {@link com.trolltech.qt.phonon.MediaObject#totalTime() totalTime()}, and {@link com.trolltech.qt.phonon.MediaObject#remainingTime() remainingTime()}. <br></DD></DT>
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

*/

    @QtBlockedSlot
    public final void enqueue(com.trolltech.qt.phonon.MediaSource source)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_enqueue_MediaSource(nativeId(), source == null ? 0 : source.nativeId());
    }
    @QtBlockedSlot
    native void __qt_enqueue_MediaSource(long __this__nativeId, long source);

/**

*/

    @QtBlockedSlot
    public final void enqueue(java.util.List<com.trolltech.qt.phonon.MediaSource> sources)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_enqueue_List(nativeId(), sources);
    }
    @QtBlockedSlot
    native void __qt_enqueue_List(long __this__nativeId, java.util.List<com.trolltech.qt.phonon.MediaSource> sources);

/**

*/

    @QtBlockedSlot
    public final void enqueueUrls(java.util.List<com.trolltech.qt.core.QUrl> urls)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_enqueueUrls_List(nativeId(), urls);
    }
    @QtBlockedSlot
    native void __qt_enqueueUrls_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QUrl> urls);

/**
Returns a human-readable description of the last error that occurred. The strings given may vary between backends. <p>The error description can be used to give a message to the user - and the developer - when the {@link com.trolltech.qt.phonon.MediaObject#stateChanged stateChanged() } signal is emitted with {@link com.trolltech.qt.phonon.Phonon.State ErrorState }.<a name="qt-backends"><h2>Qt Backends</h2> On Windows, Qt fetches its error messages from the DirectShow backend. This usually includes an error number, which can be looked up in the DirectShow documentation: http://msdn.microsoft.com/archive/default.asp?url=/archive/en-us/dx81_c/directx_cpp/htm/errorandsuccesscodes.asp. <p>On Linux and Mac, the error strings are not fetched directly from the backend, but are created in the backend. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.Phonon.State Phonon::ErrorState }, and {@link com.trolltech.qt.phonon.MediaObject#stateChanged stateChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String errorString()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_errorString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
Tells your program what to do about the last error that occurred. Use this function after receiving a {@link com.trolltech.qt.phonon.MediaObject#stateChanged stateChanged() } signal with {@link com.trolltech.qt.phonon.Phonon.State ErrorState }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.Phonon.ErrorType Phonon::ErrorType }, {@link com.trolltech.qt.phonon.Phonon.State Phonon::ErrorState }, and {@link com.trolltech.qt.phonon.MediaObject#stateChanged stateChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.Phonon.ErrorType errorType()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.phonon.Phonon.ErrorType.resolve(__qt_errorType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_errorType(long __this__nativeId);

/**
Check whether the current media source includes a video stream. <p><b>Warning:</b> This information is not resolved immediately after a media object gets a new source. Listen to the {@link com.trolltech.qt.phonon.MediaObject#hasVideoChanged hasVideoChanged() } signal instead. <pre class="snippet">
  connect(media, SIGNAL(hasVideoChanged(bool)), hasVideoChanged(bool));
  media-&gt;setCurrentSource("somevideo.avi");
  media-&gt;hasVideo(); // returns false;
}

void hasVideoChanged(bool b)
{
  // b == true
  media-&gt;hasVideo(); // returns true;
}
</pre> Returns <tt>true</tt> if the media contains video data; otherwise, returns <tt>false</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#hasVideoChanged hasVideoChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasVideo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasVideo(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasVideo(long __this__nativeId);

/**
Returns the paths that inputs multimedia to this media node. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaNode#outputPaths() outputPaths()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.Path> inputPaths()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputPaths(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.Path> __qt_inputPaths(long __this__nativeId);

/**
Check whether it is possible to seek, i. ., change the playback position in the media stream. <p><b>Warning:</b> This information is not solved immediately after the media object gets a new media source. The {@link com.trolltech.qt.phonon.MediaObject#hasVideoChanged hasVideoChanged() } signal is emitted after this information is available. <pre class="snippet">
  connect(media, SIGNAL(hasVideoChanged(bool)), hasVideoChanged(bool));
  media-&gt;setCurrentSource("somevideo.avi");
  media-&gt;hasVideo(); // returns false;
}

void hasVideoChanged(bool b)
{
  // b == true
  media-&gt;hasVideo(); // returns true;
}
</pre> Returns <tt>true</tt> if the current media may be seeked; otherwise, returns <tt>false</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#seekableChanged seekableChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSeekable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSeekable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSeekable(long __this__nativeId);

/**
Returns true if the backend provides an implementation of this class; otherwise returns false. <p>This does not guarantee that instances of the class works as expected, but that the backend has implemented the functionality for this class. For instance, Qt's GStreamer backend will return true for instances of the {@link com.trolltech.qt.phonon.AudioOutput AudioOutput} class, even if there is a problem with GStreamer and it could not play sound.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns all meta data in a multi map. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#metaDataChanged metaDataChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.SortedMap<java.lang.String, java.util.List<java.lang.String>> metaData()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_metaData(nativeId());
    }
    @QtBlockedSlot
    native java.util.SortedMap<java.lang.String, java.util.List<java.lang.String>> __qt_metaData(long __this__nativeId);

/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> metaData(com.trolltech.qt.phonon.Phonon.MetaData key)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_metaData_MetaData(nativeId(), key.value());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_metaData_MetaData(long __this__nativeId, int key);

/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> metaData(java.lang.String key)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_metaData_String(nativeId(), key);
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_metaData_String(long __this__nativeId, java.lang.String key);

/**
Returns the paths to which this media node outputs media. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaNode#inputPaths() inputPaths()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.Path> outputPaths()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_outputPaths(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.Path> __qt_outputPaths(long __this__nativeId);

/**
Requests playback to pause, and the media object to enter the {@link com.trolltech.qt.phonon.Phonon.State PausedState }. If it was paused already, nothing changes. <p>This function is asynchronous and the media might not be paused immediately. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#play() play()}, {@link com.trolltech.qt.phonon.MediaObject#stop() stop()}, and {@link com.trolltech.qt.phonon.MediaObject#stateChanged stateChanged() }. <br></DD></DT>
*/

    public final void pause()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_pause(nativeId());
    }
    native void __qt_pause(long __this__nativeId);

/**
Requests playback of the media data to start. <p>Playback starts when the {@link com.trolltech.qt.phonon.MediaObject#stateChanged stateChanged() } signal is emitted with {@link com.trolltech.qt.phonon.Phonon.State PlayingState }. <p>If the media object is already in a {@link com.trolltech.qt.phonon.Phonon.State PlayingState }, nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#stop() stop()}, {@link com.trolltech.qt.phonon.MediaObject#pause() pause()}, and {@link com.trolltech.qt.phonon.MediaObject#stateChanged stateChanged() }. <br></DD></DT>
*/

    public final void play()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_play(nativeId());
    }
    native void __qt_play(long __this__nativeId);

/**
This property holds the time when the prefinishMarkReached signal is emitted before playback ends.  This property specifies the time in milliseconds the {@link com.trolltech.qt.phonon.MediaObject#prefinishMarkReached prefinishMarkReached() } signal is emitted before the playback finishes. A value of <tt>0</tt> disables the signal. The signal is only emitted for the last source in the {@link com.trolltech.qt.phonon.MediaObject#queue() media queue}. <p>Defaults to <tt>0</tt> (disabled). <p><b>Warning:</b> For some media data the total time cannot be determined accurately, therefore the accuracy of the prefinishMarkReached signal can be bad sometimes. Still, it is better to use this method than to look at {@link com.trolltech.qt.phonon.MediaObject#totalTime() totalTime()} and {@link com.trolltech.qt.phonon.MediaObject#currentTime() currentTime()} to emulate the behavior because the backend might have more information available than your application does through {@link com.trolltech.qt.phonon.MediaObject#totalTime() totalTime()} and {@link com.trolltech.qt.phonon.MediaObject#currentTime() currentTime()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#prefinishMarkReached prefinishMarkReached() }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="prefinishMark")
    @QtBlockedSlot
    public final int prefinishMark()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prefinishMark(nativeId());
    }
    @QtBlockedSlot
    native int __qt_prefinishMark(long __this__nativeId);

/**
Returns the queued media sources. <p>This does list does not include the current source, returned by {@link com.trolltech.qt.phonon.MediaObject#currentSource() currentSource()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#setQueue(java.util.List) setQueue()}, and {@link com.trolltech.qt.phonon.MediaObject#enqueue(com.trolltech.qt.phonon.MediaSource) enqueue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.phonon.MediaSource> queue()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_queue(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.phonon.MediaSource> __qt_queue(long __this__nativeId);

/**
Get the remaining time (in milliseconds) of the file currently being played. <p>Returns the remaining time in milliseconds. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#totalTime() totalTime()}, {@link com.trolltech.qt.phonon.MediaObject#currentTime() currentTime()}, and {@link com.trolltech.qt.phonon.MediaObject#totalTimeChanged totalTimeChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long remainingTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_remainingTime(nativeId());
    }
    @QtBlockedSlot
    native long __qt_remainingTime(long __this__nativeId);

/**
Requests a seek to the <tt>time</tt> indicated, specified in milliseconds. <p>You can only seek if {@link com.trolltech.qt.phonon.MediaObject#state() state()} is {@link com.trolltech.qt.phonon.Phonon.State PlayingState }, {@link com.trolltech.qt.phonon.Phonon.State BufferingState } or {@link com.trolltech.qt.phonon.Phonon.State PausedState }. <p>The call is asynchronous, so currentTime can still be the old value right after this method was called. If all you need is a slider that shows the current position and allows the user to seek, use the class {@link com.trolltech.qt.phonon.SeekSlider SeekSlider}. <p>If the current source of the media object is not seekable, calls to this functions do nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.SeekSlider SeekSlider}, and {@link com.trolltech.qt.phonon.MediaObject#tick tick() }. <br></DD></DT>
*/

    public final void seek(long time)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_seek_long(nativeId(), time);
    }
    native void __qt_seek_long(long __this__nativeId, long time);

/**

*/

    @QtBlockedSlot
    public final void setCurrentSource(com.trolltech.qt.phonon.MediaSource source)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentSource_MediaSource(nativeId(), source == null ? 0 : source.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCurrentSource_MediaSource(long __this__nativeId, long source);

/**
This property holds the time when the prefinishMarkReached signal is emitted before playback ends.  This property specifies the time in milliseconds the {@link com.trolltech.qt.phonon.MediaObject#prefinishMarkReached prefinishMarkReached() } signal is emitted before the playback finishes. A value of <tt>0</tt> disables the signal. The signal is only emitted for the last source in the {@link com.trolltech.qt.phonon.MediaObject#queue() media queue}. <p>Defaults to <tt>0</tt> (disabled). <p><b>Warning:</b> For some media data the total time cannot be determined accurately, therefore the accuracy of the prefinishMarkReached signal can be bad sometimes. Still, it is better to use this method than to look at {@link com.trolltech.qt.phonon.MediaObject#totalTime() totalTime()} and {@link com.trolltech.qt.phonon.MediaObject#currentTime() currentTime()} to emulate the behavior because the backend might have more information available than your application does through {@link com.trolltech.qt.phonon.MediaObject#totalTime() totalTime()} and {@link com.trolltech.qt.phonon.MediaObject#currentTime() currentTime()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#prefinishMarkReached prefinishMarkReached() }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="prefinishMark")
    @QtBlockedSlot
    public final void setPrefinishMark(int msecToEnd)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrefinishMark_int(nativeId(), msecToEnd);
    }
    @QtBlockedSlot
    native void __qt_setPrefinishMark_int(long __this__nativeId, int msecToEnd);

/**

*/

    @QtBlockedSlot
    public final void setQueue(java.util.List<com.trolltech.qt.phonon.MediaSource> sources)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQueue_List(nativeId(), sources);
    }
    @QtBlockedSlot
    native void __qt_setQueue_List(long __this__nativeId, java.util.List<com.trolltech.qt.phonon.MediaSource> sources);

/**

*/

    @QtBlockedSlot
    public final void setQueueToUrls(java.util.List<com.trolltech.qt.core.QUrl> urls)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQueueToUrls_List(nativeId(), urls);
    }
    @QtBlockedSlot
    native void __qt_setQueueToUrls_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QUrl> urls);

/**
This property holds The time interval in milliseconds between two ticks.  The {@link com.trolltech.qt.phonon.MediaObject#tick tick() } signal is emitted continuously during playback. The tick interval is the time that elapses between the emission of two tick signals. If you set the interval to <tt>0</tt> the tick signal gets disabled. <p>The {@link com.trolltech.qt.phonon.MediaObject#tick tick() } signal can, for instance, be used to update widgets that show the current position in the playback of a media source. <p>Defaults to <tt>0</tt> (disabled). <p><b>Warning:</b> The back-end is free to choose a different tick interval close to what you asked for. This means that the following code <tt>may</tt> fail: <pre class="snippet">
int x = 200;
media-&gt;setTickInterval(x);
Q_ASSERT(x == producer-&gt;tickInterval());
</pre> On the other hand the following is guaranteed: <pre class="snippet">
int x = 200;
media-&gt;setTickInterval(x);
Q_ASSERT(x &gt;= producer-&gt;tickInterval() &&
         x &lt;= 2producer-&gt;tickInterval());
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#tick tick() }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="tickInterval")
    public final void setTickInterval(int newTickInterval)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTickInterval_int(nativeId(), newTickInterval);
    }
    native void __qt_setTickInterval_int(long __this__nativeId, int newTickInterval);

/**
This property Defines the time between playback of two media sources in the media queue.  A positive transition time defines a gap of silence between queued media sources. <p>A transition time of 0 ms requests gapless playback (i.e., the next source in the media queue starts immediately after the playback of the current source finishes). <p>A negative transition time defines a crossfade between the queued media sources. <p>Defaults to 0 (gapless playback). <p><b>Warning:</b> This feature might not work reliably with every backend.
*/

    @com.trolltech.qt.QtPropertyWriter(name="transitionTime")
    @QtBlockedSlot
    public final void setTransitionTime(int msec)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTransitionTime_int(nativeId(), msec);
    }
    @QtBlockedSlot
    native void __qt_setTransitionTime_int(long __this__nativeId, int msec);

/**
Returns the current {@link com.trolltech.qt.phonon.Phonon.State Phonon::State } of the object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.Phonon.State Phonon::State }, and {@link com.trolltech.qt.phonon.MediaObject#stateChanged stateChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.phonon.Phonon.State state()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.phonon.Phonon.State.resolve(__qt_state(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_state(long __this__nativeId);

/**
Requests playback to stop, and the media object to enter the {@link com.trolltech.qt.phonon.Phonon.State StoppedState }. If it was stopped before nothing changes. <p>This function is asynchronous and the media might not be stopped immediately. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#play() play()}, {@link com.trolltech.qt.phonon.MediaObject#pause() pause()}, and {@link com.trolltech.qt.phonon.MediaObject#stateChanged stateChanged() }. <br></DD></DT>
*/

    public final void stop()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stop(nativeId());
    }
    native void __qt_stop(long __this__nativeId);

/**
This property holds The time interval in milliseconds between two ticks.  The {@link com.trolltech.qt.phonon.MediaObject#tick tick() } signal is emitted continuously during playback. The tick interval is the time that elapses between the emission of two tick signals. If you set the interval to <tt>0</tt> the tick signal gets disabled. <p>The {@link com.trolltech.qt.phonon.MediaObject#tick tick() } signal can, for instance, be used to update widgets that show the current position in the playback of a media source. <p>Defaults to <tt>0</tt> (disabled). <p><b>Warning:</b> The back-end is free to choose a different tick interval close to what you asked for. This means that the following code <tt>may</tt> fail: <pre class="snippet">
int x = 200;
media-&gt;setTickInterval(x);
Q_ASSERT(x == producer-&gt;tickInterval());
</pre> On the other hand the following is guaranteed: <pre class="snippet">
int x = 200;
media-&gt;setTickInterval(x);
Q_ASSERT(x &gt;= producer-&gt;tickInterval() &&
         x &lt;= 2producer-&gt;tickInterval());
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#tick tick() }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="tickInterval")
    @QtBlockedSlot
    public final int tickInterval()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tickInterval(nativeId());
    }
    @QtBlockedSlot
    native int __qt_tickInterval(long __this__nativeId);

/**
Get the total time (in milliseconds) of the file currently being played. <p>Returns the total time in milliseconds. <p><b>Warning:</b> The total time is not defined before the media object enters the {@link com.trolltech.qt.phonon.Phonon.State LoadingState }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.phonon.MediaObject#totalTimeChanged totalTimeChanged() }. <br></DD></DT>
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
This property Defines the time between playback of two media sources in the media queue.  A positive transition time defines a gap of silence between queued media sources. <p>A transition time of 0 ms requests gapless playback (i.e., the next source in the media queue starts immediately after the playback of the current source finishes). <p>A negative transition time defines a crossfade between the queued media sources. <p>Defaults to 0 (gapless playback). <p><b>Warning:</b> This feature might not work reliably with every backend.
*/

    @com.trolltech.qt.QtPropertyReader(name="transitionTime")
    @QtBlockedSlot
    public final int transitionTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_transitionTime(nativeId());
    }
    @QtBlockedSlot
    native int __qt_transitionTime(long __this__nativeId);

/**
@exclude
*/

    public static native MediaObject fromNativePointer(QNativePointer nativePointer);

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

    protected MediaObject(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_MediaNode(long ptr);
}
