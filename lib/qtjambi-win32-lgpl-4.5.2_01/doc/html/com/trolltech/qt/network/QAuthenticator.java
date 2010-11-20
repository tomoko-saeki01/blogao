package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QAuthenticator class provides an authentication object. The QAuthenticator class is usually used in the {@link com.trolltech.qt.network.QHttp#authenticationRequired authenticationRequired() } and {@link com.trolltech.qt.network.QHttp#proxyAuthenticationRequired proxyAuthenticationRequired() } signals of {@link com.trolltech.qt.network.QHttp QHttp} and {@link com.trolltech.qt.network.QAbstractSocket QAbstractSocket}. The class provides a way to pass back the required authentication information to the socket when accessing services that require authentication. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QSslSocket QSslSocket}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QAuthenticator extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty authentication object
*/

    public QAuthenticator(){
        super((QPrivateConstructor)null);
        __qt_QAuthenticator();
    }

    native void __qt_QAuthenticator();

/**
Constructs a copy of <tt>other</tt>.
*/

    public QAuthenticator(com.trolltech.qt.network.QAuthenticator other){
        super((QPrivateConstructor)null);
        __qt_QAuthenticator_QAuthenticator(other == null ? 0 : other.nativeId());
    }

    native void __qt_QAuthenticator_QAuthenticator(long other);

/**
returns true if the authenticator is null.
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.network.QAuthenticator other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QAuthenticator(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QAuthenticator(long __this__nativeId, long other);

/**
returns the password used for authentication. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAuthenticator#setPassword(java.lang.String) setPassword()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String password()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_password(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_password(long __this__nativeId);

/**
returns the realm requiring authentication.
*/

    @QtBlockedSlot
    public final java.lang.String realm()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_realm(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_realm(long __this__nativeId);

/**
Sets the <tt>password</tt> used for authentication. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAuthenticator#password() password()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPassword(java.lang.String password)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPassword_String(nativeId(), password);
    }
    @QtBlockedSlot
    native void __qt_setPassword_String(long __this__nativeId, java.lang.String password);

/**
Sets the <tt>user</tt> used for authentication. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAuthenticator#user() user()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUser(java.lang.String user)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUser_String(nativeId(), user);
    }
    @QtBlockedSlot
    native void __qt_setUser_String(long __this__nativeId, java.lang.String user);

/**
returns the user used for authentication. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAuthenticator#setUser(java.lang.String) setUser()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String user()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_user(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_user(long __this__nativeId);

/**
@exclude
*/

    public static native QAuthenticator fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAuthenticator(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QAuthenticator array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QAuthenticator)
        return operator_equal((com.trolltech.qt.network.QAuthenticator) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QAuthenticator clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QAuthenticator __qt_clone(long __this_nativeId);
}
