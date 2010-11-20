package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QInputContextFactory class creates {@link com.trolltech.qt.gui.QInputContext QInputContext} objects. The input context factory creates a {@link com.trolltech.qt.gui.QInputContext QInputContext} object for a given key with {@link com.trolltech.qt.gui.QInputContextFactory#create(java.lang.String, com.trolltech.qt.core.QObject) QInputContextFactory::create()}. <p>The input contexts are either built-in or dynamically loaded from an input context plugin (see {@link com.trolltech.qt.gui.QInputContextPlugin QInputContextPlugin}). <p>{@link com.trolltech.qt.gui.QInputContextFactory#keys() keys()} returns a list of valid keys. The keys are the names used, for example, to identify and specify input methods for the input method switching mechanism. The names have to be consistent with {@link com.trolltech.qt.gui.QInputContext#identifierName() QInputContext::identifierName()}, and may only contain ASCII characters. <p>A key can be used to retrieve the associated input context's supported languages using {@link com.trolltech.qt.gui.QInputContextFactory#languages(java.lang.String) languages()}. You can retrieve the input context's description using {@link com.trolltech.qt.gui.QInputContextFactory#description(java.lang.String) description()} and finally you can get a user friendly internationalized name of the {@link com.trolltech.qt.gui.QInputContext QInputContext} object specified by the key using {@link com.trolltech.qt.gui.QInputContextFactory#displayName(java.lang.String) displayName()}.Copyright (C) 2003-2004 immodule for Qt Project. All rights reserved.This file is written to contribute to Nokia Corporation and/or its subsidiary(-ies) under their own license. You may use this file under your Qt license. Following description is copied from their original file headers. Contact immodule-qt@freedesktop.org if any conditions of this licensing are not clear to you. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContext QInputContext}, and {@link com.trolltech.qt.gui.QInputContextPlugin QInputContextPlugin}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QInputContextFactory extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
This is an overloaded method provided for convenience.
*/

    public QInputContextFactory(){
        super((QPrivateConstructor)null);
        __qt_QInputContextFactory();
    }

    native void __qt_QInputContextFactory();

/**
Creates and returns a {@link com.trolltech.qt.gui.QInputContext QInputContext} object for the input context specified by <tt>key</tt> with the given <tt>parent</tt>. Keys are case sensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#keys() keys()}. <br></DD></DT>
*/

    public static com.trolltech.qt.gui.QInputContext create(java.lang.String key, com.trolltech.qt.core.QObject parent)    {
        return __qt_create_String_QObject(key, parent == null ? 0 : parent.nativeId());
    }
    native static com.trolltech.qt.gui.QInputContext __qt_create_String_QObject(java.lang.String key, long parent);

/**
Returns an internationalized brief description of the {@link com.trolltech.qt.gui.QInputContext QInputContext} object specified by <tt>key</tt>. You can, for example, use this description in a user interface. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#keys() keys()}, and {@link com.trolltech.qt.gui.QInputContextFactory#displayName(java.lang.String) displayName()}. <br></DD></DT>
*/

    public native static java.lang.String description(java.lang.String key);

/**
Returns a user friendly internationalized name of the {@link com.trolltech.qt.gui.QInputContext QInputContext} object specified by <tt>key</tt>. You can, for example, use this name in a menu. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#keys() keys()}, and {@link com.trolltech.qt.gui.QInputContext#identifierName() QInputContext::identifierName()}. <br></DD></DT>
*/

    public native static java.lang.String displayName(java.lang.String key);

/**
Returns the list of keys this factory can create input contexts for. <p>The keys are the names used, for example, to identify and specify input methods for the input method switching mechanism. The names have to be consistent with {@link com.trolltech.qt.gui.QInputContext#identifierName() QInputContext::identifierName()}, and may only contain ASCII characters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#create(java.lang.String, com.trolltech.qt.core.QObject) create()}, {@link com.trolltech.qt.gui.QInputContextFactory#displayName(java.lang.String) displayName()}, and {@link com.trolltech.qt.gui.QInputContext#identifierName() QInputContext::identifierName()}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> keys();

/**
Returns the languages supported by the {@link com.trolltech.qt.gui.QInputContext QInputContext} object specified by <tt>key</tt>. <p>The languages are expressed as language code (e.g. "zh_CN", "zh_TW", "zh_HK", "ja", "ko", ...). An input context that supports multiple languages can return all supported languages as a QStringList. The name has to be consistent with {@link com.trolltech.qt.gui.QInputContext#language() QInputContext::language()}. <p>This information may be used to optimize a user interface. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#keys() keys()}, {@link com.trolltech.qt.gui.QInputContext#language() QInputContext::language()}, and {@link com.trolltech.qt.core.QLocale QLocale}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> languages(java.lang.String key);

/**
@exclude
*/

    public static native QInputContextFactory fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QInputContextFactory(QPrivateConstructor p) { super(p); } 
}
