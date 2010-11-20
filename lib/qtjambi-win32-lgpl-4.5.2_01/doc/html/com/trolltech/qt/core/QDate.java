package com.trolltech.qt.core;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QDate class provides date functions. A QDate object contains a calendar date, i.e. year, month, and day numbers, in the Gregorian calendar. (see Use of Gregorian and Julian Calendars for dates prior to 15 October 1582). It can read the current date from the system clock. It provides functions for comparing dates, and for manipulating dates. For example, it is possible to add and subtract days, months, and years to dates. <p>A QDate object is typically created either by giving the year, month, and day numbers explicitly. Note that QDate interprets two digit years as is, i.e., years 0 - 99. A QDate can also be constructed with the static function {@link com.trolltech.qt.core.QDate#currentDate() currentDate()}, which creates a QDate object containing the system clock's date. An explicit date can also be set using {@link com.trolltech.qt.core.QDate#setDate(int, int, int) setDate()}. The {@link com.trolltech.qt.core.QDate#fromString(java.lang.String) fromString()} function returns a QDate given a string and a date format which is used to interpret the date within the string. <p>The {@link com.trolltech.qt.core.QDate#year() year()}, {@link com.trolltech.qt.core.QDate#month() month()}, and {@link com.trolltech.qt.core.QDate#day() day()} functions provide access to the year, month, and day numbers. Also, {@link com.trolltech.qt.core.QDate#dayOfWeek() dayOfWeek()} and {@link com.trolltech.qt.core.QDate#dayOfYear() dayOfYear()} functions are provided. The same information is provided in textual format by the {@link com.trolltech.qt.core.QDate#toString() toString()}, {@link com.trolltech.qt.core.QDate#shortDayName(int) shortDayName()}, {@link com.trolltech.qt.core.QDate#longDayName(int) longDayName()}, {@link com.trolltech.qt.core.QDate#shortMonthName(int) shortMonthName()}, and {@link com.trolltech.qt.core.QDate#longMonthName(int) longMonthName()} functions. <p>QDate provides a full set of operators to compare two QDate objects where smaller means earlier, and larger means later. <p>You can increment (or decrement) a date by a given number of days using {@link com.trolltech.qt.core.QDate#addDays(int) addDays()}. Similarly you can use {@link com.trolltech.qt.core.QDate#addMonths(int) addMonths()} and {@link com.trolltech.qt.core.QDate#addYears(int) addYears()}. The {@link com.trolltech.qt.core.QDate#daysTo(com.trolltech.qt.core.QDate) daysTo()} function returns the number of days between two dates. <p>The {@link com.trolltech.qt.core.QDate#daysInMonth() daysInMonth()} and {@link com.trolltech.qt.core.QDate#daysInYear() daysInYear()} functions return how many days there are in this date's month and year, respectively. The {@link com.trolltech.qt.core.QDate#isLeapYear(int) isLeapYear()} function indicates whether a date is in a leap year.<a name="use-of-gregorian-and-julian-calendars"><a name="qdate-g-and-j"><a name="use-of-gregorian-and-julian-calendars"><h3>Use of Gregorian and Julian Calendars</h3> QDate uses the Gregorian calendar in all locales, beginning on the date 15 October 1582. For dates up to and including 4 October 1582, the Julian calendar is used. This means there is a 10-day gap in the internal calendar between the 4th and the 15th of October 1582. When you use {@link com.trolltech.qt.core.QDateTime QDateTime} for dates in that epoch, the day after 4 October 1582 is 15 October 1582, and the dates in the gap are invalid. <p>The Julian to Gregorian changeover date used here is the date when the Gregorian calendar was first introduced, by Pope Gregory XIII. That change was not universally accepted and some localities only executed it at a later date (if at all). {@link com.trolltech.qt.core.QDateTime QDateTime} doesn't take any of these historical facts into account. If an application must support a locale-specific dating system, it must do so on its own, remembering to convert the dates using the Julian day.<a name="no-year-0"><h3>No Year 0</h3> There is no year 0. Dates in that year are considered invalid. The year -1 is the year "1 before Christ" or "1 before current era." The day before 0001-01-01 is December 31st, 1 BCE.<a name="range-of-valid-dates"><h3>Range of Valid Dates</h3> The range of valid dates is from January 2nd, 4713 BCE, to sometime in the year 11 million CE. The Julian Day returned by {@link com.trolltech.qt.core.QDate#toJulianDay() QDate::toJulianDay()} is a number in the contiguous range from 1 to overflow, even across {@link com.trolltech.qt.core.QDateTime QDateTime}'s "date holes". It is suitable for use in applications that must convert a {@link com.trolltech.qt.core.QDateTime QDateTime} to a date in another calendar system, e.g., Hebrew, Islamic or Chinese. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime QTime}, {@link com.trolltech.qt.core.QDateTime QDateTime}, {@link com.trolltech.qt.gui.QDateEdit QDateEdit}, {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit}, and {@link com.trolltech.qt.gui.QCalendarWidget QCalendarWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDate extends com.trolltech.qt.QtJambiObject
    implements java.lang.Comparable<Object>,
            java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the types of the string representation used for the month name.
*/

    public enum MonthNameType implements com.trolltech.qt.QtEnumerator {
/**
 This type of name can be used for date-to-string formatting.
*/

        DateFormat(0),
/**
 This type is used when you need to enumerate months or weekdays. Usually standalone names are represented in singular forms with capitalized first letter.
*/

        StandaloneFormat(1);

        MonthNameType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QDate$MonthNameType constant with the specified <tt>int</tt>.</brief>
*/

        public static MonthNameType resolve(int value) {
            return (MonthNameType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return DateFormat;
            case 1: return StandaloneFormat;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a null date. Null dates are invalid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#isNull() isNull()}, and {@link com.trolltech.qt.core.QDate#isValid() isValid()}. <br></DD></DT>
*/

    public QDate(){
        super((QPrivateConstructor)null);
        __qt_QDate();
    }

    native void __qt_QDate();

/**
Constructs a date with year <tt>y</tt>, month <tt>m</tt> and day <tt>d</tt>. <p>If the specified date is invalid, the date is not set and {@link com.trolltech.qt.core.QDate#isValid() isValid()} returns false. A date before 2 January 4713 B.C. is considered invalid. <p><b>Warning:</b> Years 0 to 99 are interpreted as is, i.e., years 0-99. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#isValid() isValid()}. <br></DD></DT>
*/

    public QDate(int y, int m, int d){
        super((QPrivateConstructor)null);
        __qt_QDate_int_int_int(y, m, d);
    }

    native void __qt_QDate_int_int_int(int y, int m, int d);

/**
Returns a QDate object containing a date <tt>ndays</tt> later than the date of this object (or earlier if <tt>ndays</tt> is negative). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#addMonths(int) addMonths()}, {@link com.trolltech.qt.core.QDate#addYears(int) addYears()}, and {@link com.trolltech.qt.core.QDate#daysTo(com.trolltech.qt.core.QDate) daysTo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate addDays(int days)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addDays_int(nativeId(), days);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDate __qt_addDays_int(long __this__nativeId, int days);

/**
Returns a QDate object containing a date <tt>nmonths</tt> later than the date of this object (or earlier if <tt>nmonths</tt> is negative). <p><b>Note:</b> If the ending day/month combination does not exist in the resulting month/year, this function will return a date that is the latest valid date. <p><b>Warning:</b>QDate has a date hole around the days introducing the Gregorian calendar (the days 5 to 14 October 1582, inclusive, do not exist). If the calculation ends in one of those days, QDate will return either October 4 or October 15. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#addDays(int) addDays()}, and {@link com.trolltech.qt.core.QDate#addYears(int) addYears()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate addMonths(int months)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addMonths_int(nativeId(), months);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDate __qt_addMonths_int(long __this__nativeId, int months);

/**
Returns a QDate object containing a date <tt>nyears</tt> later than the date of this object (or earlier if <tt>nyears</tt> is negative). <p><b>Note:</b> If the ending day/month combination does not exist in the resulting year (i.e., if the date was Feb 29 and the final year is not a leap year), this function will return a date that is the latest valid date (that is, Feb 28). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#addDays(int) addDays()}, and {@link com.trolltech.qt.core.QDate#addMonths(int) addMonths()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate addYears(int years)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addYears_int(nativeId(), years);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDate __qt_addYears_int(long __this__nativeId, int years);

/**
Returns the day of the month (1 to 31) of this date. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#year() year()}, {@link com.trolltech.qt.core.QDate#month() month()}, and {@link com.trolltech.qt.core.QDate#dayOfWeek() dayOfWeek()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int day()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_day(nativeId());
    }
    @QtBlockedSlot
    native int __qt_day(long __this__nativeId);

/**
Returns the weekday (1 to 7) for this date. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#day() day()}, {@link com.trolltech.qt.core.QDate#dayOfYear() dayOfYear()}, and {@link com.trolltech.qt.core.Qt.DayOfWeek Qt::DayOfWeek }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int dayOfWeek()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dayOfWeek(nativeId());
    }
    @QtBlockedSlot
    native int __qt_dayOfWeek(long __this__nativeId);

/**
Returns the day of the year (1 to 365 or 366 on leap years) for this date. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#day() day()}, and {@link com.trolltech.qt.core.QDate#dayOfWeek() dayOfWeek()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int dayOfYear()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dayOfYear(nativeId());
    }
    @QtBlockedSlot
    native int __qt_dayOfYear(long __this__nativeId);

/**
Returns the number of days in the month (28 to 31) for this date. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#day() day()}, and {@link com.trolltech.qt.core.QDate#daysInYear() daysInYear()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int daysInMonth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_daysInMonth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_daysInMonth(long __this__nativeId);

/**
Returns the number of days in the year (365 or 366) for this date. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#day() day()}, and {@link com.trolltech.qt.core.QDate#daysInMonth() daysInMonth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int daysInYear()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_daysInYear(nativeId());
    }
    @QtBlockedSlot
    native int __qt_daysInYear(long __this__nativeId);

/**
Returns the number of days from this date to <tt>d</tt> (which is negative if <tt>d</tt> is earlier than this date). <p>Example: <pre class="snippet">
        QDate d1 = new QDate(1995, 5, 17);  // May 17, 1995
        QDate d2 = new QDate(1995, 5, 20);  // May 20, 1995
        d1.daysTo(d2);          // returns 3
        d2.daysTo(d1);          // returns -3
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#addDays(int) addDays()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int daysTo(com.trolltech.qt.core.QDate arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_daysTo_QDate(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native int __qt_daysTo_QDate(long __this__nativeId, long arg__1);

/**
Returns true if the date is null; otherwise returns false. A null date is invalid. <p><b>Note:</b> The behavior of this function is identical to {@link com.trolltech.qt.core.QDate#isValid() isValid()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

/**
Returns true if this date is valid; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#isNull() isNull()}. <br></DD></DT>
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
Returns the number corresponding to the month of this date, using the following convention. <ul><li> 1 = "January"</li><li> 2 = "February"</li><li> 3 = "March"</li><li> 4 = "April"</li><li> 5 = "May"</li><li> 6 = "June"</li><li> 7 = "July"</li><li> 8 = "August"</li><li> 9 = "September"</li><li> 10 = "October"</li><li> 11 = "November"</li><li> 12 = "December"</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#year() year()}, and {@link com.trolltech.qt.core.QDate#day() day()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int month()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_month(nativeId());
    }
    @QtBlockedSlot
    native int __qt_month(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_less(com.trolltech.qt.core.QDate other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QDate(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QDate(long __this__nativeId, long other);

/**
<brief>Writes thisQDate
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.core.QDate other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QDate(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QDate(long __this__nativeId, long other);

/**
<brief>Reads a QDate
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long arg__1);

/**
Sets the date's <tt>year</tt>, <tt>month</tt>, and <tt>day</tt>. Returns true if the date is valid; otherwise returns false. <p>If the specified date is invalid, the QDate object is set to be invalid. Any date before 2 January 4713 B.C. is considered invalid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setDate(int year, int month, int day)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setDate_int_int_int(nativeId(), year, month, day);
    }
    @QtBlockedSlot
    native boolean __qt_setDate_int_int_int(long __this__nativeId, int year, int month, int day);

/**
Converts the date to a Julian day. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#fromJulianDay(int) fromJulianDay()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int toJulianDay()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toJulianDay(nativeId());
    }
    @QtBlockedSlot
    native int __qt_toJulianDay(long __this__nativeId);


/**
<brief>Returns a string representation of the <tt>this QDate</tt>. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString() {
        return toString(com.trolltech.qt.core.Qt.DateFormat.TextDate);
    }
/**
<brief>Returns a string representation of the <tt>com.trolltech.qt.core.Qt$DateFormat</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(com.trolltech.qt.core.Qt.DateFormat f)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_DateFormat(nativeId(), f.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_DateFormat(long __this__nativeId, int f);

/**
<brief>Returns a string representation of the <tt>java.lang.String</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(java.lang.String format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_String(nativeId(), format);
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_String(long __this__nativeId, java.lang.String format);

    @QtBlockedSlot
    private final int weekNumber(com.trolltech.qt.QNativePointer yearNum)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_weekNumber_nativepointer(nativeId(), yearNum);
    }
    @QtBlockedSlot
    native int __qt_weekNumber_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer yearNum);

/**
Returns the year of this date. Negative numbers indicate years before 1 A.D. = 1 C.E., such that year -44 is 44 B.C. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#month() month()}, and {@link com.trolltech.qt.core.QDate#day() day()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int year()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_year(nativeId());
    }
    @QtBlockedSlot
    native int __qt_year(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Returns the current date, as reported by the system clock. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#currentTime() QTime::currentTime()}, and {@link com.trolltech.qt.core.QDateTime#currentDateTime() QDateTime::currentDateTime()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QDate currentDate();

/**
Converts the Julian day <tt>jd</tt> to a QDate. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#toJulianDay() toJulianDay()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QDate fromJulianDay(int jd);


/**
Returns the QDate represented by the <tt>string</tt>, using the <tt>format</tt> given, or an invalid date if the string cannot be parsed. <p>Note for {@link com.trolltech.qt.core.Qt.DateFormat Qt::TextDate }: It is recommended that you use the English short month names (e.g. "Jan"). Although localized month names can also be used, they depend on the user's locale settings.
*/

    public static com.trolltech.qt.core.QDate fromString(java.lang.String s) {
        return fromString(s, com.trolltech.qt.core.Qt.DateFormat.TextDate);
    }
/**
Returns the QDate represented by the <tt>string</tt>, using the <tt>format</tt> given, or an invalid date if the string cannot be parsed. <p>Note for {@link com.trolltech.qt.core.Qt.DateFormat Qt::TextDate }: It is recommended that you use the English short month names (e.g. "Jan"). Although localized month names can also be used, they depend on the user's locale settings.
*/

    public static com.trolltech.qt.core.QDate fromString(java.lang.String s, com.trolltech.qt.core.Qt.DateFormat f)    {
        return __qt_fromString_String_DateFormat(s, f.value());
    }
    native static com.trolltech.qt.core.QDate __qt_fromString_String_DateFormat(java.lang.String s, int f);

/**
Returns the QDate represented by the <tt>string</tt>, using the <tt>format</tt> given, or an invalid date if the string cannot be parsed. <p>These expressions may be used for the format: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Expression</center></th><th><center> Output</center></th></tr></thead><tr valign="top" class="even"><td> d</td><td> The day as a number without a leading zero (1 to 31)</td></tr><tr valign="top" class="odd"><td> dd</td><td> The day as a number with a leading zero (01 to 31)</td></tr><tr valign="top" class="even"><td> ddd</td><td> The abbreviated localized day name (e.g. 'Mon' to 'Sun'). Uses {@link com.trolltech.qt.core.QDate#shortDayName(int) QDate::shortDayName()}.</td></tr><tr valign="top" class="odd"><td> dddd</td><td> The long localized day name (e.g. 'Monday' to 'Sunday'). Uses {@link com.trolltech.qt.core.QDate#longDayName(int) QDate::longDayName()}.</td></tr><tr valign="top" class="even"><td> M</td><td> The month as a number without a leading zero (1 to 12)</td></tr><tr valign="top" class="odd"><td> MM</td><td> The month as a number with a leading zero (01 to 12)</td></tr><tr valign="top" class="even"><td> MMM</td><td> The abbreviated localized month name (e.g. 'Jan' to 'Dec'). Uses {@link com.trolltech.qt.core.QDate#shortMonthName(int) QDate::shortMonthName()}.</td></tr><tr valign="top" class="odd"><td> MMMM</td><td> The long localized month name (e.g. 'January' to 'December'). Uses {@link com.trolltech.qt.core.QDate#longMonthName(int) QDate::longMonthName()}.</td></tr><tr valign="top" class="even"><td> yy</td><td> The year as two digit number (00 to 99)</td></tr><tr valign="top" class="odd"><td> yyyy</td><td> The year as four digit number. If the year is negative, a minus sign is prepended in addition.</td></tr></table> All other input characters will be treated as text. Any sequence of characters that are enclosed in single quotes will also be treated as text and will not be used as an expression. For example: <pre class="snippet">
        QDate date = QDate.fromString("1MM12car2003", "d'MM'MMcaryyyy");
        // date is 1 December 2003
</pre> If the format is not satisfied, an invalid QDate is returned. The expressions that don't expect leading zeroes (d, M) will be greedy. This means that they will use two digits even if this will put them outside the accepted range of values and leaves too few digits for other sections. For example, the following format string could have meant January 30 but the M will grab two digits, resulting in an invalid date: <pre class="snippet">
        QDate date = QDate.fromString("130", "Md"); // invalid
</pre> For any field that is not represented in the format the following defaults are used: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Field</center></th><th><center> Default value</center></th></tr></thead><tr valign="top" class="even"><td> Year</td><td> 1900</td></tr><tr valign="top" class="odd"><td> Month</td><td> 1</td></tr><tr valign="top" class="even"><td> Day</td><td> 1</td></tr></table> The following examples demonstrate the default values: <pre class="snippet">
        QDate.fromString("1.30", "M.d");           // January 30 1900
        QDate.fromString("20000110", "yyyyMMdd");  // January 10, 2000
        QDate.fromString("20000110", "yyyyMd");    // January 10, 2000
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#fromString(java.lang.String) QDateTime::fromString()}, {@link com.trolltech.qt.core.QTime#fromString(java.lang.String) QTime::fromString()}, {@link com.trolltech.qt.core.QDate#toString() QDate::toString()}, {@link com.trolltech.qt.core.QDateTime#toString() QDateTime::toString()}, and {@link com.trolltech.qt.core.QTime#toString() QTime::toString()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QDate fromString(java.lang.String s, java.lang.String format);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public native static int gregorianToJulian(int y, int m, int d);

/**
Returns true if the specified <tt>year</tt> is a leap year; otherwise returns false.
*/

    public native static boolean isLeapYear(int year);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if the specified date (<tt>year</tt>, <tt>month</tt>, and <tt>day</tt>) is valid; otherwise returns false. <p>Example: <pre class="snippet">
        QDate.isValid(2002, 5, 17);  // true
        QDate.isValid(2002, 2, 30);  // false (Feb 30 does not exist)
        QDate.isValid(2004, 2, 29);  // true (2004 is a leap year)
        QDate.isValid(2000, 2, 29);  // true (2000 is a leap year)
        QDate.isValid(2006, 2, 29);  // false (2006 is not a leap year)
        QDate.isValid(2100, 2, 29);  // false (2100 is not a leap year)
        QDate.isValid(1202, 6, 6);   // true (even though 1202 is pre-Gregorian)
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#isNull() isNull()}, and {@link com.trolltech.qt.core.QDate#setDate(int, int, int) setDate()}. <br></DD></DT>
*/

    public native static boolean isValid(int y, int m, int d);

/**
Returns the long version of the name of the <tt>weekday</tt>. The returned name is in normal type which can be used for date formatting. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#toString() toString()}, {@link com.trolltech.qt.core.QDate#shortDayName(int) shortDayName()}, {@link com.trolltech.qt.core.QDate#shortMonthName(int) shortMonthName()}, and {@link com.trolltech.qt.core.QDate#longMonthName(int) longMonthName()}. <br></DD></DT>
*/

    public native static java.lang.String longDayName(int weekday);

/**
Returns the long name of the <tt>weekday</tt> for the representation specified by <tt>type</tt>. <p>The days are enumerated using the following convention: <ul><li> 1 = "Monday"</li><li> 2 = "Tuesday"</li><li> 3 = "Wednesday"</li><li> 4 = "Thursday"</li><li> 5 = "Friday"</li><li> 6 = "Saturday"</li><li> 7 = "Sunday"</li></ul> The day names will be localized according to the system's locale settings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#toString() toString()}, {@link com.trolltech.qt.core.QDate#shortDayName(int) shortDayName()}, {@link com.trolltech.qt.core.QDate#shortMonthName(int) shortMonthName()}, and {@link com.trolltech.qt.core.QDate#longMonthName(int) longMonthName()}. <br></DD></DT>
*/

    public static java.lang.String longDayName(int weekday, com.trolltech.qt.core.QDate.MonthNameType type)    {
        return __qt_longDayName_int_MonthNameType(weekday, type.value());
    }
    native static java.lang.String __qt_longDayName_int_MonthNameType(int weekday, int type);

/**
Returns the long version of the name of the <tt>month</tt>. The returned name is in normal type which can be used for date formatting. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#toString() toString()}, {@link com.trolltech.qt.core.QDate#shortMonthName(int) shortMonthName()}, {@link com.trolltech.qt.core.QDate#shortDayName(int) shortDayName()}, and {@link com.trolltech.qt.core.QDate#longDayName(int) longDayName()}. <br></DD></DT>
*/

    public native static java.lang.String longMonthName(int month);

/**
Returns the long name of the <tt>month</tt> for the representation specified by <tt>type</tt>. <p>The months are enumerated using the following convention: <ul><li> 1 = "January"</li><li> 2 = "February"</li><li> 3 = "March"</li><li> 4 = "April"</li><li> 5 = "May"</li><li> 6 = "June"</li><li> 7 = "July"</li><li> 8 = "August"</li><li> 9 = "September"</li><li> 10 = "October"</li><li> 11 = "November"</li><li> 12 = "December"</li></ul> The month names will be localized according to the system's locale settings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#toString() toString()}, {@link com.trolltech.qt.core.QDate#shortMonthName(int) shortMonthName()}, {@link com.trolltech.qt.core.QDate#shortDayName(int) shortDayName()}, and {@link com.trolltech.qt.core.QDate#longDayName(int) longDayName()}. <br></DD></DT>
*/

    public static java.lang.String longMonthName(int month, com.trolltech.qt.core.QDate.MonthNameType type)    {
        return __qt_longMonthName_int_MonthNameType(month, type.value());
    }
    native static java.lang.String __qt_longMonthName_int_MonthNameType(int month, int type);

/**
Returns the short version of the name of the <tt>weekday</tt>. The returned name is in normal type which can be used for date formatting. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#toString() toString()}, {@link com.trolltech.qt.core.QDate#longDayName(int) longDayName()}, {@link com.trolltech.qt.core.QDate#shortMonthName(int) shortMonthName()}, and {@link com.trolltech.qt.core.QDate#longMonthName(int) longMonthName()}. <br></DD></DT>
*/

    public native static java.lang.String shortDayName(int weekday);

/**
Returns the short name of the <tt>weekday</tt> for the representation specified by <tt>type</tt>. <p>The days are enumerated using the following convention: <ul><li> 1 = "Mon"</li><li> 2 = "Tue"</li><li> 3 = "Wed"</li><li> 4 = "Thu"</li><li> 5 = "Fri"</li><li> 6 = "Sat"</li><li> 7 = "Sun"</li></ul> The day names will be localized according to the system's locale settings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#toString() toString()}, {@link com.trolltech.qt.core.QDate#shortMonthName(int) shortMonthName()}, {@link com.trolltech.qt.core.QDate#longMonthName(int) longMonthName()}, and {@link com.trolltech.qt.core.QDate#longDayName(int) longDayName()}. <br></DD></DT>
*/

    public static java.lang.String shortDayName(int weekday, com.trolltech.qt.core.QDate.MonthNameType type)    {
        return __qt_shortDayName_int_MonthNameType(weekday, type.value());
    }
    native static java.lang.String __qt_shortDayName_int_MonthNameType(int weekday, int type);

/**
Returns the short version of the name of the <tt>month</tt>. The returned name is in normal type which can be used for date formatting. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#toString() toString()}, {@link com.trolltech.qt.core.QDate#longMonthName(int) longMonthName()}, {@link com.trolltech.qt.core.QDate#shortDayName(int) shortDayName()}, and {@link com.trolltech.qt.core.QDate#longDayName(int) longDayName()}. <br></DD></DT>
*/

    public native static java.lang.String shortMonthName(int month);

/**
Returns the short name of the <tt>month</tt> for the representation specified by <tt>type</tt>. <p>The months are enumerated using the following convention: <ul><li> 1 = "Jan"</li><li> 2 = "Feb"</li><li> 3 = "Mar"</li><li> 4 = "Apr"</li><li> 5 = "May"</li><li> 6 = "Jun"</li><li> 7 = "Jul"</li><li> 8 = "Aug"</li><li> 9 = "Sep"</li><li> 10 = "Oct"</li><li> 11 = "Nov"</li><li> 12 = "Dec"</li></ul> The month names will be localized according to the system's locale settings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#toString() toString()}, {@link com.trolltech.qt.core.QDate#longMonthName(int) longMonthName()}, {@link com.trolltech.qt.core.QDate#shortDayName(int) shortDayName()}, and {@link com.trolltech.qt.core.QDate#longDayName(int) longDayName()}. <br></DD></DT>
*/

    public static java.lang.String shortMonthName(int month, com.trolltech.qt.core.QDate.MonthNameType type)    {
        return __qt_shortMonthName_int_MonthNameType(month, type.value());
    }
    native static java.lang.String __qt_shortMonthName_int_MonthNameType(int month, int type);

/**
@exclude
*/

    public static native QDate fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDate(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDate array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QDate)
        return operator_equal((com.trolltech.qt.core.QDate) other);
        return false;
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public int compareTo(Object other) {
        if (equals(other)) return 0;
        else if (other instanceof com.trolltech.qt.core.QDate) {
            if (operator_less((com.trolltech.qt.core.QDate) other)) return -1;
            else return 1;
        }
        throw new ClassCastException();
    }

/**
Returns the week number (1 to 53).
<p>
Returns null if the date is invalid.
<p>
In accordance with ISO 8601, weeks start on Qt.DayOfWeek.Monday and
the first Qt.DayOfWeek.Thursday of a year is always in week 1 of that
year. Most years have 52 weeks, but some have 53.
<p>
Copyright (c) 1989 The Regents of the University of California.
All rights reserved.
<p>
Redistribution and use in source and binary forms are permitted
provided that the above copyright notice and this paragraph are
duplicated in all such forms and that any documentation,
advertising materials, and other materials related to such
distribution and use acknowledge that the software was developed
by the University of California, Berkeley.  The name of the
University may not be used to endorse or promote products derived
from this software without specific prior written permission.
THIS SOFTWARE IS PROVIDED "AS IS" AND WITHOUT ANY EXPRESS OR
IMPLIED WARRANTIES, INCLUDING, WITHOUT LIMITATION, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
*/

    public final int weekNumber() {
        return weekNumber(null);
    }

/**
This function returns the year number of the QDate's current week.
*/

    public final int yearOfWeekNumber() {
        QNativePointer np = new QNativePointer(QNativePointer.Type.Int);
        weekNumber(np);
        return np.intValue();
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDate clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDate __qt_clone(long __this_nativeId);
}
