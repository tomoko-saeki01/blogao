package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSqlRelationalTableModel class provides an editable data model for a single database table, with foreign key support. QSqlRelationalTableModel acts like {@link com.trolltech.qt.sql.QSqlTableModel QSqlTableModel}, but allows columns to be set as foreign keys into other database tables. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/noforeignkeys.png"></center><br></td><td>  <br><center><img src="../images/foreignkeys.png"></center><br></td></tr></table> The screenshot on the left shows a plain {@link com.trolltech.qt.sql.QSqlTableModel QSqlTableModel} in a {@link com.trolltech.qt.gui.QTableView QTableView}. Foreign keys (<tt>city</tt> and <tt>country</tt>) aren't resolved to human-readable values. The screenshot on the right shows a QSqlRelationalTableModel, with foreign keys resolved into human-readable text strings. <p>The following code snippet shows how the QSqlRelationalTableModel was set up:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    model-&gt;setTable("employee");
<br>
    model-&gt;setRelation(2, QSqlRelation("city", "id", "name"));

    model-&gt;setRelation(3, QSqlRelation("country", "id", "name"));
</pre> The {@link com.trolltech.qt.sql.QSqlRelationalTableModel#setRelation(int, com.trolltech.qt.sql.QSqlRelation) setRelation()} function calls establish a relationship between two tables. The first call specifies that column 2 in table <tt>employee</tt> is a foreign key that maps with field <tt>id</tt> of table <tt>city</tt>, and that the view should present the <tt>city</tt>'s <tt>name</tt> field to the user. The second call does something similar with column 3. <p>If you use a read-write QSqlRelationalTableModel, you probably want to use {@link com.trolltech.qt.sql.QSqlRelationalDelegate QSqlRelationalDelegate} on the view. Unlike the default delegate, {@link com.trolltech.qt.sql.QSqlRelationalDelegate QSqlRelationalDelegate} provides a combobox for fields that are foreign keys into other tables. To use the class, simply call {@link com.trolltech.qt.gui.QAbstractItemView#setItemDelegate(com.trolltech.qt.gui.QAbstractItemDelegate) QAbstractItemView::setItemDelegate()} on the view with an instance of {@link com.trolltech.qt.sql.QSqlRelationalDelegate QSqlRelationalDelegate}:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    QTableView *view = new QTableView;
    view-&gt;setModel(model);
    view-&gt;setItemDelegate(new QSqlRelationalDelegate(view));
</pre> The {@link <a href="../sql-relationaltablemodel.html">sql/relationaltablemodel</a>} example illustrates how to use QSqlRelationalTableModel in conjunction with {@link com.trolltech.qt.sql.QSqlRelationalDelegate QSqlRelationalDelegate} to provide tables with foreigh key support. <br><center><img src="../images/relationaltable.png"></center><br> Notes: <ul><li> The table must have a primary key declared.</li><li> The table's primary key may not contain a relation to another table.</li><li> If a relational table contains keys that refer to non-existent rows in the referenced table, the rows containing the invalid keys will not be exposed through the model. The user or the database is responsible for keeping referential integrity.</li><li> If a relation's display column name is also used as a column name in the main table, or if it is used as display column name in more than one relation it will be aliased. The alias is is the relation's table name and display column name joined by an underscore (e.g. tablename_columnname). All occurrences of the duplicate display column name are aliased when duplication is detected, but no aliasing is done to the column names in the main table. The aliasing doesn't affect {@link com.trolltech.qt.sql.QSqlRelation QSqlRelation}, so {@link com.trolltech.qt.sql.QSqlRelation#displayColumn() QSqlRelation::displayColumn()} will return the original display column name, but {@link com.trolltech.qt.sql.QSqlRecord#fieldName(int) QSqlRecord::fieldName()} will return aliases.</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRelation QSqlRelation}, {@link com.trolltech.qt.sql.QSqlRelationalDelegate QSqlRelationalDelegate}, and {@link <a href="../sql-relationaltablemodel.html">Relational Table Model Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSqlRelationalTableModel extends com.trolltech.qt.sql.QSqlTableModel
{


/**
Creates an empty QSqlRelationalTableModel and sets the parent to <tt>parent</tt> and the database connection to <tt>db</tt>. If <tt>db</tt> is not valid, the default database connection will be used.
*/

    public QSqlRelationalTableModel(com.trolltech.qt.core.QObject parent) {
        this(parent, (com.trolltech.qt.sql.QSqlDatabase)new com.trolltech.qt.sql.QSqlDatabase());
    }

/**
Creates an empty QSqlRelationalTableModel and sets the parent to <tt>parent</tt> and the database connection to <tt>db</tt>. If <tt>db</tt> is not valid, the default database connection will be used.
*/

    public QSqlRelationalTableModel() {
        this((com.trolltech.qt.core.QObject)null, (com.trolltech.qt.sql.QSqlDatabase)new com.trolltech.qt.sql.QSqlDatabase());
    }
/**
Creates an empty QSqlRelationalTableModel and sets the parent to <tt>parent</tt> and the database connection to <tt>db</tt>. If <tt>db</tt> is not valid, the default database connection will be used.
*/

    public QSqlRelationalTableModel(com.trolltech.qt.core.QObject parent, com.trolltech.qt.sql.QSqlDatabase db){
        super((QPrivateConstructor)null);
        __qt_QSqlRelationalTableModel_QObject_QSqlDatabase(parent == null ? 0 : parent.nativeId(), db == null ? 0 : db.nativeId());
    }

    native void __qt_QSqlRelationalTableModel_QObject_QSqlDatabase(long parent, long db);

/**
Returns the relation for the column <tt>column</tt>, or an invalid relation if no relation is set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRelationalTableModel#setRelation(int, com.trolltech.qt.sql.QSqlRelation) setRelation()}, and {@link com.trolltech.qt.sql.QSqlRelation#isValid() QSqlRelation::isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.sql.QSqlRelation relation(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_relation_int(nativeId(), column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlRelation __qt_relation_int(long __this__nativeId, int column);

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
    protected java.lang.String orderByClause()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_orderByClause(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_orderByClause(long __this__nativeId);

/**
Returns a {@link com.trolltech.qt.sql.QSqlTableModel QSqlTableModel} object for accessing the table for which <tt>column</tt> is a foreign key, or 0 if there is no relation for the given <tt>column</tt>. <p>The returned object is owned by the QSqlRelationalTableModel. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRelationalTableModel#setRelation(int, com.trolltech.qt.sql.QSqlRelation) setRelation()}, and {@link com.trolltech.qt.sql.QSqlRelationalTableModel#relation(int) relation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.sql.QSqlTableModel relationModel(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_relationModel_int(nativeId(), column);
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlTableModel __qt_relationModel_int(long __this__nativeId, int column);

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

    public void revertRow(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_revertRow_int(nativeId(), row);
    }
    native void __qt_revertRow_int(long __this__nativeId, int row);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
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
    public boolean setData(com.trolltech.qt.core.QModelIndex item, java.lang.Object value, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setData_QModelIndex_Object_int(nativeId(), item, value, role);
    }
    @QtBlockedSlot
    native boolean __qt_setData_QModelIndex_Object_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex item, java.lang.Object value, int role);

/**
Lets the specified <tt>column</tt> be a foreign index specified by <tt>relation</tt>. <p>Example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    model-&gt;setTable("employee");
<br>
    model-&gt;setRelation(2, QSqlRelation("city", "id", "name"));
</pre> The {@link com.trolltech.qt.sql.QSqlRelationalTableModel#setRelation(int, com.trolltech.qt.sql.QSqlRelation) setRelation()} call specifies that column 2 in table <tt>employee</tt> is a foreign key that maps with field <tt>id</tt> of table <tt>city</tt>, and that the view should present the <tt>city</tt>'s <tt>name</tt> field to the user. <p>Note: The table's primary key may not contain a relation to another table. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRelationalTableModel#relation(int) relation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setRelation(int column, com.trolltech.qt.sql.QSqlRelation relation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRelation_int_QSqlRelation(nativeId(), column, relation == null ? 0 : relation.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setRelation_int_QSqlRelation(long __this__nativeId, int column, long relation);

/**
This method is internal to Qt Jambi. 

	@exclude
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

    public static native QSqlRelationalTableModel fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSqlRelationalTableModel(QPrivateConstructor p) { super(p); } 
}
