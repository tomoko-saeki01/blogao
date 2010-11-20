package com.trolltech.qt.xml;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public interface QXmlLexicalHandlerInterface extends QtJambiInterface
{

    @QtBlockedSlot
    public boolean comment(java.lang.String ch);

    @QtBlockedSlot
    public boolean endCDATA();

    @QtBlockedSlot
    public boolean endDTD();

    @QtBlockedSlot
    public boolean endEntity(java.lang.String name);

    @QtBlockedSlot
    public java.lang.String errorString();

    @QtBlockedSlot
    public boolean startCDATA();

    @QtBlockedSlot
    public boolean startDTD(java.lang.String name, java.lang.String publicId, java.lang.String systemId);

    @QtBlockedSlot
    public boolean startEntity(java.lang.String name);

    public long __qt_cast_to_QXmlLexicalHandler(long ptr);
}
