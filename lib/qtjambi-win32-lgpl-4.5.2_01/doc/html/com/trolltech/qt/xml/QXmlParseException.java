package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlParseException class is used to report errors with the {@link com.trolltech.qt.xml.QXmlErrorHandler QXmlErrorHandler} interface. The XML subsystem constructs an instance of this class when it detects an error. You can retrieve the place where the error occurred using {@link com.trolltech.qt.xml.QXmlParseException#systemId() systemId()}, {@link com.trolltech.qt.xml.QXmlParseException#publicId() publicId()}, {@link com.trolltech.qt.xml.QXmlParseException#lineNumber() lineNumber()} and {@link com.trolltech.qt.xml.QXmlParseException#columnNumber() columnNumber()}, along with the error {@link com.trolltech.qt.xml.QXmlParseException#message() message()}. The possible error messages are: <ul><li> "no error occurred"</li><li> "error triggered by consumer"</li><li> "unexpected end of file"</li><li> "more than one document type definition"</li><li> "error occurred while parsing element"</li><li> "tag mismatch"</li><li> "error occurred while parsing content"</li><li> "unexpected character"</li><li> "invalid name for processing instruction"</li><li> "version expected while reading the XML declaration"</li><li> "wrong value for standalone declaration"</li><li> "encoding declaration or standalone declaration expected while reading the XML declaration"</li><li> "standalone declaration expected while reading the XML declaration"</li><li> "error occurred while parsing document type definition"</li><li> "letter is expected"</li><li> "error occurred while parsing comment"</li><li> "error occurred while parsing reference"</li><li> "internal general entity reference not allowed in DTD"</li><li> "external parsed general entity reference not allowed in attribute value"</li><li> "external parsed general entity reference not allowed in DTD"</li><li> "unparsed entity reference n wrong context"</li><li> "recursive entities"</li><li> "error in the text declaration of an external entity"</li></ul> Note that, if you want to display these error messages to your application's users, they will be displayed in English unless they are explicitly translated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlErrorHandler QXmlErrorHandler}, and {@link com.trolltech.qt.xml.QXmlReader QXmlReader}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QXmlParseException extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }


/**
Constructs a parse exception with the error string <tt>name</tt> for column <tt>c</tt> and line <tt>l</tt> for the public identifier <tt>p</tt> and the system identifier <tt>s</tt>.
*/

    public QXmlParseException(java.lang.String name, int c, int l, java.lang.String p) {
        this(name, c, l, p, (java.lang.String)null);
    }

/**
Constructs a parse exception with the error string <tt>name</tt> for column <tt>c</tt> and line <tt>l</tt> for the public identifier <tt>p</tt> and the system identifier <tt>s</tt>.
*/

    public QXmlParseException(java.lang.String name, int c, int l) {
        this(name, c, l, (java.lang.String)null, (java.lang.String)null);
    }

/**
Constructs a parse exception with the error string <tt>name</tt> for column <tt>c</tt> and line <tt>l</tt> for the public identifier <tt>p</tt> and the system identifier <tt>s</tt>.
*/

    public QXmlParseException(java.lang.String name, int c) {
        this(name, c, (int)-1, (java.lang.String)null, (java.lang.String)null);
    }

/**
Constructs a parse exception with the error string <tt>name</tt> for column <tt>c</tt> and line <tt>l</tt> for the public identifier <tt>p</tt> and the system identifier <tt>s</tt>.
*/

    public QXmlParseException(java.lang.String name) {
        this(name, (int)-1, (int)-1, (java.lang.String)null, (java.lang.String)null);
    }

/**
Constructs a parse exception with the error string <tt>name</tt> for column <tt>c</tt> and line <tt>l</tt> for the public identifier <tt>p</tt> and the system identifier <tt>s</tt>.
*/

    public QXmlParseException() {
        this((java.lang.String)null, (int)-1, (int)-1, (java.lang.String)null, (java.lang.String)null);
    }
/**
Constructs a parse exception with the error string <tt>name</tt> for column <tt>c</tt> and line <tt>l</tt> for the public identifier <tt>p</tt> and the system identifier <tt>s</tt>.
*/

    public QXmlParseException(java.lang.String name, int c, int l, java.lang.String p, java.lang.String s){
        super((QPrivateConstructor)null);
        __qt_QXmlParseException_String_int_int_String_String(name, c, l, p, s);
    }

    native void __qt_QXmlParseException_String_int_int_String_String(java.lang.String name, int c, int l, java.lang.String p, java.lang.String s);

/**
Returns the column number where the error occurred.
*/

    @QtBlockedSlot
    public final int columnNumber()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnNumber(nativeId());
    }
    @QtBlockedSlot
    native int __qt_columnNumber(long __this__nativeId);

/**
Returns the line number where the error occurred.
*/

    @QtBlockedSlot
    public final int lineNumber()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineNumber(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lineNumber(long __this__nativeId);

/**
Returns the error message.
*/

    @QtBlockedSlot
    public final java.lang.String message()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_message(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_message(long __this__nativeId);

/**
Returns the public identifier where the error occurred.
*/

    @QtBlockedSlot
    public final java.lang.String publicId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_publicId(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_publicId(long __this__nativeId);

/**
Returns the system identifier where the error occurred.
*/

    @QtBlockedSlot
    public final java.lang.String systemId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_systemId(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_systemId(long __this__nativeId);

/**
@exclude
*/

    public static native QXmlParseException fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlParseException(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QXmlParseException array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QXmlParseException clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QXmlParseException __qt_clone(long __this_nativeId);
}
