package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QCDEStyle class provides a CDE look and feel. This style provides a slightly improved Motif look similar to some versions of the Common Desktop Environment (CDE). The main differences are thinner frames and more modern radio buttons and checkboxes. Together with a dark background and a bright text/foreground color, the style looks quite attractive (at least for Motif fans). <p>Note that most of the functions provided by QCDEStyle are reimplementations of {@link com.trolltech.qt.gui.QStyle QStyle} functions; see {@link com.trolltech.qt.gui.QStyle QStyle} for their documentation. QCDEStyle provides overloads for {@link com.trolltech.qt.gui.QStyle#drawControl(com.trolltech.qt.gui.QStyle.ControlElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawControl()} and {@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawPrimitive()} which are documented here. <br><center><img src="../images/qcdestyle.png"></center><br> <p><DT><b>See also:</b><br><DD>QWindowsXPStyle, QMacStyle, {@link com.trolltech.qt.gui.QWindowsStyle QWindowsStyle}, {@link com.trolltech.qt.gui.QPlastiqueStyle QPlastiqueStyle}, and {@link com.trolltech.qt.gui.QMotifStyle QMotifStyle}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QCDEStyle extends com.trolltech.qt.gui.QMotifStyle
{


/**
Constructs a QCDEStyle. <p>If <tt>useHighlightCols</tt> is false (the default), then the style will polish the application's color palette to emulate the Motif way of highlighting, which is a simple inversion between the base and the text color.
*/

    public QCDEStyle() {
        this((boolean)false);
    }
/**
Constructs a QCDEStyle. <p>If <tt>useHighlightCols</tt> is false (the default), then the style will polish the application's color palette to emulate the Motif way of highlighting, which is a simple inversion between the base and the text color.
*/

    public QCDEStyle(boolean useHighlightCols){
        super((QPrivateConstructor)null);
        __qt_QCDEStyle_boolean(useHighlightCols);
    }

    native void __qt_QCDEStyle_boolean(boolean useHighlightCols);

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
    public com.trolltech.qt.gui.QPalette standardPalette()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_standardPalette(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPalette __qt_standardPalette(long __this__nativeId);

/**
@exclude
*/

    public static native QCDEStyle fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QCDEStyle(QPrivateConstructor p) { super(p); } 
}
