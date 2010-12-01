package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QGraphicsItemAnimation class provides simple animation support for {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}. The QGraphicsItemAnimation class animates a {@link com.trolltech.qt.gui.QGraphicsItem QGraphicsItem}. You can schedule changes to the item's transformation matrix at specified steps. The QGraphicsItemAnimation class has a current step value. When this value changes the transformations scheduled at that step are performed. The current step of the animation is set with the <tt>setStep()</tt> function. <p>QGraphicsItemAnimation will do a simple linear interpolation between the nearest adjacent scheduled changes to calculate the matrix. For instance, if you set the position of an item at values 0.0 and 1.0, the animation will show the item moving in a straight line between these positions. The same is true for scaling and rotation. <p>It is usual to use the class with a {@link com.trolltech.qt.core.QTimeLine QTimeLine}. The timeline's {@link com.trolltech.qt.core.QTimeLine#valueChanged valueChanged() } signal is then connected to the <tt>setStep()</tt> slot. For example, you can set up an item for rotation by calling <tt>setRotationAt()</tt> for different step values. The animations timeline is set with the {@link com.trolltech.qt.gui.QGraphicsItemAnimation#setTimeLine(com.trolltech.qt.core.QTimeLine) setTimeLine()} function. <p>An example animation with a timeline follows: <pre class="snippet">
        QGraphicsEllipseItem ball = new QGraphicsEllipseItem(0, 0, 20, 20);

        QTimeLine timer = new QTimeLine(5000);
        timer.setFrameRange(0, 100);

        QGraphicsItemAnimation animation = new QGraphicsItemAnimation();
        animation.setItem(ball);
        animation.setTimeLine(timer);

        for (int i = 0; i &lt; 200; ++i)
            animation.setPosAt(i / 200.0, new QPointF(i, i));

        QGraphicsScene scene = new QGraphicsScene();
        scene.setSceneRect(new QRectF(0, 0, 250, 250));
        scene.addItem(ball);

        QGraphicsView view = new QGraphicsView(scene);
        view.show();

        timer.start();
    </pre> Note that steps lie between 0.0 and 1.0. It may be necessary to use {@link QTimeLine#setUpdateInterval(int) setUpdateInterval()}. The default update interval is 40 ms. A scheduled transformation cannot be removed when set, so scheduling several transformations of the same kind (e.g., rotations) at the same step is not recommended. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTimeLine QTimeLine}, and {@link <a href="../graphicsview.html">The Graphics View Framework</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QGraphicsItemAnimation extends com.trolltech.qt.core.QObject
{

    private Object __rcTimeLine = null;

    private Object __rcItem = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }


/**
Constructs an animation object with the given <tt>parent</tt>.
*/

    public QGraphicsItemAnimation() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an animation object with the given <tt>parent</tt>.
*/

    public QGraphicsItemAnimation(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QGraphicsItemAnimation_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGraphicsItemAnimation_QObject(long parent);

/**
Clears the scheduled transformations used for the animation, but retains the item and timeline.
*/

    @QtBlockedSlot
    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
Returns the horizontal scale for the item at the specified <tt>step</tt> value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#setScaleAt(double, double, double) setScaleAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double horizontalScaleAt(double step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_horizontalScaleAt_double(nativeId(), step);
    }
    @QtBlockedSlot
    native double __qt_horizontalScaleAt_double(long __this__nativeId, double step);

/**
Returns the horizontal shear for the item at the specified <tt>step</tt> value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#setShearAt(double, double, double) setShearAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double horizontalShearAt(double step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_horizontalShearAt_double(nativeId(), step);
    }
    @QtBlockedSlot
    native double __qt_horizontalShearAt_double(long __this__nativeId, double step);

/**
Returns the item on which the animation object operates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#setItem(com.trolltech.qt.gui.QGraphicsItemInterface) setItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsItemInterface item()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_item(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsItemInterface __qt_item(long __this__nativeId);

/**
Returns the matrix used to transform the item at the specified <tt>step</tt> value.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMatrix matrixAt(double step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_matrixAt_double(nativeId(), step);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMatrix __qt_matrixAt_double(long __this__nativeId, double step);

/**
Returns the position of the item at the given <tt>step</tt> value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#setPosAt(double, com.trolltech.qt.core.QPointF) setPosAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF posAt(double step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_posAt_double(nativeId(), step);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_posAt_double(long __this__nativeId, double step);

/**
Returns all explicitly inserted positions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#posAt(double) posAt()}, and {@link com.trolltech.qt.gui.QGraphicsItemAnimation#setPosAt(double, com.trolltech.qt.core.QPointF) setPosAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.QPair<java.lang.Double, com.trolltech.qt.core.QPointF>> posList()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_posList(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.QPair<java.lang.Double, com.trolltech.qt.core.QPointF>> __qt_posList(long __this__nativeId);

/**
Resets the item to its starting position and transformation. <p>You can call setStep(0) instead.
*/

    public final void reset()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    native void __qt_reset(long __this__nativeId);

/**
Returns the angle at which the item is rotated at the specified <tt>step</tt> value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#setRotationAt(double, double) setRotationAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double rotationAt(double step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rotationAt_double(nativeId(), step);
    }
    @QtBlockedSlot
    native double __qt_rotationAt_double(long __this__nativeId, double step);

/**
Returns all explicitly inserted rotations. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#rotationAt(double) rotationAt()}, and {@link com.trolltech.qt.gui.QGraphicsItemAnimation#setRotationAt(double, double) setRotationAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.QPair<java.lang.Double, java.lang.Double>> rotationList()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rotationList(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.QPair<java.lang.Double, java.lang.Double>> __qt_rotationList(long __this__nativeId);

/**
Returns all explicitly inserted scales. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#verticalScaleAt(double) verticalScaleAt()}, {@link com.trolltech.qt.gui.QGraphicsItemAnimation#horizontalScaleAt(double) horizontalScaleAt()}, and {@link com.trolltech.qt.gui.QGraphicsItemAnimation#setScaleAt(double, double, double) setScaleAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.QPair<java.lang.Double, com.trolltech.qt.core.QPointF>> scaleList()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scaleList(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.QPair<java.lang.Double, com.trolltech.qt.core.QPointF>> __qt_scaleList(long __this__nativeId);

/**
Sets the specified <tt>item</tt> to be used in the animation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#item() item()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItem(com.trolltech.qt.gui.QGraphicsItemInterface item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcItem = item;
        }
        __qt_setItem_QGraphicsItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItem_QGraphicsItem(long __this__nativeId, long item);

/**
Sets the position of the item at the given <tt>step</tt> value to the <tt>point</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#posAt(double) posAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPosAt(double step, com.trolltech.qt.core.QPointF pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPosAt_double_QPointF(nativeId(), step, pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPosAt_double_QPointF(long __this__nativeId, double step, long pos);

/**
Sets the rotation of the item at the given <tt>step</tt> value to the <tt>angle</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#rotationAt(double) rotationAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRotationAt(double step, double angle)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRotationAt_double_double(nativeId(), step, angle);
    }
    @QtBlockedSlot
    native void __qt_setRotationAt_double_double(long __this__nativeId, double step, double angle);

/**
Sets the scale of the item at the given <tt>step</tt> value using the horizontal and vertical scale factors specified by <tt>sx</tt> and <tt>sy</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#verticalScaleAt(double) verticalScaleAt()}, and {@link com.trolltech.qt.gui.QGraphicsItemAnimation#horizontalScaleAt(double) horizontalScaleAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setScaleAt(double step, double sx, double sy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScaleAt_double_double_double(nativeId(), step, sx, sy);
    }
    @QtBlockedSlot
    native void __qt_setScaleAt_double_double_double(long __this__nativeId, double step, double sx, double sy);

/**
Sets the shear of the item at the given <tt>step</tt> value using the horizontal and vertical shear factors specified by <tt>sh</tt> and <tt>sv</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#verticalShearAt(double) verticalShearAt()}, and {@link com.trolltech.qt.gui.QGraphicsItemAnimation#horizontalShearAt(double) horizontalShearAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShearAt(double step, double sh, double sv)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShearAt_double_double_double(nativeId(), step, sh, sv);
    }
    @QtBlockedSlot
    native void __qt_setShearAt_double_double_double(long __this__nativeId, double step, double sh, double sv);

/**
Sets the current <tt>step</tt> value for the animation, causing the transformations scheduled at this step to be performed.
*/

    public final void setStep(double x)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStep_double(nativeId(), x);
    }
    native void __qt_setStep_double(long __this__nativeId, double x);

/**
Sets the timeline object used to control the rate of animation to the <tt>timeLine</tt> specified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#timeLine() timeLine()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTimeLine(com.trolltech.qt.core.QTimeLine timeLine)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcTimeLine = timeLine;
        }
        __qt_setTimeLine_QTimeLine(nativeId(), timeLine == null ? 0 : timeLine.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTimeLine_QTimeLine(long __this__nativeId, long timeLine);

/**
Sets the translation of the item at the given <tt>step</tt> value using the horizontal and vertical coordinates specified by <tt>dx</tt> and <tt>dy</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#xTranslationAt(double) xTranslationAt()}, and {@link com.trolltech.qt.gui.QGraphicsItemAnimation#yTranslationAt(double) yTranslationAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTranslationAt(double step, double dx, double dy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTranslationAt_double_double_double(nativeId(), step, dx, dy);
    }
    @QtBlockedSlot
    native void __qt_setTranslationAt_double_double_double(long __this__nativeId, double step, double dx, double dy);

/**
Returns all explicitly inserted shears. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#verticalShearAt(double) verticalShearAt()}, {@link com.trolltech.qt.gui.QGraphicsItemAnimation#horizontalShearAt(double) horizontalShearAt()}, and {@link com.trolltech.qt.gui.QGraphicsItemAnimation#setShearAt(double, double, double) setShearAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.QPair<java.lang.Double, com.trolltech.qt.core.QPointF>> shearList()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_shearList(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.QPair<java.lang.Double, com.trolltech.qt.core.QPointF>> __qt_shearList(long __this__nativeId);

/**
Returns the timeline object used to control the rate at which the animation occurs. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#setTimeLine(com.trolltech.qt.core.QTimeLine) setTimeLine()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTimeLine timeLine()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_timeLine(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTimeLine __qt_timeLine(long __this__nativeId);

/**
Returns all explicitly inserted translations. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#xTranslationAt(double) xTranslationAt()}, {@link com.trolltech.qt.gui.QGraphicsItemAnimation#yTranslationAt(double) yTranslationAt()}, and {@link com.trolltech.qt.gui.QGraphicsItemAnimation#setTranslationAt(double, double, double) setTranslationAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.QPair<java.lang.Double, com.trolltech.qt.core.QPointF>> translationList()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translationList(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.QPair<java.lang.Double, com.trolltech.qt.core.QPointF>> __qt_translationList(long __this__nativeId);

/**
Returns the vertical scale for the item at the specified <tt>step</tt> value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#setScaleAt(double, double, double) setScaleAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double verticalScaleAt(double step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_verticalScaleAt_double(nativeId(), step);
    }
    @QtBlockedSlot
    native double __qt_verticalScaleAt_double(long __this__nativeId, double step);

/**
Returns the vertical shear for the item at the specified <tt>step</tt> value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#setShearAt(double, double, double) setShearAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double verticalShearAt(double step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_verticalShearAt_double(nativeId(), step);
    }
    @QtBlockedSlot
    native double __qt_verticalShearAt_double(long __this__nativeId, double step);

/**
Returns the horizontal translation of the item at the specified <tt>step</tt> value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#setTranslationAt(double, double, double) setTranslationAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double xTranslationAt(double step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_xTranslationAt_double(nativeId(), step);
    }
    @QtBlockedSlot
    native double __qt_xTranslationAt_double(long __this__nativeId, double step);

/**
Returns the vertical translation of the item at the specified <tt>step</tt> value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsItemAnimation#setTranslationAt(double, double, double) setTranslationAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double yTranslationAt(double step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_yTranslationAt_double(nativeId(), step);
    }
    @QtBlockedSlot
    native double __qt_yTranslationAt_double(long __this__nativeId, double step);

/**
This method is meant to be overridden in subclasses that need to execute additional code after a new step has taken place. The animation <tt>step</tt> is provided for use in cases where the action depends on its value.
*/

    @QtBlockedSlot
    protected void afterAnimationStep(double step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_afterAnimationStep_double(nativeId(), step);
    }
    @QtBlockedSlot
    native void __qt_afterAnimationStep_double(long __this__nativeId, double step);

/**
This method is meant to be overridden by subclassed that needs to execute additional code before a new step takes place. The animation <tt>step</tt> is provided for use in cases where the action depends on its value.
*/

    @QtBlockedSlot
    protected void beforeAnimationStep(double step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_beforeAnimationStep_double(nativeId(), step);
    }
    @QtBlockedSlot
    native void __qt_beforeAnimationStep_double(long __this__nativeId, double step);

/**
@exclude
*/

    public static native QGraphicsItemAnimation fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QGraphicsItemAnimation(QPrivateConstructor p) { super(p); } 
}
