package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSqlResult class provides an abstract interface for accessing data from specific SQL databases. Normally, you would use {@link com.trolltech.qt.sql.QSqlQuery QSqlQuery} instead of QSqlResult, since {@link com.trolltech.qt.sql.QSqlQuery QSqlQuery} provides a generic wrapper for database-specific implementations of QSqlResult. <p>If you are implementing your own SQL driver (by subclassing {@link com.trolltech.qt.sql.QSqlDriver QSqlDriver}), you will need to provide your own QSqlResult subclass that implements all the pure virtual functions and other virtual functions that you need. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver QSqlDriver}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QSqlResult extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.sql.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.sql.QSqlResult {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        protected java.lang.Object data(int i) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_data_int(nativeId(), i);
        }

        @Override
        @QtBlockedSlot
        protected boolean fetch(int i) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_fetch_int(nativeId(), i);
        }

        @Override
        @QtBlockedSlot
        protected boolean fetchFirst() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_fetchFirst(nativeId());
        }

        @Override
        @QtBlockedSlot
        protected boolean fetchLast() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_fetchLast(nativeId());
        }

        @Override
        @QtBlockedSlot
        protected boolean isNull(int i) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_isNull_int(nativeId(), i);
        }

        @Override
        @QtBlockedSlot
        protected int numRowsAffected() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_numRowsAffected(nativeId());
        }

        @Override
        @QtBlockedSlot
        protected boolean reset(java.lang.String sqlquery) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_reset_String(nativeId(), sqlquery);
        }

        @Override
        @QtBlockedSlot
        protected int size() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_size(nativeId());
        }
    }
/**
This enum type specifies the different syntaxes for specifying placeholders in prepared queries. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#bindingSyntax() bindingSyntax()}. <br></DD></DT>
*/


    public enum BindingSyntax implements com.trolltech.qt.QtEnumerator {
/**
 Use the ODBC-style positional syntax, with "?" as placeholders.
*/

        PositionalBinding(0),
/**
 Use the Oracle-style syntax with named placeholders (e.g., ":id")
*/

        NamedBinding(1);

        BindingSyntax(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSqlResult$BindingSyntax constant with the specified <tt>int</tt>.</brief>
*/

        public static BindingSyntax resolve(int value) {
            return (BindingSyntax) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return PositionalBinding;
            case 1: return NamedBinding;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum VirtualHookOperation implements com.trolltech.qt.QtEnumerator {
        BatchOperation(0),
        DetachFromResultSet(1),
        SetNumericalPrecision(2),
        NextResult(3);

        VirtualHookOperation(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSqlResult$VirtualHookOperation constant with the specified <tt>int</tt>.</brief>
*/

        public static VirtualHookOperation resolve(int value) {
            return (VirtualHookOperation) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return BatchOperation;
            case 1: return DetachFromResultSet;
            case 2: return SetNumericalPrecision;
            case 3: return NextResult;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Creates a QSqlResult using database driver <tt>db</tt>. The object is initialized to an inactive state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#isActive() isActive()}, and {@link com.trolltech.qt.sql.QSqlResult#driver() driver()}. <br></DD></DT>
*/

    protected QSqlResult(com.trolltech.qt.sql.QSqlDriver db){
        super((QPrivateConstructor)null);
        __qt_QSqlResult_QSqlDriver(db == null ? 0 : db.nativeId());
    }

    native void __qt_QSqlResult_QSqlDriver(long db);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    protected final void addBindValue(java.lang.Object val, com.trolltech.qt.sql.QSql.ParamTypeFlag ... type) {
        this.addBindValue(val, new com.trolltech.qt.sql.QSql.ParamType(type));
    }
/**
Binds the value <tt>val</tt> of parameter type <tt>paramType</tt> to the next available position in the current record (row). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#bindValue(java.lang.String, java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) bindValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void addBindValue(java.lang.Object val, com.trolltech.qt.sql.QSql.ParamType type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addBindValue_Object_ParamType(nativeId(), val, type.value());
    }
    @QtBlockedSlot
    native void __qt_addBindValue_Object_ParamType(long __this__nativeId, java.lang.Object val, int type);

/**
Returns the current (zero-based) row position of the result. May return the special values {@link com.trolltech.qt.sql.QSql.Location QSql::BeforeFirstRow } or {@link com.trolltech.qt.sql.QSql.Location QSql::AfterLastRow }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#setAt(int) setAt()}, and {@link com.trolltech.qt.sql.QSqlResult#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final int at()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_at(nativeId());
    }
    @QtBlockedSlot
    native int __qt_at(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Returns the parameter type for the value bound with the given <tt>placeholder</tt> name.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.sql.QSql.ParamType bindValueType(java.lang.String placeholder)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.sql.QSql.ParamType(__qt_bindValueType_String(nativeId(), placeholder));
    }
    @QtBlockedSlot
    native int __qt_bindValueType_String(long __this__nativeId, java.lang.String placeholder);

/**
Returns the parameter type for the value bound at position <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#boundValue(java.lang.String) boundValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.sql.QSql.ParamType bindValueType(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.sql.QSql.ParamType(__qt_bindValueType_int(nativeId(), pos));
    }
    @QtBlockedSlot
    native int __qt_bindValueType_int(long __this__nativeId, int pos);

/**
Returns the binding syntax used by prepared queries.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.sql.QSqlResult.BindingSyntax bindingSyntax()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.sql.QSqlResult.BindingSyntax.resolve(__qt_bindingSyntax(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_bindingSyntax(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Returns the value bound by the given <tt>placeholder</tt> name in the current record (row). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#bindValueType(java.lang.String) bindValueType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final java.lang.Object boundValue(java.lang.String placeholder)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundValue_String(nativeId(), placeholder);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_boundValue_String(long __this__nativeId, java.lang.String placeholder);

/**
Returns the value bound at position <tt>index</tt> in the current record (row). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#bindValue(java.lang.String, java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) bindValue()}, and {@link com.trolltech.qt.sql.QSqlResult#boundValues() boundValues()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final java.lang.Object boundValue(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundValue_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_boundValue_int(long __this__nativeId, int pos);

/**
Returns the number of bound values in the result. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#boundValues() boundValues()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final int boundValueCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundValueCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_boundValueCount(long __this__nativeId);

/**
Returns the name of the bound value at position <tt>index</tt> in the current record (row). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#boundValue(java.lang.String) boundValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final java.lang.String boundValueName(int pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundValueName_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native java.lang.String __qt_boundValueName_int(long __this__nativeId, int pos);

/**
Returns a vector of the result's bound values for the current record (row). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#boundValueCount() boundValueCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final java.util.List<java.lang.Object> boundValues()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundValues(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.Object> __qt_boundValues(long __this__nativeId);

/**
Clears the entire result set and releases any associated resources.
*/

    @QtBlockedSlot
    protected final void clear()    {
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
    protected final void detachFromResultSet()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_detachFromResultSet(nativeId());
    }
    @QtBlockedSlot
    native void __qt_detachFromResultSet(long __this__nativeId);

/**
Returns the driver associated with the result. This is the object that was passed to the constructor.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.sql.QSqlDriver driver()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_driver(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlDriver __qt_driver(long __this__nativeId);


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final boolean execBatch() {
        return execBatch((boolean)false);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final boolean execBatch(boolean arrayBind)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_execBatch_boolean(nativeId(), arrayBind);
    }
    @QtBlockedSlot
    native boolean __qt_execBatch_boolean(long __this__nativeId, boolean arrayBind);

/**
Returns the query that was actually executed. This may differ from the query that was passed, for example if bound values were used with a prepared query and the underlying database doesn't support prepared queries. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#exec() exec()}, and {@link com.trolltech.qt.sql.QSqlResult#setQuery(java.lang.String) setQuery()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final java.lang.String executedQuery()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_executedQuery(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_executedQuery(long __this__nativeId);

/**
Returns true if at least one of the query's bound values is a <tt>QSql.:Out</tt> or a {@link com.trolltech.qt.sql.QSql.ParamTypeFlag QSql::InOut }; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#bindValueType(java.lang.String) bindValueType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final boolean hasOutValues()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasOutValues(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasOutValues(long __this__nativeId);

/**
Returns true if the result has records to be retrieved; otherwise returns false.
*/

    @QtBlockedSlot
    protected final boolean isActive()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isActive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isActive(long __this__nativeId);

/**
Returns true if you can only scroll forward through the result set; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#setForwardOnly(boolean) setForwardOnly()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final boolean isForwardOnly()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isForwardOnly(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isForwardOnly(long __this__nativeId);

/**
Returns true if the current result is from a <tt>SELECT</tt> statement; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#setSelect(boolean) setSelect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final boolean isSelect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSelect(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSelect(long __this__nativeId);

/**
Returns true if the result is positioned on a valid record (that is, the result is not positioned before the first or after the last record); otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#at() at()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns the last error associated with the result. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#setLastError(com.trolltech.qt.sql.QSqlError) setLastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.sql.QSqlError lastError()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastError(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlError __qt_lastError(long __this__nativeId);

/**
Returns the current SQL query text, or an empty string if there isn't one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#setQuery(java.lang.String) setQuery()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final java.lang.String lastQuery()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastQuery(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_lastQuery(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final boolean nextResult()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nextResult(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_nextResult(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setNumericalPrecisionPolicy(com.trolltech.qt.sql.QSql.NumericalPrecisionPolicy policy)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNumericalPrecisionPolicy_NumericalPrecisionPolicy(nativeId(), policy.value());
    }
    @QtBlockedSlot
    native void __qt_setNumericalPrecisionPolicy_NumericalPrecisionPolicy(long __this__nativeId, int policy);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    protected final void bindValue(java.lang.String placeholder, java.lang.Object val, com.trolltech.qt.sql.QSql.ParamTypeFlag ... type) {
        this.bindValue(placeholder, val, new com.trolltech.qt.sql.QSql.ParamType(type));
    }
/**
This is an overloaded member function, provided for convenience. <p>Binds the value <tt>val</tt> of parameter type <tt>paramType</tt> to the <tt>placeholder</tt> name in the current record (row). <p>Note that binding an undefined placeholder will result in undefined behavior.
*/

    @QtBlockedSlot
    protected void bindValue(java.lang.String placeholder, java.lang.Object val, com.trolltech.qt.sql.QSql.ParamType type)    {
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
    protected final void bindValue(int pos, java.lang.Object val, com.trolltech.qt.sql.QSql.ParamTypeFlag ... type) {
        this.bindValue(pos, val, new com.trolltech.qt.sql.QSql.ParamType(type));
    }
/**
Binds the value <tt>val</tt> of parameter type <tt>paramType</tt> to position <tt>index</tt> in the current record (row). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#addBindValue(java.lang.Object, com.trolltech.qt.sql.QSql.ParamTypeFlag[]) addBindValue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void bindValue(int pos, java.lang.Object val, com.trolltech.qt.sql.QSql.ParamType type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_bindValue_int_Object_ParamType(nativeId(), pos, val, type.value());
    }
    @QtBlockedSlot
    native void __qt_bindValue_int_Object_ParamType(long __this__nativeId, int pos, java.lang.Object val, int type);

/**
Returns the data for field <tt>index</tt> in the current row as a {@link com.trolltech.qt.QVariant QVariant}. This function is only called if the result is in an active state and is positioned on a valid record and <tt>index</tt> is non-negative. Derived classes must reimplement this function and return the value of field <tt>index</tt>, or QVariant() if it cannot be determined.
*/

    @QtBlockedSlot
    protected abstract java.lang.Object data(int i);
    @QtBlockedSlot
    native java.lang.Object __qt_data_int(long __this__nativeId, int i);

/**
Executes the query, returning true if successful; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#prepare(java.lang.String) prepare()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean exec()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exec(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_exec(long __this__nativeId);

/**
Positions the result to an arbitrary (zero-based) row <tt>index</tt>. <p>This function is only called if the result is in an active state. Derived classes must reimplement this function and position the result to the row <tt>index</tt>, and call {@link com.trolltech.qt.sql.QSqlResult#setAt(int) setAt()} with an appropriate value. Return true to indicate success, or false to signify failure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#isActive() isActive()}, {@link com.trolltech.qt.sql.QSqlResult#fetchFirst() fetchFirst()}, {@link com.trolltech.qt.sql.QSqlResult#fetchLast() fetchLast()}, {@link com.trolltech.qt.sql.QSqlResult#fetchNext() fetchNext()}, and {@link com.trolltech.qt.sql.QSqlResult#fetchPrevious() fetchPrevious()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract boolean fetch(int i);
    @QtBlockedSlot
    native boolean __qt_fetch_int(long __this__nativeId, int i);

/**
Positions the result to the first record (row 0) in the result. <p>This function is only called if the result is in an active state. Derived classes must reimplement this function and position the result to the first record, and call {@link com.trolltech.qt.sql.QSqlResult#setAt(int) setAt()} with an appropriate value. Return true to indicate success, or false to signify failure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#fetch(int) fetch()}, and {@link com.trolltech.qt.sql.QSqlResult#fetchLast() fetchLast()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract boolean fetchFirst();
    @QtBlockedSlot
    native boolean __qt_fetchFirst(long __this__nativeId);

/**
Positions the result to the last record (last row) in the result. <p>This function is only called if the result is in an active state. Derived classes must reimplement this function and position the result to the last record, and call {@link com.trolltech.qt.sql.QSqlResult#setAt(int) setAt()} with an appropriate value. Return true to indicate success, or false to signify failure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#fetch(int) fetch()}, and {@link com.trolltech.qt.sql.QSqlResult#fetchFirst() fetchFirst()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract boolean fetchLast();
    @QtBlockedSlot
    native boolean __qt_fetchLast(long __this__nativeId);

/**
Positions the result to the next available record (row) in the result. <p>This function is only called if the result is in an active state. The default implementation calls {@link com.trolltech.qt.sql.QSqlResult#fetch(int) fetch()} with the next index. Derived classes can reimplement this function and position the result to the next record in some other way, and call {@link com.trolltech.qt.sql.QSqlResult#setAt(int) setAt()} with an appropriate value. Return true to indicate success, or false to signify failure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#fetch(int) fetch()}, and {@link com.trolltech.qt.sql.QSqlResult#fetchPrevious() fetchPrevious()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean fetchNext()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fetchNext(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fetchNext(long __this__nativeId);

/**
Positions the result to the previous record (row) in the result. <p>This function is only called if the result is in an active state. The default implementation calls {@link com.trolltech.qt.sql.QSqlResult#fetch(int) fetch()} with the previous index. Derived classes can reimplement this function and position the result to the next record in some other way, and call {@link com.trolltech.qt.sql.QSqlResult#setAt(int) setAt()} with an appropriate value. Return true to indicate success, or false to signify failure.
*/

    @QtBlockedSlot
    protected boolean fetchPrevious()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fetchPrevious(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_fetchPrevious(long __this__nativeId);

/**
Returns the low-level database handle for this result set wrapped in a {@link com.trolltech.qt.QVariant QVariant} or an invalid {@link com.trolltech.qt.QVariant QVariant} if there is no handle. <p><b>Warning:</b> Use this with uttermost care and only if you know what you're doing. <p><b>Warning:</b> The handle returned here can become a stale pointer if the result is modified (for example, if you clear it). <p><b>Warning:</b> The handle can be NULL if the result was not executed yet. <p>The handle returned here is database-dependent, you should query the type name of the variant before accessing it. <p>This example retrieves the handle for a sqlite result: <pre class="snippet">
    QSqlQuery query = ...;
    QVariant v = query.result().handle();
    if (v.isValid() && qstrcmp(v.typeName(), "sqlite3_stmt*")) {
        // v.data() returns a pointer to the handle
        sqlite3_stmt andle = tatic_cast&lt;sqlite3_stmt **&gt;(v.data());
        if (handle != 0) { // check that it is not NULL
            ...
        }
    }
</pre> This snippet returns the handle for PostgreSQL or MySQL: <pre class="snippet">
    if (v.typeName() == "PGresult*") {
        PGresult andle = tatic_cast&lt;PGresult **&gt;(v.data());
        if (handle != 0) ...
    }

    if (v.typeName() == "MYSQL_STMT*") {
        MYSQL_STMT andle = tatic_cast&lt;MYSQL_STMT **&gt;(v.data());
        if (handle != 0) ...
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#handle() QSqlDriver::handle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.Object handle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handle(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_handle(long __this__nativeId);

/**
Returns true if the field at position <tt>index</tt> in the current row is null; otherwise returns false.
*/

    @QtBlockedSlot
    protected abstract boolean isNull(int i);
    @QtBlockedSlot
    native boolean __qt_isNull_int(long __this__nativeId, int i);

/**
Returns the object ID of the most recent inserted row if the database supports it. An invalid {@link com.trolltech.qt.QVariant QVariant} will be returned if the query did not insert any value or if the database does not report the id back. If more than one row was touched by the insert, the behavior is undefined. <p>Note that for Oracle databases the row's ROWID will be returned, while for MySQL databases the row's auto-increment field will be returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlDriver#hasFeature(com.trolltech.qt.sql.QSqlDriver.DriverFeature) QSqlDriver::hasFeature()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected java.lang.Object lastInsertId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastInsertId(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_lastInsertId(long __this__nativeId);

/**
Returns the number of rows affected by the last query executed, or -1 if it cannot be determined or if the query is a <tt>SELECT</tt> statement. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#size() size()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract int numRowsAffected();
    @QtBlockedSlot
    native int __qt_numRowsAffected(long __this__nativeId);

/**
Prepares the given <tt>query</tt> for execution; the query will normally use placeholders so that it can be executed repeatedly. Returns true if the query is prepared successfully; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#exec() exec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean prepare(java.lang.String query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prepare_String(nativeId(), query);
    }
    @QtBlockedSlot
    native boolean __qt_prepare_String(long __this__nativeId, java.lang.String query);

/**
Returns the current record if the query is active; otherwise returns an empty {@link com.trolltech.qt.sql.QSqlRecord QSqlRecord}. <p>The default implementation always returns an empty {@link com.trolltech.qt.sql.QSqlRecord QSqlRecord}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#isActive() isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected com.trolltech.qt.sql.QSqlRecord record()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_record(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlRecord __qt_record(long __this__nativeId);

/**
Sets the result to use the SQL statement <tt>query</tt> for subsequent data retrieval. <p>Derived classes must reimplement this function and apply the <tt>query</tt> to the database. This function is only called after the result is set to an inactive state and is positioned before the first record of the new result. Derived classes should return true if the query was successful and ready to be used, or false otherwise. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#setQuery(java.lang.String) setQuery()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract boolean reset(java.lang.String sqlquery);
    @QtBlockedSlot
    native boolean __qt_reset_String(long __this__nativeId, java.lang.String sqlquery);

/**
Prepares the given <tt>query</tt>, using the underlying database functionality where possible. Returns true if the query is prepared successfully; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#prepare(java.lang.String) prepare()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean savePrepare(java.lang.String sqlquery)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_savePrepare_String(nativeId(), sqlquery);
    }
    @QtBlockedSlot
    native boolean __qt_savePrepare_String(long __this__nativeId, java.lang.String sqlquery);

/**
This function is provided for derived classes to set the internal active state to <tt>active</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#isActive() isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void setActive(boolean a)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setActive_boolean(nativeId(), a);
    }
    @QtBlockedSlot
    native void __qt_setActive_boolean(long __this__nativeId, boolean a);

/**
This function is provided for derived classes to set the internal (zero-based) row position to <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#at() at()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void setAt(int at)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAt_int(nativeId(), at);
    }
    @QtBlockedSlot
    native void __qt_setAt_int(long __this__nativeId, int at);

/**
Sets forward only mode to <tt>forward</tt>. If <tt>forward</tt> is true, only {@link com.trolltech.qt.sql.QSqlResult#fetchNext() fetchNext()} is allowed for navigating the results. Forward only mode needs much less memory since results do not have to be cached. By default, this feature is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#isForwardOnly() isForwardOnly()}, and {@link com.trolltech.qt.sql.QSqlResult#fetchNext() fetchNext()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void setForwardOnly(boolean forward)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setForwardOnly_boolean(nativeId(), forward);
    }
    @QtBlockedSlot
    native void __qt_setForwardOnly_boolean(long __this__nativeId, boolean forward);

/**
This function is provided for derived classes to set the last error to <tt>error</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#lastError() lastError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void setLastError(com.trolltech.qt.sql.QSqlError e)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLastError_QSqlError(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLastError_QSqlError(long __this__nativeId, long e);

/**
Sets the current query for the result to <tt>query</tt>. You must call {@link com.trolltech.qt.sql.QSqlResult#reset(java.lang.String) reset()} to execute the query on the database. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#reset(java.lang.String) reset()}, and {@link com.trolltech.qt.sql.QSqlResult#lastQuery() lastQuery()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void setQuery(java.lang.String query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQuery_String(nativeId(), query);
    }
    @QtBlockedSlot
    native void __qt_setQuery_String(long __this__nativeId, java.lang.String query);

/**
This function is provided for derived classes to indicate whether or not the current statement is a SQL <tt>SELECT</tt> statement. The <tt>select</tt> parameter should be true if the statement is a <tt>SELECT</tt> statement; otherwise it should be false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#isSelect() isSelect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void setSelect(boolean s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelect_boolean(nativeId(), s);
    }
    @QtBlockedSlot
    native void __qt_setSelect_boolean(long __this__nativeId, boolean s);

/**
Returns the size of the <tt>SELECT</tt> result, or -1 if it cannot be determined or if the query is not a <tt>SELECT</tt> statement. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlResult#numRowsAffected() numRowsAffected()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract int size();
    @QtBlockedSlot
    native int __qt_size(long __this__nativeId);

/**
@exclude
*/

    public static native QSqlResult fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSqlResult(QPrivateConstructor p) { super(p); } 
}
