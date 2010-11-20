package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QInputContextPlugin class provides an abstract base for custom {@link com.trolltech.qt.gui.QInputContext QInputContext} plugins. The input context plugin is a simple plugin interface that makes it easy to create custom input contexts that can be loaded dynamically into applications. <p>To create an input context plugin you subclass this base class, reimplement the pure virtual functions {@link com.trolltech.qt.gui.QInputContextPlugin#keys() keys()}, {@link com.trolltech.qt.gui.QInputContextPlugin#create(java.lang.String) create()}, {@link com.trolltech.qt.gui.QInputContextPlugin#languages(java.lang.String) languages()}, {@link com.trolltech.qt.gui.QInputContextPlugin#displayName(java.lang.String) displayName()}, and {@link com.trolltech.qt.gui.QInputContextPlugin#description(java.lang.String) description()}, and export the class with the Q_EXPORT_PLUGIN2() macro.Copyright (C) 2003-2004 immodule for Qt Project. All rights reserved.This file is written to contribute to Nokia Corporation and/or its subsidiary(-ies) under their own license. You may use this file under your Qt license. Following description is copied from their original file headers. Contact immodule-qt@freedesktop.org if any conditions of this licensing are not clear to you. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContext QInputContext}, and {@link <a href="../plugins-howto.html">How to Create Qt Plugins</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QInputContextPlugin extends com.trolltech.qt.core.QObject
    implements com.trolltech.qt.gui.QAbstractInputContextFactoryInterface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QInputContextPlugin {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QInputContext create(java.lang.String key) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_create_String(nativeId(), key);
        }

        @Override
        @QtBlockedSlot
        public java.lang.String description(java.lang.String key) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_description_String(nativeId(), key);
        }

        @Override
        @QtBlockedSlot
        public java.lang.String displayName(java.lang.String key) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_displayName_String(nativeId(), key);
        }

        @Override
        @QtBlockedSlot
        public java.util.List<java.lang.String> keys() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_keys(nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.util.List<java.lang.String> languages(java.lang.String key) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_languages_String(nativeId(), key);
        }
    }



/**
Constructs a input context plugin with the given <tt>parent</tt>. This is invoked automatically by the Q_EXPORT_PLUGIN2() macro.
*/

    public QInputContextPlugin() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a input context plugin with the given <tt>parent</tt>. This is invoked automatically by the Q_EXPORT_PLUGIN2() macro.
*/

    public QInputContextPlugin(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QInputContextPlugin_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QInputContextPlugin_QObject(long parent);

/**
Creates and returns a {@link com.trolltech.qt.gui.QInputContext QInputContext} object for the input context key <tt>key</tt>. The input context key is usually the class name of the required input method. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextPlugin#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QInputContext create(java.lang.String key);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QInputContext __qt_create_String(long __this__nativeId, java.lang.String key);

/**
Returns an internationalized brief description of the {@link com.trolltech.qt.gui.QInputContext QInputContext} object specified by <tt>key</tt>. You can, for example, use this description in a user interface. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextPlugin#keys() keys()}, and {@link com.trolltech.qt.gui.QInputContextPlugin#displayName(java.lang.String) displayName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.lang.String description(java.lang.String key);
    @QtBlockedSlot
    native java.lang.String __qt_description_String(long __this__nativeId, java.lang.String key);

/**
Returns a user friendly internationalized name of the {@link com.trolltech.qt.gui.QInputContext QInputContext} object specified by <tt>key</tt>. You can, for example, use this name in a menu. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextPlugin#keys() keys()}, and {@link com.trolltech.qt.gui.QInputContext#identifierName() QInputContext::identifierName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.lang.String displayName(java.lang.String key);
    @QtBlockedSlot
    native java.lang.String __qt_displayName_String(long __this__nativeId, java.lang.String key);

/**
Returns the list of {@link com.trolltech.qt.gui.QInputContext QInputContext} keys this plugin provides. <p>These keys are usually the class names of the custom input context that are implemented in the plugin. The names are used, for example, to identify and specify input methods for the input method switching mechanism. They have to be consistent with {@link com.trolltech.qt.gui.QInputContext#identifierName() QInputContext::identifierName()}, and may only contain ASCII characters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextPlugin#create(java.lang.String) create()}, {@link com.trolltech.qt.gui.QInputContextPlugin#displayName(java.lang.String) displayName()}, and {@link com.trolltech.qt.gui.QInputContext#identifierName() QInputContext::identifierName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> keys();
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_keys(long __this__nativeId);

/**
Returns the languages supported by the {@link com.trolltech.qt.gui.QInputContext QInputContext} object specified by <tt>key</tt>. <p>The languages are expressed as language code (e.g. "zh_CN", "zh_TW", "zh_HK", "ja", "ko", ...). An input context that supports multiple languages can return all supported languages as QStringList. The name has to be consistent with {@link com.trolltech.qt.gui.QInputContext#language() QInputContext::language()}. <p>This information may be used to optimize user interface. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextPlugin#keys() keys()}, {@link com.trolltech.qt.gui.QInputContext#language() QInputContext::language()}, and {@link com.trolltech.qt.core.QLocale QLocale}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> languages(java.lang.String key);
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_languages_String(long __this__nativeId, java.lang.String key);

/**
@exclude
*/

    public static native QInputContextPlugin fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QInputContextPlugin(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractInputContextFactory(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractFactory(long ptr);
}
