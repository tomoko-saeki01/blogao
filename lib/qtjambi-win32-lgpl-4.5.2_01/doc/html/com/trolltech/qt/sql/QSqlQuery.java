package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSqlQuery class provides a means of executing and manipulating SQL statements. QSqlQuery encapsulates the functionality involved in creating, navigating and retrieving data from SQL queries which are executed on a {@link com.trolltech.qt.sql.QSqlDatabase QSqlDatabase}. It can be used to execute DML (data manipulation language) statements, such as <tt>SELECT</tt>, <tt>INSERT</tt>, <tt>UPDATE</tt> and <tt>DELETE</tt>, as well as DDL (data definition language) statements, such as <tt>CREATE</tt><tt>TABLE</tt>. It can also be used to execute database-specific commands which are not standard SQL (e.g. <tt>SET DATESTYLE=ISO</tt> for PostgreSQL). <p>Successfully executed SQL statements set the query's state to active so that {@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()} returns true. Otherwise the query's state is set to inactive. In either case, when executing a new SQL statement, the query is positioned on an invalid record. An active query must be navigated to a valid record (so that {@link com.trolltech.qt.sql.QSqlQuery#isValid() isValid()} returns true) before values can be retrieved. <p>For some databases, if an active query that is a <tt>SELECT</tt> statement exists when you call {@link com.trolltech.qt.sql.QSqlDatabase#commit() commit()} or {@link com.trolltech.qt.sql.QSqlDatabase#rollback() rollback()}, the commit or rollback will fail. See {@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()} for details.<a name="qsqlquery-examples"> Navigating records is performed with the following functions: <ul><li> {@link com.trolltech.qt.sql.QSqlQuery#next() next()}</li><li> {@link com.trolltech.qt.sql.QSqlQuery#previous() previous()}</li><li> {@link com.trolltech.qt.sql.QSqlQuery#first() first()}</li><li> {@link com.trolltech.qt.sql.QSqlQuery#last() last()}</li><li> {@link com.trolltech.qt.sql.QSqlQuery#seek(int) seek()}</li></ul> These functions allow the programmer to move forward, backward or arbitrarily through the records returned by the query. If you only need to move forward through the results (e.g., by using {@link com.trolltech.qt.sql.QSqlQuery#next() next()}), you can use {@link com.trolltech.qt.sql.QSqlQuery#setForwardOnly(boolean) setForwardOnly()}, which will save a significant amount of memory overhead and improve performance on some databases. Once an active query is positioned on a valid record, data can be retrieved using {@link com.trolltech.qt.sql.QSqlQuery#value(int) value()}. All data is transferred from the SQL backend using QVariants. <p>For example: <pre class="snippet">
        QSqlQuery query = new QSqlQuery("SELECT * country FROM artist");
        while (query.next()) {
            String country = query.value(0).toString();
            doSomething(country);
        }
    </pre> To access the data returned by a query, use value(int). Each field in the data returned by a <tt>SELECT</tt> statement is accessed by passing the field's position in the statement, starting from 0. This makes using <tt>SELECT *</tt> queries inadvisable because the order of the fields returned is indeterminate. <p>For the sake of efficiency, there are no functions to access a field by name (unless you use prepared queries with names, as explained below). To convert a field name into an index, use {@link com.trolltech.qt.sql.QSqlQuery#record() record()}.{@link com.trolltech.qt.sql.QSqlRecord#indexOf(java.lang.String) indexOf()}, for example: <pre class="snippet">
        QSqlQuery query = new QSqlQuery("SELECT * FROM artist");
        int fieldNo = query.record().indexOf("country");
        while (query.next()) {
            String country = query.value(fieldNo).toString();
            doSomething(country);
        }
    </pre> QSqlQuery supports prepared query execution and the binding of parameter values to placeholders. Some databases don't support these features, so for those, Qt emulates the required functionality. For example, the Oracle and ODBC drivers have proper prepared query support, and Qt makes use of it; but for databases that don't have this support, Qt implements the feature itself, e.g. by replacing placeholders with actual values when a query is executed. Use {@link com.trolltech.qt.sql.QSqlQuery#numRowsAffected() numRowsAffected()} to find out how many rows were affected by a non-<tt>SELECT</tt> query, and {@link com.trolltech.qt.sql.QSqlQuery#size() size()} to find how many were retrieved by a <tt>SELECT</tt>. <p>Oracle databases identify placeholders by using a colon-name syntax, e.g <tt>:name</tt>. ODBC simply uses <tt>?</tt> characters. Qt supports both syntaxes, with the restriction that you can't mix them in the same query. <p>You can retrieve the values of all the fields in a single variable (a map) using {@link com.trolltech.qt.sql.QSqlQuery#boundValues() boundValues()}.<a name="approaches-to-binding-values"><h2>Approaches to Binding Values</h2> Below we present the same example using each of the four different binding approaches, as well as one example of binding values to a stored procedure. <p><b>Named binding using named placeholders:</b> <pre class="snippet">
        QSqlQuery query = new QSqlQuery();
        query.prepare("INSERT INTO person (id, forename, surname) " +
                      "VALUES (:id, :forename, :surname)");
        query.bindValue(":id", 1001);
        query.bindValue(":forename", "Bart");
        query.bindValue(":surname", "Simpson");
        query.exec();
    </pre> <b>Positional binding using named placeholders:</b> <pre class="snippet">
        QSqlQuery query = new QSqlQuery();
        query.prepare("INSERT INTO person (id, forename, surname) " +
                      "VALUES (:id, :forename, :surname)");
        query.bindValue(0, 1001);
        query.bindValue(1, "Bart");
        query.bindValue(2, "Simpson");
        query.exec();
    </pre> <b>Binding values using positional placeholders (version 1):</b> <pre class="snippet">
        QSqlQuery query = new QSqlQuery();
        query.prepare("INSERT INTO person (id, forename, surname) " +
                      "VALUES (?, ?, ?)");
        query.bindValue(0, 1001);
        query.bindValue(1, "Bart");
        query.bindValue(2, "Simpson");
        query.exec();
    </pre> <b>Binding values using positional placeholders (version 2):</b> <pre class="snippet">
        QSqlQuery query = new QSqlQuery();
        query.prepare("INSERT INTO person (id, forename, surname) " +
                      "VALUES (?, ?, ?)");
        query.addBindValue(1001);
        query.addBindValue("Bart");
        query.addBindValue("Simpson");
        query.exec();
    </pre> <b>Binding values to a stored procedure:</b> <p>This code calls a stored procedure called <tt>AsciiToInt()</tt>, passing it a character through its in parameter, and taking its result in the out parameter. <pre class="snippet">
        QSqlQuery query = new QSqlQuery();
        query.prepare("CALL AsciiToInt(?, ?)");
        query.bindValue(0, "A");
        query.bindValue(1, 0, QSql.ParamTypeFlag.Out);
        query.exec();
        int i = query.boundValue(1).toInt(); // i is 65
    </pre> Note that unbound parameters will retain their values. <p>Stored procedures that uses the return statement to return values, or return multiple result sets, are not fully supported. For specific details see {@link <a href="../sql-driver.html">SQL Database Drivers</a>}. <p><b>Warning:</b> You must load the SQL driver and open the connection before a QSqlQuery is created. Also, the connection must remain open while the query exists; otherwise, the behavior of QSqlQuery is undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase QSqlDatabase}, {@link com.trolltech.qt.sql.QSqlQueryModel QSqlQueryModel}, {@link com.trolltech.qt.sql.QSqlTableModel QSqlTableModel}, and {@link com.trolltech.qt.QVariant QVariant}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSqlQuery extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.sql.QtJambi_LibraryInitializer.init();
    }
    public enum BatchExecutionMode implements com.trolltech.qt.QtEnumerator {
/**
 - Updates multiple rows. Treats every entry in a QVariantList as a value for updating the next row.
*/

        ValuesAsRows(0),
/**
 - Updates a single row. Treats every entry in a QVariantList as a single value of an array type.
*/

        ValuesAsColumns(1);

        BatchExecutionMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSqlQuery$BatchExecutionMode constant with the specified <tt>int</tt>.</brief>
*/

        public static BatchExecutionMode resolve(int value) {
            return (BatchExecutionMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ValuesAsRows;
            case 1: return ValuesAsColumns;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QSqlQuery object using the database <tt>db</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase QSqlDatabase}. <br></DD></DT>
*/

    public QSqlQuery(com.trolltech.qt.sql.QSqlDatabase db){
        super((QPrivateConstructor)null);
        __qt_QSqlQuery_QSqlDatabase(db == null ? 0 : db.nativeId());
    }

    native void __qt_QSqlQuery_QSqlDatabase(long db);

/**
Constructs a QSqlQuery object which uses the {@link com.trolltech.qt.sql.QSqlResult QSqlResult}<tt>result</tt> to communicate with a database.
*/

    public QSqlQuery(com.trolltech.qt.sql.QSqlResult r){
        super((QPrivateConstructor)null);
        __qt_QSqlQuery_QSqlResult(r == null ? 0 : r.nativeId());
    }

    native void __qt_QSqlQuery_QSqlResult(long r);

/**
Constructs a copy of <tt>other</tt>.
*/

    public QSqlQuery(com.trolltech.qt.sql.QSqlQuery other){
        super((QPrivateConstructor)null);
        __qt_QSqlQuery_QSqlQuery(other == null ? 0 : other.nativeId());
    }

    native void __qt_QSqlQuery_QSqlQuery(long other);


/**
Constructs a QSqlQuery object using the SQL <tt>query</tt> and the database <tt>db</tt>. If <tt>db</tt> is not specified, the application's default database is used. If <tt>query</tt> is not an empty string, it will be executed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase QSqlDatabase}. <br></DD></DT>
*/

    public QSqlQuery(java.lang.String query) {
        this(query, (com.trolltech.qt.sql.QSqlDatabase)new com.trolltech.qt.sql.QSqlDatabase());
    }

/**
Constructs a QSqlQuery object using the SQL <tt>query</tt> and the database <tt>db</tt>. If <tt>db</tt> is not specified, the application's default database is used. If <tt>query</tt> is not an empty string, it will be executed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase QSqlDatabase}. <br></DD></DT>
*/

    public QSqlQuery() {
        this((java.lang.String)null, (com.trolltech.qt.sql.QSqlDatabase)new com.trolltech.qt.sql.QSqlDatabase());
    }
/**
Constructs a QSqlQuery object using the SQL <tt>query</tt> and the database <tt>db</tt>. If <tt>db</tt> is not specified, the application's default database is used. If <tt>query</tt> is not an empty string, it will be executed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDatabase QSqlDatabase}. <br></DD></DT>
*/

    public QSqlQuery(java.lang.String query, com.trolltech.qt.sql.QSqlDatabase db){
        super((QPrivateConstructor)null);
        __qt_QSqlQuery_String_QSqlDatabase(query, db == null ? 0 : db.nativeId());
    }

    native void __qt_QSqlQuery_String_QSqlDatabase(java.lang.String query, long db);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void addBindValue(java.lang.Object val, com.trolltech.qt.sql.QSql.ParamTypeFlag ... type) {
        this.addBindValue(val, new com.trolltech.qt.sql.QSql.ParamType(type));
    }

/**
Adds the value <tt>val</tt> to the list of values when using positional value binding. The order of the {@link com.trolltech.qt.sql.QSqlQuery#addBindValue(java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) addBindValue()} calls determines which placeholder a value will be bound to in the prepared query. If <tt>paramType</tt> is {@link com.trolltech.qt.sql.QSql.ParamTypeFlag QSql::Out } or {@link com.trolltech.qt.sql.QSql.ParamTypeFlag QSql::InOut }, the placeholder will be overwritten with data from the database after the {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()} call. <p>To bind a NULL value, use a null {@link com.trolltech.qt.QVariant QVariant}; for example, use <tt>QVariant(QVariant::String)</tt> if you are binding a string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#bindValue(java.lang.String, java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) bindValue()}, {@link com.trolltech.qt.sql.QSqlQuery#prepare(java.lang.String) prepare()}, {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()}, {@link com.trolltech.qt.sql.QSqlQuery#boundValue(java.lang.String) boundValue()}, and {@link com.trolltech.qt.sql.QSqlQuery#boundValues() boundValues()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addBindValue(java.lang.Object val) {
        addBindValue(val, new com.trolltech.qt.sql.QSql.ParamType(1));
    }
/**
Adds the value <tt>val</tt> to the list of values when using positional value binding. The order of the {@link com.trolltech.qt.sql.QSqlQuery#addBindValue(java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) addBindValue()} calls determines which placeholder a value will be bound to in the prepared query. If <tt>paramType</tt> is {@link com.trolltech.qt.sql.QSql.ParamTypeFlag QSql::Out } or {@link com.trolltech.qt.sql.QSql.ParamTypeFlag QSql::InOut }, the placeholder will be overwritten with data from the database after the {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()} call. <p>To bind a NULL value, use a null {@link com.trolltech.qt.QVariant QVariant}; for example, use <tt>QVariant(QVariant::String)</tt> if you are binding a string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#bindValue(java.lang.String, java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) bindValue()}, {@link com.trolltech.qt.sql.QSqlQuery#prepare(java.lang.String) prepare()}, {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()}, {@link com.trolltech.qt.sql.QSqlQuery#boundValue(java.lang.String) boundValue()}, and {@link com.trolltech.qt.sql.QSqlQuery#boundValues() boundValues()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addBindValue(java.lang.Object val, com.trolltech.qt.sql.QSql.ParamType type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addBindValue_Object_ParamType(nativeId(), val, type.value());
    }
    @QtBlockedSlot
    native void __qt_addBindValue_Object_ParamType(long __this__nativeId, java.lang.Object val, int type);

/**
Returns the current internal position of the query. The first record is at position zero. If the position is invalid, the function returns {@link com.trolltech.qt.sql.QSql.Location QSql::BeforeFirstRow } or {@link com.trolltech.qt.sql.QSql.Location QSql::AfterLastRow }, which are special negative values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#previous() previous()}, {@link com.trolltech.qt.sql.QSqlQuery#next() next()}, {@link com.trolltech.qt.sql.QSqlQuery#first() first()}, {@link com.trolltech.qt.sql.QSqlQuery#last() last()}, {@link com.trolltech.qt.sql.QSqlQuery#seek(int) seek()}, {@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()}, and {@link com.trolltech.qt.sql.QSqlQuery#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int at()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_at(nativeId());
    }
    @QtBlockedSlot
    native int __qt_at(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void bindValue(java.lang.String placeholder, java.lang.Object val, com.trolltech.qt.sql.QSql.ParamTypeFlag ... type) {
        this.bindValue(placeholder, val, new com.trolltech.qt.sql.QSql.ParamType(type));
    }

/**
Set the placeholder <tt>placeholder</tt> to be bound to value <tt>val</tt> in the prepared statement. Note that the placeholder mark (e.g <tt>:</tt>) must be included when specifying the placeholder name. If <tt>paramType</tt> is {@link com.trolltech.qt.sql.QSql.ParamTypeFlag QSql::Out } or {@link com.trolltech.qt.sql.QSql.ParamTypeFlag QSql::InOut }, the placeholder will be overwritten with data from the database after the {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()} call. <p>To bind a NULL value, use a null {@link com.trolltech.qt.QVariant QVariant}; for example, use <tt>QVariant(QVariant::String)</tt> if you are binding a string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#addBindValue(java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) addBindValue()}, {@link com.trolltech.qt.sql.QSqlQuery#prepare(java.lang.String) prepare()}, {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()}, {@link com.trolltech.qt.sql.QSqlQuery#boundValue(java.lang.String) boundValue()}, and {@link com.trolltech.qt.sql.QSqlQuery#boundValues() boundValues()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void bindValue(java.lang.String placeholder, java.lang.Object val) {
        bindValue(placeholder, val, new com.trolltech.qt.sql.QSql.ParamType(1));
    }
/**
Set the placeholder <tt>placeholder</tt> to be bound to value <tt>val</tt> in the prepared statement. Note that the placeholder mark (e.g <tt>:</tt>) must be included when specifying the placeholder name. If <tt>paramType</tt> is {@link com.trolltech.qt.sql.QSql.ParamTypeFlag QSql::Out } or {@link com.trolltech.qt.sql.QSql.ParamTypeFlag QSql::InOut }, the placeholder will be overwritten with data from the database after the {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()} call. <p>To bind a NULL value, use a null {@link com.trolltech.qt.QVariant QVariant}; for example, use <tt>QVariant(QVariant::String)</tt> if you are binding a string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#addBindValue(java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) addBindValue()}, {@link com.trolltech.qt.sql.QSqlQuery#prepare(java.lang.String) prepare()}, {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()}, {@link com.trolltech.qt.sql.QSqlQuery#boundValue(java.lang.String) boundValue()}, and {@link com.trolltech.qt.sql.QSqlQuery#boundValues() boundValues()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void bindValue(java.lang.String placeholder, java.lang.Object val, com.trolltech.qt.sql.QSql.ParamType type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_bindValue_String_Object_ParamType(nativeId(), placeholder, val, type.value());
    }
    @QtBlockedSlot
    native void __qt_bindValue_String_Object_ParamType(long __this__nativeId, java.lang.String placeholder, java.lang.Object val, int type);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void bindValue(int pos, java.lang.Object val, com.trolltech.qt.sql.QSql.ParamTypeFlag ... type) {
        this.bindValue(pos, val, new com.trolltech.qt.sql.QSql.ParamType(type));
    }

/**
Set the placeholder in position <tt>pos</tt> to be bound to value <tt>val</tt> in the prepared statement. Field numbering starts at 0. If <tt>paramType</tt> is {@link com.trolltech.qt.sql.QSql.ParamTypeFlag QSql::Out } or {@link com.trolltech.qt.sql.QSql.ParamTypeFlag QSql::InOut }, the placeholder will be overwritten with data from the database after the {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()} call.
*/

    @QtBlockedSlot
    public final void bindValue(int pos, java.lang.Object val) {
        bindValue(pos, val, new com.trolltech.qt.sql.QSql.ParamType(1));
    }
/**
Set the placeholder in position <tt>pos</tt> to be bound to value <tt>val</tt> in the prepared statement. Field numbering starts at 0. If <tt>paramType</tt> is {@link com.trolltech.qt.sql.QSql.ParamTypeFlag QSql::Out } or {@link com.trolltech.qt.sql.QSql.ParamTypeFlag QSql::InOut }, the placeholder will be overwritten with data from the database after the {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()} call.
*/

    @QtBlockedSlot
    public final void bindValue(int pos, java.lang.Object val, com.trolltech.qt.sql.QSql.ParamType type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_bindValue_int_Object_ParamType(nativeId(), pos, val, type.value());
    }
    @QtBlockedSlot
    native void __qt_bindValue_int_Object_ParamType(long __this__nativeId, int pos, java.lang.Object val, int type);

/**
Returns the value for the <tt>placeholder</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#boundValues() boundValues()}, {@link com.trolltech.qt.sql.QSqlQuery#bindValue(java.lang.String, java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) bindValue()}, and {@link com.trolltech.qt.sql.QSqlQuery#addBindValue(java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) addBindValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object boundValue(java.lang.String placeholder)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundValue_String(nativeId(), placeholder);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_boundValue_String(long __this__nativeId, java.lang.String placeholder);

/**
Returns the value for the placeholder at position <tt>pos</tt>.
*/

    @QtBlockedSlot
    public final java.lang.Object boundValue(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundValue_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_boundValue_int(long __this__nativeId, int pos);

/**
Returns a map of the bound values. <p>With named binding, the bound values can be examined in the following ways: <pre class="snippet">
        Map&lt;String, Object&gt; map = query.boundValues();

        for (String key : map.keySet()) {
            Object value = map.get(key);
            System.out.println(i.key().toAscii().data() &lt;&lt; ": "
                 &lt;&lt; i.value().toString().toAscii().data());
        }
    </pre> With positional binding, the code becomes: <pre class="snippet">
        int i = 0;
        for (Object value : query.boundValues().values())
            System.err.println(String.valueOf(i++) + ": " + value);
    </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#boundValue(java.lang.String) boundValue()}, {@link com.trolltech.qt.sql.QSqlQuery#bindValue(java.lang.String, java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) bindValue()}, and {@link com.trolltech.qt.sql.QSqlQuery#addBindValue(java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) addBindValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.SortedMap<java.lang.String, java.lang.Object> boundValues()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundValues(nativeId());
    }
    @QtBlockedSlot
    native java.util.SortedMap<java.lang.String, java.lang.Object> __qt_boundValues(long __this__nativeId);

/**
Clears the result set and releases any resources held by the query. Sets the query state to inactive. You should rarely if ever need to call this function.
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
Returns the database driver associated with the query.
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
Executes a previously prepared SQL query. Returns true if the query executed successfully; otherwise returns false. <p>Note that the last error for this query is reset when {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()} is called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#prepare(java.lang.String) prepare()}, {@link com.trolltech.qt.sql.QSqlQuery#bindValue(java.lang.String, java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) bindValue()}, {@link com.trolltech.qt.sql.QSqlQuery#addBindValue(java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) addBindValue()}, {@link com.trolltech.qt.sql.QSqlQuery#boundValue(java.lang.String) boundValue()}, and {@link com.trolltech.qt.sql.QSqlQuery#boundValues() boundValues()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean exec()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exec(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_exec(long __this__nativeId);

/**
Executes the SQL in <tt>query</tt>. Returns true and sets the query state to {@link com.trolltech.qt.sql.QSqlQuery#isActive() active} if the query was successful; otherwise returns false. The <tt>query</tt> string must use syntax appropriate for the SQL database being queried (for example, standard SQL). <p>After the query is executed, the query is positioned on an invalid record and must be navigated to a valid record before data values can be retrieved (for example, using {@link com.trolltech.qt.sql.QSqlQuery#next() next()}). <p>Note that the last error for this query is reset when {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()} is called. <p>Example: <pre class="snippet">
        QSqlQuery query = new QSqlQuery();
        query.exec("INSERT INTO employee (id, name, salary) " +
                   "VALUES (1001, 'Thad Beaumont', 65000)");
    </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()}, {@link com.trolltech.qt.sql.QSqlQuery#isValid() isValid()}, {@link com.trolltech.qt.sql.QSqlQuery#next() next()}, {@link com.trolltech.qt.sql.QSqlQuery#previous() previous()}, {@link com.trolltech.qt.sql.QSqlQuery#first() first()}, {@link com.trolltech.qt.sql.QSqlQuery#last() last()}, and {@link com.trolltech.qt.sql.QSqlQuery#seek(int) seek()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean exec(java.lang.String query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exec_String(nativeId(), query);
    }
    @QtBlockedSlot
    native boolean __qt_exec_String(long __this__nativeId, java.lang.String query);


/**
Executes a previously prepared SQL query in a batch. All the bound parameters have to be lists of variants. If the database doesn't support batch executions, the driver will simulate it using conventional {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()} calls. <p>Returns true if the query is executed successfully; otherwise returns false. <p>Example: <pre class="snippet">
        QSqlQuery q = new QSqlQuery();
        q.prepare("insert into myTable values (?, ?)");

    List&lt;Integer&gt; ints = new ArrayList&lt;Integer&gt;();
        ints.add(1);
    ints.add(2);
    ints.add(3);
    ints.add(4);
        q.addBindValue(ints);

    List&lt;String&gt; names = new ArrayList&lt;String&gt;();
    names.add("Harald");
    names.add("Boris");
    names.add("Trond");
    names.add(null);
        q.addBindValue(names);

        if (!q.execBatch())
            System.out.println(q.lastError());
</pre> The example above inserts four new rows into <tt>myTable</tt>: <pre class="snippet">
    1  Harald
    2  Boris
    3  Trond
        4  NULL
</pre> To bind NULL values, a null {@link com.trolltech.qt.QVariant QVariant} of the relevant type has to be added to the bound QVariantList; for example, <tt>QVariant(QVariant::String)</tt> should be used if you are using strings. <p><b>Note:</b> Every bound QVariantList must contain the same amount of variants. <p><b>Note:</b> The type of the QVariants in a list must not change. For example, you cannot mix integer and string variants within a QVariantList. <p>The <tt>mode</tt> parameter indicates how the bound QVariantList will be interpreted. If <tt>mode</tt> is <tt>ValuesAsRows</tt>, every variant within the QVariantList will be interpreted as a value for a new row. <tt>ValuesAsColumns</tt> is a special case for the Oracle driver. In this mode, every entry within a QVariantList will be interpreted as array-value for an IN or OUT value within a stored procedure. Note that this will only work if the IN or OUT value is a table-type consisting of only one column of a basic type, for example <tt>TYPE myType IS TABLE OF VARCHAR(64) INDEX BY BINARY_INTEGER;</tt> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#prepare(java.lang.String) prepare()}, {@link com.trolltech.qt.sql.QSqlQuery#bindValue(java.lang.String, java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) bindValue()}, and {@link com.trolltech.qt.sql.QSqlQuery#addBindValue(java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) addBindValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean execBatch() {
        return execBatch(com.trolltech.qt.sql.QSqlQuery.BatchExecutionMode.ValuesAsRows);
    }
/**
Executes a previously prepared SQL query in a batch. All the bound parameters have to be lists of variants. If the database doesn't support batch executions, the driver will simulate it using conventional {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()} calls. <p>Returns true if the query is executed successfully; otherwise returns false. <p>Example: <pre class="snippet">
        QSqlQuery q = new QSqlQuery();
        q.prepare("insert into myTable values (?, ?)");

    List&lt;Integer&gt; ints = new ArrayList&lt;Integer&gt;();
        ints.add(1);
    ints.add(2);
    ints.add(3);
    ints.add(4);
        q.addBindValue(ints);

    List&lt;String&gt; names = new ArrayList&lt;String&gt;();
    names.add("Harald");
    names.add("Boris");
    names.add("Trond");
    names.add(null);
        q.addBindValue(names);

        if (!q.execBatch())
            System.out.println(q.lastError());
</pre> The example above inserts four new rows into <tt>myTable</tt>: <pre class="snippet">
    1  Harald
    2  Boris
    3  Trond
        4  NULL
</pre> To bind NULL values, a null {@link com.trolltech.qt.QVariant QVariant} of the relevant type has to be added to the bound QVariantList; for example, <tt>QVariant(QVariant::String)</tt> should be used if you are using strings. <p><b>Note:</b> Every bound QVariantList must contain the same amount of variants. <p><b>Note:</b> The type of the QVariants in a list must not change. For example, you cannot mix integer and string variants within a QVariantList. <p>The <tt>mode</tt> parameter indicates how the bound QVariantList will be interpreted. If <tt>mode</tt> is <tt>ValuesAsRows</tt>, every variant within the QVariantList will be interpreted as a value for a new row. <tt>ValuesAsColumns</tt> is a special case for the Oracle driver. In this mode, every entry within a QVariantList will be interpreted as array-value for an IN or OUT value within a stored procedure. Note that this will only work if the IN or OUT value is a table-type consisting of only one column of a basic type, for example <tt>TYPE myType IS TABLE OF VARCHAR(64) INDEX BY BINARY_INTEGER;</tt> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#prepare(java.lang.String) prepare()}, {@link com.trolltech.qt.sql.QSqlQuery#bindValue(java.lang.String, java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) bindValue()}, and {@link com.trolltech.qt.sql.QSqlQuery#addBindValue(java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) addBindValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean execBatch(com.trolltech.qt.sql.QSqlQuery.BatchExecutionMode mode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_execBatch_BatchExecutionMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native boolean __qt_execBatch_BatchExecutionMode(long __this__nativeId, int mode);

/**
Returns the last query that was successfully executed. <p>In most cases this function returns the same string as {@link com.trolltech.qt.sql.QSqlQuery#lastQuery() lastQuery()}. If a prepared query with placeholders is executed on a DBMS that does not support it, the preparation of this query is emulated. The placeholders in the original query are replaced with their bound values to form a new query. This function returns the modified query. It is mostly useful for debugging purposes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#lastQuery() lastQuery()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String executedQuery()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_executedQuery(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_executedQuery(long __this__nativeId);

/**
Instruct the database driver that no more data will be fetched from this query until it is re-executed. There is normally no need to call this function, but it may be helpful in order to free resources such as locks or cursors if you intend to re-use the query at a later time. <p>Sets the query to inactive. Bound values retain their values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#prepare(java.lang.String) prepare()}, {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()}, and {@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void finish()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_finish(nativeId());
    }
    @QtBlockedSlot
    native void __qt_finish(long __this__nativeId);

/**
Retrieves the first record in the result, if available, and positions the query on the retrieved record. Note that the result must be in the {@link com.trolltech.qt.sql.QSqlQuery#isActive() active} state and {@link com.trolltech.qt.sql.QSqlQuery#isSelect() isSelect()} must return true before calling this function or it will do nothing and return false. Returns true if successful. If unsuccessful the query position is set to an invalid position and false is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#next() next()}, {@link com.trolltech.qt.sql.QSqlQuery#previous() previous()}, {@link com.trolltech.qt.sql.QSqlQuery#last() last()}, {@link com.trolltech.qt.sql.QSqlQuery#seek(int) seek()}, {@link com.trolltech.qt.sql.QSqlQuery#at() at()}, {@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()}, and {@link com.trolltech.qt.sql.QSqlQuery#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean first()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_first(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_first(long __this__nativeId);

/**
Returns true if the query is active. An active QSqlQuery is one that has been {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()'d} successfully but not yet finished with. When you are finished with an active query, you can make make the query inactive by calling {@link com.trolltech.qt.sql.QSqlQuery#finish() finish()} or {@link com.trolltech.qt.sql.QSqlQuery#clear() clear()}, or you can delete the QSqlQuery instance. <p><b>Note:</b> Of particular interest is an active query that is a <tt>SELECT</tt> statement. For some databases that support transactions, an active query that is a <tt>SELECT</tt> statement can cause a {@link com.trolltech.qt.sql.QSqlDatabase#commit() commit()} or a {@link com.trolltech.qt.sql.QSqlDatabase#rollback() rollback()} to fail, so before committing or rolling back, you should make your active <tt>SELECT</tt> statement query inactive using one of the ways listed above. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#isSelect() isSelect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isActive()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isActive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isActive(long __this__nativeId);

/**
Returns true if you can only scroll forward through a result set; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#setForwardOnly(boolean) setForwardOnly()}, and {@link com.trolltech.qt.sql.QSqlQuery#next() next()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isForwardOnly()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isForwardOnly(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isForwardOnly(long __this__nativeId);

/**
Returns true if the query is {@link com.trolltech.qt.sql.QSqlQuery#isActive() active} and positioned on a valid record and the <tt>field</tt> is NULL; otherwise returns false. Note that for some drivers, {@link com.trolltech.qt.sql.QSqlQuery#isNull(int) isNull()} will not return accurate information until after an attempt is made to retrieve data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()}, {@link com.trolltech.qt.sql.QSqlQuery#isValid() isValid()}, and {@link com.trolltech.qt.sql.QSqlQuery#value(int) value()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isNull(int field)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull_int(nativeId(), field);
    }
    @QtBlockedSlot
    native boolean __qt_isNull_int(long __this__nativeId, int field);

/**
Returns true if the current query is a <tt>SELECT</tt> statement; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isSelect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSelect(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSelect(long __this__nativeId);

/**
Returns true if the query is currently positioned on a valid record; otherwise returns false.
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
Retrieves the last record in the result, if available, and positions the query on the retrieved record. Note that the result must be in the {@link com.trolltech.qt.sql.QSqlQuery#isActive() active} state and {@link com.trolltech.qt.sql.QSqlQuery#isSelect() isSelect()} must return true before calling this function or it will do nothing and return false. Returns true if successful. If unsuccessful the query position is set to an invalid position and false is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#next() next()}, {@link com.trolltech.qt.sql.QSqlQuery#previous() previous()}, {@link com.trolltech.qt.sql.QSqlQuery#first() first()}, {@link com.trolltech.qt.sql.QSqlQuery#seek(int) seek()}, {@link com.trolltech.qt.sql.QSqlQuery#at() at()}, {@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()}, and {@link com.trolltech.qt.sql.QSqlQuery#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean last()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_last(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_last(long __this__nativeId);

/**
Returns error information about the last error (if any) that occurred with this query. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlError QSqlError}, and {@link com.trolltech.qt.sql.QSqlDatabase#lastError() QSqlDatabase::lastError()}. <br></DD></DT>
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
Returns the object ID of the most recent inserted row if the database supports it. An invalid {@link com.trolltech.qt.QVariant QVariant} will be returned if the query did not insert any value or if the database does not report the id back. If more than one row was touched by the insert, the behavior is undefined. <p>For MySQL databases the row's auto-increment field will be returned. <p><b>Note:</b> For this function to work in PSQL, the table table must contain OIDs, which may not have been created by default. Check the <tt>default_with_oids</tt> configuration variable to be sure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature) QSqlDriver::hasFeature()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object lastInsertId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastInsertId(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_lastInsertId(long __this__nativeId);

/**
Returns the text of the current query being used, or an empty string if there is no current query text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#executedQuery() executedQuery()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String lastQuery()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastQuery(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_lastQuery(long __this__nativeId);

/**
Retrieves the next record in the result, if available, and positions the query on the retrieved record. Note that the result must be in the {@link com.trolltech.qt.sql.QSqlQuery#isActive() active} state and {@link com.trolltech.qt.sql.QSqlQuery#isSelect() isSelect()} must return true before calling this function or it will do nothing and return false. <p>The following rules apply: <ul><li> If the result is currently located before the first record, e.g. immediately after a query is executed, an attempt is made to retrieve the first record.</li><li> If the result is currently located after the last record, there is no change and false is returned.</li><li> If the result is located somewhere in the middle, an attempt is made to retrieve the next record.</li></ul> If the record could not be retrieved, the result is positioned after the last record and false is returned. If the record is successfully retrieved, true is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#previous() previous()}, {@link com.trolltech.qt.sql.QSqlQuery#first() first()}, {@link com.trolltech.qt.sql.QSqlQuery#last() last()}, {@link com.trolltech.qt.sql.QSqlQuery#seek(int) seek()}, {@link com.trolltech.qt.sql.QSqlQuery#at() at()}, {@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()}, and {@link com.trolltech.qt.sql.QSqlQuery#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean next()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_next(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_next(long __this__nativeId);

/**
Discards the current result set and navigates to the next if available. <p>Some databases are capable of returning multiple result sets for stored procedures or SQL batches (a query strings that contains multiple statements). If multiple result sets are available after executing a query this function can be used to navigate to the next result set(s). <p>If a new result set is available this function will return true. The query will be repositioned on an invalid record in the new result set and must be navigated to a valid record before data values can be retrieved. If a new result set isn't available the function returns false and the the query is set to inactive. In any case the old result set will be discarded. <p>When one of the statements is a non-select statement a count of affected rows may be available instead of a result set. <p>Note that some databases, i.e. Microsoft SQL Server, requires non-scrollable cursors when working with multiple result sets. Some databases may execute all statements at once while others may delay the execution until the result set is actually accessed, and some databases may have restrictions on which statements are allowed to be used in a SQL batch. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature) QSqlDriver::hasFeature()}, {@link com.trolltech.qt.sql.QSqlQuery#setForwardOnly(boolean) setForwardOnly()}, {@link com.trolltech.qt.sql.QSqlQuery#next() next()}, {@link com.trolltech.qt.sql.QSqlQuery#isSelect() isSelect()}, {@link com.trolltech.qt.sql.QSqlQuery#numRowsAffected() numRowsAffected()}, {@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()}, and {@link com.trolltech.qt.sql.QSqlQuery#lastError() lastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean nextResult()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nextResult(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_nextResult(long __this__nativeId);

/**
Returns the number of rows affected by the result's SQL statement, or -1 if it cannot be determined. Note that for <tt>SELECT</tt> statements, the value is undefined; use {@link com.trolltech.qt.sql.QSqlQuery#size() size()} instead. If the query is not {@link com.trolltech.qt.sql.QSqlQuery#isActive() active}, -1 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#size() size()}, and {@link com.trolltech.qt.sql.QSqlDriver#hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature) QSqlDriver::hasFeature()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int numRowsAffected()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_numRowsAffected(nativeId());
    }
    @QtBlockedSlot
    native int __qt_numRowsAffected(long __this__nativeId);

/**
Returns the current precision policy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSql.NumericalPrecisionPolicy QSql::NumericalPrecisionPolicy }, and {@link com.trolltech.qt.sql.QSqlQuery#setNumericalPrecisionPolicy(com.trolltech.qt.sql.QSql.NumericalPrecisionPolicy) setNumericalPrecisionPolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSql.NumericalPrecisionPolicy numericalPrecisionPolicy()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.sql.QSql.NumericalPrecisionPolicy.resolve(__qt_numericalPrecisionPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_numericalPrecisionPolicy(long __this__nativeId);

/**
Prepares the SQL query <tt>query</tt> for execution. Returns true if the query is prepared successfully; otherwise returns false. <p>The query may contain placeholders for binding values. Both Oracle style colon-name (e.g., <tt>:surname</tt>), and ODBC style (<tt>?</tt>) placeholders are supported; but they cannot be mixed in the same query. See the Detailed Description for examples. <p>Portability note: Some databases choose to delay preparing a query until it is executed the first time. In this case, preparing a syntactically wrong query succeeds, but every consecutive {@link com.trolltech.qt.sql.QSqlQuery#exec() exec()} will fail. <p>Example: <pre class="snippet">
        QSqlQuery query = new QSqlQuery();
        query.prepare("INSERT INTO person (id, forename, surname) " +
                      "VALUES (:id, :forename, :surname)");
        query.bindValue(":id", 1001);
        query.bindValue(":forename", "Bart");
        query.bindValue(":surname", "Simpson");
        query.exec();
    </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#exec() exec()}, {@link com.trolltech.qt.sql.QSqlQuery#bindValue(java.lang.String, java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) bindValue()}, and {@link com.trolltech.qt.sql.QSqlQuery#addBindValue(java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) addBindValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean prepare(java.lang.String query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prepare_String(nativeId(), query);
    }
    @QtBlockedSlot
    native boolean __qt_prepare_String(long __this__nativeId, java.lang.String query);

/**
Retrieves the previous record in the result, if available, and positions the query on the retrieved record. Note that the result must be in the {@link com.trolltech.qt.sql.QSqlQuery#isActive() active} state and {@link com.trolltech.qt.sql.QSqlQuery#isSelect() isSelect()} must return true before calling this function or it will do nothing and return false. <p>The following rules apply: <ul><li> If the result is currently located before the first record, there is no change and false is returned.</li><li> If the result is currently located after the last record, an attempt is made to retrieve the last record.</li><li> If the result is somewhere in the middle, an attempt is made to retrieve the previous record.</li></ul> If the record could not be retrieved, the result is positioned before the first record and false is returned. If the record is successfully retrieved, true is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#next() next()}, {@link com.trolltech.qt.sql.QSqlQuery#first() first()}, {@link com.trolltech.qt.sql.QSqlQuery#last() last()}, {@link com.trolltech.qt.sql.QSqlQuery#seek(int) seek()}, {@link com.trolltech.qt.sql.QSqlQuery#at() at()}, {@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()}, and {@link com.trolltech.qt.sql.QSqlQuery#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean previous()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_previous(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_previous(long __this__nativeId);

/**
Returns a {@link com.trolltech.qt.sql.QSqlRecord QSqlRecord} containing the field information for the current query. If the query points to a valid row ({@link com.trolltech.qt.sql.QSqlQuery#isValid() isValid()} returns true), the record is populated with the row's values. An empty record is returned when there is no active query ({@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()} returns false). <p>To retrieve values from a query, {@link com.trolltech.qt.sql.QSqlQuery#value(int) value()} should be used since its index-based lookup is faster. <p>In the following example, a <tt>SELECT * FROM</tt> query is executed. Since the order of the columns is not defined, {@link com.trolltech.qt.sql.QSqlRecord#indexOf(java.lang.String) QSqlRecord::indexOf()} is used to obtain the index of a column. <pre class="snippet">
    QSqlQuery q = new QSqlQuery("select * from employees");
    QSqlRecord rec = q.record();

    System.out.println("Number of columns: " + rec.count());

    int nameCol = rec.indexOf("name"); // index of the field "name"
    while (q.next())
        System.out.println(q.value(nameCol).toString()); // output all names
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#value(int) value()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlRecord record()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_record(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlRecord __qt_record(long __this__nativeId);

/**
Returns the result associated with the query.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlResult result()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_result(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlResult __qt_result(long __this__nativeId);


/**
Retrieves the record at position <tt>index</tt>, if available, and positions the query on the retrieved record. The first record is at position 0. Note that the query must be in an {@link com.trolltech.qt.sql.QSqlQuery#isActive() active} state and {@link com.trolltech.qt.sql.QSqlQuery#isSelect() isSelect()} must return true before calling this function. <p>If <tt>relative</tt> is false (the default), the following rules apply: <ul><li> If <tt>index</tt> is negative, the result is positioned before the first record and false is returned.</li><li> Otherwise, an attempt is made to move to the record at position <tt>index</tt>. If the record at position <tt>index</tt> could not be retrieved, the result is positioned after the last record and false is returned. If the record is successfully retrieved, true is returned.</li></ul> If <tt>relative</tt> is true, the following rules apply: <ul><li> If the result is currently positioned before the first record or on the first record, and <tt>index</tt> is negative, there is no change, and false is returned.</li><li> If the result is currently located after the last record, and <tt>index</tt> is positive, there is no change, and false is returned.</li><li> If the result is currently located somewhere in the middle, and the relative offset <tt>index</tt> moves the result below zero, the result is positioned before the first record and false is returned.</li><li> Otherwise, an attempt is made to move to the record <tt>index</tt> records ahead of the current record (or <tt>index</tt> records behind the current record if <tt>index</tt> is negative). If the record at offset <tt>index</tt> could not be retrieved, the result is positioned after the last record if <tt>index</tt> &gt;= 0, (or before the first record if <tt>index</tt> is negative), and false is returned. If the record is successfully retrieved, true is returned.</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#next() next()}, {@link com.trolltech.qt.sql.QSqlQuery#previous() previous()}, {@link com.trolltech.qt.sql.QSqlQuery#first() first()}, {@link com.trolltech.qt.sql.QSqlQuery#last() last()}, {@link com.trolltech.qt.sql.QSqlQuery#at() at()}, {@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()}, and {@link com.trolltech.qt.sql.QSqlQuery#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean seek(int i) {
        return seek(i, (boolean)false);
    }
/**
Retrieves the record at position <tt>index</tt>, if available, and positions the query on the retrieved record. The first record is at position 0. Note that the query must be in an {@link com.trolltech.qt.sql.QSqlQuery#isActive() active} state and {@link com.trolltech.qt.sql.QSqlQuery#isSelect() isSelect()} must return true before calling this function. <p>If <tt>relative</tt> is false (the default), the following rules apply: <ul><li> If <tt>index</tt> is negative, the result is positioned before the first record and false is returned.</li><li> Otherwise, an attempt is made to move to the record at position <tt>index</tt>. If the record at position <tt>index</tt> could not be retrieved, the result is positioned after the last record and false is returned. If the record is successfully retrieved, true is returned.</li></ul> If <tt>relative</tt> is true, the following rules apply: <ul><li> If the result is currently positioned before the first record or on the first record, and <tt>index</tt> is negative, there is no change, and false is returned.</li><li> If the result is currently located after the last record, and <tt>index</tt> is positive, there is no change, and false is returned.</li><li> If the result is currently located somewhere in the middle, and the relative offset <tt>index</tt> moves the result below zero, the result is positioned before the first record and false is returned.</li><li> Otherwise, an attempt is made to move to the record <tt>index</tt> records ahead of the current record (or <tt>index</tt> records behind the current record if <tt>index</tt> is negative). If the record at offset <tt>index</tt> could not be retrieved, the result is positioned after the last record if <tt>index</tt> &gt;= 0, (or before the first record if <tt>index</tt> is negative), and false is returned. If the record is successfully retrieved, true is returned.</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#next() next()}, {@link com.trolltech.qt.sql.QSqlQuery#previous() previous()}, {@link com.trolltech.qt.sql.QSqlQuery#first() first()}, {@link com.trolltech.qt.sql.QSqlQuery#last() last()}, {@link com.trolltech.qt.sql.QSqlQuery#at() at()}, {@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()}, and {@link com.trolltech.qt.sql.QSqlQuery#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean seek(int i, boolean relative)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_seek_int_boolean(nativeId(), i, relative);
    }
    @QtBlockedSlot
    native boolean __qt_seek_int_boolean(long __this__nativeId, int i, boolean relative);

/**
Sets forward only mode to <tt>forward</tt>. If <tt>forward</tt> is true, only {@link com.trolltech.qt.sql.QSqlQuery#next() next()} and {@link com.trolltech.qt.sql.QSqlQuery#seek(int) seek()} with positive values, are allowed for navigating the results. <p>Forward only mode can be (depending on the driver) more memory efficient since results do not need to be cached. It will also improve performance on some databases. For this to be true, you must call <tt>setForwardMode()</tt> before the query is prepared or executed. Note that the constructor that takes a query and a database may execute the query. <p>Forward only mode is off by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#isForwardOnly() isForwardOnly()}, {@link com.trolltech.qt.sql.QSqlQuery#next() next()}, and {@link com.trolltech.qt.sql.QSqlQuery#seek(int) seek()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setForwardOnly(boolean forward)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setForwardOnly_boolean(nativeId(), forward);
    }
    @QtBlockedSlot
    native void __qt_setForwardOnly_boolean(long __this__nativeId, boolean forward);

/**
Instruct the database driver to return numerical values with a precision specified by <tt>precisionPolicy</tt>. <p>The Oracle driver, for example, retrieves numerical values as strings by default to prevent the loss of precision. If the high precision doesn't matter, use this method to increase execution speed by bypassing string conversions. <p>Note: Drivers that don't support fetching numerical values with low precision will ignore the precision policy. You can use {@link com.trolltech.qt.sql.QSqlDriver#hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature) QSqlDriver::hasFeature()} to find out whether a driver supports this feature. <p>Note: Setting the precision policy doesn't affect the currently active query. Call {@link com.trolltech.qt.sql.QSqlQuery#exec() exec(QString)} or {@link com.trolltech.qt.sql.QSqlQuery#prepare(java.lang.String) prepare()} in order to activate the policy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSql.NumericalPrecisionPolicy QSql::NumericalPrecisionPolicy }, and {@link com.trolltech.qt.sql.QSqlQuery#numericalPrecisionPolicy() numericalPrecisionPolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNumericalPrecisionPolicy(com.trolltech.qt.sql.QSql.NumericalPrecisionPolicy precisionPolicy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNumericalPrecisionPolicy_NumericalPrecisionPolicy(nativeId(), precisionPolicy.value());
    }
    @QtBlockedSlot
    native void __qt_setNumericalPrecisionPolicy_NumericalPrecisionPolicy(long __this__nativeId, int precisionPolicy);

/**
Returns the size of the result (number of rows returned), or -1 if the size cannot be determined or if the database does not support reporting information about query sizes. Note that for non-<tt>SELECT</tt> statements ({@link com.trolltech.qt.sql.QSqlQuery#isSelect() isSelect()} returns false), {@link com.trolltech.qt.sql.QSqlQuery#size() size()} will return -1. If the query is not active ({@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()} returns false), -1 is returned. <p>To determine the number of rows affected by a non-<tt>SELECT</tt> statement, use {@link com.trolltech.qt.sql.QSqlQuery#numRowsAffected() numRowsAffected()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()}, {@link com.trolltech.qt.sql.QSqlQuery#numRowsAffected() numRowsAffected()}, and {@link com.trolltech.qt.sql.QSqlDriver#hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature) QSqlDriver::hasFeature()}. <br></DD></DT>
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
Returns the value of field <tt>index</tt> in the current record. <p>The fields are numbered from left to right using the text of the <tt>SELECT</tt> statement, e.g. in <pre class="snippet">
        SELECT forename, surname FROM people;
</pre> field 0 is <tt>forename</tt> and field 1 is <tt>surname</tt>. Using <tt>SELECT *</tt> is not recommended because the order of the fields in the query is undefined. <p>An invalid {@link com.trolltech.qt.QVariant QVariant} is returned if field <tt>index</tt> does not exist, if the query is inactive, or if the query is positioned on an invalid record. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#previous() previous()}, {@link com.trolltech.qt.sql.QSqlQuery#next() next()}, {@link com.trolltech.qt.sql.QSqlQuery#first() first()}, {@link com.trolltech.qt.sql.QSqlQuery#last() last()}, {@link com.trolltech.qt.sql.QSqlQuery#seek(int) seek()}, {@link com.trolltech.qt.sql.QSqlQuery#isActive() isActive()}, and {@link com.trolltech.qt.sql.QSqlQuery#isValid() isValid()}. <br></DD></DT>
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

    public static native QSqlQuery fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSqlQuery(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSqlQuery array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QSqlQuery clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSqlQuery __qt_clone(long __this_nativeId);
}
