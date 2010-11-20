package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QNetworkCookieJar class implements a simple jar of {@link com.trolltech.qt.network.QNetworkCookie QNetworkCookie} objects Cookies are small bits of information that stateless protocols like HTTP use to maintain some persistent information across requests. <p>A cookie is set by a remote server when it replies to a request and it expects the same cookie to be sent back when further requests are sent. <p>The cookie jar is the object that holds all cookies set in previous requests. Web browsers save their cookie jars to disk in order to conserve permanent cookies across invocations of the application. <p>QNetworkCookieJar does not implement permanent storage: it only keeps the cookies in memory. Once the QNetworkCookieJar object is deleted, all cookies it held will be discarded as well. If you want to save the cookies, you should derive from this class and implement the saving to disk to your own storage format. <p>This class implements only the basic security recommended by the cookie specifications and does not implement any cookie acceptance policy (it accepts all cookies set by any requests). In order to override those rules, you should reimplement the {@link com.trolltech.qt.network.QNetworkCookieJar#cookiesForUrl(com.trolltech.qt.core.QUrl) cookiesForUrl()} and {@link com.trolltech.qt.network.QNetworkCookieJar#setCookiesFromUrl(java.util.List, com.trolltech.qt.core.QUrl) setCookiesFromUrl()} virtual functions. They are called by {@link com.trolltech.qt.network.QNetworkReply QNetworkReply} and {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager} when they detect new cookies and when they require cookies. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookie QNetworkCookie}, {@link com.trolltech.qt.network.QNetworkAccessManager QNetworkAccessManager}, {@link com.trolltech.qt.network.QNetworkReply QNetworkReply}, {@link com.trolltech.qt.network.QNetworkRequest QNetworkRequest}, and {@link com.trolltech.qt.network.QNetworkAccessManager#setCookieJar(com.trolltech.qt.network.QNetworkCookieJar) QNetworkAccessManager::setCookieJar()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QNetworkCookieJar extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }


/**
Creates a QNetworkCookieJar object and sets the parent object to be <tt>parent</tt>. <p>The cookie jar is initialized to empty.
*/

    public QNetworkCookieJar() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Creates a QNetworkCookieJar object and sets the parent object to be <tt>parent</tt>. <p>The cookie jar is initialized to empty.
*/

    public QNetworkCookieJar(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QNetworkCookieJar_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QNetworkCookieJar_QObject(long parent);

/**
Returns all cookies stored in this cookie jar. This function is suitable for derived classes to save cookies to disk, as well as to implement cookie expiration and other policies. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookieJar#setAllCookies(java.util.List) setAllCookies()}, and {@link com.trolltech.qt.network.QNetworkCookieJar#cookiesForUrl(com.trolltech.qt.core.QUrl) cookiesForUrl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final java.util.List<com.trolltech.qt.network.QNetworkCookie> allCookies()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_allCookies(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.network.QNetworkCookie> __qt_allCookies(long __this__nativeId);

/**
Sets the internal list of cookies held by this cookie jar to be <tt>cookieList</tt>. This function is suitable for derived classes to implement loading cookies from permanent storage, or their own cookie acceptance policies by reimplementing {@link com.trolltech.qt.network.QNetworkCookieJar#setCookiesFromUrl(java.util.List, com.trolltech.qt.core.QUrl) setCookiesFromUrl()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookieJar#allCookies() allCookies()}, and {@link com.trolltech.qt.network.QNetworkCookieJar#setCookiesFromUrl(java.util.List, com.trolltech.qt.core.QUrl) setCookiesFromUrl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setAllCookies(java.util.List<com.trolltech.qt.network.QNetworkCookie> cookieList)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAllCookies_List(nativeId(), cookieList);
    }
    @QtBlockedSlot
    native void __qt_setAllCookies_List(long __this__nativeId, java.util.List<com.trolltech.qt.network.QNetworkCookie> cookieList);

/**
Returns the cookies to be added to when a request is sent to <tt>url</tt>. This function is called by the default {@link com.trolltech.qt.network.QNetworkAccessManager#createRequest(com.trolltech.qt.network.QNetworkAccessManager.Operation, com.trolltech.qt.network.QNetworkRequest) QNetworkAccessManager::createRequest()}, which adds the cookies returned by this function to the request being sent. <p>If more than one cookie with the same name is found, but with differing paths, the one with longer path is returned before the one with shorter path. In other words, this function returns cookies sorted by path length. <p>The default QNetworkCookieJar class implements only a very basic security policy (it makes sure that the cookies' domain and path match the reply's). To enhance the security policy with your own algorithms, override {@link com.trolltech.qt.network.QNetworkCookieJar#cookiesForUrl(com.trolltech.qt.core.QUrl) cookiesForUrl()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookieJar#setCookiesFromUrl(java.util.List, com.trolltech.qt.core.QUrl) setCookiesFromUrl()}, and {@link com.trolltech.qt.network.QNetworkAccessManager#setCookieJar(com.trolltech.qt.network.QNetworkCookieJar) QNetworkAccessManager::setCookieJar()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.util.List<com.trolltech.qt.network.QNetworkCookie> cookiesForUrl(com.trolltech.qt.core.QUrl url)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cookiesForUrl_QUrl(nativeId(), url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.network.QNetworkCookie> __qt_cookiesForUrl_QUrl(long __this__nativeId, long url);

/**
Adds the cookies in the list <tt>cookieList</tt> to this cookie jar. Default values for path and domain are taken from the <tt>url</tt> object. <p>Returns true if one or more cookes are set for url otherwise false. <p>If a cookie already exists in the cookie jar, it will be overridden by those in <tt>cookieList</tt>. <p>The default QNetworkCookieJar class implements only a very basic security policy (it makes sure that the cookies' domain and path match the reply's). To enhance the security policy with your own algorithms, override {@link com.trolltech.qt.network.QNetworkCookieJar#setCookiesFromUrl(java.util.List, com.trolltech.qt.core.QUrl) setCookiesFromUrl()}. <p>Also, QNetworkCookieJar does not have a maximum cookie jar size. Reimplement this function to discard older cookies to create room for new ones. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkCookieJar#cookiesForUrl(com.trolltech.qt.core.QUrl) cookiesForUrl()}, and {@link com.trolltech.qt.network.QNetworkAccessManager#setCookieJar(com.trolltech.qt.network.QNetworkCookieJar) QNetworkAccessManager::setCookieJar()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean setCookiesFromUrl(java.util.List<com.trolltech.qt.network.QNetworkCookie> cookieList, com.trolltech.qt.core.QUrl url)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setCookiesFromUrl_List_QUrl(nativeId(), cookieList, url == null ? 0 : url.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_setCookiesFromUrl_List_QUrl(long __this__nativeId, java.util.List<com.trolltech.qt.network.QNetworkCookie> cookieList, long url);

/**
@exclude
*/

    public static native QNetworkCookieJar fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QNetworkCookieJar(QPrivateConstructor p) { super(p); } 
}
