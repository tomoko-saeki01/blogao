package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QCleanlooksStyle class provides a widget style similar to the Clearlooks style available in GNOME. The Cleanlooks style provides a look and feel for widgets that closely resembles the Clearlooks style, introduced by Richard Stellingwerff and Daniel Borgmann. <p><DT><b>See also:</b><br><DD>{@link <a href="../gallery-cleanlooks.html">Cleanlooks Style Widget Gallery</a>}, QWindowsXPStyle, QMacStyle, {@link com.trolltech.qt.gui.QWindowsStyle QWindowsStyle}, {@link com.trolltech.qt.gui.QCDEStyle QCDEStyle}, {@link com.trolltech.qt.gui.QMotifStyle QMotifStyle}, and {@link com.trolltech.qt.gui.QPlastiqueStyle QPlastiqueStyle}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QCleanlooksStyle extends com.trolltech.qt.gui.QWindowsStyle
{

/**
Constructs a QCleanlooksStyle object.
*/

    public QCleanlooksStyle(){
        super((QPrivateConstructor)null);
        __qt_QCleanlooksStyle();
    }

    native void __qt_QCleanlooksStyle();

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
    public void drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl control, com.trolltech.qt.gui.QStyleOptionComplex option, com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawComplexControl_ComplexControl_nativepointer_QPainter_QWidget(nativeId(), control.value(), option, painter == null ? 0 : painter.nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawComplexControl_ComplexControl_nativepointer_QPainter_QWidget(long __this__nativeId, int control, com.trolltech.qt.gui.QStyleOptionComplex option, long painter, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void drawControl(com.trolltech.qt.gui.QStyle.ControlElement ce, com.trolltech.qt.gui.QStyleOption option, com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawControl_ControlElement_nativepointer_QPainter_QWidget(nativeId(), ce.value(), option, painter == null ? 0 : painter.nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawControl_ControlElement_nativepointer_QPainter_QWidget(long __this__nativeId, int ce, com.trolltech.qt.gui.QStyleOption option, long painter, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void drawItemPixmap(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRect rect, int alignment, com.trolltech.qt.gui.QPixmap pixmap)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawItemPixmap_QPainter_QRect_int_QPixmap(nativeId(), painter == null ? 0 : painter.nativeId(), rect == null ? 0 : rect.nativeId(), alignment, pixmap == null ? 0 : pixmap.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawItemPixmap_QPainter_QRect_int_QPixmap(long __this__nativeId, long painter, long rect, int alignment, long pixmap);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void drawItemText(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRect rect, int flags, com.trolltech.qt.gui.QPalette pal, boolean enabled, java.lang.String text, com.trolltech.qt.gui.QPalette.ColorRole textRole)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawItemText_QPainter_QRect_int_QPalette_boolean_String_ColorRole(nativeId(), painter == null ? 0 : painter.nativeId(), rect == null ? 0 : rect.nativeId(), flags, pal == null ? 0 : pal.nativeId(), enabled, text, textRole.value());
    }
    @QtBlockedSlot
    native void __qt_drawItemText_QPainter_QRect_int_QPalette_boolean_String_ColorRole(long __this__nativeId, long painter, long rect, int flags, long pal, boolean enabled, java.lang.String text, int textRole);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement elem, com.trolltech.qt.gui.QStyleOption option, com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_drawPrimitive_PrimitiveElement_nativepointer_QPainter_QWidget(nativeId(), elem.value(), option, painter == null ? 0 : painter.nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native void __qt_drawPrimitive_PrimitiveElement_nativepointer_QPainter_QWidget(long __this__nativeId, int elem, com.trolltech.qt.gui.QStyleOption option, long painter, long widget);

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
    public com.trolltech.qt.core.QRect itemPixmapRect(com.trolltech.qt.core.QRect r, int flags, com.trolltech.qt.gui.QPixmap pixmap)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemPixmapRect_QRect_int_QPixmap(nativeId(), r == null ? 0 : r.nativeId(), flags, pixmap == null ? 0 : pixmap.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_itemPixmapRect_QRect_int_QPixmap(long __this__nativeId, long r, int flags, long pixmap);

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
    public void polish(com.trolltech.qt.gui.QPalette pal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_polish_nativepointer(nativeId(), pal);
    }
    @QtBlockedSlot
    native void __qt_polish_nativepointer(long __this__nativeId, com.trolltech.qt.gui.QPalette pal);

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
    public com.trolltech.qt.core.QSize sizeFromContents(com.trolltech.qt.gui.QStyle.ContentsType type, com.trolltech.qt.gui.QStyleOption option, com.trolltech.qt.core.QSize size, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeFromContents_ContentsType_nativepointer_QSize_QWidget(nativeId(), type.value(), option, size == null ? 0 : size.nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeFromContents_ContentsType_nativepointer_QSize_QWidget(long __this__nativeId, int type, com.trolltech.qt.gui.QStyleOption option, long size, long widget);

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
    public int styleHint(com.trolltech.qt.gui.QStyle.StyleHint hint, com.trolltech.qt.gui.QStyleOption option, com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.gui.QStyleHintReturn returnData)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_styleHint_StyleHint_nativepointer_QWidget_QStyleHintReturn(nativeId(), hint.value(), option, widget == null ? 0 : widget.nativeId(), returnData == null ? 0 : returnData.nativeId());
    }
    @QtBlockedSlot
    native int __qt_styleHint_StyleHint_nativepointer_QWidget_QStyleHintReturn(long __this__nativeId, int hint, com.trolltech.qt.gui.QStyleOption option, long widget, long returnData);

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
    public void unpolish(com.trolltech.qt.gui.QApplication app)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unpolish_QApplication(nativeId(), app == null ? 0 : app.nativeId());
    }
    @QtBlockedSlot
    native void __qt_unpolish_QApplication(long __this__nativeId, long app);

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

    public static native QCleanlooksStyle fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QCleanlooksStyle(QPrivateConstructor p) { super(p); } 
}
