package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDockWidget class provides a widget that can be docked inside a {@link com.trolltech.qt.gui.QMainWindow QMainWindow} or floated as a top-level window on the desktop. QDockWidget provides the concept of dock widgets, also know as tool palettes or utility windows. Dock windows are secondary windows placed in the dock widget area around the {@link com.trolltech.qt.gui.QMainWindow#centralWidget() central widget} in a {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. <br><center><img src="../images/mainwindow-docks.png"></center><br> Dock windows can be moved inside their current area, moved into new areas and floated (e.g., undocked) by the end-user. The QDockWidget API allows the programmer to restrict the dock widgets ability to move, float and close, as well as the areas in which they can be placed.<a name="appearance"><h2>Appearance</h2> A QDockWidget consists of a title bar and the content area. The title bar displays the dock widgets {@link QWidget#windowTitle() window title}, a float button and a close button. Depending on the state of the QDockWidget, the float and close buttons may be either disabled or not shown at all. <p>The visual appearance of the title bar and buttons is dependent on the {@link com.trolltech.qt.gui.QStyle style} in use. <p>A QDockWidget acts as a wrapper for its child widget, set with {@link com.trolltech.qt.gui.QDockWidget#setWidget(com.trolltech.qt.gui.QWidget) setWidget()}. Custom size hints, minimum and maximum sizes and size policies should be implemented in the child widget. QDockWidget will respect them, adjusting its own constraints to include the frame and title. Size constraints should not be set on the QDockWidget itself, because they change depending on whether it is docked; a docked QDockWidget has no frame and a smaller title bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QMainWindow QMainWindow}, and {@link <a href="../mainwindows-dockwidgets.html">Dock Widgets Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDockWidget extends com.trolltech.qt.gui.QWidget
{
    @QtBlockedEnum
    public enum DockWidgetFeature implements com.trolltech.qt.QtEnumerator {
/**
 The dock widget can be closed. On some systems the dock widget always has a close button when it's floating (for example on MacOS 10.5).
*/

        DockWidgetClosable(1),
/**
 The dock widget can be moved between docks by the user.
*/

        DockWidgetMovable(2),
/**
 The dock widget can be detached from the main window, and floated as an independent window.
*/

        DockWidgetFloatable(4),
/**
 The dock widget displays a vertical title bar on its left side. This can be used to increase the amount of vertical space in a {@link com.trolltech.qt.gui.QMainWindow QMainWindow}.
*/

        DockWidgetVerticalTitleBar(8),
        DockWidgetFeatureMask(15),
/**
 (Deprecated) The dock widget can be closed, moved, and floated. Since new features might be added in future releases, the look and behavior of dock widgets might change if you use this flag. Please specify individual flags instead.
*/

        AllDockWidgetFeatures(7),
/**
 The dock widget cannot be closed, moved, or floated.
*/

        NoDockWidgetFeatures(0),
        Reserved(255);

        DockWidgetFeature(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QDockWidget$DockWidgetFeatures with the specified <tt>com.trolltech.qt.gui.QDockWidget$DockWidgetFeature[]</tt> QDockWidget$DockWidgetFeature values set.</brief>
*/

        public static DockWidgetFeatures createQFlags(DockWidgetFeature ... values) {
            return new DockWidgetFeatures(values);
        }
/**
<brief>Returns the QDockWidget$DockWidgetFeature constant with the specified <tt>int</tt>.</brief>
*/

        public static DockWidgetFeature resolve(int value) {
            return (DockWidgetFeature) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return DockWidgetClosable;
            case 2: return DockWidgetMovable;
            case 4: return DockWidgetFloatable;
            case 8: return DockWidgetVerticalTitleBar;
            case 15: return DockWidgetFeatureMask;
            case 7: return AllDockWidgetFeatures;
            case 0: return NoDockWidgetFeatures;
            case 255: return Reserved;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class DockWidgetFeatures extends com.trolltech.qt.QFlags<DockWidgetFeature> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QDockWidget-DockWidgetFeatures with the specified <tt>com.trolltech.qt.gui.QDockWidget.DockWidgetFeature[]</tt>. flags set.</brief>
*/

        public DockWidgetFeatures(DockWidgetFeature ... args) { super(args); }
        public DockWidgetFeatures(int value) { setValue(value); }
    }


/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.Qt$DockWidgetAreas(named: allowedAreas)&gt;:<p> This signal is emitted when the {@link QDockWidget#allowedAreas() allowedAreas} property changes. The <tt>allowedAreas</tt> parameter gives the new value of the property.
*/

    public final Signal1<com.trolltech.qt.core.Qt.DockWidgetAreas> allowedAreasChanged = new Signal1<com.trolltech.qt.core.Qt.DockWidgetAreas>();

    private final void allowedAreasChanged(com.trolltech.qt.core.Qt.DockWidgetAreas allowedAreas)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_allowedAreasChanged_DockWidgetAreas(nativeId(), allowedAreas.value());
    }
    native void __qt_allowedAreasChanged_DockWidgetAreas(long __this__nativeId, int allowedAreas);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.Qt$DockWidgetArea(named: area)&gt;:<p> This signal is emitted when the dock widget is moved to another dock <tt>area</tt>, or is moved to a different location in its current dock area. This happens when the dock widget is moved programmatically or is dragged to a new location by the user.
*/

    public final Signal1<com.trolltech.qt.core.Qt.DockWidgetArea> dockLocationChanged = new Signal1<com.trolltech.qt.core.Qt.DockWidgetArea>();

    private final void dockLocationChanged(com.trolltech.qt.core.Qt.DockWidgetArea area)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dockLocationChanged_DockWidgetArea(nativeId(), area.value());
    }
    native void __qt_dockLocationChanged_DockWidgetArea(long __this__nativeId, int area);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QDockWidget$DockWidgetFeatures(named: features)&gt;:<p> This signal is emitted when the {@link QDockWidget#features() features} property changes. The <tt>features</tt> parameter gives the new value of the property.
*/

    public final Signal1<com.trolltech.qt.gui.QDockWidget.DockWidgetFeatures> featuresChanged = new Signal1<com.trolltech.qt.gui.QDockWidget.DockWidgetFeatures>();

    private final void featuresChanged(com.trolltech.qt.gui.QDockWidget.DockWidgetFeatures features)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_featuresChanged_DockWidgetFeatures(nativeId(), features.value());
    }
    native void __qt_featuresChanged_DockWidgetFeatures(long __this__nativeId, int features);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: topLevel)&gt;:<p> This signal is emitted when the {@link QDockWidget#isFloating() floating} property changes. The <tt>topLevel</tt> parameter is true if the dock widget is now floating; otherwise it is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#isWindow() isWindow()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Boolean> topLevelChanged = new Signal1<java.lang.Boolean>();

    private final void topLevelChanged(boolean topLevel)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_topLevelChanged_boolean(nativeId(), topLevel);
    }
    native void __qt_topLevelChanged_boolean(long __this__nativeId, boolean topLevel);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Boolean(named: visible)&gt;:<p> This signal is emitted when the dock widget becomes <tt>visible</tt> (or invisible). This happens when the widget is hidden or shown, as well as when it is docked in a tabbed dock area and its tab becomes selected or unselected.
*/

    public final Signal1<java.lang.Boolean> visibilityChanged = new Signal1<java.lang.Boolean>();

    private final void visibilityChanged(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_visibilityChanged_boolean(nativeId(), visible);
    }
    native void __qt_visibilityChanged_boolean(long __this__nativeId, boolean visible);


/**
This is an overloaded method provided for convenience.
*/

    public QDockWidget(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... flags) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
Constructs a QDockWidget with parent <tt>parent</tt> and window flags <tt>flags</tt>. The dock widget will be placed in the left dock widget area.
*/

    public QDockWidget(com.trolltech.qt.gui.QWidget parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a QDockWidget with parent <tt>parent</tt> and window flags <tt>flags</tt>. The dock widget will be placed in the left dock widget area.
*/

    public QDockWidget() {
        this((com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a QDockWidget with parent <tt>parent</tt> and window flags <tt>flags</tt>. The dock widget will be placed in the left dock widget area.
*/

    public QDockWidget(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags flags){
        super((QPrivateConstructor)null);
        __qt_QDockWidget_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), flags.value());
    }

    native void __qt_QDockWidget_QWidget_WindowFlags(long parent, int flags);


/**
This is an overloaded method provided for convenience.
*/

    public QDockWidget(java.lang.String title, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... flags) {
        this(title, parent, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
Constructs a QDockWidget with parent <tt>parent</tt> and window flags <tt>flags</tt>. The dock widget will be placed in the left dock widget area. <p>The window title is set to <tt>title</tt>. This title is used when the QDockWidget is docked and undocked. It is also used in the context menu provided by {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. <p><DT><b>See also:</b><br><DD>setWindowTitle(). <br></DD></DT>
*/

    public QDockWidget(java.lang.String title, com.trolltech.qt.gui.QWidget parent) {
        this(title, parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a QDockWidget with parent <tt>parent</tt> and window flags <tt>flags</tt>. The dock widget will be placed in the left dock widget area. <p>The window title is set to <tt>title</tt>. This title is used when the QDockWidget is docked and undocked. It is also used in the context menu provided by {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. <p><DT><b>See also:</b><br><DD>setWindowTitle(). <br></DD></DT>
*/

    public QDockWidget(java.lang.String title) {
        this(title, (com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a QDockWidget with parent <tt>parent</tt> and window flags <tt>flags</tt>. The dock widget will be placed in the left dock widget area. <p>The window title is set to <tt>title</tt>. This title is used when the QDockWidget is docked and undocked. It is also used in the context menu provided by {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. <p><DT><b>See also:</b><br><DD>setWindowTitle(). <br></DD></DT>
*/

    public QDockWidget(java.lang.String title, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags flags){
        super((QPrivateConstructor)null);
        __qt_QDockWidget_String_QWidget_WindowFlags(title, parent == null ? 0 : parent.nativeId(), flags.value());
    }

    native void __qt_QDockWidget_String_QWidget_WindowFlags(java.lang.String title, long parent, int flags);

/**
This property holds areas where the dock widget may be placed. The default is {@link com.trolltech.qt.core.Qt.DockWidgetArea Qt::AllDockWidgetAreas }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.DockWidgetArea Qt::DockWidgetArea }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.DockWidgetAreas allowedAreas()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.DockWidgetAreas(__qt_allowedAreas(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_allowedAreas(long __this__nativeId);

/**
This property holds whether the dock widget is movable, closable, and floatable. By default, this property is set to a combination of {@link com.trolltech.qt.gui.QDockWidget.DockWidgetFeature DockWidgetClosable }, {@link com.trolltech.qt.gui.QDockWidget.DockWidgetFeature DockWidgetMovable } and {@link com.trolltech.qt.gui.QDockWidget.DockWidgetFeature DockWidgetFloatable }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDockWidget.DockWidgetFeature DockWidgetFeature }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="features")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QDockWidget.DockWidgetFeatures features()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QDockWidget.DockWidgetFeatures(__qt_features(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_features(long __this__nativeId);

    @QtBlockedSlot
    private final void initStyleOption(com.trolltech.qt.QNativePointer option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer(nativeId(), option);
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer option);

/**
Returns true if this dock widget can be placed in the given <tt>area</tt>; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isAreaAllowed(com.trolltech.qt.core.Qt.DockWidgetArea area)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAreaAllowed_DockWidgetArea(nativeId(), area.value());
    }
    @QtBlockedSlot
    native boolean __qt_isAreaAllowed_DockWidgetArea(long __this__nativeId, int area);

/**
This property holds whether the dock widget is floating. A floating dock widget is presented to the user as an independent window "on top" of its parent {@link com.trolltech.qt.gui.QMainWindow QMainWindow}, instead of being docked in the {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. <p>By default, this property is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#isWindow() isWindow()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="floating")
    @QtBlockedSlot
    public final boolean isFloating()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFloating(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFloating(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAllowedAreas(com.trolltech.qt.core.Qt.DockWidgetArea ... areas) {
        this.setAllowedAreas(new com.trolltech.qt.core.Qt.DockWidgetAreas(areas));
    }
/**
This property holds areas where the dock widget may be placed. The default is {@link com.trolltech.qt.core.Qt.DockWidgetArea Qt::AllDockWidgetAreas }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.DockWidgetArea Qt::DockWidgetArea }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAllowedAreas(com.trolltech.qt.core.Qt.DockWidgetAreas areas)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAllowedAreas_DockWidgetAreas(nativeId(), areas.value());
    }
    @QtBlockedSlot
    native void __qt_setAllowedAreas_DockWidgetAreas(long __this__nativeId, int areas);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setFeatures(com.trolltech.qt.gui.QDockWidget.DockWidgetFeature ... features) {
        this.setFeatures(new com.trolltech.qt.gui.QDockWidget.DockWidgetFeatures(features));
    }
/**
This property holds whether the dock widget is movable, closable, and floatable. By default, this property is set to a combination of {@link com.trolltech.qt.gui.QDockWidget.DockWidgetFeature DockWidgetClosable }, {@link com.trolltech.qt.gui.QDockWidget.DockWidgetFeature DockWidgetMovable } and {@link com.trolltech.qt.gui.QDockWidget.DockWidgetFeature DockWidgetFloatable }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDockWidget.DockWidgetFeature DockWidgetFeature }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="features")
    @QtBlockedSlot
    public final void setFeatures(com.trolltech.qt.gui.QDockWidget.DockWidgetFeatures features)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFeatures_DockWidgetFeatures(nativeId(), features.value());
    }
    @QtBlockedSlot
    native void __qt_setFeatures_DockWidgetFeatures(long __this__nativeId, int features);

/**
This property holds whether the dock widget is floating. A floating dock widget is presented to the user as an independent window "on top" of its parent {@link com.trolltech.qt.gui.QMainWindow QMainWindow}, instead of being docked in the {@link com.trolltech.qt.gui.QMainWindow QMainWindow}. <p>By default, this property is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#isWindow() isWindow()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="floating")
    @QtBlockedSlot
    public final void setFloating(boolean floating)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFloating_boolean(nativeId(), floating);
    }
    @QtBlockedSlot
    native void __qt_setFloating_boolean(long __this__nativeId, boolean floating);

/**
Sets an arbitrary <tt>widget</tt> as the dock widget's title bar. If <tt>widget</tt> is 0, the title bar widget is removed, but not deleted. <p>If a title bar widget is set, QDockWidget will not use native window decorations when it is floated. <p>Here are some tips for implementing custom title bars: <ul><li> Mouse events that are not explicitly handled by the title bar widget must be ignored by calling {@link com.trolltech.qt.core.QEvent#ignore() QMouseEvent::ignore()}. These events then propagate to the QDockWidget parent, which handles them in the usual manner, moving when the title bar is dragged, docking and undocking when it is double-clicked, etc.</li><li> When {@link com.trolltech.qt.gui.QDockWidget.DockWidgetFeature DockWidgetVerticalTitleBar } is set on QDockWidget, the title bar widget is repositioned accordingly. In {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}, the title bar should check what orientation it should assume: <pre class="snippet">
       QDockWidget dockWidget = (QDockWidget)parentWidget();
       if (dockWidget.features().isSet(QDockWidget.DockWidgetFeature.DockWidgetVerticalTitleBar)) {
           // I need to be vertical
       } else {
           // I need to be horizontal
       }
</li></pre><li> The title bar widget must have a valid {@link QWidget#sizeHint() QWidget::sizeHint()} and {@link QWidget#minimumSizeHint() QWidget::minimumSizeHint()}. These functions should take into account the current orientation of the title bar.</li></ul> Using qobject_cast as shown above, the title bar widget has full access to its parent QDockWidget. Hence it can perform such operations as docking and hiding in response to user actions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDockWidget#titleBarWidget() titleBarWidget()}, and {@link com.trolltech.qt.gui.QDockWidget.DockWidgetFeature DockWidgetVerticalTitleBar }. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setTitleBarWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTitleBarWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setTitleBarWidget_QWidget(long __this__nativeId, long widget);

/**
Sets the widget for the dock widget to <tt>widget</tt>. <p>If the dock widget is visible when <tt>widget</tt> is added, you must {@link com.trolltech.qt.gui.QWidget#show() show()} it explicitly. <p>Note that you must add the layout of the <tt>widget</tt> before you call this function; if not, the <tt>widget</tt> will not be visible. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDockWidget#widget() widget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setWidget_QWidget(long __this__nativeId, long widget);

/**
Returns the custom title bar widget set on the QDockWidget, or 0 if no custom title bar has been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDockWidget#setTitleBarWidget(com.trolltech.qt.gui.QWidget) setTitleBarWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget titleBarWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_titleBarWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_titleBarWidget(long __this__nativeId);

/**
Returns a checkable action that can be used to show or close this dock widget. <p>The action's text is set to the dock widget's window title. <p><DT><b>See also:</b><br><DD>{@link QAction#text() QAction::text}, and {@link QWidget#windowTitle() QWidget::windowTitle}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAction toggleViewAction()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toggleViewAction(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAction __qt_toggleViewAction(long __this__nativeId);

/**
Returns the widget for the dock widget. This function returns zero if the widget has not been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDockWidget#setWidget(com.trolltech.qt.gui.QWidget) setWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget widget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widget(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void closeEvent(com.trolltech.qt.gui.QCloseEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeEvent_QCloseEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_closeEvent_QCloseEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long event);

/**
@exclude
*/

    public static native QDockWidget fromNativePointer(QNativePointer nativePointer);

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

    protected QDockWidget(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QDockWidget. This
method is useful for subclasses when they need a QStyleOption, but
don't want to fill in all the information themselves.
*/

    protected final void initStyleOption(QStyleOptionDockWidget option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
