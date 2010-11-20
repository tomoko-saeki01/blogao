package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPaintEngineState class provides information about the active paint engine's current state. QPaintEngineState records which properties that have changed since the last time the paint engine was updated, as well as their current value. <p>Which properties that have changed can at any time be retrieved using the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} function. This function returns an instance of the QPaintEngine::DirtyFlags type which stores an OR combination of {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyFlag } values. The {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyFlag } enum defines whether a property has changed since the last update or not. <p>If a property is marked with a dirty flag, its current value can be retrieved using the corresponding get function:<a name="getfunction"> <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Property Flag</center></th><th><center> Current Property Value</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyBackground }</td><td> {@link com.trolltech.qt.gui.QPaintEngineState#backgroundBrush() backgroundBrush()}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyBackgroundMode }</td><td> {@link com.trolltech.qt.gui.QPaintEngineState#backgroundMode() backgroundMode()}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyBrush }</td><td> {@link com.trolltech.qt.gui.QPaintEngineState#brush() brush()}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyBrushOrigin }</td><td> {@link com.trolltech.qt.gui.QPaintEngineState#brushOrigin() brushOrigin()}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyClipRegion }or{@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyClipPath }</td><td> {@link com.trolltech.qt.gui.QPaintEngineState#clipOperation() clipOperation()}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyClipPath }</td><td> {@link com.trolltech.qt.gui.QPaintEngineState#clipPath() clipPath()}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyClipRegion }</td><td> {@link com.trolltech.qt.gui.QPaintEngineState#clipRegion() clipRegion()}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyCompositionMode }</td><td> {@link com.trolltech.qt.gui.QPaintEngineState#compositionMode() compositionMode()}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyFont }</td><td> {@link com.trolltech.qt.gui.QPaintEngineState#font() font()}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyTransform }</td><td> {@link com.trolltech.qt.gui.QPaintEngineState#matrix() matrix()}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyClipEnabled }</td><td> {@link com.trolltech.qt.gui.QPaintEngineState#isClipEnabled() isClipEnabled()}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyPen }</td><td> {@link com.trolltech.qt.gui.QPaintEngineState#pen() pen()}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyHints }</td><td> {@link com.trolltech.qt.gui.QPaintEngineState#renderHints() renderHints()}</td></tr></table> The QPaintEngineState class also provide the {@link com.trolltech.qt.gui.QPaintEngineState#painter() painter()} function which returns a pointer to the painter that is currently updating the paint engine. <p>An instance of this class, representing the current state of the active paint engine, is passed as argument to the {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()} function. The only situation in which you will have to use this class directly is when implementing your own paint engine. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngine QPaintEngine}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPaintEngineState extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QPaintEngineState(){
        super((QPrivateConstructor)null);
        __qt_QPaintEngineState();
    }

    native void __qt_QPaintEngineState();

/**
Returns the background brush in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyBackground } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush backgroundBrush()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_backgroundBrush(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_backgroundBrush(long __this__nativeId);

/**
Returns the background mode in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyBackgroundMode } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.BGMode backgroundMode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.BGMode.resolve(__qt_backgroundMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_backgroundMode(long __this__nativeId);

/**
Returns the brush in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyBrush } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QBrush brush()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_brush(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QBrush __qt_brush(long __this__nativeId);

/**
Returns whether the coordinate of the fill have been specified as bounded by the current rendering operation and have to be resolved (about the currently rendered primitive).
*/

    @QtBlockedSlot
    public final boolean brushNeedsResolving()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_brushNeedsResolving(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_brushNeedsResolving(long __this__nativeId);

/**
Returns the brush origin in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyBrushOrigin } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF brushOrigin()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_brushOrigin(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_brushOrigin(long __this__nativeId);

/**
Returns the clip operation in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes either the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyClipPath } or the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyClipRegion } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ClipOperation clipOperation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ClipOperation.resolve(__qt_clipOperation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_clipOperation(long __this__nativeId);

/**
Returns the clip path in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyClipPath } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainterPath clipPath()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clipPath(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainterPath __qt_clipPath(long __this__nativeId);

/**
Returns the clip region in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyClipRegion } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion clipRegion()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clipRegion(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_clipRegion(long __this__nativeId);

/**
Returns the composition mode in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyCompositionMode } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainter.CompositionMode compositionMode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPainter.CompositionMode.resolve(__qt_compositionMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_compositionMode(long __this__nativeId);

/**
Returns the font in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyFont } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont font()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_font(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_font(long __this__nativeId);

/**
Returns wether clipping is enabled or not in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyClipEnabled } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isClipEnabled()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isClipEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isClipEnabled(long __this__nativeId);

/**
Returns the matrix in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyTransform } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMatrix matrix()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_matrix(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMatrix __qt_matrix(long __this__nativeId);

/**
Returns the opacity in the current paint engine state.
*/

    @QtBlockedSlot
    public final double opacity()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_opacity(nativeId());
    }
    @QtBlockedSlot
    native double __qt_opacity(long __this__nativeId);

/**
Returns a pointer to the painter currently updating the paint engine.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainter painter()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_painter(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPainter __qt_painter(long __this__nativeId);

/**
Returns the pen in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyPen } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPen pen()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pen(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPen __qt_pen(long __this__nativeId);

/**
Returns whether the coordinate of the stroke have been specified as bounded by the current rendering operation and have to be resolved (about the currently rendered primitive).
*/

    @QtBlockedSlot
    public final boolean penNeedsResolving()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_penNeedsResolving(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_penNeedsResolving(long __this__nativeId);

/**
Returns the render hints in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyHints } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPainter.RenderHints renderHints()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QPainter.RenderHints(__qt_renderHints(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_renderHints(long __this__nativeId);

/**
Returns a combination of flags identifying the set of properties that need to be updated when updating the paint engine's state (i. . during a call to the {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()} function). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPaintEngine.DirtyFlags state()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QPaintEngine.DirtyFlags(__qt_state(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_state(long __this__nativeId);

/**
Returns the matrix in the current paint engine state. <p>This variable should only be used when the {@link com.trolltech.qt.gui.QPaintEngineState#state() state()} returns a combination which includes the {@link com.trolltech.qt.gui.QPaintEngine.DirtyFlag QPaintEngine::DirtyTransform } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintEngineState#state() state()}, and {@link com.trolltech.qt.gui.QPaintEngine#updateState(com.trolltech.qt.gui.QPaintEngineState) QPaintEngine::updateState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTransform transform()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_transform(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTransform __qt_transform(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    protected final void setDirtyFlags(com.trolltech.qt.gui.QPaintEngine.DirtyFlag ... dirtyFlags) {
        this.setDirtyFlags(new com.trolltech.qt.gui.QPaintEngine.DirtyFlags(dirtyFlags));
    }
/**

*/

    @QtBlockedSlot
    protected final void setDirtyFlags(com.trolltech.qt.gui.QPaintEngine.DirtyFlags dirtyFlags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDirtyFlags_DirtyFlags(nativeId(), dirtyFlags.value());
    }
    @QtBlockedSlot
    native void __qt_setDirtyFlags_DirtyFlags(long __this__nativeId, int dirtyFlags);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QPaintEngine.DirtyFlags dirtyFlags()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QPaintEngine.DirtyFlags(__qt_dirtyFlags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_dirtyFlags(long __this__nativeId);

/**
@exclude
*/

    public static native QPaintEngineState fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPaintEngineState(QPrivateConstructor p) { super(p); } 
}
