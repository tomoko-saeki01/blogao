package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QProcess class is used to start external programs and to communicate with them. To start a process, pass the name and command line arguments of the program you want to run as arguments to {@link com.trolltech.qt.core.QProcess#start(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) start()}. For example: <pre class="snippet">
        QObject parent = QApplication.instance();
...
        String program = "./path/to/my/favorite/program";

        List&lt;String&gt; arguments = new Vector&lt;String&gt;();
        arguments.add("-style");
        arguments.add("motif");

        QProcess myProcess = new QProcess(parent);
        myProcess.start(program, arguments);
</pre> QProcess then enters the {@link com.trolltech.qt.core.QProcess.ProcessState Starting } state, and when the program has started, QProcess enters the {@link com.trolltech.qt.core.QProcess.ProcessState Running } state and emits {@link com.trolltech.qt.core.QProcess#started started() }. <p>QProcess allows you to treat a process as a sequential I/O device. You can write to and read from the process just as you would access a network connection using {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}. You can then write to the process's standard input by calling {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()}, and read the standard output by calling {@link com.trolltech.qt.core.QIODevice#read(long) read()}, {@link com.trolltech.qt.core.QIODevice#readLine() readLine()}, and getChar(). Because it inherits {@link com.trolltech.qt.core.QIODevice QIODevice}, QProcess can also be used as an input source for {@link com.trolltech.qt.xml.QXmlReader QXmlReader}, or for generating data to be uploaded using {@link com.trolltech.qt.network.QFtp QFtp}. <p><b>Note:</b> On Windows CE, reading and writing to a process is not supported. <p>When the process exits, QProcess reenters the {@link com.trolltech.qt.core.QProcess.ProcessState NotRunning } state (the initial state), and emits {@link com.trolltech.qt.core.QProcess#finished finished() }. <p>The {@link com.trolltech.qt.core.QProcess#finished finished() } signal provides the exit code and exit status of the process as arguments, and you can also call {@link com.trolltech.qt.core.QProcess#exitCode() exitCode()} to obtain the exit code of the last process that finished, and {@link com.trolltech.qt.core.QProcess#exitStatus() exitStatus()} to obtain its exit status. If an error occurs at any point in time, QProcess will emit the {@link com.trolltech.qt.core.QProcess#error() error()} signal. You can also call {@link com.trolltech.qt.core.QProcess#error() error()} to find the type of error that occurred last, and {@link com.trolltech.qt.core.QProcess#state() state()} to find the current process state.<a name="communicating-via-channels"><h2>Communicating via Channels</h2> Processes have two predefined output channels: The standard output channel (<tt>stdout</tt>) supplies regular console output, and the standard error channel (<tt>stderr</tt>) usually supplies the errors that are printed by the process. These channels represent two separate streams of data. You can toggle between them by calling {@link com.trolltech.qt.core.QProcess#setReadChannel(com.trolltech.qt.core.QProcess.ProcessChannel) setReadChannel()}. QProcess emits {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } when data is available on the current read channel. It also emits {@link com.trolltech.qt.core.QProcess#readyReadStandardOutput readyReadStandardOutput() } when new standard output data is available, and when new standard error data is available, {@link com.trolltech.qt.core.QProcess#readyReadStandardError readyReadStandardError() } is emitted. Instead of calling {@link com.trolltech.qt.core.QIODevice#read(long) read()}, {@link com.trolltech.qt.core.QIODevice#readLine() readLine()}, or getChar(), you can explicitly read all data from either of the two channels by calling {@link com.trolltech.qt.core.QProcess#readAllStandardOutput() readAllStandardOutput()} or {@link com.trolltech.qt.core.QProcess#readAllStandardError() readAllStandardError()}. <p>The terminology for the channels can be misleading. Be aware that the process's output channels correspond to QProcess's read channels, whereas the process's input channels correspond to QProcess's write channels. This is because what we read using QProcess is the process's output, and what we write becomes the process's input. <p>QProcess can merge the two output channels, so that standard output and standard error data from the running process both use the standard output channel. Call {@link com.trolltech.qt.core.QProcess#setProcessChannelMode(com.trolltech.qt.core.QProcess.ProcessChannelMode) setProcessChannelMode()} with {@link com.trolltech.qt.core.QProcess.ProcessChannelMode MergedChannels } before starting the process to activative this feature. You also have the option of forwarding the output of the running process to the calling, main process, by passing {@link com.trolltech.qt.core.QProcess.ProcessChannelMode ForwardedChannels } as the argument. <p>Certain processes need special environment settings in order to operate. You can set environment variables for your process by calling {@link com.trolltech.qt.core.QProcess#setEnvironment(java.util.List) setEnvironment()}. To set a working directory, call {@link com.trolltech.qt.core.QProcess#setWorkingDirectory(java.lang.String) setWorkingDirectory()}. By default, processes are run in the current working directory of the calling process.<a name="synchronous-process-api"><h2>Synchronous Process API</h2> QProcess provides a set of functions which allow it to be used without an event loop, by suspending the calling thread until certain signals are emitted: <ul><li> {@link com.trolltech.qt.core.QProcess#waitForStarted() waitForStarted()} blocks until the process has started.</li><li> {@link com.trolltech.qt.core.QIODevice#waitForReadyRead(int) waitForReadyRead()} blocks until new data is available for reading on the current read channel.</li><li> {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()} blocks until one payload of data has been written to the process.</li><li> {@link com.trolltech.qt.core.QProcess#waitForFinished() waitForFinished()} blocks until the process has finished.</li></ul> Calling these functions from the main thread (the thread that calls QApplication::exec()) may cause your user interface to freeze. <p>The following example runs <tt>gzip</tt> to compress the string "Qt rocks!", without an event loop: <pre class="snippet">
        QProcess gzip = new QProcess();
        List&lt;String&gt; args = new Vector&lt;String&gt;();
        args.add("-c");

        gzip.start("gzip", args);
        if (!gzip.waitForStarted())
            return false;

        gzip.write(new QByteArray("Qt rocks!"));
        gzip.closeWriteChannel();

        if (!gzip.waitForFinished())
            return false;

        QByteArray result = gzip.readAll();
    </pre><a name="notes-for-windows-users"><h2>Notes for Windows Users</h2> Some Windows commands (for example, <tt>dir</tt>) are not provided by separate applications, but by the command interpreter itself. If you attempt to use QProcess to execute these commands directly, it won't work. One possible solution is to execute the command interpreter itself (<tt>cmd.exe</tt> on some Windows systems), and ask the interpreter to execute the desired command. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBuffer QBuffer}, {@link com.trolltech.qt.core.QFile QFile}, and {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QProcess extends com.trolltech.qt.core.QIODevice
{

    private Object __rcStandardOutputProcess = null;
    
/**
This enum describes the different types of errors that are reported by {@link com.trolltech.qt.core.QProcess QProcess}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#error() error()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum ProcessError implements com.trolltech.qt.QtEnumerator {
/**
 The process failed to start. Either the invoked program is missing, or you may have insufficient permissions to invoke the program.
*/

        FailedToStart(0),
/**
 The process crashed some time after starting successfully.
*/

        Crashed(1),
/**
 The last waitFor. .() function timed out. The state of {@link com.trolltech.qt.core.QProcess QProcess} is unchanged, and you can try calling waitFor...() again.
*/

        Timedout(2),
/**
 An error occurred when attempting to read from the process. For example, the process may not be running.
*/

        ReadError(3),
/**
 An error occurred when attempting to write to the process. For example, the process may not be running, or it may have closed its input channel.
*/

        WriteError(4),
/**
 An unknown error occurred. This is the default return value of {@link com.trolltech.qt.core.QProcess#error() error()}.
*/

        UnknownError(5);

        ProcessError(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QProcess$ProcessError constant with the specified <tt>int</tt>.</brief>
*/

        public static ProcessError resolve(int value) {
            return (ProcessError) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return FailedToStart;
            case 1: return Crashed;
            case 2: return Timedout;
            case 3: return ReadError;
            case 4: return WriteError;
            case 5: return UnknownError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the process channels used by the running process. Pass one of these values to {@link com.trolltech.qt.core.QProcess#setReadChannel(com.trolltech.qt.core.QProcess.ProcessChannel) setReadChannel()} to set the current read channel of {@link com.trolltech.qt.core.QProcess QProcess}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#setReadChannel(com.trolltech.qt.core.QProcess.ProcessChannel) setReadChannel()}. <br></DD></DT>
*/

/**
This enum describes the process channel modes of {@link com.trolltech.qt.core.QProcess QProcess}. Pass one of these values to {@link com.trolltech.qt.core.QProcess#setProcessChannelMode(com.trolltech.qt.core.QProcess.ProcessChannelMode) setProcessChannelMode()} to set the current read channel mode. <p><DT><b>See also:</b><br><DD>setReadChannelMode(). <br></DD></DT>
*/
@QtBlockedEnum
    public enum ProcessChannelMode implements com.trolltech.qt.QtEnumerator {
/**
 {@link com.trolltech.qt.core.QProcess QProcess} manages the output of the running process, keeping standard output and standard error data in separate internal buffers. You can select the {@link com.trolltech.qt.core.QProcess QProcess}'s current read channel by calling {@link com.trolltech.qt.core.QProcess#setReadChannel(com.trolltech.qt.core.QProcess.ProcessChannel) setReadChannel()}. This is the default channel mode of {@link com.trolltech.qt.core.QProcess QProcess}.
*/

        SeparateChannels(0),
/**
 {@link com.trolltech.qt.core.QProcess QProcess} merges the output of the running process into the standard output channel (<tt>stdout</tt>). The standard error channel (<tt>stderr</tt>) will not receive any data. The standard output and standard error data of the running process are interleaved.
*/

        MergedChannels(1),
/**
 {@link com.trolltech.qt.core.QProcess QProcess} forwards the output of the running process onto the main process. Anything the child process writes to its standard output and standard error will be written to the standard output and standard error of the main process.
*/

        ForwardedChannels(2);

        ProcessChannelMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QProcess$ProcessChannelMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ProcessChannelMode resolve(int value) {
            return (ProcessChannelMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SeparateChannels;
            case 1: return MergedChannels;
            case 2: return ForwardedChannels;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    @QtBlockedEnum
    public enum ProcessChannel implements com.trolltech.qt.QtEnumerator {
/**
 The standard output (stdout) of the running process.
*/

        StandardOutput(0),
/**
 The standard error (stderr) of the running process.
*/

        StandardError(1);

        ProcessChannel(int value) { this.value = value; }
        public int value() { return value; }

/**
<brief>Returns the QProcess$ProcessChannel constant with the specified <tt>int</tt>.</brief>
*/

        public static ProcessChannel resolve(int value) {
            return (ProcessChannel) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return StandardOutput;
            case 1: return StandardError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the different states of {@link com.trolltech.qt.core.QProcess QProcess}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#state() state()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum ProcessState implements com.trolltech.qt.QtEnumerator {
/**
 The process is not running.
*/

        NotRunning(0),
/**
 The process is starting, but the program has not yet been invoked.
*/

        Starting(1),
/**
 The process is running and is ready for reading and writing.
*/

        Running(2);

        ProcessState(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QProcess$ProcessState constant with the specified <tt>int</tt>.</brief>
*/

        public static ProcessState resolve(int value) {
            return (ProcessState) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NotRunning;
            case 1: return Starting;
            case 2: return Running;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes the different exit statuses of {@link com.trolltech.qt.core.QProcess QProcess}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#exitStatus() exitStatus()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum ExitStatus implements com.trolltech.qt.QtEnumerator {
/**
 The process exited normally.
*/

        NormalExit(0),
/**
 The process crashed.
*/

        CrashExit(1);

        ExitStatus(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QProcess$ExitStatus constant with the specified <tt>int</tt>.</brief>
*/

        public static ExitStatus resolve(int value) {
            return (ExitStatus) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NormalExit;
            case 1: return CrashExit;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QProcess$ProcessError(named: error)&gt;:<p> This signal is emitted when an error occurs with the process. The specified <tt>error</tt> describes the type of error that occurred.
*/

    public final Signal1<com.trolltech.qt.core.QProcess.ProcessError> error = new Signal1<com.trolltech.qt.core.QProcess.ProcessError>();

    private final void error(com.trolltech.qt.core.QProcess.ProcessError error)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_error_ProcessError(nativeId(), error.value());
    }
    native void __qt_error_ProcessError(long __this__nativeId, int error);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: exitCode)&gt;:<p> This is an overloaded member function, provided for convenience. <p>Use finished(int exitCode, {@link com.trolltech.qt.core.QProcess.ExitStatus QProcess::ExitStatus } status) instead.
*/

    public final Signal1<java.lang.Integer> finished = new Signal1<java.lang.Integer>();

    private final void finished(int exitCode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_finished_int(nativeId(), exitCode);
    }
    native void __qt_finished_int(long __this__nativeId, int exitCode);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: exitCode), &gt;:<p> This is an overloaded member function, provided for convenience. <p>Use finished(int exitCode, {@link com.trolltech.qt.core.QProcess.ExitStatus QProcess::ExitStatus } status) instead.
*/

    public final Signal2<java.lang.Integer, com.trolltech.qt.core.QProcess.ExitStatus> finishedWithStatusCode = new Signal2<java.lang.Integer, com.trolltech.qt.core.QProcess.ExitStatus>();

    private final void finishedWithStatusCode(int exitCode, com.trolltech.qt.core.QProcess.ExitStatus exitStatus)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_finishedWithStatusCode_int_ExitStatus(nativeId(), exitCode, exitStatus.value());
    }
    native void __qt_finishedWithStatusCode_int_ExitStatus(long __this__nativeId, int exitCode, int exitStatus);
/**
 This signal is emitted when the process has made new data available through its standard error channel (<tt>stderr</tt>). It is emitted regardless of the current {@link com.trolltech.qt.core.QProcess#readChannel() read channel}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#readAllStandardError() readAllStandardError()}, and {@link com.trolltech.qt.core.QProcess#readChannel() readChannel()}. <br></DD></DT>
*/

    public final Signal0 readyReadStandardError = new Signal0();

    private final void readyReadStandardError()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readyReadStandardError(nativeId());
    }
    native void __qt_readyReadStandardError(long __this__nativeId);
/**
 This signal is emitted when the process has made new data available through its standard output channel (<tt>stdout</tt>). It is emitted regardless of the current {@link com.trolltech.qt.core.QProcess#readChannel() read channel}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#readAllStandardOutput() readAllStandardOutput()}, and {@link com.trolltech.qt.core.QProcess#readChannel() readChannel()}. <br></DD></DT>
*/

    public final Signal0 readyReadStandardOutput = new Signal0();

    private final void readyReadStandardOutput()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readyReadStandardOutput(nativeId());
    }
    native void __qt_readyReadStandardOutput(long __this__nativeId);
/**
 This signal is emitted by QProcess when the process has started, and {@link com.trolltech.qt.core.QProcess#state() state()} returns {@link com.trolltech.qt.core.QProcess.ProcessState Running }.
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QProcess$ProcessState(named: newState)&gt;:<p> This signal is emitted whenever the state of QProcess changes. The <tt>newState</tt> argument is the state QProcess changed to.
*/

    public final Signal1<com.trolltech.qt.core.QProcess.ProcessState> stateChanged = new Signal1<com.trolltech.qt.core.QProcess.ProcessState>();

    private final void stateChanged(com.trolltech.qt.core.QProcess.ProcessState state)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stateChanged_ProcessState(nativeId(), state.value());
    }
    native void __qt_stateChanged_ProcessState(long __this__nativeId, int state);


/**
Constructs a QProcess object with the given <tt>parent</tt>.
*/

    public QProcess() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QProcess object with the given <tt>parent</tt>.
*/

    public QProcess(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QProcess_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QProcess_QObject(long parent);

/**
Closes the read channel <tt>channel</tt>. After calling this function, QProcess will no longer receive data on the channel. Any data that has already been received is still available for reading. <p>Call this function to save memory, if you are not interested in the output of the process. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#closeWriteChannel() closeWriteChannel()}, and {@link com.trolltech.qt.core.QProcess#setReadChannel(com.trolltech.qt.core.QProcess.ProcessChannel) setReadChannel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void closeReadChannel(com.trolltech.qt.core.QProcess.ProcessChannel channel)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeReadChannel_ProcessChannel(nativeId(), channel.value());
    }
    @QtBlockedSlot
    native void __qt_closeReadChannel_ProcessChannel(long __this__nativeId, int channel);

/**
Schedules the write channel of QProcess to be closed. The channel will close once all data has been written to the process. After calling this function, any attempts to write to the process will fail. <p>Closing the write channel is necessary for programs that read input data until the channel has been closed. For example, the program "more" is used to display text data in a console on both Unix and Windows. But it will not display the text data until QProcess's write channel has been closed. Example: <pre class="snippet">
        QProcess more = new QProcess();
        more.start("more");
        more.write(new QByteArray("Text to display"));
        more.closeWriteChannel();
        // QProcess will emit readyRead() once "more" starts printing
</pre> The write channel is implicitly opened when {@link com.trolltech.qt.core.QProcess#start(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) start()} is called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#closeReadChannel(com.trolltech.qt.core.QProcess.ProcessChannel) closeReadChannel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void closeWriteChannel()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeWriteChannel(nativeId());
    }
    @QtBlockedSlot
    native void __qt_closeWriteChannel(long __this__nativeId);

/**
Returns the environment that QProcess will use when starting a process, or an empty QStringList if no environment has been set using {@link com.trolltech.qt.core.QProcess#setEnvironment(java.util.List) setEnvironment()}. If no environment has been set, the environment of the calling process will be used. <p><b>Note:</b> The environment settings are ignored on Windows CE, as there is no concept of an environment. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#setEnvironment(java.util.List) setEnvironment()}, and {@link com.trolltech.qt.core.QProcess#systemEnvironment() systemEnvironment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> environment()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_environment(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_environment(long __this__nativeId);

/**
Returns the type of error that occurred last. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#state() state()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QProcess.ProcessError error()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QProcess.ProcessError.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
Returns the exit code of the last process that finished.
*/

    @QtBlockedSlot
    public final int exitCode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exitCode(nativeId());
    }
    @QtBlockedSlot
    native int __qt_exitCode(long __this__nativeId);

/**
Returns the exit status of the last process that finished. <p>On Windows, if the process was terminated with TerminateProcess() from another application this function will still return {@link com.trolltech.qt.core.QProcess.ExitStatus NormalExit } unless the exit code is less than 0.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QProcess.ExitStatus exitStatus()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QProcess.ExitStatus.resolve(__qt_exitStatus(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_exitStatus(long __this__nativeId);

/**
Kills the current process, causing it to exit immediately. <p>On Windows, {@link com.trolltech.qt.core.QProcess#kill() kill()} uses TerminateProcess, and on Unix and Mac OS X, the SIGKILL signal is sent to the process. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#terminate() terminate()}. <br></DD></DT>
*/

    public final void kill()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_kill(nativeId());
    }
    native void __qt_kill(long __this__nativeId);

/**
Returns the channel mode of the QProcess standard output and standard error channels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#setProcessChannelMode(com.trolltech.qt.core.QProcess.ProcessChannelMode) setProcessChannelMode()}, setReadChannelMode(), {@link com.trolltech.qt.core.QProcess.ProcessChannelMode ProcessChannelMode }, and {@link com.trolltech.qt.core.QProcess#setReadChannel(com.trolltech.qt.core.QProcess.ProcessChannel) setReadChannel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QProcess.ProcessChannelMode processChannelMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QProcess.ProcessChannelMode.resolve(__qt_processChannelMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_processChannelMode(long __this__nativeId);

/**
Regardless of the current read channel, this function returns all data available from the standard error of the process as a {@link com.trolltech.qt.core.QByteArray QByteArray}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#readyReadStandardError readyReadStandardError() }, {@link com.trolltech.qt.core.QProcess#readAllStandardOutput() readAllStandardOutput()}, {@link com.trolltech.qt.core.QProcess#readChannel() readChannel()}, and {@link com.trolltech.qt.core.QProcess#setReadChannel(com.trolltech.qt.core.QProcess.ProcessChannel) setReadChannel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray readAllStandardError()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readAllStandardError(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_readAllStandardError(long __this__nativeId);

/**
Regardless of the current read channel, this function returns all data available from the standard output of the process as a {@link com.trolltech.qt.core.QByteArray QByteArray}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#readyReadStandardOutput readyReadStandardOutput() }, {@link com.trolltech.qt.core.QProcess#readAllStandardError() readAllStandardError()}, {@link com.trolltech.qt.core.QProcess#readChannel() readChannel()}, and {@link com.trolltech.qt.core.QProcess#setReadChannel(com.trolltech.qt.core.QProcess.ProcessChannel) setReadChannel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray readAllStandardOutput()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readAllStandardOutput(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_readAllStandardOutput(long __this__nativeId);

/**
Returns the current read channel of the QProcess. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#setReadChannel(com.trolltech.qt.core.QProcess.ProcessChannel) setReadChannel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QProcess.ProcessChannel readChannel()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QProcess.ProcessChannel.resolve(__qt_readChannel(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_readChannel(long __this__nativeId);

/**
Sets the environment that QProcess will use when starting a process to the <tt>environment</tt> specified which consists of a list of key=value pairs. <p>For example, the following code adds the <tt>C:\\BIN</tt> directory to the list of executable paths (<tt>PATHS</tt>) on Windows: <pre class="snippet">
        QProcess process = new QProcess();
        List&lt;String&gt; env = QProcess.systemEnvironment();
        env.add("TMPDIR=C:\\MyApp\\temp"); // Add an environment variable
        for (String str : env)
            str.replaceAll("^PATH=(.*)", "PATH=\\1;C:\\Bin");
        process.setEnvironment(env);
        process.start("myapp");
        </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#environment() environment()}, and {@link com.trolltech.qt.core.QProcess#systemEnvironment() systemEnvironment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEnvironment(java.util.List<java.lang.String> environment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEnvironment_List(nativeId(), environment);
    }
    @QtBlockedSlot
    native void __qt_setEnvironment_List(long __this__nativeId, java.util.List<java.lang.String> environment);

/**
Sets the channel mode of the QProcess standard output and standard error channels to the <tt>mode</tt> specified. This mode will be used the next time {@link com.trolltech.qt.core.QProcess#start(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) start()} is called. For example: <pre class="snippet">
        QProcess builder = new QProcess();
        builder.setProcessChannelMode(QProcess.ProcessChannelMode.MergedChannels);

        List&lt;String&gt; arguments = new Vector&lt;String&gt;();
        arguments.add("-j2");

        builder.start("make", arguments);

        if (!builder.waitForFinished())
            System.err.println("Make failed:" + builder.errorString());
        else
            System.err.println("Make output:" + builder.readAll());
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#processChannelMode() processChannelMode()}, readChannelMode(), {@link com.trolltech.qt.core.QProcess.ProcessChannelMode ProcessChannelMode }, and {@link com.trolltech.qt.core.QProcess#setReadChannel(com.trolltech.qt.core.QProcess.ProcessChannel) setReadChannel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setProcessChannelMode(com.trolltech.qt.core.QProcess.ProcessChannelMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setProcessChannelMode_ProcessChannelMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setProcessChannelMode_ProcessChannelMode(long __this__nativeId, int mode);

/**
Sets the current state of the QProcess to the <tt>state</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#state() state()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setProcessState(com.trolltech.qt.core.QProcess.ProcessState state)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setProcessState_ProcessState(nativeId(), state.value());
    }
    @QtBlockedSlot
    native void __qt_setProcessState_ProcessState(long __this__nativeId, int state);

/**
Sets the current read channel of the QProcess to the given <tt>channel</tt>. The current input channel is used by the functions {@link com.trolltech.qt.core.QIODevice#read(long) read()}, {@link com.trolltech.qt.core.QIODevice#readAll() readAll()}, {@link com.trolltech.qt.core.QIODevice#readLine() readLine()}, and getChar(). It also determines which channel triggers QProcess to emit {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#readChannel() readChannel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setReadChannel(com.trolltech.qt.core.QProcess.ProcessChannel channel)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setReadChannel_ProcessChannel(nativeId(), channel.value());
    }
    @QtBlockedSlot
    native void __qt_setReadChannel_ProcessChannel(long __this__nativeId, int channel);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setStandardErrorFile(java.lang.String fileName, com.trolltech.qt.core.QIODevice.OpenModeFlag ... mode) {
        this.setStandardErrorFile(fileName, new com.trolltech.qt.core.QIODevice.OpenMode(mode));
    }

/**
Redirects the process' standard error to the file <tt>fileName</tt>. When the redirection is in place, the standard error read channel is closed: reading from it using {@link com.trolltech.qt.core.QIODevice#read(long) read()} will always fail, as will {@link com.trolltech.qt.core.QProcess#readAllStandardError() readAllStandardError()}. The file will be appended to if <tt>mode</tt> is Append, otherwise, it will be truncated. <p>See {@link com.trolltech.qt.core.QProcess#setStandardOutputFile(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setStandardOutputFile()} for more information on how the file is opened. <p>Note: if {@link com.trolltech.qt.core.QProcess#setProcessChannelMode(com.trolltech.qt.core.QProcess.ProcessChannelMode) setProcessChannelMode()} was called with an argument of {@link com.trolltech.qt.core.QProcess.ProcessChannelMode QProcess::MergedChannels }, this function has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#setStandardInputFile(java.lang.String) setStandardInputFile()}, {@link com.trolltech.qt.core.QProcess#setStandardOutputFile(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setStandardOutputFile()}, and {@link com.trolltech.qt.core.QProcess#setStandardOutputProcess(com.trolltech.qt.core.QProcess) setStandardOutputProcess()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStandardErrorFile(java.lang.String fileName) {
        setStandardErrorFile(fileName, new com.trolltech.qt.core.QIODevice.OpenMode(8));
    }
/**
Redirects the process' standard error to the file <tt>fileName</tt>. When the redirection is in place, the standard error read channel is closed: reading from it using {@link com.trolltech.qt.core.QIODevice#read(long) read()} will always fail, as will {@link com.trolltech.qt.core.QProcess#readAllStandardError() readAllStandardError()}. The file will be appended to if <tt>mode</tt> is Append, otherwise, it will be truncated. <p>See {@link com.trolltech.qt.core.QProcess#setStandardOutputFile(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setStandardOutputFile()} for more information on how the file is opened. <p>Note: if {@link com.trolltech.qt.core.QProcess#setProcessChannelMode(com.trolltech.qt.core.QProcess.ProcessChannelMode) setProcessChannelMode()} was called with an argument of {@link com.trolltech.qt.core.QProcess.ProcessChannelMode QProcess::MergedChannels }, this function has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#setStandardInputFile(java.lang.String) setStandardInputFile()}, {@link com.trolltech.qt.core.QProcess#setStandardOutputFile(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setStandardOutputFile()}, and {@link com.trolltech.qt.core.QProcess#setStandardOutputProcess(com.trolltech.qt.core.QProcess) setStandardOutputProcess()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStandardErrorFile(java.lang.String fileName, com.trolltech.qt.core.QIODevice.OpenMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStandardErrorFile_String_OpenMode(nativeId(), fileName, mode.value());
    }
    @QtBlockedSlot
    native void __qt_setStandardErrorFile_String_OpenMode(long __this__nativeId, java.lang.String fileName, int mode);

/**
Redirects the process' standard input to the file indicated by <tt>fileName</tt>. When an input redirection is in place, the QProcess object will be in read-only mode (calling {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()} will result in error). <p>If the file <tt>fileName</tt> does not exist at the moment {@link com.trolltech.qt.core.QProcess#start(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) start()} is called or is not readable, starting the process will fail. <p>Calling {@link com.trolltech.qt.core.QProcess#setStandardInputFile(java.lang.String) setStandardInputFile()} after the process has started has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#setStandardOutputFile(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setStandardOutputFile()}, {@link com.trolltech.qt.core.QProcess#setStandardErrorFile(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setStandardErrorFile()}, and {@link com.trolltech.qt.core.QProcess#setStandardOutputProcess(com.trolltech.qt.core.QProcess) setStandardOutputProcess()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStandardInputFile(java.lang.String fileName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStandardInputFile_String(nativeId(), fileName);
    }
    @QtBlockedSlot
    native void __qt_setStandardInputFile_String(long __this__nativeId, java.lang.String fileName);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setStandardOutputFile(java.lang.String fileName, com.trolltech.qt.core.QIODevice.OpenModeFlag ... mode) {
        this.setStandardOutputFile(fileName, new com.trolltech.qt.core.QIODevice.OpenMode(mode));
    }

/**
Redirects the process' standard output to the file <tt>fileName</tt>. When the redirection is in place, the standard output read channel is closed: reading from it using {@link com.trolltech.qt.core.QIODevice#read(long) read()} will always fail, as will {@link com.trolltech.qt.core.QProcess#readAllStandardOutput() readAllStandardOutput()}. <p>If the file <tt>fileName</tt> doesn't exist at the moment {@link com.trolltech.qt.core.QProcess#start(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) start()} is called, it will be created. If it cannot be created, the starting will fail. <p>If the file exists and <tt>mode</tt> is {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::Truncate }, the file will be truncated. Otherwise (if <tt>mode</tt> is {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::Append }), the file will be appended to. <p>Calling {@link com.trolltech.qt.core.QProcess#setStandardOutputFile(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setStandardOutputFile()} after the process has started has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#setStandardInputFile(java.lang.String) setStandardInputFile()}, {@link com.trolltech.qt.core.QProcess#setStandardErrorFile(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setStandardErrorFile()}, and {@link com.trolltech.qt.core.QProcess#setStandardOutputProcess(com.trolltech.qt.core.QProcess) setStandardOutputProcess()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStandardOutputFile(java.lang.String fileName) {
        setStandardOutputFile(fileName, new com.trolltech.qt.core.QIODevice.OpenMode(8));
    }
/**
Redirects the process' standard output to the file <tt>fileName</tt>. When the redirection is in place, the standard output read channel is closed: reading from it using {@link com.trolltech.qt.core.QIODevice#read(long) read()} will always fail, as will {@link com.trolltech.qt.core.QProcess#readAllStandardOutput() readAllStandardOutput()}. <p>If the file <tt>fileName</tt> doesn't exist at the moment {@link com.trolltech.qt.core.QProcess#start(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) start()} is called, it will be created. If it cannot be created, the starting will fail. <p>If the file exists and <tt>mode</tt> is {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::Truncate }, the file will be truncated. Otherwise (if <tt>mode</tt> is {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::Append }), the file will be appended to. <p>Calling {@link com.trolltech.qt.core.QProcess#setStandardOutputFile(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setStandardOutputFile()} after the process has started has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#setStandardInputFile(java.lang.String) setStandardInputFile()}, {@link com.trolltech.qt.core.QProcess#setStandardErrorFile(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setStandardErrorFile()}, and {@link com.trolltech.qt.core.QProcess#setStandardOutputProcess(com.trolltech.qt.core.QProcess) setStandardOutputProcess()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStandardOutputFile(java.lang.String fileName, com.trolltech.qt.core.QIODevice.OpenMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStandardOutputFile_String_OpenMode(nativeId(), fileName, mode.value());
    }
    @QtBlockedSlot
    native void __qt_setStandardOutputFile_String_OpenMode(long __this__nativeId, java.lang.String fileName, int mode);

/**
Pipes the standard output stream of this process to the <tt>destination</tt> process' standard input. <p>The following shell command: <pre class="snippet">
        command1 | command2
</pre> Can be accomplished with QProcesses with the following code: <pre class="snippet">
        QProcess process1 = new QProcess();
        QProcess process2 = new QProcess();

        process1.setStandardOutputProcess(process2);

        process1.start("command1");
        process2.start("command2");
</pre>
*/

    @QtBlockedSlot
    public final void setStandardOutputProcess(com.trolltech.qt.core.QProcess destination)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcStandardOutputProcess = destination;
        }
        __qt_setStandardOutputProcess_QProcess(nativeId(), destination == null ? 0 : destination.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setStandardOutputProcess_QProcess(long __this__nativeId, long destination);

/**
Sets the working directory to <tt>dir</tt>. QProcess will start the process in this directory. The default behavior is to start the process in the working directory of the calling process. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#workingDirectory() workingDirectory()}, and {@link com.trolltech.qt.core.QProcess#start(java.lang.String, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) start()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWorkingDirectory(java.lang.String dir)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWorkingDirectory_String(nativeId(), dir);
    }
    @QtBlockedSlot
    native void __qt_setWorkingDirectory_String(long __this__nativeId, java.lang.String dir);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void start(java.lang.String program, com.trolltech.qt.core.QIODevice.OpenModeFlag ... mode) {
        this.start(program, new com.trolltech.qt.core.QIODevice.OpenMode(mode));
    }

/**
This is an overloaded member function, provided for convenience. <p>Starts the program <tt>program</tt> in a new process. <tt>program</tt> is a single string of text containing both the program name and its arguments. The arguments are separated by one or more spaces. For example: <pre class="snippet">
        QProcess process = new QProcess();
        process.start("del /s *.txt");
        // same as process.start("del", List&lt;String&gt;() &lt;&lt; "/s" &lt;&lt; "*.txt");
        // ...
</pre> The <tt>program</tt> string can also contain quotes, to ensure that arguments containing spaces are correctly supplied to the new process. For example: <pre class="snippet">
        QProcess process = new QProcess();
        process.start("dir \"My Documents\"");
</pre> Note that, on Windows, quotes need to be both escaped and quoted. For example, the above code would be specified in the following way to ensure that <tt>"My Documents"</tt> is used as the argument to the <tt>dir</tt> executable: <pre class="snippet">
        QProcess process = new QProcess();
        process.start("dir \"\"\"My Documents\"\"\"");
</pre> The OpenMode is set to <tt>mode</tt>.
*/

    @QtBlockedSlot
    public final void start(java.lang.String program) {
        start(program, new com.trolltech.qt.core.QIODevice.OpenMode(3));
    }
/**
This is an overloaded member function, provided for convenience. <p>Starts the program <tt>program</tt> in a new process. <tt>program</tt> is a single string of text containing both the program name and its arguments. The arguments are separated by one or more spaces. For example: <pre class="snippet">
        QProcess process = new QProcess();
        process.start("del /s *.txt");
        // same as process.start("del", List&lt;String&gt;() &lt;&lt; "/s" &lt;&lt; "*.txt");
        // ...
</pre> The <tt>program</tt> string can also contain quotes, to ensure that arguments containing spaces are correctly supplied to the new process. For example: <pre class="snippet">
        QProcess process = new QProcess();
        process.start("dir \"My Documents\"");
</pre> Note that, on Windows, quotes need to be both escaped and quoted. For example, the above code would be specified in the following way to ensure that <tt>"My Documents"</tt> is used as the argument to the <tt>dir</tt> executable: <pre class="snippet">
        QProcess process = new QProcess();
        process.start("dir \"\"\"My Documents\"\"\"");
</pre> The OpenMode is set to <tt>mode</tt>.
*/

    @QtBlockedSlot
    public final void start(java.lang.String program, com.trolltech.qt.core.QIODevice.OpenMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_start_String_OpenMode(nativeId(), program, mode.value());
    }
    @QtBlockedSlot
    native void __qt_start_String_OpenMode(long __this__nativeId, java.lang.String program, int mode);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void start(java.lang.String program, java.util.List<java.lang.String> arguments, com.trolltech.qt.core.QIODevice.OpenModeFlag ... mode) {
        this.start(program, arguments, new com.trolltech.qt.core.QIODevice.OpenMode(mode));
    }

/**
Starts the program <tt>program</tt> in a new process, passing the
command line arguments in <tt>arguments</tt>. QProcess will
immediately enter the Starting state. If the process starts
successfully, QProcess will emit started(); otherwise, error() will be
emitted.
<p>
On Windows, arguments that contain spaces are wrapped in quotes.
<p>
Note: processes are started asynchronously, which means the started()
and error() signals may be delayed. Call waitForStarted() to make sure
the process has started (or has failed to start) and those signals
have been emitted.
*/

    @QtBlockedSlot
    public final void start(java.lang.String program, java.util.List<java.lang.String> arguments) {
        start(program, arguments, new com.trolltech.qt.core.QIODevice.OpenMode(3));
    }
/**
Starts the program <tt>program</tt> in a new process, passing the command line arguments in <tt>arguments</tt>. The OpenMode is set to <tt>mode</tt>. QProcess will immediately enter the Starting state. If the process starts successfully, QProcess will emit {@link com.trolltech.qt.core.QProcess#started started() }; otherwise, {@link com.trolltech.qt.core.QProcess#error() error()} will be emitted. <p>Note that arguments that contain spaces are not passed to the process as separate arguments. <p><b>Windows:</b> Arguments that contain spaces are wrapped in quotes. <p><b>Note:</b> Processes are started asynchronously, which means the {@link com.trolltech.qt.core.QProcess#started started() } and {@link com.trolltech.qt.core.QProcess#error() error()} signals may be delayed. Call {@link com.trolltech.qt.core.QProcess#waitForStarted() waitForStarted()} to make sure the process has started (or has failed to start) and those signals have been emitted. <p><DT><b>See also:</b><br><DD>pid(), {@link com.trolltech.qt.core.QProcess#started started() }, and {@link com.trolltech.qt.core.QProcess#waitForStarted() waitForStarted()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void start(java.lang.String program, java.util.List<java.lang.String> arguments, com.trolltech.qt.core.QIODevice.OpenMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_start_String_List_OpenMode(nativeId(), program, arguments, mode.value());
    }
    @QtBlockedSlot
    native void __qt_start_String_List_OpenMode(long __this__nativeId, java.lang.String program, java.util.List<java.lang.String> arguments, int mode);

/**
Returns the current state of the process. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#stateChanged stateChanged() }, and {@link com.trolltech.qt.core.QProcess#error() error()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QProcess.ProcessState state()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QProcess.ProcessState.resolve(__qt_state(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_state(long __this__nativeId);

/**
Attempts to terminate the process. <p>The process may not exit as a result of calling this function (it is given the chance to prompt the user for any unsaved files, etc). <p>On Windows, {@link com.trolltech.qt.core.QProcess#terminate() terminate()} posts a WM_CLOSE message to all toplevel windows of the process and then to the main thread of the process itself. On Unix and Mac OS X the SIGTERM signal is sent. <p>Console applications on Windows that do not run an event loop, or whose event loop does not handle the WM_CLOSE message, can only be terminated by calling {@link com.trolltech.qt.core.QProcess#kill() kill()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#kill() kill()}. <br></DD></DT>
*/

    public final void terminate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_terminate(nativeId());
    }
    native void __qt_terminate(long __this__nativeId);


/**
Blocks until the process has finished and the {@link com.trolltech.qt.core.QProcess#finished finished() } signal has been emitted, or until <tt>msecs</tt> milliseconds have passed. <p>Returns true if the process finished; otherwise returns false (if the operation timed out or if an error occurred). <p>This function can operate without an event loop. It is useful when writing non-GUI applications and when performing I/O operations in a non-GUI thread. <p><b>Warning:</b> Calling this function from the main (GUI) thread might cause your user interface to freeze. <p>If msecs is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#finished finished() }, {@link com.trolltech.qt.core.QProcess#waitForStarted() waitForStarted()}, {@link com.trolltech.qt.core.QIODevice#waitForReadyRead(int) waitForReadyRead()}, and {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean waitForFinished() {
        return waitForFinished((int)30000);
    }
/**
Blocks until the process has finished and the {@link com.trolltech.qt.core.QProcess#finished finished() } signal has been emitted, or until <tt>msecs</tt> milliseconds have passed. <p>Returns true if the process finished; otherwise returns false (if the operation timed out or if an error occurred). <p>This function can operate without an event loop. It is useful when writing non-GUI applications and when performing I/O operations in a non-GUI thread. <p><b>Warning:</b> Calling this function from the main (GUI) thread might cause your user interface to freeze. <p>If msecs is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#finished finished() }, {@link com.trolltech.qt.core.QProcess#waitForStarted() waitForStarted()}, {@link com.trolltech.qt.core.QIODevice#waitForReadyRead(int) waitForReadyRead()}, and {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean waitForFinished(int msecs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_waitForFinished_int(nativeId(), msecs);
    }
    @QtBlockedSlot
    native boolean __qt_waitForFinished_int(long __this__nativeId, int msecs);


/**
Blocks until the process has started and the {@link com.trolltech.qt.core.QProcess#started started() } signal has been emitted, or until <tt>msecs</tt> milliseconds have passed. <p>Returns true if the process was started successfully; otherwise returns false (if the operation timed out or if an error occurred). <p>This function can operate without an event loop. It is useful when writing non-GUI applications and when performing I/O operations in a non-GUI thread. <p><b>Warning:</b> Calling this function from the main (GUI) thread might cause your user interface to freeze. <p>If msecs is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#started started() }, {@link com.trolltech.qt.core.QIODevice#waitForReadyRead(int) waitForReadyRead()}, {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()}, and {@link com.trolltech.qt.core.QProcess#waitForFinished() waitForFinished()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean waitForStarted() {
        return waitForStarted((int)30000);
    }
/**
Blocks until the process has started and the {@link com.trolltech.qt.core.QProcess#started started() } signal has been emitted, or until <tt>msecs</tt> milliseconds have passed. <p>Returns true if the process was started successfully; otherwise returns false (if the operation timed out or if an error occurred). <p>This function can operate without an event loop. It is useful when writing non-GUI applications and when performing I/O operations in a non-GUI thread. <p><b>Warning:</b> Calling this function from the main (GUI) thread might cause your user interface to freeze. <p>If msecs is -1, this function will not time out. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#started started() }, {@link com.trolltech.qt.core.QIODevice#waitForReadyRead(int) waitForReadyRead()}, {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()}, and {@link com.trolltech.qt.core.QProcess#waitForFinished() waitForFinished()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean waitForStarted(int msecs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_waitForStarted_int(nativeId(), msecs);
    }
    @QtBlockedSlot
    native boolean __qt_waitForStarted_int(long __this__nativeId, int msecs);

/**
If QProcess has been assigned a working directory, this function returns the working directory that the QProcess will enter before the program has started. Otherwise, (i.e., no directory has been assigned,) an empty string is returned, and QProcess will use the application's current working directory instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#setWorkingDirectory(java.lang.String) setWorkingDirectory()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String workingDirectory()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_workingDirectory(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_workingDirectory(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean atEnd()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_atEnd(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_atEnd(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long bytesAvailable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bytesAvailable(nativeId());
    }
    @QtBlockedSlot
    native long __qt_bytesAvailable(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long bytesToWrite()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bytesToWrite(nativeId());
    }
    @QtBlockedSlot
    native long __qt_bytesToWrite(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean canReadLine()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canReadLine(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_canReadLine(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void close()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_close(nativeId());
    }
    @QtBlockedSlot
    native void __qt_close(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean isSequential()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSequential(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSequential(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected int readData(byte[] data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readData_nativepointer_long(nativeId(), data);
    }
    @QtBlockedSlot
    native int __qt_readData_nativepointer_long(long __this__nativeId, byte[] data);

/**
This function is called in the child process context just before the program is executed on Unix or Mac OS X (i. ., after fork(), but before execve()). Reimplement this function to do last minute initialization of the child process. Example: <pre class="snippet">
        This code is not relevant for Qt Jambi.
        class SandboxProcess extends QProcess
        {

            protected void setupChildProcess()
            {
            // Drop all privileges in the child process, and enter
            // a chroot jail.
                if (QSysInfo.operatingSystem() == QSysInfo.OS_LINUX) {
                    setgroups(0, 0);
                    chroot("/etc/safe");
                    chdir("/");
                    setgid(safeGid);
                    setuid(safeUid);
                }
            }
        }

</pre> You cannot exit the process (by calling exit(), for instance) from this function. If you need to stop the program before it starts execution, your workaround is to emit {@link com.trolltech.qt.core.QProcess#finished finished() } and then call exit(). <p><b>Warning:</b> This function is called by QProcess on Unix and Mac OS X only. On Windows, it is not called.
*/

    @QtBlockedSlot
    protected void setupChildProcess()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setupChildProcess(nativeId());
    }
    @QtBlockedSlot
    native void __qt_setupChildProcess(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean waitForBytesWritten(int msecs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_waitForBytesWritten_int(nativeId(), msecs);
    }
    @QtBlockedSlot
    native boolean __qt_waitForBytesWritten_int(long __this__nativeId, int msecs);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean waitForReadyRead(int msecs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_waitForReadyRead_int(nativeId(), msecs);
    }
    @QtBlockedSlot
    native boolean __qt_waitForReadyRead_int(long __this__nativeId, int msecs);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected int writeData(byte[] data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_writeData_nativepointer_long(nativeId(), data);
    }
    @QtBlockedSlot
    native int __qt_writeData_nativepointer_long(long __this__nativeId, byte[] data);

/**
This is an overloaded member function, provided for convenience. <p>Starts the program <tt>program</tt> in a new process. <tt>program</tt> is a single string of text containing both the program name and its arguments. The arguments are separated by one or more spaces.
*/

    public native static int execute(java.lang.String program);

/**
Starts the program <tt>program</tt> with the arguments <tt>arguments</tt> in a new process, waits for it to finish, and then returns the exit code of the process. Any data the new process writes to the console is forwarded to the calling process. <p>The environment and working directory are inherited by the calling process. <p>On Windows, arguments that contain spaces are wrapped in quotes.
*/

    public native static int execute(java.lang.String program, java.util.List<java.lang.String> arguments);

/**
This is an overloaded member function, provided for convenience. <p>Starts the program <tt>program</tt> in a new process. <tt>program</tt> is a single string of text containing both the program name and its arguments. The arguments are separated by one or more spaces. <p>The <tt>program</tt> string can also contain quotes, to ensure that arguments containing spaces are correctly supplied to the new process.
*/

    public native static boolean startDetached(java.lang.String program);

/**
Starts the program <tt>program</tt> with the given <tt>arguments</tt> in a new process, and detaches from it. Returns true on success; otherwise returns false. If the calling process exits, the detached process will continue to live. <p>Note that arguments that contain spaces are not passed to the process as separate arguments. <p><b>Unix:</b> The started process will run in its own session and act like a daemon. <p><b>Windows:</b> Arguments that contain spaces are wrapped in quotes. The started process will run as a regular standalone process.
*/

    public native static boolean startDetached(java.lang.String program, java.util.List<java.lang.String> arguments);

    private native static boolean startDetached(java.lang.String program, java.util.List<java.lang.String> arguments, java.lang.String workingDirectory, com.trolltech.qt.QNativePointer pid);

/**
Returns the environment of the calling process as a list of key=value pairs. Example: <pre class="snippet">
        List&lt;String&gt; environment = QProcess.systemEnvironment();
        // environment = {"PATH=/usr/bin:/usr/local/bin",
        //               "USER=greg", "HOME=/home/greg"}
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QProcess#environment() environment()}, and {@link com.trolltech.qt.core.QProcess#setEnvironment(java.util.List) setEnvironment()}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> systemEnvironment();

/**
@exclude
*/

    public static native QProcess fromNativePointer(QNativePointer nativePointer);

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

    protected QProcess(QPrivateConstructor p) { super(p); } 

    public static class DetachedProcessInfo {
        public DetachedProcessInfo(boolean success, long pid) {
            this.success = success;
            this.pid = pid;
        }

        public boolean success;
        public long pid;
    }

    public static DetachedProcessInfo startDetached(String program, java.util.List<String> arguments, String workingDirectory) {
        QNativePointer pid = new QNativePointer(QNativePointer.Type.Long);
        boolean success = startDetached(program, arguments, workingDirectory, pid);
        return new DetachedProcessInfo(success, pid.longValue());
    }

}
