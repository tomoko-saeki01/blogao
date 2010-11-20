package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSqlIndex class provides functions to manipulate and describe database indexes. An index refers to a single table or view in a database. Information about the fields that comprise the index can be used to generate SQL statements.
*/
@QtJambiGeneratedClass
public class QSqlIndex extends com.trolltech.qt.sql.QSqlRecord
    implements java.lang.Cloneable
{

/**
Constructs a copy of <tt>other</tt>.
*/

    public QSqlIndex(com.trolltech.qt.sql.QSqlIndex other){
        super((QPrivateConstructor)null);
        __qt_QSqlIndex_QSqlIndex(other == null ? 0 : other.nativeId());
    }

    native void __qt_QSqlIndex_QSqlIndex(long other);


/**
Constructs an empty index using the cursor name <tt>cursorname</tt> and index name <tt>name</tt>.
*/

    public QSqlIndex(java.lang.String cursorName) {
        this(cursorName, (java.lang.String)null);
    }

/**
Constructs an empty index using the cursor name <tt>cursorname</tt> and index name <tt>name</tt>.
*/

    public QSqlIndex() {
        this((java.lang.String)null, (java.lang.String)null);
    }
/**
Constructs an empty index using the cursor name <tt>cursorname</tt> and index name <tt>name</tt>.
*/

    public QSqlIndex(java.lang.String cursorName, java.lang.String name){
        super((QPrivateConstructor)null);
        __qt_QSqlIndex_String_String(cursorName, name);
    }

    native void __qt_QSqlIndex_String_String(java.lang.String cursorName, java.lang.String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void append(com.trolltech.qt.sql.QSqlField field)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_append_QSqlField(nativeId(), field == null ? 0 : field.nativeId());
    }
    @QtBlockedSlot
    native void __qt_append_QSqlField(long __this__nativeId, long field);

/**
This is an overloaded member function, provided for convenience. <p>Appends the field <tt>field</tt> to the list of indexed fields. The field is appended with an ascending sort order, unless <tt>desc</tt> is true.
*/

    @QtBlockedSlot
    public final void append(com.trolltech.qt.sql.QSqlField field, boolean desc)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_append_QSqlField_boolean(nativeId(), field == null ? 0 : field.nativeId(), desc);
    }
    @QtBlockedSlot
    native void __qt_append_QSqlField_boolean(long __this__nativeId, long field, boolean desc);

/**
Returns the name of the cursor which the index is associated with. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlIndex#setCursorName(java.lang.String) setCursorName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String cursorName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cursorName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_cursorName(long __this__nativeId);

/**
Returns true if field <tt>i</tt> in the index is sorted in descending order; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isDescending(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDescending_int(nativeId(), i);
    }
    @QtBlockedSlot
    native boolean __qt_isDescending_int(long __this__nativeId, int i);

/**
Returns the name of the index. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlIndex#setName(java.lang.String) setName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

/**
Sets the name of the cursor that the index is associated with to <tt>cursorName</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlIndex#cursorName() cursorName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCursorName(java.lang.String cursorName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCursorName_String(nativeId(), cursorName);
    }
    @QtBlockedSlot
    native void __qt_setCursorName_String(long __this__nativeId, java.lang.String cursorName);

/**
If <tt>desc</tt> is true, field <tt>i</tt> is sorted in descending order. Otherwise, field <tt>i</tt> is sorted in ascending order (the default). If the field does not exist, nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlIndex#isDescending(int) isDescending()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDescending(int i, boolean desc)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDescending_int_boolean(nativeId(), i, desc);
    }
    @QtBlockedSlot
    native void __qt_setDescending_int_boolean(long __this__nativeId, int i, boolean desc);

/**
Sets the name of the index to <tt>name</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlIndex#name() name()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setName(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setName_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setName_String(long __this__nativeId, java.lang.String name);

/**
@exclude
*/

    public static native QSqlIndex fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSqlIndex(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSqlIndex array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QSqlIndex clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSqlIndex __qt_clone(long __this_nativeId);
}
