package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QFtp class provides an implementation of the client side of FTP protocol. This class provides a direct interface to FTP that allows you to have more control over the requests. However, for new applications, it is recommended to use {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager} and {@link com.trolltech.qt.network.QNetworkReply QNetworkReply}, as those classes possess a simpler, yet more powerful API. <p>The class works asynchronously, so there are no blocking functions. If an operation cannot be executed immediately, the function will still return straight away and the operation will be scheduled for later execution. The results of scheduled operations are reported via signals. This approach depends on the event loop being in operation. <p>The operations that can be scheduled (they are called "commands" in the rest of the documentation) are the following: {@link com.trolltech.qt.network.QFtp#connectToHost(java.lang.String) connectToHost()}, {@link com.trolltech.qt.network.QFtp#login(java.lang.String) login()}, {@link com.trolltech.qt.network.QFtp#close() close()}, {@link com.trolltech.qt.network.QFtp#list() list()}, {@link com.trolltech.qt.network.QFtp#cd(java.lang.String) cd()}, {@link com.trolltech.qt.network.QFtp#get(java.lang.String, com.trolltech.qt.core.QIODevice) get()}, {@link com.trolltech.qt.network.QFtp#put(com.trolltech.qt.core.QIODevice, java.lang.String) put()}, {@link com.trolltech.qt.network.QFtp#remove(java.lang.String) remove()}, {@link com.trolltech.qt.network.QFtp#mkdir(java.lang.String) mkdir()}, {@link com.trolltech.qt.network.QFtp#rmdir(java.lang.String) rmdir()}, {@link com.trolltech.qt.network.QFtp#rename(java.lang.String, java.lang.String) rename()} and {@link com.trolltech.qt.network.QFtp#rawCommand(java.lang.String) rawCommand()}. <p>All of these commands return a unique identifier that allows you to keep track of the command that is currently being executed. When the execution of a command starts, the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal with the command's identifier is emitted. When the command is finished, the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted with the command's identifier and a bool that indicates whether the command finished with an error. <p>In some cases, you might want to execute a sequence of commands, e.g. if you want to connect and login to a FTP server. This is simply achieved: <pre class="snippet">
    QFtp ftp = new QFtp(parent);
    ftp.connectToHost("ftp.trolltech.com");
    ftp.login();
</pre> In this case two FTP commands have been scheduled. When the last scheduled command has finished, a {@link com.trolltech.qt.network.QFtp#done done() } signal is emitted with a bool argument that tells you whether the sequence finished with an error. <p>If an error occurs during the execution of one of the commands in a sequence of commands, all the pending commands (i.e. scheduled, but not yet executed commands) are cleared and no signals are emitted for them. <p>Some commands, e.g. {@link com.trolltech.qt.network.QFtp#list() list()}, emit additional signals to report their results. <p>Example: If you want to download the INSTALL file from Trolltech's FTP server, you would write this: <pre class="snippet">
    ftp.connectToHost("ftp.trolltech.com");  // id == 1
    ftp.login();                             // id == 2
    ftp.cd("qt");                            // id == 3
    ftp.get("INSTALL");                      // id == 4
    ftp.close();                             // id == 5
</pre> For this example the following sequence of signals is emitted (with small variations, depending on network traffic, etc.): <pre class="snippet">
    start(1)
    stateChanged(HostLookup)
    stateChanged(Connecting)
    stateChanged(Connected)
    finished(1, false)

    start(2)
    stateChanged(LoggedIn)
    finished(2, false)

    start(3)
    finished(3, false)

    start(4)
    dataTransferProgress(0, 3798)
    dataTransferProgress(2896, 3798)
    readyRead()
    dataTransferProgress(3798, 3798)
    readyRead()
    finished(4, false)

    start(5)
    stateChanged(Closing)
    stateChanged(Unconnected)
    finished(5, false)

    done(false)
</pre> The {@link com.trolltech.qt.network.QFtp#dataTransferProgress dataTransferProgress() } signal in the above example is useful if you want to show a {@link com.trolltech.qt.gui.QProgressBar progress bar} to inform the user about the progress of the download. The {@link com.trolltech.qt.network.QFtp#readyRead readyRead() } signal tells you that there is data ready to be read. The amount of data can be queried then with the {@link com.trolltech.qt.network.QFtp#bytesAvailable() bytesAvailable()} function and it can be read with the {@link com.trolltech.qt.network.QFtp#read(byte[]) read()} or {@link com.trolltech.qt.network.QFtp#readAll() readAll()} function. <p>If the login fails for the above example, the signals would look like this: <pre class="snippet">
    start(1)
    stateChanged(HostLookup)
    stateChanged(Connecting)
    stateChanged(Connected)
    finished(1, false)

    start(2)
    finished(2, true)

    done(true)
</pre> You can then get details about the error with the {@link com.trolltech.qt.network.QFtp#error() error()} and {@link com.trolltech.qt.network.QFtp#errorString() errorString()} functions. <p>For file transfer, QFtp can use both active or passive mode, and it uses passive file transfer mode by default; see the documentation for {@link com.trolltech.qt.network.QFtp#setTransferMode(com.trolltech.qt.network.QFtp.TransferMode) setTransferMode()} for more details about this. <p>Call {@link com.trolltech.qt.network.QFtp#setProxy(java.lang.String, char) setProxy()} to make QFtp connect via an FTP proxy server. <p>The functions {@link com.trolltech.qt.network.QFtp#currentId() currentId()} and {@link com.trolltech.qt.network.QFtp#currentCommand() currentCommand()} provide more information about the currently executing command. <p>The functions {@link com.trolltech.qt.network.QFtp#hasPendingCommands() hasPendingCommands()} and {@link com.trolltech.qt.network.QFtp#clearPendingCommands() clearPendingCommands()} allow you to query and clear the list of pending commands. <p>If you are an experienced network programmer and want to have complete control you can use {@link com.trolltech.qt.network.QFtp#rawCommand(java.lang.String) rawCommand()} to execute arbitrary FTP commands. <p><b>Warning:</b> The current version of QFtp doesn't fully support non-Unix FTP servers. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHttp QHttp}, {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}, {@link com.trolltech.qt.network.QNetworkRequest QNetworkRequest}, {@link com.trolltech.qt.network.QNetworkReply QNetworkReply}, and {@link <a href="../network-ftp.html">FTP Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFtp extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
    
/**
This enum identifies the data transfer type used with get and put commands.
*/
@QtBlockedEnum
    public enum TransferType implements com.trolltech.qt.QtEnumerator {
/**
 The data will be transferred in Binary mode.
*/

        Binary(0),
/**
 The data will be transferred in Ascii mode and new line characters will be converted to the local format.
*/

        Ascii(1);

        TransferType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFtp$TransferType constant with the specified <tt>int</tt>.</brief>
*/

        public static TransferType resolve(int value) {
            return (TransferType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Binary;
            case 1: return Ascii;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum identifies the error that occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#error() error()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum Error implements com.trolltech.qt.QtEnumerator {
/**
 No error occurred.
*/

        NoError(0),
/**
 An error other than those specified above occurred.
*/

        UnknownError(1),
/**
 The host name lookup failed.
*/

        HostNotFound(2),
/**
 The server refused the connection.
*/

        ConnectionRefused(3),
/**
 Tried to send a command, but there is no connection to a server.
*/

        NotConnected(4);

        Error(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFtp$Error constant with the specified <tt>int</tt>.</brief>
*/

        public static Error resolve(int value) {
            return (Error) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoError;
            case 1: return UnknownError;
            case 2: return HostNotFound;
            case 3: return ConnectionRefused;
            case 4: return NotConnected;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum is used as the return value for the {@link com.trolltech.qt.network.QFtp#currentCommand() currentCommand()} function. This allows you to perform specific actions for particular commands, e.g. in a FTP client, you might want to clear the directory view when a {@link com.trolltech.qt.network.QFtp#list() list()} command is started; in this case you can simply check in the slot connected to the start() signal if the {@link com.trolltech.qt.network.QFtp#currentCommand() currentCommand()} is <tt>List</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#currentCommand() currentCommand()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum Command implements com.trolltech.qt.QtEnumerator {
/**
 No command is being executed.
*/

        None(0),
/**
 set the {@link com.trolltech.qt.network.QFtp.TransferMode transfer } mode.
*/

        SetTransferMode(1),
/**
 switch proxying on or off.
*/

        SetProxy(2),
/**
 {@link com.trolltech.qt.network.QFtp#connectToHost(java.lang.String) connectToHost()} is being executed.
*/

        ConnectToHost(3),
/**
 {@link com.trolltech.qt.network.QFtp#login(java.lang.String) login()} is being executed.
*/

        Login(4),
/**
 {@link com.trolltech.qt.network.QFtp#close() close()} is being executed.
*/

        Close(5),
/**
 {@link com.trolltech.qt.network.QFtp#list() list()} is being executed.
*/

        List(6),
/**
 {@link com.trolltech.qt.network.QFtp#cd(java.lang.String) cd()} is being executed.
*/

        Cd(7),
/**
 {@link com.trolltech.qt.network.QFtp#get(java.lang.String, com.trolltech.qt.core.QIODevice) get()} is being executed.
*/

        Get(8),
/**
 {@link com.trolltech.qt.network.QFtp#put(com.trolltech.qt.core.QIODevice, java.lang.String) put()} is being executed.
*/

        Put(9),
/**
 {@link com.trolltech.qt.network.QFtp#remove(java.lang.String) remove()} is being executed.
*/

        Remove(10),
/**
 {@link com.trolltech.qt.network.QFtp#mkdir(java.lang.String) mkdir()} is being executed.
*/

        Mkdir(11),
/**
 {@link com.trolltech.qt.network.QFtp#rmdir(java.lang.String) rmdir()} is being executed.
*/

        Rmdir(12),
/**
 {@link com.trolltech.qt.network.QFtp#rename(java.lang.String, java.lang.String) rename()} is being executed.
*/

        Rename(13),
/**
 {@link com.trolltech.qt.network.QFtp#rawCommand(java.lang.String) rawCommand()} is being executed.
*/

        RawCommand(14);

        Command(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFtp$Command constant with the specified <tt>int</tt>.</brief>
*/

        public static Command resolve(int value) {
            return (Command) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return None;
            case 1: return SetTransferMode;
            case 2: return SetProxy;
            case 3: return ConnectToHost;
            case 4: return Login;
            case 5: return Close;
            case 6: return List;
            case 7: return Cd;
            case 8: return Get;
            case 9: return Put;
            case 10: return Remove;
            case 11: return Mkdir;
            case 12: return Rmdir;
            case 13: return Rename;
            case 14: return RawCommand;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
FTP works with two socket connections; one for commands and another for transmitting data. While the command connection is always initiated by the client, the second connection can be initiated by either the client or the server. <p>This enum defines whether the client (Passive mode) or the server (Active mode) should set up the data connection.
*/
@QtBlockedEnum
    public enum TransferMode implements com.trolltech.qt.QtEnumerator {
/**
 The server connects to the client to transmit its data.
*/

        Active(0),
/**
 The client connects to the server to transmit its data.
*/

        Passive(1);

        TransferMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFtp$TransferMode constant with the specified <tt>int</tt>.</brief>
*/

        public static TransferMode resolve(int value) {
            return (TransferMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Active;
            case 1: return Passive;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum defines the connection state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#stateChanged stateChanged() }, and {@link com.trolltech.qt.network.QFtp#state() state()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum State implements com.trolltech.qt.QtEnumerator {
/**
 There is no connection to the host.
*/

        Unconnected(0),
/**
 A host name lookup is in progress.
*/

        HostLookup(1),
/**
 An attempt to connect to the host is in progress.
*/

        Connecting(2),
/**
 Connection to the host has been achieved.
*/

        Connected(3),
/**
 Connection and user login have been achieved.
*/

        LoggedIn(4),
/**
 The connection is closing down, but it is not yet closed. (The state will be <tt>Unconnected</tt> when the connection is closed.)
*/

        Closing(5);

        State(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFtp$State constant with the specified <tt>int</tt>.</brief>
*/

        public static State resolve(int value) {
            return (State) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Unconnected;
            case 1: return HostLookup;
            case 2: return Connecting;
            case 3: return Connected;
            case 4: return LoggedIn;
            case 5: return Closing;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: id), java.lang.Boolean(named: error)&gt;:<p> This signal is emitted when processing the command identified by <tt>id</tt> has finished. <tt>error</tt> is true if an error occurred during the processing; otherwise <tt>error</tt> is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, {@link com.trolltech.qt.network.QFtp#done done() }, {@link com.trolltech.qt.network.QFtp#error() error()}, and {@link com.trolltech.qt.network.QFtp#errorString() errorString()}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, java.lang.Boolean> commandFinished = new Signal2<java.lang.Integer, java.lang.Boolean>();

    private final void commandFinished(int arg__1, boolean arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_commandFinished_int_boolean(nativeId(), arg__1, arg__2);
    }
    native void __qt_commandFinished_int_boolean(long __this__nativeId, int arg__1, boolean arg__2);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: id)&gt;:<p> This signal is emitted when processing the command identified by <tt>id</tt> starts. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }, and {@link com.trolltech.qt.network.QFtp#done done() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> commandStarted = new Signal1<java.lang.Integer>();

    private final void commandStarted(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_commandStarted_int(nativeId(), arg__1);
    }
    native void __qt_commandStarted_int(long __this__nativeId, int arg__1);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Long(named: done), java.lang.Long(named: total)&gt;:<p> This signal is emitted in response to a {@link com.trolltech.qt.network.QFtp#get(java.lang.String, com.trolltech.qt.core.QIODevice) get()} or {@link com.trolltech.qt.network.QFtp#put(com.trolltech.qt.core.QIODevice, java.lang.String) put()} request to indicate the current progress of the download or upload. <p><tt>done</tt> is the amount of data that has already been transferred and <tt>total</tt> is the total amount of data to be read or written. It is possible that the QFtp class is not able to determine the total amount of data that should be transferred, in which case <tt>total</tt> is 0. (If you connect this signal to a {@link com.trolltech.qt.gui.QProgressBar QProgressBar}, the progress bar shows a busy indicator if the total is 0). <p><b>Warning:</b><tt>done</tt> and <tt>total</tt> are not necessarily the size in bytes, since for large files these values might need to be "scaled" to avoid overflow. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#get(java.lang.String, com.trolltech.qt.core.QIODevice) get()}, {@link com.trolltech.qt.network.QFtp#put(com.trolltech.qt.core.QIODevice, java.lang.String) put()}, and {@link com.trolltech.qt.gui.QProgressBar QProgressBar}. <br></DD></DT>
*/

    public final Signal2<java.lang.Long, java.lang.Long> dataTransferProgress = new Signal2<java.lang.Long, java.lang.Long>();

    private final void dataTransferProgress(long arg__1, long arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dataTransferProgress_long_long(nativeId(), arg__1, arg__2);
    }
    native void __qt_dataTransferProgress_long_long(long __this__nativeId, long arg__1, long arg__2);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: error)&gt;:<p> This signal is emitted when the last pending command has finished; (it is emitted after the last command's {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal). <tt>error</tt> is true if an error occurred during the processing; otherwise <tt>error</tt> is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }, {@link com.trolltech.qt.network.QFtp#error() error()}, and {@link com.trolltech.qt.network.QFtp#errorString() errorString()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> done = new Signal1<java.lang.Boolean>();

    private final void done(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_done_boolean(nativeId(), arg__1);
    }
    native void __qt_done_boolean(long __this__nativeId, boolean arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.network.QUrlInfo(named: i)&gt;:<p> This signal is emitted for each directory entry the {@link com.trolltech.qt.network.QFtp#list() list()} command finds. The details of the entry are stored in <tt>i</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#list() list()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.network.QUrlInfo> listInfo = new Signal1<com.trolltech.qt.network.QUrlInfo>();

    private final void listInfo(com.trolltech.qt.network.QUrlInfo arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_listInfo_QUrlInfo(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_listInfo_QUrlInfo(long __this__nativeId, long arg__1);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: replyCode), java.lang.String(named: detail)&gt;:<p> This signal is emitted in response to the {@link com.trolltech.qt.network.QFtp#rawCommand(java.lang.String) rawCommand()} function. <tt>replyCode</tt> is the 3 digit reply code and <tt>detail</tt> is the text that follows the reply code. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#rawCommand(java.lang.String) rawCommand()}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, java.lang.String> rawCommandReply = new Signal2<java.lang.Integer, java.lang.String>();

    private final void rawCommandReply(int arg__1, java.lang.String arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rawCommandReply_int_String(nativeId(), arg__1, arg__2);
    }
    native void __qt_rawCommandReply_int_String(long __this__nativeId, int arg__1, java.lang.String arg__2);
/**
 This signal is emitted in response to a {@link com.trolltech.qt.network.QFtp#get(java.lang.String, com.trolltech.qt.core.QIODevice) get()} command when there is new data to read. <p>If you specify a device as the second argument in the {@link com.trolltech.qt.network.QFtp#get(java.lang.String, com.trolltech.qt.core.QIODevice) get()} command, this signal is not emitted; instead the data is written directly to the device. <p>You can read the data with the {@link com.trolltech.qt.network.QFtp#readAll() readAll()} or {@link com.trolltech.qt.network.QFtp#read(byte[]) read()} functions. <p>This signal is useful if you want to process the data in chunks as soon as it becomes available. If you are only interested in the complete data, just connect to the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal and read the data then instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#get(java.lang.String, com.trolltech.qt.core.QIODevice) get()}, {@link com.trolltech.qt.network.QFtp#read(byte[]) read()}, {@link com.trolltech.qt.network.QFtp#readAll() readAll()}, and {@link com.trolltech.qt.network.QFtp#bytesAvailable() bytesAvailable()}. <br></DD></DT>
*/

    public final Signal0 readyRead = new Signal0();

    private final void readyRead()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readyRead(nativeId());
    }
    native void __qt_readyRead(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: state)&gt;:<p> This signal is emitted when the state of the connection changes. The argument <tt>state</tt> is the new state of the connection; it is one of the {@link com.trolltech.qt.network.QFtp.State State } values. <p>It is usually emitted in response to a {@link com.trolltech.qt.network.QFtp#connectToHost(java.lang.String) connectToHost()} or {@link com.trolltech.qt.network.QFtp#close() close()} command, but it can also be emitted "spontaneously", e.g. when the server closes the connection unexpectedly. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#connectToHost(java.lang.String) connectToHost()}, {@link com.trolltech.qt.network.QFtp#close() close()}, {@link com.trolltech.qt.network.QFtp#state() state()}, and {@link com.trolltech.qt.network.QFtp.State State }. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> stateChanged = new Signal1<java.lang.Integer>();

    private final void stateChanged(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stateChanged_int(nativeId(), arg__1);
    }
    native void __qt_stateChanged_int(long __this__nativeId, int arg__1);


/**
Constructs a QFtp object with the given <tt>parent</tt>.
*/

    public QFtp() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QFtp object with the given <tt>parent</tt>.
*/

    public QFtp(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QFtp_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QFtp_QObject(long parent);

/**
Aborts the current command and deletes all scheduled commands. <p>If there is an unfinished command (i.e. a command for which the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal has been emitted, but for which the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal has not been emitted), this function sends an <tt>ABORT</tt> command to the server. When the server replies that the command is aborted, the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal with the <tt>error</tt> argument set to <tt>true</tt> is emitted for the command. Due to timing issues, it is possible that the command had already finished before the abort request reached the server, in which case, the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted with the <tt>error</tt> argument set to <tt>false</tt>. <p>For all other commands that are affected by the {@link com.trolltech.qt.network.QFtp#abort() abort()}, no signals are emitted. <p>If you don't start further FTP commands directly after the {@link com.trolltech.qt.network.QFtp#abort() abort()}, there won't be any scheduled commands and the {@link com.trolltech.qt.network.QFtp#done done() } signal is emitted. <p><b>Warning:</b> Some FTP servers, for example the BSD FTP daemon (version 0.3), wrongly return a positive reply even when an abort has occurred. For these servers the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal has its error flag set to <tt>false</tt>, even though the command did not complete successfully. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#clearPendingCommands() clearPendingCommands()}. <br></DD></DT>
*/

    public final void abort()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_abort(nativeId());
    }
    native void __qt_abort(long __this__nativeId);

/**
Returns the number of bytes that can be read from the data socket at the moment. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#get(java.lang.String, com.trolltech.qt.core.QIODevice) get()}, {@link com.trolltech.qt.network.QFtp#readyRead readyRead() }, {@link com.trolltech.qt.network.QFtp#read(byte[]) read()}, and {@link com.trolltech.qt.network.QFtp#readAll() readAll()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long bytesAvailable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bytesAvailable(nativeId());
    }
    @QtBlockedSlot
    native long __qt_bytesAvailable(long __this__nativeId);

/**
Changes the working directory of the server to <tt>dir</tt>. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int cd(java.lang.String dir)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cd_String(nativeId(), dir);
    }
    @QtBlockedSlot
    native int __qt_cd_String(long __this__nativeId, java.lang.String dir);

/**
Deletes all pending commands from the list of scheduled commands. This does not affect the command that is being executed. If you want to stop this this as well, use {@link com.trolltech.qt.network.QFtp#abort() abort()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#hasPendingCommands() hasPendingCommands()}, and {@link com.trolltech.qt.network.QFtp#abort() abort()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearPendingCommands()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearPendingCommands(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearPendingCommands(long __this__nativeId);

/**
Closes the connection to the FTP server. <p>The {@link com.trolltech.qt.network.QFtp#stateChanged stateChanged() } signal is emitted when the state of the connecting process changes, e.g. to <tt>Closing</tt>, then <tt>Unconnected</tt>. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#stateChanged stateChanged() }, {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int close()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_close(nativeId());
    }
    @QtBlockedSlot
    native int __qt_close(long __this__nativeId);


/**
Connects to the FTP server <tt>host</tt> using port <tt>port</tt>. <p>The {@link com.trolltech.qt.network.QFtp#stateChanged stateChanged() } signal is emitted when the state of the connecting process changes, e.g. to <tt>HostLookup</tt>, then <tt>Connecting</tt>, then <tt>Connected</tt>. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#stateChanged stateChanged() }, {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int connectToHost(java.lang.String host) {
        return connectToHost(host, (char)21);
    }
/**
Connects to the FTP server <tt>host</tt> using port <tt>port</tt>. <p>The {@link com.trolltech.qt.network.QFtp#stateChanged stateChanged() } signal is emitted when the state of the connecting process changes, e.g. to <tt>HostLookup</tt>, then <tt>Connecting</tt>, then <tt>Connected</tt>. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#stateChanged stateChanged() }, {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int connectToHost(java.lang.String host, char port)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_connectToHost_String_char(nativeId(), host, port);
    }
    @QtBlockedSlot
    native int __qt_connectToHost_String_char(long __this__nativeId, java.lang.String host, char port);

/**
Returns the command type of the FTP command being executed or <tt>None</tt> if there is no command being executed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#currentId() currentId()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QFtp.Command currentCommand()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QFtp.Command.resolve(__qt_currentCommand(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_currentCommand(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.core.QIODevice QIODevice} pointer that is used by the FTP command to read data from or store data to. If there is no current FTP command being executed or if the command does not use an IO device, this function returns 0. <p>This function can be used to delete the {@link com.trolltech.qt.core.QIODevice QIODevice} in the slot connected to the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#get(java.lang.String, com.trolltech.qt.core.QIODevice) get()}, and {@link com.trolltech.qt.network.QFtp#put(com.trolltech.qt.core.QIODevice, java.lang.String) put()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QIODevice currentDevice()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentDevice(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_currentDevice(long __this__nativeId);

/**
Returns the identifier of the FTP command that is being executed or 0 if there is no command being executed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#currentCommand() currentCommand()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int currentId()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentId(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentId(long __this__nativeId);

/**
Returns the last error that occurred. This is useful to find out what went wrong when receiving a {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } or a {@link com.trolltech.qt.network.QFtp#done done() } signal with the <tt>error</tt> argument set to <tt>true</tt>. <p>If you start a new command, the error status is reset to <tt>NoError</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QFtp.Error error()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QFtp.Error.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
Returns a human-readable description of the last error that occurred. This is useful for presenting a error message to the user when receiving a {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } or a {@link com.trolltech.qt.network.QFtp#done done() } signal with the <tt>error</tt> argument set to <tt>true</tt>. <p>The error string is often (but not always) the reply from the server, so it is not always possible to translate the string. If the message comes from Qt, the string has already passed through tr().
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
Downloads the file <tt>file</tt> from the server. <p>If <tt>dev</tt> is 0, then the {@link com.trolltech.qt.network.QFtp#readyRead readyRead() } signal is emitted when there is data available to read. You can then read the data with the {@link com.trolltech.qt.network.QFtp#read(byte[]) read()} or {@link com.trolltech.qt.network.QFtp#readAll() readAll()} functions. <p>If <tt>dev</tt> is not 0, the data is written directly to the device <tt>dev</tt>. Make sure that the <tt>dev</tt> pointer is valid for the duration of the operation (it is safe to delete it when the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted). In this case the {@link com.trolltech.qt.network.QFtp#readyRead readyRead() } signal is not emitted and you cannot read data with the {@link com.trolltech.qt.network.QFtp#read(byte[]) read()} or {@link com.trolltech.qt.network.QFtp#readAll() readAll()} functions. <p>If you don't read the data immediately it becomes available, i.e. when the {@link com.trolltech.qt.network.QFtp#readyRead readyRead() } signal is emitted, it is still available until the next command is started. <p>For example, if you want to present the data to the user as soon as there is something available, connect to the {@link com.trolltech.qt.network.QFtp#readyRead readyRead() } signal and read the data immediately. On the other hand, if you only want to work with the complete data, you can connect to the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal and read the data when the {@link com.trolltech.qt.network.QFtp#get(java.lang.String, com.trolltech.qt.core.QIODevice) get()} command is finished. <p>The data is transferred as Binary or Ascii depending on the value of <tt>type</tt>. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p>{@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#readyRead readyRead() }, {@link com.trolltech.qt.network.QFtp#dataTransferProgress dataTransferProgress() }, and {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int get(java.lang.String file, com.trolltech.qt.core.QIODevice dev) {
        return get(file, dev, com.trolltech.qt.network.QFtp.TransferType.Binary);
    }

/**
Downloads the file <tt>file</tt> from the server. <p>If <tt>dev</tt> is 0, then the {@link com.trolltech.qt.network.QFtp#readyRead readyRead() } signal is emitted when there is data available to read. You can then read the data with the {@link com.trolltech.qt.network.QFtp#read(byte[]) read()} or {@link com.trolltech.qt.network.QFtp#readAll() readAll()} functions. <p>If <tt>dev</tt> is not 0, the data is written directly to the device <tt>dev</tt>. Make sure that the <tt>dev</tt> pointer is valid for the duration of the operation (it is safe to delete it when the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted). In this case the {@link com.trolltech.qt.network.QFtp#readyRead readyRead() } signal is not emitted and you cannot read data with the {@link com.trolltech.qt.network.QFtp#read(byte[]) read()} or {@link com.trolltech.qt.network.QFtp#readAll() readAll()} functions. <p>If you don't read the data immediately it becomes available, i.e. when the {@link com.trolltech.qt.network.QFtp#readyRead readyRead() } signal is emitted, it is still available until the next command is started. <p>For example, if you want to present the data to the user as soon as there is something available, connect to the {@link com.trolltech.qt.network.QFtp#readyRead readyRead() } signal and read the data immediately. On the other hand, if you only want to work with the complete data, you can connect to the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal and read the data when the {@link com.trolltech.qt.network.QFtp#get(java.lang.String, com.trolltech.qt.core.QIODevice) get()} command is finished. <p>The data is transferred as Binary or Ascii depending on the value of <tt>type</tt>. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p>{@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#readyRead readyRead() }, {@link com.trolltech.qt.network.QFtp#dataTransferProgress dataTransferProgress() }, and {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int get(java.lang.String file) {
        return get(file, (com.trolltech.qt.core.QIODevice)null, com.trolltech.qt.network.QFtp.TransferType.Binary);
    }
/**
Downloads the file <tt>file</tt> from the server. <p>If <tt>dev</tt> is 0, then the {@link com.trolltech.qt.network.QFtp#readyRead readyRead() } signal is emitted when there is data available to read. You can then read the data with the {@link com.trolltech.qt.network.QFtp#read(byte[]) read()} or {@link com.trolltech.qt.network.QFtp#readAll() readAll()} functions. <p>If <tt>dev</tt> is not 0, the data is written directly to the device <tt>dev</tt>. Make sure that the <tt>dev</tt> pointer is valid for the duration of the operation (it is safe to delete it when the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted). In this case the {@link com.trolltech.qt.network.QFtp#readyRead readyRead() } signal is not emitted and you cannot read data with the {@link com.trolltech.qt.network.QFtp#read(byte[]) read()} or {@link com.trolltech.qt.network.QFtp#readAll() readAll()} functions. <p>If you don't read the data immediately it becomes available, i.e. when the {@link com.trolltech.qt.network.QFtp#readyRead readyRead() } signal is emitted, it is still available until the next command is started. <p>For example, if you want to present the data to the user as soon as there is something available, connect to the {@link com.trolltech.qt.network.QFtp#readyRead readyRead() } signal and read the data immediately. On the other hand, if you only want to work with the complete data, you can connect to the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal and read the data when the {@link com.trolltech.qt.network.QFtp#get(java.lang.String, com.trolltech.qt.core.QIODevice) get()} command is finished. <p>The data is transferred as Binary or Ascii depending on the value of <tt>type</tt>. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p>{@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#readyRead readyRead() }, {@link com.trolltech.qt.network.QFtp#dataTransferProgress dataTransferProgress() }, and {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int get(java.lang.String file, com.trolltech.qt.core.QIODevice dev, com.trolltech.qt.network.QFtp.TransferType type)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_get_String_QIODevice_TransferType(nativeId(), file, dev == null ? 0 : dev.nativeId(), type.value());
    }
    @QtBlockedSlot
    native int __qt_get_String_QIODevice_TransferType(long __this__nativeId, java.lang.String file, long dev, int type);

/**
Returns true if there are any commands scheduled that have not yet been executed; otherwise returns false. <p>The command that is being executed is not considered as a scheduled command. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#clearPendingCommands() clearPendingCommands()}, {@link com.trolltech.qt.network.QFtp#currentId() currentId()}, and {@link com.trolltech.qt.network.QFtp#currentCommand() currentCommand()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasPendingCommands()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasPendingCommands(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasPendingCommands(long __this__nativeId);


/**
Lists the contents of directory <tt>dir</tt> on the FTP server. If <tt>dir</tt> is empty, it lists the contents of the current directory. <p>The {@link com.trolltech.qt.network.QFtp#listInfo listInfo() } signal is emitted for each directory entry found. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#listInfo listInfo() }, {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int list() {
        return list((java.lang.String)null);
    }
/**
Lists the contents of directory <tt>dir</tt> on the FTP server. If <tt>dir</tt> is empty, it lists the contents of the current directory. <p>The {@link com.trolltech.qt.network.QFtp#listInfo listInfo() } signal is emitted for each directory entry found. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#listInfo listInfo() }, {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int list(java.lang.String dir)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_list_String(nativeId(), dir);
    }
    @QtBlockedSlot
    native int __qt_list_String(long __this__nativeId, java.lang.String dir);


/**
Logs in to the FTP server with the username <tt>user</tt> and the password <tt>password</tt>. <p>The {@link com.trolltech.qt.network.QFtp#stateChanged stateChanged() } signal is emitted when the state of the connecting process changes, e.g. to <tt>LoggedIn</tt>. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int login(java.lang.String user) {
        return login(user, (java.lang.String)null);
    }

/**
Logs in to the FTP server with the username <tt>user</tt> and the password <tt>password</tt>. <p>The {@link com.trolltech.qt.network.QFtp#stateChanged stateChanged() } signal is emitted when the state of the connecting process changes, e.g. to <tt>LoggedIn</tt>. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int login() {
        return login((java.lang.String)null, (java.lang.String)null);
    }
/**
Logs in to the FTP server with the username <tt>user</tt> and the password <tt>password</tt>. <p>The {@link com.trolltech.qt.network.QFtp#stateChanged stateChanged() } signal is emitted when the state of the connecting process changes, e.g. to <tt>LoggedIn</tt>. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int login(java.lang.String user, java.lang.String password)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_login_String_String(nativeId(), user, password);
    }
    @QtBlockedSlot
    native int __qt_login_String_String(long __this__nativeId, java.lang.String user, java.lang.String password);

/**
Creates a directory called <tt>dir</tt> on the server. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int mkdir(java.lang.String dir)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mkdir_String(nativeId(), dir);
    }
    @QtBlockedSlot
    native int __qt_mkdir_String(long __this__nativeId, java.lang.String dir);


/**
Reads the data from the IO device <tt>dev</tt>, and writes it to the file called <tt>file</tt> on the server. The data is read in chunks from the IO device, so this overload allows you to transmit large amounts of data without the need to read all the data into memory at once. <p>The data is transferred as Binary or Ascii depending on the value of <tt>type</tt>. <p>Make sure that the <tt>dev</tt> pointer is valid for the duration of the operation (it is safe to delete it when the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } is emitted).
*/

    @QtBlockedSlot
    public final int put(com.trolltech.qt.core.QIODevice dev, java.lang.String file) {
        return put(dev, file, com.trolltech.qt.network.QFtp.TransferType.Binary);
    }
/**
Reads the data from the IO device <tt>dev</tt>, and writes it to the file called <tt>file</tt> on the server. The data is read in chunks from the IO device, so this overload allows you to transmit large amounts of data without the need to read all the data into memory at once. <p>The data is transferred as Binary or Ascii depending on the value of <tt>type</tt>. <p>Make sure that the <tt>dev</tt> pointer is valid for the duration of the operation (it is safe to delete it when the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } is emitted).
*/

    @QtBlockedSlot
    public final int put(com.trolltech.qt.core.QIODevice dev, java.lang.String file, com.trolltech.qt.network.QFtp.TransferType type)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_put_QIODevice_String_TransferType(nativeId(), dev == null ? 0 : dev.nativeId(), file, type.value());
    }
    @QtBlockedSlot
    native int __qt_put_QIODevice_String_TransferType(long __this__nativeId, long dev, java.lang.String file, int type);


/**
This is an overloaded member function, provided for convenience. <p>Writes a copy of the given <tt>data</tt> to the file called <tt>file</tt> on the server. The progress of the upload is reported by the {@link com.trolltech.qt.network.QFtp#dataTransferProgress dataTransferProgress() } signal. <p>The data is transferred as Binary or Ascii depending on the value of <tt>type</tt>. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p>Since this function takes a copy of the <tt>data</tt>, you can discard your own copy when this function returns. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#dataTransferProgress dataTransferProgress() }, {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int put(com.trolltech.qt.core.QByteArray data, java.lang.String file) {
        return put(data, file, com.trolltech.qt.network.QFtp.TransferType.Binary);
    }
/**
This is an overloaded member function, provided for convenience. <p>Writes a copy of the given <tt>data</tt> to the file called <tt>file</tt> on the server. The progress of the upload is reported by the {@link com.trolltech.qt.network.QFtp#dataTransferProgress dataTransferProgress() } signal. <p>The data is transferred as Binary or Ascii depending on the value of <tt>type</tt>. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p>Since this function takes a copy of the <tt>data</tt>, you can discard your own copy when this function returns. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#dataTransferProgress dataTransferProgress() }, {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int put(com.trolltech.qt.core.QByteArray data, java.lang.String file, com.trolltech.qt.network.QFtp.TransferType type)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_put_QByteArray_String_TransferType(nativeId(), data == null ? 0 : data.nativeId(), file, type.value());
    }
    @QtBlockedSlot
    native int __qt_put_QByteArray_String_TransferType(long __this__nativeId, long data, java.lang.String file, int type);

/**
Sends the raw FTP command <tt>command</tt> to the FTP server. This is useful for low-level FTP access. If the operation you wish to perform has an equivalent QFtp function, we recommend using the function instead of raw FTP commands since the functions are easier and safer. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#rawCommandReply rawCommandReply() }, {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rawCommand(java.lang.String command)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rawCommand_String(nativeId(), command);
    }
    @QtBlockedSlot
    native int __qt_rawCommand_String(long __this__nativeId, java.lang.String command);

    @QtBlockedSlot
    private final long read(com.trolltech.qt.QNativePointer data, long maxlen)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_read_nativepointer_long(nativeId(), data, maxlen);
    }
    @QtBlockedSlot
    native long __qt_read_nativepointer_long(long __this__nativeId, com.trolltech.qt.QNativePointer data, long maxlen);

/**
Reads all the bytes available from the data socket and returns them. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#get(java.lang.String, com.trolltech.qt.core.QIODevice) get()}, {@link com.trolltech.qt.network.QFtp#readyRead readyRead() }, {@link com.trolltech.qt.network.QFtp#bytesAvailable() bytesAvailable()}, and {@link com.trolltech.qt.network.QFtp#read(byte[]) read()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray readAll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readAll(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_readAll(long __this__nativeId);

/**
Deletes the file called <tt>file</tt> from the server. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int remove(java.lang.String file)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_remove_String(nativeId(), file);
    }
    @QtBlockedSlot
    native int __qt_remove_String(long __this__nativeId, java.lang.String file);

/**
Renames the file called <tt>oldname</tt> to <tt>newname</tt> on the server. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rename(java.lang.String oldname, java.lang.String newname)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rename_String_String(nativeId(), oldname, newname);
    }
    @QtBlockedSlot
    native int __qt_rename_String_String(long __this__nativeId, java.lang.String oldname, java.lang.String newname);

/**
Removes the directory called <tt>dir</tt> from the server. <p>The function does not block and returns immediately. The command is scheduled, and its execution is performed asynchronously. The function returns a unique identifier which is passed by {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <p>When the command is started the {@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() } signal is emitted. When it is finished the {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp#commandStarted commandStarted() }, and {@link com.trolltech.qt.network.QFtp#commandFinished commandFinished() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rmdir(java.lang.String dir)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rmdir_String(nativeId(), dir);
    }
    @QtBlockedSlot
    native int __qt_rmdir_String(long __this__nativeId, java.lang.String dir);

/**
Enables use of the FTP proxy on host <tt>host</tt> and port <tt>port</tt>. Calling this function with <tt>host</tt> empty disables proxying. <p>QFtp does not support FTP-over-HTTP proxy servers. Use {@link com.trolltech.qt.network.QHttp QHttp} for this.
*/

    @QtBlockedSlot
    public final int setProxy(java.lang.String host, char port)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setProxy_String_char(nativeId(), host, port);
    }
    @QtBlockedSlot
    native int __qt_setProxy_String_char(long __this__nativeId, java.lang.String host, char port);

/**
Sets the current FTP transfer mode to <tt>mode</tt>. The default is {@link com.trolltech.qt.network.QFtp.TransferMode QFtp::Passive }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp.TransferMode QFtp::TransferMode }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int setTransferMode(com.trolltech.qt.network.QFtp.TransferMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setTransferMode_TransferMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native int __qt_setTransferMode_TransferMode(long __this__nativeId, int mode);

/**
Returns the current state of the object. When the state changes, the {@link com.trolltech.qt.network.QFtp#stateChanged stateChanged() } signal is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QFtp.State State }, and {@link com.trolltech.qt.network.QFtp#stateChanged stateChanged() }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QFtp.State state()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QFtp.State.resolve(__qt_state(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_state(long __this__nativeId);

/**
@exclude
*/

    public static native QFtp fromNativePointer(QNativePointer nativePointer);

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

    protected QFtp(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - network.read_char*_long_long - START
/**
Reads bytes from the stream into <tt>buffer</tt>. The method returns the bytes read or -1 if an error occurred.
*/

    public final int read(byte data[]) {
        if (data.length == 0) return 0;

        com.trolltech.qt.QNativePointer np = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Byte, data.length);
        int len = (int) read(np, data.length);
        for (int i=0; i<len; ++i) data[i] = np.byteAt(i);

        return len;
    }
    // TEMPLATE - network.read_char*_long_long - END

}
