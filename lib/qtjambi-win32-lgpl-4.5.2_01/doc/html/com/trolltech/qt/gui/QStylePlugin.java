package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStylePlugin class provides an abstract base for custom {@link com.trolltech.qt.gui.QStyle QStyle} plugins. QStylePlugin is a simple plugin interface that makes it easy to create custom styles that can be loaded dynamically into applications using the {@link com.trolltech.qt.gui.QStyleFactory QStyleFactory} class. <p>Writing a style plugin is achieved by subclassing this base class, reimplementing the pure virtual {@link com.trolltech.qt.gui.QStylePlugin#keys() keys()} and {@link com.trolltech.qt.gui.QStylePlugin#create(java.lang.String) create()} functions, and exporting the class using the Q_EXPORT_PLUGIN2() macro. See {@link <a href="../plugins-howto.html">How to Create Qt Plugins</a>} for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleFactory QStyleFactory}, and {@link com.trolltech.qt.gui.QStyle QStyle}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QStylePlugin extends com.trolltech.qt.core.QObject
    implements com.trolltech.qt.gui.QAbstractStyleFactoryInterface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QStylePlugin {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QStyle create(java.lang.String key) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_create_String(nativeId(), key);
        }

        @Override
        @QtBlockedSlot
        public java.util.List<java.lang.String> keys() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_keys(nativeId());
        }
    }



/**
Constructs a style plugin with the given <tt>parent</tt>. <p>Note that this constructor is invoked automatically by the Q_EXPORT_PLUGIN2() macro, so there is no need for calling it explicitly.
*/

    public QStylePlugin() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a style plugin with the given <tt>parent</tt>. <p>Note that this constructor is invoked automatically by the Q_EXPORT_PLUGIN2() macro, so there is no need for calling it explicitly.
*/

    public QStylePlugin(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QStylePlugin_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QStylePlugin_QObject(long parent);

/**
Creates and returns a {@link com.trolltech.qt.gui.QStyle QStyle} object for the given style <tt>key</tt>. If a plugin cannot create a style, it should return 0 instead. <p>The style key is usually the class name of the required style. Note that the keys are case insensitive. For example: <pre class="snippet">
    List&lt;String&gt; keys()
    {
        List&lt;String&gt; keyList = new Vector&lt;String&gt;();
        keyList.add("Rocket");
        keyList.add("StarBuster");

        return keyList;
    }
    <br>
    QStyle create(String key)
    {
        String lcKey = key;

        if (lcKey.equals("rocket")) {
            return new RocketStyle();
        } else if (lcKey.equals("starbuster")) {
            return new StarBusterStyle();
        }
        return null;
    
    }
    </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStylePlugin#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QStyle create(java.lang.String key);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStyle __qt_create_String(long __this__nativeId, java.lang.String key);

/**
Returns the list of style keys this plugin supports. <p>These keys are usually the class names of the custom styles that are implemented in the plugin. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStylePlugin#create(java.lang.String) create()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> keys();
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_keys(long __this__nativeId);

/**
@exclude
*/

    public static native QStylePlugin fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStylePlugin(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractStyleFactory(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractFactory(long ptr);
}
