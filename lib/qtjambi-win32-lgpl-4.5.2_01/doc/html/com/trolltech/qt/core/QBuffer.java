package com.trolltech.qt.core;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QBuffer class provides a {@link com.trolltech.qt.core.QIODevice QIODevice} interface for a {@link com.trolltech.qt.core.QByteArray QByteArray}. QBuffer allows you to access a {@link com.trolltech.qt.core.QByteArray QByteArray} using the {@link com.trolltech.qt.core.QIODevice QIODevice} interface. The {@link com.trolltech.qt.core.QByteArray QByteArray} is treated just as a standard random-accessed file. Example: <pre class="snippet">
    QBuffer buffer = new QBuffer();
    int b;

    buffer.open(QIODevice.OpenModeFlag.ReadWrite);
    buffer.write(new QByteArray("Qt rocks!"));
    buffer.seek(0);
    b = buffer.getByte();  // b == 'Q'
    b = buffer.getByte();  // b == 't'
    b = buffer.getByte();  // b == ' '
    b = buffer.getByte();  // b == 'r'
</pre> By default, an internal {@link com.trolltech.qt.core.QByteArray QByteArray} buffer is created for you when you create a QBuffer. You can access this buffer directly by calling {@link com.trolltech.qt.core.QBuffer#buffer() buffer()}. You can also use QBuffer with an existing {@link com.trolltech.qt.core.QByteArray QByteArray} by calling {@link com.trolltech.qt.core.QBuffer#setBuffer(com.trolltech.qt.core.QByteArray) setBuffer()}, or by passing your array to QBuffer's constructor. <p>Call {@link com.trolltech.qt.core.QIODevice#open(com.trolltech.qt.core.QIODevice.OpenModeFlag[]) open()} to open the buffer. Then call {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()} or putChar() to write to the buffer, and {@link com.trolltech.qt.core.QIODevice#read(long) read()}, {@link com.trolltech.qt.core.QIODevice#readLine() readLine()}, {@link com.trolltech.qt.core.QIODevice#readAll() readAll()}, or getChar() to read from it. {@link com.trolltech.qt.core.QIODevice#size() size()} returns the current size of the buffer, and you can seek to arbitrary positions in the buffer by calling {@link com.trolltech.qt.core.QIODevice#seek(long) seek()}. When you are done with accessing the buffer, call {@link com.trolltech.qt.core.QIODevice#close() close()}. <p>The following code snippet shows how to write data to a {@link com.trolltech.qt.core.QByteArray QByteArray} using {@link com.trolltech.qt.core.QDataStream QDataStream} and QBuffer: <pre class="snippet">
    QByteArray byteArray = new QByteArray();
    QBuffer buffer = new QBuffer(byteArray);
    buffer.open(QIODevice.OpenModeFlag.WriteOnly);

    QDataStream out = new QDataStream(buffer);
    out.writeString("Any string will do.");
</pre> Effectively, we convert the application's {@link com.trolltech.qt.gui.QPalette QPalette} into a byte array. Here's how to read the data from the {@link com.trolltech.qt.core.QByteArray QByteArray}: <pre class="snippet">
    String string = "";
    QBuffer buffer = new QBuffer(byteArray);
    buffer.open(QIODevice.OpenModeFlag.ReadOnly);

    QDataStream in = new QDataStream(buffer);
    string = in.readString();
</pre> {@link com.trolltech.qt.core.QTextStream QTextStream} and {@link com.trolltech.qt.core.QDataStream QDataStream} also provide convenience constructors that take a {@link com.trolltech.qt.core.QByteArray QByteArray} and that create a QBuffer behind the scenes. <p>QBuffer emits {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } when new data has arrived in the buffer. By connecting to this signal, you can use QBuffer to store temporary data before processing it. For example, you can pass the buffer to {@link com.trolltech.qt.network.QFtp QFtp} when downloading a file from an FTP server. Whenever a new payload of data has been downloaded, {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } is emitted, and you can process the data that just arrived. QBuffer also emits {@link com.trolltech.qt.core.QIODevice#bytesWritten bytesWritten() } every time new data has been written to the buffer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile QFile}, {@link com.trolltech.qt.core.QDataStream QDataStream}, {@link com.trolltech.qt.core.QTextStream QTextStream}, and {@link com.trolltech.qt.core.QByteArray QByteArray}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QBuffer extends com.trolltech.qt.core.QIODevice
{

    private QBuffer(com.trolltech.qt.QNativePointer buf, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QBuffer_nativepointer_QObject(buf, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QBuffer_nativepointer_QObject(com.trolltech.qt.QNativePointer buf, long parent);


/**
Constructs an empty buffer with the given <tt>parent</tt>. You can call {@link com.trolltech.qt.core.QBuffer#setData(com.trolltech.qt.core.QByteArray) setData()} to fill the buffer with data, or you can open it in write mode and use {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#open(com.trolltech.qt.core.QIODevice.OpenModeFlag[]) open()}. <br></DD></DT>
*/

    public QBuffer() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an empty buffer with the given <tt>parent</tt>. You can call {@link com.trolltech.qt.core.QBuffer#setData(com.trolltech.qt.core.QByteArray) setData()} to fill the buffer with data, or you can open it in write mode and use {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#open(com.trolltech.qt.core.QIODevice.OpenModeFlag[]) open()}. <br></DD></DT>
*/

    public QBuffer(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QBuffer_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QBuffer_QObject(long parent);

/**
Returns a reference to the QBuffer's internal buffer. You can use it to modify the {@link com.trolltech.qt.core.QByteArray QByteArray} behind the QBuffer's back. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBuffer#setBuffer(com.trolltech.qt.core.QByteArray) setBuffer()}, and {@link com.trolltech.qt.core.QBuffer#data() data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray buffer()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_buffer(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_buffer(long __this__nativeId);

/**
Returns the data contained in the buffer. <p>This is the same as {@link com.trolltech.qt.core.QBuffer#buffer() buffer()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBuffer#setData(com.trolltech.qt.core.QByteArray) setData()}, and {@link com.trolltech.qt.core.QBuffer#setBuffer(com.trolltech.qt.core.QByteArray) setBuffer()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray data()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_data(long __this__nativeId);

    @QtBlockedSlot
    private final void setBuffer(com.trolltech.qt.QNativePointer a)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBuffer_nativepointer(nativeId(), a);
    }
    @QtBlockedSlot
    native void __qt_setBuffer_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer a);

/**
Sets the contents of the internal buffer to be <tt>data</tt>. This is the same as assigning <tt>data</tt> to {@link com.trolltech.qt.core.QBuffer#buffer() buffer()}. <p>Does nothing if {@link com.trolltech.qt.core.QIODevice#isOpen() isOpen()} is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBuffer#data() data()}, and {@link com.trolltech.qt.core.QBuffer#setBuffer(com.trolltech.qt.core.QByteArray) setBuffer()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setData(com.trolltech.qt.core.QByteArray data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setData_QByteArray(nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setData_QByteArray(long __this__nativeId, long data);

    @QtBlockedSlot
    private final void setData(com.trolltech.qt.QNativePointer data, int len)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setData_nativepointer_int(nativeId(), data, len);
    }
    @QtBlockedSlot
    native void __qt_setData_nativepointer_int(long __this__nativeId, com.trolltech.qt.QNativePointer data, int len);

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
    public boolean open(com.trolltech.qt.core.QIODevice.OpenMode openMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_open_OpenMode(nativeId(), openMode.value());
    }
    @QtBlockedSlot
    native boolean __qt_open_OpenMode(long __this__nativeId, int openMode);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean seek(long off)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_seek_long(nativeId(), off);
    }
    @QtBlockedSlot
    native boolean __qt_seek_long(long __this__nativeId, long off);

/**
This method is internal to Qt Jambi. 

	@exclude
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
@exclude
*/

    public static native QBuffer fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QBuffer(QPrivateConstructor p) { super(p); } 

    // retain a reference to avoid gc
    private Object strongDataReference = null;

/**
Constructs a QBuffer that uses the QByteArray pointed to by
<tt>byteArray</tt> as its internal buffer, and with the given <tt>parent</tt>.
The caller is responsible for ensuring that <tt>byteArray</tt> remains
valid until the QBuffer is destroyed, or until setBuffer() is
called to change the buffer. QBuffer doesn't take ownership of
the QByteArray.
<p>
If you open the buffer in write-only mode or read-write mode and
write something into the QBuffer, <tt>byteArray</tt> will be modified.
*/

    public QBuffer(QByteArray byteArray, QObject parent) {
        this(byteArray.nativePointer(), parent);
        strongDataReference = byteArray;
    }

/**
Constructs a new QByteArray of which contents will be equal to
<tt>byteArray</tt>.
*/

    public QBuffer(QByteArray byteArray) {
        this(byteArray, null);
    }

/**
Makes the QBuffer use the <tt>byteArray</tt> as its internal buffer.
<p>
Does nothing if isOpen() is true.
<p>
If you open the buffer in write-only mode or read-write mode and
write something into the QBuffer, \a byteArray will be modified.
<p>
If <tt>byteArray</tt> is null, the buffer creates its own internal
QByteArray to work on. This byte array is initially empty.
*/

    public final void setBuffer(QByteArray byteArray) {
        setBuffer(byteArray.nativePointer());
        strongDataReference = byteArray;
    }

/**
Sets the contents of this QBuffer to <tt>data</tt>
*/

    public final void setData(byte data[]) {
        QNativePointer np = com.trolltech.qt.internal.QtJambiInternal.byteArrayToNativePointer(data);
        setData(np, data.length);
    }

}
