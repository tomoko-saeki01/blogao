package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QPrintPreviewWidget class provides a widget for previewing page layouts for printer output. {@link com.trolltech.qt.gui.QPrintPreviewDialog QPrintPreviewDialog} uses a QPrintPreviewWidget internally, and the purpose of QPrintPreviewWidget is to make it possible to embed the preview into other widgets. It also makes it possible to build a different user interface around it than the default one provided with {@link com.trolltech.qt.gui.QPrintPreviewDialog QPrintPreviewDialog}. <p>Using QPrintPreviewWidget is straightforward: <ol><li> Create the QPrintPreviewWidget <p>Construct the QPrintPreviewWidget either by passing in an exisiting {@link com.trolltech.qt.gui.QPrinter QPrinter} object, or have QPrintPreviewWidget create a default constructed {@link com.trolltech.qt.gui.QPrinter QPrinter} object for you.</li><li> Connect the {@link com.trolltech.qt.gui.QPrintPreviewWidget#paintRequested paintRequested() } signal to a slot. <p>When the widget needs to generate a set of preview pages, a {@link com.trolltech.qt.gui.QPrintPreviewWidget#paintRequested paintRequested() } signal will be emitted from the widget. Connect a slot to this signal, and draw onto the {@link com.trolltech.qt.gui.QPrinter QPrinter} passed in as a signal parameter. Call {@link com.trolltech.qt.gui.QPrinter#newPage() QPrinter::newPage()}, to start a new page in the preview.</li></ol> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrinter QPrinter}, {@link com.trolltech.qt.gui.QPrintDialog QPrintDialog}, {@link com.trolltech.qt.gui.QPageSetupDialog QPageSetupDialog}, and {@link com.trolltech.qt.gui.QPrintPreviewDialog QPrintPreviewDialog}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QPrintPreviewWidget extends com.trolltech.qt.gui.QWidget
{
    
/**
This enum is used to describe zoom mode of the preview widget.
*/
@QtBlockedEnum
    public enum ZoomMode implements com.trolltech.qt.QtEnumerator {
/**
 The zoom is set to a custom zoom value.
*/

        CustomZoom(0),
/**
 This mode fits the current page to the width of the view.
*/

        FitToWidth(1),
/**
 This mode fits the current page inside the view.
*/

        FitInView(2);

        ZoomMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrintPreviewWidget$ZoomMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ZoomMode resolve(int value) {
            return (ZoomMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CustomZoom;
            case 1: return FitToWidth;
            case 2: return FitInView;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum is used to describe the view mode of the preview widget.
*/
@QtBlockedEnum
    public enum ViewMode implements com.trolltech.qt.QtEnumerator {
/**
 A mode where single pages in the preview is viewed.
*/

        SinglePageView(0),
/**
 A mode where the facing pages in the preview is viewed.
*/

        FacingPagesView(1),
/**
 A view mode where all the pages in the preview is viewed.
*/

        AllPagesView(2);

        ViewMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QPrintPreviewWidget$ViewMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ViewMode resolve(int value) {
            return (ViewMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SinglePageView;
            case 1: return FacingPagesView;
            case 2: return AllPagesView;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QPrinter(named: printer)&gt;:<p> This signal is emitted when the preview widget needs to generate a set of preview pages. <tt>printer</tt> is the printer associated with this preview widget.
*/

    public final Signal1<com.trolltech.qt.gui.QPrinter> paintRequested = new Signal1<com.trolltech.qt.gui.QPrinter>();

    private final void paintRequested(com.trolltech.qt.gui.QPrinter printer)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintRequested_QPrinter(nativeId(), printer == null ? 0 : printer.nativeId());
    }
    native void __qt_paintRequested_QPrinter(long __this__nativeId, long printer);
/**
 This signal is emitted whenever the preview widget has changed some internal state, such as the orientation.
*/

    public final Signal0 previewChanged = new Signal0();

    private final void previewChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_previewChanged(nativeId());
    }
    native void __qt_previewChanged(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    public QPrintPreviewWidget(com.trolltech.qt.gui.QPrinter printer, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... flags) {
        this(printer, parent, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
Constructs a QPrintPreviewWidget based on <tt>printer</tt> and with <tt>parent</tt> as the parent widget. The widget flags <tt>flags</tt> are passed on to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p><DT><b>See also:</b><br><DD>{@link QWidget#setWindowFlags(com.trolltech.qt.core.Qt.WindowType[]) QWidget::setWindowFlags()}. <br></DD></DT>
*/

    public QPrintPreviewWidget(com.trolltech.qt.gui.QPrinter printer, com.trolltech.qt.gui.QWidget parent) {
        this(printer, parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a QPrintPreviewWidget based on <tt>printer</tt> and with <tt>parent</tt> as the parent widget. The widget flags <tt>flags</tt> are passed on to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p><DT><b>See also:</b><br><DD>{@link QWidget#setWindowFlags(com.trolltech.qt.core.Qt.WindowType[]) QWidget::setWindowFlags()}. <br></DD></DT>
*/

    public QPrintPreviewWidget(com.trolltech.qt.gui.QPrinter printer) {
        this(printer, (com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a QPrintPreviewWidget based on <tt>printer</tt> and with <tt>parent</tt> as the parent widget. The widget flags <tt>flags</tt> are passed on to the {@link com.trolltech.qt.gui.QWidget QWidget} constructor. <p><DT><b>See also:</b><br><DD>{@link QWidget#setWindowFlags(com.trolltech.qt.core.Qt.WindowType[]) QWidget::setWindowFlags()}. <br></DD></DT>
*/

    public QPrintPreviewWidget(com.trolltech.qt.gui.QPrinter printer, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags flags){
        super((QPrivateConstructor)null);
        __qt_QPrintPreviewWidget_QPrinter_QWidget_WindowFlags(printer == null ? 0 : printer.nativeId(), parent == null ? 0 : parent.nativeId(), flags.value());
    }

    native void __qt_QPrintPreviewWidget_QPrinter_QWidget_WindowFlags(long printer, long parent, int flags);


/**
This is an overloaded method provided for convenience.
*/

    public QPrintPreviewWidget(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... flags) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
This is an overloaded member function, provided for convenience. <p>This will cause QPrintPreviewWidget to create an internal, default constructed {@link com.trolltech.qt.gui.QPrinter QPrinter} object, which will be used to generate the preview.
*/

    public QPrintPreviewWidget(com.trolltech.qt.gui.QWidget parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
This is an overloaded member function, provided for convenience. <p>This will cause QPrintPreviewWidget to create an internal, default constructed {@link com.trolltech.qt.gui.QPrinter QPrinter} object, which will be used to generate the preview.
*/

    public QPrintPreviewWidget() {
        this((com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
This is an overloaded member function, provided for convenience. <p>This will cause QPrintPreviewWidget to create an internal, default constructed {@link com.trolltech.qt.gui.QPrinter QPrinter} object, which will be used to generate the preview.
*/

    public QPrintPreviewWidget(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags flags){
        super((QPrivateConstructor)null);
        __qt_QPrintPreviewWidget_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), flags.value());
    }

    native void __qt_QPrintPreviewWidget_QWidget_WindowFlags(long parent, int flags);

/**
Returns the currently viewed page in the preview. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintPreviewWidget#setCurrentPage(int) setCurrentPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int currentPage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentPage(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentPage(long __this__nativeId);

/**
This is a convenience function and is the same as calling <tt>setZoomMode(QPrintPreviewWidget.:FitInView)</tt>.
*/

    public final void fitInView()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fitInView(nativeId());
    }
    native void __qt_fitInView(long __this__nativeId);

/**
This is a convenience function and is the same as calling <tt>setZoomMode(QPrintPreviewWidget.:FitToWidth)</tt>.
*/

    public final void fitToWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fitToWidth(nativeId());
    }
    native void __qt_fitToWidth(long __this__nativeId);

/**
Returns the number of pages in the preview.
*/

    @QtBlockedSlot
    public final int numPages()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_numPages(nativeId());
    }
    @QtBlockedSlot
    native int __qt_numPages(long __this__nativeId);

/**
Returns the current orientation of the preview. This value is obtained from the {@link com.trolltech.qt.gui.QPrinter QPrinter} object associated with the preview. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintPreviewWidget#setOrientation(com.trolltech.qt.gui.QPrinter.Orientation) setOrientation()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrinter.Orientation orientation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPrinter.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
Prints the preview to the printer associated with the preview.
*/

    public final void print()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_print(nativeId());
    }
    native void __qt_print(long __this__nativeId);

/**
This is a convenience function and is the same as calling <tt>setViewMode(QPrintPreviewWidget.:AllPagesView)</tt>.
*/

    public final void setAllPagesViewMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAllPagesViewMode(nativeId());
    }
    native void __qt_setAllPagesViewMode(long __this__nativeId);

/**
Sets the current page in the preview. This will cause the view to skip to the beginning of <tt>page</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintPreviewWidget#currentPage() currentPage()}. <br></DD></DT>
*/

    public final void setCurrentPage(int pageNumber)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentPage_int(nativeId(), pageNumber);
    }
    native void __qt_setCurrentPage_int(long __this__nativeId, int pageNumber);

/**
This is a convenience function and is the same as calling <tt>setViewMode(QPrintPreviewWidget.:FacingPagesView)</tt>.
*/

    public final void setFacingPagesViewMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFacingPagesViewMode(nativeId());
    }
    native void __qt_setFacingPagesViewMode(long __this__nativeId);

/**
This is a convenience function and is the same as calling <tt>setOrientation(QPrinter.:Landscape)</tt>.
*/

    public final void setLandscapeOrientation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLandscapeOrientation(nativeId());
    }
    native void __qt_setLandscapeOrientation(long __this__nativeId);

/**
Sets the current orientation to <tt>orientation</tt>. This value will be set on the {@link com.trolltech.qt.gui.QPrinter QPrinter} object associated with the preview. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintPreviewWidget#orientation() orientation()}. <br></DD></DT>
*/

    public final void setOrientation(com.trolltech.qt.gui.QPrinter.Orientation orientation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), orientation.value());
    }
    native void __qt_setOrientation_Orientation(long __this__nativeId, int orientation);

/**
This is a convenience function and is the same as calling <tt>setOrientation(QPrinter.:Landscape)</tt>.
*/

    public final void setPortraitOrientation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPortraitOrientation(nativeId());
    }
    native void __qt_setPortraitOrientation(long __this__nativeId);

/**
This is a convenience function and is the same as calling <tt>setViewMode(QPrintPreviewWidget.:SinglePageView)</tt>.
*/

    public final void setSinglePageViewMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSinglePageViewMode(nativeId());
    }
    native void __qt_setSinglePageViewMode(long __this__nativeId);

/**
Sets the view mode to <tt>mode</tt>. The default view mode is {@link com.trolltech.qt.gui.QPrintPreviewWidget.ViewMode SinglePageView }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintPreviewWidget#viewMode() viewMode()}. <br></DD></DT>
*/

    public final void setViewMode(com.trolltech.qt.gui.QPrintPreviewWidget.ViewMode viewMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewMode_ViewMode(nativeId(), viewMode.value());
    }
    native void __qt_setViewMode_ViewMode(long __this__nativeId, int viewMode);

/**
Sets the zoom factor of the view to <tt>factor</tt>. For example, a value of 1.0 indicates an unscaled view, which is approximately the size the view will have on paper. A value of 0.5 will halve the size of the view, while a value of 2.0 will double the size of the view. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintPreviewWidget#zoomFactor() zoomFactor()}. <br></DD></DT>
*/

    public final void setZoomFactor(double zoomFactor)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setZoomFactor_double(nativeId(), zoomFactor);
    }
    native void __qt_setZoomFactor_double(long __this__nativeId, double zoomFactor);

/**
Sets the zoom mode to <tt>zoomMode</tt>. The default zoom mode is {@link com.trolltech.qt.gui.QPrintPreviewWidget.ZoomMode FitInView }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintPreviewWidget#zoomMode() zoomMode()}, {@link com.trolltech.qt.gui.QPrintPreviewWidget#viewMode() viewMode()}, and {@link com.trolltech.qt.gui.QPrintPreviewWidget#setViewMode(com.trolltech.qt.gui.QPrintPreviewWidget.ViewMode) setViewMode()}. <br></DD></DT>
*/

    public final void setZoomMode(com.trolltech.qt.gui.QPrintPreviewWidget.ZoomMode zoomMode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setZoomMode_ZoomMode(nativeId(), zoomMode.value());
    }
    native void __qt_setZoomMode_ZoomMode(long __this__nativeId, int zoomMode);

/**
This function updates the preview, which causes the {@link com.trolltech.qt.gui.QPrintPreviewWidget#paintRequested paintRequested() } signal to be emitted.
*/

    public final void updatePreview()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updatePreview(nativeId());
    }
    native void __qt_updatePreview(long __this__nativeId);

/**
Returns the current view mode. The default view mode is {@link com.trolltech.qt.gui.QPrintPreviewWidget.ViewMode SinglePageView }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintPreviewWidget#setViewMode(com.trolltech.qt.gui.QPrintPreviewWidget.ViewMode) setViewMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrintPreviewWidget.ViewMode viewMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPrintPreviewWidget.ViewMode.resolve(__qt_viewMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_viewMode(long __this__nativeId);

/**
Returns the zoom factor of the view. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintPreviewWidget#setZoomFactor(double) setZoomFactor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double zoomFactor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_zoomFactor(nativeId());
    }
    @QtBlockedSlot
    native double __qt_zoomFactor(long __this__nativeId);


/**
Zooms the current view in by <tt>factor</tt>. The default value for <tt>factor</tt> is 1.1, which means the view will be scaled up by 10%.
*/

    public final void zoomIn() {
        zoomIn((double)1.1);
    }
/**
Zooms the current view in by <tt>factor</tt>. The default value for <tt>factor</tt> is 1.1, which means the view will be scaled up by 10%.
*/

    public final void zoomIn(double zoom)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_zoomIn_double(nativeId(), zoom);
    }
    native void __qt_zoomIn_double(long __this__nativeId, double zoom);

/**
Returns the current zoom mode. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPrintPreviewWidget#setZoomMode(com.trolltech.qt.gui.QPrintPreviewWidget.ZoomMode) setZoomMode()}, {@link com.trolltech.qt.gui.QPrintPreviewWidget#viewMode() viewMode()}, and {@link com.trolltech.qt.gui.QPrintPreviewWidget#setViewMode(com.trolltech.qt.gui.QPrintPreviewWidget.ViewMode) setViewMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPrintPreviewWidget.ZoomMode zoomMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPrintPreviewWidget.ZoomMode.resolve(__qt_zoomMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_zoomMode(long __this__nativeId);


/**
Zooms the current view out by <tt>factor</tt>. The default value for <tt>factor</tt> is 1.1, which means the view will be scaled down by 10%.
*/

    public final void zoomOut() {
        zoomOut((double)1.1);
    }
/**
Zooms the current view out by <tt>factor</tt>. The default value for <tt>factor</tt> is 1.1, which means the view will be scaled down by 10%.
*/

    public final void zoomOut(double zoom)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_zoomOut_double(nativeId(), zoom);
    }
    native void __qt_zoomOut_double(long __this__nativeId, double zoom);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), visible);
    }
    @QtBlockedSlot
    native void __qt_setVisible_boolean(long __this__nativeId, boolean visible);

/**
@exclude
*/

    public static native QPrintPreviewWidget fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QPrintPreviewWidget(QPrivateConstructor p) { super(p); } 
}
