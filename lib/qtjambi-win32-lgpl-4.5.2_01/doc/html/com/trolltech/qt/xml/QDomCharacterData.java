package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QDomCharacterData class represents a generic string in the DOM. Character data as used in XML specifies a generic data string. More specialized versions of this class are {@link com.trolltech.qt.xml.QDomText QDomText}, {@link com.trolltech.qt.xml.QDomComment QDomComment} and {@link com.trolltech.qt.xml.QDomCDATASection QDomCDATASection}. <p>The data string is set with {@link com.trolltech.qt.xml.QDomCharacterData#setData(java.lang.String) setData()} and retrieved with {@link com.trolltech.qt.xml.QDomCharacterData#data() data()}. You can retrieve a portion of the data string using {@link com.trolltech.qt.xml.QDomCharacterData#substringData(int, int) substringData()}. Extra data can be appended with {@link com.trolltech.qt.xml.QDomCharacterData#appendData(java.lang.String) appendData()}, or inserted with {@link com.trolltech.qt.xml.QDomCharacterData#insertData(int, java.lang.String) insertData()}. Portions of the data string can be deleted with {@link com.trolltech.qt.xml.QDomCharacterData#deleteData(int, int) deleteData()} or replaced with {@link com.trolltech.qt.xml.QDomCharacterData#replaceData(int, int, java.lang.String) replaceData()}. The length of the data string is returned by {@link com.trolltech.qt.xml.QDomCharacterData#length() length()}. <p>The node type of the node containing this character data is returned by nodeType(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomText QDomText}, {@link com.trolltech.qt.xml.QDomComment QDomComment}, and {@link com.trolltech.qt.xml.QDomCDATASection QDomCDATASection}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDomCharacterData extends com.trolltech.qt.xml.QDomNode
    implements java.lang.Cloneable
{

/**
Constructs an empty character data object.
*/

    public QDomCharacterData(){
        super((QPrivateConstructor)null);
        __qt_QDomCharacterData();
    }

    native void __qt_QDomCharacterData();

/**
Constructs a copy of <tt>x</tt>. <p>The data of the copy is shared (shallow copy): modifying one node will also change the other. If you want to make a deep copy, use {@link com.trolltech.qt.xml.QDomNode#cloneNode() cloneNode()}.
*/

    public QDomCharacterData(com.trolltech.qt.xml.QDomCharacterData x){
        super((QPrivateConstructor)null);
        __qt_QDomCharacterData_QDomCharacterData(x == null ? 0 : x.nativeId());
    }

    native void __qt_QDomCharacterData_QDomCharacterData(long x);

/**
Appends the string <tt>arg</tt> to the stored string.
*/

    @QtBlockedSlot
    public final void appendData(java.lang.String arg)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_appendData_String(nativeId(), arg);
    }
    @QtBlockedSlot
    native void __qt_appendData_String(long __this__nativeId, java.lang.String arg);

/**
Returns the string stored in this object. <p>If the node is a {@link com.trolltech.qt.xml.QDomNode#isNull() null node}, it will return an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomCharacterData#setData(java.lang.String) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String data()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_data(long __this__nativeId);

/**
Deletes a substring of length <tt>count</tt> from position <tt>offset</tt>.
*/

    @QtBlockedSlot
    public final void deleteData(int offset, int count)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_deleteData_int_int(nativeId(), offset, count);
    }
    @QtBlockedSlot
    native void __qt_deleteData_int_int(long __this__nativeId, int offset, int count);

/**
Inserts the string <tt>arg</tt> into the stored string at position <tt>offset</tt>.
*/

    @QtBlockedSlot
    public final void insertData(int offset, java.lang.String arg)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertData_int_String(nativeId(), offset, arg);
    }
    @QtBlockedSlot
    native void __qt_insertData_int_String(long __this__nativeId, int offset, java.lang.String arg);

/**
Returns the length of the stored string.
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
Replaces the substring of length <tt>count</tt> starting at position <tt>offset</tt> with the string <tt>arg</tt>.
*/

    @QtBlockedSlot
    public final void replaceData(int offset, int count, java.lang.String arg)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_replaceData_int_int_String(nativeId(), offset, count, arg);
    }
    @QtBlockedSlot
    native void __qt_replaceData_int_int_String(long __this__nativeId, int offset, int count, java.lang.String arg);

/**
Sets this object's string to <tt>v</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QDomCharacterData#data() data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setData(java.lang.String arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setData_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setData_String(long __this__nativeId, java.lang.String arg__1);

/**
Returns the substring of length <tt>count</tt> from position <tt>offset</tt>.
*/

    @QtBlockedSlot
    public final java.lang.String substringData(int offset, int count)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_substringData_int_int(nativeId(), offset, count);
    }
    @QtBlockedSlot
    native java.lang.String __qt_substringData_int_int(long __this__nativeId, int offset, int count);

/**
@exclude
*/

    public static native QDomCharacterData fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDomCharacterData(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDomCharacterData array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDomCharacterData clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDomCharacterData __qt_clone(long __this_nativeId);
}
