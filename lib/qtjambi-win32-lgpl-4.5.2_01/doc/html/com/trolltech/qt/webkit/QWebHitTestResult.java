package com.trolltech.qt.webkit;

import com.trolltech.qt.*;



/**
The QWebHitTestResult class provides information about the web page content after a hit test. QWebHitTestResult is returned by {@link com.trolltech.qt.webkit.QWebFrame#hitTestContent(com.trolltech.qt.core.QPoint) QWebFrame::hitTestContent()} to provide information about the content of the web page at the specified position.
*/
@QtJambiGeneratedClass
public class QWebHitTestResult extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.webkit.QtJambi_LibraryInitializer.init();
    }

/**
Constructs a null hit test result.
*/

    public QWebHitTestResult(){
        super((QPrivateConstructor)null);
        __qt_QWebHitTestResult();
    }

    native void __qt_QWebHitTestResult();

/**
Constructs a hit test result from <tt>other</tt>.
*/

    public QWebHitTestResult(com.trolltech.qt.webkit.QWebHitTestResult other){
        super((QPrivateConstructor)null);
        __qt_QWebHitTestResult_QWebHitTestResult(other == null ? 0 : other.nativeId());
    }

    native void __qt_QWebHitTestResult_QWebHitTestResult(long other);

/**
Returns the alternate text of the element. This corresponds to the HTML alt attribute.
*/

    @QtBlockedSlot
    public final java.lang.String alternateText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_alternateText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_alternateText(long __this__nativeId);

/**
Returns the bounding rect of the element.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect boundingRect()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_boundingRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_boundingRect(long __this__nativeId);

/**
Returns the frame the hit test was executed in.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebFrame frame()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frame(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebFrame __qt_frame(long __this__nativeId);

/**
Returns the url of the image.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl imageUrl()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_imageUrl(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_imageUrl(long __this__nativeId);

/**
Returns true if the content is editable by the user; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isContentEditable()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isContentEditable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isContentEditable(long __this__nativeId);

/**
Returns true if the content tested is part of the selection; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isContentSelected()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isContentSelected(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isContentSelected(long __this__nativeId);

/**
Returns true if the hit test result is null; otherwise returns false.
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
Returns the frame that will load the link if it is activated.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebFrame linkTargetFrame()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_linkTargetFrame(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebFrame __qt_linkTargetFrame(long __this__nativeId);

/**
Returns the text of the link.
*/

    @QtBlockedSlot
    public final java.lang.String linkText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_linkText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_linkText(long __this__nativeId);

/**
Returns the title of the link.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl linkTitle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_linkTitle(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_linkTitle(long __this__nativeId);

/**
Returns the url to which the link points to.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QUrl linkUrl()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_linkUrl(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_linkUrl(long __this__nativeId);

/**
Returns a {@link com.trolltech.qt.gui.QPixmap QPixmap} containing the image. A null pixmap is returned if the element being tested is not an image.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixmap(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_pixmap(long __this__nativeId);

/**
Returns the position where the hit test occured.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint pos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_pos(long __this__nativeId);

/**
Returns the title of the nearest enclosing HTML element.
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
@exclude
*/

    public static native QWebHitTestResult fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWebHitTestResult(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QWebHitTestResult array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QWebHitTestResult clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QWebHitTestResult __qt_clone(long __this_nativeId);
}
