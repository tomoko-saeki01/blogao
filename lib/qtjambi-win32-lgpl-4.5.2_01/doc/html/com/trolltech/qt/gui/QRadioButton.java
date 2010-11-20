package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QRadioButton widget provides a radio button with a text label. A QRadioButton is an option button that can be switched on (checked) or off (unchecked). Radio buttons typically present the user with a "one of many" choice. In a group of radio buttons only one radio button at a time can be checked; if the user selects another button, the previously selected button is switched off. <p>Radio buttons are {@link QAbstractButton#autoExclusive() autoExclusive} by default. If auto-exclusive is enabled, radio buttons that belong to the same parent widget behave as if they were part of the same exclusive button group. If you need multiple exclusive button groups for radio buttons that belong to the same parent widget, put them into a {@link com.trolltech.qt.gui.QButtonGroup QButtonGroup}. <p>Whenever a button is switched on or off it emits the {@link com.trolltech.qt.gui.QAbstractButton#toggled toggled() } signal. Connect to this signal if you want to trigger an action each time the button changes state. Use isChecked() to see if a particular button is selected. <p>Just like {@link com.trolltech.qt.gui.QPushButton QPushButton}, a radio button displays text, and optionally a small icon. The icon is set with setIcon(). The text can be set in the constructor or with setText(). A shortcut key can be specified by preceding the preferred character with an ampersand in the text. For example: <pre class="snippet">
        QRadioButton button = new QRadioButton(tr("Search from the &cursor"), this);
</pre> In this example the shortcut is Alt+c. See the {@link com.trolltech.qt.gui.QShortcut QShortcut} documentation for details (to display an actual ampersand, use '&&'). <p>Important inherited members: text(), setText(), text(), setDown(), isDown(), autoRepeat(), {@link com.trolltech.qt.gui.QAbstractButton#group() group()}, setAutoRepeat(), {@link com.trolltech.qt.gui.QAbstractButton#toggle() toggle()}, {@link com.trolltech.qt.gui.QAbstractButton#pressed pressed() }, {@link com.trolltech.qt.gui.QAbstractButton#released released() }, {@link com.trolltech.qt.gui.QAbstractButton#clicked clicked() }, and {@link com.trolltech.qt.gui.QAbstractButton#toggled toggled() }. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-radiobutton.png"></center><br></td><td> A radio button shown in the {@link <a href="../gallery-plastique.html">Plastique widget style</a>}.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/windows-radiobutton.png"></center><br></td><td> A radio button shown in the {@link <a href="../gallery-windowsxp.html">Windows XP widget style</a>}.</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/macintosh-radiobutton.png"></center><br></td><td> A radio button shown in the {@link <a href="../gallery-macintosh.html">Macintosh widget style</a>}.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPushButton QPushButton}, {@link com.trolltech.qt.gui.QToolButton QToolButton}, {@link com.trolltech.qt.gui.QCheckBox QCheckBox}, {@link <a href="../guibooks.html">GUI Design Handbook: Radio Button</a>}, and {@link <a href="../widgets-groupbox.html">Group Box Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QRadioButton extends com.trolltech.qt.gui.QAbstractButton
{


/**
Constructs a radio button with the given <tt>parent</tt>, but with no text or pixmap. <p>The <tt>parent</tt> argument is passed on to the {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton} constructor.
*/

    public QRadioButton() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a radio button with the given <tt>parent</tt>, but with no text or pixmap. <p>The <tt>parent</tt> argument is passed on to the {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton} constructor.
*/

    public QRadioButton(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QRadioButton_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QRadioButton_QWidget(long parent);


/**
Constructs a radio button with the given <tt>parent</tt> and a <tt>text</tt> string. <p>The <tt>parent</tt> argument is passed on to the {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton} constructor.
*/

    public QRadioButton(java.lang.String text) {
        this(text, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a radio button with the given <tt>parent</tt> and a <tt>text</tt> string. <p>The <tt>parent</tt> argument is passed on to the {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton} constructor.
*/

    public QRadioButton(java.lang.String text, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QRadioButton_String_QWidget(text, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QRadioButton_String_QWidget(java.lang.String text, long parent);

    @QtBlockedSlot
    private final void initStyleOption(com.trolltech.qt.QNativePointer button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer(nativeId(), button);
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer button);

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
    protected boolean hitButton(com.trolltech.qt.core.QPoint arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hitButton_QPoint(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hitButton_QPoint(long __this__nativeId, long arg__1);

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

    public static native QRadioButton fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QRadioButton(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QRadioButton. This
method is useful for subclasses when they need a QStyleOption, but
don't want to fill in all the information themselves.
*/

    protected final void initStyleOption(QStyleOptionButton option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
