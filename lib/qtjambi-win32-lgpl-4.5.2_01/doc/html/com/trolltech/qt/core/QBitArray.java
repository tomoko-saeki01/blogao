package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QBitArray class provides an array of bits. A QBitArray is an array that gives access to individual bits and provides operators (AND, OR, XOR, and NOT) that work on entire arrays of bits. It uses {@link <a href="../shared.html">implicit sharing</a>} (copy-on-write) to reduce memory usage and to avoid the needless copying of data. <p>The following code constructs a QBitArray containing 200 bits initialized to false (0): <pre class="snippet">
        QBitArray ba = new QBitArray(200);
</pre> To initialize the bits to true, either pass <tt>true</tt> as second argument to the constructor, or call {@link com.trolltech.qt.core.QBitArray#fill(boolean, int, int) fill()} later on. <p>QBitArray uses 0-based indexes, just like C++ arrays. To access the bit at a particular index position, you can use operator[](). On non-const bit arrays, operator[]() returns a reference to a bit that can be used on the left side of an assignment. For example: <pre class="snippet">
       //The following snipplet is not applicable in Java since there are no
       //support for operator overloading. Use QBitArray.setBit(int).
       
        QBitArray ba;
        ba.resize(3);
        ba[0] = true;
        ba[1] = false;
        ba[2] = true;
        
</pre> For technical reasons, it is more efficient to use {@link com.trolltech.qt.core.QBitArray#testBit(int) testBit()} and {@link com.trolltech.qt.core.QBitArray#setBit(int) setBit()} to access bits in the array than operator[](). For example: <pre class="snippet">
        QBitArray ba = new QBitArray(3);
        ba.setBit(0, true);
        ba.setBit(1, false);
        ba.setBit(2, true);
</pre> QBitArray supports <tt>&</tt> (AND), <tt>|</tt> (OR), <tt>^</tt> (XOR), <tt>~</tt> (NOT), as well as <tt>&=</tt>, <tt>|=</tt>, and <tt>^=</tt>. These operators work in the same way as the built-in C++ bitwise operators of the same name. For example: <pre class="snippet">
        QBitArray x = new QBitArray(5);
        x.setBit(3, true);
        // x: [ 0, 0, 0, 1, 0 ]

        QBitArray y = new QBitArray(5);
        y.setBit(4, true);
        // y: [ 0, 0, 0, 0, 1 ]

        x.or(y);
        // x: [ 0, 0, 0, 1, 1 ]
</pre> For historical reasons, QBitArray distinguishes between a null bit array and an empty bit array. A null bit array is a bit array that is initialized using QBitArray's default constructor. An empty bit array is any bit array with size 0. A null bit array is always empty, but an empty bit array isn't necessarily null: <pre class="snippet">
        new QBitArray().isNull();           // returns true
        new QBitArray().isEmpty();          // returns true

        new QBitArray(0).isNull();          // returns false
        new QBitArray(0).isEmpty();         // returns true

        new QBitArray(3).isNull();          // returns false
        new QBitArray(3).isEmpty();         // returns false
</pre> All functions except {@link com.trolltech.qt.core.QBitArray#isNull() isNull()} treat null bit arrays the same as empty bit arrays; for example, QBitArray() compares equal to QBitArray(0). We recommend that you always use {@link com.trolltech.qt.core.QBitArray#isEmpty() isEmpty()} and avoid {@link com.trolltech.qt.core.QBitArray#isNull() isNull()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QByteArray QByteArray}, and QVector. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QBitArray extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty bit array. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBitArray#isEmpty() isEmpty()}. <br></DD></DT>
*/

    public QBitArray(){
        super((QPrivateConstructor)null);
        __qt_QBitArray();
    }

    native void __qt_QBitArray();

/**
Constructs a copy of <tt>other</tt>. <p>This operation takes {@link <a href="../containers.html">constant time</a>}, because QBitArray is {@link <a href="../shared.html">implicitly shared</a>}. This makes returning a QBitArray from a function very fast. If a shared instance is modified, it will be copied (copy-on-write), and that takes {@link <a href="../containers.html">linear time</a>}. <p><DT><b>See also:</b><br><DD>operator=(). <br></DD></DT>
*/

    public QBitArray(com.trolltech.qt.core.QBitArray other){
        super((QPrivateConstructor)null);
        __qt_QBitArray_QBitArray(other == null ? 0 : other.nativeId());
    }

    native void __qt_QBitArray_QBitArray(long other);


/**
Constructs a bit array containing <tt>size</tt> bits. The bits are initialized with <tt>value</tt>, which defaults to false (0).
*/

    public QBitArray(int size) {
        this(size, (boolean)false);
    }
/**
Constructs a bit array containing <tt>size</tt> bits. The bits are initialized with <tt>value</tt>, which defaults to false (0).
*/

    public QBitArray(int size, boolean val){
        super((QPrivateConstructor)null);
        __qt_QBitArray_int_boolean(size, val);
    }

    native void __qt_QBitArray_int_boolean(int size, boolean val);

/**
Returns the value of the bit at index position <tt>i</tt>. <p><tt>i</tt> must be a valid index position in the bit array (i.e., 0 &lt;= <tt>i</tt> &lt; {@link com.trolltech.qt.core.QBitArray#size() size()}). <p><DT><b>See also:</b><br><DD>operator[](). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean at(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_at_int(nativeId(), i);
    }
    @QtBlockedSlot
    native boolean __qt_at_int(long __this__nativeId, int i);

/**
Clears the contents of the bit array and makes it empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBitArray#resize(int) resize()}, and {@link com.trolltech.qt.core.QBitArray#isEmpty() isEmpty()}. <br></DD></DT>
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
Sets the bit at index position <tt>i</tt> to 0. <p><tt>i</tt> must be a valid index position in the bit array (i.e., 0 &lt;= <tt>i</tt> &lt; {@link com.trolltech.qt.core.QBitArray#size() size()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBitArray#setBit(int) setBit()}, and {@link com.trolltech.qt.core.QBitArray#toggleBit(int) toggleBit()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearBit(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearBit_int(nativeId(), i);
    }
    @QtBlockedSlot
    native void __qt_clearBit_int(long __this__nativeId, int i);

/**
Same as {@link com.trolltech.qt.core.QBitArray#size() size()}.
*/

    @QtBlockedSlot
    public final int count()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
If <tt>on</tt> is true, this function returns the number of 1-bits stored in the bit array; otherwise the number of 0-bits is returned.
*/

    @QtBlockedSlot
    public final int count(boolean on)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count_boolean(nativeId(), on);
    }
    @QtBlockedSlot
    native int __qt_count_boolean(long __this__nativeId, boolean on);

/**
This is an overloaded member function, provided for convenience. <p>Sets bits at index positions <tt>begin</tt> up to and excluding <tt>end</tt> to <tt>value</tt>. <p><tt>begin</tt> and <tt>end</tt> must be a valid index position in the bit array (i.e., 0 &lt;= <tt>begin</tt> &lt;= {@link com.trolltech.qt.core.QBitArray#size() size()} and 0 &lt;= <tt>end</tt> &lt;= {@link com.trolltech.qt.core.QBitArray#size() size()}).
*/

    @QtBlockedSlot
    public final void fill(boolean val, int first, int last)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fill_boolean_int_int(nativeId(), val, first, last);
    }
    @QtBlockedSlot
    native void __qt_fill_boolean_int_int(long __this__nativeId, boolean val, int first, int last);


/**
Sets every bit in the bit array to <tt>value</tt>, returning true if successful; otherwise returns false. If <tt>size</tt> is different from -1 (the default), the bit array is resized to <tt>size</tt> beforehand. <p>Example: <pre class="snippet">
        QBitArray ba = new QBitArray(8);
        ba.fill(true);
        // ba: [ 1, 1, 1, 1, 1, 1, 1, 1 ]

        ba.fill(false, 2);
        // ba: [ 0, 0 ]
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBitArray#resize(int) resize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fill(boolean val) {
        return fill(val, (int)-1);
    }
/**
Sets every bit in the bit array to <tt>value</tt>, returning true if successful; otherwise returns false. If <tt>size</tt> is different from -1 (the default), the bit array is resized to <tt>size</tt> beforehand. <p>Example: <pre class="snippet">
        QBitArray ba = new QBitArray(8);
        ba.fill(true);
        // ba: [ 1, 1, 1, 1, 1, 1, 1, 1 ]

        ba.fill(false, 2);
        // ba: [ 0, 0 ]
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBitArray#resize(int) resize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean fill(boolean val, int size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fill_boolean_int(nativeId(), val, size);
    }
    @QtBlockedSlot
    native boolean __qt_fill_boolean_int(long __this__nativeId, boolean val, int size);

/**
Returns true if this bit array has size 0; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBitArray#size() size()}. <br></DD></DT>
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
Returns true if this bit array is null; otherwise returns false. <p>Example: <pre class="snippet">
        new QBitArray().isNull();           // returns true
        new QBitArray(0).isNull();          // returns false
        new QBitArray(3).isNull();          // returns false
</pre> Qt makes a distinction between null bit arrays and empty bit arrays for historical reasons. For most applications, what matters is whether or not a bit array contains any data, and this can be determined using {@link com.trolltech.qt.core.QBitArray#isEmpty() isEmpty()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBitArray#isEmpty() isEmpty()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_and_assign(com.trolltech.qt.core.QBitArray arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_and_assign_QBitArray(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_and_assign_QBitArray(long __this__nativeId, long arg__1);

/**
<brief>Writes thisQBitArray
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
    private final com.trolltech.qt.QNativePointer operator_assign(com.trolltech.qt.core.QBitArray other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_assign_QBitArray(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_assign_QBitArray(long __this__nativeId, long other);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.core.QBitArray a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QBitArray(nativeId(), a == null ? 0 : a.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QBitArray(long __this__nativeId, long a);

/**
<brief>Reads a QBitArray
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
    private final com.trolltech.qt.QNativePointer operator_xor_assign(com.trolltech.qt.core.QBitArray arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_xor_assign_QBitArray(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_xor_assign_QBitArray(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_or_assign(com.trolltech.qt.core.QBitArray arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_or_assign_QBitArray(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_or_assign_QBitArray(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final com.trolltech.qt.core.QBitArray operator_negate()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_negate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QBitArray __qt_operator_negate(long __this__nativeId);

/**
Resizes the bit array to <tt>size</tt> bits. <p>If <tt>size</tt> is greater than the current size, the bit array is extended to make it <tt>size</tt> bits with the extra bits added to the end. The new bits are initialized to false (0). <p>If <tt>size</tt> is less than the current size, bits are removed from the end. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBitArray#size() size()}. <br></DD></DT>
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
Sets the bit at index position <tt>i</tt> to 1. <p><tt>i</tt> must be a valid index position in the bit array (i.e., 0 &lt;= <tt>i</tt> &lt; {@link com.trolltech.qt.core.QBitArray#size() size()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBitArray#clearBit(int) clearBit()}, and {@link com.trolltech.qt.core.QBitArray#toggleBit(int) toggleBit()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBit(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBit_int(nativeId(), i);
    }
    @QtBlockedSlot
    native void __qt_setBit_int(long __this__nativeId, int i);

/**
This is an overloaded member function, provided for convenience. <p>Sets the bit at index position <tt>i</tt> to <tt>value</tt>.
*/

    @QtBlockedSlot
    public final void setBit(int i, boolean val)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBit_int_boolean(nativeId(), i, val);
    }
    @QtBlockedSlot
    native void __qt_setBit_int_boolean(long __this__nativeId, int i, boolean val);

/**
Returns the number of bits stored in the bit array. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBitArray#resize(int) resize()}. <br></DD></DT>
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
Returns true if the bit at index position <tt>i</tt> is 1; otherwise returns false. <p><tt>i</tt> must be a valid index position in the bit array (i.e., 0 &lt;= <tt>i</tt> &lt; {@link com.trolltech.qt.core.QBitArray#size() size()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBitArray#setBit(int) setBit()}, and {@link com.trolltech.qt.core.QBitArray#clearBit(int) clearBit()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testBit(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testBit_int(nativeId(), i);
    }
    @QtBlockedSlot
    native boolean __qt_testBit_int(long __this__nativeId, int i);

/**
Inverts the value of the bit at index position <tt>i</tt>, returning the previous value of that bit as either true (if it was set) or false (if it was unset). <p>If the previous value was 0, the new value will be 1. If the previous value was 1, the new value will be 0. <p><tt>i</tt> must be a valid index position in the bit array (i.e., 0 &lt;= <tt>i</tt> &lt; {@link com.trolltech.qt.core.QBitArray#size() size()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBitArray#setBit(int) setBit()}, and {@link com.trolltech.qt.core.QBitArray#clearBit(int) clearBit()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean toggleBit(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toggleBit_int(nativeId(), i);
    }
    @QtBlockedSlot
    native boolean __qt_toggleBit_int(long __this__nativeId, int i);

/**
Truncates the bit array at index position <tt>pos</tt>. <p>If <tt>pos</tt> is beyond the end of the array, nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QBitArray#resize(int) resize()}. <br></DD></DT>
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
@exclude
*/

    public static native QBitArray fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QBitArray(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QBitArray array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QBitArray)
        return operator_equal((com.trolltech.qt.core.QBitArray) other);
        return false;
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
Returns a bit array that is the XOR of this bit array and <tt>other</tt>.
<p>
The result has the length of the longest of the two bit arrays,
with any missing bits (if one array is shorter than the other)
taken to be 0.
<p>
Example:
<p>
<code>
<pre>
    QBitArray a(3);
    QBitArray b(2);
    QBitArray c;
    a[0] = 1; a[1] = 0; a[2] = 1;   // a: [ 1, 0, 1 ]
    b[0] = 1; b[1] = 0;             // b: [ 1, 1 ]
    c = a ^ b;                      // c: [ 0, 1, 1 ]
</pre>
</code>
*/

    @com.trolltech.qt.QtBlockedSlot
    public final void xor(QBitArray other) {
        operator_xor_assign(other);
    }

/**
Returns a bit array that is the AND of this bit array and
<tt>other</tt>.
<p>
The result has the length of the longest of the two bit arrays,
with any missing bits (if one array is shorter than the other)
taken to be 0.
<p>
Example:
<p>
<code>
<pre>
    QBitArray a(3);
    QBitArray b(2);
    QBitArray c;
    a[0] = 1; a[1] = 0; a[2] = 1;   // a: [ 1, 0, 1 ]
    b[0] = 1; b[1] = 0;             // b: [ 1, 1 ]
    c = a & b;                      // c: [ 1, 0, 0 ]
</pre>
</endcode>
*/

    @com.trolltech.qt.QtBlockedSlot
    public final void and(QBitArray other) {
        operator_and_assign(other);
    }

/**
Returns a bit array that is the OR of this bit array and
<tt>other</tt>.
<p>
The result has the length of the longest of the two bit arrays,
with any missing bits (if one array is shorter than the other)
taken to be 0.
<p>
Example:
<p>
<code>
<pre>
    QBitArray a(3);
    QBitArray b(2);
    QBitArray c;
    a[0] = 1; a[1] = 0; a[2] = 1;   // a: [ 1, 0, 1 ]
    b[0] = 1; b[1] = 0;             // b: [ 1, 1 ]
    c = a | b;                      // c: [ 1, 1, 1 ]
</pre>
</code>
*/

    @com.trolltech.qt.QtBlockedSlot
    public final void or(QBitArray other) {
        operator_or_assign(other);
    }

/**
This function sets the contents of this array to the same as <tt>other</tt>s.
*/

    @com.trolltech.qt.QtBlockedSlot
    public final void set(QBitArray other) {
        operator_assign(other);
    }

/**
Returns a bit array that contains the inverted bits of this bit
array.
<p>
Example:
<p>
<code>
<pre>
    QBitArray a(3);
    QBitArray b;
    a[0] = 1; a[1] = 0; a[2] = 1;   // a: [ 1, 0, 1 ]
    b = ~a;                         // b: [ 0, 1, 0 ]
</pre>
</code>
*/

    @com.trolltech.qt.QtBlockedSlot
    public final QBitArray inverted() {
        return operator_negate();
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QBitArray clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QBitArray __qt_clone(long __this_nativeId);
}
