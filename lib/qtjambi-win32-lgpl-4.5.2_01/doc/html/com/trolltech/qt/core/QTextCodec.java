package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QTextCodec class provides conversions between text encodings. Qt uses Unicode to store, draw and manipulate strings. In many situations you may wish to deal with data that uses a different encoding. For example, most Japanese documents are still stored in Shift-JIS or ISO 2022-JP, while Russian users often have their documents in KOI8-R or Windows-1251. <p>Qt provides a set of QTextCodec classes to help with converting non-Unicode formats to and from Unicode. You can also create your own codec classes. <p>The supported encodings are: <ul><li> Apple Roman</li><li> {@link <a href="../codec-big5.html">Big5</a>}</li><li> {@link <a href="../codec-big5hkscs.html">Big5-HKSCS</a>}</li><li> CP949</li><li> {@link <a href="../codec-eucjp.html">EUC-JP</a>}</li><li> {@link <a href="../codec-euckr.html">EUC-KR</a>}</li><li> {@link <a href="../codec-gbk.html">GB18030-0</a>}</li><li> IBM 850</li><li> IBM 866</li><li> IBM 874</li><li> {@link <a href="../codecs-jis.html">ISO 2022-JP</a>}</li><li> ISO 8859-1 to 10</li><li> ISO 8859-13 to 16</li><li> Iscii-Bng, Dev, Gjr, Knd, Mlm, Ori, Pnj, Tlg, and Tml</li><li> JIS X 0201</li><li> JIS X 0208</li><li> KOI8-R</li><li> KOI8-U</li><li> MuleLao-1</li><li> ROMAN8</li><li> {@link <a href="../codec-sjis.html">Shift-JIS</a>}</li><li> TIS-620</li><li> {@link <a href="../codec-tscii.html">TSCII</a>}</li><li> UTF-8</li><li> UTF-16</li><li> UTF-16BE</li><li> UTF-16LE</li><li> UTF-32</li><li> UTF-32BE</li><li> UTF-32LE</li><li> Windows-1250 to 1258</li><li> WINSAMI2</li></ul> QTextCodecs can be used as follows to convert some locally encoded string to Unicode. Suppose you have some string encoded in Russian KOI8-R encoding, and want to convert it to Unicode. The simple way to do it is like this: <pre class="snippet">
        QByteArray encodedString = new QByteArray("...");
        QTextCodec codec = QTextCodec.codecForName("KOI8-R");
        String string = codec.toUnicode(encodedString);
</pre> After this, <tt>string</tt> holds the text converted to Unicode. Converting a string from Unicode to the local encoding is just as easy: <pre class="snippet">
        String string = new String("...");
        QTextCodec codec = QTextCodec.codecForName("KOI8-R");
        QByteArray encodedString = codec.fromUnicode(string);
</pre> To read or write files in various encodings, use {@link com.trolltech.qt.core.QTextStream QTextStream} and its {@link com.trolltech.qt.core.QTextStream#setCodec(com.trolltech.qt.core.QTextCodec) setCodec()} function. See the {@link <a href="../tools-codecs.html">Codecs</a>} example for an application of QTextCodec to file I/O. <p>Some care must be taken when trying to convert the data in chunks, for example, when receiving it over a network. In such cases it is possible that a multi-byte character will be split over two chunks. At best this might result in the loss of a character and at worst cause the entire conversion to fail. <p>The approach to use in these situations is to create a {@link com.trolltech.qt.core.QTextDecoder QTextDecoder} object for the codec and use this {@link com.trolltech.qt.core.QTextDecoder QTextDecoder} for the whole decoding process, as shown below: <pre class="snippet">
        QTextCodec codec = QTextCodec.codecForName("Shift-JIS");
        QTextDecoder decoder = codec.makeDecoder();

        String string = new String();
        while (new_data_available()) {
            QByteArray chunk = get_new_data();
            string += decoder.toUnicode(chunk);
        }
</pre> The {@link com.trolltech.qt.core.QTextDecoder QTextDecoder} object maintains state between chunks and therefore works correctly even if a multi-byte character is split between chunks.<a name="creating-your-own-codec-class"><h2>Creating Your Own Codec Class</h2> Support for new text encodings can be added to Qt by creating QTextCodec subclasses. <p>The pure virtual functions describe the encoder to the system and the coder is used as required in the different text file formats supported by {@link com.trolltech.qt.core.QTextStream QTextStream}, and under X11, for the locale-specific character input and output. <p>To add support for another encoding to Qt, make a subclass of QTextCodec and implement the functions listed in the table below. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Function</center></th><th><center> Description</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.QTextCodec#name() name()}</td><td> Returns the official name for the encoding. If the encoding is listed in the {@link <a href="../http-www-iana-org-assignments-character-sets.html">IANA character-sets encoding file</a>}, the name should be the preferred MIME name for the encoding.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QTextCodec#aliases() aliases()}</td><td> Returns a list of alternative names for the encoding. QTextCodec provides a default implementation that returns an empty list. For example, "ISO-8859-1" has "latin1", "CP819", "IBM819", and "iso-ir-100" as aliases.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.QTextCodec#mibEnum() mibEnum()}</td><td> Return the MIB enum for the encoding if it is listed in the {@link <a href="../http-www-iana-org-assignments-character-sets.html">IANA character-sets encoding file</a>}.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QTextCodec#convertToUnicode(byte[], int, com.trolltech.qt.core.QTextCodec_ConverterState) convertToUnicode()}</td><td> Converts an 8-bit character string to Unicode.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.QTextCodec#convertFromUnicode(char[], int, com.trolltech.qt.core.QTextCodec_ConverterState) convertFromUnicode()}</td><td> Converts a Unicode string to an 8-bit character string.</td></tr></table> You may find it more convenient to make your codec class available as a plugin; see {@link <a href="../plugins-howto.html">How to Create Qt Plugins</a>} for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream QTextStream}, {@link com.trolltech.qt.core.QTextDecoder QTextDecoder}, {@link com.trolltech.qt.core.QTextEncoder QTextEncoder}, and {@link <a href="../tools-codecs.html">Codecs Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QTextCodec extends com.trolltech.qt.QtJambiObject
{

    private static Object __rcCodecForCStrings = null;

    private static Object __rcCodecForLocale = null;

    private static Object __rcCodecForTr = null;

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.core.QTextCodec {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        protected com.trolltech.qt.core.QByteArray convertFromUnicode(char[] in, int length, com.trolltech.qt.core.QTextCodec_ConverterState state) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_convertFromUnicode_nativepointer_int_QTextCodec_ConverterState(nativeId(), in, length, state == null ? 0 : state.nativeId());
        }

        @Override
        @QtBlockedSlot
        protected java.lang.String convertToUnicode(byte[] in, int length, com.trolltech.qt.core.QTextCodec_ConverterState state) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_convertToUnicode_nativepointer_int_QTextCodec_ConverterState(nativeId(), in, length, state == null ? 0 : state.nativeId());
        }

        @Override
        @QtBlockedSlot
        public int mibEnum() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_mibEnum(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QByteArray name() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_name(nativeId());
        }
    }

    public enum ConversionFlag implements com.trolltech.qt.QtEnumerator {
/**
 No flag is set.
*/

        DefaultConversion(0),
/**
 If this flag is set, invalid input results in an empty string.
*/

        ConvertInvalidToNull(-2147483648),
/**
 Ignore any Unicode byte-order mark and don't generate any.
*/

        IgnoreHeader(1),
        FreeFunction(2);

        ConversionFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.QTextCodec$ConversionFlags with the specified <tt>com.trolltech.qt.core.QTextCodec$ConversionFlag[]</tt> QTextCodec$ConversionFlag values set.</brief>
*/

        public static ConversionFlags createQFlags(ConversionFlag ... values) {
            return new ConversionFlags(values);
        }
/**
<brief>Returns the QTextCodec$ConversionFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static ConversionFlag resolve(int value) {
            return (ConversionFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return DefaultConversion;
            case -2147483648: return ConvertInvalidToNull;
            case 1: return IgnoreHeader;
            case 2: return FreeFunction;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class ConversionFlags extends com.trolltech.qt.QFlags<ConversionFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QTextCodec-ConversionFlags with the specified <tt>com.trolltech.qt.core.QTextCodec.ConversionFlag[]</tt>. flags set.</brief>
*/

        public ConversionFlags(ConversionFlag ... args) { super(args); }
        public ConversionFlags(int value) { setValue(value); }
    }



/**
Constructs a QTextCodec, and gives it the highest precedence. The QTextCodec should always be constructed on the heap (i.e. with <tt>new</tt>). Qt takes ownership and will delete it when the application terminates.
*/

    protected QTextCodec(){
        super((QPrivateConstructor)null);
        __qt_QTextCodec();
        this.disableGarbageCollection();
    }

    native void __qt_QTextCodec();

/**
Returns true if the Unicode character <tt>ch</tt> can be fully encoded with this codec; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean canEncode(char arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canEncode_char(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native boolean __qt_canEncode_char(long __this__nativeId, char arg__1);

/**
This is an overloaded member function, provided for convenience. <p><tt>s</tt> contains the string being tested for encode-ability.
*/

    @QtBlockedSlot
    public final boolean canEncode(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canEncode_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native boolean __qt_canEncode_String(long __this__nativeId, java.lang.String arg__1);

/**
Converts <tt>str</tt> from Unicode to the encoding of this codec, and returns the result in a {@link com.trolltech.qt.core.QByteArray QByteArray}.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray fromUnicode(java.lang.String uc)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fromUnicode_String(nativeId(), uc);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_fromUnicode_String(long __this__nativeId, java.lang.String uc);

/**
Creates a {@link com.trolltech.qt.core.QTextDecoder QTextDecoder} which stores enough state to decode chunks of <tt>char *</tt> data to create chunks of Unicode data. <p>The caller is responsible for deleting the returned object.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextDecoder makeDecoder()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_makeDecoder(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextDecoder __qt_makeDecoder(long __this__nativeId);

/**
Creates a {@link com.trolltech.qt.core.QTextEncoder QTextEncoder} which stores enough state to encode chunks of Unicode data as <tt>char *</tt> data. <p>The caller is responsible for deleting the returned object.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextEncoder makeEncoder()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_makeEncoder(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextEncoder __qt_makeEncoder(long __this__nativeId);

/**
Converts <tt>a</tt> from the encoding of this codec to Unicode, and returns the result in a QString.
*/

    @QtBlockedSlot
    public final java.lang.String toUnicode(com.trolltech.qt.core.QByteArray arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toUnicode_QByteArray(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toUnicode_QByteArray(long __this__nativeId, long arg__1);

/**
Subclasses can return a number of aliases for the codec in question. <p>Standard aliases for codecs can be found in the {@link <a href="../http-www-iana-org-assignments-character-sets.html">IANA character-sets encoding file</a>}.
*/

    @QtBlockedSlot
    public java.util.List<com.trolltech.qt.core.QByteArray> aliases()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_aliases(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QByteArray> __qt_aliases(long __this__nativeId);

/**
QTextCodec subclasses must reimplement this function. <p>Converts the first <tt>number</tt> of characters from the <tt>input</tt> array from Unicode to the encoding of the subclass, and returns the result in a {@link com.trolltech.qt.core.QByteArray QByteArray}. <p><tt>state</tt> can be 0 in which case the conversion is stateless and default conversion rules should be used. If state is not 0, the codec should save the state after the conversion in <tt>state</tt>, and adjust the remainingChars and invalidChars members of the struct.
*/

    @QtBlockedSlot
    protected abstract com.trolltech.qt.core.QByteArray convertFromUnicode(char[] in, int length, com.trolltech.qt.core.QTextCodec_ConverterState state);
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_convertFromUnicode_nativepointer_int_QTextCodec_ConverterState(long __this__nativeId, char[] in, int length, long state);

/**
QTextCodec subclasses must reimplement this function. <p>Converts the first <tt>len</tt> characters of <tt>chars</tt> from the encoding of the subclass to Unicode, and returns the result in a QString. <p><tt>state</tt> can be 0, in which case the conversion is stateless and default conversion rules should be used. If state is not 0, the codec should save the state after the conversion in <tt>state</tt>, and adjust the remainingChars and invalidChars members of the struct.
*/

    @QtBlockedSlot
    protected abstract java.lang.String convertToUnicode(byte[] in, int length, com.trolltech.qt.core.QTextCodec_ConverterState state);
    @QtBlockedSlot
    native java.lang.String __qt_convertToUnicode_nativepointer_int_QTextCodec_ConverterState(long __this__nativeId, byte[] in, int length, long state);

/**
Subclasses of QTextCodec must reimplement this function. It returns the MIBenum (see {@link <a href="../http-www-iana-org-assignments-character-sets.html">IANA character-sets encoding file</a>} for more information). It is important that each QTextCodec subclass returns the correct unique value for this function.
*/

    @QtBlockedSlot
    public abstract int mibEnum();
    @QtBlockedSlot
    native int __qt_mibEnum(long __this__nativeId);

/**
QTextCodec subclasses must reimplement this function. It returns the name of the encoding supported by the subclass. <p>If the codec is registered as a character set in the {@link <a href="../http-www-iana-org-assignments-character-sets.html">IANA character-sets encoding file</a>} this method should return the preferred mime name for the codec if defined, otherwise its name.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QByteArray name();
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_name(long __this__nativeId);

/**
Returns the list of all available codecs, by name. Call {@link com.trolltech.qt.core.QTextCodec#codecForName(com.trolltech.qt.core.QByteArray) QTextCodec::codecForName()} to obtain the QTextCodec for the name. <p>The list may contain many mentions of the same codec if the codec has aliases. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextCodec#availableMibs() availableMibs()}, {@link com.trolltech.qt.core.QTextCodec#name() name()}, and {@link com.trolltech.qt.core.QTextCodec#aliases() aliases()}. <br></DD></DT>
*/

    public native static java.util.List<com.trolltech.qt.core.QByteArray> availableCodecs();

/**
Returns the list of MIBs for all available codecs. Call {@link com.trolltech.qt.core.QTextCodec#codecForMib(int) QTextCodec::codecForMib()} to obtain the QTextCodec for the MIB. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextCodec#availableCodecs() availableCodecs()}, and {@link com.trolltech.qt.core.QTextCodec#mibEnum() mibEnum()}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.Integer> availableMibs();

/**
Returns the codec used by QString to convert to and from <tt>const char *</tt> and QByteArrays. If this function returns 0 (the default), QString assumes Latin-1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextCodec#setCodecForCStrings(com.trolltech.qt.core.QTextCodec) setCodecForCStrings()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QTextCodec codecForCStrings();

/**
This is an overloaded member function, provided for convenience. <p>If the codec cannot be detected, this overload returns a Latin-1 QTextCodec.
*/

    public static com.trolltech.qt.core.QTextCodec codecForHtml(com.trolltech.qt.core.QByteArray ba)    {
        return __qt_codecForHtml_QByteArray(ba == null ? 0 : ba.nativeId());
    }
    native static com.trolltech.qt.core.QTextCodec __qt_codecForHtml_QByteArray(long ba);

/**
Tries to detect the encoding of the provided snippet of html in the given byte array, <tt>ba</tt>, and returns a QTextCodec instance that is capable of decoding the html to unicode. If the codec cannot be detected from the content provided, <tt>defaultCodec</tt> is returned.
*/

    public static com.trolltech.qt.core.QTextCodec codecForHtml(com.trolltech.qt.core.QByteArray ba, com.trolltech.qt.core.QTextCodec defaultCodec)    {
        return __qt_codecForHtml_QByteArray_QTextCodec(ba == null ? 0 : ba.nativeId(), defaultCodec == null ? 0 : defaultCodec.nativeId());
    }
    native static com.trolltech.qt.core.QTextCodec __qt_codecForHtml_QByteArray_QTextCodec(long ba, long defaultCodec);

/**
Returns a pointer to the codec most suitable for this locale. <p>On Windows, the codec will be based on a system locale. On Unix systems, starting with Qt 4.2, the codec will be using the iconv library. Note that in both cases the codec's name will be "System". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextCodec#setCodecForLocale(com.trolltech.qt.core.QTextCodec) setCodecForLocale()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QTextCodec codecForLocale();

/**
Returns the QTextCodec which matches the {@link com.trolltech.qt.core.QTextCodec#mibEnum() MIBenum}<tt>mib</tt>.
*/

    public native static com.trolltech.qt.core.QTextCodec codecForMib(int mib);

/**
Searches all installed QTextCodec objects and returns the one which best matches <tt>name</tt>; the match is case-insensitive. Returns 0 if no codec matching the name <tt>name</tt> could be found.
*/

    public static com.trolltech.qt.core.QTextCodec codecForName(com.trolltech.qt.core.QByteArray name)    {
        return __qt_codecForName_QByteArray(name == null ? 0 : name.nativeId());
    }
    native static com.trolltech.qt.core.QTextCodec __qt_codecForName_QByteArray(long name);

    private native static com.trolltech.qt.core.QTextCodec codecForName(com.trolltech.qt.QNativePointer name);

/**
Sets the codec used by QString to convert to and from <tt>const char *</tt> and QByteArrays. If the <tt>codec</tt> is 0 (the default), QString assumes Latin-1. <p><b>Warning:</b> Some codecs do not preserve the characters in the ASCII range (0x00 to 0x7F). For example, the Japanese Shift-JIS encoding maps the backslash character (0x5A) to the Yen character. To avoid undesirable side-effects, we recommend avoiding such codecs with setCodecsForCString(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextCodec#codecForCStrings() codecForCStrings()}, and setCodecForTr(). <br></DD></DT>
*/

    public static void setCodecForCStrings(com.trolltech.qt.core.QTextCodec c)    {
        {
            __rcCodecForCStrings = c;
        }
        __qt_setCodecForCStrings_QTextCodec(c == null ? 0 : c.nativeId());
    }
    native static void __qt_setCodecForCStrings_QTextCodec(long c);

/**
Set the codec to <tt>c</tt>; this will be returned by {@link com.trolltech.qt.core.QTextCodec#codecForLocale() codecForLocale()}. If <tt>c</tt> is a null pointer, the codec is reset to the default. <p>This might be needed for some applications that want to use their own mechanism for setting the locale. <p>Setting this codec is not supported on DOS based Windows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextCodec#codecForLocale() codecForLocale()}. <br></DD></DT>
*/

    public static void setCodecForLocale(com.trolltech.qt.core.QTextCodec c)    {
        {
            __rcCodecForLocale = c;
        }
        __qt_setCodecForLocale_QTextCodec(c == null ? 0 : c.nativeId());
    }
    native static void __qt_setCodecForLocale_QTextCodec(long c);

    private static void setCodecForTr(com.trolltech.qt.core.QTextCodec c)    {
        {
            __rcCodecForTr = c;
        }
        __qt_setCodecForTr_QTextCodec(c == null ? 0 : c.nativeId());
    }
    native static void __qt_setCodecForTr_QTextCodec(long c);

/**
@exclude
*/

    public static native QTextCodec fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextCodec(QPrivateConstructor p) { super(p); } 

    static {
        setCodecForTr(QTextCodec.codecForName("UTF-8"));
    }

/**
Searches all installed QTextCodec objects and returns the one which best
matches <tt>name</tt>; the match is case-insensitive. Returns 0 if no codec
matching the name \a name could be found.
*/

    public static QTextCodec codecForName(String name) {
        return codecForName(com.trolltech.qt.QNativePointer.createCharPointer(name));
    }

}
