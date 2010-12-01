package com.trolltech.qt.webkit;

import com.trolltech.qt.*;



/**
The QWebHistoryInterface class provides an interface to implement link history. The QWebHistoryInterface is an interface that can be used to implement link history. It contains two pure virtual methods that are called by the WebKit engine. {@link com.trolltech.qt.webkit.QWebHistoryInterface#addHistoryEntry(java.lang.String) addHistoryEntry()} is used to add pages that have been visited to the interface, while {@link com.trolltech.qt.webkit.QWebHistoryInterface#historyContains(java.lang.String) historyContains()} is used to query whether this page has been visited by the user.
*/
@QtJambiGeneratedClass
public abstract class QWebHistoryInterface extends com.trolltech.qt.core.QObject
{

    private static Object __rcInterface = null;

    static {
        com.trolltech.qt.webkit.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.webkit.QWebHistoryInterface {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void addHistoryEntry(java.lang.String url) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_addHistoryEntry_String(nativeId(), url);
        }

        @Override
        @QtBlockedSlot
        public boolean historyContains(java.lang.String url) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_historyContains_String(nativeId(), url);
        }
    }



/**
Constructs a new QWebHistoryInterface with parent <tt>parent</tt>.
*/

    public QWebHistoryInterface() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a new QWebHistoryInterface with parent <tt>parent</tt>.
*/

    public QWebHistoryInterface(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QWebHistoryInterface_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QWebHistoryInterface_QObject(long parent);

/**
Called by WebKit to add another <tt>url</tt> to the list of visited pages.
*/

    @QtBlockedSlot
    public abstract void addHistoryEntry(java.lang.String url);
    @QtBlockedSlot
    native void __qt_addHistoryEntry_String(long __this__nativeId, java.lang.String url);

/**
Called by the WebKit engine to query whether a certain <tt>url</tt> has been visited by the user already. Returns true if the <tt>url</tt> is part of the history of visited links; otherwise returns false.
*/

    @QtBlockedSlot
    public abstract boolean historyContains(java.lang.String url);
    @QtBlockedSlot
    native boolean __qt_historyContains_String(long __this__nativeId, java.lang.String url);

/**
Returns the default interface that will be used by WebKit. If no default interface has been set, {@link <a href="../demos.html">QtWebkit</a>} will not track history. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistoryInterface#setDefaultInterface(com.trolltech.qt.webkit.QWebHistoryInterface) setDefaultInterface()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.webkit.QWebHistoryInterface defaultInterface();

/**
Sets a new default interface, <tt>defaultInterface</tt>, that will be used by all of WebKit for managing history. <p>If an interface without a parent has already been set, the old interface will be deleted. When the application exists QWebHistoryInterface will automatically delete the <tt>defaultInterface</tt> if it does not have a parent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistoryInterface#defaultInterface() defaultInterface()}. <br></DD></DT>
*/

    public static void setDefaultInterface(com.trolltech.qt.webkit.QWebHistoryInterface defaultInterface)    {
        {
            __rcInterface = defaultInterface;
        }
        __qt_setDefaultInterface_QWebHistoryInterface(defaultInterface == null ? 0 : defaultInterface.nativeId());
    }
    native static void __qt_setDefaultInterface_QWebHistoryInterface(long defaultInterface);

/**
@exclude
*/

    public static native QWebHistoryInterface fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWebHistoryInterface(QPrivateConstructor p) { super(p); } 
}
