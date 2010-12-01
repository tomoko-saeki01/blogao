package com.trolltech.qt.webkit;

import com.trolltech.qt.*;



/**
The QWebHistoryItem class represents one item in the history of a {@link com.trolltech.qt.webkit.QWebPage QWebPage} Each QWebHistoryItem instance represents an entry in the history stack of a Web page, containing information about the page, its location, and when it was last visited. <p>The following table shows the properties of the page held by the history item, and the functions used to access them. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Function</center></th><th><center> Description</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.webkit.QWebHistoryItem#title() title()}</td><td> The page title.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.webkit.QWebHistoryItem#url() url()}</td><td> The location of the page.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.webkit.QWebHistoryItem#originalUrl() originalUrl()}</td><td> The URL used to access the page.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.webkit.QWebHistoryItem#lastVisited() lastVisited()}</td><td> The date and time of the user's last visit to the page.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.webkit.QWebHistoryItem#icon() icon()}</td><td> The icon associated with the page that was provided by the server.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.webkit.QWebHistoryItem#userData() userData()}</td><td> The user specific data that was stored with the history item.</td></tr></table> <b>Note:</b>QWebHistoryItem objects are value based and {@link <a href="../explicitly-shared.html">explicitly shared</a>}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistory QWebHistory}, {@link com.trolltech.qt.webkit.QWebPage#history() QWebPage::history()}, and {@link com.trolltech.qt.webkit.QWebHistoryInterface QWebHistoryInterface}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QWebHistoryItem extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.webkit.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a history item from <tt>other</tt>.
*/

    public QWebHistoryItem(com.trolltech.qt.webkit.QWebHistoryItem other){
        super((QPrivateConstructor)null);
        __qt_QWebHistoryItem_QWebHistoryItem(other == null ? 0 : other.nativeId());
    }

    native void __qt_QWebHistoryItem_QWebHistoryItem(long other);

/**
Returns the icon associated with the history item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistoryItem#title() title()}, {@link com.trolltech.qt.webkit.QWebHistoryItem#url() url()}, and {@link com.trolltech.qt.webkit.QWebHistoryItem#lastVisited() lastVisited()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon icon()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_icon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon(long __this__nativeId);

/**
Returns whether this is a valid history item.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns the date and time that the page associated with the item was last visited. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistoryItem#title() title()}, {@link com.trolltech.qt.webkit.QWebHistoryItem#icon() icon()}, and {@link com.trolltech.qt.webkit.QWebHistoryItem#url() url()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime lastVisited()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastVisited(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_lastVisited(long __this__nativeId);

/**
Returns the original URL associated with the history item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistoryItem#url() url()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl originalUrl()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_originalUrl(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_originalUrl(long __this__nativeId);

/**
Stores user specific data <tt>userData</tt> with the history item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistoryItem#userData() userData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUserData(java.lang.Object userData)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUserData_Object(nativeId(), userData);
    }
    @QtBlockedSlot
    native void __qt_setUserData_Object(long __this__nativeId, java.lang.Object userData);

/**
Returns the title of the page associated with the history item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistoryItem#icon() icon()}, {@link com.trolltech.qt.webkit.QWebHistoryItem#url() url()}, and {@link com.trolltech.qt.webkit.QWebHistoryItem#lastVisited() lastVisited()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String title()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_title(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_title(long __this__nativeId);

/**
Returns the URL associated with the history item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistoryItem#originalUrl() originalUrl()}, {@link com.trolltech.qt.webkit.QWebHistoryItem#title() title()}, and {@link com.trolltech.qt.webkit.QWebHistoryItem#lastVisited() lastVisited()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl url()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_url(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_url(long __this__nativeId);

/**
Returns the user specific data that was stored with the history item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistoryItem#setUserData(java.lang.Object) setUserData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object userData()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_userData(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_userData(long __this__nativeId);

/**
@exclude
*/

    public static native QWebHistoryItem fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWebHistoryItem(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QWebHistoryItem array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QWebHistoryItem clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QWebHistoryItem __qt_clone(long __this_nativeId);
}
