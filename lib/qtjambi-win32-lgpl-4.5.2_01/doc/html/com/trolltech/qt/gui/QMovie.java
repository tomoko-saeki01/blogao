package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QMovie class is a convenience class for playing movies with {@link com.trolltech.qt.gui.QImageReader QImageReader}. First, create a QMovie object by passing either the name of a file or a pointer to a {@link com.trolltech.qt.core.QIODevice QIODevice} containing an animated image format to QMovie's constructor. You can call {@link com.trolltech.qt.gui.QMovie#isValid() isValid()} to check if the image data is valid, before starting the movie. To start the movie, call {@link com.trolltech.qt.gui.QMovie#start() start()}. QMovie will enter {@link com.trolltech.qt.gui.QMovie.MovieState Running } state, and emit {@link com.trolltech.qt.gui.QMovie#started started() } and {@link com.trolltech.qt.gui.QMovie#stateChanged stateChanged() }. To get the current state of the movie, call {@link com.trolltech.qt.gui.QMovie#state() state()}. <p>To display the movie in your application, you can pass your QMovie object to {@link com.trolltech.qt.gui.QLabel#setMovie(com.trolltech.qt.gui.QMovie) QLabel::setMovie()}. Example: <pre class="snippet">
        QLabel label = new QLabel();
        QMovie movie = new QMovie("animations/fire.gif");

        label.setMovie(movie);
        movie.start();
</pre> Whenever a new frame is available in the movie, QMovie will emit {@link com.trolltech.qt.gui.QMovie#updated updated() }. If the size of the frame changes, {@link com.trolltech.qt.gui.QMovie#resized resized() } is emitted. You can call {@link com.trolltech.qt.gui.QMovie#currentImage() currentImage()} or {@link com.trolltech.qt.gui.QMovie#currentPixmap() currentPixmap()} to get a copy of the current frame. When the movie is done, QMovie emits {@link com.trolltech.qt.gui.QMovie#finished finished() }. If any error occurs during playback (i.e, the image file is corrupt), QMovie will emit {@link com.trolltech.qt.gui.QMovie#error error() }. <p>You can control the speed of the movie playback by calling {@link com.trolltech.qt.gui.QMovie#setSpeed(int) setSpeed()}, which takes the percentage of the original speed as an argument. Pause the movie by calling setPaused(true). QMovie will then enter {@link com.trolltech.qt.gui.QMovie.MovieState Paused } state and emit {@link com.trolltech.qt.gui.QMovie#stateChanged stateChanged() }. If you call setPaused(false), QMovie will reenter {@link com.trolltech.qt.gui.QMovie.MovieState Running } state and start the movie again. To stop the movie, call {@link com.trolltech.qt.gui.QMovie#stop() stop()}. <p>Certain animation formats allow you to set the background color. You can call {@link com.trolltech.qt.gui.QMovie#setBackgroundColor(com.trolltech.qt.gui.QColor) setBackgroundColor()} to set the color, or {@link com.trolltech.qt.gui.QMovie#backgroundColor() backgroundColor()} to retrieve the current background color. <p>{@link com.trolltech.qt.gui.QMovie#currentFrameNumber() currentFrameNumber()} returns the sequence number of the current frame. The first frame in the animation has the sequence number 0. {@link com.trolltech.qt.gui.QMovie#frameCount() frameCount()} returns the total number of frames in the animation, if the image format supports this. You can call {@link com.trolltech.qt.gui.QMovie#loopCount() loopCount()} to get the number of times the movie should loop before finishing. {@link com.trolltech.qt.gui.QMovie#nextFrameDelay() nextFrameDelay()} returns the number of milliseconds the current frame should be displayed. <p>QMovie can be instructed to cache frames of an animation by calling {@link com.trolltech.qt.gui.QMovie#setCacheMode(com.trolltech.qt.gui.QMovie.CacheMode) setCacheMode()}. <p>Call {@link com.trolltech.qt.gui.QMovie#supportedFormats() supportedFormats()} for a list of formats that QMovie supports. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel QLabel}, {@link com.trolltech.qt.gui.QImageReader QImageReader}, and {@link <a href="../widgets-movie.html">Movie Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QMovie extends com.trolltech.qt.core.QObject
{

    private Object __rcDevice = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the different cache modes of {@link com.trolltech.qt.gui.QMovie QMovie}.
*/

    public enum CacheMode implements com.trolltech.qt.QtEnumerator {
/**
 No frames are cached (the default).
*/

        CacheNone(0),
/**
 All frames are cached.
*/

        CacheAll(1);

        CacheMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QMovie$CacheMode constant with the specified <tt>int</tt>.</brief>
*/

        public static CacheMode resolve(int value) {
            return (CacheMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CacheNone;
            case 1: return CacheAll;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the different states of {@link com.trolltech.qt.gui.QMovie QMovie}.
*/

    public enum MovieState implements com.trolltech.qt.QtEnumerator {
/**
 The movie is not running. This is {@link com.trolltech.qt.gui.QMovie QMovie}'s initial state, and the state it enters after {@link com.trolltech.qt.gui.QMovie#stop() stop()} has been called or the movie is finished.
*/

        NotRunning(0),
/**
 The movie is paused, and {@link com.trolltech.qt.gui.QMovie QMovie} stops emitting {@link com.trolltech.qt.gui.QMovie#updated updated() } or {@link com.trolltech.qt.gui.QMovie#resized resized() }. This state is entered after calling pause() or setPaused(true). The current frame number it kept, and the movie will continue with the next frame when unpause() or setPaused(false) is called.
*/

        Paused(1),
/**
 The movie is running.
*/

        Running(2);

        MovieState(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QMovie$MovieState constant with the specified <tt>int</tt>.</brief>
*/

        public static MovieState resolve(int value) {
            return (MovieState) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NotRunning;
            case 1: return Paused;
            case 2: return Running;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QImageReader$ImageReaderError(named: error)&gt;:<p> This signal is emitted by QMovie when the error <tt>error</tt> occurred during playback. QMovie will stop the movie, and enter {@link com.trolltech.qt.gui.QMovie.MovieState QMovie::NotRunning } state.
*/

    public final Signal1<com.trolltech.qt.gui.QImageReader.ImageReaderError> error = new Signal1<com.trolltech.qt.gui.QImageReader.ImageReaderError>();

    private final void error(com.trolltech.qt.gui.QImageReader.ImageReaderError error)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_error_ImageReaderError(nativeId(), error.value());
    }
    native void __qt_error_ImageReaderError(long __this__nativeId, int error);
/**
 This signal is emitted when the movie has finished. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#stop() QMovie::stop()}. <br></DD></DT>
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: frameNumber)&gt;:<p> This signal is emitted when the frame number has changed to <tt>frameNumber</tt>. You can call {@link com.trolltech.qt.gui.QMovie#currentImage() currentImage()} or {@link com.trolltech.qt.gui.QMovie#currentPixmap() currentPixmap()} to get a copy of the frame.
*/

    public final Signal1<java.lang.Integer> frameChanged = new Signal1<java.lang.Integer>();

    private final void frameChanged(int frameNumber)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_frameChanged_int(nativeId(), frameNumber);
    }
    native void __qt_frameChanged_int(long __this__nativeId, int frameNumber);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QSize(named: size)&gt;:<p> This signal is emitted when the current frame has been resized to <tt>size</tt>. This effect is sometimes used in animations as an alternative to replacing the frame. You can call {@link com.trolltech.qt.gui.QMovie#currentImage() currentImage()} or {@link com.trolltech.qt.gui.QMovie#currentPixmap() currentPixmap()} to get a copy of the updated frame.
*/

    public final Signal1<com.trolltech.qt.core.QSize> resized = new Signal1<com.trolltech.qt.core.QSize>();

    private final void resized(com.trolltech.qt.core.QSize size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resized_QSize(nativeId(), size == null ? 0 : size.nativeId());
    }
    native void __qt_resized_QSize(long __this__nativeId, long size);
/**
 This signal is emitted after {@link com.trolltech.qt.gui.QMovie#start() QMovie::start()} has been called, and QMovie has entered {@link com.trolltech.qt.gui.QMovie.MovieState QMovie::Running } state.
*/

    public final Signal0 started = new Signal0();

    private final void started()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_started(nativeId());
    }
    native void __qt_started(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QMovie$MovieState(named: state)&gt;:<p> This signal is emitted every time the state of the movie changes. The new state is specified by <tt>state</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#state() QMovie::state()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QMovie.MovieState> stateChanged = new Signal1<com.trolltech.qt.gui.QMovie.MovieState>();

    private final void stateChanged(com.trolltech.qt.gui.QMovie.MovieState state)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stateChanged_MovieState(nativeId(), state.value());
    }
    native void __qt_stateChanged_MovieState(long __this__nativeId, int state);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QRect(named: rect)&gt;:<p> This signal is emitted when the rect <tt>rect</tt> in the current frame has been updated. You can call {@link com.trolltech.qt.gui.QMovie#currentImage() currentImage()} or {@link com.trolltech.qt.gui.QMovie#currentPixmap() currentPixmap()} to get a copy of the updated frame.
*/

    public final Signal1<com.trolltech.qt.core.QRect> updated = new Signal1<com.trolltech.qt.core.QRect>();

    private final void updated(com.trolltech.qt.core.QRect rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updated_QRect(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    native void __qt_updated_QRect(long __this__nativeId, long rect);


/**
Constructs a QMovie object. QMovie will use read image data from <tt>device</tt>, which it assumes is open and readable. If <tt>format</tt> is not empty, QMovie will use the image format <tt>format</tt> for decoding the image data. Otherwise, QMovie will attempt to guess the format. <p>The <tt>parent</tt> object is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor.
*/

    public QMovie(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.core.QByteArray format) {
        this(device, format, (com.trolltech.qt.core.QObject)null);
    }

/**
Constructs a QMovie object. QMovie will use read image data from <tt>device</tt>, which it assumes is open and readable. If <tt>format</tt> is not empty, QMovie will use the image format <tt>format</tt> for decoding the image data. Otherwise, QMovie will attempt to guess the format. <p>The <tt>parent</tt> object is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor.
*/

    public QMovie(com.trolltech.qt.core.QIODevice device) {
        this(device, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray(), (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QMovie object. QMovie will use read image data from <tt>device</tt>, which it assumes is open and readable. If <tt>format</tt> is not empty, QMovie will use the image format <tt>format</tt> for decoding the image data. Otherwise, QMovie will attempt to guess the format. <p>The <tt>parent</tt> object is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor.
*/

    public QMovie(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.core.QByteArray format, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QMovie_QIODevice_QByteArray_QObject(device == null ? 0 : device.nativeId(), format == null ? 0 : format.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QMovie_QIODevice_QByteArray_QObject(long device, long format, long parent);


/**
Constructs a QMovie object, passing the <tt>parent</tt> object to {@link com.trolltech.qt.core.QObject QObject}'s constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#setFileName(java.lang.String) setFileName()}, {@link com.trolltech.qt.gui.QMovie#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}, and {@link com.trolltech.qt.gui.QMovie#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}. <br></DD></DT>
*/

    public QMovie() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QMovie object, passing the <tt>parent</tt> object to {@link com.trolltech.qt.core.QObject QObject}'s constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#setFileName(java.lang.String) setFileName()}, {@link com.trolltech.qt.gui.QMovie#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}, and {@link com.trolltech.qt.gui.QMovie#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}. <br></DD></DT>
*/

    public QMovie(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QMovie_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QMovie_QObject(long parent);


/**
Constructs a QMovie object. QMovie will use read image data from <tt>fileName</tt>. If <tt>format</tt> is not empty, QMovie will use the image format <tt>format</tt> for decoding the image data. Otherwise, QMovie will attempt to guess the format. <p>The <tt>parent</tt> object is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor.
*/

    public QMovie(java.lang.String fileName, com.trolltech.qt.core.QByteArray format) {
        this(fileName, format, (com.trolltech.qt.core.QObject)null);
    }

/**
Constructs a QMovie object. QMovie will use read image data from <tt>fileName</tt>. If <tt>format</tt> is not empty, QMovie will use the image format <tt>format</tt> for decoding the image data. Otherwise, QMovie will attempt to guess the format. <p>The <tt>parent</tt> object is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor.
*/

    public QMovie(java.lang.String fileName) {
        this(fileName, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray(), (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QMovie object. QMovie will use read image data from <tt>fileName</tt>. If <tt>format</tt> is not empty, QMovie will use the image format <tt>format</tt> for decoding the image data. Otherwise, QMovie will attempt to guess the format. <p>The <tt>parent</tt> object is passed to {@link com.trolltech.qt.core.QObject QObject}'s constructor.
*/

    public QMovie(java.lang.String fileName, com.trolltech.qt.core.QByteArray format, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QMovie_String_QByteArray_QObject(fileName, format == null ? 0 : format.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QMovie_String_QByteArray_QObject(java.lang.String fileName, long format, long parent);

/**
Returns the background color of the movie. If no background color has been assigned, an invalid {@link com.trolltech.qt.gui.QColor QColor} is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#setBackgroundColor(com.trolltech.qt.gui.QColor) setBackgroundColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor backgroundColor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_backgroundColor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_backgroundColor(long __this__nativeId);

/**
This property holds the movie's cache mode. Caching frames can be useful when the underlying animation format handler that QMovie relies on to decode the animation data does not support jumping to particular frames in the animation, or even "rewinding" the animation to the beginning (for looping). Furthermore, if the image data comes from a sequential device, it is not possible for the underlying animation handler to seek back to frames whose data has already been read (making looping altogether impossible). <p>To aid in such situations, a QMovie object can be instructed to cache the frames, at the added memory cost of keeping the frames in memory for the lifetime of the object. <p>By default, this property is set to {@link com.trolltech.qt.gui.QMovie.CacheMode CacheNone }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie.CacheMode QMovie::CacheMode }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="cacheMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMovie.CacheMode cacheMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QMovie.CacheMode.resolve(__qt_cacheMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_cacheMode(long __this__nativeId);

/**
Returns the sequence number of the current frame. The number of the first frame in the movie is 0.
*/

    @QtBlockedSlot
    public final int currentFrameNumber()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentFrameNumber(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentFrameNumber(long __this__nativeId);

/**
Returns the current frame as a {@link com.trolltech.qt.gui.QImage QImage}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#currentPixmap() currentPixmap()}, and {@link com.trolltech.qt.gui.QMovie#updated updated() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage currentImage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentImage(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_currentImage(long __this__nativeId);

/**
Returns the current frame as a {@link com.trolltech.qt.gui.QPixmap QPixmap}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#currentImage() currentImage()}, and {@link com.trolltech.qt.gui.QMovie#updated updated() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap currentPixmap()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentPixmap(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_currentPixmap(long __this__nativeId);

/**
Returns the device QMovie reads image data from. If no device has currently been assigned, 0 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}, and {@link com.trolltech.qt.gui.QMovie#fileName() fileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QIODevice device()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_device(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_device(long __this__nativeId);

/**
Returns the name of the file that QMovie reads image data from. If no file name has been assigned, or if the assigned device is not a file, an empty QString is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#setFileName(java.lang.String) setFileName()}, and {@link com.trolltech.qt.gui.QMovie#device() device()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fileName()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fileName(long __this__nativeId);

/**
Returns the format that QMovie uses when decoding image data. If no format has been assigned, an empty QByteArray() is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray format()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_format(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_format(long __this__nativeId);

/**
Returns the number of frames in the movie. <p>Certain animation formats do not support this feature, in which case 0 is returned.
*/

    @QtBlockedSlot
    public final int frameCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frameCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_frameCount(long __this__nativeId);

/**
Returns the rect of the last frame. If no frame has yet been updated, an invalid {@link com.trolltech.qt.core.QRect QRect} is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#currentImage() currentImage()}, and {@link com.trolltech.qt.gui.QMovie#currentPixmap() currentPixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect frameRect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frameRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_frameRect(long __this__nativeId);

/**
Returns true if the movie is valid (e.g., the image data is readable and the image format is supported); otherwise returns false.
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
Jumps to frame number <tt>frameNumber</tt>. Returns true on success; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean jumpToFrame(int frameNumber)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_jumpToFrame_int(nativeId(), frameNumber);
    }
    @QtBlockedSlot
    native boolean __qt_jumpToFrame_int(long __this__nativeId, int frameNumber);

/**
Jumps to the next frame. Returns true on success; otherwise returns false.
*/

    public final boolean jumpToNextFrame()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_jumpToNextFrame(nativeId());
    }
    native boolean __qt_jumpToNextFrame(long __this__nativeId);

/**
Returns the number of times the movie will loop before it finishes. If the movie will only play once (no looping), loopCount returns 0. If the movie loops forever, loopCount returns -1. <p>Note that, if the image data comes from a sequential device (e.g. a socket), QMovie can only loop the movie if the {@link QMovie#cacheMode() cacheMode} is set to {@link com.trolltech.qt.gui.QMovie.CacheMode QMovie::CacheAll }.
*/

    @QtBlockedSlot
    public final int loopCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_loopCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_loopCount(long __this__nativeId);

/**
Returns the number of milliseconds QMovie will wait before updating the next frame in the animation.
*/

    @QtBlockedSlot
    public final int nextFrameDelay()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nextFrameDelay(nativeId());
    }
    @QtBlockedSlot
    native int __qt_nextFrameDelay(long __this__nativeId);

/**
Returns the scaled size of frames. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#setScaledSize(com.trolltech.qt.core.QSize) setScaledSize()}, and {@link com.trolltech.qt.gui.QImageReader#scaledSize() QImageReader::scaledSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize scaledSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scaledSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_scaledSize(long __this__nativeId);

/**
For image formats that support it, this function sets the background color to <tt>color</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#backgroundColor() backgroundColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBackgroundColor(com.trolltech.qt.gui.QColor color)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackgroundColor_QColor(nativeId(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBackgroundColor_QColor(long __this__nativeId, long color);

/**
This property holds the movie's cache mode. Caching frames can be useful when the underlying animation format handler that QMovie relies on to decode the animation data does not support jumping to particular frames in the animation, or even "rewinding" the animation to the beginning (for looping). Furthermore, if the image data comes from a sequential device, it is not possible for the underlying animation handler to seek back to frames whose data has already been read (making looping altogether impossible). <p>To aid in such situations, a QMovie object can be instructed to cache the frames, at the added memory cost of keeping the frames in memory for the lifetime of the object. <p>By default, this property is set to {@link com.trolltech.qt.gui.QMovie.CacheMode CacheNone }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie.CacheMode QMovie::CacheMode }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="cacheMode")
    @QtBlockedSlot
    public final void setCacheMode(com.trolltech.qt.gui.QMovie.CacheMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCacheMode_CacheMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setCacheMode_CacheMode(long __this__nativeId, int mode);

/**
Sets the current device to <tt>device</tt>. QMovie will read image data from this device when the movie is running. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#device() device()}, and {@link com.trolltech.qt.gui.QMovie#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDevice(com.trolltech.qt.core.QIODevice device)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcDevice = device;
        }
        __qt_setDevice_QIODevice(nativeId(), device == null ? 0 : device.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDevice_QIODevice(long __this__nativeId, long device);

/**
Sets the name of the file that QMovie reads image data from, to <tt>fileName</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#fileName() fileName()}, {@link com.trolltech.qt.gui.QMovie#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}, and {@link com.trolltech.qt.gui.QMovie#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFileName(java.lang.String fileName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFileName_String(nativeId(), fileName);
    }
    @QtBlockedSlot
    native void __qt_setFileName_String(long __this__nativeId, java.lang.String fileName);

/**
Sets the format that QMovie will use when decoding image data, to <tt>format</tt>. By default, QMovie will attempt to guess the format of the image data. <p>You can call {@link com.trolltech.qt.gui.QMovie#supportedFormats() supportedFormats()} for the full list of formats QMovie supports. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#format() format()}, and {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() QImageReader::supportedImageFormats()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFormat(com.trolltech.qt.core.QByteArray format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_QByteArray(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFormat_QByteArray(long __this__nativeId, long format);

/**
If <tt>paused</tt> is true, QMovie will enter {@link com.trolltech.qt.gui.QMovie.MovieState Paused } state and emit stateChanged(Paused); otherwise it will enter {@link com.trolltech.qt.gui.QMovie.MovieState Running } state and emit stateChanged(Running). <p><DT><b>See also:</b><br><DD>paused(), and {@link com.trolltech.qt.gui.QMovie#state() state()}. <br></DD></DT>
*/

    public final void setPaused(boolean paused)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPaused_boolean(nativeId(), paused);
    }
    native void __qt_setPaused_boolean(long __this__nativeId, boolean paused);

/**
Sets the scaled frame size to <tt>size</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#scaledSize() scaledSize()}, and {@link com.trolltech.qt.gui.QImageReader#setScaledSize(com.trolltech.qt.core.QSize) QImageReader::setScaledSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setScaledSize(com.trolltech.qt.core.QSize size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScaledSize_QSize(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setScaledSize_QSize(long __this__nativeId, long size);

/**
This property holds the movie's speed. The speed is measured in percentage of the original movie speed. The default speed is 100%. Example: <pre class="snippet">
        QMovie movie = new QMovie("racecar.gif");
        movie.setSpeed(200); // 2x speed
</pre>
*/

    @com.trolltech.qt.QtPropertyWriter(name="speed")
    public final void setSpeed(int percentSpeed)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSpeed_int(nativeId(), percentSpeed);
    }
    native void __qt_setSpeed_int(long __this__nativeId, int percentSpeed);

/**
This property holds the movie's speed. The speed is measured in percentage of the original movie speed. The default speed is 100%. Example: <pre class="snippet">
        QMovie movie = new QMovie("racecar.gif");
        movie.setSpeed(200); // 2x speed
</pre>
*/

    @com.trolltech.qt.QtPropertyReader(name="speed")
    @QtBlockedSlot
    public final int speed()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_speed(nativeId());
    }
    @QtBlockedSlot
    native int __qt_speed(long __this__nativeId);

/**
Starts the movie. QMovie will enter {@link com.trolltech.qt.gui.QMovie.MovieState Running } state, and start emitting {@link com.trolltech.qt.gui.QMovie#updated updated() } and {@link com.trolltech.qt.gui.QMovie#resized resized() } as the movie progresses. <p>If QMovie is in the {@link com.trolltech.qt.gui.QMovie.MovieState Paused } state, this function is equivalent to calling setPaused(false). If QMovie is already in the {@link com.trolltech.qt.gui.QMovie.MovieState Running } state, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#stop() stop()}, and {@link com.trolltech.qt.gui.QMovie#setPaused(boolean) setPaused()}. <br></DD></DT>
*/

    public final void start()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_start(nativeId());
    }
    native void __qt_start(long __this__nativeId);

/**
Returns the current state of QMovie. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie.MovieState MovieState }, and {@link com.trolltech.qt.gui.QMovie#stateChanged stateChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMovie.MovieState state()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QMovie.MovieState.resolve(__qt_state(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_state(long __this__nativeId);

/**
Stops the movie. QMovie enters {@link com.trolltech.qt.gui.QMovie.MovieState NotRunning } state, and stops emitting {@link com.trolltech.qt.gui.QMovie#updated updated() } and {@link com.trolltech.qt.gui.QMovie#resized resized() }. If {@link com.trolltech.qt.gui.QMovie#start() start()} is called again, the movie will restart from the beginning. <p>If QMovie is already in the {@link com.trolltech.qt.gui.QMovie.MovieState NotRunning } state, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMovie#start() start()}, and {@link com.trolltech.qt.gui.QMovie#setPaused(boolean) setPaused()}. <br></DD></DT>
*/

    public final void stop()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stop(nativeId());
    }
    native void __qt_stop(long __this__nativeId);

/**
Returns the list of image formats supported by QMovie. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() QImageReader::supportedImageFormats()}. <br></DD></DT>
*/

    public native static java.util.List<com.trolltech.qt.core.QByteArray> supportedFormats();

/**
@exclude
*/

    public static native QMovie fromNativePointer(QNativePointer nativePointer);

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

    protected QMovie(QPrivateConstructor p) { super(p); } 
}
