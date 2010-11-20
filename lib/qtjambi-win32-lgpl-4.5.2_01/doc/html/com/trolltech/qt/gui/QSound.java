package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QSound class provides access to the platform audio facilities. Qt provides the most commonly required audio operation in GUI applications: asynchronously playing a sound file. This is most easily accomplished using the static {@link com.trolltech.qt.gui.QSound#play() play()} function: <pre class="snippet">
        QSound.play("mysounds/bells.wav");
</pre> Alternatively, create a QSound object from the sound file first and then call the {@link com.trolltech.qt.gui.QSound#play() play()} slot: <pre class="snippet">
        QSound bells = new QSound("mysounds/bells.wav");
        bells.play();
</pre> Once created a QSound object can be queried for its {@link com.trolltech.qt.gui.QSound#fileName() fileName()} and total number of {@link com.trolltech.qt.gui.QSound#loops() loops()} (i.e. the number of times the sound will play). The number of repetitions can be altered using the {@link com.trolltech.qt.gui.QSound#setLoops(int) setLoops()} function. While playing the sound, the {@link com.trolltech.qt.gui.QSound#loopsRemaining() loopsRemaining()} function returns the remaining number of repetitions. Use the {@link com.trolltech.qt.gui.QSound#isFinished() isFinished()} function to determine whether the sound has finished playing. <p>Sounds played using a QSound object may use more memory than the static {@link com.trolltech.qt.gui.QSound#play() play()} function, but it may also play more immediately (depending on the underlying platform audio facilities). Use the static {@link com.trolltech.qt.gui.QSound#isAvailable() isAvailable()} function to determine whether sound facilities exist on the platform. Which facilities that are actually used varies: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Platform</center></th><th><center> Audio Facility</center></th></tr></thead><tr valign="top" class="even"><td> Microsoft Windows</td><td> The underlying multimedia system is used; only WAVE format sound files are supported.</td></tr><tr valign="top" class="odd"><td> X11</td><td> The Network Audio System is used if available, otherwise all operations work silently. NAS supports WAVE and AU files.</td></tr><tr valign="top" class="even"><td> Mac OS X</td><td> NSSound is used. All formats that NSSound supports, including QuickTime formats, are supported by Qt for Mac OS X.</td></tr><tr valign="top" class="odd"><td> Qt for Embedded Linux</td><td> A built-in mixing sound server is used, accessing <tt>/dev/dsp</tt> directly. Only the WAVE format is supported.</td></tr></table> Note that QSound does not support {@link <a href="../resources.html">resources</a>}. This might be fixed in a future Qt version.
*/
@QtJambiGeneratedClass
public class QSound extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }


/**
Constructs a QSound object from the file specified by the given <tt>filename</tt> and with the given <tt>parent</tt>. <p>This may use more memory than the static {@link com.trolltech.qt.gui.QSound#play() play()} function, but it may also play more immediately (depending on the underlying platform audio facilities). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSound#play() play()}. <br></DD></DT>
*/

    public QSound(java.lang.String filename) {
        this(filename, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QSound object from the file specified by the given <tt>filename</tt> and with the given <tt>parent</tt>. <p>This may use more memory than the static {@link com.trolltech.qt.gui.QSound#play() play()} function, but it may also play more immediately (depending on the underlying platform audio facilities). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSound#play() play()}. <br></DD></DT>
*/

    public QSound(java.lang.String filename, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSound_String_QObject(filename, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSound_String_QObject(java.lang.String filename, long parent);

/**
Returns the filename associated with this QSound object. <p><DT><b>See also:</b><br><DD>QSound(). <br></DD></DT>
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
Returns true if the sound has finished playing; otherwise returns false. <p><b>Warning:</b> On Windows this function always returns true for unlooped sounds.
*/

    @QtBlockedSlot
    public final boolean isFinished()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFinished(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFinished(long __this__nativeId);

/**
Returns the number of times the sound will play. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSound#loopsRemaining() loopsRemaining()}, and {@link com.trolltech.qt.gui.QSound#setLoops(int) setLoops()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int loops()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_loops(nativeId());
    }
    @QtBlockedSlot
    native int __qt_loops(long __this__nativeId);

/**
Returns the remaining number of times the sound will loop (this value decreases each time the sound is played). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSound#loops() loops()}, and {@link com.trolltech.qt.gui.QSound#isFinished() isFinished()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int loopsRemaining()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_loopsRemaining(nativeId());
    }
    @QtBlockedSlot
    native int __qt_loopsRemaining(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Starts playing the sound specified by this QSound object. <p>The function returns immediately. Depending on the platform audio facilities, other sounds may stop or be mixed with the new sound. The sound can be played again at any time, possibly mixing or replacing previous plays of the sound. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSound#fileName() fileName()}. <br></DD></DT>
*/

    public final void play()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_play(nativeId());
    }
    native void __qt_play(long __this__nativeId);

/**
Sets the sound to repeat the given <tt>number</tt> of times when it is played. <p>Note that passing the value -1 will cause the sound to loop indefinitely. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSound#loops() loops()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLoops(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLoops_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setLoops_int(long __this__nativeId, int arg__1);

/**
Stops the sound playing. <p>Note that on Windows the current loop will finish if a sound is played in a loop. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSound#play() play()}. <br></DD></DT>
*/

    public final void stop()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stop(nativeId());
    }
    native void __qt_stop(long __this__nativeId);

/**
Returns true if sound facilities exist on the platform; otherwise returns false. <p>If no sound is available, all QSound operations work silently and quickly. An application may choose either to notify the user if sound is crucial to the application or to operate silently without bothering the user. <p>Note: On Windows this always returns true because some sound card drivers do not implement a way to find out whether it is available or not.
*/

    public native static boolean isAvailable();

/**
Plays the sound stored in the file specified by the given <tt>filename</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSound#stop() stop()}, {@link com.trolltech.qt.gui.QSound#loopsRemaining() loopsRemaining()}, and {@link com.trolltech.qt.gui.QSound#isFinished() isFinished()}. <br></DD></DT>
*/

    public native static void play(java.lang.String filename);

/**
@exclude
*/

    public static native QSound fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSound(QPrivateConstructor p) { super(p); } 
}
