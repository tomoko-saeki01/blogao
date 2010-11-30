package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QTime class provides clock time functions. A QTime object contains a clock time, i.e. the number of hours, minutes, seconds, and milliseconds since midnight. It can read the current time from the system clock and measure a span of elapsed time. It provides functions for comparing times and for manipulating a time by adding a number of milliseconds. <p>QTime uses the 24-hour clock format; it has no concept of AM/PM. Unlike {@link com.trolltech.qt.core.QDateTime QDateTime}, QTime knows nothing about time zones or daylight savings time (DST). <p>A QTime object is typically created either by giving the number of hours, minutes, seconds, and milliseconds explicitly, or by using the static function {@link com.trolltech.qt.core.QTime#currentTime() currentTime()}, which creates a QTime object that contains the system's local time. Note that the accuracy depends on the accuracy of the underlying operating system; not all systems provide 1-millisecond accuracy. <p>The {@link com.trolltech.qt.core.QTime#hour() hour()}, {@link com.trolltech.qt.core.QTime#minute() minute()}, {@link com.trolltech.qt.core.QTime#second() second()}, and {@link com.trolltech.qt.core.QTime#msec() msec()} functions provide access to the number of hours, minutes, seconds, and milliseconds of the time. The same information is provided in textual format by the {@link com.trolltech.qt.core.QTime#toString() toString()} function. <p>QTime provides a full set of operators to compare two QTime objects. One time is considered smaller than another if it is earlier than the other. <p>The time a given number of seconds or milliseconds later than a given time can be found using the {@link com.trolltech.qt.core.QTime#addSecs(int) addSecs()} or {@link com.trolltech.qt.core.QTime#addMSecs(int) addMSecs()} functions. Correspondingly, the number of seconds or milliseconds between two times can be found using {@link com.trolltech.qt.core.QTime#secsTo(com.trolltech.qt.core.QTime) secsTo()} or {@link com.trolltech.qt.core.QTime#msecsTo(com.trolltech.qt.core.QTime) msecsTo()}. <p>QTime can be used to measure a span of elapsed time using the {@link com.trolltech.qt.core.QTime#start() start()}, {@link com.trolltech.qt.core.QTime#restart() restart()}, and {@link com.trolltech.qt.core.QTime#elapsed() elapsed()} functions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate QDate}, and {@link com.trolltech.qt.core.QDateTime QDateTime}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTime extends com.trolltech.qt.QtJambiObject
    implements java.lang.Comparable<Object>,
            java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a null time object. A null time can be a QTime(0, 0, 0, 0) (i.e., midnight) object, except that {@link com.trolltech.qt.core.QTime#isNull() isNull()} returns true and {@link com.trolltech.qt.core.QTime#isValid() isValid()} returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#isNull() isNull()}, and {@link com.trolltech.qt.core.QTime#isValid() isValid()}. <br></DD></DT>
*/

    public QTime(){
        super((QPrivateConstructor)null);
        __qt_QTime();
    }

    native void __qt_QTime();


/**
Constructs a time with hour <tt>h</tt>, minute <tt>m</tt>, seconds <tt>s</tt> and milliseconds <tt>ms</tt>. <p><tt>h</tt> must be in the range 0 to 23, <tt>m</tt> and <tt>s</tt> must be in the range 0 to 59, and <tt>ms</tt> must be in the range 0 to 999. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#isValid() isValid()}. <br></DD></DT>
*/

    public QTime(int h, int m, int s) {
        this(h, m, s, (int)0);
    }

/**
Constructs a time with hour <tt>h</tt>, minute <tt>m</tt>, seconds <tt>s</tt> and milliseconds <tt>ms</tt>. <p><tt>h</tt> must be in the range 0 to 23, <tt>m</tt> and <tt>s</tt> must be in the range 0 to 59, and <tt>ms</tt> must be in the range 0 to 999. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#isValid() isValid()}. <br></DD></DT>
*/

    public QTime(int h, int m) {
        this(h, m, (int)0, (int)0);
    }
/**
Constructs a time with hour <tt>h</tt>, minute <tt>m</tt>, seconds <tt>s</tt> and milliseconds <tt>ms</tt>. <p><tt>h</tt> must be in the range 0 to 23, <tt>m</tt> and <tt>s</tt> must be in the range 0 to 59, and <tt>ms</tt> must be in the range 0 to 999. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#isValid() isValid()}. <br></DD></DT>
*/

    public QTime(int h, int m, int s, int ms){
        super((QPrivateConstructor)null);
        __qt_QTime_int_int_int_int(h, m, s, ms);
    }

    native void __qt_QTime_int_int_int_int(int h, int m, int s, int ms);

/**
Returns a QTime object containing a time <tt>ms</tt> milliseconds later than the time of this object (or earlier if <tt>ms</tt> is negative). <p>Note that the time will wrap if it passes midnight. See {@link com.trolltech.qt.core.QTime#addSecs(int) addSecs()} for an example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#addSecs(int) addSecs()}, and {@link com.trolltech.qt.core.QTime#msecsTo(com.trolltech.qt.core.QTime) msecsTo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTime addMSecs(int ms)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addMSecs_int(nativeId(), ms);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTime __qt_addMSecs_int(long __this__nativeId, int ms);

/**
Returns a QTime object containing a time <tt>s</tt> seconds later than the time of this object (or earlier if <tt>s</tt> is negative). <p>Note that the time will wrap if it passes midnight. <p>Example: <pre class="snippet">
        QTime n = new QTime(14, 0, 0);                // n == 14:00:00
        QTime t = new QTime();
        t = n.addSecs(70);                // t == 14:01:10
        t = n.addSecs(-70);               // t == 13:58:50
        t = n.addSecs(10 * 60 * 60 + 5);  // t == 00:00:05
        t = n.addSecs(-15 * 60 * 60);     // t == 23:00:00
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#addMSecs(int) addMSecs()}, {@link com.trolltech.qt.core.QTime#secsTo(com.trolltech.qt.core.QTime) secsTo()}, and {@link com.trolltech.qt.core.QDateTime#addSecs(int) QDateTime::addSecs()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTime addSecs(int secs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addSecs_int(nativeId(), secs);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTime __qt_addSecs_int(long __this__nativeId, int secs);

/**
Returns the number of milliseconds that have elapsed since the last time {@link com.trolltech.qt.core.QTime#start() start()} or {@link com.trolltech.qt.core.QTime#restart() restart()} was called. <p>Note that the counter wraps to zero 24 hours after the last call to {@link com.trolltech.qt.core.QTime#start() start()} or restart. <p>Note that the accuracy depends on the accuracy of the underlying operating system; not all systems provide 1-millisecond accuracy. <p><b>Warning:</b> If the system's clock setting has been changed since the last time {@link com.trolltech.qt.core.QTime#start() start()} or {@link com.trolltech.qt.core.QTime#restart() restart()} was called, the result is undefined. This can happen when daylight savings time is turned on or off. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#start() start()}, and {@link com.trolltech.qt.core.QTime#restart() restart()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int elapsed()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_elapsed(nativeId());
    }
    @QtBlockedSlot
    native int __qt_elapsed(long __this__nativeId);

/**
Returns the hour part (0 to 23) of the time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#minute() minute()}, {@link com.trolltech.qt.core.QTime#second() second()}, and {@link com.trolltech.qt.core.QTime#msec() msec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int hour()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hour(nativeId());
    }
    @QtBlockedSlot
    native int __qt_hour(long __this__nativeId);

/**
Returns true if the time is null (i. ., the QTime object was constructed using the default constructor); otherwise returns false. A null time is also an invalid time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#isValid() isValid()}. <br></DD></DT>
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
Returns true if the time is valid; otherwise returns false. For example, the time 23:30:55.746 is valid, but 24:12:30 is invalid. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#isNull() isNull()}. <br></DD></DT>
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
Returns the minute part (0 to 59) of the time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#hour() hour()}, {@link com.trolltech.qt.core.QTime#second() second()}, and {@link com.trolltech.qt.core.QTime#msec() msec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int minute()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minute(nativeId());
    }
    @QtBlockedSlot
    native int __qt_minute(long __this__nativeId);

/**
Returns the millisecond part (0 to 999) of the time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#hour() hour()}, {@link com.trolltech.qt.core.QTime#minute() minute()}, and {@link com.trolltech.qt.core.QTime#second() second()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int msec()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_msec(nativeId());
    }
    @QtBlockedSlot
    native int __qt_msec(long __this__nativeId);

/**
Returns the number of milliseconds from this time to <tt>t</tt>. If <tt>t</tt> is earlier than this time, the number of milliseconds returned is negative. <p>Because QTime measures time within a day and there are 86400 seconds in a day, the result is always between -86400000 and 86400000 ms. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#secsTo(com.trolltech.qt.core.QTime) secsTo()}, and {@link com.trolltech.qt.core.QTime#addMSecs(int) addMSecs()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int msecsTo(com.trolltech.qt.core.QTime arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_msecsTo_QTime(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native int __qt_msecsTo_QTime(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final boolean operator_less(com.trolltech.qt.core.QTime other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_less_QTime(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_less_QTime(long __this__nativeId, long other);

/**
<brief>Writes thisQTime
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
    private final boolean operator_equal(com.trolltech.qt.core.QTime other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QTime(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QTime(long __this__nativeId, long other);

/**
<brief>Reads a QTime
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
Sets this time to the current time and returns the number of milliseconds that have elapsed since the last time {@link com.trolltech.qt.core.QTime#start() start()} or {@link com.trolltech.qt.core.QTime#restart() restart()} was called. <p>This function is guaranteed to be atomic and is thus very handy for repeated measurements. Call {@link com.trolltech.qt.core.QTime#start() start()} to start the first measurement, and {@link com.trolltech.qt.core.QTime#restart() restart()} for each later measurement. <p>Note that the counter wraps to zero 24 hours after the last call to {@link com.trolltech.qt.core.QTime#start() start()} or {@link com.trolltech.qt.core.QTime#restart() restart()}. <p><b>Warning:</b> If the system's clock setting has been changed since the last time {@link com.trolltech.qt.core.QTime#start() start()} or {@link com.trolltech.qt.core.QTime#restart() restart()} was called, the result is undefined. This can happen when daylight savings time is turned on or off. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#start() start()}, {@link com.trolltech.qt.core.QTime#elapsed() elapsed()}, and {@link com.trolltech.qt.core.QTime#currentTime() currentTime()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int restart()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_restart(nativeId());
    }
    @QtBlockedSlot
    native int __qt_restart(long __this__nativeId);

/**
Returns the second part (0 to 59) of the time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#hour() hour()}, {@link com.trolltech.qt.core.QTime#minute() minute()}, and {@link com.trolltech.qt.core.QTime#msec() msec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int second()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_second(nativeId());
    }
    @QtBlockedSlot
    native int __qt_second(long __this__nativeId);

/**
Returns the number of seconds from this time to <tt>t</tt>. If <tt>t</tt> is earlier than this time, the number of seconds returned is negative. <p>Because QTime measures time within a day and there are 86400 seconds in a day, the result is always between -86400 and 86400. <p>{@link com.trolltech.qt.core.QTime#secsTo(com.trolltech.qt.core.QTime) secsTo()} does not take into account any milliseconds. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#addSecs(int) addSecs()}, and {@link com.trolltech.qt.core.QDateTime#secsTo(com.trolltech.qt.core.QDateTime) QDateTime::secsTo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int secsTo(com.trolltech.qt.core.QTime arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_secsTo_QTime(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native int __qt_secsTo_QTime(long __this__nativeId, long arg__1);


/**
Sets the time to hour <tt>h</tt>, minute <tt>m</tt>, seconds <tt>s</tt> and milliseconds <tt>ms</tt>. <p><tt>h</tt> must be in the range 0 to 23, <tt>m</tt> and <tt>s</tt> must be in the range 0 to 59, and <tt>ms</tt> must be in the range 0 to 999. Returns true if the set time is valid; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setHMS(int h, int m, int s) {
        return setHMS(h, m, s, (int)0);
    }
/**
Sets the time to hour <tt>h</tt>, minute <tt>m</tt>, seconds <tt>s</tt> and milliseconds <tt>ms</tt>. <p><tt>h</tt> must be in the range 0 to 23, <tt>m</tt> and <tt>s</tt> must be in the range 0 to 59, and <tt>ms</tt> must be in the range 0 to 999. Returns true if the set time is valid; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setHMS(int h, int m, int s, int ms)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setHMS_int_int_int_int(nativeId(), h, m, s, ms);
    }
    @QtBlockedSlot
    native boolean __qt_setHMS_int_int_int_int(long __this__nativeId, int h, int m, int s, int ms);

/**
Sets this time to the current time. This is practical for timing: <pre class="snippet">
        QTime t = new QTime();
        t.start();
        some_lengthy_task();
        System.err.println("Time elapsed: " +t.elapsed() + " ms");
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#restart() restart()}, {@link com.trolltech.qt.core.QTime#elapsed() elapsed()}, and {@link com.trolltech.qt.core.QTime#currentTime() currentTime()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void start()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_start(nativeId());
    }
    @QtBlockedSlot
    native void __qt_start(long __this__nativeId);


/**
<brief>Returns a string representation of the <tt>this QTime</tt>. </brief>
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
This is an overloaded member function, provided for convenience. <p>Returns the current time as reported by the system clock. <p>Note that the accuracy depends on the accuracy of the underlying operating system; not all systems provide 1-millisecond accuracy.
*/

    public native static com.trolltech.qt.core.QTime currentTime();


/**
Returns the time represented in the <tt>string</tt> as a QTime using the <tt>format</tt> given, or an invalid time if this is not possible. <p>Note that {@link com.trolltech.qt.core.QTime#fromString(java.lang.String) fromString()} uses a "C" locale encoded string to convert milliseconds to a float value. If the default locale is not "C", this may result in two conversion attempts (if the conversion fails for the default locale). This should be considered an implementation detail.
*/

    public static com.trolltech.qt.core.QTime fromString(java.lang.String s) {
        return fromString(s, com.trolltech.qt.core.Qt.DateFormat.TextDate);
    }
/**
Returns the time represented in the <tt>string</tt> as a QTime using the <tt>format</tt> given, or an invalid time if this is not possible. <p>Note that {@link com.trolltech.qt.core.QTime#fromString(java.lang.String) fromString()} uses a "C" locale encoded string to convert milliseconds to a float value. If the default locale is not "C", this may result in two conversion attempts (if the conversion fails for the default locale). This should be considered an implementation detail.
*/

    public static com.trolltech.qt.core.QTime fromString(java.lang.String s, com.trolltech.qt.core.Qt.DateFormat f)    {
        return __qt_fromString_String_DateFormat(s, f.value());
    }
    native static com.trolltech.qt.core.QTime __qt_fromString_String_DateFormat(java.lang.String s, int f);

/**
Returns the QTime represented by the <tt>string</tt>, using the <tt>format</tt> given, or an invalid time if the string cannot be parsed. <p>These expressions may be used for the format: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Expression</center></th><th><center> Output</center></th></tr></thead><tr valign="top" class="even"><td> h</td><td> the hour without a leading zero (0 to 23 or 1 to 12 if AM/PM display)</td></tr><tr valign="top" class="odd"><td> hh</td><td> the hour with a leading zero (00 to 23 or 01 to 12 if AM/PM display)</td></tr><tr valign="top" class="even"><td> m</td><td> the minute without a leading zero (0 to 59)</td></tr><tr valign="top" class="odd"><td> mm</td><td> the minute with a leading zero (00 to 59)</td></tr><tr valign="top" class="even"><td> s</td><td> the second without a leading zero (0 to 59)</td></tr><tr valign="top" class="odd"><td> ss</td><td> the second with a leading zero (00 to 59)</td></tr><tr valign="top" class="even"><td> z</td><td> the milliseconds without leading zeroes (0 to 999)</td></tr><tr valign="top" class="odd"><td> zzz</td><td> the milliseconds with leading zeroes (000 to 999)</td></tr><tr valign="top" class="even"><td> AP</td><td> interpret as an AM/PM time. AP must be either "AM" or "PM".</td></tr><tr valign="top" class="odd"><td> ap</td><td> Interpret as an AM/PM time. ap must be either "am" or "pm".</td></tr></table> All other input characters will be treated as text. Any sequence of characters that are enclosed in single quotes will also be treated as text and not be used as an expression. <pre class="snippet">
        QTime time = QTime.fromString("1mm12car00", "m'mm'hcarss");
        // time is 12:01.00
</pre> If the format is not satisfied an invalid QTime is returned. Expressions that do not expect leading zeroes to be given (h, m, s and z) are greedy. This means that they will use two digits even if this puts them outside the range of accepted values and leaves too few digits for other sections. For example, the following string could have meant 00:07:10, but the m will grab two digits, resulting in an invalid time: <pre class="snippet">
        QTime time = QTime.fromString("00:710", "hh:ms"); // invalid
</pre> Any field that is not represented in the format will be set to zero. For example: <pre class="snippet">
        QTime time = QTime.fromString("1.30", "m.s");
        // time is 00:01:30.000
</pre> {@link com.trolltech.qt.core.QDateTime#toString() QDateTime::toString()}{@link com.trolltech.qt.core.QTime#toString() QTime::toString()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#fromString(java.lang.String) QDateTime::fromString()}, {@link com.trolltech.qt.core.QDate#fromString(java.lang.String) QDate::fromString()}, and {@link com.trolltech.qt.core.QDate#toString() QDate::toString()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QTime fromString(java.lang.String s, java.lang.String format);


/**
This is an overloaded member function, provided for convenience. <p>Returns true if the specified time is valid; otherwise returns false. <p>The time is valid if <tt>h</tt> is in the range 0 to 23, <tt>m</tt> and <tt>s</tt> are in the range 0 to 59, and <tt>ms</tt> is in the range 0 to 999. <p>Example: <pre class="snippet">
        QTime.isValid(21, 10, 30); // returns true
        QTime.isValid(22, 5,  62); // returns false
</pre>
*/

    public static boolean isValid(int h, int m, int s) {
        return isValid(h, m, s, (int)0);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns true if the specified time is valid; otherwise returns false. <p>The time is valid if <tt>h</tt> is in the range 0 to 23, <tt>m</tt> and <tt>s</tt> are in the range 0 to 59, and <tt>ms</tt> is in the range 0 to 999. <p>Example: <pre class="snippet">
        QTime.isValid(21, 10, 30); // returns true
        QTime.isValid(22, 5,  62); // returns false
</pre>
*/

    public native static boolean isValid(int h, int m, int s, int ms);

/**
@exclude
*/

    public static native QTime fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTime(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTime array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QTime)
        return operator_equal((com.trolltech.qt.core.QTime) other);
        return false;
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public int compareTo(Object other) {
        if (equals(other)) return 0;
        else if (other instanceof com.trolltech.qt.core.QTime) {
            if (operator_less((com.trolltech.qt.core.QTime) other)) return -1;
            else return 1;
        }
        throw new ClassCastException();
    }

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTime clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTime __qt_clone(long __this_nativeId);
}
