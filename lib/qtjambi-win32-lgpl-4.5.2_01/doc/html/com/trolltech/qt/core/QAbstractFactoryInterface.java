package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
This interface is implemented by Qt Jambi classes that are factories (after the factory design pattern). The keys() method of this class returns a set of names of the objects the factory can create, The names of the method that produces objects may vary between factories.
*/
@QtJambiGeneratedClass
public interface QAbstractFactoryInterface extends QtJambiInterface
{

/**
Returns the list of keys this abstract factory supports. Each key represents an object the factory can produce.
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> keys();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QAbstractFactory(long ptr);
}
