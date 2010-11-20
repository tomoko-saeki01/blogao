package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public interface QAbstractTextCodecFactoryInterface extends QtJambiInterface, com.trolltech.qt.core.QAbstractFactoryInterface
{

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QTextCodec create(java.lang.String key);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> keys();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QAbstractTextCodecFactory(long ptr);
}
