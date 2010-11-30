package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QWindowsStyle class provides a Microsoft Windows-like look and feel. This style is Qt's default GUI style on Windows. <br><center><img src="../images/qwindowsstyle.png"></center><br> <p><DT><b>See also:</b><br><DD>QWindowsXPStyle, QMacStyle, {@link com.trolltech.qt.gui.QPlastiqueStyle QPlastiqueStyle}, {@link com.trolltech.qt.gui.QCDEStyle QCDEStyle}, and {@link com.trolltech.qt.gui.QMotifStyle QMotifStyle}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QWindowsStyle extends com.trolltech.qt.gui.QCommonStyle
{

/**
Constructs a QWindowsStyle object.
*/

    public QWindowsStyle(){
        super((QPrivateConstructor)null);
        __qt_QWindowsStyle();
    }

    native void __qt_QWindowsStyle();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected com.trolltech.qt.gui.QIcon standardIconImplementation(com.trolltech.qt.gui.QStyle.StandardPixmap standardIcon, com.trolltech.qt.gui.QStyleOption option, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_standardIconImplementation_StandardPixmap_nativepointer_QWidget(nativeId(), standardIcon.value(), option, widget == null ? 0 : widget.nativeId());
    }
    native com.trolltech.qt.gui.QIcon __qt_standardIconImplementation_StandardPixmap_nativepointer_QWidget(long __this__nativeId, int standardIcon, com.trolltech.qt.gui.QStyleOption option, long widget);

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
    public int pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric pm, com.trolltech.qt.gui.QStyleOption option, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixelMetric_PixelMetric_nativepointer_QWidget(nativeId(), pm.value(), option, widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native int __qt_pixelMetric_PixelMetric_nativepointer_QWidget(long __this__nativeId, int pm, com.trolltech.qt.gui.QStyleOption option, long widget);

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

    public static native QWindowsStyle fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWindowsStyle(QPrivateConstructor p) { super(p); } 
}
