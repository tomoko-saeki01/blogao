package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSqlField class manipulates the fields in SQL database tables and views. QSqlField represents the characteristics of a single column in a database table or view, such as the data type and column name. A field also contains the value of the database column, which can be viewed or changed. <p>Field data values are stored as QVariants. Using an incompatible type is not permitted. For example: <pre class="snippet">
        QSqlField field = new QSqlField("age");
        field.setValue(new QPixmap());  // WRONG
    </pre> However, the field will attempt to cast certain data types to the field data type where possible: <pre class="snippet">
        QSqlField field = new QSqlField("age");
        field.setValue("123");  // casts String to int
    </pre> QSqlField objects are rarely created explicitly in application code. They are usually accessed indirectly through {@link com.trolltech.qt.sql.QSqlRecord QSqlRecord}s that already contain a list of fields. For example: <pre class="snippet">
        QSqlQuery query = new QSqlQuery();
    ...
        QSqlRecord record = query.record();
    
        QSqlField field = record.field("country");
    </pre> A QSqlField object can provide some meta-data about the field, for example, its {@link com.trolltech.qt.sql.QSqlField#name() name()}, variant {@link com.trolltech.qt.sql.QSqlField#type() type()}, {@link com.trolltech.qt.sql.QSqlField#length() length()}, {@link com.trolltech.qt.sql.QSqlField#precision() precision()}, {@link com.trolltech.qt.sql.QSqlField#defaultValue() defaultValue()}, typeID(), and its {@link com.trolltech.qt.sql.QSqlField#requiredStatus() requiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#isGenerated() isGenerated()} and {@link com.trolltech.qt.sql.QSqlField#isReadOnly() isReadOnly()}. The field's data can be checked to see if it {@link com.trolltech.qt.sql.QSqlField#isNull() isNull()}, and its {@link com.trolltech.qt.sql.QSqlField#value() value()} retrieved. When editing the data can be set with {@link com.trolltech.qt.sql.QSqlField#setValue(java.lang.Object) setValue()} or set to NULL with {@link com.trolltech.qt.sql.QSqlField#clear() clear()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord QSqlRecord}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSqlField extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.sql.QtJambi_LibraryInitializer.init();
    }
/**
Specifies whether the field is required or optional. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#requiredStatus() requiredStatus()}. <br></DD></DT>
*/

    public enum
/**
 The field must be specified when inserting records.
*/
 RequiredStatus implements com.trolltech.qt.QtEnumerator {
/**
 The database driver couldn't determine whether the field is required or optional.
*/

        Unknown(-1),
/**
 The fields doesn't have to be specified when inserting records.
*/

        Optional(0),
        Required(1);

        RequiredStatus(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSqlField$RequiredStatus constant with the specified <tt>int</tt>.</brief>
*/

        public static RequiredStatus resolve(int value) {
            return (RequiredStatus) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case -1: return Unknown;
            case 0: return Optional;
            case 1: return Required;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a copy of <tt>other</tt>.
*/

    public QSqlField(com.trolltech.qt.sql.QSqlField other){
        super((QPrivateConstructor)null);
        __qt_QSqlField_QSqlField(other == null ? 0 : other.nativeId());
    }

    native void __qt_QSqlField_QSqlField(long other);


/**
Constructs an empty field called <tt>fieldName</tt> of variant type <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setRequiredStatus(com.trolltech.qt.sql.QSqlField.RequiredStatus) setRequiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#setLength(int) setLength()}, {@link com.trolltech.qt.sql.QSqlField#setPrecision(int) setPrecision()}, {@link com.trolltech.qt.sql.QSqlField#setDefaultValue(java.lang.Object) setDefaultValue()}, {@link com.trolltech.qt.sql.QSqlField#setGenerated(boolean) setGenerated()}, and {@link com.trolltech.qt.sql.QSqlField#setReadOnly(boolean) setReadOnly()}. <br></DD></DT>
*/

    public QSqlField(java.lang.String fieldName) {
        this(fieldName, (int)0);
    }

/**
Constructs an empty field called <tt>fieldName</tt> of variant type <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setRequiredStatus(com.trolltech.qt.sql.QSqlField.RequiredStatus) setRequiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#setLength(int) setLength()}, {@link com.trolltech.qt.sql.QSqlField#setPrecision(int) setPrecision()}, {@link com.trolltech.qt.sql.QSqlField#setDefaultValue(java.lang.Object) setDefaultValue()}, {@link com.trolltech.qt.sql.QSqlField#setGenerated(boolean) setGenerated()}, and {@link com.trolltech.qt.sql.QSqlField#setReadOnly(boolean) setReadOnly()}. <br></DD></DT>
*/

    public QSqlField() {
        this((java.lang.String)null, (int)0);
    }
/**
Constructs an empty field called <tt>fieldName</tt> of variant type <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setRequiredStatus(com.trolltech.qt.sql.QSqlField.RequiredStatus) setRequiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#setLength(int) setLength()}, {@link com.trolltech.qt.sql.QSqlField#setPrecision(int) setPrecision()}, {@link com.trolltech.qt.sql.QSqlField#setDefaultValue(java.lang.Object) setDefaultValue()}, {@link com.trolltech.qt.sql.QSqlField#setGenerated(boolean) setGenerated()}, and {@link com.trolltech.qt.sql.QSqlField#setReadOnly(boolean) setReadOnly()}. <br></DD></DT>
*/

    public QSqlField(java.lang.String fieldName, int type){
        super((QPrivateConstructor)null);
        __qt_QSqlField_String_int(fieldName, type);
    }

    native void __qt_QSqlField_String_int(java.lang.String fieldName, int type);

/**
Clears the value of the field and sets it to NULL. If the field is read-only, nothing happens. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setValue(java.lang.Object) setValue()}, {@link com.trolltech.qt.sql.QSqlField#isReadOnly() isReadOnly()}, and {@link com.trolltech.qt.sql.QSqlField#requiredStatus() requiredStatus()}. <br></DD></DT>
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
Returns the field's default value (which may be NULL). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setDefaultValue(java.lang.Object) setDefaultValue()}, {@link com.trolltech.qt.sql.QSqlField#type() type()}, {@link com.trolltech.qt.sql.QSqlField#requiredStatus() requiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#length() length()}, {@link com.trolltech.qt.sql.QSqlField#precision() precision()}, and {@link com.trolltech.qt.sql.QSqlField#isGenerated() isGenerated()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object defaultValue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_defaultValue(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_defaultValue(long __this__nativeId);

/**
Returns true if the value is auto-generated by the database, for example auto-increment primary key values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setAutoValue(boolean) setAutoValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isAutoValue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAutoValue(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAutoValue(long __this__nativeId);

/**
Returns true if the field is generated; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setGenerated(boolean) setGenerated()}, {@link com.trolltech.qt.sql.QSqlField#type() type()}, {@link com.trolltech.qt.sql.QSqlField#requiredStatus() requiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#length() length()}, {@link com.trolltech.qt.sql.QSqlField#precision() precision()}, and {@link com.trolltech.qt.sql.QSqlField#defaultValue() defaultValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isGenerated()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isGenerated(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isGenerated(long __this__nativeId);

/**
Returns true if the field's value is NULL; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#value() value()}. <br></DD></DT>
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
Returns true if the field's value is read-only; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setReadOnly(boolean) setReadOnly()}, {@link com.trolltech.qt.sql.QSqlField#type() type()}, {@link com.trolltech.qt.sql.QSqlField#requiredStatus() requiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#length() length()}, {@link com.trolltech.qt.sql.QSqlField#precision() precision()}, {@link com.trolltech.qt.sql.QSqlField#defaultValue() defaultValue()}, and {@link com.trolltech.qt.sql.QSqlField#isGenerated() isGenerated()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isReadOnly()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isReadOnly(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isReadOnly(long __this__nativeId);

/**
Returns true if the field's variant type is valid; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns the field's length. <p>If the returned value is negative, it means that the information is not available from the database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setLength(int) setLength()}, {@link com.trolltech.qt.sql.QSqlField#type() type()}, {@link com.trolltech.qt.sql.QSqlField#requiredStatus() requiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#precision() precision()}, {@link com.trolltech.qt.sql.QSqlField#defaultValue() defaultValue()}, and {@link com.trolltech.qt.sql.QSqlField#isGenerated() isGenerated()}. <br></DD></DT>
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
Returns the name of the field. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setName(java.lang.String) setName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.sql.QSqlField other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QSqlField(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QSqlField(long __this__nativeId, long other);

/**
Returns the field's precision; this is only meaningful for numeric types. <p>If the returned value is negative, it means that the information is not available from the database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setPrecision(int) setPrecision()}, {@link com.trolltech.qt.sql.QSqlField#type() type()}, {@link com.trolltech.qt.sql.QSqlField#requiredStatus() requiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#length() length()}, {@link com.trolltech.qt.sql.QSqlField#defaultValue() defaultValue()}, and {@link com.trolltech.qt.sql.QSqlField#isGenerated() isGenerated()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int precision()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_precision(nativeId());
    }
    @QtBlockedSlot
    native int __qt_precision(long __this__nativeId);

/**
Returns true if this is a required field; otherwise returns false. An <tt>INSERT</tt> will fail if a required field does not have a value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setRequiredStatus(com.trolltech.qt.sql.QSqlField.RequiredStatus) setRequiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#type() type()}, {@link com.trolltech.qt.sql.QSqlField#length() length()}, {@link com.trolltech.qt.sql.QSqlField#precision() precision()}, {@link com.trolltech.qt.sql.QSqlField#defaultValue() defaultValue()}, and {@link com.trolltech.qt.sql.QSqlField#isGenerated() isGenerated()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlField.RequiredStatus requiredStatus()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.sql.QSqlField.RequiredStatus.resolve(__qt_requiredStatus(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_requiredStatus(long __this__nativeId);

/**
Marks the field as an auto-generated value if <tt>autoVal</tt> is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#isAutoValue() isAutoValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAutoValue(boolean autoVal)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoValue_boolean(nativeId(), autoVal);
    }
    @QtBlockedSlot
    native void __qt_setAutoValue_boolean(long __this__nativeId, boolean autoVal);

/**
Sets the default value used for this field to <tt>value</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#defaultValue() defaultValue()}, {@link com.trolltech.qt.sql.QSqlField#value() value()}, {@link com.trolltech.qt.sql.QSqlField#setType(int) setType()}, {@link com.trolltech.qt.sql.QSqlField#setRequiredStatus(com.trolltech.qt.sql.QSqlField.RequiredStatus) setRequiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#setLength(int) setLength()}, {@link com.trolltech.qt.sql.QSqlField#setPrecision(int) setPrecision()}, {@link com.trolltech.qt.sql.QSqlField#setGenerated(boolean) setGenerated()}, and {@link com.trolltech.qt.sql.QSqlField#setReadOnly(boolean) setReadOnly()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDefaultValue(java.lang.Object value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefaultValue_Object(nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_setDefaultValue_Object(long __this__nativeId, java.lang.Object value);

/**
Sets the generated state. If <tt>gen</tt> is false, no SQL will be generated for this field; otherwise, Qt classes such as {@link com.trolltech.qt.sql.QSqlQueryModel QSqlQueryModel} and {@link com.trolltech.qt.sql.QSqlTableModel QSqlTableModel} will generate SQL for this field. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#isGenerated() isGenerated()}, {@link com.trolltech.qt.sql.QSqlField#setType(int) setType()}, {@link com.trolltech.qt.sql.QSqlField#setRequiredStatus(com.trolltech.qt.sql.QSqlField.RequiredStatus) setRequiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#setLength(int) setLength()}, {@link com.trolltech.qt.sql.QSqlField#setPrecision(int) setPrecision()}, {@link com.trolltech.qt.sql.QSqlField#setDefaultValue(java.lang.Object) setDefaultValue()}, and {@link com.trolltech.qt.sql.QSqlField#setReadOnly(boolean) setReadOnly()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setGenerated(boolean gen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGenerated_boolean(nativeId(), gen);
    }
    @QtBlockedSlot
    native void __qt_setGenerated_boolean(long __this__nativeId, boolean gen);

/**
Sets the field's length to <tt>fieldLength</tt>. For strings this is the maximum number of characters the string can hold; the meaning varies for other types. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#length() length()}, {@link com.trolltech.qt.sql.QSqlField#setType(int) setType()}, {@link com.trolltech.qt.sql.QSqlField#setRequiredStatus(com.trolltech.qt.sql.QSqlField.RequiredStatus) setRequiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#setPrecision(int) setPrecision()}, {@link com.trolltech.qt.sql.QSqlField#setDefaultValue(java.lang.Object) setDefaultValue()}, {@link com.trolltech.qt.sql.QSqlField#setGenerated(boolean) setGenerated()}, and {@link com.trolltech.qt.sql.QSqlField#setReadOnly(boolean) setReadOnly()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLength(int fieldLength)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLength_int(nativeId(), fieldLength);
    }
    @QtBlockedSlot
    native void __qt_setLength_int(long __this__nativeId, int fieldLength);

/**
Sets the name of the field to <tt>name</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#name() name()}. <br></DD></DT>
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
Sets the field's <tt>precision</tt>. This only affects numeric fields. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#precision() precision()}, {@link com.trolltech.qt.sql.QSqlField#setType(int) setType()}, {@link com.trolltech.qt.sql.QSqlField#setRequiredStatus(com.trolltech.qt.sql.QSqlField.RequiredStatus) setRequiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#setLength(int) setLength()}, {@link com.trolltech.qt.sql.QSqlField#setDefaultValue(java.lang.Object) setDefaultValue()}, {@link com.trolltech.qt.sql.QSqlField#setGenerated(boolean) setGenerated()}, and {@link com.trolltech.qt.sql.QSqlField#setReadOnly(boolean) setReadOnly()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrecision(int precision)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrecision_int(nativeId(), precision);
    }
    @QtBlockedSlot
    native void __qt_setPrecision_int(long __this__nativeId, int precision);

/**
Sets the read only flag of the field's value to <tt>readOnly</tt>. A read-only field cannot have its value set with {@link com.trolltech.qt.sql.QSqlField#setValue(java.lang.Object) setValue()} and cannot be cleared to NULL with {@link com.trolltech.qt.sql.QSqlField#clear() clear()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#isReadOnly() isReadOnly()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setReadOnly(boolean readOnly)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setReadOnly_boolean(nativeId(), readOnly);
    }
    @QtBlockedSlot
    native void __qt_setReadOnly_boolean(long __this__nativeId, boolean readOnly);

/**
Sets the required status of this field to {@link com.trolltech.qt.sql.QSqlField.RequiredStatus Required } if <tt>required</tt> is true; otherwise sets it to {@link com.trolltech.qt.sql.QSqlField.RequiredStatus Optional }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setRequiredStatus(com.trolltech.qt.sql.QSqlField.RequiredStatus) setRequiredStatus()}, and {@link com.trolltech.qt.sql.QSqlField#requiredStatus() requiredStatus()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRequired(boolean required)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRequired_boolean(nativeId(), required);
    }
    @QtBlockedSlot
    native void __qt_setRequired_boolean(long __this__nativeId, boolean required);

/**
Sets the required status of this field to <tt>required</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#requiredStatus() requiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#setType(int) setType()}, {@link com.trolltech.qt.sql.QSqlField#setLength(int) setLength()}, {@link com.trolltech.qt.sql.QSqlField#setPrecision(int) setPrecision()}, {@link com.trolltech.qt.sql.QSqlField#setDefaultValue(java.lang.Object) setDefaultValue()}, {@link com.trolltech.qt.sql.QSqlField#setGenerated(boolean) setGenerated()}, and {@link com.trolltech.qt.sql.QSqlField#setReadOnly(boolean) setReadOnly()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRequiredStatus(com.trolltech.qt.sql.QSqlField.RequiredStatus status)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRequiredStatus_RequiredStatus(nativeId(), status.value());
    }
    @QtBlockedSlot
    native void __qt_setRequiredStatus_RequiredStatus(long __this__nativeId, int status);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setSqlType(int type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSqlType_int(nativeId(), type);
    }
    @QtBlockedSlot
    native void __qt_setSqlType_int(long __this__nativeId, int type);

/**
Set's the field's variant type to <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#type() type()}, {@link com.trolltech.qt.sql.QSqlField#setRequiredStatus(com.trolltech.qt.sql.QSqlField.RequiredStatus) setRequiredStatus()}, {@link com.trolltech.qt.sql.QSqlField#setLength(int) setLength()}, {@link com.trolltech.qt.sql.QSqlField#setPrecision(int) setPrecision()}, {@link com.trolltech.qt.sql.QSqlField#setDefaultValue(java.lang.Object) setDefaultValue()}, {@link com.trolltech.qt.sql.QSqlField#setGenerated(boolean) setGenerated()}, and {@link com.trolltech.qt.sql.QSqlField#setReadOnly(boolean) setReadOnly()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setType(int type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setType_int(nativeId(), type);
    }
    @QtBlockedSlot
    native void __qt_setType_int(long __this__nativeId, int type);

/**
Sets the value of the field to <tt>value</tt>. If the field is read-only ({@link com.trolltech.qt.sql.QSqlField#isReadOnly() isReadOnly()} returns true), nothing happens. <p>If the data type of <tt>value</tt> differs from the field's current data type, an attempt is made to cast it to the proper type. This preserves the data type of the field in the case of assignment, e.g. a QString to an integer data type. <p>To set the value to NULL, use {@link com.trolltech.qt.sql.QSqlField#clear() clear()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#value() value()}, {@link com.trolltech.qt.sql.QSqlField#isReadOnly() isReadOnly()}, and {@link com.trolltech.qt.sql.QSqlField#defaultValue() defaultValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setValue(java.lang.Object value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_Object(nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_setValue_Object(long __this__nativeId, java.lang.Object value);

/**
Returns the field's type as stored in the database. Note that the actual value might have a different type, Numerical values that are too large to store in a long int or double are usually stored as strings to prevent precision loss. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setType(int) setType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type(nativeId());
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int typeID()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_typeID(nativeId());
    }
    @QtBlockedSlot
    native int __qt_typeID(long __this__nativeId);

/**
Returns the value of the field as a {@link com.trolltech.qt.QVariant QVariant}. <p>Use {@link com.trolltech.qt.sql.QSqlField#isNull() isNull()} to check if the field's value is NULL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlField#setValue(java.lang.Object) setValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object value()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_value(long __this__nativeId);

/**
@exclude
*/

    public static native QSqlField fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSqlField(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSqlField array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.sql.QSqlField)
        return operator_equal((com.trolltech.qt.sql.QSqlField) other);
        return false;
    }


/**
<brief>Returns a string representation of the <tt>this QSqlField</tt>. </brief>
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
    public QSqlField clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSqlField __qt_clone(long __this_nativeId);
}
