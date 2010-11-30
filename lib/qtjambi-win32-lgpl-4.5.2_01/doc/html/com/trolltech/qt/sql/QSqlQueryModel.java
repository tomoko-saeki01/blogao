package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSqlQueryModel class provides a read-only data model for SQL result sets. QSqlQueryModel is a high-level interface for executing SQL statements and traversing the result set. It is built on top of the lower-level {@link com.trolltech.qt.sql.QSqlQuery QSqlQuery} and can be used to provide data to view classes such as {@link com.trolltech.qt.gui.QTableView QTableView}. For example: <pre class="snippet">
        QSqlQueryModel model = new QSqlQueryModel();
        model.setQuery("SELECT name, salary FROM employee");
        model.setHeaderData(0, Qt.Orientation.Horizontal, tr("Name"));
        model.setHeaderData(1, Qt.Orientation.Horizontal, tr("Salary"));

    
        QTableView view = new QTableView();
     
        view.setModel(model);
     
        view.show();
    </pre> We set the model's query, then we set up the labels displayed in the view header. <p>QSqlQueryModel can also be used to access a database programmatically, without binding it to a view: <pre class="snippet">
        QSqlQueryModel model = new QSqlQueryModel();
        model.setQuery("SELECT * FROM employee");
        int salary = ((Integer) model.record(4).value("salary")).intValue();
    </pre> The code snippet above extracts the <tt>salary</tt> field from record 4 in the result set of the query <tt>SELECT * from employee</tt>. Assuming that <tt>salary</tt> is column 2, we can rewrite the last line as follows: <pre class="snippet">
        int salary = ((Integer) model.data(model.index(4, 2))).intValue();
    </pre> The model is read-only by default. To make it read-write, you must subclass it and reimplement {@link com.trolltech.qt.core.QAbstractItemModel#setData(com.trolltech.qt.core.QModelIndex, java.lang.Object) setData()} and {@link com.trolltech.qt.core.QAbstractItemModel#flags(com.trolltech.qt.core.QModelIndex) flags()}. Another option is to use {@link com.trolltech.qt.sql.QSqlTableModel QSqlTableModel}, which provides a read-write model based on a single database table. <p>The {@link <a href="../sql-querymodel.html">sql/querymodel</a>} example illustrates how to use QSqlQueryModel to display the result of a query. It also shows how to subclass QSqlQueryModel to customize the contents of the data before showing it to the user, and how to create a read-write model based on QSqlQueryModel. <p>If the database doesn't return the amount of selected rows in a query, the model will fetch rows incrementally. See fetchMore() for more information. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlTableModel QSqlTableModel}, {@link com.trolltech.qt.sql.QSqlRelationalTableModel QSqlRelationalTableModel}, {@link com.trolltech.qt.sql.QSqlQuery QSqlQuery}, {@link <a href="../model-view-programming.html">Model/View Programming</a>}, and {@link <a href="../sql-querymodel.html">Query Model Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSqlQueryModel extends com.trolltech.qt.gui.QAbstractTableModel
{

    static {
        com.trolltech.qt.sql.QtJambi_LibraryInitializer.init();
    }


/**
Creates an empty QSqlQueryModel with the given <tt>parent</tt>.
*/

    public QSqlQueryModel() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Creates an empty QSqlQueryModel with the given <tt>parent</tt>.
*/

    public QSqlQueryModel(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSqlQueryModel_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSqlQueryModel_QObject(long parent);

/**
Returns the index of the value in the database result set for the given <tt>item</tt> in the model. <p>The return value is identical to <tt>item</tt> if no columns or rows have been inserted, removed, or moved around. <p>Returns an invalid model index if <tt>item</tt> is out of bounds or if <tt>item</tt> does not point to a value in the result set. <p><DT><b>See also:</b><br><DD>QSqlTableModel::indexInQuery(), insertColumns(), and removeColumns(). <br></DD></DT>
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.QModelIndex indexInQuery(com.trolltech.qt.core.QModelIndex item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexInQuery_QModelIndex(nativeId(), item);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_indexInQuery_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex item);

/**
Returns information about the last error that occurred on the database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQueryModel#setLastError(com.trolltech.qt.sql.QSqlError) setLastError()}, and {@link com.trolltech.qt.sql.QSqlQueryModel#query() query()}. <br></DD></DT>
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
Returns the {@link com.trolltech.qt.sql.QSqlQuery QSqlQuery} associated with this model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQueryModel#setQuery(com.trolltech.qt.sql.QSqlQuery) setQuery()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlQuery query()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_query(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlQuery __qt_query(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Returns an empty record containing information about the fields of the current query. <p>If the model is not initialized, an empty record will be returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#isEmpty() QSqlRecord::isEmpty()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlRecord record()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_record(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlRecord __qt_record(long __this__nativeId);

/**
Returns the record containing information about the fields of the current query. If <tt>row</tt> is the index of a valid row, the record will be populated with values from that row. <p>If the model is not initialized, an empty record will be returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#isEmpty() QSqlRecord::isEmpty()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlRecord record(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_record_int(nativeId(), row);
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlRecord __qt_record_int(long __this__nativeId, int row);

/**
Protected function which allows derived classes to set the value of the last error that occurred on the database to <tt>error</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQueryModel#lastError() lastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setLastError(com.trolltech.qt.sql.QSqlError error)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLastError_QSqlError(nativeId(), error == null ? 0 : error.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLastError_QSqlError(long __this__nativeId, long error);

/**
Resets the model and sets the data provider to be the given <tt>query</tt>. Note that the query must be active and must not be isForwardOnly(). <p>{@link com.trolltech.qt.sql.QSqlQueryModel#lastError() lastError()} can be used to retrieve verbose information if there was an error setting the query. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQueryModel#query() query()}, {@link com.trolltech.qt.sql.QSqlQuery#isActive() QSqlQuery::isActive()}, {@link com.trolltech.qt.sql.QSqlQuery#setForwardOnly(boolean) QSqlQuery::setForwardOnly()}, and {@link com.trolltech.qt.sql.QSqlQueryModel#lastError() lastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setQuery(com.trolltech.qt.sql.QSqlQuery query)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQuery_QSqlQuery(nativeId(), query == null ? 0 : query.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setQuery_QSqlQuery(long __this__nativeId, long query);


/**
This is an overloaded member function, provided for convenience. <p>Executes the query <tt>query</tt> for the given database connection <tt>db</tt>. If no database is specified, the default connection is used. <p>{@link com.trolltech.qt.sql.QSqlQueryModel#lastError() lastError()} can be used to retrieve verbose information if there was an error setting the query. <p>Example: <pre class="snippet">
    QSqlQueryModel model = new QSqlQueryModel();
    model.setQuery("select * from MyTable");
    if (model.lastError().isValid())
        System.out.println(model.lastError());
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQueryModel#query() query()}, {@link com.trolltech.qt.sql.QSqlQueryModel#queryChange() queryChange()}, and {@link com.trolltech.qt.sql.QSqlQueryModel#lastError() lastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setQuery(java.lang.String query) {
        setQuery(query, (com.trolltech.qt.sql.QSqlDatabase)new com.trolltech.qt.sql.QSqlDatabase());
    }
/**
This is an overloaded member function, provided for convenience. <p>Executes the query <tt>query</tt> for the given database connection <tt>db</tt>. If no database is specified, the default connection is used. <p>{@link com.trolltech.qt.sql.QSqlQueryModel#lastError() lastError()} can be used to retrieve verbose information if there was an error setting the query. <p>Example: <pre class="snippet">
    QSqlQueryModel model = new QSqlQueryModel();
    model.setQuery("select * from MyTable");
    if (model.lastError().isValid())
        System.out.println(model.lastError());
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQueryModel#query() query()}, {@link com.trolltech.qt.sql.QSqlQueryModel#queryChange() queryChange()}, and {@link com.trolltech.qt.sql.QSqlQueryModel#lastError() lastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setQuery(java.lang.String query, com.trolltech.qt.sql.QSqlDatabase db)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQuery_String_QSqlDatabase(nativeId(), query, db == null ? 0 : db.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setQuery_String_QSqlDatabase(long __this__nativeId, java.lang.String query, long db);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean canFetchMore(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canFetchMore_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native boolean __qt_canFetchMore_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
Clears the model and releases any acquired resource.
*/

    @QtBlockedSlot
    public void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int columnCount(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnCount_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native int __qt_columnCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object data(com.trolltech.qt.core.QModelIndex item, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_QModelIndex_int(nativeId(), item, role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_data_QModelIndex_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex item, int role);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void fetchMore(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fetchMore_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native void __qt_fetchMore_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object headerData(int section, com.trolltech.qt.core.Qt.Orientation orientation, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_headerData_int_Orientation_int(nativeId(), section, orientation.value(), role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_headerData_int_Orientation_int(long __this__nativeId, int section, int orientation, int role);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean insertColumns(int column, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertColumns_int_int_QModelIndex(nativeId(), column, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_insertColumns_int_int_QModelIndex(long __this__nativeId, int column, int count, com.trolltech.qt.core.QModelIndex parent);

/**
This virtual function is called whenever the query changes. The default implementation does nothing. <p>{@link com.trolltech.qt.sql.QSqlQueryModel#query() query()} returns the new query. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQueryModel#query() query()}, and {@link com.trolltech.qt.sql.QSqlQueryModel#setQuery(com.trolltech.qt.sql.QSqlQuery) setQuery()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void queryChange()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_queryChange(nativeId());
    }
    @QtBlockedSlot
    native void __qt_queryChange(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean removeColumns(int column, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeColumns_int_int_QModelIndex(nativeId(), column, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_removeColumns_int_int_QModelIndex(long __this__nativeId, int column, int count, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int rowCount(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowCount_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native int __qt_rowCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean setHeaderData(int section, com.trolltech.qt.core.Qt.Orientation orientation, java.lang.Object value, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setHeaderData_int_Orientation_Object_int(nativeId(), section, orientation.value(), value, role);
    }
    @QtBlockedSlot
    native boolean __qt_setHeaderData_int_Orientation_Object_int(long __this__nativeId, int section, int orientation, java.lang.Object value, int role);

/**
@exclude
*/

    public static native QSqlQueryModel fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSqlQueryModel(QPrivateConstructor p) { super(p); } 
}
