package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDateTimeEdit class provides a widget for editing dates and times. QDateTimeEdit allows the user to edit dates by using the keyboard or the arrow keys to increase and decrease date and time values. The arrow keys can be used to move from section to section within the QDateTimeEdit box. Dates and times appear in accordance with the format set; see {@link com.trolltech.qt.gui.QDateTimeEdit#setDisplayFormat(java.lang.String) setDisplayFormat()}. <pre class="snippet">
  QDateTimeEdit dateEdit = new QDateTimeEdit(QDate.currentDate());
  dateEdit.setMinimumDate(QDate.currentDate().addDays(-365));
  dateEdit.setMaximumDate(QDate.currentDate().addDays(365));
  dateEdit.setDisplayFormat("yyyy.MM.dd");
</pre> Here we've created a new QDateTimeEdit object initialized with today's date, and restricted the valid date range to today plus or minus 365 days. We've set the order to month, day, year. <p>The minimum value for QDateTimeEdit is 14 September 1752, and 2 January 4713BC for {@link com.trolltech.qt.core.QDate QDate}. You can change this by calling {@link com.trolltech.qt.gui.QDateTimeEdit#setMinimumDate(com.trolltech.qt.core.QDate) setMinimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setMaximumDate(com.trolltech.qt.core.QDate) setMaximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setMinimumTime(com.trolltech.qt.core.QTime) setMinimumTime()}, and {@link com.trolltech.qt.gui.QDateTimeEdit#setMaximumTime(com.trolltech.qt.core.QTime) setMaximumTime()}.<a name="using-a-pop-up-calendar-widget"><h2>Using a Pop-up Calendar Widget</h2> QDateTimeEdit can be configured to allow a {@link com.trolltech.qt.gui.QCalendarWidget QCalendarWidget} to be used to select dates. This is enabled by setting the {@link QDateTimeEdit#calendarPopup() calendarPopup} property. Additionally, you can supply a custom calendar widget for use as the calendar pop-up by calling the {@link com.trolltech.qt.gui.QDateTimeEdit#setCalendarWidget(com.trolltech.qt.gui.QCalendarWidget) setCalendarWidget()} function. The existing calendar widget can be retrieved with {@link com.trolltech.qt.gui.QDateTimeEdit#calendarWidget() calendarWidget()}. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/windowsxp-datetimeedit.png"></center><br></td><td> A date time editing widget shown in the {@link <a href="../gallery-windowsxp.html">Windows XP widget style</a>}.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/macintosh-datetimeedit.png"></center><br></td><td> A date time editing widget shown in the {@link <a href="../gallery-macintosh.html">Macintosh widget style</a>}.</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-datetimeedit.png"></center><br></td><td> A date time editing widget shown in the {@link <a href="../gallery-plastique.html">Plastique widget style</a>}.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateEdit QDateEdit}, {@link com.trolltech.qt.gui.QTimeEdit QTimeEdit}, {@link com.trolltech.qt.core.QDate QDate}, and {@link com.trolltech.qt.core.QTime QTime}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDateTimeEdit extends com.trolltech.qt.gui.QAbstractSpinBox
{
    public enum Section implements com.trolltech.qt.QtEnumerator {
/**

*/

        NoSection(0),
/**

*/

        AmPmSection(1),
/**

*/

        MSecSection(2),
/**

*/

        SecondSection(4),
/**

*/

        MinuteSection(8),
/**

*/

        HourSection(16),
/**

*/

        DaySection(256),
/**

*/

        MonthSection(512),
/**

*/

        YearSection(1024),
        TimeSections_Mask(31),
        DateSections_Mask(1792);

        Section(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QDateTimeEdit$Sections with the specified <tt>com.trolltech.qt.gui.QDateTimeEdit$Section[]</tt> QDateTimeEdit$Section values set.</brief>
*/

        public static Sections createQFlags(Section ... values) {
            return new Sections(values);
        }
/**
<brief>Returns the QDateTimeEdit$Section constant with the specified <tt>int</tt>.</brief>
*/

        public static Section resolve(int value) {
            return (Section) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoSection;
            case 1: return AmPmSection;
            case 2: return MSecSection;
            case 4: return SecondSection;
            case 8: return MinuteSection;
            case 16: return HourSection;
            case 256: return DaySection;
            case 512: return MonthSection;
            case 1024: return YearSection;
            case 31: return TimeSections_Mask;
            case 1792: return DateSections_Mask;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class Sections extends com.trolltech.qt.QFlags<Section> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QDateTimeEdit-Sections with the specified <tt>com.trolltech.qt.gui.QDateTimeEdit.Section[]</tt>. flags set.</brief>
*/

        public Sections(Section ... args) { super(args); }
        public Sections(int value) { setValue(value); }
    }


/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QDate(named: date)&gt;:<p> This signal is emitted whenever the date is changed. The new date is passed in <tt>date</tt>.
*/

    public final Signal1<com.trolltech.qt.core.QDate> dateChanged = new Signal1<com.trolltech.qt.core.QDate>();

    private final void dateChanged(com.trolltech.qt.core.QDate date)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dateChanged_QDate(nativeId(), date == null ? 0 : date.nativeId());
    }
    native void __qt_dateChanged_QDate(long __this__nativeId, long date);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QDateTime(named: datetime)&gt;:<p> This signal is emitted whenever the date or time is changed. The new date and time is passed in <tt>datetime</tt>.
*/

    public final Signal1<com.trolltech.qt.core.QDateTime> dateTimeChanged = new Signal1<com.trolltech.qt.core.QDateTime>();

    private final void dateTimeChanged(com.trolltech.qt.core.QDateTime date)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dateTimeChanged_QDateTime(nativeId(), date == null ? 0 : date.nativeId());
    }
    native void __qt_dateTimeChanged_QDateTime(long __this__nativeId, long date);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QTime(named: time)&gt;:<p> This signal is emitted whenever the time is changed. The new time is passed in <tt>time</tt>.
*/

    public final Signal1<com.trolltech.qt.core.QTime> timeChanged = new Signal1<com.trolltech.qt.core.QTime>();

    private final void timeChanged(com.trolltech.qt.core.QTime date)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timeChanged_QTime(nativeId(), date == null ? 0 : date.nativeId());
    }
    native void __qt_timeChanged_QTime(long __this__nativeId, long date);


/**
Constructs an empty date time editor with a <tt>parent</tt>.
*/

    public QDateTimeEdit() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty date time editor with a <tt>parent</tt>.
*/

    public QDateTimeEdit(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QDateTimeEdit_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDateTimeEdit_QWidget(long parent);


/**
Constructs an empty date time editor with a <tt>parent</tt>. The value is set to <tt>date</tt>.
*/

    public QDateTimeEdit(com.trolltech.qt.core.QDate d) {
        this(d, (com.trolltech.qt.gui.QWidget)null);
    }
    public QDateTimeEdit(com.trolltech.qt.core.QDate d, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QDateTimeEdit_QDate_QWidget(d == null ? 0 : d.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDateTimeEdit_QDate_QWidget(long d, long parent);


/**
Constructs an empty date time editor with a <tt>parent</tt>. The value is set to <tt>datetime</tt>.
*/

    public QDateTimeEdit(com.trolltech.qt.core.QDateTime dt) {
        this(dt, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty date time editor with a <tt>parent</tt>. The value is set to <tt>datetime</tt>.
*/

/**
Constructs an empty date time editor with a <tt>parent</tt>. The value is set to <tt>date</tt>.
*/

    public QDateTimeEdit(com.trolltech.qt.core.QDateTime dt, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QDateTimeEdit_QDateTime_QWidget(dt == null ? 0 : dt.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDateTimeEdit_QDateTime_QWidget(long dt, long parent);


/**
Constructs an empty date time editor with a <tt>parent</tt>. The value is set to <tt>time</tt>.
*/

    public QDateTimeEdit(com.trolltech.qt.core.QTime t) {
        this(t, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty date time editor with a <tt>parent</tt>. The value is set to <tt>time</tt>.
*/

    public QDateTimeEdit(com.trolltech.qt.core.QTime t, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QDateTimeEdit_QTime_QWidget(t == null ? 0 : t.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDateTimeEdit_QTime_QWidget(long t, long parent);


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDateTimeEdit(java.lang.Object val, int parserType) {
        this(val, parserType, (com.trolltech.qt.gui.QWidget)null);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDateTimeEdit(java.lang.Object val, int parserType, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QDateTimeEdit_Object_int_QWidget(val, parserType, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDateTimeEdit_Object_int_QWidget(java.lang.Object val, int parserType, long parent);

/**
This property holds the current calender pop-up showing mode.  The calendar pop-up will be shown upon clicking the arrow button. This property is valid only if there is a valid date display format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#setDisplayFormat(java.lang.String) setDisplayFormat()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="calendarPopup")
    @QtBlockedSlot
    public final boolean calendarPopup()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_calendarPopup(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_calendarPopup(long __this__nativeId);

/**
Returns the calendar widget for the editor if {@link QDateTimeEdit#calendarPopup() calendarPopup} is set to true and (sections() & {@link com.trolltech.qt.gui.QDateTimeEdit.Section DateSections_Mask }) != 0. This function creates and returns a calendar widget if none has been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#setCalendarWidget(com.trolltech.qt.gui.QCalendarWidget) setCalendarWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QCalendarWidget calendarWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_calendarWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QCalendarWidget __qt_calendarWidget(long __this__nativeId);

/**
This property holds the maximum date of the date time edit. When setting this property the {@link QDateTimeEdit#minimumDate() minimumDate} is adjusted if necessary to ensure that the range remains valid. If the date is not a valid {@link com.trolltech.qt.core.QDate QDate} object, this function does nothing. <p>By default, this property contains a date that refers to December 31, 7999. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#minimumDate() minimumDate}, {@link QDateTimeEdit#minimumTime() minimumTime}, {@link QDateTimeEdit#maximumTime() maximumTime}, and {@link com.trolltech.qt.gui.QDateTimeEdit#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyResetter(name="maximumDate")
    @QtBlockedSlot
    public final void clearMaximumDate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearMaximumDate(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearMaximumDate(long __this__nativeId);

/**
This property holds the maximum datetime of the date time edit. When setting this property the {@link com.trolltech.qt.gui.QDateTimeEdit#minimumDateTime() minimumDateTime()} is adjusted if necessary to ensure that the range remains valid. If the datetime is not a valid {@link com.trolltech.qt.core.QDateTime QDateTime} object, this function does nothing. <p>The default {@link QDateTimeEdit#maximumDateTime() maximumDateTime} can be restored with {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumDateTime() clearMaximumDateTime()}. <p>By default, this property contains a date that refers to 31 December, 7999 and a time of 23:59:59 and 999 milliseconds. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#minimumDateTime() minimumDateTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#minimumTime() minimumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumTime() maximumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#minimumDate() minimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumDate() maximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setDateTimeRange(com.trolltech.qt.core.QDateTime, com.trolltech.qt.core.QDateTime) setDateTimeRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setTimeRange(com.trolltech.qt.core.QTime, com.trolltech.qt.core.QTime) setTimeRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDateTime() clearMinimumDateTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDate() clearMinimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumDate() clearMaximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumTime() clearMinimumTime()}, and {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumTime() clearMaximumTime()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyResetter(name="maximumDateTime")
    @QtBlockedSlot
    public final void clearMaximumDateTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearMaximumDateTime(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearMaximumDateTime(long __this__nativeId);

/**
This property holds the maximum time of the date time edit. When setting this property, the {@link QDateTimeEdit#minimumTime() minimumTime} is adjusted if necessary to ensure that the range remains valid. If the time is not a valid {@link com.trolltech.qt.core.QTime QTime} object, this function does nothing. <p>By default, this property contains a time of 23:59:59 and 999 milliseconds. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#minimumTime() minimumTime}, {@link QDateTimeEdit#minimumDate() minimumDate}, {@link QDateTimeEdit#maximumDate() maximumDate}, and {@link com.trolltech.qt.gui.QDateTimeEdit#setTimeRange(com.trolltech.qt.core.QTime, com.trolltech.qt.core.QTime) setTimeRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyResetter(name="maximumTime")
    @QtBlockedSlot
    public final void clearMaximumTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearMaximumTime(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearMaximumTime(long __this__nativeId);

/**
This property holds the minimum date of the date time edit. When setting this property the {@link QDateTimeEdit#maximumDate() maximumDate} is adjusted if necessary, to ensure that the range remains valid. If the date is not a valid {@link com.trolltech.qt.core.QDate QDate} object, this function does nothing. <p>By default, this property contains a date that refers to September 14, 1752. The minimum date must be at least the first day in year 100, otherwise {@link com.trolltech.qt.gui.QDateTimeEdit#setMinimumDate(com.trolltech.qt.core.QDate) setMinimumDate()} has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#minimumTime() minimumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumTime() maximumTime()}, and {@link com.trolltech.qt.gui.QDateTimeEdit#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyResetter(name="minimumDate")
    @QtBlockedSlot
    public final void clearMinimumDate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearMinimumDate(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearMinimumDate(long __this__nativeId);

/**
This property holds the minimum datetime of the date time edit. When setting this property the {@link com.trolltech.qt.gui.QDateTimeEdit#maximumDateTime() maximumDateTime()} is adjusted if necessary to ensure that the range remains valid. If the datetime is not a valid {@link com.trolltech.qt.core.QDateTime QDateTime} object, this function does nothing. <p>The default {@link QDateTimeEdit#minimumDateTime() minimumDateTime} can be restored with {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDateTime() clearMinimumDateTime()} <p>By default, this property contains a date that refers to September 14, 1752 and a time of 00:00:00 and 0 milliseconds. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#maximumDateTime() maximumDateTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#minimumTime() minimumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumTime() maximumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#minimumDate() minimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumDate() maximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setDateTimeRange(com.trolltech.qt.core.QDateTime, com.trolltech.qt.core.QDateTime) setDateTimeRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setTimeRange(com.trolltech.qt.core.QTime, com.trolltech.qt.core.QTime) setTimeRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumDateTime() clearMaximumDateTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDate() clearMinimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumDate() clearMaximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumTime() clearMinimumTime()}, and {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumTime() clearMaximumTime()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyResetter(name="minimumDateTime")
    @QtBlockedSlot
    public final void clearMinimumDateTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearMinimumDateTime(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearMinimumDateTime(long __this__nativeId);

/**
This property holds the minimum time of the date time edit. When setting this property the {@link QDateTimeEdit#maximumTime() maximumTime} is adjusted if necessary, to ensure that the range remains valid. If the time is not a valid {@link com.trolltech.qt.core.QTime QTime} object, this function does nothing. <p>By default, this property contains a time of 00:00:00 and 0 milliseconds. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#maximumTime() maximumTime}, {@link QDateTimeEdit#minimumDate() minimumDate}, {@link QDateTimeEdit#maximumDate() maximumDate}, and {@link com.trolltech.qt.gui.QDateTimeEdit#setTimeRange(com.trolltech.qt.core.QTime, com.trolltech.qt.core.QTime) setTimeRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyResetter(name="minimumTime")
    @QtBlockedSlot
    public final void clearMinimumTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearMinimumTime(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearMinimumTime(long __this__nativeId);

/**
This property holds the current section of the spinbox <tt>setCurrentSection()</tt>.
*/

    @com.trolltech.qt.QtPropertyReader(name="currentSection")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QDateTimeEdit.Section currentSection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QDateTimeEdit.Section.resolve(__qt_currentSection(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_currentSection(long __this__nativeId);

/**
This property holds the current section index of the spinbox. If the format is 'yyyy/MM/dd', the displayText is '2001/05/21' and the cursorPosition is 5 {@link QDateTimeEdit#currentSectionIndex() currentSectionIndex} returns 1. If the cursorPosition is 3 {@link QDateTimeEdit#currentSectionIndex() currentSectionIndex} is 0 etc. <p><tt>setCurrentSection()</tt> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#currentSection() currentSection()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="currentSectionIndex")
    @QtBlockedSlot
    public final int currentSectionIndex()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentSectionIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentSectionIndex(long __this__nativeId);

/**
This property holds the {@link com.trolltech.qt.core.QDate QDate} that is set in the QDateTimeEdit. By default, this property contains a date that refers to January 1, 2000. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#time() time}, and {@link QDateTimeEdit#dateTime() dateTime}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="date")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate date()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_date(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDate __qt_date(long __this__nativeId);

/**
This property holds the {@link com.trolltech.qt.core.QDateTime QDateTime} that is set in the QDateTimeEdit. By default, this property contains a date that refers to January 1, 2000 and a time of 00:00:00 and 0 milliseconds. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#date() date}, and {@link QDateTimeEdit#time() time}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="dateTime")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime dateTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dateTime(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_dateTime(long __this__nativeId);

/**
This property holds the format used to display the time/date of the date time edit. This format is the same as the one used described in {@link com.trolltech.qt.core.QDateTime#toString() QDateTime::toString()} and {@link com.trolltech.qt.core.QDateTime#fromString(java.lang.String) QDateTime::fromString()} <p>Example format strings(assuming that the date is 2nd of July 1969): <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Format</center></th><th><center> Result</center></th></tr></thead><tr valign="top" class="even"><td> dd.MM.yyyy</td><td> 02.07.1969</td></tr><tr valign="top" class="odd"><td> MMM d yy</td><td> Jul 2 69</td></tr><tr valign="top" class="even"><td> MMMM d yy</td><td> July 2 69</td></tr></table> Note that if you specify a two digit year, it will be interpreted to be in the century in which the date time edit was initialized. The default century is the 21 (2000-2099). <p>If you specify an invalid format the format will not be set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#toString() QDateTime::toString()}, and {@link com.trolltech.qt.gui.QDateTimeEdit#displayedSections() displayedSections()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="displayFormat")
    @QtBlockedSlot
    public final java.lang.String displayFormat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_displayFormat(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_displayFormat(long __this__nativeId);

/**
This property holds the currently displayed fields of the date time edit. Returns a bit set of the displayed sections for this format. <tt>setDisplayFormat()</tt>, {@link com.trolltech.qt.gui.QDateTimeEdit#displayFormat() displayFormat()}
*/

    @com.trolltech.qt.QtPropertyReader(name="displayedSections")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QDateTimeEdit.Sections displayedSections()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QDateTimeEdit.Sections(__qt_displayedSections(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_displayedSections(long __this__nativeId);

    @QtBlockedSlot
    private final void initDateTimeEditStyleOption(com.trolltech.qt.QNativePointer option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initDateTimeEditStyleOption_nativepointer(nativeId(), option);
    }
    @QtBlockedSlot
    native void __qt_initDateTimeEditStyleOption_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer option);

/**
This property holds the maximum date of the date time edit. When setting this property the {@link QDateTimeEdit#minimumDate() minimumDate} is adjusted if necessary to ensure that the range remains valid. If the date is not a valid {@link com.trolltech.qt.core.QDate QDate} object, this function does nothing. <p>By default, this property contains a date that refers to December 31, 7999. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#minimumDate() minimumDate}, {@link QDateTimeEdit#minimumTime() minimumTime}, {@link QDateTimeEdit#maximumTime() maximumTime}, and {@link com.trolltech.qt.gui.QDateTimeEdit#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="maximumDate")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate maximumDate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumDate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDate __qt_maximumDate(long __this__nativeId);

/**
This property holds the maximum datetime of the date time edit. When setting this property the {@link com.trolltech.qt.gui.QDateTimeEdit#minimumDateTime() minimumDateTime()} is adjusted if necessary to ensure that the range remains valid. If the datetime is not a valid {@link com.trolltech.qt.core.QDateTime QDateTime} object, this function does nothing. <p>The default {@link QDateTimeEdit#maximumDateTime() maximumDateTime} can be restored with {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumDateTime() clearMaximumDateTime()}. <p>By default, this property contains a date that refers to 31 December, 7999 and a time of 23:59:59 and 999 milliseconds. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#minimumDateTime() minimumDateTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#minimumTime() minimumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumTime() maximumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#minimumDate() minimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumDate() maximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setDateTimeRange(com.trolltech.qt.core.QDateTime, com.trolltech.qt.core.QDateTime) setDateTimeRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setTimeRange(com.trolltech.qt.core.QTime, com.trolltech.qt.core.QTime) setTimeRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDateTime() clearMinimumDateTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDate() clearMinimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumDate() clearMaximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumTime() clearMinimumTime()}, and {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumTime() clearMaximumTime()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="maximumDateTime")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime maximumDateTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumDateTime(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_maximumDateTime(long __this__nativeId);

/**
This property holds the maximum time of the date time edit. When setting this property, the {@link QDateTimeEdit#minimumTime() minimumTime} is adjusted if necessary to ensure that the range remains valid. If the time is not a valid {@link com.trolltech.qt.core.QTime QTime} object, this function does nothing. <p>By default, this property contains a time of 23:59:59 and 999 milliseconds. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#minimumTime() minimumTime}, {@link QDateTimeEdit#minimumDate() minimumDate}, {@link QDateTimeEdit#maximumDate() maximumDate}, and {@link com.trolltech.qt.gui.QDateTimeEdit#setTimeRange(com.trolltech.qt.core.QTime, com.trolltech.qt.core.QTime) setTimeRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="maximumTime")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QTime maximumTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumTime(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTime __qt_maximumTime(long __this__nativeId);

/**
This property holds the minimum date of the date time edit. When setting this property the {@link QDateTimeEdit#maximumDate() maximumDate} is adjusted if necessary, to ensure that the range remains valid. If the date is not a valid {@link com.trolltech.qt.core.QDate QDate} object, this function does nothing. <p>By default, this property contains a date that refers to September 14, 1752. The minimum date must be at least the first day in year 100, otherwise {@link com.trolltech.qt.gui.QDateTimeEdit#setMinimumDate(com.trolltech.qt.core.QDate) setMinimumDate()} has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#minimumTime() minimumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumTime() maximumTime()}, and {@link com.trolltech.qt.gui.QDateTimeEdit#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="minimumDate")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate minimumDate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumDate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDate __qt_minimumDate(long __this__nativeId);

/**
This property holds the minimum datetime of the date time edit. When setting this property the {@link com.trolltech.qt.gui.QDateTimeEdit#maximumDateTime() maximumDateTime()} is adjusted if necessary to ensure that the range remains valid. If the datetime is not a valid {@link com.trolltech.qt.core.QDateTime QDateTime} object, this function does nothing. <p>The default {@link QDateTimeEdit#minimumDateTime() minimumDateTime} can be restored with {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDateTime() clearMinimumDateTime()} <p>By default, this property contains a date that refers to September 14, 1752 and a time of 00:00:00 and 0 milliseconds. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#maximumDateTime() maximumDateTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#minimumTime() minimumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumTime() maximumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#minimumDate() minimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumDate() maximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setDateTimeRange(com.trolltech.qt.core.QDateTime, com.trolltech.qt.core.QDateTime) setDateTimeRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setTimeRange(com.trolltech.qt.core.QTime, com.trolltech.qt.core.QTime) setTimeRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumDateTime() clearMaximumDateTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDate() clearMinimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumDate() clearMaximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumTime() clearMinimumTime()}, and {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumTime() clearMaximumTime()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="minimumDateTime")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime minimumDateTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumDateTime(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_minimumDateTime(long __this__nativeId);

/**
This property holds the minimum time of the date time edit. When setting this property the {@link QDateTimeEdit#maximumTime() maximumTime} is adjusted if necessary, to ensure that the range remains valid. If the time is not a valid {@link com.trolltech.qt.core.QTime QTime} object, this function does nothing. <p>By default, this property contains a time of 00:00:00 and 0 milliseconds. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#maximumTime() maximumTime}, {@link QDateTimeEdit#minimumDate() minimumDate}, {@link QDateTimeEdit#maximumDate() maximumDate}, and {@link com.trolltech.qt.gui.QDateTimeEdit#setTimeRange(com.trolltech.qt.core.QTime, com.trolltech.qt.core.QTime) setTimeRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="minimumTime")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QTime minimumTime()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumTime(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTime __qt_minimumTime(long __this__nativeId);

/**
Returns the Section at <tt>index</tt>. <p>If the format is 'yyyy/MM/dd', sectionAt(0) returns {@link com.trolltech.qt.gui.QDateTimeEdit.Section YearSection }, sectionAt(1) returns {@link com.trolltech.qt.gui.QDateTimeEdit.Section MonthSection }, and sectionAt(2) returns {@link com.trolltech.qt.gui.QDateTimeEdit.Section YearSection },
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QDateTimeEdit.Section sectionAt(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QDateTimeEdit.Section.resolve(__qt_sectionAt_int(nativeId(), index));
    }
    @QtBlockedSlot
    native int __qt_sectionAt_int(long __this__nativeId, int index);

/**
This property holds the number of sections displayed. If the format is 'yyyy/yy/yyyy', {@link QDateTimeEdit#sectionCount() sectionCount} returns 3.
*/

    @com.trolltech.qt.QtPropertyReader(name="sectionCount")
    @QtBlockedSlot
    public final int sectionCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sectionCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_sectionCount(long __this__nativeId);

/**
Returns the text from the given <tt>section</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#currentSection() currentSection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String sectionText(com.trolltech.qt.gui.QDateTimeEdit.Section section)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sectionText_Section(nativeId(), section.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_sectionText_Section(long __this__nativeId, int section);

/**
This property holds the current calender pop-up showing mode.  The calendar pop-up will be shown upon clicking the arrow button. This property is valid only if there is a valid date display format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#setDisplayFormat(java.lang.String) setDisplayFormat()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="calendarPopup")
    @QtBlockedSlot
    public final void setCalendarPopup(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCalendarPopup_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setCalendarPopup_boolean(long __this__nativeId, boolean enable);

/**
Sets the given <tt>calendarWidget</tt> as the widget to be used for the calendar pop-up. The editor does not automatically take ownership of the calendar widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#calendarWidget() calendarWidget()}, and {@link QDateTimeEdit#calendarPopup() calendarPopup}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCalendarWidget(com.trolltech.qt.gui.QCalendarWidget calendarWidget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCalendarWidget_QCalendarWidget(nativeId(), calendarWidget == null ? 0 : calendarWidget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCalendarWidget_QCalendarWidget(long __this__nativeId, long calendarWidget);

/**
This property holds the current section of the spinbox <tt>setCurrentSection()</tt>.
*/

    @com.trolltech.qt.QtPropertyWriter(name="currentSection")
    @QtBlockedSlot
    public final void setCurrentSection(com.trolltech.qt.gui.QDateTimeEdit.Section section)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentSection_Section(nativeId(), section.value());
    }
    @QtBlockedSlot
    native void __qt_setCurrentSection_Section(long __this__nativeId, int section);

/**
This property holds the current section index of the spinbox. If the format is 'yyyy/MM/dd', the displayText is '2001/05/21' and the cursorPosition is 5 {@link QDateTimeEdit#currentSectionIndex() currentSectionIndex} returns 1. If the cursorPosition is 3 {@link QDateTimeEdit#currentSectionIndex() currentSectionIndex} is 0 etc. <p><tt>setCurrentSection()</tt> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#currentSection() currentSection()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="currentSectionIndex")
    @QtBlockedSlot
    public final void setCurrentSectionIndex(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentSectionIndex_int(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_setCurrentSectionIndex_int(long __this__nativeId, int index);

/**
This property holds the {@link com.trolltech.qt.core.QDate QDate} that is set in the QDateTimeEdit. By default, this property contains a date that refers to January 1, 2000. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#time() time}, and {@link QDateTimeEdit#dateTime() dateTime}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="date")
    public final void setDate(com.trolltech.qt.core.QDate date)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDate_QDate(nativeId(), date == null ? 0 : date.nativeId());
    }
    native void __qt_setDate_QDate(long __this__nativeId, long date);

/**
Convenience function to set minimum and maximum date with one function call. <pre class="snippet">
  setDateRange(min, max);
</pre> is analogous to: <pre class="snippet">
  setMinimumDate(min);
  setMaximumDate(max);
</pre> If either <tt>min</tt> or <tt>max</tt> are not valid, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#setMinimumDate(com.trolltech.qt.core.QDate) setMinimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumDate() maximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setMaximumDate(com.trolltech.qt.core.QDate) setMaximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDate() clearMinimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setMinimumTime(com.trolltech.qt.core.QTime) setMinimumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumTime() maximumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setMaximumTime(com.trolltech.qt.core.QTime) setMaximumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumTime() clearMinimumTime()}, and {@link com.trolltech.qt.core.QDate#isValid() QDate::isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDateRange(com.trolltech.qt.core.QDate min, com.trolltech.qt.core.QDate max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDateRange_QDate_QDate(nativeId(), min == null ? 0 : min.nativeId(), max == null ? 0 : max.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDateRange_QDate_QDate(long __this__nativeId, long min, long max);

/**
This property holds the {@link com.trolltech.qt.core.QDateTime QDateTime} that is set in the QDateTimeEdit. By default, this property contains a date that refers to January 1, 2000 and a time of 00:00:00 and 0 milliseconds. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#date() date}, and {@link QDateTimeEdit#time() time}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="dateTime")
    public final void setDateTime(com.trolltech.qt.core.QDateTime dateTime)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDateTime_QDateTime(nativeId(), dateTime == null ? 0 : dateTime.nativeId());
    }
    native void __qt_setDateTime_QDateTime(long __this__nativeId, long dateTime);

/**
Convenience function to set minimum and maximum date time with one function call. <pre class="snippet">
  setDateTimeRange(min, max);
</pre> is analogous to: <pre class="snippet">
  setMinimumDateTime(min);
  setMaximumDateTime(max);
</pre> If either <tt>min</tt> or <tt>max</tt> are not valid, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#setMinimumDate(com.trolltech.qt.core.QDate) setMinimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumDate() maximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setMaximumDate(com.trolltech.qt.core.QDate) setMaximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDate() clearMinimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setMinimumTime(com.trolltech.qt.core.QTime) setMinimumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumTime() maximumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setMaximumTime(com.trolltech.qt.core.QTime) setMaximumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumTime() clearMinimumTime()}, and {@link com.trolltech.qt.core.QDateTime#isValid() QDateTime::isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDateTimeRange(com.trolltech.qt.core.QDateTime min, com.trolltech.qt.core.QDateTime max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDateTimeRange_QDateTime_QDateTime(nativeId(), min == null ? 0 : min.nativeId(), max == null ? 0 : max.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDateTimeRange_QDateTime_QDateTime(long __this__nativeId, long min, long max);

/**
This property holds the format used to display the time/date of the date time edit. This format is the same as the one used described in {@link com.trolltech.qt.core.QDateTime#toString() QDateTime::toString()} and {@link com.trolltech.qt.core.QDateTime#fromString(java.lang.String) QDateTime::fromString()} <p>Example format strings(assuming that the date is 2nd of July 1969): <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Format</center></th><th><center> Result</center></th></tr></thead><tr valign="top" class="even"><td> dd.MM.yyyy</td><td> 02.07.1969</td></tr><tr valign="top" class="odd"><td> MMM d yy</td><td> Jul 2 69</td></tr><tr valign="top" class="even"><td> MMMM d yy</td><td> July 2 69</td></tr></table> Note that if you specify a two digit year, it will be interpreted to be in the century in which the date time edit was initialized. The default century is the 21 (2000-2099). <p>If you specify an invalid format the format will not be set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#toString() QDateTime::toString()}, and {@link com.trolltech.qt.gui.QDateTimeEdit#displayedSections() displayedSections()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="displayFormat")
    @QtBlockedSlot
    public final void setDisplayFormat(java.lang.String format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDisplayFormat_String(nativeId(), format);
    }
    @QtBlockedSlot
    native void __qt_setDisplayFormat_String(long __this__nativeId, java.lang.String format);

/**
This property holds the maximum date of the date time edit. When setting this property the {@link QDateTimeEdit#minimumDate() minimumDate} is adjusted if necessary to ensure that the range remains valid. If the date is not a valid {@link com.trolltech.qt.core.QDate QDate} object, this function does nothing. <p>By default, this property contains a date that refers to December 31, 7999. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#minimumDate() minimumDate}, {@link QDateTimeEdit#minimumTime() minimumTime}, {@link QDateTimeEdit#maximumTime() maximumTime}, and {@link com.trolltech.qt.gui.QDateTimeEdit#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximumDate")
    @QtBlockedSlot
    public final void setMaximumDate(com.trolltech.qt.core.QDate max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumDate_QDate(nativeId(), max == null ? 0 : max.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMaximumDate_QDate(long __this__nativeId, long max);

/**
This property holds the maximum datetime of the date time edit. When setting this property the {@link com.trolltech.qt.gui.QDateTimeEdit#minimumDateTime() minimumDateTime()} is adjusted if necessary to ensure that the range remains valid. If the datetime is not a valid {@link com.trolltech.qt.core.QDateTime QDateTime} object, this function does nothing. <p>The default {@link QDateTimeEdit#maximumDateTime() maximumDateTime} can be restored with {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumDateTime() clearMaximumDateTime()}. <p>By default, this property contains a date that refers to 31 December, 7999 and a time of 23:59:59 and 999 milliseconds. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#minimumDateTime() minimumDateTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#minimumTime() minimumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumTime() maximumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#minimumDate() minimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumDate() maximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setDateTimeRange(com.trolltech.qt.core.QDateTime, com.trolltech.qt.core.QDateTime) setDateTimeRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setTimeRange(com.trolltech.qt.core.QTime, com.trolltech.qt.core.QTime) setTimeRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDateTime() clearMinimumDateTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDate() clearMinimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumDate() clearMaximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumTime() clearMinimumTime()}, and {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumTime() clearMaximumTime()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximumDateTime")
    @QtBlockedSlot
    public final void setMaximumDateTime(com.trolltech.qt.core.QDateTime dt)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumDateTime_QDateTime(nativeId(), dt == null ? 0 : dt.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMaximumDateTime_QDateTime(long __this__nativeId, long dt);

/**
This property holds the maximum time of the date time edit. When setting this property, the {@link QDateTimeEdit#minimumTime() minimumTime} is adjusted if necessary to ensure that the range remains valid. If the time is not a valid {@link com.trolltech.qt.core.QTime QTime} object, this function does nothing. <p>By default, this property contains a time of 23:59:59 and 999 milliseconds. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#minimumTime() minimumTime}, {@link QDateTimeEdit#minimumDate() minimumDate}, {@link QDateTimeEdit#maximumDate() maximumDate}, and {@link com.trolltech.qt.gui.QDateTimeEdit#setTimeRange(com.trolltech.qt.core.QTime, com.trolltech.qt.core.QTime) setTimeRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximumTime")
    @QtBlockedSlot
    public final void setMaximumTime(com.trolltech.qt.core.QTime max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumTime_QTime(nativeId(), max == null ? 0 : max.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMaximumTime_QTime(long __this__nativeId, long max);

/**
This property holds the minimum date of the date time edit. When setting this property the {@link QDateTimeEdit#maximumDate() maximumDate} is adjusted if necessary, to ensure that the range remains valid. If the date is not a valid {@link com.trolltech.qt.core.QDate QDate} object, this function does nothing. <p>By default, this property contains a date that refers to September 14, 1752. The minimum date must be at least the first day in year 100, otherwise {@link com.trolltech.qt.gui.QDateTimeEdit#setMinimumDate(com.trolltech.qt.core.QDate) setMinimumDate()} has no effect. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#minimumTime() minimumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumTime() maximumTime()}, and {@link com.trolltech.qt.gui.QDateTimeEdit#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimumDate")
    @QtBlockedSlot
    public final void setMinimumDate(com.trolltech.qt.core.QDate min)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumDate_QDate(nativeId(), min == null ? 0 : min.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMinimumDate_QDate(long __this__nativeId, long min);

/**
This property holds the minimum datetime of the date time edit. When setting this property the {@link com.trolltech.qt.gui.QDateTimeEdit#maximumDateTime() maximumDateTime()} is adjusted if necessary to ensure that the range remains valid. If the datetime is not a valid {@link com.trolltech.qt.core.QDateTime QDateTime} object, this function does nothing. <p>The default {@link QDateTimeEdit#minimumDateTime() minimumDateTime} can be restored with {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDateTime() clearMinimumDateTime()} <p>By default, this property contains a date that refers to September 14, 1752 and a time of 00:00:00 and 0 milliseconds. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#maximumDateTime() maximumDateTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#minimumTime() minimumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumTime() maximumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#minimumDate() minimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumDate() maximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setDateTimeRange(com.trolltech.qt.core.QDateTime, com.trolltech.qt.core.QDateTime) setDateTimeRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setTimeRange(com.trolltech.qt.core.QTime, com.trolltech.qt.core.QTime) setTimeRange()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumDateTime() clearMaximumDateTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDate() clearMinimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumDate() clearMaximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumTime() clearMinimumTime()}, and {@link com.trolltech.qt.gui.QDateTimeEdit#clearMaximumTime() clearMaximumTime()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimumDateTime")
    @QtBlockedSlot
    public final void setMinimumDateTime(com.trolltech.qt.core.QDateTime dt)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumDateTime_QDateTime(nativeId(), dt == null ? 0 : dt.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMinimumDateTime_QDateTime(long __this__nativeId, long dt);

/**
This property holds the minimum time of the date time edit. When setting this property the {@link QDateTimeEdit#maximumTime() maximumTime} is adjusted if necessary, to ensure that the range remains valid. If the time is not a valid {@link com.trolltech.qt.core.QTime QTime} object, this function does nothing. <p>By default, this property contains a time of 00:00:00 and 0 milliseconds. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#maximumTime() maximumTime}, {@link QDateTimeEdit#minimumDate() minimumDate}, {@link QDateTimeEdit#maximumDate() maximumDate}, and {@link com.trolltech.qt.gui.QDateTimeEdit#setTimeRange(com.trolltech.qt.core.QTime, com.trolltech.qt.core.QTime) setTimeRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimumTime")
    @QtBlockedSlot
    public final void setMinimumTime(com.trolltech.qt.core.QTime min)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumTime_QTime(nativeId(), min == null ? 0 : min.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMinimumTime_QTime(long __this__nativeId, long min);

/**
Selects <tt>section</tt>. If <tt>section</tt> doesn't exist in the currently displayed sections this function does nothing. If <tt>section</tt> is {@link com.trolltech.qt.gui.QDateTimeEdit.Section NoSection } this function will unselect all text in the editor. Otherwise this function will move the cursor and the current section to the selected section. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#currentSection() currentSection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSelectedSection(com.trolltech.qt.gui.QDateTimeEdit.Section section)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectedSection_Section(nativeId(), section.value());
    }
    @QtBlockedSlot
    native void __qt_setSelectedSection_Section(long __this__nativeId, int section);

/**
This property holds the {@link com.trolltech.qt.core.QTime QTime} that is set in the QDateTimeEdit. By default, this property contains a time of 00:00:00 and 0 milliseconds. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#date() date}, and {@link QDateTimeEdit#dateTime() dateTime}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="time")
    public final void setTime(com.trolltech.qt.core.QTime time)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTime_QTime(nativeId(), time == null ? 0 : time.nativeId());
    }
    native void __qt_setTime_QTime(long __this__nativeId, long time);

/**
Convenience function to set minimum and maximum time with one function call. <pre class="snippet">
  setTimeRange(min, max);
</pre> is analogous to: <pre class="snippet">
  setMinimumTime(min);
  setMaximumTime(max);
</pre> If either <tt>min</tt> or <tt>max</tt> are not valid, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#setMinimumDate(com.trolltech.qt.core.QDate) setMinimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumDate() maximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setMaximumDate(com.trolltech.qt.core.QDate) setMaximumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumDate() clearMinimumDate()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setMinimumTime(com.trolltech.qt.core.QTime) setMinimumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#maximumTime() maximumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#setMaximumTime(com.trolltech.qt.core.QTime) setMaximumTime()}, {@link com.trolltech.qt.gui.QDateTimeEdit#clearMinimumTime() clearMinimumTime()}, and {@link com.trolltech.qt.core.QTime#isValid() QTime::isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTimeRange(com.trolltech.qt.core.QTime min, com.trolltech.qt.core.QTime max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTimeRange_QTime_QTime(nativeId(), min == null ? 0 : min.nativeId(), max == null ? 0 : max.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTimeRange_QTime_QTime(long __this__nativeId, long min, long max);

/**
This property holds the current timespec used by the date time edit.  All dates/passed to the date time edit will be converted to this timespec.
*/

    @com.trolltech.qt.QtPropertyWriter(name="timeSpec")
    @QtBlockedSlot
    public final void setTimeSpec(com.trolltech.qt.core.Qt.TimeSpec spec)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTimeSpec_TimeSpec(nativeId(), spec.value());
    }
    @QtBlockedSlot
    native void __qt_setTimeSpec_TimeSpec(long __this__nativeId, int spec);

/**
This property holds the {@link com.trolltech.qt.core.QTime QTime} that is set in the QDateTimeEdit. By default, this property contains a time of 00:00:00 and 0 milliseconds. <p><DT><b>See also:</b><br><DD>{@link QDateTimeEdit#date() date}, and {@link QDateTimeEdit#dateTime() dateTime}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="time")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QTime time()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_time(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTime __qt_time(long __this__nativeId);

/**
This property holds the current timespec used by the date time edit.  All dates/passed to the date time edit will be converted to this timespec.
*/

    @com.trolltech.qt.QtPropertyReader(name="timeSpec")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.TimeSpec timeSpec()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.TimeSpec.resolve(__qt_timeSpec(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_timeSpec(long __this__nativeId);

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
Returns an appropriate datetime for the given <tt>text</tt>. <p>This virtual function is used by the datetime edit whenever it needs to interpret text entered by the user as a value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#textFromDateTime(com.trolltech.qt.core.QDateTime) textFromDateTime()}, and {@link com.trolltech.qt.gui.QAbstractSpinBox#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.QDateTime dateTimeFromText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dateTimeFromText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_dateTimeFromText_String(long __this__nativeId, java.lang.String text);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.String fixup(java.lang.String input)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fixup_nativepointer(nativeId(), input);
    }
    @QtBlockedSlot
    native java.lang.String __qt_fixup_nativepointer(long __this__nativeId, java.lang.String input);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected boolean focusNextPrevChild(boolean next)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusNextPrevChild_boolean(nativeId(), next);
    }
    @QtBlockedSlot
    native boolean __qt_focusNextPrevChild_boolean(long __this__nativeId, boolean next);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize sizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void stepBy(int steps)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stepBy_int(nativeId(), steps);
    }
    @QtBlockedSlot
    native void __qt_stepBy_int(long __this__nativeId, int steps);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected com.trolltech.qt.gui.QAbstractSpinBox.StepEnabled stepEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QAbstractSpinBox.StepEnabled(__qt_stepEnabled(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_stepEnabled(long __this__nativeId);

/**
This virtual function is used by the date time edit whenever it needs to display <tt>dateTime</tt>. <p>If you reimplement this, you may also need to reimplement {@link com.trolltech.qt.gui.QAbstractSpinBox#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateTimeEdit#dateTimeFromText(java.lang.String) dateTimeFromText()}, and {@link com.trolltech.qt.gui.QAbstractSpinBox#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected java.lang.String textFromDateTime(com.trolltech.qt.core.QDateTime dt)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_textFromDateTime_QDateTime(nativeId(), dt == null ? 0 : dt.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_textFromDateTime_QDateTime(long __this__nativeId, long dt);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QValidator.State validate(com.trolltech.qt.gui.QValidator.QValidationData input)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QValidator.State.resolve(__qt_validate_nativepointer_nativepointer(nativeId(), input));
    }
    @QtBlockedSlot
    native int __qt_validate_nativepointer_nativepointer(long __this__nativeId, com.trolltech.qt.gui.QValidator.QValidationData input);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void wheelEvent(com.trolltech.qt.gui.QWheelEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wheelEvent_QWheelEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_wheelEvent_QWheelEvent(long __this__nativeId, long event);

/**
@exclude
*/

    public static native QDateTimeEdit fromNativePointer(QNativePointer nativePointer);

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

    protected QDateTimeEdit(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initializes the style option of this QDateTimeEdit.
*/

    protected final void initDateTimeEditStyleOption(QStyleOptionSpinBox option) {
        initDateTimeEditStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
