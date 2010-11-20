package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public interface QAbstractImageIOHandlerFactoryInterface extends QtJambiInterface, com.trolltech.qt.core.QAbstractFactoryInterface
{

/**
Creates and returns a {@link com.trolltech.qt.gui.QImageIOHandler QImageIOHandler} subclass, with <tt>device</tt> and <tt>format</tt> set. The <tt>format</tt> must come from the list returned by {@link com.trolltech.qt.gui.QImageIOPlugin#keys() keys()}. Format names are case sensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOPlugin#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QImageIOHandler create(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.core.QByteArray format);

/**
Returns the list of image keys this plugin supports. <p>These keys are usually the names of the image formats that are implemented in the plugin (e.g., "jpg" or "gif"). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QImageIOPlugin#capabilities(com.trolltech.qt.core.QIODevice, com.trolltech.qt.core.QByteArray) capabilities()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> keys();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QAbstractImageIOHandlerFactory(long ptr);
}
