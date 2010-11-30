package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QDateTime class provides date and time functions. A QDateTime object contains a calendar date and a clock time (a "datetime"). It is a combination of the {@link com.trolltech.qt.core.QDate QDate} and {@link com.trolltech.qt.core.QTime QTime} classes. It can read the current datetime from the system clock. It provides functions for comparing datetimes and for manipulating a datetime by adding a number of seconds, days, months, or years. <p>A QDateTime object is typically created either by giving a date and time explicitly in the constructor, or by using the static function {@link com.trolltech.qt.core.QDateTime#currentDateTime() currentDateTime()} that returns a QDateTime object set to the system clock's time. The date and time can be changed with {@link com.trolltech.qt.core.QDateTime#setDate(com.trolltech.qt.core.QDate) setDate()} and {@link com.trolltech.qt.core.QDateTime#setTime(com.trolltech.qt.core.QTime) setTime()}. A datetime can also be set using the {@link com.trolltech.qt.core.QDateTime#setTime_t(int) setTime_t()} function that takes a POSIX-standard "number of seconds since 00:00:00 on January 1, 1970" value. The {@link com.trolltech.qt.core.QDateTime#fromString(java.lang.String) fromString()} function returns a QDateTime, given a string and a date format used to interpret the date within the string. <p>The {@link com.trolltech.qt.core.QDateTime#date() date()} and {@link com.trolltech.qt.core.QDateTime#time() time()} functions provide access to the date and time parts of the datetime. The same information is provided in textual format by the {@link com.trolltech.qt.core.QDateTime#toString() toString()} function. <p>QDateTime provides a full set of operators to compare two QDateTime objects where smaller means earlier and larger means later. <p>You can increment (or decrement) a datetime by a given number of seconds using {@link com.trolltech.qt.core.QDateTime#addSecs(int) addSecs()}, or days using {@link com.trolltech.qt.core.QDateTime#addDays(int) addDays()}. Similarly you can use {@link com.trolltech.qt.core.QDateTime#addMonths(int) addMonths()} and {@link com.trolltech.qt.core.QDateTime#addYears(int) addYears()}. The {@link com.trolltech.qt.core.QDateTime#daysTo(com.trolltech.qt.core.QDateTime) daysTo()} function returns the number of days between two datetimes, and {@link com.trolltech.qt.core.QDateTime#secsTo(com.trolltech.qt.core.QDateTime) secsTo()} returns the number of seconds between two datetimes. <p>QDateTime can store datetimes as {@link com.trolltech.qt.core.Qt.TimeSpec local time } or as {@link com.trolltech.qt.core.Qt.TimeSpec UTC }. {@link com.trolltech.qt.core.QDateTime#currentDateTime() QDateTime::currentDateTime()} returns a QDateTime expressed as local time; use {@link com.trolltech.qt.core.QDateTime#toUTC() toUTC()} to convert it to UTC. You can also use {@link com.trolltech.qt.core.QDateTime#timeSpec() timeSpec()} to find out if a QDateTime object stores a UTC time or a local time. Operations such as {@link com.trolltech.qt.core.QDateTime#addSecs(int) addSecs()} and {@link com.trolltech.qt.core.QDateTime#secsTo(com.trolltech.qt.core.QDateTime) secsTo()} are aware of daylight saving time (DST). <p><b>Note:</b>QDateTime does not account for leap seconds.<a name="use-of-gregorian-and-julian-calendars"><a name="qdatetime-g-and-j"><a name="use-of-gregorian-and-julian-calendars"><h3>Use of Gregorian and Julian Calendars</h3> {@link com.trolltech.qt.core.QDate QDate} uses the Gregorian calendar in all locales, beginning on the date 15 October 1582. For dates up to and including 4 October 1582, the Julian calendar is used. This means there is a 10-day gap in the internal calendar between the 4th and the 15th of October 1582. When you use QDateTime for dates in that epoch, the day after 4 October 1582 is 15 October 1582, and the dates in the gap are invalid. <p>The Julian to Gregorian changeover date used here is the date when the Gregorian calendar was first introduced, by Pope Gregory XIII. That change was not universally accepted and some localities only executed it at a later date (if at all). QDateTime doesn't take any of these historical facts into account. If an application must support a locale-specific dating system, it must do so on its own, remembering to convert the dates using the Julian day.<a name="no-year-0"><h3>No Year 0</h3> There is no year 0. Dates in that year are considered invalid. The year -1 is the year "1 before Christ" or "1 before current era." The day before 0001-01-01 is December 31st, 1 BCE.<a name="range-of-valid-dates"><h3>Range of Valid Dates</h3> The range of valid dates is from January 2nd, 4713 BCE, to sometime in the year 11 million CE. The Julian Day returned by {@link com.trolltech.qt.core.QDate#toJulianDay() QDate::toJulianDay()} is a number in the contiguous range from 1 to overflow, even across QDateTime's "date holes". It is suitable for use in applications that must convert a QDateTime to a date in another calendar system, e.g., Hebrew, Islamic or Chinese. <p>The Gregorian calendar was introduced in different places around the world on different dates. QDateTime uses {@link com.trolltech.qt.core.QDate QDate} to store the date, so it uses the Gregorian calendar for all locales, beginning on the date 15 October 1582. For dates up to and including 4 October 1582, QDateTime uses the Julian calendar. This means there is a 10-day gap in the QDateTime calendar between the 4th and the 15th of October 1582. When you use QDateTime for dates in that epoch, the day after 4 October 1582 is 15 October 1582, and the dates in the gap are invalid.<a name="use-of-system-timezone"><h3>Use of System Timezone</h3> QDateTime uses the system's time zone information to determine the offset of local time from UTC. If the system is not configured correctly or not up-to-date, QDateTime will give wrong results as well.<a name="daylight-savings-time-dst"><h3>Daylight Savings Time (DST)</h3> QDateTime takes into account the system's time zone information when dealing with DST. On modern Unix systems, this means it applies the correct historical DST data whenever possible. On Windows and Windows CE, where the system doesn't support historical DST data, historical accuracy is not maintained with respect to DST. <p>The range of valid dates taking DST into account is 1970-01-01 to the present, and rules are in place for handling DST correctly until 2037-12-31, but these could change. For dates falling outside that range, QDateTime makes a best guess using the rules for year 1970 or 2037, but we can't guarantee accuracy. This means QDateTime doesn't take into account changes in a locale's time zone before 1970, even if the system's time zone database supports that information. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate QDate}, {@link com.trolltech.qt.core.QTime QTime}, and {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDateTime extends com.trolltech.qt.QtJambiObject
    implements java.lang.Comparable<Object>,
            java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a null datetime (i. . null date and null time). A null datetime is invalid, since the date is invalid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#isValid() isValid()}. <br></DD></DT>
*/

    public QDateTime(){
        super((QPrivateConstructor)null);
        __qt_QDateTime();
    }

    native void __qt_QDateTime();

/**
Constructs a datetime with the given <tt>date</tt>, a valid time(00.00:00. 00), and sets the {@link com.trolltech.qt.core.QDateTime#timeSpec() timeSpec()} to {@link com.trolltech.qt.core.Qt.TimeSpec Qt::LocalTime }.
*/

    public QDateTime(com.trolltech.qt.core.QDate arg__1){
        super((QPrivateConstructor)null);
        __qt_QDateTime_QDate(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QDateTime_QDate(long arg__1);


/**
Constructs a datetime with the given <tt>date</tt> and <tt>time</tt>, using the time specification defined by <tt>spec</tt>. <p>If <tt>date</tt> is valid and <tt>time</tt> is not, the time will be set to midnight.
*/

    public QDateTime(com.trolltech.qt.core.QDate arg__1, com.trolltech.qt.core.QTime arg__2) {
        this(arg__1, arg__2, com.trolltech.qt.core.Qt.TimeSpec.LocalTime);
    }
/**
Constructs a datetime with the given <tt>date</tt> and <tt>time</tt>, using the time specification defined by <tt>spec</tt>. <p>If <tt>date</tt> is valid and <tt>time</tt> is not, the time will be set to midnight.
*/

    public QDateTime(com.trolltech.qt.core.QDate arg__1, com.trolltech.qt.core.QTime arg__2, com.trolltech.qt.core.Qt.TimeSpec spec){
        super((QPrivateConstructor)null);
        __qt_QDateTime_QDate_QTime_TimeSpec(arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId(), spec.value());
    }

    native void __qt_QDateTime_QDate_QTime_TimeSpec(long arg__1, long arg__2, int spec);

/**
Constructs a copy of the <tt>other</tt> datetime.
*/

    public QDateTime(com.trolltech.qt.core.QDateTime other){
        super((QPrivateConstructor)null);
        __qt_QDateTime_QDateTime(other == null ? 0 : other.nativeId());
    }

    native void __qt_QDateTime_QDateTime(long other);

/**
Returns a QDateTime object containing a datetime <tt>ndays</tt> days later than the datetime of this object (or earlier if <tt>ndays</tt> is negative). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#daysTo(com.trolltech.qt.core.QDateTime) daysTo()}, {@link com.trolltech.qt.core.QDateTime#addMonths(int) addMonths()}, {@link com.trolltech.qt.core.QDateTime#addYears(int) addYears()}, and {@link com.trolltech.qt.core.QDateTime#addSecs(int) addSecs()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime addDays(int days)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addDays_int(nativeId(), days);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_addDays_int(long __this__nativeId, int days);

/**
Returns a QDateTime object containing a datetime <tt>msecs</tt> miliseconds later than the datetime of this object (or earlier if <tt>msecs</tt> is negative). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#addSecs(int) addSecs()}, {@link com.trolltech.qt.core.QDateTime#secsTo(com.trolltech.qt.core.QDateTime) secsTo()}, {@link com.trolltech.qt.core.QDateTime#addDays(int) addDays()}, {@link com.trolltech.qt.core.QDateTime#addMonths(int) addMonths()}, and {@link com.trolltech.qt.core.QDateTime#addYears(int) addYears()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime addMSecs(long msecs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addMSecs_long(nativeId(), msecs);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_addMSecs_long(long __this__nativeId, long msecs);

/**
Returns a QDateTime object containing a datetime <tt>nmonths</tt> months later than the datetime of this object (or earlier if <tt>nmonths</tt> is negative). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#daysTo(com.trolltech.qt.core.QDateTime) daysTo()}, {@link com.trolltech.qt.core.QDateTime#addDays(int) addDays()}, {@link com.trolltech.qt.core.QDateTime#addYears(int) addYears()}, and {@link com.trolltech.qt.core.QDateTime#addSecs(int) addSecs()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime addMonths(int months)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addMonths_int(nativeId(), months);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_addMonths_int(long __this__nativeId, int months);

/**
Returns a QDateTime object containing a datetime <tt>s</tt> seconds later than the datetime of this object (or earlier if <tt>s</tt> is negative). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#addMSecs(long) addMSecs()}, {@link com.trolltech.qt.core.QDateTime#secsTo(com.trolltech.qt.core.QDateTime) secsTo()}, {@link com.trolltech.qt.core.QDateTime#addDays(int) addDays()}, {@link com.trolltech.qt.core.QDateTime#addMonths(int) addMonths()}, and {@link com.trolltech.qt.core.QDateTime#addYears(int) addYears()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime addSecs(int secs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addSecs_int(nativeId(), secs);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_addSecs_int(long __this__nativeId, int secs);

/**
Returns a QDateTime object containing a datetime <tt>nyears</tt> years later than the datetime of this object (or earlier if <tt>nyears</tt> is negative). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#daysTo(com.trolltech.qt.core.QDateTime) daysTo()}, {@link com.trolltech.qt.core.QDateTime#addDays(int) addDays()}, {@link com.trolltech.qt.core.QDateTime#addMonths(int) addMonths()}, and {@link com.trolltech.qt.core.QDateTime#addSecs(int) addSecs()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime addYears(int years)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addYears_int(nativeId(), years);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_addYears_int(long __this__nativeId, int years);

/**
Returns the date part of the datetime. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#setDate(com.trolltech.qt.core.QDate) setDate()}, {@link com.trolltech.qt.core.QDateTime#time() time()}, and {@link com.trolltech.qt.core.QDateTime#timeSpec() timeSpec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate date()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_date(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDate __qt_date(long __this__nativeId);

/**
Returns the number of days from this datetime to the <tt>other</tt> datetime. If the <tt>other</tt> datetime is earlier than this datetime, the value returned is negative. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#addDays(int) addDays()}, and {@link com.trolltech.qt.core.QDateTime#secsTo(com.trolltech.qt.core.QDateTime) secsTo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int daysTo(com.trolltech.qt.core.QDateTime arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_daysTo_QDateTime(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native int __qt_daysTo_QDateTime(long __this__nativeId, long arg__1);

/**
Returns true if both the date and the time are null; otherwise returns false. A null datetime is invalid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#isNull() QDate::isNull()}, {@link com.trolltech.qt.core.QTime#isNull() QTime::isNull()}, and {@link com.trolltech.qt.core.QDateTime#isValid() isValid()}. <br></DD></DT>
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
Returns true if both the date and the time are valid; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#isValid() QDate::isValid()}, and {@link com.trolltech.qt.core.QTime#isValid() QTime::isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_less(com.trolltech.qt.core.QDateTime other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QDateTime(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QDateTime(long __this__nativeId, long other);

/**
<brief>Writes thisQDateTime
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
    private final boolean operator_equal(com.trolltech.qt.core.QDateTime other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QDateTime(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QDateTime(long __this__nativeId, long other);

/**
<brief>Reads a QDateTime
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
Returns the number of seconds from this datetime to the <tt>other</tt> datetime. If the <tt>other</tt> datetime is earlier than this datetime, the value returned is negative. <p>Before performing the comparison, the two datetimes are converted to {@link com.trolltech.qt.core.Qt.TimeSpec Qt::UTC } to ensure that the result is correct if one of the two datetimes has daylight saving time (DST) and the other doesn't. <p>Example: <pre class="snippet">
        QDateTime now = QDateTime.currentDateTime();
        QDateTime xmas = new QDateTime(new QDate(now.date().year(), 12, 25), new QTime(0, 0));
        System.err.println("There are " + now.secsTo(xmas) + "seconds to Christmas");
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#addSecs(int) addSecs()}, {@link com.trolltech.qt.core.QDateTime#daysTo(com.trolltech.qt.core.QDateTime) daysTo()}, and {@link com.trolltech.qt.core.QTime#secsTo(com.trolltech.qt.core.QTime) QTime::secsTo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int secsTo(com.trolltech.qt.core.QDateTime arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_secsTo_QDateTime(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native int __qt_secsTo_QDateTime(long __this__nativeId, long arg__1);

/**
Sets the date part of this datetime to <tt>date</tt>. If no time is set, it is set to midnight. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#date() date()}, {@link com.trolltech.qt.core.QDateTime#setTime(com.trolltech.qt.core.QTime) setTime()}, and {@link com.trolltech.qt.core.QDateTime#setTimeSpec(com.trolltech.qt.core.Qt.TimeSpec) setTimeSpec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDate(com.trolltech.qt.core.QDate date)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDate_QDate(nativeId(), date == null ? 0 : date.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDate_QDate(long __this__nativeId, long date);

/**
Sets the time part of this datetime to <tt>time</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#time() time()}, {@link com.trolltech.qt.core.QDateTime#setDate(com.trolltech.qt.core.QDate) setDate()}, and {@link com.trolltech.qt.core.QDateTime#setTimeSpec(com.trolltech.qt.core.Qt.TimeSpec) setTimeSpec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTime(com.trolltech.qt.core.QTime time)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTime_QTime(nativeId(), time == null ? 0 : time.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTime_QTime(long __this__nativeId, long time);

/**
Sets the time specification used in this datetime to <tt>spec</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#timeSpec() timeSpec()}, {@link com.trolltech.qt.core.QDateTime#setDate(com.trolltech.qt.core.QDate) setDate()}, {@link com.trolltech.qt.core.QDateTime#setTime(com.trolltech.qt.core.QTime) setTime()}, and {@link com.trolltech.qt.core.Qt.TimeSpec Qt::TimeSpec }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTimeSpec(com.trolltech.qt.core.Qt.TimeSpec spec)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTimeSpec_TimeSpec(nativeId(), spec.value());
    }
    @QtBlockedSlot
    native void __qt_setTimeSpec_TimeSpec(long __this__nativeId, int spec);

/**
Sets the date and time given the number of <tt>seconds</tt> that have passed since 1970-01-01T00.00:00, Coordinated Universal Time ({@link com.trolltech.qt.core.Qt.TimeSpec Qt::UTC }). On systems that do not support time zones this function will behave as if local time were {@link com.trolltech.qt.core.Qt.TimeSpec Qt::UTC }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#toTime_t() toTime_t()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTime_t(int secsSince1Jan1970UTC)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTime_t_int(nativeId(), secsSince1Jan1970UTC);
    }
    @QtBlockedSlot
    native void __qt_setTime_t_int(long __this__nativeId, int secsSince1Jan1970UTC);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setUtcOffset(int seconds)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUtcOffset_int(nativeId(), seconds);
    }
    @QtBlockedSlot
    native void __qt_setUtcOffset_int(long __this__nativeId, int seconds);

/**
Returns the time part of the datetime. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#setTime(com.trolltech.qt.core.QTime) setTime()}, {@link com.trolltech.qt.core.QDateTime#date() date()}, and {@link com.trolltech.qt.core.QDateTime#timeSpec() timeSpec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTime time()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_time(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTime __qt_time(long __this__nativeId);

/**
Returns the time specification of the datetime. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#setTimeSpec(com.trolltech.qt.core.Qt.TimeSpec) setTimeSpec()}, {@link com.trolltech.qt.core.QDateTime#date() date()}, {@link com.trolltech.qt.core.QDateTime#time() time()}, and {@link com.trolltech.qt.core.Qt.TimeSpec Qt::TimeSpec }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.TimeSpec timeSpec()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.TimeSpec.resolve(__qt_timeSpec(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_timeSpec(long __this__nativeId);

/**
Returns a datetime containing the date and time information in this datetime, but specified using the {@link com.trolltech.qt.core.Qt.TimeSpec Qt::LocalTime } definition. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#toTimeSpec(com.trolltech.qt.core.Qt.TimeSpec) toTimeSpec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime toLocalTime()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toLocalTime(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_toLocalTime(long __this__nativeId);


/**
<brief>Returns a string representation of the <tt>this QDateTime</tt>. </brief>
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

/**
Returns a copy of this datetime configured to use the given time <tt>specification</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#timeSpec() timeSpec()}, {@link com.trolltech.qt.core.QDateTime#toUTC() toUTC()}, and {@link com.trolltech.qt.core.QDateTime#toLocalTime() toLocalTime()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime toTimeSpec(com.trolltech.qt.core.Qt.TimeSpec spec)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toTimeSpec_TimeSpec(nativeId(), spec.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_toTimeSpec_TimeSpec(long __this__nativeId, int spec);

/**
Returns the datetime as the number of seconds that have passed since 1970-01-01T00.00:00, Coordinated Universal Time ({@link com.trolltech.qt.core.Qt.TimeSpec Qt::UTC }). <p>On systems that do not support time zones, this function will behave as if local time were {@link com.trolltech.qt.core.Qt.TimeSpec Qt::UTC }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#setTime_t(int) setTime_t()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int toTime_t()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toTime_t(nativeId());
    }
    @QtBlockedSlot
    native int __qt_toTime_t(long __this__nativeId);

/**
Returns a datetime containing the date and time information in this datetime, but specified using the {@link com.trolltech.qt.core.Qt.TimeSpec Qt::UTC } definition. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#toTimeSpec(com.trolltech.qt.core.Qt.TimeSpec) toTimeSpec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime toUTC()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toUTC(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_toUTC(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int utcOffset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_utcOffset(nativeId());
    }
    @QtBlockedSlot
    native int __qt_utcOffset(long __this__nativeId);

/**
Returns the current datetime, as reported by the system clock, in the local time zone. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#currentDate() QDate::currentDate()}, {@link com.trolltech.qt.core.QTime#currentTime() QTime::currentTime()}, and {@link com.trolltech.qt.core.QDateTime#toTimeSpec(com.trolltech.qt.core.Qt.TimeSpec) toTimeSpec()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QDateTime currentDateTime();


/**
Returns the QDateTime represented by the <tt>string</tt>, using the <tt>format</tt> given, or an invalid datetime if this is not possible. <p>Note for {@link com.trolltech.qt.core.Qt.DateFormat Qt::TextDate }: It is recommended that you use the English short month names (e.g. "Jan"). Although localized month names can also be used, they depend on the user's locale settings.
*/

    public static com.trolltech.qt.core.QDateTime fromString(java.lang.String s) {
        return fromString(s, com.trolltech.qt.core.Qt.DateFormat.TextDate);
    }
/**
Returns the QDateTime represented by the <tt>string</tt>, using the <tt>format</tt> given, or an invalid datetime if this is not possible. <p>Note for {@link com.trolltech.qt.core.Qt.DateFormat Qt::TextDate }: It is recommended that you use the English short month names (e.g. "Jan"). Although localized month names can also be used, they depend on the user's locale settings.
*/

    public static com.trolltech.qt.core.QDateTime fromString(java.lang.String s, com.trolltech.qt.core.Qt.DateFormat f)    {
        return __qt_fromString_String_DateFormat(s, f.value());
    }
    native static com.trolltech.qt.core.QDateTime __qt_fromString_String_DateFormat(java.lang.String s, int f);

/**
Returns the QDateTime represented by the <tt>string</tt>, using the <tt>format</tt> given, or an invalid datetime if the string cannot be parsed. <p>These expressions may be used for the date part of the format string: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Expression</center></th><th><center> Output</center></th></tr></thead><tr valign="top" class="even"><td> d</td><td> the day as number without a leading zero (1 to 31)</td></tr><tr valign="top" class="odd"><td> dd</td><td> the day as number with a leading zero (01 to 31)</td></tr><tr valign="top" class="even"><td> ddd</td><td> the abbreviated localized day name (e.g. 'Mon' to 'Sun'). Uses {@link com.trolltech.qt.core.QDate#shortDayName(int) QDate::shortDayName()}.</td></tr><tr valign="top" class="odd"><td> dddd</td><td> the long localized day name (e.g. 'Monday' to 'Sunday'). Uses {@link com.trolltech.qt.core.QDate#longDayName(int) QDate::longDayName()}.</td></tr><tr valign="top" class="even"><td> M</td><td> the month as number without a leading zero (1-12)</td></tr><tr valign="top" class="odd"><td> MM</td><td> the month as number with a leading zero (01-12)</td></tr><tr valign="top" class="even"><td> MMM</td><td> the abbreviated localized month name (e.g. 'Jan' to 'Dec'). Uses {@link com.trolltech.qt.core.QDate#shortMonthName(int) QDate::shortMonthName()}.</td></tr><tr valign="top" class="odd"><td> MMMM</td><td> the long localized month name (e.g. 'January' to 'December'). Uses {@link com.trolltech.qt.core.QDate#longMonthName(int) QDate::longMonthName()}.</td></tr><tr valign="top" class="even"><td> yy</td><td> the year as two digit number (00-99)</td></tr><tr valign="top" class="odd"><td> yyyy</td><td> the year as four digit number</td></tr></table> <b>Note:</b> Unlike the other version of this function, day and month names must be given in the user's local language. It is only possible to use the English names if the user's language is English. <p>These expressions may be used for the time part of the format string: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Expression</center></th><th><center> Output</center></th></tr></thead><tr valign="top" class="even"><td> h</td><td> the hour without a leading zero (0 to 23 or 1 to 12 if AM/PM display)</td></tr><tr valign="top" class="odd"><td> hh</td><td> the hour with a leading zero (00 to 23 or 01 to 12 if AM/PM display)</td></tr><tr valign="top" class="even"><td> H</td><td> the hour without a leading zero (0 to 23, even with AM/PM display)</td></tr><tr valign="top" class="odd"><td> HH</td><td> the hour with a leading zero (00 to 23, even with AM/PM display)</td></tr><tr valign="top" class="even"><td> m</td><td> the minute without a leading zero (0 to 59)</td></tr><tr valign="top" class="odd"><td> mm</td><td> the minute with a leading zero (00 to 59)</td></tr><tr valign="top" class="even"><td> s</td><td> the second without a leading zero (0 to 59)</td></tr><tr valign="top" class="odd"><td> ss</td><td> the second with a leading zero (00 to 59)</td></tr><tr valign="top" class="even"><td> z</td><td> the milliseconds without leading zeroes (0 to 999)</td></tr><tr valign="top" class="odd"><td> zzz</td><td> the milliseconds with leading zeroes (000 to 999)</td></tr><tr valign="top" class="even"><td> AP or A</td><td> interpret as an AM/PM time. AP must be either "AM" or "PM".</td></tr><tr valign="top" class="odd"><td> ap or a</td><td> Interpret as an AM/PM time. ap must be either "am" or "pm".</td></tr></table> All other input characters will be treated as text. Any sequence of characters that are enclosed in singlequotes will also be treated as text and not be used as an expression. <pre class="snippet">
        QTime time1 = QTime.fromString("131", "HHh");
        // time1 is 13:00:00
        QTime time2 = QTime.fromString("1apA", "1amAM");
        // time1 is 01:00:00

        QDateTime dateTime2 = QDateTime.fromString("M1d1y9800:01:02",
                                                    "'M'M'd'd'y'yyhh:mm:ss");
        // dateTime is 1 January 1998 00:01:02
</pre> If the format is not satisfied an invalid QDateTime is returned. The expressions that don't have leading zeroes (d, M, h, m, s, z) will be greedy. This means that they will use two digits even if this will put them outside the range and/or leave too few digits for other sections. <pre class="snippet">
        QDateTime dateTime = QDateTime.fromString("130", "Mm"); // invalid
</pre> This could have meant 1 January 00:30.00 but the M will grab two digits. <p>For any field that is not represented in the format the following defaults are used: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Field</center></th><th><center> Default value</center></th></tr></thead><tr valign="top" class="even"><td> Year</td><td> 1900</td></tr><tr valign="top" class="odd"><td> Month</td><td> 1 (January)</td></tr><tr valign="top" class="even"><td> Day</td><td> 1</td></tr><tr valign="top" class="odd"><td> Hour</td><td> 0</td></tr><tr valign="top" class="even"><td> Minute</td><td> 0</td></tr><tr valign="top" class="odd"><td> Second</td><td> 0</td></tr></table> For example: <pre class="snippet">
        QDateTime dateTime = QDateTime.fromString("1.30.1", "M.d.s");
        // dateTime is January 30 in the current year 00:00:01
</pre> {@link com.trolltech.qt.core.QDateTime#toString() QDateTime::toString()}{@link com.trolltech.qt.core.QTime#toString() QTime::toString()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#fromString(java.lang.String) QDate::fromString()}, {@link com.trolltech.qt.core.QTime#fromString(java.lang.String) QTime::fromString()}, and {@link com.trolltech.qt.core.QDate#toString() QDate::toString()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QDateTime fromString(java.lang.String s, java.lang.String format);

/**
Returns a datetime whose date and time are the number of <tt>seconds</tt> that have passed since 1970-01-01T00.00:00, Coordinated Universal Time ({@link com.trolltech.qt.core.Qt.TimeSpec Qt::UTC }). On systems that do not support time zones, the time will be set as if local time were {@link com.trolltech.qt.core.Qt.TimeSpec Qt::UTC }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#toTime_t() toTime_t()}, and {@link com.trolltech.qt.core.QDateTime#setTime_t(int) setTime_t()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QDateTime fromTime_t(int secsSince1Jan1970UTC);

/**
@exclude
*/

    public static native QDateTime fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDateTime(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDateTime array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QDateTime)
        return operator_equal((com.trolltech.qt.core.QDateTime) other);
        return false;
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public int compareTo(Object other) {
        if (equals(other)) return 0;
        else if (other instanceof com.trolltech.qt.core.QDateTime) {
            if (operator_less((com.trolltech.qt.core.QDateTime) other)) return -1;
            else return 1;
        }
        throw new ClassCastException();
    }

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDateTime clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDateTime __qt_clone(long __this_nativeId);
}
