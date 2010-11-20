package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QScrollBar widget provides a vertical or horizontal scroll bar. A scroll bar is a control that enables the user to access parts of a document that is larger than the widget used to display it. It provides a visual indication of the user's current position within the document and the amount of the document that is visible. Scroll bars are usually equipped with other controls that enable more accurate navigation. Qt displays scroll bars in a way that is appropriate for each platform. <p>If you need to provide a scrolling view onto another widget, it may be more convenient to use the {@link com.trolltech.qt.gui.QScrollArea QScrollArea} class because this provides a viewport widget and scroll bars. QScrollBar is useful if you need to implement similar functionality for specialized widgets using {@link com.trolltech.qt.gui.QAbstractScrollArea QAbstractScrollArea}; for example, if you decide to subclass {@link com.trolltech.qt.gui.QAbstractItemView QAbstractItemView}. For most other situations where a slider control is used to obtain a value within a given range, the {@link com.trolltech.qt.gui.QSlider QSlider} class may be more appropriate for your needs. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> <br><center><img src="../images/qscrollbar-picture.png"></center><br></td><td> Scroll bars typically include four separate controls: a slider, scroll arrows, and a page control. <ul><li> a. The slider provides a way to quickly go to any part of the document, but does not support accurate navigation within large documents.</li><li> b. The scroll arrows are push buttons which can be used to accurately navigate to a particular place in a document. For a vertical scroll bar connected to a text editor, these typically move the current position one "line" up or down, and adjust the position of the slider by a small amount. In editors and list boxes a "line" might mean one line of text; in an image viewer it might mean 20 pixels.</li><li> c. The page control is the area over which the slider is dragged (the scroll bar's background). Clicking here moves the scroll bar towards the click by one "page". This value is usually the same as the length of the slider.</li></ul></td></tr></table> Each scroll bar has a value that indicates how far the slider is from the start of the scroll bar; this is obtained with value() and set with setValue(). This value always lies within the range of values defined for the scroll bar, from {@link QAbstractSlider#minimum() minimum()} to {@link QAbstractSlider#minimum() maximum()} inclusive. The range of acceptable values can be set with setMinimum() and setMaximum(). At the minimum value, the top edge of the slider (for a vertical scroll bar) or left edge (for a horizontal scroll bar) will be at the top (or left) end of the scroll bar. At the maximum value, the bottom (or right) edge of the slider will be at the bottom (or right) end of the scroll bar. <p>The length of the slider is usually related to the value of the page step, and typically represents the proportion of the document area shown in a scrolling view. The page step is the amount that the value changes by when the user presses the <b>Page Up</b> and <b>Page Down</b> keys, and is set with setPageStep(). Smaller changes to the value defined by the line step are made using the cursor keys, and this quantity is set with {@link QAbstractSlider#setSingleStep(int) setSingleStep()}. <p>Note that the range of values used is independent of the actual size of the scroll bar widget. You do not need to take this into account when you choose values for the range and the page step. <p>The range of values specified for the scroll bar are often determined differently to those for a {@link com.trolltech.qt.gui.QSlider QSlider} because the length of the slider needs to be taken into account. If we have a document with 100 lines, and we can only show 20 lines in a widget, we may wish to construct a scroll bar with a page step of 20, a minimum value of 0, and a maximum value of 80. This would give us a scroll bar with five "pages". <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td>  <br><center><img src="../images/qscrollbar-values.png"></center><br></td><td> The relationship between a document length, the range of values used in a scroll bar, and the page step is simple in many common situations. The scroll bar's range of values is determined by subtracting a chosen page step from some value representing the length of the document. In such cases, the following equation is useful: <p>document length = maximum() - minimum() + pageStep().</td></tr></table> QScrollBar only provides integer ranges. Note that although QScrollBar handles very large numbers, scroll bars on current screens cannot usefully represent ranges above about 100,000 pixels. Beyond that, it becomes difficult for the user to control the slider using either the keyboard or the mouse, and the scroll arrows will have limited use. <p>ScrollBar inherits a comprehensive set of signals from {@link com.trolltech.qt.gui.QAbstractSlider QAbstractSlider}: <ul><li> {@link com.trolltech.qt.gui.QAbstractSlider#valueChanged valueChanged() } is emitted when the scroll bar's value has changed. The tracking() determines whether this signal is emitted during user interaction.</li><li> {@link com.trolltech.qt.gui.QAbstractSlider#rangeChanged rangeChanged() } is emitted when the scroll bar's range of values has changed.</li><li> {@link com.trolltech.qt.gui.QAbstractSlider#sliderPressed sliderPressed() } is emitted when the user starts to drag the slider.</li><li> {@link com.trolltech.qt.gui.QAbstractSlider#sliderMoved sliderMoved() } is emitted when the user drags the slider.</li><li> {@link com.trolltech.qt.gui.QAbstractSlider#sliderReleased sliderReleased() } is emitted when the user releases the slider.</li><li> {@link com.trolltech.qt.gui.QAbstractSlider#actionTriggered actionTriggered() } is emitted when the scroll bar is changed by user interaction or via the {@link com.trolltech.qt.gui.QAbstractSlider#triggerAction(com.trolltech.qt.gui.QAbstractSlider.SliderAction) triggerAction()} function.</li></ul> A scroll bar can be controlled by the keyboard, but it has a default focusPolicy() of {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::NoFocus }. Use setFocusPolicy() to enable keyboard interaction with the scroll bar: <ul><li> Left/Right move a horizontal scroll bar by one single step.</li><li> Up/Down move a vertical scroll bar by one single step.</li><li> PageUp moves up one page.</li><li> PageDown moves down one page.</li><li> Home moves to the start (mininum).</li><li> End moves to the end (maximum).</li></ul> The slider itself can be controlled by using the {@link com.trolltech.qt.gui.QAbstractSlider#triggerAction(com.trolltech.qt.gui.QAbstractSlider.SliderAction) triggerAction()} function to simulate user interaction with the scroll bar controls. This is useful if you have many different widgets that use a common range of values. <p>Most GUI styles use the pageStep() value to calculate the size of the slider. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/macintosh-horizontalscrollbar.png"></center><br></td><td> A scroll bar shown in the {@link <a href="../gallery-macintosh.html">Macintosh widget style</a>}.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/windowsxp-horizontalscrollbar.png"></center><br></td><td> A scroll bar shown in the {@link <a href="../gallery-windowsxp.html">Windows XP widget style</a>}.</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-horizontalscrollbar.png"></center><br></td><td> A scroll bar shown in the {@link <a href="../gallery-plastique.html">Plastique widget style</a>}.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QScrollArea QScrollArea}, {@link com.trolltech.qt.gui.QSlider QSlider}, {@link com.trolltech.qt.gui.QDial QDial}, {@link com.trolltech.qt.gui.QSpinBox QSpinBox}, {@link <a href="../guibooks.html">GUI Design Handbook: Scroll Bar</a>}, and {@link <a href="../qtjambi-sliders.html">Sliders Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QScrollBar extends com.trolltech.qt.gui.QAbstractSlider
{


/**
Constructs a vertical scroll bar. <p>The <tt>parent</tt> arguments is sent to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>The {@link QAbstractSlider#minimum() minimum} defaults to 0, the {@link QAbstractSlider#maximum() maximum} to 99, with a {@link QAbstractSlider#singleStep() singleStep} size of 1 and a {@link QAbstractSlider#pageStep() pageStep} size of 10, and an initial {@link QAbstractSlider#value() value} of 0.
*/

    public QScrollBar() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a vertical scroll bar. <p>The <tt>parent</tt> arguments is sent to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>The {@link QAbstractSlider#minimum() minimum} defaults to 0, the {@link QAbstractSlider#maximum() maximum} to 99, with a {@link QAbstractSlider#singleStep() singleStep} size of 1 and a {@link QAbstractSlider#pageStep() pageStep} size of 10, and an initial {@link QAbstractSlider#value() value} of 0.
*/

    public QScrollBar(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QScrollBar_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QScrollBar_QWidget(long parent);


/**
Constructs a scroll bar with the given <tt>orientation</tt>. <p>The <tt>parent</tt> argument is passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>The {@link QAbstractSlider#minimum() minimum} defaults to 0, the {@link QAbstractSlider#maximum() maximum} to 99, with a {@link QAbstractSlider#singleStep() singleStep} size of 1 and a {@link QAbstractSlider#pageStep() pageStep} size of 10, and an initial {@link QAbstractSlider#value() value} of 0.
*/

    public QScrollBar(com.trolltech.qt.core.Qt.Orientation arg__1) {
        this(arg__1, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a scroll bar with the given <tt>orientation</tt>. <p>The <tt>parent</tt> argument is passed to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p>The {@link QAbstractSlider#minimum() minimum} defaults to 0, the {@link QAbstractSlider#maximum() maximum} to 99, with a {@link QAbstractSlider#singleStep() singleStep} size of 1 and a {@link QAbstractSlider#pageStep() pageStep} size of 10, and an initial {@link QAbstractSlider#value() value} of 0.
*/

    public QScrollBar(com.trolltech.qt.core.Qt.Orientation arg__1, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QScrollBar_Orientation_QWidget(arg__1.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QScrollBar_Orientation_QWidget(int arg__1, long parent);

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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QContextMenuEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QContextMenuEvent(long __this__nativeId, long arg__1);

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
    protected void hideEvent(com.trolltech.qt.gui.QHideEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideEvent_QHideEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_hideEvent_QHideEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long arg__1);

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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void sliderChange(com.trolltech.qt.gui.QAbstractSlider.SliderChange change)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sliderChange_SliderChange(nativeId(), change.value());
    }
    @QtBlockedSlot
    native void __qt_sliderChange_SliderChange(long __this__nativeId, int change);

/**
@exclude
*/

    public static native QScrollBar fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QScrollBar(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QScrollBar. This
method is useful for subclasses when they need a QStyleOptionButton,
but don't want to fill in all the information themselves.
*/

    protected final void initStyleOption(QStyleOptionSlider option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
