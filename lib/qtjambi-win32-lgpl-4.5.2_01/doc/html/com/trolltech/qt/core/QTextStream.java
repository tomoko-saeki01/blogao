package com.trolltech.qt.core;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QTextStream class provides a convenient interface for reading and writing text. QTextStream can operate on a {@link com.trolltech.qt.core.QIODevice QIODevice}, a {@link com.trolltech.qt.core.QByteArray QByteArray} or a QString. Using QTextStream's streaming operators, you can conveniently read and write words, lines and numbers. For generating text, QTextStream supports formatting options for field padding and alignment, and formatting of numbers. Example: <pre class="snippet">
        QFile data = new QFile("output.txt");
        if (data.open(QIODevice.OpenModeFlag.WriteOnly, QIODevice.OpenModeFlag.Truncate)) {
            QTextStream out = new QTextStream(data);
            out.writeString("Result: ");
            out.setFieldWidth(10);
            out.setFieldAlignment(QTextStream.FieldAlignment.AlignLeft);
            out.writeDouble(3.14).writeDouble(2.7).writeString("\n");
            // writes "Result: 3.14      2.7       \n"
        }
</pre> It's also common to use QTextStream to read console input and write console output. QTextStream is locale aware, and will automatically decode standard input using the correct codec. Example: <pre class="snippet">
        QTextStream stream(stdin);
        Stringsline;
        do {
            line = stream.readLine();
        } while (!line.isNull());
</pre> Note that you cannot use {@link com.trolltech.qt.core.QTextStream#atEnd() QTextStream::atEnd()}, which returns true when you have reached the end of the data stream, with stdin. <p>Besides using QTextStream's constructors, you can also set the device or string QTextStream operates on by calling {@link com.trolltech.qt.core.QTextStream#setDevice(com.trolltech.qt.core.QIODevice) setDevice()} or setString(). You can seek to a position by calling {@link com.trolltech.qt.core.QTextStream#seek(long) seek()}, and {@link com.trolltech.qt.core.QTextStream#atEnd() atEnd()} will return true when there is no data left to be read. If you call {@link com.trolltech.qt.core.QTextStream#flush() flush()}, QTextStream will empty all data from its write buffer into the device and call {@link com.trolltech.qt.core.QTextStream#flush() flush()} on the device. <p>Internally, QTextStream uses a Unicode based buffer, and {@link com.trolltech.qt.core.QTextCodec QTextCodec} is used by QTextStream to automatically support different character sets. By default, {@link com.trolltech.qt.core.QTextCodec#codecForLocale() QTextCodec::codecForLocale()} is used for reading and writing, but you can also set the codec by calling {@link com.trolltech.qt.core.QTextStream#setCodec(com.trolltech.qt.core.QTextCodec) setCodec()}. Automatic Unicode detection is also supported. When this feature is enabled (the default behavior), QTextStream will detect the UTF-16 or the UTF-32 BOM (Byte Order Mark) and switch to the appropriate UTF codec when reading. QTextStream does not write a BOM by default, but you can enable this by calling setGenerateByteOrderMark(true). When QTextStream operates on a QString directly, the codec is disabled. <p>There are three general ways to use QTextStream when reading text files: <ul><li> Chunk by chunk, by calling {@link com.trolltech.qt.core.QTextStream#readLine() readLine()} or {@link com.trolltech.qt.core.QTextStream#readAll() readAll()}.</li><li> Word by word. QTextStream supports streaming into QStrings, QByteArrays and char* buffers. Words are delimited by space, and leading white space is automatically skipped.</li><li> Character by character, by streaming into QChar or char types. This method is often used for convenient input handling when parsing files, independent of character encoding and end-of-line semantics. To skip white space, call {@link com.trolltech.qt.core.QTextStream#skipWhiteSpace() skipWhiteSpace()}.</li></ul> Since the text stream uses a buffer, you should not read from the stream using the implementation of a superclass. For instance, if you have a {@link com.trolltech.qt.core.QFile QFile} and read from it directly using {@link com.trolltech.qt.core.QIODevice#readLine() QFile::readLine()} instead of using the stream, the text stream's internal position will be out of sync with the file's position. <p>By default, when reading numbers from a stream of text, QTextStream will automatically detect the number's base representation. For example, if the number starts with "0x", it is assumed to be in hexadecimal form. If it starts with the digits 1-9, it is assumed to be in decimal form, and so on. You can set the integer base, thereby disabling the automatic detection, by calling {@link com.trolltech.qt.core.QTextStream#setIntegerBase(int) setIntegerBase()}. Example: <pre class="snippet">
        QTextStream in = new QTextStream(new QByteArray("0x50 0x20"));
        int firstNumber, secondNumber;

        firstNumber = in.readInt();     // firstNumber == 80
        in.setIntegerBase(10);
        secondNumber = in.readInt();    // secondNumber == 0

        String str;
        str = in.readString();          // str == "x20"
</pre> QTextStream supports many formatting options for generating text. You can set the field width and pad character by calling {@link com.trolltech.qt.core.QTextStream#setFieldWidth(int) setFieldWidth()} and {@link com.trolltech.qt.core.QTextStream#setPadChar(char) setPadChar()}. Use {@link com.trolltech.qt.core.QTextStream#setFieldAlignment(com.trolltech.qt.core.QTextStream.FieldAlignment) setFieldAlignment()} to set the alignment within each field. For real numbers, call {@link com.trolltech.qt.core.QTextStream#setRealNumberNotation(com.trolltech.qt.core.QTextStream.RealNumberNotation) setRealNumberNotation()} and {@link com.trolltech.qt.core.QTextStream#setRealNumberPrecision(int) setRealNumberPrecision()} to set the notation ({@link com.trolltech.qt.core.QTextStream.RealNumberNotation SmartNotation }, {@link com.trolltech.qt.core.QTextStream.RealNumberNotation ScientificNotation }, {@link com.trolltech.qt.core.QTextStream.RealNumberNotation FixedNotation }) and precision in digits of the generated number. Some extra number formatting options are also available through {@link com.trolltech.qt.core.QTextStream#setNumberFlags(com.trolltech.qt.core.QTextStream.NumberFlag[]) setNumberFlags()}.<a name="qtextstream-manipulators"> Like <tt>&lt;iostream&gt;</tt> in the standard C++ library, QTextStream also defines several global manipulator functions: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Manipulator</center></th><th><center> Description</center></th></tr></thead><tr valign="top" class="even"><td> <tt>bin</tt></td><td> Same as setIntegerBase(2).</td></tr><tr valign="top" class="odd"><td> <tt>oct</tt></td><td> Same as setIntegerBase(8).</td></tr><tr valign="top" class="even"><td> <tt>dec</tt></td><td> Same as setIntegerBase(10).</td></tr><tr valign="top" class="odd"><td> <tt>hex</tt></td><td> Same as setIntegerBase(16).</td></tr><tr valign="top" class="even"><td> <tt>showbase</tt></td><td> Same as setNumberFlags({@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()} | {@link com.trolltech.qt.core.QTextStream.NumberFlag ShowBase }).</td></tr><tr valign="top" class="odd"><td> <tt>forcesign</tt></td><td> Same as setNumberFlags({@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()} | {@link com.trolltech.qt.core.QTextStream.NumberFlag ForceSign }).</td></tr><tr valign="top" class="even"><td> <tt>forcepoint</tt></td><td> Same as setNumberFlags({@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()} | {@link com.trolltech.qt.core.QTextStream.NumberFlag ForcePoint }).</td></tr><tr valign="top" class="odd"><td> <tt>noshowbase</tt></td><td> Same as setNumberFlags({@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()} & ~{@link com.trolltech.qt.core.QTextStream.NumberFlag ShowBase }).</td></tr><tr valign="top" class="even"><td> <tt>noforcesign</tt></td><td> Same as setNumberFlags({@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()} & ~{@link com.trolltech.qt.core.QTextStream.NumberFlag ForceSign }).</td></tr><tr valign="top" class="odd"><td> <tt>noforcepoint</tt></td><td> Same as setNumberFlags({@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()} & ~{@link com.trolltech.qt.core.QTextStream.NumberFlag ForcePoint }).</td></tr><tr valign="top" class="even"><td> <tt>uppercasebase</tt></td><td> Same as setNumberFlags({@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()} | {@link com.trolltech.qt.core.QTextStream.NumberFlag UppercaseBase }).</td></tr><tr valign="top" class="odd"><td> <tt>uppercasedigits</tt></td><td> Same as setNumberFlags({@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()} | {@link com.trolltech.qt.core.QTextStream.NumberFlag UppercaseDigits }).</td></tr><tr valign="top" class="even"><td> <tt>lowercasebase</tt></td><td> Same as setNumberFlags({@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()} & ~{@link com.trolltech.qt.core.QTextStream.NumberFlag UppercaseBase }).</td></tr><tr valign="top" class="odd"><td> <tt>lowercasedigits</tt></td><td> Same as setNumberFlags({@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()} & ~{@link com.trolltech.qt.core.QTextStream.NumberFlag UppercaseDigits }).</td></tr><tr valign="top" class="even"><td> <tt>fixed</tt></td><td> Same as setRealNumberNotation({@link com.trolltech.qt.core.QTextStream.RealNumberNotation FixedNotation }).</td></tr><tr valign="top" class="odd"><td> <tt>scientific</tt></td><td> Same as setRealNumberNotation({@link com.trolltech.qt.core.QTextStream.RealNumberNotation ScientificNotation }).</td></tr><tr valign="top" class="even"><td> <tt>left</tt></td><td> Same as setFieldAlignment({@link com.trolltech.qt.core.QTextStream.FieldAlignment AlignLeft }).</td></tr><tr valign="top" class="odd"><td> <tt>right</tt></td><td> Same as setFieldAlignment({@link com.trolltech.qt.core.QTextStream.FieldAlignment AlignRight }).</td></tr><tr valign="top" class="even"><td> <tt>center</tt></td><td> Same as setFieldAlignment({@link com.trolltech.qt.core.QTextStream.FieldAlignment AlignCenter }).</td></tr><tr valign="top" class="odd"><td> <tt>endl</tt></td><td> Same as operator&lt;&lt;('\n') and {@link com.trolltech.qt.core.QTextStream#flush() flush()}.</td></tr><tr valign="top" class="even"><td> <tt>flush</tt></td><td> Same as {@link com.trolltech.qt.core.QTextStream#flush() flush()}.</td></tr><tr valign="top" class="odd"><td> <tt>reset</tt></td><td> Same as {@link com.trolltech.qt.core.QTextStream#reset() reset()}.</td></tr><tr valign="top" class="even"><td> <tt>ws</tt></td><td> Same as {@link com.trolltech.qt.core.QTextStream#skipWhiteSpace() skipWhiteSpace()}.</td></tr><tr valign="top" class="odd"><td> <tt>bom</tt></td><td> Same as setGenerateByteOrderMark(true).</td></tr></table> In addition, Qt provides three global manipulators that take a parameter: qSetFieldWidth(), qSetPadChar(), and qSetRealNumberPrecision(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDataStream QDataStream}, {@link com.trolltech.qt.core.QIODevice QIODevice}, {@link com.trolltech.qt.core.QFile QFile}, {@link com.trolltech.qt.core.QBuffer QBuffer}, {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, and {@link <a href="../tools-codecs.html">Codecs Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextStream extends com.trolltech.qt.QtJambiObject
{

    private Object __rcDevice = null;

    private Object __rcCodec = null;

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
This enum specifies which notations to use for expressing <tt>float</tt> and <tt>double</tt> as strings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setRealNumberNotation(com.trolltech.qt.core.QTextStream.RealNumberNotation) setRealNumberNotation()}. <br></DD></DT>
*/

    public enum RealNumberNotation implements com.trolltech.qt.QtEnumerator {
/**
 Scientific or fixed-point notation, depending on which makes most sense (<tt>printf()</tt>'s <tt>%g</tt> flag).
*/

        SmartNotation(0),
/**
 Fixed-point notation (<tt>printf()</tt>'s <tt>%f</tt> flag).
*/

        FixedNotation(1),
/**
 Scientific notation (<tt>printf()</tt>'s <tt>%e</tt> flag).
*/

        ScientificNotation(2);

        RealNumberNotation(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextStream$RealNumberNotation constant with the specified <tt>int</tt>.</brief>
*/

        public static RealNumberNotation resolve(int value) {
            return (RealNumberNotation) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SmartNotation;
            case 1: return FixedNotation;
            case 2: return ScientificNotation;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum specifies various flags that can be set to affect the output of integers, <tt>float</tt>s, and <tt>double</tt>s. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setNumberFlags(com.trolltech.qt.core.QTextStream.NumberFlag[]) setNumberFlags()}. <br></DD></DT>
*/

    public enum NumberFlag implements com.trolltech.qt.QtEnumerator {
/**
 Show the base as a prefix if the base is 16 ("0x"), 8 ("0"), or 2 ("0b").
*/

        ShowBase(1),
/**
 Always put the decimal separator in numbers, even if there are no decimals.
*/

        ForcePoint(2),
/**
 Always put the sign in numbers, even for positive numbers.
*/

        ForceSign(4),
/**
 Use uppercase versions of base prefixes ("0X", "0B").
*/

        UppercaseBase(8),
/**
 Use uppercase letters for expressing digits 10 to 35 instead of lowercase.
*/

        UppercaseDigits(16);

        NumberFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.QTextStream$NumberFlags with the specified <tt>com.trolltech.qt.core.QTextStream$NumberFlag[]</tt> QTextStream$NumberFlag values set.</brief>
*/

        public static NumberFlags createQFlags(NumberFlag ... values) {
            return new NumberFlags(values);
        }
/**
<brief>Returns the QTextStream$NumberFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static NumberFlag resolve(int value) {
            return (NumberFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return ShowBase;
            case 2: return ForcePoint;
            case 4: return ForceSign;
            case 8: return UppercaseBase;
            case 16: return UppercaseDigits;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class NumberFlags extends com.trolltech.qt.QFlags<NumberFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QTextStream-NumberFlags with the specified <tt>com.trolltech.qt.core.QTextStream.NumberFlag[]</tt>. flags set.</brief>
*/

        public NumberFlags(NumberFlag ... args) { super(args); }
        public NumberFlags(int value) { setValue(value); }
    }
/**
This enum specifies how to align text in fields when the field is wider than the text that occupies it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setFieldAlignment(com.trolltech.qt.core.QTextStream.FieldAlignment) setFieldAlignment()}. <br></DD></DT>
*/


    public enum FieldAlignment implements com.trolltech.qt.QtEnumerator {
/**
 Pad on the right side of fields.
*/

        AlignLeft(0),
/**
 Pad on the left side of fields.
*/

        AlignRight(1),
/**
 Pad on both sides of field.
*/

        AlignCenter(2),
/**
 Same as {@link com.trolltech.qt.core.QTextStream.FieldAlignment AlignRight }, except that the sign of a number is flush left.
*/

        AlignAccountingStyle(3);

        FieldAlignment(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextStream$FieldAlignment constant with the specified <tt>int</tt>.</brief>
*/

        public static FieldAlignment resolve(int value) {
            return (FieldAlignment) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AlignLeft;
            case 1: return AlignRight;
            case 2: return AlignCenter;
            case 3: return AlignAccountingStyle;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the current status of the text stream. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#status() status()}. <br></DD></DT>
*/

    public enum Status implements com.trolltech.qt.QtEnumerator {
/**
 The text stream is operating normally.
*/

        Ok(0),
/**
 The text stream has read past the end of the data in the underlying device.
*/

        ReadPastEnd(1),
/**
 The text stream has read corrupt data.
*/

        ReadCorruptData(2);

        Status(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextStream$Status constant with the specified <tt>int</tt>.</brief>
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
Constructs a QTextStream. Before you can use it for reading or writing, you must assign a device or a string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}, and setString(). <br></DD></DT>
*/

    public QTextStream(){
        super((QPrivateConstructor)null);
        __qt_QTextStream();
    }

    native void __qt_QTextStream();

/**
Constructs a QTextStream that operates on <tt>device</tt>.
*/

    public QTextStream(com.trolltech.qt.core.QIODevice device){
        super((QPrivateConstructor)null);
        {
            __rcDevice = device;
        }
        __qt_QTextStream_QIODevice(device == null ? 0 : device.nativeId());
    }

    native void __qt_QTextStream_QIODevice(long device);


/**

*/

    public QTextStream(com.trolltech.qt.core.QByteArray array, com.trolltech.qt.core.QIODevice.OpenModeFlag ... openMode) {
        this(array, new com.trolltech.qt.core.QIODevice.OpenMode(openMode));
    }

/**
Constructs a QTextStream that operates on <tt>array</tt>, using <tt>openMode</tt> to define the open mode. Internally, the array is wrapped by a {@link com.trolltech.qt.core.QBuffer QBuffer}.
*/

    public QTextStream(com.trolltech.qt.core.QByteArray array) {
        this(array, new com.trolltech.qt.core.QIODevice.OpenMode(1));
    }
/**
Constructs a QTextStream that operates on <tt>array</tt>, using <tt>openMode</tt> to define the open mode. Internally, the array is wrapped by a {@link com.trolltech.qt.core.QBuffer QBuffer}.
*/

    public QTextStream(com.trolltech.qt.core.QByteArray array, com.trolltech.qt.core.QIODevice.OpenMode openMode){
        super((QPrivateConstructor)null);
        __qt_QTextStream_QByteArray_OpenMode(array == null ? 0 : array.nativeId(), openMode.value());
    }

    native void __qt_QTextStream_QByteArray_OpenMode(long array, int openMode);

/**
Returns true if there is no more data to be read from the QTextStream; otherwise returns false. This is similar to, but not the same as calling {@link com.trolltech.qt.core.QIODevice#atEnd() QIODevice::atEnd()}, as QTextStream also takes into account its internal Unicode buffer.
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
Returns true if automatic Unicode detection is enabled; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setAutoDetectUnicode(boolean) setAutoDetectUnicode()}, and {@link com.trolltech.qt.core.QTextStream#setCodec(com.trolltech.qt.core.QTextCodec) setCodec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean autoDetectUnicode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoDetectUnicode(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoDetectUnicode(long __this__nativeId);

/**
Returns the codec that is current assigned to the stream. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setCodec(com.trolltech.qt.core.QTextCodec) setCodec()}, {@link com.trolltech.qt.core.QTextStream#setAutoDetectUnicode(boolean) setAutoDetectUnicode()}, and {@link com.trolltech.qt.core.QTextStream#locale() locale()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextCodec codec()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_codec(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextCodec __qt_codec(long __this__nativeId);

/**
Returns the current device associated with the QTextStream, or 0 if no device has been assigned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}, and {@link com.trolltech.qt.core.QTextStream#string() string()}. <br></DD></DT>
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
Returns the current field alignment. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setFieldAlignment(com.trolltech.qt.core.QTextStream.FieldAlignment) setFieldAlignment()}, and {@link com.trolltech.qt.core.QTextStream#fieldWidth() fieldWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextStream.FieldAlignment fieldAlignment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QTextStream.FieldAlignment.resolve(__qt_fieldAlignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_fieldAlignment(long __this__nativeId);

/**
Returns the current field width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setFieldWidth(int) setFieldWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int fieldWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fieldWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_fieldWidth(long __this__nativeId);

/**
Flushes any buffered data waiting to be written to the device. <p>If QTextStream operates on a string, this function does nothing.
*/

    @QtBlockedSlot
    public final void flush()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_flush(nativeId());
    }
    @QtBlockedSlot
    native void __qt_flush(long __this__nativeId);

/**
Returns true if QTextStream is set to generate the UTF BOM (Byte Order Mark) when using a UTF codec; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setGenerateByteOrderMark(boolean) setGenerateByteOrderMark()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean generateByteOrderMark()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_generateByteOrderMark(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_generateByteOrderMark(long __this__nativeId);

/**
Returns the current base of integers. 0 means that the base is detected when reading, or 10 (decimal) when generating numbers. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setIntegerBase(int) setIntegerBase()}, QString::number(), and {@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int integerBase()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_integerBase(nativeId());
    }
    @QtBlockedSlot
    native int __qt_integerBase(long __this__nativeId);

/**
Returns the locale for this stream. The default locale is C. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setLocale(com.trolltech.qt.core.QLocale) setLocale()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QLocale locale()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_locale(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QLocale __qt_locale(long __this__nativeId);

/**
Returns the current number flags. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setNumberFlags(com.trolltech.qt.core.QTextStream.NumberFlag[]) setNumberFlags()}, {@link com.trolltech.qt.core.QTextStream#integerBase() integerBase()}, and {@link com.trolltech.qt.core.QTextStream#realNumberNotation() realNumberNotation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextStream.NumberFlags numberFlags()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QTextStream.NumberFlags(__qt_numberFlags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_numberFlags(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextStream writeBoolean(boolean b)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeBoolean_boolean(nativeId(), b);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextStream __qt_writeBoolean_boolean(long __this__nativeId, boolean b);

/**
This is an overloaded member function, provided for convenience. <p>Converts <tt>c</tt> from ASCII to a QChar, then writes it to the stream.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextStream writeByte(byte ch)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeByte_byte(nativeId(), ch);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextStream __qt_writeByte_byte(long __this__nativeId, byte ch);

/**
This is an overloaded member function, provided for convenience. <p>Writes the double <tt>f</tt> to the stream.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextStream writeDouble(double f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeDouble_double(nativeId(), f);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextStream __qt_writeDouble_double(long __this__nativeId, double f);

/**
Writes the real number <tt>f</tt> to the stream, then returns a reference to the QTextStream. By default, QTextStream stores it using {@link com.trolltech.qt.core.QTextStream.RealNumberNotation SmartNotation }, with up to 6 digits of precision. You can change the textual representation QTextStream will use for real numbers by calling {@link com.trolltech.qt.core.QTextStream#setRealNumberNotation(com.trolltech.qt.core.QTextStream.RealNumberNotation) setRealNumberNotation()}, {@link com.trolltech.qt.core.QTextStream#setRealNumberPrecision(int) setRealNumberPrecision()} and {@link com.trolltech.qt.core.QTextStream#setNumberFlags(com.trolltech.qt.core.QTextStream.NumberFlag[]) setNumberFlags()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setFieldWidth(int) setFieldWidth()}, {@link com.trolltech.qt.core.QTextStream#setRealNumberNotation(com.trolltech.qt.core.QTextStream.RealNumberNotation) setRealNumberNotation()}, {@link com.trolltech.qt.core.QTextStream#setRealNumberPrecision(int) setRealNumberPrecision()}, and {@link com.trolltech.qt.core.QTextStream#setNumberFlags(com.trolltech.qt.core.QTextStream.NumberFlag[]) setNumberFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextStream writeFloat(float f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeFloat_float(nativeId(), f);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextStream __qt_writeFloat_float(long __this__nativeId, float f);

/**
This is an overloaded member function, provided for convenience. <p>Writes the qlonglong <tt>i</tt> to the stream.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextStream writeLong(long i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeLong_long(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextStream __qt_writeLong_long(long __this__nativeId, long i);

/**
This is an overloaded member function, provided for convenience. <p>Writes the unsigned int <tt>i</tt> to the stream.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextStream writeInt(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeInt_int(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextStream __qt_writeInt_int(long __this__nativeId, int i);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QTextStream writeShort_char(char i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeShort_char_char(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextStream __qt_writeShort_char_char(long __this__nativeId, char i);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QTextStream operator_shift_right_byte(com.trolltech.qt.QNativePointer ch)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_byte_nativepointer(nativeId(), ch);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextStream __qt_operator_shift_right_byte_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer ch);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QTextStream operator_shift_right_double(com.trolltech.qt.QNativePointer f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_double_nativepointer(nativeId(), f);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextStream __qt_operator_shift_right_double_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer f);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QTextStream operator_shift_right_float(com.trolltech.qt.QNativePointer f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_float_nativepointer(nativeId(), f);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextStream __qt_operator_shift_right_float_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer f);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QTextStream operator_shift_right_long(com.trolltech.qt.QNativePointer i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_long_nativepointer(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextStream __qt_operator_shift_right_long_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer i);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QTextStream operator_shift_right_int(com.trolltech.qt.QNativePointer i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_int_nativepointer(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextStream __qt_operator_shift_right_int_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer i);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QTextStream operator_shift_right_short(com.trolltech.qt.QNativePointer i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_operator_shift_right_short_nativepointer(nativeId(), i);
        return this;
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextStream __qt_operator_shift_right_short_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer i);

/**
Returns the current pad character. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setPadChar(char) setPadChar()}, and {@link com.trolltech.qt.core.QTextStream#setFieldWidth(int) setFieldWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final char padChar()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_padChar(nativeId());
    }
    @QtBlockedSlot
    native char __qt_padChar(long __this__nativeId);

/**
Returns the device position corresponding to the current position of the stream, or -1 if an error occurs (e. ., if there is no device or string, or if there's a device error). <p>Because QTextStream is buffered, this function may have to seek the device to reconstruct a valid device position. This operation can be expensive, so you may want to avoid calling this function in a tight loop. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#seek(long) seek()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long pos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native long __qt_pos(long __this__nativeId);

/**
Reads at most <tt>maxlen</tt> characters from the stream, and returns the data read as a QString. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#readAll() readAll()}, {@link com.trolltech.qt.core.QTextStream#readLine() readLine()}, and {@link com.trolltech.qt.core.QIODevice#read(long) QIODevice::read()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String read(long maxlen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_read_long(nativeId(), maxlen);
    }
    @QtBlockedSlot
    native java.lang.String __qt_read_long(long __this__nativeId, long maxlen);

/**
Reads the entire content of the stream, and returns it as a QString. Avoid this function when working on large files, as it will consume a significant amount of memory. <p>Calling {@link com.trolltech.qt.core.QTextStream#readLine() readLine()} is better if you do not know how much data is available. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#readLine() readLine()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String readAll()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readAll(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_readAll(long __this__nativeId);


/**
Reads one line of text from the stream, and returns it as a QString. The maximum allowed line length is set to <tt>maxlen</tt>. If the stream contains lines longer than this, then the lines will be split after <tt>maxlen</tt> characters and returned in parts. <p>If <tt>maxlen</tt> is 0, the lines can be of any length. A common value for <tt>maxlen</tt> is 75. <p>The returned line has no trailing end-of-line characters ("\n" or "\r\n"), so calling QString::trimmed() is unnecessary. <p>If the stream has read to the end of the file, {@link com.trolltech.qt.core.QTextStream#readLine() readLine()} will return a null QString. For strings, or for devices that support it, you can explicitly test for the end of the stream using {@link com.trolltech.qt.core.QTextStream#atEnd() atEnd()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#readAll() readAll()}, and {@link com.trolltech.qt.core.QIODevice#readLine() QIODevice::readLine()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String readLine() {
        return readLine((long)0);
    }
/**
Reads one line of text from the stream, and returns it as a QString. The maximum allowed line length is set to <tt>maxlen</tt>. If the stream contains lines longer than this, then the lines will be split after <tt>maxlen</tt> characters and returned in parts. <p>If <tt>maxlen</tt> is 0, the lines can be of any length. A common value for <tt>maxlen</tt> is 75. <p>The returned line has no trailing end-of-line characters ("\n" or "\r\n"), so calling QString::trimmed() is unnecessary. <p>If the stream has read to the end of the file, {@link com.trolltech.qt.core.QTextStream#readLine() readLine()} will return a null QString. For strings, or for devices that support it, you can explicitly test for the end of the stream using {@link com.trolltech.qt.core.QTextStream#atEnd() atEnd()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#readAll() readAll()}, and {@link com.trolltech.qt.core.QIODevice#readLine() QIODevice::readLine()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String readLine(long maxlen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readLine_long(nativeId(), maxlen);
    }
    @QtBlockedSlot
    native java.lang.String __qt_readLine_long(long __this__nativeId, long maxlen);

/**
Returns the current real number notation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setRealNumberNotation(com.trolltech.qt.core.QTextStream.RealNumberNotation) setRealNumberNotation()}, {@link com.trolltech.qt.core.QTextStream#realNumberPrecision() realNumberPrecision()}, {@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()}, and {@link com.trolltech.qt.core.QTextStream#integerBase() integerBase()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextStream.RealNumberNotation realNumberNotation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QTextStream.RealNumberNotation.resolve(__qt_realNumberNotation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_realNumberNotation(long __this__nativeId);

/**
Returns the current real number precision, or the number of fraction digits QTextStream will write when generating real numbers. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#setRealNumberPrecision(int) setRealNumberPrecision()}, {@link com.trolltech.qt.core.QTextStream#setRealNumberNotation(com.trolltech.qt.core.QTextStream.RealNumberNotation) setRealNumberNotation()}, {@link com.trolltech.qt.core.QTextStream#realNumberNotation() realNumberNotation()}, {@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()}, and {@link com.trolltech.qt.core.QTextStream#integerBase() integerBase()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int realNumberPrecision()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_realNumberPrecision(nativeId());
    }
    @QtBlockedSlot
    native int __qt_realNumberPrecision(long __this__nativeId);

/**
Resets QTextStream's formatting options, bringing it back to its original constructed state. The device, string and any buffered data is left untouched.
*/

    @QtBlockedSlot
    public final void reset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    @QtBlockedSlot
    native void __qt_reset(long __this__nativeId);

/**
Resets the status of the text stream. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream.Status QTextStream::Status }, {@link com.trolltech.qt.core.QTextStream#status() status()}, and {@link com.trolltech.qt.core.QTextStream#setStatus(com.trolltech.qt.core.QTextStream.Status) setStatus()}. <br></DD></DT>
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
Seeks to the position <tt>pos</tt> in the device. Returns true on success; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean seek(long pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_seek_long(nativeId(), pos);
    }
    @QtBlockedSlot
    native boolean __qt_seek_long(long __this__nativeId, long pos);

/**
If <tt>enabled</tt> is true, QTextStream will attempt to detect Unicode encoding by peeking into the stream data to see if it can find the UTF-16 or UTF-32 BOM (Byte Order Mark). If this mark is found, QTextStream will replace the current codec with the UTF codec. <p>This function can be used together with {@link com.trolltech.qt.core.QTextStream#setCodec(com.trolltech.qt.core.QTextCodec) setCodec()}. It is common to set the codec to UTF-8, and then enable UTF-16 detection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#autoDetectUnicode() autoDetectUnicode()}, and {@link com.trolltech.qt.core.QTextStream#setCodec(com.trolltech.qt.core.QTextCodec) setCodec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAutoDetectUnicode(boolean enabled)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoDetectUnicode_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setAutoDetectUnicode_boolean(long __this__nativeId, boolean enabled);

/**
Sets the codec for this stream to <tt>codec</tt>. The codec is used for decoding any data that is read from the assigned device, and for encoding any data that is written. By default, {@link com.trolltech.qt.core.QTextCodec#codecForLocale() QTextCodec::codecForLocale()} is used, and automatic unicode detection is enabled. <p>If QTextStream operates on a string, this function does nothing. <p><b>Warning:</b> If you call this function while the text stream is reading from an open sequential socket, the internal buffer may still contain text decoded using the old codec. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#codec() codec()}, {@link com.trolltech.qt.core.QTextStream#setAutoDetectUnicode(boolean) setAutoDetectUnicode()}, and {@link com.trolltech.qt.core.QTextStream#setLocale(com.trolltech.qt.core.QLocale) setLocale()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCodec(com.trolltech.qt.core.QTextCodec codec)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcCodec = codec;
        }
        __qt_setCodec_QTextCodec(nativeId(), codec == null ? 0 : codec.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCodec_QTextCodec(long __this__nativeId, long codec);

    @QtBlockedSlot
    private final void setCodec(com.trolltech.qt.QNativePointer codecName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCodec_nativepointer(nativeId(), codecName);
    }
    @QtBlockedSlot
    native void __qt_setCodec_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer codecName);

/**
Sets the current device to <tt>device</tt>. If a device has already been assigned, QTextStream will call {@link com.trolltech.qt.core.QTextStream#flush() flush()} before the old device is replaced. <p><b>Note:</b> This function resets locale to the default locale ('C') and codec to the default codec, {@link com.trolltech.qt.core.QTextCodec#codecForLocale() QTextCodec::codecForLocale()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#device() device()}, and setString(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDevice(com.trolltech.qt.core.QIODevice device)    {
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
Sets the field alignment to <tt>mode</tt>. When used together with {@link com.trolltech.qt.core.QTextStream#setFieldWidth(int) setFieldWidth()}, this function allows you to generate formatted output with text aligned to the left, to the right or center aligned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#fieldAlignment() fieldAlignment()}, and {@link com.trolltech.qt.core.QTextStream#setFieldWidth(int) setFieldWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFieldAlignment(com.trolltech.qt.core.QTextStream.FieldAlignment alignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFieldAlignment_FieldAlignment(nativeId(), alignment.value());
    }
    @QtBlockedSlot
    native void __qt_setFieldAlignment_FieldAlignment(long __this__nativeId, int alignment);

/**
Sets the current field width to <tt>width</tt>. If <tt>width</tt> is 0 (the default), the field width is equal to the length of the generated text. <p><b>Note:</b> The field width applies to every element appended to this stream after this function has been called (e.g., it also pads endl). This behavior is different from similar classes in the STL, where the field width only applies to the next element. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#fieldWidth() fieldWidth()}, and {@link com.trolltech.qt.core.QTextStream#setPadChar(char) setPadChar()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFieldWidth(int width)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFieldWidth_int(nativeId(), width);
    }
    @QtBlockedSlot
    native void __qt_setFieldWidth_int(long __this__nativeId, int width);

/**
If <tt>generate</tt> is true and a UTF codec is used, QTextStream will insert the BOM (Byte Order Mark) before any data has been written to the device. If <tt>generate</tt> is false, no BOM will be inserted. This function must be called before any data is written. Otherwise, it does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#generateByteOrderMark() generateByteOrderMark()}, and bom(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setGenerateByteOrderMark(boolean generate)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGenerateByteOrderMark_boolean(nativeId(), generate);
    }
    @QtBlockedSlot
    native void __qt_setGenerateByteOrderMark_boolean(long __this__nativeId, boolean generate);

/**
Sets the base of integers to <tt>base</tt>, both for reading and for generating numbers. <tt>base</tt> can be either 2 (binary), 8 (octal), 10 (decimal) or 16 (hexadecimal). If <tt>base</tt> is 0, QTextStream will attempt to detect the base by inspecting the data on the stream. When generating numbers, QTextStream assumes base is 10 unless the base has been set explicitly. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#integerBase() integerBase()}, QString::number(), and {@link com.trolltech.qt.core.QTextStream#setNumberFlags(com.trolltech.qt.core.QTextStream.NumberFlag[]) setNumberFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setIntegerBase(int base)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIntegerBase_int(nativeId(), base);
    }
    @QtBlockedSlot
    native void __qt_setIntegerBase_int(long __this__nativeId, int base);

/**
Sets the locale for this stream to <tt>locale</tt>. The specified locale is used for conversions between numbers and their string representations. <p>The default locale is C and it is a special case - the thousands group separator is not used for backward compatibility reasons. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#locale() locale()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLocale(com.trolltech.qt.core.QLocale locale)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLocale_QLocale(nativeId(), locale == null ? 0 : locale.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLocale_QLocale(long __this__nativeId, long locale);


/**

*/

    @QtBlockedSlot
    public final void setNumberFlags(com.trolltech.qt.core.QTextStream.NumberFlag ... flags) {
        this.setNumberFlags(new com.trolltech.qt.core.QTextStream.NumberFlags(flags));
    }
/**
Sets the current number flags to <tt>flags</tt>. <tt>flags</tt> is a set of flags from the {@link com.trolltech.qt.core.QTextStream.NumberFlag NumberFlag } enum, and describes options for formatting generated code (e.g., whether or not to always write the base or sign of a number). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#numberFlags() numberFlags()}, {@link com.trolltech.qt.core.QTextStream#setIntegerBase(int) setIntegerBase()}, and {@link com.trolltech.qt.core.QTextStream#setRealNumberNotation(com.trolltech.qt.core.QTextStream.RealNumberNotation) setRealNumberNotation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNumberFlags(com.trolltech.qt.core.QTextStream.NumberFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNumberFlags_NumberFlags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_setNumberFlags_NumberFlags(long __this__nativeId, int flags);

/**
Sets the pad character to <tt>ch</tt>. The default value is the ASCII space character (' '), or QChar(0x20). This character is used to fill in the space in fields when generating text. <p>Example: <pre class="snippet">
        QByteArray b = new QByteArray();
        QTextStream out = new QTextStream(b);
        out.setFieldWidth(10);
        out.setPadChar('-');
        out.writeString("Qt");
        out.writeString("\n");
        out.writeString("rocks!");
        out.writeString("\n");
</pre> Output: <pre class="snippet">
        ----Qt----
        --rocks!--
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#padChar() padChar()}, and {@link com.trolltech.qt.core.QTextStream#setFieldWidth(int) setFieldWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPadChar(char ch)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPadChar_char(nativeId(), ch);
    }
    @QtBlockedSlot
    native void __qt_setPadChar_char(long __this__nativeId, char ch);

/**
Sets the real number notation to <tt>notation</tt> ({@link com.trolltech.qt.core.QTextStream.RealNumberNotation SmartNotation }, {@link com.trolltech.qt.core.QTextStream.RealNumberNotation FixedNotation }, {@link com.trolltech.qt.core.QTextStream.RealNumberNotation ScientificNotation }). When reading and generating numbers, QTextStream uses this value to detect the formatting of real numbers. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#realNumberNotation() realNumberNotation()}, {@link com.trolltech.qt.core.QTextStream#setRealNumberPrecision(int) setRealNumberPrecision()}, {@link com.trolltech.qt.core.QTextStream#setNumberFlags(com.trolltech.qt.core.QTextStream.NumberFlag[]) setNumberFlags()}, and {@link com.trolltech.qt.core.QTextStream#setIntegerBase(int) setIntegerBase()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRealNumberNotation(com.trolltech.qt.core.QTextStream.RealNumberNotation notation)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRealNumberNotation_RealNumberNotation(nativeId(), notation.value());
    }
    @QtBlockedSlot
    native void __qt_setRealNumberNotation_RealNumberNotation(long __this__nativeId, int notation);

/**
Sets the precision of real numbers to <tt>precision</tt>. This value describes the number of fraction digits QTextStream should write when generating real numbers. <p>The precision cannot be a negative value. The default value is 6. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream#realNumberPrecision() realNumberPrecision()}, and {@link com.trolltech.qt.core.QTextStream#setRealNumberNotation(com.trolltech.qt.core.QTextStream.RealNumberNotation) setRealNumberNotation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRealNumberPrecision(int precision)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRealNumberPrecision_int(nativeId(), precision);
    }
    @QtBlockedSlot
    native void __qt_setRealNumberPrecision_int(long __this__nativeId, int precision);

/**
Sets the status of the text stream to the <tt>status</tt> given. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream.Status Status }, {@link com.trolltech.qt.core.QTextStream#status() status()}, and {@link com.trolltech.qt.core.QTextStream#resetStatus() resetStatus()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStatus(com.trolltech.qt.core.QTextStream.Status status)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStatus_Status(nativeId(), status.value());
    }
    @QtBlockedSlot
    native void __qt_setStatus_Status(long __this__nativeId, int status);

/**
Reads and discards whitespace from the stream until either a non-space character is detected, or until {@link com.trolltech.qt.core.QTextStream#atEnd() atEnd()} returns true. This function is useful when reading a stream character by character. <p>Whitespace characters are all characters for which QChar::isSpace() returns true. <p><DT><b>See also:</b><br><DD>operator>>(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void skipWhiteSpace()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_skipWhiteSpace(nativeId());
    }
    @QtBlockedSlot
    native void __qt_skipWhiteSpace(long __this__nativeId);

/**
Returns the status of the text stream. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream.Status QTextStream::Status }, {@link com.trolltech.qt.core.QTextStream#setStatus(com.trolltech.qt.core.QTextStream.Status) setStatus()}, and {@link com.trolltech.qt.core.QTextStream#resetStatus() resetStatus()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextStream.Status status()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QTextStream.Status.resolve(__qt_status(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_status(long __this__nativeId);

/**
@exclude
*/

    public static native QTextStream fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextStream(QPrivateConstructor p) { super(p); } 

/**
Sets the codec for this stream to the QTextCodec for the encoding
specified by <tt>codecName</tt>. Common values for <b>codecName</b>
include "ISO 8859-1", "UTF-8", and "UTF-16". If the encoding isn't
recognized, nothing happens.
<p>
Example:
<p>
<code>
<pre>
    QTextStream out(&file);
    out.setCodec("UTF-8");
</pre>
</code>
*/

    public final void setCodec(String codecName) {
        setCodec(QNativePointer.createCharPointer(codecName));
        if (codec() != __rcCodec)
            __rcCodec = null;
    }

    private QNativePointer srb = new QNativePointer(QNativePointer.Type.Byte, 32) {
        {
            setVerificationEnabled(false);
        }
    };

/**
Reads a byte from the stream.
*/

    public final byte readByte() {
        operator_shift_right_byte(srb);
        return srb.byteValue();
    }

/**
Reads a short from the stream
*/

    public final short readShort() {
        operator_shift_right_short(srb);
        return srb.shortValue();
    }

/**
Reads an int from the stream.
*/

    public final int readInt() {
        operator_shift_right_int(srb);
        return srb.intValue();
    }

/**
Reads a long from the stream.
*/

    public final long readLong() {
        operator_shift_right_long(srb);
        return srb.longValue();
    }

/**
Reads a float from the stream.
*/

    public final float readFloat() {
        operator_shift_right_float(srb);
        return srb.floatValue();
    }

/**
Reads a double from the stream.
*/

    public final double readDouble() {
        operator_shift_right_double(srb);
        return srb.doubleValue();
    }

/**
Writes <tt>s</tt> to the stream.
*/

    public final QTextStream writeShort(short s) {
        writeShort_char((char) s);
        return this;
    }

/**
Writes a character to the stream.
*/

    public final QTextStream writeChar(char c) {
        writeShort_char(c);
        return this;
    }

/**
Reads a characther from the stream.
*/

    public final char readChar() {
        operator_shift_right_short(srb);
        return srb.charValue();
    }

/**
Reads a String from the stream.
*/

    public final String readString() {
        return readString_native(nativeId());
    }

/**
Writes <tt>string</tt> to the stream.
*/

    public final void writeString(String string) {
        writeString_native(nativeId(), string);
    }

    /**
    This function makes the text tream operate on a string instead
    of a QIODevice.
    <p>
    The <tt>string</tt> parameter is the initial contents of the string that the text stream
    will work on. If <tt>string</tt> is <tt>null</tt>, an empty string will be created.
    The stream can both be written to and read from, depending on <tt>openMode</tt>.
    The contents of the string can at any time be retrieved by <tt>string()</tt>.
    For example:
    <pre class="snippet">
    QTextStream stream = QTextStream.createStringStream("TestString\n55",
    new QIODevice.OpenMode(QIODevice.OpenModeFlag.ReadWrite));
    stream.writeString(" ");
    stream.writeString("Hei");
    stream.seek(0);
    System.err.println(stream.readString()); // == "TestString"
    System.err.println(stream.string()); // == "TestString\n55 Hei"
    </pre>
    <p>
    If the text stream already has a QIODevice set, it will flush this.
    @param string The initial content of the string.
    @param openMode Specifies access priveledges to the stream.
    @return A QTextStream operating on a String instead of a QIODevice.
     */
        public static QTextStream createStringStream(String string, com.trolltech.qt.core.QIODevice.OpenMode openMode)
    {
        QTextStream instance = new StringStream(string, openMode);
        return instance;
    }

    /**
    Returns the contents of the string that this text stream is working on.
    <p>
    After creating a string stream with the createStringStream() method,
    you can fetch the contents of the string the text stream is working on with this
    method.
    <p>
    If this QTextStream was not created using createStringStream(), this function returns <tt>null</tt>.
    @return Returns the contents of QTextStreams created with createStringStream()
     */
        public String string()
    {
        return null;
    }

    private static final class StringStream extends QTextStream
    {
        protected StringStream(String string, com.trolltech.qt.core.QIODevice.OpenMode openMode)
        {
            stringPtr = createString(nativeId(), string, openMode.value());
        }

        public String string()
        {
            return string_native(nativeId());
        }

        @Override
            public void disposed()
        {
            deleteString(stringPtr);
        }

        private native long createString(long id, String str, int openMode);
        private native void deleteString(long strPtr);
        private native String string_native(long id);

        private long stringPtr = 0;
    }

    private final native String readString_native(long id);
    private final native void writeString_native(long id, String string);

}
