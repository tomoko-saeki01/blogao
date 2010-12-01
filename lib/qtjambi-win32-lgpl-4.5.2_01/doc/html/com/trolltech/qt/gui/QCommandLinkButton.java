package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QCommandLinkButton widget provides a Vista style command link button. The command link is a new control that was introduced by Windows Vista. It's intended use is similar to that of a radio button in that it is used to choose between a set of mutually exclusive options. Command link buttons should not be used by themselves but rather as an alternative to radio buttons in Wizards and dialogs and makes pressing the "next" button redundant. The appearance is generally similar to that of a flat pushbutton, but it allows for a descriptive text in addition to the normal button text. By default it will also carry an arrow icon, indicating that pressing the control will open another window or page. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPushButton QPushButton}, and {@link com.trolltech.qt.gui.QRadioButton QRadioButton}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QCommandLinkButton extends com.trolltech.qt.gui.QPushButton
{


/**
Constructs a command link with no text and a <tt>parent</tt>.
*/

    public QCommandLinkButton() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a command link with no text and a <tt>parent</tt>.
*/

    public QCommandLinkButton(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QCommandLinkButton_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QCommandLinkButton_QWidget(long parent);


/**
Constructs a command link with the parent <tt>parent</tt> and the text <tt>text</tt>.
*/

    public QCommandLinkButton(java.lang.String text) {
        this(text, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a command link with the parent <tt>parent</tt> and the text <tt>text</tt>.
*/

    public QCommandLinkButton(java.lang.String text, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QCommandLinkButton_String_QWidget(text, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QCommandLinkButton_String_QWidget(java.lang.String text, long parent);


/**
Constructs a command link with a <tt>text</tt>, a <tt>description</tt>, and a <tt>parent</tt>.
*/

    public QCommandLinkButton(java.lang.String text, java.lang.String description) {
        this(text, description, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a command link with a <tt>text</tt>, a <tt>description</tt>, and a <tt>parent</tt>.
*/

    public QCommandLinkButton(java.lang.String text, java.lang.String description, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QCommandLinkButton_String_String_QWidget(text, description, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QCommandLinkButton_String_String_QWidget(java.lang.String text, java.lang.String description, long parent);

/**
This property holds A descriptive label to complement the button text. Setting this property will set a descriptive text on the button, complementing the text label. This will usually be displayed in a smaller font than the primary text.
*/

    @com.trolltech.qt.QtPropertyReader(name="description")
    @QtBlockedSlot
    public final java.lang.String description()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_description(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_description(long __this__nativeId);

/**
This property holds A descriptive label to complement the button text. Setting this property will set a descriptive text on the button, complementing the text label. This will usually be displayed in a smaller font than the primary text.
*/

    @com.trolltech.qt.QtPropertyWriter(name="description")
    @QtBlockedSlot
    public final void setDescription(java.lang.String description)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDescription_String(nativeId(), description);
    }
    @QtBlockedSlot
    native void __qt_setDescription_String(long __this__nativeId, java.lang.String description);

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
    public int heightForWidth(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_heightForWidth_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native int __qt_heightForWidth_int(long __this__nativeId, int arg__1);

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

    public static native QCommandLinkButton fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QCommandLinkButton(QPrivateConstructor p) { super(p); } 
}
