package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public interface QAbstractPictureFormatInterface extends QtJambiInterface, com.trolltech.qt.core.QAbstractFactoryInterface
{

/**
Installs a {@link com.trolltech.qt.gui.QPictureIO QPictureIO} picture I/O handler for the picture format <tt>format</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureFormatPlugin#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean installIOHandler(java.lang.String arg__1);

/**
Returns the list of picture formats this plugin supports. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureFormatPlugin#installIOHandler(java.lang.String) installIOHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> keys();

/**
Loads the picture stored in the file called <tt>fileName</tt>, with the given <tt>format</tt>, into *<tt>picture</tt>. Returns true on success; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureFormatPlugin#savePicture(java.lang.String, java.lang.String, com.trolltech.qt.gui.QPicture) savePicture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean loadPicture(java.lang.String format, java.lang.String filename, com.trolltech.qt.gui.QPicture arg__3);

/**
Saves the given <tt>picture</tt> into the file called <tt>fileName</tt>, using the specified <tt>format</tt>. Returns true on success; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPictureFormatPlugin#loadPicture(java.lang.String, java.lang.String, com.trolltech.qt.gui.QPicture) loadPicture()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean savePicture(java.lang.String format, java.lang.String filename, com.trolltech.qt.gui.QPicture arg__3);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QAbstractPictureFormat(long ptr);
}
