package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSqlRelation class stores information about an SQL foreign key. QSqlRelation is a helper class for {@link com.trolltech.qt.sql.QSqlRelationalTableModel QSqlRelationalTableModel}. See {@link com.trolltech.qt.sql.QSqlRelationalTableModel#setRelation(int, com.trolltech.qt.sql.QSqlRelation) QSqlRelationalTableModel::setRelation()} and {@link com.trolltech.qt.sql.QSqlRelationalTableModel#relation(int) QSqlRelationalTableModel::relation()} for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRelationalTableModel QSqlRelationalTableModel}, {@link com.trolltech.qt.sql.QSqlRelationalDelegate QSqlRelationalDelegate}, and {@link <a href="../sql-relationaltablemodel.html">Relational Table Model Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSqlRelation extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.sql.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an invalid QSqlRelation object. <p>For such an object, the {@link com.trolltech.qt.sql.QSqlRelation#tableName() tableName()}, {@link com.trolltech.qt.sql.QSqlRelation#indexColumn() indexColumn()}, and {@link com.trolltech.qt.sql.QSqlRelation#displayColumn() displayColumn()} functions return an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRelation#isValid() isValid()}. <br></DD></DT>
*/

    public QSqlRelation(){
        super((QPrivateConstructor)null);
        __qt_QSqlRelation();
    }

    native void __qt_QSqlRelation();

/**
Constructs a QSqlRelation object, where <tt>tableName</tt> is the SQL table name to which a foreign key refers, <tt>indexColumn</tt> is the foreign key, and <tt>displayColumn</tt> is the field that should be presented to the user. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlRelation#tableName() tableName()}, {@link com.trolltech.qt.sql.QSqlRelation#indexColumn() indexColumn()}, and {@link com.trolltech.qt.sql.QSqlRelation#displayColumn() displayColumn()}. <br></DD></DT>
*/

    public QSqlRelation(java.lang.String aTableName, java.lang.String indexCol, java.lang.String displayCol){
        super((QPrivateConstructor)null);
        __qt_QSqlRelation_String_String_String(aTableName, indexCol, displayCol);
    }

    native void __qt_QSqlRelation_String_String_String(java.lang.String aTableName, java.lang.String indexCol, java.lang.String displayCol);

/**
Returns the column from table {@link com.trolltech.qt.sql.QSqlRelation#tableName() tableName()} that should be presented to the user instead of a foreign key.
*/

    @QtBlockedSlot
    public final java.lang.String displayColumn()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_displayColumn(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_displayColumn(long __this__nativeId);

/**
Returns the index column from table {@link com.trolltech.qt.sql.QSqlRelation#tableName() tableName()} to which a foreign key refers.
*/

    @QtBlockedSlot
    public final java.lang.String indexColumn()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexColumn(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_indexColumn(long __this__nativeId);

/**
Returns true if the QSqlRelation object is valid; otherwise returns false.
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
Returns the name of the table to which a foreign key refers.
*/

    @QtBlockedSlot
    public final java.lang.String tableName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tableName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_tableName(long __this__nativeId);

/**
@exclude
*/

    public static native QSqlRelation fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSqlRelation(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSqlRelation array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QSqlRelation clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSqlRelation __qt_clone(long __this_nativeId);
}
