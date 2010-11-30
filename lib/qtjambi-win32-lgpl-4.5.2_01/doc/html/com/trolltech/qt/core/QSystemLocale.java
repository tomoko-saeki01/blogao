package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QSystemLocale class can be used to finetune the system locale of the user. <b>Warning:</b> This class is only useful in very rare cases. Usually {@link com.trolltech.qt.core.QLocale QLocale} offers all the functionality required for application development. <p>QSystemLocale allows to override the values provided by the system locale ({@link com.trolltech.qt.core.QLocale#system() QLocale::system()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale QLocale}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSystemLocale extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
Specifies the type of information queried by query(). For each value the type of information to return from the query() method is listed.
*/

    public enum QueryType implements com.trolltech.qt.QtEnumerator {
/**
 a uint specifying the language.
*/

        LanguageId(0),
/**
 a uint specifying the country.
*/

        CountryId(1),
/**
 a QString specifying the decimal point.
*/

        DecimalPoint(2),
/**
 a QString specifying the group separator.
*/

        GroupSeparator(3),
/**
 a QString specifying the zero digit.
*/

        ZeroDigit(4),
/**
 a QString specifying the minus sign.
*/

        NegativeSign(5),
/**
 a QString specifying the long date format
*/

        DateFormatLong(6),
/**
 a QString specifying the short date format
*/

        DateFormatShort(7),
/**
 a QString specifying the long time format
*/

        TimeFormatLong(8),
/**
 a QString specifying the short time format
*/

        TimeFormatShort(9),
/**
 a QString specifying the name of a weekday. the in variant contains an integer between 1 and 7 (Monday - Friday)
*/

        DayNameLong(10),
/**
 a QString specifying the short name of a weekday. the in variant contains an integer between 1 and 7 (Monday - Friday)
*/

        DayNameShort(11),
/**
 a QString specifying the name of a month. the in variant contains an integer between 1 and 12
*/

        MonthNameLong(12),
/**
 a QString specifying the short name of a month. the in variant contains an integer between 1 and 12
*/

        MonthNameShort(13),
/**
 converts the {@link com.trolltech.qt.core.QDate QDate} stored in the in variant to a QString using the long date format
*/

        DateToStringLong(14),
/**
 converts the {@link com.trolltech.qt.core.QDate QDate} stored in the in variant to a QString using the short date format
*/

        DateToStringShort(15),
/**
 converts the {@link com.trolltech.qt.core.QTime QTime} stored in the in variant to a QString using the long time format
*/

        TimeToStringLong(16),
/**
 converts the {@link com.trolltech.qt.core.QTime QTime} stored in the in variant to a QString using the short time format
*/

        TimeToStringShort(17),
/**
 a QString specifying the long date time format
*/

        DateTimeFormatLong(18),
/**
 a QString specifying the short date time format
*/

        DateTimeFormatShort(19),
/**
 converts the {@link com.trolltech.qt.core.QDateTime QDateTime} in the in variant to a QString using the long datetime format
*/

        DateTimeToStringLong(20),
/**
 converts the {@link com.trolltech.qt.core.QDateTime QDateTime} in the in variant to a QString using the short datetime format
*/

        DateTimeToStringShort(21),
/**
 a {@link com.trolltech.qt.core.QLocale.MeasurementSystem QLocale::MeasurementSystem } enum specifying the measurement system
*/

        MeasurementSystem(22),
/**
 a QString specifying the plus sign.
*/

        PositiveSign(23),
/**
 a string that represents the system AM designator associated with a 12-hour clock.
*/

        AMText(24),
/**
 a string that represents the system PM designator associated with a 12-hour clock.
*/

        PMText(25);

        QueryType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSystemLocale$QueryType constant with the specified <tt>int</tt>.</brief>
*/

        public static QueryType resolve(int value) {
            return (QueryType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return LanguageId;
            case 1: return CountryId;
            case 2: return DecimalPoint;
            case 3: return GroupSeparator;
            case 4: return ZeroDigit;
            case 5: return NegativeSign;
            case 6: return DateFormatLong;
            case 7: return DateFormatShort;
            case 8: return TimeFormatLong;
            case 9: return TimeFormatShort;
            case 10: return DayNameLong;
            case 11: return DayNameShort;
            case 12: return MonthNameLong;
            case 13: return MonthNameShort;
            case 14: return DateToStringLong;
            case 15: return DateToStringShort;
            case 16: return TimeToStringLong;
            case 17: return TimeToStringShort;
            case 18: return DateTimeFormatLong;
            case 19: return DateTimeFormatShort;
            case 20: return DateTimeToStringLong;
            case 21: return DateTimeToStringShort;
            case 22: return MeasurementSystem;
            case 23: return PositiveSign;
            case 24: return AMText;
            case 25: return PMText;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QSystemLocale object. The constructor will automatically install this object as the system locale and remove any earlier installed system locales.
*/

    public QSystemLocale(){
        super((QPrivateConstructor)null);
        __qt_QSystemLocale();
    }

    native void __qt_QSystemLocale();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QLocale fallbackLocale()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fallbackLocale(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QLocale __qt_fallbackLocale(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object query(com.trolltech.qt.core.QSystemLocale.QueryType type, java.lang.Object in)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_query_QueryType_Object(nativeId(), type.value(), in);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_query_QueryType_Object(long __this__nativeId, int type, java.lang.Object in);

/**
@exclude
*/

    public static native QSystemLocale fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSystemLocale(QPrivateConstructor p) { super(p); } 
}
