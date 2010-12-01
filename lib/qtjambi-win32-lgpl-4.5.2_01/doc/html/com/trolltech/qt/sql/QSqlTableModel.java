package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSqlTableModel class provides an editable data model for a single database table. QSqlTableModel is a high-level interface for reading and writing database records from a single table. It is build on top of the lower-level {@link com.trolltech.qt.sql.QSqlQuery QSqlQuery} and can be used to provide data to view classes such as {@link com.trolltech.qt.gui.QTableView QTableView}. For example: <pre class="snippet">
        QSqlTableModel model = new QSqlTableModel();
        model.setTable("employee");
        model.setEditStrategy(QSqlTableModel.EditStrategy.OnManualSubmit);
        model.select();
        model.removeColumn(0); // don't show the ID
        model.setHeaderData(0, Qt.Orientation.Horizontal, tr("Name"));
        model.setHeaderData(1, Qt.Orientation.Horizontal, tr("Salary"));

        QTableView view = new QTableView();
        view.setModel(model);
        view.show();
    </pre> We set the SQL table's name and the edit strategy, then we set up the labels displayed in the view header. The edit strategy dictates when the changes done by the user in the view are actually applied to the database. The possible values are {@link com.trolltech.qt.sql.QSqlTableModel.EditStrategy OnFieldChange }, {@link com.trolltech.qt.sql.QSqlTableModel.EditStrategy OnRowChange }, and {@link com.trolltech.qt.sql.QSqlTableModel.EditStrategy OnManualSubmit }. <p>QSqlTableModel can also be used to access a database programmatically, without binding it to a view: <pre class="snippet">
        QSqlTableModel model = new QSqlTableModel();
        model.setTable("employee");
        String name = model.record(4).value("name").toString();
    </pre> The code snippet above extracts the <tt>salary</tt> field from record 4 in the result set of the query <tt>SELECT * from employee</tt>. <p>It is possible to set filters using {@link com.trolltech.qt.sql.QSqlTableModel#setFilter(java.lang.String) setFilter()}, or modify the sort order using {@link com.trolltech.qt.sql.QSqlTableModel#setSort(int, com.trolltech.qt.core.Qt.SortOrder) setSort()}. At the end, you must call {@link com.trolltech.qt.sql.QSqlTableModel#select() select()} to populate the model with data. <p>The {@link <a href="../sql-tablemodel.html">sql/tablemodel</a>} example illustrates how to use QSqlTableModel as the data source for a {@link com.trolltech.qt.gui.QTableView QTableView}. <p>QSqlTableModel provides no direct support for foreign keys. Use the {@link com.trolltech.qt.sql.QSqlRelationalTableModel QSqlRelationalTableModel} and {@link com.trolltech.qt.sql.QSqlRelationalDelegate QSqlRelationalDelegate} if you want to resolve foreign keys. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRelationalTableModel QSqlRelationalTableModel}, {@link com.trolltech.qt.sql.QSqlQuery QSqlQuery}, {@link <a href="../model-view-programming.html">Model/View Programming</a>}, {@link <a href="../sql-tablemodel.html">Table Model Example</a>}, and {@link <a href="../qtjambi-cachedtable.html">Cached Table Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSqlTableModel extends com.trolltech.qt.sql.QSqlQueryModel
{
    
/**
This enum type describes which strategy to choose when editing values in the database. Note: To prevent inserting only partly initialized rows into the database, <tt>OnFieldChange</tt> will behave like <tt>OnRowChange</tt> for newly inserted rows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlTableModel#setEditStrategy(com.trolltech.qt.sql.QSqlTableModel.EditStrategy) setEditStrategy()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum EditStrategy implements com.trolltech.qt.QtEnumerator {
/**
 All changes to the model will be applied immediately to the database.
*/

        OnFieldChange(0),
/**
 Changes to a row will be applied when the user selects a different row.
*/

        OnRowChange(1),
/**
 All changes will be cached in the model until either {@link com.trolltech.qt.sql.QSqlTableModel#submitAll() submitAll()} or {@link com.trolltech.qt.sql.QSqlTableModel#revertAll() revertAll()} is called.
*/

        OnManualSubmit(2);

        EditStrategy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSqlTableModel$EditStrategy constant with the specified <tt>int</tt>.</brief>
*/

        public static EditStrategy resolve(int value) {
            return (EditStrategy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return OnFieldChange;
            case 1: return OnRowChange;
            case 2: return OnManualSubmit;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: row)&gt;:<p> This signal is emitted by {@link com.trolltech.qt.sql.QSqlTableModel#deleteRowFromTable(int) deleteRowFromTable()} before the <tt>row</tt> is deleted from the currently active database table.
*/

    public final Signal1<java.lang.Integer> beforeDelete = new Signal1<java.lang.Integer>();

    private final void beforeDelete(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_beforeDelete_int(nativeId(), row);
    }
    native void __qt_beforeDelete_int(long __this__nativeId, int row);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.sql.QSqlRecord(named: record)&gt;:<p> This signal is emitted by {@link com.trolltech.qt.sql.QSqlTableModel#insertRowIntoTable(com.trolltech.qt.sql.QSqlRecord) insertRowIntoTable()} before a new row is inserted into the currently active database table. The values that are about to be inserted are stored in <tt>record</tt> and can be modified before they will be inserted.
*/

    public final Signal1<com.trolltech.qt.sql.QSqlRecord> beforeInsert = new Signal1<com.trolltech.qt.sql.QSqlRecord>();

    private final void beforeInsert(com.trolltech.qt.sql.QSqlRecord record)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_beforeInsert_nativepointer(nativeId(), record);
    }
    native void __qt_beforeInsert_nativepointer(long __this__nativeId, com.trolltech.qt.sql.QSqlRecord record);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: row), com.trolltech.qt.sql.QSqlRecord(named: record)&gt;:<p> This signal is emitted by {@link com.trolltech.qt.sql.QSqlTableModel#updateRowInTable(int, com.trolltech.qt.sql.QSqlRecord) updateRowInTable()} before the <tt>row</tt> is updated in the currently active database table with the values from <tt>record</tt>. <p>Note that only values that are marked as generated will be updated. The generated flag can be set with {@link com.trolltech.qt.sql.QSqlRecord#setGenerated(java.lang.String, boolean) QSqlRecord::setGenerated()} and checked with {@link com.trolltech.qt.sql.QSqlRecord#isGenerated(java.lang.String) QSqlRecord::isGenerated()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#isGenerated(java.lang.String) QSqlRecord::isGenerated()}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, com.trolltech.qt.sql.QSqlRecord> beforeUpdate = new Signal2<java.lang.Integer, com.trolltech.qt.sql.QSqlRecord>();

    private final void beforeUpdate(int row, com.trolltech.qt.sql.QSqlRecord record)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_beforeUpdate_int_nativepointer(nativeId(), row, record);
    }
    native void __qt_beforeUpdate_int_nativepointer(long __this__nativeId, int row, com.trolltech.qt.sql.QSqlRecord record);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: row), com.trolltech.qt.sql.QSqlRecord(named: record)&gt;:<p> This signal is emitted by insertRows(), when an insertion is initiated in the given <tt>row</tt> of the currently active database table. The <tt>record</tt> parameter can be written to (since it is a reference), for example to populate some fields with default values.
*/

    public final Signal2<java.lang.Integer, com.trolltech.qt.sql.QSqlRecord> primeInsert = new Signal2<java.lang.Integer, com.trolltech.qt.sql.QSqlRecord>();

    private final void primeInsert(int row, com.trolltech.qt.sql.QSqlRecord record)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_primeInsert_int_nativepointer(nativeId(), row, record);
    }
    native void __qt_primeInsert_int_nativepointer(long __this__nativeId, int row, com.trolltech.qt.sql.QSqlRecord record);


/**
Creates an empty QSqlTableModel and sets the parent to <tt>parent</tt> and the database connection to <tt>db</tt>. If <tt>db</tt> is not valid, the default database connection will be used. <p>The default edit strategy is {@link com.trolltech.qt.sql.QSqlTableModel.EditStrategy OnRowChange }.
*/

    public QSqlTableModel(com.trolltech.qt.core.QObject parent) {
        this(parent, (com.trolltech.qt.sql.QSqlDatabase)new com.trolltech.qt.sql.QSqlDatabase());
    }

/**
Creates an empty QSqlTableModel and sets the parent to <tt>parent</tt> and the database connection to <tt>db</tt>. If <tt>db</tt> is not valid, the default database connection will be used. <p>The default edit strategy is {@link com.trolltech.qt.sql.QSqlTableModel.EditStrategy OnRowChange }.
*/

    public QSqlTableModel() {
        this((com.trolltech.qt.core.QObject)null, (com.trolltech.qt.sql.QSqlDatabase)new com.trolltech.qt.sql.QSqlDatabase());
    }
/**
Creates an empty QSqlTableModel and sets the parent to <tt>parent</tt> and the database connection to <tt>db</tt>. If <tt>db</tt> is not valid, the default database connection will be used. <p>The default edit strategy is {@link com.trolltech.qt.sql.QSqlTableModel.EditStrategy OnRowChange }.
*/

    public QSqlTableModel(com.trolltech.qt.core.QObject parent, com.trolltech.qt.sql.QSqlDatabase db){
        super((QPrivateConstructor)null);
        __qt_QSqlTableModel_QObject_QSqlDatabase(parent == null ? 0 : parent.nativeId(), db == null ? 0 : db.nativeId());
    }

    native void __qt_QSqlTableModel_QObject_QSqlDatabase(long parent, long db);

/**
Returns a pointer to the used {@link com.trolltech.qt.sql.QSqlDatabase QSqlDatabase} or 0 if no database was set.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlDatabase database()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_database(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlDatabase __qt_database(long __this__nativeId);

/**
Returns the current edit strategy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlTableModel#setEditStrategy(com.trolltech.qt.sql.QSqlTableModel.EditStrategy) setEditStrategy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlTableModel.EditStrategy editStrategy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.sql.QSqlTableModel.EditStrategy.resolve(__qt_editStrategy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_editStrategy(long __this__nativeId);

/**
Returns the index of the field <tt>fieldName</tt>.
*/

    @QtBlockedSlot
    public final int fieldIndex(java.lang.String fieldName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fieldIndex_String(nativeId(), fieldName);
    }
    @QtBlockedSlot
    native int __qt_fieldIndex_String(long __this__nativeId, java.lang.String fieldName);

/**
Returns the currently set filter. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlTableModel#setFilter(java.lang.String) setFilter()}, and {@link com.trolltech.qt.sql.QSqlTableModel#select() select()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String filter()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_filter(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_filter(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QModelIndex indexInQuery(com.trolltech.qt.core.QModelIndex item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexInQuery_QModelIndex(nativeId(), item);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_indexInQuery_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex item);

/**
Inserts the <tt>record</tt> after <tt>row</tt>. If <tt>row</tt> is negative, the record will be appended to the end. Calls insertRows() and {@link com.trolltech.qt.sql.QSqlTableModel#setRecord(int, com.trolltech.qt.sql.QSqlRecord) setRecord()} internally. <p>Returns true if the row could be inserted, otherwise false. <p><DT><b>See also:</b><br><DD>insertRows(), and removeRows(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean insertRecord(int row, com.trolltech.qt.sql.QSqlRecord record)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertRecord_int_QSqlRecord(nativeId(), row, record == null ? 0 : record.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_insertRecord_int_QSqlRecord(long __this__nativeId, int row, long record);

/**
Returns true if the value at the index <tt>index</tt> is dirty, otherwise false. Dirty values are values that were modified in the model but not yet written into the database. <p>If <tt>index</tt> is invalid or points to a non-existing row, false is returned.
*/

    @QtBlockedSlot
    public final boolean isDirty(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDirty_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_isDirty_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Returns the primary key for the current table, or an empty {@link com.trolltech.qt.sql.QSqlIndex QSqlIndex} if the table is not set or has no primary key. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlTableModel#setTable(java.lang.String) setTable()}, {@link com.trolltech.qt.sql.QSqlTableModel#setPrimaryKey(com.trolltech.qt.sql.QSqlIndex) setPrimaryKey()}, and {@link com.trolltech.qt.sql.QSqlDatabase#primaryIndex(java.lang.String) QSqlDatabase::primaryIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlIndex primaryKey()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_primaryKey(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlIndex __qt_primaryKey(long __this__nativeId);

/**
Reverts all pending changes. <p><DT><b>See also:</b><br><DD>revert(), {@link com.trolltech.qt.sql.QSqlTableModel#revertRow(int) revertRow()}, and {@link com.trolltech.qt.sql.QSqlTableModel#submitAll() submitAll()}. <br></DD></DT>
*/

    public final void revertAll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_revertAll(nativeId());
    }
    native void __qt_revertAll(long __this__nativeId);

/**
Protected method that allows subclasses to set the primary key to <tt>key</tt>. <p>Normally, the primary index is set automatically whenever you call {@link com.trolltech.qt.sql.QSqlTableModel#setTable(java.lang.String) setTable()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlTableModel#primaryKey() primaryKey()}, and {@link com.trolltech.qt.sql.QSqlDatabase#primaryIndex(java.lang.String) QSqlDatabase::primaryIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setPrimaryKey(com.trolltech.qt.sql.QSqlIndex key)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrimaryKey_QSqlIndex(nativeId(), key == null ? 0 : key.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPrimaryKey_QSqlIndex(long __this__nativeId, long key);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setQuery(com.trolltech.qt.sql.QSqlQuery query)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQuery_QSqlQuery(nativeId(), query == null ? 0 : query.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setQuery_QSqlQuery(long __this__nativeId, long query);

/**
Sets the values at the specified <tt>row</tt> to the values of <tt>record</tt>. Returns true if all the values could be set; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQueryModel#record() record()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setRecord(int row, com.trolltech.qt.sql.QSqlRecord record)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setRecord_int_QSqlRecord(nativeId(), row, record == null ? 0 : record.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_setRecord_int_QSqlRecord(long __this__nativeId, int row, long record);

/**
Submits all pending changes and returns true on success. Returns false on error, detailed error information can be obtained with {@link com.trolltech.qt.sql.QSqlQueryModel#lastError() lastError()}. <p>On success the model will be repopulated. Any views presenting it will lose their selections. <p>Note: In {@link com.trolltech.qt.sql.QSqlTableModel.EditStrategy OnManualSubmit } mode, already submitted changes won't be cleared from the cache when {@link com.trolltech.qt.sql.QSqlTableModel#submitAll() submitAll()} fails. This allows transactions to be rolled back and resubmitted again without losing data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlTableModel#revertAll() revertAll()}, and {@link com.trolltech.qt.sql.QSqlQueryModel#lastError() lastError()}. <br></DD></DT>
*/

    public final boolean submitAll()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_submitAll(nativeId());
    }
    native boolean __qt_submitAll(long __this__nativeId);

/**
Returns the name of the currently selected table.
*/

    @QtBlockedSlot
    public final java.lang.String tableName()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tableName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_tableName(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
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
    public java.lang.Object data(com.trolltech.qt.core.QModelIndex idx, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_QModelIndex_int(nativeId(), idx, role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_data_QModelIndex_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex idx, int role);

/**
Deletes the given <tt>row</tt> from the currently active database table. <p>This is a low-level method that operates directly on the database and should not be called directly. Use {@link com.trolltech.qt.core.QAbstractItemModel#removeRow(int) removeRow()} or removeRows() to delete values. The model will decide depending on its edit strategy when to modify the database. <p>Returns true if the row was deleted; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel#removeRow(int) removeRow()}, and removeRows(). <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean deleteRowFromTable(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_deleteRowFromTable_int(nativeId(), row);
    }
    @QtBlockedSlot
    native boolean __qt_deleteRowFromTable_int(long __this__nativeId, int row);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.Qt.ItemFlags flags(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.ItemFlags(__qt_flags_QModelIndex(nativeId(), index));
    }
    @QtBlockedSlot
    native int __qt_flags_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

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
Inserts the values <tt>values</tt> into the currently active database table. <p>This is a low-level method that operates directly on the database and should not be called directly. Use {@link com.trolltech.qt.core.QAbstractItemModel#insertRow(int) insertRow()} and setData() to insert values. The model will decide depending on its edit strategy when to modify the database. <p>Returns true if the values could be inserted, otherwise false. Error information can be retrieved with {@link com.trolltech.qt.sql.QSqlQueryModel#lastError() lastError()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQueryModel#lastError() lastError()}, {@link com.trolltech.qt.core.QAbstractItemModel#insertRow(int) insertRow()}, and insertRows(). <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean insertRowIntoTable(com.trolltech.qt.sql.QSqlRecord values)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertRowIntoTable_QSqlRecord(nativeId(), values == null ? 0 : values.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_insertRowIntoTable_QSqlRecord(long __this__nativeId, long values);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean insertRows(int row, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertRows_int_int_QModelIndex(nativeId(), row, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_insertRows_int_int_QModelIndex(long __this__nativeId, int row, int count, com.trolltech.qt.core.QModelIndex parent);

/**
Returns an SQL <tt>ORDER BY</tt> clause based on the currently set sort order. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlTableModel#setSort(int, com.trolltech.qt.core.Qt.SortOrder) setSort()}, and {@link com.trolltech.qt.sql.QSqlTableModel#selectStatement() selectStatement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected java.lang.String orderByClause()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_orderByClause(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_orderByClause(long __this__nativeId);

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
    public boolean removeRows(int row, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeRows_int_int_QModelIndex(nativeId(), row, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_removeRows_int_int_QModelIndex(long __this__nativeId, int row, int count, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public void revert()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_revert(nativeId());
    }
    native void __qt_revert(long __this__nativeId);

/**
Reverts all changes for the specified <tt>row</tt>. <p><DT><b>See also:</b><br><DD>revert(), {@link com.trolltech.qt.sql.QSqlTableModel#revertAll() revertAll()}, submit(), and {@link com.trolltech.qt.sql.QSqlTableModel#submitAll() submitAll()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void revertRow(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_revertRow_int(nativeId(), row);
    }
    @QtBlockedSlot
    native void __qt_revertRow_int(long __this__nativeId, int row);

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
Populates the model with data from the table that was set via {@link com.trolltech.qt.sql.QSqlTableModel#setTable(java.lang.String) setTable()}, using the specified filter and sort condition, and returns true if successful; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlTableModel#setTable(java.lang.String) setTable()}, {@link com.trolltech.qt.sql.QSqlTableModel#setFilter(java.lang.String) setFilter()}, and {@link com.trolltech.qt.sql.QSqlTableModel#selectStatement() selectStatement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean select()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_select(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_select(long __this__nativeId);

/**
Returns the SQL <tt>SELECT</tt> statement used internally to populate the model. The statement includes the filter and the <tt>ORDER BY</tt> clause. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlTableModel#filter() filter()}, and {@link com.trolltech.qt.sql.QSqlTableModel#orderByClause() orderByClause()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected java.lang.String selectStatement()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectStatement(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_selectStatement(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean setData(com.trolltech.qt.core.QModelIndex index, java.lang.Object value, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setData_QModelIndex_Object_int(nativeId(), index, value, role);
    }
    @QtBlockedSlot
    native boolean __qt_setData_QModelIndex_Object_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, java.lang.Object value, int role);

/**
Sets the strategy for editing values in the database to <tt>strategy</tt>. <p>This will revert any pending changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlTableModel#editStrategy() editStrategy()}, and {@link com.trolltech.qt.sql.QSqlTableModel#revertAll() revertAll()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setEditStrategy(com.trolltech.qt.sql.QSqlTableModel.EditStrategy strategy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEditStrategy_EditStrategy(nativeId(), strategy.value());
    }
    @QtBlockedSlot
    native void __qt_setEditStrategy_EditStrategy(long __this__nativeId, int strategy);

/**
Sets the current filter to <tt>filter</tt>. <p>The filter is a SQL <tt>WHERE</tt> clause without the keyword <tt>WHERE</tt> (for example, <tt>name='Josephine')</tt>. <p>If the model is already populated with data from a database, the model re-selects it with the new filter. Otherwise, the filter will be applied the next time {@link com.trolltech.qt.sql.QSqlTableModel#select() select()} is called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlTableModel#filter() filter()}, {@link com.trolltech.qt.sql.QSqlTableModel#select() select()}, {@link com.trolltech.qt.sql.QSqlTableModel#selectStatement() selectStatement()}, and {@link com.trolltech.qt.sql.QSqlTableModel#orderByClause() orderByClause()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setFilter(java.lang.String filter)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFilter_String(nativeId(), filter);
    }
    @QtBlockedSlot
    native void __qt_setFilter_String(long __this__nativeId, java.lang.String filter);

/**
Sets the sort order for <tt>column</tt> to <tt>order</tt>. This does not affect the current data, to refresh the data using the new sort order, call {@link com.trolltech.qt.sql.QSqlTableModel#select() select()}. <p><DT><b>See also:</b><br><DD>sort(), {@link com.trolltech.qt.sql.QSqlTableModel#select() select()}, and {@link com.trolltech.qt.sql.QSqlTableModel#orderByClause() orderByClause()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setSort(int column, com.trolltech.qt.core.Qt.SortOrder order)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSort_int_SortOrder(nativeId(), column, order.value());
    }
    @QtBlockedSlot
    native void __qt_setSort_int_SortOrder(long __this__nativeId, int column, int order);

/**
Sets the database table on which the model operates to <tt>tableName</tt>. Does not select data from the table, but fetches its field information. <p>To populate the model with the table's data, call {@link com.trolltech.qt.sql.QSqlTableModel#select() select()}. <p>Error information can be retrieved with {@link com.trolltech.qt.sql.QSqlQueryModel#lastError() lastError()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlTableModel#select() select()}, {@link com.trolltech.qt.sql.QSqlTableModel#setFilter(java.lang.String) setFilter()}, and {@link com.trolltech.qt.sql.QSqlQueryModel#lastError() lastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setTable(java.lang.String tableName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTable_String(nativeId(), tableName);
    }
    @QtBlockedSlot
    native void __qt_setTable_String(long __this__nativeId, java.lang.String tableName);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void sort(int column, com.trolltech.qt.core.Qt.SortOrder order)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sort_int_SortOrder(nativeId(), column, order.value());
    }
    @QtBlockedSlot
    native void __qt_sort_int_SortOrder(long __this__nativeId, int column, int order);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public boolean submit()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_submit(nativeId());
    }
    native boolean __qt_submit(long __this__nativeId);

/**
Updates the given <tt>row</tt> in the currently active database table with the specified <tt>values</tt>. Returns true if successful; otherwise returns false. <p>This is a low-level method that operates directly on the database and should not be called directly. Use setData() to update values. The model will decide depending on its edit strategy when to modify the database. <p>Note that only values that have the generated-flag set are updated. The generated-flag can be set with {@link com.trolltech.qt.sql.QSqlRecord#setGenerated(java.lang.String, boolean) QSqlRecord::setGenerated()} and tested with {@link com.trolltech.qt.sql.QSqlRecord#isGenerated(java.lang.String) QSqlRecord::isGenerated()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRecord#isGenerated(java.lang.String) QSqlRecord::isGenerated()}, and setData(). <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean updateRowInTable(int row, com.trolltech.qt.sql.QSqlRecord values)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_updateRowInTable_int_QSqlRecord(nativeId(), row, values == null ? 0 : values.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_updateRowInTable_int_QSqlRecord(long __this__nativeId, int row, long values);

/**
@exclude
*/

    public static native QSqlTableModel fromNativePointer(QNativePointer nativePointer);

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

    protected QSqlTableModel(QPrivateConstructor p) { super(p); } 
}
