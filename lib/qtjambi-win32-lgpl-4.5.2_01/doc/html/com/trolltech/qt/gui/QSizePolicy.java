package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QSizePolicy class is a layout attribute describing horizontal and vertical resizing policy. The size policy of a widget is an expression of its willingness to be resized in various ways, and affects how the widget is treated by the {@link <a href="../geomanagement.html">layout engine</a>}. Widgets that reimplement {@link QWidget#sizePolicy() QWidget::sizePolicy()} return a QSizePolicy that describes the horizontal and vertical resizing policy they prefer when being laid out. <p>QSizePolicy contains two independent {@link com.trolltech.qt.gui.QSizePolicy.Policy QSizePolicy::Policy } values and two stretch factors; one describes the widgets's horizontal size policy, and the other describes its vertical size policy. It also contains a flag to indicate whether the height and width of its preferred size are related. <p>The horizontal and vertical policies can be set in the constructor, and altered using the {@link com.trolltech.qt.gui.QSizePolicy#setHorizontalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy) setHorizontalPolicy()} and {@link com.trolltech.qt.gui.QSizePolicy#setVerticalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy) setVerticalPolicy()} functions. The stretch factors can be set using the {@link com.trolltech.qt.gui.QSizePolicy#setHorizontalStretch(byte) setHorizontalStretch()} and {@link com.trolltech.qt.gui.QSizePolicy#setVerticalStretch(byte) setVerticalStretch()} functions. The flag indicating whether the widget's {@link QWidget#sizeHint() sizeHint()} is width-dependent (such as a menu bar or a word-wrapping label) can be set using the {@link com.trolltech.qt.gui.QSizePolicy#setHeightForWidth(boolean) setHeightForWidth()} function. <p>The current size policies and stretch factors be retrieved using the {@link com.trolltech.qt.gui.QSizePolicy#horizontalPolicy() horizontalPolicy()}, {@link com.trolltech.qt.gui.QSizePolicy#verticalPolicy() verticalPolicy()}, {@link com.trolltech.qt.gui.QSizePolicy#horizontalStretch() horizontalStretch()} and {@link com.trolltech.qt.gui.QSizePolicy#verticalStretch() verticalStretch()} functions. Alternatively, use the {@link com.trolltech.qt.gui.QSizePolicy#transpose() transpose()} function to swap the horizontal and vertical policies and stretches. The {@link com.trolltech.qt.gui.QSizePolicy#hasHeightForWidth() hasHeightForWidth()} function returns the current status of the flag indicating the size hint dependencies. <p>Use the {@link com.trolltech.qt.gui.QSizePolicy#expandingDirections() expandingDirections()} function to determine whether the associated widget can make use of more space than its {@link QWidget#sizeHint() sizeHint()} function indicates, as well as find out in which directions it can expand. <p>Finally, the QSizePolicy class provides operators comparing this size policy to a given policy, as well as a {@link com.trolltech.qt.QVariant QVariant} operator storing this QSizePolicy as a {@link com.trolltech.qt.QVariant QVariant} object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize QSize}, {@link QWidget#sizeHint() QWidget::sizeHint()}, {@link QWidget#sizePolicy() QWidget::sizePolicy()}, and {@link com.trolltech.qt.gui.QLayoutItem#sizeHint() QLayoutItem::sizeHint()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSizePolicy extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum specifies the different types of widgets in terms of layout interaction. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#setControlType(com.trolltech.qt.gui.QSizePolicy.ControlType) setControlType()}, and {@link com.trolltech.qt.gui.QSizePolicy#controlType() controlType()}. <br></DD></DT>
*/

    public enum ControlType implements com.trolltech.qt.QtEnumerator {
/**
 The default type, when none is specified.
*/

        DefaultType(1),
/**
 A {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox} instance.
*/

        ButtonBox(2),
/**
 A {@link com.trolltech.qt.gui.QCheckBox QCheckBox} instance.
*/

        CheckBox(4),
/**
 A {@link com.trolltech.qt.gui.QComboBox QComboBox} instance.
*/

        ComboBox(8),
/**
 A {@link com.trolltech.qt.gui.QFrame QFrame} instance.
*/

        Frame(16),
/**
 A {@link com.trolltech.qt.gui.QGroupBox QGroupBox} instance.
*/

        GroupBox(32),
/**
 A {@link com.trolltech.qt.gui.QLabel QLabel} instance.
*/

        Label(64),
/**
 A {@link com.trolltech.qt.gui.QFrame QFrame} instance with {@link com.trolltech.qt.gui.QFrame.Shape QFrame::HLine } or {@link com.trolltech.qt.gui.QFrame.Shape QFrame::VLine }.
*/

        Line(128),
/**
 A {@link com.trolltech.qt.gui.QLineEdit QLineEdit} instance.
*/

        LineEdit(256),
/**
 A {@link com.trolltech.qt.gui.QPushButton QPushButton} instance.
*/

        PushButton(512),
/**
 A {@link com.trolltech.qt.gui.QRadioButton QRadioButton} instance.
*/

        RadioButton(1024),
/**
 A {@link com.trolltech.qt.gui.QAbstractSlider QAbstractSlider} instance.
*/

        Slider(2048),
/**
 A {@link com.trolltech.qt.gui.QAbstractSpinBox QAbstractSpinBox} instance.
*/

        SpinBox(4096),
/**
 A {@link com.trolltech.qt.gui.QTabWidget QTabWidget} instance.
*/

        TabWidget(8192),
/**
 A {@link com.trolltech.qt.gui.QToolButton QToolButton} instance.
*/

        ToolButton(16384);

        ControlType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QSizePolicy$ControlTypes with the specified <tt>com.trolltech.qt.gui.QSizePolicy$ControlType[]</tt> QSizePolicy$ControlType values set.</brief>
*/

        public static ControlTypes createQFlags(ControlType ... values) {
            return new ControlTypes(values);
        }
/**
<brief>Returns the QSizePolicy$ControlType constant with the specified <tt>int</tt>.</brief>
*/

        public static ControlType resolve(int value) {
            return (ControlType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return DefaultType;
            case 2: return ButtonBox;
            case 4: return CheckBox;
            case 8: return ComboBox;
            case 16: return Frame;
            case 32: return GroupBox;
            case 64: return Label;
            case 128: return Line;
            case 256: return LineEdit;
            case 512: return PushButton;
            case 1024: return RadioButton;
            case 2048: return Slider;
            case 4096: return SpinBox;
            case 8192: return TabWidget;
            case 16384: return ToolButton;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class ControlTypes extends com.trolltech.qt.QFlags<ControlType> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QSizePolicy-ControlTypes with the specified <tt>com.trolltech.qt.gui.QSizePolicy.ControlType[]</tt>. flags set.</brief>
*/

        public ControlTypes(ControlType ... args) { super(args); }
        public ControlTypes(int value) { setValue(value); }
    }
/**
This enum describes the various per-dimension sizing types used when constructing a {@link com.trolltech.qt.gui.QSizePolicy QSizePolicy}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy.PolicyFlag PolicyFlag }, {@link com.trolltech.qt.gui.QSizePolicy#setHorizontalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy) setHorizontalPolicy()}, and {@link com.trolltech.qt.gui.QSizePolicy#setVerticalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy) setVerticalPolicy()}. <br></DD></DT>
*/
/**
These flags are combined together to form the various {@link com.trolltech.qt.gui.QSizePolicy.Policy Policy } values: <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy.Policy Policy }. <br></DD></DT>
*/



    public enum PolicyFlag implements com.trolltech.qt.QtEnumerator {
/**
 The widget can grow beyond its size hint if necessary.
*/

        GrowFlag(1),
/**
 The widget should get as much space as possible.
*/

        ExpandFlag(2),
/**
 The widget can shrink below its size hint if necessary.
*/

        ShrinkFlag(4),
/**
 The widget's size hint is ignored. The widget will get as much space as possible.
*/

        IgnoreFlag(8);

        PolicyFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSizePolicy$PolicyFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static PolicyFlag resolve(int value) {
            return (PolicyFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return GrowFlag;
            case 2: return ExpandFlag;
            case 4: return ShrinkFlag;
            case 8: return IgnoreFlag;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum Policy implements com.trolltech.qt.QtEnumerator {
/**
 The {@link QWidget#sizeHint() QWidget.:sizeHint()} is the only acceptable alternative, so the widget can never grow or shrink (e.g. the vertical direction of a push button).
*/

        Fixed(0),
/**
 The sizeHint() is minimal, and sufficient. The widget can be expanded, but there is no advantage to it being larger (e.g. the horizontal direction of a push button). It cannot be smaller than the size provided by sizeHint().
*/

        Minimum(1),
/**
 The sizeHint() is a maximum. The widget can be shrunk any amount without detriment if other widgets need the space (e.g. a separator line). It cannot be larger than the size provided by sizeHint().
*/

        Maximum(4),
/**
 The sizeHint() is best, but the widget can be shrunk and still be useful. The widget can be expanded, but there is no advantage to it being larger than sizeHint() (the default {@link com.trolltech.qt.gui.QWidget QWidget} policy).
*/

        Preferred(5),
/**
 The sizeHint() is minimal, and sufficient. The widget can make use of extra space, so it should get as much space as possible (e.g. the horizontal direction of a horizontal slider).
*/

        MinimumExpanding(3),
/**
 The sizeHint() is a sensible size, but the widget can be shrunk and still be useful. The widget can make use of extra space, so it should get as much space as possible (e.g. the horizontal direction of a horizontal slider).
*/

        Expanding(7),
/**
 The sizeHint() is ignored. The widget will get as much space as possible.
*/

        Ignored(13);

        Policy(int value) { this.value = value; }
        public int value() { return value; }

/**
<brief>Returns the QSizePolicy$Policy constant with the specified <tt>int</tt>.</brief>
*/

        public static Policy resolve(int value) {
            return (Policy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Fixed;
            case 1: return Minimum;
            case 4: return Maximum;
            case 5: return Preferred;
            case 3: return MinimumExpanding;
            case 7: return Expanding;
            case 13: return Ignored;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QSizePolicy object with {@link com.trolltech.qt.gui.QSizePolicy.Policy Fixed } as its horizontal and vertical policies. <p>The policies can be altered using the {@link com.trolltech.qt.gui.QSizePolicy#setHorizontalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy) setHorizontalPolicy()} and {@link com.trolltech.qt.gui.QSizePolicy#setVerticalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy) setVerticalPolicy()} functions. Use the {@link com.trolltech.qt.gui.QSizePolicy#setHeightForWidth(boolean) setHeightForWidth()} function if the preferred height of the widget is dependent on the width of the widget (for example, a {@link com.trolltech.qt.gui.QLabel QLabel} with line wrapping). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#setHorizontalStretch(byte) setHorizontalStretch()}, and {@link com.trolltech.qt.gui.QSizePolicy#setVerticalStretch(byte) setVerticalStretch()}. <br></DD></DT>
*/

    public QSizePolicy(){
        super((QPrivateConstructor)null);
        __qt_QSizePolicy();
    }

    native void __qt_QSizePolicy();

/**
Constructs a QSizePolicy object with the given <tt>horizontal</tt> and <tt>vertical</tt> policies, and {@link com.trolltech.qt.gui.QSizePolicy.ControlType DefaultType } as the control type. <p>Use {@link com.trolltech.qt.gui.QSizePolicy#setHeightForWidth(boolean) setHeightForWidth()} if the preferred height of the widget is dependent on the width of the widget (for example, a {@link com.trolltech.qt.gui.QLabel QLabel} with line wrapping). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#setHorizontalStretch(byte) setHorizontalStretch()}, and {@link com.trolltech.qt.gui.QSizePolicy#setVerticalStretch(byte) setVerticalStretch()}. <br></DD></DT>
*/

    public QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy horizontal, com.trolltech.qt.gui.QSizePolicy.Policy vertical){
        super((QPrivateConstructor)null);
        __qt_QSizePolicy_Policy_Policy(horizontal.value(), vertical.value());
    }

    native void __qt_QSizePolicy_Policy_Policy(int horizontal, int vertical);

/**
Constructs a QSizePolicy object with the given <tt>horizontal</tt> and <tt>vertical</tt> policies, and the specified control <tt>type</tt>. <p>Use {@link com.trolltech.qt.gui.QSizePolicy#setHeightForWidth(boolean) setHeightForWidth()} if the preferred height of the widget is dependent on the width of the widget (for example, a {@link com.trolltech.qt.gui.QLabel QLabel} with line wrapping). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#setHorizontalStretch(byte) setHorizontalStretch()}, {@link com.trolltech.qt.gui.QSizePolicy#setVerticalStretch(byte) setVerticalStretch()}, and {@link com.trolltech.qt.gui.QSizePolicy#controlType() controlType()}. <br></DD></DT>
*/

    public QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy horizontal, com.trolltech.qt.gui.QSizePolicy.Policy vertical, com.trolltech.qt.gui.QSizePolicy.ControlType type){
        super((QPrivateConstructor)null);
        __qt_QSizePolicy_Policy_Policy_ControlType(horizontal.value(), vertical.value(), type.value());
    }

    native void __qt_QSizePolicy_Policy_Policy_ControlType(int horizontal, int vertical, int type);

/**
Returns the control type associated with the widget for which this size policy applies. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#setControlType(com.trolltech.qt.gui.QSizePolicy.ControlType) setControlType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QSizePolicy.ControlType controlType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QSizePolicy.ControlType.resolve(__qt_controlType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_controlType(long __this__nativeId);

/**
Returns whether a widget can make use of more space than the {@link QWidget#sizeHint() QWidget.:sizeHint()} function indicates. <p>A value of {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } or {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } means that the widget can grow horizontally or vertically (i.e., the horizontal or vertical policy is {@link com.trolltech.qt.gui.QSizePolicy.Policy Expanding } or {@link com.trolltech.qt.gui.QSizePolicy.Policy MinimumExpanding }), whereas {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } | {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } means that it can grow in both dimensions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#horizontalPolicy() horizontalPolicy()}, and {@link com.trolltech.qt.gui.QSizePolicy#verticalPolicy() verticalPolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientations expandingDirections()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Orientations(__qt_expandingDirections(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_expandingDirections(long __this__nativeId);

/**
Returns true if the widget's preferred height depends on its width; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#setHeightForWidth(boolean) setHeightForWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasHeightForWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasHeightForWidth(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasHeightForWidth(long __this__nativeId);

/**
Returns the horizontal component of the size policy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#setHorizontalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy) setHorizontalPolicy()}, {@link com.trolltech.qt.gui.QSizePolicy#verticalPolicy() verticalPolicy()}, and {@link com.trolltech.qt.gui.QSizePolicy#horizontalStretch() horizontalStretch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QSizePolicy.Policy horizontalPolicy()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QSizePolicy.Policy.resolve(__qt_horizontalPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_horizontalPolicy(long __this__nativeId);

/**
Returns the horizontal stretch factor of the size policy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#setHorizontalStretch(byte) setHorizontalStretch()}, {@link com.trolltech.qt.gui.QSizePolicy#verticalStretch() verticalStretch()}, and {@link com.trolltech.qt.gui.QSizePolicy#horizontalPolicy() horizontalPolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int horizontalStretch()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_horizontalStretch(nativeId());
    }
    @QtBlockedSlot
    native int __qt_horizontalStretch(long __this__nativeId);

/**
<brief>Writes thisQSizePolicy
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
    private final boolean operator_equal(com.trolltech.qt.gui.QSizePolicy s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QSizePolicy(nativeId(), s == null ? 0 : s.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QSizePolicy(long __this__nativeId, long s);

/**
<brief>Reads a QSizePolicy
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
Sets the control type associated with the widget for which this size policy applies to <tt>type</tt>. <p>The control type specifies the type of the widget for which this size policy applies. It is used by some styles, notably QMacStyle, to insert proper spacing between widgets. For example, the Mac OS X Aqua guidelines specify that push buttons should be separated by 12 pixels, whereas vertically stacked radio buttons only require 6 pixels. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#controlType() controlType()}, and {@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) QStyle::layoutSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setControlType(com.trolltech.qt.gui.QSizePolicy.ControlType type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setControlType_ControlType(nativeId(), type.value());
    }
    @QtBlockedSlot
    native void __qt_setControlType_ControlType(long __this__nativeId, int type);

/**
Sets the flag determining whether the widget's preferred height depends on its width, to <tt>dependent</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#hasHeightForWidth() hasHeightForWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHeightForWidth(boolean b)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeightForWidth_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setHeightForWidth_boolean(long __this__nativeId, boolean b);

/**
Sets the horizontal component to the given <tt>policy</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#horizontalPolicy() horizontalPolicy()}, {@link com.trolltech.qt.gui.QSizePolicy#setVerticalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy) setVerticalPolicy()}, and {@link com.trolltech.qt.gui.QSizePolicy#setHorizontalStretch(byte) setHorizontalStretch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHorizontalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy d)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHorizontalPolicy_Policy(nativeId(), d.value());
    }
    @QtBlockedSlot
    native void __qt_setHorizontalPolicy_Policy(long __this__nativeId, int d);

/**
Sets the horizontal stretch factor of the size policy to the given <tt>stretchFactor</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#horizontalStretch() horizontalStretch()}, {@link com.trolltech.qt.gui.QSizePolicy#setVerticalStretch(byte) setVerticalStretch()}, and {@link com.trolltech.qt.gui.QSizePolicy#setHorizontalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy) setHorizontalPolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHorizontalStretch(byte stretchFactor)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHorizontalStretch_byte(nativeId(), stretchFactor);
    }
    @QtBlockedSlot
    native void __qt_setHorizontalStretch_byte(long __this__nativeId, byte stretchFactor);

/**
Sets the vertical component to the given <tt>policy</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#verticalPolicy() verticalPolicy()}, {@link com.trolltech.qt.gui.QSizePolicy#setHorizontalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy) setHorizontalPolicy()}, and {@link com.trolltech.qt.gui.QSizePolicy#setVerticalStretch(byte) setVerticalStretch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setVerticalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy d)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalPolicy_Policy(nativeId(), d.value());
    }
    @QtBlockedSlot
    native void __qt_setVerticalPolicy_Policy(long __this__nativeId, int d);

/**
Sets the vertical stretch factor of the size policy to the given <tt>stretchFactor</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#verticalStretch() verticalStretch()}, {@link com.trolltech.qt.gui.QSizePolicy#setHorizontalStretch(byte) setHorizontalStretch()}, and {@link com.trolltech.qt.gui.QSizePolicy#setVerticalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy) setVerticalPolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setVerticalStretch(byte stretchFactor)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalStretch_byte(nativeId(), stretchFactor);
    }
    @QtBlockedSlot
    native void __qt_setVerticalStretch_byte(long __this__nativeId, byte stretchFactor);

/**
Swaps the horizontal and vertical policies and stretches.
*/

    @QtBlockedSlot
    public final void transpose()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_transpose(nativeId());
    }
    @QtBlockedSlot
    native void __qt_transpose(long __this__nativeId);

/**
Returns the vertical component of the size policy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#setVerticalPolicy(com.trolltech.qt.gui.QSizePolicy.Policy) setVerticalPolicy()}, {@link com.trolltech.qt.gui.QSizePolicy#horizontalPolicy() horizontalPolicy()}, and {@link com.trolltech.qt.gui.QSizePolicy#verticalStretch() verticalStretch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QSizePolicy.Policy verticalPolicy()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QSizePolicy.Policy.resolve(__qt_verticalPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_verticalPolicy(long __this__nativeId);

/**
Returns the vertical stretch factor of the size policy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#setVerticalStretch(byte) setVerticalStretch()}, {@link com.trolltech.qt.gui.QSizePolicy#horizontalStretch() horizontalStretch()}, and {@link com.trolltech.qt.gui.QSizePolicy#verticalPolicy() verticalPolicy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int verticalStretch()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_verticalStretch(nativeId());
    }
    @QtBlockedSlot
    native int __qt_verticalStretch(long __this__nativeId);

/**
@exclude
*/

    public static native QSizePolicy fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSizePolicy(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSizePolicy array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.gui.QSizePolicy)
        return operator_equal((com.trolltech.qt.gui.QSizePolicy) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QSizePolicy clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSizePolicy __qt_clone(long __this_nativeId);
}
