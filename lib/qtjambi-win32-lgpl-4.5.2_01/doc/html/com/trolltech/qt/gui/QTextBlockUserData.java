package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextBlockUserData class is used to associate custom data with blocks of text. QTextBlockUserData provides an abstract interface for container classes that are used to associate application-specific user data with text blocks in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. <p>Generally, subclasses of this class provide functions to allow data to be stored and retrieved, and instances are attached to blocks of text using {@link com.trolltech.qt.gui.QTextBlock#setUserData(com.trolltech.qt.gui.QTextBlockUserData) QTextBlock::setUserData()}. This makes it possible to store additional data per text block in a way that can be retrieved safely by the application. <p>Each subclass should provide a reimplementation of the destructor to ensure that any private data is automatically cleaned up when user data objects are deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock QTextBlock}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextBlockUserData extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
This is an overloaded method provided for convenience.
*/

    public QTextBlockUserData(){
        super((QPrivateConstructor)null);
        __qt_QTextBlockUserData();
    }

    native void __qt_QTextBlockUserData();

/**
@exclude
*/

    public static native QTextBlockUserData fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextBlockUserData(QPrivateConstructor p) { super(p); } 
}
