package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QIconEngineV2 class provides an abstract base class for {@link com.trolltech.qt.gui.QIcon QIcon} renderers. An icon engine renders {@link com.trolltech.qt.gui.QIcon QIcon}s. With icon engines, you can customize icons. Qt provides a default engine that makes icons adhere to the current style by scaling the icons and providing a disabled appearance. <p>An engine is installed on an icon either through a {@link com.trolltech.qt.gui.QIcon QIcon} constructor or through a {@link com.trolltech.qt.gui.QIconEnginePluginV2 QIconEnginePluginV2}. The plugins are used by Qt if a specific engine is not given when the icon is created. See the QIconEngineV2 class description to learn how to create icon engine plugins. <p>An icon engine provides the rendering functions for a {@link com.trolltech.qt.gui.QIcon QIcon}. Each icon has a corresponding icon engine that is responsible for drawing the icon with a requested size, mode and state. <p>QIconEngineV2 extends the API of {@link com.trolltech.qt.gui.QIconEngine QIconEngine} to allow streaming of the icon engine contents, and should be used instead of {@link com.trolltech.qt.gui.QIconEngine QIconEngine} for implementing new icon engines. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIconEnginePluginV2 QIconEnginePluginV2}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QIconEngineV2 extends com.trolltech.qt.gui.QIconEngine
{

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QIconEngineV2 {
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

    public QIconEngineV2(){
        super((QPrivateConstructor)null);
        __qt_QIconEngineV2();
    }

    native void __qt_QIconEngineV2();


/**
Returns sizes of all images that are contained in the engine for the specific <tt>mode</tt> and <tt>state</tt>. <p><b>Note:</b> This is a helper method and the actual work is done by virtual_hook() method, hence this method depends on icon engine support and may not work with all icon engines.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QSize> availableSizes(com.trolltech.qt.gui.QIcon.Mode mode) {
        return availableSizes(mode, com.trolltech.qt.gui.QIcon.State.Off);
    }

/**
Returns sizes of all images that are contained in the engine for the specific <tt>mode</tt> and <tt>state</tt>. <p><b>Note:</b> This is a helper method and the actual work is done by virtual_hook() method, hence this method depends on icon engine support and may not work with all icon engines.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QSize> availableSizes() {
        return availableSizes(com.trolltech.qt.gui.QIcon.Mode.Normal, com.trolltech.qt.gui.QIcon.State.Off);
    }
/**
Returns sizes of all images that are contained in the engine for the specific <tt>mode</tt> and <tt>state</tt>. <p><b>Note:</b> This is a helper method and the actual work is done by virtual_hook() method, hence this method depends on icon engine support and may not work with all icon engines.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QSize> availableSizes(com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_availableSizes_Mode_State(nativeId(), mode.value(), state.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QSize> __qt_availableSizes_Mode_State(long __this__nativeId, int mode, int state);

/**
This method is reimplemented for internal reasons
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QIconEngineV2 clone()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIconEngineV2 __qt_clone(long __this__nativeId);

/**
Returns a key that identifies this icon engine.
*/

    @QtBlockedSlot
    public java.lang.String key()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_key(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_key(long __this__nativeId);

/**
Reads icon engine contents from the {@link com.trolltech.qt.core.QDataStream QDataStream}<tt>in</tt>. Returns true if the contents were read; otherwise returns false. <p>QIconEngineV2's default implementation always return false.
*/

    @QtBlockedSlot
    public boolean read(com.trolltech.qt.core.QDataStream in)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_read_QDataStream(nativeId(), in == null ? 0 : in.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_read_QDataStream(long __this__nativeId, long in);

/**
Writes the contents of this engine to the {@link com.trolltech.qt.core.QDataStream QDataStream}<tt>out</tt>. Returns true if the contents were written; otherwise returns false. <p>QIconEngineV2's default implementation always return false.
*/

    @QtBlockedSlot
    public boolean write(com.trolltech.qt.core.QDataStream out)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_write_QDataStream(nativeId(), out == null ? 0 : out.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_write_QDataStream(long __this__nativeId, long out);

    @QtBlockedSlot
    native void __qt_paint_QPainter_QRect_Mode_State(long __this__nativeId, long painter, long rect, int mode, int state);

/**
@exclude
*/

    public static native QIconEngineV2 fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QIconEngineV2(QPrivateConstructor p) { super(p); } 
}
