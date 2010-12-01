package com.trolltech.qt.xml;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public interface QXmlDTDHandlerInterface extends QtJambiInterface
{

/**

*/

    @QtBlockedSlot
    public java.lang.String errorString();

/**

*/

    @QtBlockedSlot
    public boolean notationDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId);

/**

*/

    @QtBlockedSlot
    public boolean unparsedEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId, java.lang.String notationName);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QXmlDTDHandler(long ptr);
}
