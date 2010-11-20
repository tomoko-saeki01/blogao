package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDateEdit class provides a widget for editing dates based on the {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit} widget. Many of the properties and functions provided by QDateEdit are implemented in {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit}. The following properties are most relevant to users of this class: <ul><li> {@link QDateTimeEdit#date() date} holds the date displayed by the widget.</li><li> {@link QDateTimeEdit#minimumDate() minimumDate} defines the minimum (earliest) date that can be set by the user.</li><li> {@link QDateTimeEdit#maximumDate() maximumDate} defines the maximum (latest) date that can be set by the user.</li><li> {@link QDateTimeEdit#displayFormat() displayFormat} contains a string that is used to format the date displayed in the widget.</li></ul> <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/windowsxp-dateedit.png"></center><br></td><td> A date editing widget shown in the {@link <a href="../gallery-windowsxp.html">Windows XP widget style</a>}.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/macintosh-dateedit.png"></center><br></td><td> A date editing widget shown in the {@link <a href="../gallery-macintosh.html">Macintosh widget style</a>}.</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-dateedit.png"></center><br></td><td> A date editing widget shown in the {@link <a href="../gallery-plastique.html">Plastique widget style</a>}.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTimeEdit QTimeEdit}, and {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDateEdit extends com.trolltech.qt.gui.QDateTimeEdit
{


/**
Constructs an empty date editor with a <tt>parent</tt>.
*/

    public QDateEdit() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty date editor with a <tt>parent</tt>.
*/

    public QDateEdit(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QDateEdit_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDateEdit_QWidget(long parent);


/**
Constructs an empty date editor with a <tt>parent</tt>. The date is set to <tt>date</tt>.
*/

    public QDateEdit(com.trolltech.qt.core.QDate date) {
        this(date, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs an empty date editor with a <tt>parent</tt>. The date is set to <tt>date</tt>.
*/

    public QDateEdit(com.trolltech.qt.core.QDate date, com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QDateEdit_QDate_QWidget(date == null ? 0 : date.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QDateEdit_QDate_QWidget(long date, long parent);

/**
@exclude
*/

    public static native QDateEdit fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDateEdit(QPrivateConstructor p) { super(p); } 
}
