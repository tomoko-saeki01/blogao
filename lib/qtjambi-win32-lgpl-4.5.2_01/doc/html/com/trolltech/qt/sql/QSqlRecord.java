package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSqlRecord class encapsulates a database record. The QSqlRecord class encapsulates the functionality and characteristics of a database record (usually a row in a table or view within the database). QSqlRecord supports adding and removing fields as well as setting and retrieving field values. <p>The values of a record's fields' can be set by name or position with {@link com.trolltech.qt.sql.QSqlRecord#setValue(java.lang.String, java.lang.Object) setValue()}; if you want to set a field to null use {@link com.trolltech.qt.sql.QSqlRecord#setNull(java.lang.String) setNull()}. To find the position of a field by name use {@link com.trolltech.qt.sql.QSqlRecord#indexOf(java.lang.String) indexOf()}, and to find the name of a field at a particular position use {@link com.trolltech.qt.sql.QSqlRecord#fieldName(int) fieldName()}. Use {@link com.trolltech.qt.sql.QSqlRecord#field(java.lang.String) field()} to retrieve a {@link com.trolltech.qt.sql.QSqlField QSqlField} object for a given field. Use {@link com.trolltech.qt.sql.QSqlRecord#contains(java.lang.String) contains()} to see if the record contains a particular field name. <p>When queries are generated to be executed on the database only those fields for which {@link com.trolltech.qt.sql.QSqlRecord#isGenerated(java.lang.String) isGenerated()} is true are included in the generated SQL. <p>A record can have fields added with {@link com.trolltech.qt.sql.QSqlRecord#append(com.trolltech.qt.sql.QSqlField) append()} or {@link com.trolltech.qt.sql.QSqlRecord#insert(int, com.trolltech.qt.sql.QSqlField) insert()}, replaced with {@link com.trolltech.qt.sql.QSqlRecord#replace(int, com.trolltech.qt.sql.QSqlField) replace()}, and removed with {@link com.trolltech.qt.sql.QSqlRecord#remove(int) remove()}. All the fields can be removed with {@link com.trolltech.qt.sql.QSqlRecord#clear() clear()}. The number of fields is given by {@link com.trolltech.qt.sql.QSqlRecord#count() count()}; all their values can be cleared (to null) using {@link com.trolltech.qt.sql.QSqlRecord#clearValues() clearValues()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField QSqlField}, and {@link com.trolltech.qt.sql.QSqlQuery#record() QSqlQuery::record()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSqlRecord extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.sql.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty record. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#isEmpty() isEmpty()}, {@link com.trolltech.qt.sql.QSqlRecord#append(com.trolltech.qt.sql.QSqlField) append()}, and {@link com.trolltech.qt.sql.QSqlRecord#insert(int, com.trolltech.qt.sql.QSqlField) insert()}. <br></DD></DT>
*/

    public QSqlRecord(){
        super((QPrivateConstructor)null);
        __qt_QSqlRecord();
    }

    native void __qt_QSqlRecord();

/**
Constructs a copy of <tt>other</tt>. <p>QSqlRecord is {@link <a href="../shared.html">implicitly shared</a>}. This means you can make copies of a record in {@link <a href="../containers.html">constant time</a>}.
*/

    public QSqlRecord(com.trolltech.qt.sql.QSqlRecord other){
        super((QPrivateConstructor)null);
        __qt_QSqlRecord_QSqlRecord(other == null ? 0 : other.nativeId());
    }

    native void __qt_QSqlRecord_QSqlRecord(long other);

/**
Append a copy of field <tt>field</tt> to the end of the record. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#insert(int, com.trolltech.qt.sql.QSqlField) insert()}, {@link com.trolltech.qt.sql.QSqlRecord#replace(int, com.trolltech.qt.sql.QSqlField) replace()}, and {@link com.trolltech.qt.sql.QSqlRecord#remove(int) remove()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void append(com.trolltech.qt.sql.QSqlField field)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_append_QSqlField(nativeId(), field == null ? 0 : field.nativeId());
    }
    @QtBlockedSlot
    native void __qt_append_QSqlField(long __this__nativeId, long field);

/**
Removes all the record's fields. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#clearValues() clearValues()}, and {@link com.trolltech.qt.sql.QSqlRecord#isEmpty() isEmpty()}. <br></DD></DT>
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
Clears the value of all fields in the record and sets each field to null. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#setValue(java.lang.String, java.lang.Object) setValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearValues()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearValues(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearValues(long __this__nativeId);

/**
Returns true if there is a field in the record called <tt>name</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean contains(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contains_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_contains_String(long __this__nativeId, java.lang.String name);

/**
Returns the number of fields in the record. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#isEmpty() isEmpty()}. <br></DD></DT>
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
This is an overloaded member function, provided for convenience. <p>Returns the field called <tt>name</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlField field(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_field_String(nativeId(), name);
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlField __qt_field_String(long __this__nativeId, java.lang.String name);

/**
Returns the field at position <tt>index</tt>. If the position is out of range, an empty field is returned.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlField field(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_field_int(nativeId(), i);
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlField __qt_field_int(long __this__nativeId, int i);

/**
Returns the name of the field at position <tt>index</tt>. If the field does not exist, an empty string is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#indexOf(java.lang.String) indexOf()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fieldName(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fieldName_int(nativeId(), i);
    }
    @QtBlockedSlot
    native java.lang.String __qt_fieldName_int(long __this__nativeId, int i);

/**
Returns the position of the field called <tt>name</tt> within the record, or -1 if it cannot be found. Field names are not case-sensitive. If more than one field matches, the first one is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#fieldName(int) fieldName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indexOf(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOf_String(nativeId(), name);
    }
    @QtBlockedSlot
    native int __qt_indexOf_String(long __this__nativeId, java.lang.String name);

/**
Inserts the field <tt>field</tt> at position <tt>pos</tt> in the record. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#append(com.trolltech.qt.sql.QSqlField) append()}, {@link com.trolltech.qt.sql.QSqlRecord#replace(int, com.trolltech.qt.sql.QSqlField) replace()}, and {@link com.trolltech.qt.sql.QSqlRecord#remove(int) remove()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insert(int pos, com.trolltech.qt.sql.QSqlField field)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insert_int_QSqlField(nativeId(), pos, field == null ? 0 : field.nativeId());
    }
    @QtBlockedSlot
    native void __qt_insert_int_QSqlField(long __this__nativeId, int pos, long field);

/**
Returns true if there are no fields in the record; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#append(com.trolltech.qt.sql.QSqlField) append()}, {@link com.trolltech.qt.sql.QSqlRecord#insert(int, com.trolltech.qt.sql.QSqlField) insert()}, and {@link com.trolltech.qt.sql.QSqlRecord#clear() clear()}. <br></DD></DT>
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
Returns true if the record has a field called <tt>name</tt> and this field is to be generated (the default); otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#setGenerated(java.lang.String, boolean) setGenerated()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isGenerated(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isGenerated_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_isGenerated_String(long __this__nativeId, java.lang.String name);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if the record has a field at position <tt>index</tt> and this field is to be generated (the default); otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#setGenerated(java.lang.String, boolean) setGenerated()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isGenerated(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isGenerated_int(nativeId(), i);
    }
    @QtBlockedSlot
    native boolean __qt_isGenerated_int(long __this__nativeId, int i);

/**
Returns true if the field called <tt>name</tt> is null or if there is no field called <tt>name</tt>; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#setNull(java.lang.String) setNull()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isNull(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_isNull_String(long __this__nativeId, java.lang.String name);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if the field <tt>index</tt> is null or if there is no field at position <tt>index</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isNull(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull_int(nativeId(), i);
    }
    @QtBlockedSlot
    native boolean __qt_isNull_int(long __this__nativeId, int i);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.sql.QSqlRecord other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QSqlRecord(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QSqlRecord(long __this__nativeId, long other);

/**
Removes the field at position <tt>pos</tt>. If <tt>pos</tt> is out of range, nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#append(com.trolltech.qt.sql.QSqlField) append()}, {@link com.trolltech.qt.sql.QSqlRecord#insert(int, com.trolltech.qt.sql.QSqlField) insert()}, and {@link com.trolltech.qt.sql.QSqlRecord#replace(int, com.trolltech.qt.sql.QSqlField) replace()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void remove(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_remove_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native void __qt_remove_int(long __this__nativeId, int pos);

/**
Replaces the field at position <tt>pos</tt> with the given <tt>field</tt>. If <tt>pos</tt> is out of range, nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#append(com.trolltech.qt.sql.QSqlField) append()}, {@link com.trolltech.qt.sql.QSqlRecord#insert(int, com.trolltech.qt.sql.QSqlField) insert()}, and {@link com.trolltech.qt.sql.QSqlRecord#remove(int) remove()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void replace(int pos, com.trolltech.qt.sql.QSqlField field)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_replace_int_QSqlField(nativeId(), pos, field == null ? 0 : field.nativeId());
    }
    @QtBlockedSlot
    native void __qt_replace_int_QSqlField(long __this__nativeId, int pos, long field);

/**
Sets the generated flag for the field called <tt>name</tt> to <tt>generated</tt>. If the field does not exist, nothing happens. Only fields that have <tt>generated</tt> set to true are included in the SQL that is generated by {@link com.trolltech.qt.sql.QSqlQueryModel QSqlQueryModel} for example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#isGenerated(java.lang.String) isGenerated()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setGenerated(java.lang.String name, boolean generated)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGenerated_String_boolean(nativeId(), name, generated);
    }
    @QtBlockedSlot
    native void __qt_setGenerated_String_boolean(long __this__nativeId, java.lang.String name, boolean generated);

/**
This is an overloaded member function, provided for convenience. <p>Sets the generated flag for the field <tt>index</tt> to <tt>generated</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#isGenerated(java.lang.String) isGenerated()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setGenerated(int i, boolean generated)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGenerated_int_boolean(nativeId(), i, generated);
    }
    @QtBlockedSlot
    native void __qt_setGenerated_int_boolean(long __this__nativeId, int i, boolean generated);

/**
This is an overloaded member function, provided for convenience. <p>Sets the value of the field called <tt>name</tt> to null. If the field does not exist, nothing happens.
*/

    @QtBlockedSlot
    public final void setNull(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNull_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setNull_String(long __this__nativeId, java.lang.String name);

/**
Sets the value of field <tt>index</tt> to null. If the field does not exist, nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#isNull(java.lang.String) isNull()}, and {@link com.trolltech.qt.sql.QSqlRecord#setValue(java.lang.String, java.lang.Object) setValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNull(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNull_int(nativeId(), i);
    }
    @QtBlockedSlot
    native void __qt_setNull_int(long __this__nativeId, int i);

/**
This is an overloaded member function, provided for convenience. <p>Sets the value of the field called <tt>name</tt> to <tt>val</tt>. If the field does not exist, nothing happens.
*/

    @QtBlockedSlot
    public final void setValue(java.lang.String name, java.lang.Object val)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_String_Object(nativeId(), name, val);
    }
    @QtBlockedSlot
    native void __qt_setValue_String_Object(long __this__nativeId, java.lang.String name, java.lang.Object val);

/**
Sets the value of the field at position <tt>index</tt> to <tt>val</tt>. If the field does not exist, nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#value(java.lang.String) value()}, and {@link com.trolltech.qt.sql.QSqlRecord#setNull(java.lang.String) setNull()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setValue(int i, java.lang.Object val)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_int_Object(nativeId(), i, val);
    }
    @QtBlockedSlot
    native void __qt_setValue_int_Object(long __this__nativeId, int i, java.lang.Object val);

/**
This is an overloaded member function, provided for convenience. <p>Returns the value of the field called <tt>name</tt> in the record. If field <tt>name</tt> does not exist an invalid variant is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#indexOf(java.lang.String) indexOf()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object value(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_String(nativeId(), name);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_value_String(long __this__nativeId, java.lang.String name);

/**
Returns the value of the field located at position <tt>index</tt> in the record. If <tt>index</tt> is out of bounds, an invalid {@link com.trolltech.qt.QVariant QVariant} is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#setValue(java.lang.String, java.lang.Object) setValue()}, {@link com.trolltech.qt.sql.QSqlRecord#fieldName(int) fieldName()}, and {@link com.trolltech.qt.sql.QSqlRecord#isNull(java.lang.String) isNull()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object value(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_int(nativeId(), i);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_value_int(long __this__nativeId, int i);

/**
@exclude
*/

    public static native QSqlRecord fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSqlRecord(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSqlRecord array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.sql.QSqlRecord)
        return operator_equal((com.trolltech.qt.sql.QSqlRecord) other);
        return false;
    }


/**
<brief>Returns a string representation of the <tt>this QSqlRecord</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QSqlRecord clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSqlRecord __qt_clone(long __this_nativeId);
}
