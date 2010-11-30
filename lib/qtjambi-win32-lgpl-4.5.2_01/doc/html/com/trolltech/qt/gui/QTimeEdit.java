package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTimeEdit class provides a widget for editing times based on the {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit} widget. Many of the properties and functions provided by QTimeEdit are implemented in {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit}. The following properties are most relevant to users of this class: <ul><li> {@link QDateTimeEdit#time() time} holds the date displayed by the widget.</li><li> {@link QDateTimeEdit#minimumTime() minimumTime} defines the minimum (earliest) time that can be set by the user.</li><li> {@link QDateTimeEdit#maximumTime() maximumTime} defines the maximum (latest) time that can be set by the user.</li><li> {@link QDateTimeEdit#displayFormat() displayFormat} contains a string that is used to format the time displayed in the widget.</li></ul> <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/windowsxp-timeedit.png"></center><br></td><td> A time editing widget shown in the {@link <a href="../gallery-windowsxp.html">Windows XP widget style</a>}.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/macintosh-timeedit.png"></center><br></td><td> A time editing widget shown in the {@link <a href="../gallery-macintosh.html">Macintosh widget style</a>}.</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-timeedit.png"></center><br></td><td> A time editing widget shown in the {@link <a href="../gallery-plastique.html">Plastique widget style</a>}.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDateEdit QDateEdit}, and {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTimeEdit extends com.trolltech.qt.gui.QDateTimeEdit
{


/**
Constructs an empty time editor with a <tt>parent</tt>.
*/

    public QTimeEdit() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty time editor with a <tt>parent</tt>.
*/

    public QTimeEdit(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QTimeEdit_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTimeEdit_QWidget(long parent);


/**
Constructs an empty time editor with a <tt>parent</tt>. The time is set to <tt>time</tt>.
*/

    public QTimeEdit(com.trolltech.qt.core.QTime time) {
        this(time, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty time editor with a <tt>parent</tt>. The time is set to <tt>time</tt>.
*/

    public QTimeEdit(com.trolltech.qt.core.QTime time, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QTimeEdit_QTime_QWidget(time == null ? 0 : time.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTimeEdit_QTime_QWidget(long time, long parent);

/**
@exclude
*/

    public static native QTimeEdit fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTimeEdit(QPrivateConstructor p) { super(p); } 
}
