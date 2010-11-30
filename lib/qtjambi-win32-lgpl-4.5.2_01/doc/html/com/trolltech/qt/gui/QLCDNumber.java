package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QLCDNumber widget displays a number with LCD-like digits. It can display a number in just about any size. It can display decimal, hexadecimal, octal or binary numbers. It is easy to connect to data sources using the {@link com.trolltech.qt.gui.QLCDNumber#display(java.lang.String) display()} slot, which is overloaded to take any of five argument types. <p>There are also slots to change the base with {@link com.trolltech.qt.gui.QLCDNumber#setMode(com.trolltech.qt.gui.QLCDNumber.Mode) setMode()} and the decimal point with {@link com.trolltech.qt.gui.QLCDNumber#setSmallDecimalPoint(boolean) setSmallDecimalPoint()}. <p>QLCDNumber emits the {@link com.trolltech.qt.gui.QLCDNumber#overflow overflow() } signal when it is asked to display something beyond its range. The range is set by {@link com.trolltech.qt.gui.QLCDNumber#setNumDigits(int) setNumDigits()}, but {@link com.trolltech.qt.gui.QLCDNumber#setSmallDecimalPoint(boolean) setSmallDecimalPoint()} also influences it. If the display is set to hexadecimal, octal or binary, the integer equivalent of the value is displayed. <p>These digits and other symbols can be shown: 0/O, 1, 2, 3, 4, 5/S, 6, 7, 8, 9/g, minus, decimal point, A, B, C, D, E, F, h, H, L, o, P, r, u, U, Y, colon, degree sign (which is specified as single quote in the string) and space. QLCDNumber substitutes spaces for illegal characters. <p>It is not possible to retrieve the contents of a QLCDNumber object, although you can retrieve the numeric value with {@link com.trolltech.qt.gui.QLCDNumber#value() value()}. If you really need the text, we recommend that you connect the signals that feed the {@link com.trolltech.qt.gui.QLCDNumber#display(java.lang.String) display()} slot to another slot as well and store the value there. <p>Incidentally, QLCDNumber is the very oldest part of Qt, tracing its roots back to a BASIC program on the Sinclair Spectrum. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/motif-lcdnumber.png"></center><br> <br><center><img src="../images/cde-lcdnumber.png"></center><br> <br><center><img src="../images/windows-lcdnumber.png"></center><br> <br><center><img src="../images/windowsxp-lcdnumber.png"></center><br> <br><center><img src="../images/macintosh-lcdnumber.png"></center><br> <br><center><img src="../images/plastique-lcdnumber.png"></center><br></td></tr><tr valign="top" class="odd"><td> LCD number widgets shown in various widget styles (from left to right): {@link <a href="../gallery-motif.html">Motif</a>}, {@link <a href="../gallery-cde.html">CDE</a>}, {@link <a href="../gallery-windows.html">Windows</a>}, {@link <a href="../gallery-windowsxp.html">Windows XP</a>}, {@link <a href="../gallery-macintosh.html">Macintosh</a>}, {@link <a href="../gallery-plastique.html">Plastique</a>}.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel QLabel}, {@link com.trolltech.qt.gui.QFrame QFrame}, {@link <a href="../qtjambi-digitalclock.html">Digital Clock Example</a>}, and {@link <a href="../qtjambi-tetrix.html">Tetrix Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QLCDNumber extends com.trolltech.qt.gui.QFrame
{
/**
This type determines how numbers are shown. If the display is set to hexadecimal, octal or binary, the integer equivalent of the value is displayed.
*/

    public enum Mode implements com.trolltech.qt.QtEnumerator {
/**
 Hexadecimal
*/

        Hex(0),
/**
 Decimal
*/

        Dec(1),
/**
 Octal
*/

        Oct(2),
/**
 Binary
*/

        Bin(3);

        Mode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QLCDNumber$Mode constant with the specified <tt>int</tt>.</brief>
*/

        public static Mode resolve(int value) {
            return (Mode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Hex;
            case 1: return Dec;
            case 2: return Oct;
            case 3: return Bin;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This type determines the visual appearance of the {@link com.trolltech.qt.gui.QLCDNumber QLCDNumber} widget.
*/

    public enum SegmentStyle implements com.trolltech.qt.QtEnumerator {
/**
 gives raised segments filled with the background color.
*/

        Outline(0),
/**
 gives raised segments filled with the windowText color.
*/

        Filled(1),
/**
 gives flat segments filled with the windowText color.
*/

        Flat(2);

        SegmentStyle(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QLCDNumber$SegmentStyle constant with the specified <tt>int</tt>.</brief>
*/

        public static SegmentStyle resolve(int value) {
            return (SegmentStyle) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Outline;
            case 1: return Filled;
            case 2: return Flat;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
 This signal is emitted whenever the QLCDNumber is asked to display a too-large number or a too-long string. <p>It is never emitted by {@link com.trolltech.qt.gui.QLCDNumber#setNumDigits(int) setNumDigits()}.
*/

    public final Signal0 overflow = new Signal0();

    private final void overflow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_overflow(nativeId());
    }
    native void __qt_overflow(long __this__nativeId);


/**
Constructs an LCD number, sets the number of digits to 5, the base to decimal, the decimal point mode to 'small' and the frame style to a raised box. The {@link com.trolltech.qt.gui.QLCDNumber#segmentStyle() segmentStyle()} is set to <tt>Outline</tt>. <p>The <tt>parent</tt> argument is passed to the {@link com.trolltech.qt.gui.QFrame QFrame} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLCDNumber#setNumDigits(int) setNumDigits()}, and {@link com.trolltech.qt.gui.QLCDNumber#setSmallDecimalPoint(boolean) setSmallDecimalPoint()}. <br></DD></DT>
*/

    public QLCDNumber() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an LCD number, sets the number of digits to 5, the base to decimal, the decimal point mode to 'small' and the frame style to a raised box. The {@link com.trolltech.qt.gui.QLCDNumber#segmentStyle() segmentStyle()} is set to <tt>Outline</tt>. <p>The <tt>parent</tt> argument is passed to the {@link com.trolltech.qt.gui.QFrame QFrame} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLCDNumber#setNumDigits(int) setNumDigits()}, and {@link com.trolltech.qt.gui.QLCDNumber#setSmallDecimalPoint(boolean) setSmallDecimalPoint()}. <br></DD></DT>
*/

    public QLCDNumber(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QLCDNumber_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QLCDNumber_QWidget(long parent);


/**
Constructs an LCD number, sets the number of digits to <tt>numDigits</tt>, the base to decimal, the decimal point mode to 'small' and the frame style to a raised box. The {@link com.trolltech.qt.gui.QLCDNumber#segmentStyle() segmentStyle()} is set to <tt>Outline</tt>. <p>The <tt>parent</tt> argument is passed to the {@link com.trolltech.qt.gui.QFrame QFrame} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLCDNumber#setNumDigits(int) setNumDigits()}, and {@link com.trolltech.qt.gui.QLCDNumber#setSmallDecimalPoint(boolean) setSmallDecimalPoint()}. <br></DD></DT>
*/

    public QLCDNumber(int numDigits) {
        this(numDigits, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an LCD number, sets the number of digits to <tt>numDigits</tt>, the base to decimal, the decimal point mode to 'small' and the frame style to a raised box. The {@link com.trolltech.qt.gui.QLCDNumber#segmentStyle() segmentStyle()} is set to <tt>Outline</tt>. <p>The <tt>parent</tt> argument is passed to the {@link com.trolltech.qt.gui.QFrame QFrame} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLCDNumber#setNumDigits(int) setNumDigits()}, and {@link com.trolltech.qt.gui.QLCDNumber#setSmallDecimalPoint(boolean) setSmallDecimalPoint()}. <br></DD></DT>
*/

    public QLCDNumber(int numDigits, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QLCDNumber_int_QWidget(numDigits, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QLCDNumber_int_QWidget(int numDigits, long parent);

/**
Returns true if <tt>num</tt> is too big to be displayed in its entirety; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLCDNumber#display(java.lang.String) display()}, {@link com.trolltech.qt.gui.QLCDNumber#numDigits() numDigits()}, and {@link com.trolltech.qt.gui.QLCDNumber#smallDecimalPoint() smallDecimalPoint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean checkOverflow(double num)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_checkOverflow_double(nativeId(), num);
    }
    @QtBlockedSlot
    native boolean __qt_checkOverflow_double(long __this__nativeId, double num);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if <tt>num</tt> is too big to be displayed in its entirety; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLCDNumber#display(java.lang.String) display()}, {@link com.trolltech.qt.gui.QLCDNumber#numDigits() numDigits()}, and {@link com.trolltech.qt.gui.QLCDNumber#smallDecimalPoint() smallDecimalPoint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean checkOverflow(int num)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_checkOverflow_int(nativeId(), num);
    }
    @QtBlockedSlot
    native boolean __qt_checkOverflow_int(long __this__nativeId, int num);

/**
This property holds the displayed value rounded to the nearest integer. This property corresponds to the nearest integer to the current value displayed by the LCDNumber. This is the value used for hexadecimal, octal and binary modes. <p>If the displayed value is not a number, the property has a value of 0. <p>By default, this property contains a value of 0.
*/

    public final void display(java.lang.String str)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_display_String(nativeId(), str);
    }
    native void __qt_display_String(long __this__nativeId, java.lang.String str);

/**
This property holds the displayed value rounded to the nearest integer. This property corresponds to the nearest integer to the current value displayed by the LCDNumber. This is the value used for hexadecimal, octal and binary modes. <p>If the displayed value is not a number, the property has a value of 0. <p>By default, this property contains a value of 0.
*/

    @com.trolltech.qt.QtPropertyWriter(name="value")
    public final void display(double num)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_display_double(nativeId(), num);
    }
    native void __qt_display_double(long __this__nativeId, double num);

/**
This property holds the displayed value rounded to the nearest integer. This property corresponds to the nearest integer to the current value displayed by the LCDNumber. This is the value used for hexadecimal, octal and binary modes. <p>If the displayed value is not a number, the property has a value of 0. <p>By default, this property contains a value of 0.
*/

    public final void display(int num)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_display_int(nativeId(), num);
    }
    native void __qt_display_int(long __this__nativeId, int num);

/**
This property holds the displayed value rounded to the nearest integer. This property corresponds to the nearest integer to the current value displayed by the LCDNumber. This is the value used for hexadecimal, octal and binary modes. <p>If the displayed value is not a number, the property has a value of 0. <p>By default, this property contains a value of 0.
*/

    @com.trolltech.qt.QtPropertyReader(name="intValue")
    @QtBlockedSlot
    public final int intValue()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_intValue(nativeId());
    }
    @QtBlockedSlot
    native int __qt_intValue(long __this__nativeId);

/**
This property holds the current display mode (number base). Corresponds to the current display mode, which is one of <tt>Bin</tt>, <tt>Oct</tt>, <tt>Dec</tt> (the default) and <tt>Hex</tt>. <tt>Dec</tt> mode can display floating point values, the other modes display the integer equivalent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLCDNumber#smallDecimalPoint() smallDecimalPoint()}, {@link com.trolltech.qt.gui.QLCDNumber#setHexMode() setHexMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setDecMode() setDecMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setOctMode() setOctMode()}, and {@link com.trolltech.qt.gui.QLCDNumber#setBinMode() setBinMode()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="mode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLCDNumber.Mode mode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QLCDNumber.Mode.resolve(__qt_mode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_mode(long __this__nativeId);

/**
This property holds the current number of digits displayed. Corresponds to the current number of digits. If {@link QLCDNumber#smallDecimalPoint() QLCDNumber::smallDecimalPoint} is false, the decimal point occupies one digit position. <p>By default, this property contains a value of 5. <p><DT><b>See also:</b><br><DD>{@link QLCDNumber#smallDecimalPoint() smallDecimalPoint}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="numDigits")
    @QtBlockedSlot
    public final int numDigits()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_numDigits(nativeId());
    }
    @QtBlockedSlot
    native int __qt_numDigits(long __this__nativeId);

/**
This property holds the style of the LCDNumber. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Style</center></th><th><center> Result</center></th></tr></thead><tr valign="top" class="even"><td> <tt>Outline</tt></td><td> Produces raised segments filled with the background color (this is the default).</td></tr><tr valign="top" class="odd"><td> <tt>Filled</tt></td><td> Produces raised segments filled with the foreground color.</td></tr><tr valign="top" class="even"><td> <tt>Flat</tt></td><td> Produces flat segments filled with the foreground color.</td></tr></table> <tt>Outline</tt> and <tt>Filled</tt> will additionally use {@link com.trolltech.qt.gui.QPalette#light() QPalette::light()} and {@link com.trolltech.qt.gui.QPalette#dark() QPalette::dark()} for shadow effects.
*/

    @com.trolltech.qt.QtPropertyReader(name="segmentStyle")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLCDNumber.SegmentStyle segmentStyle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QLCDNumber.SegmentStyle.resolve(__qt_segmentStyle(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_segmentStyle(long __this__nativeId);

/**
Calls setMode(Bin). Provided for convenience (e.g. for connecting buttons to it). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLCDNumber#setMode(com.trolltech.qt.gui.QLCDNumber.Mode) setMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setHexMode() setHexMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setDecMode() setDecMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setOctMode() setOctMode()}, and {@link com.trolltech.qt.gui.QLCDNumber#mode() mode()}. <br></DD></DT>
*/

    public final void setBinMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBinMode(nativeId());
    }
    native void __qt_setBinMode(long __this__nativeId);

/**
Calls setMode(Dec). Provided for convenience (e.g. for connecting buttons to it). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLCDNumber#setMode(com.trolltech.qt.gui.QLCDNumber.Mode) setMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setHexMode() setHexMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setOctMode() setOctMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setBinMode() setBinMode()}, and {@link com.trolltech.qt.gui.QLCDNumber#mode() mode()}. <br></DD></DT>
*/

    public final void setDecMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDecMode(nativeId());
    }
    native void __qt_setDecMode(long __this__nativeId);

/**
Calls setMode(Hex). Provided for convenience (e.g. for connecting buttons to it). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLCDNumber#setMode(com.trolltech.qt.gui.QLCDNumber.Mode) setMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setDecMode() setDecMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setOctMode() setOctMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setBinMode() setBinMode()}, and {@link com.trolltech.qt.gui.QLCDNumber#mode() mode()}. <br></DD></DT>
*/

    public final void setHexMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHexMode(nativeId());
    }
    native void __qt_setHexMode(long __this__nativeId);

/**
This property holds the current display mode (number base). Corresponds to the current display mode, which is one of <tt>Bin</tt>, <tt>Oct</tt>, <tt>Dec</tt> (the default) and <tt>Hex</tt>. <tt>Dec</tt> mode can display floating point values, the other modes display the integer equivalent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLCDNumber#smallDecimalPoint() smallDecimalPoint()}, {@link com.trolltech.qt.gui.QLCDNumber#setHexMode() setHexMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setDecMode() setDecMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setOctMode() setOctMode()}, and {@link com.trolltech.qt.gui.QLCDNumber#setBinMode() setBinMode()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="mode")
    @QtBlockedSlot
    public final void setMode(com.trolltech.qt.gui.QLCDNumber.Mode arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMode_Mode(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setMode_Mode(long __this__nativeId, int arg__1);

/**
This property holds the current number of digits displayed. Corresponds to the current number of digits. If {@link QLCDNumber#smallDecimalPoint() QLCDNumber::smallDecimalPoint} is false, the decimal point occupies one digit position. <p>By default, this property contains a value of 5. <p><DT><b>See also:</b><br><DD>{@link QLCDNumber#smallDecimalPoint() smallDecimalPoint}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="numDigits")
    @QtBlockedSlot
    public final void setNumDigits(int nDigits)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNumDigits_int(nativeId(), nDigits);
    }
    @QtBlockedSlot
    native void __qt_setNumDigits_int(long __this__nativeId, int nDigits);

/**
Calls setMode(Oct). Provided for convenience (e.g. for connecting buttons to it). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLCDNumber#setMode(com.trolltech.qt.gui.QLCDNumber.Mode) setMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setHexMode() setHexMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setDecMode() setDecMode()}, {@link com.trolltech.qt.gui.QLCDNumber#setBinMode() setBinMode()}, and {@link com.trolltech.qt.gui.QLCDNumber#mode() mode()}. <br></DD></DT>
*/

    public final void setOctMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOctMode(nativeId());
    }
    native void __qt_setOctMode(long __this__nativeId);

/**
This property holds the style of the LCDNumber. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Style</center></th><th><center> Result</center></th></tr></thead><tr valign="top" class="even"><td> <tt>Outline</tt></td><td> Produces raised segments filled with the background color (this is the default).</td></tr><tr valign="top" class="odd"><td> <tt>Filled</tt></td><td> Produces raised segments filled with the foreground color.</td></tr><tr valign="top" class="even"><td> <tt>Flat</tt></td><td> Produces flat segments filled with the foreground color.</td></tr></table> <tt>Outline</tt> and <tt>Filled</tt> will additionally use {@link com.trolltech.qt.gui.QPalette#light() QPalette::light()} and {@link com.trolltech.qt.gui.QPalette#dark() QPalette::dark()} for shadow effects.
*/

    @com.trolltech.qt.QtPropertyWriter(name="segmentStyle")
    @QtBlockedSlot
    public final void setSegmentStyle(com.trolltech.qt.gui.QLCDNumber.SegmentStyle arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSegmentStyle_SegmentStyle(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setSegmentStyle_SegmentStyle(long __this__nativeId, int arg__1);

/**
This property holds the style of the decimal point. If true the decimal point is drawn between two digit positions. Otherwise it occupies a digit position of its own, i.e. is drawn in a digit position. The default is false. <p>The inter-digit space is made slightly wider when the decimal point is drawn between the digits. <p><DT><b>See also:</b><br><DD>{@link QLCDNumber#mode() mode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="smallDecimalPoint")
    public final void setSmallDecimalPoint(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSmallDecimalPoint_boolean(nativeId(), arg__1);
    }
    native void __qt_setSmallDecimalPoint_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds the style of the decimal point. If true the decimal point is drawn between two digit positions. Otherwise it occupies a digit position of its own, i.e. is drawn in a digit position. The default is false. <p>The inter-digit space is made slightly wider when the decimal point is drawn between the digits. <p><DT><b>See also:</b><br><DD>{@link QLCDNumber#mode() mode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="smallDecimalPoint")
    @QtBlockedSlot
    public final boolean smallDecimalPoint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_smallDecimalPoint(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_smallDecimalPoint(long __this__nativeId);

/**
This property holds the displayed value. This property corresponds to the current value displayed by the LCDNumber. <p>If the displayed value is not a number, the property has a value of 0. <p>By default, this property contains a value of 0.
*/

    @com.trolltech.qt.QtPropertyReader(name="value")
    @QtBlockedSlot
    public final double value()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value(nativeId());
    }
    @QtBlockedSlot
    native double __qt_value(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long arg__1);

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

    public static native QLCDNumber fromNativePointer(QNativePointer nativePointer);

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

    protected QLCDNumber(QPrivateConstructor p) { super(p); } 
}
