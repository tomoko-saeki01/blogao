package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QFormLayout class manages forms of input widgets and their associated labels. QFormLayout is a convenience layout class that lays out its children in a two-column form. The left column consists of labels and the right column consists of "field" widgets (line editors, spin boxes, etc.). <p>Traditionally, such two-column form layouts were achieved using {@link com.trolltech.qt.gui.QGridLayout QGridLayout}. QFormLayout is a higher-level alternative that provides the following advantages: <ul><li> <b>Adherence to the different platform's look and feel guidelines.</b> <p>For example, the {@link <a href="../http-developer-apple-com-documentation-userexperience-conceptual-applehiguidelines-xhigintro-chapter-1-section-1.html">Mac OS X Aqua</a>} and KDE guidelines specify that the labels should be right-aligned, whereas Windows and GNOME applications normally use left-alignment.</li><li> <b>Support for wrapping long rows.</b> <p>For devices with small displays, QFormLayout can be set to {@link com.trolltech.qt.gui.QFormLayout.RowWrapPolicy wrap long rows }, or even to {@link com.trolltech.qt.gui.QFormLayout.RowWrapPolicy wrap all rows }.</li><li> <b>Convenient API for creating label--field pairs.</b> <p>The {@link com.trolltech.qt.gui.QFormLayout#addRow(com.trolltech.qt.gui.QLayout) addRow()} overload that takes a QString and a {@link com.trolltech.qt.gui.QWidget QWidget} * creates a {@link com.trolltech.qt.gui.QLabel QLabel} behind the scenes and automatically set up its buddy. We can then write code like this: <pre class="snippet">
        QFormLayout formLayout = new QFormLayout();
        formLayout.addRow(tr("Name:"), nameLineEdit);
        formLayout.addRow(tr("Email:"), emailLineEdit);
        formLayout.addRow(tr("Age:"), ageSpinBox);
        setLayout(formLayout);
</pre> Compare this with the following code, written using {@link com.trolltech.qt.gui.QGridLayout QGridLayout}: <pre class="snippet">
        nameLabel = new QLabel(tr("Name:"));
        nameLabel.setBuddy(nameLineEdit);

        emailLabel = new QLabel(tr("Email:"));
        emailLabel.setBuddy(emailLineEdit);

        ageLabel = new QLabel(tr("Age:"));
        ageLabel.setBuddy(ageSpinBox);

        QGridLayout gridLayout = new QGridLayout();
        gridLayout.addWidget(nameLabel, 0, 0);
        gridLayout.addWidget(nameLineEdit, 0, 1);
        gridLayout.addWidget(emailLabel, 1, 0);
        gridLayout.addWidget(emailLineEdit, 1, 1);
        gridLayout.addWidget(ageLabel, 2, 0);
        gridLayout.addWidget(ageSpinBox, 2, 1);
        setLayout(gridLayout);
</li></ul></pre> The table below shows the default appearance in different styles. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> {@link com.trolltech.qt.gui.QCommonStyle QCommonStyle} derived styles (except {@link com.trolltech.qt.gui.QPlastiqueStyle QPlastiqueStyle})</center></th><th><center> QMacStyle</center></th><th><center> {@link com.trolltech.qt.gui.QPlastiqueStyle QPlastiqueStyle}</center></th><th><center> Qt Extended styles</center></th></tr></thead><tr valign="top" class="even"><td>  <br><center><img src="../images/qformlayout-win.png"></center><br></td><td>  <br><center><img src="../images/qformlayout-mac.png"></center><br></td><td>  <br><center><img src="../images/qformlayout-kde.png"></center><br></td><td>  <br><center><img src="../images/qformlayout-qpe.png"></center><br></td></tr><tr valign="top" class="odd"><td> Traditional style used for Windows, GNOME, and earlier versions of KDE. Labels are left aligned, and expanding fields grow to fill the available space. (This normally corresponds to what we would get using a two-column {@link com.trolltech.qt.gui.QGridLayout QGridLayout}.)</td><td> Style based on the {@link <a href="../http-developer-apple-com-documentation-userexperience-conceptual-applehiguidelines-xhigintro-chapter-1-section-1.html">Mac OS X Aqua</a>} guidelines. Labels are right-aligned, the fields don't grow beyond their size hint, and the form is horizontally centered.</td><td> Recommended style for {@link <a href="../http-www-kdedevelopers-org-node-2345.html">KDE applications</a>}. Similar to MacStyle, except that the form is left-aligned and all fields grow to fill the available space.</td><td> Default style for Qt Extended styles. Labels are right-aligned, expanding fields grow to fill the available space, and row wrapping is enabled for long lines.</td></tr></table> The form styles can be also be overridden individually by calling {@link com.trolltech.qt.gui.QFormLayout#setLabelAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setLabelAlignment()}, {@link com.trolltech.qt.gui.QFormLayout#setFormAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setFormAlignment()}, {@link com.trolltech.qt.gui.QFormLayout#setFieldGrowthPolicy(com.trolltech.qt.gui.QFormLayout.FieldGrowthPolicy) setFieldGrowthPolicy()}, and {@link com.trolltech.qt.gui.QFormLayout#setRowWrapPolicy(com.trolltech.qt.gui.QFormLayout.RowWrapPolicy) setRowWrapPolicy()}. For example, to simulate the form layout appearance of QMacStyle on all platforms, but with left-aligned labels, you could write: <pre class="snippet">
        formLayout.setLabelAlignment(Qt.AlignmentFlag.AlignLeft);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGridLayout QGridLayout}, {@link com.trolltech.qt.gui.QBoxLayout QBoxLayout}, and {@link com.trolltech.qt.gui.QStackedLayout QStackedLayout}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFormLayout extends com.trolltech.qt.gui.QLayout
{
/**
This enum specifies the different policies that can be used to control the way in which the form's fields grow. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#fieldGrowthPolicy() fieldGrowthPolicy}. <br></DD></DT>
*/

    public enum FieldGrowthPolicy implements com.trolltech.qt.QtEnumerator {
/**
 The fields never grow beyond their {@link com.trolltech.qt.gui.QLayoutItem#sizeHint() effective size hint}. This is the default for QMacStyle.
*/

        FieldsStayAtSizeHint(0),
/**
 Fields with an horizontal {@link com.trolltech.qt.gui.QSizePolicy size policy} of {@link com.trolltech.qt.gui.QSizePolicy.Policy Expanding } or {@link com.trolltech.qt.gui.QSizePolicy.Policy MinimumExpanding } will grow to fill the available space. The other fields will not grow beyond their effective size hint. This is the default policy for Plastique.
*/

        ExpandingFieldsGrow(1),
/**
 All fields with a size policy that allows them to grow will grow to fill the available space. This is the default policy for most styles.
*/

        AllNonFixedFieldsGrow(2);

        FieldGrowthPolicy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFormLayout$FieldGrowthPolicy constant with the specified <tt>int</tt>.</brief>
*/

        public static FieldGrowthPolicy resolve(int value) {
            return (FieldGrowthPolicy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return FieldsStayAtSizeHint;
            case 1: return ExpandingFieldsGrow;
            case 2: return AllNonFixedFieldsGrow;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum specifies the different policies that can be used to control the way in which the form's rows wrap. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#rowWrapPolicy() rowWrapPolicy}. <br></DD></DT>
*/

    public enum RowWrapPolicy implements com.trolltech.qt.QtEnumerator {
/**
 Fields are always laid out next to their label. This is the default policy for all styles except Qt Extended styles.
*/

        DontWrapRows(0),
/**
 Labels are given enough horizontal space to fit the widest label, and the rest of the space is given to the fields. If the minimum size of a field pair is wider than the available space, the field is wrapped to the next line. This is the default policy for Qt Extended styles.
*/

        WrapLongRows(1),
/**
 Fields are always laid out below their label.
*/

        WrapAllRows(2);

        RowWrapPolicy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFormLayout$RowWrapPolicy constant with the specified <tt>int</tt>.</brief>
*/

        public static RowWrapPolicy resolve(int value) {
            return (RowWrapPolicy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return DontWrapRows;
            case 1: return WrapLongRows;
            case 2: return WrapAllRows;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum specifies the types of widgets (or other layout items) that may appear in a row. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFormLayout#itemAt(int, com.trolltech.qt.gui.QFormLayout.ItemRole) itemAt()}, and {@link com.trolltech.qt.gui.QFormLayout#getItemPosition(int) getItemPosition()}. <br></DD></DT>
*/

    public enum ItemRole implements com.trolltech.qt.QtEnumerator {
/**
 A label widget.
*/

        LabelRole(0),
/**
 A field widget.
*/

        FieldRole(1),
/**
 A widget that spans label and field columns.
*/

        SpanningRole(2);

        ItemRole(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFormLayout$ItemRole constant with the specified <tt>int</tt>.</brief>
*/

        public static ItemRole resolve(int value) {
            return (ItemRole) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return LabelRole;
            case 1: return FieldRole;
            case 2: return SpanningRole;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }



/**
Constructs a new form layout with the given <tt>parent</tt> widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setLayout(com.trolltech.qt.gui.QLayout) QWidget::setLayout()}. <br></DD></DT>
*/

    public QFormLayout() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a new form layout with the given <tt>parent</tt> widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setLayout(com.trolltech.qt.gui.QLayout) QWidget::setLayout()}. <br></DD></DT>
*/

    public QFormLayout(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QFormLayout_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QFormLayout_QWidget(long parent);

/**
This is an overloaded member function, provided for convenience. <p>Adds the specified <tt>layout</tt> at the end of this form layout. The <tt>layout</tt> spans both columns.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addRow(com.trolltech.qt.gui.QLayout layout)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRow_QLayout(nativeId(), layout == null ? 0 : layout.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addRow_QLayout(long __this__nativeId, long layout);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addRow(com.trolltech.qt.gui.QWidget label, com.trolltech.qt.gui.QLayout field)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRow_QWidget_QLayout(nativeId(), label == null ? 0 : label.nativeId(), field == null ? 0 : field.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addRow_QWidget_QLayout(long __this__nativeId, long label, long field);

/**
Adds a new row to the bottom of this form layout, with the given <tt>label</tt> and <tt>field</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFormLayout#insertRow(int, com.trolltech.qt.gui.QLayout) insertRow()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addRow(com.trolltech.qt.gui.QWidget label, com.trolltech.qt.gui.QWidget field)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRow_QWidget_QWidget(nativeId(), label == null ? 0 : label.nativeId(), field == null ? 0 : field.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addRow_QWidget_QWidget(long __this__nativeId, long label, long field);

/**
This is an overloaded member function, provided for convenience. <p>Adds the specified <tt>widget</tt> at the end of this form layout. The <tt>widget</tt> spans both columns.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addRow(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRow_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addRow_QWidget(long __this__nativeId, long widget);

/**
This is an overloaded member function, provided for convenience. <p>This overload automatically creates a {@link com.trolltech.qt.gui.QLabel QLabel} behind the scenes with <tt>labelText</tt> as its text.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addRow(java.lang.String labelText, com.trolltech.qt.gui.QLayout field)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRow_String_QLayout(nativeId(), labelText, field == null ? 0 : field.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addRow_String_QLayout(long __this__nativeId, java.lang.String labelText, long field);

/**
This is an overloaded member function, provided for convenience. <p>This overload automatically creates a {@link com.trolltech.qt.gui.QLabel QLabel} behind the scenes with <tt>labelText</tt> as its text. The <tt>field</tt> is set as the new {@link com.trolltech.qt.gui.QLabel QLabel}'s {@link com.trolltech.qt.gui.QLabel#setBuddy(com.trolltech.qt.gui.QWidget) buddy}.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addRow(java.lang.String labelText, com.trolltech.qt.gui.QWidget field)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addRow_String_QWidget(nativeId(), labelText, field == null ? 0 : field.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addRow_String_QWidget(long __this__nativeId, java.lang.String labelText, long field);

/**
This property holds the way in which the form's fields grow. The default value depends on the widget or application style. For QMacStyle, the default is {@link com.trolltech.qt.gui.QFormLayout.FieldGrowthPolicy FieldsStayAtSizeHint }; for {@link com.trolltech.qt.gui.QCommonStyle QCommonStyle} derived styles (like Plastique and Windows), the default is {@link com.trolltech.qt.gui.QFormLayout.FieldGrowthPolicy ExpandingFieldsGrow }; for Qt Extended styles, the default is {@link com.trolltech.qt.gui.QFormLayout.FieldGrowthPolicy AllNonFixedFieldsGrow }. <p>If none of the fields can grow and the form is resized, extra space is distributed according to the current {@link QFormLayout#formAlignment() form alignment}. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#formAlignment() formAlignment}, and {@link QFormLayout#rowWrapPolicy() rowWrapPolicy}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="fieldGrowthPolicy")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFormLayout.FieldGrowthPolicy fieldGrowthPolicy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFormLayout.FieldGrowthPolicy.resolve(__qt_fieldGrowthPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_fieldGrowthPolicy(long __this__nativeId);

/**
This property holds the alignment of the form layout's contents within the layout's geometry. The default value depends on the widget or application style. For QMacStyle, the default is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignHCenter } | {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignTop }; for the other styles, the default is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } | {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignTop }. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#labelAlignment() labelAlignment}, and {@link QFormLayout#rowWrapPolicy() rowWrapPolicy}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="formAlignment")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment formAlignment()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_formAlignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_formAlignment(long __this__nativeId);

    @QtBlockedSlot
    private final void getItemPosition(int index, com.trolltech.qt.QNativePointer rowPtr, com.trolltech.qt.QNativePointer rolePtr)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_getItemPosition_int_nativepointer_nativepointer(nativeId(), index, rowPtr, rolePtr);
    }
    @QtBlockedSlot
    native void __qt_getItemPosition_int_nativepointer_nativepointer(long __this__nativeId, int index, com.trolltech.qt.QNativePointer rowPtr, com.trolltech.qt.QNativePointer rolePtr);

    @QtBlockedSlot
    private final void getLayoutPosition(com.trolltech.qt.gui.QLayout layout, com.trolltech.qt.QNativePointer rowPtr, com.trolltech.qt.QNativePointer rolePtr)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_getLayoutPosition_QLayout_nativepointer_nativepointer(nativeId(), layout == null ? 0 : layout.nativeId(), rowPtr, rolePtr);
    }
    @QtBlockedSlot
    native void __qt_getLayoutPosition_QLayout_nativepointer_nativepointer(long __this__nativeId, long layout, com.trolltech.qt.QNativePointer rowPtr, com.trolltech.qt.QNativePointer rolePtr);

    @QtBlockedSlot
    private final void getWidgetPosition(com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.QNativePointer rowPtr, com.trolltech.qt.QNativePointer rolePtr)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_getWidgetPosition_QWidget_nativepointer_nativepointer(nativeId(), widget == null ? 0 : widget.nativeId(), rowPtr, rolePtr);
    }
    @QtBlockedSlot
    native void __qt_getWidgetPosition_QWidget_nativepointer_nativepointer(long __this__nativeId, long widget, com.trolltech.qt.QNativePointer rowPtr, com.trolltech.qt.QNativePointer rolePtr);

/**
This property holds the spacing between widgets that are laid out side by side. By default, if no value is explicitly set, the layout's horizontal spacing is inherited from the parent layout, or from the style settings for the parent widget. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#verticalSpacing() verticalSpacing}, {@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) QStyle::pixelMetric()}, and {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="horizontalSpacing")
    @QtBlockedSlot
    public final int horizontalSpacing()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_horizontalSpacing(nativeId());
    }
    @QtBlockedSlot
    native int __qt_horizontalSpacing(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Inserts the specified <tt>layout</tt> at position <tt>row</tt> in this form layout. The <tt>layout</tt> spans both columns. If <tt>row</tt> is out of bounds, the widget is added at the end.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertRow(int row, com.trolltech.qt.gui.QLayout layout)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertRow_int_QLayout(nativeId(), row, layout == null ? 0 : layout.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertRow_int_QLayout(long __this__nativeId, int row, long layout);

/**
Inserts a new row at position <tt>row</tt> in this form layout, with the given <tt>label</tt> and <tt>field</tt>. If <tt>row</tt> is out of bounds, the new row is added at the end. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFormLayout#addRow(com.trolltech.qt.gui.QLayout) addRow()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertRow(int row, com.trolltech.qt.gui.QWidget label, com.trolltech.qt.gui.QLayout field)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertRow_int_QWidget_QLayout(nativeId(), row, label == null ? 0 : label.nativeId(), field == null ? 0 : field.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertRow_int_QWidget_QLayout(long __this__nativeId, int row, long label, long field);

/**
Inserts a new row at position <tt>row</tt> in this form layout, with the given <tt>label</tt> and <tt>field</tt>. If <tt>row</tt> is out of bounds, the new row is added at the end. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFormLayout#addRow(com.trolltech.qt.gui.QLayout) addRow()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertRow(int row, com.trolltech.qt.gui.QWidget label, com.trolltech.qt.gui.QWidget field)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertRow_int_QWidget_QWidget(nativeId(), row, label == null ? 0 : label.nativeId(), field == null ? 0 : field.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertRow_int_QWidget_QWidget(long __this__nativeId, int row, long label, long field);

/**
This is an overloaded member function, provided for convenience. <p>Inserts the specified <tt>widget</tt> at position <tt>row</tt> in this form layout. The <tt>widget</tt> spans both columns. If <tt>row</tt> is out of bounds, the widget is added at the end.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertRow(int row, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertRow_int_QWidget(nativeId(), row, widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertRow_int_QWidget(long __this__nativeId, int row, long widget);

/**
This is an overloaded member function, provided for convenience. <p>This overload automatically creates a {@link com.trolltech.qt.gui.QLabel QLabel} behind the scenes with <tt>labelText</tt> as its text.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertRow(int row, java.lang.String labelText, com.trolltech.qt.gui.QLayout field)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertRow_int_String_QLayout(nativeId(), row, labelText, field == null ? 0 : field.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertRow_int_String_QLayout(long __this__nativeId, int row, java.lang.String labelText, long field);

/**
This is an overloaded member function, provided for convenience. <p>This overload automatically creates a {@link com.trolltech.qt.gui.QLabel QLabel} behind the scenes with <tt>labelText</tt> as its text. The <tt>field</tt> is set as the new {@link com.trolltech.qt.gui.QLabel QLabel}'s {@link com.trolltech.qt.gui.QLabel#setBuddy(com.trolltech.qt.gui.QWidget) buddy}.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertRow(int row, java.lang.String labelText, com.trolltech.qt.gui.QWidget field)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertRow_int_String_QWidget(nativeId(), row, labelText, field == null ? 0 : field.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertRow_int_String_QWidget(long __this__nativeId, int row, java.lang.String labelText, long field);

/**
Returns the layout item in the given <tt>row</tt> with the specified <tt>role</tt> (column). Returns 0 if there is no such item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#itemAt(int) QLayout::itemAt()}, and {@link com.trolltech.qt.gui.QFormLayout#setItem(int, com.trolltech.qt.gui.QFormLayout.ItemRole, com.trolltech.qt.gui.QLayoutItem) setItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLayoutItemInterface itemAt(int row, com.trolltech.qt.gui.QFormLayout.ItemRole role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_int_ItemRole(nativeId(), row, role.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayoutItemInterface __qt_itemAt_int_ItemRole(long __this__nativeId, int row, int role);

/**
This property holds the horizontal alignment of the labels. The default value depends on the widget or application style. For {@link com.trolltech.qt.gui.QCommonStyle QCommonStyle} derived styles, except for {@link com.trolltech.qt.gui.QPlastiqueStyle QPlastiqueStyle}, the default is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }; for the other styles, the default is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight }. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#formAlignment() formAlignment}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="labelAlignment")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment labelAlignment()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_labelAlignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_labelAlignment(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget labelForField(com.trolltech.qt.gui.QLayout field)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_labelForField_QLayout(nativeId(), field == null ? 0 : field.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_labelForField_QLayout(long __this__nativeId, long field);

/**
Returns the label associated with the given <tt>field</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFormLayout#itemAt(int, com.trolltech.qt.gui.QFormLayout.ItemRole) itemAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget labelForField(com.trolltech.qt.gui.QWidget field)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_labelForField_QWidget(nativeId(), field == null ? 0 : field.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_labelForField_QWidget(long __this__nativeId, long field);

/**
Returns the number of rows in the form. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#count() QLayout::count()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int rowCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_rowCount(long __this__nativeId);

/**
This property holds the way in which the form's rows wrap. The default value depends on the widget or application style. For Qt Extended styles, the default is {@link com.trolltech.qt.gui.QFormLayout.RowWrapPolicy WrapLongRows }; for the other styles, the default is {@link com.trolltech.qt.gui.QFormLayout.RowWrapPolicy DontWrapRows }. <p>If you want to display each label above its associated field (instead of next to it), set this property to {@link com.trolltech.qt.gui.QFormLayout.RowWrapPolicy WrapAllRows }. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#fieldGrowthPolicy() fieldGrowthPolicy}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="rowWrapPolicy")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFormLayout.RowWrapPolicy rowWrapPolicy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFormLayout.RowWrapPolicy.resolve(__qt_rowWrapPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_rowWrapPolicy(long __this__nativeId);

/**
This property holds the way in which the form's fields grow. The default value depends on the widget or application style. For QMacStyle, the default is {@link com.trolltech.qt.gui.QFormLayout.FieldGrowthPolicy FieldsStayAtSizeHint }; for {@link com.trolltech.qt.gui.QCommonStyle QCommonStyle} derived styles (like Plastique and Windows), the default is {@link com.trolltech.qt.gui.QFormLayout.FieldGrowthPolicy ExpandingFieldsGrow }; for Qt Extended styles, the default is {@link com.trolltech.qt.gui.QFormLayout.FieldGrowthPolicy AllNonFixedFieldsGrow }. <p>If none of the fields can grow and the form is resized, extra space is distributed according to the current {@link QFormLayout#formAlignment() form alignment}. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#formAlignment() formAlignment}, and {@link QFormLayout#rowWrapPolicy() rowWrapPolicy}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="fieldGrowthPolicy")
    @QtBlockedSlot
    public final void setFieldGrowthPolicy(com.trolltech.qt.gui.QFormLayout.FieldGrowthPolicy policy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFieldGrowthPolicy_FieldGrowthPolicy(nativeId(), policy.value());
    }
    @QtBlockedSlot
    native void __qt_setFieldGrowthPolicy_FieldGrowthPolicy(long __this__nativeId, int policy);


/**

*/

    @QtBlockedSlot
    public final void setFormAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.setFormAlignment(new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
This property holds the alignment of the form layout's contents within the layout's geometry. The default value depends on the widget or application style. For QMacStyle, the default is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignHCenter } | {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignTop }; for the other styles, the default is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } | {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignTop }. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#labelAlignment() labelAlignment}, and {@link QFormLayout#rowWrapPolicy() rowWrapPolicy}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="formAlignment")
    @QtBlockedSlot
    public final void setFormAlignment(com.trolltech.qt.core.Qt.Alignment alignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormAlignment_Alignment(nativeId(), alignment.value());
    }
    @QtBlockedSlot
    native void __qt_setFormAlignment_Alignment(long __this__nativeId, int alignment);

/**
This property holds the spacing between widgets that are laid out side by side. By default, if no value is explicitly set, the layout's horizontal spacing is inherited from the parent layout, or from the style settings for the parent widget. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#verticalSpacing() verticalSpacing}, {@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) QStyle::pixelMetric()}, and {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="horizontalSpacing")
    @QtBlockedSlot
    public final void setHorizontalSpacing(int spacing)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHorizontalSpacing_int(nativeId(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setHorizontalSpacing_int(long __this__nativeId, int spacing);

    @QtBlockedSlot
    private final void setItem_private(int row, com.trolltech.qt.gui.QFormLayout.ItemRole role, com.trolltech.qt.gui.QLayoutItemInterface item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItem_private_int_ItemRole_QLayoutItem(nativeId(), row, role.value(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItem_private_int_ItemRole_QLayoutItem(long __this__nativeId, int row, int role, long item);


/**

*/

    @QtBlockedSlot
    public final void setLabelAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.setLabelAlignment(new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
This property holds the horizontal alignment of the labels. The default value depends on the widget or application style. For {@link com.trolltech.qt.gui.QCommonStyle QCommonStyle} derived styles, except for {@link com.trolltech.qt.gui.QPlastiqueStyle QPlastiqueStyle}, the default is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }; for the other styles, the default is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight }. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#formAlignment() formAlignment}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="labelAlignment")
    @QtBlockedSlot
    public final void setLabelAlignment(com.trolltech.qt.core.Qt.Alignment alignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLabelAlignment_Alignment(nativeId(), alignment.value());
    }
    @QtBlockedSlot
    native void __qt_setLabelAlignment_Alignment(long __this__nativeId, int alignment);

/**
Sets the sub-layout in the given <tt>row</tt> for the given <tt>role</tt> to <tt>layout</tt>, extending the form layout with empty rows if necessary. <p>If the cell is already occupied, the <tt>layout</tt> is not inserted and an error message is sent to the console. <p><b>Note:</b> For most applications, {@link com.trolltech.qt.gui.QFormLayout#addRow(com.trolltech.qt.gui.QLayout) addRow()} or {@link com.trolltech.qt.gui.QFormLayout#insertRow(int, com.trolltech.qt.gui.QLayout) insertRow()} should be used instead of {@link com.trolltech.qt.gui.QFormLayout#setLayout(int, com.trolltech.qt.gui.QFormLayout.ItemRole, com.trolltech.qt.gui.QLayout) setLayout()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFormLayout#setWidget(int, com.trolltech.qt.gui.QFormLayout.ItemRole, com.trolltech.qt.gui.QWidget) setWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setLayout(int row, com.trolltech.qt.gui.QFormLayout.ItemRole role, com.trolltech.qt.gui.QLayout layout)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLayout_int_ItemRole_QLayout(nativeId(), row, role.value(), layout == null ? 0 : layout.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setLayout_int_ItemRole_QLayout(long __this__nativeId, int row, int role, long layout);

/**
This property holds the way in which the form's rows wrap. The default value depends on the widget or application style. For Qt Extended styles, the default is {@link com.trolltech.qt.gui.QFormLayout.RowWrapPolicy WrapLongRows }; for the other styles, the default is {@link com.trolltech.qt.gui.QFormLayout.RowWrapPolicy DontWrapRows }. <p>If you want to display each label above its associated field (instead of next to it), set this property to {@link com.trolltech.qt.gui.QFormLayout.RowWrapPolicy WrapAllRows }. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#fieldGrowthPolicy() fieldGrowthPolicy}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="rowWrapPolicy")
    @QtBlockedSlot
    public final void setRowWrapPolicy(com.trolltech.qt.gui.QFormLayout.RowWrapPolicy policy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRowWrapPolicy_RowWrapPolicy(nativeId(), policy.value());
    }
    @QtBlockedSlot
    native void __qt_setRowWrapPolicy_RowWrapPolicy(long __this__nativeId, int policy);

/**
This function sets both the vertical and horizontal spacing to <tt>spacing</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFormLayout#spacing() spacing()}, {@link com.trolltech.qt.gui.QFormLayout#setVerticalSpacing(int) setVerticalSpacing()}, and {@link com.trolltech.qt.gui.QFormLayout#setHorizontalSpacing(int) setHorizontalSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSpacing(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSpacing_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setSpacing_int(long __this__nativeId, int arg__1);

/**
This property holds the spacing between widgets that are laid out vertically. By default, if no value is explicitly set, the layout's vertical spacing is inherited from the parent layout, or from the style settings for the parent widget. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#horizontalSpacing() horizontalSpacing}, {@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) QStyle::pixelMetric()}, and {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="verticalSpacing")
    @QtBlockedSlot
    public final void setVerticalSpacing(int spacing)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVerticalSpacing_int(nativeId(), spacing);
    }
    @QtBlockedSlot
    native void __qt_setVerticalSpacing_int(long __this__nativeId, int spacing);

/**
Sets the widget in the given <tt>row</tt> for the given <tt>role</tt> to <tt>widget</tt>, extending the layout with empty rows if necessary. <p>If the cell is already occupied, the <tt>widget</tt> is not inserted and an error message is sent to the console. <p><b>Note:</b> For most applications, {@link com.trolltech.qt.gui.QFormLayout#addRow(com.trolltech.qt.gui.QLayout) addRow()} or {@link com.trolltech.qt.gui.QFormLayout#insertRow(int, com.trolltech.qt.gui.QLayout) insertRow()} should be used instead of {@link com.trolltech.qt.gui.QFormLayout#setWidget(int, com.trolltech.qt.gui.QFormLayout.ItemRole, com.trolltech.qt.gui.QWidget) setWidget()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFormLayout#setLayout(int, com.trolltech.qt.gui.QFormLayout.ItemRole, com.trolltech.qt.gui.QLayout) setLayout()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setWidget(int row, com.trolltech.qt.gui.QFormLayout.ItemRole role, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidget_int_ItemRole_QWidget(nativeId(), row, role.value(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setWidget_int_ItemRole_QWidget(long __this__nativeId, int row, int role, long widget);

/**
If the vertical spacing is equal to the horizontal spacing, this function returns that value; otherwise it returns -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFormLayout#setSpacing(int) setSpacing()}, {@link com.trolltech.qt.gui.QFormLayout#verticalSpacing() verticalSpacing()}, and {@link com.trolltech.qt.gui.QFormLayout#horizontalSpacing() horizontalSpacing()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int spacing()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_spacing(nativeId());
    }
    @QtBlockedSlot
    native int __qt_spacing(long __this__nativeId);

/**
This property holds the spacing between widgets that are laid out vertically. By default, if no value is explicitly set, the layout's vertical spacing is inherited from the parent layout, or from the style settings for the parent widget. <p><DT><b>See also:</b><br><DD>{@link QFormLayout#horizontalSpacing() horizontalSpacing}, {@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) QStyle::pixelMetric()}, and {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="verticalSpacing")
    @QtBlockedSlot
    public final int verticalSpacing()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_verticalSpacing(nativeId());
    }
    @QtBlockedSlot
    native int __qt_verticalSpacing(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void addItem(com.trolltech.qt.gui.QLayoutItemInterface item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (item != null) {
            item.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addItem_QLayoutItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addItem_QLayoutItem(long __this__nativeId, long item);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int count()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.Qt.Orientations expandingDirections()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Orientations(__qt_expandingDirections(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_expandingDirections(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean hasHeightForWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasHeightForWidth(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasHeightForWidth(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int heightForWidth(int width)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_heightForWidth_int(nativeId(), width);
    }
    @QtBlockedSlot
    native int __qt_heightForWidth_int(long __this__nativeId, int width);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void invalidate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_invalidate(nativeId());
    }
    @QtBlockedSlot
    native void __qt_invalidate(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QLayoutItemInterface itemAt(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayoutItemInterface __qt_itemAt_int(long __this__nativeId, int index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize minimumSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_minimumSize(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setGeometry(com.trolltech.qt.core.QRect rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGeometry_QRect(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setGeometry_QRect(long __this__nativeId, long rect);

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
    public com.trolltech.qt.gui.QLayoutItemInterface takeAt(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_takeAt_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayoutItemInterface __qt_takeAt_int(long __this__nativeId, int index);

/**
@exclude
*/

    public static native QFormLayout fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFormLayout(QPrivateConstructor p) { super(p); } 

    /**
     * Retrieves the row and role (column) of the item at the specified index.
     * If index is out of bounds, -1 is returned in place of the row.
     *
     * @param index The index of the item for which to retrieve the position.
     * @return A pair of an int (row of item) and an ItemRole (role of the item.)
     **/
    @QtBlockedSlot
    public final com.trolltech.qt.QPair<Integer, ItemRole> getItemPosition(int index) {
        com.trolltech.qt.QNativePointer row = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Int);
        com.trolltech.qt.QNativePointer role = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Int);

        getItemPosition(index, row, role);

        return new com.trolltech.qt.QPair<Integer, ItemRole>(row.intValue(), ItemRole.resolve(role.intValue()));
    }

    /**
     * Retrieves the row and role (column) of the specified child layout.
     * If the layout is not in the form layout, -1 is returned in place of the row.
     *
     * @param layout The layout for which to retrieve the position.
     * @return A pair of an int (row of item) and an ItemRole (role of the item.)
     */
    @QtBlockedSlot
    public final com.trolltech.qt.QPair<Integer, ItemRole> getLayoutPosition(QLayout layout) {
        com.trolltech.qt.QNativePointer row = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Int);
        com.trolltech.qt.QNativePointer role = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Int);

        getLayoutPosition(layout, row, role);

        return new com.trolltech.qt.QPair<Integer, ItemRole>(row.intValue(), ItemRole.resolve(role.intValue()));
    }

    /**
     * Retrieves the row and role (column) of the specified widget in the layout.
     * If the widget is not in the form layout, -1 is returned in place of the row.
     *
     * @param widget The widget for which to retrieve the position.
     * @return A pair of an int (row of item) and an ItemRole (role of the item.)
     */
    @QtBlockedSlot
    public final com.trolltech.qt.QPair<Integer, ItemRole> getWidgetPosition(QWidget widget) {
        com.trolltech.qt.QNativePointer row = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Int);
        com.trolltech.qt.QNativePointer role = new com.trolltech.qt.QNativePointer(com.trolltech.qt.QNativePointer.Type.Int);

        getWidgetPosition(widget, row, role);

        return new com.trolltech.qt.QPair<Integer, ItemRole>(row.intValue(), ItemRole.resolve(role.intValue()));
    }

    /**
     * Sets the item in the given row for the given role to item, extending the layout with empty rows if necessary.
     * If the cell is already occupied, the item is not inserted and a IllegalArgumentException is thrown.
     */
    @QtBlockedSlot
    public final void setItem(int row, ItemRole role, QLayoutItem item) {
        if (itemAt(row, role) == null)
            setItem_private(row, role, item);
        else
            throw new IllegalArgumentException("Cell in form layout is already occupied");
    }

}
