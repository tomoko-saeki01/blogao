package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;



/**
The QSourceLocation class identifies a location in a resource by URI, line, and column. QSourceLocation is a simple value based class that has three properties, {@link com.trolltech.qt.xmlpatterns.QSourceLocation#uri() uri()}, {@link com.trolltech.qt.xmlpatterns.QSourceLocation#line() line()}, and {@link com.trolltech.qt.xmlpatterns.QSourceLocation#column() column()}, that, taken together, identify a certain point in a resource, e.g., a file or an in-memory document. <p>{@link com.trolltech.qt.xmlpatterns.QSourceLocation#line() line()} and {@link com.trolltech.qt.xmlpatterns.QSourceLocation#column() column()} refer to character counts (not byte counts), and they both start from 1, as opposed to 0.
*/
@QtJambiGeneratedClass
public class QSourceLocation extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.xmlpatterns.QtJambi_LibraryInitializer.init();
    }

/**
Construct a QSourceLocation that doesn't identify anything at all. <p>For a default constructed QSourceLocation(), {@link com.trolltech.qt.xmlpatterns.QSourceLocation#isNull() isNull()} returns <tt>true</tt>.
*/

    public QSourceLocation(){
        super((QPrivateConstructor)null);
        __qt_QSourceLocation();
    }

    native void __qt_QSourceLocation();

/**
Constructs a QSourceLocation that is a copy of <tt>other</tt>.
*/

    public QSourceLocation(com.trolltech.qt.xmlpatterns.QSourceLocation other){
        super((QPrivateConstructor)null);
        __qt_QSourceLocation_QSourceLocation(other == null ? 0 : other.nativeId());
    }

    native void __qt_QSourceLocation_QSourceLocation(long other);


/**
Constructs a QSourceLocation with URI <tt>u</tt>, line <tt>l</tt> and column <tt>c</tt>.
*/

    public QSourceLocation(com.trolltech.qt.core.QUrl uri, int line) {
        this(uri, line, (int)-1);
    }

/**
Constructs a QSourceLocation with URI <tt>u</tt>, line <tt>l</tt> and column <tt>c</tt>.
*/

    public QSourceLocation(com.trolltech.qt.core.QUrl uri) {
        this(uri, (int)-1, (int)-1);
    }
/**
Constructs a QSourceLocation with URI <tt>u</tt>, line <tt>l</tt> and column <tt>c</tt>.
*/

    public QSourceLocation(com.trolltech.qt.core.QUrl uri, int line, int column){
        super((QPrivateConstructor)null);
        __qt_QSourceLocation_QUrl_int_int(uri == null ? 0 : uri.nativeId(), line, column);
    }

    native void __qt_QSourceLocation_QUrl_int_int(long uri, int line, int column);

/**
Returns the current column number. The column number refers to the count of characters, not bytes. The first column is column 1, not 0. The default value is -1, indicating the column number is unknown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QSourceLocation#setColumn(long) setColumn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long column()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_column(nativeId());
    }
    @QtBlockedSlot
    native long __qt_column(long __this__nativeId);

/**
Returns <tt>true</tt> if this QSourceLocation doesn't identify anything. <p>For a default constructed QSourceLocation, this function returns <tt>true</tt>. The same applies for any other QSourceLocation whose {@link com.trolltech.qt.xmlpatterns.QSourceLocation#uri() uri()} is invalid.
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

/**
Returns the current line number. The first line number is 1, not 0. The default value is -1, indicating the line number is unknown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QSourceLocation#setLine(long) setLine()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long line()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_line(nativeId());
    }
    @QtBlockedSlot
    native long __qt_line(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.xmlpatterns.QSourceLocation other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QSourceLocation(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QSourceLocation(long __this__nativeId, long other);

/**
Sets the column number to <tt>newColumn</tt>. 0 is an invalid column number. The first column number is 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QSourceLocation#column() column()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColumn(long newColumn)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColumn_long(nativeId(), newColumn);
    }
    @QtBlockedSlot
    native void __qt_setColumn_long(long __this__nativeId, long newColumn);

/**
Sets the line number to <tt>newLine</tt>. 0 is an invalid line number. The first line number is 1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QSourceLocation#line() line()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLine(long newLine)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLine_long(nativeId(), newLine);
    }
    @QtBlockedSlot
    native void __qt_setLine_long(long __this__nativeId, long newLine);

/**
Sets the URI to <tt>newUri</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QSourceLocation#uri() uri()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUri(com.trolltech.qt.core.QUrl newUri)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUri_QUrl(nativeId(), newUri == null ? 0 : newUri.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setUri_QUrl(long __this__nativeId, long newUri);

/**
Returns the resource that this QSourceLocation refers to. For example, the resource could be a file in the local file system, if the URI scheme is <tt>file</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QSourceLocation#setUri(com.trolltech.qt.core.QUrl) setUri()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl uri()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_uri(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_uri(long __this__nativeId);

/**
@exclude
*/

    public static native QSourceLocation fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSourceLocation(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QSourceLocation array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.xmlpatterns.QSourceLocation)
        return operator_equal((com.trolltech.qt.xmlpatterns.QSourceLocation) other);
        return false;
    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    public int hashCode() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hashCode(nativeId());
    }
    native int __qt_hashCode(long __this_nativeId);

/**
<brief>Returns a string representation of the <tt>this QSourceLocation</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QSourceLocation clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QSourceLocation __qt_clone(long __this_nativeId);
}
