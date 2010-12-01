package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QIconEngine class provides an abstract base class for {@link com.trolltech.qt.gui.QIcon QIcon} renderers. <b>Use {@link com.trolltech.qt.gui.QIconEngineV2 QIconEngineV2} instead.</b> <p>An icon engine provides the rendering functions for a {@link com.trolltech.qt.gui.QIcon QIcon}. Each icon has a corresponding icon engine that is responsible for drawing the icon with a requested size, mode and state. <p>The icon is rendered by the {@link com.trolltech.qt.gui.QIconEngine#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QIcon.Mode, com.trolltech.qt.gui.QIcon.State) paint()} function, and the icon can additionally be obtained as a pixmap with the {@link com.trolltech.qt.gui.QIconEngine#pixmap(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode, com.trolltech.qt.gui.QIcon.State) pixmap()} function (the default implementation simply uses {@link com.trolltech.qt.gui.QIconEngine#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QIcon.Mode, com.trolltech.qt.gui.QIcon.State) paint()} to achieve this). The {@link com.trolltech.qt.gui.QIconEngine#addPixmap(com.trolltech.qt.gui.QPixmap, com.trolltech.qt.gui.QIcon.Mode, com.trolltech.qt.gui.QIcon.State) addPixmap()} function can be used to add new pixmaps to the icon engine, and is used by {@link com.trolltech.qt.gui.QIcon QIcon} to add specialized custom pixmaps. <p>The {@link com.trolltech.qt.gui.QIconEngine#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QIcon.Mode, com.trolltech.qt.gui.QIcon.State) paint()}, {@link com.trolltech.qt.gui.QIconEngine#pixmap(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode, com.trolltech.qt.gui.QIcon.State) pixmap()}, and {@link com.trolltech.qt.gui.QIconEngine#addPixmap(com.trolltech.qt.gui.QPixmap, com.trolltech.qt.gui.QIcon.Mode, com.trolltech.qt.gui.QIcon.State) addPixmap()} functions are all virtual, and can therefore be reimplemented in subclasses of QIconEngine. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIconEngineV2 QIconEngineV2}, and QIconEnginePlugin. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QIconEngine extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QIconEngine {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void paint(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRect rect, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_paint_QPainter_QRect_Mode_State(nativeId(), painter == null ? 0 : painter.nativeId(), rect == null ? 0 : rect.nativeId(), mode.value(), state.value());
        }
    }


/**
This is an overloaded method provided for convenience.
*/

    public QIconEngine(){
        super((QPrivateConstructor)null);
        __qt_QIconEngine();
    }

    native void __qt_QIconEngine();

/**
Returns the actual size of the icon the engine provides for the requested <tt>size</tt>, <tt>mode</tt> and <tt>state</tt>. The default implementation returns the given <tt>size</tt>.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize actualSize(com.trolltech.qt.core.QSize size, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_actualSize_QSize_Mode_State(nativeId(), size == null ? 0 : size.nativeId(), mode.value(), state.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_actualSize_QSize_Mode_State(long __this__nativeId, long size, int mode, int state);

/**
Called by {@link com.trolltech.qt.gui.QIcon#addFile(java.lang.String, com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) QIcon::addFile()}. Adds a specialized pixmap from the file with the given <tt>fileName</tt>, <tt>size</tt>, <tt>mode</tt> and <tt>state</tt>. The default pixmap-based engine stores any supplied file names, and it loads the pixmaps on demand instead of using scaled pixmaps if the size of a pixmap matches the size of icon requested. Custom icon engines that implement scalable vector formats are free to ignores any extra files.
*/

    @QtBlockedSlot
    public void addFile(java.lang.String fileName, com.trolltech.qt.core.QSize size, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addFile_String_QSize_Mode_State(nativeId(), fileName, size == null ? 0 : size.nativeId(), mode.value(), state.value());
    }
    @QtBlockedSlot
    native void __qt_addFile_String_QSize_Mode_State(long __this__nativeId, java.lang.String fileName, long size, int mode, int state);

/**
Called by {@link com.trolltech.qt.gui.QIcon#addPixmap(com.trolltech.qt.gui.QPixmap, com.trolltech.qt.gui.QIcon.Mode) QIcon::addPixmap()}. Adds a specialized <tt>pixmap</tt> for the given <tt>mode</tt> and <tt>state</tt>. The default pixmap-based engine stores any supplied pixmaps, and it uses them instead of scaled pixmaps if the size of a pixmap matches the size of icon requested. Custom icon engines that implement scalable vector formats are free to ignores any extra pixmaps.
*/

    @QtBlockedSlot
    public void addPixmap(com.trolltech.qt.gui.QPixmap pixmap, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addPixmap_QPixmap_Mode_State(nativeId(), pixmap == null ? 0 : pixmap.nativeId(), mode.value(), state.value());
    }
    @QtBlockedSlot
    native void __qt_addPixmap_QPixmap_Mode_State(long __this__nativeId, long pixmap, int mode, int state);

/**
Uses the given <tt>painter</tt> to paint the icon with the required <tt>mode</tt> and <tt>state</tt> into the rectangle <tt>rect</tt>.
*/

    @QtBlockedSlot
    public abstract void paint(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRect rect, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state);
    @QtBlockedSlot
    native void __qt_paint_QPainter_QRect_Mode_State(long __this__nativeId, long painter, long rect, int mode, int state);

/**
Returns the icon as a pixmap with the required <tt>size</tt>, <tt>mode</tt>, and <tt>state</tt>. The default implementation creates a new pixmap and calls {@link com.trolltech.qt.gui.QIconEngine#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, com.trolltech.qt.gui.QIcon.Mode, com.trolltech.qt.gui.QIcon.State) paint()} to fill it.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QPixmap pixmap(com.trolltech.qt.core.QSize size, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixmap_QSize_Mode_State(nativeId(), size == null ? 0 : size.nativeId(), mode.value(), state.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_pixmap_QSize_Mode_State(long __this__nativeId, long size, int mode, int state);

/**
@exclude
*/

    public static native QIconEngine fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QIconEngine(QPrivateConstructor p) { super(p); } 
}
