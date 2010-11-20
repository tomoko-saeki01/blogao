package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGroupBox widget provides a group box frame with a title. A group box provides a frame, a title and a keyboard shortcut, and displays various other widgets inside itself. The title is on top, the keyboard shortcut moves keyboard focus to one of the group box's child widgets. <p>QGroupBox also lets you set the {@link QGroupBox#title() title} (normally set in the constructor) and the title's {@link QGroupBox#alignment() alignment}. Group boxes can be {@link QGroupBox#isCheckable() checkable}; child widgets in checkable group boxes are enabled or disabled depending on whether or not the group box is {@link QGroupBox#isChecked() checked}. <p>You can minimize the space consumption of a group box by enabling the {@link QGroupBox#isFlat() flat} property. In most {@link com.trolltech.qt.gui.QStyle styles}, enabling this property results in the removal of the left, right and bottom edges of the frame. <p>QGroupBox doesn't automatically lay out the child widgets (which are often {@link com.trolltech.qt.gui.QCheckBox QCheckBox}es or {@link com.trolltech.qt.gui.QRadioButton QRadioButton}s but can be any widgets). The following example shows how we can set up a QGroupBox with a layout:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    QGroupBox *groupBox = new QGroupBox(tr("Exclusive Radio Buttons"));

    QRadioButton *radio1 = new QRadioButton(tr("&Radio button 1"));
    QRadioButton *radio2 = new QRadioButton(tr("R&adio button 2"));
    QRadioButton *radio3 = new QRadioButton(tr("Ra&dio button 3"));

    radio1-&gt;setChecked(true);
 

    QVBoxLayout *vbox = new QVBoxLayout;
    vbox-&gt;addWidget(radio1);
    vbox-&gt;addWidget(radio2);
    vbox-&gt;addWidget(radio3);
    vbox-&gt;addStretch(1);
    groupBox-&gt;setLayout(vbox);
</pre> <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/windowsxp-groupbox.png"></center><br></td><td>  <br><center><img src="../images/macintosh-groupbox.png"></center><br></td><td>  <br><center><img src="../images/plastique-groupbox.png"></center><br></td></tr><tr valign="top" class="odd"><td> A {@link <a href="../gallery-windowsxp.html">Windows XP style</a>} group box.</td><td> A {@link <a href="../gallery-macintosh.html">Macintosh style</a>} group box.</td><td> A {@link <a href="../gallery-plastique.html">Plastique style</a>} group box.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QButtonGroup QButtonGroup}, and {@link <a href="../widgets-groupbox.html">Group Box Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGroupBox extends com.trolltech.qt.gui.QWidget
{
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: checked)&gt;:<p> This signal is emitted when the check box is activated (i. . pressed down then released while the mouse cursor is inside the button), or when the shortcut key is typed, Notably, this signal is not emitted if you call {@link com.trolltech.qt.gui.QGroupBox#setChecked(boolean) setChecked()}. <p>If the check box is checked <tt>checked</tt> is true; it is false if the check box is unchecked. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#isCheckable() checkable}, {@link com.trolltech.qt.gui.QGroupBox#toggled toggled() }, and {@link QGroupBox#isChecked() checked}. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> clicked = new Signal1<java.lang.Boolean>();


    private final void clicked() {
        clicked((boolean)false);
    }
    private final void clicked(boolean checked)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clicked_boolean(nativeId(), checked);
    }
    native void __qt_clicked_boolean(long __this__nativeId, boolean checked);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: on)&gt;:<p> If the group box is checkable, this signal is emitted when the check box is toggled. <tt>on</tt> is true if the check box is checked; otherwise it is false. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#isCheckable() checkable}. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> toggled = new Signal1<java.lang.Boolean>();

    private final void toggled(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toggled_boolean(nativeId(), arg__1);
    }
    native void __qt_toggled_boolean(long __this__nativeId, boolean arg__1);


/**
Constructs a group box widget with the given <tt>parent</tt> but with no title.
*/

    public QGroupBox() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a group box widget with the given <tt>parent</tt> but with no title.
*/

    public QGroupBox(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QGroupBox_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGroupBox_QWidget(long parent);


/**
Constructs a group box with the given <tt>title</tt> and <tt>parent</tt>.
*/

    public QGroupBox(java.lang.String title) {
        this(title, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a group box with the given <tt>title</tt> and <tt>parent</tt>.
*/

    public QGroupBox(java.lang.String title, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QGroupBox_String_QWidget(title, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGroupBox_String_QWidget(java.lang.String title, long parent);

/**
This property holds the alignment of the group box title.  Most styles place the title at the top of the frame. The horizontal alignment of the title can be specified using single values from the following list: <ul><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } aligns the title text with the left-hand side of the group box.</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight } aligns the title text with the right-hand side of the group box.</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignHCenter } aligns the title text with the horizontal center of the group box.</li></ul> The default alignment is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }. <p><DT><b>See also:</b><br><DD>Qt::Alignment. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="alignment")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment alignment()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_alignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_alignment(long __this__nativeId);

    @QtBlockedSlot
    private final void initStyleOption(com.trolltech.qt.QNativePointer option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer(nativeId(), option);
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer option);

/**
This property holds whether the group box has a checkbox in its title. If this property is true, the group box displays its title using a checkbox in place of an ordinary label. If the checkbox is checked, the group box's children are enabled; otherwise they are disabled and inaccessible. <p>By default, group boxes are not checkable. <p>If this property is enabled for a group box, it will also be initially checked to ensure that its contents are enabled. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#isChecked() checked}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="checkable")
    @QtBlockedSlot
    public final boolean isCheckable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCheckable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCheckable(long __this__nativeId);

/**
This property holds whether the group box is checked. If the group box is checkable, it is displayed with a check box. If the check box is checked, the group box's children are enabled; otherwise the children are disabled and are inaccessible to the user. <p>By default, checkable group boxes are also checked. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#isCheckable() checkable}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="checked")
    @com.trolltech.qt.QtPropertyDesignable("isCheckable")
    @QtBlockedSlot
    public final boolean isChecked()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isChecked(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isChecked(long __this__nativeId);

/**
This property holds whether the group box is painted flat or has a frame. A group box usually consists of a surrounding frame with a title at the top. If this property is enabled, only the top part of the frame is drawn in most styles; otherwise the whole frame is drawn. <p>By default, this property is disabled; i.e. group boxes are not flat unless explicitly specified. <p><b>Note:</b> In some styles, flat and non-flat group boxes have similar representations and may not be as distinguishable as they are in other styles. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#title() title}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="flat")
    @QtBlockedSlot
    public final boolean isFlat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFlat(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFlat(long __this__nativeId);

/**
This property holds the alignment of the group box title.  Most styles place the title at the top of the frame. The horizontal alignment of the title can be specified using single values from the following list: <ul><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } aligns the title text with the left-hand side of the group box.</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight } aligns the title text with the right-hand side of the group box.</li><li> {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignHCenter } aligns the title text with the horizontal center of the group box.</li></ul> The default alignment is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }. <p><DT><b>See also:</b><br><DD>Qt::Alignment. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAlignment(int alignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_int(nativeId(), alignment);
    }
    @QtBlockedSlot
    native void __qt_setAlignment_int(long __this__nativeId, int alignment);

/**
This property holds whether the group box has a checkbox in its title. If this property is true, the group box displays its title using a checkbox in place of an ordinary label. If the checkbox is checked, the group box's children are enabled; otherwise they are disabled and inaccessible. <p>By default, group boxes are not checkable. <p>If this property is enabled for a group box, it will also be initially checked to ensure that its contents are enabled. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#isChecked() checked}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="checkable")
    @QtBlockedSlot
    public final void setCheckable(boolean checkable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCheckable_boolean(nativeId(), checkable);
    }
    @QtBlockedSlot
    native void __qt_setCheckable_boolean(long __this__nativeId, boolean checkable);

/**
This property holds whether the group box is checked. If the group box is checkable, it is displayed with a check box. If the check box is checked, the group box's children are enabled; otherwise the children are disabled and are inaccessible to the user. <p>By default, checkable group boxes are also checked. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#isCheckable() checkable}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="checked")
    public final void setChecked(boolean checked)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setChecked_boolean(nativeId(), checked);
    }
    native void __qt_setChecked_boolean(long __this__nativeId, boolean checked);

/**
This property holds whether the group box is painted flat or has a frame. A group box usually consists of a surrounding frame with a title at the top. If this property is enabled, only the top part of the frame is drawn in most styles; otherwise the whole frame is drawn. <p>By default, this property is disabled; i.e. group boxes are not flat unless explicitly specified. <p><b>Note:</b> In some styles, flat and non-flat group boxes have similar representations and may not be as distinguishable as they are in other styles. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#title() title}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="flat")
    @QtBlockedSlot
    public final void setFlat(boolean flat)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFlat_boolean(nativeId(), flat);
    }
    @QtBlockedSlot
    native void __qt_setFlat_boolean(long __this__nativeId, boolean flat);

/**
This property holds the group box title text. The group box title text will have a keyboard shortcut if the title contains an ampersand ('&') followed by a letter. <pre class="snippet">
        g.setTitle("&User information");
</pre> In the example above, <b>Alt+U</b> moves the keyboard focus to the group box. See the {@link com.trolltech.qt.gui.QShortcut QShortcut} documentation for details (to display an actual ampersand, use '&&'). <p>There is no default title text. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#alignment() alignment}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="title")
    @QtBlockedSlot
    public final void setTitle(java.lang.String title)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTitle_String(nativeId(), title);
    }
    @QtBlockedSlot
    native void __qt_setTitle_String(long __this__nativeId, java.lang.String title);

/**
This property holds the group box title text. The group box title text will have a keyboard shortcut if the title contains an ampersand ('&') followed by a letter. <pre class="snippet">
        g.setTitle("&User information");
</pre> In the example above, <b>Alt+U</b> moves the keyboard focus to the group box. See the {@link com.trolltech.qt.gui.QShortcut QShortcut} documentation for details (to display an actual ampersand, use '&&'). <p>There is no default title text. <p><DT><b>See also:</b><br><DD>{@link QGroupBox#alignment() alignment}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="title")
    @QtBlockedSlot
    public final java.lang.String title()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_title(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_title(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void childEvent(com.trolltech.qt.core.QChildEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_childEvent_QChildEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_childEvent_QChildEvent(long __this__nativeId, long event);

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
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long event);

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
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long event);

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
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long event);

/**
@exclude
*/

    public static native QGroupBox fromNativePointer(QNativePointer nativePointer);

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

    protected QGroupBox(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QGroupBox. This
method is useful for subclasses when they need a QStyleOptionGroupBox,
but don't want to fill in all the information themselves.
*/

    protected final void initStyleOption(QStyleOptionGroupBox option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
