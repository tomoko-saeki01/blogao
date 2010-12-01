package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
This interface produces accessible interfaces.
*/
@QtJambiGeneratedClass
public interface QAbstractAccessibleFactoryInterface extends QtJambiInterface, com.trolltech.qt.core.QAbstractFactoryInterface
{

/**
Creates and returns a {@link com.trolltech.qt.gui.QAccessibleInterface QAccessibleInterface} implementation for the class <tt>key</tt> and the object <tt>object</tt>. Keys are case sensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessiblePlugin#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QAccessibleInterface create(java.lang.String key, com.trolltech.qt.core.QObject object);

/**
Returns the list of keys this plugin supports. <p>These keys must be the class names that this plugin provides an accessibility implementation for. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessiblePlugin#create(java.lang.String, com.trolltech.qt.core.QObject) create()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> keys();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QAbstractAccessibleFactory(long ptr);
}
