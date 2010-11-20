package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSqlDatabase class represents a connection to a database. The QSqlDatabase class provides an interface for accessing a database through a connection. An instance of QSqlDatabase represents the connection. The connection provides access to the database via one of the {@link <a href="../sql-driver.html#supported-databases">supported database drivers</a>}, which are derived from {@link com.trolltech.qt.sql.QSqlDriver QSqlDriver}. Alternatively, you can subclass your own database driver from {@link com.trolltech.qt.sql.QSqlDriver QSqlDriver}. See {@link <a href="../sql-driver.html">How to Write Your Own Database Driver</a>} for more information. <p>Create a connection (i.e., an instance of QSqlDatabase) by calling one of the static {@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()} functions, where you specify {@link <a href="../sql-driver.html#supported-databases">the driver or type of driver</a>} to use (i.e., what kind of database will you access?) and a connection name. A connection is known by its own name, not by the name of the database it connects to. You can have multiple connections to one database. QSqlDatabase also supports the concept of a default connection, which is the unnamed connection. To create the default connection, don't pass the connection name argument when you call {@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()}. Subsequently, when you call any static member function that takes the connection name argument, if you don't pass the connection name argument, the default connection is assumed. The following snippet shows how to create and open a default connection to a MySQL database: <pre class="snippet">
        QSqlDatabase db = QSqlDatabase.addDatabase("QPSQL");
        db.setHostName("apollo");
        db.setDatabaseName("customdb");
        db.setUserName("mojito");
        db.setPassword("J0a1m8");
        boolean ok = db.open();
    </pre> Once the QSqlDatabase object has been created, set the connection parameters with {@link com.trolltech.qt.sql.QSqlDatabase#setDatabaseName(java.lang.String) setDatabaseName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setUserName(java.lang.String) setUserName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPassword(java.lang.String) setPassword()}, {@link com.trolltech.qt.sql.QSqlDatabase#setHostName(java.lang.String) setHostName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPort(int) setPort()}, and {@link com.trolltech.qt.sql.QSqlDatabase#setConnectOptions() setConnectOptions()}. Then call {@link com.trolltech.qt.sql.QSqlDatabase#open() open()} to activate the physical connection to the database. The connection is not usable until you open it. <p>The connection defined above will be the default connection, because we didn't give a connection name to {@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()}. Subsequently, you can get the default connection by calling {@link com.trolltech.qt.sql.QSqlDatabase#database(java.lang.String) database()} without the connection name argument: <pre class="snippet">
        QSqlDatabase db = QSqlDatabase.database();
    </pre> QSqlDatabase is a value class. Changes made to a database connection via one instance of QSqlDatabase will affect other instances of QSqlDatabase that represent the same connection. Use {@link com.trolltech.qt.sql.QSqlDatabase#cloneDatabase(com.trolltech.qt.sql.QSqlDatabase, java.lang.String) cloneDatabase()} to create an independent database connection based on an existing one. <p>If you create multiple database connections, specify a unique connection name for each one, when you call {@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()}. Use {@link com.trolltech.qt.sql.QSqlDatabase#database(java.lang.String) database()} with a connection name to get that connection. Use {@link com.trolltech.qt.sql.QSqlDatabase#removeDatabase(java.lang.String) removeDatabase()} with a connection name to remove a connection. QSqlDatabase outputs a warning if you try to remove a connection referenced by other QSqlDatabase objects. Use {@link com.trolltech.qt.sql.QSqlDatabase#contains() contains()} to see if a given connection name is in the list of connections. <p>Once a connection is established, you can call {@link com.trolltech.qt.sql.QSqlDatabase#tables() tables()} to get the list of tables in the database, call {@link com.trolltech.qt.sql.QSqlDatabase#primaryIndex(java.lang.String) primaryIndex()} to get a table's primary index, and call {@link com.trolltech.qt.sql.QSqlDatabase#record(java.lang.String) record()} to get meta-information about a table's fields (e.g., field names). <p><b>Note:</b>{@link com.trolltech.qt.sql.QSqlDatabase#exec() QSqlDatabase::exec()} is deprecated. Use {@link com.trolltech.qt.sql.QSqlQuery#exec() QSqlQuery::exec()} instead. <p>If the driver supports transactions, use {@link com.trolltech.qt.sql.QSqlDatabase#transaction() transaction()} to start a transaction, and {@link com.trolltech.qt.sql.QSqlDatabase#commit() commit()} or {@link com.trolltech.qt.sql.QSqlDatabase#rollback() rollback()} to complete it. Use {@link com.trolltech.qt.sql.QSqlDriver#hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature) hasFeature()} to ask if the driver supports transactions. <b>Note:</b> When using transactions, you must start the transaction before you create your query. <p>If an error occurrs, {@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()} will return information about it. <p>Get the names of the available SQL drivers with {@link com.trolltech.qt.sql.QSqlDatabase#drivers() drivers()}. Check for the presence of a particular driver with {@link com.trolltech.qt.sql.QSqlDatabase#isDriverAvailable(java.lang.String) isDriverAvailable()}. If you have created your own custom driver, you must register it with {@link com.trolltech.qt.sql.QSqlDatabase#registerSqlDriver(java.lang.String, com.trolltech.qt.sql.QSqlDriverCreatorBase) registerSqlDriver()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver QSqlDriver}, {@link com.trolltech.qt.sql.QSqlQuery QSqlQuery}, {@link <a href="../qtsql.html">QtSql Module</a>}, and {@link <a href="../qtjambi-threads.html">Threads and the SQL Module</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSqlDatabase extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.sql.QtJambi_LibraryInitializer.init();
    }

/**
Creates an empty, invalid QSqlDatabase object. Use {@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()}, {@link com.trolltech.qt.sql.QSqlDatabase#removeDatabase(java.lang.String) removeDatabase()}, and {@link com.trolltech.qt.sql.QSqlDatabase#database(java.lang.String) database()} to get valid QSqlDatabase objects.
*/

    public QSqlDatabase(){
        super((QPrivateConstructor)null);
        __qt_QSqlDatabase();
    }

    native void __qt_QSqlDatabase();

/**
This is an overloaded member function, provided for convenience. <p>Creates a database connection using the given <tt>driver</tt>.
*/

    protected QSqlDatabase(com.trolltech.qt.sql.QSqlDriver driver){
        super((QPrivateConstructor)null);
        __qt_QSqlDatabase_QSqlDriver(driver == null ? 0 : driver.nativeId());
    }

    native void __qt_QSqlDatabase_QSqlDriver(long driver);

/**
Creates a copy of <tt>other</tt>.
*/

    public QSqlDatabase(com.trolltech.qt.sql.QSqlDatabase other){
        super((QPrivateConstructor)null);
        __qt_QSqlDatabase_QSqlDatabase(other == null ? 0 : other.nativeId());
    }

    native void __qt_QSqlDatabase_QSqlDatabase(long other);

/**
This is an overloaded member function, provided for convenience. <p>Creates a QSqlDatabase connection that uses the driver referred to by <tt>type</tt>. If the <tt>type</tt> is not recognized, the database connection will have no functionality. <p>The currently available driver types are: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Driver Type</center></th><th><center> Description</center></th></tr></thead><tr valign="top" class="even"><td> QDB2</td><td> IBM DB2</td></tr><tr valign="top" class="odd"><td> QIBASE</td><td> Borland InterBase Driver</td></tr><tr valign="top" class="even"><td> QMYSQL</td><td> MySQL Driver</td></tr><tr valign="top" class="odd"><td> QOCI</td><td> Oracle Call Interface Driver</td></tr><tr valign="top" class="even"><td> QODBC</td><td> ODBC Driver (includes Microsoft SQL Server)</td></tr><tr valign="top" class="odd"><td> QPSQL</td><td> PostgreSQL Driver</td></tr><tr valign="top" class="even"><td> QSQLITE</td><td> SQLite version 3 or above</td></tr><tr valign="top" class="odd"><td> QSQLITE2</td><td> SQLite version 2</td></tr><tr valign="top" class="even"><td> QTDS</td><td> Sybase Adaptive Server</td></tr></table> Additional third party drivers, including your own custom drivers, can be loaded dynamically. <p><DT><b>See also:</b><br><DD>{@link <a href="../sql-driver.html">SQL Database Drivers</a>}, {@link com.trolltech.qt.sql.QSqlDatabase#registerSqlDriver(java.lang.String, com.trolltech.qt.sql.QSqlDriverCreatorBase) registerSqlDriver()}, and {@link com.trolltech.qt.sql.QSqlDatabase#drivers() drivers()}. <br></DD></DT>
*/

    protected QSqlDatabase(java.lang.String type){
        super((QPrivateConstructor)null);
        __qt_QSqlDatabase_String(type);
    }

    native void __qt_QSqlDatabase_String(java.lang.String type);

/**
Closes the database connection, freeing any resources acquired, and invalidating any existing {@link com.trolltech.qt.sql.QSqlQuery QSqlQuery} objects that are used with the database. <p>This will also affect copies of this QSqlDatabase object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#removeDatabase(java.lang.String) removeDatabase()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void close()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_close(nativeId());
    }
    @QtBlockedSlot
    native void __qt_close(long __this__nativeId);

/**
Commits a transaction to the database if the driver supports transactions and a {@link com.trolltech.qt.sql.QSqlDatabase#transaction() transaction()} has been started. Returns <tt>true</tt> if the operation succeeded. Otherwise it returns <tt>false</tt>. <p><b>Note:</b> For some databases, the commit will fail and return <tt>false</tt> if there is an {@link com.trolltech.qt.sql.QSqlQuery#isActive() active query} using the database for a <tt>SELECT</tt>. Make the query {@link com.trolltech.qt.sql.QSqlQuery#isActive() inactive} before doing the commit. <p>Call {@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()} to get information about errors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#isActive() QSqlQuery::isActive()}, {@link com.trolltech.qt.sql.QSqlDriver#hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature) QSqlDriver::hasFeature()}, and {@link com.trolltech.qt.sql.QSqlDatabase#rollback() rollback()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean commit()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_commit(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_commit(long __this__nativeId);

/**
Returns the connection options string used for this connection. The string may be empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#setConnectOptions() setConnectOptions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String connectOptions()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_connectOptions(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_connectOptions(long __this__nativeId);

/**
Returns the connection name, which may be empty. <b>Note:</b> The connection name is not the {@link com.trolltech.qt.sql.QSqlDatabase#databaseName() database name}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String connectionName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_connectionName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_connectionName(long __this__nativeId);

/**
Returns the connection's database name, which may be empty. <b>Note:</b> The database name is not the connection name. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#setDatabaseName(java.lang.String) setDatabaseName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String databaseName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_databaseName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_databaseName(long __this__nativeId);

/**
Returns the database driver used to access the database connection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()}, and {@link com.trolltech.qt.sql.QSqlDatabase#drivers() drivers()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlDriver driver()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_driver(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlDriver __qt_driver(long __this__nativeId);

/**
Returns the connection's driver name. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()}, and {@link com.trolltech.qt.sql.QSqlDatabase#driver() driver()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String driverName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_driverName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_driverName(long __this__nativeId);


/**
Executes a SQL statement on the database and returns a {@link com.trolltech.qt.sql.QSqlQuery QSqlQuery} object. Use {@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()} to retrieve error information. If <tt>query</tt> is empty, an empty, invalid query is returned and {@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()} is not affected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery QSqlQuery}, and {@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlQuery exec() {
        return exec((java.lang.String)null);
    }
/**
Executes a SQL statement on the database and returns a {@link com.trolltech.qt.sql.QSqlQuery QSqlQuery} object. Use {@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()} to retrieve error information. If <tt>query</tt> is empty, an empty, invalid query is returned and {@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()} is not affected. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery QSqlQuery}, and {@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlQuery exec(java.lang.String query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exec_String(nativeId(), query);
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlQuery __qt_exec_String(long __this__nativeId, java.lang.String query);

/**
Returns the connection's host name; it may be empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#setHostName(java.lang.String) setHostName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String hostName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hostName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_hostName(long __this__nativeId);

/**
Returns true if the database connection is currently open; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isOpen()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isOpen(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isOpen(long __this__nativeId);

/**
Returns true if there was an error opening the database connection; otherwise returns false. Error information can be retrieved using the {@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()} function.
*/

    @QtBlockedSlot
    public final boolean isOpenError()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isOpenError(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isOpenError(long __this__nativeId);

/**
Returns true if the QSqlDatabase has a valid driver. <p>Example: <pre class="snippet">
        QSqlDatabase db = new QSqlDatabase();
        System.out.println(db.isValid());    // Returns false

        db = QSqlDatabase.database("sales");
        System.out.println(db.isValid());    // Returns true if "sales" connection exists

        QSqlDatabase.removeDatabase("sales");
        System.out.println(db.isValid());    // Returns false
</pre>
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
Returns information about the last error that occurred on the database. <p>Failures that occur in conjunction with an individual query are reported by {@link com.trolltech.qt.sql.QSqlQuery#lastError() QSqlQuery::lastError()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlError QSqlError}, and {@link com.trolltech.qt.sql.QSqlQuery#lastError() QSqlQuery::lastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlError lastError()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastError(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlError __qt_lastError(long __this__nativeId);

/**
Opens the database connection using the current connection values. Returns true on success; otherwise returns false. Error information can be retrieved using {@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()}, {@link com.trolltech.qt.sql.QSqlDatabase#setDatabaseName(java.lang.String) setDatabaseName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setUserName(java.lang.String) setUserName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPassword(java.lang.String) setPassword()}, {@link com.trolltech.qt.sql.QSqlDatabase#setHostName(java.lang.String) setHostName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPort(int) setPort()}, and {@link com.trolltech.qt.sql.QSqlDatabase#setConnectOptions() setConnectOptions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean open()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_open(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_open(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Opens the database connection using the given <tt>user</tt> name and <tt>password</tt>. Returns true on success; otherwise returns false. Error information can be retrieved using the {@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()} function. <p>This function does not store the password it is given. Instead, the password is passed directly to the driver for opening the connection and it is then discarded. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean open(java.lang.String user, java.lang.String password)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_open_String_String(nativeId(), user, password);
    }
    @QtBlockedSlot
    native boolean __qt_open_String_String(long __this__nativeId, java.lang.String user, java.lang.String password);

/**
Returns the connection's password. If the password was not set with {@link com.trolltech.qt.sql.QSqlDatabase#setPassword(java.lang.String) setPassword()}, and if the password was given in the {@link com.trolltech.qt.sql.QSqlDatabase#open() open()} call, or if no password was used, an empty string is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#setPassword(java.lang.String) setPassword()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String password()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_password(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_password(long __this__nativeId);

/**
Returns the connection's port number. The value is undefined if the port number has not been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#setPort(int) setPort()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int port()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_port(nativeId());
    }
    @QtBlockedSlot
    native int __qt_port(long __this__nativeId);

/**
Returns the primary index for table <tt>tablename</tt>. If no primary index exists an empty {@link com.trolltech.qt.sql.QSqlIndex QSqlIndex} is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#tables() tables()}, and {@link com.trolltech.qt.sql.QSqlDatabase#record(java.lang.String) record()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlIndex primaryIndex(java.lang.String tablename)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_primaryIndex_String(nativeId(), tablename);
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlIndex __qt_primaryIndex_String(long __this__nativeId, java.lang.String tablename);

/**
Returns a {@link com.trolltech.qt.sql.QSqlRecord QSqlRecord} populated with the names of all the fields in the table (or view) called <tt>tablename</tt>. The order in which the fields appear in the record is undefined. If no such table (or view) exists, an empty record is returned.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlRecord record(java.lang.String tablename)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_record_String(nativeId(), tablename);
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlRecord __qt_record_String(long __this__nativeId, java.lang.String tablename);

/**
Rolls back a transaction on the database, if the driver supports transactions and a {@link com.trolltech.qt.sql.QSqlDatabase#transaction() transaction()} has been started. Returns <tt>true</tt> if the operation succeeded. Otherwise it returns <tt>false</tt>. <p><b>Note:</b> For some databases, the rollback will fail and return <tt>false</tt> if there is an {@link com.trolltech.qt.sql.QSqlQuery#isActive() active query} using the database for a <tt>SELECT</tt>. Make the query {@link com.trolltech.qt.sql.QSqlQuery#isActive() inactive} before doing the rollback. <p>Call {@link com.trolltech.qt.sql.QSqlDatabase#lastError() lastError()} to get information about errors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#isActive() QSqlQuery::isActive()}, {@link com.trolltech.qt.sql.QSqlDriver#hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature) QSqlDriver::hasFeature()}, and {@link com.trolltech.qt.sql.QSqlDatabase#commit() commit()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean rollback()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rollback(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_rollback(long __this__nativeId);


/**
Sets database-specific <tt>options</tt>. This must be done before the connection is opened or it has no effect (or you can {@link com.trolltech.qt.sql.QSqlDatabase#close() close()} the connection, call this function and {@link com.trolltech.qt.sql.QSqlDatabase#open() open()} the connection again). <p>The format of the <tt>options</tt> string is a semicolon separated list of option names or option=value pairs. The options depend on the database client used: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> ODBC</center></th><th><center> MySQL</center></th><th><center> PostgreSQL</center></th></tr></thead><tr valign="top" class="even"><td> <ul><li> SQL_ATTR_ACCESS_MODE</li><li> SQL_ATTR_LOGIN_TIMEOUT</li><li> SQL_ATTR_CONNECTION_TIMEOUT</li><li> SQL_ATTR_CURRENT_CATALOG</li><li> SQL_ATTR_METADATA_ID</li><li> SQL_ATTR_PACKET_SIZE</li><li> SQL_ATTR_TRACEFILE</li><li> SQL_ATTR_TRACE</li><li> SQL_ATTR_CONNECTION_POOLING</li><li> SQL_ATTR_ODBC_VERSION</li></ul></td><td> <ul><li> CLIENT_COMPRESS</li><li> CLIENT_FOUND_ROWS</li><li> CLIENT_IGNORE_SPACE</li><li> CLIENT_SSL</li><li> CLIENT_ODBC</li><li> CLIENT_NO_SCHEMA</li><li> CLIENT_INTERACTIVE</li><li> UNIX_SOCKET</li></ul></td><td> <ul><li> connect_timeout</li><li> options</li><li> tty</li><li> requiressl</li><li> service</li></ul></td></tr><thead><tr class="qt-style" valign="top"><th><center> DB2</center></th><th><center> OCI</center></th><th><center> TDS</center></th></tr></thead><tr valign="top" class="odd"><td> <ul><li> SQL_ATTR_ACCESS_MODE</li><li> SQL_ATTR_LOGIN_TIMEOUT</li></ul></td><td> <ul><li> OCI_ATTR_PREFETCH_ROWS</li><li> OCI_ATTR_PREFETCH_MEMORY</li></ul></td><td> none</td></tr><thead><tr class="qt-style" valign="top"><th><center> SQLite</center></th><th><center> Interbase</center></th></tr></thead><tr valign="top" class="even"><td> <ul><li> QSQLITE_BUSY_TIMEOUT</li></ul></td><td> <ul><li> ISC_DPB_LC_CTYPE</li><li> ISC_DPB_SQL_ROLE_NAME</li></ul></td></tr></table> Examples: <pre class="snippet">
    // ...
    // MySQL connection
    db.setConnectOptions("CLIENT_SSL=1;CLIENT_IGNORE_SPACE=1"); // use an SSL connection to the server
    if (!db.open()) {
        db.setConnectOptions(); // clears the connect option string
    // ...
    }
    // ...
    // PostgreSQL connection
    db.setConnectOptions("requiressl=1"); // enable PostgreSQL SSL connections
    if (!db.open()) {
        db.setConnectOptions(); // clear options
        // ...
    }
    // ...
    // ODBC connection
    db.setConnectOptions("SQL_ATTR_ACCESS_MODE=SQL_MODE_READ_ONLY;SQL_ATTR_TRACE=SQL_OPT_TRACE_ON"); // set ODBC options
    if (!db.open()) {
        db.setConnectOptions(); // don't try to set this option
        // ...
    }
</pre> Refer to the client library documentation for more information about the different options. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#connectOptions() connectOptions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setConnectOptions() {
        setConnectOptions((java.lang.String)null);
    }
/**
Sets database-specific <tt>options</tt>. This must be done before the connection is opened or it has no effect (or you can {@link com.trolltech.qt.sql.QSqlDatabase#close() close()} the connection, call this function and {@link com.trolltech.qt.sql.QSqlDatabase#open() open()} the connection again). <p>The format of the <tt>options</tt> string is a semicolon separated list of option names or option=value pairs. The options depend on the database client used: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> ODBC</center></th><th><center> MySQL</center></th><th><center> PostgreSQL</center></th></tr></thead><tr valign="top" class="even"><td> <ul><li> SQL_ATTR_ACCESS_MODE</li><li> SQL_ATTR_LOGIN_TIMEOUT</li><li> SQL_ATTR_CONNECTION_TIMEOUT</li><li> SQL_ATTR_CURRENT_CATALOG</li><li> SQL_ATTR_METADATA_ID</li><li> SQL_ATTR_PACKET_SIZE</li><li> SQL_ATTR_TRACEFILE</li><li> SQL_ATTR_TRACE</li><li> SQL_ATTR_CONNECTION_POOLING</li><li> SQL_ATTR_ODBC_VERSION</li></ul></td><td> <ul><li> CLIENT_COMPRESS</li><li> CLIENT_FOUND_ROWS</li><li> CLIENT_IGNORE_SPACE</li><li> CLIENT_SSL</li><li> CLIENT_ODBC</li><li> CLIENT_NO_SCHEMA</li><li> CLIENT_INTERACTIVE</li><li> UNIX_SOCKET</li></ul></td><td> <ul><li> connect_timeout</li><li> options</li><li> tty</li><li> requiressl</li><li> service</li></ul></td></tr><thead><tr class="qt-style" valign="top"><th><center> DB2</center></th><th><center> OCI</center></th><th><center> TDS</center></th></tr></thead><tr valign="top" class="odd"><td> <ul><li> SQL_ATTR_ACCESS_MODE</li><li> SQL_ATTR_LOGIN_TIMEOUT</li></ul></td><td> <ul><li> OCI_ATTR_PREFETCH_ROWS</li><li> OCI_ATTR_PREFETCH_MEMORY</li></ul></td><td> none</td></tr><thead><tr class="qt-style" valign="top"><th><center> SQLite</center></th><th><center> Interbase</center></th></tr></thead><tr valign="top" class="even"><td> <ul><li> QSQLITE_BUSY_TIMEOUT</li></ul></td><td> <ul><li> ISC_DPB_LC_CTYPE</li><li> ISC_DPB_SQL_ROLE_NAME</li></ul></td></tr></table> Examples: <pre class="snippet">
    // ...
    // MySQL connection
    db.setConnectOptions("CLIENT_SSL=1;CLIENT_IGNORE_SPACE=1"); // use an SSL connection to the server
    if (!db.open()) {
        db.setConnectOptions(); // clears the connect option string
    // ...
    }
    // ...
    // PostgreSQL connection
    db.setConnectOptions("requiressl=1"); // enable PostgreSQL SSL connections
    if (!db.open()) {
        db.setConnectOptions(); // clear options
        // ...
    }
    // ...
    // ODBC connection
    db.setConnectOptions("SQL_ATTR_ACCESS_MODE=SQL_MODE_READ_ONLY;SQL_ATTR_TRACE=SQL_OPT_TRACE_ON"); // set ODBC options
    if (!db.open()) {
        db.setConnectOptions(); // don't try to set this option
        // ...
    }
</pre> Refer to the client library documentation for more information about the different options. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#connectOptions() connectOptions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setConnectOptions(java.lang.String options)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setConnectOptions_String(nativeId(), options);
    }
    @QtBlockedSlot
    native void __qt_setConnectOptions_String(long __this__nativeId, java.lang.String options);

/**
Sets the connection's database name to <tt>name</tt>. To have effect, the database name must be set before the connection is {@link com.trolltech.qt.sql.QSqlDatabase#open() opened}. Alternatively, you can {@link com.trolltech.qt.sql.QSqlDatabase#close() close()} the connection, set the database name, and call {@link com.trolltech.qt.sql.QSqlDatabase#open() open()} again. <b>Note:</b> The database name is not the connection name. The connection name must be passed to {@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()} at connection object create time. <p>For the QOCI (Oracle) driver, the database name is the TNS Service Name. <p>For the QODBC driver, the <tt>name</tt> can either be a DSN, a DSN filename (in which case the file must have a <tt>.dsn</tt> extension), or a connection string. <p>For example, Microsoft Access users can use the following connection string to open an <tt>.mdb</tt> file directly, instead of having to create a DSN entry in the ODBC manager: <pre class="snippet">
    // ...
    db = QSqlDatabase.addDatabase("QODBC");
    db.setDatabaseName("DRIVER={Microsoft Access Driver (*.mdb)};FIL={MS Access};DBQ=myaccessfile.mdb");
    if (db.open()) {
        // success!
    }
    // ...
</pre> There is no default value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#databaseName() databaseName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setUserName(java.lang.String) setUserName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPassword(java.lang.String) setPassword()}, {@link com.trolltech.qt.sql.QSqlDatabase#setHostName(java.lang.String) setHostName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPort(int) setPort()}, {@link com.trolltech.qt.sql.QSqlDatabase#setConnectOptions() setConnectOptions()}, and {@link com.trolltech.qt.sql.QSqlDatabase#open() open()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDatabaseName(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDatabaseName_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setDatabaseName_String(long __this__nativeId, java.lang.String name);

/**
Sets the connection's host name to <tt>host</tt>. To have effect, the host name must be set before the connection is {@link com.trolltech.qt.sql.QSqlDatabase#open() opened}. Alternatively, you can {@link com.trolltech.qt.sql.QSqlDatabase#close() close()} the connection, set the host name, and call {@link com.trolltech.qt.sql.QSqlDatabase#open() open()} again. <p>There is no default value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#hostName() hostName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setUserName(java.lang.String) setUserName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPassword(java.lang.String) setPassword()}, {@link com.trolltech.qt.sql.QSqlDatabase#setDatabaseName(java.lang.String) setDatabaseName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPort(int) setPort()}, {@link com.trolltech.qt.sql.QSqlDatabase#setConnectOptions() setConnectOptions()}, and {@link com.trolltech.qt.sql.QSqlDatabase#open() open()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHostName(java.lang.String host)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHostName_String(nativeId(), host);
    }
    @QtBlockedSlot
    native void __qt_setHostName_String(long __this__nativeId, java.lang.String host);

/**
Sets the connection's password to <tt>password</tt>. To have effect, the password must be set before the connection is {@link com.trolltech.qt.sql.QSqlDatabase#open() opened}. Alternatively, you can {@link com.trolltech.qt.sql.QSqlDatabase#close() close()} the connection, set the password, and call {@link com.trolltech.qt.sql.QSqlDatabase#open() open()} again. <p>There is no default value. <p><b>Warning:</b> This function stores the password in plain text within Qt. Use the {@link com.trolltech.qt.sql.QSqlDatabase#open() open()} call that takes a password as parameter to avoid this behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#password() password()}, {@link com.trolltech.qt.sql.QSqlDatabase#setUserName(java.lang.String) setUserName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setDatabaseName(java.lang.String) setDatabaseName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setHostName(java.lang.String) setHostName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPort(int) setPort()}, {@link com.trolltech.qt.sql.QSqlDatabase#setConnectOptions() setConnectOptions()}, and {@link com.trolltech.qt.sql.QSqlDatabase#open() open()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPassword(java.lang.String password)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPassword_String(nativeId(), password);
    }
    @QtBlockedSlot
    native void __qt_setPassword_String(long __this__nativeId, java.lang.String password);

/**
Sets the connection's port number to <tt>port</tt>. To have effect, the port number must be set before the connection is {@link com.trolltech.qt.sql.QSqlDatabase#open() opened}. Alternatively, you can {@link com.trolltech.qt.sql.QSqlDatabase#close() close()} the connection, set the port number, and call {@link com.trolltech.qt.sql.QSqlDatabase#open() open()} again.. <p>There is no default value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#port() port()}, {@link com.trolltech.qt.sql.QSqlDatabase#setUserName(java.lang.String) setUserName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPassword(java.lang.String) setPassword()}, {@link com.trolltech.qt.sql.QSqlDatabase#setHostName(java.lang.String) setHostName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setDatabaseName(java.lang.String) setDatabaseName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setConnectOptions() setConnectOptions()}, and {@link com.trolltech.qt.sql.QSqlDatabase#open() open()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPort(int p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPort_int(nativeId(), p);
    }
    @QtBlockedSlot
    native void __qt_setPort_int(long __this__nativeId, int p);

/**
Sets the connection's user name to <tt>name</tt>. To have effect, the user name must be set before the connection is {@link com.trolltech.qt.sql.QSqlDatabase#open() opened}. Alternatively, you can {@link com.trolltech.qt.sql.QSqlDatabase#close() close()} the connection, set the user name, and call {@link com.trolltech.qt.sql.QSqlDatabase#open() open()} again. <p>There is no default value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#userName() userName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setDatabaseName(java.lang.String) setDatabaseName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPassword(java.lang.String) setPassword()}, {@link com.trolltech.qt.sql.QSqlDatabase#setHostName(java.lang.String) setHostName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPort(int) setPort()}, {@link com.trolltech.qt.sql.QSqlDatabase#setConnectOptions() setConnectOptions()}, and {@link com.trolltech.qt.sql.QSqlDatabase#open() open()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUserName(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUserName_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setUserName_String(long __this__nativeId, java.lang.String name);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> tables() {
        return tables(com.trolltech.qt.sql.QSql.TableType.Tables);
    }
/**
Returns a list of the database's tables, system tables and views, as specified by the parameter <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#primaryIndex(java.lang.String) primaryIndex()}, and {@link com.trolltech.qt.sql.QSqlDatabase#record(java.lang.String) record()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> tables(com.trolltech.qt.sql.QSql.TableType type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tables_TableType(nativeId(), type.value());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_tables_TableType(long __this__nativeId, int type);

/**
Begins a transaction on the database if the driver supports transactions. Returns <tt>true</tt> if the operation succeeded. Otherwise it returns <tt>false</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature) QSqlDriver::hasFeature()}, {@link com.trolltech.qt.sql.QSqlDatabase#commit() commit()}, and {@link com.trolltech.qt.sql.QSqlDatabase#rollback() rollback()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean transaction()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_transaction(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_transaction(long __this__nativeId);

/**
Returns the connection's user name; it may be empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#setUserName(java.lang.String) setUserName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String userName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_userName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_userName(long __this__nativeId);


/**
This overload is useful when you want to create a database connection with a {@link com.trolltech.qt.sql.QSqlDriver driver} you instantiated yourself. It might be your own database driver, or you might just need to instantiate one of the Qt drivers yourself. If you do this, it is recommended that you include the driver code in your application. For example, you can create a PostgreSQL connection with your own QPSQL driver like this: <pre class="snippet">
        #include "qtdir/src/sql/drivers/psql/qsql_psql.cpp"
<br>
    PGconn on = PQconnectdb("host=server user=bart password=simpson dbname=springfield");
        QPSQLDriver rv =  new QPSQLDriver(con);
        QSqlDatabase db = QSqlDatabase.addDatabase(drv); // becomes the new default connection
        QSqlQuery query;
        query.exec("SELECT NAME, ID FROM STAFF");
        // ...
</pre> The above code sets up a PostgreSQL connection and instantiates a QPSQLDriver object. Next, {@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()} is called to add the connection to the known connections so that it can be used by the Qt SQL classes. When a driver is instantiated with a connection handle (or set of handles), Qt assumes that you have already opened the database connection. <p><b>Note:</b> We assume that <tt>qtdir</tt> is the directory where Qt is installed. This will pull in the code that is needed to use the PostgreSQL client library and to instantiate a QPSQLDriver object, assuming that you have the PostgreSQL headers somewhere in your include search path. <p>Remember that you must link your application against the database client library. Make sure the client library is in your linker's search path, and add lines like these to your <tt>.pro</tt> file: <pre class="snippet">
         unix:LIBS += -lpq
     win32:LIBS += libpqdll.lib
</pre> The method described works for all the supplied drivers. The only difference will be in the driver constructor arguments. Here is a table of the drivers included with Qt, their source code files, and their constructor arguments: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Driver</center></th><th><center> Class name</center></th><th><center> Constructor arguments</center></th><th><center> File to include</center></th></tr></thead><tr valign="top" class="even"><td> QPSQL</td><td> QPSQLDriver</td><td> PGconn *connection</td><td> <tt>qsql_psql.cpp</tt></td></tr><tr valign="top" class="odd"><td> QMYSQL</td><td> QMYSQLDriver</td><td> MYSQL *connection</td><td> <tt>qsql_mysql.cpp</tt></td></tr><tr valign="top" class="even"><td> QOCI</td><td> QOCIDriver</td><td> OCIEnv *environment, OCISvcCtx *serviceContext</td><td> <tt>qsql_oci.cpp</tt></td></tr><tr valign="top" class="odd"><td> QODBC</td><td> QODBCDriver</td><td> SQLHANDLE environment, SQLHANDLE connection</td><td> <tt>qsql_odbc.cpp</tt></td></tr><tr valign="top" class="even"><td> QDB2</td><td> QDB2</td><td> SQLHANDLE environment, SQLHANDLE connection</td><td> <tt>qsql_db2.cpp</tt></td></tr><tr valign="top" class="odd"><td> QTDS</td><td> QTDSDriver</td><td> LOGINREC *loginRecord, DBPROCESS *dbProcess, const QString &hostName</td><td> <tt>qsql_tds.cpp</tt></td></tr><tr valign="top" class="even"><td> QSQLITE</td><td> QSQLiteDriver</td><td> sqlite *connection</td><td> <tt>qsql_sqlite.cpp</tt></td></tr><tr valign="top" class="odd"><td> QIBASE</td><td> QIBaseDriver</td><td> isc_db_handle connection</td><td> <tt>qsql_ibase.cpp</tt></td></tr></table> The host name (or service name) is needed when constructing the QTDSDriver for creating new connections for internal queries. This is to prevent blocking when several {@link com.trolltech.qt.sql.QSqlQuery QSqlQuery} objects are used simultaneously. <p><b>Warning:</b> Adding a database connection with the same connection name as an existing connection, causes the existing connection to be replaced by the new one. <p><b>Warning:</b> The SQL framework takes ownership of the <tt>driver</tt>. It must not be deleted. To remove the connection, use {@link com.trolltech.qt.sql.QSqlDatabase#removeDatabase(java.lang.String) removeDatabase()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#drivers() drivers()}. <br></DD></DT>
*/

    public static com.trolltech.qt.sql.QSqlDatabase addDatabase(com.trolltech.qt.sql.QSqlDriver driver) {
        return addDatabase(driver, (java.lang.String)defaultConnection());
    }
/**
This overload is useful when you want to create a database connection with a {@link com.trolltech.qt.sql.QSqlDriver driver} you instantiated yourself. It might be your own database driver, or you might just need to instantiate one of the Qt drivers yourself. If you do this, it is recommended that you include the driver code in your application. For example, you can create a PostgreSQL connection with your own QPSQL driver like this: <pre class="snippet">
        #include "qtdir/src/sql/drivers/psql/qsql_psql.cpp"
<br>
    PGconn on = PQconnectdb("host=server user=bart password=simpson dbname=springfield");
        QPSQLDriver rv =  new QPSQLDriver(con);
        QSqlDatabase db = QSqlDatabase.addDatabase(drv); // becomes the new default connection
        QSqlQuery query;
        query.exec("SELECT NAME, ID FROM STAFF");
        // ...
</pre> The above code sets up a PostgreSQL connection and instantiates a QPSQLDriver object. Next, {@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()} is called to add the connection to the known connections so that it can be used by the Qt SQL classes. When a driver is instantiated with a connection handle (or set of handles), Qt assumes that you have already opened the database connection. <p><b>Note:</b> We assume that <tt>qtdir</tt> is the directory where Qt is installed. This will pull in the code that is needed to use the PostgreSQL client library and to instantiate a QPSQLDriver object, assuming that you have the PostgreSQL headers somewhere in your include search path. <p>Remember that you must link your application against the database client library. Make sure the client library is in your linker's search path, and add lines like these to your <tt>.pro</tt> file: <pre class="snippet">
         unix:LIBS += -lpq
     win32:LIBS += libpqdll.lib
</pre> The method described works for all the supplied drivers. The only difference will be in the driver constructor arguments. Here is a table of the drivers included with Qt, their source code files, and their constructor arguments: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Driver</center></th><th><center> Class name</center></th><th><center> Constructor arguments</center></th><th><center> File to include</center></th></tr></thead><tr valign="top" class="even"><td> QPSQL</td><td> QPSQLDriver</td><td> PGconn *connection</td><td> <tt>qsql_psql.cpp</tt></td></tr><tr valign="top" class="odd"><td> QMYSQL</td><td> QMYSQLDriver</td><td> MYSQL *connection</td><td> <tt>qsql_mysql.cpp</tt></td></tr><tr valign="top" class="even"><td> QOCI</td><td> QOCIDriver</td><td> OCIEnv *environment, OCISvcCtx *serviceContext</td><td> <tt>qsql_oci.cpp</tt></td></tr><tr valign="top" class="odd"><td> QODBC</td><td> QODBCDriver</td><td> SQLHANDLE environment, SQLHANDLE connection</td><td> <tt>qsql_odbc.cpp</tt></td></tr><tr valign="top" class="even"><td> QDB2</td><td> QDB2</td><td> SQLHANDLE environment, SQLHANDLE connection</td><td> <tt>qsql_db2.cpp</tt></td></tr><tr valign="top" class="odd"><td> QTDS</td><td> QTDSDriver</td><td> LOGINREC *loginRecord, DBPROCESS *dbProcess, const QString &hostName</td><td> <tt>qsql_tds.cpp</tt></td></tr><tr valign="top" class="even"><td> QSQLITE</td><td> QSQLiteDriver</td><td> sqlite *connection</td><td> <tt>qsql_sqlite.cpp</tt></td></tr><tr valign="top" class="odd"><td> QIBASE</td><td> QIBaseDriver</td><td> isc_db_handle connection</td><td> <tt>qsql_ibase.cpp</tt></td></tr></table> The host name (or service name) is needed when constructing the QTDSDriver for creating new connections for internal queries. This is to prevent blocking when several {@link com.trolltech.qt.sql.QSqlQuery QSqlQuery} objects are used simultaneously. <p><b>Warning:</b> Adding a database connection with the same connection name as an existing connection, causes the existing connection to be replaced by the new one. <p><b>Warning:</b> The SQL framework takes ownership of the <tt>driver</tt>. It must not be deleted. To remove the connection, use {@link com.trolltech.qt.sql.QSqlDatabase#removeDatabase(java.lang.String) removeDatabase()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#drivers() drivers()}. <br></DD></DT>
*/

    public static com.trolltech.qt.sql.QSqlDatabase addDatabase(com.trolltech.qt.sql.QSqlDriver driver, java.lang.String connectionName)    {
        if (driver != null) {
            driver.disableGarbageCollection();
        }
        return __qt_addDatabase_QSqlDriver_String(driver == null ? 0 : driver.nativeId(), connectionName);
    }
    native static com.trolltech.qt.sql.QSqlDatabase __qt_addDatabase_QSqlDriver_String(long driver, java.lang.String connectionName);


/**
Adds a database to the list of database connections using the driver <tt>type</tt> and the connection name <tt>connectionName</tt>. If there already exists a database connection called <tt>connectionName</tt>, that connection is removed. <p>The database connection is referred to by <tt>connectionName</tt>. The newly added database connection is returned. <p>If <tt>connectionName</tt> is not specified, the new connection becomes the default connection for the application, and subsequent calls to {@link com.trolltech.qt.sql.QSqlDatabase#database(java.lang.String) database()} without the connection name argument will return the default connection. If a <tt>connectionName</tt> is provided here, use database(<tt>connectionName</tt>) to retrieve the connection. <p><b>Warning:</b> If you add a connection with the same name as an existing connection, the new connection replaces the old one. If you call this function more than once without specifying <tt>connectionName</tt>, the default connection will be the one replaced. <p>Before using the connection, it must be initialized. e.g., call some or all of {@link com.trolltech.qt.sql.QSqlDatabase#setDatabaseName(java.lang.String) setDatabaseName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setUserName(java.lang.String) setUserName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPassword(java.lang.String) setPassword()}, {@link com.trolltech.qt.sql.QSqlDatabase#setHostName(java.lang.String) setHostName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPort(int) setPort()}, and {@link com.trolltech.qt.sql.QSqlDatabase#setConnectOptions() setConnectOptions()}, and, finally, {@link com.trolltech.qt.sql.QSqlDatabase#open() open()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#database(java.lang.String) database()}, {@link com.trolltech.qt.sql.QSqlDatabase#removeDatabase(java.lang.String) removeDatabase()}, and {@link <a href="../qtjambi-threads.html">Threads and the SQL Module</a>}. <br></DD></DT>
*/

    public static com.trolltech.qt.sql.QSqlDatabase addDatabase(java.lang.String type) {
        return addDatabase(type, (java.lang.String)defaultConnection());
    }
/**
Adds a database to the list of database connections using the driver <tt>type</tt> and the connection name <tt>connectionName</tt>. If there already exists a database connection called <tt>connectionName</tt>, that connection is removed. <p>The database connection is referred to by <tt>connectionName</tt>. The newly added database connection is returned. <p>If <tt>connectionName</tt> is not specified, the new connection becomes the default connection for the application, and subsequent calls to {@link com.trolltech.qt.sql.QSqlDatabase#database(java.lang.String) database()} without the connection name argument will return the default connection. If a <tt>connectionName</tt> is provided here, use database(<tt>connectionName</tt>) to retrieve the connection. <p><b>Warning:</b> If you add a connection with the same name as an existing connection, the new connection replaces the old one. If you call this function more than once without specifying <tt>connectionName</tt>, the default connection will be the one replaced. <p>Before using the connection, it must be initialized. e.g., call some or all of {@link com.trolltech.qt.sql.QSqlDatabase#setDatabaseName(java.lang.String) setDatabaseName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setUserName(java.lang.String) setUserName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPassword(java.lang.String) setPassword()}, {@link com.trolltech.qt.sql.QSqlDatabase#setHostName(java.lang.String) setHostName()}, {@link com.trolltech.qt.sql.QSqlDatabase#setPort(int) setPort()}, and {@link com.trolltech.qt.sql.QSqlDatabase#setConnectOptions() setConnectOptions()}, and, finally, {@link com.trolltech.qt.sql.QSqlDatabase#open() open()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#database(java.lang.String) database()}, {@link com.trolltech.qt.sql.QSqlDatabase#removeDatabase(java.lang.String) removeDatabase()}, and {@link <a href="../qtjambi-threads.html">Threads and the SQL Module</a>}. <br></DD></DT>
*/

    public native static com.trolltech.qt.sql.QSqlDatabase addDatabase(java.lang.String type, java.lang.String connectionName);

/**
Clones the database connection <tt>other</tt> and and stores it as <tt>connectionName</tt>. All the settings from the original database, e.g. {@link com.trolltech.qt.sql.QSqlDatabase#databaseName() databaseName()}, {@link com.trolltech.qt.sql.QSqlDatabase#hostName() hostName()}, etc., are copied across. Does nothing if <tt>other</tt> is an invalid database. Returns the newly created database connection. <p><b>Note:</b> The new connection has not been opened. Before using the new connection, you must call {@link com.trolltech.qt.sql.QSqlDatabase#open() open()}.
*/

    public static com.trolltech.qt.sql.QSqlDatabase cloneDatabase(com.trolltech.qt.sql.QSqlDatabase other, java.lang.String connectionName)    {
        return __qt_cloneDatabase_QSqlDatabase_String(other == null ? 0 : other.nativeId(), connectionName);
    }
    native static com.trolltech.qt.sql.QSqlDatabase __qt_cloneDatabase_QSqlDatabase_String(long other, java.lang.String connectionName);

/**
Returns a list containing the names of all connections. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#contains() contains()}, {@link com.trolltech.qt.sql.QSqlDatabase#database(java.lang.String) database()}, and {@link <a href="../qtjambi-threads.html">Threads and the SQL Module</a>}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> connectionNames();


/**
Returns true if the list of database connections contains <tt>connectionName</tt>; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#connectionNames() connectionNames()}, {@link com.trolltech.qt.sql.QSqlDatabase#database(java.lang.String) database()}, and {@link <a href="../qtjambi-threads.html">Threads and the SQL Module</a>}. <br></DD></DT>
*/

    public static boolean contains() {
        return contains((java.lang.String)defaultConnection());
    }
/**
Returns true if the list of database connections contains <tt>connectionName</tt>; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#connectionNames() connectionNames()}, {@link com.trolltech.qt.sql.QSqlDatabase#database(java.lang.String) database()}, and {@link <a href="../qtjambi-threads.html">Threads and the SQL Module</a>}. <br></DD></DT>
*/

    public native static boolean contains(java.lang.String connectionName);


/**
Returns the database connection called <tt>connectionName</tt>. The database connection must have been previously added with {@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()}. If <tt>open</tt> is true (the default) and the database connection is not already open it is opened now. If no <tt>connectionName</tt> is specified the default connection is used. If <tt>connectionName</tt> does not exist in the list of databases, an invalid connection is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#isOpen() isOpen()}, and {@link <a href="../qtjambi-threads.html">Threads and the SQL Module</a>}. <br></DD></DT>
*/

    public static com.trolltech.qt.sql.QSqlDatabase database(java.lang.String connectionName) {
        return database(connectionName, (boolean)true);
    }

/**
Returns the database connection called <tt>connectionName</tt>. The database connection must have been previously added with {@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()}. If <tt>open</tt> is true (the default) and the database connection is not already open it is opened now. If no <tt>connectionName</tt> is specified the default connection is used. If <tt>connectionName</tt> does not exist in the list of databases, an invalid connection is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#isOpen() isOpen()}, and {@link <a href="../qtjambi-threads.html">Threads and the SQL Module</a>}. <br></DD></DT>
*/

    public static com.trolltech.qt.sql.QSqlDatabase database() {
        return database((java.lang.String)defaultConnection(), (boolean)true);
    }
/**
Returns the database connection called <tt>connectionName</tt>. The database connection must have been previously added with {@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()}. If <tt>open</tt> is true (the default) and the database connection is not already open it is opened now. If no <tt>connectionName</tt> is specified the default connection is used. If <tt>connectionName</tt> does not exist in the list of databases, an invalid connection is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#isOpen() isOpen()}, and {@link <a href="../qtjambi-threads.html">Threads and the SQL Module</a>}. <br></DD></DT>
*/

    public native static com.trolltech.qt.sql.QSqlDatabase database(java.lang.String connectionName, boolean open);

/**
Returns a list of all the available database drivers. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#registerSqlDriver(java.lang.String, com.trolltech.qt.sql.QSqlDriverCreatorBase) registerSqlDriver()}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> drivers();

/**
Returns true if a driver called <tt>name</tt> is available; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#drivers() drivers()}. <br></DD></DT>
*/

    public native static boolean isDriverAvailable(java.lang.String name);

/**
This function registers a new SQL driver called <tt>name</tt>, within the SQL framework. This is useful if you have a custom SQL driver and don't want to compile it as a plugin. <p>Example: <pre class="snippet">
     QSqlDatabase.registerSqlDriver("MYDRIVER",
                                     new QSqlDriverCreator&lt;MyDatabaseDriver&gt;);
     QSqlDatabase db = QSqlDatabase.addDatabase("MYDRIVER");
</pre> QSqlDatabase takes ownership of the <tt>creator</tt> pointer, so you mustn't delete it yourself. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#drivers() drivers()}. <br></DD></DT>
*/

    public static void registerSqlDriver(java.lang.String name, com.trolltech.qt.sql.QSqlDriverCreatorBase creator)    {
        __qt_registerSqlDriver_String_QSqlDriverCreatorBase(name, creator == null ? 0 : creator.nativeId());
    }
    native static void __qt_registerSqlDriver_String_QSqlDriverCreatorBase(java.lang.String name, long creator);

/**
Removes the database connection <tt>connectionName</tt> from the list of database connections. <p><b>Warning:</b> There should be no open queries on the database connection when this function is called, otherwise a resource leak will occur. <p>Example: <pre class="snippet">
    // WRONG
    QSqlDatabase db = QSqlDatabase.database("sales");
    QSqlQuery query = new QSqlQuery("SELECT NAME, DOB FROM EMPLOYEES", db);
    QSqlDatabase.removeDatabase("sales"); // will output a warning

    // "db" is now a dangling invalid database connection,
    // "query" contains an invalid result set
</pre> The correct way to do it: <pre class="snippet">
    {
        QSqlDatabase db = QSqlDatabase.database("sales");
        QSqlQuery query = new QSqlQuery("SELECT NAME, DOB FROM EMPLOYEES", db);
    }
    // Both "db" and "query" are destroyed because they are out of scope
    QSqlDatabase.removeDatabase("sales"); // correct
</pre> To remove the default connection, which may have been created with a call to {@link com.trolltech.qt.sql.QSqlDatabase#addDatabase(com.trolltech.qt.sql.QSqlDriver) addDatabase()} not specifying a connection name, you can retrieve the default connection name by calling {@link com.trolltech.qt.sql.QSqlDatabase#connectionName() connectionName()} on the database returned by {@link com.trolltech.qt.sql.QSqlDatabase#database(java.lang.String) database()}. Note that if a default database hasn't been created an invalid database will be returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase#database(java.lang.String) database()}, {@link com.trolltech.qt.sql.QSqlDatabase#connectionName() connectionName()}, and {@link <a href="../qtjambi-threads.html">Threads and the SQL Module</a>}. <br></DD></DT>
*/

    public native static void removeDatabase(java.lang.String connectionName);

    private native static com.trolltech.qt.QNativePointer defaultConnection_private();

/**
@exclude
*/

    public static native QSqlDatabase fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSqlDatabase(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSqlDatabase array[]);

/**
Returns this QSqlDatabase's default connection.
*/

    public static String defaultConnection() {
        com.trolltech.qt.QNativePointer np = defaultConnection_private();

        String returned = "";
        int i = 0;
        while (np.byteAt(i) != 0)
            returned += (char) np.byteAt(i++);
        return returned;
    }


/**
<brief>Returns a string representation of the <tt>this QSqlDatabase</tt>. </brief>
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
    public QSqlDatabase clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSqlDatabase __qt_clone(long __this_nativeId);
}
