package com.trolltech.qt.core;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QIODevice class is the base interface class of all I/O devices in Qt. QIODevice provides both a common implementation and an abstract interface for devices that support reading and writing of blocks of data, such as {@link com.trolltech.qt.core.QFile QFile}, {@link com.trolltech.qt.core.QBuffer QBuffer} and {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}. QIODevice is abstract and can not be instantiated, but it is common to use the interface it defines to provide device-independent I/O features. For example, Qt's XML classes operate on a QIODevice pointer, allowing them to be used with various devices (such as files and buffers). <p>Before accessing the device, {@link com.trolltech.qt.core.QIODevice#open(com.trolltech.qt.core.QIODevice.OpenModeFlag[]) open()} must be called to set the correct OpenMode (such as {@link com.trolltech.qt.core.QIODevice.OpenModeFlag ReadOnly } or {@link com.trolltech.qt.core.QIODevice.OpenModeFlag ReadWrite }). You can then write to the device with {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()} or putChar(), and read by calling either {@link com.trolltech.qt.core.QIODevice#read(long) read()}, {@link com.trolltech.qt.core.QIODevice#readLine() readLine()}, or {@link com.trolltech.qt.core.QIODevice#readAll() readAll()}. Call {@link com.trolltech.qt.core.QIODevice#close() close()} when you are done with the device. <p>QIODevice distinguishes between two types of devices: random-access devices and sequential devices. <ul><li> Random-access devices support seeking to arbitrary positions using {@link com.trolltech.qt.core.QIODevice#seek(long) seek()}. The current position in the file is available by calling {@link com.trolltech.qt.core.QIODevice#pos() pos()}. {@link com.trolltech.qt.core.QFile QFile} and {@link com.trolltech.qt.core.QBuffer QBuffer} are examples of random-access devices.</li><li> Sequential devices don't support seeking to arbitrary positions. The data must be read in one pass. The functions {@link com.trolltech.qt.core.QIODevice#pos() pos()} and {@link com.trolltech.qt.core.QIODevice#size() size()} don't work for sequential devices. {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} and {@link com.trolltech.qt.core.QProcess QProcess} are examples of sequential devices.</li></ul> You can use {@link com.trolltech.qt.core.QIODevice#isSequential() isSequential()} to determine the type of device. <p>QIODevice emits {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } when new data is available for reading; for example, if new data has arrived on the network or if additional data is appended to a file that you are reading from. You can call {@link com.trolltech.qt.core.QIODevice#bytesAvailable() bytesAvailable()} to determine the number of bytes that currently available for reading. It's common to use {@link com.trolltech.qt.core.QIODevice#bytesAvailable() bytesAvailable()} together with the {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } signal when programming with asynchronous devices such as {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, where fragments of data can arrive at arbitrary points in time. QIODevice emits the {@link com.trolltech.qt.core.QIODevice#bytesWritten bytesWritten() } signal every time a payload of data has been written to the device. Use {@link com.trolltech.qt.core.QIODevice#bytesToWrite() bytesToWrite()} to determine the current amount of data waiting to be written. <p>Certain subclasses of QIODevice, such as {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} and {@link com.trolltech.qt.core.QProcess QProcess}, are asynchronous. This means that I/O functions such as {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()} or {@link com.trolltech.qt.core.QIODevice#read(long) read()} always return immediately, while communication with the device itself may happen when control goes back to the event loop. QIODevice provides functions that allow you to force these operations to be performed immediately, while blocking the calling thread and without entering the event loop. This allows QIODevice subclasses to be used without an event loop, or in a separate thread: <ul><li> {@link com.trolltech.qt.core.QIODevice#waitForReadyRead(int) waitForReadyRead()} - This function suspends operation in the calling thread until new data is available for reading.</li><li> {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()} - This function suspends operation in the calling thread until one payload of data has been written to the device.</li><li> waitFor....() - Subclasses of QIODevice implement blocking functions for device-specific operations. For example, {@link com.trolltech.qt.core.QProcess QProcess} has a function called waitForStarted() which suspends operation in the calling thread until the process has started.</li></ul> Calling these functions from the main, GUI thread, may cause your user interface to freeze. Example: <pre class="snippet">
        QProcess gzip = new QProcess();
        gzip.start("gzip", Arrays.asList("-c"));
        if (!gzip.waitForStarted())
            return false;

        gzip.write(new QByteArray("uncompressed data"));

        QByteArray compressed = new QByteArray();
        while (gzip.waitForReadyRead(5000))
            compressed.append(gzip.readAll());
</pre> By subclassing QIODevice, you can provide the same interface to your own I/O devices. Subclasses of QIODevice are only required to implement the protected {@link com.trolltech.qt.core.QIODevice#readData(byte[]) readData()} and {@link com.trolltech.qt.core.QIODevice#writeData(byte[]) writeData()} functions. QIODevice uses these functions to implement all its convenience functions, such as getChar(), {@link com.trolltech.qt.core.QIODevice#readLine() readLine()} and {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()}. QIODevice also handles access control for you, so you can safely assume that the device is opened in write mode if {@link com.trolltech.qt.core.QIODevice#writeData(byte[]) writeData()} is called. <p>Some subclasses, such as {@link com.trolltech.qt.core.QFile QFile} and {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, are implemented using a memory buffer for intermediate storing of data. This reduces the number of required device accessing calls, which are often very slow. Buffering makes functions like getChar() and putChar() fast, as they can operate on the memory buffer instead of directly on the device itself. Certain I/O operations, however, don't work well with a buffer. For example, if several users open the same device and read it character by character, they may end up reading the same data when they meant to read a separate chunk each. For this reason, QIODevice allows you to bypass any buffering by passing the Unbuffered flag to {@link com.trolltech.qt.core.QIODevice#open(com.trolltech.qt.core.QIODevice.OpenModeFlag[]) open()}. When subclassing QIODevice, remember to bypass any buffer you may use when the device is open in Unbuffered mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBuffer QBuffer}, {@link com.trolltech.qt.core.QFile QFile}, and {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QIODevice extends com.trolltech.qt.core.QObject
{

    private static class ConcreteWrapper extends com.trolltech.qt.core.QIODevice {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        protected int readData(byte[] data) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_readData_nativepointer_long(nativeId(), data);
        }

        @Override
        @QtBlockedSlot
        protected int writeData(byte[] data) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_writeData_nativepointer_long(nativeId(), data);
        }
    }

    
/**
This enum is used with {@link com.trolltech.qt.core.QIODevice#open(com.trolltech.qt.core.QIODevice.OpenModeFlag[]) open()} to describe the mode in which a device is opened. It is also returned by {@link com.trolltech.qt.core.QIODevice#openMode() openMode()}. Certain flags, such as <tt>Unbuffered</tt> and <tt>Truncate</tt>, are meaningless when used with some subclasses. Some of these restrictions are implied by the type of device that is represented by a subclass; for example, access to a {@link com.trolltech.qt.core.QBuffer QBuffer} is always unbuffered. In other cases, the restriction may be due to the implementation, or may be imposed by the underlying platform; for example, {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} does not support <tt>Unbuffered</tt> mode, and limitations in the native API prevent {@link com.trolltech.qt.core.QFile QFile} from supporting <tt>Unbuffered</tt> on Windows.
*/
@QtBlockedEnum
    public enum OpenModeFlag implements com.trolltech.qt.QtEnumerator {
/**
 The device is not open.
*/

        NotOpen(0),
/**
 The device is open for reading.
*/

        ReadOnly(1),
/**
 The device is open for writing.
*/

        WriteOnly(2),
/**
 The device is open for reading and writing.
*/

        ReadWrite(3),
/**
 The device is opened in append mode, so that all data is written to the end of the file.
*/

        Append(4),
/**
 If possible, the device is truncated before it is opened. All earlier contents of the device are lost.
*/

        Truncate(8),
/**
 When reading, the end-of-line terminators are translated to '\n'. When writing, the end-of-line terminators are translated to the local encoding, for example '\r\n' for Win32.
*/

        Text(16),
/**
 Any buffer in the device is bypassed.
*/

        Unbuffered(32);

        OpenModeFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.QIODevice$OpenMode with the specified <tt>com.trolltech.qt.core.QIODevice$OpenModeFlag[]</tt> QIODevice$OpenModeFlag values set.</brief>
*/

        public static OpenMode createQFlags(OpenModeFlag ... values) {
            return new OpenMode(values);
        }
/**
<brief>Returns the QIODevice$OpenModeFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static OpenModeFlag resolve(int value) {
            return (OpenModeFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NotOpen;
            case 1: return ReadOnly;
            case 2: return WriteOnly;
            case 3: return ReadWrite;
            case 4: return Append;
            case 8: return Truncate;
            case 16: return Text;
            case 32: return Unbuffered;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class OpenMode extends com.trolltech.qt.QFlags<OpenModeFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QIODevice-OpenMode with the specified <tt>com.trolltech.qt.core.QIODevice.OpenModeFlag[]</tt>. flags set.</brief>
*/

        public OpenMode(OpenModeFlag ... args) { super(args); }
        public OpenMode(int value) { setValue(value); }
    }


/**
 This signal is emitted when the device is about to close. Connect this signal if you have operations that need to be performed before the device closes (e.g., if you have data in a separate buffer that needs to be written to the device).
*/

    public final Signal0 aboutToClose = new Signal0();

    private final void aboutToClose()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_aboutToClose(nativeId());
    }
    native void __qt_aboutToClose(long __this__nativeId);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Long(named: bytes)&gt;:<p> This signal is emitted every time a payload of data has been written to the device. The <tt>bytes</tt> argument is set to the number of bytes that were written in this payload. <p>{@link com.trolltech.qt.core.QIODevice#bytesWritten bytesWritten() } is not emitted recursively; if you reenter the event loop or call {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()} inside a slot connected to the {@link com.trolltech.qt.core.QIODevice#bytesWritten bytesWritten() } signal, the signal will not be reemitted (although {@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()} may still return true). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#readyRead readyRead() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Long> bytesWritten = new Signal1<java.lang.Long>();

    private final void bytesWritten(long bytes)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_bytesWritten_long(nativeId(), bytes);
    }
    native void __qt_bytesWritten_long(long __this__nativeId, long bytes);
/**
 This signal is emitted when the input (reading) stream is closed in this device. It is emitted as soon as the closing is detected, which means that there might still be data available for reading with {@link com.trolltech.qt.core.QIODevice#read(long) read()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#atEnd() atEnd()}, and {@link com.trolltech.qt.core.QIODevice#read(long) read()}. <br></DD></DT>
*/

    public final Signal0 readChannelFinished = new Signal0();

    private final void readChannelFinished()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readChannelFinished(nativeId());
    }
    native void __qt_readChannelFinished(long __this__nativeId);
/**
 This signal is emitted once every time new data is available for reading from the device. It will only be emitted again once new data is available, such as when a new payload of network data has arrived on your network socket, or when a new block of data has been appended to your device. <p>{@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } is not emitted recursively; if you reenter the event loop or call {@link com.trolltech.qt.core.QIODevice#waitForReadyRead(int) waitForReadyRead()} inside a slot connected to the {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } signal, the signal will not be reemitted (although {@link com.trolltech.qt.core.QIODevice#waitForReadyRead(int) waitForReadyRead()} may still return true). <p>Note for developers implementing classes derived from QIODevice: you should always emit {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } when new data has arrived (do not emit it only because there's data still to be read in your buffers). Do not emit {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } in other conditions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#bytesWritten bytesWritten() }. <br></DD></DT>
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
Constructs a QIODevice object.
*/

    public QIODevice(){
        super((QPrivateConstructor)null);
        __qt_QIODevice();
    }

    native void __qt_QIODevice();

/**
Constructs a QIODevice object with the given <tt>parent</tt>.
*/

    public QIODevice(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QIODevice_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QIODevice_QObject(long parent);

/**
Returns a human-readable description of the last device error that occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#setErrorString(java.lang.String) setErrorString()}. <br></DD></DT>
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

    @QtBlockedSlot
    private final boolean getByte(com.trolltech.qt.QNativePointer c)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_getByte_nativepointer(nativeId(), c);
    }
    @QtBlockedSlot
    native boolean __qt_getByte_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer c);

/**
Returns true if the device is open; otherwise returns false. A device is open if it can be read from and/or written to. By default, this function returns false if {@link com.trolltech.qt.core.QIODevice#openMode() openMode()} returns <tt>NotOpen</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#openMode() openMode()}, and OpenMode. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isOpen()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isOpen(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isOpen(long __this__nativeId);

/**
Returns true if data can be read from the device; otherwise returns false. Use {@link com.trolltech.qt.core.QIODevice#bytesAvailable() bytesAvailable()} to determine how many bytes can be read. <p>This is a convenience function which checks if the OpenMode of the device contains the {@link com.trolltech.qt.core.QIODevice.OpenModeFlag ReadOnly } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#openMode() openMode()}, and OpenMode. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isReadable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isReadable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isReadable(long __this__nativeId);

/**
Returns true if the {@link com.trolltech.qt.core.QIODevice.OpenModeFlag Text } flag is enabled; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#setTextModeEnabled(boolean) setTextModeEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isTextModeEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isTextModeEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isTextModeEnabled(long __this__nativeId);

/**
Returns true if data can be written to the device; otherwise returns false. <p>This is a convenience function which checks if the OpenMode of the device contains the {@link com.trolltech.qt.core.QIODevice.OpenModeFlag WriteOnly } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#openMode() openMode()}, and OpenMode. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isWritable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isWritable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isWritable(long __this__nativeId);

/**
Returns the mode in which the device has been opened; i. . {@link com.trolltech.qt.core.QIODevice.OpenModeFlag ReadOnly } or {@link com.trolltech.qt.core.QIODevice.OpenModeFlag WriteOnly }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#setOpenMode(com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setOpenMode()}, and OpenMode. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QIODevice.OpenMode openMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QIODevice.OpenMode(__qt_openMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_openMode(long __this__nativeId);

    @QtBlockedSlot
    private final long peek(com.trolltech.qt.QNativePointer data, long maxlen)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peek_nativepointer_long(nativeId(), data, maxlen);
    }
    @QtBlockedSlot
    native long __qt_peek_nativepointer_long(long __this__nativeId, com.trolltech.qt.QNativePointer data, long maxlen);

/**
This is an overloaded member function, provided for convenience. <p>Peeks at most <tt>maxSize</tt> bytes from the device, returning the data peeked as a {@link com.trolltech.qt.core.QByteArray QByteArray}. <p>Example: <pre class="snippet">
        public boolean isExeFile(QFile file)
        {
            return file.peek(2).equals("MZ");
        }
</pre> This function has no way of reporting errors; returning an empty QByteArray() can mean either that no data was currently available for peeking, or that an error occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#read(long) read()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray peek(long maxlen)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peek_long(nativeId(), maxlen);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_peek_long(long __this__nativeId, long maxlen);

/**
Writes the character <tt>c</tt> to the device. Returns true on success; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()}, getChar(), and ungetChar(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean putByte(byte c)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_putByte_byte(nativeId(), c);
    }
    @QtBlockedSlot
    native boolean __qt_putByte_byte(long __this__nativeId, byte c);

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
This is an overloaded member function, provided for convenience. <p>Reads at most <tt>maxSize</tt> bytes from the device, and returns the data read as a {@link com.trolltech.qt.core.QByteArray QByteArray}. <p>This function has no way of reporting errors; returning an empty QByteArray() can mean either that no data was currently available for reading, or that an error occurred.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray read(long maxlen)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_read_long(nativeId(), maxlen);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_read_long(long __this__nativeId, long maxlen);

/**
This is an overloaded member function, provided for convenience. <p>Reads all available data from the device, and returns it as a {@link com.trolltech.qt.core.QByteArray QByteArray}. <p>This function has no way of reporting errors; returning an empty QByteArray() can mean either that no data was currently available for reading, or that an error occurred.
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

    @QtBlockedSlot
    private final long readLine(com.trolltech.qt.QNativePointer data, long maxlen)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readLine_nativepointer_long(nativeId(), data, maxlen);
    }
    @QtBlockedSlot
    native long __qt_readLine_nativepointer_long(long __this__nativeId, com.trolltech.qt.QNativePointer data, long maxlen);


/**
This is an overloaded member function, provided for convenience. <p>Reads a line from the device, but no more than <tt>maxSize</tt> characters, and returns the result as a {@link com.trolltech.qt.core.QByteArray QByteArray}. <p>This function has no way of reporting errors; returning an empty QByteArray() can mean either that no data was currently available for reading, or that an error occurred.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray readLine() {
        return readLine((long)0);
    }
/**
This is an overloaded member function, provided for convenience. <p>Reads a line from the device, but no more than <tt>maxSize</tt> characters, and returns the result as a {@link com.trolltech.qt.core.QByteArray QByteArray}. <p>This function has no way of reporting errors; returning an empty QByteArray() can mean either that no data was currently available for reading, or that an error occurred.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray readLine(long maxlen)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readLine_long(nativeId(), maxlen);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_readLine_long(long __this__nativeId, long maxlen);

/**
Sets the human readable description of the last device error that occurred to <tt>str</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setErrorString(java.lang.String errorString)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setErrorString_String(nativeId(), errorString);
    }
    @QtBlockedSlot
    native void __qt_setErrorString_String(long __this__nativeId, java.lang.String errorString);


/**

*/

    @QtBlockedSlot
    protected final void setOpenMode(com.trolltech.qt.core.QIODevice.OpenModeFlag ... openMode) {
        this.setOpenMode(new com.trolltech.qt.core.QIODevice.OpenMode(openMode));
    }
/**
Sets the OpenMode of the device to <tt>openMode</tt>. Call this function to set the open mode if the flags change after the device has been opened. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#openMode() openMode()}, and OpenMode. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setOpenMode(com.trolltech.qt.core.QIODevice.OpenMode openMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOpenMode_OpenMode(nativeId(), openMode.value());
    }
    @QtBlockedSlot
    native void __qt_setOpenMode_OpenMode(long __this__nativeId, int openMode);

/**
If <tt>enabled</tt> is true, this function sets the {@link com.trolltech.qt.core.QIODevice.OpenModeFlag Text } flag on the device; otherwise the {@link com.trolltech.qt.core.QIODevice.OpenModeFlag Text } flag is removed. This feature is useful for classes that provide custom end-of-line handling on a QIODevice. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#isTextModeEnabled() isTextModeEnabled()}, {@link com.trolltech.qt.core.QIODevice#open(com.trolltech.qt.core.QIODevice.OpenModeFlag[]) open()}, and {@link com.trolltech.qt.core.QIODevice#setOpenMode(com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setOpenMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTextModeEnabled(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextModeEnabled_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setTextModeEnabled_boolean(long __this__nativeId, boolean enabled);

/**
Puts the character <tt>c</tt> back into the device, and decrements the current position unless the position is 0. This function is usually called to "undo" a getChar() operation, such as when writing a backtracking parser. <p>If <tt>c</tt> was not previously read from the device, the behavior is undefined.
*/

    @QtBlockedSlot
    public final void ungetByte(byte c)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ungetByte_byte(nativeId(), c);
    }
    @QtBlockedSlot
    native void __qt_ungetByte_byte(long __this__nativeId, byte c);

/**
This is an overloaded member function, provided for convenience. <p>Writes the content of <tt>byteArray</tt> to the device. Returns the number of bytes that were actually written, or -1 if an error occurred. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#read(long) read()}, and {@link com.trolltech.qt.core.QIODevice#writeData(byte[]) writeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long write(com.trolltech.qt.core.QByteArray data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_write_QByteArray(nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native long __qt_write_QByteArray(long __this__nativeId, long data);

    @QtBlockedSlot
    private final long write(com.trolltech.qt.QNativePointer data, long len)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_write_nativepointer_long(nativeId(), data, len);
    }
    @QtBlockedSlot
    native long __qt_write_nativepointer_long(long __this__nativeId, com.trolltech.qt.QNativePointer data, long len);

/**
Returns true if the current read and write position is at the end of the device (i. . there is no more data available for reading on the device); otherwise returns false. <p>For some devices, {@link com.trolltech.qt.core.QIODevice#atEnd() atEnd()} can return true even though there is more data to read. This special case only applies to devices that generate data in direct response to you calling {@link com.trolltech.qt.core.QIODevice#read(long) read()} (e.g., <tt>/dev</tt> or <tt>/proc</tt> files on Unix and Mac OS X, or console input / <tt>stdin</tt> on all platforms). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#bytesAvailable() bytesAvailable()}, {@link com.trolltech.qt.core.QIODevice#read(long) read()}, and {@link com.trolltech.qt.core.QIODevice#isSequential() isSequential()}. <br></DD></DT>
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
Returns the number of bytes that are available for reading. This function is commonly used with sequential devices to determine the number of bytes to allocate in a buffer before reading. <p>Subclasses that reimplement this function must call the base implementation in order to include the size of QIODevices' buffer. Example: <pre class="snippet">
        public long bytesAvailable()
        {
            return buffer.size() + super.bytesAvailable();
        }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#bytesToWrite() bytesToWrite()}, {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() }, and {@link com.trolltech.qt.core.QIODevice#isSequential() isSequential()}. <br></DD></DT>
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
For buffered devices, this function returns the number of bytes waiting to be written. For devices with no buffer, this function returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#bytesAvailable() bytesAvailable()}, {@link com.trolltech.qt.core.QIODevice#bytesWritten bytesWritten() }, and {@link com.trolltech.qt.core.QIODevice#isSequential() isSequential()}. <br></DD></DT>
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
Returns true if a complete line of data can be read from the device; otherwise returns false. <p>Note that unbuffered devices, which have no way of determining what can be read, always return false. <p>This function is often called in conjunction with the {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } signal. <p>Subclasses that reimplement this function must call the base implementation in order to include the size of the QIODevice's buffer. Example: <pre class="snippet">
        public boolean canReadLine()
        {
            return buffer.contains("\n") || super.canReadLine();
        }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#readyRead readyRead() }, and {@link com.trolltech.qt.core.QIODevice#readLine() readLine()}. <br></DD></DT>
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
First emits {@link com.trolltech.qt.core.QIODevice#aboutToClose aboutToClose() }, then closes the device and sets its OpenMode to {@link com.trolltech.qt.core.QIODevice.OpenModeFlag NotOpen }. The error string is also reset. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#setOpenMode(com.trolltech.qt.core.QIODevice.OpenModeFlag[]) setOpenMode()}, and OpenMode. <br></DD></DT>
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
Returns true if this device is sequential; otherwise returns false. <p>Sequential devices, as opposed to a random-access devices, have no concept of a start, an end, a size, or a current position, and they do not support seeking. You can only read from the device when it reports that data is available. The most common example of a sequential device is a network socket. On Unix, special files such as /dev/zero and fifo pipes are sequential. <p>Regular files, on the other hand, do support random access. They have both a size and a current position, and they also support seeking backwards and forwards in the data stream. Regular files are non-sequential. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#bytesAvailable() bytesAvailable()}. <br></DD></DT>
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

*/

    @QtBlockedSlot
    public final boolean open(com.trolltech.qt.core.QIODevice.OpenModeFlag ... mode) {
        return this.open(new com.trolltech.qt.core.QIODevice.OpenMode(mode));
    }
/**
Opens the device and sets its OpenMode to <tt>mode</tt>. Returns true if successful; otherwise returns false. This function should be called from any reimplementations of {@link com.trolltech.qt.core.QIODevice#open(com.trolltech.qt.core.QIODevice.OpenModeFlag[]) open()} or other functions that open the device. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#openMode() openMode()}, and OpenMode. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean open(com.trolltech.qt.core.QIODevice.OpenMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_open_OpenMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native boolean __qt_open_OpenMode(long __this__nativeId, int mode);

/**
For random-access devices, this function returns the position that data is written to or read from. For sequential devices or closed devices, where there is no concept of a "current position", 0 is returned. <p>The current read/write position of the device is maintained internally by QIODevice, so reimplementing this function is not necessary. When subclassing QIODevice, use {@link com.trolltech.qt.core.QIODevice#seek(long) QIODevice::seek()} to notify QIODevice about changes in the device position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#isSequential() isSequential()}, and {@link com.trolltech.qt.core.QIODevice#seek(long) seek()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public long pos()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native long __qt_pos(long __this__nativeId);

/**
Reads up to <tt>maxSize</tt> bytes from the device into <tt>data</tt>, and returns the number of bytes read or -1 if an error occurred. If there are no bytes to be read, this function should return -1 if there can never be more bytes available (for example: socket closed, pipe closed, sub-process finished). <p>This function is called by QIODevice. Reimplement this function when creating a subclass of QIODevice. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#read(long) read()}, {@link com.trolltech.qt.core.QIODevice#readLine() readLine()}, and {@link com.trolltech.qt.core.QIODevice#writeData(byte[]) writeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract int readData(byte[] data);
    @QtBlockedSlot
    native int __qt_readData_nativepointer_long(long __this__nativeId, byte[] data);

/**
Reads up to <tt>maxSize</tt> characters into <tt>data</tt> and returns the number of characters read. <p>This function is called by {@link com.trolltech.qt.core.QIODevice#readLine() readLine()}, and provides its base implementation, using getChar(). Buffered devices can improve the performance of {@link com.trolltech.qt.core.QIODevice#readLine() readLine()} by reimplementing this function. <p>{@link com.trolltech.qt.core.QIODevice#readLine() readLine()} appends a '\0' byte to <tt>data</tt>; {@link com.trolltech.qt.core.QIODevice#readLineData(byte[]) readLineData()} does not need to do this. <p>If you reimplement this function, be careful to return the correct value: it should return the number of bytes read in this line, including the terminating newline, or 0 if there is no line to be read at this point. If an error occurs, it should return -1 if and only if no bytes were read. Reading past EOF is considered an error.
*/

    @QtBlockedSlot
    protected int readLineData(byte[] data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readLineData_nativepointer_long(nativeId(), data);
    }
    @QtBlockedSlot
    native int __qt_readLineData_nativepointer_long(long __this__nativeId, byte[] data);

/**
Seeks to the start of input for random-access devices. Returns true on success; otherwise returns false (for example, if the device is not open). <p>Note that when using a {@link com.trolltech.qt.core.QTextStream QTextStream} on a {@link com.trolltech.qt.core.QFile QFile}, calling {@link com.trolltech.qt.core.QIODevice#reset() reset()} on the {@link com.trolltech.qt.core.QFile QFile} will not have the expected result because {@link com.trolltech.qt.core.QTextStream QTextStream} buffers the file. Use the {@link com.trolltech.qt.core.QTextStream#seek(long) QTextStream::seek()} function instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#seek(long) seek()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean reset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_reset(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_reset(long __this__nativeId);

/**
For random-access devices, this function sets the current position to <tt>pos</tt>, returning true on success, or false if an error occurred. For sequential devices, the default behavior is to do nothing and return false. <p>When subclassing QIODevice, you must call {@link com.trolltech.qt.core.QIODevice#seek(long) QIODevice::seek()} at the start of your function to ensure integrity with QIODevice's built-in buffer. The base implementation always returns true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#pos() pos()}, and {@link com.trolltech.qt.core.QIODevice#isSequential() isSequential()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean seek(long pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_seek_long(nativeId(), pos);
    }
    @QtBlockedSlot
    native boolean __qt_seek_long(long __this__nativeId, long pos);

/**
For open random-access devices, this function returns the size of the device. For open sequential devices, {@link com.trolltech.qt.core.QIODevice#bytesAvailable() bytesAvailable()} is returned. <p>If the device is closed, the size returned will not reflect the actual size of the device. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#isSequential() isSequential()}, and {@link com.trolltech.qt.core.QIODevice#pos() pos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public long size()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native long __qt_size(long __this__nativeId);

/**
For buffered devices, this function waits until a payload of buffered written data has been written to the device and the {@link com.trolltech.qt.core.QIODevice#bytesWritten bytesWritten() } signal has been emitted, or until <tt>msecs</tt> milliseconds have passed. If msecs is -1, this function will not time out. For unbuffered devices, it returns immediately. <p>Returns true if a payload of data was written to the device; otherwise returns false (i.e. if the operation timed out, or if an error occurred). <p>This function can operate without an event loop. It is useful when writing non-GUI applications and when performing I/O operations in a non-GUI thread. <p>If called from within a slot connected to the {@link com.trolltech.qt.core.QIODevice#bytesWritten bytesWritten() } signal, {@link com.trolltech.qt.core.QIODevice#bytesWritten bytesWritten() } will not be reemitted. <p>Reimplement this function to provide a blocking API for a custom device. The default implementation does nothing, and returns false. <p><b>Warning:</b> Calling this function from the main (GUI) thread might cause your user interface to freeze. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#waitForReadyRead(int) waitForReadyRead()}. <br></DD></DT>
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
Blocks until data is available for reading and the {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } signal has been emitted, or until <tt>msecs</tt> milliseconds have passed. If msecs is -1, this function will not time out. <p>Returns true if data is available for reading; otherwise returns false (if the operation timed out or if an error occurred). <p>This function can operate without an event loop. It is useful when writing non-GUI applications and when performing I/O operations in a non-GUI thread. <p>If called from within a slot connected to the {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } signal, {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } will not be reemitted. <p>Reimplement this function to provide a blocking API for a custom device. The default implementation does nothing, and returns false. <p><b>Warning:</b> Calling this function from the main (GUI) thread might cause your user interface to freeze. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#waitForBytesWritten(int) waitForBytesWritten()}. <br></DD></DT>
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
Writes up to <tt>maxSize</tt> bytes from <tt>data</tt> to the device. Returns the number of bytes written, or -1 if an error occurred. <p>This function is called by QIODevice. Reimplement this function when creating a subclass of QIODevice. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#read(long) read()}, and {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract int writeData(byte[] data);
    @QtBlockedSlot
    native int __qt_writeData_nativepointer_long(long __this__nativeId, byte[] data);

/**
@exclude
*/

    public static native QIODevice fromNativePointer(QNativePointer nativePointer);

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

    protected QIODevice(QPrivateConstructor p) { super(p); } 

    /**
     * Gets a byte from the device.
     *
     * @return -1 on failure, or the value of the byte on success
     */
    public final int getByte() {
        QNativePointer np = new QNativePointer(QNativePointer.Type.Byte);
        boolean success = getByte(np);
        return success ? np.byteValue() : -1;
    }


    // TEMPLATE - core.read_with_byte[]_instead_of_char*_and_int - START
    // TEMPLATE - core.call_through_with_byte[]_instead_of_char*_and_int - START
    public final int peek(byte data[]) {
        QNativePointer np = new QNativePointer(QNativePointer.Type.Byte, data.length);

        int returned = (int) peek(np, data.length);
        for (int i=0; i<returned; ++i) data[i] = np.byteAt(i);
        return returned;
    }
    // TEMPLATE - core.call_through_with_byte[]_instead_of_char*_and_int - END
    // TEMPLATE - core.read_with_byte[]_instead_of_char*_and_int - END


    // TEMPLATE - core.read_with_byte[]_instead_of_char*_and_int - START
    // TEMPLATE - core.call_through_with_byte[]_instead_of_char*_and_int - START
    public final int read(byte data[]) {
        QNativePointer np = new QNativePointer(QNativePointer.Type.Byte, data.length);

        int returned = (int) read(np, data.length);
        for (int i=0; i<returned; ++i) data[i] = np.byteAt(i);
        return returned;
    }
    // TEMPLATE - core.call_through_with_byte[]_instead_of_char*_and_int - END
    // TEMPLATE - core.read_with_byte[]_instead_of_char*_and_int - END


    // TEMPLATE - core.read_with_byte[]_instead_of_char*_and_int - START
    // TEMPLATE - core.call_through_with_byte[]_instead_of_char*_and_int - START
    public final int readLine(byte data[]) {
        QNativePointer np = new QNativePointer(QNativePointer.Type.Byte, data.length);

        int returned = (int) readLine(np, data.length);
        for (int i=0; i<returned; ++i) data[i] = np.byteAt(i);
        return returned;
    }
    // TEMPLATE - core.call_through_with_byte[]_instead_of_char*_and_int - END
    // TEMPLATE - core.read_with_byte[]_instead_of_char*_and_int - END


    // TEMPLATE - core.write_with_byte[]_instead_of_char*_and_int - START
    // TEMPLATE - core.call_through_with_byte[]_instead_of_char*_and_int - START
    public final int write(byte data[]) {
        QNativePointer np = new QNativePointer(QNativePointer.Type.Byte, data.length);
        for (int i=0; i<data.length; ++i) np.setByteAt(i, data[i]);
        int returned = (int) write(np, data.length);

        return returned;
    }
    // TEMPLATE - core.call_through_with_byte[]_instead_of_char*_and_int - END
    // TEMPLATE - core.write_with_byte[]_instead_of_char*_and_int - END

}
