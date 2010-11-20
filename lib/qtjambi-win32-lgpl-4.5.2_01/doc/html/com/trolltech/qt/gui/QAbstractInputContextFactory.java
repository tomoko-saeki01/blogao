package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public abstract class QAbstractInputContextFactory extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QAbstractInputContextFactoryInterface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractInputContextFactory {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QInputContext create(java.lang.String key) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_create_String(nativeId(), key);
        }

        @Override
        @QtBlockedSlot
        public java.lang.String description(java.lang.String key) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_description_String(nativeId(), key);
        }

        @Override
        @QtBlockedSlot
        public java.lang.String displayName(java.lang.String key) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_displayName_String(nativeId(), key);
        }

        @Override
        @QtBlockedSlot
        public java.util.List<java.lang.String> keys() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_keys(nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.util.List<java.lang.String> languages(java.lang.String key) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_languages_String(nativeId(), key);
        }
    }


/**

*/

    public QAbstractInputContextFactory(){
        super((QPrivateConstructor)null);
        __qt_QAbstractInputContextFactory();
    }

    native void __qt_QAbstractInputContextFactory();

/**
Creates and returns a {@link com.trolltech.qt.gui.QInputContext QInputContext} object for the input context specified by <tt>key</tt> with the given <tt>parent</tt>. Keys are case sensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QInputContext create(java.lang.String key);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QInputContext __qt_create_String(long __this__nativeId, java.lang.String key);

/**
Returns an internationalized brief description of the {@link com.trolltech.qt.gui.QInputContext QInputContext} object specified by <tt>key</tt>. You can, for example, use this description in a user interface. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#keys() keys()}, and {@link com.trolltech.qt.gui.QInputContextFactory#displayName(java.lang.String) displayName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.lang.String description(java.lang.String key);
    @QtBlockedSlot
    native java.lang.String __qt_description_String(long __this__nativeId, java.lang.String key);

/**
Returns a user friendly internationalized name of the {@link com.trolltech.qt.gui.QInputContext QInputContext} object specified by <tt>key</tt>. You can, for example, use this name in a menu. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#keys() keys()}, and {@link com.trolltech.qt.gui.QInputContext#identifierName() QInputContext::identifierName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.lang.String displayName(java.lang.String key);
    @QtBlockedSlot
    native java.lang.String __qt_displayName_String(long __this__nativeId, java.lang.String key);

/**
Returns the list of keys this factory can create input contexts for. <p>The keys are the names used, for example, to identify and specify input methods for the input method switching mechanism. The names have to be consistent with {@link com.trolltech.qt.gui.QInputContext#identifierName() QInputContext::identifierName()}, and may only contain ASCII characters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#create(java.lang.String, com.trolltech.qt.core.QObject) create()}, {@link com.trolltech.qt.gui.QInputContextFactory#displayName(java.lang.String) displayName()}, and {@link com.trolltech.qt.gui.QInputContext#identifierName() QInputContext::identifierName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> keys();
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_keys(long __this__nativeId);

/**
Returns the languages supported by the {@link com.trolltech.qt.gui.QInputContext QInputContext} object specified by <tt>key</tt>. <p>The languages are expressed as language code (e.g. "{@link com.trolltech.qt.gui.QInputContextFactory#languages(java.lang.String) zh_CN}", "{@link com.trolltech.qt.gui.QInputContextFactory#languages(java.lang.String) zh_TW}", "{@link com.trolltech.qt.gui.QInputContextFactory#languages(java.lang.String) zh_HK}", "ja", "ko", ...). An input context that supports multiple languages can return all supported languages as a QStringList. The name has to be consistent with {@link com.trolltech.qt.gui.QInputContext#language() QInputContext::language()}. <p>This information may be used to optimize a user interface. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#keys() keys()}, {@link com.trolltech.qt.gui.QInputContext#language() QInputContext::language()}, and {@link com.trolltech.qt.core.QLocale QLocale}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> languages(java.lang.String key);
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_languages_String(long __this__nativeId, java.lang.String key);

/**
@exclude
*/

    public static native QAbstractInputContextFactory fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractInputContextFactory(QPrivateConstructor p) { super(p); } 

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
