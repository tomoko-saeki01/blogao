package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QMotifStyle class provides Motif look and feel. This class implements the Motif look and feel. It closely resembles the original Motif look as defined by the Open Group, but with some minor improvements. The Motif style is Qt's default GUI style on Unix platforms. <br><center><img src="../images/qmotifstyle.png"></center><br> <p><DT><b>See also:</b><br><DD>QWindowsXPStyle, QMacStyle, {@link com.trolltech.qt.gui.QWindowsStyle QWindowsStyle}, {@link com.trolltech.qt.gui.QPlastiqueStyle QPlastiqueStyle}, and {@link com.trolltech.qt.gui.QCDEStyle QCDEStyle}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QMotifStyle extends com.trolltech.qt.gui.QCommonStyle
{


/**
Constructs a QMotifStyle. <p>If <tt>useHighlightCols</tt> is false (the default), the style will polish the application's color palette to emulate the Motif way of highlighting, which is a simple inversion between the base and the text color.
*/

    public QMotifStyle() {
        this((boolean)false);
    }
/**
Constructs a QMotifStyle. <p>If <tt>useHighlightCols</tt> is false (the default), the style will polish the application's color palette to emulate the Motif way of highlighting, which is a simple inversion between the base and the text color.
*/

    public QMotifStyle(boolean useHighlightCols){
        super((QPrivateConstructor)null);
        __qt_QMotifStyle_boolean(useHighlightCols);
    }

    native void __qt_QMotifStyle_boolean(boolean useHighlightCols);

/**
If <tt>arg</tt> is false, the style will polish the application's color palette to emulate the Motif way of highlighting, which is a simple inversion between the base and the text color. <p>The effect will show up the next time an application palette is set via {@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) QApplication::setPalette()}. The current color palette of the application remains unchanged. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMotifStyle#useHighlightColors() useHighlightColors()}, and {@link com.trolltech.qt.gui.QStyle#polish(com.trolltech.qt.gui.QApplication) QStyle::polish()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUseHighlightColors(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUseHighlightColors_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setUseHighlightColors_boolean(long __this__nativeId, boolean arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected com.trolltech.qt.gui.QIcon standardIconImplementation(com.trolltech.qt.gui.QStyle.StandardPixmap standardIcon, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_standardIconImplementation_StandardPixmap_nativepointer_QWidget(nativeId(), standardIcon.value(), opt, widget == null ? 0 : widget.nativeId());
    }
    native com.trolltech.qt.gui.QIcon __qt_standardIconImplementation_StandardPixmap_nativepointer_QWidget(long __this__nativeId, int standardIcon, com.trolltech.qt.gui.QStyleOption opt, long widget);

/**
Returns true if the style treats the highlight colors of the palette in a Motif-like manner, which is a simple inversion between the base and the text color; otherwise returns false. The default is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMotifStyle#setUseHighlightColors(boolean) setUseHighlightColors()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean useHighlightColors()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_useHighlightColors(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_useHighlightColors(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt, com.trolltech.qt.gui.QPainter p, com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawComplexControl_ComplexControl_nativepointer_QPainter_QWidget(nativeId(), cc.value(), opt, p == null ? 0 : p.nativeId(), w == null ? 0 : w.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawComplexControl_ComplexControl_nativepointer_QPainter_QWidget(long __this__nativeId, int cc, com.trolltech.qt.gui.QStyleOptionComplex opt, long p, long w);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void drawControl(com.trolltech.qt.gui.QStyle.ControlElement element, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QPainter p, com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawControl_ControlElement_nativepointer_QPainter_QWidget(nativeId(), element.value(), opt, p == null ? 0 : p.nativeId(), w == null ? 0 : w.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawControl_ControlElement_nativepointer_QPainter_QWidget(long __this__nativeId, int element, com.trolltech.qt.gui.QStyleOption opt, long p, long w);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement pe, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QPainter p, com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPrimitive_PrimitiveElement_nativepointer_QPainter_QWidget(nativeId(), pe.value(), opt, p == null ? 0 : p.nativeId(), w == null ? 0 : w.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPrimitive_PrimitiveElement_nativepointer_QPainter_QWidget(long __this__nativeId, int pe, com.trolltech.qt.gui.QStyleOption opt, long p, long w);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean eventFilter(com.trolltech.qt.core.QObject o, com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_eventFilter_QObject_QEvent(nativeId(), o == null ? 0 : o.nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_eventFilter_QObject_QEvent(long __this__nativeId, long o, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric metric, com.trolltech.qt.gui.QStyleOption option, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixelMetric_PixelMetric_nativepointer_QWidget(nativeId(), metric.value(), option, widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native int __qt_pixelMetric_PixelMetric_nativepointer_QWidget(long __this__nativeId, int metric, com.trolltech.qt.gui.QStyleOption option, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void polish(com.trolltech.qt.gui.QApplication arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_polish_QApplication(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_polish_QApplication(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void polish(com.trolltech.qt.gui.QPalette arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_polish_nativepointer(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_polish_nativepointer(long __this__nativeId, com.trolltech.qt.gui.QPalette arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void polish(com.trolltech.qt.gui.QWidget arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_polish_QWidget(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_polish_QWidget(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize sizeFromContents(com.trolltech.qt.gui.QStyle.ContentsType ct, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.core.QSize contentsSize, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeFromContents_ContentsType_nativepointer_QSize_QWidget(nativeId(), ct.value(), opt, contentsSize == null ? 0 : contentsSize.nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeFromContents_ContentsType_nativepointer_QSize_QWidget(long __this__nativeId, int ct, com.trolltech.qt.gui.QStyleOption opt, long contentsSize, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QPalette standardPalette()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_standardPalette(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPalette __qt_standardPalette(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int styleHint(com.trolltech.qt.gui.QStyle.StyleHint hint, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.gui.QStyleHintReturn returnData)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_styleHint_StyleHint_nativepointer_QWidget_QStyleHintReturn(nativeId(), hint.value(), opt, widget == null ? 0 : widget.nativeId(), returnData == null ? 0 : returnData.nativeId());
    }
    @QtBlockedSlot
    native int __qt_styleHint_StyleHint_nativepointer_QWidget_QStyleHintReturn(long __this__nativeId, int hint, com.trolltech.qt.gui.QStyleOption opt, long widget, long returnData);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRect subControlRect(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt, int sc, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subControlRect_ComplexControl_nativepointer_int_QWidget(nativeId(), cc.value(), opt, sc, widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_subControlRect_ComplexControl_nativepointer_int_QWidget(long __this__nativeId, int cc, com.trolltech.qt.gui.QStyleOptionComplex opt, int sc, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRect subElementRect(com.trolltech.qt.gui.QStyle.SubElement r, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subElementRect_SubElement_nativepointer_QWidget(nativeId(), r.value(), opt, widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_subElementRect_SubElement_nativepointer_QWidget(long __this__nativeId, int r, com.trolltech.qt.gui.QStyleOption opt, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void timerEvent(com.trolltech.qt.core.QTimerEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timerEvent_QTimerEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_timerEvent_QTimerEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void unpolish(com.trolltech.qt.gui.QApplication arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unpolish_QApplication(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_unpolish_QApplication(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void unpolish(com.trolltech.qt.gui.QWidget arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unpolish_QWidget(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_unpolish_QWidget(long __this__nativeId, long arg__1);

/**
@exclude
*/

    public static native QMotifStyle fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QMotifStyle(QPrivateConstructor p) { super(p); } 
}
