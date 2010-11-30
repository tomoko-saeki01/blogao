package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public interface QAbstractInputContextFactoryInterface extends QtJambiInterface, com.trolltech.qt.core.QAbstractFactoryInterface
{

/**
Creates and returns a {@link com.trolltech.qt.gui.QInputContext QInputContext} object for the input context specified by <tt>key</tt> with the given <tt>parent</tt>. Keys are case sensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QInputContext create(java.lang.String key);

/**
Returns an internationalized brief description of the {@link com.trolltech.qt.gui.QInputContext QInputContext} object specified by <tt>key</tt>. You can, for example, use this description in a user interface. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#keys() keys()}, and {@link com.trolltech.qt.gui.QInputContextFactory#displayName(java.lang.String) displayName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.String description(java.lang.String key);

/**
Returns a user friendly internationalized name of the {@link com.trolltech.qt.gui.QInputContext QInputContext} object specified by <tt>key</tt>. You can, for example, use this name in a menu. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#keys() keys()}, and {@link com.trolltech.qt.gui.QInputContext#identifierName() QInputContext::identifierName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.String displayName(java.lang.String key);

/**
Returns the list of keys this factory can create input contexts for. <p>The keys are the names used, for example, to identify and specify input methods for the input method switching mechanism. The names have to be consistent with {@link com.trolltech.qt.gui.QInputContext#identifierName() QInputContext::identifierName()}, and may only contain ASCII characters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#create(java.lang.String, com.trolltech.qt.core.QObject) create()}, {@link com.trolltech.qt.gui.QInputContextFactory#displayName(java.lang.String) displayName()}, and {@link com.trolltech.qt.gui.QInputContext#identifierName() QInputContext::identifierName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> keys();

/**
Returns the languages supported by the {@link com.trolltech.qt.gui.QInputContext QInputContext} object specified by <tt>key</tt>. <p>The languages are expressed as language code (e.g. "{@link com.trolltech.qt.gui.QInputContextFactory#languages(java.lang.String) zh_CN}", "{@link com.trolltech.qt.gui.QInputContextFactory#languages(java.lang.String) zh_TW}", "{@link com.trolltech.qt.gui.QInputContextFactory#languages(java.lang.String) zh_HK}", "ja", "ko", ...). An input context that supports multiple languages can return all supported languages as a QStringList. The name has to be consistent with {@link com.trolltech.qt.gui.QInputContext#language() QInputContext::language()}. <p>This information may be used to optimize a user interface. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContextFactory#keys() keys()}, {@link com.trolltech.qt.gui.QInputContext#language() QInputContext::language()}, and {@link com.trolltech.qt.core.QLocale QLocale}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> languages(java.lang.String key);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QAbstractInputContextFactory(long ptr);
}
