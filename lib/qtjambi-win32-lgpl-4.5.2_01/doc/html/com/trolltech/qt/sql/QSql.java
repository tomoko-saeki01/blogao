package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSql namespace contains miscellaneous identifiers used throughout the Qt SQL library. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtsql.html">QtSql Module</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public interface QSql
{
/**
This enum type describes at which precision levels numercial values are read from a database. <p>Some databases support numerical values with a precision that is not storable in a C++ basic data type. The default behavior is to bind these values as a QString. This enum can be used to override this behavior. Note: The actual behaviour if an overflow occurs is driver specific. The Oracle database just returns an error in this case.
*/

    public enum NumericalPrecisionPolicy implements com.trolltech.qt.QtEnumerator {
/**
 Force 32bit integer values. In case of floating point numbers, the fractional part is silently discarded.
*/

        LowPrecisionInt32(1),
/**
 Force 64bit integer values. In case of floating point numbers, the fractional part is silently discarded.
*/

        LowPrecisionInt64(2),
/**
 Force <tt>double</tt> values.
*/

        LowPrecisionDouble(4),
/**
 The default behavior - try to preserve maximum precision.
*/

        HighPrecision(0);

        NumericalPrecisionPolicy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSql$NumericalPrecisionPolicy constant with the specified <tt>int</tt>.</brief>
*/

        public static NumericalPrecisionPolicy resolve(int value) {
            return (NumericalPrecisionPolicy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return LowPrecisionInt32;
            case 2: return LowPrecisionInt64;
            case 4: return LowPrecisionDouble;
            case 0: return HighPrecision;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type describes special SQL navigation locations. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.sql.QSqlQuery#at() QSqlQuery::at()}. <br></DD></DT>
*/

    public enum Location implements com.trolltech.qt.QtEnumerator {
/**
 Before the first record.
*/

        BeforeFirstRow(-1),
/**
 After the last record.
*/

        AfterLastRow(-2);

        Location(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSql$Location constant with the specified <tt>int</tt>.</brief>
*/

        public static Location resolve(int value) {
            return (Location) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case -1: return BeforeFirstRow;
            case -2: return AfterLastRow;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used to specify the type of a bind parameter.
*/

    public enum ParamTypeFlag implements com.trolltech.qt.QtEnumerator {
/**
 The bind parameter is used to put data into the database.
*/

        In(1),
/**
 The bind parameter is used to receive data from the database.
*/

        Out(2),
/**
 The bind parameter is used to put data into the database; it will be overwritten with output data on executing a query.
*/

        InOut(3),
/**
 This must be OR'd with one of the other flags if you want to indicate that the data being transferred is raw binary data.
*/

        Binary(4);

        ParamTypeFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.sql.QSql$ParamType with the specified <tt>com.trolltech.qt.sql.QSql$ParamTypeFlag[]</tt> QSql$ParamTypeFlag values set.</brief>
*/

        public static ParamType createQFlags(ParamTypeFlag ... values) {
            return new ParamType(values);
        }
/**
<brief>Returns the QSql$ParamTypeFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static ParamTypeFlag resolve(int value) {
            return (ParamTypeFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return In;
            case 2: return Out;
            case 3: return InOut;
            case 4: return Binary;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class ParamType extends com.trolltech.qt.QFlags<ParamTypeFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QSql-ParamType with the specified <tt>com.trolltech.qt.sql.QSql.ParamTypeFlag[]</tt>. flags set.</brief>
*/

        public ParamType(ParamTypeFlag ... args) { super(args); }
        public ParamType(int value) { setValue(value); }
    }
/**
This enum type describes types of SQL tables.
*/


    public enum TableType implements com.trolltech.qt.QtEnumerator {
/**
 All the tables visible to the user.
*/

        Tables(1),
/**
 Internal tables used by the database.
*/

        SystemTables(2),
/**
 All the views visible to the user.
*/

        Views(4),
/**
 All of the above.
*/

        AllTables(255);

        TableType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSql$TableType constant with the specified <tt>int</tt>.</brief>
*/

        public static TableType resolve(int value) {
            return (TableType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Tables;
            case 2: return SystemTables;
            case 4: return Views;
            case 255: return AllTables;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
}
