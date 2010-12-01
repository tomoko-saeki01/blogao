package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSqlError class provides SQL database error information. A QSqlError object can provide database-specific error data, including the {@link com.trolltech.qt.sql.QSqlError#driverText() driverText()} and {@link com.trolltech.qt.sql.QSqlError#databaseText() databaseText()} messages (or both concatenated together as {@link com.trolltech.qt.sql.QSqlError#text() text()}), and the error {@link com.trolltech.qt.sql.QSqlError#number() number()} and {@link com.trolltech.qt.sql.QSqlError#type() type()}. The functions all have setters so that you can create and return QSqlError objects from your own classes, for example from your own SQL drivers. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#lastError() QSqlDatabase::lastError()}, and {@link com.trolltech.qt.sql.QSqlQuery#lastError() QSqlQuery::lastError()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSqlError extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.sql.QtJambi_LibraryInitializer.init();
    }
/**
This enum type describes the context in which the error occurred, e.g., a connection error, a statement error, etc.
*/

    public enum ErrorType implements com.trolltech.qt.QtEnumerator {
/**
 No error occurred.
*/

        NoError(0),
/**
 Connection error.
*/

        ConnectionError(1),
/**
 SQL statement syntax error.
*/

        StatementError(2),
/**
 Transaction failed error.
*/

        TransactionError(3),
/**
 Unknown error.
*/

        UnknownError(4);

        ErrorType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSqlError$ErrorType constant with the specified <tt>int</tt>.</brief>
*/

        public static ErrorType resolve(int value) {
            return (ErrorType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoError;
            case 1: return ConnectionError;
            case 2: return StatementError;
            case 3: return TransactionError;
            case 4: return UnknownError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Creates a copy of <tt>other</tt>.
*/

    public QSqlError(com.trolltech.qt.sql.QSqlError other){
        super((QPrivateConstructor)null);
        __qt_QSqlError_QSqlError(other == null ? 0 : other.nativeId());
    }

    native void __qt_QSqlError_QSqlError(long other);


/**
Constructs an error containing the driver error text <tt>driverText</tt>, the database-specific error text <tt>databaseText</tt>, the type <tt>type</tt> and the optional error number <tt>number</tt>.
*/

    public QSqlError(java.lang.String driverText, java.lang.String databaseText, com.trolltech.qt.sql.QSqlError.ErrorType type) {
        this(driverText, databaseText, type, (int)-1);
    }

/**
Constructs an error containing the driver error text <tt>driverText</tt>, the database-specific error text <tt>databaseText</tt>, the type <tt>type</tt> and the optional error number <tt>number</tt>.
*/

    public QSqlError(java.lang.String driverText, java.lang.String databaseText) {
        this(driverText, databaseText, com.trolltech.qt.sql.QSqlError.ErrorType.NoError, (int)-1);
    }

/**
Constructs an error containing the driver error text <tt>driverText</tt>, the database-specific error text <tt>databaseText</tt>, the type <tt>type</tt> and the optional error number <tt>number</tt>.
*/

    public QSqlError(java.lang.String driverText) {
        this(driverText, (java.lang.String)null, com.trolltech.qt.sql.QSqlError.ErrorType.NoError, (int)-1);
    }

/**
Constructs an error containing the driver error text <tt>driverText</tt>, the database-specific error text <tt>databaseText</tt>, the type <tt>type</tt> and the optional error number <tt>number</tt>.
*/

    public QSqlError() {
        this((java.lang.String)null, (java.lang.String)null, com.trolltech.qt.sql.QSqlError.ErrorType.NoError, (int)-1);
    }
/**
Constructs an error containing the driver error text <tt>driverText</tt>, the database-specific error text <tt>databaseText</tt>, the type <tt>type</tt> and the optional error number <tt>number</tt>.
*/

    public QSqlError(java.lang.String driverText, java.lang.String databaseText, com.trolltech.qt.sql.QSqlError.ErrorType type, int number){
        super((QPrivateConstructor)null);
        __qt_QSqlError_String_String_ErrorType_int(driverText, databaseText, type.value(), number);
    }

    native void __qt_QSqlError_String_String_ErrorType_int(java.lang.String driverText, java.lang.String databaseText, int type, int number);

/**
Returns the text of the error as reported by the database. This may contain database-specific descriptions; it may be empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlError#setDatabaseText(java.lang.String) setDatabaseText()}, {@link com.trolltech.qt.sql.QSqlError#driverText() driverText()}, and {@link com.trolltech.qt.sql.QSqlError#text() text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String databaseText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_databaseText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_databaseText(long __this__nativeId);

/**
Returns the text of the error as reported by the driver. This may contain database-specific descriptions. It may also be empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlError#setDriverText(java.lang.String) setDriverText()}, {@link com.trolltech.qt.sql.QSqlError#databaseText() databaseText()}, and {@link com.trolltech.qt.sql.QSqlError#text() text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String driverText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_driverText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_driverText(long __this__nativeId);

/**
Returns true if an error is set, otherwise false. <p>Example: <pre class="snippet">
    QSqlQueryModel model = new QSqlQueryModel();
    model.setQuery("select * from myTable");
    if (model.lastError().isValid())
        System.out.println(model.lastError());
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlError#type() type()}. <br></DD></DT>
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
Returns the database-specific error number, or -1 if it cannot be determined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlError#setNumber(int) setNumber()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int number()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_number(nativeId());
    }
    @QtBlockedSlot
    native int __qt_number(long __this__nativeId);

/**
Sets the database error text to the value of <tt>databaseText</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlError#databaseText() databaseText()}, {@link com.trolltech.qt.sql.QSqlError#setDriverText(java.lang.String) setDriverText()}, and {@link com.trolltech.qt.sql.QSqlError#text() text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDatabaseText(java.lang.String databaseText)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDatabaseText_String(nativeId(), databaseText);
    }
    @QtBlockedSlot
    native void __qt_setDatabaseText_String(long __this__nativeId, java.lang.String databaseText);

/**
Sets the driver error text to the value of <tt>driverText</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlError#driverText() driverText()}, {@link com.trolltech.qt.sql.QSqlError#setDatabaseText(java.lang.String) setDatabaseText()}, and {@link com.trolltech.qt.sql.QSqlError#text() text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDriverText(java.lang.String driverText)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDriverText_String(nativeId(), driverText);
    }
    @QtBlockedSlot
    native void __qt_setDriverText_String(long __this__nativeId, java.lang.String driverText);

/**
Sets the database-specific error number to <tt>number</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlError#number() number()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNumber(int number)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNumber_int(nativeId(), number);
    }
    @QtBlockedSlot
    native void __qt_setNumber_int(long __this__nativeId, int number);

/**
Sets the error type to the value of <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlError#type() type()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setType(com.trolltech.qt.sql.QSqlError.ErrorType type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setType_ErrorType(nativeId(), type.value());
    }
    @QtBlockedSlot
    native void __qt_setType_ErrorType(long __this__nativeId, int type);

/**
This is a convenience function that returns {@link com.trolltech.qt.sql.QSqlError#databaseText() databaseText()} and {@link com.trolltech.qt.sql.QSqlError#driverText() driverText()} concatenated into a single string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlError#driverText() driverText()}, and {@link com.trolltech.qt.sql.QSqlError#databaseText() databaseText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
Returns the error type, or -1 if the type cannot be determined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlError#setType(com.trolltech.qt.sql.QSqlError.ErrorType) setType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlError.ErrorType type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.sql.QSqlError.ErrorType.resolve(__qt_type(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
@exclude
*/

    public static native QSqlError fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSqlError(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSqlError array[]);

/**
<brief>Returns a string representation of the <tt>this QSqlError</tt>. </brief>
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
    public QSqlError clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSqlError __qt_clone(long __this_nativeId);
}
