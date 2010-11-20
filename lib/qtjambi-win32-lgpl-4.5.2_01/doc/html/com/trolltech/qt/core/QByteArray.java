package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QByteArray class provides an array of bytes. QByteArray can be used to store both raw bytes (including '\0's) and traditional 8-bit '\0'-terminated strings. Using QByteArray is much more convenient than using <tt>const char *</tt>. Behind the scenes, it always ensures that the data is followed by a '\0' terminator, and uses {@link <a href="../shared.html">implicit sharing</a>} (copy-on-write) to reduce memory usage and avoid needless copying of data. <p>In addition to QByteArray, Qt also provides the QString class to store string data. For most purposes, QString is the class you want to use. It stores 16-bit Unicode characters, making it easy to store non-ASCII/non-Latin-1 characters in your application. Furthermore, QString is used throughout in the Qt API. The two main cases where QByteArray is appropriate are when you need to store raw binary data, and when memory conservation is critical (e.g., with Qt for Embedded Linux). <p>One way to initialize a QByteArray is simply to pass a <tt>const char *</tt> to its constructor. For example, the following code creates a byte array of size 5 containing the data "Hello": <pre class="snippet">
        QByteArray ba = new QByteArray("Hello");
</pre> Although the {@link com.trolltech.qt.core.QByteArray#size() size()} is 5, the byte array also maintains an extra '\0' character at the end so that if a function is used that asks for a pointer to the underlying data (e.g. a call to {@link com.trolltech.qt.core.QByteArray#data() data()}), the data pointed to is guaranteed to be '\0'-terminated. <p>QByteArray makes a deep copy of the <tt>const char *</tt> data, so you can modify it later without experiencing side effects. (If for performance reasons you don't want to take a deep copy of the character data, use QByteArray::fromRawData() instead.) <p>Another approach is to set the size of the array using {@link com.trolltech.qt.core.QByteArray#resize(int) resize()} and to initialize the data byte per byte. QByteArray uses 0-based indexes, just like C++ arrays. To access the byte at a particular index position, you can use operator[](). On non-const byte arrays, operator[]() returns a reference to a byte that can be used on the left side of an assignment. For example: <pre class="snippet">
        QByteArray ba;
        ba.resize(5);
        ba[0] = 0x3c;
        ba[1] = 0xb8;
        ba[2] = 0x64;
        ba[3] = 0x18;
        ba[4] = 0xca;
</pre> For read-only access, an alternative syntax is to use {@link com.trolltech.qt.core.QByteArray#at(int) at()}: <pre class="snippet">
        for (int i = 0; i &lt; ba.size(); ++i) {
            if (ba.at(i) &gt;= 'a' && ba.at(i) &lt;= 'f')
                System.out.println("Found character in range [a-f]");
        }
</pre> {@link com.trolltech.qt.core.QByteArray#at(int) at()} can be faster than operator[](), because it never causes a {@link <a href="../shared.html">deep copy</a>} to occur. <p>To extract many bytes at a time, use {@link com.trolltech.qt.core.QByteArray#left(int) left()}, {@link com.trolltech.qt.core.QByteArray#right(int) right()}, or {@link com.trolltech.qt.core.QByteArray#mid(int) mid()}. <p>A QByteArray can embed '\0' bytes. The {@link com.trolltech.qt.core.QByteArray#size() size()} function always returns the size of the whole array, including embedded '\0' bytes. If you want to obtain the length of the data up to and excluding the first '\0' character, call qstrlen() on the byte array. <p>After a call to {@link com.trolltech.qt.core.QByteArray#resize(int) resize()}, newly allocated bytes have undefined values. To set all the bytes to a particular value, call {@link com.trolltech.qt.core.QByteArray#fill(byte, int) fill()}. <p>To obtain a pointer to the actual character data, call {@link com.trolltech.qt.core.QByteArray#data() data()} or constData(). These functions return a pointer to the beginning of the data. The pointer is guaranteed to remain valid until a non-const function is called on the QByteArray. It is also guaranteed that the data ends with a '\0' byte. This '\0' byte is automatically provided by QByteArray and is not counted in {@link com.trolltech.qt.core.QByteArray#size() size()}. <p>QByteArray provides the following basic functions for modifying the byte data: {@link com.trolltech.qt.core.QByteArray#append(java.lang.String) append()}, {@link com.trolltech.qt.core.QByteArray#prepend(java.lang.String) prepend()}, {@link com.trolltech.qt.core.QByteArray#insert(int, com.trolltech.qt.core.QByteArray) insert()}, {@link com.trolltech.qt.core.QByteArray#replace(com.trolltech.qt.core.QByteArray, java.lang.String) replace()}, and {@link com.trolltech.qt.core.QByteArray#remove(int, int) remove()}. For example: <pre class="snippet">
        QByteArray x = new QByteArray("and");
        x.prepend("rock ");         // x == "rock and"
        x.append(" roll");          // x == "rock and roll"
        x.replace(5, 3, new QByteArray("&"));       // x == "rock & roll"
</pre> The {@link com.trolltech.qt.core.QByteArray#replace(com.trolltech.qt.core.QByteArray, java.lang.String) replace()} and {@link com.trolltech.qt.core.QByteArray#remove(int, int) remove()} functions' first two arguments are the position from which to start erasing and the number of bytes that should be erased. <p>When you {@link com.trolltech.qt.core.QByteArray#append(java.lang.String) append()} data to a non-empty array, the array will be reallocated and the new data copied to it. You can avoid this behavior by calling {@link com.trolltech.qt.core.QByteArray#reserve(int) reserve()}, which preallocates a certain amount of memory. You can also call {@link com.trolltech.qt.core.QByteArray#capacity() capacity()} to find out how much memory QByteArray actually allocated. Data appended to an empty array is not copied. <p>A frequent requirement is to remove whitespace characters from a byte array ('\n', '\t', ' ', etc.). If you want to remove whitespace from both ends of a QByteArray, use {@link com.trolltech.qt.core.QByteArray#trimmed() trimmed()}. If you want to remove whitespace from both ends and replace multiple consecutive whitespaces with a single space character within the byte array, use {@link com.trolltech.qt.core.QByteArray#simplified() simplified()}. <p>If you want to find all occurrences of a particular character or substring in a QByteArray, use {@link com.trolltech.qt.core.QByteArray#indexOf(byte) indexOf()} or {@link com.trolltech.qt.core.QByteArray#lastIndexOf(byte) lastIndexOf()}. The former searches forward starting from a given index position, the latter searches backward. Both return the index position of the character or substring if they find it; otherwise, they return -1. For example, here's a typical loop that finds all occurrences of a particular substring: <pre class="snippet">
        QByteArray ba = new QByteArray("We must be &lt;b&gt;bold&lt;/b&gt;, very &lt;b&gt;bold&lt;/b&gt;");
        int j = 0;
        while ((j = ba.indexOf("&lt;b&gt;", j)) != -1) {
            System.out.println("Found &lt;b&gt; tag at index position " + j);
            ++j;
        }
</pre> If you simply want to check whether a QByteArray contains a particular character or substring, use {@link com.trolltech.qt.core.QByteArray#contains(byte) contains()}. If you want to find out how many times a particular character or substring occurs in the byte array, use {@link com.trolltech.qt.core.QByteArray#count(byte) count()}. If you want to replace all occurrences of a particular value with another, use one of the two-parameter {@link com.trolltech.qt.core.QByteArray#replace(com.trolltech.qt.core.QByteArray, java.lang.String) replace()} overloads. <p>QByteArrays can be compared using overloaded operators such as operator&lt;(), operator&lt;=(), operator==(), operator&gt;=(), and so on. The comparison is based exclusively on the numeric values of the characters and is very fast, but is not what a human would expect. QString::localeAwareCompare() is a better choice for sorting user-interface strings. <p>For historical reasons, QByteArray distinguishes between a null byte array and an empty byte array. A null byte array is a byte array that is initialized using QByteArray's default constructor or by passing (const char *)0 to the constructor. An empty byte array is any byte array with size 0. A null byte array is always empty, but an empty byte array isn't necessarily null: <pre class="snippet">
        new QByteArray().isNull();          // returns true
        new QByteArray().isEmpty();         // returns true

        new QByteArray("").isNull();        // returns false
        new QByteArray("").isEmpty();       // returns true

        new QByteArray("abc").isNull();     // returns false
        new QByteArray("abc").isEmpty();    // returns false
</pre> All functions except {@link com.trolltech.qt.core.QByteArray#isNull() isNull()} treat null byte arrays the same as empty byte arrays. For example, {@link com.trolltech.qt.core.QByteArray#data() data()} returns a pointer to a '\0' character for a null byte array (not a null pointer), and QByteArray() compares equal to QByteArray(""). We recommend that you always use {@link com.trolltech.qt.core.QByteArray#isEmpty() isEmpty()} and avoid {@link com.trolltech.qt.core.QByteArray#isNull() isNull()}.<a name="notes-on-locale"><h2>Notes on Locale</h2><a name="number-string-conversions"><h3>Number-String Conversions</h3> Functions that perform conversions between numeric data types and strings are performed in the C locale, irrespective of the user's locale settings. Use QString to perform locale-aware conversions between numbers and strings.<a name="8-bit-character-comparisons"><h3>8-bit Character Comparisons</h3> In QByteArray, the notion of uppercase and lowercase and of which character is greater than or less than another character is locale dependent. This affects functions that support a case insensitive option or that compare or lowercase or uppercase their arguments. Case insensitive operations and comparisons will be accurate if both strings contain only ASCII characters. (If <tt>$LC_CTYPE</tt> is set, most Unix systems do "the right thing".) Functions that this affects include {@link com.trolltech.qt.core.QByteArray#contains(byte) contains()}, {@link com.trolltech.qt.core.QByteArray#indexOf(byte) indexOf()}, {@link com.trolltech.qt.core.QByteArray#lastIndexOf(byte) lastIndexOf()}, operator&lt;(), operator&lt;=(), operator&gt;(), operator&gt;=(), {@link com.trolltech.qt.core.QByteArray#toLower() toLower()} and {@link com.trolltech.qt.core.QByteArray#toUpper() toUpper()}. <p>This issue does not apply to QStrings since they represent characters using Unicode. <p><DT><b>See also:</b><br><DD>QString, and {@link com.trolltech.qt.core.QBitArray QBitArray}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QByteArray extends com.trolltech.qt.QtJambiObject
    implements java.lang.Comparable<Object>,
            java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

    public QByteArray(){
        super((QPrivateConstructor)null);
        __qt_QByteArray();
    }

    native void __qt_QByteArray();

/**
Constructs a copy of <tt>other</tt>. <p>This operation takes {@link <a href="../containers.html">constant time</a>}, because QByteArray is {@link <a href="../shared.html">implicitly shared</a>}. This makes returning a QByteArray from a function very fast. If a shared instance is modified, it will be copied (copy-on-write), and that takes {@link <a href="../containers.html">linear time</a>}. <p><DT><b>See also:</b><br><DD>operator=(). <br></DD></DT>
*/

    public QByteArray(com.trolltech.qt.core.QByteArray arg__1){
        super((QPrivateConstructor)null);
        __qt_QByteArray_QByteArray(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QByteArray_QByteArray(long arg__1);

    private QByteArray(com.trolltech.qt.QNativePointer arg__1, int size){
        super((QPrivateConstructor)null);
        __qt_QByteArray_nativepointer_int(arg__1, size);
    }

    native void __qt_QByteArray_nativepointer_int(com.trolltech.qt.QNativePointer arg__1, int size);

/**
Constructs a byte array of size <tt>size</tt> with every byte set to character <tt>ch</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#fill(byte, int) fill()}. <br></DD></DT>
*/

    public QByteArray(int size, byte c){
        super((QPrivateConstructor)null);
        __qt_QByteArray_int_byte(size, c);
    }

    native void __qt_QByteArray_int_byte(int size, byte c);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer append_private(byte c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_append_private_byte(nativeId(), c);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_append_private_byte(long __this__nativeId, byte c);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer append_private(com.trolltech.qt.core.QByteArray a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_append_private_QByteArray(nativeId(), a == null ? 0 : a.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_append_private_QByteArray(long __this__nativeId, long a);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer append_private(java.lang.String s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_append_private_String(nativeId(), s);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_append_private_String(long __this__nativeId, java.lang.String s);

/**
Returns the character at index position <tt>i</tt> in the byte array. <p><tt>i</tt> must be a valid index position in the byte array (i.e., 0 &lt;= <tt>i</tt> &lt; {@link com.trolltech.qt.core.QByteArray#size() size()}). <p><DT><b>See also:</b><br><DD>operator[](). <br></DD></DT>
*/

    @QtBlockedSlot
    public final byte at(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_at_int(nativeId(), i);
    }
    @QtBlockedSlot
    native byte __qt_at_int(long __this__nativeId, int i);

/**
Returns the maximum number of bytes that can be stored in the byte array without forcing a reallocation. <p>The sole purpose of this function is to provide a means of fine tuning QByteArray's memory usage. In general, you will rarely ever need to call this function. If you want to know how many bytes are in the byte array, call {@link com.trolltech.qt.core.QByteArray#size() size()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#reserve(int) reserve()}, and {@link com.trolltech.qt.core.QByteArray#squeeze() squeeze()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int capacity()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_capacity(nativeId());
    }
    @QtBlockedSlot
    native int __qt_capacity(long __this__nativeId);

/**
Removes <tt>n</tt> bytes from the end of the byte array. <p>If <tt>n</tt> is greater than {@link com.trolltech.qt.core.QByteArray#size() size()}, the result is an empty byte array. <p>Example: <pre class="snippet">
        QByteArray ba = new QByteArray("STARTTLS\r\n");
        ba.chop(2);                 // ba == "STARTTLS"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#truncate(int) truncate()}, {@link com.trolltech.qt.core.QByteArray#resize(int) resize()}, and {@link com.trolltech.qt.core.QByteArray#left(int) left()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void chop(int n)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_chop_int(nativeId(), n);
    }
    @QtBlockedSlot
    native void __qt_chop_int(long __this__nativeId, int n);

/**
Clears the contents of the byte array and makes it empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#resize(int) resize()}, and {@link com.trolltech.qt.core.QByteArray#isEmpty() isEmpty()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clear()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if the byte array contains the character <tt>ch</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean contains(byte c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_byte(nativeId(), c);
    }
    @QtBlockedSlot
    native boolean __qt_contains_byte(long __this__nativeId, byte c);

/**
Returns true if the byte array contains an occurrence of the byte array <tt>ba</tt>; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#indexOf(byte) indexOf()}, and {@link com.trolltech.qt.core.QByteArray#count(byte) count()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean contains(com.trolltech.qt.core.QByteArray a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_QByteArray(nativeId(), a == null ? 0 : a.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_contains_QByteArray(long __this__nativeId, long a);

/**
This is an overloaded member function, provided for convenience. <p>Returns the number of occurrences of character <tt>ch</tt> in the byte array. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#contains(byte) contains()}, and {@link com.trolltech.qt.core.QByteArray#indexOf(byte) indexOf()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int count(byte c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count_byte(nativeId(), c);
    }
    @QtBlockedSlot
    native int __qt_count_byte(long __this__nativeId, byte c);

/**
Returns the number of (potentially overlapping) occurrences of byte array <tt>ba</tt> in this byte array. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#contains(byte) contains()}, and {@link com.trolltech.qt.core.QByteArray#indexOf(byte) indexOf()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int count(com.trolltech.qt.core.QByteArray a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count_QByteArray(nativeId(), a == null ? 0 : a.nativeId());
    }
    @QtBlockedSlot
    native int __qt_count_QByteArray(long __this__nativeId, long a);

/**
Returns a pointer to the data stored in the byte array. The pointer can be used to access and modify the bytes that compose the array. The data is '\0'-terminated. <p>Example: <pre class="snippet">
        QByteArray ba = new QByteArray("Hello world");
        QNativePointer data = ba.data();

        int i = 0;
        while (data.byteAt(i) != 0) {
            System.out.println("[" + data.byteAt(i) + "]");
            ++i;
        }
</pre> The pointer remains valid as long as the byte array isn't reallocated or destroyed. For read-only access, constData() is faster because it never causes a {@link <a href="../shared.html">deep copy</a>} to occur. <p>This function is mostly useful to pass a byte array to a function that accepts a <tt>const char *</tt>. <p>Note: A QByteArray can store any byte values including '\0's, but most functions that take <tt>char *</tt> arguments assume that the data ends at the first '\0' they encounter. <p><DT><b>See also:</b><br><DD>constData(), and operator[](). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.QNativePointer data()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_data(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if this byte array ends with character <tt>ch</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean endsWith(byte c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endsWith_byte(nativeId(), c);
    }
    @QtBlockedSlot
    native boolean __qt_endsWith_byte(long __this__nativeId, byte c);

/**
Returns true if this byte array ends with byte array <tt>ba</tt>; otherwise returns false. <p>Example: <pre class="snippet">
        QByteArray url = new QByteArray("http://www.trolltech.com/index.html");
        if (url.endsWith(".html"))
            System.out.println("foo");
            // ...
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#startsWith(byte) startsWith()}, and {@link com.trolltech.qt.core.QByteArray#right(int) right()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean endsWith(com.trolltech.qt.core.QByteArray a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_endsWith_QByteArray(nativeId(), a == null ? 0 : a.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_endsWith_QByteArray(long __this__nativeId, long a);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer fill_private(byte c, int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fill_private_byte_int(nativeId(), c, size);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_fill_private_byte_int(long __this__nativeId, byte c, int size);


/**
This is an overloaded member function, provided for convenience. <p>Returns the index position of the first occurrence of the character <tt>ch</tt> in the byte array, searching forward from index position <tt>from</tt>. Returns -1 if <tt>ch</tt> could not be found. <p>Example: <pre class="snippet">
        QByteArray ba = new QByteArray("ABCBA");
        ba.indexOf("B");            // returns 1
        ba.indexOf("B", 1);         // returns 1
        ba.indexOf("B", 2);         // returns 3
        ba.indexOf("X");            // returns -1
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#lastIndexOf(byte) lastIndexOf()}, and {@link com.trolltech.qt.core.QByteArray#contains(byte) contains()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indexOf(byte c) {
        return indexOf(c, (int)0);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns the index position of the first occurrence of the character <tt>ch</tt> in the byte array, searching forward from index position <tt>from</tt>. Returns -1 if <tt>ch</tt> could not be found. <p>Example: <pre class="snippet">
        QByteArray ba = new QByteArray("ABCBA");
        ba.indexOf("B");            // returns 1
        ba.indexOf("B", 1);         // returns 1
        ba.indexOf("B", 2);         // returns 3
        ba.indexOf("X");            // returns -1
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#lastIndexOf(byte) lastIndexOf()}, and {@link com.trolltech.qt.core.QByteArray#contains(byte) contains()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indexOf(byte c, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOf_byte_int(nativeId(), c, from);
    }
    @QtBlockedSlot
    native int __qt_indexOf_byte_int(long __this__nativeId, byte c, int from);


/**
Returns the index position of the first occurrence of the byte array <tt>ba</tt> in this byte array, searching forward from index position <tt>from</tt>. Returns -1 if <tt>ba</tt> could not be found. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("sticky question");
        QByteArray y = new QByteArray("sti");
        x.indexOf(y);               // returns 0
        x.indexOf(y, 1);            // returns 10
        x.indexOf(y, 10);           // returns 10
        x.indexOf(y, 11);           // returns -1
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#lastIndexOf(byte) lastIndexOf()}, {@link com.trolltech.qt.core.QByteArray#contains(byte) contains()}, and {@link com.trolltech.qt.core.QByteArray#count(byte) count()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.core.QByteArray a) {
        return indexOf(a, (int)0);
    }
/**
Returns the index position of the first occurrence of the byte array <tt>ba</tt> in this byte array, searching forward from index position <tt>from</tt>. Returns -1 if <tt>ba</tt> could not be found. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("sticky question");
        QByteArray y = new QByteArray("sti");
        x.indexOf(y);               // returns 0
        x.indexOf(y, 1);            // returns 10
        x.indexOf(y, 10);           // returns 10
        x.indexOf(y, 11);           // returns -1
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#lastIndexOf(byte) lastIndexOf()}, {@link com.trolltech.qt.core.QByteArray#contains(byte) contains()}, and {@link com.trolltech.qt.core.QByteArray#count(byte) count()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.core.QByteArray a, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOf_QByteArray_int(nativeId(), a == null ? 0 : a.nativeId(), from);
    }
    @QtBlockedSlot
    native int __qt_indexOf_QByteArray_int(long __this__nativeId, long a, int from);


/**
This is an overloaded member function, provided for convenience. <p>Returns the index position of the first occurrence of the string <tt>str</tt> in the byte array, searching forward from index position <tt>from</tt>. Returns -1 if <tt>str</tt> could not be found. <p>The Unicode data is converted into 8-bit characters using QString::toAscii(). <p>If the QString contains non-ASCII Unicode characters, using this function can lead to loss of information. You can disable this function by defining <tt>QT_NO_CAST_TO_ASCII</tt> when you compile your applications. You then need to call QString::toAscii() (or QString::toLatin1() or QString::toUtf8() or QString::toLocal8Bit()) explicitly if you want to convert the data to <tt>const char *</tt>.
*/

    @QtBlockedSlot
    public final int indexOf(java.lang.String s) {
        return indexOf(s, (int)0);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns the index position of the first occurrence of the string <tt>str</tt> in the byte array, searching forward from index position <tt>from</tt>. Returns -1 if <tt>str</tt> could not be found. <p>The Unicode data is converted into 8-bit characters using QString::toAscii(). <p>If the QString contains non-ASCII Unicode characters, using this function can lead to loss of information. You can disable this function by defining <tt>QT_NO_CAST_TO_ASCII</tt> when you compile your applications. You then need to call QString::toAscii() (or QString::toLatin1() or QString::toUtf8() or QString::toLocal8Bit()) explicitly if you want to convert the data to <tt>const char *</tt>.
*/

    @QtBlockedSlot
    public final int indexOf(java.lang.String s, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOf_String_int(nativeId(), s, from);
    }
    @QtBlockedSlot
    native int __qt_indexOf_String_int(long __this__nativeId, java.lang.String s, int from);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer insert_private(int i, byte c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insert_private_int_byte(nativeId(), i, c);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_insert_private_int_byte(long __this__nativeId, int i, byte c);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer insert_private(int i, com.trolltech.qt.core.QByteArray a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insert_private_int_QByteArray(nativeId(), i, a == null ? 0 : a.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_insert_private_int_QByteArray(long __this__nativeId, int i, long a);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer insert_private(int i, java.lang.String s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insert_private_int_String(nativeId(), i, s);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_insert_private_int_String(long __this__nativeId, int i, java.lang.String s);

/**
Returns true if the byte array has size 0; otherwise returns false. <p>Example: <pre class="snippet">
        new QByteArray().isEmpty();         // returns true
        new QByteArray("").isEmpty();       // returns true
        new QByteArray("abc").isEmpty();    // returns false
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#size() size()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isEmpty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);

/**
Returns true if this byte array is null; otherwise returns false. <p>Example: <pre class="snippet">
        new QByteArray().isNull();          // returns true
        new QByteArray("").isNull();        // returns false
        new QByteArray("abc").isNull();     // returns false
</pre> Qt makes a distinction between null byte arrays and empty byte arrays for historical reasons. For most applications, what matters is whether or not a byte array contains any data, and this can be determined using {@link com.trolltech.qt.core.QByteArray#isEmpty() isEmpty()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#isEmpty() isEmpty()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);


/**
This is an overloaded member function, provided for convenience. <p>Returns the index position of the last occurrence of character <tt>ch</tt> in the byte array, searching backward from index position <tt>from</tt>. If <tt>from</tt> is -1 (the default), the search starts at the last ({@link com.trolltech.qt.core.QByteArray#size() size()} - 1) byte. Returns -1 if <tt>ch</tt> could not be found. <p>Example: <pre class="snippet">
        QByteArray ba = new QByteArray("ABCBA");
        ba.lastIndexOf("B");        // returns 3
        ba.lastIndexOf("B", 3);     // returns 3
        ba.lastIndexOf("B", 2);     // returns 1
        ba.lastIndexOf("X");        // returns -1
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#indexOf(byte) indexOf()}, and {@link com.trolltech.qt.core.QByteArray#contains(byte) contains()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lastIndexOf(byte c) {
        return lastIndexOf(c, (int)-1);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns the index position of the last occurrence of character <tt>ch</tt> in the byte array, searching backward from index position <tt>from</tt>. If <tt>from</tt> is -1 (the default), the search starts at the last ({@link com.trolltech.qt.core.QByteArray#size() size()} - 1) byte. Returns -1 if <tt>ch</tt> could not be found. <p>Example: <pre class="snippet">
        QByteArray ba = new QByteArray("ABCBA");
        ba.lastIndexOf("B");        // returns 3
        ba.lastIndexOf("B", 3);     // returns 3
        ba.lastIndexOf("B", 2);     // returns 1
        ba.lastIndexOf("X");        // returns -1
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#indexOf(byte) indexOf()}, and {@link com.trolltech.qt.core.QByteArray#contains(byte) contains()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lastIndexOf(byte c, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastIndexOf_byte_int(nativeId(), c, from);
    }
    @QtBlockedSlot
    native int __qt_lastIndexOf_byte_int(long __this__nativeId, byte c, int from);


/**
Returns the index position of the last occurrence of the byte array <tt>ba</tt> in this byte array, searching backward from index position <tt>from</tt>. If <tt>from</tt> is -1 (the default), the search starts at the last byte. Returns -1 if <tt>ba</tt> could not be found. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("crazy azimuths");
        QByteArray y = new QByteArray("azy");
        x.lastIndexOf(y);           // returns 6
        x.lastIndexOf(y, 6);        // returns 6
        x.lastIndexOf(y, 5);        // returns 2
        x.lastIndexOf(y, 1);        // returns -1
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#indexOf(byte) indexOf()}, {@link com.trolltech.qt.core.QByteArray#contains(byte) contains()}, and {@link com.trolltech.qt.core.QByteArray#count(byte) count()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lastIndexOf(com.trolltech.qt.core.QByteArray a) {
        return lastIndexOf(a, (int)-1);
    }
/**
Returns the index position of the last occurrence of the byte array <tt>ba</tt> in this byte array, searching backward from index position <tt>from</tt>. If <tt>from</tt> is -1 (the default), the search starts at the last byte. Returns -1 if <tt>ba</tt> could not be found. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("crazy azimuths");
        QByteArray y = new QByteArray("azy");
        x.lastIndexOf(y);           // returns 6
        x.lastIndexOf(y, 6);        // returns 6
        x.lastIndexOf(y, 5);        // returns 2
        x.lastIndexOf(y, 1);        // returns -1
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#indexOf(byte) indexOf()}, {@link com.trolltech.qt.core.QByteArray#contains(byte) contains()}, and {@link com.trolltech.qt.core.QByteArray#count(byte) count()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lastIndexOf(com.trolltech.qt.core.QByteArray a, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastIndexOf_QByteArray_int(nativeId(), a == null ? 0 : a.nativeId(), from);
    }
    @QtBlockedSlot
    native int __qt_lastIndexOf_QByteArray_int(long __this__nativeId, long a, int from);


/**
This is an overloaded member function, provided for convenience. <p>Returns the index position of the last occurrence of the string <tt>str</tt> in the byte array, searching backward from index position <tt>from</tt>. If <tt>from</tt> is -1 (the default), the search starts at the last ({@link com.trolltech.qt.core.QByteArray#size() size()} - 1) byte. Returns -1 if <tt>str</tt> could not be found. <p>The Unicode data is converted into 8-bit characters using QString::toAscii(). <p>If the QString contains non-ASCII Unicode characters, using this function can lead to loss of information. You can disable this function by defining <tt>QT_NO_CAST_TO_ASCII</tt> when you compile your applications. You then need to call QString::toAscii() (or QString::toLatin1() or QString::toUtf8() or QString::toLocal8Bit()) explicitly if you want to convert the data to <tt>const char *</tt>.
*/

    @QtBlockedSlot
    public final int lastIndexOf(java.lang.String s) {
        return lastIndexOf(s, (int)-1);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns the index position of the last occurrence of the string <tt>str</tt> in the byte array, searching backward from index position <tt>from</tt>. If <tt>from</tt> is -1 (the default), the search starts at the last ({@link com.trolltech.qt.core.QByteArray#size() size()} - 1) byte. Returns -1 if <tt>str</tt> could not be found. <p>The Unicode data is converted into 8-bit characters using QString::toAscii(). <p>If the QString contains non-ASCII Unicode characters, using this function can lead to loss of information. You can disable this function by defining <tt>QT_NO_CAST_TO_ASCII</tt> when you compile your applications. You then need to call QString::toAscii() (or QString::toLatin1() or QString::toUtf8() or QString::toLocal8Bit()) explicitly if you want to convert the data to <tt>const char *</tt>.
*/

    @QtBlockedSlot
    public final int lastIndexOf(java.lang.String s, int from)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastIndexOf_String_int(nativeId(), s, from);
    }
    @QtBlockedSlot
    native int __qt_lastIndexOf_String_int(long __this__nativeId, java.lang.String s, int from);

/**
Returns a byte array that contains the leftmost <tt>len</tt> bytes of this byte array. <p>The entire byte array is returned if <tt>len</tt> is greater than {@link com.trolltech.qt.core.QByteArray#size() size()}. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("Pineapple");
        QByteArray y = x.left(4);
        // y == "Pine"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#right(int) right()}, {@link com.trolltech.qt.core.QByteArray#mid(int) mid()}, {@link com.trolltech.qt.core.QByteArray#startsWith(byte) startsWith()}, and {@link com.trolltech.qt.core.QByteArray#truncate(int) truncate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray left(int len)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_left_int(nativeId(), len);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_left_int(long __this__nativeId, int len);


/**
Returns a byte array of size <tt>width</tt> that contains this byte array padded by the <tt>fill</tt> character. <p>If <tt>truncate</tt> is false and the {@link com.trolltech.qt.core.QByteArray#size() size()} of the byte array is more than <tt>width</tt>, then the returned byte array is a copy of this byte array. <p>If <tt>truncate</tt> is true and the {@link com.trolltech.qt.core.QByteArray#size() size()} of the byte array is more than <tt>width</tt>, then any bytes in a copy of the byte array after position <tt>width</tt> are removed, and the copy is returned. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("apple");
        QByteArray y = x.leftJustified(8, (byte)'.', false);   // y == "apple..."
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#rightJustified(int, byte) rightJustified()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray leftJustified(int width, byte fill) {
        return leftJustified(width, fill, (boolean)false);
    }

/**
Returns a byte array of size <tt>width</tt> that contains this byte array padded by the <tt>fill</tt> character. <p>If <tt>truncate</tt> is false and the {@link com.trolltech.qt.core.QByteArray#size() size()} of the byte array is more than <tt>width</tt>, then the returned byte array is a copy of this byte array. <p>If <tt>truncate</tt> is true and the {@link com.trolltech.qt.core.QByteArray#size() size()} of the byte array is more than <tt>width</tt>, then any bytes in a copy of the byte array after position <tt>width</tt> are removed, and the copy is returned. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("apple");
        QByteArray y = x.leftJustified(8, (byte)'.', false);   // y == "apple..."
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#rightJustified(int, byte) rightJustified()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray leftJustified(int width) {
        return leftJustified(width, (byte)' ', (boolean)false);
    }
/**
Returns a byte array of size <tt>width</tt> that contains this byte array padded by the <tt>fill</tt> character. <p>If <tt>truncate</tt> is false and the {@link com.trolltech.qt.core.QByteArray#size() size()} of the byte array is more than <tt>width</tt>, then the returned byte array is a copy of this byte array. <p>If <tt>truncate</tt> is true and the {@link com.trolltech.qt.core.QByteArray#size() size()} of the byte array is more than <tt>width</tt>, then any bytes in a copy of the byte array after position <tt>width</tt> are removed, and the copy is returned. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("apple");
        QByteArray y = x.leftJustified(8, (byte)'.', false);   // y == "apple..."
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#rightJustified(int, byte) rightJustified()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray leftJustified(int width, byte fill, boolean truncate)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_leftJustified_int_byte_boolean(nativeId(), width, fill, truncate);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_leftJustified_int_byte_boolean(long __this__nativeId, int width, byte fill, boolean truncate);

/**
Same as {@link com.trolltech.qt.core.QByteArray#size() size()}.
*/

    @QtBlockedSlot
    public final int length()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_length(nativeId());
    }
    @QtBlockedSlot
    native int __qt_length(long __this__nativeId);


/**
Returns a byte array containing <tt>len</tt> bytes from this byte array, starting at position <tt>pos</tt>. <p>If <tt>len</tt> is -1 (the default), or <tt>pos</tt> + <tt>len</tt> &gt;= {@link com.trolltech.qt.core.QByteArray#size() size()}, returns a byte array containing all bytes starting at position <tt>pos</tt> until the end of the byte array. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("Five pineapples");
        QByteArray y = x.mid(5, 4);     // y == "pine"
        QByteArray z = x.mid(5);        // z == "pineapples"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#left(int) left()}, and {@link com.trolltech.qt.core.QByteArray#right(int) right()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray mid(int index) {
        return mid(index, (int)-1);
    }
/**
Returns a byte array containing <tt>len</tt> bytes from this byte array, starting at position <tt>pos</tt>. <p>If <tt>len</tt> is -1 (the default), or <tt>pos</tt> + <tt>len</tt> &gt;= {@link com.trolltech.qt.core.QByteArray#size() size()}, returns a byte array containing all bytes starting at position <tt>pos</tt> until the end of the byte array. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("Five pineapples");
        QByteArray y = x.mid(5, 4);     // y == "pine"
        QByteArray z = x.mid(5);        // z == "pineapples"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#left(int) left()}, and {@link com.trolltech.qt.core.QByteArray#right(int) right()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray mid(int index, int len)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mid_int_int(nativeId(), index, len);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_mid_int_int(long __this__nativeId, int index, int len);

    @QtBlockedSlot
    private final boolean operator_less(com.trolltech.qt.core.QByteArray a2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QByteArray(nativeId(), a2 == null ? 0 : a2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QByteArray(long __this__nativeId, long a2);

    @QtBlockedSlot
    private final boolean operator_less(java.lang.String s2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_String(nativeId(), s2);
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_String(long __this__nativeId, java.lang.String s2);

/**
<brief>Writes thisQByteArray
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_assign(com.trolltech.qt.core.QByteArray arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_assign_QByteArray(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_assign_QByteArray(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.core.QByteArray a2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QByteArray(nativeId(), a2 == null ? 0 : a2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QByteArray(long __this__nativeId, long a2);

    @QtBlockedSlot
    private final boolean operator_equal(java.lang.String s2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_String(nativeId(), s2);
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_String(long __this__nativeId, java.lang.String s2);

/**
<brief>Reads a QByteArray
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer prepend_private(byte c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prepend_private_byte(nativeId(), c);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_prepend_private_byte(long __this__nativeId, byte c);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer prepend_private(com.trolltech.qt.core.QByteArray a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prepend_private_QByteArray(nativeId(), a == null ? 0 : a.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_prepend_private_QByteArray(long __this__nativeId, long a);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer remove_private(int index, int len)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_remove_private_int_int(nativeId(), index, len);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_remove_private_int_int(long __this__nativeId, int index, int len);

/**
Returns a copy of this byte array repeated the specified number of <tt>times</tt>. <p>If <tt>times</tt> is less than 1, an empty byte array is returned. <p>Example:<pre>QByteArray ba("ab");
ba.repeated(4);             // returns "abababab"</pre>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray repeated(int times)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_repeated_int(nativeId(), times);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_repeated_int(long __this__nativeId, int times);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer replace_private(byte before, byte after)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_replace_private_byte_byte(nativeId(), before, after);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_replace_private_byte_byte(long __this__nativeId, byte before, byte after);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer replace_private(byte before, com.trolltech.qt.core.QByteArray after)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_replace_private_byte_QByteArray(nativeId(), before, after == null ? 0 : after.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_replace_private_byte_QByteArray(long __this__nativeId, byte before, long after);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer replace_private(byte c, java.lang.String after)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_replace_private_byte_String(nativeId(), c, after);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_replace_private_byte_String(long __this__nativeId, byte c, java.lang.String after);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer replace_private(com.trolltech.qt.core.QByteArray before, com.trolltech.qt.core.QByteArray after)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_replace_private_QByteArray_QByteArray(nativeId(), before == null ? 0 : before.nativeId(), after == null ? 0 : after.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_replace_private_QByteArray_QByteArray(long __this__nativeId, long before, long after);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer replace_private(java.lang.String before, com.trolltech.qt.core.QByteArray after)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_replace_private_String_QByteArray(nativeId(), before, after == null ? 0 : after.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_replace_private_String_QByteArray(long __this__nativeId, java.lang.String before, long after);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer replace_private(int index, int len, com.trolltech.qt.core.QByteArray s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_replace_private_int_int_QByteArray(nativeId(), index, len, s == null ? 0 : s.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_replace_private_int_int_QByteArray(long __this__nativeId, int index, int len, long s);

/**
Attempts to allocate memory for at least <tt>size</tt> bytes. If you know in advance how large the byte array will be, you can call this function, and if you call {@link com.trolltech.qt.core.QByteArray#resize(int) resize()} often you are likely to get better performance. If <tt>size</tt> is an underestimate, the worst that will happen is that the QByteArray will be a bit slower. <p>The sole purpose of this function is to provide a means of fine tuning QByteArray's memory usage. In general, you will rarely ever need to call this function. If you want to change the size of the byte array, call {@link com.trolltech.qt.core.QByteArray#resize(int) resize()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#squeeze() squeeze()}, and {@link com.trolltech.qt.core.QByteArray#capacity() capacity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void reserve(int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reserve_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_reserve_int(long __this__nativeId, int size);

/**
Sets the size of the byte array to <tt>size</tt> bytes. <p>If <tt>size</tt> is greater than the current size, the byte array is extended to make it <tt>size</tt> bytes with the extra bytes added to the end. The new bytes are uninitialized. <p>If <tt>size</tt> is less than the current size, bytes are removed from the end. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#size() size()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resize(int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resize_int(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_resize_int(long __this__nativeId, int size);

/**
Returns a byte array that contains the rightmost <tt>len</tt> bytes of this byte array. <p>The entire byte array is returned if <tt>len</tt> is greater than {@link com.trolltech.qt.core.QByteArray#size() size()}. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("Pineapple");
        QByteArray y = x.right(5);
        // y == "apple"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#endsWith(byte) endsWith()}, {@link com.trolltech.qt.core.QByteArray#left(int) left()}, and {@link com.trolltech.qt.core.QByteArray#mid(int) mid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray right(int len)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_right_int(nativeId(), len);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_right_int(long __this__nativeId, int len);


/**
Returns a byte array of size <tt>width</tt> that contains the <tt>fill</tt> character followed by this byte array. <p>If <tt>truncate</tt> is false and the size of the byte array is more than <tt>width</tt>, then the returned byte array is a copy of this byte array. <p>If <tt>truncate</tt> is true and the size of the byte array is more than <tt>width</tt>, then the resulting byte array is truncated at position <tt>width</tt>. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("apple");
        QByteArray y = x.rightJustified(8, (byte)'.', false);    // y == "...apple"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#leftJustified(int, byte) leftJustified()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray rightJustified(int width, byte fill) {
        return rightJustified(width, fill, (boolean)false);
    }

/**
Returns a byte array of size <tt>width</tt> that contains the <tt>fill</tt> character followed by this byte array. <p>If <tt>truncate</tt> is false and the size of the byte array is more than <tt>width</tt>, then the returned byte array is a copy of this byte array. <p>If <tt>truncate</tt> is true and the size of the byte array is more than <tt>width</tt>, then the resulting byte array is truncated at position <tt>width</tt>. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("apple");
        QByteArray y = x.rightJustified(8, (byte)'.', false);    // y == "...apple"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#leftJustified(int, byte) leftJustified()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray rightJustified(int width) {
        return rightJustified(width, (byte)' ', (boolean)false);
    }
/**
Returns a byte array of size <tt>width</tt> that contains the <tt>fill</tt> character followed by this byte array. <p>If <tt>truncate</tt> is false and the size of the byte array is more than <tt>width</tt>, then the returned byte array is a copy of this byte array. <p>If <tt>truncate</tt> is true and the size of the byte array is more than <tt>width</tt>, then the resulting byte array is truncated at position <tt>width</tt>. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("apple");
        QByteArray y = x.rightJustified(8, (byte)'.', false);    // y == "...apple"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#leftJustified(int, byte) leftJustified()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray rightJustified(int width, byte fill, boolean truncate)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rightJustified_int_byte_boolean(nativeId(), width, fill, truncate);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_rightJustified_int_byte_boolean(long __this__nativeId, int width, byte fill, boolean truncate);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer setNum_private(double arg__1, byte f, int prec)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setNum_private_double_byte_int(nativeId(), arg__1, f, prec);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_setNum_private_double_byte_int(long __this__nativeId, double arg__1, byte f, int prec);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer setNum_private(float arg__1, byte f, int prec)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setNum_private_float_byte_int(nativeId(), arg__1, f, prec);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_setNum_private_float_byte_int(long __this__nativeId, float arg__1, byte f, int prec);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer setNum_private(int arg__1, int base)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setNum_private_int_int(nativeId(), arg__1, base);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_setNum_private_int_int(long __this__nativeId, int arg__1, int base);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer setNum_private(long arg__1, int base)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setNum_private_long_int(nativeId(), arg__1, base);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_setNum_private_long_int(long __this__nativeId, long arg__1, int base);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer setNum_private(char arg__1, int base)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setNum_private_char_int(nativeId(), arg__1, base);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_setNum_private_char_int(long __this__nativeId, char arg__1, int base);

/**
Returns a byte array that has whitespace removed from the start and the end, and which has each sequence of internal whitespace replaced with a single space. <p>Whitespace means any character for which the standard C++ isspace() function returns true. This includes the ASCII characters '\t', '\n', '\v', '\f', '\r', and ' '. <p>Example: <pre class="snippet">
        QByteArray ba = new QByteArray("  lots\t of\nwhitespace\r\n ");
        ba = ba.simplified();
        // ba == "lots of whitespace";
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#trimmed() trimmed()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray simplified()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_simplified(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_simplified(long __this__nativeId);

/**
Returns the number of bytes in this byte array. <p>The last byte in the byte array is at position {@link com.trolltech.qt.core.QByteArray#size() size()} - 1. In addition, QByteArray ensures that the byte at position {@link com.trolltech.qt.core.QByteArray#size() size()} is always '\0', so that you can use the return value of {@link com.trolltech.qt.core.QByteArray#data() data()} and constData() as arguments to functions that expect '\0'-terminated strings. <p>Example: <pre class="snippet">
        QByteArray ba = new QByteArray("Hello");
        int n = ba.size();          // n == 5
        byte a = ba.at(0);               // returns 'H'
        byte b = ba.at(4);               // returns 'o'
        byte c = ba.at(5);               // returns '\0'
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#isEmpty() isEmpty()}, and {@link com.trolltech.qt.core.QByteArray#resize(int) resize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native int __qt_size(long __this__nativeId);

/**
Splits the byte array into subarrays wherever <tt>sep</tt> occurs, and returns the list of those arrays. If <tt>sep</tt> does not match anywhere in the byte array, {@link com.trolltech.qt.core.QByteArray#split(byte) split()} returns a single-element list containing this byte array.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QByteArray> split(byte sep)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_split_byte(nativeId(), sep);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QByteArray> __qt_split_byte(long __this__nativeId, byte sep);

/**
Releases any memory not required to store the array's data. <p>The sole purpose of this function is to provide a means of fine tuning QByteArray's memory usage. In general, you will rarely ever need to call this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#reserve(int) reserve()}, and {@link com.trolltech.qt.core.QByteArray#capacity() capacity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void squeeze()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_squeeze(nativeId());
    }
    @QtBlockedSlot
    native void __qt_squeeze(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if this byte array starts with character <tt>ch</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean startsWith(byte c)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startsWith_byte(nativeId(), c);
    }
    @QtBlockedSlot
    native boolean __qt_startsWith_byte(long __this__nativeId, byte c);

/**
Returns true if this byte array starts with byte array <tt>ba</tt>; otherwise returns false. <p>Example: <pre class="snippet">
        QByteArray url = new QByteArray("ftp://ftp.trolltech.com/");
        if (url.startsWith("ftp:"))
            System.out.println("foo");
            // ...
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#endsWith(byte) endsWith()}, and {@link com.trolltech.qt.core.QByteArray#left(int) left()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean startsWith(com.trolltech.qt.core.QByteArray a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startsWith_QByteArray(nativeId(), a == null ? 0 : a.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_startsWith_QByteArray(long __this__nativeId, long a);

/**
Returns a copy of the byte array, encoded as Base64. <pre class="snippet">
        QByteArray text = new QByteArray("Qt is great!");
        text.toBase64();        // returns "UXQgaXMgZ3JlYXQh"
</pre> The algorithm used to encode Base64-encoded data is defined in {@link <a href="../http-www-rfc-editor-org-rfc-rfc2045-txt.html">RFC 2045</a>}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#fromBase64(com.trolltech.qt.core.QByteArray) fromBase64()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toBase64()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toBase64(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_toBase64(long __this__nativeId);

    @QtBlockedSlot
    private final double toDouble_private(com.trolltech.qt.QNativePointer ok)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toDouble_private_nativepointer(nativeId(), ok);
    }
    @QtBlockedSlot
    native double __qt_toDouble_private_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer ok);

    @QtBlockedSlot
    private final float toFloat_private(com.trolltech.qt.QNativePointer ok)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toFloat_private_nativepointer(nativeId(), ok);
    }
    @QtBlockedSlot
    native float __qt_toFloat_private_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer ok);

/**
Returns a hex encoded copy of the byte array. The hex encoding uses the numbers 0-9 and the letters a-f. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#fromHex(com.trolltech.qt.core.QByteArray) fromHex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toHex()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toHex(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_toHex(long __this__nativeId);

    @QtBlockedSlot
    private final int toInt_private(com.trolltech.qt.QNativePointer ok, int base)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toInt_private_nativepointer_int(nativeId(), ok, base);
    }
    @QtBlockedSlot
    native int __qt_toInt_private_nativepointer_int(long __this__nativeId, com.trolltech.qt.QNativePointer ok, int base);

/**
Returns a lowercase copy of the byte array. The bytearray is interpreted as a Latin-1 encoded string. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("TROlltECH");
        QByteArray y = x.toLower();
        // y == "trolltech"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#toUpper() toUpper()}, and 8-bit Character Comparisons. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toLower()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toLower(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_toLower(long __this__nativeId);


/**
Returns a URI/URL-style percent-encoded copy of this byte array. The <tt>percent</tt> parameter allows you to override the default '%' character for another. <p>By default, this function will encode all characters that are not one of the following: <p>ALPHA ("a" to "z" and "A" to "Z") / DIGIT (0 to 9) / "-" / "." / "_" / "~" <p>To prevent characters from being encoded pass them to <tt>exclude</tt>. To force characters to be encoded pass them to <tt>include</tt>. The <tt>percent</tt> character is always encoded. <p>Example:<pre>QByteArray text = "{a fishy string?}";
QByteArray ba = text.toPercentEncoding("{}", "s");
qDebug(ba.constData());
// prints "{a fi%73hy %73tring%3F}"</pre> The hex encoding uses the numbers 0-9 and the uppercase letters A-F. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#fromPercentEncoding(com.trolltech.qt.core.QByteArray) fromPercentEncoding()}, and {@link com.trolltech.qt.core.QUrl#toPercentEncoding(java.lang.String, com.trolltech.qt.core.QByteArray) QUrl::toPercentEncoding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toPercentEncoding(com.trolltech.qt.core.QByteArray exclude, com.trolltech.qt.core.QByteArray include) {
        return toPercentEncoding(exclude, include, (byte)'%');
    }

/**
Returns a URI/URL-style percent-encoded copy of this byte array. The <tt>percent</tt> parameter allows you to override the default '%' character for another. <p>By default, this function will encode all characters that are not one of the following: <p>ALPHA ("a" to "z" and "A" to "Z") / DIGIT (0 to 9) / "-" / "." / "_" / "~" <p>To prevent characters from being encoded pass them to <tt>exclude</tt>. To force characters to be encoded pass them to <tt>include</tt>. The <tt>percent</tt> character is always encoded. <p>Example:<pre>QByteArray text = "{a fishy string?}";
QByteArray ba = text.toPercentEncoding("{}", "s");
qDebug(ba.constData());
// prints "{a fi%73hy %73tring%3F}"</pre> The hex encoding uses the numbers 0-9 and the uppercase letters A-F. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#fromPercentEncoding(com.trolltech.qt.core.QByteArray) fromPercentEncoding()}, and {@link com.trolltech.qt.core.QUrl#toPercentEncoding(java.lang.String, com.trolltech.qt.core.QByteArray) QUrl::toPercentEncoding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toPercentEncoding(com.trolltech.qt.core.QByteArray exclude) {
/**
Constructs an empty byte array. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#isEmpty() isEmpty()}. <br></DD></DT>
*/

        return toPercentEncoding(exclude, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray(), (byte)'%');
    }

/**
Returns a URI/URL-style percent-encoded copy of this byte array. The <tt>percent</tt> parameter allows you to override the default '%' character for another. <p>By default, this function will encode all characters that are not one of the following: <p>ALPHA ("a" to "z" and "A" to "Z") / DIGIT (0 to 9) / "-" / "." / "_" / "~" <p>To prevent characters from being encoded pass them to <tt>exclude</tt>. To force characters to be encoded pass them to <tt>include</tt>. The <tt>percent</tt> character is always encoded. <p>Example:<pre>QByteArray text = "{a fishy string?}";
QByteArray ba = text.toPercentEncoding("{}", "s");
qDebug(ba.constData());
// prints "{a fi%73hy %73tring%3F}"</pre> The hex encoding uses the numbers 0-9 and the uppercase letters A-F. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#fromPercentEncoding(com.trolltech.qt.core.QByteArray) fromPercentEncoding()}, and {@link com.trolltech.qt.core.QUrl#toPercentEncoding(java.lang.String, com.trolltech.qt.core.QByteArray) QUrl::toPercentEncoding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toPercentEncoding() {
        return toPercentEncoding((com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray(), (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray(), (byte)'%');
    }
/**
Returns a URI/URL-style percent-encoded copy of this byte array. The <tt>percent</tt> parameter allows you to override the default '%' character for another. <p>By default, this function will encode all characters that are not one of the following: <p>ALPHA ("a" to "z" and "A" to "Z") / DIGIT (0 to 9) / "-" / "." / "_" / "~" <p>To prevent characters from being encoded pass them to <tt>exclude</tt>. To force characters to be encoded pass them to <tt>include</tt>. The <tt>percent</tt> character is always encoded. <p>Example:<pre>QByteArray text = "{a fishy string?}";
QByteArray ba = text.toPercentEncoding("{}", "s");
qDebug(ba.constData());
// prints "{a fi%73hy %73tring%3F}"</pre> The hex encoding uses the numbers 0-9 and the uppercase letters A-F. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#fromPercentEncoding(com.trolltech.qt.core.QByteArray) fromPercentEncoding()}, and {@link com.trolltech.qt.core.QUrl#toPercentEncoding(java.lang.String, com.trolltech.qt.core.QByteArray) QUrl::toPercentEncoding()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toPercentEncoding(com.trolltech.qt.core.QByteArray exclude, com.trolltech.qt.core.QByteArray include, byte percent)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toPercentEncoding_QByteArray_QByteArray_byte(nativeId(), exclude == null ? 0 : exclude.nativeId(), include == null ? 0 : include.nativeId(), percent);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_toPercentEncoding_QByteArray_QByteArray_byte(long __this__nativeId, long exclude, long include, byte percent);

    @QtBlockedSlot
    private final char toChar_private(com.trolltech.qt.QNativePointer ok, int base)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toChar_private_nativepointer_int(nativeId(), ok, base);
    }
    @QtBlockedSlot
    native char __qt_toChar_private_nativepointer_int(long __this__nativeId, com.trolltech.qt.QNativePointer ok, int base);

/**
Returns an uppercase copy of the byte array. The bytearray is interpreted as a Latin-1 encoded string. <p>Example: <pre class="snippet">
        QByteArray x = new QByteArray("TROlltECH");
        QByteArray y = x.toUpper();
        // y == "TROLLTECH"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#toLower() toLower()}, and 8-bit Character Comparisons. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray toUpper()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toUpper(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_toUpper(long __this__nativeId);

/**
Returns a byte array that has whitespace removed from the start and the end. <p>Whitespace means any character for which the standard C++ isspace() function returns true. This includes the ASCII characters '\t', '\n', '\v', '\f', '\r', and ' '. <p>Example: <pre class="snippet">
        QByteArray ba = new QByteArray("  lots\t of\nwhitespace\r\n ");
        ba = ba.trimmed();
        // ba == "lots\t of\nwhitespace";
</pre> Unlike {@link com.trolltech.qt.core.QByteArray#simplified() simplified()}, {@link com.trolltech.qt.core.QByteArray#trimmed() trimmed()} leaves internal whitespace alone. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#simplified() simplified()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray trimmed()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_trimmed(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_trimmed(long __this__nativeId);

/**
Truncates the byte array at index position <tt>pos</tt>. <p>If <tt>pos</tt> is beyond the end of the array, nothing happens. <p>Example: <pre class="snippet">
        QByteArray ba = new QByteArray("Stockholm");
        ba.truncate(5);             // ba == "Stock"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#chop(int) chop()}, {@link com.trolltech.qt.core.QByteArray#resize(int) resize()}, and {@link com.trolltech.qt.core.QByteArray#left(int) left()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void truncate(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_truncate_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_truncate_int(long __this__nativeId, int pos);

/**
Returns a decoded copy of the Base64 array <tt>base64</tt>. Input is not checked for validity; invalid characters in the input are skipped, enabling the decoding process to continue with subsequent characters. <p>For example: <pre class="snippet">
        QByteArray text = QByteArray.fromBase64(new QByteArray("UXQgaXMgZ3JlYXQh"));
        text.data();            // returns "Qt is great!"
</pre> The algorithm used to decode Base64-encoded data is defined in {@link <a href="../http-www-rfc-editor-org-rfc-rfc2045-txt.html">RFC 2045</a>}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#toBase64() toBase64()}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.QByteArray fromBase64(com.trolltech.qt.core.QByteArray base64)    {
        return __qt_fromBase64_QByteArray(base64 == null ? 0 : base64.nativeId());
    }
    native static com.trolltech.qt.core.QByteArray __qt_fromBase64_QByteArray(long base64);

/**
Returns a decoded copy of the hex encoded array <tt>hexEncoded</tt>. Input is not checked for validity; invalid characters in the input are skipped, enabling the decoding process to continue with subsequent characters. <p>For example: <pre class="snippet">
        QByteArray text = QByteArray.fromHex(new QByteArray("517420697320677265617421"));
        text.data();            // returns "Qt is great!"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#toHex() toHex()}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.QByteArray fromHex(com.trolltech.qt.core.QByteArray hexEncoded)    {
        return __qt_fromHex_QByteArray(hexEncoded == null ? 0 : hexEncoded.nativeId());
    }
    native static com.trolltech.qt.core.QByteArray __qt_fromHex_QByteArray(long hexEncoded);


/**
Returns a decoded copy of the URI/URL-style percent-encoded <tt>input</tt>. The <tt>percent</tt> parameter allows you to replace the '%' character for another (for instance, '_' or '='). <p>For example:<pre>QByteArray text = QByteArray::fromPercentEncoding("Qt%20is%20great%33");
text.data();            // returns "Qt is great!"</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#toPercentEncoding(com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray) toPercentEncoding()}, and {@link com.trolltech.qt.core.QUrl#fromPercentEncoding(com.trolltech.qt.core.QByteArray) QUrl::fromPercentEncoding()}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.QByteArray fromPercentEncoding(com.trolltech.qt.core.QByteArray pctEncoded) {
        return fromPercentEncoding(pctEncoded, (byte)'%');
    }
/**
Returns a decoded copy of the URI/URL-style percent-encoded <tt>input</tt>. The <tt>percent</tt> parameter allows you to replace the '%' character for another (for instance, '_' or '='). <p>For example:<pre>QByteArray text = QByteArray::fromPercentEncoding("Qt%20is%20great%33");
text.data();            // returns "Qt is great!"</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#toPercentEncoding(com.trolltech.qt.core.QByteArray, com.trolltech.qt.core.QByteArray) toPercentEncoding()}, and {@link com.trolltech.qt.core.QUrl#fromPercentEncoding(com.trolltech.qt.core.QByteArray) QUrl::fromPercentEncoding()}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.QByteArray fromPercentEncoding(com.trolltech.qt.core.QByteArray pctEncoded, byte percent)    {
        return __qt_fromPercentEncoding_QByteArray_byte(pctEncoded == null ? 0 : pctEncoded.nativeId(), percent);
    }
    native static com.trolltech.qt.core.QByteArray __qt_fromPercentEncoding_QByteArray_byte(long pctEncoded, byte percent);


/**
This is an overloaded member function, provided for convenience. <p>Returns a byte array that contains the printed value of <tt>n</tt>, formatted in format <tt>f</tt> with precision <tt>prec</tt>. <p>Argument <tt>n</tt> is formatted according to the <tt>f</tt> format specified, which is <tt>g</tt> by default, and can be any of the following: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Format</center></th><th><center> Meaning</center></th></tr></thead><tr valign="top" class="even"><td> <tt>e</tt></td><td> format as [-]9.9e[+|-]999</td></tr><tr valign="top" class="odd"><td> <tt>E</tt></td><td> format as [-]9.9E[+|-]999</td></tr><tr valign="top" class="even"><td> <tt>f</tt></td><td> format as [-]9.9</td></tr><tr valign="top" class="odd"><td> <tt>g</tt></td><td> use <tt>e</tt> or <tt>f</tt> format, whichever is the most concise</td></tr><tr valign="top" class="even"><td> <tt>G</tt></td><td> use <tt>E</tt> or <tt>f</tt> format, whichever is the most concise</td></tr></table> With 'e', 'E', and 'f', <tt>prec</tt> is the number of digits after the decimal point. With 'g' and 'G', <tt>prec</tt> is the maximum number of significant digits (trailing zeroes are omitted). <pre class="snippet">
        QByteArray ba = QByteArray.number(12.3456, (byte)'E', 3);
        // ba == 1.235E+01
</pre> <b>Note:</b> The format of the number is not localized; the default C locale is used irrespective of the user's locale. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#toDouble() toDouble()}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.QByteArray number(double arg__1, byte f) {
        return number(arg__1, f, (int)6);
    }

/**
This is an overloaded member function, provided for convenience. <p>Returns a byte array that contains the printed value of <tt>n</tt>, formatted in format <tt>f</tt> with precision <tt>prec</tt>. <p>Argument <tt>n</tt> is formatted according to the <tt>f</tt> format specified, which is <tt>g</tt> by default, and can be any of the following: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Format</center></th><th><center> Meaning</center></th></tr></thead><tr valign="top" class="even"><td> <tt>e</tt></td><td> format as [-]9.9e[+|-]999</td></tr><tr valign="top" class="odd"><td> <tt>E</tt></td><td> format as [-]9.9E[+|-]999</td></tr><tr valign="top" class="even"><td> <tt>f</tt></td><td> format as [-]9.9</td></tr><tr valign="top" class="odd"><td> <tt>g</tt></td><td> use <tt>e</tt> or <tt>f</tt> format, whichever is the most concise</td></tr><tr valign="top" class="even"><td> <tt>G</tt></td><td> use <tt>E</tt> or <tt>f</tt> format, whichever is the most concise</td></tr></table> With 'e', 'E', and 'f', <tt>prec</tt> is the number of digits after the decimal point. With 'g' and 'G', <tt>prec</tt> is the maximum number of significant digits (trailing zeroes are omitted). <pre class="snippet">
        QByteArray ba = QByteArray.number(12.3456, (byte)'E', 3);
        // ba == 1.235E+01
</pre> <b>Note:</b> The format of the number is not localized; the default C locale is used irrespective of the user's locale. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#toDouble() toDouble()}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.QByteArray number(double arg__1) {
        return number(arg__1, (byte)'g', (int)6);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns a byte array that contains the printed value of <tt>n</tt>, formatted in format <tt>f</tt> with precision <tt>prec</tt>. <p>Argument <tt>n</tt> is formatted according to the <tt>f</tt> format specified, which is <tt>g</tt> by default, and can be any of the following: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Format</center></th><th><center> Meaning</center></th></tr></thead><tr valign="top" class="even"><td> <tt>e</tt></td><td> format as [-]9.9e[+|-]999</td></tr><tr valign="top" class="odd"><td> <tt>E</tt></td><td> format as [-]9.9E[+|-]999</td></tr><tr valign="top" class="even"><td> <tt>f</tt></td><td> format as [-]9.9</td></tr><tr valign="top" class="odd"><td> <tt>g</tt></td><td> use <tt>e</tt> or <tt>f</tt> format, whichever is the most concise</td></tr><tr valign="top" class="even"><td> <tt>G</tt></td><td> use <tt>E</tt> or <tt>f</tt> format, whichever is the most concise</td></tr></table> With 'e', 'E', and 'f', <tt>prec</tt> is the number of digits after the decimal point. With 'g' and 'G', <tt>prec</tt> is the maximum number of significant digits (trailing zeroes are omitted). <pre class="snippet">
        QByteArray ba = QByteArray.number(12.3456, (byte)'E', 3);
        // ba == 1.235E+01
</pre> <b>Note:</b> The format of the number is not localized; the default C locale is used irrespective of the user's locale. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#toDouble() toDouble()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QByteArray number(double arg__1, byte f, int prec);


/**
Returns a byte array containing the string equivalent of the number <tt>n</tt> to base <tt>base</tt> (10 by default). The <tt>base</tt> can be any value between 2 and 36. <p>Example: <pre class="snippet">
        int n = 63;
        QByteArray.number(n);              // returns "63"
        QByteArray.number(n, 16);          // returns "3f"
        QByteArray.number(n, 16).toUpper();  // returns "3F"
</pre> <b>Note:</b> The format of the number is not localized; the default C locale is used irrespective of the user's locale. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#setNum(int, int) setNum()}, and {@link com.trolltech.qt.core.QByteArray#toInt(int) toInt()}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.QByteArray number(int arg__1) {
        return number(arg__1, (int)10);
    }
/**
Returns a byte array containing the string equivalent of the number <tt>n</tt> to base <tt>base</tt> (10 by default). The <tt>base</tt> can be any value between 2 and 36. <p>Example: <pre class="snippet">
        int n = 63;
        QByteArray.number(n);              // returns "63"
        QByteArray.number(n, 16);          // returns "3f"
        QByteArray.number(n, 16).toUpper();  // returns "3F"
</pre> <b>Note:</b> The format of the number is not localized; the default C locale is used irrespective of the user's locale. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray#setNum(int, int) setNum()}, and {@link com.trolltech.qt.core.QByteArray#toInt(int) toInt()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QByteArray number(int arg__1, int base);


/**
This is an overloaded member function, provided for convenience. <p><DT><b>See also:</b><br><DD>toLongLong(). <br></DD></DT>
*/

    public static com.trolltech.qt.core.QByteArray number(long arg__1) {
        return number(arg__1, (int)10);
    }
/**
Returns a byte array containing the string equivalent of the
number <tt>arg__1</tt> to base <tt>base</tt>. The <tt>base</tt> can be
any value between 2 and 36.
<p>
Example:
<p>
<code>
<pre>
    int n = 63;
    QByteArray.number(n, 16);          // returns "3f"
    QByteArray.number(n, 16).upper();  // returns "3F"
</pre>
</code>
*/

    public native static com.trolltech.qt.core.QByteArray number(long arg__1, int base);

/**
@exclude
*/

    public static native QByteArray fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QByteArray(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QByteArray array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QByteArray)
        return operator_equal((com.trolltech.qt.core.QByteArray) other);
    else if (other instanceof java.lang.String)
        return operator_equal((java.lang.String) other);
        return false;
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public int compareTo(Object other) {
        if (equals(other)) return 0;
        else if (other instanceof com.trolltech.qt.core.QByteArray) {
            if (operator_less((com.trolltech.qt.core.QByteArray) other)) return -1;
            else return 1;
        }
        else if (other instanceof java.lang.String) {
            if (operator_less((java.lang.String) other)) return -1;
            else return 1;
        }
        throw new ClassCastException();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    public int hashCode() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hashCode(nativeId());
    }
    native int __qt_hashCode(long __this_nativeId);

/**
<brief>Returns a string representation of the <tt>this QByteArray</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);

/**
Constructs a byte array initialized with the string <tt>str</tt>.
<p>
QByteArray makes a deep copy of the string data.
*/

    public QByteArray(String s) {
        this();
        append(s);
    }

/**
Constructs a byte array containing the bytes of array <tt>data</tt>. <p>If <tt>data</tt> is null, a null byte array is constructed. <p>QByteArray makes a deep copy of the string data. <p><DT><b>See also:</b><br><DD>fromRawData(). <br></DD></DT>
*/

    public QByteArray(byte data[]) {
        this(com.trolltech.qt.internal.QtJambiInternal.byteArrayToNativePointer(data), data.length);
    }

/**
Returns true there is at least one occurrence of <tt>str</tt>
in this QByteArray.
*/

    public final boolean contains(String str) {
        return contains(new QByteArray(str));
    }

/**
Returns the number of occurrences of <tt>str</tt> in this QByteArray.
*/

    public final int count(String str) {
        return count(new QByteArray(str));
    }

/**
Returns true if this QByteArray ends with <tt>str</tt>; otherwise,
returns false.
*/

    public final boolean endsWith(String str) {
        return endsWith(new QByteArray(str));
    }

/**
Prepends <tt>str</tt> to this QByteArray, and returns the resulting
array.
*/

    public final QByteArray prepend(String str) {
        return prepend(new QByteArray(str));
    }

/**
Replaces every occurrence of the byte array <tt>before</tt> with the
string <tt>after</tt>.
*/

    public final QByteArray replace(QByteArray before, String after) {
        return replace(before, new QByteArray(after));
    }

/**
Replaces every occurrence of <tt>before</tt> with <tt>after</tt>.
*/

    public final QByteArray replace(String before, String after) {
        return replace(new QByteArray(before), new QByteArray(after));
    }

/**
Returns true if this byte array starts with string <tt>str</tt>;
otherwise returns false.
*/

    public final boolean startsWith(String str) {
        return startsWith(new QByteArray(str));
    }

/**
Returns the contents of this QByteArray.
*/

    public final byte[] toByteArray() {
        byte[] res = new byte[size()];

        for (int i = 0; i < size(); i++) {
            res[i] = at(i);
        }
        return res;
    }

/**
This function sets the contents of this QByteArray equal to <tt>other</tt>.
*/

    @com.trolltech.qt.QtBlockedSlot
    public final QByteArray set(QByteArray other) {
        operator_assign(other);
        return this;
    }

    // TEMPLATE - QByteArray::toType(base) - START
/**
Returns the byte array converted to an <b>char</b> using base
<tt>base</tt>, which is 10 by default and must be between 2 and 36, or
0.
*/

    public final char toChar(int base) throws NumberFormatException{
        com.trolltech.qt.QNativePointer ok = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Boolean);
        char res = toChar_private(ok, base);
        if(!ok.booleanValue()){
            throw new NumberFormatException();
        }
        return res;
    }

/**
Returns the byte array converted to a <b>char</b>.
*/

    public char toChar(){
        return toChar(10);
    }
    // TEMPLATE - QByteArray::toType(base) - END

    // TEMPLATE - QByteArray::toType(base) - START
/**
Returns the byte array converted to an <b>int</b> using base
<tt>base</tt>, which is 10 by default and must be between 2 and 36, or
0.
<p>
If <tt>base</tt> is 0, the base is determined automatically using the
following rules: If the byte array begins with "0x", it is assumed to
be hexadecimal; if it begins with "0", it is assumed to be octal;
otherwise it is assumed to be decimal.
<p>
The function throws NumberFormatException if conversion fails.
<p>
<code>
<pre>
    QByteArray str = new QByteArray("FF");
    int hex = str.toInt(16);     // hex == 255,
    int dec = str.toInt(10);     // throws NumberFormatException
</pre>
</code>
*/

    public final int toInt(int base) throws NumberFormatException{
        com.trolltech.qt.QNativePointer ok = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Boolean);
        int res = toInt_private(ok, base);
        if(!ok.booleanValue()){
            throw new NumberFormatException();
        }
        return res;
    }

/**
Returns the byte array converted to an <b>int</b> using base
10.
*/

    public int toInt(){
        return toInt(10);
    }
    // TEMPLATE - QByteArray::toType(base) - END

    // TEMPLATE - QByteArray::toType() - START
/**
Returns the byte array converted to an <b>double</b>.
*/

    public final double toDouble() throws NumberFormatException{
        com.trolltech.qt.QNativePointer ok = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Boolean);
        double res = toDouble_private(ok);
        if(!ok.booleanValue()){
            throw new NumberFormatException();
        }
        return res;
    }
    // TEMPLATE - QByteArray::toType() - END

    // TEMPLATE - QByteArray::toType() - START
/**
Returns the byte array converted to an <b>float</b>.
*/

    public final float toFloat() throws NumberFormatException{
        com.trolltech.qt.QNativePointer ok = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Boolean);
        float res = toFloat_private(ok);
        if(!ok.booleanValue()){
            throw new NumberFormatException();
        }
        return res;
    }
    // TEMPLATE - QByteArray::toType() - END


    // TEMPLATE - core.unary_other_type - START
    // TEMPLATE - core.private_function_return_self - START
/**
This function appends the contents of <tt>other</tt> to the end of this
QByteArray.
*/

    public final QByteArray append(String other) {
        append_private(other);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END
    // TEMPLATE - core.unary_other_type - END


    // TEMPLATE - core.unary_self_type - START
    // TEMPLATE - core.unary_other_type - START
    // TEMPLATE - core.private_function_return_self - START
/**
This function appends the contents of <tt>other</tt> to the end of
this QByteArray.
*/

    public final QByteArray append(QByteArray other) {
        append_private(other);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END
    // TEMPLATE - core.unary_other_type - END
    // TEMPLATE - core.unary_self_type - END


    // TEMPLATE - core.unary_other_type - START
    // TEMPLATE - core.private_function_return_self - START
/**
This function appends <tt>other</tt> to the end of this QByteArray.
*/

    public final QByteArray append(byte other) {
        append_private(other);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END
    // TEMPLATE - core.unary_other_type - END


    // TEMPLATE - core.private_function_return_self - START
/**
Sets every byte in the byte array to character <tt>b</tt>. If
<tt>size</tt> is different from -1 (the default), the byte array is
resized to size <tt>size</tt> beforehand.
<p>
Example:
<p>
<code>
<pre>
    QByteArray ba = new QByteArray("Istanbul");
    ba.fill("o");
    // ba == "oooooooo"

    ba.fill("X", 2);
    // ba == "XX"
</pre>
</code>
*/

    public final QByteArray fill(byte b, int size) {
        fill_private(b, size);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END

/**
Sets every byte in the byte array to character <tt>b</tt>.
*/

    public QByteArray  fill(byte b) {
        return fill(b, -1);
    }


    // TEMPLATE - core.private_function_return_self - START
/**
Inserts the byte array <tt>ba</tt> at index position <tt>i</tt> and returns a
reference to this byte array.
<p>
Example:
<p>
<code>
<pre>
    QByteArray ba = new QByteArray("Meal");
    ba.insert(1, QByteArray("ontr"));
    // ba == "Montreal"
</pre>
</code>
*/

    public final QByteArray insert(int i, QByteArray ba) {
        insert_private(i, ba);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END


    // TEMPLATE - core.private_function_return_self - START
/**
Inserts byte <tt>b</tt> at index position <tt>i</tt> in the byte array.
If <tt>i</tt> is greater than size(), the array is first extended using
resize().
*/

    public final QByteArray insert(int i, byte b) {
        insert_private(i, b);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END


    // TEMPLATE - core.private_function_return_self - START
/**
Inserts String <tt>str</tt> at index position <tt>i</tt> in the byte array.
If <tt>i</tt> is greater than size(), the array is first extended using
resize().
*/

    public final QByteArray insert(int i, String str) {
        insert_private(i, str);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END


    // TEMPLATE - core.unary_self_type - START
    // TEMPLATE - core.unary_other_type - START
    // TEMPLATE - core.private_function_return_self - START
/**
Prepends <tt>other</tt> to this QByteArray, and returns the resulting
array.
*/

    public final QByteArray prepend(QByteArray other) {
        prepend_private(other);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END
    // TEMPLATE - core.unary_other_type - END
    // TEMPLATE - core.unary_self_type - END


    // TEMPLATE - core.unary_other_type - START
    // TEMPLATE - core.private_function_return_self - START
/**
Prepends <tt>other</tt> to this QByteArray, and returns the resulting
array.
*/

    public final QByteArray prepend(byte other) {
        prepend_private(other);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END
    // TEMPLATE - core.unary_other_type - END


    // TEMPLATE - core.private_function_return_self - START
/**
Removes <tt>len</tt> bytes from the array, starting at index position
<tt>pos</tt>, and returns a reference to the array.
<p>
If <tt>pos</tt> is out of range, nothing happens. If <tt>pos</tt> is valid,
but <tt>pos</tt> + <tt>len</tt> is larger than the size of the array, the
array is truncated at position <tt>pos</tt>.
<p>
Example:
<p>
<code>
<pre>
    QByteArray ba = new QByteArray("Montreal");
    ba.remove(1, 4);
    // ba == "Meal"
</pre>
</code>
*/

    public final QByteArray remove(int pos, int len) {
        remove_private(pos, len);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END


    // TEMPLATE - core.qbytearray_replace - START
    // TEMPLATE - core.private_function_return_self - START
/**
Replaces every occurrence of <tt>before</tt> with <tt>after</tt>.
*/

    public final QByteArray replace(byte before, QByteArray after) {
        replace_private(before, after);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END
    // TEMPLATE - core.qbytearray_replace - END


    // TEMPLATE - core.private_function_return_self - START
/**
Replaces every occurrence of <tt>before</tt> with <tt>after</tt>.
*/

    public final QByteArray replace(int pos, int len, QByteArray after) {
        replace_private(pos, len, after);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END


    // TEMPLATE - core.qbytearray_replace - START
    // TEMPLATE - core.private_function_return_self - START
/**
Replaces every occurrence of <tt>before</tt> with <tt>after</tt>.
*/

    public final QByteArray replace(byte before, String after) {
        replace_private(before, after);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END
    // TEMPLATE - core.qbytearray_replace - END


    // TEMPLATE - core.qbytearray_replace - START
    // TEMPLATE - core.private_function_return_self - START
/**
Replaces every occurrence of <tt>before</tt> with <tt>after</tt>.
*/

    public final QByteArray replace(byte before, byte after) {
        replace_private(before, after);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END
    // TEMPLATE - core.qbytearray_replace - END


    // TEMPLATE - core.qbytearray_replace - START
    // TEMPLATE - core.private_function_return_self - START
/**
Replaces every occurrence of <tt>before</tt> with <tt>after</tt>.
*/

    public final QByteArray replace(QByteArray before, QByteArray after) {
        replace_private(before, after);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END
    // TEMPLATE - core.qbytearray_replace - END


    // TEMPLATE - core.qbytearray_replace - START
    // TEMPLATE - core.private_function_return_self - START
/**
Replaces every occurrence of <tt>before</tt> with <tt>after</tt>.
*/

    public final QByteArray replace(String before, QByteArray after) {
        replace_private(before, after);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END
    // TEMPLATE - core.qbytearray_replace - END


    // TEMPLATE - core.qbytearray_setNum_integer - START
    // TEMPLATE - core.private_function_return_self - START
/**
Sets the array to the printed value of <tt>n</tt> using <tt>base</tt> as base.
*/

    public final QByteArray setNum(int n, int base) {
        setNum_private(n, base);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END

/**
Sets the array to the printed value of <tt>n</tt>
*/

    public QByteArray setNum(int n) {
        return setNum(n, 10);
    }
    // TEMPLATE - core.qbytearray_setNum_integer - END


    // TEMPLATE - core.qbytearray_setNum_integer - START
    // TEMPLATE - core.private_function_return_self - START
/**
<p><DT><b>See also.</b><br><DD>toShort(). <br></DD></DT>
*/

    public final QByteArray setNum(char n, int base) {
        setNum_private(n, base);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END

/**
<p><DT><b>See also.</b><br><DD>toUShort(). <br></DD></DT>
*/

    public QByteArray setNum(char n) {
        return setNum(n, 10);
    }
    // TEMPLATE - core.qbytearray_setNum_integer - END


    // TEMPLATE - core.qbytearray_setNum_float - START
    // TEMPLATE - core.private_function_return_self - START
/**
Sets the byte array to the printed value of <tt>n</tt>, formatted in format
<tt>f</tt> with precision <tt>prec</tt>, and returns a reference to the byte
array.
*/

    public final QByteArray setNum(float n, char f, int prec) {
        setNum_private(n, (byte) f, prec);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END

/**
Sets the byte array to the printed value of <tt>n</tt>, formatted in format
<tt>f</tt> with precision 6, and returns a reference to the byte
array.
*/

    public final QByteArray setNum(float n, char f) {
        return setNum(n, f, 6);
    }

/**
Sets the byte array to the printed value of <tt>n</tt>, formatted in format
<tt>f</tt> with precision 6, and returns a reference to the byte
array.
*/

    public final QByteArray setNum(float n) {
        return setNum(n, 'g');
    }
    // TEMPLATE - core.qbytearray_setNum_float - END


    // TEMPLATE - core.qbytearray_setNum_integer - START
    // TEMPLATE - core.private_function_return_self - START
/**
This is an overloaded function provided for convenience.
*/

    public final QByteArray setNum(long n, int base) {
        setNum_private(n, base);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END

/**
This is an overloaded function provided for convenience.
*/

    public QByteArray setNum(long n) {
        return setNum(n, 10);
    }
    // TEMPLATE - core.qbytearray_setNum_integer - END


    // TEMPLATE - core.qbytearray_setNum_float - START
    // TEMPLATE - core.private_function_return_self - START
/**
Sets the byte array to the printed value of <tt>n</tt>, formatted in format
    <tt>f</tt> with precision <tt>prec</tt>, and returns a reference to the
    byte array.
*/

    public final QByteArray setNum(double n, char f, int prec) {
        setNum_private(n, (byte) f, prec);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END

/**
This is an overloaded function provided for convenience.
*/

    public final QByteArray setNum(double n, char f) {
        return setNum(n, f, 6);
    }

/**
This is an overloaded function provided for convenience.
*/

    public final QByteArray setNum(double n) {
        return setNum(n, 'g');
    }
    // TEMPLATE - core.qbytearray_setNum_float - END


    // TEMPLATE - core.qbytearray_setNum_integer - START
    // TEMPLATE - core.private_function_return_self - START
/**
This is an overloaded function provided for convenience.
*/

    public final QByteArray setNum(short n, int base) {
        setNum_private(n, base);
        return this;
    }
    // TEMPLATE - core.private_function_return_self - END

/**
This is an overloaded function provided for convenience.
*/

    public QByteArray setNum(short n) {
        return setNum(n, 10);
    }
    // TEMPLATE - core.qbytearray_setNum_integer - END


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QByteArray clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QByteArray __qt_clone(long __this_nativeId);
}
