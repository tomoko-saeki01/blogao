package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QCommonStyle class encapsulates the common Look and Feel of a GUI. This abstract class implements some of the widget's look and feel that is common to all GUI styles provided and shipped as part of Qt. <p>Since QCommonStyle inherits {@link com.trolltech.qt.gui.QStyle QStyle}, all of its functions are fully documented in the {@link com.trolltech.qt.gui.QStyle QStyle} documentation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle QStyle}, {@link com.trolltech.qt.gui.QMotifStyle QMotifStyle}, and {@link com.trolltech.qt.gui.QWindowsStyle QWindowsStyle}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QCommonStyle extends com.trolltech.qt.gui.QStyle
{

/**
Constructs a QCommonStyle.
*/

    public QCommonStyle(){
        super((QPrivateConstructor)null);
        __qt_QCommonStyle();
    }

    native void __qt_QCommonStyle();

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
    public com.trolltech.qt.gui.QPixmap generatedIconPixmap(com.trolltech.qt.gui.QIcon.Mode iconMode, com.trolltech.qt.gui.QPixmap pixmap, com.trolltech.qt.gui.QStyleOption opt)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_generatedIconPixmap_Mode_QPixmap_nativepointer(nativeId(), iconMode.value(), pixmap == null ? 0 : pixmap.nativeId(), opt);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_generatedIconPixmap_Mode_QPixmap_nativepointer(long __this__nativeId, int iconMode, long pixmap, com.trolltech.qt.gui.QStyleOption opt);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int hitTestComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt, com.trolltech.qt.core.QPoint pt, com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hitTestComplexControl_ComplexControl_nativepointer_QPoint_QWidget(nativeId(), cc.value(), opt, pt == null ? 0 : pt.nativeId(), w == null ? 0 : w.nativeId());
    }
    @QtBlockedSlot
    native int __qt_hitTestComplexControl_ComplexControl_nativepointer_QPoint_QWidget(long __this__nativeId, int cc, com.trolltech.qt.gui.QStyleOptionComplex opt, long pt, long w);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric m, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixelMetric_PixelMetric_nativepointer_QWidget(nativeId(), m.value(), opt, widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native int __qt_pixelMetric_PixelMetric_nativepointer_QWidget(long __this__nativeId, int m, com.trolltech.qt.gui.QStyleOption opt, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void polish(com.trolltech.qt.gui.QApplication app)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_polish_QApplication(nativeId(), app == null ? 0 : app.nativeId());
    }
    @QtBlockedSlot
    native void __qt_polish_QApplication(long __this__nativeId, long app);

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
    public void polish(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_polish_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native void __qt_polish_QWidget(long __this__nativeId, long widget);

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
    public int styleHint(com.trolltech.qt.gui.QStyle.StyleHint sh, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QWidget w, com.trolltech.qt.gui.QStyleHintReturn shret)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_styleHint_StyleHint_nativepointer_QWidget_QStyleHintReturn(nativeId(), sh.value(), opt, w == null ? 0 : w.nativeId(), shret == null ? 0 : shret.nativeId());
    }
    @QtBlockedSlot
    native int __qt_styleHint_StyleHint_nativepointer_QWidget_QStyleHintReturn(long __this__nativeId, int sh, com.trolltech.qt.gui.QStyleOption opt, long w, long shret);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRect subControlRect(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt, int sc, com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subControlRect_ComplexControl_nativepointer_int_QWidget(nativeId(), cc.value(), opt, sc, w == null ? 0 : w.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_subControlRect_ComplexControl_nativepointer_int_QWidget(long __this__nativeId, int cc, com.trolltech.qt.gui.QStyleOptionComplex opt, int sc, long w);

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
    public void unpolish(com.trolltech.qt.gui.QApplication application)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unpolish_QApplication(nativeId(), application == null ? 0 : application.nativeId());
    }
    @QtBlockedSlot
    native void __qt_unpolish_QApplication(long __this__nativeId, long application);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void unpolish(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unpolish_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native void __qt_unpolish_QWidget(long __this__nativeId, long widget);

/**
@exclude
*/

    public static native QCommonStyle fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QCommonStyle(QPrivateConstructor p) { super(p); } 
}
