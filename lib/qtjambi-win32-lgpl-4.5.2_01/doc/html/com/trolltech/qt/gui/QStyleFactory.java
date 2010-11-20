package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleFactory class creates {@link com.trolltech.qt.gui.QStyle QStyle} objects. The {@link com.trolltech.qt.gui.QStyle QStyle} class is an abstract base class that encapsulates the look and feel of a GUI. QStyleFactory creates a {@link com.trolltech.qt.gui.QStyle QStyle} object using the {@link com.trolltech.qt.gui.QStyleFactory#create(java.lang.String) create()} function and a key identifying the style. The styles are either built-in or dynamically loaded from a style plugin (see {@link com.trolltech.qt.gui.QStylePlugin QStylePlugin}). <p>The valid keys can be retrieved using the {@link com.trolltech.qt.gui.QStyleFactory#keys() keys()} function. Typically they include "windows", "motif", "cde", "plastique" and "cleanlooks". Depending on the platform, "windowsxp", "windowsvista" and "macintosh" may be available. Note that keys are case insensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle QStyle}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleFactory extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
This is an overloaded method provided for convenience.
*/

    public QStyleFactory(){
        super((QPrivateConstructor)null);
        __qt_QStyleFactory();
    }

    native void __qt_QStyleFactory();

/**
Creates and returns a {@link com.trolltech.qt.gui.QStyle QStyle} object that matches the given <tt>key</tt>, or returns 0 if no matching style is found. <p>Both built-in styles and styles from style plugins are queried for a matching style. <p><b>Note:</b> The keys used are case insensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleFactory#keys() keys()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QStyle create(java.lang.String arg__1);

/**
Returns the list of valid keys, i. . the keys this factory can create styles for. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleFactory#create(java.lang.String) create()}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> keys();

/**
@exclude
*/

    public static native QStyleFactory fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleFactory(QPrivateConstructor p) { super(p); } 
}
