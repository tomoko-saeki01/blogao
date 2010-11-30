package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSqlDriver class is an abstract base class for accessing specific SQL databases. This class should not be used directly. Use {@link com.trolltech.qt.sql.QSqlDatabase QSqlDatabase} instead. <p>If you want to create your own SQL drivers, you can subclass this class and reimplement its pure virtual functions and those virtual functions that you need. See {@link <a href="../sql-driver.html">How to Write Your Own Database Driver</a>} for more information. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase QSqlDatabase}, and {@link com.trolltech.qt.sql.QSqlResult QSqlResult}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QSqlDriver extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.sql.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.sql.QSqlDriver {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void close() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_close(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.sql.QSqlResult createResult() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_createResult(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature f) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_hasFeature_DriverFeature(nativeId(), f.value());
        }

        @Override
        @QtBlockedSlot
        public boolean open(java.lang.String db, java.lang.String user, java.lang.String password, java.lang.String host, int port, java.lang.String connOpts) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_open_String_String_String_String_int_String(nativeId(), db, user, password, host, port, connOpts);
        }
    }

    
/**
This enum contains a list of SQL statement (or clause) types the driver can create. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#sqlStatement(com.trolltech.qt.sql.QSqlDriver.StatementType, java.lang.String, com.trolltech.qt.sql.QSqlRecord, boolean) sqlStatement()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum StatementType implements com.trolltech.qt.QtEnumerator {
/**
 An SQL <tt>WHERE</tt> statement (e.g., <tt>WHERE f = 5</tt>).
*/

        WhereStatement(0),
/**
 An SQL <tt>SELECT</tt> statement (e.g., <tt>SELECT f FROM t</tt>).
*/

        SelectStatement(1),
/**
 An SQL <tt>UPDATE</tt> statement (e.g., <tt>UPDATE TABLE t set f = 1</tt>).
*/

        UpdateStatement(2),
/**
 An SQL <tt>INSERT</tt> statement (e.g., <tt>INSERT INTO t (f) values (1)</tt>).
*/

        InsertStatement(3),
/**
 An SQL <tt>DELETE</tt> statement (e.g., <tt>DELETE FROM t</tt>).
*/

        DeleteStatement(4);

        StatementType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSqlDriver$StatementType constant with the specified <tt>int</tt>.</brief>
*/

        public static StatementType resolve(int value) {
            return (StatementType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return WhereStatement;
            case 1: return SelectStatement;
            case 2: return UpdateStatement;
            case 3: return InsertStatement;
            case 4: return DeleteStatement;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum contains a list of SQL identifier types.
*/
@QtBlockedEnum
    public enum IdentifierType implements com.trolltech.qt.QtEnumerator {
/**
 A SQL field name
*/

        FieldName(0),
/**
 A SQL table name
*/

        TableName(1);

        IdentifierType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSqlDriver$IdentifierType constant with the specified <tt>int</tt>.</brief>
*/

        public static IdentifierType resolve(int value) {
            return (IdentifierType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return FieldName;
            case 1: return TableName;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum contains a list of features a driver might support. Use {@link com.trolltech.qt.sql.QSqlDriver#hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature) hasFeature()} to query whether a feature is supported or not. More information about supported features can be found in the {@link <a href="../sql-driver.html">Qt SQL driver</a>} documentation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature) hasFeature()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum DriverFeature implements com.trolltech.qt.QtEnumerator {
/**
 Whether the driver supports SQL transactions.
*/

        Transactions(0),
/**
 Whether the database is capable of reporting the size of a query. Note that some databases do not support returning the size (i.e. number of rows returned) of a query, in which case {@link com.trolltech.qt.sql.QSqlQuery#size() QSqlQuery::size()} will return -1.
*/

        QuerySize(1),
/**
 Whether the driver supports Binary Large Object fields.
*/

        BLOB(2),
/**
 Whether the driver supports Unicode strings if the database server does.
*/

        Unicode(3),
/**
 Whether the driver supports prepared query execution.
*/

        PreparedQueries(4),
/**
 Whether the driver supports the use of named placeholders.
*/

        NamedPlaceholders(5),
/**
 Whether the driver supports the use of positional placeholders.
*/

        PositionalPlaceholders(6),
/**
 Whether the driver supports returning the Id of the last touched row.
*/

        LastInsertId(7),
/**
 Whether the driver supports batched operations, see {@link com.trolltech.qt.sql.QSqlQuery#execBatch() QSqlQuery::execBatch()}
*/

        BatchOperations(8),
/**
 Whether the driver disallows a write lock on a table while other queries have a read lock on it.
*/

        SimpleLocking(9),
/**
 Whether the driver allows fetching numerical values with low precision.
*/

        LowPrecisionNumbers(10),
/**
 Whether the driver supports database event notifications.
*/

        EventNotifications(11),
/**
 Whether the driver can do any low-level resource cleanup when {@link com.trolltech.qt.sql.QSqlQuery#finish() QSqlQuery::finish()} is called.
*/

        FinishQuery(12),
/**
 Whether the driver can access multiple result sets returned from batched statements or stored procedures.
*/

        MultipleResultSets(13);

        DriverFeature(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSqlDriver$DriverFeature constant with the specified <tt>int</tt>.</brief>
*/

        public static DriverFeature resolve(int value) {
            return (DriverFeature) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Transactions;
            case 1: return QuerySize;
            case 2: return BLOB;
            case 3: return Unicode;
            case 4: return PreparedQueries;
            case 5: return NamedPlaceholders;
            case 6: return PositionalPlaceholders;
            case 7: return LastInsertId;
            case 8: return BatchOperations;
            case 9: return SimpleLocking;
            case 10: return LowPrecisionNumbers;
            case 11: return EventNotifications;
            case 12: return FinishQuery;
            case 13: return MultipleResultSets;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: name)&gt;:<p> This signal is emitted when the database posts an event notification that the driver subscribes to. <tt>name</tt> identifies the event notification. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#subscribeToNotification(java.lang.String) subscribeToNotification()}. <br></DD></DT>
*/

    public final Signal1<java.lang.String> notification = new Signal1<java.lang.String>();

    private final void notification(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_notification_String(nativeId(), name);
    }
    native void __qt_notification_String(long __this__nativeId, java.lang.String name);


/**
Constructs a new driver with the given <tt>parent</tt>.
*/

    public QSqlDriver() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new driver with the given <tt>parent</tt>.
*/

    public QSqlDriver(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSqlDriver_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSqlDriver_QObject(long parent);

/**
Returns true if the there was an error opening the database connection; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isOpenError()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isOpenError(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isOpenError(long __this__nativeId);

/**
Returns a {@link com.trolltech.qt.sql.QSqlError QSqlError} object which contains information about the last error that occurred on the database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#setLastError(com.trolltech.qt.sql.QSqlError) setLastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlError lastError()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastError(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlError __qt_lastError(long __this__nativeId);

/**
This function is called to subscribe to event notifications from the database. <tt>name</tt> identifies the event notification. <p>If successful, return true, otherwise return false. <p>The database must be open when this function is called. When the database is closed by calling {@link com.trolltech.qt.sql.QSqlDriver#close() close()} all subscribed event notifications are automatically unsubscribed. Note that calling {@link com.trolltech.qt.sql.QSqlDriver#open(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) open()} on an already open database may implicitly cause {@link com.trolltech.qt.sql.QSqlDriver#close() close()} to be called, which will cause the driver to unsubscribe from all event notifications. <p>When an event notification identified by <tt>name</tt> is posted by the database the {@link com.trolltech.qt.sql.QSqlDriver#notification notification() } signal is emitted. <p><b>Warning:</b> Because of binary compatibility constraints, this function is not virtual. If you want to provide event notification support in your own QSqlDriver subclass, reimplement the {@link com.trolltech.qt.sql.QSqlDriver#subscribeToNotificationImplementation(java.lang.String) subscribeToNotificationImplementation()} slot in your subclass instead. The {@link com.trolltech.qt.sql.QSqlDriver#subscribeToNotification(java.lang.String) subscribeToNotification()} function will dynamically detect the slot and call it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#unsubscribeFromNotification(java.lang.String) unsubscribeFromNotification()}, {@link com.trolltech.qt.sql.QSqlDriver#subscribedToNotifications() subscribedToNotifications()}, and {@link com.trolltech.qt.sql.QSqlDriver#hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature) QSqlDriver::hasFeature()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean subscribeToNotification(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subscribeToNotification_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_subscribeToNotification_String(long __this__nativeId, java.lang.String name);

/**
This slot is called to subscribe to event notifications from the database. <tt>name</tt> identifies the event notification. <p>If successful, return true, otherwise return false. <p>The database must be open when this slot is called. When the database is closed by calling {@link com.trolltech.qt.sql.QSqlDriver#close() close()} all subscribed event notifications are automatically unsubscribed. Note that calling {@link com.trolltech.qt.sql.QSqlDriver#open(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) open()} on an already open database may implicitly cause {@link com.trolltech.qt.sql.QSqlDriver#close() close()} to be called, which will cause the driver to unsubscribe from all event notifications. <p>When an event notification identified by <tt>name</tt> is posted by the database the {@link com.trolltech.qt.sql.QSqlDriver#notification notification() } signal is emitted. <p>Reimplement this slot to provide your own QSqlDriver subclass with event notification support; because of binary compatibility constraints, the {@link com.trolltech.qt.sql.QSqlDriver#subscribeToNotification(java.lang.String) subscribeToNotification()} function (introduced in Qt 4.4) is not virtual. Instead, {@link com.trolltech.qt.sql.QSqlDriver#subscribeToNotification(java.lang.String) subscribeToNotification()} will dynamically detect and call this slot. The default implementation does nothing and returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#subscribeToNotification(java.lang.String) subscribeToNotification()}. <br></DD></DT>
*/

    protected final boolean subscribeToNotificationImplementation(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subscribeToNotificationImplementation_String(nativeId(), name);
    }
    native boolean __qt_subscribeToNotificationImplementation_String(long __this__nativeId, java.lang.String name);

/**
Returns a list of the names of the event notifications that are currently subscribed to. <p><b>Warning:</b> Because of binary compatibility constraints, this function is not virtual. If you want to provide event notification support in your own QSqlDriver subclass, reimplement the {@link com.trolltech.qt.sql.QSqlDriver#subscribedToNotificationsImplementation() subscribedToNotificationsImplementation()} slot in your subclass instead. The {@link com.trolltech.qt.sql.QSqlDriver#subscribedToNotifications() subscribedToNotifications()} function will dynamically detect the slot and call it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#subscribeToNotification(java.lang.String) subscribeToNotification()}, and {@link com.trolltech.qt.sql.QSqlDriver#unsubscribeFromNotification(java.lang.String) unsubscribeFromNotification()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> subscribedToNotifications()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subscribedToNotifications(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_subscribedToNotifications(long __this__nativeId);

/**
Returns a list of the names of the event notifications that are currently subscribed to. <p>Reimplement this slot to provide your own QSqlDriver subclass with event notification support; because of binary compatibility constraints, the {@link com.trolltech.qt.sql.QSqlDriver#subscribedToNotifications() subscribedToNotifications()} function (introduced in Qt 4.4) is not virtual. Instead, {@link com.trolltech.qt.sql.QSqlDriver#subscribedToNotifications() subscribedToNotifications()} will dynamically detect and call this slot. The default implementation simply returns an empty QStringList. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#subscribedToNotifications() subscribedToNotifications()}. <br></DD></DT>
*/

    protected final java.util.List<java.lang.String> subscribedToNotificationsImplementation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subscribedToNotificationsImplementation(nativeId());
    }
    native java.util.List<java.lang.String> __qt_subscribedToNotificationsImplementation(long __this__nativeId);

/**
This function is called to unsubscribe from event notifications from the database. <tt>name</tt> identifies the event notification. <p>If successful, return true, otherwise return false. <p>The database must be open when this function is called. All subscribed event notifications are automatically unsubscribed from when the {@link com.trolltech.qt.sql.QSqlDriver#close() close()} function is called. <p>After calling this function the {@link com.trolltech.qt.sql.QSqlDriver#notification notification() } signal will no longer be emitted when an event notification identified by <tt>name</tt> is posted by the database. <p><b>Warning:</b> Because of binary compatibility constraints, this function is not virtual. If you want to provide event notification support in your own QSqlDriver subclass, reimplement the {@link com.trolltech.qt.sql.QSqlDriver#unsubscribeFromNotificationImplementation(java.lang.String) unsubscribeFromNotificationImplementation()} slot in your subclass instead. The {@link com.trolltech.qt.sql.QSqlDriver#unsubscribeFromNotification(java.lang.String) unsubscribeFromNotification()} function will dynamically detect the slot and call it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#subscribeToNotification(java.lang.String) subscribeToNotification()}, and {@link com.trolltech.qt.sql.QSqlDriver#subscribedToNotifications() subscribedToNotifications()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean unsubscribeFromNotification(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_unsubscribeFromNotification_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_unsubscribeFromNotification_String(long __this__nativeId, java.lang.String name);

/**
This slot is called to unsubscribe from event notifications from the database. <tt>name</tt> identifies the event notification. <p>If successful, return true, otherwise return false. <p>The database must be open when this slot is called. All subscribed event notifications are automatically unsubscribed from when the {@link com.trolltech.qt.sql.QSqlDriver#close() close()} function is called. <p>After calling this slot the {@link com.trolltech.qt.sql.QSqlDriver#notification notification() } signal will no longer be emitted when an event notification identified by <tt>name</tt> is posted by the database. <p>Reimplement this slot to provide your own QSqlDriver subclass with event notification support; because of binary compatibility constraints, the {@link com.trolltech.qt.sql.QSqlDriver#unsubscribeFromNotification(java.lang.String) unsubscribeFromNotification()} function (introduced in Qt 4.4) is not virtual. Instead, {@link com.trolltech.qt.sql.QSqlDriver#unsubscribeFromNotification(java.lang.String) unsubscribeFromNotification()} will dynamically detect and call this slot. The default implementation does nothing and returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#unsubscribeFromNotification(java.lang.String) unsubscribeFromNotification()}. <br></DD></DT>
*/

    protected final boolean unsubscribeFromNotificationImplementation(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_unsubscribeFromNotificationImplementation_String(nativeId(), name);
    }
    native boolean __qt_unsubscribeFromNotificationImplementation_String(long __this__nativeId, java.lang.String name);

/**
This function is called to begin a transaction. If successful, return true, otherwise return false. The default implementation does nothing and returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#commitTransaction() commitTransaction()}, and {@link com.trolltech.qt.sql.QSqlDriver#rollbackTransaction() rollbackTransaction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean beginTransaction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_beginTransaction(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_beginTransaction(long __this__nativeId);

/**
Derived classes must reimplement this pure virtual function in order to close the database connection. Return true on success, false on failure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#open(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) open()}, and {@link com.trolltech.qt.sql.QSqlDriver#setOpen(boolean) setOpen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void close();
    @QtBlockedSlot
    native void __qt_close(long __this__nativeId);

/**
This function is called to commit a transaction. If successful, return true, otherwise return false. The default implementation does nothing and returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#beginTransaction() beginTransaction()}, and {@link com.trolltech.qt.sql.QSqlDriver#rollbackTransaction() rollbackTransaction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean commitTransaction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_commitTransaction(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_commitTransaction(long __this__nativeId);

/**
Creates an empty SQL result on the database. Derived classes must reimplement this function and return a {@link com.trolltech.qt.sql.QSqlResult QSqlResult} object appropriate for their database to the caller.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.sql.QSqlResult createResult();
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlResult __qt_createResult(long __this__nativeId);

/**
Returns the <tt>identifier</tt> escaped according to the database rules. <tt>identifier</tt> can either be a table name or field name, dependent on <tt>type</tt>. <p>The default implementation does nothing.
*/

    @QtBlockedSlot
    public java.lang.String escapeIdentifier(java.lang.String identifier, com.trolltech.qt.sql.QSqlDriver.IdentifierType type)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_escapeIdentifier_String_IdentifierType(nativeId(), identifier, type.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_escapeIdentifier_String_IdentifierType(long __this__nativeId, java.lang.String identifier, int type);


/**
Use the other {@link com.trolltech.qt.sql.QSqlDriver#formatValue(com.trolltech.qt.sql.QSqlField) formatValue()} overload instead.
*/

    @QtBlockedSlot
    public final java.lang.String formatValue(com.trolltech.qt.sql.QSqlField field) {
        return formatValue(field, (boolean)false);
    }
/**
Use the other {@link com.trolltech.qt.sql.QSqlDriver#formatValue(com.trolltech.qt.sql.QSqlField) formatValue()} overload instead.
*/

    @QtBlockedSlot
    public java.lang.String formatValue(com.trolltech.qt.sql.QSqlField field, boolean trimStrings)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_formatValue_QSqlField_boolean(nativeId(), field == null ? 0 : field.nativeId(), trimStrings);
    }
    @QtBlockedSlot
    native java.lang.String __qt_formatValue_QSqlField_boolean(long __this__nativeId, long field, boolean trimStrings);

/**
Returns the low-level database handle wrapped in a {@link com.trolltech.qt.QVariant QVariant} or an invalid variant if there is no handle. <p><b>Warning:</b> Use this with uttermost care and only if you know what you're doing. <p><b>Warning:</b> The handle returned here can become a stale pointer if the connection is modified (for example, if you close the connection). <p><b>Warning:</b> The handle can be NULL if the connection is not open yet. <p>The handle returned here is database-dependent, you should query the type name of the variant before accessing it. <p>This example retrieves the handle for a connection to sqlite: <pre class="snippet">
    QSqlDatabase db = QSqlDatabase.addDatabase("QPSQL");
    QVariant v = db.driver().handle();
    if (v.isValid() && qstrcmp(v.typeName(), "sqlite3*")) {
        // v.data() returns a pointer to the handle
        sqlite3 handle = static_cast&lt;sqlite3 **&gt;(v.data());
        if (handle != 0) { // check that it is not NULL
            ;// ...
        }
    }
</pre> This snippet returns the handle for PostgreSQL or MySQL: <pre class="snippet">
    if (v.typeName() == "PGconn*") {
        PGconn handle = tatic_cast&lt;PGconn **&gt;(v.data());
        if (handle != 0)
        ; // ...
    }

    if (v.typeName() == "MYSQL*") {
        MYSQL handle = static_cast&lt;MYSQL **&gt;(v.data());
        if (handle != 0)
        ; // ...
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#handle() QSqlResult::handle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.Object handle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handle(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_handle(long __this__nativeId);

/**
Returns true if the driver supports feature <tt>feature</tt>; otherwise returns false. <p>Note that some databases need to be {@link com.trolltech.qt.sql.QSqlDriver#open(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) open()} before this can be determined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver.DriverFeature DriverFeature }. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature f);
    @QtBlockedSlot
    native boolean __qt_hasFeature_DriverFeature(long __this__nativeId, int f);

/**
Returns true if the database connection is open; otherwise returns false.
*/

    @QtBlockedSlot
    public boolean isOpen()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isOpen(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isOpen(long __this__nativeId);


/**
Derived classes must reimplement this pure virtual function to open a database connection on database <tt>db</tt>, using user name <tt>user</tt>, password <tt>password</tt>, host <tt>host</tt>, port <tt>port</tt> and connection options <tt>options</tt>. <p>The function must return true on success and false on failure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#setOpen(boolean) setOpen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean open(java.lang.String db, java.lang.String user, java.lang.String password, java.lang.String host, int port) {
        return open(db, user, password, host, port, (java.lang.String)null);
    }

/**
Derived classes must reimplement this pure virtual function to open a database connection on database <tt>db</tt>, using user name <tt>user</tt>, password <tt>password</tt>, host <tt>host</tt>, port <tt>port</tt> and connection options <tt>options</tt>. <p>The function must return true on success and false on failure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#setOpen(boolean) setOpen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean open(java.lang.String db, java.lang.String user, java.lang.String password, java.lang.String host) {
        return open(db, user, password, host, (int)-1, (java.lang.String)null);
    }

/**
Derived classes must reimplement this pure virtual function to open a database connection on database <tt>db</tt>, using user name <tt>user</tt>, password <tt>password</tt>, host <tt>host</tt>, port <tt>port</tt> and connection options <tt>options</tt>. <p>The function must return true on success and false on failure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#setOpen(boolean) setOpen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean open(java.lang.String db, java.lang.String user, java.lang.String password) {
        return open(db, user, password, (java.lang.String)null, (int)-1, (java.lang.String)null);
    }

/**
Derived classes must reimplement this pure virtual function to open a database connection on database <tt>db</tt>, using user name <tt>user</tt>, password <tt>password</tt>, host <tt>host</tt>, port <tt>port</tt> and connection options <tt>options</tt>. <p>The function must return true on success and false on failure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#setOpen(boolean) setOpen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean open(java.lang.String db, java.lang.String user) {
        return open(db, user, (java.lang.String)null, (java.lang.String)null, (int)-1, (java.lang.String)null);
    }

/**
Derived classes must reimplement this pure virtual function to open a database connection on database <tt>db</tt>, using user name <tt>user</tt>, password <tt>password</tt>, host <tt>host</tt>, port <tt>port</tt> and connection options <tt>options</tt>. <p>The function must return true on success and false on failure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#setOpen(boolean) setOpen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean open(java.lang.String db) {
        return open(db, (java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (int)-1, (java.lang.String)null);
    }
/**
Derived classes must reimplement this pure virtual function to open a database connection on database <tt>db</tt>, using user name <tt>user</tt>, password <tt>password</tt>, host <tt>host</tt>, port <tt>port</tt> and connection options <tt>options</tt>. <p>The function must return true on success and false on failure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#setOpen(boolean) setOpen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean open(java.lang.String db, java.lang.String user, java.lang.String password, java.lang.String host, int port, java.lang.String connOpts);
    @QtBlockedSlot
    native boolean __qt_open_String_String_String_String_int_String(long __this__nativeId, java.lang.String db, java.lang.String user, java.lang.String password, java.lang.String host, int port, java.lang.String connOpts);

/**
Returns the primary index for table <tt>tableName</tt>. Returns an empty {@link com.trolltech.qt.sql.QSqlIndex QSqlIndex} if the table doesn't have a primary index. The default implementation returns an empty index.
*/

    @QtBlockedSlot
    public com.trolltech.qt.sql.QSqlIndex primaryIndex(java.lang.String tableName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_primaryIndex_String(nativeId(), tableName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlIndex __qt_primaryIndex_String(long __this__nativeId, java.lang.String tableName);

/**
Returns a {@link com.trolltech.qt.sql.QSqlRecord QSqlRecord} populated with the names of the fields in table <tt>tableName</tt>. If no such table exists, an empty record is returned. The default implementation returns an empty record.
*/

    @QtBlockedSlot
    public com.trolltech.qt.sql.QSqlRecord record(java.lang.String tableName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_record_String(nativeId(), tableName);
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlRecord __qt_record_String(long __this__nativeId, java.lang.String tableName);

/**
This function is called to rollback a transaction. If successful, return true, otherwise return false. The default implementation does nothing and returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#beginTransaction() beginTransaction()}, and {@link com.trolltech.qt.sql.QSqlDriver#commitTransaction() commitTransaction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean rollbackTransaction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rollbackTransaction(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_rollbackTransaction(long __this__nativeId);

/**
This function is used to set the value of the last error, <tt>error</tt>, that occurred on the database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#lastError() lastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void setLastError(com.trolltech.qt.sql.QSqlError e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLastError_QSqlError(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLastError_QSqlError(long __this__nativeId, long e);

/**
This function sets the open state of the database to <tt>open</tt>. Derived classes can use this function to report the status of {@link com.trolltech.qt.sql.QSqlDriver#open(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) open()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#open(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) open()}, and {@link com.trolltech.qt.sql.QSqlDriver#setOpenError(boolean) setOpenError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void setOpen(boolean o)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOpen_boolean(nativeId(), o);
    }
    @QtBlockedSlot
    native void __qt_setOpen_boolean(long __this__nativeId, boolean o);

/**
This function sets the open error state of the database to <tt>error</tt>. Derived classes can use this function to report the status of {@link com.trolltech.qt.sql.QSqlDriver#open(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) open()}. Note that if <tt>error</tt> is true the open state of the database is set to closed (i.e., {@link com.trolltech.qt.sql.QSqlDriver#isOpen() isOpen()} returns false). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#isOpenError() isOpenError()}, {@link com.trolltech.qt.sql.QSqlDriver#open(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) open()}, and {@link com.trolltech.qt.sql.QSqlDriver#setOpen(boolean) setOpen()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void setOpenError(boolean e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOpenError_boolean(nativeId(), e);
    }
    @QtBlockedSlot
    native void __qt_setOpenError_boolean(long __this__nativeId, boolean e);

/**
Returns a SQL statement of type <tt>type</tt> for the table <tt>tableName</tt> with the values from <tt>rec</tt>. If <tt>preparedStatement</tt> is true, the string will contain placeholders instead of values. <p>This method can be used to manipulate tables without having to worry about database-dependent SQL dialects. For non-prepared statements, the values will be properly escaped.
*/

    @QtBlockedSlot
    public java.lang.String sqlStatement(com.trolltech.qt.sql.QSqlDriver.StatementType type, java.lang.String tableName, com.trolltech.qt.sql.QSqlRecord rec, boolean preparedStatement)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sqlStatement_StatementType_String_QSqlRecord_boolean(nativeId(), type.value(), tableName, rec == null ? 0 : rec.nativeId(), preparedStatement);
    }
    @QtBlockedSlot
    native java.lang.String __qt_sqlStatement_StatementType_String_QSqlRecord_boolean(long __this__nativeId, int type, java.lang.String tableName, long rec, boolean preparedStatement);

/**
Returns a list of the names of the tables in the database. The default implementation returns an empty list. <p>The <tt>tableType</tt> argument describes what types of tables should be returned. Due to binary compatibility, the string contains the value of the enum QSql::TableTypes as text. An empty string should be treated as {@link com.trolltech.qt.sql.QSql.TableType QSql::Tables } for backward compatibility.
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> tables(com.trolltech.qt.sql.QSql.TableType tableType)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tables_TableType(nativeId(), tableType.value());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_tables_TableType(long __this__nativeId, int tableType);

/**
@exclude
*/

    public static native QSqlDriver fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSqlDriver(QPrivateConstructor p) { super(p); } 
}
