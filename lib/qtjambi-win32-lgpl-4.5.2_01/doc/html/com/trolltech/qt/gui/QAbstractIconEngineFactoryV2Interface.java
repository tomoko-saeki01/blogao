package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public interface QAbstractIconEngineFactoryV2Interface extends QtJambiInterface, com.trolltech.qt.core.QAbstractFactoryInterface
{

/**
Creates and returns a {@link com.trolltech.qt.gui.QIconEngine QIconEngine} object for the icon with the given <tt>filename</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIconEnginePluginV2#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QIconEngineV2 create(java.lang.String filename);

/**
Returns a list of icon engine keys that this plugin supports. The keys correspond to the suffix of the file or resource name used when the plugin was created. Keys are case insensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIconEnginePluginV2#create(java.lang.String) create()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> keys();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QAbstractIconEngineFactoryV2(long ptr);
}
