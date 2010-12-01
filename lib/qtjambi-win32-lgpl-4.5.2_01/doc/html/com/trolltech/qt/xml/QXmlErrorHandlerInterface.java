package com.trolltech.qt.xml;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public interface QXmlErrorHandlerInterface extends QtJambiInterface
{

/**

*/

    @QtBlockedSlot
    public boolean error(com.trolltech.qt.xml.QXmlParseException exception);

/**

*/

    @QtBlockedSlot
    public java.lang.String errorString();

/**

*/

    @QtBlockedSlot
    public boolean fatalError(com.trolltech.qt.xml.QXmlParseException exception);

/**

*/

    @QtBlockedSlot
    public boolean warning(com.trolltech.qt.xml.QXmlParseException exception);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QXmlErrorHandler(long ptr);
}
