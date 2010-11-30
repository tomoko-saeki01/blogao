package com.trolltech.qt.core;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QDataStream class provides serialization of binary data to a {@link com.trolltech.qt.core.QIODevice QIODevice}. A data stream is a binary stream of encoded information which is 100% independent of the host computer's operating system, CPU or byte order. For example, a data stream that is written by a PC under Windows can be read by a Sun SPARC running Solaris. <p>You can also use a data stream to read/write raw unencoded binary data. If you want a "parsing" input stream, see {@link com.trolltech.qt.core.QTextStream QTextStream}. <p>The QDataStream class implements the serialization of C++'s basic data types, like <tt>char</tt>, <tt>short</tt>, <tt>int</tt>, <tt>char *</tt>, etc. Serialization of more complex data is accomplished by breaking up the data into primitive units. <p>A data stream cooperates closely with a {@link com.trolltech.qt.core.QIODevice QIODevice}. A {@link com.trolltech.qt.core.QIODevice QIODevice} represents an input/output medium one can read data from and write data to. The {@link com.trolltech.qt.core.QFile QFile} class is an example of an I/O device. <p>Example (write binary data to a stream): <pre class="snippet">
        QFile file = new QFile("file.dat");
        QFile.OpenMode mode = new QFile.OpenMode();
        mode.set(QFile.OpenModeFlag.WriteOnly);
        file.open(mode);
        QDataStream out = new QDataStream(file);   // we will serialize the data into the file
        out.writeString("the answer is");   // serialize a string
        out.writeInt(42);        // serialize an integer
</pre> Example (read binary data from a stream): <pre class="snippet">
        QFile file = new QFile("file.dat");
        QFile.OpenMode mode = new QFile.OpenMode();
        mode.set(QFile.OpenModeFlag.ReadOnly);
        file.open(mode);
        QDataStream in = new QDataStream(file);    // read the data serialized from the file
        // extract "the answer is" and 42
        String str = in.readString();
        int a = in.readInt();
</pre> Each item written to the stream is written in a predefined binary format that varies depending on the item's type. Supported Qt types include {@link com.trolltech.qt.gui.QBrush QBrush}, {@link com.trolltech.qt.gui.QColor QColor}, {@link com.trolltech.qt.core.QDateTime QDateTime}, {@link com.trolltech.qt.gui.QFont QFont}, {@link com.trolltech.qt.gui.QPixmap QPixmap}, QString, {@link com.trolltech.qt.QVariant QVariant} and many others. For the complete list of all Qt types supporting data streaming see the {@link <a href="../datastreamformat.html">Format of the QDataStream operators</a>}. <p>For integers it is best to always cast to a Qt integer type for writing, and to read back into the same Qt integer type. This ensures that you get integers of the size you want and insulates you from compiler and platform differences. <p>To take one example, a <tt>char *</tt> string is written as a 32-bit integer equal to the length of the string including the '\0' byte, followed by all the characters of the string including the '\0' byte. When reading a <tt>char *</tt> string, 4 bytes are read to create the 32-bit length value, then that many characters for the <tt>char *</tt> string including the '\0' terminator are read. <p>The initial I/O device is usually set in the constructor, but can be changed with {@link com.trolltech.qt.core.QDataStream#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. If you've reached the end of the data (or if there is no I/O device set) {@link com.trolltech.qt.core.QDataStream#atEnd() atEnd()} will return true.<a name="versioning"><h2>Versioning</h2> QDataStream's binary format has evolved since Qt 1.0, and is likely to continue evolving to reflect changes done in Qt. When inputting or outputting complex types, it's very important to make sure that the same version of the stream ({@link com.trolltech.qt.core.QDataStream#version() version()}) is used for reading and writing. If you need both forward and backward compatibility, you can hardcode the version number in the application: <pre class="snippet">
        stream.setVersion(QDataStream.Version.Qt_4_0.value());
</pre> If you are producing a new binary data format, such as a file format for documents created by your application, you could use a QDataStream to write the data in a portable format. Typically, you would write a brief header containing a magic string and a version number to give yourself room for future expansion. For example: <pre class="snippet">
        QFile file = new QFile("file.xxx");
        QFile.OpenMode mode = new QFile.OpenMode();
        mode.set(QFile.OpenModeFlag.WriteOnly);
        file.open(mode);
        QDataStream out = new QDataStream(file);

        // Write a header with a "magic number" and a version
        out.writeInt(0xA0B0C0D0);
        out.writeInt(123);

        out.setVersion(QDataStream.Version.Qt_4_0.value());

        // Write the data
        out.writeBytes(lots_of_interesting_data.toByteArray());
</pre> Then read it in with: <pre class="snippet">
        QFile file = new QFile("file.xxx");
        QFile.OpenMode mode = new QFile.OpenMode();
        mode.set(QFile.OpenModeFlag.ReadOnly);
        file.open(mode);
        QDataStream in = new QDataStream(file);

        // Read and check the header
        int magic = in.readInt();
        if (magic != 0xA0B0C0D0)
            return XXX_BAD_FILE_FORMAT;

        // Read the version
        int version = in.readInt();
        if (version &lt; 100)
            return XXX_BAD_FILE_TOO_OLD;
        if (version &gt; 123)
            return XXX_BAD_FILE_TOO_NEW;

        if (version &lt;= 110)
            in.setVersion(QDataStream.Version.Qt_3_1.value());
        else
            in.setVersion(QDataStream.Version.Qt_4_0.value());

        // Read the data
        QByteArray lots_of_interesting_data = new QByteArray();
        QByteArray data_new_in_XXX_version_1_2 = new QByteArray();
        QByteArray other_interesting_data = new QByteArray();

        lots_of_interesting_data.readFrom(in);
        if (version &gt;= 120)
            data_new_in_XXX_version_1_2.readFrom(in);
        other_interesting_data.readFrom(in);
</pre> You can select which byte order to use when serializing data. The default setting is big endian (MSB first). Changing it to little endian breaks the portability (unless the reader also changes to little endian). We recommend keeping this setting unless you have special requirements.<a name="raw"><a name="reading-and-writing-raw-binary-data"><h2>Reading and writing raw binary data</h2> You may wish to read/write your own raw binary data to/from the data stream directly. Data may be read from the stream into a preallocated <tt>char *</tt> using readRawData(). Similarly data can be written to the stream using writeRawData(). Note that any encoding/decoding of the data must be done by you. <p>A similar pair of functions is {@link com.trolltech.qt.core.QDataStream#readBytes(byte[]) readBytes()} and {@link com.trolltech.qt.core.QDataStream#writeBytes(byte[]) writeBytes()}. These differ from their raw counterparts as follows: {@link com.trolltech.qt.core.QDataStream#readBytes(byte[]) readBytes()} reads a quint32 which is taken to be the length of the data to be read, then that number of bytes is read into the preallocated <tt>char *</tt>; {@link com.trolltech.qt.core.QDataStream#writeBytes(byte[]) writeBytes()} writes a quint32 containing the length of the data, followed by the data. Note that any encoding/decoding of the data (apart from the length quint32) must be done by you.<a name="serializing-qt-classes"><a name="reading-and-writing-other-qt-classes"><h2>Reading and writing other Qt classes.</h2> In addition to the overloaded stream operators documented here, any Qt classes that you might want to serialize to a QDataStream will have appropriate stream operators declared as non-member of the class:<pre>QDataStream &operator&lt;&lt;(QDataStream &, const QXxx &);
QDataStream &operator&gt;&gt;(QDataStream &, QXxx &);</pre> For example, here are the stream operators declared as non-members of the {@link com.trolltech.qt.gui.QImage QImage} class:<pre>QDataStream & operator&lt;&lt; (QDataStream& stream, const QImage& image);
QDataStream & operator&gt;&gt; (QDataStream& stream, QImage& image);</pre> To see if your favorite Qt class has similar stream operators defined, check the <b>Related Non-Members</b> section of the class's documentation page. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream QTextStream}, and {@link com.trolltech.qt.QVariant QVariant}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDataStream extends com.trolltech.qt.QtJambiObject
{

    private Object __rcDevice = null;

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
This enum provides symbolic synonyms for the data serialization format version numbers. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDataStream#setVersion(int) setVersion()}, and {@link com.trolltech.qt.core.QDataStream#version() version()}. <br></DD></DT>
*/

    public enum Version implements com.trolltech.qt.QtEnumerator {
/**
 Version 1 (Qt 1.x)
*/

        Qt_1_0(1),
/**
 Version 2 (Qt 2.0)
*/

        Qt_2_0(2),
/**
 Version 3 (Qt 2.1, 2.2, 2.3)
*/

        Qt_2_1(3),
/**
 Version 4 (Qt 3.0)
*/

        Qt_3_0(4),
/**
 Version 5 (Qt 3.1, 3.2)
*/

        Qt_3_1(5),
/**
 Version 6 (Qt 3.3)
*/

        Qt_3_3(6),
/**
 Version 7 (Qt 4.0, Qt 4.1)
*/

        Qt_4_0(7),
/**
 Version 8 (Qt 4.2)
*/

        Qt_4_2(8),
/**
 Version 9 (Qt 4.3)
*/

        Qt_4_3(9),
/**
 Version 10 (Qt 4.4)
*/

        Qt_4_4(10),
/**
 Version 10 (Qt 4.5)
*/

        Qt_4_5(11);

        Version(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QDataStream$Version constant with the specified <tt>int</tt>.</brief>
*/

        public static Version resolve(int value) {
            return (Version) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Qt_1_0;
            case 2: return Qt_2_0;
            case 3: return Qt_2_1;
            case 4: return Qt_3_0;
            case 5: return Qt_3_1;
            case 6: return Qt_3_3;
            case 7: return Qt_4_0;
            case 8: return Qt_4_2;
            case 9: return Qt_4_3;
            case 10: return Qt_4_4;
            case 11: return Qt_4_5;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the current status of the data stream.
*/

    public enum Status implements com.trolltech.qt.QtEnumerator {
/**
 The data stream is operating normally.
*/

        Ok(0),
/**
 The data stream has read past the end of the data in the underlying device.
*/

        ReadPastEnd(1),
/**
 The data stream has read corrupt data.
*/

        ReadCorruptData(2);

        Status(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QDataStream$Status constant with the specified <tt>int</tt>.</brief>
*/

        public static Status resolve(int value) {
            return (Status) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Ok;
            case 1: return ReadPastEnd;
            case 2: return ReadCorruptData;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a data stream that has no I/O device. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDataStream#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
*/

    public QDataStream(){
        super((QPrivateConstructor)null);
        __qt_QDataStream();
    }

    native void __qt_QDataStream();


    private QDataStream(com.trolltech.qt.QNativePointer arg__1, com.trolltech.qt.core.QIODevice.OpenModeFlag ... flags) {
        this(arg__1, new com.trolltech.qt.core.QIODevice.OpenMode(flags));
    }
    private QDataStream(com.trolltech.qt.QNativePointer arg__1, com.trolltech.qt.core.QIODevice.OpenMode flags){
        super((QPrivateConstructor)null);
        __qt_QDataStream_nativepointer_OpenMode(arg__1, flags.value());
    }

    native void __qt_QDataStream_nativepointer_OpenMode(com.trolltech.qt.QNativePointer arg__1, int flags);

/**
Constructs a data stream that uses the I/O device <tt>d</tt>. <p><b>Warning:</b> If you use {@link <a href="../porting4.html">QSocket</a>} or {@link <a href="../porting4.html">QSocketDevice</a>} as the I/O device <tt>d</tt> for reading data, you must make sure that enough data is available on the socket for the operation to successfully proceed; QDataStream does not have any means to handle or recover from short-reads. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDataStream#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}, and {@link com.trolltech.qt.core.QDataStream#device() device()}. <br></DD></DT>
*/

    public QDataStream(com.trolltech.qt.core.QIODevice arg__1){
        super((QPrivateConstructor)null);
        __qt_QDataStream_QIODevice(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QDataStream_QIODevice(long arg__1);

/**
Constructs a read-only data stream that operates on byte array <tt>a</tt>. Use QDataStream({@link com.trolltech.qt.core.QByteArray QByteArray}*, int) if you want to write to a byte array. <p>Since {@link com.trolltech.qt.core.QByteArray QByteArray} is not a {@link com.trolltech.qt.core.QIODevice QIODevice} subclass, internally a {@link com.trolltech.qt.core.QBuffer QBuffer} is created to wrap the byte array.
*/

    public QDataStream(com.trolltech.qt.core.QByteArray arg__1){
        super((QPrivateConstructor)null);
        __qt_QDataStream_QByteArray(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QDataStream_QByteArray(long arg__1);

/**
Returns true if the I/O device has reached the end position (end of the stream or file) or if there is no I/O device set; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#atEnd() QIODevice::atEnd()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean atEnd()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_atEnd(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_atEnd(long __this__nativeId);

/**
Returns the I/O device currently set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDataStream#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}, and unsetDevice(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QIODevice device()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_device(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_device(long __this__nativeId);

/**
Writes a boolean value, <tt>i</tt>, to the stream. Returns a reference to the stream.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDataStream writeBoolean(boolean i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeBoolean_boolean(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_writeBoolean_boolean(long __this__nativeId, boolean i);

/**
This is an overloaded member function, provided for convenience. <p>Writes a 64-bit floating point number, <tt>f</tt>, to the stream using the standard IEEE 754 format. Returns a reference to the stream.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDataStream writeDouble(double f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeDouble_double(nativeId(), f);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_writeDouble_double(long __this__nativeId, double f);

/**
This is an overloaded member function, provided for convenience. <p>Writes a 32-bit floating point number, <tt>f</tt>, to the stream using the standard IEEE 754 format. Returns a reference to the stream.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDataStream writeFloat(float f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeFloat_float(nativeId(), f);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_writeFloat_float(long __this__nativeId, float f);

/**
Writes a signed byte, <tt>i</tt>, to the stream and returns a reference to the stream.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDataStream writeInt(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeInt_int(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_writeInt_int(long __this__nativeId, int i);

/**
This is an overloaded member function, provided for convenience. <p>Writes a signed 64-bit integer, <tt>i</tt>, to the stream and returns a reference to the stream.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDataStream writeLong(long i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeLong_long(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_writeLong_long(long __this__nativeId, long i);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QDataStream writeShort_char(char i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeShort_char_char(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_writeShort_char_char(long __this__nativeId, char i);

/**
Writes the byte <tt>i</tt> to the stream.

<tt>i</tt>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDataStream writeByte(byte i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeByte_byte(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_writeByte_byte(long __this__nativeId, byte i);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QDataStream operator_shift_right_boolean(com.trolltech.qt.QNativePointer i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_boolean_nativepointer(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_operator_shift_right_boolean_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer i);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QDataStream operator_shift_right_double(com.trolltech.qt.QNativePointer f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_double_nativepointer(nativeId(), f);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_operator_shift_right_double_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer f);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QDataStream operator_shift_right_float(com.trolltech.qt.QNativePointer f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_float_nativepointer(nativeId(), f);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_operator_shift_right_float_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer f);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QDataStream operator_shift_right_int(com.trolltech.qt.QNativePointer i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_int_nativepointer(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_operator_shift_right_int_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer i);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QDataStream operator_shift_right_long(com.trolltech.qt.QNativePointer i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_long_nativepointer(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_operator_shift_right_long_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer i);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QDataStream operator_shift_right_short(com.trolltech.qt.QNativePointer i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_short_nativepointer(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_operator_shift_right_short_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer i);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QDataStream operator_shift_right_byte(com.trolltech.qt.QNativePointer i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_byte_nativepointer(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_operator_shift_right_byte_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer i);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QDataStream operator_shift_right_char(com.trolltech.qt.QNativePointer i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_char_nativepointer(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDataStream __qt_operator_shift_right_char_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer i);

/**
Resets the status of the data stream. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDataStream.Status Status }, {@link com.trolltech.qt.core.QDataStream#status() status()}, and {@link com.trolltech.qt.core.QDataStream#setStatus(com.trolltech.qt.core.QDataStream.Status) setStatus()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resetStatus()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resetStatus(nativeId());
    }
    @QtBlockedSlot
    native void __qt_resetStatus(long __this__nativeId);

/**
void QDataStream.:setDevice({@link com.trolltech.qt.core.QIODevice QIODevice} *d) <p>Sets the I/O device to <tt>d</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDataStream#device() device()}, and unsetDevice(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDevice(com.trolltech.qt.core.QIODevice arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcDevice = arg__1;
        }
        __qt_setDevice_QIODevice(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDevice_QIODevice(long __this__nativeId, long arg__1);

/**
Sets the status of the data stream to the <tt>status</tt> given. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDataStream.Status Status }, {@link com.trolltech.qt.core.QDataStream#status() status()}, and {@link com.trolltech.qt.core.QDataStream#resetStatus() resetStatus()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStatus(com.trolltech.qt.core.QDataStream.Status status)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStatus_Status(nativeId(), status.value());
    }
    @QtBlockedSlot
    native void __qt_setStatus_Status(long __this__nativeId, int status);

/**
Sets the version number of the data serialization format to <tt>v</tt>. <p>You don't have to set a version if you are using the current version of Qt, but for your own custom binary formats we recommend that you do; see Versioning in the Detailed Description. <p>In order to accommodate new functionality, the datastream serialization format of some Qt classes has changed in some versions of Qt. If you want to read data that was created by an earlier version of Qt, or write data that can be read by a program that was compiled with an earlier version of Qt, use this function to modify the serialization format used by QDataStream. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Qt Version</center></th><th><center> QDataStream Version</center></th></tr></thead><tr valign="top" class="even"><td> Qt 4.4</td><td> 10</td></tr><tr valign="top" class="odd"><td> Qt 4.3</td><td> 9</td></tr><tr valign="top" class="even"><td> Qt 4.2</td><td> 8</td></tr><tr valign="top" class="odd"><td> Qt 4.0, 4.1</td><td> 7</td></tr><tr valign="top" class="even"><td> Qt 3.3</td><td> 6</td></tr><tr valign="top" class="odd"><td> Qt 3.1, 3.2</td><td> 5</td></tr><tr valign="top" class="even"><td> Qt 3.0</td><td> 4</td></tr><tr valign="top" class="odd"><td> Qt 2.1, 2.2, 2.3</td><td> 3</td></tr><tr valign="top" class="even"><td> Qt 2.0</td><td> 2</td></tr><tr valign="top" class="odd"><td> Qt 1.x</td><td> 1</td></tr></table> The {@link com.trolltech.qt.core.QDataStream.Version Version } enum provides symbolic constants for the different versions of Qt. For example: <pre class="snippet">
        QDataStream out = new QDataStream(file);
        out.setVersion(QDataStream.Version.Qt_4_0.value());
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDataStream#version() version()}, and {@link com.trolltech.qt.core.QDataStream.Version Version }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setVersion(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVersion_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setVersion_int(long __this__nativeId, int arg__1);

/**
Skips <tt>len</tt> bytes from the device. Returns the number of bytes actually skipped, or -1 on error. <p>This is equivalent to calling readRawData() on a buffer of length <tt>len</tt> and ignoring the buffer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QIODevice#seek(long) QIODevice::seek()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int skipRawData(int len)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_skipRawData_int(nativeId(), len);
    }
    @QtBlockedSlot
    native int __qt_skipRawData_int(long __this__nativeId, int len);

/**
Returns the status of the data stream. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDataStream.Status Status }, {@link com.trolltech.qt.core.QDataStream#setStatus(com.trolltech.qt.core.QDataStream.Status) setStatus()}, and {@link com.trolltech.qt.core.QDataStream#resetStatus() resetStatus()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDataStream.Status status()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QDataStream.Status.resolve(__qt_status(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_status(long __this__nativeId);

/**
Unsets the I/O device. Use setDevice(0) instead.
*/

    @QtBlockedSlot
    public final void unsetDevice()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unsetDevice(nativeId());
        __rcDevice = null;


    }
    @QtBlockedSlot
    native void __qt_unsetDevice(long __this__nativeId);

/**
Returns the version number of the data serialization format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDataStream#setVersion(int) setVersion()}, and {@link com.trolltech.qt.core.QDataStream.Version Version }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int version()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_version(nativeId());
    }
    @QtBlockedSlot
    native int __qt_version(long __this__nativeId);

/**
@exclude
*/

    public static native QDataStream fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDataStream(QPrivateConstructor p) { super(p); } 

    private QNativePointer srb = new QNativePointer(QNativePointer.Type.Byte, 32) {
        {
            setVerificationEnabled(false);
        }
    };

/**
This function reads a boolean from the stream.
*/

    public final boolean readBoolean() {
        operator_shift_right_boolean(srb);
        return srb.booleanValue();
    }

/**
This function read a byte from the stream.
*/

    public final byte readByte() {
        operator_shift_right_byte(srb);
        return srb.byteValue();
    }

/**
This function reads a short from the stream.
*/

    public final short readShort() {
        operator_shift_right_short(srb);
        return srb.shortValue();
    }

/**
This function reads an int from the stream.
*/

    public final int readInt() {
        operator_shift_right_int(srb);
        return srb.intValue();
    }

/**
This function reads a long from the stream.
*/

    public final long readLong() {
        operator_shift_right_long(srb);
        return srb.longValue();
    }

/**
Reads a character from the stream.
*/

    public final char readChar() {
        operator_shift_right_char(srb);
        return srb.charValue();
    }

/**
This function reads a float from the stream.
*/

    public final float readFloat() {
        operator_shift_right_float(srb);
        return srb.floatValue();
    }

/**
This function read a double from the stream.
*/

    public final double readDouble() {
        operator_shift_right_double(srb);
        return srb.doubleValue();
    }

/**
This function writes the short <tt>s/tt> to the stream. It returns a reference to
the stream after it has been read from.
*/

    public final QDataStream writeShort(short s) {
        writeShort_char((char) s);
        return this;
    }

    private native String readString_private(long nativeId);

    private native void writeString_private(long nativeId, String string);

/**
This function reads a string from the stream.
*/

    public final String readString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " + getClass().getName());
        return readString_private(nativeId());
    }

/**
This function writes the short <tt>s/tt> to the stream. It returns a reference to
the stream after it has been read from.

<tt>string</tt>
*/

    public final void writeString(String string) {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " + getClass().getName());
        writeString_private(nativeId(), string);
    }

    private native int writeBytes(long id, byte buffer[], int length);

    private native int readBytes(long id, byte buffer[], int length);

/**
Writes the bytes in <tt>data</tt> to the stream, This function returns the bytes written or -1 if an error occurred.
*/

    public final int writeBytes(byte buffer[]) {
        return writeBytes(buffer, buffer.length);
    }

/**
Writes <tt>length</tt> bytes from <tt>data</tt>. The function returns the number of bytes written or -1 if an error occurred.
*/

    public final int writeBytes(byte buffer[], int length) {
        return writeBytes(nativeId(), buffer, length);
    }

/**
Reads data from the stream and puts the data in <tt>buffer</tt>. It returns the number of bytes read or -1 if an error occurred.
*/

    public final int readBytes(byte buffer[]) {
        return readBytes(buffer, buffer.length);
    }

/**
Reads <tt>length</tt> bytes from the stream, and puts them in <tt>buffer</tt>. The method returns the number of bytes read or -1 if an error occurred.
*/

    public final int readBytes(byte buffer[], int length) {
        return readBytes(nativeId(), buffer, length);
    }


    // TEMPLATE - core.stream_constructor_bytearray - START
    // Hold reference to byte array which goes away when the stream dies
    private QByteArray byteArray = null;
/**
Constructs a data stream that operates on a byte array, <tt>a</tt>. The <tt>mode</tt> describes how the device is to be used. <p>Alternatively, you can use QDataStream(const {@link com.trolltech.qt.core.QByteArray QByteArray} &) if you just want to read from a byte array. <p>Since {@link com.trolltech.qt.core.QByteArray QByteArray} is not a {@link com.trolltech.qt.core.QIODevice QIODevice} subclass, internally a {@link com.trolltech.qt.core.QBuffer QBuffer} is created to wrap the byte array.
*/

    public QDataStream(QByteArray a, QIODevice.OpenMode mode) {
        this(a.nativePointer(), mode);
        byteArray = a;
    }

/**
Constructs a data stream that operates on a byte array, <tt>a</tt>. The <tt>mode</tt> describes how the device is to be used. <p>Alternatively, you can use QDataStream(const {@link com.trolltech.qt.core.QByteArray QByteArray} &) if you just want to read from a byte array. <p>Since {@link com.trolltech.qt.core.QByteArray QByteArray} is not a {@link com.trolltech.qt.core.QIODevice QIODevice} subclass, internally a {@link com.trolltech.qt.core.QBuffer QBuffer} is created to wrap the byte array.
*/

    public QDataStream(QByteArray a, QIODevice.OpenModeFlag ... mode) {
        this(a.nativePointer(), mode);
        byteArray = a;
    }
    // TEMPLATE - core.stream_constructor_bytearray - END

}
