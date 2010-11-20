package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QCalendarWidget class provides a monthly based calendar widget allowing the user to select a date. <br><center><img src="../images/cleanlooks-calendarwidget.png"></center><br> The widget is initialized with the current month and year, but QCalendarWidget provides several public slots to change the year and month that is shown. The currently displayed month and year can be retrieved using the currentPageMonth() and currentPageYear() functions, respectively. <p>By default, today's date is selected, and the user can select a date using both mouse and keyboard. The currently selected date can be retrieved using the {@link com.trolltech.qt.gui.QCalendarWidget#selectedDate() selectedDate()} function. It is possible to constrain the user selection to a given date range by setting the {@link QCalendarWidget#minimumDate() minimumDate} and {@link QCalendarWidget#maximumDate() maximumDate} properties. Alternatively, both properties can be set in one go using the {@link com.trolltech.qt.gui.QCalendarWidget#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()} convenience slot. Set the {@link QCalendarWidget#selectionMode() selectionMode} property to {@link com.trolltech.qt.gui.QCalendarWidget.SelectionMode NoSelection } to prohibit the user from selecting at all. Note that a date also can be selected programmatically using the {@link com.trolltech.qt.gui.QCalendarWidget#setSelectedDate(com.trolltech.qt.core.QDate) setSelectedDate()} slot. <p>A newly created calendar widget uses abbreviated day names, and both Saturdays and Sundays are marked in red. The calendar grid is not visible. The week numbers are displayed, and the first column day is Sunday. <p>The notation of the days can be altered to a single letter abbreviations ("M" for "Monday") by setting the {@link QCalendarWidget#horizontalHeaderFormat() horizontalHeaderFormat} property to {@link com.trolltech.qt.gui.QCalendarWidget.HorizontalHeaderFormat QCalendarWidget::SingleLetterDayNames }. Setting the same property to {@link com.trolltech.qt.gui.QCalendarWidget.HorizontalHeaderFormat QCalendarWidget::LongDayNames } makes the header display the complete day names. The week numbers can be removed by setting the {@link QCalendarWidget#verticalHeaderFormat() verticalHeaderFormat} property to {@link com.trolltech.qt.gui.QCalendarWidget.VerticalHeaderFormat QCalendarWidget::NoVerticalHeader }. The calendar grid can be turned on by setting the {@link QCalendarWidget#isGridVisible() gridVisible} property to true using the {@link com.trolltech.qt.gui.QCalendarWidget#setGridVisible(boolean) setGridVisible()} function: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> <br><center><img src="../images/qcalendarwidget-grid.png"></center><br></td></tr><tr valign="top" class="odd"><td> <pre class="snippet">
            QCalendarWidget calendar = new QCalendarWidget();
            calendar.setGridVisible(true);
</pre></td></tr></table> Finally, the day in the first column can be altered using the {@link com.trolltech.qt.gui.QCalendarWidget#setFirstDayOfWeek(com.trolltech.qt.core.Qt.DayOfWeek) setFirstDayOfWeek()} function. <p>The QCalendarWidget class also provides three signals, {@link com.trolltech.qt.gui.QCalendarWidget#selectionChanged selectionChanged() }, {@link com.trolltech.qt.gui.QCalendarWidget#activated activated() } and {@link com.trolltech.qt.gui.QCalendarWidget#currentPageChanged currentPageChanged() } making it possible to respond to user interaction. <p>The rendering of the headers, weekdays or single days can be largely customized by setting {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat}'s for some special weekday, a special date or for the rendering of the headers. <p>Only a subset of the properties in {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat} are used by the calendar widget. Currently, the foreground, background and font properties are used to determine the rendering of individual cells in the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate QDate}, {@link com.trolltech.qt.gui.QDateEdit QDateEdit}, and {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QCalendarWidget extends com.trolltech.qt.gui.QWidget
{
/**
This enum type defines the various formats the horizontal header can display. <p><DT><b>See also:</b><br><DD>horizontalHeaderFormat(), and {@link com.trolltech.qt.gui.QCalendarWidget.VerticalHeaderFormat VerticalHeaderFormat }. <br></DD></DT>
*/

    public enum HorizontalHeaderFormat implements com.trolltech.qt.QtEnumerator {
/**
 The header is hidden.
*/

        NoHorizontalHeader(0),
/**
 The header displays a single letter abbreviation for day names (e.g. M for Monday).
*/

        SingleLetterDayNames(1),
/**
 The header displays a short abbreviation for day names (e.g. Mon for Monday).
*/

        ShortDayNames(2),
/**
 The header displays complete day names (e.g. Monday).
*/

        LongDayNames(3);

        HorizontalHeaderFormat(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QCalendarWidget$HorizontalHeaderFormat constant with the specified <tt>int</tt>.</brief>
*/

        public static HorizontalHeaderFormat resolve(int value) {
            return (HorizontalHeaderFormat) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoHorizontalHeader;
            case 1: return SingleLetterDayNames;
            case 2: return ShortDayNames;
            case 3: return LongDayNames;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type defines the various formats the vertical header can display. <p><DT><b>See also:</b><br><DD>verticalHeaderFormat(), and {@link com.trolltech.qt.gui.QCalendarWidget.HorizontalHeaderFormat HorizontalHeaderFormat }. <br></DD></DT>
*/

    public enum VerticalHeaderFormat implements com.trolltech.qt.QtEnumerator {
/**
 The header is hidden.
*/

        NoVerticalHeader(0),
/**
 The header displays ISO week numbers as described by {@link com.trolltech.qt.core.QDate#weekNumber() QDate::weekNumber()}.
*/

        ISOWeekNumbers(1);

        VerticalHeaderFormat(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QCalendarWidget$VerticalHeaderFormat constant with the specified <tt>int</tt>.</brief>
*/

        public static VerticalHeaderFormat resolve(int value) {
            return (VerticalHeaderFormat) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoVerticalHeader;
            case 1: return ISOWeekNumbers;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the types of selection offered to the user for selecting dates in the calendar. <p><DT><b>See also:</b><br><DD>{@link QCalendarWidget#selectionMode() selectionMode}. <br></DD></DT>
*/

    public enum SelectionMode implements com.trolltech.qt.QtEnumerator {
/**
 Dates cannot be selected.
*/

        NoSelection(0),
/**
 Single dates can be selected.
*/

        SingleSelection(1);

        SelectionMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QCalendarWidget$SelectionMode constant with the specified <tt>int</tt>.</brief>
*/

        public static SelectionMode resolve(int value) {
            return (SelectionMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoSelection;
            case 1: return SingleSelection;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QDate(named: date)&gt;:<p> This signal is emitted whenever the user presses the Return or Enter key or double-clicks a <tt>date</tt> in the calendar widget.
*/

    public final Signal1<com.trolltech.qt.core.QDate> activated = new Signal1<com.trolltech.qt.core.QDate>();

    private final void activated(com.trolltech.qt.core.QDate date)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activated_QDate(nativeId(), date == null ? 0 : date.nativeId());
    }
    native void __qt_activated_QDate(long __this__nativeId, long date);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QDate(named: date)&gt;:<p> This signal is emitted when a mouse button is clicked. The date the mouse was clicked on is specified by <tt>date</tt>. The signal is only emitted when clicked on a valid date, e.g., dates are not outside the {@link com.trolltech.qt.gui.QCalendarWidget#minimumDate() minimumDate()} and {@link com.trolltech.qt.gui.QCalendarWidget#maximumDate() maximumDate()}. If the selection mode is {@link com.trolltech.qt.gui.QCalendarWidget.SelectionMode NoSelection }, this signal will not be emitted.
*/

    public final Signal1<com.trolltech.qt.core.QDate> clicked = new Signal1<com.trolltech.qt.core.QDate>();

    private final void clicked(com.trolltech.qt.core.QDate date)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clicked_QDate(nativeId(), date == null ? 0 : date.nativeId());
    }
    native void __qt_clicked_QDate(long __this__nativeId, long date);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: year), java.lang.Integer(named: month)&gt;:<p> This signal is emitted when the currently shown month is changed. The new <tt>year</tt> and <tt>month</tt> are passed as parameters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#setCurrentPage(int, int) setCurrentPage()}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> currentPageChanged = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void currentPageChanged(int year, int month)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentPageChanged_int_int(nativeId(), year, month);
    }
    native void __qt_currentPageChanged_int_int(long __this__nativeId, int year, int month);
/**
 This signal is emitted when the currently selected date is changed. <p>The currently selected date can be changed by the user using the mouse or keyboard, or by the programmer using {@link com.trolltech.qt.gui.QCalendarWidget#setSelectedDate(com.trolltech.qt.core.QDate) setSelectedDate()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#selectedDate() selectedDate()}. <br></DD></DT>
*/

    public final Signal0 selectionChanged = new Signal0();

    private final void selectionChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectionChanged(nativeId());
    }
    native void __qt_selectionChanged(long __this__nativeId);


/**
Constructs a calendar widget with the given <tt>parent</tt>. <p>The widget is initialized with the current month and year, and the currently selected date is today. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#setCurrentPage(int, int) setCurrentPage()}. <br></DD></DT>
*/

    public QCalendarWidget() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a calendar widget with the given <tt>parent</tt>. <p>The widget is initialized with the current month and year, and the currently selected date is today. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#setCurrentPage(int, int) setCurrentPage()}. <br></DD></DT>
*/

    public QCalendarWidget(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QCalendarWidget_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QCalendarWidget_QWidget(long parent);

/**
This property holds the time an inactive date edit is shown before its contents are accepted. If the calendar widget's {@link QCalendarWidget#isDateEditEnabled() date edit is enabled}, this property specifies the amount of time (in millseconds) that the date edit remains open after the most recent user input. Once this time has elapsed, the date specified in the date edit is accepted and the popup is closed. <p>By default, the delay is defined to be 1500 milliseconds (1.5 seconds).
*/

    @com.trolltech.qt.QtPropertyReader(name="dateEditAcceptDelay")
    @QtBlockedSlot
    public final int dateEditAcceptDelay()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dateEditAcceptDelay(nativeId());
    }
    @QtBlockedSlot
    native int __qt_dateEditAcceptDelay(long __this__nativeId);

/**
Returns a QMap from {@link com.trolltech.qt.core.QDate QDate} to {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat} showing all dates that use a special format that alters their rendering. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#setDateTextFormat(com.trolltech.qt.core.QDate, com.trolltech.qt.gui.QTextCharFormat) setDateTextFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.SortedMap<com.trolltech.qt.core.QDate, com.trolltech.qt.gui.QTextCharFormat> dateTextFormat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dateTextFormat(nativeId());
    }
    @QtBlockedSlot
    native java.util.SortedMap<com.trolltech.qt.core.QDate, com.trolltech.qt.gui.QTextCharFormat> __qt_dateTextFormat(long __this__nativeId);

/**
Returns a {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat} for <tt>date</tt>. The char format can be be empty if the date is not renderd specially.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCharFormat dateTextFormat(com.trolltech.qt.core.QDate date)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dateTextFormat_QDate(nativeId(), date == null ? 0 : date.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCharFormat __qt_dateTextFormat_QDate(long __this__nativeId, long date);

/**
This property holds a value identifying the day displayed in the first column.  By default, the day displayed in the first column is Sunday
*/

    @com.trolltech.qt.QtPropertyReader(name="firstDayOfWeek")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.DayOfWeek firstDayOfWeek()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.DayOfWeek.resolve(__qt_firstDayOfWeek(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_firstDayOfWeek(long __this__nativeId);

/**
Returns the text char format for rendering the header. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#setHeaderTextFormat(com.trolltech.qt.gui.QTextCharFormat) setHeaderTextFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCharFormat headerTextFormat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_headerTextFormat(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCharFormat __qt_headerTextFormat(long __this__nativeId);

/**
This property holds the format of the horizontal header.  The default value is {@link com.trolltech.qt.gui.QCalendarWidget.HorizontalHeaderFormat QCalendarWidget::ShortDayNames }.
*/

    @com.trolltech.qt.QtPropertyReader(name="horizontalHeaderFormat")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QCalendarWidget.HorizontalHeaderFormat horizontalHeaderFormat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QCalendarWidget.HorizontalHeaderFormat.resolve(__qt_horizontalHeaderFormat(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_horizontalHeaderFormat(long __this__nativeId);

/**
This property holds whether the date edit popup is enabled. If this property is enabled, pressing a non-modifier key will cause a date edit to popup if the calendar widget has focus, allowing the user to specify a date in the form specified by the current locale. <p>By default, this property is enabled. <p>The date edit is simpler in appearance than {@link com.trolltech.qt.gui.QDateEdit QDateEdit}, but allows the user to navigate between fields using the left and right cursor keys, increment and decrement individual fields using the up and down cursor keys, and enter values directly using the number keys. <p><DT><b>See also:</b><br><DD>{@link QCalendarWidget#dateEditAcceptDelay() QCalendarWidget::dateEditAcceptDelay}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="dateEditEnabled")
    @QtBlockedSlot
    public final boolean isDateEditEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDateEditEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDateEditEnabled(long __this__nativeId);

/**
This property holds whether the table grid is displayed.  <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qcalendarwidget-grid.png"></center><br></td></tr><tr valign="top" class="odd"><td> <pre class="snippet">
            QCalendarWidget calendar = new QCalendarWidget();
            calendar.setGridVisible(true);
</pre></td></tr></table> The default value is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="gridVisible")
    @QtBlockedSlot
    public final boolean isGridVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isGridVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isGridVisible(long __this__nativeId);

/**
This property holds whether the navigation bar is shown or not. When this property is true (the default), the next month, previous month, month selection, year selection controls are shown on top. <p>When the property is set to false, these controls are hidden.
*/

    @com.trolltech.qt.QtPropertyReader(name="navigationBarVisible")
    @QtBlockedSlot
    public final boolean isNavigationBarVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNavigationBarVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNavigationBarVisible(long __this__nativeId);

/**
This property holds the maximum date of the currently specified date range.  The user will not be able to select a date which is after the currently set maximum date. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> <br><center><img src="../images/qcalendarwidget-maximum.png"></center><br></td></tr><tr valign="top" class="odd"><td> <pre class="snippet">
    QCalendarWidget calendar = new QCalendarWidget();
    calendar.setGridVisible(true);
    calendar.setMaximumDate(new QDate(2006, 7, 3));
</pre></td></tr></table> By default, the maximum date is the last day the {@link com.trolltech.qt.core.QDate QDate} class can handle. <p>When setting a maximum date, the {@link QCalendarWidget#minimumDate() minimumDate} and {@link QCalendarWidget#selectedDate() selectedDate} properties are adjusted if the selection range becomes invalid. If the provided date is not a valid {@link com.trolltech.qt.core.QDate QDate} object, the {@link com.trolltech.qt.gui.QCalendarWidget#setMaximumDate(com.trolltech.qt.core.QDate) setMaximumDate()} function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}. <br></DD></DT>
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
This property holds the minimum date of the currently specified date range.  The user will not be able to select a date that is before the currently set minimum date. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> <br><center><img src="../images/qcalendarwidget-minimum.png"></center><br></td></tr><tr valign="top" class="odd"><td> <pre class="snippet">
    QCalendarWidget calendar = new QCalendarWidget();
    calendar.setGridVisible(true);
    calendar.setMinimumDate(new QDate(2006, 6, 19));
</pre></td></tr></table> By default, the minimum date is the earliest date that the {@link com.trolltech.qt.core.QDate QDate} class can handle. <p>When setting a minimum date, the {@link QCalendarWidget#maximumDate() maximumDate} and {@link QCalendarWidget#selectedDate() selectedDate} properties are adjusted if the selection range becomes invalid. If the provided date is not a valid {@link com.trolltech.qt.core.QDate QDate} object, the {@link com.trolltech.qt.gui.QCalendarWidget#setMinimumDate(com.trolltech.qt.core.QDate) setMinimumDate()} function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}. <br></DD></DT>
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
Returns the currently displayed month. Months are numbered from 1 to 12. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#yearShown() yearShown()}, and {@link com.trolltech.qt.gui.QCalendarWidget#setCurrentPage(int, int) setCurrentPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int monthShown()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_monthShown(nativeId());
    }
    @QtBlockedSlot
    native int __qt_monthShown(long __this__nativeId);

/**
This property holds the currently selected date.  The selected date must be within the date range specified by the {@link QCalendarWidget#minimumDate() minimumDate} and {@link QCalendarWidget#maximumDate() maximumDate} properties. By default, the selected date is the current date. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="selectedDate")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate selectedDate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedDate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDate __qt_selectedDate(long __this__nativeId);

/**
This property holds the type of selection the user can make in the calendar. When this property is set to {@link com.trolltech.qt.gui.QCalendarWidget.SelectionMode SingleSelection }, the user can select a date within the minimum and maximum allowed dates, using either the mouse or the keyboard. <p>When the property is set to {@link com.trolltech.qt.gui.QCalendarWidget.SelectionMode NoSelection }, the user will be unable to select dates, but they can still be selected programmatically. Note that the date that is selected when the property is set to {@link com.trolltech.qt.gui.QCalendarWidget.SelectionMode NoSelection } will still be the selected date of the calendar. <p>The default value is {@link com.trolltech.qt.gui.QCalendarWidget.SelectionMode SingleSelection }.
*/

    @com.trolltech.qt.QtPropertyReader(name="selectionMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QCalendarWidget.SelectionMode selectionMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QCalendarWidget.SelectionMode.resolve(__qt_selectionMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_selectionMode(long __this__nativeId);

/**
Displays the given <tt>month</tt> of the given <tt>year</tt> without changing the selected date. Use the {@link com.trolltech.qt.gui.QCalendarWidget#setSelectedDate(com.trolltech.qt.core.QDate) setSelectedDate()} function to alter the selected date. <p>The currently displayed month and year can be retrieved using the currentPageMonth() and currentPageYear() functions respectively. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#yearShown() yearShown()}, {@link com.trolltech.qt.gui.QCalendarWidget#monthShown() monthShown()}, {@link com.trolltech.qt.gui.QCalendarWidget#showPreviousMonth() showPreviousMonth()}, {@link com.trolltech.qt.gui.QCalendarWidget#showNextMonth() showNextMonth()}, {@link com.trolltech.qt.gui.QCalendarWidget#showPreviousYear() showPreviousYear()}, and {@link com.trolltech.qt.gui.QCalendarWidget#showNextYear() showNextYear()}. <br></DD></DT>
*/

    public final void setCurrentPage(int year, int month)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentPage_int_int(nativeId(), year, month);
    }
    native void __qt_setCurrentPage_int_int(long __this__nativeId, int year, int month);

/**
This property holds the time an inactive date edit is shown before its contents are accepted. If the calendar widget's {@link QCalendarWidget#isDateEditEnabled() date edit is enabled}, this property specifies the amount of time (in millseconds) that the date edit remains open after the most recent user input. Once this time has elapsed, the date specified in the date edit is accepted and the popup is closed. <p>By default, the delay is defined to be 1500 milliseconds (1.5 seconds).
*/

    @com.trolltech.qt.QtPropertyWriter(name="dateEditAcceptDelay")
    @QtBlockedSlot
    public final void setDateEditAcceptDelay(int delay)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDateEditAcceptDelay_int(nativeId(), delay);
    }
    @QtBlockedSlot
    native void __qt_setDateEditAcceptDelay_int(long __this__nativeId, int delay);

/**
This property holds whether the date edit popup is enabled. If this property is enabled, pressing a non-modifier key will cause a date edit to popup if the calendar widget has focus, allowing the user to specify a date in the form specified by the current locale. <p>By default, this property is enabled. <p>The date edit is simpler in appearance than {@link com.trolltech.qt.gui.QDateEdit QDateEdit}, but allows the user to navigate between fields using the left and right cursor keys, increment and decrement individual fields using the up and down cursor keys, and enter values directly using the number keys. <p><DT><b>See also:</b><br><DD>{@link QCalendarWidget#dateEditAcceptDelay() QCalendarWidget::dateEditAcceptDelay}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="dateEditEnabled")
    @QtBlockedSlot
    public final void setDateEditEnabled(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDateEditEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setDateEditEnabled_boolean(long __this__nativeId, boolean enable);

/**
Defines a date range by setting the {@link QCalendarWidget#minimumDate() minimumDate} and {@link QCalendarWidget#maximumDate() maximumDate} properties. <p>The date range restricts the user selection, i.e. the user can only select dates within the specified date range. Note that <pre class="snippet">
        QCalendarWidget calendar = new QCalendarWidget();

        calendar.setDateRange(min, max);
</pre> is analogous to <pre class="snippet">
        QCalendarWidget calendar = new QCalendarWidget();

        calendar.setMinimumDate(min);
        calendar.setMaximumDate(max);
</pre> If either the <tt>min</tt> or <tt>max</tt> parameters are not valid {@link com.trolltech.qt.core.QDate QDate} objects, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#setMinimumDate(com.trolltech.qt.core.QDate) setMinimumDate()}, and {@link com.trolltech.qt.gui.QCalendarWidget#setMaximumDate(com.trolltech.qt.core.QDate) setMaximumDate()}. <br></DD></DT>
*/

    public final void setDateRange(com.trolltech.qt.core.QDate min, com.trolltech.qt.core.QDate max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDateRange_QDate_QDate(nativeId(), min == null ? 0 : min.nativeId(), max == null ? 0 : max.nativeId());
    }
    native void __qt_setDateRange_QDate_QDate(long __this__nativeId, long min, long max);

/**
Sets the format used to render the given <tt>date</tt> to that specified by <tt>format</tt>. <p>If <tt>date</tt> is null, all date formats are cleared. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#dateTextFormat() dateTextFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDateTextFormat(com.trolltech.qt.core.QDate date, com.trolltech.qt.gui.QTextCharFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDateTextFormat_QDate_QTextCharFormat(nativeId(), date == null ? 0 : date.nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDateTextFormat_QDate_QTextCharFormat(long __this__nativeId, long date, long format);

/**
This property holds a value identifying the day displayed in the first column.  By default, the day displayed in the first column is Sunday
*/

    @com.trolltech.qt.QtPropertyWriter(name="firstDayOfWeek")
    @QtBlockedSlot
    public final void setFirstDayOfWeek(com.trolltech.qt.core.Qt.DayOfWeek dayOfWeek)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFirstDayOfWeek_DayOfWeek(nativeId(), dayOfWeek.value());
    }
    @QtBlockedSlot
    native void __qt_setFirstDayOfWeek_DayOfWeek(long __this__nativeId, int dayOfWeek);

/**
This property holds whether the table grid is displayed.  <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qcalendarwidget-grid.png"></center><br></td></tr><tr valign="top" class="odd"><td> <pre class="snippet">
            QCalendarWidget calendar = new QCalendarWidget();
            calendar.setGridVisible(true);
</pre></td></tr></table> The default value is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="gridVisible")
    public final void setGridVisible(boolean show)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGridVisible_boolean(nativeId(), show);
    }
    native void __qt_setGridVisible_boolean(long __this__nativeId, boolean show);

/**
Sets the text char format for rendering the header to <tt>format</tt>. If you also set a weekday text format, this format's foreground and background color will take precedence over the header's format. The other formatting information will still be decided by the header's format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#headerTextFormat() headerTextFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHeaderTextFormat(com.trolltech.qt.gui.QTextCharFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeaderTextFormat_QTextCharFormat(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setHeaderTextFormat_QTextCharFormat(long __this__nativeId, long format);

/**
This property holds the format of the horizontal header.  The default value is {@link com.trolltech.qt.gui.QCalendarWidget.HorizontalHeaderFormat QCalendarWidget::ShortDayNames }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="horizontalHeaderFormat")
    @QtBlockedSlot
    public final void setHorizontalHeaderFormat(com.trolltech.qt.gui.QCalendarWidget.HorizontalHeaderFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHorizontalHeaderFormat_HorizontalHeaderFormat(nativeId(), format.value());
    }
    @QtBlockedSlot
    native void __qt_setHorizontalHeaderFormat_HorizontalHeaderFormat(long __this__nativeId, int format);

/**
This property holds the maximum date of the currently specified date range.  The user will not be able to select a date which is after the currently set maximum date. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> <br><center><img src="../images/qcalendarwidget-maximum.png"></center><br></td></tr><tr valign="top" class="odd"><td> <pre class="snippet">
    QCalendarWidget calendar = new QCalendarWidget();
    calendar.setGridVisible(true);
    calendar.setMaximumDate(new QDate(2006, 7, 3));
</pre></td></tr></table> By default, the maximum date is the last day the {@link com.trolltech.qt.core.QDate QDate} class can handle. <p>When setting a maximum date, the {@link QCalendarWidget#minimumDate() minimumDate} and {@link QCalendarWidget#selectedDate() selectedDate} properties are adjusted if the selection range becomes invalid. If the provided date is not a valid {@link com.trolltech.qt.core.QDate QDate} object, the {@link com.trolltech.qt.gui.QCalendarWidget#setMaximumDate(com.trolltech.qt.core.QDate) setMaximumDate()} function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximumDate")
    @QtBlockedSlot
    public final void setMaximumDate(com.trolltech.qt.core.QDate date)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumDate_QDate(nativeId(), date == null ? 0 : date.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMaximumDate_QDate(long __this__nativeId, long date);

/**
This property holds the minimum date of the currently specified date range.  The user will not be able to select a date that is before the currently set minimum date. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> <br><center><img src="../images/qcalendarwidget-minimum.png"></center><br></td></tr><tr valign="top" class="odd"><td> <pre class="snippet">
    QCalendarWidget calendar = new QCalendarWidget();
    calendar.setGridVisible(true);
    calendar.setMinimumDate(new QDate(2006, 6, 19));
</pre></td></tr></table> By default, the minimum date is the earliest date that the {@link com.trolltech.qt.core.QDate QDate} class can handle. <p>When setting a minimum date, the {@link QCalendarWidget#maximumDate() maximumDate} and {@link QCalendarWidget#selectedDate() selectedDate} properties are adjusted if the selection range becomes invalid. If the provided date is not a valid {@link com.trolltech.qt.core.QDate QDate} object, the {@link com.trolltech.qt.gui.QCalendarWidget#setMinimumDate(com.trolltech.qt.core.QDate) setMinimumDate()} function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimumDate")
    @QtBlockedSlot
    public final void setMinimumDate(com.trolltech.qt.core.QDate date)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumDate_QDate(nativeId(), date == null ? 0 : date.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMinimumDate_QDate(long __this__nativeId, long date);

/**
This property holds whether the navigation bar is shown or not. When this property is true (the default), the next month, previous month, month selection, year selection controls are shown on top. <p>When the property is set to false, these controls are hidden.
*/

    @com.trolltech.qt.QtPropertyWriter(name="navigationBarVisible")
    public final void setNavigationBarVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNavigationBarVisible_boolean(nativeId(), visible);
    }
    native void __qt_setNavigationBarVisible_boolean(long __this__nativeId, boolean visible);

/**
This property holds the currently selected date.  The selected date must be within the date range specified by the {@link QCalendarWidget#minimumDate() minimumDate} and {@link QCalendarWidget#maximumDate() maximumDate} properties. By default, the selected date is the current date. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#setDateRange(com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate) setDateRange()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="selectedDate")
    public final void setSelectedDate(com.trolltech.qt.core.QDate date)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectedDate_QDate(nativeId(), date == null ? 0 : date.nativeId());
    }
    native void __qt_setSelectedDate_QDate(long __this__nativeId, long date);

/**
This property holds the type of selection the user can make in the calendar. When this property is set to {@link com.trolltech.qt.gui.QCalendarWidget.SelectionMode SingleSelection }, the user can select a date within the minimum and maximum allowed dates, using either the mouse or the keyboard. <p>When the property is set to {@link com.trolltech.qt.gui.QCalendarWidget.SelectionMode NoSelection }, the user will be unable to select dates, but they can still be selected programmatically. Note that the date that is selected when the property is set to {@link com.trolltech.qt.gui.QCalendarWidget.SelectionMode NoSelection } will still be the selected date of the calendar. <p>The default value is {@link com.trolltech.qt.gui.QCalendarWidget.SelectionMode SingleSelection }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="selectionMode")
    @QtBlockedSlot
    public final void setSelectionMode(com.trolltech.qt.gui.QCalendarWidget.SelectionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectionMode_SelectionMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setSelectionMode_SelectionMode(long __this__nativeId, int mode);

/**
This property holds the format of the vertical header.  The default value is QCalendarWidget::ISOWeekNumber.
*/

    @com.trolltech.qt.QtPropertyWriter(name="verticalHeaderFormat")
    @QtBlockedSlot
    public final void setVerticalHeaderFormat(com.trolltech.qt.gui.QCalendarWidget.VerticalHeaderFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalHeaderFormat_VerticalHeaderFormat(nativeId(), format.value());
    }
    @QtBlockedSlot
    native void __qt_setVerticalHeaderFormat_VerticalHeaderFormat(long __this__nativeId, int format);

/**
Sets the text char format for rendering of day in the week <tt>dayOfWeek</tt> to <tt>format</tt>. The format will take precedence over the header format in case of foreground and background color. Other text formatting information is taken from the headers format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#weekdayTextFormat(com.trolltech.qt.core.Qt.DayOfWeek) weekdayTextFormat()}, and {@link com.trolltech.qt.gui.QCalendarWidget#setHeaderTextFormat(com.trolltech.qt.gui.QTextCharFormat) setHeaderTextFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWeekdayTextFormat(com.trolltech.qt.core.Qt.DayOfWeek dayOfWeek, com.trolltech.qt.gui.QTextCharFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWeekdayTextFormat_DayOfWeek_QTextCharFormat(nativeId(), dayOfWeek.value(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setWeekdayTextFormat_DayOfWeek_QTextCharFormat(long __this__nativeId, int dayOfWeek, long format);

/**
Shows the next month relative to the currently displayed month. Note that the selected date is not changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#showPreviousMonth() showPreviousMonth()}, {@link com.trolltech.qt.gui.QCalendarWidget#setCurrentPage(int, int) setCurrentPage()}, and {@link com.trolltech.qt.gui.QCalendarWidget#setSelectedDate(com.trolltech.qt.core.QDate) setSelectedDate()}. <br></DD></DT>
*/

    public final void showNextMonth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showNextMonth(nativeId());
    }
    native void __qt_showNextMonth(long __this__nativeId);

/**
Shows the currently displayed month in the next year relative to the currently displayed year. Note that the selected date is not changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#showPreviousYear() showPreviousYear()}, {@link com.trolltech.qt.gui.QCalendarWidget#setCurrentPage(int, int) setCurrentPage()}, and {@link com.trolltech.qt.gui.QCalendarWidget#setSelectedDate(com.trolltech.qt.core.QDate) setSelectedDate()}. <br></DD></DT>
*/

    public final void showNextYear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showNextYear(nativeId());
    }
    native void __qt_showNextYear(long __this__nativeId);

/**
Shows the previous month relative to the currently displayed month. Note that the selected date is not changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#showNextMonth() showNextMonth()}, {@link com.trolltech.qt.gui.QCalendarWidget#setCurrentPage(int, int) setCurrentPage()}, and {@link com.trolltech.qt.gui.QCalendarWidget#setSelectedDate(com.trolltech.qt.core.QDate) setSelectedDate()}. <br></DD></DT>
*/

    public final void showPreviousMonth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showPreviousMonth(nativeId());
    }
    native void __qt_showPreviousMonth(long __this__nativeId);

/**
Shows the currently displayed month in the previous year relative to the currently displayed year. Note that the selected date is not changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#showNextYear() showNextYear()}, {@link com.trolltech.qt.gui.QCalendarWidget#setCurrentPage(int, int) setCurrentPage()}, and {@link com.trolltech.qt.gui.QCalendarWidget#setSelectedDate(com.trolltech.qt.core.QDate) setSelectedDate()}. <br></DD></DT>
*/

    public final void showPreviousYear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showPreviousYear(nativeId());
    }
    native void __qt_showPreviousYear(long __this__nativeId);

/**
Shows the month of the selected date. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#selectedDate() selectedDate()}, and {@link com.trolltech.qt.gui.QCalendarWidget#setCurrentPage(int, int) setCurrentPage()}. <br></DD></DT>
*/

    public final void showSelectedDate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showSelectedDate(nativeId());
    }
    native void __qt_showSelectedDate(long __this__nativeId);

/**
Shows the month of the today's date. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#selectedDate() selectedDate()}, and {@link com.trolltech.qt.gui.QCalendarWidget#setCurrentPage(int, int) setCurrentPage()}. <br></DD></DT>
*/

    public final void showToday()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showToday(nativeId());
    }
    native void __qt_showToday(long __this__nativeId);

/**
Updates the cell specified by the given <tt>date</tt> unless updates are disabled or the cell is hidden. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#updateCells() updateCells()}, {@link com.trolltech.qt.gui.QCalendarWidget#yearShown() yearShown()}, and {@link com.trolltech.qt.gui.QCalendarWidget#monthShown() monthShown()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void updateCell(com.trolltech.qt.core.QDate date)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateCell_QDate(nativeId(), date == null ? 0 : date.nativeId());
    }
    @QtBlockedSlot
    native void __qt_updateCell_QDate(long __this__nativeId, long date);

/**
Updates all visible cells unless updates are disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#updateCell(com.trolltech.qt.core.QDate) updateCell()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void updateCells()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateCells(nativeId());
    }
    @QtBlockedSlot
    native void __qt_updateCells(long __this__nativeId);

/**
This property holds the format of the vertical header.  The default value is QCalendarWidget::ISOWeekNumber.
*/

    @com.trolltech.qt.QtPropertyReader(name="verticalHeaderFormat")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QCalendarWidget.VerticalHeaderFormat verticalHeaderFormat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QCalendarWidget.VerticalHeaderFormat.resolve(__qt_verticalHeaderFormat(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_verticalHeaderFormat(long __this__nativeId);

/**
Returns the text char format for rendering of day in the week <tt>dayOfWeek</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#setWeekdayTextFormat(com.trolltech.qt.core.Qt.DayOfWeek, com.trolltech.qt.gui.QTextCharFormat) setWeekdayTextFormat()}, and {@link com.trolltech.qt.gui.QCalendarWidget#headerTextFormat() headerTextFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextCharFormat weekdayTextFormat(com.trolltech.qt.core.Qt.DayOfWeek dayOfWeek)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_weekdayTextFormat_DayOfWeek(nativeId(), dayOfWeek.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCharFormat __qt_weekdayTextFormat_DayOfWeek(long __this__nativeId, int dayOfWeek);

/**
Returns the year of the currently displayed month. Months are numbered from 1 to 12. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCalendarWidget#monthShown() monthShown()}, and {@link com.trolltech.qt.gui.QCalendarWidget#setCurrentPage(int, int) setCurrentPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int yearShown()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_yearShown(nativeId());
    }
    @QtBlockedSlot
    native int __qt_yearShown(long __this__nativeId);

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
    public boolean eventFilter(com.trolltech.qt.core.QObject watched, com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_eventFilter_QObject_QEvent(nativeId(), watched == null ? 0 : watched.nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_eventFilter_QObject_QEvent(long __this__nativeId, long watched, long event);

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
    public com.trolltech.qt.core.QSize minimumSizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_minimumSizeHint(long __this__nativeId);

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
Paints the cell specified by the given <tt>date</tt>, using the given <tt>painter</tt> and <tt>rect</tt>.
*/

    @QtBlockedSlot
    protected void paintCell(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRect rect, com.trolltech.qt.core.QDate date)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintCell_QPainter_QRect_QDate(nativeId(), painter == null ? 0 : painter.nativeId(), rect == null ? 0 : rect.nativeId(), date == null ? 0 : date.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintCell_QPainter_QRect_QDate(long __this__nativeId, long painter, long rect, long date);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long event);

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
@exclude
*/

    public static native QCalendarWidget fromNativePointer(QNativePointer nativePointer);

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

    protected QCalendarWidget(QPrivateConstructor p) { super(p); } 
}
