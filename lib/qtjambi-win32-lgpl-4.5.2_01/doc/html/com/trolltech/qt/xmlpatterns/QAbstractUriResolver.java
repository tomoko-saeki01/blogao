package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;



/**
The QAbstractUriResolver class is a callback interface for resolving Uniform Resource Identifiers. A Uniform Resource Identifier (URI) is a string that uniquely identifies a resource. URIs are versatile global identifiers. It is often useful to transform a URI that identifies something logical into a URI that locates something physical (a URL), or to simply map a URI to a different URI. {@link com.trolltech.qt.xmlpatterns.QAbstractUriResolver#resolve(com.trolltech.qt.core.QUrl, com.trolltech.qt.core.QUrl) QAbstractUriResolver::resolve()} provides this functionality. <p>For example, one could write a QAbstractUriResolver subclass that rewrites library ISBN number URIs as book title URLs, e.g., urn:isbn:0-345-33973-8 would be rewritten as file:///books/returnOfTheKing.doc. Or a QAbstractUriResolver subclass could be written for a web browser to let the web browser protect the user's private files by mapping incoming requests for them to null URIs. <p><DT><b>See also:</b><br><DD></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractUriResolver extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.xmlpatterns.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.xmlpatterns.QAbstractUriResolver {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QUrl resolve(com.trolltech.qt.core.QUrl relative, com.trolltech.qt.core.QUrl baseURI) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_resolve_QUrl_QUrl(nativeId(), relative == null ? 0 : relative.nativeId(), baseURI == null ? 0 : baseURI.nativeId());
        }
    }



/**
Constructs a QAbstractUriResolver with the specified <tt>parent</tt>.
*/

    public QAbstractUriResolver() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QAbstractUriResolver with the specified <tt>parent</tt>.
*/

    public QAbstractUriResolver(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QAbstractUriResolver_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QAbstractUriResolver_QObject(long parent);

/**
Returns the <tt>relative</tt> URI resolved using the <tt>baseURI</tt>. <p>The caller guarantees that both <tt>relative</tt> and <tt>baseURI</tt> are valid, and that <tt>baseURI</tt> is absolute. <tt>relative</tt> can be relative, absolute, or empty. <p>The returned {@link com.trolltech.qt.core.QUrl QUrl} can be a default constructed {@link com.trolltech.qt.core.QUrl QUrl}. If it is not a default constructed {@link com.trolltech.qt.core.QUrl QUrl}, it will be absolute and valid. If a default constructed {@link com.trolltech.qt.core.QUrl QUrl} is returned, it means the <tt>relative</tt> URI was not accepted to be resolved. <p>If the reimplemented {@link com.trolltech.qt.xmlpatterns.QAbstractUriResolver#resolve(com.trolltech.qt.core.QUrl, com.trolltech.qt.core.QUrl) resolve()} function decides it has nothing to do about resolving the <tt>relative</tt> URI, it should simply return the <tt>relative</tt> URI resolved against the <tt>baseURI</tt>, i.e.: <pre class="snippet">
    return baseURI.resolved(relative);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl#isRelative() QUrl::isRelative()}, and {@link com.trolltech.qt.core.QUrl#isValid() QUrl::isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QUrl resolve(com.trolltech.qt.core.QUrl relative, com.trolltech.qt.core.QUrl baseURI);
    @QtBlockedSlot
    native com.trolltech.qt.core.QUrl __qt_resolve_QUrl_QUrl(long __this__nativeId, long relative, long baseURI);

/**
@exclude
*/

    public static native QAbstractUriResolver fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractUriResolver(QPrivateConstructor p) { super(p); } 
}
