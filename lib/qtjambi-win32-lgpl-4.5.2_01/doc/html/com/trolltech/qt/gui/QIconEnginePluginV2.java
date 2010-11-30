package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QIconEnginePluginV2 class provides an abstract base for custom {@link com.trolltech.qt.gui.QIconEngineV2 QIconEngineV2} plugins. Icon engine plugins produces {@link com.trolltech.qt.gui.QIconEngine QIconEngine}s for {@link com.trolltech.qt.gui.QIcon QIcon}s; an icon engine is used to render the icon. The keys that identifies the engines the plugin can create are suffixes of icon filenames; they are returned by {@link com.trolltech.qt.gui.QIconEnginePluginV2#keys() keys()}. The {@link com.trolltech.qt.gui.QIconEnginePluginV2#create(java.lang.String) create()} function receives the icon filename to return an engine for; it should return 0 if it cannot produce an engine for the file. <p>Writing an icon engine plugin is achieved by inheriting QIconEnginePluginV2, reimplementing {@link com.trolltech.qt.gui.QIconEnginePluginV2#keys() keys()} and {@link com.trolltech.qt.gui.QIconEnginePluginV2#create(java.lang.String) create()}, and adding the Q_EXPORT_PLUGIN2() macro. <p>You should ensure that you do not duplicate keys. Qt will query the plugins for icon engines in the order in which the plugins are found during plugin search (see the plugins {@link <a href="../plugins-howto.html">overview document</a>}). <p><DT><b>See also:</b><br><DD>{@link <a href="../plugins-howto.html">How to Create Qt Plugins</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QIconEnginePluginV2 extends com.trolltech.qt.core.QObject
    implements com.trolltech.qt.gui.QAbstractIconEngineFactoryV2Interface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QIconEnginePluginV2 {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QIconEngineV2 create(java.lang.String filename) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_create_String(nativeId(), filename);
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
Constructs a icon engine plugin with the given <tt>parent</tt>. This is invoked automatically by the Q_EXPORT_PLUGIN2() macro.
*/

    public QIconEnginePluginV2() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a icon engine plugin with the given <tt>parent</tt>. This is invoked automatically by the Q_EXPORT_PLUGIN2() macro.
*/

    public QIconEnginePluginV2(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QIconEnginePluginV2_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QIconEnginePluginV2_QObject(long parent);

/**
Creates and returns a {@link com.trolltech.qt.gui.QIconEngine QIconEngine} object for the icon with the given <tt>filename</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIconEnginePluginV2#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QIconEngineV2 create(java.lang.String filename);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIconEngineV2 __qt_create_String(long __this__nativeId, java.lang.String filename);

/**
Returns a list of icon engine keys that this plugin supports. The keys correspond to the suffix of the file or resource name used when the plugin was created. Keys are case insensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIconEnginePluginV2#create(java.lang.String) create()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> keys();
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_keys(long __this__nativeId);

/**
@exclude
*/

    public static native QIconEnginePluginV2 fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QIconEnginePluginV2(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractIconEngineFactoryV2(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractFactory(long ptr);
}
