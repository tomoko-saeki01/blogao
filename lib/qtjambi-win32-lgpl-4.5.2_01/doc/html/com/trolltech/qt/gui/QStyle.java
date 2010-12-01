package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyle class is an abstract base class that encapsulates the look and feel of a GUI. Qt contains a set of QStyle subclasses that emulate the styles of the different platforms supported by Qt ({@link com.trolltech.qt.gui.QWindowsStyle QWindowsStyle}, QMacStyle, {@link com.trolltech.qt.gui.QMotifStyle QMotifStyle}, etc.). By default, these styles are built into the {@link <a href="../qtgui.html">QtGui</a>} library. Styles can also be made available as plugins. <p>Qt's built-in widgets use QStyle to perform nearly all of their drawing, ensuring that they look exactly like the equivalent native widgets. The diagram below shows a {@link com.trolltech.qt.gui.QComboBox QComboBox} in eight different styles. <br><center><img src="../images/qstyle-comboboxes.png"></center><br> Topics: <ul><li> {@link <a href="#setting-a-style">Setting a Style</a>}</li><li> {@link <a href="#developing-style-aware-custom-widgets">Developing Style-Aware Custom Widgets</a>}</li><li> {@link <a href="#creating-a-custom-style">Creating a Custom Style</a>}</li><li> {@link <a href="#using-a-custom-style">Using a Custom Style</a>}</li><li> {@link <a href="#right-to-left-desktops">Right-to-Left Desktops</a>}</li><li> {@link <a href="#styles-in-item-views">Styles in Item Views</a>}</li></ul><a name="setting-a-style"><h2>Setting a Style</h2> The style of the entire application can be set using the {@link com.trolltech.qt.gui.QApplication#setStyle(com.trolltech.qt.gui.QStyle) QApplication::setStyle()} function. It can also be specified by the user of the application, using the <tt>-style</tt> command-line option: <pre class="snippet">
        ./myapplication -style motif
</pre> If no style is specified, Qt will choose the most appropriate style for the user's platform or desktop environment. <p>A style can also be set on an individual widget using the {@link com.trolltech.qt.gui.QWidget#setStyle(com.trolltech.qt.gui.QStyle) QWidget::setStyle()} function.<a name="developing-style-aware-custom-widgets"><h2>Developing Style-Aware Custom Widgets</h2> If you are developing custom widgets and want them to look good on all platforms, you can use QStyle functions to perform parts of the widget drawing, such as {@link com.trolltech.qt.gui.QStyle#drawItemText(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, int, com.trolltech.qt.gui.QPalette, boolean, java.lang.String) drawItemText()}, {@link com.trolltech.qt.gui.QStyle#drawItemPixmap(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, int, com.trolltech.qt.gui.QPixmap) drawItemPixmap()}, {@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawPrimitive()}, {@link com.trolltech.qt.gui.QStyle#drawControl(com.trolltech.qt.gui.QStyle.ControlElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawControl()}, and {@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()}. <p>Most QStyle draw functions take four arguments: <ul><li> an enum value specifying which graphical element to draw</li><li> a {@link com.trolltech.qt.gui.QStyleOption QStyleOption} specifying how and where to render that element</li><li> a {@link com.trolltech.qt.gui.QPainter QPainter} that should be used to draw the element</li><li> a {@link com.trolltech.qt.gui.QWidget QWidget} on which the drawing is performed (optional)</li></ul> For example, if you want to draw a focus rectangle on your widget, you can write: <pre class="snippet">
    protected void paintEvent(QPaintEvent event)
    
    {
    
        QPainter painter = new QPainter(this);
    

        QStyleOptionFocusRect option = new QStyleOptionFocusRect();
        option.initFrom(this);
        option.setBackgroundColor(palette().color(QPalette.ColorRole.Window));

    
        style().drawPrimitive(QStyle.PrimitiveElement.PE_FrameFocusRect,
                              option, painter, this);
    
    }
    </pre> QStyle gets all the information it needs to render the graphical element from {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. The widget is passed as the last argument in case the style needs it to perform special effects (such as animated default buttons on Mac OS X), but it isn't mandatory. In fact, you can use QStyle to draw on any paint device, not just widgets, by setting the {@link com.trolltech.qt.gui.QPainter QPainter} properly. <p>{@link com.trolltech.qt.gui.QStyleOption QStyleOption} has various subclasses for the various types of graphical elements that can be drawn. For example, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameFocusRect } expects a {@link com.trolltech.qt.gui.QStyleOptionFocusRect QStyleOptionFocusRect} argument. <p>To ensure that drawing operations are as fast as possible, {@link com.trolltech.qt.gui.QStyleOption QStyleOption} and its subclasses have public data members. See the {@link com.trolltech.qt.gui.QStyleOption QStyleOption} class documentation for details on how to use it. <p>For convenience, Qt provides the {@link com.trolltech.qt.gui.QStylePainter QStylePainter} class, which combines a QStyle, a {@link com.trolltech.qt.gui.QPainter QPainter}, and a {@link com.trolltech.qt.gui.QWidget QWidget}. This makes it possible to write <pre class="snippet"> 
        QStylePainter painter = new QStylePainter(this);
    ...
        painter.drawPrimitive(QStyle.PrimitiveElement.PE_FrameFocusRect, option);
    </pre> instead of <pre class="snippet">
        QPainter painter = new QPainter(this);
    ...
        style().drawPrimitive(QStyle.PrimitiveElement.PE_FrameFocusRect,
                              option, painter, this);
    </pre><a name="creating-a-custom-style"><h2>Creating a Custom Style</h2> If you want to design a custom look and feel for your application, the first step is to pick one of the styles provided with Qt to build your custom style from. The choice will depend on which existing style resembles your style the most. The most general class that you can use as base is {@link com.trolltech.qt.gui.QCommonStyle QCommonStyle} (and not QStyle). This is because Qt requires its styles to be {@link com.trolltech.qt.gui.QCommonStyle QCommonStyle}s. <p>Depending on which parts of the base style you want to change, you must reimplement the functions that are used to draw those parts of the interface. To illustrate this, we will modify the look of the spin box arrows drawn by {@link com.trolltech.qt.gui.QWindowsStyle QWindowsStyle}. The arrows are primitive elements that are drawn by the {@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawPrimitive()} function, so we need to reimplement that function. We need the following class declaration: <pre class="snippet">
public class CustomStyle extends QWindowsStyle
{
    public CustomStyle() { ... }

    public void drawPrimitive(QStyle.PrimitiveElement element, QStyleOption option,
                              QPainter painter, QWidget widget)
    {
        ...
    }
}
</pre> To draw its up and down arrows, {@link com.trolltech.qt.gui.QSpinBox QSpinBox} uses the {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorSpinUp } and {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorSpinDown } primitive elements. Here's how to reimplement the {@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawPrimitive()} function to draw them differently: <pre class="snippet">
    public void drawPrimitive(QStyle.PrimitiveElement element, QStyleOption option,
                              QPainter painter, QWidget widget)
    {
        if (element.equals(QStyle.PrimitiveElement.PE_IndicatorSpinUp) ||
            element.equals(QStyle.PrimitiveElement.PE_IndicatorSpinDown)) {
        QPolygon points = new QPolygon(3);
        int x = option.rect().x();
        int y = option.rect().y();
        int w = option.rect().width() / 2;
        int h = option.rect().height() / 2;
        x += (option.rect().width() - w) / 2;
        y += (option.rect().height() - h) / 2;

        if (element.equals(QStyle.PrimitiveElement.PE_IndicatorSpinUp)) {
            points.add(new QPoint(x, y + h));
            points.add(new QPoint(x + w, y + h));
            points.add(new QPoint(x + w / 2, y));
        } else { // PE_SpinBoxDown
            points.add(new QPoint(x, y));
            points.add(new QPoint(x + w, y));
            points.add(new QPoint(x + w / 2, y + h));
        }

        if (option.state().isSet(QStyle.StateFlag.State_Enabled)) {
            painter.setPen(option.palette().mid().color());
            painter.setBrush(option.palette().buttonText());
        } else {
            painter.setPen(option.palette().buttonText().color());
            painter.setBrush(option.palette().mid());
        }
        painter.drawPolygon(points);
        } else {
        super.drawPrimitive(element, option, painter, widget);
    
        }
    
    }
    </pre> Notice that we don't use the <tt>widget</tt> argument, except to pass it on to the QWindowStyle::drawPrimitive() function. As mentioned earlier, the information about what is to be drawn and how it should be drawn is specified by a {@link com.trolltech.qt.gui.QStyleOption QStyleOption} object, so there is no need to ask the widget. <p>If you need to use the <tt>widget</tt> argument to obtain additional information, be careful to ensure that it isn't 0 and that it is of the correct type before using it. For example: <pre class="snippet">
        if (widget instanceof QSpinBox) {
            QSpinBox spinBox = (QSpinBox) widget;
    ...
        }
    </pre> When implementing a custom style, you cannot assume that the widget is a {@link com.trolltech.qt.gui.QSpinBox QSpinBox} just because the enum value is called {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorSpinUp } or {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorSpinDown }. <p>The documentation for the {@link <a href="../qtjambi-styles.html">Styles</a>} example covers this topic in more detail. <p><b>Warning:</b> Qt style sheets are currently not supported for custom QStyle subclasses. We plan to address this in some future release.<a name="using-a-custom-style"><h2>Using a Custom Style</h2> There are several ways of using a custom style in a Qt application. The simplest way is call the {@link com.trolltech.qt.gui.QApplication#setStyle(com.trolltech.qt.gui.QStyle) QApplication::setStyle()} static function before creating the {@link com.trolltech.qt.gui.QApplication QApplication} object:<br><br>The following code example is written in c++.<br> <pre class="snippet">
#include &lt;QtGui&gt;

#include "customstyle.h"

int main(int argc, char *argv[])
{
    QApplication::setStyle(new CustomStyle);
    QApplication app(argc, argv);
    QSpinBox spinBox;
    spinBox.show();
    return app.exec();
}
</pre> You can call {@link com.trolltech.qt.gui.QApplication#setStyle(com.trolltech.qt.gui.QStyle) QApplication::setStyle()} at any time, but by calling it before the constructor, you ensure that the user's preference, set using the <tt>-style</tt> command-line option, is respected. <p>You may want to make your style available for use in other applications, some of which may not be yours and are not available for you to recompile. The Qt Plugin system makes it possible to create styles as plugins. Styles created as plugins are loaded as shared objects at runtime by Qt itself. Please refer to the {@link <a href="../plugins-howto.html">Qt Plugin</a>} documentation for more information on how to go about creating a style plugin. <p>Compile your plugin and put it into Qt's <tt>plugins/styles</tt> directory. We now have a pluggable style that Qt can load automatically. To use your new style with existing applications, simply start the application with the following argument: <pre class="snippet">
        ./myapplication -style custom
</pre> The application will use the look and feel from the custom style you implemented.<a name="right-to-left-desktops"><h2>Right-to-Left Desktops</h2> Languages written from right to left (such as Arabic and Hebrew) usually also mirror the whole layout of widgets, and require the light to come from the screen's top-right corner instead of top-left. <p>If you create a custom style, you should take special care when drawing asymmetric elements to make sure that they also look correct in a mirrored layout. An easy way to test your styles is to run applications with the <tt>-reverse</tt> command-line option or to call {@link QApplication#setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection) QApplication::setLayoutDirection()} in your <tt>main()</tt> function. <p>Here are some things to keep in mind when making a style work well in a right-to-left environment: <ul><li> {@link com.trolltech.qt.gui.QStyle#subControlRect(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, int) subControlRect()} and {@link com.trolltech.qt.gui.QStyle#subElementRect(com.trolltech.qt.gui.QStyle.SubElement, com.trolltech.qt.gui.QStyleOption) subElementRect()} return rectangles in screen coordinates</li><li> QStyleOption::direction indicates in which direction the item should be drawn in</li><li> If a style is not right-to-left aware it will display items as if it were left-to-right</li><li> {@link com.trolltech.qt.gui.QStyle#visualRect(com.trolltech.qt.core.Qt.LayoutDirection, com.trolltech.qt.core.QRect, com.trolltech.qt.core.QRect) visualRect()}, {@link com.trolltech.qt.gui.QStyle#visualPos(com.trolltech.qt.core.Qt.LayoutDirection, com.trolltech.qt.core.QRect, com.trolltech.qt.core.QPoint) visualPos()}, and {@link com.trolltech.qt.gui.QStyle#visualAlignment(com.trolltech.qt.core.Qt.LayoutDirection, com.trolltech.qt.core.Qt.AlignmentFlag[]) visualAlignment()} are helpful functions that will translate from logical to screen representations.</li><li> {@link com.trolltech.qt.gui.QStyle#alignedRect(com.trolltech.qt.core.Qt.LayoutDirection, com.trolltech.qt.core.Qt.Alignment, com.trolltech.qt.core.QSize, com.trolltech.qt.core.QRect) alignedRect()} will return a logical rect aligned for the current direction</li></ul><a name="styles-in-item-views"><h2>Styles in Item Views</h2> The painting of items in views is performed by a delegate. Qt's default delegate, {@link com.trolltech.qt.gui.QStyledItemDelegate QStyledItemDelegate}, is also used for for calculating bounding rectangles of items, and their sub-elements for the various kind of item {@link com.trolltech.qt.core.Qt.ItemDataRole data roles }{@link com.trolltech.qt.gui.QStyledItemDelegate QStyledItemDelegate} supports. See the {@link com.trolltech.qt.gui.QStyledItemDelegate QStyledItemDelegate} class description to find out which datatypes and roles are supported. You can read more about item data roles in {@link <a href="../model-view-programming.html">Model/View Programming</a>}. <p>When {@link com.trolltech.qt.gui.QStyledItemDelegate QStyledItemDelegate} paints its items, it draws {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ItemViewItem }, and calculates their size with {@link com.trolltech.qt.gui.QStyle.ContentsType CT_ItemViewItem }. Note also that it uses {@link com.trolltech.qt.gui.QStyle.SubElement SE_ItemViewItemText } to set the size of editors. When implementing a style to customize drawing of item views, you need to check the implementation of {@link com.trolltech.qt.gui.QCommonStyle QCommonStyle} (and any other subclasses from which your style inherits). This way, you find out which and how other style elements are painted, and you can then reimplement the painting of elements that should be drawn differently. <p>We include a small example where we customize the drawing of item backgrounds.<br><br>The following code example is written in c++.<br> <pre class="snippet">
    switch (element) {
        case (PE_PanelItemViewItem): {
            painter-&gt;save();

            QPoint topLeft = option-&gt;rect.topLeft();
            QPoint bottomRight = option-&gt;rect.topRight();
            QLinearGradient backgroundGradient(topLeft, bottomRight);
            backgroundGradient.setColorAt(0.0, QColor(Qt::yellow).lighter(190));
            backgroundGradient.setColorAt(1.0, Qt::white);
            painter-&gt;fillRect(option-&gt;rect, QBrush(backgroundGradient));

            painter-&gt;restore();
        break;
        }    
        default:
            QWindowsStyle::drawPrimitive(element, option, painter, widget);
    }
</pre> The primitive element {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_PanelItemViewItem } is responsible for painting the background of items, and is called from {@link com.trolltech.qt.gui.QCommonStyle QCommonStyle}'s implementation of {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ItemViewItem }. <p>To add support for drawing of new datatypes and item data roles, it is necessary to create a custom delegate. But if you only need to support the datatypes implemented by the default delegate, a custom style does not need an accompanying delegate. The {@link com.trolltech.qt.gui.QStyledItemDelegate QStyledItemDelegate} class description gives more information on custom delegates. <p>The drawing of item view headers is also done by the style, giving control over size of header items and row and column sizes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}, {@link com.trolltech.qt.gui.QStylePainter QStylePainter}, {@link <a href="../qtjambi-styles.html">Styles Example</a>}, {@link <a href="../style-reference.html">Implementing Styles and Style Aware Widgets</a>}, and {@link com.trolltech.qt.gui.QStyledItemDelegate QStyledItemDelegate}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QStyle extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QStyle {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt, com.trolltech.qt.gui.QPainter p, com.trolltech.qt.gui.QWidget widget) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_drawComplexControl_ComplexControl_nativepointer_QPainter_QWidget(nativeId(), cc.value(), opt, p == null ? 0 : p.nativeId(), widget == null ? 0 : widget.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void drawControl(com.trolltech.qt.gui.QStyle.ControlElement element, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QPainter p, com.trolltech.qt.gui.QWidget w) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_drawControl_ControlElement_nativepointer_QPainter_QWidget(nativeId(), element.value(), opt, p == null ? 0 : p.nativeId(), w == null ? 0 : w.nativeId());
        }

        @Override
        @QtBlockedSlot
        public void drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement pe, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QPainter p, com.trolltech.qt.gui.QWidget w) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_drawPrimitive_PrimitiveElement_nativepointer_QPainter_QWidget(nativeId(), pe.value(), opt, p == null ? 0 : p.nativeId(), w == null ? 0 : w.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QPixmap generatedIconPixmap(com.trolltech.qt.gui.QIcon.Mode iconMode, com.trolltech.qt.gui.QPixmap pixmap, com.trolltech.qt.gui.QStyleOption opt) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_generatedIconPixmap_Mode_QPixmap_nativepointer(nativeId(), iconMode.value(), pixmap == null ? 0 : pixmap.nativeId(), opt);
        }

        @Override
        @QtBlockedSlot
        public int hitTestComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt, com.trolltech.qt.core.QPoint pt, com.trolltech.qt.gui.QWidget widget) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_hitTestComplexControl_ComplexControl_nativepointer_QPoint_QWidget(nativeId(), cc.value(), opt, pt == null ? 0 : pt.nativeId(), widget == null ? 0 : widget.nativeId());
        }

        @Override
        @QtBlockedSlot
        public int pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric metric, com.trolltech.qt.gui.QStyleOption option, com.trolltech.qt.gui.QWidget widget) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_pixelMetric_PixelMetric_nativepointer_QWidget(nativeId(), metric.value(), option, widget == null ? 0 : widget.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QSize sizeFromContents(com.trolltech.qt.gui.QStyle.ContentsType ct, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.core.QSize contentsSize, com.trolltech.qt.gui.QWidget w) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_sizeFromContents_ContentsType_nativepointer_QSize_QWidget(nativeId(), ct.value(), opt, contentsSize == null ? 0 : contentsSize.nativeId(), w == null ? 0 : w.nativeId());
        }

        @Override
        @QtBlockedSlot
        public int styleHint(com.trolltech.qt.gui.QStyle.StyleHint stylehint, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.gui.QStyleHintReturn returnData) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_styleHint_StyleHint_nativepointer_QWidget_QStyleHintReturn(nativeId(), stylehint.value(), opt, widget == null ? 0 : widget.nativeId(), returnData == null ? 0 : returnData.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QRect subControlRect(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt, int sc, com.trolltech.qt.gui.QWidget widget) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_subControlRect_ComplexControl_nativepointer_int_QWidget(nativeId(), cc.value(), opt, sc, widget == null ? 0 : widget.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QRect subElementRect(com.trolltech.qt.gui.QStyle.SubElement subElement, com.trolltech.qt.gui.QStyleOption option, com.trolltech.qt.gui.QWidget widget) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_subElementRect_SubElement_nativepointer_QWidget(nativeId(), subElement.value(), option, widget == null ? 0 : widget.nativeId());
        }
    }

    
/**
This enum describes the various available pixel metrics. A pixel metric is a style dependent size represented by a single pixel value. The following values are obsolete: <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) pixelMetric()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum PixelMetric implements com.trolltech.qt.QtEnumerator {
/**
 Amount of whitespace between push button labels and the frame.
*/

        PM_ButtonMargin(0),
/**
 Width of the default-button indicator frame.
*/

        PM_ButtonDefaultIndicator(1),
/**
 Width of the menu button indicator proportional to the widget height.
*/

        PM_MenuButtonIndicator(2),
/**
 Horizontal contents shift of a button when the button is down.
*/

        PM_ButtonShiftHorizontal(3),
/**
 Vertical contents shift of a button when the button is down.
*/

        PM_ButtonShiftVertical(4),
/**
 Default frame width (usually 2).
*/

        PM_DefaultFrameWidth(5),
/**
 Frame width of a spin box, defaults to {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_DefaultFrameWidth }.
*/

        PM_SpinBoxFrameWidth(6),
/**
 Frame width of a combo box, defaults to {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_DefaultFrameWidth }.
*/

        PM_ComboBoxFrameWidth(7),
/**
 The maximum allowed distance between the mouse and a slider when dragging. Exceeding the specified distance will cause the slider to jump back to the original position; a value of -1 disables this behavior.
*/

        PM_MaximumDragDistance(8),
/**
 Width of a vertical scroll bar and the height of a horizontal scroll bar.
*/

        PM_ScrollBarExtent(9),
/**
 The minimum height of a vertical scroll bar's slider and the minimum width of a horizontal scroll bar's slider.
*/

        PM_ScrollBarSliderMin(10),
/**
 Total slider thickness.
*/

        PM_SliderThickness(11),
/**
 Thickness of the slider handle.
*/

        PM_SliderControlThickness(12),
/**
 Length of the slider.
*/

        PM_SliderLength(13),
/**
 The offset between the tickmarks and the slider.
*/

        PM_SliderTickmarkOffset(14),
/**
 The available space for the slider to move.
*/

        PM_SliderSpaceAvailable(15),
/**
 Width of a separator in a horizontal dock window and the height of a separator in a vertical dock window.
*/

        PM_DockWidgetSeparatorExtent(16),
/**
 Width of the handle in a horizontal dock window and the height of the handle in a vertical dock window.
*/

        PM_DockWidgetHandleExtent(17),
/**
 Frame width of a dock window.
*/

        PM_DockWidgetFrameWidth(18),
/**
 Number of pixels the tabs should overlap. (Currently only used in styles, not inside of {@link com.trolltech.qt.gui.QTabBar QTabBar})
*/

        PM_TabBarTabOverlap(19),
/**
 Extra space added to the tab width.
*/

        PM_TabBarTabHSpace(20),
/**
 Extra space added to the tab height.
*/

        PM_TabBarTabVSpace(21),
/**
 Height of the area between the tab bar and the tab pages.
*/

        PM_TabBarBaseHeight(22),
/**
 Number of pixels the tab bar overlaps the tab bar base.
*/

        PM_TabBarBaseOverlap(23),
/**
 Width of a chunk in a progress bar indicator.
*/

        PM_ProgressBarChunkWidth(24),
/**
 Width of a splitter.
*/

        PM_SplitterWidth(25),
/**
 Height of the title bar.
*/

        PM_TitleBarHeight(26),
/**
 Height of the scroller area in a {@link com.trolltech.qt.gui.QMenu QMenu}.
*/

        PM_MenuScrollerHeight(27),
/**
 Additional border (used on left and right) for a {@link com.trolltech.qt.gui.QMenu QMenu}.
*/

        PM_MenuHMargin(28),
/**
 Additional border (used for bottom and top) for a {@link com.trolltech.qt.gui.QMenu QMenu}.
*/

        PM_MenuVMargin(29),
/**
 Border width (applied on all sides) for a {@link com.trolltech.qt.gui.QMenu QMenu}.
*/

        PM_MenuPanelWidth(30),
/**
 Height of a tear off area in a {@link com.trolltech.qt.gui.QMenu QMenu}.
*/

        PM_MenuTearoffHeight(31),
/**
 The frame width for the menu on the desktop.
*/

        PM_MenuDesktopFrameWidth(32),
/**
 Frame width of a menu bar, defaults to {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_DefaultFrameWidth }.
*/

        PM_MenuBarPanelWidth(33),
/**
 Spacing between menu bar items.
*/

        PM_MenuBarItemSpacing(34),
/**
 Spacing between menu bar items and top/bottom of bar.
*/

        PM_MenuBarVMargin(35),
/**
 Spacing between menu bar items and left/right of bar.
*/

        PM_MenuBarHMargin(36),
/**
 Width of a check box indicator.
*/

        PM_IndicatorWidth(37),
/**
 Height of a checkbox indicator.
*/

        PM_IndicatorHeight(38),
/**
 Width of a radio button indicator.
*/

        PM_ExclusiveIndicatorWidth(39),
/**
 Height of a radio button indicator.
*/

        PM_ExclusiveIndicatorHeight(40),
/**
 Area (width/height) of the checkbox/radio button in a Q3CheckListItem.
*/

        PM_CheckListButtonSize(41),
/**
 Area (width/height) of the controller in a Q3CheckListItem.
*/

        PM_CheckListControllerSize(42),
        PM_DialogButtonsSeparator(43),
        PM_DialogButtonsButtonWidth(44),
        PM_DialogButtonsButtonHeight(45),
/**
 Frame width of an MDI window.
*/

        PM_MdiSubWindowFrameWidth(46),
/**
 Width of a minimized MDI window.
*/

        PM_MdiSubWindowMinimizedWidth(47),
/**
 The size of the margin between the sort indicator and the text.
*/

        PM_HeaderMargin(48),
/**
 The size of the sort indicator in a header.
*/

        PM_HeaderMarkSize(49),
/**
 The size of the resize grip in a header.
*/

        PM_HeaderGripMargin(50),
/**
 Horizontal pixel shift when a tab is selected.
*/

        PM_TabBarTabShiftHorizontal(51),
/**
 Vertical pixel shift when a tab is selected.
*/

        PM_TabBarTabShiftVertical(52),
/**

*/

        PM_TabBarScrollButtonWidth(53),
/**
 Width of the frame around toolbars.
*/

        PM_ToolBarFrameWidth(54),
/**
 Width of a toolbar handle in a horizontal toolbar and the height of the handle in a vertical toolbar.
*/

        PM_ToolBarHandleExtent(55),
/**
 Spacing between toolbar items.
*/

        PM_ToolBarItemSpacing(56),
/**
 Spacing between the toolbar frame and the items.
*/

        PM_ToolBarItemMargin(57),
/**
 Width of a toolbar separator in a horizontal toolbar and the height of a separator in a vertical toolbar.
*/

        PM_ToolBarSeparatorExtent(58),
/**
 Width of a toolbar extension button in a horizontal toolbar and the height of the button in a vertical toolbar.
*/

        PM_ToolBarExtensionExtent(59),
/**
 The height of the optional spin box slider.
*/

        PM_SpinBoxSliderHeight(60),
/**
 Use {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutLeftMargin }, {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutTopMargin }, {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutRightMargin }, and {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutBottomMargin } instead.
*/

        PM_DefaultTopLevelMargin(61),
/**
 Use {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutLeftMargin }, {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutTopMargin }, {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutRightMargin }, and {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutBottomMargin } instead.
*/

        PM_DefaultChildMargin(62),
/**
 Use {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing } and {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutVerticalSpacing } instead.
*/

        PM_DefaultLayoutSpacing(63),
/**
 Default tool bar icon size
*/

        PM_ToolBarIconSize(64),
/**
 The default size for icons in a list view.
*/

        PM_ListViewIconSize(65),
/**
 The default size for icons in an icon view.
*/

        PM_IconViewIconSize(66),
/**
 Default small icon size
*/

        PM_SmallIconSize(67),
/**
 Default large icon size
*/

        PM_LargeIconSize(68),
/**
 Vertical margin that the focus frame will outset the widget by.
*/

        PM_FocusFrameVMargin(69),
/**
 Horizontal margin that the focus frame will outset the widget by.
*/

        PM_FocusFrameHMargin(70),
/**
 The frame width for a tool tip label.
*/

        PM_ToolTipLabelFrameWidth(71),
/**
 The spacing between a check box indicator and its label.
*/

        PM_CheckBoxLabelSpacing(72),
/**
 The default icon size for a tab bar.
*/

        PM_TabBarIconSize(73),
/**
 The size of a size grip.
*/

        PM_SizeGripSize(74),
/**
 Margin of the dock window title.
*/

        PM_DockWidgetTitleMargin(75),
/**
 The size of the standard icons in a message box
*/

        PM_MessageBoxIconSize(76),
/**
 The default size of button icons
*/

        PM_ButtonIconSize(77),
/**
 Amount of whitespace between dock widget's title bar button labels and the frame.
*/

        PM_DockWidgetTitleBarButtonMargin(78),
/**
 The spacing between a radio button indicator and its label.
*/

        PM_RadioButtonLabelSpacing(79),
/**
 Default {@link com.trolltech.qt.gui.QLayout#setContentsMargins(int, int, int, int) left margin} for a {@link com.trolltech.qt.gui.QLayout QLayout}.
*/

        PM_LayoutLeftMargin(80),
/**
 Default {@link com.trolltech.qt.gui.QLayout#setContentsMargins(int, int, int, int) top margin} for a {@link com.trolltech.qt.gui.QLayout QLayout}.
*/

        PM_LayoutTopMargin(81),
/**
 Default {@link com.trolltech.qt.gui.QLayout#setContentsMargins(int, int, int, int) right margin} for a {@link com.trolltech.qt.gui.QLayout QLayout}.
*/

        PM_LayoutRightMargin(82),
/**
 Default {@link com.trolltech.qt.gui.QLayout#setContentsMargins(int, int, int, int) bottom margin} for a {@link com.trolltech.qt.gui.QLayout QLayout}.
*/

        PM_LayoutBottomMargin(83),
/**
 Default horizontal spacing for a {@link com.trolltech.qt.gui.QLayout QLayout}.
*/

        PM_LayoutHorizontalSpacing(84),
/**
 Default vertical spacing for a {@link com.trolltech.qt.gui.QLayout QLayout}.
*/

        PM_LayoutVerticalSpacing(85),
/**
 The distance between the left and right buttons in a tab bar.
*/

        PM_TabBar_ScrollButtonOverlap(86),
/**
 The width of the cursor in a line edit or text edit
*/

        PM_TextCursorWidth(87),
/**
 The default width of a close button on a tab in a tab bar.
*/

        PM_TabCloseIndicatorWidth(88),
/**
 The default height of a close button on a tab in a tab bar.
*/

        PM_TabCloseIndicatorHeight(89),
/**
 Distance between frame and scrollbar with {@link com.trolltech.qt.gui.QStyle.StyleHint SH_ScrollView_FrameOnlyAroundContents } set.
*/

        PM_ScrollView_ScrollBarSpacing(90),
/**
 The horizontal overlap between a submenu and its parent.
*/

        PM_SubMenuOverlap(91),
/**
 Base value for custom pixel metrics. Custom values must be greater than this value.
*/

        PM_CustomBase(-268435456),
        CustomEnum(0);

        PixelMetric(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyle$PixelMetric constant with the specified <tt>int</tt>.</brief>
*/

        public static PixelMetric resolve(int value) {
            return (PixelMetric) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return PM_ButtonMargin;
            case 1: return PM_ButtonDefaultIndicator;
            case 2: return PM_MenuButtonIndicator;
            case 3: return PM_ButtonShiftHorizontal;
            case 4: return PM_ButtonShiftVertical;
            case 5: return PM_DefaultFrameWidth;
            case 6: return PM_SpinBoxFrameWidth;
            case 7: return PM_ComboBoxFrameWidth;
            case 8: return PM_MaximumDragDistance;
            case 9: return PM_ScrollBarExtent;
            case 10: return PM_ScrollBarSliderMin;
            case 11: return PM_SliderThickness;
            case 12: return PM_SliderControlThickness;
            case 13: return PM_SliderLength;
            case 14: return PM_SliderTickmarkOffset;
            case 15: return PM_SliderSpaceAvailable;
            case 16: return PM_DockWidgetSeparatorExtent;
            case 17: return PM_DockWidgetHandleExtent;
            case 18: return PM_DockWidgetFrameWidth;
            case 19: return PM_TabBarTabOverlap;
            case 20: return PM_TabBarTabHSpace;
            case 21: return PM_TabBarTabVSpace;
            case 22: return PM_TabBarBaseHeight;
            case 23: return PM_TabBarBaseOverlap;
            case 24: return PM_ProgressBarChunkWidth;
            case 25: return PM_SplitterWidth;
            case 26: return PM_TitleBarHeight;
            case 27: return PM_MenuScrollerHeight;
            case 28: return PM_MenuHMargin;
            case 29: return PM_MenuVMargin;
            case 30: return PM_MenuPanelWidth;
            case 31: return PM_MenuTearoffHeight;
            case 32: return PM_MenuDesktopFrameWidth;
            case 33: return PM_MenuBarPanelWidth;
            case 34: return PM_MenuBarItemSpacing;
            case 35: return PM_MenuBarVMargin;
            case 36: return PM_MenuBarHMargin;
            case 37: return PM_IndicatorWidth;
            case 38: return PM_IndicatorHeight;
            case 39: return PM_ExclusiveIndicatorWidth;
            case 40: return PM_ExclusiveIndicatorHeight;
            case 41: return PM_CheckListButtonSize;
            case 42: return PM_CheckListControllerSize;
            case 43: return PM_DialogButtonsSeparator;
            case 44: return PM_DialogButtonsButtonWidth;
            case 45: return PM_DialogButtonsButtonHeight;
            case 46: return PM_MdiSubWindowFrameWidth;
            case 47: return PM_MdiSubWindowMinimizedWidth;
            case 48: return PM_HeaderMargin;
            case 49: return PM_HeaderMarkSize;
            case 50: return PM_HeaderGripMargin;
            case 51: return PM_TabBarTabShiftHorizontal;
            case 52: return PM_TabBarTabShiftVertical;
            case 53: return PM_TabBarScrollButtonWidth;
            case 54: return PM_ToolBarFrameWidth;
            case 55: return PM_ToolBarHandleExtent;
            case 56: return PM_ToolBarItemSpacing;
            case 57: return PM_ToolBarItemMargin;
            case 58: return PM_ToolBarSeparatorExtent;
            case 59: return PM_ToolBarExtensionExtent;
            case 60: return PM_SpinBoxSliderHeight;
            case 61: return PM_DefaultTopLevelMargin;
            case 62: return PM_DefaultChildMargin;
            case 63: return PM_DefaultLayoutSpacing;
            case 64: return PM_ToolBarIconSize;
            case 65: return PM_ListViewIconSize;
            case 66: return PM_IconViewIconSize;
            case 67: return PM_SmallIconSize;
            case 68: return PM_LargeIconSize;
            case 69: return PM_FocusFrameVMargin;
            case 70: return PM_FocusFrameHMargin;
            case 71: return PM_ToolTipLabelFrameWidth;
            case 72: return PM_CheckBoxLabelSpacing;
            case 73: return PM_TabBarIconSize;
            case 74: return PM_SizeGripSize;
            case 75: return PM_DockWidgetTitleMargin;
            case 76: return PM_MessageBoxIconSize;
            case 77: return PM_ButtonIconSize;
            case 78: return PM_DockWidgetTitleBarButtonMargin;
            case 79: return PM_RadioButtonLabelSpacing;
            case 80: return PM_LayoutLeftMargin;
            case 81: return PM_LayoutTopMargin;
            case 82: return PM_LayoutRightMargin;
            case 83: return PM_LayoutBottomMargin;
            case 84: return PM_LayoutHorizontalSpacing;
            case 85: return PM_LayoutVerticalSpacing;
            case 86: return PM_TabBar_ScrollButtonOverlap;
            case 87: return PM_TextCursorWidth;
            case 88: return PM_TabCloseIndicatorWidth;
            case 89: return PM_TabCloseIndicatorHeight;
            case 90: return PM_ScrollView_ScrollBarSpacing;
            case 91: return PM_SubMenuOverlap;
            case -268435456: return PM_CustomBase;
            }
            if (enumCache == null)
                enumCache = new java.util.HashMap<Integer, PixelMetric>();
            PixelMetric e = enumCache.get(value);
            if (e == null) {
                e = (PixelMetric) com.trolltech.qt.GeneratorUtilities.createExtendedEnum(value, CustomEnum.ordinal(), PixelMetric.class, CustomEnum.name());
                enumCache.put(value, e);
            }
            return e;
        }
        private final int value;

        private static java.util.HashMap<Integer, PixelMetric> enumCache;    }
    public static class SubControl{
        public static final int SC_None = 0;
        public static final int SC_ScrollBarAddLine = 1;
        public static final int SC_ScrollBarSubLine = 2;
        public static final int SC_ScrollBarAddPage = 4;
        public static final int SC_ScrollBarSubPage = 8;
        public static final int SC_ScrollBarFirst = 16;
        public static final int SC_ScrollBarLast = 32;
        public static final int SC_ScrollBarSlider = 64;
        public static final int SC_ScrollBarGroove = 128;
        public static final int SC_SpinBoxUp = 1;
        public static final int SC_SpinBoxDown = 2;
        public static final int SC_SpinBoxFrame = 4;
        public static final int SC_SpinBoxEditField = 8;
        public static final int SC_ComboBoxFrame = 1;
        public static final int SC_ComboBoxEditField = 2;
        public static final int SC_ComboBoxArrow = 4;
        public static final int SC_ComboBoxListBoxPopup = 8;
        public static final int SC_SliderGroove = 1;
        public static final int SC_SliderHandle = 2;
        public static final int SC_SliderTickmarks = 4;
        public static final int SC_ToolButton = 1;
        public static final int SC_ToolButtonMenu = 2;
        public static final int SC_TitleBarSysMenu = 1;
        public static final int SC_TitleBarMinButton = 2;
        public static final int SC_TitleBarMaxButton = 4;
        public static final int SC_TitleBarCloseButton = 8;
        public static final int SC_TitleBarNormalButton = 16;
        public static final int SC_TitleBarShadeButton = 32;
        public static final int SC_TitleBarUnshadeButton = 64;
        public static final int SC_TitleBarContextHelpButton = 128;
        public static final int SC_TitleBarLabel = 256;
        public static final int SC_Q3ListView = 1;
        public static final int SC_Q3ListViewBranch = 2;
        public static final int SC_Q3ListViewExpand = 4;
        public static final int SC_DialGroove = 1;
        public static final int SC_DialHandle = 2;
        public static final int SC_DialTickmarks = 4;
        public static final int SC_GroupBoxCheckBox = 1;
        public static final int SC_GroupBoxLabel = 2;
        public static final int SC_GroupBoxContents = 4;
        public static final int SC_GroupBoxFrame = 8;
        public static final int SC_MdiMinButton = 1;
        public static final int SC_MdiNormalButton = 2;
        public static final int SC_MdiCloseButton = 4;
        public static final int SC_All = -1;
    } // end of enum SubControl

    
/**
This enum describes the available standard pixmaps. A standard pixmap is a pixmap that can follow some existing GUI style or guideline. <p><DT><b>See also:</b><br><DD>standardPixmap(), and {@link com.trolltech.qt.gui.QStyle#standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIcon()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum StandardPixmap implements com.trolltech.qt.QtEnumerator {
/**
 Menu button on a title bar.
*/

        SP_TitleBarMenuButton(0),
/**
 Minimize button on title bars (e. ., in {@link com.trolltech.qt.gui.QWorkspace QWorkspace}).
*/

        SP_TitleBarMinButton(1),
/**
 Maximize button on title bars.
*/

        SP_TitleBarMaxButton(2),
/**
 Close button on title bars.
*/

        SP_TitleBarCloseButton(3),
/**
 Normal (restore) button on title bars.
*/

        SP_TitleBarNormalButton(4),
/**
 Shade button on title bars.
*/

        SP_TitleBarShadeButton(5),
/**
 Unshade button on title bars.
*/

        SP_TitleBarUnshadeButton(6),
/**
 The Context help button on title bars.
*/

        SP_TitleBarContextHelpButton(7),
/**
 Close button on dock windows (see also {@link com.trolltech.qt.gui.QDockWidget QDockWidget}).
*/

        SP_DockWidgetCloseButton(8),
/**
 The "information" icon.
*/

        SP_MessageBoxInformation(9),
/**
 The "warning" icon.
*/

        SP_MessageBoxWarning(10),
/**
 The "critical" icon.
*/

        SP_MessageBoxCritical(11),
/**
 The "question" icon.
*/

        SP_MessageBoxQuestion(12),
/**
 The "desktop" icon.
*/

        SP_DesktopIcon(13),
/**
 The "trash" icon.
*/

        SP_TrashIcon(14),
/**
 The "My computer" icon.
*/

        SP_ComputerIcon(15),
/**
 The floppy icon.
*/

        SP_DriveFDIcon(16),
/**
 The harddrive icon.
*/

        SP_DriveHDIcon(17),
/**
 The CD icon.
*/

        SP_DriveCDIcon(18),
/**
 The DVD icon.
*/

        SP_DriveDVDIcon(19),
/**
 The network icon.
*/

        SP_DriveNetIcon(20),
/**
 The open directory icon.
*/

        SP_DirOpenIcon(21),
/**
 The closed directory icon.
*/

        SP_DirClosedIcon(22),
/**
 The link to directory icon.
*/

        SP_DirLinkIcon(23),
/**
 The file icon.
*/

        SP_FileIcon(24),
/**
 The link to file icon.
*/

        SP_FileLinkIcon(25),
/**
 Extension button for horizontal toolbars.
*/

        SP_ToolBarHorizontalExtensionButton(26),
/**
 Extension button for vertical toolbars.
*/

        SP_ToolBarVerticalExtensionButton(27),
/**
 The "start" icon in a file dialog.
*/

        SP_FileDialogStart(28),
/**
 The "end" icon in a file dialog.
*/

        SP_FileDialogEnd(29),
/**
 The "parent directory" icon in a file dialog.
*/

        SP_FileDialogToParent(30),
/**
 The "create new folder" icon in a file dialog.
*/

        SP_FileDialogNewFolder(31),
/**
 The detailed view icon in a file dialog.
*/

        SP_FileDialogDetailedView(32),
/**
 The file info icon in a file dialog.
*/

        SP_FileDialogInfoView(33),
/**
 The contents view icon in a file dialog.
*/

        SP_FileDialogContentsView(34),
/**
 The list view icon in a file dialog.
*/

        SP_FileDialogListView(35),
/**
 The back arrow in a file dialog.
*/

        SP_FileDialogBack(36),
/**
 The directory icon.
*/

        SP_DirIcon(37),
/**
 Icon for a standard OK button in a {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}.
*/

        SP_DialogOkButton(38),
/**
 Icon for a standard Cancel button in a {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}.
*/

        SP_DialogCancelButton(39),
/**
 Icon for a standard Help button in a {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}.
*/

        SP_DialogHelpButton(40),
/**
 Icon for a standard Open button in a {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}.
*/

        SP_DialogOpenButton(41),
/**
 Icon for a standard Save button in a {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}.
*/

        SP_DialogSaveButton(42),
/**
 Icon for a standard Close button in a {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}.
*/

        SP_DialogCloseButton(43),
/**
 Icon for a standard Apply button in a {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}.
*/

        SP_DialogApplyButton(44),
/**
 Icon for a standard Reset button in a {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}.
*/

        SP_DialogResetButton(45),
/**
 Icon for a standard Discard button in a {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}.
*/

        SP_DialogDiscardButton(46),
/**
 Icon for a standard Yes button in a {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}.
*/

        SP_DialogYesButton(47),
/**
 Icon for a standard No button in a {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}.
*/

        SP_DialogNoButton(48),
/**
 Icon arrow pointing up.
*/

        SP_ArrowUp(49),
/**
 Icon arrow pointing down.
*/

        SP_ArrowDown(50),
/**
 Icon arrow pointing left.
*/

        SP_ArrowLeft(51),
/**
 Icon arrow pointing right.
*/

        SP_ArrowRight(52),
/**
 Equivalent to {@link com.trolltech.qt.gui.QStyle.StandardPixmap SP_ArrowLeft } when the current layout direction is {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LeftToRight }, otherwise {@link com.trolltech.qt.gui.QStyle.StandardPixmap SP_ArrowRight }.
*/

        SP_ArrowBack(53),
/**
 Equivalent to {@link com.trolltech.qt.gui.QStyle.StandardPixmap SP_ArrowRight } when the current layout direction is {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LeftToRight }, otherwise {@link com.trolltech.qt.gui.QStyle.StandardPixmap SP_ArrowLeft }.
*/

        SP_ArrowForward(54),
/**
 The home directory icon.
*/

        SP_DirHomeIcon(55),
/**
 Icon used to indicate a Vista style command link glyph.
*/

        SP_CommandLink(56),
/**
 Icon used to indicate UAC prompts on Windows Vista. This will return a null pixmap or icon on all other platforms.
*/

        SP_VistaShield(57),
/**
 Icon indicating that the current page should be reloaded.
*/

        SP_BrowserReload(58),
/**
 Icon indicating that the page loading should stop.
*/

        SP_BrowserStop(59),
/**
 Icon indicating that media should begin playback.
*/

        SP_MediaPlay(60),
/**
 Icon indicating that media should stop playback.
*/

        SP_MediaStop(61),
/**
 Icon indicating that media should pause playback.
*/

        SP_MediaPause(62),
/**
 Icon indicating that media should skip forward.
*/

        SP_MediaSkipForward(63),
/**
 Icon indicating that media should skip backward.
*/

        SP_MediaSkipBackward(64),
/**
 Icon indicating that media should seek forward.
*/

        SP_MediaSeekForward(65),
/**
 Icon indicating that media should seek backward.
*/

        SP_MediaSeekBackward(66),
/**
 Icon indicating a volume control.
*/

        SP_MediaVolume(67),
/**
 Icon indicating a muted volume control.
*/

        SP_MediaVolumeMuted(68),
/**
 Base value for custom standard pixmaps; custom values must be greater than this value.
*/

        SP_CustomBase(-268435456),
        CustomEnum(0);

        StandardPixmap(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyle$StandardPixmap constant with the specified <tt>int</tt>.</brief>
*/

        public static StandardPixmap resolve(int value) {
            return (StandardPixmap) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SP_TitleBarMenuButton;
            case 1: return SP_TitleBarMinButton;
            case 2: return SP_TitleBarMaxButton;
            case 3: return SP_TitleBarCloseButton;
            case 4: return SP_TitleBarNormalButton;
            case 5: return SP_TitleBarShadeButton;
            case 6: return SP_TitleBarUnshadeButton;
            case 7: return SP_TitleBarContextHelpButton;
            case 8: return SP_DockWidgetCloseButton;
            case 9: return SP_MessageBoxInformation;
            case 10: return SP_MessageBoxWarning;
            case 11: return SP_MessageBoxCritical;
            case 12: return SP_MessageBoxQuestion;
            case 13: return SP_DesktopIcon;
            case 14: return SP_TrashIcon;
            case 15: return SP_ComputerIcon;
            case 16: return SP_DriveFDIcon;
            case 17: return SP_DriveHDIcon;
            case 18: return SP_DriveCDIcon;
            case 19: return SP_DriveDVDIcon;
            case 20: return SP_DriveNetIcon;
            case 21: return SP_DirOpenIcon;
            case 22: return SP_DirClosedIcon;
            case 23: return SP_DirLinkIcon;
            case 24: return SP_FileIcon;
            case 25: return SP_FileLinkIcon;
            case 26: return SP_ToolBarHorizontalExtensionButton;
            case 27: return SP_ToolBarVerticalExtensionButton;
            case 28: return SP_FileDialogStart;
            case 29: return SP_FileDialogEnd;
            case 30: return SP_FileDialogToParent;
            case 31: return SP_FileDialogNewFolder;
            case 32: return SP_FileDialogDetailedView;
            case 33: return SP_FileDialogInfoView;
            case 34: return SP_FileDialogContentsView;
            case 35: return SP_FileDialogListView;
            case 36: return SP_FileDialogBack;
            case 37: return SP_DirIcon;
            case 38: return SP_DialogOkButton;
            case 39: return SP_DialogCancelButton;
            case 40: return SP_DialogHelpButton;
            case 41: return SP_DialogOpenButton;
            case 42: return SP_DialogSaveButton;
            case 43: return SP_DialogCloseButton;
            case 44: return SP_DialogApplyButton;
            case 45: return SP_DialogResetButton;
            case 46: return SP_DialogDiscardButton;
            case 47: return SP_DialogYesButton;
            case 48: return SP_DialogNoButton;
            case 49: return SP_ArrowUp;
            case 50: return SP_ArrowDown;
            case 51: return SP_ArrowLeft;
            case 52: return SP_ArrowRight;
            case 53: return SP_ArrowBack;
            case 54: return SP_ArrowForward;
            case 55: return SP_DirHomeIcon;
            case 56: return SP_CommandLink;
            case 57: return SP_VistaShield;
            case 58: return SP_BrowserReload;
            case 59: return SP_BrowserStop;
            case 60: return SP_MediaPlay;
            case 61: return SP_MediaStop;
            case 62: return SP_MediaPause;
            case 63: return SP_MediaSkipForward;
            case 64: return SP_MediaSkipBackward;
            case 65: return SP_MediaSeekForward;
            case 66: return SP_MediaSeekBackward;
            case 67: return SP_MediaVolume;
            case 68: return SP_MediaVolumeMuted;
            case -268435456: return SP_CustomBase;
            }
            if (enumCache == null)
                enumCache = new java.util.HashMap<Integer, StandardPixmap>();
            StandardPixmap e = enumCache.get(value);
            if (e == null) {
                e = (StandardPixmap) com.trolltech.qt.GeneratorUtilities.createExtendedEnum(value, CustomEnum.ordinal(), StandardPixmap.class, CustomEnum.name());
                enumCache.put(value, e);
            }
            return e;
        }
        private final int value;

        private static java.util.HashMap<Integer, StandardPixmap> enumCache;    }
    
/**
This enum describes the available style hints. A style hint is a general look and/or feel hint. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#styleHint(com.trolltech.qt.gui.QStyle.StyleHint, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) styleHint()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum StyleHint implements com.trolltech.qt.QtEnumerator {
/**
 Disabled text is "etched" as it is on Windows.
*/

        SH_EtchDisabledText(0),
/**
 Disabled text is dithered as it is on Motif.
*/

        SH_DitherDisabledText(1),
/**
 A boolean value. If true, middle clicking on a scroll bar causes the slider to jump to that position. If false, middle clicking is ignored.
*/

        SH_ScrollBar_MiddleClickAbsolutePosition(2),
/**
 A boolean value. If true, when clicking a scroll bar {@link com.trolltech.qt.gui.QStyle.SubControl SubControl }, holding the mouse button down and moving the pointer outside the {@link com.trolltech.qt.gui.QStyle.SubControl SubControl }, the scroll bar continues to scroll. If false, the scollbar stops scrolling when the pointer leaves the {@link com.trolltech.qt.gui.QStyle.SubControl SubControl }.
*/

        SH_ScrollBar_ScrollWhenPointerLeavesControl(3),
/**
 Which type of mouse event should cause a tab to be selected.
*/

        SH_TabBar_SelectMouseType(4),
/**
 The alignment for tabs in a {@link com.trolltech.qt.gui.QTabWidget QTabWidget}. Possible values are {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }, {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignCenter } and {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight }.
*/

        SH_TabBar_Alignment(5),
/**
 The placement of the sorting indicator may appear in list or table headers. Possible values are {@link com.trolltech.qt.core.Qt.Dock Qt::Left } or {@link com.trolltech.qt.core.Qt.Dock Qt::Right }.
*/

        SH_Header_ArrowAlignment(6),
/**
 Sliders snap to values while moving, as they do on Windows.
*/

        SH_Slider_SnapToValue(7),
/**
 Key presses handled in a sloppy manner, i.e., left on a vertical slider subtracts a line.
*/

        SH_Slider_SloppyKeyEvents(8),
/**
 Center button on progress dialogs, like Motif, otherwise right aligned.
*/

        SH_ProgressDialog_CenterCancelButton(9),
/**
 The alignment for text labels in progress dialogs; {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignCenter } on Windows, {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignVCenter } otherwise.
*/

        SH_ProgressDialog_TextLabelAlignment(10),
/**
 Right align buttons in the print dialog, as done on Windows.
*/

        SH_PrintDialog_RightAlignButtons(11),
/**
 One or two pixel space between the menu bar and the dockarea, as done on Windows.
*/

        SH_MainWindow_SpaceBelowMenuBar(12),
/**
 Select the text in the line edit, or when selecting an item from the listbox, or when the line edit receives focus, as done on Windows.
*/

        SH_FontDialog_SelectAssociatedText(13),
/**
 Allows disabled menu items to be active.
*/

        SH_Menu_AllowActiveAndDisabled(14),
/**
 Pressing the space bar activates the item, as done on Motif.
*/

        SH_Menu_SpaceActivatesItem(15),
/**
 The number of milliseconds to wait before opening a submenu (256 on Windows, 96 on Motif).
*/

        SH_Menu_SubMenuPopupDelay(16),
/**
 Whether scrollviews draw their frame only around contents (like Motif), or around contents, scroll bars and corner widgets (like Windows).
*/

        SH_ScrollView_FrameOnlyAroundContents(17),
/**
 Menu bars items are navigable by pressing Alt, followed by using the arrow keys to select the desired item.
*/

        SH_MenuBar_AltKeyNavigation(18),
/**
 Mouse tracking in combobox drop-down lists.
*/

        SH_ComboBox_ListMouseTracking(19),
/**
 Mouse tracking in popup menus.
*/

        SH_Menu_MouseTracking(20),
/**
 Mouse tracking in menu bars.
*/

        SH_MenuBar_MouseTracking(21),
/**
 Gray out selected items when losing focus.
*/

        SH_ItemView_ChangeHighlightOnFocus(22),
/**
 Turn on sharing activation with floating modeless dialogs.
*/

        SH_Widget_ShareActivation(23),
/**
 The workspace should maximize the client area.
*/

        SH_Workspace_FillSpaceOnMaximize(24),
/**
 Allows popups as a combobox drop-down menu.
*/

        SH_ComboBox_Popup(25),
/**
 The title bar has no border.
*/

        SH_TitleBar_NoBorder(26),
/**
 Stops auto-repeat when the slider reaches the mouse position.
*/

        SH_Slider_StopMouseOverSlider(27),
/**
 Whether cursor should blink when text is selected.
*/

        SH_BlinkCursorWhenTextSelected(28),
/**
 Whether richtext selections should extend to the full width of the document.
*/

        SH_RichText_FullWidthSelection(29),
/**
 Whether popup menus must support scrolling.
*/

        SH_Menu_Scrollable(30),
/**
 How to vertically align a group box's text label.
*/

        SH_GroupBox_TextLabelVerticalAlignment(31),
/**
 How to paint a group box's text label.
*/

        SH_GroupBox_TextLabelColor(32),
/**
 Whether popupmenu's must support sloppy submenu; as implemented on Mac OS.
*/

        SH_Menu_SloppySubMenus(33),
/**
 The RGB value of the grid for a table.
*/

        SH_Table_GridLineColor(34),
/**
 The Unicode character to be used for passwords.
*/

        SH_LineEdit_PasswordCharacter(35),
/**
 Which button gets the default status in a dialog's button widget.
*/

        SH_DialogButtons_DefaultButton(36),
/**
 Boldness of the selected page title in a {@link com.trolltech.qt.gui.QToolBox QToolBox}.
*/

        SH_ToolBox_SelectedPageTitleBold(37),
/**
 Whether a tab bar should suggest a size to prevent scoll arrows.
*/

        SH_TabBar_PreferNoArrows(38),
/**
 A boolean value. If true, left clicking on a scroll bar causes the slider to jump to that position. If false, left clicking will behave as appropriate for each control.
*/

        SH_ScrollBar_LeftClickAbsolutePosition(39),
/**
 Which type of mouse event should cause a list view expansion to be selected.
*/

        SH_Q3ListViewExpand_SelectMouseType(40),
/**
 Whether shortcuts are underlined.
*/

        SH_UnderlineShortcut(41),
/**
 Animate a click when up or down is pressed in a spin box.
*/

        SH_SpinBox_AnimateButton(42),
/**
 Auto-repeat interval for spinbox key presses.
*/

        SH_SpinBox_KeyPressAutoRepeatRate(43),
/**
 Auto-repeat interval for spinbox mouse clicks.
*/

        SH_SpinBox_ClickAutoRepeatRate(44),
/**
 Whether scrolling popups should fill the screen as they are scrolled.
*/

        SH_Menu_FillScreenWithScroll(45),
/**
 An integer indicating the opacity for the tip label, 0 is completely transparent, 255 is completely opaque.
*/

        SH_ToolTipLabel_Opacity(46),
/**
 Indicates whether or not the menu bar draws separators.
*/

        SH_DrawMenuBarSeparator(47),
/**
 Indicates if the title bar should show a '*' for windows that are modified.
*/

        SH_TitleBar_ModifyNotification(48),
/**
 The default focus policy for buttons.
*/

        SH_Button_FocusPolicy(49),
/**
 A boolean indicating if a menu in the menu bar should be dismissed when it is clicked on a second time. (Example: Clicking and releasing on the File Menu in a menu bar and then immediately clicking on the File Menu again.)
*/

        SH_MenuBar_DismissOnSecondClick(50),
/**
 A boolean indicating what the to use the border of the buttons (computed as half the button height) for the spacing of the button in a message box.
*/

        SH_MessageBox_UseBorderForButtonSpacing(51),
/**
 A boolean indicating whether controls on a title bar ought to update when the mouse is over them.
*/

        SH_TitleBar_AutoRaise(52),
/**
 An int indicating the popup delay in milliseconds for menus attached to tool buttons.
*/

        SH_ToolButton_PopupDelay(53),
/**
 The mask of the focus frame.
*/

        SH_FocusFrame_Mask(54),
/**
 The mask of the rubber band.
*/

        SH_RubberBand_Mask(55),
/**
 The mask of the window frame.
*/

        SH_WindowFrame_Mask(56),
/**
 Determines if the spin controls will shown as disabled when reaching the spin range boundary.
*/

        SH_SpinControls_DisableOnBounds(57),
/**
 Defines the style's preferred background role (as {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::ColorRole }) for a dial widget.
*/

        SH_Dial_BackgroundRole(58),
/**
 The layout direction for the combo box. By default it should be the same as indicated by the QStyleOption::direction variable.
*/

        SH_ComboBox_LayoutDirection(59),
/**
 The location where ellipses should be added for item text that is too long to fit in an view item.
*/

        SH_ItemView_EllipsisLocation(60),
/**
 When an item in an item view is selected, also highlight the branch or other decoration.
*/

        SH_ItemView_ShowDecorationSelected(61),
/**
 Emit the activated signal when the user single clicks on an item in an item in an item view. Otherwise the signal is emitted when the user double clicks on an item.
*/

        SH_ItemView_ActivateItemOnSingleClick(62),
/**
 Whether or not a scroll bar has a context menu.
*/

        SH_ScrollBar_ContextMenu(63),
/**
 A boolean value. If true, when clicking a scroll bar button ({@link com.trolltech.qt.gui.QStyle.SubControl SC_ScrollBarAddLine } or {@link com.trolltech.qt.gui.QStyle.SubControl SC_ScrollBarSubLine }) and dragging over to the opposite button (rolling) will press the new button and release the old one. When it is false, the original button is released and nothing happens (like a push button).
*/

        SH_ScrollBar_RollBetweenButtons(64),
/**
 Which mouse buttons cause a slider to set the value to the position clicked on.
*/

        SH_Slider_AbsoluteSetButtons(65),
/**
 Which mouse buttons cause a slider to page step the value.
*/

        SH_Slider_PageSetButtons(66),
/**
 Typing causes a menu to be search for relevant items, otherwise only mnemnonic is considered.
*/

        SH_Menu_KeyboardSearch(67),
/**
 The default eliding style for a tab bar.
*/

        SH_TabBar_ElideMode(68),
/**
 Controls how buttons are laid out in a {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox}, returns a {@link com.trolltech.qt.gui.QDialogButtonBox.ButtonLayout QDialogButtonBox::ButtonLayout } enum.
*/

        SH_DialogButtonLayout(69),
/**
 The frame style used when drawing a combobox popup menu.
*/

        SH_ComboBox_PopupFrameStyle(70),
/**
 A boolean indicating if the text in a message box should allow user interfactions (e.g. selection) or not.
*/

        SH_MessageBox_TextInteractionFlags(71),
/**
 Indicates whether or not StandardButtons in {@link com.trolltech.qt.gui.QDialogButtonBox QDialogButtonBox} should have icons or not.
*/

        SH_DialogButtonBox_ButtonsHaveIcons(72),
/**
 A {@link com.trolltech.qt.gui.QTextCharFormat.UnderlineStyle QTextCharFormat::UnderlineStyle } value that specifies the way misspelled words should be underlined.
*/

        SH_SpellCheckUnderlineStyle(73),
/**
 A boolean indicating whether the buttons in the message box should be centered or not (see QDialogButtonBox.:setCentered()).
*/

        SH_MessageBox_CenterButtons(74),
/**
 Whether popups should allow the selections to wrap, that is when selection should the next item be the first item.
*/

        SH_Menu_SelectionWrap(75),
/**
 The item view is able to indicate a current item without changing the selection.
*/

        SH_ItemView_MovementWithoutUpdatingSelection(76),
/**
 The mask of a tool tip.
*/

        SH_ToolTip_Mask(77),
/**
 The FocusFrame is stacked above the widget that it is "focusing on".
*/

        SH_FocusFrame_AboveWidget(78),
/**
 Specifies the text format used to highlight focused anchors in rich text documents displayed for example in {@link com.trolltech.qt.gui.QTextBrowser QTextBrowser}. The format has to be a {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat} returned in the variant of the {@link com.trolltech.qt.gui.QStyleHintReturnVariant QStyleHintReturnVariant} return value. The {@link com.trolltech.qt.gui.QTextFormat.Property QTextFormat::OutlinePen } property is used for the outline and {@link com.trolltech.qt.gui.QTextFormat.Property QTextFormat::BackgroundBrush } for the background of the highlighted area.
*/

        SH_TextControl_FocusIndicatorTextCharFormat(79),
/**
 Controls the look and feel of a {@link com.trolltech.qt.gui.QWizard QWizard}. Returns a {@link com.trolltech.qt.gui.QWizard.WizardStyle QWizard::WizardStyle } enum.
*/

        SH_WizardStyle(80),
/**
 Controls whether the tree view will select the first child when it is exapanded and the right arrow key is pressed.
*/

        SH_ItemView_ArrowKeysNavigateIntoChildren(81),
/**
 The mask for a popup menu.
*/

        SH_Menu_Mask(82),
/**
 Flash triggered item.
*/

        SH_Menu_FlashTriggeredItem(83),
/**
 Fade out the menu instead of hiding it immediately.
*/

        SH_Menu_FadeOutOnHide(84),
/**
 Auto-repeat threshold for spinbox mouse clicks.
*/

        SH_SpinBox_ClickAutoRepeatThreshold(85),
/**
 Whether {@link com.trolltech.qt.gui.QTreeView QTreeView} paints alternating row colors for the area that does not have any items.
*/

        SH_ItemView_PaintAlternatingRowColorsForEmptyArea(86),
/**
 Provides a default for how rows are wrapped in a {@link com.trolltech.qt.gui.QFormLayout QFormLayout}. Returns a {@link com.trolltech.qt.gui.QFormLayout.RowWrapPolicy QFormLayout::RowWrapPolicy } enum.
*/

        SH_FormLayoutWrapPolicy(87),
/**
 Default position of the tab bar in a tab widget.
*/

        SH_TabWidget_DefaultTabPosition(88),
/**
 Determines if the tool bar is movable by default.
*/

        SH_ToolBar_Movable(89),
/**
 Provides a default for how fields can grow in a {@link com.trolltech.qt.gui.QFormLayout QFormLayout}. Returns a {@link com.trolltech.qt.gui.QFormLayout.FieldGrowthPolicy QFormLayout::FieldGrowthPolicy } enum.
*/

        SH_FormLayoutFieldGrowthPolicy(90),
/**
 Provides a default for how a {@link com.trolltech.qt.gui.QFormLayout QFormLayout} aligns its contents within the available space. Returns a Qt::Alignment enum.
*/

        SH_FormLayoutFormAlignment(91),
/**
 Provides a default for how a {@link com.trolltech.qt.gui.QFormLayout QFormLayout} aligns labels within the available space. Returns a Qt::Alignment enum.
*/

        SH_FormLayoutLabelAlignment(92),
/**
 Determines if there should be a frame for a delegate widget.
*/

        SH_ItemView_DrawDelegateFrame(93),
/**
 Determines the position of the close button on a tab in a tab bar.
*/

        SH_TabBar_CloseButtonPosition(94),
/**
 Determines if dockwidget buttons should have frames. Default is true.
*/

        SH_DockWidget_ButtonsHaveFrame(95),
/**
 Base value for custom style hints. Custom values must be greater than this value.
*/

        SH_CustomBase(-268435456),
        CustomEnum(0);

        StyleHint(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyle$StyleHint constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleHint resolve(int value) {
            return (StyleHint) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SH_EtchDisabledText;
            case 1: return SH_DitherDisabledText;
            case 2: return SH_ScrollBar_MiddleClickAbsolutePosition;
            case 3: return SH_ScrollBar_ScrollWhenPointerLeavesControl;
            case 4: return SH_TabBar_SelectMouseType;
            case 5: return SH_TabBar_Alignment;
            case 6: return SH_Header_ArrowAlignment;
            case 7: return SH_Slider_SnapToValue;
            case 8: return SH_Slider_SloppyKeyEvents;
            case 9: return SH_ProgressDialog_CenterCancelButton;
            case 10: return SH_ProgressDialog_TextLabelAlignment;
            case 11: return SH_PrintDialog_RightAlignButtons;
            case 12: return SH_MainWindow_SpaceBelowMenuBar;
            case 13: return SH_FontDialog_SelectAssociatedText;
            case 14: return SH_Menu_AllowActiveAndDisabled;
            case 15: return SH_Menu_SpaceActivatesItem;
            case 16: return SH_Menu_SubMenuPopupDelay;
            case 17: return SH_ScrollView_FrameOnlyAroundContents;
            case 18: return SH_MenuBar_AltKeyNavigation;
            case 19: return SH_ComboBox_ListMouseTracking;
            case 20: return SH_Menu_MouseTracking;
            case 21: return SH_MenuBar_MouseTracking;
            case 22: return SH_ItemView_ChangeHighlightOnFocus;
            case 23: return SH_Widget_ShareActivation;
            case 24: return SH_Workspace_FillSpaceOnMaximize;
            case 25: return SH_ComboBox_Popup;
            case 26: return SH_TitleBar_NoBorder;
            case 27: return SH_Slider_StopMouseOverSlider;
            case 28: return SH_BlinkCursorWhenTextSelected;
            case 29: return SH_RichText_FullWidthSelection;
            case 30: return SH_Menu_Scrollable;
            case 31: return SH_GroupBox_TextLabelVerticalAlignment;
            case 32: return SH_GroupBox_TextLabelColor;
            case 33: return SH_Menu_SloppySubMenus;
            case 34: return SH_Table_GridLineColor;
            case 35: return SH_LineEdit_PasswordCharacter;
            case 36: return SH_DialogButtons_DefaultButton;
            case 37: return SH_ToolBox_SelectedPageTitleBold;
            case 38: return SH_TabBar_PreferNoArrows;
            case 39: return SH_ScrollBar_LeftClickAbsolutePosition;
            case 40: return SH_Q3ListViewExpand_SelectMouseType;
            case 41: return SH_UnderlineShortcut;
            case 42: return SH_SpinBox_AnimateButton;
            case 43: return SH_SpinBox_KeyPressAutoRepeatRate;
            case 44: return SH_SpinBox_ClickAutoRepeatRate;
            case 45: return SH_Menu_FillScreenWithScroll;
            case 46: return SH_ToolTipLabel_Opacity;
            case 47: return SH_DrawMenuBarSeparator;
            case 48: return SH_TitleBar_ModifyNotification;
            case 49: return SH_Button_FocusPolicy;
            case 50: return SH_MenuBar_DismissOnSecondClick;
            case 51: return SH_MessageBox_UseBorderForButtonSpacing;
            case 52: return SH_TitleBar_AutoRaise;
            case 53: return SH_ToolButton_PopupDelay;
            case 54: return SH_FocusFrame_Mask;
            case 55: return SH_RubberBand_Mask;
            case 56: return SH_WindowFrame_Mask;
            case 57: return SH_SpinControls_DisableOnBounds;
            case 58: return SH_Dial_BackgroundRole;
            case 59: return SH_ComboBox_LayoutDirection;
            case 60: return SH_ItemView_EllipsisLocation;
            case 61: return SH_ItemView_ShowDecorationSelected;
            case 62: return SH_ItemView_ActivateItemOnSingleClick;
            case 63: return SH_ScrollBar_ContextMenu;
            case 64: return SH_ScrollBar_RollBetweenButtons;
            case 65: return SH_Slider_AbsoluteSetButtons;
            case 66: return SH_Slider_PageSetButtons;
            case 67: return SH_Menu_KeyboardSearch;
            case 68: return SH_TabBar_ElideMode;
            case 69: return SH_DialogButtonLayout;
            case 70: return SH_ComboBox_PopupFrameStyle;
            case 71: return SH_MessageBox_TextInteractionFlags;
            case 72: return SH_DialogButtonBox_ButtonsHaveIcons;
            case 73: return SH_SpellCheckUnderlineStyle;
            case 74: return SH_MessageBox_CenterButtons;
            case 75: return SH_Menu_SelectionWrap;
            case 76: return SH_ItemView_MovementWithoutUpdatingSelection;
            case 77: return SH_ToolTip_Mask;
            case 78: return SH_FocusFrame_AboveWidget;
            case 79: return SH_TextControl_FocusIndicatorTextCharFormat;
            case 80: return SH_WizardStyle;
            case 81: return SH_ItemView_ArrowKeysNavigateIntoChildren;
            case 82: return SH_Menu_Mask;
            case 83: return SH_Menu_FlashTriggeredItem;
            case 84: return SH_Menu_FadeOutOnHide;
            case 85: return SH_SpinBox_ClickAutoRepeatThreshold;
            case 86: return SH_ItemView_PaintAlternatingRowColorsForEmptyArea;
            case 87: return SH_FormLayoutWrapPolicy;
            case 88: return SH_TabWidget_DefaultTabPosition;
            case 89: return SH_ToolBar_Movable;
            case 90: return SH_FormLayoutFieldGrowthPolicy;
            case 91: return SH_FormLayoutFormAlignment;
            case 92: return SH_FormLayoutLabelAlignment;
            case 93: return SH_ItemView_DrawDelegateFrame;
            case 94: return SH_TabBar_CloseButtonPosition;
            case 95: return SH_DockWidget_ButtonsHaveFrame;
            case -268435456: return SH_CustomBase;
            }
            if (enumCache == null)
                enumCache = new java.util.HashMap<Integer, StyleHint>();
            StyleHint e = enumCache.get(value);
            if (e == null) {
                e = (StyleHint) com.trolltech.qt.GeneratorUtilities.createExtendedEnum(value, CustomEnum.ordinal(), StyleHint.class, CustomEnum.name());
                enumCache.put(value, e);
            }
            return e;
        }
        private final int value;

        private static java.util.HashMap<Integer, StyleHint> enumCache;    }
    
/**
This enum describes that various primitive elements. A primitive element is a common GUI element, such as a checkbox indicator or button bevel. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawPrimitive()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum PrimitiveElement implements com.trolltech.qt.QtEnumerator {
/**
 Qt 3 compatible controller part of a list view item.
*/

        PE_Q3CheckListController(0),
/**
 Qt 3 compatible radio button part of a list view item.
*/

        PE_Q3CheckListExclusiveIndicator(1),
/**
 Qt 3 compatible checkbox part of a list view item.
*/

        PE_Q3CheckListIndicator(2),
/**
 Item separator for Qt 3 compatible dock window and toolbar contents.
*/

        PE_Q3DockWindowSeparator(3),
/**
 Qt 3 compatible generic separator.
*/

        PE_Q3Separator(4),
/**
 Generic frame
*/

        PE_Frame(5),
/**
 This frame around a default button, e.g. in a dialog.
*/

        PE_FrameDefaultButton(6),
/**
 Panel frame for dock windows and toolbars.
*/

        PE_FrameDockWidget(7),
/**
 Generic focus indicator.
*/

        PE_FrameFocusRect(8),
/**
 Panel frame around group boxes.
*/

        PE_FrameGroupBox(9),
/**
 Panel frame for line edits.
*/

        PE_FrameLineEdit(10),
/**
 Frame for popup windows/menus; see also {@link com.trolltech.qt.gui.QMenu QMenu}.
*/

        PE_FrameMenu(11),
/**
 Frame
*/

        PE_FrameStatusBar(12),
/**
 Frame for tab widgets.
*/

        PE_FrameTabWidget(13),
/**
 Frame around a MDI window or a docking window.
*/

        PE_FrameWindow(14),
/**
 Panel frame for a button bevel.
*/

        PE_FrameButtonBevel(15),
/**
 Panel frame for a tool button.
*/

        PE_FrameButtonTool(16),
/**
 The frame that is drawn for a tab bar, ususally drawn for a tab bar that isn't part of a tab widget.
*/

        PE_FrameTabBarBase(17),
/**
 Button used to initiate an action, for example, a {@link com.trolltech.qt.gui.QPushButton QPushButton}.
*/

        PE_PanelButtonCommand(18),
/**
 Generic panel with a button bevel.
*/

        PE_PanelButtonBevel(19),
/**
 Panel for a Tool button, used with {@link com.trolltech.qt.gui.QToolButton QToolButton}.
*/

        PE_PanelButtonTool(20),
/**
 The panel for a menu.
*/

/**
 Panel for menu bars.
*/

        PE_PanelMenuBar(21),
/**
 The panel for a toolbar.
*/

        PE_PanelToolBar(22),
/**
 Panel for a {@link com.trolltech.qt.gui.QLineEdit QLineEdit}.
*/

        PE_PanelLineEdit(23),
/**
 Generic Down arrow.
*/

        PE_IndicatorArrowDown(24),
/**
 Generic Left arrow.
*/

        PE_IndicatorArrowLeft(25),
/**
 Generic Right arrow.
*/

        PE_IndicatorArrowRight(26),
/**
 Generic Up arrow.
*/

        PE_IndicatorArrowUp(27),
/**
 Lines used to represent the branch of a tree in a tree view.
*/

        PE_IndicatorBranch(28),
/**
 Indicator for a drop down button, for example, a tool button that displays a menu.
*/

        PE_IndicatorButtonDropDown(29),
        PE_IndicatorViewItemCheck(30),
/**
 On/off indicator, for example, a {@link com.trolltech.qt.gui.QCheckBox QCheckBox}.
*/

        PE_IndicatorCheckBox(31),
/**
 Resize handle for dock windows.
*/

        PE_IndicatorDockWidgetResizeHandle(32),
/**
 Arrow used to indicate sorting on a list or table header.
*/

        PE_IndicatorHeaderArrow(33),
/**
 Check mark used in a menu.
*/

        PE_IndicatorMenuCheckMark(34),
/**
 Section of a progress bar indicator; see also {@link com.trolltech.qt.gui.QProgressBar QProgressBar}.
*/

        PE_IndicatorProgressChunk(35),
/**
 Exclusive on/off indicator, for example, a {@link com.trolltech.qt.gui.QRadioButton QRadioButton}.
*/

        PE_IndicatorRadioButton(36),
/**
 Down symbol for a spin widget.
*/

        PE_IndicatorSpinDown(37),
/**
 Decrease symbol for a spin widget.
*/

        PE_IndicatorSpinMinus(38),
/**
 Increase symbol for a spin widget.
*/

        PE_IndicatorSpinPlus(39),
/**
 Up symbol for a spin widget, for example a {@link com.trolltech.qt.gui.QSpinBox QSpinBox}.
*/

        PE_IndicatorSpinUp(40),
/**
 The handle of a toolbar.
*/

        PE_IndicatorToolBarHandle(41),
/**
 The separator in a toolbar.
*/

        PE_IndicatorToolBarSeparator(42),
/**
 The panel for a tip label.
*/

        PE_PanelTipLabel(43),
/**
 An indicator that a tab is partially scrolled out of the visible tab bar when there are many tabs.
*/

        PE_IndicatorTabTear(44),
/**
 Panel at the bottom-right (or bottom-left) corner of a scroll area.
*/

        PE_PanelScrollAreaCorner(45),
/**
 A plain {@link com.trolltech.qt.gui.QWidget QWidget}.
*/

        PE_Widget(46),
/**
 An arrow in a {@link com.trolltech.qt.gui.QColumnView QColumnView}.
*/

        PE_IndicatorColumnViewArrow(47),
/**
 An indicator that is drawn to show where an item in an item view is about to be dropped during a drag-and-drop operation in an item view.
*/

        PE_IndicatorItemViewItemDrop(48),
/**
 The background for an item in an item view.
*/

        PE_PanelItemViewItem(49),
/**
 The background of a row in an item view.
*/

        PE_PanelItemViewRow(50),
/**
 The panel for a status bar.
*/

        PE_PanelStatusBar(51),
/**
 The close button on a tab bar.
*/

        PE_IndicatorTabClose(52),
        PE_PanelMenu(53),
/**
 Base value for custom primitive elements. All values above this are reserved for custom use. Custom values must be greater than this value.
*/

        PE_CustomBase(251658240),
        CustomEnum(0);

        PrimitiveElement(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyle$PrimitiveElement constant with the specified <tt>int</tt>.</brief>
*/

        public static PrimitiveElement resolve(int value) {
            return (PrimitiveElement) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return PE_Q3CheckListController;
            case 1: return PE_Q3CheckListExclusiveIndicator;
            case 2: return PE_Q3CheckListIndicator;
            case 3: return PE_Q3DockWindowSeparator;
            case 4: return PE_Q3Separator;
            case 5: return PE_Frame;
            case 6: return PE_FrameDefaultButton;
            case 7: return PE_FrameDockWidget;
            case 8: return PE_FrameFocusRect;
            case 9: return PE_FrameGroupBox;
            case 10: return PE_FrameLineEdit;
            case 11: return PE_FrameMenu;
            case 12: return PE_FrameStatusBar;
            case 13: return PE_FrameTabWidget;
            case 14: return PE_FrameWindow;
            case 15: return PE_FrameButtonBevel;
            case 16: return PE_FrameButtonTool;
            case 17: return PE_FrameTabBarBase;
            case 18: return PE_PanelButtonCommand;
            case 19: return PE_PanelButtonBevel;
            case 20: return PE_PanelButtonTool;
            case 21: return PE_PanelMenuBar;
            case 22: return PE_PanelToolBar;
            case 23: return PE_PanelLineEdit;
            case 24: return PE_IndicatorArrowDown;
            case 25: return PE_IndicatorArrowLeft;
            case 26: return PE_IndicatorArrowRight;
            case 27: return PE_IndicatorArrowUp;
            case 28: return PE_IndicatorBranch;
            case 29: return PE_IndicatorButtonDropDown;
            case 30: return PE_IndicatorViewItemCheck;
            case 31: return PE_IndicatorCheckBox;
            case 32: return PE_IndicatorDockWidgetResizeHandle;
            case 33: return PE_IndicatorHeaderArrow;
            case 34: return PE_IndicatorMenuCheckMark;
            case 35: return PE_IndicatorProgressChunk;
            case 36: return PE_IndicatorRadioButton;
            case 37: return PE_IndicatorSpinDown;
            case 38: return PE_IndicatorSpinMinus;
            case 39: return PE_IndicatorSpinPlus;
            case 40: return PE_IndicatorSpinUp;
            case 41: return PE_IndicatorToolBarHandle;
            case 42: return PE_IndicatorToolBarSeparator;
            case 43: return PE_PanelTipLabel;
            case 44: return PE_IndicatorTabTear;
            case 45: return PE_PanelScrollAreaCorner;
            case 46: return PE_Widget;
            case 47: return PE_IndicatorColumnViewArrow;
            case 48: return PE_IndicatorItemViewItemDrop;
            case 49: return PE_PanelItemViewItem;
            case 50: return PE_PanelItemViewRow;
            case 51: return PE_PanelStatusBar;
            case 52: return PE_IndicatorTabClose;
            case 53: return PE_PanelMenu;
            case 251658240: return PE_CustomBase;
            }
            if (enumCache == null)
                enumCache = new java.util.HashMap<Integer, PrimitiveElement>();
            PrimitiveElement e = enumCache.get(value);
            if (e == null) {
                e = (PrimitiveElement) com.trolltech.qt.GeneratorUtilities.createExtendedEnum(value, CustomEnum.ordinal(), PrimitiveElement.class, CustomEnum.name());
                enumCache.put(value, e);
            }
            return e;
        }
        private final int value;

        private static java.util.HashMap<Integer, PrimitiveElement> enumCache;    }
    
/**
This enum represents a control element. A control element is a part of a widget that performs some action or displays information to the user. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawControl(com.trolltech.qt.gui.QStyle.ControlElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawControl()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum ControlElement implements com.trolltech.qt.QtEnumerator {
/**
 A {@link com.trolltech.qt.gui.QPushButton QPushButton}, draws {@link com.trolltech.qt.gui.QStyle.ControlElement CE_PushButtonBevel }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_PushButtonLabel } and {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameFocusRect }.
*/

        CE_PushButton(0),
/**
 The bevel and default indicator of a {@link com.trolltech.qt.gui.QPushButton QPushButton}.
*/

        CE_PushButtonBevel(1),
/**
 The label (an icon with text or pixmap) of a {@link com.trolltech.qt.gui.QPushButton QPushButton}.
*/

        CE_PushButtonLabel(2),
/**
 A {@link com.trolltech.qt.gui.QCheckBox QCheckBox}, draws a {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorCheckBox }, a {@link com.trolltech.qt.gui.QStyle.ControlElement CE_CheckBoxLabel } and a {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameFocusRect }.
*/

        CE_CheckBox(3),
/**
 The label (text or pixmap) of a {@link com.trolltech.qt.gui.QCheckBox QCheckBox}.
*/

        CE_CheckBoxLabel(4),
/**
 A {@link com.trolltech.qt.gui.QRadioButton QRadioButton}, draws a {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorRadioButton }, a {@link com.trolltech.qt.gui.QStyle.ControlElement CE_RadioButtonLabel } and a {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameFocusRect }.
*/

        CE_RadioButton(5),
/**
 The label (text or pixmap) of a {@link com.trolltech.qt.gui.QRadioButton QRadioButton}.
*/

        CE_RadioButtonLabel(6),
/**
 The tab and label within a {@link com.trolltech.qt.gui.QTabBar QTabBar}.
*/

        CE_TabBarTab(7),
/**
 The tab shape within a tab bar.
*/

        CE_TabBarTabShape(8),
/**
 The label within a tab.
*/

        CE_TabBarTabLabel(9),
/**
 A {@link com.trolltech.qt.gui.QProgressBar QProgressBar}, draws {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ProgressBarGroove }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ProgressBarContents } and {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ProgressBarLabel }.
*/

        CE_ProgressBar(10),
/**
 The groove where the progress indicator is drawn in a {@link com.trolltech.qt.gui.QProgressBar QProgressBar}.
*/

        CE_ProgressBarGroove(11),
/**
 The progress indicator of a {@link com.trolltech.qt.gui.QProgressBar QProgressBar}.
*/

        CE_ProgressBarContents(12),
/**
 The text label of a {@link com.trolltech.qt.gui.QProgressBar QProgressBar}.
*/

        CE_ProgressBarLabel(13),
/**
 A menu item in a {@link com.trolltech.qt.gui.QMenu QMenu}.
*/

        CE_MenuItem(14),
/**
 Scrolling areas in a {@link com.trolltech.qt.gui.QMenu QMenu} when the style supports scrolling.
*/

        CE_MenuScroller(15),
/**
 The vertical extra space on the top/bottom of a menu.
*/

        CE_MenuVMargin(16),
/**
 The horizontal extra space on the left/right of a menu.
*/

        CE_MenuHMargin(17),
/**
 A menu item representing the tear off section of a {@link com.trolltech.qt.gui.QMenu QMenu}.
*/

        CE_MenuTearoff(18),
/**
 The area in a menu without menu items.
*/

        CE_MenuEmptyArea(19),
/**
 A menu item in a {@link com.trolltech.qt.gui.QMenuBar QMenuBar}.
*/

        CE_MenuBarItem(20),
/**
 The empty area of a {@link com.trolltech.qt.gui.QMenuBar QMenuBar}.
*/

        CE_MenuBarEmptyArea(21),
/**
 A tool button's label.
*/

        CE_ToolButtonLabel(22),
/**
 A header.
*/

        CE_Header(23),
/**
 A header section.
*/

        CE_HeaderSection(24),
/**
 The header's label.
*/

        CE_HeaderLabel(25),
/**
 The empty area of a {@link com.trolltech.qt.gui.QDockWidget QDockWidget}.
*/

        CE_Q3DockWindowEmptyArea(26),
/**
 The toolbox's tab and label within a {@link com.trolltech.qt.gui.QToolBox QToolBox}.
*/

        CE_ToolBoxTab(27),
/**
 Window resize handle; see also {@link com.trolltech.qt.gui.QSizeGrip QSizeGrip}.
*/

        CE_SizeGrip(28),
/**
 Splitter handle; see also {@link com.trolltech.qt.gui.QSplitter QSplitter}.
*/

        CE_Splitter(29),
/**
 Rubber band used in for example an icon view.
*/

        CE_RubberBand(30),
/**
 Dock window title.
*/

        CE_DockWidgetTitle(31),
/**
 Scroll bar line increase indicator. (i.e., scroll down); see also {@link com.trolltech.qt.gui.QScrollBar QScrollBar}.
*/

        CE_ScrollBarAddLine(32),
/**
 Scroll bar line decrease indicator (i.e., scroll up).
*/

        CE_ScrollBarSubLine(33),
/**
 Scolllbar page increase indicator (i.e., page down).
*/

        CE_ScrollBarAddPage(34),
/**
 Scroll bar page decrease indicator (i.e., page up).
*/

        CE_ScrollBarSubPage(35),
/**
 Scroll bar slider.
*/

        CE_ScrollBarSlider(36),
/**
 Scroll bar first line indicator (i.e., home).
*/

        CE_ScrollBarFirst(37),
/**
 Scroll bar last line indicator (i.e., end).
*/

        CE_ScrollBarLast(38),
/**
 Focus frame that is style controlled.
*/

        CE_FocusFrame(39),
/**
 The label of a non-editable {@link com.trolltech.qt.gui.QComboBox QComboBox}.
*/

        CE_ComboBoxLabel(40),
/**
 A toolbar like {@link com.trolltech.qt.gui.QToolBar QToolBar}.
*/

        CE_ToolBar(41),
/**
 The toolbox's tab shape.
*/

        CE_ToolBoxTabShape(42),
/**
 The toolbox's tab label.
*/

        CE_ToolBoxTabLabel(43),
/**
 The area of a header view where there are no header sections.
*/

        CE_HeaderEmptyArea(44),
        CE_ColumnViewGrip(45),
/**
 An item inside an item view.
*/

        CE_ItemViewItem(46),
/**
 The frame with the shape specified in the {@link com.trolltech.qt.gui.QStyleOptionFrameV3 QStyleOptionFrameV3}; see {@link com.trolltech.qt.gui.QFrame QFrame}.
*/

        CE_ShapedFrame(47),
/**
 Base value for custom control elements; custom values must be greater than this value.
*/

        CE_CustomBase(-268435456),
        CustomEnum(0);

        ControlElement(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyle$ControlElement constant with the specified <tt>int</tt>.</brief>
*/

        public static ControlElement resolve(int value) {
            return (ControlElement) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CE_PushButton;
            case 1: return CE_PushButtonBevel;
            case 2: return CE_PushButtonLabel;
            case 3: return CE_CheckBox;
            case 4: return CE_CheckBoxLabel;
            case 5: return CE_RadioButton;
            case 6: return CE_RadioButtonLabel;
            case 7: return CE_TabBarTab;
            case 8: return CE_TabBarTabShape;
            case 9: return CE_TabBarTabLabel;
            case 10: return CE_ProgressBar;
            case 11: return CE_ProgressBarGroove;
            case 12: return CE_ProgressBarContents;
            case 13: return CE_ProgressBarLabel;
            case 14: return CE_MenuItem;
            case 15: return CE_MenuScroller;
            case 16: return CE_MenuVMargin;
            case 17: return CE_MenuHMargin;
            case 18: return CE_MenuTearoff;
            case 19: return CE_MenuEmptyArea;
            case 20: return CE_MenuBarItem;
            case 21: return CE_MenuBarEmptyArea;
            case 22: return CE_ToolButtonLabel;
            case 23: return CE_Header;
            case 24: return CE_HeaderSection;
            case 25: return CE_HeaderLabel;
            case 26: return CE_Q3DockWindowEmptyArea;
            case 27: return CE_ToolBoxTab;
            case 28: return CE_SizeGrip;
            case 29: return CE_Splitter;
            case 30: return CE_RubberBand;
            case 31: return CE_DockWidgetTitle;
            case 32: return CE_ScrollBarAddLine;
            case 33: return CE_ScrollBarSubLine;
            case 34: return CE_ScrollBarAddPage;
            case 35: return CE_ScrollBarSubPage;
            case 36: return CE_ScrollBarSlider;
            case 37: return CE_ScrollBarFirst;
            case 38: return CE_ScrollBarLast;
            case 39: return CE_FocusFrame;
            case 40: return CE_ComboBoxLabel;
            case 41: return CE_ToolBar;
            case 42: return CE_ToolBoxTabShape;
            case 43: return CE_ToolBoxTabLabel;
            case 44: return CE_HeaderEmptyArea;
            case 45: return CE_ColumnViewGrip;
            case 46: return CE_ItemViewItem;
            case 47: return CE_ShapedFrame;
            case -268435456: return CE_CustomBase;
            }
            if (enumCache == null)
                enumCache = new java.util.HashMap<Integer, ControlElement>();
            ControlElement e = enumCache.get(value);
            if (e == null) {
                e = (ControlElement) com.trolltech.qt.GeneratorUtilities.createExtendedEnum(value, CustomEnum.ordinal(), ControlElement.class, CustomEnum.name());
                enumCache.put(value, e);
            }
            return e;
        }
        private final int value;

        private static java.util.HashMap<Integer, ControlElement> enumCache;    }
    
/**
This enum describes the available contents types. These are used to calculate sizes for the contents of various widgets. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#sizeFromContents(com.trolltech.qt.gui.QStyle.ContentsType, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.core.QSize) sizeFromContents()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum ContentsType implements com.trolltech.qt.QtEnumerator {
/**
 A push button, like {@link com.trolltech.qt.gui.QPushButton QPushButton}.
*/

        CT_PushButton(0),
/**
 A check box, like {@link com.trolltech.qt.gui.QCheckBox QCheckBox}.
*/

        CT_CheckBox(1),
/**
 A radio button, like {@link com.trolltech.qt.gui.QRadioButton QRadioButton}.
*/

        CT_RadioButton(2),
/**
 A tool button, like {@link com.trolltech.qt.gui.QToolButton QToolButton}.
*/

        CT_ToolButton(3),
/**
 A combo box, like {@link com.trolltech.qt.gui.QComboBox QComboBox}.
*/

        CT_ComboBox(4),
/**
 A splitter, like {@link com.trolltech.qt.gui.QSplitter QSplitter}.
*/

        CT_Splitter(5),
/**
 A Q3DockWindow.
*/

        CT_Q3DockWindow(6),
/**
 A progress bar, like {@link com.trolltech.qt.gui.QProgressBar QProgressBar}.
*/

        CT_ProgressBar(7),
/**
 A menu item, like QMenuItem.
*/

/**
 A menu, like {@link com.trolltech.qt.gui.QMenu QMenu}.
*/

        CT_MenuItem(8),
/**
 A menu bar item, like the buttons in a {@link com.trolltech.qt.gui.QMenuBar QMenuBar}.
*/

/**
 A menu bar, like {@link com.trolltech.qt.gui.QMenuBar QMenuBar}.
*/

        CT_MenuBarItem(9),
        CT_MenuBar(10),
        CT_Menu(11),
/**
 A tab on a tab bar, like {@link com.trolltech.qt.gui.QTabBar QTabBar}.
*/

        CT_TabBarTab(12),
/**
 A slider, like {@link com.trolltech.qt.gui.QSlider QSlider}.
*/

        CT_Slider(13),
/**
 A scroll bar, like {@link com.trolltech.qt.gui.QScrollBar QScrollBar}.
*/

        CT_ScrollBar(14),
/**
 A Qt 3 header section, like Q3Header.
*/

        CT_Q3Header(15),
/**
 A line edit, like {@link com.trolltech.qt.gui.QLineEdit QLineEdit}.
*/

        CT_LineEdit(16),
/**
 A spin box, like {@link com.trolltech.qt.gui.QSpinBox QSpinBox}.
*/

        CT_SpinBox(17),
/**
 A size grip, like {@link com.trolltech.qt.gui.QSizeGrip QSizeGrip}.
*/

        CT_SizeGrip(18),
/**
 A tab widget, like {@link com.trolltech.qt.gui.QTabWidget QTabWidget}.
*/

        CT_TabWidget(19),
        CT_DialogButtons(20),
/**
 A header section, like {@link <a href="../porting4.html">QHeader</a>}.
*/

        CT_HeaderSection(21),
/**
 A group box, like {@link com.trolltech.qt.gui.QGroupBox QGroupBox}.
*/

        CT_GroupBox(22),
/**
 The minimize, normal, and close button in the menu bar for a maximized MDI subwindow.
*/

        CT_MdiControls(23),
/**
 An item inside an item view.
*/

        CT_ItemViewItem(24),
/**
 Base value for custom contents types. Custom values must be greater than this value.
*/

        CT_CustomBase(-268435456),
        CustomEnum(0);

        ContentsType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyle$ContentsType constant with the specified <tt>int</tt>.</brief>
*/

        public static ContentsType resolve(int value) {
            return (ContentsType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CT_PushButton;
            case 1: return CT_CheckBox;
            case 2: return CT_RadioButton;
            case 3: return CT_ToolButton;
            case 4: return CT_ComboBox;
            case 5: return CT_Splitter;
            case 6: return CT_Q3DockWindow;
            case 7: return CT_ProgressBar;
            case 8: return CT_MenuItem;
            case 9: return CT_MenuBarItem;
            case 10: return CT_MenuBar;
            case 11: return CT_Menu;
            case 12: return CT_TabBarTab;
            case 13: return CT_Slider;
            case 14: return CT_ScrollBar;
            case 15: return CT_Q3Header;
            case 16: return CT_LineEdit;
            case 17: return CT_SpinBox;
            case 18: return CT_SizeGrip;
            case 19: return CT_TabWidget;
            case 20: return CT_DialogButtons;
            case 21: return CT_HeaderSection;
            case 22: return CT_GroupBox;
            case 23: return CT_MdiControls;
            case 24: return CT_ItemViewItem;
            case -268435456: return CT_CustomBase;
            }
            if (enumCache == null)
                enumCache = new java.util.HashMap<Integer, ContentsType>();
            ContentsType e = enumCache.get(value);
            if (e == null) {
                e = (ContentsType) com.trolltech.qt.GeneratorUtilities.createExtendedEnum(value, CustomEnum.ordinal(), ContentsType.class, CustomEnum.name());
                enumCache.put(value, e);
            }
            return e;
        }
        private final int value;

        private static java.util.HashMap<Integer, ContentsType> enumCache;    }
    
/**
This enum describes flags that are used when drawing primitive elements. <p>Note that not all primitives use all of these flags, and that the flags may mean different things to different items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawPrimitive()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum StateFlag implements com.trolltech.qt.QtEnumerator {
/**
 Indicates that the widget does not have a state.
*/

        State_None(0),
/**
 Used to indicate if the widget is enabled.
*/

        State_Enabled(1),
/**
 Used to indicate if a button is raised.
*/

        State_Raised(2),
/**
 Used to indicate if the widget is sunken or pressed.
*/

        State_Sunken(4),
/**
 Used to indicate if the widget is not checked.
*/

        State_Off(8),
/**
 Used to indicate a tri-state checkbox.
*/

        State_NoChange(16),
/**
 Used to indicate if the widget is checked.
*/

        State_On(32),
/**
 Used to indicate if a down arrow should be visible on the widget.
*/

        State_DownArrow(64),
/**
 Used to indicate if the widget is laid out horizontally, for example. a tool bar.
*/

        State_Horizontal(128),
/**
 Used to indicate if the widget has focus.
*/

        State_HasFocus(256),
        State_Top(512),
        State_Bottom(1024),
        State_FocusAtBorder(2048),
/**
 Used to indicate if auto-raise appearance should be usd on a tool button.
*/

        State_AutoRaise(4096),
/**
 Used to indicate if the widget is under the mouse.
*/

        State_MouseOver(8192),
/**
 Used to indicate if an up arrow should be visible on the widget.
*/

        State_UpArrow(16384),
/**
 Used to indicate if a widget is selected.
*/

        State_Selected(32768),
/**
 Indicates that the widget is active.
*/

        State_Active(65536),
        State_Window(131072),
/**
 Used by item views to indicate if the tree branch is open.
*/

        State_Open(262144),
/**
 Used to indicate if an item view branch has children.
*/

        State_Children(524288),
/**
 Used by item views to indicate if a horizontal branch should be drawn.
*/

        State_Item(1048576),
/**
 Used by item views to indicate if a vertical line needs to be drawn (for siblings).
*/

        State_Sibling(2097152),
/**
 Used to indicate if an editor is opened on the widget.
*/

        State_Editing(4194304),
/**
 Used to indicate if the focus was changed with the keyboard, e.g., tab, backtab or shortcut.
*/

        State_KeyboardFocusChange(8388608),
/**
 Used to indicate if a widget is read-only.
*/

        State_ReadOnly(33554432),
/**
 Used to indicate a small style Mac widget or button.
*/

        State_Small(67108864),
/**
 Used to indicate a mini style Mac widget or button.
*/

        State_Mini(134217728);

        StateFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QStyle$State with the specified <tt>com.trolltech.qt.gui.QStyle$StateFlag[]</tt> QStyle$StateFlag values set.</brief>
*/

        public static State createQFlags(StateFlag ... values) {
            return new State(values);
        }
/**
<brief>Returns the QStyle$StateFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static StateFlag resolve(int value) {
            return (StateFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return State_None;
            case 1: return State_Enabled;
            case 2: return State_Raised;
            case 4: return State_Sunken;
            case 8: return State_Off;
            case 16: return State_NoChange;
            case 32: return State_On;
            case 64: return State_DownArrow;
            case 128: return State_Horizontal;
            case 256: return State_HasFocus;
            case 512: return State_Top;
            case 1024: return State_Bottom;
            case 2048: return State_FocusAtBorder;
            case 4096: return State_AutoRaise;
            case 8192: return State_MouseOver;
            case 16384: return State_UpArrow;
            case 32768: return State_Selected;
            case 65536: return State_Active;
            case 131072: return State_Window;
            case 262144: return State_Open;
            case 524288: return State_Children;
            case 1048576: return State_Item;
            case 2097152: return State_Sibling;
            case 4194304: return State_Editing;
            case 8388608: return State_KeyboardFocusChange;
            case 33554432: return State_ReadOnly;
            case 67108864: return State_Small;
            case 134217728: return State_Mini;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class State extends com.trolltech.qt.QFlags<StateFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QStyle-State with the specified <tt>com.trolltech.qt.gui.QStyle.StateFlag[]</tt>. flags set.</brief>
*/

        public State(StateFlag ... args) { super(args); }
        public State(int value) { setValue(value); }
    }

    
/**
This enum describes the available complex controls. Complex controls have different behavior depending upon where the user clicks on them or which keys are pressed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle.SubControl SubControl }, and {@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum ComplexControl implements com.trolltech.qt.QtEnumerator {
/**
 A spinbox, like {@link com.trolltech.qt.gui.QSpinBox QSpinBox}.
*/

        CC_SpinBox(0),
/**
 A combobox, like {@link com.trolltech.qt.gui.QComboBox QComboBox}.
*/

        CC_ComboBox(1),
/**
 A scroll bar, like {@link com.trolltech.qt.gui.QScrollBar QScrollBar}.
*/

        CC_ScrollBar(2),
/**
 A slider, like {@link com.trolltech.qt.gui.QSlider QSlider}.
*/

        CC_Slider(3),
/**
 A tool button, like {@link com.trolltech.qt.gui.QToolButton QToolButton}.
*/

        CC_ToolButton(4),
/**
 A Title bar, like those used in {@link com.trolltech.qt.gui.QWorkspace QWorkspace}.
*/

        CC_TitleBar(5),
/**
 Used for drawing the Q3ListView class.
*/

        CC_Q3ListView(6),
/**
 A dial, like {@link com.trolltech.qt.gui.QDial QDial}.
*/

        CC_Dial(7),
/**
 A group box, like {@link com.trolltech.qt.gui.QGroupBox QGroupBox}.
*/

        CC_GroupBox(8),
/**
 The minimize, close, and normal button in the menu bar for a maximized MDI subwindow.
*/

        CC_MdiControls(9),
/**
 Base value for custom complex controls. Custom values must be greater than this value.
*/

        CC_CustomBase(-268435456),
        CustomEnum(0);

        ComplexControl(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyle$ComplexControl constant with the specified <tt>int</tt>.</brief>
*/

        public static ComplexControl resolve(int value) {
            return (ComplexControl) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CC_SpinBox;
            case 1: return CC_ComboBox;
            case 2: return CC_ScrollBar;
            case 3: return CC_Slider;
            case 4: return CC_ToolButton;
            case 5: return CC_TitleBar;
            case 6: return CC_Q3ListView;
            case 7: return CC_Dial;
            case 8: return CC_GroupBox;
            case 9: return CC_MdiControls;
            case -268435456: return CC_CustomBase;
            }
            if (enumCache == null)
                enumCache = new java.util.HashMap<Integer, ComplexControl>();
            ComplexControl e = enumCache.get(value);
            if (e == null) {
                e = (ComplexControl) com.trolltech.qt.GeneratorUtilities.createExtendedEnum(value, CustomEnum.ordinal(), ComplexControl.class, CustomEnum.name());
                enumCache.put(value, e);
            }
            return e;
        }
        private final int value;

        private static java.util.HashMap<Integer, ComplexControl> enumCache;    }
    
/**
This enum represents a sub-area of a widget. Style implementations use these areas to draw the different parts of a widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#subElementRect(com.trolltech.qt.gui.QStyle.SubElement, com.trolltech.qt.gui.QStyleOption) subElementRect()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum SubElement implements com.trolltech.qt.QtEnumerator {
/**
 Area containing the label (icon with text or pixmap).
*/

        SE_PushButtonContents(0),
/**
 Area for the focus rect (usually larger than the contents rect).
*/

        SE_PushButtonFocusRect(1),
/**
 Area for the state indicator (e.g., check mark).
*/

        SE_CheckBoxIndicator(2),
/**
 Area for the label (text or pixmap).
*/

        SE_CheckBoxContents(3),
/**
 Area for the focus indicator.
*/

        SE_CheckBoxFocusRect(4),
/**
 Clickable area, defaults to {@link com.trolltech.qt.gui.QStyle.SubElement SE_CheckBoxFocusRect }.
*/

        SE_CheckBoxClickRect(5),
/**
 Area for the state indicator.
*/

        SE_RadioButtonIndicator(6),
/**
 Area for the label.
*/

        SE_RadioButtonContents(7),
/**
 Area for the focus indicator.
*/

        SE_RadioButtonFocusRect(8),
/**
 Clickable area, defaults to {@link com.trolltech.qt.gui.QStyle.SubElement SE_RadioButtonFocusRect }.
*/

        SE_RadioButtonClickRect(9),
/**
 Area for the focus indicator.
*/

        SE_ComboBoxFocusRect(10),
/**
 Area for the focus indicator.
*/

        SE_SliderFocusRect(11),
/**
 Area for the tear-off handle.
*/

        SE_Q3DockWindowHandleRect(12),
/**
 Area for the groove.
*/

        SE_ProgressBarGroove(13),
/**
 Area for the progress indicator.
*/

        SE_ProgressBarContents(14),
/**
 Area for the text label.
*/

        SE_ProgressBarLabel(15),
        SE_DialogButtonAccept(16),
        SE_DialogButtonReject(17),
        SE_DialogButtonApply(18),
        SE_DialogButtonHelp(19),
        SE_DialogButtonAll(20),
        SE_DialogButtonAbort(21),
        SE_DialogButtonIgnore(22),
        SE_DialogButtonRetry(23),
        SE_DialogButtonCustom(24),
/**
 Area for a toolbox tab's icon and label.
*/

        SE_ToolBoxTabContents(25),
/**
 Area for the label in a header.
*/

        SE_HeaderLabel(26),
/**
 Area for the sort indicator for a header.
*/

        SE_HeaderArrow(27),
/**
 Area for the tab bar widget in a tab widget.
*/

        SE_TabWidgetTabBar(28),
/**
 Area for the pane of a tab widget.
*/

        SE_TabWidgetTabPane(29),
/**
 Area for the contents of the tab widget.
*/

        SE_TabWidgetTabContents(30),
/**
 Area for the left corner widget in a tab widget.
*/

        SE_TabWidgetLeftCorner(31),
/**
 Area for the right corner widget in a tab widget.
*/

        SE_TabWidgetRightCorner(32),
        SE_ViewItemCheckIndicator(33),
/**
 Area for the tear indicator on a tab bar with scroll arrows.
*/

        SE_TabBarTearIndicator(34),
/**
 Area for the actual disclosure item in a tree branch.
*/

        SE_TreeViewDisclosureItem(35),
/**
 Area for a line edit's contents.
*/

        SE_LineEditContents(36),
/**
 Area for a frame's contents.
*/

        SE_FrameContents(37),
/**
 The close button of a dock widget.
*/

        SE_DockWidgetCloseButton(38),
/**
 The float button of a dock widget.
*/

        SE_DockWidgetFloatButton(39),
/**
 The text bounds of the dock widgets title.
*/

        SE_DockWidgetTitleBarText(40),
/**
 The icon of a dock widget.
*/

        SE_DockWidgetIcon(41),
/**
 Area that counts for the parent layout.
*/

        SE_CheckBoxLayoutItem(42),
/**
 Area that counts for the parent layout.
*/

        SE_ComboBoxLayoutItem(43),
/**
 Area that counts for the parent layout.
*/

        SE_DateTimeEditLayoutItem(44),
/**
 Area that counts for the parent layout.
*/

        SE_DialogButtonBoxLayoutItem(45),
/**
 Area that counts for the parent layout.
*/

        SE_LabelLayoutItem(46),
/**
 Area that counts for the parent layout.
*/

        SE_ProgressBarLayoutItem(47),
/**
 Area that counts for the parent layout.
*/

        SE_PushButtonLayoutItem(48),
/**
 Area that counts for the parent layout.
*/

        SE_RadioButtonLayoutItem(49),
/**
 Area that counts for the parent layout.
*/

        SE_SliderLayoutItem(50),
/**
 Area that counts for the parent layout.
*/

        SE_SpinBoxLayoutItem(51),
/**
 Area that counts for the parent layout.
*/

        SE_ToolButtonLayoutItem(52),
/**
 Area that counts for the parent layout.
*/

        SE_FrameLayoutItem(53),
/**
 Area that counts for the parent layout.
*/

        SE_GroupBoxLayoutItem(54),
/**
 Area that counts for the parent layout.
*/

        SE_TabWidgetLayoutItem(55),
/**
 Area for a view item's decoration (icon).
*/

        SE_ItemViewItemDecoration(56),
/**
 Area for a view item's text.
*/

        SE_ItemViewItemText(57),
/**
 Area for a view item's focus rect.
*/

        SE_ItemViewItemFocusRect(58),
/**
 Area for a widget on the left side of a tab in a tab bar.
*/

        SE_TabBarTabLeftButton(59),
/**
 Area for a widget on the right side of a tab in a tab bar.
*/

        SE_TabBarTabRightButton(60),
/**
 Area for the text on a tab in a tab bar.
*/

        SE_TabBarTabText(61),
/**
 Area for a frame's contents using the shape in {@link com.trolltech.qt.gui.QStyleOptionFrameV3 QStyleOptionFrameV3}; see {@link com.trolltech.qt.gui.QFrame QFrame}
*/

        SE_ShapedFrameContents(62),
/**
 Base value for custom sub-elements. Custom values must be greater than this value.
*/

        SE_CustomBase(-268435456),
        CustomEnum(0);

        SubElement(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyle$SubElement constant with the specified <tt>int</tt>.</brief>
*/

        public static SubElement resolve(int value) {
            return (SubElement) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SE_PushButtonContents;
            case 1: return SE_PushButtonFocusRect;
            case 2: return SE_CheckBoxIndicator;
            case 3: return SE_CheckBoxContents;
            case 4: return SE_CheckBoxFocusRect;
            case 5: return SE_CheckBoxClickRect;
            case 6: return SE_RadioButtonIndicator;
            case 7: return SE_RadioButtonContents;
            case 8: return SE_RadioButtonFocusRect;
            case 9: return SE_RadioButtonClickRect;
            case 10: return SE_ComboBoxFocusRect;
            case 11: return SE_SliderFocusRect;
            case 12: return SE_Q3DockWindowHandleRect;
            case 13: return SE_ProgressBarGroove;
            case 14: return SE_ProgressBarContents;
            case 15: return SE_ProgressBarLabel;
            case 16: return SE_DialogButtonAccept;
            case 17: return SE_DialogButtonReject;
            case 18: return SE_DialogButtonApply;
            case 19: return SE_DialogButtonHelp;
            case 20: return SE_DialogButtonAll;
            case 21: return SE_DialogButtonAbort;
            case 22: return SE_DialogButtonIgnore;
            case 23: return SE_DialogButtonRetry;
            case 24: return SE_DialogButtonCustom;
            case 25: return SE_ToolBoxTabContents;
            case 26: return SE_HeaderLabel;
            case 27: return SE_HeaderArrow;
            case 28: return SE_TabWidgetTabBar;
            case 29: return SE_TabWidgetTabPane;
            case 30: return SE_TabWidgetTabContents;
            case 31: return SE_TabWidgetLeftCorner;
            case 32: return SE_TabWidgetRightCorner;
            case 33: return SE_ViewItemCheckIndicator;
            case 34: return SE_TabBarTearIndicator;
            case 35: return SE_TreeViewDisclosureItem;
            case 36: return SE_LineEditContents;
            case 37: return SE_FrameContents;
            case 38: return SE_DockWidgetCloseButton;
            case 39: return SE_DockWidgetFloatButton;
            case 40: return SE_DockWidgetTitleBarText;
            case 41: return SE_DockWidgetIcon;
            case 42: return SE_CheckBoxLayoutItem;
            case 43: return SE_ComboBoxLayoutItem;
            case 44: return SE_DateTimeEditLayoutItem;
            case 45: return SE_DialogButtonBoxLayoutItem;
            case 46: return SE_LabelLayoutItem;
            case 47: return SE_ProgressBarLayoutItem;
            case 48: return SE_PushButtonLayoutItem;
            case 49: return SE_RadioButtonLayoutItem;
            case 50: return SE_SliderLayoutItem;
            case 51: return SE_SpinBoxLayoutItem;
            case 52: return SE_ToolButtonLayoutItem;
            case 53: return SE_FrameLayoutItem;
            case 54: return SE_GroupBoxLayoutItem;
            case 55: return SE_TabWidgetLayoutItem;
            case 56: return SE_ItemViewItemDecoration;
            case 57: return SE_ItemViewItemText;
            case 58: return SE_ItemViewItemFocusRect;
            case 59: return SE_TabBarTabLeftButton;
            case 60: return SE_TabBarTabRightButton;
            case 61: return SE_TabBarTabText;
            case 62: return SE_ShapedFrameContents;
            case -268435456: return SE_CustomBase;
            }
            if (enumCache == null)
                enumCache = new java.util.HashMap<Integer, SubElement>();
            SubElement e = enumCache.get(value);
            if (e == null) {
                e = (SubElement) com.trolltech.qt.GeneratorUtilities.createExtendedEnum(value, CustomEnum.ordinal(), SubElement.class, CustomEnum.name());
                enumCache.put(value, e);
            }
            return e;
        }
        private final int value;

        private static java.util.HashMap<Integer, SubElement> enumCache;    }


/**
Constructs a style object.
*/

    public QStyle(){
        super((QPrivateConstructor)null);
        __qt_QStyle();
    }

    native void __qt_QStyle();

    @QtBlockedSlot
    private final int combinedLayoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlTypes controls1, com.trolltech.qt.gui.QSizePolicy.ControlTypes controls2, com.trolltech.qt.core.Qt.Orientation orientation, com.trolltech.qt.QNativePointer option, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_combinedLayoutSpacing_ControlTypes_ControlTypes_Orientation_nativepointer_QWidget(nativeId(), controls1.value(), controls2.value(), orientation.value(), option, widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native int __qt_combinedLayoutSpacing_ControlTypes_ControlTypes_Orientation_nativepointer_QWidget(long __this__nativeId, int controls1, int controls2, int orientation, com.trolltech.qt.QNativePointer option, long widget);

    @QtBlockedSlot
    private final int layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType control1, com.trolltech.qt.gui.QSizePolicy.ControlType control2, com.trolltech.qt.core.Qt.Orientation orientation, com.trolltech.qt.QNativePointer option, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_layoutSpacing_ControlType_ControlType_Orientation_nativepointer_QWidget(nativeId(), control1.value(), control2.value(), orientation.value(), option, widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native int __qt_layoutSpacing_ControlType_ControlType_Orientation_nativepointer_QWidget(long __this__nativeId, int control1, int control2, int orientation, com.trolltech.qt.QNativePointer option, long widget);


/**
This slot is called by {@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) layoutSpacing()} to determine the spacing that should be used between <tt>control1</tt> and <tt>control2</tt> in a layout. <tt>orientation</tt> specifies whether the controls are laid out side by side or stacked vertically. The <tt>option</tt> parameter can be used to pass extra information about the parent widget. The <tt>widget</tt> parameter is optional and can also be used if <tt>option</tt> is 0. <p>If you want to provide custom layout spacings in a QStyle subclass, implement a slot called {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()} in your subclass. Be aware that this slot will only be called if {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing } or {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutVerticalSpacing } returns a negative value. <p>The default implementation returns -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) layoutSpacing()}, and {@link com.trolltech.qt.gui.QStyle#combinedLayoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlTypes, com.trolltech.qt.gui.QSizePolicy.ControlTypes, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) combinedLayoutSpacing()}. <br></DD></DT>
*/

    protected final int layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType control1, com.trolltech.qt.gui.QSizePolicy.ControlType control2, com.trolltech.qt.core.Qt.Orientation orientation, com.trolltech.qt.gui.QStyleOption option) {
        return layoutSpacingImplementation(control1, control2, orientation, option, (com.trolltech.qt.gui.QWidget)null);
    }

/**
This slot is called by {@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) layoutSpacing()} to determine the spacing that should be used between <tt>control1</tt> and <tt>control2</tt> in a layout. <tt>orientation</tt> specifies whether the controls are laid out side by side or stacked vertically. The <tt>option</tt> parameter can be used to pass extra information about the parent widget. The <tt>widget</tt> parameter is optional and can also be used if <tt>option</tt> is 0. <p>If you want to provide custom layout spacings in a QStyle subclass, implement a slot called {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()} in your subclass. Be aware that this slot will only be called if {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing } or {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutVerticalSpacing } returns a negative value. <p>The default implementation returns -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) layoutSpacing()}, and {@link com.trolltech.qt.gui.QStyle#combinedLayoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlTypes, com.trolltech.qt.gui.QSizePolicy.ControlTypes, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) combinedLayoutSpacing()}. <br></DD></DT>
*/

    protected final int layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType control1, com.trolltech.qt.gui.QSizePolicy.ControlType control2, com.trolltech.qt.core.Qt.Orientation orientation) {
        return layoutSpacingImplementation(control1, control2, orientation, (com.trolltech.qt.gui.QStyleOption)null, (com.trolltech.qt.gui.QWidget)null);
    }
/**
This slot is called by {@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) layoutSpacing()} to determine the spacing that should be used between <tt>control1</tt> and <tt>control2</tt> in a layout. <tt>orientation</tt> specifies whether the controls are laid out side by side or stacked vertically. The <tt>option</tt> parameter can be used to pass extra information about the parent widget. The <tt>widget</tt> parameter is optional and can also be used if <tt>option</tt> is 0. <p>If you want to provide custom layout spacings in a QStyle subclass, implement a slot called {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()} in your subclass. Be aware that this slot will only be called if {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing } or {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutVerticalSpacing } returns a negative value. <p>The default implementation returns -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) layoutSpacing()}, and {@link com.trolltech.qt.gui.QStyle#combinedLayoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlTypes, com.trolltech.qt.gui.QSizePolicy.ControlTypes, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) combinedLayoutSpacing()}. <br></DD></DT>
*/

    protected int layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType control1, com.trolltech.qt.gui.QSizePolicy.ControlType control2, com.trolltech.qt.core.Qt.Orientation orientation, com.trolltech.qt.gui.QStyleOption option, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_layoutSpacingImplementation_ControlType_ControlType_Orientation_nativepointer_QWidget(nativeId(), control1.value(), control2.value(), orientation.value(), option, widget == null ? 0 : widget.nativeId());
    }
    native int __qt_layoutSpacingImplementation_ControlType_ControlType_Orientation_nativepointer_QWidget(long __this__nativeId, int control1, int control2, int orientation, com.trolltech.qt.gui.QStyleOption option, long widget);


/**
Returns an icon for the given <tt>standardIcon</tt>. <p>The <tt>standardIcon</tt> is a standard pixmap which can follow some existing GUI style or guideline. The <tt>option</tt> argument can be used to pass extra information required when defining the appropriate icon. The <tt>widget</tt> argument is optional and can also be used to aid the determination of the icon. <p><b>Warning:</b> Because of binary compatibility constraints, this function is not virtual. If you want to provide your own icons in a QStyle subclass, reimplement the {@link com.trolltech.qt.gui.QStyle#standardIconImplementation(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIconImplementation()} slot in your subclass instead. The {@link com.trolltech.qt.gui.QStyle#standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIcon()} function will dynamically detect the slot and call it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#standardIconImplementation(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIconImplementation()}, and standardPixmap(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap standardIcon, com.trolltech.qt.gui.QStyleOption option) {
        return standardIcon(standardIcon, option, (com.trolltech.qt.gui.QWidget)null);
    }

/**
Returns an icon for the given <tt>standardIcon</tt>. <p>The <tt>standardIcon</tt> is a standard pixmap which can follow some existing GUI style or guideline. The <tt>option</tt> argument can be used to pass extra information required when defining the appropriate icon. The <tt>widget</tt> argument is optional and can also be used to aid the determination of the icon. <p><b>Warning:</b> Because of binary compatibility constraints, this function is not virtual. If you want to provide your own icons in a QStyle subclass, reimplement the {@link com.trolltech.qt.gui.QStyle#standardIconImplementation(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIconImplementation()} slot in your subclass instead. The {@link com.trolltech.qt.gui.QStyle#standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIcon()} function will dynamically detect the slot and call it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#standardIconImplementation(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIconImplementation()}, and standardPixmap(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap standardIcon) {
        return standardIcon(standardIcon, (com.trolltech.qt.gui.QStyleOption)null, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Returns an icon for the given <tt>standardIcon</tt>. <p>The <tt>standardIcon</tt> is a standard pixmap which can follow some existing GUI style or guideline. The <tt>option</tt> argument can be used to pass extra information required when defining the appropriate icon. The <tt>widget</tt> argument is optional and can also be used to aid the determination of the icon. <p><b>Warning:</b> Because of binary compatibility constraints, this function is not virtual. If you want to provide your own icons in a QStyle subclass, reimplement the {@link com.trolltech.qt.gui.QStyle#standardIconImplementation(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIconImplementation()} slot in your subclass instead. The {@link com.trolltech.qt.gui.QStyle#standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIcon()} function will dynamically detect the slot and call it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#standardIconImplementation(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIconImplementation()}, and standardPixmap(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap standardIcon, com.trolltech.qt.gui.QStyleOption option, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_standardIcon_StandardPixmap_nativepointer_QWidget(nativeId(), standardIcon.value(), option, widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_standardIcon_StandardPixmap_nativepointer_QWidget(long __this__nativeId, int standardIcon, com.trolltech.qt.gui.QStyleOption option, long widget);


/**
Returns an icon for the given <tt>standardIcon</tt>. <p>Reimplement this slot to provide your own icons in a QStyle subclass; because of binary compatibility constraints, the {@link com.trolltech.qt.gui.QStyle#standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIcon()} function (introduced in Qt 4.1) is not virtual. Instead, {@link com.trolltech.qt.gui.QStyle#standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIcon()} will dynamically detect and call this slot. The default implementation simply calls the standardPixmap() function with the given parameters. <p>The <tt>standardIcon</tt> is a standard pixmap which can follow some existing GUI style or guideline. The <tt>option</tt> argument can be used to pass extra information required when defining the appropriate icon. The <tt>widget</tt> argument is optional and can also be used to aid the determination of the icon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIcon()}. <br></DD></DT>
*/

    protected final com.trolltech.qt.gui.QIcon standardIconImplementation(com.trolltech.qt.gui.QStyle.StandardPixmap standardIcon, com.trolltech.qt.gui.QStyleOption opt) {
        return standardIconImplementation(standardIcon, opt, (com.trolltech.qt.gui.QWidget)null);
    }

/**
Returns an icon for the given <tt>standardIcon</tt>. <p>Reimplement this slot to provide your own icons in a QStyle subclass; because of binary compatibility constraints, the {@link com.trolltech.qt.gui.QStyle#standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIcon()} function (introduced in Qt 4.1) is not virtual. Instead, {@link com.trolltech.qt.gui.QStyle#standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIcon()} will dynamically detect and call this slot. The default implementation simply calls the standardPixmap() function with the given parameters. <p>The <tt>standardIcon</tt> is a standard pixmap which can follow some existing GUI style or guideline. The <tt>option</tt> argument can be used to pass extra information required when defining the appropriate icon. The <tt>widget</tt> argument is optional and can also be used to aid the determination of the icon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIcon()}. <br></DD></DT>
*/

    protected final com.trolltech.qt.gui.QIcon standardIconImplementation(com.trolltech.qt.gui.QStyle.StandardPixmap standardIcon) {
        return standardIconImplementation(standardIcon, (com.trolltech.qt.gui.QStyleOption)null, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Returns an icon for the given <tt>standardIcon</tt>. <p>Reimplement this slot to provide your own icons in a QStyle subclass; because of binary compatibility constraints, the {@link com.trolltech.qt.gui.QStyle#standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIcon()} function (introduced in Qt 4.1) is not virtual. Instead, {@link com.trolltech.qt.gui.QStyle#standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIcon()} will dynamically detect and call this slot. The default implementation simply calls the standardPixmap() function with the given parameters. <p>The <tt>standardIcon</tt> is a standard pixmap which can follow some existing GUI style or guideline. The <tt>option</tt> argument can be used to pass extra information required when defining the appropriate icon. The <tt>widget</tt> argument is optional and can also be used to aid the determination of the icon. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#standardIcon(com.trolltech.qt.gui.QStyle.StandardPixmap, com.trolltech.qt.gui.QStyleOption) standardIcon()}. <br></DD></DT>
*/

    protected com.trolltech.qt.gui.QIcon standardIconImplementation(com.trolltech.qt.gui.QStyle.StandardPixmap standardIcon, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_standardIconImplementation_StandardPixmap_nativepointer_QWidget(nativeId(), standardIcon.value(), opt, widget == null ? 0 : widget.nativeId());
    }
    native com.trolltech.qt.gui.QIcon __qt_standardIconImplementation_StandardPixmap_nativepointer_QWidget(long __this__nativeId, int standardIcon, com.trolltech.qt.gui.QStyleOption opt, long widget);


/**
Draws the given <tt>control</tt> using the provided <tt>painter</tt> with the style options specified by <tt>option</tt>. <p>The <tt>widget</tt> argument is optional and can be used as aid in drawing the control. <p>The <tt>option</tt> parameter is a pointer to a {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex} object that can be cast to the correct subclass using the qstyleoption_cast() function. Note that the <tt>rect</tt> member of the specified <tt>option</tt> must be in logical coordinates. Reimplementations of this function should use {@link com.trolltech.qt.gui.QStyle#visualRect(com.trolltech.qt.core.Qt.LayoutDirection, com.trolltech.qt.core.QRect, com.trolltech.qt.core.QRect) visualRect()} to change the logical coordinates into screen coordinates before calling the {@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawPrimitive()} or {@link com.trolltech.qt.gui.QStyle#drawControl(com.trolltech.qt.gui.QStyle.ControlElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawControl()} function. <p>The table below is listing the complex control elements and their associated style option subclass. The style options contain all the parameters required to draw the controls, including QStyleOption::state which holds the {@link com.trolltech.qt.gui.QStyle.StateFlag style flags } that are used when drawing. The table also describes which flags that are set when casting the given <tt>option</tt> to the appropriate subclass. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Complex Control</center></th><th><center> {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex} Subclass</center></th><th><center> Style Flag</center></th><th><center> Remark</center></th></tr></thead><tr valign="top" class="even"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_SpinBox }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionSpinBox QStyleOptionSpinBox}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the spin box is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the spin box has input focus.</td></tr><tr valign="top" class="even"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_ComboBox }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionComboBox QStyleOptionComboBox}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the combobox is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the combobox has input focus.</td></tr><tr valign="top" class="even"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_ScrollBar }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the scroll bar is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the scroll bar has input focus.</td></tr><tr valign="top" class="even"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_Slider }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the slider is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the slider has input focus.</td></tr><tr valign="top" class="even"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_Dial }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the dial is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the dial has input focus.</td></tr><tr valign="top" class="even"><td rowspan=6> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_ToolButton }</td><td rowspan=6> {@link com.trolltech.qt.gui.QStyleOptionToolButton QStyleOptionToolButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the tool button is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the tool button has input focus.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_DownArrow }</td><td> Set if the tool button is down (i.e., a mouse button or the space bar is pressed).</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Set if the tool button is a toggle button and is toggled on.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_AutoRaise }</td><td> Set if the tool button has auto-raise enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Raised }</td><td> Set if the button is not down, not on, and doesn't contain the mouse when auto-raise is enabled.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_TitleBar }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTitleBar QStyleOptionTitleBar}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the title bar is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_Q3ListView }</td><td> QStyleOptionQ3ListView</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the list view is enabled.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawPrimitive()}, and {@link com.trolltech.qt.gui.QStyle#drawControl(com.trolltech.qt.gui.QStyle.ControlElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawControl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt, com.trolltech.qt.gui.QPainter p) {
        drawComplexControl(cc, opt, p, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Draws the given <tt>control</tt> using the provided <tt>painter</tt> with the style options specified by <tt>option</tt>. <p>The <tt>widget</tt> argument is optional and can be used as aid in drawing the control. <p>The <tt>option</tt> parameter is a pointer to a {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex} object that can be cast to the correct subclass using the qstyleoption_cast() function. Note that the <tt>rect</tt> member of the specified <tt>option</tt> must be in logical coordinates. Reimplementations of this function should use {@link com.trolltech.qt.gui.QStyle#visualRect(com.trolltech.qt.core.Qt.LayoutDirection, com.trolltech.qt.core.QRect, com.trolltech.qt.core.QRect) visualRect()} to change the logical coordinates into screen coordinates before calling the {@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawPrimitive()} or {@link com.trolltech.qt.gui.QStyle#drawControl(com.trolltech.qt.gui.QStyle.ControlElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawControl()} function. <p>The table below is listing the complex control elements and their associated style option subclass. The style options contain all the parameters required to draw the controls, including QStyleOption::state which holds the {@link com.trolltech.qt.gui.QStyle.StateFlag style flags } that are used when drawing. The table also describes which flags that are set when casting the given <tt>option</tt> to the appropriate subclass. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Complex Control</center></th><th><center> {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex} Subclass</center></th><th><center> Style Flag</center></th><th><center> Remark</center></th></tr></thead><tr valign="top" class="even"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_SpinBox }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionSpinBox QStyleOptionSpinBox}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the spin box is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the spin box has input focus.</td></tr><tr valign="top" class="even"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_ComboBox }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionComboBox QStyleOptionComboBox}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the combobox is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the combobox has input focus.</td></tr><tr valign="top" class="even"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_ScrollBar }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the scroll bar is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the scroll bar has input focus.</td></tr><tr valign="top" class="even"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_Slider }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the slider is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the slider has input focus.</td></tr><tr valign="top" class="even"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_Dial }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the dial is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the dial has input focus.</td></tr><tr valign="top" class="even"><td rowspan=6> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_ToolButton }</td><td rowspan=6> {@link com.trolltech.qt.gui.QStyleOptionToolButton QStyleOptionToolButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the tool button is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the tool button has input focus.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_DownArrow }</td><td> Set if the tool button is down (i.e., a mouse button or the space bar is pressed).</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Set if the tool button is a toggle button and is toggled on.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_AutoRaise }</td><td> Set if the tool button has auto-raise enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Raised }</td><td> Set if the button is not down, not on, and doesn't contain the mouse when auto-raise is enabled.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_TitleBar }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTitleBar QStyleOptionTitleBar}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the title bar is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.ComplexControl CC_Q3ListView }</td><td> QStyleOptionQ3ListView</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the list view is enabled.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawPrimitive()}, and {@link com.trolltech.qt.gui.QStyle#drawControl(com.trolltech.qt.gui.QStyle.ControlElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawControl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt, com.trolltech.qt.gui.QPainter p, com.trolltech.qt.gui.QWidget widget);
    @QtBlockedSlot
    native void __qt_drawComplexControl_ComplexControl_nativepointer_QPainter_QWidget(long __this__nativeId, int cc, com.trolltech.qt.gui.QStyleOptionComplex opt, long p, long widget);


/**
Draws the given <tt>element</tt> with the provided <tt>painter</tt> with the style options specified by <tt>option</tt>. <p>The <tt>widget</tt> argument is optional and can be used as aid in drawing the control. The <tt>option</tt> parameter is a pointer to a {@link com.trolltech.qt.gui.QStyleOption QStyleOption} object that can be cast to the correct subclass using the qstyleoption_cast() function. <p>The table below is listing the control elements and their associated style option subclass. The style options contain all the parameters required to draw the controls, including QStyleOption::state which holds the style flags that are used when drawing. The table also describes which flags that are set when casting the given option to the appropriate subclass. <p>Note that if a control element is not listed here, it is because it uses a plain {@link com.trolltech.qt.gui.QStyleOption QStyleOption} object. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Control Element</center></th><th><center> {@link com.trolltech.qt.gui.QStyleOption QStyleOption} Subclass</center></th><th><center> Style Flag</center></th><th><center> Remark</center></th></tr></thead><tr valign="top" class="even"><td rowspan=5> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_MenuItem }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_MenuBarItem }</td><td rowspan=5> {@link com.trolltech.qt.gui.QStyleOptionMenuItem QStyleOptionMenuItem}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Selected }</td><td> The menu item is currently selected item.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> The item is enabled.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_DownArrow }</td><td> Indicates that a scroll down arrow should be drawn.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_UpArrow }</td><td> Indicates that a scroll up arrow should be drawn</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the menu bar has input focus.</td></tr><tr valign="top" class="odd"><td rowspan=5> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_PushButton }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_PushButtonBevel }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_PushButtonLabel }</td><td rowspan=5> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the button is enabled.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the button has input focus.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Raised }</td><td> Set if the button is not down, not on and not flat.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Set if the button is a toggle button and is toggled on.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Set if the button is down (i.e., the mouse button or the space bar is pressed on the button).</td></tr><tr valign="top" class="even"><td rowspan=6> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_RadioButton }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_RadioButtonLabel }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_CheckBox }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_CheckBoxLabel }</td><td rowspan=6> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the button is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the button has input focus.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Set if the button is checked.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Off }</td><td> Set if the button is not checked.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_NoChange }</td><td> Set if the button is in the NoChange state.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Set if the button is down (i.e., the mouse button or the space bar is pressed on the button).</td></tr><tr valign="top" class="even"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ProgressBarContents }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ProgressBarLabel }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ProgressBarGroove }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the progress bar is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the progress bar has input focus.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_Header }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_HeaderSection }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_HeaderLabel }</td><td> {@link com.trolltech.qt.gui.QStyleOptionHeader QStyleOptionHeader}</td><td></td><td></td></tr><tr valign="top" class="odd"><td rowspan=3> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_TabBarTab }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_TabBarTabShape }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_TabBarTabLabel }</td><td rowspan=3> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the tab bar is enabled.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Selected }</td><td> The tab bar is the currently selected tab bar.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the tab bar tab has input focus.</td></tr><tr valign="top" class="even"><td rowspan=7> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ToolButtonLabel }</td><td rowspan=7> {@link com.trolltech.qt.gui.QStyleOptionToolButton QStyleOptionToolButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the tool button is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the tool button has input focus.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Set if the tool button is down (i.e., a mouse button or the space bar is pressed).</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Set if the tool button is a toggle button and is toggled on.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_AutoRaise }</td><td> Set if the tool button has auto-raise enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_MouseOver }</td><td> Set if the mouse pointer is over the tool button.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Raised }</td><td> Set if the button is not down and is not on.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ToolBoxTab }</td><td> {@link com.trolltech.qt.gui.QStyleOptionToolBox QStyleOptionToolBox}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Selected }</td><td> The tab is the currently selected tab.</td></tr><tr valign="top" class="even"><td rowspan=3> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_HeaderSection }</td><td rowspan=3> {@link com.trolltech.qt.gui.QStyleOptionHeader QStyleOptionHeader}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Indicates that the section is pressed.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_UpArrow }</td><td> Indicates that the sort indicator should be pointing up.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_DownArrow }</td><td> Indicates that the sort indicator should be pointing down.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawPrimitive()}, and {@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawControl(com.trolltech.qt.gui.QStyle.ControlElement element, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QPainter p) {
        drawControl(element, opt, p, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Draws the given <tt>element</tt> with the provided <tt>painter</tt> with the style options specified by <tt>option</tt>. <p>The <tt>widget</tt> argument is optional and can be used as aid in drawing the control. The <tt>option</tt> parameter is a pointer to a {@link com.trolltech.qt.gui.QStyleOption QStyleOption} object that can be cast to the correct subclass using the qstyleoption_cast() function. <p>The table below is listing the control elements and their associated style option subclass. The style options contain all the parameters required to draw the controls, including QStyleOption::state which holds the style flags that are used when drawing. The table also describes which flags that are set when casting the given option to the appropriate subclass. <p>Note that if a control element is not listed here, it is because it uses a plain {@link com.trolltech.qt.gui.QStyleOption QStyleOption} object. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Control Element</center></th><th><center> {@link com.trolltech.qt.gui.QStyleOption QStyleOption} Subclass</center></th><th><center> Style Flag</center></th><th><center> Remark</center></th></tr></thead><tr valign="top" class="even"><td rowspan=5> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_MenuItem }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_MenuBarItem }</td><td rowspan=5> {@link com.trolltech.qt.gui.QStyleOptionMenuItem QStyleOptionMenuItem}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Selected }</td><td> The menu item is currently selected item.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> The item is enabled.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_DownArrow }</td><td> Indicates that a scroll down arrow should be drawn.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_UpArrow }</td><td> Indicates that a scroll up arrow should be drawn</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the menu bar has input focus.</td></tr><tr valign="top" class="odd"><td rowspan=5> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_PushButton }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_PushButtonBevel }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_PushButtonLabel }</td><td rowspan=5> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the button is enabled.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the button has input focus.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Raised }</td><td> Set if the button is not down, not on and not flat.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Set if the button is a toggle button and is toggled on.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Set if the button is down (i.e., the mouse button or the space bar is pressed on the button).</td></tr><tr valign="top" class="even"><td rowspan=6> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_RadioButton }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_RadioButtonLabel }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_CheckBox }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_CheckBoxLabel }</td><td rowspan=6> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the button is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the button has input focus.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Set if the button is checked.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Off }</td><td> Set if the button is not checked.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_NoChange }</td><td> Set if the button is in the NoChange state.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Set if the button is down (i.e., the mouse button or the space bar is pressed on the button).</td></tr><tr valign="top" class="even"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ProgressBarContents }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ProgressBarLabel }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ProgressBarGroove }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the progress bar is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the progress bar has input focus.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_Header }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_HeaderSection }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_HeaderLabel }</td><td> {@link com.trolltech.qt.gui.QStyleOptionHeader QStyleOptionHeader}</td><td></td><td></td></tr><tr valign="top" class="odd"><td rowspan=3> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_TabBarTab }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_TabBarTabShape }, {@link com.trolltech.qt.gui.QStyle.ControlElement CE_TabBarTabLabel }</td><td rowspan=3> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the tab bar is enabled.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Selected }</td><td> The tab bar is the currently selected tab bar.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the tab bar tab has input focus.</td></tr><tr valign="top" class="even"><td rowspan=7> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ToolButtonLabel }</td><td rowspan=7> {@link com.trolltech.qt.gui.QStyleOptionToolButton QStyleOptionToolButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the tool button is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the tool button has input focus.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Set if the tool button is down (i.e., a mouse button or the space bar is pressed).</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Set if the tool button is a toggle button and is toggled on.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_AutoRaise }</td><td> Set if the tool button has auto-raise enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_MouseOver }</td><td> Set if the mouse pointer is over the tool button.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Raised }</td><td> Set if the button is not down and is not on.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_ToolBoxTab }</td><td> {@link com.trolltech.qt.gui.QStyleOptionToolBox QStyleOptionToolBox}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Selected }</td><td> The tab is the currently selected tab.</td></tr><tr valign="top" class="even"><td rowspan=3> {@link com.trolltech.qt.gui.QStyle.ControlElement CE_HeaderSection }</td><td rowspan=3> {@link com.trolltech.qt.gui.QStyleOptionHeader QStyleOptionHeader}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Indicates that the section is pressed.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_UpArrow }</td><td> Indicates that the sort indicator should be pointing up.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_DownArrow }</td><td> Indicates that the sort indicator should be pointing down.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawPrimitive()}, and {@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void drawControl(com.trolltech.qt.gui.QStyle.ControlElement element, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QPainter p, com.trolltech.qt.gui.QWidget w);
    @QtBlockedSlot
    native void __qt_drawControl_ControlElement_nativepointer_QPainter_QWidget(long __this__nativeId, int element, com.trolltech.qt.gui.QStyleOption opt, long p, long w);

/**
Draws the given <tt>pixmap</tt> in the specified <tt>rectangle</tt>, according to the specified <tt>alignment</tt>, using the provided <tt>painter</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawItemText(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, int, com.trolltech.qt.gui.QPalette, boolean, java.lang.String) drawItemText()}. <br></DD></DT>
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
Draws the given <tt>text</tt> in the specified <tt>rectangle</tt> using the provided <tt>painter</tt> and <tt>palette</tt>. <p>The text is drawn using the painter's pen, and aligned and wrapped according to the specified <tt>alignment</tt>. If an explicit <tt>textRole</tt> is specified, the text is drawn using the <tt>palette</tt>'s color for the given role. The <tt>enabled</tt> parameter indicates whether or not the item is enabled; when reimplementing this function, the <tt>enabled</tt> parameter should influence how the item is drawn. <p><DT><b>See also:</b><br><DD>Qt::Alignment, and {@link com.trolltech.qt.gui.QStyle#drawItemPixmap(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, int, com.trolltech.qt.gui.QPixmap) drawItemPixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawItemText(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRect rect, int flags, com.trolltech.qt.gui.QPalette pal, boolean enabled, java.lang.String text) {
        drawItemText(painter, rect, flags, pal, enabled, text, com.trolltech.qt.gui.QPalette.ColorRole.NoRole);
    }
/**
Draws the given <tt>text</tt> in the specified <tt>rectangle</tt> using the provided <tt>painter</tt> and <tt>palette</tt>. <p>The text is drawn using the painter's pen, and aligned and wrapped according to the specified <tt>alignment</tt>. If an explicit <tt>textRole</tt> is specified, the text is drawn using the <tt>palette</tt>'s color for the given role. The <tt>enabled</tt> parameter indicates whether or not the item is enabled; when reimplementing this function, the <tt>enabled</tt> parameter should influence how the item is drawn. <p><DT><b>See also:</b><br><DD>Qt::Alignment, and {@link com.trolltech.qt.gui.QStyle#drawItemPixmap(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, int, com.trolltech.qt.gui.QPixmap) drawItemPixmap()}. <br></DD></DT>
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
Draws the given primitive <tt>element</tt> with the provided <tt>painter</tt> using the style options specified by <tt>option</tt>. <p>The <tt>widget</tt> argument is optional and may contain a widget that may aid in drawing the primitive element. <p>The table below is listing the primitive elements and their associated style option subclasses. The style options contain all the parameters required to draw the elements, including QStyleOption::state which holds the style flags that are used when drawing. The table also describes which flags that are set when casting the given option to the appropriate subclass. <p>Note that if a primitive element is not listed here, it is because it uses a plain {@link com.trolltech.qt.gui.QStyleOption QStyleOption} object. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Primitive Element</center></th><th><center> {@link com.trolltech.qt.gui.QStyleOption QStyleOption} Subclass</center></th><th><center> Style Flag</center></th><th><center> Remark</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameFocusRect }</td><td> {@link com.trolltech.qt.gui.QStyleOptionFocusRect QStyleOptionFocusRect}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_FocusAtBorder }</td><td> Whether the focus is is at the border or inside the widget.</td></tr><tr valign="top" class="odd"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorCheckBox }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_NoChange }</td><td> Indicates a "tri-state" checkbox.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Indicates the indicator is checked.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorRadioButton }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Indicates that a radio button is selected.</td></tr><tr valign="top" class="even"><td rowspan=3> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_Q3CheckListExclusiveIndicator }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_Q3CheckListIndicator }</td><td rowspan=3> QStyleOptionQ3ListView</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Indicates whether or not the controller is selected.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_NoChange }</td><td> Indicates a "tri-state" controller.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Indicates the controller is enabled.</td></tr><tr valign="top" class="odd"><td rowspan=4> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorBranch }</td><td rowspan=4> {@link com.trolltech.qt.gui.QStyleOption QStyleOption}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Children }</td><td> Indicates that the control for expanding the tree to show child items, should be drawn.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Item }</td><td> Indicates that a horizontal branch (to show a child item), should be drawn.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Open }</td><td> Indicates that the tree branch is expanded.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sibling }</td><td> Indicates that a vertical line (to show a sibling item), should be drawn.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorHeaderArrow }</td><td> {@link com.trolltech.qt.gui.QStyleOptionHeader QStyleOptionHeader}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_UpArrow }</td><td> Indicates that the arrow should be drawn up; otherwise it should be down.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameGroupBox }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_Frame }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameLineEdit }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameMenu }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameDockWidget }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameWindow }</td><td> {@link com.trolltech.qt.gui.QStyleOptionFrame QStyleOptionFrame}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Indicates that the Frame should be sunken.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorToolBarHandle }</td><td> {@link com.trolltech.qt.gui.QStyleOption QStyleOption}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Horizontal }</td><td> Indicates that the window handle is horizontal instead of vertical.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_Q3DockWindowSeparator }</td><td> {@link com.trolltech.qt.gui.QStyleOption QStyleOption}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Horizontal }</td><td> Indicates that the separator is horizontal instead of vertical.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorSpinPlus }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorSpinMinus }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorSpinUp }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorSpinDown },</td><td> {@link com.trolltech.qt.gui.QStyleOptionSpinBox QStyleOptionSpinBox}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Indicates that the button is pressed.</td></tr><tr valign="top" class="even"><td rowspan=5> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_PanelButtonCommand }</td><td rowspan=5> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the button is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the button has input focus.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Raised }</td><td> Set if the button is not down, not on and not flat.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Set if the button is a toggle button and is toggled on.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Set if the button is down (i.e., the mouse button or the space bar is pressed on the button).</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()}, and {@link com.trolltech.qt.gui.QStyle#drawControl(com.trolltech.qt.gui.QStyle.ControlElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawControl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement pe, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QPainter p) {
        drawPrimitive(pe, opt, p, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Draws the given primitive <tt>element</tt> with the provided <tt>painter</tt> using the style options specified by <tt>option</tt>. <p>The <tt>widget</tt> argument is optional and may contain a widget that may aid in drawing the primitive element. <p>The table below is listing the primitive elements and their associated style option subclasses. The style options contain all the parameters required to draw the elements, including QStyleOption::state which holds the style flags that are used when drawing. The table also describes which flags that are set when casting the given option to the appropriate subclass. <p>Note that if a primitive element is not listed here, it is because it uses a plain {@link com.trolltech.qt.gui.QStyleOption QStyleOption} object. <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Primitive Element</center></th><th><center> {@link com.trolltech.qt.gui.QStyleOption QStyleOption} Subclass</center></th><th><center> Style Flag</center></th><th><center> Remark</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameFocusRect }</td><td> {@link com.trolltech.qt.gui.QStyleOptionFocusRect QStyleOptionFocusRect}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_FocusAtBorder }</td><td> Whether the focus is is at the border or inside the widget.</td></tr><tr valign="top" class="odd"><td rowspan=2> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorCheckBox }</td><td rowspan=2> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_NoChange }</td><td> Indicates a "tri-state" checkbox.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Indicates the indicator is checked.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorRadioButton }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Indicates that a radio button is selected.</td></tr><tr valign="top" class="even"><td rowspan=3> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_Q3CheckListExclusiveIndicator }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_Q3CheckListIndicator }</td><td rowspan=3> QStyleOptionQ3ListView</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Indicates whether or not the controller is selected.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_NoChange }</td><td> Indicates a "tri-state" controller.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Indicates the controller is enabled.</td></tr><tr valign="top" class="odd"><td rowspan=4> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorBranch }</td><td rowspan=4> {@link com.trolltech.qt.gui.QStyleOption QStyleOption}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Children }</td><td> Indicates that the control for expanding the tree to show child items, should be drawn.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Item }</td><td> Indicates that a horizontal branch (to show a child item), should be drawn.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Open }</td><td> Indicates that the tree branch is expanded.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sibling }</td><td> Indicates that a vertical line (to show a sibling item), should be drawn.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorHeaderArrow }</td><td> {@link com.trolltech.qt.gui.QStyleOptionHeader QStyleOptionHeader}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_UpArrow }</td><td> Indicates that the arrow should be drawn up; otherwise it should be down.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameGroupBox }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_Frame }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameLineEdit }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameMenu }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameDockWidget }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_FrameWindow }</td><td> {@link com.trolltech.qt.gui.QStyleOptionFrame QStyleOptionFrame}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Indicates that the Frame should be sunken.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorToolBarHandle }</td><td> {@link com.trolltech.qt.gui.QStyleOption QStyleOption}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Horizontal }</td><td> Indicates that the window handle is horizontal instead of vertical.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_Q3DockWindowSeparator }</td><td> {@link com.trolltech.qt.gui.QStyleOption QStyleOption}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Horizontal }</td><td> Indicates that the separator is horizontal instead of vertical.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorSpinPlus }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorSpinMinus }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorSpinUp }, {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_IndicatorSpinDown },</td><td> {@link com.trolltech.qt.gui.QStyleOptionSpinBox QStyleOptionSpinBox}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Indicates that the button is pressed.</td></tr><tr valign="top" class="even"><td rowspan=5> {@link com.trolltech.qt.gui.QStyle.PrimitiveElement PE_PanelButtonCommand }</td><td rowspan=5> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Enabled }</td><td> Set if the button is enabled.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_HasFocus }</td><td> Set if the button has input focus.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Raised }</td><td> Set if the button is not down, not on and not flat.</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_On }</td><td> Set if the button is a toggle button and is toggled on.</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.StateFlag State_Sunken }</td><td> Set if the button is down (i.e., the mouse button or the space bar is pressed on the button).</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()}, and {@link com.trolltech.qt.gui.QStyle#drawControl(com.trolltech.qt.gui.QStyle.ControlElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawControl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement pe, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QPainter p, com.trolltech.qt.gui.QWidget w);
    @QtBlockedSlot
    native void __qt_drawPrimitive_PrimitiveElement_nativepointer_QPainter_QWidget(long __this__nativeId, int pe, com.trolltech.qt.gui.QStyleOption opt, long p, long w);

/**
Returns a copy of the given <tt>pixmap</tt>, styled to conform to the specified <tt>iconMode</tt> and taking into account the palette specified by <tt>option</tt>. <p>The <tt>option</tt> parameter can pass extra information, but it must contain a palette. <p>Note that not all pixmaps will conform, in which case the returned pixmap is a plain copy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon QIcon}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QPixmap generatedIconPixmap(com.trolltech.qt.gui.QIcon.Mode iconMode, com.trolltech.qt.gui.QPixmap pixmap, com.trolltech.qt.gui.QStyleOption opt);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_generatedIconPixmap_Mode_QPixmap_nativepointer(long __this__nativeId, int iconMode, long pixmap, com.trolltech.qt.gui.QStyleOption opt);


/**
Returns the sub control at the given <tt>position</tt> in the given complex <tt>control</tt> (with the style options specified by <tt>option</tt>). <p>Note that the <tt>position</tt> is expressed in screen coordinates. <p>The <tt>option</tt> argument is a pointer to a {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex} object (or one of its subclasses). The object can be cast to the appropriate type using the qstyleoption_cast() function. See {@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()} for details. The <tt>widget</tt> argument is optional and can contain additional information for the function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()}, and {@link com.trolltech.qt.gui.QStyle#subControlRect(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, int) subControlRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int hitTestComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt, com.trolltech.qt.core.QPoint pt) {
        return hitTestComplexControl(cc, opt, pt, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Returns the sub control at the given <tt>position</tt> in the given complex <tt>control</tt> (with the style options specified by <tt>option</tt>). <p>Note that the <tt>position</tt> is expressed in screen coordinates. <p>The <tt>option</tt> argument is a pointer to a {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex} object (or one of its subclasses). The object can be cast to the appropriate type using the qstyleoption_cast() function. See {@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()} for details. The <tt>widget</tt> argument is optional and can contain additional information for the function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()}, and {@link com.trolltech.qt.gui.QStyle#subControlRect(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, int) subControlRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract int hitTestComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt, com.trolltech.qt.core.QPoint pt, com.trolltech.qt.gui.QWidget widget);
    @QtBlockedSlot
    native int __qt_hitTestComplexControl_ComplexControl_nativepointer_QPoint_QWidget(long __this__nativeId, int cc, com.trolltech.qt.gui.QStyleOptionComplex opt, long pt, long widget);

/**
Returns the area within the given <tt>rectangle</tt> in which to draw the specified <tt>pixmap</tt> according to the defined <tt>alignment</tt>.
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
Returns the area within the given <tt>rectangle</tt> in which to draw the provided <tt>text</tt> according to the specified font <tt>metrics</tt> and <tt>alignment</tt>. The <tt>enabled</tt> parameter indicates whether or not the associated item is enabled. <p>If the given <tt>rectangle</tt> is larger than the area needed to render the <tt>text</tt>, the rectangle that is returned will be offset within <tt>rectangle</tt> according to the specified <tt>alignment</tt>. For example, if <tt>alignment</tt> is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignCenter }, the returned rectangle will be centered within <tt>rectangle</tt>. If the given <tt>rectangle</tt> is smaller than the area needed, the returned rectangle will be the smallest rectangle large enough to render the <tt>text</tt>. <p><DT><b>See also:</b><br><DD>Qt::Alignment. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRect itemTextRect(com.trolltech.qt.gui.QFontMetrics fm, com.trolltech.qt.core.QRect r, int flags, boolean enabled, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemTextRect_QFontMetrics_QRect_int_boolean_String(nativeId(), fm == null ? 0 : fm.nativeId(), r == null ? 0 : r.nativeId(), flags, enabled, text);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_itemTextRect_QFontMetrics_QRect_int_boolean_String(long __this__nativeId, long fm, long r, int flags, boolean enabled, java.lang.String text);


/**
Returns the value of the given pixel <tt>metric</tt>. <p>The specified <tt>option</tt> and <tt>widget</tt> can be used for calculating the metric. In general, the <tt>widget</tt> argument is not used. The <tt>option</tt> can be cast to the appropriate type using the qstyleoption_cast() function. Note that the <tt>option</tt> may be zero even for PixelMetrics that can make use of it. See the table below for the appropriate <tt>option</tt> casts: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Pixel Metric</center></th><th><center> {@link com.trolltech.qt.gui.QStyleOption QStyleOption} Subclass</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_SliderControlThickness }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_SliderLength }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_SliderTickmarkOffset }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_SliderSpaceAvailable }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_ScrollBarExtent }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarTabOverlap }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarTabHSpace }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarTabVSpace }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarBaseHeight }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarBaseOverlap }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr></table> Some pixel metrics are called from widgets and some are only called internally by the style. If the metric is not called by a widget, it is the discretion of the style author to make use of it. For some styles, this may not be appropriate.
*/

    @QtBlockedSlot
    public final int pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric metric, com.trolltech.qt.gui.QStyleOption option) {
        return pixelMetric(metric, option, (com.trolltech.qt.gui.QWidget)null);
    }

/**
Returns the value of the given pixel <tt>metric</tt>. <p>The specified <tt>option</tt> and <tt>widget</tt> can be used for calculating the metric. In general, the <tt>widget</tt> argument is not used. The <tt>option</tt> can be cast to the appropriate type using the qstyleoption_cast() function. Note that the <tt>option</tt> may be zero even for PixelMetrics that can make use of it. See the table below for the appropriate <tt>option</tt> casts: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Pixel Metric</center></th><th><center> {@link com.trolltech.qt.gui.QStyleOption QStyleOption} Subclass</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_SliderControlThickness }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_SliderLength }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_SliderTickmarkOffset }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_SliderSpaceAvailable }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_ScrollBarExtent }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarTabOverlap }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarTabHSpace }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarTabVSpace }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarBaseHeight }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarBaseOverlap }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr></table> Some pixel metrics are called from widgets and some are only called internally by the style. If the metric is not called by a widget, it is the discretion of the style author to make use of it. For some styles, this may not be appropriate.
*/

    @QtBlockedSlot
    public final int pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric metric) {
        return pixelMetric(metric, (com.trolltech.qt.gui.QStyleOption)null, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Returns the value of the given pixel <tt>metric</tt>. <p>The specified <tt>option</tt> and <tt>widget</tt> can be used for calculating the metric. In general, the <tt>widget</tt> argument is not used. The <tt>option</tt> can be cast to the appropriate type using the qstyleoption_cast() function. Note that the <tt>option</tt> may be zero even for PixelMetrics that can make use of it. See the table below for the appropriate <tt>option</tt> casts: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Pixel Metric</center></th><th><center> {@link com.trolltech.qt.gui.QStyleOption QStyleOption} Subclass</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_SliderControlThickness }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_SliderLength }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_SliderTickmarkOffset }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_SliderSpaceAvailable }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_ScrollBarExtent }</td><td> {@link com.trolltech.qt.gui.QStyleOptionSlider QStyleOptionSlider}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarTabOverlap }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarTabHSpace }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarTabVSpace }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarBaseHeight }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_TabBarBaseOverlap }</td><td> {@link com.trolltech.qt.gui.QStyleOptionTab QStyleOptionTab}</td></tr></table> Some pixel metrics are called from widgets and some are only called internally by the style. If the metric is not called by a widget, it is the discretion of the style author to make use of it. For some styles, this may not be appropriate.
*/

    @QtBlockedSlot
    public abstract int pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric metric, com.trolltech.qt.gui.QStyleOption option, com.trolltech.qt.gui.QWidget widget);
    @QtBlockedSlot
    native int __qt_pixelMetric_PixelMetric_nativepointer_QWidget(long __this__nativeId, int metric, com.trolltech.qt.gui.QStyleOption option, long widget);

/**
This is an overloaded member function, provided for convenience. <p>Late initialization of the given <tt>application</tt> object.
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
This is an overloaded member function, provided for convenience. <p>Changes the <tt>palette</tt> according to style specific requirements for color palettes (if any). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPalette QPalette}, and {@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) QApplication::setPalette()}. <br></DD></DT>
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
Initializes the appearance of the given <tt>widget</tt>. <p>This function is called for every widget at some point after it has been fully created but just before it is shown for the very first time. <p>Note that the default implementation does nothing. Reasonable actions in this function might be to call the QWidget::setBackgroundMode() function for the widget. Do not use the function to set, for example, the geometry; reimplementing this function do provide a back-door through which the appearance of a widget can be changed, but with Qt 4.0's style engine there is rarely necessary to implement this function; reimplement the {@link com.trolltech.qt.gui.QStyle#drawItemPixmap(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, int, com.trolltech.qt.gui.QPixmap) drawItemPixmap()}, {@link com.trolltech.qt.gui.QStyle#drawItemText(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, int, com.trolltech.qt.gui.QPalette, boolean, java.lang.String) drawItemText()}, {@link com.trolltech.qt.gui.QStyle#drawPrimitive(com.trolltech.qt.gui.QStyle.PrimitiveElement, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QPainter) drawPrimitive()}, etc. instead. <p>The QWidget::inherits() function may provide enough information to allow class-specific customizations. But because new QStyle subclasses are expected to work reasonably with all current and future widgets, limited use of hard-coded customization is recommended. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#unpolish(com.trolltech.qt.gui.QApplication) unpolish()}. <br></DD></DT>
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
Returns the size of the element described by the specified <tt>option</tt> and <tt>type</tt>, based on the provided <tt>contentsSize</tt>. <p>The <tt>option</tt> argument is a pointer to a {@link com.trolltech.qt.gui.QStyleOption QStyleOption} or one of its subclasses. The <tt>option</tt> can be cast to the appropriate type using the qstyleoption_cast() function. The <tt>widget</tt> is an optional argument and can contain extra information used for calculating the size. <p>See the table below for the appropriate <tt>option</tt> casts: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Contents Type</center></th><th><center> {@link com.trolltech.qt.gui.QStyleOption QStyleOption} Subclass</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_PushButton }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_CheckBox }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_RadioButton }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_ToolButton }</td><td> {@link com.trolltech.qt.gui.QStyleOptionToolButton QStyleOptionToolButton}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_ComboBox }</td><td> {@link com.trolltech.qt.gui.QStyleOptionComboBox QStyleOptionComboBox}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_Splitter }</td><td> {@link com.trolltech.qt.gui.QStyleOption QStyleOption}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_Q3DockWindow }</td><td> QStyleOptionQ3DockWindow</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_ProgressBar }</td><td> {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_MenuItem }</td><td> {@link com.trolltech.qt.gui.QStyleOptionMenuItem QStyleOptionMenuItem}</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle.ContentsType ContentsType }, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize sizeFromContents(com.trolltech.qt.gui.QStyle.ContentsType ct, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.core.QSize contentsSize) {
        return sizeFromContents(ct, opt, contentsSize, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Returns the size of the element described by the specified <tt>option</tt> and <tt>type</tt>, based on the provided <tt>contentsSize</tt>. <p>The <tt>option</tt> argument is a pointer to a {@link com.trolltech.qt.gui.QStyleOption QStyleOption} or one of its subclasses. The <tt>option</tt> can be cast to the appropriate type using the qstyleoption_cast() function. The <tt>widget</tt> is an optional argument and can contain extra information used for calculating the size. <p>See the table below for the appropriate <tt>option</tt> casts: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Contents Type</center></th><th><center> {@link com.trolltech.qt.gui.QStyleOption QStyleOption} Subclass</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_PushButton }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_CheckBox }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_RadioButton }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_ToolButton }</td><td> {@link com.trolltech.qt.gui.QStyleOptionToolButton QStyleOptionToolButton}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_ComboBox }</td><td> {@link com.trolltech.qt.gui.QStyleOptionComboBox QStyleOptionComboBox}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_Splitter }</td><td> {@link com.trolltech.qt.gui.QStyleOption QStyleOption}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_Q3DockWindow }</td><td> QStyleOptionQ3DockWindow</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_ProgressBar }</td><td> {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.ContentsType CT_MenuItem }</td><td> {@link com.trolltech.qt.gui.QStyleOptionMenuItem QStyleOptionMenuItem}</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle.ContentsType ContentsType }, and {@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QSize sizeFromContents(com.trolltech.qt.gui.QStyle.ContentsType ct, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.core.QSize contentsSize, com.trolltech.qt.gui.QWidget w);
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeFromContents_ContentsType_nativepointer_QSize_QWidget(long __this__nativeId, int ct, com.trolltech.qt.gui.QStyleOption opt, long contentsSize, long w);

/**
Returns the style's standard palette. <p>Note that on systems that support system colors, the style's standard palette is not used. In particular, the Windows XP, Vista, and Mac styles do not use the standard palette, but make use of native theme engines. With these styles, you should not set the palette with QApplication::setStandardPalette().
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
Returns an integer representing the specified style <tt>hint</tt> for the given <tt>widget</tt> described by the provided style <tt>option</tt>. <p>Note that currently, the <tt>returnData</tt> and <tt>widget</tt> parameters are not used; they are provided for future enhancement. In addition, the <tt>option</tt> parameter is used only in case of the {@link com.trolltech.qt.gui.QStyle.StyleHint SH_ComboBox_Popup }, {@link com.trolltech.qt.gui.QStyle.StyleHint SH_ComboBox_LayoutDirection }, and {@link com.trolltech.qt.gui.QStyle.StyleHint SH_GroupBox_TextLabelColor } style hints.
*/

    @QtBlockedSlot
    public final int styleHint(com.trolltech.qt.gui.QStyle.StyleHint stylehint, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QWidget widget) {
        return styleHint(stylehint, opt, widget, (com.trolltech.qt.gui.QStyleHintReturn)null);
    }

/**
Returns an integer representing the specified style <tt>hint</tt> for the given <tt>widget</tt> described by the provided style <tt>option</tt>. <p>Note that currently, the <tt>returnData</tt> and <tt>widget</tt> parameters are not used; they are provided for future enhancement. In addition, the <tt>option</tt> parameter is used only in case of the {@link com.trolltech.qt.gui.QStyle.StyleHint SH_ComboBox_Popup }, {@link com.trolltech.qt.gui.QStyle.StyleHint SH_ComboBox_LayoutDirection }, and {@link com.trolltech.qt.gui.QStyle.StyleHint SH_GroupBox_TextLabelColor } style hints.
*/

    @QtBlockedSlot
    public final int styleHint(com.trolltech.qt.gui.QStyle.StyleHint stylehint, com.trolltech.qt.gui.QStyleOption opt) {
        return styleHint(stylehint, opt, (com.trolltech.qt.gui.QWidget)null, (com.trolltech.qt.gui.QStyleHintReturn)null);
    }

/**
Returns an integer representing the specified style <tt>hint</tt> for the given <tt>widget</tt> described by the provided style <tt>option</tt>. <p>Note that currently, the <tt>returnData</tt> and <tt>widget</tt> parameters are not used; they are provided for future enhancement. In addition, the <tt>option</tt> parameter is used only in case of the {@link com.trolltech.qt.gui.QStyle.StyleHint SH_ComboBox_Popup }, {@link com.trolltech.qt.gui.QStyle.StyleHint SH_ComboBox_LayoutDirection }, and {@link com.trolltech.qt.gui.QStyle.StyleHint SH_GroupBox_TextLabelColor } style hints.
*/

    @QtBlockedSlot
    public final int styleHint(com.trolltech.qt.gui.QStyle.StyleHint stylehint) {
        return styleHint(stylehint, (com.trolltech.qt.gui.QStyleOption)null, (com.trolltech.qt.gui.QWidget)null, (com.trolltech.qt.gui.QStyleHintReturn)null);
    }
/**
Returns an integer representing the specified style <tt>hint</tt> for the given <tt>widget</tt> described by the provided style <tt>option</tt>. <p>Note that currently, the <tt>returnData</tt> and <tt>widget</tt> parameters are not used; they are provided for future enhancement. In addition, the <tt>option</tt> parameter is used only in case of the {@link com.trolltech.qt.gui.QStyle.StyleHint SH_ComboBox_Popup }, {@link com.trolltech.qt.gui.QStyle.StyleHint SH_ComboBox_LayoutDirection }, and {@link com.trolltech.qt.gui.QStyle.StyleHint SH_GroupBox_TextLabelColor } style hints.
*/

    @QtBlockedSlot
    public abstract int styleHint(com.trolltech.qt.gui.QStyle.StyleHint stylehint, com.trolltech.qt.gui.QStyleOption opt, com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.gui.QStyleHintReturn returnData);
    @QtBlockedSlot
    native int __qt_styleHint_StyleHint_nativepointer_QWidget_QStyleHintReturn(long __this__nativeId, int stylehint, com.trolltech.qt.gui.QStyleOption opt, long widget, long returnData);


/**
Returns the rectangle containing the specified <tt>subControl</tt> of the given complex <tt>control</tt> (with the style specified by <tt>option</tt>). The rectangle is defined in screen coordinates. <p>The <tt>option</tt> argument is a pointer to {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex} or one of its subclasses, and can be cast to the appropriate type using the qstyleoption_cast() function. See {@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()} for details. The <tt>widget</tt> is optional and can contain additional information for the function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect subControlRect(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt, int sc) {
        return subControlRect(cc, opt, sc, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Returns the rectangle containing the specified <tt>subControl</tt> of the given complex <tt>control</tt> (with the style specified by <tt>option</tt>). The rectangle is defined in screen coordinates. <p>The <tt>option</tt> argument is a pointer to {@link com.trolltech.qt.gui.QStyleOptionComplex QStyleOptionComplex} or one of its subclasses, and can be cast to the appropriate type using the qstyleoption_cast() function. See {@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()} for details. The <tt>widget</tt> is optional and can contain additional information for the function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#drawComplexControl(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, com.trolltech.qt.gui.QPainter) drawComplexControl()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QRect subControlRect(com.trolltech.qt.gui.QStyle.ComplexControl cc, com.trolltech.qt.gui.QStyleOptionComplex opt, int sc, com.trolltech.qt.gui.QWidget widget);
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_subControlRect_ComplexControl_nativepointer_int_QWidget(long __this__nativeId, int cc, com.trolltech.qt.gui.QStyleOptionComplex opt, int sc, long widget);


/**
Returns the sub-area for the given <tt>element</tt> as described in the provided style <tt>option</tt>. The returned rectangle is defined in screen coordinates. <p>The <tt>widget</tt> argument is optional and can be used to aid determining the area. The {@link com.trolltech.qt.gui.QStyleOption QStyleOption} object can be cast to the appropriate type using the qstyleoption_cast() function. See the table below for the appropriate <tt>option</tt> casts: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Sub Element</center></th><th><center> {@link com.trolltech.qt.gui.QStyleOption QStyleOption} Subclass</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_PushButtonContents }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_PushButtonFocusRect }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_CheckBoxIndicator }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_CheckBoxContents }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_CheckBoxFocusRect }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_RadioButtonIndicator }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_RadioButtonContents }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_RadioButtonFocusRect }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_ComboBoxFocusRect }</td><td> {@link com.trolltech.qt.gui.QStyleOptionComboBox QStyleOptionComboBox}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_Q3DockWindowHandleRect }</td><td> QStyleOptionQ3DockWindow</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_ProgressBarGroove }</td><td> {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_ProgressBarContents }</td><td> {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_ProgressBarLabel }</td><td> {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar}</td></tr></table>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect subElementRect(com.trolltech.qt.gui.QStyle.SubElement subElement, com.trolltech.qt.gui.QStyleOption option) {
        return subElementRect(subElement, option, (com.trolltech.qt.gui.QWidget)null);
    }
/**
Returns the sub-area for the given <tt>element</tt> as described in the provided style <tt>option</tt>. The returned rectangle is defined in screen coordinates. <p>The <tt>widget</tt> argument is optional and can be used to aid determining the area. The {@link com.trolltech.qt.gui.QStyleOption QStyleOption} object can be cast to the appropriate type using the qstyleoption_cast() function. See the table below for the appropriate <tt>option</tt> casts: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Sub Element</center></th><th><center> {@link com.trolltech.qt.gui.QStyleOption QStyleOption} Subclass</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_PushButtonContents }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_PushButtonFocusRect }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_CheckBoxIndicator }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_CheckBoxContents }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_CheckBoxFocusRect }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_RadioButtonIndicator }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_RadioButtonContents }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_RadioButtonFocusRect }</td><td> {@link com.trolltech.qt.gui.QStyleOptionButton QStyleOptionButton}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_ComboBoxFocusRect }</td><td> {@link com.trolltech.qt.gui.QStyleOptionComboBox QStyleOptionComboBox}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_Q3DockWindowHandleRect }</td><td> QStyleOptionQ3DockWindow</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_ProgressBarGroove }</td><td> {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar}</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_ProgressBarContents }</td><td> {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar}</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QStyle.SubElement SE_ProgressBarLabel }</td><td> {@link com.trolltech.qt.gui.QStyleOptionProgressBar QStyleOptionProgressBar}</td></tr></table>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QRect subElementRect(com.trolltech.qt.gui.QStyle.SubElement subElement, com.trolltech.qt.gui.QStyleOption option, com.trolltech.qt.gui.QWidget widget);
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_subElementRect_SubElement_nativepointer_QWidget(long __this__nativeId, int subElement, com.trolltech.qt.gui.QStyleOption option, long widget);

/**
This is an overloaded member function, provided for convenience. <p>Uninitialize the given <tt>application</tt>.
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
Uninitialize the given <tt>widget</tt>'s appearance. <p>This function is the counterpart to {@link com.trolltech.qt.gui.QStyle#polish(com.trolltech.qt.gui.QApplication) polish()}. It is called for every polished widget whenever the style is dynamically changed; the former style has to unpolish its settings before the new style can polish them again. <p>Note that {@link com.trolltech.qt.gui.QStyle#unpolish(com.trolltech.qt.gui.QApplication) unpolish()} will only be called if the widget is destroyed. This can cause problems in some cases, e.g, if you remove a widget from the UI, cache it, and then reinsert it after the style has changed; some of Qt's classes cache their widgets. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#polish(com.trolltech.qt.gui.QApplication) polish()}. <br></DD></DT>
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
Returns a new rectangle of the specified <tt>size</tt> that is aligned to the given <tt>rectangle</tt> according to the specified <tt>alignment</tt> and <tt>direction</tt>.
*/

    public static com.trolltech.qt.core.QRect alignedRect(com.trolltech.qt.core.Qt.LayoutDirection direction, com.trolltech.qt.core.Qt.Alignment alignment, com.trolltech.qt.core.QSize size, com.trolltech.qt.core.QRect rectangle)    {
        return __qt_alignedRect_LayoutDirection_Alignment_QSize_QRect(direction.value(), alignment.value(), size == null ? 0 : size.nativeId(), rectangle == null ? 0 : rectangle.nativeId());
    }
    native static com.trolltech.qt.core.QRect __qt_alignedRect_LayoutDirection_Alignment_QSize_QRect(int direction, int alignment, long size, long rectangle);


/**
Converts the given <tt>logicalValue</tt> to a pixel position. The <tt>min</tt> parameter maps to 0, <tt>max</tt> maps to <tt>span</tt> and other values are distributed evenly in-between. <p>This function can handle the entire integer range without overflow, providing that <tt>span</tt> is less than 4096. <p>By default, this function assumes that the maximum value is on the right for horizontal items and on the bottom for vertical items. Set the <tt>upsideDown</tt> parameter to true to reverse this behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#sliderValueFromPosition(int, int, int, int) sliderValueFromPosition()}. <br></DD></DT>
*/

    public static int sliderPositionFromValue(int min, int max, int val, int space) {
        return sliderPositionFromValue(min, max, val, space, (boolean)false);
    }
/**
Converts the given <tt>logicalValue</tt> to a pixel position. The <tt>min</tt> parameter maps to 0, <tt>max</tt> maps to <tt>span</tt> and other values are distributed evenly in-between. <p>This function can handle the entire integer range without overflow, providing that <tt>span</tt> is less than 4096. <p>By default, this function assumes that the maximum value is on the right for horizontal items and on the bottom for vertical items. Set the <tt>upsideDown</tt> parameter to true to reverse this behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#sliderValueFromPosition(int, int, int, int) sliderValueFromPosition()}. <br></DD></DT>
*/

    public native static int sliderPositionFromValue(int min, int max, int val, int space, boolean upsideDown);


/**
Converts the given pixel <tt>position</tt> to a logical value. 0 maps to the <tt>min</tt> parameter, <tt>span</tt> maps to <tt>max</tt> and other values are distributed evenly in-between. <p>This function can handle the entire integer range without overflow. <p>By default, this function assumes that the maximum value is on the right for horizontal items and on the bottom for vertical items. Set the <tt>upsideDown</tt> parameter to true to reverse this behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#sliderPositionFromValue(int, int, int, int) sliderPositionFromValue()}. <br></DD></DT>
*/

    public static int sliderValueFromPosition(int min, int max, int pos, int space) {
        return sliderValueFromPosition(min, max, pos, space, (boolean)false);
    }
/**
Converts the given pixel <tt>position</tt> to a logical value. 0 maps to the <tt>min</tt> parameter, <tt>span</tt> maps to <tt>max</tt> and other values are distributed evenly in-between. <p>This function can handle the entire integer range without overflow. <p>By default, this function assumes that the maximum value is on the right for horizontal items and on the bottom for vertical items. Set the <tt>upsideDown</tt> parameter to true to reverse this behavior. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#sliderPositionFromValue(int, int, int, int) sliderPositionFromValue()}. <br></DD></DT>
*/

    public native static int sliderValueFromPosition(int min, int max, int pos, int space, boolean upsideDown);


/**

*/

    public static com.trolltech.qt.core.Qt.Alignment visualAlignment(com.trolltech.qt.core.Qt.LayoutDirection direction, com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        return com.trolltech.qt.gui.QStyle.visualAlignment(direction, new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
Transforms an <tt>alignment</tt> of {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } or {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight } without {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignAbsolute } into {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft } or {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight } with {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignAbsolute } according to the layout <tt>direction</tt>. The other alignment flags are left untouched. <p>If no horizontal alignment was specified, the function returns the default alignment for the given layout <tt>direction</tt>. <p>{@link QWidget#layoutDirection() QWidget::layoutDirection}
*/

    public static com.trolltech.qt.core.Qt.Alignment visualAlignment(com.trolltech.qt.core.Qt.LayoutDirection direction, com.trolltech.qt.core.Qt.Alignment alignment)    {
        return new com.trolltech.qt.core.Qt.Alignment(__qt_visualAlignment_LayoutDirection_Alignment(direction.value(), alignment.value()));
    }
    native static int __qt_visualAlignment_LayoutDirection_Alignment(int direction, int alignment);

/**
Returns the given <tt>logicalPosition</tt> converted to screen coordinates based on the specified <tt>direction</tt>. The <tt>boundingRectangle</tt> is used when performing the translation. <p><DT><b>See also:</b><br><DD>{@link QWidget#layoutDirection() QWidget::layoutDirection}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.QPoint visualPos(com.trolltech.qt.core.Qt.LayoutDirection direction, com.trolltech.qt.core.QRect boundingRect, com.trolltech.qt.core.QPoint logicalPos)    {
        return __qt_visualPos_LayoutDirection_QRect_QPoint(direction.value(), boundingRect == null ? 0 : boundingRect.nativeId(), logicalPos == null ? 0 : logicalPos.nativeId());
    }
    native static com.trolltech.qt.core.QPoint __qt_visualPos_LayoutDirection_QRect_QPoint(int direction, long boundingRect, long logicalPos);

/**
Returns the given <tt>logicalRectangle</tt> converted to screen coordinates based on the specified <tt>direction</tt>. The <tt>boundingRectangle</tt> is used when performing the translation. <p>This function is provided to support right-to-left desktops, and is typically used in implementations of the {@link com.trolltech.qt.gui.QStyle#subControlRect(com.trolltech.qt.gui.QStyle.ComplexControl, com.trolltech.qt.gui.QStyleOptionComplex, int) subControlRect()} function. <p><DT><b>See also:</b><br><DD>{@link QWidget#layoutDirection() QWidget::layoutDirection}. <br></DD></DT>
*/

    public static com.trolltech.qt.core.QRect visualRect(com.trolltech.qt.core.Qt.LayoutDirection direction, com.trolltech.qt.core.QRect boundingRect, com.trolltech.qt.core.QRect logicalRect)    {
        return __qt_visualRect_LayoutDirection_QRect_QRect(direction.value(), boundingRect == null ? 0 : boundingRect.nativeId(), logicalRect == null ? 0 : logicalRect.nativeId());
    }
    native static com.trolltech.qt.core.QRect __qt_visualRect_LayoutDirection_QRect_QRect(int direction, long boundingRect, long logicalRect);

/**
@exclude
*/

    public static native QStyle fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyle(QPrivateConstructor p) { super(p); } 

/**
Returns the spacing that should be used between <tt>controls1</tt> and <tt>controls2</tt> in a layout. <tt>orientation</tt> specifies whether the controls are laid out side by side or stacked vertically. The <tt>option</tt> parameter can be used to pass extra information about the parent widget. The <tt>widget</tt> parameter is optional and can also be used if <tt>option</tt> is 0. <p><tt>controls1</tt> and <tt>controls2</tt> are OR-combination of zero or more control types. <p>This function is called by the layout system. It is used only if {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing } or {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutVerticalSpacing } returns a negative value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) layoutSpacing()}, and {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()}. <br></DD></DT>
*/

    @QtBlockedSlot
        public final int combinedLayoutSpacing(QSizePolicy.ControlTypes controls1, QSizePolicy.ControlTypes controls2,
    com.trolltech.qt.core.Qt.Orientation orientation, QStyleOption option, QWidget widget) {
        return combinedLayoutSpacing(controls1, controls2, orientation, option == null ? null : option.nativePointer(), widget);
    }

/**
Returns the spacing that should be used between <tt>controls1</tt> and <tt>controls2</tt> in a layout. <tt>orientation</tt> specifies whether the controls are laid out side by side or stacked vertically. The <tt>option</tt> parameter can be used to pass extra information about the parent widget. The <tt>widget</tt> parameter is optional and can also be used if <tt>option</tt> is 0. <p><tt>controls1</tt> and <tt>controls2</tt> are OR-combination of zero or more control types. <p>This function is called by the layout system. It is used only if {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing } or {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutVerticalSpacing } returns a negative value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) layoutSpacing()}, and {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()}. <br></DD></DT>
*/

    @QtBlockedSlot
        public final int combinedLayoutSpacing(QSizePolicy.ControlTypes controls1, QSizePolicy.ControlTypes controls2,
    com.trolltech.qt.core.Qt.Orientation orientation, QStyleOption option) {
        return combinedLayoutSpacing(controls1, controls2, orientation, option, null);
    }

/**
Returns the spacing that should be used between <tt>controls1</tt> and <tt>controls2</tt> in a layout. <tt>orientation</tt> specifies whether the controls are laid out side by side or stacked vertically. The <tt>option</tt> parameter can be used to pass extra information about the parent widget. The <tt>widget</tt> parameter is optional and can also be used if <tt>option</tt> is 0. <p><tt>controls1</tt> and <tt>controls2</tt> are OR-combination of zero or more control types. <p>This function is called by the layout system. It is used only if {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing } or {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutVerticalSpacing } returns a negative value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) layoutSpacing()}, and {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()}. <br></DD></DT>
*/

    @QtBlockedSlot
        public final int combinedLayoutSpacing(QSizePolicy.ControlTypes controls1, QSizePolicy.ControlTypes controls2,
    com.trolltech.qt.core.Qt.Orientation orientation) {
        return combinedLayoutSpacing(controls1, controls2, orientation, null);
    }

/**
Returns the spacing that should be used between <tt>control1</tt> and <tt>control2</tt> in a layout. <tt>orientation</tt> specifies whether the controls are laid out side by side or stacked vertically. The <tt>option</tt> parameter can be used to pass extra information about the parent widget. The <tt>widget</tt> parameter is optional and can also be used if <tt>option</tt> is 0. <p>This function is called by the layout system. It is used only if {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing } or {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutVerticalSpacing } returns a negative value. <p>For binary compatibility reasons, this function is not virtual. If you want to specify custom layout spacings in a QStyle subclass, implement a slot called {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()}. QStyle will discover the slot at run-time (using Qt's {@link <a href="../metaobjects.html">meta-object system</a>}) and direct all calls to {@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) layoutSpacing()} to {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#combinedLayoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlTypes, com.trolltech.qt.gui.QSizePolicy.ControlTypes, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) combinedLayoutSpacing()}, and {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()}. <br></DD></DT>
*/

    @QtBlockedSlot
        public final int layoutSpacing(QSizePolicy.ControlType control1, QSizePolicy.ControlType control2, com.trolltech.qt.core.Qt.Orientation orientation,
    QStyleOption option, QWidget widget) {
        return layoutSpacing(control1, control2, orientation, option == null ? null : option.nativePointer(), widget);
    }

/**
Returns the spacing that should be used between <tt>control1</tt> and <tt>control2</tt> in a layout. <tt>orientation</tt> specifies whether the controls are laid out side by side or stacked vertically. The <tt>option</tt> parameter can be used to pass extra information about the parent widget. The <tt>widget</tt> parameter is optional and can also be used if <tt>option</tt> is 0. <p>This function is called by the layout system. It is used only if {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing } or {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutVerticalSpacing } returns a negative value. <p>For binary compatibility reasons, this function is not virtual. If you want to specify custom layout spacings in a QStyle subclass, implement a slot called {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()}. QStyle will discover the slot at run-time (using Qt's {@link <a href="../metaobjects.html">meta-object system</a>}) and direct all calls to {@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) layoutSpacing()} to {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#combinedLayoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlTypes, com.trolltech.qt.gui.QSizePolicy.ControlTypes, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) combinedLayoutSpacing()}, and {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()}. <br></DD></DT>
*/

    @QtBlockedSlot
        public final int layoutSpacing(QSizePolicy.ControlType control1, QSizePolicy.ControlType control2, com.trolltech.qt.core.Qt.Orientation orientation,
    QStyleOption option) {
        return layoutSpacing(control1, control2, orientation, option, null);
    }

/**
Returns the spacing that should be used between <tt>control1</tt> and <tt>control2</tt> in a layout. <tt>orientation</tt> specifies whether the controls are laid out side by side or stacked vertically. The <tt>option</tt> parameter can be used to pass extra information about the parent widget. The <tt>widget</tt> parameter is optional and can also be used if <tt>option</tt> is 0. <p>This function is called by the layout system. It is used only if {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutHorizontalSpacing } or {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutVerticalSpacing } returns a negative value. <p>For binary compatibility reasons, this function is not virtual. If you want to specify custom layout spacings in a QStyle subclass, implement a slot called {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()}. QStyle will discover the slot at run-time (using Qt's {@link <a href="../metaobjects.html">meta-object system</a>}) and direct all calls to {@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) layoutSpacing()} to {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#combinedLayoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlTypes, com.trolltech.qt.gui.QSizePolicy.ControlTypes, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) combinedLayoutSpacing()}, and {@link com.trolltech.qt.gui.QStyle#layoutSpacingImplementation(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption) layoutSpacingImplementation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int layoutSpacing(QSizePolicy.ControlType control1, QSizePolicy.ControlType control2, com.trolltech.qt.core.Qt.Orientation orientation) {
        return layoutSpacing(control1, control2, orientation, null);
    }

}
