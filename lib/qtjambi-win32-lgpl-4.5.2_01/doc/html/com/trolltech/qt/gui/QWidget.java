package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QWidget class is the base class of all user interface objects. The widget is the atom of the user interface: it receives mouse, keyboard and other events from the window system, and paints a representation of itself on the screen. Every widget is rectangular, and they are sorted in a Z-order. A widget is clipped by its parent and by the widgets in front of it. <p>A widget that is not embedded in a parent widget is called a window. Usually, windows have a frame and a title bar, although it is also possible to create windows without such decoration using suitable window flags). In Qt, {@link com.trolltech.qt.gui.QMainWindow QMainWindow} and the various subclasses of {@link com.trolltech.qt.gui.QDialog QDialog} are the most common window types. <p>Every widget's constructor accepts one or two standard arguments: <ol><li> <tt>QWidget *parent = 0</tt> is the parent of the new widget. If it is 0 (the default), the new widget will be a window. If not, it will be a child of parent, and be constrained by parent's geometry (unless you specify {@link com.trolltech.qt.core.Qt.WindowType Qt::Window } as window flag).</li><li> <tt>Qt::WindowFlags f = 0</tt> (where available) sets the window flags; the default is suitable for almost all widgets, but to get, for example, a window without a window system frame, you must use special flags.</li></ol> QWidget has many member functions, but some of them have little direct functionality; for example, QWidget has a font property, but never uses this itself. There are many subclasses which provide real functionality, such as {@link com.trolltech.qt.gui.QLabel QLabel}, {@link com.trolltech.qt.gui.QPushButton QPushButton}, {@link com.trolltech.qt.gui.QListWidget QListWidget}, and {@link com.trolltech.qt.gui.QTabWidget QTabWidget}.<a name="top-level-and-child-widgets"><h2>Top-Level and Child Widgets</h2> A widget without a parent widget is always an independent window (top-level widget). For these widgets, {@link com.trolltech.qt.gui.QWidget#setWindowTitle(java.lang.String) setWindowTitle()} and {@link com.trolltech.qt.gui.QWidget#setWindowIcon(com.trolltech.qt.gui.QIcon) setWindowIcon()} set the title bar and icon respectively. <p>Non-window widgets are child widgets, displayed within their parent widgets. Most widgets in Qt are mainly useful as child widgets. For example, it is possible to display a button as a top-level window, but most people prefer to put their buttons inside other widgets, such as {@link com.trolltech.qt.gui.QDialog QDialog}. <br><center><img src="../images/parent-child-widgets.png"></center><br> The diagram above shows a {@link com.trolltech.qt.gui.QGroupBox QGroupBox} widget being used to hold various child widgets in a layout provided by {@link com.trolltech.qt.gui.QGridLayout QGridLayout}. The {@link com.trolltech.qt.gui.QLabel QLabel} child widgets have been outlined to indicate their full sizes. <p>If you want to use a QWidget to hold child widgets you will usually want to add a layout to the parent QWidget. See {@link <a href="../qtjambi-layout.html">Layout Classes</a>} for more information.<a name="composite-widgets"><h2>Composite Widgets</h2> When a widget is used as a container to group a number of child widgets, it is known as a composite widget. These can be created by constructing a widget with the required visual properties - a {@link com.trolltech.qt.gui.QFrame QFrame}, for example - and adding child widgets to it, usually managed by a layout. The above diagram shows such a composite widget that was created using {@link <a href="../designer-manual.html">Qt Designer</a>}. <p>Composite widgets can also be created by subclassing a standard widget, such as QWidget or {@link com.trolltech.qt.gui.QFrame QFrame}, and adding the necessary layout and child widgets in the constructor of the subclass. Many of the {@link <a href="../examples.html">examples provided with Qt</a>} use this approach, and it is also covered in the Qt {@link <a href="../tutorials.html">Tutorials</a>}.<a name="custom-widgets-and-painting"><h2>Custom Widgets and Painting</h2> Since QWidget is a subclass of {@link com.trolltech.qt.gui.QPaintDevice QPaintDevice}, subclasses can be used to display custom content that is composed using a series of painting operations with an instance of the {@link com.trolltech.qt.gui.QPainter QPainter} class. This approach contrasts with the canvas-style approach used by the {@link <a href="../graphicsview.html">Graphics View Framework</a>} where items are added to a scene by the application and are rendered by the framework itself. <p>Each widget performs all painting operations from within its {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()} function. This is called whenever the widget needs to be redrawn, either as a result of some external change or when requested by the application. <p>The {@link <a href="../qtjambi-analogclock.html">Analog Clock example</a>} shows how a simple widget can handle paint events.<a name="size-hints-and-size-policies"><h2>Size Hints and Size Policies</h2> When implementing a new widget, it is almost always useful to reimplement {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()} to provide a reasonable default size for the widget and to set the correct size policy with {@link com.trolltech.qt.gui.QWidget#setSizePolicy(com.trolltech.qt.gui.QSizePolicy) setSizePolicy()}. <p>By default, composite widgets which do not provide a size hint will be sized according to the space requirements of their child widgets. <p>The size policy lets you supply good default behavior for the layout management system, so that other widgets can contain and manage yours easily. The default size policy indicates that the size hint represents the preferred size of the widget, and this is often good enough for many widgets. <p><b>Note:</b> The size of top-level widgets are constrained to 2/3 of the desktop's height and width. You can {@link com.trolltech.qt.gui.QWidget#resize(com.trolltech.qt.core.QSize) resize()} the widget manually if these bounds are inadequate.<a name="events"><h2>Events</h2> Widgets respond to events that are typically caused by user actions. Qt delivers events to widgets by calling specific event handler functions with instances of {@link com.trolltech.qt.core.QEvent QEvent} subclasses containing information about each event. <p>If your widget only contains child widgets, you probably do not need to implement any event handlers. If you want to detect a mouse click in a child widget call the child's {@link com.trolltech.qt.gui.QWidget#underMouse() underMouse()} function inside the widget's {@link com.trolltech.qt.gui.QWidget#mousePressEvent(com.trolltech.qt.gui.QMouseEvent) mousePressEvent()}. <p>The {@link <a href="../qtjambi-scribble.html">Scribble example</a>} implements a wider set of events to handle mouse movement, button presses, and window resizing. <p>You will need to supply the behavior and content for your own widgets, but here is a brief overview of the events that are relevant to QWidget, starting with the most common ones: <ul><li> {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()} is called whenever the widget needs to be repainted. Every widget displaying custom content must implement it. Painting using a {@link com.trolltech.qt.gui.QPainter QPainter} can only take place in a {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()} or a function called by a {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}.</li><li> {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()} is called when the widget has been resized.</li><li> {@link com.trolltech.qt.gui.QWidget#mousePressEvent(com.trolltech.qt.gui.QMouseEvent) mousePressEvent()} is called when a mouse button is pressed while the mouse cursor is inside the widget, or when the widget has grabbed the mouse using {@link com.trolltech.qt.gui.QWidget#grabMouse() grabMouse()}. Pressing the mouse without releasing it is effectively the same as calling {@link com.trolltech.qt.gui.QWidget#grabMouse() grabMouse()}.</li><li> {@link com.trolltech.qt.gui.QWidget#mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent) mouseReleaseEvent()} is called when a mouse button is released. A widget receives mouse release events when it has received the corresponding mouse press event. This means that if the user presses the mouse inside your widget, then drags the mouse somewhere else before releasing the mouse button, your widget receives the release event. There is one exception: if a popup menu appears while the mouse button is held down, this popup immediately steals the mouse events.</li><li> {@link com.trolltech.qt.gui.QWidget#mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent) mouseDoubleClickEvent()} is called when the user double-clicks in the widget. If the user double-clicks, the widget receives a mouse press event, a mouse release event and finally this event instead of a second mouse press event. (Some mouse move events may also be received if the mouse is not held steady during this operation.) It is not possible to distinguish a click from a double-click until the second click arrives. (This is one reason why most GUI books recommend that double-clicks be an extension of single-clicks, rather than trigger a different action.)</li></ul> Widgets that accept keyboard input need to reimplement a few more event handlers: <ul><li> {@link com.trolltech.qt.gui.QWidget#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) keyPressEvent()} is called whenever a key is pressed, and again when a key has been held down long enough for it to auto-repeat. The <b>Tab</b> and <b>Shift+Tab</b> keys are only passed to the widget if they are not used by the focus-change mechanisms. To force those keys to be processed by your widget, you must reimplement QWidget::event().</li><li> {@link com.trolltech.qt.gui.QWidget#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()} is called when the widget gains keyboard focus (assuming you have called {@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) setFocusPolicy()}). Well-behaved widgets indicate that they own the keyboard focus in a clear but discreet way.</li><li> {@link com.trolltech.qt.gui.QWidget#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()} is called when the widget loses keyboard focus.</li></ul> You may be required to also reimplement some of the less common event handlers: <ul><li> {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()} is called whenever the mouse moves while a mouse button is held down. This can be useful during drag and drop operations. If you call setMouseTracking(true), you get mouse move events even when no buttons are held down. (See also the {@link <a href="../qtjambi-dnd.html">Drag and Drop</a>} guide.)</li><li> {@link com.trolltech.qt.gui.QWidget#keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent) keyReleaseEvent()} is called whenever a key is released and while it is held down (if the key is auto-repeating). In that case, the widget will receive a pair of key release and key press event for every repeat. The <b>Tab</b> and <b>Shift+Tab</b> keys are only passed to the widget if they are not used by the focus-change mechanisms. To force those keys to be processed by your widget, you must reimplement QWidget::event().</li><li> {@link com.trolltech.qt.gui.QWidget#wheelEvent(com.trolltech.qt.gui.QWheelEvent) wheelEvent()} is called whenever the user turns the mouse wheel while the widget has the focus.</li><li> {@link com.trolltech.qt.gui.QWidget#enterEvent(com.trolltech.qt.core.QEvent) enterEvent()} is called when the mouse enters the widget's screen space. (This excludes screen space owned by any of the widget's children.)</li><li> {@link com.trolltech.qt.gui.QWidget#leaveEvent(com.trolltech.qt.core.QEvent) leaveEvent()} is called when the mouse leaves the widget's screen space. If the mouse enters a child widget it will not cause a {@link com.trolltech.qt.gui.QWidget#leaveEvent(com.trolltech.qt.core.QEvent) leaveEvent()}.</li><li> {@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()} is called when the widget has been moved relative to its parent.</li><li> {@link com.trolltech.qt.gui.QWidget#closeEvent(com.trolltech.qt.gui.QCloseEvent) closeEvent()} is called when the user closes the widget (or when {@link com.trolltech.qt.gui.QWidget#close() close()} is called).</li></ul> There are also some rather obscure events described in the documentation for {@link com.trolltech.qt.core.QEvent.Type QEvent::Type }. To handle these events, you need to reimplement event() directly. <p>The default implementation of event() handles <b>Tab</b> and <b>Shift+Tab</b> (to move the keyboard focus), and passes on most of the other events to one of the more specialized handlers above. <p>Events and the mechanism used to deliver them are covered in the {@link <a href="../eventsandfilters.html">Events and Event Filters</a>} document.<a name="groups-of-functions-and-properties"><h2>Groups of Functions and Properties</h2> <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Context</center></th><th><center> Functions and Properties</center></th></tr></thead><tr valign="top" class="even"><td> Window functions</td><td> {@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QWidget#hide() hide()}, {@link com.trolltech.qt.gui.QWidget#raise() raise()}, {@link com.trolltech.qt.gui.QWidget#lower() lower()}, {@link com.trolltech.qt.gui.QWidget#close() close()}.</td></tr><tr valign="top" class="odd"><td> Top-level windows</td><td> {@link QWidget#isWindowModified() windowModified}, {@link QWidget#windowTitle() windowTitle}, {@link QWidget#windowIcon() windowIcon}, {@link QWidget#windowIconText() windowIconText}, {@link QWidget#isActiveWindow() isActiveWindow}, {@link com.trolltech.qt.gui.QWidget#activateWindow() activateWindow()}, {@link QWidget#isMinimized() minimized}, {@link com.trolltech.qt.gui.QWidget#showMinimized() showMinimized()}, {@link QWidget#isMaximized() maximized}, {@link com.trolltech.qt.gui.QWidget#showMaximized() showMaximized()}, {@link QWidget#isFullScreen() fullScreen}, {@link com.trolltech.qt.gui.QWidget#showFullScreen() showFullScreen()}, {@link com.trolltech.qt.gui.QWidget#showNormal() showNormal()}.</td></tr><tr valign="top" class="even"><td> Window contents</td><td> {@link com.trolltech.qt.gui.QWidget#update() update()}, {@link com.trolltech.qt.gui.QWidget#repaint() repaint()}, {@link com.trolltech.qt.gui.QWidget#scroll(int, int) scroll()}.</td></tr><tr valign="top" class="odd"><td> Geometry</td><td> {@link QWidget#pos() pos}, {@link com.trolltech.qt.gui.QWidget#x() x()}, {@link com.trolltech.qt.gui.QWidget#y() y()}, {@link QWidget#rect() rect}, {@link QWidget#size() size}, {@link com.trolltech.qt.gui.QWidget#width() width()}, {@link com.trolltech.qt.gui.QWidget#height() height()}, {@link com.trolltech.qt.gui.QWidget#move(com.trolltech.qt.core.QPoint) move()}, {@link com.trolltech.qt.gui.QWidget#resize(com.trolltech.qt.core.QSize) resize()}, {@link QWidget#sizePolicy() sizePolicy}, {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()}, {@link com.trolltech.qt.gui.QWidget#minimumSizeHint() minimumSizeHint()}, {@link com.trolltech.qt.gui.QWidget#updateGeometry() updateGeometry()}, {@link com.trolltech.qt.gui.QWidget#layout() layout()}, {@link QWidget#frameGeometry() frameGeometry}, {@link QWidget#geometry() geometry}, {@link QWidget#childrenRect() childrenRect}, {@link QWidget#childrenRegion() childrenRegion}, {@link com.trolltech.qt.gui.QWidget#adjustSize() adjustSize()}, {@link com.trolltech.qt.gui.QWidget#mapFromGlobal(com.trolltech.qt.core.QPoint) mapFromGlobal()}, {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) mapToGlobal()}, {@link com.trolltech.qt.gui.QWidget#mapFromParent(com.trolltech.qt.core.QPoint) mapFromParent()}, {@link com.trolltech.qt.gui.QWidget#mapToParent(com.trolltech.qt.core.QPoint) mapToParent()}, {@link QWidget#maximumSize() maximumSize}, {@link QWidget#minimumSize() minimumSize}, {@link QWidget#sizeIncrement() sizeIncrement}, {@link QWidget#baseSize() baseSize}, {@link com.trolltech.qt.gui.QWidget#setFixedSize(com.trolltech.qt.core.QSize) setFixedSize()}</td></tr><tr valign="top" class="even"><td> Mode</td><td> {@link QWidget#isVisible() visible}, {@link com.trolltech.qt.gui.QWidget#isVisibleTo(com.trolltech.qt.gui.QWidget) isVisibleTo()}, {@link QWidget#isEnabled() enabled}, {@link com.trolltech.qt.gui.QWidget#isEnabledTo(com.trolltech.qt.gui.QWidget) isEnabledTo()}, {@link QWidget#isModal() modal}, {@link com.trolltech.qt.gui.QWidget#isWindow() isWindow()}, {@link QWidget#hasMouseTracking() mouseTracking}, {@link QWidget#updatesEnabled() updatesEnabled}, {@link com.trolltech.qt.gui.QWidget#visibleRegion() visibleRegion()}.</td></tr><tr valign="top" class="odd"><td> Look and feel</td><td> {@link com.trolltech.qt.gui.QWidget#style() style()}, {@link com.trolltech.qt.gui.QWidget#setStyle(com.trolltech.qt.gui.QStyle) setStyle()}, {@link QWidget#styleSheet() styleSheet}, {@link QWidget#cursor() cursor}, {@link QWidget#font() font}, {@link QWidget#palette() palette}, {@link com.trolltech.qt.gui.QWidget#backgroundRole() backgroundRole()}, {@link com.trolltech.qt.gui.QWidget#setBackgroundRole(com.trolltech.qt.gui.QPalette.ColorRole) setBackgroundRole()}, {@link com.trolltech.qt.gui.QWidget#fontInfo() fontInfo()}, {@link com.trolltech.qt.gui.QWidget#fontMetrics() fontMetrics()}.</td></tr><tr valign="top" class="even"><td> Keyboard focus functions</td><td> {@link QWidget#hasFocus() focus}, {@link QWidget#focusPolicy() focusPolicy}, {@link com.trolltech.qt.gui.QWidget#setFocus() setFocus()}, {@link com.trolltech.qt.gui.QWidget#clearFocus() clearFocus()}, {@link com.trolltech.qt.gui.QWidget#setTabOrder(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QWidget) setTabOrder()}, {@link com.trolltech.qt.gui.QWidget#setFocusProxy(com.trolltech.qt.gui.QWidget) setFocusProxy()}, {@link com.trolltech.qt.gui.QWidget#focusNextChild() focusNextChild()}, {@link com.trolltech.qt.gui.QWidget#focusPreviousChild() focusPreviousChild()}.</td></tr><tr valign="top" class="odd"><td> Mouse and keyboard grabbing</td><td> {@link com.trolltech.qt.gui.QWidget#grabMouse() grabMouse()}, {@link com.trolltech.qt.gui.QWidget#releaseMouse() releaseMouse()}, {@link com.trolltech.qt.gui.QWidget#grabKeyboard() grabKeyboard()}, {@link com.trolltech.qt.gui.QWidget#releaseKeyboard() releaseKeyboard()}, {@link com.trolltech.qt.gui.QWidget#mouseGrabber() mouseGrabber()}, {@link com.trolltech.qt.gui.QWidget#keyboardGrabber() keyboardGrabber()}.</td></tr><tr valign="top" class="even"><td> Event handlers</td><td> event(), {@link com.trolltech.qt.gui.QWidget#mousePressEvent(com.trolltech.qt.gui.QMouseEvent) mousePressEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent) mouseReleaseEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent) mouseDoubleClickEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()}, {@link com.trolltech.qt.gui.QWidget#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) keyPressEvent()}, {@link com.trolltech.qt.gui.QWidget#keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent) keyReleaseEvent()}, {@link com.trolltech.qt.gui.QWidget#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()}, {@link com.trolltech.qt.gui.QWidget#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()}, {@link com.trolltech.qt.gui.QWidget#wheelEvent(com.trolltech.qt.gui.QWheelEvent) wheelEvent()}, {@link com.trolltech.qt.gui.QWidget#enterEvent(com.trolltech.qt.core.QEvent) enterEvent()}, {@link com.trolltech.qt.gui.QWidget#leaveEvent(com.trolltech.qt.core.QEvent) leaveEvent()}, {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}, {@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()}, {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}, {@link com.trolltech.qt.gui.QWidget#closeEvent(com.trolltech.qt.gui.QCloseEvent) closeEvent()}, {@link com.trolltech.qt.gui.QWidget#dragEnterEvent(com.trolltech.qt.gui.QDragEnterEvent) dragEnterEvent()}, {@link com.trolltech.qt.gui.QWidget#dragMoveEvent(com.trolltech.qt.gui.QDragMoveEvent) dragMoveEvent()}, {@link com.trolltech.qt.gui.QWidget#dragLeaveEvent(com.trolltech.qt.gui.QDragLeaveEvent) dragLeaveEvent()}, {@link com.trolltech.qt.gui.QWidget#dropEvent(com.trolltech.qt.gui.QDropEvent) dropEvent()}, {@link com.trolltech.qt.core.QObject#childEvent(com.trolltech.qt.core.QChildEvent) childEvent()}, {@link com.trolltech.qt.gui.QWidget#showEvent(com.trolltech.qt.gui.QShowEvent) showEvent()}, {@link com.trolltech.qt.gui.QWidget#hideEvent(com.trolltech.qt.gui.QHideEvent) hideEvent()}, {@link com.trolltech.qt.core.QObject#customEvent(com.trolltech.qt.core.QEvent) customEvent()}. {@link com.trolltech.qt.gui.QWidget#changeEvent(com.trolltech.qt.core.QEvent) changeEvent()},</td></tr><tr valign="top" class="odd"><td> System functions</td><td> {@link com.trolltech.qt.gui.QWidget#parentWidget() parentWidget()}, {@link com.trolltech.qt.gui.QWidget#window() window()}, {@link com.trolltech.qt.gui.QWidget#setParent(com.trolltech.qt.gui.QWidget) setParent()}, {@link com.trolltech.qt.gui.QWidget#winId() winId()}, find(), {@link com.trolltech.qt.gui.QWidget#metric(com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric) metric()}.</td></tr><tr valign="top" class="even"><td> Interactive help</td><td> {@link com.trolltech.qt.gui.QWidget#setToolTip(java.lang.String) setToolTip()}, {@link com.trolltech.qt.gui.QWidget#setWhatsThis(java.lang.String) setWhatsThis()}</td></tr></table><a name="widget-style-sheets"><h2>Widget Style Sheets</h2> In addition to the standard widget styles for each platform, widgets can also be styled according to rules specified in a {@link QWidget#styleSheet() style sheet}. This feature enables you to customize the appearance of specific widgets to provide visual cues to users about their purpose. For example, a button could be styled in a particular way to indicate that it performs a destructive action. <p>The use of widget style sheets is described in more detail in the {@link <a href="../qtjambi-stylesheet.html">Qt Style Sheets</a>} document.<a name="transparency-and-double-buffering"><h2>Transparency and Double Buffering</h2> Since Qt 4.0, QWidget automatically double-buffers its painting, so there is no need to write double-buffering code in {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()} to avoid flicker. <p>Since Qt 4.1, the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_ContentsPropagated } widget attribute has been deprecated. Instead, the contents of parent widgets are propagated by default to each of their children as long as {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_PaintOnScreen } is not set. Custom widgets can be written to take advantage of this feature by updating irregular regions (to create non-rectangular child widgets), or painting with colors that have less than full alpha component. The following diagram shows how attributes and properties of a custom widget can be fine-tuned to achieve different effects. <br><center><img src="../images/propagation-custom.png"></center><br> In the above diagram, a semi-transparent rectangular child widget with an area removed is constructed and added to a parent widget (a {@link com.trolltech.qt.gui.QLabel QLabel} showing a pixmap). Then, different properties and widget attributes are set to achieve different effects: <ul><li> The left widget has no additional properties or widget attributes set. This default state suits most custom widgets using transparency, are irregularly-shaped, or do not paint over their entire area with an opaque brush.</li><li> The center widget has the {@link QWidget#autoFillBackground() autoFillBackground} property set. This property is used with custom widgets that rely on the widget to supply a default background, and do not paint over their entire area with an opaque brush.</li><li> The right widget has the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_OpaquePaintEvent } widget attribute set. This indicates that the widget will paint over its entire area with opaque colors. The widget's area will initially be uninitialized, represented in the diagram with a red diagonal grid pattern that shines through the overpainted area. The Qt::WA_OpaquePaintArea attribute is useful for widgets that need to paint their own specialized contents quickly and do not need a default filled background.</li></ul> To rapidly update custom widgets with simple background colors, such as real-time plotting or graphing widgets, it is better to define a suitable background color (using {@link com.trolltech.qt.gui.QWidget#setBackgroundRole(com.trolltech.qt.gui.QPalette.ColorRole) setBackgroundRole()} with the {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Window } role), set the {@link QWidget#autoFillBackground() autoFillBackground} property, and only implement the necessary drawing functionality in the widget's {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}. <p>To rapidly update custom widgets that constantly paint over their entire areas with opaque content, e.g., video streaming widgets, it is better to set the widget's {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_OpaquePaintEvent }, avoiding any unnecessary overhead associated with repainting the widget's background. <p>If a widget has both the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_OpaquePaintEvent } widget attribute and the {@link QWidget#autoFillBackground() autoFillBackground} property set, the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_OpaquePaintEvent } attribute takes precedence. Depending on your requirements, you should choose either one of them. <p>Since Qt 4.1, the contents of parent widgets are also propagated to standard Qt widgets. This can lead to some unexpected results if the parent widget is decorated in a non-standard way, as shown in the diagram below. <br><center><img src="../images/propagation-standard.png"></center><br> The scope for customizing the painting behavior of standard Qt widgets, without resorting to subclassing, is slightly less than that possible for custom widgets. Usually, the desired appearance of a standard widget can be achieved by setting its {@link QWidget#autoFillBackground() autoFillBackground} property.<a name="creating-translucent-windows"><h2>Creating Translucent Windows</h2> Since Qt 4.5, it has been possible to create windows with translucent regions on window systems that support compositing. <p>To enable this feature in a top-level widget, set its {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_TranslucentBackground } attribute with {@link com.trolltech.qt.gui.QWidget#setAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) setAttribute()} and ensure that its background is painted with non-opaque colors in the regions you want to be partially transparent. <p>Platform notes: <ul><li> X11: This feature relies on the use of an X server that supports ARGB visuals and a compositing window manager.</li><li> Windows: This feature requires Windows 2000 or later.</li></ul><a name="native-widgets-vs-alien-widgets"><h2>Native Widgets vs Alien Widgets</h2> Introduced in Qt 4.4, alien widgets are widgets unknown to the windowing system. They do not have a native window handle associated with them. This feature significantly speeds up widget painting, resizing, and removes flicker. <p>Should you require the old behavior with native windows, you can choose one of the following options: <ol><li> Use the <tt>QT_USE_NATIVE_WINDOWS=1</tt> in your environment.</li><li> Set the {@link com.trolltech.qt.core.Qt.ApplicationAttribute Qt::AA_NativeWindows } attribute on your application. All widgets will be native widgets.</li><li> Set the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_NativeWindow } attribute on widgets: The widget itself and all of its ancestors will become native (unless {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_DontCreateNativeAncestors } is set).</li><li> Call QWidget::winId to enforce a native window (this implies 3).</li><li> Set the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_PaintOnScreen } attribute to enforce a native window (this implies 3).</li></ol> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QEvent QEvent}, {@link com.trolltech.qt.gui.QPainter QPainter}, {@link com.trolltech.qt.gui.QGridLayout QGridLayout}, and {@link com.trolltech.qt.gui.QBoxLayout QBoxLayout}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QWidget extends com.trolltech.qt.core.QObject
    implements com.trolltech.qt.gui.QPaintDeviceInterface
{

    private Object __rcStyle = null;

    private java.util.Collection<Object> __rcActions = new java.util.ArrayList<Object>();

    private Object __rcFocusProxy = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    
/**
This enum describes how to render the widget when calling {@link com.trolltech.qt.gui.QWidget#render(com.trolltech.qt.gui.QPaintDeviceInterface, com.trolltech.qt.core.QPoint, com.trolltech.qt.gui.QRegion, com.trolltech.qt.gui.QWidget.RenderFlag[]) QWidget::render()}.
*/
@QtBlockedEnum
    public enum RenderFlag implements com.trolltech.qt.QtEnumerator {
/**
 If you enable this option, the widget's background is rendered into the target even if {@link QWidget#autoFillBackground() autoFillBackground} is not set. By default, this option is enabled.
*/

        DrawWindowBackground(1),
/**
 If you enable this option, the widget's children are rendered recursively into the target. By default, this option is enabled.
*/

        DrawChildren(2),
/**
 If you enable this option, the widget's {@link com.trolltech.qt.gui.QWidget#mask() QWidget::mask()} is ignored when rendering into the target. By default, this option is disabled.
*/

        IgnoreMask(4);

        RenderFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QWidget$RenderFlags with the specified <tt>com.trolltech.qt.gui.QWidget$RenderFlag[]</tt> QWidget$RenderFlag values set.</brief>
*/

        public static RenderFlags createQFlags(RenderFlag ... values) {
            return new RenderFlags(values);
        }
/**
<brief>Returns the QWidget$RenderFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static RenderFlag resolve(int value) {
            return (RenderFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return DrawWindowBackground;
            case 2: return DrawChildren;
            case 4: return IgnoreMask;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class RenderFlags extends com.trolltech.qt.QFlags<RenderFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QWidget-RenderFlags with the specified <tt>com.trolltech.qt.gui.QWidget.RenderFlag[]</tt>. flags set.</brief>
*/

        public RenderFlags(RenderFlag ... args) { super(args); }
        public RenderFlags(int value) { setValue(value); }
    }


/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QPoint(named: pos)&gt;:<p> This signal is emitted when the widget's {@link QWidget#contextMenuPolicy() contextMenuPolicy} is {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::CustomContextMenu }, and the user has requested a context menu on the widget. The position <tt>pos</tt> is the position of the context menu event that the widget receives. Normally this is in widget coordinates. The exception to this rule is {@link com.trolltech.qt.gui.QAbstractScrollArea QAbstractScrollArea} and its subclasses that map the context menu event to coordinates of the {@link com.trolltech.qt.gui.QAbstractScrollArea#viewport() viewport()} . <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) mapToGlobal()}, {@link com.trolltech.qt.gui.QMenu QMenu}, and {@link QWidget#contextMenuPolicy() contextMenuPolicy}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QPoint> customContextMenuRequested = new Signal1<com.trolltech.qt.core.QPoint>();

    private final void customContextMenuRequested(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_customContextMenuRequested_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    native void __qt_customContextMenuRequested_QPoint(long __this__nativeId, long pos);


/**
This is an overloaded method provided for convenience.
*/

    public QWidget(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... f) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(f));
    }

/**
Constructs a widget which is a child of <tt>parent</tt>, with widget flags set to <tt>f</tt>. <p>If <tt>parent</tt> is 0, the new widget becomes a window. If <tt>parent</tt> is another widget, this widget becomes a child window inside <tt>parent</tt>. The new widget is deleted when its <tt>parent</tt> is deleted. <p>The widget flags argument, <tt>f</tt>, is normally 0, but it can be set to customize the frame of a window (i.e. <tt>parent</tt> must be 0). To customize the frame, use a value composed from the bitwise OR of any of the window flags. <p>If you add a child widget to an already visible widget you must explicitly show the child to make it visible. <p>Note that the X11 version of Qt may not be able to deliver all combinations of style flags on all systems. This is because on X11, Qt can only ask the window manager, and the window manager can override the application's settings. On Windows, Qt can set whatever flags you want. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowFlags() windowFlags}. <br></DD></DT>
*/

    public QWidget(com.trolltech.qt.gui.QWidget parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a widget which is a child of <tt>parent</tt>, with widget flags set to <tt>f</tt>. <p>If <tt>parent</tt> is 0, the new widget becomes a window. If <tt>parent</tt> is another widget, this widget becomes a child window inside <tt>parent</tt>. The new widget is deleted when its <tt>parent</tt> is deleted. <p>The widget flags argument, <tt>f</tt>, is normally 0, but it can be set to customize the frame of a window (i.e. <tt>parent</tt> must be 0). To customize the frame, use a value composed from the bitwise OR of any of the window flags. <p>If you add a child widget to an already visible widget you must explicitly show the child to make it visible. <p>Note that the X11 version of Qt may not be able to deliver all combinations of style flags on all systems. This is because on X11, Qt can only ask the window manager, and the window manager can override the application's settings. On Windows, Qt can set whatever flags you want. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowFlags() windowFlags}. <br></DD></DT>
*/

    public QWidget() {
        this((com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a widget which is a child of <tt>parent</tt>, with widget flags set to <tt>f</tt>. <p>If <tt>parent</tt> is 0, the new widget becomes a window. If <tt>parent</tt> is another widget, this widget becomes a child window inside <tt>parent</tt>. The new widget is deleted when its <tt>parent</tt> is deleted. <p>The widget flags argument, <tt>f</tt>, is normally 0, but it can be set to customize the frame of a window (i.e. <tt>parent</tt> must be 0). To customize the frame, use a value composed from the bitwise OR of any of the window flags. <p>If you add a child widget to an already visible widget you must explicitly show the child to make it visible. <p>Note that the X11 version of Qt may not be able to deliver all combinations of style flags on all systems. This is because on X11, Qt can only ask the window manager, and the window manager can override the application's settings. On Windows, Qt can set whatever flags you want. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowFlags() windowFlags}. <br></DD></DT>
*/

    public QWidget(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags f){
        super((QPrivateConstructor)null);
        __qt_QWidget_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), f.value());
    }

    native void __qt_QWidget_QWidget_WindowFlags(long parent, int f);

/**
This property holds whether drop events are enabled for this widget. Setting this property to true announces to the system that this widget may be able to accept drop events. <p>If the widget is the desktop ({@link com.trolltech.qt.gui.QWidget#windowType() windowType()} == {@link com.trolltech.qt.core.Qt.WindowType Qt::Desktop }), this may fail if another application is using the desktop; you can call {@link com.trolltech.qt.gui.QWidget#acceptDrops() acceptDrops()} to test if this occurs. <p><b>Warning:</b> Do not modify this property in a drag and drop event handler. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtjambi-dnd.html">Drag and Drop</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="acceptDrops")
    @QtBlockedSlot
    public final boolean acceptDrops()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_acceptDrops(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_acceptDrops(long __this__nativeId);

/**
This property holds the widget's description as seen by assistive technologies. By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) QAccessibleInterface::text()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="accessibleDescription")
    @QtBlockedSlot
    public final java.lang.String accessibleDescription()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_accessibleDescription(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_accessibleDescription(long __this__nativeId);

/**
This property holds the widget's name as seen by assistive technologies. This property is used by accessible clients to identify, find, or announce the widget for accessible clients. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) QAccessibleInterface::text()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="accessibleName")
    @QtBlockedSlot
    public final java.lang.String accessibleName()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_accessibleName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_accessibleName(long __this__nativeId);

/**
Returns the (possibly empty) list of this widget's actions. <p><DT><b>See also:</b><br><DD>{@link QWidget#contextMenuPolicy() contextMenuPolicy}, {@link com.trolltech.qt.gui.QWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()}, and {@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QAction> actions()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_actions(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QAction> __qt_actions(long __this__nativeId);

/**
Sets the top-level widget containing this widget to be the active window. <p>An active window is a visible top-level window that has the keyboard input focus. <p>This function performs the same operation as clicking the mouse on the title bar of a top-level window. On X11, the result depends on the Window Manager. If you want to ensure that the window is stacked on top as well you should also call {@link com.trolltech.qt.gui.QWidget#raise() raise()}. Note that the window must be visible, otherwise {@link com.trolltech.qt.gui.QWidget#activateWindow() activateWindow()} has no effect. <p>On Windows, if you are calling this when the application is not currently the active one then it will not make it the active window. It will change the color of the taskbar entry to indicate that the window has changed in some way. This is because Microsoft do not allow an application to interrupt what the user is currently doing in another application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#isActiveWindow() isActiveWindow()}, {@link com.trolltech.qt.gui.QWidget#window() window()}, and {@link com.trolltech.qt.gui.QWidget#show() show()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void activateWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activateWindow(nativeId());
    }
    @QtBlockedSlot
    native void __qt_activateWindow(long __this__nativeId);

/**
Appends the action <tt>action</tt> to this widget's list of actions. <p>All QWidgets have a list of {@link com.trolltech.qt.gui.QAction QAction}s, however they can be represented graphically in many different ways. The default use of the {@link com.trolltech.qt.gui.QAction QAction} list (as returned by {@link com.trolltech.qt.gui.QWidget#actions() actions()}) is to create a context {@link com.trolltech.qt.gui.QMenu QMenu}. <p>A QWidget should only have one of each action and adding an action it already has will not cause the same action to be in the widget twice. <p>The ownership of <tt>action</tt> is not transferred to this QWidget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}, {@link com.trolltech.qt.gui.QWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()}, {@link com.trolltech.qt.gui.QWidget#actions() actions()}, and {@link com.trolltech.qt.gui.QMenu QMenu}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addAction(com.trolltech.qt.gui.QAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (action != null) {
            __rcActions.add(action);
        }
        __qt_addAction_QAction(nativeId(), action == null ? 0 : action.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addAction_QAction(long __this__nativeId, long action);

/**
Appends the actions <tt>actions</tt> to this widget's list of actions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}, {@link com.trolltech.qt.gui.QMenu QMenu}, and {@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) addAction()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addActions(java.util.List<com.trolltech.qt.gui.QAction> actions)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (actions != null) {
            __rcActions.addAll(actions);
        }
        __qt_addActions_List(nativeId(), actions);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addActions_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QAction> actions);

/**
Adjusts the size of the widget to fit its contents. <p>This function uses {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()} if it is valid, i.e., the size hint's width and height are &gt;= 0. Otherwise, it sets the size to the children rectangle that covers all child widgets (the union of all child widget rectangles). <p>For windows, the screen size is also taken into account. If the {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()} is less than (200, 100) and the size policy is {@link com.trolltech.qt.gui.QSizePolicy.Policy expanding }, the window will be at least (200, 100). The maximum size of a window is 2/3 of the screen's width and height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()}, and {@link com.trolltech.qt.gui.QWidget#childrenRect() childrenRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void adjustSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_adjustSize(nativeId());
    }
    @QtBlockedSlot
    native void __qt_adjustSize(long __this__nativeId);

/**
This property holds whether the widget background is filled automatically. If enabled, this property will cause Qt to fill the background of the widget before invoking the paint event. The color used is defined by the {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Window } color role from the widget's {@link com.trolltech.qt.gui.QPalette palette}. <p>In addition, Windows are always filled with {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Window }, unless the WA_OpaquePaintEvent or WA_NoSystemBackground attributes are set. <p>This property cannot be turned off (i.e., set to false) if a widget's parent has a static gradient for its background. <p><b>Warning:</b> Use this property with caution in conjunction with {@link <a href="../qtjambi-stylesheet.html">Qt Style Sheets</a>}. When a widget has a style sheet with a valid background or a border-image, this property is automatically disabled. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_OpaquePaintEvent }, {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_NoSystemBackground }, and Transparency and Double Buffering. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="autoFillBackground")
    @QtBlockedSlot
    public final boolean autoFillBackground()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoFillBackground(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoFillBackground(long __this__nativeId);

/**
Returns the background role of the widget. <p>The background role defines the brush from the widget's {@link QWidget#palette() palette} that is used to render the background. <p>If no explicit background role is set, the widget inherts its parent widget's background role. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setBackgroundRole(com.trolltech.qt.gui.QPalette.ColorRole) setBackgroundRole()}, and {@link com.trolltech.qt.gui.QWidget#foregroundRole() foregroundRole()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPalette.ColorRole backgroundRole()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPalette.ColorRole.resolve(__qt_backgroundRole(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_backgroundRole(long __this__nativeId);

/**
This property holds the base size of the widget. The base size is used to calculate a proper widget size if the widget defines {@link com.trolltech.qt.gui.QWidget#sizeIncrement() sizeIncrement()}. <p>By default, for a newly-created widget, this property contains a size with zero width and height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setSizeIncrement(com.trolltech.qt.core.QSize) setSizeIncrement()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="baseSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize baseSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_baseSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_baseSize(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Returns the visible child widget at point <tt>p</tt> in the widget's own coordinate system.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget childAt(com.trolltech.qt.core.QPoint p)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childAt_QPoint(nativeId(), p == null ? 0 : p.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_childAt_QPoint(long __this__nativeId, long p);

/**
Returns the visible child widget at the position (<tt>x</tt>, <tt>y</tt>) in the widget's coordinate system. If there is no visible child widget at the specified position, the function returns 0.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget childAt(int x, int y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childAt_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_childAt_int_int(long __this__nativeId, int x, int y);

/**
This property holds the bounding rectangle of the widget's children. Hidden children are excluded. <p>By default, for a widget with no children, this property contains a rectangle with zero width and height located at the origin. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#childrenRegion() childrenRegion()}, and {@link com.trolltech.qt.gui.QWidget#geometry() geometry()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="childrenRect")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect childrenRect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childrenRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_childrenRect(long __this__nativeId);

/**
This property holds the combined region occupied by the widget's children. Hidden children are excluded. <p>By default, for a widget with no children, this property contains an empty region. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#childrenRect() childrenRect()}, {@link com.trolltech.qt.gui.QWidget#geometry() geometry()}, and {@link com.trolltech.qt.gui.QWidget#mask() mask()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="childrenRegion")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion childrenRegion()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_childrenRegion(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_childrenRegion(long __this__nativeId);

/**
Takes keyboard input focus from the widget. <p>If the widget has active focus, a {@link com.trolltech.qt.gui.QWidget#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focus out event} is sent to this widget to tell it that it is about to lose the focus. <p>This widget must enable focus setting in order to get the keyboard input focus, i.e. it must call {@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) setFocusPolicy()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#hasFocus() hasFocus()}, {@link com.trolltech.qt.gui.QWidget#setFocus() setFocus()}, {@link com.trolltech.qt.gui.QWidget#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()}, {@link com.trolltech.qt.gui.QWidget#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()}, {@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) setFocusPolicy()}, and {@link com.trolltech.qt.gui.QApplication#focusWidget() QApplication::focusWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearFocus()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearFocus(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearFocus(long __this__nativeId);

/**
Removes any mask set by {@link com.trolltech.qt.gui.QWidget#setMask(com.trolltech.qt.gui.QBitmap) setMask()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setMask(com.trolltech.qt.gui.QBitmap) setMask()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clearMask()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearMask(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clearMask(long __this__nativeId);

/**
Closes this widget. Returns true if the widget was closed; otherwise returns false. <p>First it sends the widget a {@link com.trolltech.qt.gui.QCloseEvent QCloseEvent}. The widget is {@link com.trolltech.qt.gui.QWidget#hide() hidden} if it {@link com.trolltech.qt.core.QEvent#accept() accepts} the close event. If it {@link com.trolltech.qt.core.QEvent#ignore() ignores} the event, nothing happens. The default implementation of {@link com.trolltech.qt.gui.QWidget#closeEvent(com.trolltech.qt.gui.QCloseEvent) QWidget::closeEvent()} accepts the close event. <p>If the widget has the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_DeleteOnClose } flag, the widget is also deleted. A close events is delivered to the widget no matter if the widget is visible or not. <p>The {@link com.trolltech.qt.gui.QApplication#lastWindowClosed QApplication::lastWindowClosed() } signal is emitted when the last visible primary window (i.e. window with no parent) with the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_QuitOnClose } attribute set is closed. By default this attribute is set for all widgets except transient windows such as splash screens, tool windows, and popup menus.
*/

    public final boolean close()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_close(nativeId());
    }
    native boolean __qt_close(long __this__nativeId);

/**
Returns the area inside the widget's margins. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setContentsMargins(int, int, int, int) setContentsMargins()}, and {@link com.trolltech.qt.gui.QWidget#getContentsMargins() getContentsMargins()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect contentsRect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_contentsRect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_contentsRect(long __this__nativeId);

/**
This property holds how the widget shows a context menu. The default value of this property is {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::DefaultContextMenu }, which means the {@link com.trolltech.qt.gui.QWidget#contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent) contextMenuEvent()} handler is called. Other values are {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::NoContextMenu }, {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::PreventContextMenu }, {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::ActionsContextMenu }, and {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::CustomContextMenu }. With {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::CustomContextMenu }, the signal {@link com.trolltech.qt.gui.QWidget#customContextMenuRequested customContextMenuRequested() } is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent) contextMenuEvent()}, {@link com.trolltech.qt.gui.QWidget#customContextMenuRequested customContextMenuRequested() }, and {@link com.trolltech.qt.gui.QWidget#actions() actions()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="contextMenuPolicy")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ContextMenuPolicy contextMenuPolicy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ContextMenuPolicy.resolve(__qt_contextMenuPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_contextMenuPolicy(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void createWinId()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_createWinId(nativeId());
    }
    @QtBlockedSlot
    native void __qt_createWinId(long __this__nativeId);

/**
This property holds the cursor shape for this widget. The mouse cursor will assume this shape when it's over this widget. See the {@link com.trolltech.qt.core.Qt.CursorShape list of predefined cursor objects } for a range of useful shapes. <p>An editor widget might use an I-beam cursor: <pre class="snippet">
        w.setCursor(new QCursor(Qt.CursorShape.IBeamCursor));
</pre> If no cursor has been set, or after a call to {@link com.trolltech.qt.gui.QWidget#unsetCursor() unsetCursor()}, the parent's cursor is used. <p>By default, this property contains a cursor with the {@link com.trolltech.qt.core.Qt.CursorShape Qt::ArrowCursor } shape. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) QApplication::setOverrideCursor()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="cursor")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QCursor cursor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cursor(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QCursor __qt_cursor(long __this__nativeId);

/**
Returns the bit depth (number of bit planes) of the paint device.
*/

    @QtBlockedSlot
    public final int depth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_depth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_depth(long __this__nativeId);


/**
Frees up window system resources. Destroys the widget window if <tt>destroyWindow</tt> is true. <p>{@link com.trolltech.qt.gui.QWidget#destroy(boolean) destroy()} calls itself recursively for all the child widgets, passing <tt>destroySubWindows</tt> for the <tt>destroyWindow</tt> parameter. To have more control over destruction of subwidgets, destroy subwidgets selectively first. <p>This function is usually called from the QWidget destructor.
*/

    @QtBlockedSlot
    protected final void destroy(boolean destroyWindow) {
        destroy(destroyWindow, (boolean)true);
    }

/**
Frees up window system resources. Destroys the widget window if <tt>destroyWindow</tt> is true. <p>{@link com.trolltech.qt.gui.QWidget#destroy(boolean) destroy()} calls itself recursively for all the child widgets, passing <tt>destroySubWindows</tt> for the <tt>destroyWindow</tt> parameter. To have more control over destruction of subwidgets, destroy subwidgets selectively first. <p>This function is usually called from the QWidget destructor.
*/

    @QtBlockedSlot
    protected final void destroy() {
        destroy((boolean)true, (boolean)true);
    }
/**
Frees up window system resources. Destroys the widget window if <tt>destroyWindow</tt> is true. <p>{@link com.trolltech.qt.gui.QWidget#destroy(boolean) destroy()} calls itself recursively for all the child widgets, passing <tt>destroySubWindows</tt> for the <tt>destroyWindow</tt> parameter. To have more control over destruction of subwidgets, destroy subwidgets selectively first. <p>This function is usually called from the QWidget destructor.
*/

    @QtBlockedSlot
    protected final void destroy(boolean destroyWindow, boolean destroySubWindows)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_destroy_boolean_boolean(nativeId(), destroyWindow, destroySubWindows);
    }
    @QtBlockedSlot
    native void __qt_destroy_boolean_boolean(long __this__nativeId, boolean destroyWindow, boolean destroySubWindows);

/**
Returns the effective window system identifier of the widget, i. . the native parent's window system identifier. <p>If the widget is native, this function returns the native widget ID. Otherwise, the window ID of the first native parent widget, i.e., the top-level widget that contains this widget, is returned. <p><b>Note:</b> We recommend that you do not store this value as it is likely to change at run-time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#nativeParentWidget() nativeParentWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long effectiveWinId()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_effectiveWinId(nativeId());
    }
    @QtBlockedSlot
    native long __qt_effectiveWinId(long __this__nativeId);

/**
Ensures that the widget has been polished by {@link com.trolltech.qt.gui.QStyle QStyle} (i.e., has a proper font and palette). <p>QWidget calls this function after it has been fully constructed but before it is shown the very first time. You can call this function if you want to ensure that the widget is polished before doing an operation, e.g., the correct font size might be needed in the widget's {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()} reimplementation. Note that this function is called from the default implementation of {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()}. <p>Polishing is useful for final initialization that must happen after all constructors (from base classes as well as from subclasses) have been called. <p>If you need to change some settings when a widget is polished, reimplement event() and handle the {@link com.trolltech.qt.core.QEvent.Type QEvent::Polish } event type. <p><b>Note:</b> The function is declared const so that it can be called from other const functions (e.g., {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()}). <p><DT><b>See also:</b><br><DD>event(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void ensurePolished()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_ensurePolished(nativeId());
    }
    @QtBlockedSlot
    native void __qt_ensurePolished(long __this__nativeId);

/**
Finds a new widget to give the keyboard focus to, as appropriate for <b>Tab</b>, and returns true if it can find a new widget, or false if it can't. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#focusPreviousChild() focusPreviousChild()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final boolean focusNextChild()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusNextChild(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_focusNextChild(long __this__nativeId);

/**
This property holds the way the widget accepts keyboard focus. The policy is {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::TabFocus } if the widget accepts keyboard focus by tabbing, {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::ClickFocus } if the widget accepts focus by clicking, {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::StrongFocus } if it accepts both, and {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::NoFocus } (the default) if it does not accept focus at all. <p>You must enable keyboard focus for a widget if it processes keyboard events. This is normally done from the widget's constructor. For instance, the {@link com.trolltech.qt.gui.QLineEdit QLineEdit} constructor calls setFocusPolicy({@link com.trolltech.qt.core.Qt.FocusPolicy Qt::StrongFocus }). <p>If the widget has a focus proxy, then the focus policy will be propagated to it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()}, {@link com.trolltech.qt.gui.QWidget#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()}, {@link com.trolltech.qt.gui.QWidget#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) keyPressEvent()}, {@link com.trolltech.qt.gui.QWidget#keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent) keyReleaseEvent()}, and {@link QWidget#isEnabled() enabled}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="focusPolicy")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.FocusPolicy focusPolicy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.FocusPolicy.resolve(__qt_focusPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_focusPolicy(long __this__nativeId);

/**
Finds a new widget to give the keyboard focus to, as appropriate for <b>Shift+Tab</b>, and returns true if it can find a new widget, or false if it can't. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#focusNextChild() focusNextChild()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final boolean focusPreviousChild()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusPreviousChild(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_focusPreviousChild(long __this__nativeId);

/**
Returns the focus proxy, or 0 if there is no focus proxy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setFocusProxy(com.trolltech.qt.gui.QWidget) setFocusProxy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget focusProxy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusProxy(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_focusProxy(long __this__nativeId);

/**
Returns the last child of this widget that setFocus had been called on. For top level widgets this is the widget that will get focus in case this window gets activated <p>This is not the same as {@link com.trolltech.qt.gui.QApplication#focusWidget() QApplication::focusWidget()}, which returns the focus widget in the currently active window.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget focusWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_focusWidget(long __this__nativeId);

/**
This property holds the font currently set for the widget. This property describes the widget's requested font. The font is used by the widget's style when rendering standard components, and is available as a means to ensure that custom widgets can maintain consistency with the native platform's look and feel. It's common that different platforms, or different styles, define different fonts for an application. <p>When you assign a new font to a widget, the properties from this font are combined with the widget's default font to form the widget's final font. You can call {@link com.trolltech.qt.gui.QWidget#fontInfo() fontInfo()} to get a copy of the widget's final font. The final font is also used to initialize {@link com.trolltech.qt.gui.QPainter QPainter}'s font. <p>The default depends on the system environment. {@link com.trolltech.qt.gui.QApplication QApplication} maintains a system/theme font which serves as a default for all widgets. There may also be special font defaults for certain types of widgets. You can also define default fonts for widgets yourself by passing a custom font and the name of a widget to {@link com.trolltech.qt.gui.QApplication#setFont(com.trolltech.qt.gui.QFont) QApplication::setFont()}. Finally, the font is matched against Qt's font database to find the best match. <p>QWidget propagates explicit font properties from parent to child. If you change a specific property on a font and assign that font to a widget, that property will propagate to all the widget's children, overriding any system defaults for that property. Note that fonts by default don't propagate to windows (see {@link com.trolltech.qt.gui.QWidget#isWindow() isWindow()}) unless the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_WindowPropagation } attribute is enabled. <p>QWidget's font propagation is similar to its palette propagation. <p>The current style, which is used to render the content of all standard Qt widgets, is free to choose to use the widget font, or in some cases, to ignore it (partially, or completely). In particular, certain styles like GTK style, Mac style, Windows XP, and Vista style, apply special modifications to the widget font to match the platform's native look and feel. Because of this, assigning properties to a widget's font is not guaranteed to change the appearance of the widget. Instead, you may choose to apply a {@link QWidget#styleSheet() styleSheet}. <p><b>Note:</b> If {@link <a href="../qtjambi-stylesheet.html">Qt Style Sheets</a>} are used on the same widget as {@link com.trolltech.qt.gui.QWidget#setFont(com.trolltech.qt.gui.QFont) setFont()}, style sheets will take precedence if the settings conflict. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#fontInfo() fontInfo()}, and {@link com.trolltech.qt.gui.QWidget#fontMetrics() fontMetrics()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="font")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont font()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_font(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_font(long __this__nativeId);

/**
Returns the font info for the widget's current font. Equivalent to QFontInto(widget-&gt;{@link com.trolltech.qt.gui.QWidget#font() font()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#font() font()}, {@link com.trolltech.qt.gui.QWidget#fontMetrics() fontMetrics()}, and {@link com.trolltech.qt.gui.QWidget#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFontInfo fontInfo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontInfo(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFontInfo __qt_fontInfo(long __this__nativeId);

/**
Returns the font metrics for the widget's current font. Equivalent to {@link com.trolltech.qt.gui.QFontMetrics QFontMetrics}(widget-&gt;{@link com.trolltech.qt.gui.QWidget#font() font()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#font() font()}, {@link com.trolltech.qt.gui.QWidget#fontInfo() fontInfo()}, and {@link com.trolltech.qt.gui.QWidget#setFont(com.trolltech.qt.gui.QFont) setFont()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFontMetrics fontMetrics()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fontMetrics(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFontMetrics __qt_fontMetrics(long __this__nativeId);

/**
Returns the foreground role. <p>The foreground role defines the color from the widget's {@link QWidget#palette() palette} that is used to draw the foreground. <p>If no explicit foreground role is set, the function returns a role that contrasts with the background role. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setForegroundRole(com.trolltech.qt.gui.QPalette.ColorRole) setForegroundRole()}, and {@link com.trolltech.qt.gui.QWidget#backgroundRole() backgroundRole()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPalette.ColorRole foregroundRole()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QPalette.ColorRole.resolve(__qt_foregroundRole(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_foregroundRole(long __this__nativeId);

/**
This property holds geometry of the widget relative to its parent including any window frame. See the {@link <a href="../geometry.html">Window Geometry documentation</a>} for an overview of geometry issues with windows. <p>By default, this property contains a value that depends on the user's platform and screen geometry. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#geometry() geometry()}, {@link com.trolltech.qt.gui.QWidget#x() x()}, {@link com.trolltech.qt.gui.QWidget#y() y()}, and {@link com.trolltech.qt.gui.QWidget#pos() pos()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="frameGeometry")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect frameGeometry()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frameGeometry(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_frameGeometry(long __this__nativeId);

/**
This property holds the size of the widget including any window frame. By default, this property contains a value that depends on the user's platform and screen geometry.
*/

    @com.trolltech.qt.QtPropertyReader(name="frameSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize frameSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_frameSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_frameSize(long __this__nativeId);

/**
This property holds the geometry of the widget relative to its parent and excluding the window frame. When changing the geometry, the widget, if visible, receives a move event ({@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()}) and/or a resize event ({@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}) immediately. If the widget is not currently visible, it is guaranteed to receive appropriate events before it is shown. <p>The size component is adjusted if it lies outside the range defined by {@link com.trolltech.qt.gui.QWidget#minimumSize() minimumSize()} and {@link com.trolltech.qt.gui.QWidget#maximumSize() maximumSize()}. <p><b>Warning:</b> Calling {@link com.trolltech.qt.gui.QWidget#setGeometry(com.trolltech.qt.core.QRect) setGeometry()} inside {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()} or {@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()} can lead to infinite recursion. <p>See the {@link <a href="../geometry.html">Window Geometry documentation</a>} for an overview of window geometry. <p>By default, this property contains a value that depends on the user's platform and screen geometry. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#frameGeometry() frameGeometry()}, {@link com.trolltech.qt.gui.QWidget#rect() rect()}, {@link com.trolltech.qt.gui.QWidget#move(com.trolltech.qt.core.QPoint) move()}, {@link com.trolltech.qt.gui.QWidget#resize(com.trolltech.qt.core.QSize) resize()}, {@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()}, {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}, {@link com.trolltech.qt.gui.QWidget#minimumSize() minimumSize()}, and {@link com.trolltech.qt.gui.QWidget#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="geometry")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect geometry()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_geometry(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_geometry(long __this__nativeId);

    @QtBlockedSlot
    private final void getContentsMargins(com.trolltech.qt.QNativePointer left, com.trolltech.qt.QNativePointer top, com.trolltech.qt.QNativePointer right, com.trolltech.qt.QNativePointer bottom)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_getContentsMargins_nativepointer_nativepointer_nativepointer_nativepointer(nativeId(), left, top, right, bottom);
    }
    @QtBlockedSlot
    native void __qt_getContentsMargins_nativepointer_nativepointer_nativepointer_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer left, com.trolltech.qt.QNativePointer top, com.trolltech.qt.QNativePointer right, com.trolltech.qt.QNativePointer bottom);

/**
Grabs the keyboard input. <p>This widget receives all keyboard events until {@link com.trolltech.qt.gui.QWidget#releaseKeyboard() releaseKeyboard()} is called; other widgets get no keyboard events at all. Mouse events are not affected. Use {@link com.trolltech.qt.gui.QWidget#grabMouse() grabMouse()} if you want to grab that. <p>The focus widget is not affected, except that it doesn't receive any keyboard events. {@link com.trolltech.qt.gui.QWidget#setFocus() setFocus()} moves the focus as usual, but the new focus widget receives keyboard events only after {@link com.trolltech.qt.gui.QWidget#releaseKeyboard() releaseKeyboard()} is called. <p>If a different widget is currently grabbing keyboard input, that widget's grab is released first. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#releaseKeyboard() releaseKeyboard()}, {@link com.trolltech.qt.gui.QWidget#grabMouse() grabMouse()}, {@link com.trolltech.qt.gui.QWidget#releaseMouse() releaseMouse()}, and {@link com.trolltech.qt.gui.QWidget#focusWidget() focusWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void grabKeyboard()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_grabKeyboard(nativeId());
    }
    @QtBlockedSlot
    native void __qt_grabKeyboard(long __this__nativeId);

/**
Grabs the mouse input. <p>This widget receives all mouse events until {@link com.trolltech.qt.gui.QWidget#releaseMouse() releaseMouse()} is called; other widgets get no mouse events at all. Keyboard events are not affected. Use {@link com.trolltech.qt.gui.QWidget#grabKeyboard() grabKeyboard()} if you want to grab that. <p><b>Warning:</b> Bugs in mouse-grabbing applications very often lock the terminal. Use this function with extreme caution, and consider using the <tt>-nograb</tt> command line option while debugging. <p>It is almost never necessary to grab the mouse when using Qt, as Qt grabs and releases it sensibly. In particular, Qt grabs the mouse when a mouse button is pressed and keeps it until the last button is released. <p>Note that only visible widgets can grab mouse input. If {@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()} returns false for a widget, that widget cannot call {@link com.trolltech.qt.gui.QWidget#grabMouse() grabMouse()}. <p>{@link com.trolltech.qt.gui.QWidget#focusWidget() focusWidget()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#releaseMouse() releaseMouse()}, {@link com.trolltech.qt.gui.QWidget#grabKeyboard() grabKeyboard()}, {@link com.trolltech.qt.gui.QWidget#releaseKeyboard() releaseKeyboard()}, and {@link com.trolltech.qt.gui.QWidget#grabKeyboard() grabKeyboard()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void grabMouse()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_grabMouse(nativeId());
    }
    @QtBlockedSlot
    native void __qt_grabMouse(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Grabs the mouse input and changes the cursor shape. <p>The cursor will assume shape <tt>cursor</tt> (for as long as the mouse focus is grabbed) and this widget will be the only one to receive mouse events until {@link com.trolltech.qt.gui.QWidget#releaseMouse() releaseMouse()} is called(). <p><b>Warning:</b> Grabbing the mouse might lock the terminal. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#releaseMouse() releaseMouse()}, {@link com.trolltech.qt.gui.QWidget#grabKeyboard() grabKeyboard()}, {@link com.trolltech.qt.gui.QWidget#releaseKeyboard() releaseKeyboard()}, and {@link com.trolltech.qt.gui.QWidget#setCursor(com.trolltech.qt.gui.QCursor) setCursor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void grabMouse(com.trolltech.qt.gui.QCursor arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_grabMouse_QCursor(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_grabMouse_QCursor(long __this__nativeId, long arg__1);


/**
Adds a shortcut to Qt's shortcut system that watches for the given <tt>key</tt> sequence in the given <tt>context</tt>. If the <tt>context</tt> is {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::ApplicationShortcut }, the shortcut applies to the application as a whole. Otherwise, it is either local to this widget, {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WidgetShortcut }, or to the window itself, {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WindowShortcut }. <p>If the same <tt>key</tt> sequence has been grabbed by several widgets, when the <tt>key</tt> sequence occurs a {@link com.trolltech.qt.core.QEvent.Type QEvent::Shortcut } event is sent to all the widgets to which it applies in a non-deterministic order, but with the ``ambiguous'' flag set to true. <p><b>Warning:</b> You should not normally need to use this function; instead create {@link com.trolltech.qt.gui.QAction QAction}s with the shortcut key sequences you require (if you also want equivalent menu options and toolbar buttons), or create {@link com.trolltech.qt.gui.QShortcut QShortcut}s if you just need key sequences. Both {@link com.trolltech.qt.gui.QAction QAction} and {@link com.trolltech.qt.gui.QShortcut QShortcut} handle all the event filtering for you, and provide signals which are triggered when the user triggers the key sequence, so are much easier to use than this low-level function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#releaseShortcut(int) releaseShortcut()}, and {@link com.trolltech.qt.gui.QWidget#setShortcutEnabled(int) setShortcutEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int grabShortcut(com.trolltech.qt.gui.QKeySequence key) {
        return grabShortcut(key, com.trolltech.qt.core.Qt.ShortcutContext.WindowShortcut);
    }
/**
Adds a shortcut to Qt's shortcut system that watches for the given <tt>key</tt> sequence in the given <tt>context</tt>. If the <tt>context</tt> is {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::ApplicationShortcut }, the shortcut applies to the application as a whole. Otherwise, it is either local to this widget, {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WidgetShortcut }, or to the window itself, {@link com.trolltech.qt.core.Qt.ShortcutContext Qt::WindowShortcut }. <p>If the same <tt>key</tt> sequence has been grabbed by several widgets, when the <tt>key</tt> sequence occurs a {@link com.trolltech.qt.core.QEvent.Type QEvent::Shortcut } event is sent to all the widgets to which it applies in a non-deterministic order, but with the ``ambiguous'' flag set to true. <p><b>Warning:</b> You should not normally need to use this function; instead create {@link com.trolltech.qt.gui.QAction QAction}s with the shortcut key sequences you require (if you also want equivalent menu options and toolbar buttons), or create {@link com.trolltech.qt.gui.QShortcut QShortcut}s if you just need key sequences. Both {@link com.trolltech.qt.gui.QAction QAction} and {@link com.trolltech.qt.gui.QShortcut QShortcut} handle all the event filtering for you, and provide signals which are triggered when the user triggers the key sequence, so are much easier to use than this low-level function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#releaseShortcut(int) releaseShortcut()}, and {@link com.trolltech.qt.gui.QWidget#setShortcutEnabled(int) setShortcutEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int grabShortcut(com.trolltech.qt.gui.QKeySequence key, com.trolltech.qt.core.Qt.ShortcutContext context)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_grabShortcut_QKeySequence_ShortcutContext(nativeId(), key == null ? 0 : key.nativeId(), context.value());
    }
    @QtBlockedSlot
    native int __qt_grabShortcut_QKeySequence_ShortcutContext(long __this__nativeId, long key, int context);

/**
Returns the proxy widget for the corresponding embedded widget in a graphics view; otherwise returns 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QGraphicsProxyWidget#createProxyForChildWidget(com.trolltech.qt.gui.QWidget) QGraphicsProxyWidget::createProxyForChildWidget()}, and {@link com.trolltech.qt.gui.QGraphicsScene#addWidget(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.Qt.WindowType[]) QGraphicsScene::addWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QGraphicsProxyWidget graphicsProxyWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_graphicsProxyWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QGraphicsProxyWidget __qt_graphicsProxyWidget(long __this__nativeId);

/**
This property holds whether this widget (or its focus proxy) has the keyboard input focus. By default, this property is false. <p><b>Note:</b> Obtaining the value of this property for a widget is effectively equivalent to checking whether {@link com.trolltech.qt.gui.QApplication#focusWidget() QApplication::focusWidget()} refers to the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setFocus() setFocus()}, {@link com.trolltech.qt.gui.QWidget#clearFocus() clearFocus()}, {@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) setFocusPolicy()}, and {@link com.trolltech.qt.gui.QApplication#focusWidget() QApplication::focusWidget()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="focus")
    @QtBlockedSlot
    public final boolean hasFocus()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasFocus(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasFocus(long __this__nativeId);

/**
This property holds whether mouse tracking is enabled for the widget. If mouse tracking is disabled (the default), the widget only receives mouse move events when at least one mouse button is pressed while the mouse is being moved. <p>If mouse tracking is enabled, the widget receives mouse move events even if no buttons are pressed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="mouseTracking")
    @QtBlockedSlot
    public final boolean hasMouseTracking()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasMouseTracking(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasMouseTracking(long __this__nativeId);

/**
Returns the height of the paint device in default coordinate system units (e. . pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and QWidget). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="height")
    @QtBlockedSlot
    public final int height()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_height(nativeId());
    }
    @QtBlockedSlot
    native int __qt_height(long __this__nativeId);

/**
Returns the height of the paint device in millimeters. Due to platform limitations it may not be possible to use this function to determine the actual physical size of a widget on the screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#height() height()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int heightMM()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_heightMM(nativeId());
    }
    @QtBlockedSlot
    native int __qt_heightMM(long __this__nativeId);

/**
Hides the widget. This function is equivalent to setVisible(false). <p><b>Note:</b> If you are working with {@link com.trolltech.qt.gui.QDialog QDialog} or its subclasses and you invoke the {@link com.trolltech.qt.gui.QWidget#show() show()} function after this function, the dialog will be displayed in its original position. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#hideEvent(com.trolltech.qt.gui.QHideEvent) hideEvent()}, {@link com.trolltech.qt.gui.QWidget#isHidden() isHidden()}, {@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QWidget#setVisible(boolean) setVisible()}, {@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()}, and {@link com.trolltech.qt.gui.QWidget#close() close()}. <br></DD></DT>
*/

    public final void hide()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hide(nativeId());
    }
    native void __qt_hide(long __this__nativeId);

/**
This function returns the {@link com.trolltech.qt.gui.QInputContext QInputContext} for this widget. By default the input context is inherited from the widgets parent. For toplevels it is inherited from {@link com.trolltech.qt.gui.QApplication QApplication}. <p>You can override this and set a special input context for this widget by using the {@link com.trolltech.qt.gui.QWidget#setInputContext(com.trolltech.qt.gui.QInputContext) setInputContext()} method. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setInputContext(com.trolltech.qt.gui.QInputContext) setInputContext()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QInputContext inputContext()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputContext(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QInputContext __qt_inputContext(long __this__nativeId);

/**
Inserts the action <tt>action</tt> to this widget's list of actions, before the action <tt>before</tt>. It appends the action if <tt>before</tt> is 0 or <tt>before</tt> is not a valid action for this widget. <p>A QWidget should only have one of each action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}, {@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) addAction()}, {@link com.trolltech.qt.gui.QMenu QMenu}, {@link QWidget#contextMenuPolicy() contextMenuPolicy}, and {@link com.trolltech.qt.gui.QWidget#actions() actions()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertAction(com.trolltech.qt.gui.QAction before, com.trolltech.qt.gui.QAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (action != null) {
            __rcActions.add(action);
        }
        __qt_insertAction_QAction_QAction(nativeId(), before == null ? 0 : before.nativeId(), action == null ? 0 : action.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertAction_QAction_QAction(long __this__nativeId, long before, long action);

/**
Inserts the actions <tt>actions</tt> to this widget's list of actions, before the action <tt>before</tt>. It appends the action if <tt>before</tt> is 0 or <tt>before</tt> is not a valid action for this widget. <p>A QWidget can have at most one of each action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}, {@link com.trolltech.qt.gui.QMenu QMenu}, {@link com.trolltech.qt.gui.QWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()}, and {@link QWidget#contextMenuPolicy() contextMenuPolicy}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void insertActions(com.trolltech.qt.gui.QAction before, java.util.List<com.trolltech.qt.gui.QAction> actions)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (actions != null) {
            __rcActions.addAll(actions);
        }
        __qt_insertActions_QAction_List(nativeId(), before == null ? 0 : before.nativeId(), actions);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_insertActions_QAction_List(long __this__nativeId, long before, java.util.List<com.trolltech.qt.gui.QAction> actions);

/**
This property holds whether this widget's window is the active window. The active window is the window that contains the widget that has keyboard focus (The window may still have focus if it has no widgets or none of its widgets accepts keyboard focus). <p>When popup windows are visible, this property is true for both the active window and for the popup. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#activateWindow() activateWindow()}, and {@link com.trolltech.qt.gui.QApplication#activeWindow() QApplication::activeWindow()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="isActiveWindow")
    @QtBlockedSlot
    public final boolean isActiveWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isActiveWindow(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isActiveWindow(long __this__nativeId);

/**
Returns true if this widget is a parent, (or grandparent and so on to any level), of the given <tt>child</tt>, and both widgets are within the same window; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isAncestorOf(com.trolltech.qt.gui.QWidget child)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAncestorOf_QWidget(nativeId(), child == null ? 0 : child.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAncestorOf_QWidget(long __this__nativeId, long child);

/**
This property holds whether the widget is enabled. An enabled widget handles keyboard and mouse events; a disabled widget does not. <p>Some widgets display themselves differently when they are disabled. For example a button might draw its label grayed out. If your widget needs to know when it becomes enabled or disabled, you can use the {@link com.trolltech.qt.gui.QWidget#changeEvent(com.trolltech.qt.core.QEvent) changeEvent()} with type {@link com.trolltech.qt.core.QEvent.Type QEvent::EnabledChange }. <p>Disabling a widget implicitly disables all its children. Enabling respectively enables all child widgets unless they have been explicitly disabled. <p>By default, this property is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#isEnabledTo(com.trolltech.qt.gui.QWidget) isEnabledTo()}, {@link com.trolltech.qt.gui.QKeyEvent QKeyEvent}, {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}, and {@link com.trolltech.qt.gui.QWidget#changeEvent(com.trolltech.qt.core.QEvent) changeEvent()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="enabled")
    @QtBlockedSlot
    public final boolean isEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEnabled(long __this__nativeId);

/**
Returns true if this widget would become enabled if <tt>ancestor</tt> is enabled; otherwise returns false. <p>This is the case if neither the widget itself nor every parent up to but excluding <tt>ancestor</tt> has been explicitly disabled. <p>isEnabledTo(0) is equivalent to {@link com.trolltech.qt.gui.QWidget#isEnabled() isEnabled()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setEnabled(boolean) setEnabled()}, and {@link QWidget#isEnabled() enabled}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isEnabledTo(com.trolltech.qt.gui.QWidget arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEnabledTo_QWidget(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEnabledTo_QWidget(long __this__nativeId, long arg__1);

/**
This property holds whether the widget is shown in full screen mode. A widget in full screen mode occupies the whole screen area and does not display window decorations, such as a title bar. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#windowState() windowState()}, {@link QWidget#isMinimized() minimized}, and {@link QWidget#isMaximized() maximized}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="fullScreen")
    @QtBlockedSlot
    public final boolean isFullScreen()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFullScreen(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFullScreen(long __this__nativeId);

/**
Returns true if the widget is hidden, otherwise returns false. <p>A hidden widget will only become visible when {@link com.trolltech.qt.gui.QWidget#show() show()} is called on it. It will not be automatically shown when the parent is shown. <p>To check visiblity, use !{@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()} instead (notice the exclamation mark). <p>{@link com.trolltech.qt.gui.QWidget#isHidden() isHidden()} implies !{@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()}, but a widget can be not visible and not hidden at the same time. This is the case for widgets that are children of widgets that are not visible. <p>Widgets are hidden if they were created as independent windows or as children of visible widgets, or if {@link com.trolltech.qt.gui.QWidget#hide() hide()} or setVisible(false) was called.
*/

    @QtBlockedSlot
    public final boolean isHidden()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isHidden(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isHidden(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean isLeftToRight()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isLeftToRight(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isLeftToRight(long __this__nativeId);

/**
This property holds whether this widget is maximized. This property is only relevant for windows. <p><b>Note:</b> Due to limitations on some window systems, this does not always report the expected results (e.g., if the user on X11 maximizes the window via the window manager, Qt has no way of distinguishing this from any other resize). This is expected to improve as window manager protocols evolve. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#windowState() windowState()}, {@link com.trolltech.qt.gui.QWidget#showMaximized() showMaximized()}, {@link QWidget#isVisible() visible}, {@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QWidget#hide() hide()}, {@link com.trolltech.qt.gui.QWidget#showNormal() showNormal()}, and {@link QWidget#isMinimized() minimized}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="maximized")
    @QtBlockedSlot
    public final boolean isMaximized()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isMaximized(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isMaximized(long __this__nativeId);

/**
This property holds whether this widget is minimized (iconified). This property is only relevant for windows. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#showMinimized() showMinimized()}, {@link QWidget#isVisible() visible}, {@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QWidget#hide() hide()}, {@link com.trolltech.qt.gui.QWidget#showNormal() showNormal()}, and {@link QWidget#isMaximized() maximized}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="minimized")
    @QtBlockedSlot
    public final boolean isMinimized()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isMinimized(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isMinimized(long __this__nativeId);

/**
This property holds whether the widget is a modal widget. This property only makes sense for windows. A modal widget prevents widgets in all other windows from getting any input. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#isWindow() isWindow()}, {@link QWidget#windowModality() windowModality}, and {@link com.trolltech.qt.gui.QDialog QDialog}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="modal")
    @QtBlockedSlot
    public final boolean isModal()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isModal(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isModal(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean isRightToLeft()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRightToLeft(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isRightToLeft(long __this__nativeId);

/**
This property holds whether the widget is visible. Calling setVisible(true) or {@link com.trolltech.qt.gui.QWidget#show() show()} sets the widget to visible status if all its parent widgets up to the window are visible. If an ancestor is not visible, the widget won't become visible until all its ancestors are shown. If its size or position has changed, Qt guarantees that a widget gets move and resize events just before it is shown. If the widget has not been resized yet, Qt will adjust the widget's size to a useful default using {@link com.trolltech.qt.gui.QWidget#adjustSize() adjustSize()}. <p>Calling setVisible(false) or {@link com.trolltech.qt.gui.QWidget#hide() hide()} hides a widget explicitly. An explicitly hidden widget will never become visible, even if all its ancestors become visible, unless you show it. <p>A widget receives show and hide events when its visibility status changes. Between a hide and a show event, there is no need to waste CPU cycles preparing or displaying information to the user. A video application, for example, might simply stop generating new frames. <p>A widget that happens to be obscured by other windows on the screen is considered to be visible. The same applies to iconified windows and windows that exist on another virtual desktop (on platforms that support this concept). A widget receives spontaneous show and hide events when its mapping status is changed by the window system, e.g. a spontaneous hide event when the user minimizes the window, and a spontaneous show event when the window is restored again. <p>You almost never have to reimplement the {@link com.trolltech.qt.gui.QWidget#setVisible(boolean) setVisible()} function. If you need to change some settings before a widget is shown, use {@link com.trolltech.qt.gui.QWidget#showEvent(com.trolltech.qt.gui.QShowEvent) showEvent()} instead. If you need to do some delayed initialization use the Polish event delivered to the event() function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QWidget#hide() hide()}, {@link com.trolltech.qt.gui.QWidget#isHidden() isHidden()}, {@link com.trolltech.qt.gui.QWidget#isVisibleTo(com.trolltech.qt.gui.QWidget) isVisibleTo()}, {@link com.trolltech.qt.gui.QWidget#isMinimized() isMinimized()}, {@link com.trolltech.qt.gui.QWidget#showEvent(com.trolltech.qt.gui.QShowEvent) showEvent()}, and {@link com.trolltech.qt.gui.QWidget#hideEvent(com.trolltech.qt.gui.QHideEvent) hideEvent()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="visible")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final boolean isVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isVisible(long __this__nativeId);

/**
Returns true if this widget would become visible if <tt>ancestor</tt> is shown; otherwise returns false. <p>The true case occurs if neither the widget itself nor any parent up to but excluding <tt>ancestor</tt> has been explicitly hidden. <p>This function will still return true if the widget is obscured by other windows on the screen, but could be physically visible if it or they were to be moved. <p>isVisibleTo(0) is identical to {@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QWidget#hide() hide()}, and {@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isVisibleTo(com.trolltech.qt.gui.QWidget arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isVisibleTo_QWidget(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isVisibleTo_QWidget(long __this__nativeId, long arg__1);

/**
Returns true if the widget is an independent window, otherwise returns false. <p>A window is a widget that isn't visually the child of any other widget and that usually has a frame and a {@link QWidget#setWindowTitle(java.lang.String) window title}. <p>A window can have a {@link com.trolltech.qt.gui.QWidget#parentWidget() parent widget}. It will then be grouped with its parent and deleted when the parent is deleted, minimized when the parent is minimized etc. If supported by the window manager, it will also have a common taskbar entry with its parent. <p>{@link com.trolltech.qt.gui.QDialog QDialog} and {@link com.trolltech.qt.gui.QMainWindow QMainWindow} widgets are by default windows, even if a parent widget is specified in the constructor. This behavior is specified by the {@link com.trolltech.qt.core.Qt.WindowType Qt::Window } flag. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#window() window()}, {@link com.trolltech.qt.gui.QWidget#isModal() isModal()}, and {@link com.trolltech.qt.gui.QWidget#parentWidget() parentWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isWindow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isWindow(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isWindow(long __this__nativeId);

/**
This property holds whether the document shown in the window has unsaved changes. A modified window is a window whose content has changed but has not been saved to disk. This flag will have different effects varied by the platform. On Mac OS X the close button will have a modified look; on other platforms, the window title will have an '*' (asterisk). <p>The window title must contain a "[*]" placeholder, which indicates where the '*' should appear. Normally, it should appear right after the file name (e.g., "document1.txt[*] - Text Editor"). If the window isn't modified, the placeholder is simply removed. <p>Note that if a widget is set as modified, all its ancestors will also be set as modified. However, if you call <tt>setWindowModified(false)</tt> on a widget, this will not propagate to its parent because other children of the parent might have been modified. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowTitle() windowTitle}, {@link <a href="../qtjambi-application.html">Application Example</a>}, {@link <a href="../mainwindows-sdi.html">SDI Example</a>}, and {@link <a href="../qtjambi-mdi.html">MDI Example</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="windowModified")
    @com.trolltech.qt.QtPropertyDesignable("isWindow")
    @QtBlockedSlot
    public final boolean isWindowModified()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isWindowModified(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isWindowModified(long __this__nativeId);

/**
Returns the layout manager that is installed on this widget, or 0 if no layout manager is installed. <p>The layout manager sets the geometry of the widget's children that have been added to the layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setLayout(com.trolltech.qt.gui.QLayout) setLayout()}, {@link com.trolltech.qt.gui.QWidget#sizePolicy() sizePolicy()}, and {@link <a href="../qtjambi-layout.html">Layout Classes</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLayout layout()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_layout(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayout __qt_layout(long __this__nativeId);

/**
This property holds the layout direction for this widget. By default, this property is set to {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LeftToRight }. <p>When the layout direction is set on a widget, it will propagate to the widget's children. Children added after the call to <tt>setLayoutDirection()</tt> will not inherit the parent's layout direction. <p><DT><b>See also:</b><br><DD>{@link QApplication#layoutDirection() QApplication::layoutDirection}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="layoutDirection")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.LayoutDirection layoutDirection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.LayoutDirection.resolve(__qt_layoutDirection(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_layoutDirection(long __this__nativeId);

/**
This property holds the widget's locale. As long as no special locale has been set, this is either the parent's locale or (if this widget is a top level widget), the default locale. <p>If the widget displays dates or numbers, these should be formatted using the widget's locale. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale QLocale}, and {@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) QLocale::setDefault()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="locale")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QLocale locale()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_locale(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QLocale __qt_locale(long __this__nativeId);

/**
Returns the horizontal resolution of the device in dots per inch, which is used when computing font sizes. For X11, this is usually the same as could be computed from {@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()}. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}, and {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int logicalDpiX()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_logicalDpiX(nativeId());
    }
    @QtBlockedSlot
    native int __qt_logicalDpiX(long __this__nativeId);

/**
Returns the vertical resolution of the device in dots per inch, which is used when computing font sizes. For X11, this is usually the same as could be computed from {@link com.trolltech.qt.gui.QPaintDevice#heightMM() heightMM()}. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}, and {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int logicalDpiY()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_logicalDpiY(nativeId());
    }
    @QtBlockedSlot
    native int __qt_logicalDpiY(long __this__nativeId);

/**
Lowers the widget to the bottom of the parent widget's stack. <p>After this call the widget will be visually behind (and therefore obscured by) any overlapping sibling widgets. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#raise() raise()}, and {@link com.trolltech.qt.gui.QWidget#stackUnder(com.trolltech.qt.gui.QWidget) stackUnder()}. <br></DD></DT>
*/

    public final void lower()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_lower(nativeId());
    }
    native void __qt_lower(long __this__nativeId);

/**
Translates the widget coordinate <tt>pos</tt> from the coordinate system of <tt>parent</tt> to this widget's coordinate system. The <tt>parent</tt> must not be 0 and must be a parent of the calling widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mapTo(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QPoint) mapTo()}, {@link com.trolltech.qt.gui.QWidget#mapFromParent(com.trolltech.qt.core.QPoint) mapFromParent()}, {@link com.trolltech.qt.gui.QWidget#mapFromGlobal(com.trolltech.qt.core.QPoint) mapFromGlobal()}, and {@link com.trolltech.qt.gui.QWidget#underMouse() underMouse()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint mapFrom(com.trolltech.qt.gui.QWidget arg__1, com.trolltech.qt.core.QPoint arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFrom_QWidget_QPoint(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_mapFrom_QWidget_QPoint(long __this__nativeId, long arg__1, long arg__2);

/**
Translates the global screen coordinate <tt>pos</tt> to widget coordinates. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) mapToGlobal()}, {@link com.trolltech.qt.gui.QWidget#mapFrom(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QPoint) mapFrom()}, and {@link com.trolltech.qt.gui.QWidget#mapFromParent(com.trolltech.qt.core.QPoint) mapFromParent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint mapFromGlobal(com.trolltech.qt.core.QPoint arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromGlobal_QPoint(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_mapFromGlobal_QPoint(long __this__nativeId, long arg__1);

/**
Translates the parent widget coordinate <tt>pos</tt> to widget coordinates. <p>Same as {@link com.trolltech.qt.gui.QWidget#mapFromGlobal(com.trolltech.qt.core.QPoint) mapFromGlobal()} if the widget has no parent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mapToParent(com.trolltech.qt.core.QPoint) mapToParent()}, {@link com.trolltech.qt.gui.QWidget#mapFrom(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QPoint) mapFrom()}, {@link com.trolltech.qt.gui.QWidget#mapFromGlobal(com.trolltech.qt.core.QPoint) mapFromGlobal()}, and {@link com.trolltech.qt.gui.QWidget#underMouse() underMouse()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint mapFromParent(com.trolltech.qt.core.QPoint arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromParent_QPoint(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_mapFromParent_QPoint(long __this__nativeId, long arg__1);

/**
Translates the widget coordinate <tt>pos</tt> to the coordinate system of <tt>parent</tt>. The <tt>parent</tt> must not be 0 and must be a parent of the calling widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mapFrom(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QPoint) mapFrom()}, {@link com.trolltech.qt.gui.QWidget#mapToParent(com.trolltech.qt.core.QPoint) mapToParent()}, {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) mapToGlobal()}, and {@link com.trolltech.qt.gui.QWidget#underMouse() underMouse()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint mapTo(com.trolltech.qt.gui.QWidget arg__1, com.trolltech.qt.core.QPoint arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapTo_QWidget_QPoint(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_mapTo_QWidget_QPoint(long __this__nativeId, long arg__1, long arg__2);

/**
Translates the widget coordinate <tt>pos</tt> to global screen coordinates. For example, <tt>mapToGlobal(QPoint(0,0))</tt> would give the global coordinates of the top-left pixel of the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mapFromGlobal(com.trolltech.qt.core.QPoint) mapFromGlobal()}, {@link com.trolltech.qt.gui.QWidget#mapTo(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QPoint) mapTo()}, and {@link com.trolltech.qt.gui.QWidget#mapToParent(com.trolltech.qt.core.QPoint) mapToParent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint mapToGlobal(com.trolltech.qt.core.QPoint arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToGlobal_QPoint(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_mapToGlobal_QPoint(long __this__nativeId, long arg__1);

/**
Translates the widget coordinate <tt>pos</tt> to a coordinate in the parent widget. <p>Same as {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) mapToGlobal()} if the widget has no parent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mapFromParent(com.trolltech.qt.core.QPoint) mapFromParent()}, {@link com.trolltech.qt.gui.QWidget#mapTo(com.trolltech.qt.gui.QWidget, com.trolltech.qt.core.QPoint) mapTo()}, {@link com.trolltech.qt.gui.QWidget#mapToGlobal(com.trolltech.qt.core.QPoint) mapToGlobal()}, and {@link com.trolltech.qt.gui.QWidget#underMouse() underMouse()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint mapToParent(com.trolltech.qt.core.QPoint arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToParent_QPoint(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_mapToParent_QPoint(long __this__nativeId, long arg__1);

/**
Returns the mask currently set on a widget. If no mask is set the return value will be an empty region. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setMask(com.trolltech.qt.gui.QBitmap) setMask()}, {@link com.trolltech.qt.gui.QWidget#clearMask() clearMask()}, {@link com.trolltech.qt.gui.QRegion#isEmpty() QRegion::isEmpty()}, and {@link <a href="../qtjambi-shapedclock.html">Shaped Clock Example</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion mask()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mask(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_mask(long __this__nativeId);

/**
This property holds the widget's maximum height in pixels. This property corresponds to the height held by the {@link QWidget#maximumSize() maximumSize} property. <p>By default, this property contains a value of 16777215. <p><b>Note:</b> The definition of the <tt>QWIDGETSIZE_MAX</tt> macro limits the maximum size of widgets. <p><DT><b>See also:</b><br><DD>{@link QWidget#maximumSize() maximumSize}, and {@link QWidget#maximumWidth() maximumWidth}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="maximumHeight")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final int maximumHeight()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumHeight(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maximumHeight(long __this__nativeId);

/**
This property holds the widget's maximum size in pixels. The widget cannot be resized to a larger size than the maximum widget size. <p>By default, this property contains a size in which both width and height have values of 16777215. <p><b>Note:</b> The definition of the <tt>QWIDGETSIZE_MAX</tt> macro limits the maximum size of widgets. <p><DT><b>See also:</b><br><DD>{@link QWidget#maximumWidth() maximumWidth}, {@link QWidget#maximumHeight() maximumHeight}, {@link QWidget#minimumSize() minimumSize}, and {@link QWidget#sizeIncrement() sizeIncrement}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="maximumSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize maximumSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_maximumSize(long __this__nativeId);

/**
This property holds the widget's maximum width in pixels. This property corresponds to the width held by the {@link QWidget#maximumSize() maximumSize} property. <p>By default, this property contains a value of 16777215. <p><b>Note:</b> The definition of the <tt>QWIDGETSIZE_MAX</tt> macro limits the maximum size of widgets. <p><DT><b>See also:</b><br><DD>{@link QWidget#maximumSize() maximumSize}, and {@link QWidget#maximumHeight() maximumHeight}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="maximumWidth")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final int maximumWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maximumWidth(long __this__nativeId);

/**
This property holds the widget's minimum height in pixels. This property corresponds to the height held by the {@link QWidget#minimumSize() minimumSize} property. <p>By default, this property has a value of 0. <p><DT><b>See also:</b><br><DD>{@link QWidget#minimumSize() minimumSize}, and {@link QWidget#minimumWidth() minimumWidth}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="minimumHeight")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final int minimumHeight()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumHeight(nativeId());
    }
    @QtBlockedSlot
    native int __qt_minimumHeight(long __this__nativeId);

/**
This property holds the widget's minimum size. The widget cannot be resized to a smaller size than the minimum widget size. The widget's size is forced to the minimum size if the current size is smaller. <p>The minimum size set by this function will override the minimum size defined by {@link com.trolltech.qt.gui.QLayout QLayout}. In order to unset the minimum size, use a value of <tt>QSize(0, 0)</tt>. <p>By default, this property contains a size with zero width and height. <p><DT><b>See also:</b><br><DD>{@link QWidget#minimumWidth() minimumWidth}, {@link QWidget#minimumHeight() minimumHeight}, {@link QWidget#maximumSize() maximumSize}, and {@link QWidget#sizeIncrement() sizeIncrement}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="minimumSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize minimumSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_minimumSize(long __this__nativeId);

/**
This property holds the widget's minimum width in pixels. This property corresponds to the width held by the {@link QWidget#minimumSize() minimumSize} property. <p>By default, this property has a value of 0. <p><DT><b>See also:</b><br><DD>{@link QWidget#minimumSize() minimumSize}, and {@link QWidget#minimumHeight() minimumHeight}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="minimumWidth")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final int minimumWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_minimumWidth(long __this__nativeId);

/**
This property holds the position of the widget within its parent widget. If the widget is a window, the position is that of the widget on the desktop, including its frame. <p>When changing the position, the widget, if visible, receives a move event ({@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()}) immediately. If the widget is not currently visible, it is guaranteed to receive an event before it is shown. <p>By default, this property contains a position that refers to the origin. <p><b>Warning:</b> Calling {@link com.trolltech.qt.gui.QWidget#move(com.trolltech.qt.core.QPoint) move()} or {@link com.trolltech.qt.gui.QWidget#setGeometry(com.trolltech.qt.core.QRect) setGeometry()} inside {@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()} can lead to infinite recursion. <p>See the {@link <a href="../geometry.html">Window Geometry documentation</a>} for an overview of window geometry. <p><DT><b>See also:</b><br><DD>{@link QWidget#frameGeometry() frameGeometry}, {@link QWidget#size() size}, {@link com.trolltech.qt.gui.QWidget#x() x()}, and {@link com.trolltech.qt.gui.QWidget#y() y()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="pos")
    @QtBlockedSlot
    public final void move(com.trolltech.qt.core.QPoint arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_move_QPoint(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_move_QPoint(long __this__nativeId, long arg__1);

/**
This property holds the position of the widget within its parent widget. If the widget is a window, the position is that of the widget on the desktop, including its frame. <p>When changing the position, the widget, if visible, receives a move event ({@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()}) immediately. If the widget is not currently visible, it is guaranteed to receive an event before it is shown. <p>By default, this property contains a position that refers to the origin. <p><b>Warning:</b> Calling {@link com.trolltech.qt.gui.QWidget#move(com.trolltech.qt.core.QPoint) move()} or {@link com.trolltech.qt.gui.QWidget#setGeometry(com.trolltech.qt.core.QRect) setGeometry()} inside {@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()} can lead to infinite recursion. <p>See the {@link <a href="../geometry.html">Window Geometry documentation</a>} for an overview of window geometry. <p><DT><b>See also:</b><br><DD>{@link QWidget#frameGeometry() frameGeometry}, {@link QWidget#size() size}, {@link com.trolltech.qt.gui.QWidget#x() x()}, and {@link com.trolltech.qt.gui.QWidget#y() y()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void move(int x, int y)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_move_int_int(nativeId(), x, y);
    }
    @QtBlockedSlot
    native void __qt_move_int_int(long __this__nativeId, int x, int y);

/**
Returns the native parent for this widget, i. . the next ancestor widget that has a system identifier, or 0 if it does not have any native parent. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#effectiveWinId() effectiveWinId()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget nativeParentWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nativeParentWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_nativeParentWidget(long __this__nativeId);

/**
Returns the next widget in this widget's focus chain.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget nextInFocusChain()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nextInFocusChain(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_nextInFocusChain(long __this__nativeId);

/**
This property holds the geometry of the widget as it will appear when shown as a normal (not maximized or full screen) top-level widget. For child widgets this property always holds an empty rectangle. <p>By default, this property contains an empty rectangle. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#windowState() QWidget::windowState()}, and {@link QWidget#geometry() QWidget::geometry}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="normalGeometry")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect normalGeometry()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_normalGeometry(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_normalGeometry(long __this__nativeId);

/**
Returns the number of different colors available for the paint device. Since this value is an int, it will not be sufficient to represent the number of colors on 32 bit displays, in this case INT_MAX is returned instead.
*/

    @QtBlockedSlot
    public final int numColors()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_numColors(nativeId());
    }
    @QtBlockedSlot
    native int __qt_numColors(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void overrideWindowFlags(com.trolltech.qt.core.Qt.WindowType ... type) {
        this.overrideWindowFlags(new com.trolltech.qt.core.Qt.WindowFlags(type));
    }
/**
Sets the window flags for the widget to <tt>flags</tt>, without telling the window system. <p><b>Warning:</b> Do not call this function unless you really know what you're doing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setWindowFlags(com.trolltech.qt.core.Qt.WindowType[]) setWindowFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void overrideWindowFlags(com.trolltech.qt.core.Qt.WindowFlags type)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_overrideWindowFlags_WindowFlags(nativeId(), type.value());
    }
    @QtBlockedSlot
    native void __qt_overrideWindowFlags_WindowFlags(long __this__nativeId, int type);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void overrideWindowState(com.trolltech.qt.core.Qt.WindowState ... state) {
        this.overrideWindowState(new com.trolltech.qt.core.Qt.WindowStates(state));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void overrideWindowState(com.trolltech.qt.core.Qt.WindowStates state)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_overrideWindowState_WindowStates(nativeId(), state.value());
    }
    @QtBlockedSlot
    native void __qt_overrideWindowState_WindowStates(long __this__nativeId, int state);

/**
Returns true if the device is currently being painted on, i. . someone has called {@link com.trolltech.qt.gui.QPainter#begin(com.trolltech.qt.gui.QPaintDeviceInterface) QPainter::begin()} but not yet called {@link com.trolltech.qt.gui.QPainter#end() QPainter::end()} for this device; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#isActive() QPainter::isActive()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean paintingActive()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paintingActive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_paintingActive(long __this__nativeId);

/**
This property holds the widget's palette. This property describes the widget's palette. The palette is used by the widget's style when rendering standard components, and is available as a means to ensure that custom widgets can maintain consistency with the native platform's look and feel. It's common that different platforms, or different styles, have different palettes. <p>When you assign a new palette to a widget, the color roles from this palette are combined with the widget's default palette to form the widget's final palette. The palette entry for the widget's background role is used to fill the widget's background (see {@link QWidget#autoFillBackground() QWidget::autoFillBackground}), and the foreground role initializes {@link com.trolltech.qt.gui.QPainter QPainter}'s pen. <p>The default depends on the system environment. {@link com.trolltech.qt.gui.QApplication QApplication} maintains a system/theme palette which serves as a default for all widgets. There may also be special palette defaults for certain types of widgets (e.g., on Windows XP and Vista, all classes that derive from {@link com.trolltech.qt.gui.QMenuBar QMenuBar} have a special default palette). You can also define default palettes for widgets yourself by passing a custom palette and the name of a widget to {@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) QApplication::setPalette()}. Finally, the style always has the option of polishing the palette as it's assigned (see {@link com.trolltech.qt.gui.QStyle#polish(com.trolltech.qt.gui.QApplication) QStyle::polish()}). <p>QWidget propagates explicit palette roles from parent to child. If you assign a brush or color to a specific role on a palette and assign that palette to a widget, that role will propagate to all the widget's children, overriding any system defaults for that role. Note that palettes by default don't propagate to windows (see {@link com.trolltech.qt.gui.QWidget#isWindow() isWindow()}) unless the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_WindowPropagation } attribute is enabled. <p>QWidget's palette propagation is similar to its font propagation. <p>The current style, which is used to render the content of all standard Qt widgets, is free to choose colors and brushes from the widget palette, or in some cases, to ignore the palette (partially, or completely). In particular, certain styles like GTK style, Mac style, Windows XP, and Vista style, depend on third party APIs to render the content of widgets, and these styles typically do not follow the palette. Because of this, assigning roles to a widget's palette is not guaranteed to change the appearance of the widget. Instead, you may choose to apply a {@link QWidget#styleSheet() styleSheet}. You can refer to our Knowledge Base article here for more information. <p><b>Warning:</b> Do not use this function in conjunction with {@link <a href="../qtjambi-stylesheet.html">Qt Style Sheets</a>}. When using style sheets, the palette of a widget can be customized using the "color", "background-color", "selection-color", "selection-background-color" and "alternate-background-color". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#palette() QApplication::palette()}, and {@link QWidget#font() QWidget::font()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="palette")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPalette palette()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_palette(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPalette __qt_palette(long __this__nativeId);

/**
Returns the parent of this widget, or 0 if it does not have any parent widget.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget parentWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parentWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_parentWidget(long __this__nativeId);

/**
Returns the horizontal resolution of the device in dots per inch. For example, when printing, this resolution refers to the physical printer's resolution. The logical DPI on the other hand, refers to the resolution used by the actual paint engine. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()}, and {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiX() logicalDpiX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int physicalDpiX()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_physicalDpiX(nativeId());
    }
    @QtBlockedSlot
    native int __qt_physicalDpiX(long __this__nativeId);

/**
Returns the horizontal resolution of the device in dots per inch. For example, when printing, this resolution refers to the physical printer's resolution. The logical DPI on the other hand, refers to the resolution used by the actual paint engine. <p>Note that if the {@link com.trolltech.qt.gui.QPaintDevice#physicalDpiY() physicalDpiY()} doesn't equal the {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}, the corresponding {@link com.trolltech.qt.gui.QPaintEngine QPaintEngine} must handle the resolution mapping. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#physicalDpiX() physicalDpiX()}, and {@link com.trolltech.qt.gui.QPaintDevice#logicalDpiY() logicalDpiY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int physicalDpiY()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_physicalDpiY(nativeId());
    }
    @QtBlockedSlot
    native int __qt_physicalDpiY(long __this__nativeId);

/**
This property holds the position of the widget within its parent widget. If the widget is a window, the position is that of the widget on the desktop, including its frame. <p>When changing the position, the widget, if visible, receives a move event ({@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()}) immediately. If the widget is not currently visible, it is guaranteed to receive an event before it is shown. <p>By default, this property contains a position that refers to the origin. <p><b>Warning:</b> Calling {@link com.trolltech.qt.gui.QWidget#move(com.trolltech.qt.core.QPoint) move()} or {@link com.trolltech.qt.gui.QWidget#setGeometry(com.trolltech.qt.core.QRect) setGeometry()} inside {@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()} can lead to infinite recursion. <p>See the {@link <a href="../geometry.html">Window Geometry documentation</a>} for an overview of window geometry. <p><DT><b>See also:</b><br><DD>{@link QWidget#frameGeometry() frameGeometry}, {@link QWidget#size() size}, {@link com.trolltech.qt.gui.QWidget#x() x()}, and {@link com.trolltech.qt.gui.QWidget#y() y()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="pos")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint pos()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_pos(long __this__nativeId);

/**
Raises this widget to the top of the parent widget's stack. <p>After this call the widget will be visually in front of any overlapping sibling widgets. <p><b>Note:</b> When using {@link com.trolltech.qt.gui.QWidget#activateWindow() activateWindow()}, you can call this function to ensure that the window is stacked on top. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#lower() lower()}, and {@link com.trolltech.qt.gui.QWidget#stackUnder(com.trolltech.qt.gui.QWidget) stackUnder()}. <br></DD></DT>
*/

    public final void raise()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_raise(nativeId());
    }
    native void __qt_raise(long __this__nativeId);

/**
This property holds the internal geometry of the widget excluding any window frame. The rect property equals {@link com.trolltech.qt.core.QRect QRect}(0, 0, {@link com.trolltech.qt.gui.QWidget#width() width()}, {@link com.trolltech.qt.gui.QWidget#height() height()}). <p>See the {@link <a href="../geometry.html">Window Geometry documentation</a>} for an overview of window geometry. <p>By default, this property contains a value that depends on the user's platform and screen geometry. <p><DT><b>See also:</b><br><DD>{@link QWidget#size() size}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="rect")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect rect()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rect(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_rect(long __this__nativeId);

/**
Releases the keyboard grab. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#grabKeyboard() grabKeyboard()}, {@link com.trolltech.qt.gui.QWidget#grabMouse() grabMouse()}, and {@link com.trolltech.qt.gui.QWidget#releaseMouse() releaseMouse()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void releaseKeyboard()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_releaseKeyboard(nativeId());
    }
    @QtBlockedSlot
    native void __qt_releaseKeyboard(long __this__nativeId);

/**
Releases the mouse grab. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#grabMouse() grabMouse()}, {@link com.trolltech.qt.gui.QWidget#grabKeyboard() grabKeyboard()}, and {@link com.trolltech.qt.gui.QWidget#releaseKeyboard() releaseKeyboard()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void releaseMouse()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_releaseMouse(nativeId());
    }
    @QtBlockedSlot
    native void __qt_releaseMouse(long __this__nativeId);

/**
Removes the shortcut with the given <tt>id</tt> from Qt's shortcut system. The widget will no longer receive {@link com.trolltech.qt.core.QEvent.Type QEvent::Shortcut } events for the shortcut's key sequence (unless it has other shortcuts with the same key sequence). <p><b>Warning:</b> You should not normally need to use this function since Qt's shortcut system removes shortcuts automatically when their parent widget is destroyed. It is best to use {@link com.trolltech.qt.gui.QAction QAction} or {@link com.trolltech.qt.gui.QShortcut QShortcut} to handle shortcuts, since they are easier to use than this low-level function. Note also that this is an expensive operation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#grabShortcut(com.trolltech.qt.gui.QKeySequence) grabShortcut()}, and {@link com.trolltech.qt.gui.QWidget#setShortcutEnabled(int) setShortcutEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void releaseShortcut(int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_releaseShortcut_int(nativeId(), id);
    }
    @QtBlockedSlot
    native void __qt_releaseShortcut_int(long __this__nativeId, int id);

/**
Removes the action <tt>action</tt> from this widget's list of actions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()}, {@link com.trolltech.qt.gui.QWidget#actions() actions()}, and {@link com.trolltech.qt.gui.QWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeAction(com.trolltech.qt.gui.QAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (action != null) {
            while (__rcActions.remove(action)) ;
        }
        __qt_removeAction_QAction(nativeId(), action == null ? 0 : action.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeAction_QAction(long __this__nativeId, long action);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPaintDeviceInterface target, com.trolltech.qt.core.QPoint targetOffset, com.trolltech.qt.gui.QRegion sourceRegion, com.trolltech.qt.gui.QWidget.RenderFlag ... renderFlags) {
        this.render(target, targetOffset, sourceRegion, new com.trolltech.qt.gui.QWidget.RenderFlags(renderFlags));
    }

/**
Renders the <tt>sourceRegion</tt> of this widget into the <tt>target</tt> using <tt>renderFlags</tt> to determine how to render. Rendering starts at <tt>targetOffset</tt> in the <tt>target</tt>. For example: <pre class="snippet">
        QPixmap pixmap = new QPixmap(widget.size());
        widget.render(pixmap);
</pre> If <tt>sourceRegion</tt> is a null region, this function will use {@link QWidget#rect() QWidget::rect()} as the region, i.e. the entire widget. <p><b>Note:</b> Make sure to call {@link com.trolltech.qt.gui.QPainter#end() QPainter::end()} for the given <tt>target</tt>'s active painter (if any) before rendering. For example: <pre class="snippet">
        QPainter painter = new QPainter(this);
        //...
        painter.end();
        myWidget.render(this);
</pre>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPaintDeviceInterface target, com.trolltech.qt.core.QPoint targetOffset, com.trolltech.qt.gui.QRegion sourceRegion) {
        render(target, targetOffset, sourceRegion, new com.trolltech.qt.gui.QWidget.RenderFlags(RenderFlag.DrawWindowBackground, RenderFlag.DrawChildren));
    }

/**
Renders the <tt>sourceRegion</tt> of this widget into the <tt>target</tt> using <tt>renderFlags</tt> to determine how to render. Rendering starts at <tt>targetOffset</tt> in the <tt>target</tt>. For example: <pre class="snippet">
        QPixmap pixmap = new QPixmap(widget.size());
        widget.render(pixmap);
</pre> If <tt>sourceRegion</tt> is a null region, this function will use {@link QWidget#rect() QWidget::rect()} as the region, i.e. the entire widget. <p><b>Note:</b> Make sure to call {@link com.trolltech.qt.gui.QPainter#end() QPainter::end()} for the given <tt>target</tt>'s active painter (if any) before rendering. For example: <pre class="snippet">
        QPainter painter = new QPainter(this);
        //...
        painter.end();
        myWidget.render(this);
</pre>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPaintDeviceInterface target, com.trolltech.qt.core.QPoint targetOffset) {
        render(target, targetOffset, (com.trolltech.qt.gui.QRegion)new com.trolltech.qt.gui.QRegion(), new com.trolltech.qt.gui.QWidget.RenderFlags(RenderFlag.DrawWindowBackground, RenderFlag.DrawChildren));
    }

/**
Renders the <tt>sourceRegion</tt> of this widget into the <tt>target</tt> using <tt>renderFlags</tt> to determine how to render. Rendering starts at <tt>targetOffset</tt> in the <tt>target</tt>. For example: <pre class="snippet">
        QPixmap pixmap = new QPixmap(widget.size());
        widget.render(pixmap);
</pre> If <tt>sourceRegion</tt> is a null region, this function will use {@link QWidget#rect() QWidget::rect()} as the region, i.e. the entire widget. <p><b>Note:</b> Make sure to call {@link com.trolltech.qt.gui.QPainter#end() QPainter::end()} for the given <tt>target</tt>'s active painter (if any) before rendering. For example: <pre class="snippet">
        QPainter painter = new QPainter(this);
        //...
        painter.end();
        myWidget.render(this);
</pre>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPaintDeviceInterface target) {
        render(target, (com.trolltech.qt.core.QPoint)new com.trolltech.qt.core.QPoint(), (com.trolltech.qt.gui.QRegion)new com.trolltech.qt.gui.QRegion(), new com.trolltech.qt.gui.QWidget.RenderFlags(RenderFlag.DrawWindowBackground, RenderFlag.DrawChildren));
    }
/**
Renders the <tt>sourceRegion</tt> of this widget into the <tt>target</tt> using <tt>renderFlags</tt> to determine how to render. Rendering starts at <tt>targetOffset</tt> in the <tt>target</tt>. For example: <pre class="snippet">
        QPixmap pixmap = new QPixmap(widget.size());
        widget.render(pixmap);
</pre> If <tt>sourceRegion</tt> is a null region, this function will use {@link QWidget#rect() QWidget::rect()} as the region, i.e. the entire widget. <p><b>Note:</b> Make sure to call {@link com.trolltech.qt.gui.QPainter#end() QPainter::end()} for the given <tt>target</tt>'s active painter (if any) before rendering. For example: <pre class="snippet">
        QPainter painter = new QPainter(this);
        //...
        painter.end();
        myWidget.render(this);
</pre>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPaintDeviceInterface target, com.trolltech.qt.core.QPoint targetOffset, com.trolltech.qt.gui.QRegion sourceRegion, com.trolltech.qt.gui.QWidget.RenderFlags renderFlags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_render_QPaintDevice_QPoint_QRegion_RenderFlags(nativeId(), target == null ? 0 : target.nativeId(), targetOffset == null ? 0 : targetOffset.nativeId(), sourceRegion == null ? 0 : sourceRegion.nativeId(), renderFlags.value());
    }
    @QtBlockedSlot
    native void __qt_render_QPaintDevice_QPoint_QRegion_RenderFlags(long __this__nativeId, long target, long targetOffset, long sourceRegion, int renderFlags);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QPoint targetOffset, com.trolltech.qt.gui.QRegion sourceRegion, com.trolltech.qt.gui.QWidget.RenderFlag ... renderFlags) {
        this.render(painter, targetOffset, sourceRegion, new com.trolltech.qt.gui.QWidget.RenderFlags(renderFlags));
    }

/**
This is an overloaded member function, provided for convenience. <p>Renders the widget into the <tt>painter</tt>'s {@link com.trolltech.qt.gui.QPainter#device() QPainter::device()}. <p>Transformations and settings applied to the <tt>painter</tt> will be used when rendering. <p><b>Note:</b> The <tt>painter</tt> must be active. On Mac OS X the widget will be rendered into a {@link com.trolltech.qt.gui.QPixmap QPixmap} and then drawn by the <tt>painter</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#device() QPainter::device()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QPoint targetOffset, com.trolltech.qt.gui.QRegion sourceRegion) {
        render(painter, targetOffset, sourceRegion, new com.trolltech.qt.gui.QWidget.RenderFlags(RenderFlag.DrawWindowBackground, RenderFlag.DrawChildren));
    }

/**
This is an overloaded member function, provided for convenience. <p>Renders the widget into the <tt>painter</tt>'s {@link com.trolltech.qt.gui.QPainter#device() QPainter::device()}. <p>Transformations and settings applied to the <tt>painter</tt> will be used when rendering. <p><b>Note:</b> The <tt>painter</tt> must be active. On Mac OS X the widget will be rendered into a {@link com.trolltech.qt.gui.QPixmap QPixmap} and then drawn by the <tt>painter</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#device() QPainter::device()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QPoint targetOffset) {
        render(painter, targetOffset, (com.trolltech.qt.gui.QRegion)new com.trolltech.qt.gui.QRegion(), new com.trolltech.qt.gui.QWidget.RenderFlags(RenderFlag.DrawWindowBackground, RenderFlag.DrawChildren));
    }
/**
This is an overloaded member function, provided for convenience. <p>Renders the widget into the <tt>painter</tt>'s {@link com.trolltech.qt.gui.QPainter#device() QPainter::device()}. <p>Transformations and settings applied to the <tt>painter</tt> will be used when rendering. <p><b>Note:</b> The <tt>painter</tt> must be active. On Mac OS X the widget will be rendered into a {@link com.trolltech.qt.gui.QPixmap QPixmap} and then drawn by the <tt>painter</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPainter#device() QPainter::device()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void render(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QPoint targetOffset, com.trolltech.qt.gui.QRegion sourceRegion, com.trolltech.qt.gui.QWidget.RenderFlags renderFlags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_render_QPainter_QPoint_QRegion_RenderFlags(nativeId(), painter == null ? 0 : painter.nativeId(), targetOffset == null ? 0 : targetOffset.nativeId(), sourceRegion == null ? 0 : sourceRegion.nativeId(), renderFlags.value());
    }
    @QtBlockedSlot
    native void __qt_render_QPainter_QPoint_QRegion_RenderFlags(long __this__nativeId, long painter, long targetOffset, long sourceRegion, int renderFlags);

/**
Repaints the widget directly by calling {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()} immediately, unless updates are disabled or the widget is hidden. <p>We suggest only using {@link com.trolltech.qt.gui.QWidget#repaint() repaint()} if you need an immediate repaint, for example during animation. In almost all circumstances {@link com.trolltech.qt.gui.QWidget#update() update()} is better, as it permits Qt to optimize for speed and minimize flicker. <p><b>Warning:</b> If you call {@link com.trolltech.qt.gui.QWidget#repaint() repaint()} in a function which may itself be called from {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}, you may get infinite recursion. The {@link com.trolltech.qt.gui.QWidget#update() update()} function never causes recursion. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#update() update()}, {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}, and {@link com.trolltech.qt.gui.QWidget#setUpdatesEnabled(boolean) setUpdatesEnabled()}. <br></DD></DT>
*/

    public final void repaint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_repaint(nativeId());
    }
    native void __qt_repaint(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>This version repaints a rectangle <tt>rect</tt> inside the widget.
*/

    @QtBlockedSlot
    public final void repaint(com.trolltech.qt.core.QRect arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_repaint_QRect(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_repaint_QRect(long __this__nativeId, long arg__1);

/**
This is an overloaded member function, provided for convenience. <p>This version repaints a region <tt>rgn</tt> inside the widget.
*/

    @QtBlockedSlot
    public final void repaint(com.trolltech.qt.gui.QRegion arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_repaint_QRegion(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_repaint_QRegion(long __this__nativeId, long arg__1);

/**
This is an overloaded member function, provided for convenience. <p>This version repaints a rectangle (<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>) inside the widget. <p>If <tt>w</tt> is negative, it is replaced with <tt>width() - x</tt>, and if <tt>h</tt> is negative, it is replaced width <tt>height() - y</tt>.
*/

    @QtBlockedSlot
    public final void repaint(int x, int y, int w, int h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_repaint_int_int_int_int(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_repaint_int_int_int_int(long __this__nativeId, int x, int y, int w, int h);

/**
This function can be called on the widget that currently has focus to reset the input method operating on it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContext QInputContext}, and {@link com.trolltech.qt.gui.QInputContext#reset() QInputContext::reset()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void resetInputContext()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resetInputContext(nativeId());
    }
    @QtBlockedSlot
    native void __qt_resetInputContext(long __this__nativeId);

/**
This property holds the size of the widget excluding any window frame. If the widget is visible when it is being resized, it receives a resize event ({@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}) immediately. If the widget is not currently visible, it is guaranteed to receive an event before it is shown. <p>The size is adjusted if it lies outside the range defined by {@link com.trolltech.qt.gui.QWidget#minimumSize() minimumSize()} and {@link com.trolltech.qt.gui.QWidget#maximumSize() maximumSize()}. <p>By default, this property contains a value that depends on the user's platform and screen geometry. <p><b>Warning:</b> Calling {@link com.trolltech.qt.gui.QWidget#resize(com.trolltech.qt.core.QSize) resize()} or {@link com.trolltech.qt.gui.QWidget#setGeometry(com.trolltech.qt.core.QRect) setGeometry()} inside {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()} can lead to infinite recursion. <p><b>Note:</b> Setting the size to <tt>QSize(0, 0)</tt> will cause the widget to not appear on screen. This also applies to windows. <p><DT><b>See also:</b><br><DD>{@link QWidget#pos() pos}, {@link QWidget#geometry() geometry}, {@link QWidget#minimumSize() minimumSize}, {@link QWidget#maximumSize() maximumSize}, and {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="size")
    @QtBlockedSlot
    public final void resize(com.trolltech.qt.core.QSize arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resize_QSize(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resize_QSize(long __this__nativeId, long arg__1);

/**
This property holds the size of the widget excluding any window frame. If the widget is visible when it is being resized, it receives a resize event ({@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}) immediately. If the widget is not currently visible, it is guaranteed to receive an event before it is shown. <p>The size is adjusted if it lies outside the range defined by {@link com.trolltech.qt.gui.QWidget#minimumSize() minimumSize()} and {@link com.trolltech.qt.gui.QWidget#maximumSize() maximumSize()}. <p>By default, this property contains a value that depends on the user's platform and screen geometry. <p><b>Warning:</b> Calling {@link com.trolltech.qt.gui.QWidget#resize(com.trolltech.qt.core.QSize) resize()} or {@link com.trolltech.qt.gui.QWidget#setGeometry(com.trolltech.qt.core.QRect) setGeometry()} inside {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()} can lead to infinite recursion. <p><b>Note:</b> Setting the size to <tt>QSize(0, 0)</tt> will cause the widget to not appear on screen. This also applies to windows. <p><DT><b>See also:</b><br><DD>{@link QWidget#pos() pos}, {@link QWidget#geometry() geometry}, {@link QWidget#minimumSize() minimumSize}, {@link QWidget#maximumSize() maximumSize}, and {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void resize(int w, int h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resize_int_int(nativeId(), w, h);
    }
    @QtBlockedSlot
    native void __qt_resize_int_int(long __this__nativeId, int w, int h);

/**
Restores the geometry and state top-level widgets stored in the byte array <tt>geometry</tt>. Returns true on success; otherwise returns false. <p>If the restored geometry is off-screen, it will be modified to be inside the the available screen geometry. <p>To restore geometry saved using {@link com.trolltech.qt.core.QSettings QSettings}, you can use code like this: <pre class="snippet">
        QSettings settings = new QSettings("MyCompany", "MyApp");
        myWidget.restoreGeometry((QByteArray) settings.value("myWidget/geometry"));
</pre> See the {@link <a href="../geometry.html">Window Geometry documentation</a>} for an overview of geometry issues with windows. <p>Use {@link com.trolltech.qt.gui.QMainWindow#restoreState(com.trolltech.qt.core.QByteArray) QMainWindow::restoreState()} to restore the geometry and the state of toolbars and dock widgets. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#saveGeometry() saveGeometry()}, {@link com.trolltech.qt.core.QSettings QSettings}, {@link com.trolltech.qt.gui.QMainWindow#saveState() QMainWindow::saveState()}, and {@link com.trolltech.qt.gui.QMainWindow#restoreState(com.trolltech.qt.core.QByteArray) QMainWindow::restoreState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean restoreGeometry(com.trolltech.qt.core.QByteArray geometry)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_restoreGeometry_QByteArray(nativeId(), geometry == null ? 0 : geometry.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_restoreGeometry_QByteArray(long __this__nativeId, long geometry);

/**
Saves the current geometry and state for top-level widgets. <p>To save the geometry when the window closes, you can implement a close event like this: <pre class="snippet">
    protected void closeEvent(QCloseEvent event)
    {
        QSettings settings = new QSettings("MyCompany", "MyApp");
        settings.setValue("geometry", saveGeometry());
        super.closeEvent(event);
    }
</pre> See the {@link <a href="../geometry.html">Window Geometry documentation</a>} for an overview of geometry issues with windows. <p>Use {@link com.trolltech.qt.gui.QMainWindow#saveState() QMainWindow::saveState()} to save the geometry and the state of toolbars and dock widgets. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#restoreGeometry(com.trolltech.qt.core.QByteArray) restoreGeometry()}, {@link com.trolltech.qt.gui.QMainWindow#saveState() QMainWindow::saveState()}, and {@link com.trolltech.qt.gui.QMainWindow#restoreState(com.trolltech.qt.core.QByteArray) QMainWindow::restoreState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray saveGeometry()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_saveGeometry(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_saveGeometry(long __this__nativeId);

/**
Scrolls the widget including its children <tt>dx</tt> pixels to the right and <tt>dy</tt> downward. Both <tt>dx</tt> and <tt>dy</tt> may be negative. <p>After scrolling, the widgets will receive paint events for the areas that need to be repainted. For widgets that Qt knows to be opaque, this is only the newly exposed parts. For example, if an opaque widget is scrolled 8 pixels to the left, only an 8-pixel wide stripe at the right edge needs updating. <p>Since widgets propagate the contents of their parents by default, you need to set the {@link QWidget#autoFillBackground() autoFillBackground} property, or use {@link com.trolltech.qt.gui.QWidget#setAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) setAttribute()} to set the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_OpaquePaintEvent } attribute, to make a widget opaque. <p>For widgets that use contents propagation, a scroll will cause an update of the entire scroll area. <p><DT><b>See also:</b><br><DD>Transparency and Double Buffering. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void scroll(int dx, int dy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scroll_int_int(nativeId(), dx, dy);
    }
    @QtBlockedSlot
    native void __qt_scroll_int_int(long __this__nativeId, int dx, int dy);

/**
This is an overloaded member function, provided for convenience. <p>This version only scrolls <tt>r</tt> and does not move the children of the widget. <p>If <tt>r</tt> is empty or invalid, the result is undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QScrollArea QScrollArea}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void scroll(int dx, int dy, com.trolltech.qt.core.QRect arg__3)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_scroll_int_int_QRect(nativeId(), dx, dy, arg__3 == null ? 0 : arg__3.nativeId());
    }
    @QtBlockedSlot
    native void __qt_scroll_int_int_QRect(long __this__nativeId, int dx, int dy, long arg__3);

/**
This property holds whether drop events are enabled for this widget. Setting this property to true announces to the system that this widget may be able to accept drop events. <p>If the widget is the desktop ({@link com.trolltech.qt.gui.QWidget#windowType() windowType()} == {@link com.trolltech.qt.core.Qt.WindowType Qt::Desktop }), this may fail if another application is using the desktop; you can call {@link com.trolltech.qt.gui.QWidget#acceptDrops() acceptDrops()} to test if this occurs. <p><b>Warning:</b> Do not modify this property in a drag and drop event handler. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtjambi-dnd.html">Drag and Drop</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="acceptDrops")
    @QtBlockedSlot
    public final void setAcceptDrops(boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAcceptDrops_boolean(nativeId(), on);
    }
    @QtBlockedSlot
    native void __qt_setAcceptDrops_boolean(long __this__nativeId, boolean on);

/**
This property holds the widget's description as seen by assistive technologies. By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) QAccessibleInterface::text()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="accessibleDescription")
    @QtBlockedSlot
    public final void setAccessibleDescription(java.lang.String description)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAccessibleDescription_String(nativeId(), description);
    }
    @QtBlockedSlot
    native void __qt_setAccessibleDescription_String(long __this__nativeId, java.lang.String description);

/**
This property holds the widget's name as seen by assistive technologies. This property is used by accessible clients to identify, find, or announce the widget for accessible clients. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) QAccessibleInterface::text()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="accessibleName")
    @QtBlockedSlot
    public final void setAccessibleName(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAccessibleName_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setAccessibleName_String(long __this__nativeId, java.lang.String name);


/**
Sets the attribute <tt>attribute</tt> on this widget if <tt>on</tt> is true; otherwise clears the attribute. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#testAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) testAttribute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAttribute(com.trolltech.qt.core.Qt.WidgetAttribute arg__1) {
        setAttribute(arg__1, (boolean)true);
    }
/**
Sets the attribute <tt>attribute</tt> on this widget if <tt>on</tt> is true; otherwise clears the attribute. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#testAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) testAttribute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAttribute(com.trolltech.qt.core.Qt.WidgetAttribute arg__1, boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttribute_WidgetAttribute_boolean(nativeId(), arg__1.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setAttribute_WidgetAttribute_boolean(long __this__nativeId, int arg__1, boolean on);

/**
This property holds whether the widget background is filled automatically. If enabled, this property will cause Qt to fill the background of the widget before invoking the paint event. The color used is defined by the {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Window } color role from the widget's {@link com.trolltech.qt.gui.QPalette palette}. <p>In addition, Windows are always filled with {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::Window }, unless the WA_OpaquePaintEvent or WA_NoSystemBackground attributes are set. <p>This property cannot be turned off (i.e., set to false) if a widget's parent has a static gradient for its background. <p><b>Warning:</b> Use this property with caution in conjunction with {@link <a href="../qtjambi-stylesheet.html">Qt Style Sheets</a>}. When a widget has a style sheet with a valid background or a border-image, this property is automatically disabled. <p>By default, this property is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_OpaquePaintEvent }, {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_NoSystemBackground }, and Transparency and Double Buffering. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="autoFillBackground")
    @QtBlockedSlot
    public final void setAutoFillBackground(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoFillBackground_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setAutoFillBackground_boolean(long __this__nativeId, boolean enabled);

/**
Sets the background role of the widget to <tt>role</tt>. <p>The background role defines the brush from the widget's {@link QWidget#palette() palette} that is used to render the background. <p>If <tt>role</tt> is {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::NoRole }, then the widget inherits its parent's background role. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#backgroundRole() backgroundRole()}, and {@link com.trolltech.qt.gui.QWidget#foregroundRole() foregroundRole()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBackgroundRole(com.trolltech.qt.gui.QPalette.ColorRole arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackgroundRole_ColorRole(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setBackgroundRole_ColorRole(long __this__nativeId, int arg__1);

/**
This property holds the base size of the widget. The base size is used to calculate a proper widget size if the widget defines {@link com.trolltech.qt.gui.QWidget#sizeIncrement() sizeIncrement()}. <p>By default, for a newly-created widget, this property contains a size with zero width and height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setSizeIncrement(com.trolltech.qt.core.QSize) setSizeIncrement()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="baseSize")
    @QtBlockedSlot
    public final void setBaseSize(com.trolltech.qt.core.QSize arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBaseSize_QSize(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBaseSize_QSize(long __this__nativeId, long arg__1);

/**
This property holds the base size of the widget. The base size is used to calculate a proper widget size if the widget defines {@link com.trolltech.qt.gui.QWidget#sizeIncrement() sizeIncrement()}. <p>By default, for a newly-created widget, this property contains a size with zero width and height. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setSizeIncrement(com.trolltech.qt.core.QSize) setSizeIncrement()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBaseSize(int basew, int baseh)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBaseSize_int_int(nativeId(), basew, baseh);
    }
    @QtBlockedSlot
    native void __qt_setBaseSize_int_int(long __this__nativeId, int basew, int baseh);

/**
Sets the margins around the contents of the widget to have the sizes <tt>left</tt>, <tt>top</tt>, <tt>right</tt>, and <tt>bottom</tt>. The margins are used by the layout system, and may be used by subclasses to specify the area to draw in (e.g. excluding the frame). <p>Changing the margins will trigger a {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#contentsRect() contentsRect()}, and {@link com.trolltech.qt.gui.QWidget#getContentsMargins() getContentsMargins()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setContentsMargins(int left, int top, int right, int bottom)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setContentsMargins_int_int_int_int(nativeId(), left, top, right, bottom);
    }
    @QtBlockedSlot
    native void __qt_setContentsMargins_int_int_int_int(long __this__nativeId, int left, int top, int right, int bottom);

/**
This property holds how the widget shows a context menu. The default value of this property is {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::DefaultContextMenu }, which means the {@link com.trolltech.qt.gui.QWidget#contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent) contextMenuEvent()} handler is called. Other values are {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::NoContextMenu }, {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::PreventContextMenu }, {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::ActionsContextMenu }, and {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::CustomContextMenu }. With {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::CustomContextMenu }, the signal {@link com.trolltech.qt.gui.QWidget#customContextMenuRequested customContextMenuRequested() } is emitted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent) contextMenuEvent()}, {@link com.trolltech.qt.gui.QWidget#customContextMenuRequested customContextMenuRequested() }, and {@link com.trolltech.qt.gui.QWidget#actions() actions()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="contextMenuPolicy")
    @QtBlockedSlot
    public final void setContextMenuPolicy(com.trolltech.qt.core.Qt.ContextMenuPolicy policy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setContextMenuPolicy_ContextMenuPolicy(nativeId(), policy.value());
    }
    @QtBlockedSlot
    native void __qt_setContextMenuPolicy_ContextMenuPolicy(long __this__nativeId, int policy);

/**
This property holds the cursor shape for this widget. The mouse cursor will assume this shape when it's over this widget. See the {@link com.trolltech.qt.core.Qt.CursorShape list of predefined cursor objects } for a range of useful shapes. <p>An editor widget might use an I-beam cursor: <pre class="snippet">
        w.setCursor(new QCursor(Qt.CursorShape.IBeamCursor));
</pre> If no cursor has been set, or after a call to {@link com.trolltech.qt.gui.QWidget#unsetCursor() unsetCursor()}, the parent's cursor is used. <p>By default, this property contains a cursor with the {@link com.trolltech.qt.core.Qt.CursorShape Qt::ArrowCursor } shape. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) QApplication::setOverrideCursor()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="cursor")
    @QtBlockedSlot
    public final void setCursor(com.trolltech.qt.gui.QCursor arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCursor_QCursor(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCursor_QCursor(long __this__nativeId, long arg__1);

/**
Disables widget input events if <tt>disable</tt> is true; otherwise enables input events. <p>See the {@link QWidget#isEnabled() enabled} documentation for more information. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#isEnabledTo(com.trolltech.qt.gui.QWidget) isEnabledTo()}, {@link com.trolltech.qt.gui.QKeyEvent QKeyEvent}, {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}, and {@link com.trolltech.qt.gui.QWidget#changeEvent(com.trolltech.qt.core.QEvent) changeEvent()}. <br></DD></DT>
*/

    public final void setDisabled(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDisabled_boolean(nativeId(), arg__1);
    }
    native void __qt_setDisabled_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds whether the widget is enabled. An enabled widget handles keyboard and mouse events; a disabled widget does not. <p>Some widgets display themselves differently when they are disabled. For example a button might draw its label grayed out. If your widget needs to know when it becomes enabled or disabled, you can use the {@link com.trolltech.qt.gui.QWidget#changeEvent(com.trolltech.qt.core.QEvent) changeEvent()} with type {@link com.trolltech.qt.core.QEvent.Type QEvent::EnabledChange }. <p>Disabling a widget implicitly disables all its children. Enabling respectively enables all child widgets unless they have been explicitly disabled. <p>By default, this property is true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#isEnabledTo(com.trolltech.qt.gui.QWidget) isEnabledTo()}, {@link com.trolltech.qt.gui.QKeyEvent QKeyEvent}, {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}, and {@link com.trolltech.qt.gui.QWidget#changeEvent(com.trolltech.qt.core.QEvent) changeEvent()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="enabled")
    public final void setEnabled(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEnabled_boolean(nativeId(), arg__1);
    }
    native void __qt_setEnabled_boolean(long __this__nativeId, boolean arg__1);

/**
Sets both the minimum and maximum heights of the widget to <tt>h</tt> without changing the widths. Provided for convenience. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()}, {@link com.trolltech.qt.gui.QWidget#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QWidget#maximumSize() maximumSize()}, and {@link com.trolltech.qt.gui.QWidget#setFixedSize(com.trolltech.qt.core.QSize) setFixedSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFixedHeight(int h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFixedHeight_int(nativeId(), h);
    }
    @QtBlockedSlot
    native void __qt_setFixedHeight_int(long __this__nativeId, int h);

/**
Sets both the minimum and maximum sizes of the widget to <tt>s</tt>, thereby preventing it from ever growing or shrinking. <p>This will override the default size constraints set by {@link com.trolltech.qt.gui.QLayout QLayout}. <p>Alternatively, if you want the widget to have a fixed size based on its contents, you can call QLayout::setSizeConstraint({@link com.trolltech.qt.gui.QLayout.SizeConstraint QLayout::SetFixedSize }); <p><DT><b>See also:</b><br><DD>{@link QWidget#maximumSize() maximumSize}, and {@link QWidget#minimumSize() minimumSize}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFixedSize(com.trolltech.qt.core.QSize arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFixedSize_QSize(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFixedSize_QSize(long __this__nativeId, long arg__1);

/**
This is an overloaded member function, provided for convenience. <p>Sets the width of the widget to <tt>w</tt> and the height to <tt>h</tt>.
*/

    @QtBlockedSlot
    public final void setFixedSize(int w, int h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFixedSize_int_int(nativeId(), w, h);
    }
    @QtBlockedSlot
    native void __qt_setFixedSize_int_int(long __this__nativeId, int w, int h);

/**
Sets both the minimum and maximum width of the widget to <tt>w</tt> without changing the heights. Provided for convenience. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()}, {@link com.trolltech.qt.gui.QWidget#minimumSize() minimumSize()}, {@link com.trolltech.qt.gui.QWidget#maximumSize() maximumSize()}, and {@link com.trolltech.qt.gui.QWidget#setFixedSize(com.trolltech.qt.core.QSize) setFixedSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFixedWidth(int w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFixedWidth_int(nativeId(), w);
    }
    @QtBlockedSlot
    native void __qt_setFixedWidth_int(long __this__nativeId, int w);

/**
This is an overloaded member function, provided for convenience. <p>Gives the keyboard input focus to this widget (or its focus proxy) if this widget or one of its parents is the {@link com.trolltech.qt.gui.QWidget#isActiveWindow() active window}.
*/

    public final void setFocus()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFocus(nativeId());
    }
    native void __qt_setFocus(long __this__nativeId);

/**
Gives the keyboard input focus to this widget (or its focus proxy) if this widget or one of its parents is the {@link com.trolltech.qt.gui.QWidget#isActiveWindow() active window}. The <tt>reason</tt> argument will be passed into any focus event sent from this function, it is used to give an explanation of what caused the widget to get focus. <p>First, a focus out event is sent to the focus widget (if any) to tell it that it is about to lose the focus. Then a focus in event is sent to this widget to tell it that it just received the focus. (Nothing happens if the focus in and focus out widgets are the same.) <p>{@link com.trolltech.qt.gui.QWidget#setFocus() setFocus()} gives focus to a widget regardless of its focus policy, but does not clear any keyboard grab (see {@link com.trolltech.qt.gui.QWidget#grabKeyboard() grabKeyboard()}). <p>Be aware that if the widget is hidden, it will not accept focus until it is shown. <p><b>Warning:</b> If you call {@link com.trolltech.qt.gui.QWidget#setFocus() setFocus()} in a function which may itself be called from {@link com.trolltech.qt.gui.QWidget#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()} or {@link com.trolltech.qt.gui.QWidget#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()}, you may get an infinite recursion. <p>{@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) setFocusPolicy()}{@link com.trolltech.qt.gui.QApplication#focusWidget() QApplication::focusWidget()}{@link com.trolltech.qt.gui.QWidget#grabKeyboard() grabKeyboard()}{@link com.trolltech.qt.gui.QWidget#grabMouse() grabMouse()}, {Keyboard Focus} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#hasFocus() hasFocus()}, {@link com.trolltech.qt.gui.QWidget#clearFocus() clearFocus()}, {@link com.trolltech.qt.gui.QWidget#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()}, and {@link com.trolltech.qt.gui.QWidget#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFocus(com.trolltech.qt.core.Qt.FocusReason reason)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFocus_FocusReason(nativeId(), reason.value());
    }
    @QtBlockedSlot
    native void __qt_setFocus_FocusReason(long __this__nativeId, int reason);

/**
This property holds the way the widget accepts keyboard focus. The policy is {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::TabFocus } if the widget accepts keyboard focus by tabbing, {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::ClickFocus } if the widget accepts focus by clicking, {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::StrongFocus } if it accepts both, and {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::NoFocus } (the default) if it does not accept focus at all. <p>You must enable keyboard focus for a widget if it processes keyboard events. This is normally done from the widget's constructor. For instance, the {@link com.trolltech.qt.gui.QLineEdit QLineEdit} constructor calls setFocusPolicy({@link com.trolltech.qt.core.Qt.FocusPolicy Qt::StrongFocus }). <p>If the widget has a focus proxy, then the focus policy will be propagated to it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()}, {@link com.trolltech.qt.gui.QWidget#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()}, {@link com.trolltech.qt.gui.QWidget#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) keyPressEvent()}, {@link com.trolltech.qt.gui.QWidget#keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent) keyReleaseEvent()}, and {@link QWidget#isEnabled() enabled}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="focusPolicy")
    @QtBlockedSlot
    public final void setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy policy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFocusPolicy_FocusPolicy(nativeId(), policy.value());
    }
    @QtBlockedSlot
    native void __qt_setFocusPolicy_FocusPolicy(long __this__nativeId, int policy);

/**
Sets the widget's focus proxy to widget <tt>w</tt>. If <tt>w</tt> is 0, the function resets this widget to have no focus proxy. <p>Some widgets can "have focus", but create a child widget, such as {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, to actually handle the focus. In this case, the widget can set the line edit to be its focus proxy. <p>{@link com.trolltech.qt.gui.QWidget#setFocusProxy(com.trolltech.qt.gui.QWidget) setFocusProxy()} sets the widget which will actually get focus when "this widget" gets it. If there is a focus proxy, {@link com.trolltech.qt.gui.QWidget#setFocus() setFocus()} and {@link com.trolltech.qt.gui.QWidget#hasFocus() hasFocus()} operate on the focus proxy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#focusProxy() focusProxy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFocusProxy(com.trolltech.qt.gui.QWidget arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcFocusProxy = arg__1;
        }
        __qt_setFocusProxy_QWidget(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFocusProxy_QWidget(long __this__nativeId, long arg__1);

/**
This property holds the font currently set for the widget. This property describes the widget's requested font. The font is used by the widget's style when rendering standard components, and is available as a means to ensure that custom widgets can maintain consistency with the native platform's look and feel. It's common that different platforms, or different styles, define different fonts for an application. <p>When you assign a new font to a widget, the properties from this font are combined with the widget's default font to form the widget's final font. You can call {@link com.trolltech.qt.gui.QWidget#fontInfo() fontInfo()} to get a copy of the widget's final font. The final font is also used to initialize {@link com.trolltech.qt.gui.QPainter QPainter}'s font. <p>The default depends on the system environment. {@link com.trolltech.qt.gui.QApplication QApplication} maintains a system/theme font which serves as a default for all widgets. There may also be special font defaults for certain types of widgets. You can also define default fonts for widgets yourself by passing a custom font and the name of a widget to {@link com.trolltech.qt.gui.QApplication#setFont(com.trolltech.qt.gui.QFont) QApplication::setFont()}. Finally, the font is matched against Qt's font database to find the best match. <p>QWidget propagates explicit font properties from parent to child. If you change a specific property on a font and assign that font to a widget, that property will propagate to all the widget's children, overriding any system defaults for that property. Note that fonts by default don't propagate to windows (see {@link com.trolltech.qt.gui.QWidget#isWindow() isWindow()}) unless the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_WindowPropagation } attribute is enabled. <p>QWidget's font propagation is similar to its palette propagation. <p>The current style, which is used to render the content of all standard Qt widgets, is free to choose to use the widget font, or in some cases, to ignore it (partially, or completely). In particular, certain styles like GTK style, Mac style, Windows XP, and Vista style, apply special modifications to the widget font to match the platform's native look and feel. Because of this, assigning properties to a widget's font is not guaranteed to change the appearance of the widget. Instead, you may choose to apply a {@link QWidget#styleSheet() styleSheet}. <p><b>Note:</b> If {@link <a href="../qtjambi-stylesheet.html">Qt Style Sheets</a>} are used on the same widget as {@link com.trolltech.qt.gui.QWidget#setFont(com.trolltech.qt.gui.QFont) setFont()}, style sheets will take precedence if the settings conflict. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#fontInfo() fontInfo()}, and {@link com.trolltech.qt.gui.QWidget#fontMetrics() fontMetrics()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="font")
    @QtBlockedSlot
    public final void setFont(com.trolltech.qt.gui.QFont arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFont_QFont(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFont_QFont(long __this__nativeId, long arg__1);

/**
Sets the foreground role of the widget to <tt>role</tt>. <p>The foreground role defines the color from the widget's {@link QWidget#palette() palette} that is used to draw the foreground. <p>If <tt>role</tt> is {@link com.trolltech.qt.gui.QPalette.ColorRole QPalette::NoRole }, the widget uses a foreground role that contrasts with the background role. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#foregroundRole() foregroundRole()}, and {@link com.trolltech.qt.gui.QWidget#backgroundRole() backgroundRole()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setForegroundRole(com.trolltech.qt.gui.QPalette.ColorRole arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setForegroundRole_ColorRole(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setForegroundRole_ColorRole(long __this__nativeId, int arg__1);

/**
This property holds the geometry of the widget relative to its parent and excluding the window frame. When changing the geometry, the widget, if visible, receives a move event ({@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()}) and/or a resize event ({@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}) immediately. If the widget is not currently visible, it is guaranteed to receive appropriate events before it is shown. <p>The size component is adjusted if it lies outside the range defined by {@link com.trolltech.qt.gui.QWidget#minimumSize() minimumSize()} and {@link com.trolltech.qt.gui.QWidget#maximumSize() maximumSize()}. <p><b>Warning:</b> Calling {@link com.trolltech.qt.gui.QWidget#setGeometry(com.trolltech.qt.core.QRect) setGeometry()} inside {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()} or {@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()} can lead to infinite recursion. <p>See the {@link <a href="../geometry.html">Window Geometry documentation</a>} for an overview of window geometry. <p>By default, this property contains a value that depends on the user's platform and screen geometry. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#frameGeometry() frameGeometry()}, {@link com.trolltech.qt.gui.QWidget#rect() rect()}, {@link com.trolltech.qt.gui.QWidget#move(com.trolltech.qt.core.QPoint) move()}, {@link com.trolltech.qt.gui.QWidget#resize(com.trolltech.qt.core.QSize) resize()}, {@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()}, {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}, {@link com.trolltech.qt.gui.QWidget#minimumSize() minimumSize()}, and {@link com.trolltech.qt.gui.QWidget#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="geometry")
    @QtBlockedSlot
    public final void setGeometry(com.trolltech.qt.core.QRect arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGeometry_QRect(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setGeometry_QRect(long __this__nativeId, long arg__1);

/**
This property holds the geometry of the widget relative to its parent and excluding the window frame. When changing the geometry, the widget, if visible, receives a move event ({@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()}) and/or a resize event ({@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}) immediately. If the widget is not currently visible, it is guaranteed to receive appropriate events before it is shown. <p>The size component is adjusted if it lies outside the range defined by {@link com.trolltech.qt.gui.QWidget#minimumSize() minimumSize()} and {@link com.trolltech.qt.gui.QWidget#maximumSize() maximumSize()}. <p><b>Warning:</b> Calling {@link com.trolltech.qt.gui.QWidget#setGeometry(com.trolltech.qt.core.QRect) setGeometry()} inside {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()} or {@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()} can lead to infinite recursion. <p>See the {@link <a href="../geometry.html">Window Geometry documentation</a>} for an overview of window geometry. <p>By default, this property contains a value that depends on the user's platform and screen geometry. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#frameGeometry() frameGeometry()}, {@link com.trolltech.qt.gui.QWidget#rect() rect()}, {@link com.trolltech.qt.gui.QWidget#move(com.trolltech.qt.core.QPoint) move()}, {@link com.trolltech.qt.gui.QWidget#resize(com.trolltech.qt.core.QSize) resize()}, {@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()}, {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}, {@link com.trolltech.qt.gui.QWidget#minimumSize() minimumSize()}, and {@link com.trolltech.qt.gui.QWidget#maximumSize() maximumSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setGeometry(int x, int y, int w, int h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGeometry_int_int_int_int(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_setGeometry_int_int_int_int(long __this__nativeId, int x, int y, int w, int h);

/**
Convenience function, equivalent to setVisible(!<tt>hidden</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#isHidden() isHidden()}. <br></DD></DT>
*/

    public final void setHidden(boolean hidden)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHidden_boolean(nativeId(), hidden);
    }
    native void __qt_setHidden_boolean(long __this__nativeId, boolean hidden);

/**
This function sets the input context <tt>context</tt> on this widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#inputContext() inputContext()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setInputContext(com.trolltech.qt.gui.QInputContext arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (arg__1 != null) {
            arg__1.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInputContext_QInputContext(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setInputContext_QInputContext(long __this__nativeId, long arg__1);

/**
Sets the layout manager for this widget to <tt>layout</tt>. <p>If there already is a layout manager installed on this widget, QWidget won't let you install another. You must first delete the existing layout manager (returned by {@link com.trolltech.qt.gui.QWidget#layout() layout()}) before you can call {@link com.trolltech.qt.gui.QWidget#setLayout(com.trolltech.qt.gui.QLayout) setLayout()} with the new layout. <p>If <tt>layout</tt> is the layout manger on a different widget, {@link com.trolltech.qt.gui.QWidget#setLayout(com.trolltech.qt.gui.QLayout) setLayout()} will reparent the layout and make it the layout manager for this widget. <p>Example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    QVBoxLayout *layout = new QVBoxLayout;
    layout-&gt;addWidget(formWidget);
    setLayout(layout);
</pre> An alternative to calling this function is to pass this widget to the layout's constructor. <p>The QWidget will take ownership of <tt>layout</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#layout() layout()}, and {@link <a href="../qtjambi-layout.html">Layout Classes</a>}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setLayout(com.trolltech.qt.gui.QLayout arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (arg__1 == null)
            throw new NullPointerException("Argument 'arg__1': null not expected.");
        __qt_setLayout_QLayout(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setLayout_QLayout(long __this__nativeId, long arg__1);

/**
This property holds the layout direction for this widget. By default, this property is set to {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LeftToRight }. <p>When the layout direction is set on a widget, it will propagate to the widget's children. Children added after the call to <tt>setLayoutDirection()</tt> will not inherit the parent's layout direction. <p><DT><b>See also:</b><br><DD>{@link QApplication#layoutDirection() QApplication::layoutDirection}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="layoutDirection")
    @QtBlockedSlot
    public final void setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection direction)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLayoutDirection_LayoutDirection(nativeId(), direction.value());
    }
    @QtBlockedSlot
    native void __qt_setLayoutDirection_LayoutDirection(long __this__nativeId, int direction);

/**
This property holds the widget's locale. As long as no special locale has been set, this is either the parent's locale or (if this widget is a top level widget), the default locale. <p>If the widget displays dates or numbers, these should be formatted using the widget's locale. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale QLocale}, and {@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) QLocale::setDefault()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="locale")
    @QtBlockedSlot
    public final void setLocale(com.trolltech.qt.core.QLocale locale)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLocale_QLocale(nativeId(), locale == null ? 0 : locale.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLocale_QLocale(long __this__nativeId, long locale);

/**
Causes only the pixels of the widget for which <tt>bitmap</tt> has a corresponding 1 bit to be visible. If the region includes pixels outside the {@link com.trolltech.qt.gui.QWidget#rect() rect()} of the widget, window system controls in that area may or may not be visible, depending on the platform. <p>Note that this effect can be slow if the region is particularly complex. <p>The following code shows how an image with an alpha channel can be used to generate a mask for a widget: <pre class="snippet">
        QLabel topLevelLabel = new QLabel();
        QPixmap pixmap = new QPixmap("classpath:tux.png");
        topLevelLabel.setPixmap(pixmap);
        topLevelLabel.setMask(pixmap.mask());
    </pre> The label shown by this code is masked using the image it contains, giving the appearance that an irregularly-shaped image is being drawn directly onto the screen. <p>Masked widgets receive mouse events only on their visible portions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mask() mask()}, {@link com.trolltech.qt.gui.QWidget#clearMask() clearMask()}, {@link com.trolltech.qt.gui.QWidget#windowOpacity() windowOpacity()}, and {@link <a href="../qtjambi-shapedclock.html">Shaped Clock Example</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMask(com.trolltech.qt.gui.QBitmap arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMask_QBitmap(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMask_QBitmap(long __this__nativeId, long arg__1);

/**
This is an overloaded member function, provided for convenience. <p>Causes only the parts of the widget which overlap <tt>region</tt> to be visible. If the region includes pixels outside the {@link com.trolltech.qt.gui.QWidget#rect() rect()} of the widget, window system controls in that area may or may not be visible, depending on the platform. <p>Note that this effect can be slow if the region is particularly complex. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowOpacity() windowOpacity}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMask(com.trolltech.qt.gui.QRegion arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMask_QRegion(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMask_QRegion(long __this__nativeId, long arg__1);

/**
This property holds the widget's maximum height in pixels. This property corresponds to the height held by the {@link QWidget#maximumSize() maximumSize} property. <p>By default, this property contains a value of 16777215. <p><b>Note:</b> The definition of the <tt>QWIDGETSIZE_MAX</tt> macro limits the maximum size of widgets. <p><DT><b>See also:</b><br><DD>{@link QWidget#maximumSize() maximumSize}, and {@link QWidget#maximumWidth() maximumWidth}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximumHeight")
    @QtBlockedSlot
    public final void setMaximumHeight(int maxh)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumHeight_int(nativeId(), maxh);
    }
    @QtBlockedSlot
    native void __qt_setMaximumHeight_int(long __this__nativeId, int maxh);

/**
This property holds the widget's maximum size in pixels. The widget cannot be resized to a larger size than the maximum widget size. <p>By default, this property contains a size in which both width and height have values of 16777215. <p><b>Note:</b> The definition of the <tt>QWIDGETSIZE_MAX</tt> macro limits the maximum size of widgets. <p><DT><b>See also:</b><br><DD>{@link QWidget#maximumWidth() maximumWidth}, {@link QWidget#maximumHeight() maximumHeight}, {@link QWidget#minimumSize() minimumSize}, and {@link QWidget#sizeIncrement() sizeIncrement}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximumSize")
    @QtBlockedSlot
    public final void setMaximumSize(com.trolltech.qt.core.QSize arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumSize_QSize(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMaximumSize_QSize(long __this__nativeId, long arg__1);

/**
This property holds the widget's maximum size in pixels. The widget cannot be resized to a larger size than the maximum widget size. <p>By default, this property contains a size in which both width and height have values of 16777215. <p><b>Note:</b> The definition of the <tt>QWIDGETSIZE_MAX</tt> macro limits the maximum size of widgets. <p><DT><b>See also:</b><br><DD>{@link QWidget#maximumWidth() maximumWidth}, {@link QWidget#maximumHeight() maximumHeight}, {@link QWidget#minimumSize() minimumSize}, and {@link QWidget#sizeIncrement() sizeIncrement}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMaximumSize(int maxw, int maxh)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumSize_int_int(nativeId(), maxw, maxh);
    }
    @QtBlockedSlot
    native void __qt_setMaximumSize_int_int(long __this__nativeId, int maxw, int maxh);

/**
This property holds the widget's maximum width in pixels. This property corresponds to the width held by the {@link QWidget#maximumSize() maximumSize} property. <p>By default, this property contains a value of 16777215. <p><b>Note:</b> The definition of the <tt>QWIDGETSIZE_MAX</tt> macro limits the maximum size of widgets. <p><DT><b>See also:</b><br><DD>{@link QWidget#maximumSize() maximumSize}, and {@link QWidget#maximumHeight() maximumHeight}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="maximumWidth")
    @QtBlockedSlot
    public final void setMaximumWidth(int maxw)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumWidth_int(nativeId(), maxw);
    }
    @QtBlockedSlot
    native void __qt_setMaximumWidth_int(long __this__nativeId, int maxw);

/**
This property holds the widget's minimum height in pixels. This property corresponds to the height held by the {@link QWidget#minimumSize() minimumSize} property. <p>By default, this property has a value of 0. <p><DT><b>See also:</b><br><DD>{@link QWidget#minimumSize() minimumSize}, and {@link QWidget#minimumWidth() minimumWidth}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimumHeight")
    @QtBlockedSlot
    public final void setMinimumHeight(int minh)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumHeight_int(nativeId(), minh);
    }
    @QtBlockedSlot
    native void __qt_setMinimumHeight_int(long __this__nativeId, int minh);

/**
This property holds the widget's minimum size. The widget cannot be resized to a smaller size than the minimum widget size. The widget's size is forced to the minimum size if the current size is smaller. <p>The minimum size set by this function will override the minimum size defined by {@link com.trolltech.qt.gui.QLayout QLayout}. In order to unset the minimum size, use a value of <tt>QSize(0, 0)</tt>. <p>By default, this property contains a size with zero width and height. <p><DT><b>See also:</b><br><DD>{@link QWidget#minimumWidth() minimumWidth}, {@link QWidget#minimumHeight() minimumHeight}, {@link QWidget#maximumSize() maximumSize}, and {@link QWidget#sizeIncrement() sizeIncrement}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimumSize")
    @QtBlockedSlot
    public final void setMinimumSize(com.trolltech.qt.core.QSize arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumSize_QSize(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMinimumSize_QSize(long __this__nativeId, long arg__1);

/**
This property holds the widget's minimum size. The widget cannot be resized to a smaller size than the minimum widget size. The widget's size is forced to the minimum size if the current size is smaller. <p>The minimum size set by this function will override the minimum size defined by {@link com.trolltech.qt.gui.QLayout QLayout}. In order to unset the minimum size, use a value of <tt>QSize(0, 0)</tt>. <p>By default, this property contains a size with zero width and height. <p><DT><b>See also:</b><br><DD>{@link QWidget#minimumWidth() minimumWidth}, {@link QWidget#minimumHeight() minimumHeight}, {@link QWidget#maximumSize() maximumSize}, and {@link QWidget#sizeIncrement() sizeIncrement}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMinimumSize(int minw, int minh)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumSize_int_int(nativeId(), minw, minh);
    }
    @QtBlockedSlot
    native void __qt_setMinimumSize_int_int(long __this__nativeId, int minw, int minh);

/**
This property holds the widget's minimum width in pixels. This property corresponds to the width held by the {@link QWidget#minimumSize() minimumSize} property. <p>By default, this property has a value of 0. <p><DT><b>See also:</b><br><DD>{@link QWidget#minimumSize() minimumSize}, and {@link QWidget#minimumHeight() minimumHeight}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimumWidth")
    @QtBlockedSlot
    public final void setMinimumWidth(int minw)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumWidth_int(nativeId(), minw);
    }
    @QtBlockedSlot
    native void __qt_setMinimumWidth_int(long __this__nativeId, int minw);

/**
This property holds whether mouse tracking is enabled for the widget. If mouse tracking is disabled (the default), the widget only receives mouse move events when at least one mouse button is pressed while the mouse is being moved. <p>If mouse tracking is enabled, the widget receives mouse move events even if no buttons are pressed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="mouseTracking")
    @QtBlockedSlot
    public final void setMouseTracking(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMouseTracking_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setMouseTracking_boolean(long __this__nativeId, boolean enable);

/**
This property holds the widget's palette. This property describes the widget's palette. The palette is used by the widget's style when rendering standard components, and is available as a means to ensure that custom widgets can maintain consistency with the native platform's look and feel. It's common that different platforms, or different styles, have different palettes. <p>When you assign a new palette to a widget, the color roles from this palette are combined with the widget's default palette to form the widget's final palette. The palette entry for the widget's background role is used to fill the widget's background (see {@link QWidget#autoFillBackground() QWidget::autoFillBackground}), and the foreground role initializes {@link com.trolltech.qt.gui.QPainter QPainter}'s pen. <p>The default depends on the system environment. {@link com.trolltech.qt.gui.QApplication QApplication} maintains a system/theme palette which serves as a default for all widgets. There may also be special palette defaults for certain types of widgets (e.g., on Windows XP and Vista, all classes that derive from {@link com.trolltech.qt.gui.QMenuBar QMenuBar} have a special default palette). You can also define default palettes for widgets yourself by passing a custom palette and the name of a widget to {@link com.trolltech.qt.gui.QApplication#setPalette(com.trolltech.qt.gui.QPalette) QApplication::setPalette()}. Finally, the style always has the option of polishing the palette as it's assigned (see {@link com.trolltech.qt.gui.QStyle#polish(com.trolltech.qt.gui.QApplication) QStyle::polish()}). <p>QWidget propagates explicit palette roles from parent to child. If you assign a brush or color to a specific role on a palette and assign that palette to a widget, that role will propagate to all the widget's children, overriding any system defaults for that role. Note that palettes by default don't propagate to windows (see {@link com.trolltech.qt.gui.QWidget#isWindow() isWindow()}) unless the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_WindowPropagation } attribute is enabled. <p>QWidget's palette propagation is similar to its font propagation. <p>The current style, which is used to render the content of all standard Qt widgets, is free to choose colors and brushes from the widget palette, or in some cases, to ignore the palette (partially, or completely). In particular, certain styles like GTK style, Mac style, Windows XP, and Vista style, depend on third party APIs to render the content of widgets, and these styles typically do not follow the palette. Because of this, assigning roles to a widget's palette is not guaranteed to change the appearance of the widget. Instead, you may choose to apply a {@link QWidget#styleSheet() styleSheet}. You can refer to our Knowledge Base article here for more information. <p><b>Warning:</b> Do not use this function in conjunction with {@link <a href="../qtjambi-stylesheet.html">Qt Style Sheets</a>}. When using style sheets, the palette of a widget can be customized using the "color", "background-color", "selection-color", "selection-background-color" and "alternate-background-color". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#palette() QApplication::palette()}, and {@link QWidget#font() QWidget::font()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="palette")
    @QtBlockedSlot
    public final void setPalette(com.trolltech.qt.gui.QPalette arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPalette_QPalette(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPalette_QPalette(long __this__nativeId, long arg__1);

/**
Sets the parent of the widget to <tt>parent</tt>, and resets the window flags. The widget is moved to position (0, 0) in its new parent. <p>If the new parent widget is in a different window, the reparented widget and its children are appended to the end of the {@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) tab chain} of the new parent widget, in the same internal order as before. If one of the moved widgets had keyboard focus, {@link com.trolltech.qt.gui.QWidget#setParent(com.trolltech.qt.gui.QWidget) setParent()} calls {@link com.trolltech.qt.gui.QWidget#clearFocus() clearFocus()} for that widget. <p>If the new parent widget is in the same window as the old parent, setting the parent doesn't change the tab order or keyboard focus. <p>If the "new" parent widget is the old parent widget, this function does nothing. <p><b>Note:</b> The widget becomes invisible as part of changing its parent, even if it was previously visible. You must call {@link com.trolltech.qt.gui.QWidget#show() show()} to make the widget visible again. <p><b>Warning:</b> It is very unlikely that you will ever need this function. If you have a widget that changes its content dynamically, it is far easier to use {@link com.trolltech.qt.gui.QStackedWidget QStackedWidget}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setWindowFlags(com.trolltech.qt.core.Qt.WindowType[]) setWindowFlags()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setParent(com.trolltech.qt.gui.QWidget parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setParent_QWidget(nativeId(), parent == null ? 0 : parent.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setParent_QWidget(long __this__nativeId, long parent);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setParent(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... f) {
        this.setParent(parent, new com.trolltech.qt.core.Qt.WindowFlags(f));
    }
/**
This is an overloaded member function, provided for convenience. <p>This function also takes widget flags, <tt>f</tt> as an argument.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setParent(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags f)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setParent_QWidget_WindowFlags(nativeId(), parent == null ? 0 : parent.nativeId(), f.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setParent_QWidget_WindowFlags(long __this__nativeId, long parent, int f);


/**
If <tt>enable</tt> is true, auto repeat of the shortcut with the given <tt>id</tt> is enabled; otherwise it is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#grabShortcut(com.trolltech.qt.gui.QKeySequence) grabShortcut()}, and {@link com.trolltech.qt.gui.QWidget#releaseShortcut(int) releaseShortcut()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShortcutAutoRepeat(int id) {
        setShortcutAutoRepeat(id, (boolean)true);
    }
/**
If <tt>enable</tt> is true, auto repeat of the shortcut with the given <tt>id</tt> is enabled; otherwise it is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#grabShortcut(com.trolltech.qt.gui.QKeySequence) grabShortcut()}, and {@link com.trolltech.qt.gui.QWidget#releaseShortcut(int) releaseShortcut()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShortcutAutoRepeat(int id, boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShortcutAutoRepeat_int_boolean(nativeId(), id, enable);
    }
    @QtBlockedSlot
    native void __qt_setShortcutAutoRepeat_int_boolean(long __this__nativeId, int id, boolean enable);


/**
If <tt>enable</tt> is true, the shortcut with the given <tt>id</tt> is enabled; otherwise the shortcut is disabled. <p><b>Warning:</b> You should not normally need to use this function since Qt's shortcut system enables/disables shortcuts automatically as widgets become hidden/visible and gain or lose focus. It is best to use {@link com.trolltech.qt.gui.QAction QAction} or {@link com.trolltech.qt.gui.QShortcut QShortcut} to handle shortcuts, since they are easier to use than this low-level function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#grabShortcut(com.trolltech.qt.gui.QKeySequence) grabShortcut()}, and {@link com.trolltech.qt.gui.QWidget#releaseShortcut(int) releaseShortcut()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShortcutEnabled(int id) {
        setShortcutEnabled(id, (boolean)true);
    }
/**
If <tt>enable</tt> is true, the shortcut with the given <tt>id</tt> is enabled; otherwise the shortcut is disabled. <p><b>Warning:</b> You should not normally need to use this function since Qt's shortcut system enables/disables shortcuts automatically as widgets become hidden/visible and gain or lose focus. It is best to use {@link com.trolltech.qt.gui.QAction QAction} or {@link com.trolltech.qt.gui.QShortcut QShortcut} to handle shortcuts, since they are easier to use than this low-level function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#grabShortcut(com.trolltech.qt.gui.QKeySequence) grabShortcut()}, and {@link com.trolltech.qt.gui.QWidget#releaseShortcut(int) releaseShortcut()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setShortcutEnabled(int id, boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShortcutEnabled_int_boolean(nativeId(), id, enable);
    }
    @QtBlockedSlot
    native void __qt_setShortcutEnabled_int_boolean(long __this__nativeId, int id, boolean enable);

/**
This property holds the size increment of the widget. When the user resizes the window, the size will move in steps of {@link com.trolltech.qt.gui.QWidget#sizeIncrement() sizeIncrement()}.{@link com.trolltech.qt.gui.QWidget#width() width()} pixels horizontally and {@link QWidget#sizeIncrement() sizeIncrement}.{@link com.trolltech.qt.gui.QWidget#height() height()} pixels vertically, with {@link com.trolltech.qt.gui.QWidget#baseSize() baseSize()} as the basis. Preferred widget sizes are for non-negative integers i and j: <pre class="snippet">
        width = baseSize().width() + i * sizeIncrement().width();
        height = baseSize().height() + j * sizeIncrement().height();
</pre> Note that while you can set the size increment for all widgets, it only affects windows. <p>By default, this property contains a size with zero width and height. <p><b>Warning:</b> The size increment has no effect under Windows, and may be disregarded by the window manager on X11. <p><DT><b>See also:</b><br><DD>{@link QWidget#size() size}, {@link QWidget#minimumSize() minimumSize}, and {@link QWidget#maximumSize() maximumSize}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="sizeIncrement")
    @QtBlockedSlot
    public final void setSizeIncrement(com.trolltech.qt.core.QSize arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizeIncrement_QSize(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSizeIncrement_QSize(long __this__nativeId, long arg__1);

/**
This property holds the size increment of the widget. When the user resizes the window, the size will move in steps of {@link com.trolltech.qt.gui.QWidget#sizeIncrement() sizeIncrement()}.{@link com.trolltech.qt.gui.QWidget#width() width()} pixels horizontally and {@link QWidget#sizeIncrement() sizeIncrement}.{@link com.trolltech.qt.gui.QWidget#height() height()} pixels vertically, with {@link com.trolltech.qt.gui.QWidget#baseSize() baseSize()} as the basis. Preferred widget sizes are for non-negative integers i and j: <pre class="snippet">
        width = baseSize().width() + i * sizeIncrement().width();
        height = baseSize().height() + j * sizeIncrement().height();
</pre> Note that while you can set the size increment for all widgets, it only affects windows. <p>By default, this property contains a size with zero width and height. <p><b>Warning:</b> The size increment has no effect under Windows, and may be disregarded by the window manager on X11. <p><DT><b>See also:</b><br><DD>{@link QWidget#size() size}, {@link QWidget#minimumSize() minimumSize}, and {@link QWidget#maximumSize() maximumSize}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSizeIncrement(int w, int h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizeIncrement_int_int(nativeId(), w, h);
    }
    @QtBlockedSlot
    native void __qt_setSizeIncrement_int_int(long __this__nativeId, int w, int h);

/**
This property holds the default layout behavior of the widget. If there is a {@link com.trolltech.qt.gui.QLayout QLayout} that manages this widget's children, the size policy specified by that layout is used. If there is no such {@link com.trolltech.qt.gui.QLayout QLayout}, the result of this function is used. <p>The default policy is Preferred/Preferred, which means that the widget can be freely resized, but prefers to be the size {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()} returns. Button-like widgets set the size policy to specify that they may stretch horizontally, but are fixed vertically. The same applies to lineedit controls (such as {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, {@link com.trolltech.qt.gui.QSpinBox QSpinBox} or an editable {@link com.trolltech.qt.gui.QComboBox QComboBox}) and other horizontally orientated widgets (such as {@link com.trolltech.qt.gui.QProgressBar QProgressBar}). {@link com.trolltech.qt.gui.QToolButton QToolButton}'s are normally square, so they allow growth in both directions. Widgets that support different directions (such as {@link com.trolltech.qt.gui.QSlider QSlider}, {@link com.trolltech.qt.gui.QScrollBar QScrollBar} or {@link <a href="../porting4.html">QHeader</a>}) specify stretching in the respective direction only. Widgets that can provide scroll bars (usually subclasses of {@link com.trolltech.qt.gui.QScrollArea QScrollArea}) tend to specify that they can use additional space, and that they can make do with less than {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()}, {@link com.trolltech.qt.gui.QLayout QLayout}, {@link com.trolltech.qt.gui.QSizePolicy QSizePolicy}, and {@link com.trolltech.qt.gui.QWidget#updateGeometry() updateGeometry()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="sizePolicy")
    @QtBlockedSlot
    public final void setSizePolicy(com.trolltech.qt.gui.QSizePolicy arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizePolicy_QSizePolicy(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSizePolicy_QSizePolicy(long __this__nativeId, long arg__1);

/**
This property holds the default layout behavior of the widget. If there is a {@link com.trolltech.qt.gui.QLayout QLayout} that manages this widget's children, the size policy specified by that layout is used. If there is no such {@link com.trolltech.qt.gui.QLayout QLayout}, the result of this function is used. <p>The default policy is Preferred/Preferred, which means that the widget can be freely resized, but prefers to be the size {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()} returns. Button-like widgets set the size policy to specify that they may stretch horizontally, but are fixed vertically. The same applies to lineedit controls (such as {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, {@link com.trolltech.qt.gui.QSpinBox QSpinBox} or an editable {@link com.trolltech.qt.gui.QComboBox QComboBox}) and other horizontally orientated widgets (such as {@link com.trolltech.qt.gui.QProgressBar QProgressBar}). {@link com.trolltech.qt.gui.QToolButton QToolButton}'s are normally square, so they allow growth in both directions. Widgets that support different directions (such as {@link com.trolltech.qt.gui.QSlider QSlider}, {@link com.trolltech.qt.gui.QScrollBar QScrollBar} or {@link <a href="../porting4.html">QHeader</a>}) specify stretching in the respective direction only. Widgets that can provide scroll bars (usually subclasses of {@link com.trolltech.qt.gui.QScrollArea QScrollArea}) tend to specify that they can use additional space, and that they can make do with less than {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()}, {@link com.trolltech.qt.gui.QLayout QLayout}, {@link com.trolltech.qt.gui.QSizePolicy QSizePolicy}, and {@link com.trolltech.qt.gui.QWidget#updateGeometry() updateGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy horizontal, com.trolltech.qt.gui.QSizePolicy.Policy vertical)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizePolicy_Policy_Policy(nativeId(), horizontal.value(), vertical.value());
    }
    @QtBlockedSlot
    native void __qt_setSizePolicy_Policy_Policy(long __this__nativeId, int horizontal, int vertical);

/**
This property holds the widget's status tip. By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QWidget#toolTip() toolTip}, and {@link QWidget#whatsThis() whatsThis}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="statusTip")
    @QtBlockedSlot
    public final void setStatusTip(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStatusTip_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setStatusTip_String(long __this__nativeId, java.lang.String arg__1);

/**
Sets the widget's GUI style to <tt>style</tt>. The ownership of the style object is not transferred. <p>If no style is set, the widget uses the application's style, {@link com.trolltech.qt.gui.QApplication#style() QApplication::style()} instead. <p>Setting a widget's style has no effect on existing or future child widgets. <p><b>Warning:</b> This function is particularly useful for demonstration purposes, where you want to show Qt's styling capabilities. Real applications should avoid it and use one consistent GUI style instead. <p><b>Warning:</b> Qt style sheets are currently not supported for custom {@link com.trolltech.qt.gui.QStyle QStyle} subclasses. We plan to address this in some future release. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#style() style()}, {@link com.trolltech.qt.gui.QStyle QStyle}, {@link com.trolltech.qt.gui.QApplication#style() QApplication::style()}, and {@link com.trolltech.qt.gui.QApplication#setStyle(com.trolltech.qt.gui.QStyle) QApplication::setStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setStyle(com.trolltech.qt.gui.QStyle arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcStyle = arg__1;
        }
        __qt_setStyle_QStyle(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setStyle_QStyle(long __this__nativeId, long arg__1);

/**
This property holds the widget's style sheet. The style sheet contains a textual description of customizations to the widget's style, as described in the {@link <a href="../qtjambi-stylesheet.html">Qt Style Sheets</a>} document. <p><b>Note:</b> Qt style sheets are currently not supported for QMacStyle (the default style on Mac OS X). We plan to address this in some future release. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setStyle(com.trolltech.qt.gui.QStyle) setStyle()}, {@link QApplication#styleSheet() QApplication::styleSheet}, and {@link <a href="../qtjambi-stylesheet.html">Qt Style Sheets</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="styleSheet")
    public final void setStyleSheet(java.lang.String styleSheet)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStyleSheet_String(nativeId(), styleSheet);
    }
    native void __qt_setStyleSheet_String(long __this__nativeId, java.lang.String styleSheet);

/**
This property holds the widget's tooltip. Note that by default tooltips are only shown for widgets that are children of the active window. You can change this behavior by setting the attribute {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_AlwaysShowToolTips } on the window, not on the widget with the tooltip. <p>If you want to control a tooltip's behavior, you can intercept the event() function and catch the {@link com.trolltech.qt.core.QEvent.Type QEvent::ToolTip } event (e.g., if you want to customize the area for which the tooltip should be shown). <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolTip QToolTip}, {@link QWidget#statusTip() statusTip}, and {@link QWidget#whatsThis() whatsThis}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="toolTip")
    @QtBlockedSlot
    public final void setToolTip(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolTip_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setToolTip_String(long __this__nativeId, java.lang.String arg__1);

/**
This property holds whether updates are enabled. An updates enabled widget receives paint events and has a system background; a disabled widget does not. This also implies that calling {@link com.trolltech.qt.gui.QWidget#update() update()} and {@link com.trolltech.qt.gui.QWidget#repaint() repaint()} has no effect if updates are disabled. <p>By default, this property is true. <p>{@link com.trolltech.qt.gui.QWidget#setUpdatesEnabled(boolean) setUpdatesEnabled()} is normally used to disable updates for a short period of time, for instance to avoid screen flicker during large changes. In Qt, widgets normally do not generate screen flicker, but on X11 the server might erase regions on the screen when widgets get hidden before they can be replaced by other widgets. Disabling updates solves this. <p>Example: <pre class="snippet">
        setUpdatesEnabled(false);
        bigVisualChanges();
        setUpdatesEnabled(true);
</pre> Disabling a widget implicitly disables all its children. Enabling a widget enables all child widgets except top-level widgets or those that have been explicitly disabled. Re-enabling updates implicitly calls {@link com.trolltech.qt.gui.QWidget#update() update()} on the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="updatesEnabled")
    @QtBlockedSlot
    public final void setUpdatesEnabled(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUpdatesEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setUpdatesEnabled_boolean(long __this__nativeId, boolean enable);

/**
This property holds the widget's What's This help text.  By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThis QWhatsThis}, {@link QWidget#toolTip() QWidget::toolTip}, and {@link QWidget#statusTip() QWidget::statusTip}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="whatsThis")
    @QtBlockedSlot
    public final void setWhatsThis(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWhatsThis_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setWhatsThis_String(long __this__nativeId, java.lang.String arg__1);

/**
This property holds the file path associated with a widget. This property only makes sense for windows. It associates a file path with a window. If you set the file path, but have not set the window title, Qt sets the window title to contain a string created using the following components. <p>On Mac OS X: <ul><li> The file name of the specified path, obtained using {@link com.trolltech.qt.core.QFileInfo#fileName() QFileInfo::fileName()}.</li><li> An optional <tt>*</tt> character, if the {@link QWidget#isWindowModified() windowModified} property is set, as per the Apple Human Interface Guidelines.</li></ul> On Windows and X11: <ul><li> The file name of the specified path, obtained using {@link com.trolltech.qt.core.QFileInfo#fileName() QFileInfo::fileName()}.</li><li> An optional <tt>*</tt> character, if the {@link QWidget#isWindowModified() windowModified} property is set.</li><li> The <tt>0x2014</tt> unicode character, padded either side by spaces.</li><li> The application name, obtained from the application's {@link QCoreApplication#applicationName() applicationName} property.</li></ul> If the window title is set at any point, then the window title takes precedence and will be shown instead of the file path string. <p>Additionally, on Mac OS X, this has an added benefit that it sets the proxy icon for the window, assuming that the file path exists. <p>If no file path is set, this property contains an empty string. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowTitle() windowTitle}, and {@link QWidget#windowIcon() windowIcon}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="windowFilePath")
    @QtBlockedSlot
    public final void setWindowFilePath(java.lang.String filePath)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowFilePath_String(nativeId(), filePath);
    }
    @QtBlockedSlot
    native void __qt_setWindowFilePath_String(long __this__nativeId, java.lang.String filePath);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setWindowFlags(com.trolltech.qt.core.Qt.WindowType ... type) {
        this.setWindowFlags(new com.trolltech.qt.core.Qt.WindowFlags(type));
    }
/**
Window flags are a combination of a type (e. . {@link com.trolltech.qt.core.Qt.WindowType Qt::Dialog }) and zero or more hints to the window system (e.g. {@link com.trolltech.qt.core.Qt.WindowType Qt::FramelessWindowHint }). <p>If the widget had type {@link com.trolltech.qt.core.Qt.WindowType Qt::Widget } or {@link com.trolltech.qt.core.Qt.WindowType Qt::SubWindow } and becomes a window ({@link com.trolltech.qt.core.Qt.WindowType Qt::Window }, {@link com.trolltech.qt.core.Qt.WindowType Qt::Dialog }, etc.), it is put at position (0, 0) on the desktop. If the widget is a window and becomes a {@link com.trolltech.qt.core.Qt.WindowType Qt::Widget } or {@link com.trolltech.qt.core.Qt.WindowType Qt::SubWindow }, it is put at position (0, 0) relative to its parent widget. <p><b>Note:</b> This function calls {@link com.trolltech.qt.gui.QWidget#setParent(com.trolltech.qt.gui.QWidget) setParent()} when changing the flags for a window, causing the widget to be hidden. You must call {@link com.trolltech.qt.gui.QWidget#show() show()} to make the widget visible again.. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#windowType() windowType()}, and {@link <a href="../widgets-windowflags.html">Window Flags Example</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWindowFlags(com.trolltech.qt.core.Qt.WindowFlags type)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowFlags_WindowFlags(nativeId(), type.value());
    }
    @QtBlockedSlot
    native void __qt_setWindowFlags_WindowFlags(long __this__nativeId, int type);

/**
This property holds the widget's icon. This property only makes sense for windows. If no icon has been set, {@link com.trolltech.qt.gui.QWidget#windowIcon() windowIcon()} returns the application icon ({@link QApplication#windowIcon() QApplication::windowIcon()}). <p><DT><b>See also:</b><br><DD>{@link QWidget#windowIconText() windowIconText}, and {@link QWidget#windowTitle() windowTitle}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="windowIcon")
    @QtBlockedSlot
    public final void setWindowIcon(com.trolltech.qt.gui.QIcon icon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowIcon_QIcon(nativeId(), icon == null ? 0 : icon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setWindowIcon_QIcon(long __this__nativeId, long icon);

/**
This property holds the widget's icon text. This property only makes sense for windows. If no icon text has been set, this functions returns an empty string. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowIcon() windowIcon}, and {@link QWidget#windowTitle() windowTitle}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="windowIconText")
    @QtBlockedSlot
    public final void setWindowIconText(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowIconText_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setWindowIconText_String(long __this__nativeId, java.lang.String arg__1);

/**
This property holds which windows are blocked by the modal widget. This property only makes sense for windows. A modal widget prevents widgets in other windows from getting input. The value of this property controls which windows are blocked when the widget is visible. Changing this property while the window is visible has no effect; you must {@link com.trolltech.qt.gui.QWidget#hide() hide()} the widget first, then {@link com.trolltech.qt.gui.QWidget#show() show()} it again. <p>By default, this property is {@link com.trolltech.qt.core.Qt.WindowModality Qt::NonModal }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#isWindow() isWindow()}, {@link QWidget#isModal() QWidget::modal}, and {@link com.trolltech.qt.gui.QDialog QDialog}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="windowModality")
    @QtBlockedSlot
    public final void setWindowModality(com.trolltech.qt.core.Qt.WindowModality windowModality)    {
        if (this instanceof QMessageBox) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            __qt_QMessageBox_setWindowModality(nativeId(), windowModality.value());
            return ;
        }


        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowModality_WindowModality(nativeId(), windowModality.value());
    }
    @QtBlockedSlot
    native void __qt_setWindowModality_WindowModality(long __this__nativeId, int windowModality);

/**
This property holds whether the document shown in the window has unsaved changes. A modified window is a window whose content has changed but has not been saved to disk. This flag will have different effects varied by the platform. On Mac OS X the close button will have a modified look; on other platforms, the window title will have an '*' (asterisk). <p>The window title must contain a "[*]" placeholder, which indicates where the '*' should appear. Normally, it should appear right after the file name (e.g., "document1.txt[*] - Text Editor"). If the window isn't modified, the placeholder is simply removed. <p>Note that if a widget is set as modified, all its ancestors will also be set as modified. However, if you call <tt>setWindowModified(false)</tt> on a widget, this will not propagate to its parent because other children of the parent might have been modified. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowTitle() windowTitle}, {@link <a href="../qtjambi-application.html">Application Example</a>}, {@link <a href="../mainwindows-sdi.html">SDI Example</a>}, and {@link <a href="../qtjambi-mdi.html">MDI Example</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="windowModified")
    public final void setWindowModified(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowModified_boolean(nativeId(), arg__1);
    }
    native void __qt_setWindowModified_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds The level of opacity for the window.  The valid range of opacity is from 1.0 (completely opaque) to 0.0 (completely transparent). <p>By default the value of this property is 1.0. <p>This feature is available on Embedded Linux, Mac OS X, X11 platforms that support the Composite extension, and Windows 2000 and later. <p>This feature is not available on Windows CE. <p>Note that under X11 you need to have a composite manager running, and the X11 specific _NET_WM_WINDOW_OPACITY atom needs to be supported by the window manager you are using. <p><b>Warning:</b> Changing this property from opaque to transparent might issue a paint event that needs to be processed before the window is displayed correctly. This affects mainly the use of {@link com.trolltech.qt.gui.QPixmap#grabWindow(long, int, int, int) QPixmap::grabWindow()}. Also note that semi-transparent windows update and resize significantly slower than opaque windows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setMask(com.trolltech.qt.gui.QBitmap) setMask()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="windowOpacity")
    @QtBlockedSlot
    public final void setWindowOpacity(double level)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowOpacity_double(nativeId(), level);
    }
    @QtBlockedSlot
    native void __qt_setWindowOpacity_double(long __this__nativeId, double level);

/**
Sets the window's role to <tt>role</tt>. This only makes sense for windows on X11. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#windowRole() windowRole()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWindowRole(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowRole_String(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setWindowRole_String(long __this__nativeId, java.lang.String arg__1);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setWindowState(com.trolltech.qt.core.Qt.WindowState ... state) {
        this.setWindowState(new com.trolltech.qt.core.Qt.WindowStates(state));
    }
/**
Sets the window state to <tt>windowState</tt>. The window state is a OR'ed combination of {@link com.trolltech.qt.core.Qt.WindowState Qt::WindowState }: {@link com.trolltech.qt.core.Qt.WindowState Qt::WindowMinimized }, {@link com.trolltech.qt.core.Qt.WindowState Qt::WindowMaximized }, {@link com.trolltech.qt.core.Qt.WindowState Qt::WindowFullScreen }, and {@link com.trolltech.qt.core.Qt.WindowState Qt::WindowActive }. <p>If the window is not visible (i.e. {@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()} returns false), the window state will take effect when {@link com.trolltech.qt.gui.QWidget#show() show()} is called. For visible windows, the change is immediate. For example, to toggle between full-screen and normal mode, use the following code: <pre class="snippet">
        Qt.WindowStates state = w.windowState();

        if (w.windowState().isSet(Qt.WindowState.WindowFullScreen))
            state.set(Qt.WindowState.WindowFullScreen);
        else
            state.clear(Qt.WindowState.WindowFullScreen);

        w.setWindowState(state);
</pre> In order to restore and activate a minimized window (while preserving its maximized and/or full-screen state), use the following: <pre class="snippet">
        Qt.WindowStates state= w.windowState();
        state.setValue(state.value() & ~Qt.WindowState.WindowMinimized.value() |
                                      Qt.WindowState.WindowActive.value());
        w.setWindowState(state);
</pre> Calling this function will hide the widget. You must call {@link com.trolltech.qt.gui.QWidget#show() show()} to make the widget visible again. <p><b>Note:</b> On some window systems {@link com.trolltech.qt.core.Qt.WindowState Qt::WindowActive } is not immediate, and may be ignored in certain cases. <p>When the window state changes, the widget receives a {@link com.trolltech.qt.gui.QWidget#changeEvent(com.trolltech.qt.core.QEvent) changeEvent()} of type {@link com.trolltech.qt.core.QEvent.Type QEvent::WindowStateChange }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.WindowState Qt::WindowState }, and {@link com.trolltech.qt.gui.QWidget#windowState() windowState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWindowState(com.trolltech.qt.core.Qt.WindowStates state)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowState_WindowStates(nativeId(), state.value());
    }
    @QtBlockedSlot
    native void __qt_setWindowState_WindowStates(long __this__nativeId, int state);

/**
This property holds the window title (caption). This property only makes sense for top-level widgets, such as windows and dialogs. If no caption has been set, the title is based of the {@link QWidget#windowFilePath() windowFilePath}. If neither of these is set, then the title is an empty string. <p>If you use the {@link QWidget#isWindowModified() windowModified} mechanism, the window title must contain a "[*]" placeholder, which indicates where the '*' should appear. Normally, it should appear right after the file name (e.g., "document1.txt[*] - Text Editor"). If the {@link QWidget#isWindowModified() windowModified} property is false (the default), the placeholder is simply removed. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowIcon() windowIcon}, {@link QWidget#windowIconText() windowIconText}, {@link QWidget#isWindowModified() windowModified}, and {@link QWidget#windowFilePath() windowFilePath}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="windowTitle")
    public final void setWindowTitle(java.lang.String arg__1)    {
        if (this instanceof QMessageBox) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            __qt_QMessageBox_setWindowTitle(nativeId(), arg__1);
            return ;
        }


        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWindowTitle_String(nativeId(), arg__1);
    }
    native void __qt_setWindowTitle_String(long __this__nativeId, java.lang.String arg__1);

/**
Shows the widget and its child widgets. This function is equivalent to setVisible(true). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#raise() raise()}, {@link com.trolltech.qt.gui.QWidget#showEvent(com.trolltech.qt.gui.QShowEvent) showEvent()}, {@link com.trolltech.qt.gui.QWidget#hide() hide()}, {@link com.trolltech.qt.gui.QWidget#setVisible(boolean) setVisible()}, {@link com.trolltech.qt.gui.QWidget#showMinimized() showMinimized()}, {@link com.trolltech.qt.gui.QWidget#showMaximized() showMaximized()}, {@link com.trolltech.qt.gui.QWidget#showNormal() showNormal()}, and {@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()}. <br></DD></DT>
*/

    public final void show()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_show(nativeId());
    }
    native void __qt_show(long __this__nativeId);

/**
Shows the widget in full-screen mode. <p>Calling this function only affects {@link com.trolltech.qt.gui.QWidget#isWindow() windows}. <p>To return from full-screen mode, call {@link com.trolltech.qt.gui.QWidget#showNormal() showNormal()}. <p>Full-screen mode works fine under Windows, but has certain problems under X. These problems are due to limitations of the ICCCM protocol that specifies the communication between X11 clients and the window manager. ICCCM simply does not understand the concept of non-decorated full-screen windows. Therefore, the best we can do is to request a borderless window and place and resize it to fill the entire screen. Depending on the window manager, this may or may not work. The borderless window is requested using MOTIF hints, which are at least partially supported by virtually all modern window managers. <p>An alternative would be to bypass the window manager entirely and create a window with the {@link com.trolltech.qt.core.Qt.WindowType Qt::X11BypassWindowManagerHint } flag. This has other severe problems though, like totally broken keyboard focus and very strange effects on desktop changes or when the user raises other windows. <p>X11 window managers that follow modern post-ICCCM specifications support full-screen mode properly. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#showNormal() showNormal()}, {@link com.trolltech.qt.gui.QWidget#showMaximized() showMaximized()}, {@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QWidget#hide() hide()}, and {@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()}. <br></DD></DT>
*/

    public final void showFullScreen()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showFullScreen(nativeId());
    }
    native void __qt_showFullScreen(long __this__nativeId);

/**
Shows the widget maximized. <p>Calling this function only affects {@link com.trolltech.qt.gui.QWidget#isWindow() windows}. <p>On X11, this function may not work properly with certain window managers. See {@link <a href="../geometry.html">Window Geometry</a>} for an explanation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setWindowState(com.trolltech.qt.core.Qt.WindowState[]) setWindowState()}, {@link com.trolltech.qt.gui.QWidget#showNormal() showNormal()}, {@link com.trolltech.qt.gui.QWidget#showMinimized() showMinimized()}, {@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QWidget#hide() hide()}, and {@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()}. <br></DD></DT>
*/

    public final void showMaximized()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showMaximized(nativeId());
    }
    native void __qt_showMaximized(long __this__nativeId);

/**
Shows the widget minimized, as an icon. <p>Calling this function only affects {@link com.trolltech.qt.gui.QWidget#isWindow() windows}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#showNormal() showNormal()}, {@link com.trolltech.qt.gui.QWidget#showMaximized() showMaximized()}, {@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QWidget#hide() hide()}, {@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()}, and {@link com.trolltech.qt.gui.QWidget#isMinimized() isMinimized()}. <br></DD></DT>
*/

    public final void showMinimized()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showMinimized(nativeId());
    }
    native void __qt_showMinimized(long __this__nativeId);

/**
Restores the widget after it has been maximized or minimized. <p>Calling this function only affects {@link com.trolltech.qt.gui.QWidget#isWindow() windows}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setWindowState(com.trolltech.qt.core.Qt.WindowState[]) setWindowState()}, {@link com.trolltech.qt.gui.QWidget#showMinimized() showMinimized()}, {@link com.trolltech.qt.gui.QWidget#showMaximized() showMaximized()}, {@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QWidget#hide() hide()}, and {@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()}. <br></DD></DT>
*/

    public final void showNormal()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showNormal(nativeId());
    }
    native void __qt_showNormal(long __this__nativeId);

/**
This property holds the size of the widget excluding any window frame. If the widget is visible when it is being resized, it receives a resize event ({@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}) immediately. If the widget is not currently visible, it is guaranteed to receive an event before it is shown. <p>The size is adjusted if it lies outside the range defined by {@link com.trolltech.qt.gui.QWidget#minimumSize() minimumSize()} and {@link com.trolltech.qt.gui.QWidget#maximumSize() maximumSize()}. <p>By default, this property contains a value that depends on the user's platform and screen geometry. <p><b>Warning:</b> Calling {@link com.trolltech.qt.gui.QWidget#resize(com.trolltech.qt.core.QSize) resize()} or {@link com.trolltech.qt.gui.QWidget#setGeometry(com.trolltech.qt.core.QRect) setGeometry()} inside {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()} can lead to infinite recursion. <p><b>Note:</b> Setting the size to <tt>QSize(0, 0)</tt> will cause the widget to not appear on screen. This also applies to windows. <p><DT><b>See also:</b><br><DD>{@link QWidget#pos() pos}, {@link QWidget#geometry() geometry}, {@link QWidget#minimumSize() minimumSize}, {@link QWidget#maximumSize() maximumSize}, and {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="size")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize size()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_size(long __this__nativeId);

/**
This property holds the size increment of the widget. When the user resizes the window, the size will move in steps of {@link com.trolltech.qt.gui.QWidget#sizeIncrement() sizeIncrement()}.{@link com.trolltech.qt.gui.QWidget#width() width()} pixels horizontally and {@link QWidget#sizeIncrement() sizeIncrement}.{@link com.trolltech.qt.gui.QWidget#height() height()} pixels vertically, with {@link com.trolltech.qt.gui.QWidget#baseSize() baseSize()} as the basis. Preferred widget sizes are for non-negative integers i and j: <pre class="snippet">
        width = baseSize().width() + i * sizeIncrement().width();
        height = baseSize().height() + j * sizeIncrement().height();
</pre> Note that while you can set the size increment for all widgets, it only affects windows. <p>By default, this property contains a size with zero width and height. <p><b>Warning:</b> The size increment has no effect under Windows, and may be disregarded by the window manager on X11. <p><DT><b>See also:</b><br><DD>{@link QWidget#size() size}, {@link QWidget#minimumSize() minimumSize}, and {@link QWidget#maximumSize() maximumSize}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="sizeIncrement")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize sizeIncrement()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeIncrement(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeIncrement(long __this__nativeId);

/**
This property holds the default layout behavior of the widget. If there is a {@link com.trolltech.qt.gui.QLayout QLayout} that manages this widget's children, the size policy specified by that layout is used. If there is no such {@link com.trolltech.qt.gui.QLayout QLayout}, the result of this function is used. <p>The default policy is Preferred/Preferred, which means that the widget can be freely resized, but prefers to be the size {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()} returns. Button-like widgets set the size policy to specify that they may stretch horizontally, but are fixed vertically. The same applies to lineedit controls (such as {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, {@link com.trolltech.qt.gui.QSpinBox QSpinBox} or an editable {@link com.trolltech.qt.gui.QComboBox QComboBox}) and other horizontally orientated widgets (such as {@link com.trolltech.qt.gui.QProgressBar QProgressBar}). {@link com.trolltech.qt.gui.QToolButton QToolButton}'s are normally square, so they allow growth in both directions. Widgets that support different directions (such as {@link com.trolltech.qt.gui.QSlider QSlider}, {@link com.trolltech.qt.gui.QScrollBar QScrollBar} or {@link <a href="../porting4.html">QHeader</a>}) specify stretching in the respective direction only. Widgets that can provide scroll bars (usually subclasses of {@link com.trolltech.qt.gui.QScrollArea QScrollArea}) tend to specify that they can use additional space, and that they can make do with less than {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()}, {@link com.trolltech.qt.gui.QLayout QLayout}, {@link com.trolltech.qt.gui.QSizePolicy QSizePolicy}, and {@link com.trolltech.qt.gui.QWidget#updateGeometry() updateGeometry()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="sizePolicy")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QSizePolicy sizePolicy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizePolicy(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QSizePolicy __qt_sizePolicy(long __this__nativeId);

/**
Places the widget under <tt>w</tt> in the parent widget's stack. <p>To make this work, the widget itself and <tt>w</tt> must be siblings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#raise() raise()}, and {@link com.trolltech.qt.gui.QWidget#lower() lower()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void stackUnder(com.trolltech.qt.gui.QWidget arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_stackUnder_QWidget(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_stackUnder_QWidget(long __this__nativeId, long arg__1);

/**
This property holds the widget's status tip. By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QWidget#toolTip() toolTip}, and {@link QWidget#whatsThis() whatsThis}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="statusTip")
    @QtBlockedSlot
    public final java.lang.String statusTip()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_statusTip(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_statusTip(long __this__nativeId);

/**
Returns the widget's style object, i.e., the style in which the widget is
drawn.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyle style()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_style(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QStyle __qt_style(long __this__nativeId);

/**
This property holds the widget's style sheet. The style sheet contains a textual description of customizations to the widget's style, as described in the {@link <a href="../qtjambi-stylesheet.html">Qt Style Sheets</a>} document. <p><b>Note:</b> Qt style sheets are currently not supported for QMacStyle (the default style on Mac OS X). We plan to address this in some future release. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setStyle(com.trolltech.qt.gui.QStyle) setStyle()}, {@link QApplication#styleSheet() QApplication::styleSheet}, and {@link <a href="../qtjambi-stylesheet.html">Qt Style Sheets</a>}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="styleSheet")
    @QtBlockedSlot
    public final java.lang.String styleSheet()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_styleSheet(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_styleSheet(long __this__nativeId);

/**
Returns true if attribute <tt>attribute</tt> is set on this widget; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) setAttribute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testAttribute(com.trolltech.qt.core.Qt.WidgetAttribute arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testAttribute_WidgetAttribute(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native boolean __qt_testAttribute_WidgetAttribute(long __this__nativeId, int arg__1);

/**
This property holds the widget's tooltip. Note that by default tooltips are only shown for widgets that are children of the active window. You can change this behavior by setting the attribute {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_AlwaysShowToolTips } on the window, not on the widget with the tooltip. <p>If you want to control a tooltip's behavior, you can intercept the event() function and catch the {@link com.trolltech.qt.core.QEvent.Type QEvent::ToolTip } event (e.g., if you want to customize the area for which the tooltip should be shown). <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QToolTip QToolTip}, {@link QWidget#statusTip() statusTip}, and {@link QWidget#whatsThis() whatsThis}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="toolTip")
    @QtBlockedSlot
    public final java.lang.String toolTip()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toolTip(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toolTip(long __this__nativeId);

/**
Returns true if the widget is under the mouse cursor; otherwise returns false. <p>This value is not updated properly during drag and drop operations. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#enterEvent(com.trolltech.qt.core.QEvent) enterEvent()}, and {@link com.trolltech.qt.gui.QWidget#leaveEvent(com.trolltech.qt.core.QEvent) leaveEvent()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean underMouse()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_underMouse(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_underMouse(long __this__nativeId);

/**
This property holds the cursor shape for this widget. The mouse cursor will assume this shape when it's over this widget. See the {@link com.trolltech.qt.core.Qt.CursorShape list of predefined cursor objects } for a range of useful shapes. <p>An editor widget might use an I-beam cursor: <pre class="snippet">
        w.setCursor(new QCursor(Qt.CursorShape.IBeamCursor));
</pre> If no cursor has been set, or after a call to {@link com.trolltech.qt.gui.QWidget#unsetCursor() unsetCursor()}, the parent's cursor is used. <p>By default, this property contains a cursor with the {@link com.trolltech.qt.core.Qt.CursorShape Qt::ArrowCursor } shape. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication#setOverrideCursor(com.trolltech.qt.gui.QCursor) QApplication::setOverrideCursor()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyResetter(name="cursor")
    @QtBlockedSlot
    public final void unsetCursor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unsetCursor(nativeId());
    }
    @QtBlockedSlot
    native void __qt_unsetCursor(long __this__nativeId);

/**
This property holds the layout direction for this widget. By default, this property is set to {@link com.trolltech.qt.core.Qt.LayoutDirection Qt::LeftToRight }. <p>When the layout direction is set on a widget, it will propagate to the widget's children. Children added after the call to <tt>setLayoutDirection()</tt> will not inherit the parent's layout direction. <p><DT><b>See also:</b><br><DD>{@link QApplication#layoutDirection() QApplication::layoutDirection}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyResetter(name="layoutDirection")
    @QtBlockedSlot
    public final void unsetLayoutDirection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unsetLayoutDirection(nativeId());
    }
    @QtBlockedSlot
    native void __qt_unsetLayoutDirection(long __this__nativeId);

/**
This property holds the widget's locale. As long as no special locale has been set, this is either the parent's locale or (if this widget is a top level widget), the default locale. <p>If the widget displays dates or numbers, these should be formatted using the widget's locale. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale QLocale}, and {@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) QLocale::setDefault()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyResetter(name="locale")
    @QtBlockedSlot
    public final void unsetLocale()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unsetLocale(nativeId());
    }
    @QtBlockedSlot
    native void __qt_unsetLocale(long __this__nativeId);

/**
Updates the widget unless updates are disabled or the widget is hidden. <p>This function does not cause an immediate repaint; instead it schedules a paint event for processing when Qt returns to the main event loop. This permits Qt to optimize for more speed and less flicker than a call to {@link com.trolltech.qt.gui.QWidget#repaint() repaint()} does. <p>Calling {@link com.trolltech.qt.gui.QWidget#update() update()} several times normally results in just one {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()} call. <p>Qt normally erases the widget's area before the {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()} call. If the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_OpaquePaintEvent } widget attribute is set, the widget is responsible for painting all its pixels with an opaque color. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#repaint() repaint()}, {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}, {@link com.trolltech.qt.gui.QWidget#setUpdatesEnabled(boolean) setUpdatesEnabled()}, and {@link <a href="../qtjambi-analogclock.html">Analog Clock Example</a>}. <br></DD></DT>
*/

    public final void update()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_update(nativeId());
    }
    native void __qt_update(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>This version updates a rectangle <tt>rect</tt> inside the widget.
*/

    @QtBlockedSlot
    public final void update(com.trolltech.qt.core.QRect arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_update_QRect(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_update_QRect(long __this__nativeId, long arg__1);

/**
This is an overloaded member function, provided for convenience. <p>This version repaints a region <tt>rgn</tt> inside the widget.
*/

    @QtBlockedSlot
    public final void update(com.trolltech.qt.gui.QRegion arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_update_QRegion(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_update_QRegion(long __this__nativeId, long arg__1);

/**
This is an overloaded member function, provided for convenience. <p>This version updates a rectangle (<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>) inside the widget.
*/

    @QtBlockedSlot
    public final void update(int x, int y, int w, int h)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_update_int_int_int_int(nativeId(), x, y, w, h);
    }
    @QtBlockedSlot
    native void __qt_update_int_int_int_int(long __this__nativeId, int x, int y, int w, int h);

/**
Notifies the layout system that this widget has changed and may need to change geometry. <p>Call this function if the {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()} or {@link com.trolltech.qt.gui.QWidget#sizePolicy() sizePolicy()} have changed. <p>For explicitly hidden widgets, {@link com.trolltech.qt.gui.QWidget#updateGeometry() updateGeometry()} is a no-op. The layout system will be notified as soon as the widget is shown.
*/

    @QtBlockedSlot
    public final void updateGeometry()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateGeometry(nativeId());
    }
    @QtBlockedSlot
    native void __qt_updateGeometry(long __this__nativeId);

/**
Updates the widget's micro focus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QInputContext QInputContext}. <br></DD></DT>
*/

    protected final void updateMicroFocus()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_updateMicroFocus(nativeId());
    }
    native void __qt_updateMicroFocus(long __this__nativeId);

/**
This property holds whether updates are enabled. An updates enabled widget receives paint events and has a system background; a disabled widget does not. This also implies that calling {@link com.trolltech.qt.gui.QWidget#update() update()} and {@link com.trolltech.qt.gui.QWidget#repaint() repaint()} has no effect if updates are disabled. <p>By default, this property is true. <p>{@link com.trolltech.qt.gui.QWidget#setUpdatesEnabled(boolean) setUpdatesEnabled()} is normally used to disable updates for a short period of time, for instance to avoid screen flicker during large changes. In Qt, widgets normally do not generate screen flicker, but on X11 the server might erase regions on the screen when widgets get hidden before they can be replaced by other widgets. Disabling updates solves this. <p>Example: <pre class="snippet">
        setUpdatesEnabled(false);
        bigVisualChanges();
        setUpdatesEnabled(true);
</pre> Disabling a widget implicitly disables all its children. Enabling a widget enables all child widgets except top-level widgets or those that have been explicitly disabled. Re-enabling updates implicitly calls {@link com.trolltech.qt.gui.QWidget#update() update()} on the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="updatesEnabled")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final boolean updatesEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_updatesEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_updatesEnabled(long __this__nativeId);

/**
Returns the unobscured region where paint events can occur. <p>For visible widgets, this is an approximation of the area not covered by other widgets; otherwise, this is an empty region. <p>The {@link com.trolltech.qt.gui.QWidget#repaint() repaint()} function calls this function if necessary, so in general you do not need to call it.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QRegion visibleRegion()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visibleRegion(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QRegion __qt_visibleRegion(long __this__nativeId);

/**
This property holds the widget's What's This help text.  By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWhatsThis QWhatsThis}, {@link QWidget#toolTip() QWidget::toolTip}, and {@link QWidget#statusTip() QWidget::statusTip}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="whatsThis")
    @QtBlockedSlot
    public final java.lang.String whatsThis()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_whatsThis(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_whatsThis(long __this__nativeId);

/**
Returns the width of the paint device in default coordinate system units (e. . pixels for {@link com.trolltech.qt.gui.QPixmap QPixmap} and QWidget). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#widthMM() widthMM()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="width")
    @QtBlockedSlot
    public final int width()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_width(nativeId());
    }
    @QtBlockedSlot
    native int __qt_width(long __this__nativeId);

/**
Returns the width of the paint device in millimeters. Due to platform limitations it may not be possible to use this function to determine the actual physical size of a widget on the screen. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice#width() width()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int widthMM()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widthMM(nativeId());
    }
    @QtBlockedSlot
    native int __qt_widthMM(long __this__nativeId);

/**
Returns the window system identifier of the widget. <p>Portable in principle, but if you use it you are probably about to do something non-portable. Be careful. <p>If a widget is non-native (alien) and {@link com.trolltech.qt.gui.QWidget#winId() winId()} is invoked on it, that widget will be provided a native handle. <p><b>Note:</b> We recommend that you do not store this value as it is likely to change at run-time. <p><DT><b>See also:</b><br><DD>find(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final long winId()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_winId(nativeId());
    }
    @QtBlockedSlot
    native long __qt_winId(long __this__nativeId);

/**
Returns the window for this widget, i. . the next ancestor widget that has (or could have) a window-system frame. <p>If the widget is a window, the widget itself is returned. <p>Typical usage is changing the window title: <pre class="snippet">
        aWidget.window().setWindowTitle("New Window Title");
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#isWindow() isWindow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget window()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_window(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_window(long __this__nativeId);

/**
This property holds the file path associated with a widget. This property only makes sense for windows. It associates a file path with a window. If you set the file path, but have not set the window title, Qt sets the window title to contain a string created using the following components. <p>On Mac OS X: <ul><li> The file name of the specified path, obtained using {@link com.trolltech.qt.core.QFileInfo#fileName() QFileInfo::fileName()}.</li><li> An optional <tt>*</tt> character, if the {@link QWidget#isWindowModified() windowModified} property is set, as per the Apple Human Interface Guidelines.</li></ul> On Windows and X11: <ul><li> The file name of the specified path, obtained using {@link com.trolltech.qt.core.QFileInfo#fileName() QFileInfo::fileName()}.</li><li> An optional <tt>*</tt> character, if the {@link QWidget#isWindowModified() windowModified} property is set.</li><li> The <tt>0x2014</tt> unicode character, padded either side by spaces.</li><li> The application name, obtained from the application's {@link QCoreApplication#applicationName() applicationName} property.</li></ul> If the window title is set at any point, then the window title takes precedence and will be shown instead of the file path string. <p>Additionally, on Mac OS X, this has an added benefit that it sets the proxy icon for the window, assuming that the file path exists. <p>If no file path is set, this property contains an empty string. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowTitle() windowTitle}, and {@link QWidget#windowIcon() windowIcon}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="windowFilePath")
    @com.trolltech.qt.QtPropertyDesignable("isWindow")
    @QtBlockedSlot
    public final java.lang.String windowFilePath()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_windowFilePath(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_windowFilePath(long __this__nativeId);

/**
Window flags are a combination of a type (e. . {@link com.trolltech.qt.core.Qt.WindowType Qt::Dialog }) and zero or more hints to the window system (e.g. {@link com.trolltech.qt.core.Qt.WindowType Qt::FramelessWindowHint }). <p>If the widget had type {@link com.trolltech.qt.core.Qt.WindowType Qt::Widget } or {@link com.trolltech.qt.core.Qt.WindowType Qt::SubWindow } and becomes a window ({@link com.trolltech.qt.core.Qt.WindowType Qt::Window }, {@link com.trolltech.qt.core.Qt.WindowType Qt::Dialog }, etc.), it is put at position (0, 0) on the desktop. If the widget is a window and becomes a {@link com.trolltech.qt.core.Qt.WindowType Qt::Widget } or {@link com.trolltech.qt.core.Qt.WindowType Qt::SubWindow }, it is put at position (0, 0) relative to its parent widget. <p><b>Note:</b> This function calls {@link com.trolltech.qt.gui.QWidget#setParent(com.trolltech.qt.gui.QWidget) setParent()} when changing the flags for a window, causing the widget to be hidden. You must call {@link com.trolltech.qt.gui.QWidget#show() show()} to make the widget visible again.. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#windowType() windowType()}, and {@link <a href="../widgets-windowflags.html">Window Flags Example</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.WindowFlags windowFlags()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.WindowFlags(__qt_windowFlags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_windowFlags(long __this__nativeId);

/**
This property holds the widget's icon. This property only makes sense for windows. If no icon has been set, {@link com.trolltech.qt.gui.QWidget#windowIcon() windowIcon()} returns the application icon ({@link QApplication#windowIcon() QApplication::windowIcon()}). <p><DT><b>See also:</b><br><DD>{@link QWidget#windowIconText() windowIconText}, and {@link QWidget#windowTitle() windowTitle}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="windowIcon")
    @com.trolltech.qt.QtPropertyDesignable("isWindow")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon windowIcon()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_windowIcon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_windowIcon(long __this__nativeId);

/**
This property holds the widget's icon text. This property only makes sense for windows. If no icon text has been set, this functions returns an empty string. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowIcon() windowIcon}, and {@link QWidget#windowTitle() windowTitle}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="windowIconText")
    @com.trolltech.qt.QtPropertyDesignable("isWindow")
    @QtBlockedSlot
    public final java.lang.String windowIconText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_windowIconText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_windowIconText(long __this__nativeId);

/**
This property holds which windows are blocked by the modal widget. This property only makes sense for windows. A modal widget prevents widgets in other windows from getting input. The value of this property controls which windows are blocked when the widget is visible. Changing this property while the window is visible has no effect; you must {@link com.trolltech.qt.gui.QWidget#hide() hide()} the widget first, then {@link com.trolltech.qt.gui.QWidget#show() show()} it again. <p>By default, this property is {@link com.trolltech.qt.core.Qt.WindowModality Qt::NonModal }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#isWindow() isWindow()}, {@link QWidget#isModal() QWidget::modal}, and {@link com.trolltech.qt.gui.QDialog QDialog}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="windowModality")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.WindowModality windowModality()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.WindowModality.resolve(__qt_windowModality(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_windowModality(long __this__nativeId);

/**
This property holds The level of opacity for the window.  The valid range of opacity is from 1.0 (completely opaque) to 0.0 (completely transparent). <p>By default the value of this property is 1.0. <p>This feature is available on Embedded Linux, Mac OS X, X11 platforms that support the Composite extension, and Windows 2000 and later. <p>This feature is not available on Windows CE. <p>Note that under X11 you need to have a composite manager running, and the X11 specific _NET_WM_WINDOW_OPACITY atom needs to be supported by the window manager you are using. <p><b>Warning:</b> Changing this property from opaque to transparent might issue a paint event that needs to be processed before the window is displayed correctly. This affects mainly the use of {@link com.trolltech.qt.gui.QPixmap#grabWindow(long, int, int, int) QPixmap::grabWindow()}. Also note that semi-transparent windows update and resize significantly slower than opaque windows. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setMask(com.trolltech.qt.gui.QBitmap) setMask()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="windowOpacity")
    @com.trolltech.qt.QtPropertyDesignable("isWindow")
    @QtBlockedSlot
    public final double windowOpacity()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_windowOpacity(nativeId());
    }
    @QtBlockedSlot
    native double __qt_windowOpacity(long __this__nativeId);

/**
Returns the window's role, or an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setWindowRole(java.lang.String) setWindowRole()}, {@link QWidget#windowIcon() windowIcon}, and {@link QWidget#windowTitle() windowTitle}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String windowRole()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_windowRole(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_windowRole(long __this__nativeId);

/**
Returns the current window state. The window state is a OR'ed combination of {@link com.trolltech.qt.core.Qt.WindowState Qt::WindowState }: {@link com.trolltech.qt.core.Qt.WindowState Qt::WindowMinimized }, {@link com.trolltech.qt.core.Qt.WindowState Qt::WindowMaximized }, {@link com.trolltech.qt.core.Qt.WindowState Qt::WindowFullScreen }, and {@link com.trolltech.qt.core.Qt.WindowState Qt::WindowActive }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.WindowState Qt::WindowState }, and {@link com.trolltech.qt.gui.QWidget#setWindowState(com.trolltech.qt.core.Qt.WindowState[]) setWindowState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.WindowStates windowState()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.WindowStates(__qt_windowState(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_windowState(long __this__nativeId);

/**
This property holds the window title (caption). This property only makes sense for top-level widgets, such as windows and dialogs. If no caption has been set, the title is based of the {@link QWidget#windowFilePath() windowFilePath}. If neither of these is set, then the title is an empty string. <p>If you use the {@link QWidget#isWindowModified() windowModified} mechanism, the window title must contain a "[*]" placeholder, which indicates where the '*' should appear. Normally, it should appear right after the file name (e.g., "document1.txt[*] - Text Editor"). If the {@link QWidget#isWindowModified() windowModified} property is false (the default), the placeholder is simply removed. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowIcon() windowIcon}, {@link QWidget#windowIconText() windowIconText}, {@link QWidget#isWindowModified() windowModified}, and {@link QWidget#windowFilePath() windowFilePath}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="windowTitle")
    @com.trolltech.qt.QtPropertyDesignable("isWindow")
    @QtBlockedSlot
    public final java.lang.String windowTitle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_windowTitle(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_windowTitle(long __this__nativeId);

/**
Returns the window type of this widget. This is identical to {@link com.trolltech.qt.gui.QWidget#windowFlags() windowFlags()} & {@link com.trolltech.qt.core.Qt.WindowType Qt::WindowType_Mask }. <p><DT><b>See also:</b><br><DD>{@link QWidget#windowFlags() windowFlags}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.WindowType windowType()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.WindowType.resolve(__qt_windowType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_windowType(long __this__nativeId);

/**
This property holds the x coordinate of the widget relative to its parent including any window frame. See the {@link <a href="../geometry.html">Window Geometry documentation</a>} for an overview of window geometry. <p>By default, this property has a value of 0. <p><DT><b>See also:</b><br><DD>{@link QWidget#frameGeometry() frameGeometry}, {@link QWidget#y() y}, and {@link QWidget#pos() pos}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="x")
    @QtBlockedSlot
    public final int x()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_x(nativeId());
    }
    @QtBlockedSlot
    native int __qt_x(long __this__nativeId);

/**
This property holds the y coordinate of the widget relative to its parent and including any window frame. See the {@link <a href="../geometry.html">Window Geometry documentation</a>} for an overview of window geometry. <p>By default, this property has a value of 0. <p><DT><b>See also:</b><br><DD>{@link QWidget#frameGeometry() frameGeometry}, {@link QWidget#x() x}, and {@link QWidget#pos() pos}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="y")
    @QtBlockedSlot
    public final int y()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_y(nativeId());
    }
    @QtBlockedSlot
    native int __qt_y(long __this__nativeId);

/**
This event handler is called with the given <tt>event</tt> whenever the widget's actions are changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#addAction(com.trolltech.qt.gui.QAction) addAction()}, {@link com.trolltech.qt.gui.QWidget#insertAction(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QAction) insertAction()}, {@link com.trolltech.qt.gui.QWidget#removeAction(com.trolltech.qt.gui.QAction) removeAction()}, {@link com.trolltech.qt.gui.QWidget#actions() actions()}, and {@link com.trolltech.qt.gui.QActionEvent QActionEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void actionEvent(com.trolltech.qt.gui.QActionEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_actionEvent_QActionEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_actionEvent_QActionEvent(long __this__nativeId, long arg__1);

/**
This event handler can be reimplemented to handle state changes. <p>The state being changed in this event can be retrieved through event <tt>event</tt>. <p>Change events include: {@link com.trolltech.qt.core.QEvent.Type QEvent::ToolBarChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::ActivationChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::EnabledChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::FontChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::StyleChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::PaletteChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::WindowTitleChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::IconTextChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::ModifiedChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::MouseTrackingChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::ParentChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::WindowStateChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::LanguageChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::LocaleChange }, {@link com.trolltech.qt.core.QEvent.Type QEvent::LayoutDirectionChange }.
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long arg__1);

/**
This event handler is called with the given <tt>event</tt> when Qt receives a window close request for a top-level widget from the window system. <p>By default, the event is accepted and the widget is closed. You can reimplement this function to change the way the widget responds to window close requests. For example, you can prevent the window from closing by calling {@link com.trolltech.qt.core.QEvent#ignore() ignore()} on all events. <p>Main window applications typically use reimplementations of this function to check whether the user's work has been saved and ask for permission before closing. For example, the {@link <a href="../qtjambi-application.html">Application Example</a>} uses a helper function to determine whether or not to close the window:<br><br>The following code example is written in c++.<br> <pre class="snippet">
void MainWindow::closeEvent(QCloseEvent *event)

{
    if (maybeSave()) {
        writeSettings();
        event-&gt;accept();
    } else {
        event-&gt;ignore();
    }
}
</pre> <p><DT><b>See also:</b><br><DD>event(), {@link com.trolltech.qt.gui.QWidget#hide() hide()}, {@link com.trolltech.qt.gui.QWidget#close() close()}, {@link com.trolltech.qt.gui.QCloseEvent QCloseEvent}, and {@link <a href="../qtjambi-application.html">Application Example</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void closeEvent(com.trolltech.qt.gui.QCloseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_closeEvent_QCloseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_closeEvent_QCloseEvent(long __this__nativeId, long arg__1);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive widget context menu events. <p>The handler is called when the widget's {@link QWidget#contextMenuPolicy() contextMenuPolicy} is {@link com.trolltech.qt.core.Qt.ContextMenuPolicy Qt::DefaultContextMenu }. <p>The default implementation ignores the context event. See the {@link com.trolltech.qt.gui.QContextMenuEvent QContextMenuEvent} documentation for more details. <p><DT><b>See also:</b><br><DD>event(), {@link com.trolltech.qt.gui.QContextMenuEvent QContextMenuEvent}, and {@link com.trolltech.qt.gui.QWidget#customContextMenuRequested customContextMenuRequested() }. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QContextMenuEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QContextMenuEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int devType()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_devType(nativeId());
    }
    @QtBlockedSlot
    native int __qt_devType(long __this__nativeId);

/**
This event handler is called when a drag is in progress and the mouse enters this widget. The event is passed in the <tt>event</tt> parameter. <p>If the event is ignored, the widget won't receive any {@link com.trolltech.qt.gui.QWidget#dragMoveEvent(com.trolltech.qt.gui.QDragMoveEvent) drag move events}. <p>See the {@link <a href="../qtjambi-dnd.html">Drag-and-drop documentation</a>} for an overview of how to provide drag-and-drop in your application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDrag QDrag}, and {@link com.trolltech.qt.gui.QDragEnterEvent QDragEnterEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void dragEnterEvent(com.trolltech.qt.gui.QDragEnterEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragEnterEvent_QDragEnterEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragEnterEvent_QDragEnterEvent(long __this__nativeId, long arg__1);

/**
This event handler is called when a drag is in progress and the mouse leaves this widget. The event is passed in the <tt>event</tt> parameter. <p>See the {@link <a href="../qtjambi-dnd.html">Drag-and-drop documentation</a>} for an overview of how to provide drag-and-drop in your application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDrag QDrag}, and {@link com.trolltech.qt.gui.QDragLeaveEvent QDragLeaveEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void dragLeaveEvent(com.trolltech.qt.gui.QDragLeaveEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragLeaveEvent_QDragLeaveEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragLeaveEvent_QDragLeaveEvent(long __this__nativeId, long arg__1);

/**
This event handler is called if a drag is in progress, and when any of the following conditions occur. the cursor enters this widget, the cursor moves within this widget, or a modifier key is pressed on the keyboard while this widget has the focus. The event is passed in the <tt>event</tt> parameter. <p>See the {@link <a href="../qtjambi-dnd.html">Drag-and-drop documentation</a>} for an overview of how to provide drag-and-drop in your application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDrag QDrag}, and {@link com.trolltech.qt.gui.QDragMoveEvent QDragMoveEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void dragMoveEvent(com.trolltech.qt.gui.QDragMoveEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dragMoveEvent_QDragMoveEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dragMoveEvent_QDragMoveEvent(long __this__nativeId, long arg__1);

/**
This event handler is called when the drag is dropped on this widget. The event is passed in the <tt>event</tt> parameter. <p>See the {@link <a href="../qtjambi-dnd.html">Drag-and-drop documentation</a>} for an overview of how to provide drag-and-drop in your application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDrag QDrag}, and {@link com.trolltech.qt.gui.QDropEvent QDropEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void dropEvent(com.trolltech.qt.gui.QDropEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dropEvent_QDropEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_dropEvent_QDropEvent(long __this__nativeId, long arg__1);

/**
This event handler can be reimplemented in a subclass to receive widget enter events which are passed in the <tt>event</tt> parameter. <p>An event is sent to the widget when the mouse cursor enters the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#leaveEvent(com.trolltech.qt.core.QEvent) leaveEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()}, and event(). <br></DD></DT>
*/

    @QtBlockedSlot
    protected void enterEvent(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_enterEvent_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_enterEvent_QEvent(long __this__nativeId, long arg__1);

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
This event handler can be reimplemented in a subclass to receive keyboard focus events (focus received) for the widget. The event is passed in the <tt>event</tt> parameter <p>A widget normally must {@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) setFocusPolicy()} to something other than {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::NoFocus } in order to receive focus events. (Note that the application programmer can call {@link com.trolltech.qt.gui.QWidget#setFocus() setFocus()} on any widget, even those that do not normally accept focus.) <p>The default implementation updates the widget (except for windows that do not specify a {@link com.trolltech.qt.gui.QWidget#focusPolicy() focusPolicy()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()}, {@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) setFocusPolicy()}, {@link com.trolltech.qt.gui.QWidget#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) keyPressEvent()}, {@link com.trolltech.qt.gui.QWidget#keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent) keyReleaseEvent()}, event(), and {@link com.trolltech.qt.gui.QFocusEvent QFocusEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long arg__1);

/**
Finds a new widget to give the keyboard focus to, as appropriate for Tab and Shift+Tab, and returns true if it can find a new widget, or false if it can't. <p>If <tt>next</tt> is true, this function searches forward, if <tt>next</tt> is false, it searches backward. <p>Sometimes, you will want to reimplement this function. For example, a web browser might reimplement it to move its "current active link" forward or backward, and call {@link com.trolltech.qt.gui.QWidget#focusNextPrevChild(boolean) focusNextPrevChild()} only when it reaches the last or first link on the "page". <p>Child widgets call {@link com.trolltech.qt.gui.QWidget#focusNextPrevChild(boolean) focusNextPrevChild()} on their parent widgets, but only the window that contains the child widgets decides where to redirect focus. By reimplementing this function for an object, you thus gain control of focus traversal for all child widgets. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#focusNextChild() focusNextChild()}, and {@link com.trolltech.qt.gui.QWidget#focusPreviousChild() focusPreviousChild()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean focusNextPrevChild(boolean next)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_focusNextPrevChild_boolean(nativeId(), next);
    }
    @QtBlockedSlot
    native boolean __qt_focusNextPrevChild_boolean(long __this__nativeId, boolean next);

/**
This event handler can be reimplemented in a subclass to receive keyboard focus events (focus lost) for the widget. The events is passed in the <tt>event</tt> parameter. <p>A widget normally must {@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) setFocusPolicy()} to something other than {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::NoFocus } in order to receive focus events. (Note that the application programmer can call {@link com.trolltech.qt.gui.QWidget#setFocus() setFocus()} on any widget, even those that do not normally accept focus.) <p>The default implementation updates the widget (except for windows that do not specify a {@link com.trolltech.qt.gui.QWidget#focusPolicy() focusPolicy()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()}, {@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) setFocusPolicy()}, {@link com.trolltech.qt.gui.QWidget#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) keyPressEvent()}, {@link com.trolltech.qt.gui.QWidget#keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent) keyReleaseEvent()}, event(), and {@link com.trolltech.qt.gui.QFocusEvent QFocusEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long arg__1);

/**
Returns the preferred height for this widget, given the width <tt>w</tt>. <p>If this widget has a layout, the default implementation returns the layout's preferred height. if there is no layout, the default implementation returns -1 indicating that the preferred height does not depend on the width.
*/

    @QtBlockedSlot
    public int heightForWidth(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_heightForWidth_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native int __qt_heightForWidth_int(long __this__nativeId, int arg__1);

/**
This event handler can be reimplemented in a subclass to receive widget hide events. The event is passed in the <tt>event</tt> parameter. <p>Hide events are sent to widgets immediately after they have been hidden. <p>Note: A widget receives spontaneous show and hide events when its mapping status is changed by the window system, e.g. a spontaneous hide event when the user minimizes the window, and a spontaneous show event when the window is restored again. After receiving a spontaneous hide event, a widget is still considered visible in the sense of {@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()}. <p><DT><b>See also:</b><br><DD>{@link QWidget#isVisible() visible}, event(), and {@link com.trolltech.qt.gui.QHideEvent QHideEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void hideEvent(com.trolltech.qt.gui.QHideEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideEvent_QHideEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_hideEvent_QHideEvent(long __this__nativeId, long arg__1);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive Input Method composition events. This handler is called when the state of the input method changes. <p>Note that when creating custom text editing widgets, the {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_InputMethodEnabled } window attribute must be set explicitly (using the {@link com.trolltech.qt.gui.QWidget#setAttribute(com.trolltech.qt.core.Qt.WidgetAttribute) setAttribute()} function) in order to receive input method events. <p>The default implementation calls event-&gt;ignore(), which rejects the Input Method event. See the {@link com.trolltech.qt.gui.QInputMethodEvent QInputMethodEvent} documentation for more details. <p><DT><b>See also:</b><br><DD>event(), and {@link com.trolltech.qt.gui.QInputMethodEvent QInputMethodEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void inputMethodEvent(com.trolltech.qt.gui.QInputMethodEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_inputMethodEvent_QInputMethodEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_inputMethodEvent_QInputMethodEvent(long __this__nativeId, long arg__1);

/**
This method is only relevant for input widgets. It is used by the input method to query a set of properties of the widget to be able to support complex input method operations as support for surrounding text and reconversions. <p><tt>query</tt> specifies which property is queried. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#inputMethodEvent(com.trolltech.qt.gui.QInputMethodEvent) inputMethodEvent()}, {@link com.trolltech.qt.gui.QInputMethodEvent QInputMethodEvent}, and {@link com.trolltech.qt.gui.QInputContext QInputContext}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.Object inputMethodQuery(com.trolltech.qt.core.Qt.InputMethodQuery arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_inputMethodQuery_InputMethodQuery(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_inputMethodQuery_InputMethodQuery(long __this__nativeId, int arg__1);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive key press events for the widget. <p>A widget must call {@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) setFocusPolicy()} to accept focus initially and have focus in order to receive a key press event. <p>If you reimplement this handler, it is very important that you call the base class implementation if you do not act upon the key. <p>The default implementation closes popup widgets if the user presses Esc. Otherwise the event is ignored, so that the widget's parent can interpret it. <p>Note that {@link com.trolltech.qt.gui.QKeyEvent QKeyEvent} starts with isAccepted() == true, so you do not need to call {@link com.trolltech.qt.core.QEvent#accept() QKeyEvent::accept()} - just do not call the base class implementation if you act upon the key. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent) keyReleaseEvent()}, {@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) setFocusPolicy()}, {@link com.trolltech.qt.gui.QWidget#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()}, {@link com.trolltech.qt.gui.QWidget#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()}, event(), {@link com.trolltech.qt.gui.QKeyEvent QKeyEvent}, and {@link <a href="../qtjambi-tetrix.html">Tetrix Example</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long arg__1);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive key release events for the widget. <p>A widget must {@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) accept focus} initially and {@link com.trolltech.qt.gui.QWidget#hasFocus() have focus} in order to receive a key release event. <p>If you reimplement this handler, it is very important that you call the base class implementation if you do not act upon the key. <p>The default implementation ignores the event, so that the widget's parent can interpret it. <p>Note that {@link com.trolltech.qt.gui.QKeyEvent QKeyEvent} starts with isAccepted() == true, so you do not need to call {@link com.trolltech.qt.core.QEvent#accept() QKeyEvent::accept()} - just do not call the base class implementation if you act upon the key. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#keyPressEvent(com.trolltech.qt.gui.QKeyEvent) keyPressEvent()}, {@link com.trolltech.qt.core.QEvent#ignore() QKeyEvent::ignore()}, {@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) setFocusPolicy()}, {@link com.trolltech.qt.gui.QWidget#focusInEvent(com.trolltech.qt.gui.QFocusEvent) focusInEvent()}, {@link com.trolltech.qt.gui.QWidget#focusOutEvent(com.trolltech.qt.gui.QFocusEvent) focusOutEvent()}, event(), and {@link com.trolltech.qt.gui.QKeyEvent QKeyEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyReleaseEvent_QKeyEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyReleaseEvent_QKeyEvent(long __this__nativeId, long arg__1);

/**

*/

    @QtBlockedSlot
    protected void languageChange()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_languageChange(nativeId());
    }
    @QtBlockedSlot
    native void __qt_languageChange(long __this__nativeId);

/**
This event handler can be reimplemented in a subclass to receive widget leave events which are passed in the <tt>event</tt> parameter. <p>A leave event is sent to the widget when the mouse cursor leaves the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#enterEvent(com.trolltech.qt.core.QEvent) enterEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()}, and event(). <br></DD></DT>
*/

    @QtBlockedSlot
    protected void leaveEvent(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_leaveEvent_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_leaveEvent_QEvent(long __this__nativeId, long arg__1);

/**
Returns the metric information for the given paint device <tt>metric</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric PaintDeviceMetric }. <br></DD></DT>
*/

    @QtBlockedSlot
    public int metric(com.trolltech.qt.gui.QPaintDevice.PaintDeviceMetric arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_metric_PaintDeviceMetric(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native int __qt_metric_PaintDeviceMetric(long __this__nativeId, int arg__1);

/**
This property holds the recommended minimum size for the widget. If the value of this property is an invalid size, no minimum size is recommended. <p>The default implementation of {@link com.trolltech.qt.gui.QWidget#minimumSizeHint() minimumSizeHint()} returns an invalid size if there is no layout for this widget, and returns the layout's minimum size otherwise. Most built-in widgets reimplement {@link com.trolltech.qt.gui.QWidget#minimumSizeHint() minimumSizeHint()}. <p>{@link com.trolltech.qt.gui.QLayout QLayout} will never resize a widget to a size smaller than the minimum size hint unless {@link com.trolltech.qt.gui.QWidget#minimumSize() minimumSize()} is set or the size policy is set to QSizePolicy::Ignore. If {@link com.trolltech.qt.gui.QWidget#minimumSize() minimumSize()} is set, the minimum size hint will be ignored. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#isValid() QSize::isValid()}, {@link com.trolltech.qt.gui.QWidget#resize(com.trolltech.qt.core.QSize) resize()}, {@link com.trolltech.qt.gui.QWidget#setMinimumSize(com.trolltech.qt.core.QSize) setMinimumSize()}, and {@link com.trolltech.qt.gui.QWidget#sizePolicy() sizePolicy()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="minimumSizeHint")
    @QtBlockedSlot
    public com.trolltech.qt.core.QSize minimumSizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_minimumSizeHint(long __this__nativeId);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive mouse double click events for the widget. <p>The default implementation generates a normal mouse press event. <p>Note that the widgets gets a {@link com.trolltech.qt.gui.QWidget#mousePressEvent(com.trolltech.qt.gui.QMouseEvent) mousePressEvent()} and a {@link com.trolltech.qt.gui.QWidget#mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent) mouseReleaseEvent()} before the {@link com.trolltech.qt.gui.QWidget#mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent) mouseDoubleClickEvent()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mousePressEvent(com.trolltech.qt.gui.QMouseEvent) mousePressEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent) mouseReleaseEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()}, event(), and {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseDoubleClickEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseDoubleClickEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive mouse move events for the widget. <p>If mouse tracking is switched off, mouse move events only occur if a mouse button is pressed while the mouse is being moved. If mouse tracking is switched on, mouse move events occur even if no mouse button is pressed. <p>{@link com.trolltech.qt.gui.QMouseEvent#pos() QMouseEvent::pos()} reports the position of the mouse cursor, relative to this widget. For press and release events, the position is usually the same as the position of the last mouse move event, but it might be different if the user's hand shakes. This is a feature of the underlying window system, not Qt. <p>If you want to show a tooltip immediately, while the mouse is moving (e.g., to get the mouse coordinates with {@link com.trolltech.qt.gui.QMouseEvent#pos() QMouseEvent::pos()} and show them as a tooltip), you must first enable mouse tracking as described above. Then, to ensure that the tooltip is updated immediately, you must call {@link com.trolltech.qt.gui.QToolTip#showText(com.trolltech.qt.core.QPoint, java.lang.String) QToolTip::showText()} instead of {@link com.trolltech.qt.gui.QWidget#setToolTip(java.lang.String) setToolTip()} in your implementation of {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setMouseTracking(boolean) setMouseTracking()}, {@link com.trolltech.qt.gui.QWidget#mousePressEvent(com.trolltech.qt.gui.QMouseEvent) mousePressEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent) mouseReleaseEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent) mouseDoubleClickEvent()}, event(), {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}, and {@link <a href="../qtjambi-scribble.html">Scribble Example</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive mouse press events for the widget. <p>If you create new widgets in the {@link com.trolltech.qt.gui.QWidget#mousePressEvent(com.trolltech.qt.gui.QMouseEvent) mousePressEvent()} the {@link com.trolltech.qt.gui.QWidget#mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent) mouseReleaseEvent()} may not end up where you expect, depending on the underlying window system (or X11 window manager), the widgets' location and maybe more. <p>The default implementation implements the closing of popup widgets when you click outside the window. For other widget types it does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent) mouseReleaseEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent) mouseDoubleClickEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()}, event(), {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}, and {@link <a href="../qtjambi-scribble.html">Scribble Example</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive mouse release events for the widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#mousePressEvent(com.trolltech.qt.gui.QMouseEvent) mousePressEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseDoubleClickEvent(com.trolltech.qt.gui.QMouseEvent) mouseDoubleClickEvent()}, {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()}, event(), {@link com.trolltech.qt.gui.QMouseEvent QMouseEvent}, and {@link <a href="../qtjambi-scribble.html">Scribble Example</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This event handler can be reimplemented in a subclass to receive widget move events which are passed in the <tt>event</tt> parameter. When the widget receives this event, it is already at the new position. <p>The old position is accessible through {@link com.trolltech.qt.gui.QMoveEvent#oldPos() QMoveEvent::oldPos()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()}, event(), {@link com.trolltech.qt.gui.QWidget#move(com.trolltech.qt.core.QPoint) move()}, and {@link com.trolltech.qt.gui.QMoveEvent QMoveEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void moveEvent(com.trolltech.qt.gui.QMoveEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveEvent_QMoveEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_moveEvent_QMoveEvent(long __this__nativeId, long arg__1);

/**
Returns a pointer to the paint engine used for drawing on the device.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QPaintEngine paintEngine()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_paintEngine(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPaintEngine __qt_paintEngine(long __this__nativeId);

/**
This event handler can be reimplemented in a subclass to receive paint events passed in <tt>event</tt>. <p>A paint event is a request to repaint all or part of a widget. It can happen for one of the following reasons: <ul><li> {@link com.trolltech.qt.gui.QWidget#repaint() repaint()} or {@link com.trolltech.qt.gui.QWidget#update() update()} was invoked,</li><li> the widget was obscured and has now been uncovered, or</li><li> many other reasons.</li></ul> Many widgets can simply repaint their entire surface when asked to, but some slow widgets need to optimize by painting only the requested region: {@link com.trolltech.qt.gui.QPaintEvent#region() QPaintEvent::region()}. This speed optimization does not change the result, as painting is clipped to that region during event processing. {@link com.trolltech.qt.gui.QListView QListView} and {@link com.trolltech.qt.gui.QTableView QTableView} do this, for example. <p>Qt also tries to speed up painting by merging multiple paint events into one. When {@link com.trolltech.qt.gui.QWidget#update() update()} is called several times or the window system sends several paint events, Qt merges these events into one event with a larger region (see {@link com.trolltech.qt.gui.QRegion#united(com.trolltech.qt.core.QRect) QRegion::united()}). The {@link com.trolltech.qt.gui.QWidget#repaint() repaint()} function does not permit this optimization, so we suggest using {@link com.trolltech.qt.gui.QWidget#update() update()} whenever possible. <p>When the paint event occurs, the update region has normally been erased, so you are painting on the widget's background. <p>The background can be set using {@link com.trolltech.qt.gui.QWidget#setBackgroundRole(com.trolltech.qt.gui.QPalette.ColorRole) setBackgroundRole()} and {@link com.trolltech.qt.gui.QWidget#setPalette(com.trolltech.qt.gui.QPalette) setPalette()}. <p>Since Qt 4.0, QWidget automatically double-buffers its painting, so there is no need to write double-buffering code in {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()} to avoid flicker. <p><b>Note for the X11 platform</b>: It is possible to toggle global double buffering by calling <tt>qt_x11_set_global_double_buffer()</tt>. For example, <pre class="snippet">
    This code is not relevant for Qt Jambi
    ...
    extern void qt_x11_set_global_double_buffer(bool);
    qt_x11_set_global_double_buffer(false);
    ...
</pre> <b>Note:</b> Generally, you should refrain from calling {@link com.trolltech.qt.gui.QWidget#update() update()} or {@link com.trolltech.qt.gui.QWidget#repaint() repaint()}<b>inside</b> a {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}. For example, calling {@link com.trolltech.qt.gui.QWidget#update() update()} or {@link com.trolltech.qt.gui.QWidget#repaint() repaint()} on children inside a paintevent() results in undefined behavior; the child may or may not get a paint event. <p><b>Warning:</b> If you are using a custom paint engine without Qt's backingstore, {@link com.trolltech.qt.core.Qt.WidgetAttribute Qt::WA_PaintOnScreen } must be set. Otherwise, {@link com.trolltech.qt.gui.QWidget#paintEngine() QWidget::paintEngine()} will never be called; the backingstore will be used instead. <p><DT><b>See also:</b><br><DD>event(), {@link com.trolltech.qt.gui.QWidget#repaint() repaint()}, {@link com.trolltech.qt.gui.QWidget#update() update()}, {@link com.trolltech.qt.gui.QPainter QPainter}, {@link com.trolltech.qt.gui.QPixmap QPixmap}, {@link com.trolltech.qt.gui.QPaintEvent QPaintEvent}, and {@link <a href="../qtjambi-analogclock.html">Analog Clock Example</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long arg__1);

/**
This event handler can be reimplemented in a subclass to receive widget resize events which are passed in the <tt>event</tt> parameter. When {@link com.trolltech.qt.gui.QWidget#resizeEvent(com.trolltech.qt.gui.QResizeEvent) resizeEvent()} is called, the widget already has its new geometry. The old size is accessible through {@link com.trolltech.qt.gui.QResizeEvent#oldSize() QResizeEvent::oldSize()}. <p>The widget will be erased and receive a paint event immediately after processing the resize event. No drawing need be (or should be) done inside this handler. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#moveEvent(com.trolltech.qt.gui.QMoveEvent) moveEvent()}, event(), {@link com.trolltech.qt.gui.QWidget#resize(com.trolltech.qt.core.QSize) resize()}, {@link com.trolltech.qt.gui.QResizeEvent QResizeEvent}, {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()}, and {@link <a href="../qtjambi-scribble.html">Scribble Example</a>}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long arg__1);

/**
This property holds whether the widget is visible. Calling setVisible(true) or {@link com.trolltech.qt.gui.QWidget#show() show()} sets the widget to visible status if all its parent widgets up to the window are visible. If an ancestor is not visible, the widget won't become visible until all its ancestors are shown. If its size or position has changed, Qt guarantees that a widget gets move and resize events just before it is shown. If the widget has not been resized yet, Qt will adjust the widget's size to a useful default using {@link com.trolltech.qt.gui.QWidget#adjustSize() adjustSize()}. <p>Calling setVisible(false) or {@link com.trolltech.qt.gui.QWidget#hide() hide()} hides a widget explicitly. An explicitly hidden widget will never become visible, even if all its ancestors become visible, unless you show it. <p>A widget receives show and hide events when its visibility status changes. Between a hide and a show event, there is no need to waste CPU cycles preparing or displaying information to the user. A video application, for example, might simply stop generating new frames. <p>A widget that happens to be obscured by other windows on the screen is considered to be visible. The same applies to iconified windows and windows that exist on another virtual desktop (on platforms that support this concept). A widget receives spontaneous show and hide events when its mapping status is changed by the window system, e.g. a spontaneous hide event when the user minimizes the window, and a spontaneous show event when the window is restored again. <p>You almost never have to reimplement the {@link com.trolltech.qt.gui.QWidget#setVisible(boolean) setVisible()} function. If you need to change some settings before a widget is shown, use {@link com.trolltech.qt.gui.QWidget#showEvent(com.trolltech.qt.gui.QShowEvent) showEvent()} instead. If you need to do some delayed initialization use the Polish event delivered to the event() function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#show() show()}, {@link com.trolltech.qt.gui.QWidget#hide() hide()}, {@link com.trolltech.qt.gui.QWidget#isHidden() isHidden()}, {@link com.trolltech.qt.gui.QWidget#isVisibleTo(com.trolltech.qt.gui.QWidget) isVisibleTo()}, {@link com.trolltech.qt.gui.QWidget#isMinimized() isMinimized()}, {@link com.trolltech.qt.gui.QWidget#showEvent(com.trolltech.qt.gui.QShowEvent) showEvent()}, and {@link com.trolltech.qt.gui.QWidget#hideEvent(com.trolltech.qt.gui.QHideEvent) hideEvent()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="visible")
    public void setVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), visible);
    }
    native void __qt_setVisible_boolean(long __this__nativeId, boolean visible);

/**
This event handler can be reimplemented in a subclass to receive widget show events which are passed in the <tt>event</tt> parameter. <p>Non-spontaneous show events are sent to widgets immediately before they are shown. The spontaneous show events of windows are delivered afterwards. <p>Note: A widget receives spontaneous show and hide events when its mapping status is changed by the window system, e.g. a spontaneous hide event when the user minimizes the window, and a spontaneous show event when the window is restored again. After receiving a spontaneous hide event, a widget is still considered visible in the sense of {@link com.trolltech.qt.gui.QWidget#isVisible() isVisible()}. <p><DT><b>See also:</b><br><DD>{@link QWidget#isVisible() visible}, event(), and {@link com.trolltech.qt.gui.QShowEvent QShowEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void showEvent(com.trolltech.qt.gui.QShowEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showEvent_QShowEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_showEvent_QShowEvent(long __this__nativeId, long arg__1);

/**
This property holds the recommended size for the widget. If the value of this property is an invalid size, no size is recommended. <p>The default implementation of {@link com.trolltech.qt.gui.QWidget#sizeHint() sizeHint()} returns an invalid size if there is no layout for this widget, and returns the layout's preferred size otherwise. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSize#isValid() QSize::isValid()}, {@link com.trolltech.qt.gui.QWidget#minimumSizeHint() minimumSizeHint()}, {@link com.trolltech.qt.gui.QWidget#sizePolicy() sizePolicy()}, {@link com.trolltech.qt.gui.QWidget#setMinimumSize(com.trolltech.qt.core.QSize) setMinimumSize()}, and {@link com.trolltech.qt.gui.QWidget#updateGeometry() updateGeometry()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="sizeHint")
    @QtBlockedSlot
    public com.trolltech.qt.core.QSize sizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive tablet events for the widget. <p>If you reimplement this handler, it is very important that you {@link com.trolltech.qt.gui.QTabletEvent ignore()} the event if you do not handle it, so that the widget's parent can interpret it. <p>The default implementation ignores the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QEvent#ignore() QTabletEvent::ignore()}, {@link com.trolltech.qt.core.QEvent#accept() QTabletEvent::accept()}, event(), and {@link com.trolltech.qt.gui.QTabletEvent QTabletEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void tabletEvent(com.trolltech.qt.gui.QTabletEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_tabletEvent_QTabletEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_tabletEvent_QTabletEvent(long __this__nativeId, long arg__1);

/**
This event handler, for event <tt>event</tt>, can be reimplemented in a subclass to receive wheel events for the widget. <p>If you reimplement this handler, it is very important that you {@link com.trolltech.qt.gui.QWheelEvent ignore()} the event if you do not handle it, so that the widget's parent can interpret it. <p>The default implementation ignores the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QEvent#ignore() QWheelEvent::ignore()}, {@link com.trolltech.qt.core.QEvent#accept() QWheelEvent::accept()}, event(), and {@link com.trolltech.qt.gui.QWheelEvent QWheelEvent}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void wheelEvent(com.trolltech.qt.gui.QWheelEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wheelEvent_QWheelEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_wheelEvent_QWheelEvent(long __this__nativeId, long arg__1);

/**
Returns the widget that is currently grabbing the keyboard input. <p>If no widget in this application is currently grabbing the keyboard, 0 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#grabMouse() grabMouse()}, and {@link com.trolltech.qt.gui.QWidget#mouseGrabber() mouseGrabber()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QWidget keyboardGrabber();

/**
Returns the widget that is currently grabbing the mouse input. <p>If no widget in this application is currently grabbing the mouse, 0 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#grabMouse() grabMouse()}, and {@link com.trolltech.qt.gui.QWidget#keyboardGrabber() keyboardGrabber()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.gui.QWidget mouseGrabber();

/**
Puts the <tt>second</tt> widget after the <tt>first</tt> widget in the focus order. <p>Note that since the tab order of the <tt>second</tt> widget is changed, you should order a chain like this: <pre class="snippet">
        setTabOrder(a, b); // a to b
        setTabOrder(b, c); // a to b to c
        setTabOrder(c, d); // a to b to c to d
</pre> not like this: <pre class="snippet">
        // WRONG
        setTabOrder(c, d); // c to d
        setTabOrder(a, b); // a to b AND c to d
        setTabOrder(b, c); // a to b to c, but not c to d
</pre> If <tt>first</tt> or <tt>second</tt> has a focus proxy, {@link com.trolltech.qt.gui.QWidget#setTabOrder(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QWidget) setTabOrder()} correctly substitutes the proxy. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidget#setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy) setFocusPolicy()}, {@link com.trolltech.qt.gui.QWidget#setFocusProxy(com.trolltech.qt.gui.QWidget) setFocusProxy()}, and {@link <a href="../focus.html">Keyboard Focus</a>}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public static void setTabOrder(com.trolltech.qt.gui.QWidget arg__1, com.trolltech.qt.gui.QWidget arg__2)    {
        __qt_setTabOrder_QWidget_QWidget(arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @SuppressWarnings("unchecked")
    native static void __qt_setTabOrder_QWidget_QWidget(long arg__1, long arg__2);

/**
@exclude
*/

    public static native QWidget fromNativePointer(QNativePointer nativePointer);

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

    protected QWidget(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QPaintDevice(long ptr);

    private native static void __qt_QMessageBox_setWindowTitle(long native_id, String windowTitle);

    private native static void __qt_QMessageBox_setWindowModality(long native_id, int modality);

/**
Returns the widget's contents margins.
*/

    @QtBlockedSlot
    public final QContentsMargins getContentsMargins() {
        QNativePointer left = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer top = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer right = new QNativePointer(QNativePointer.Type.Int);
        QNativePointer bottom = new QNativePointer(QNativePointer.Type.Int);

        getContentsMargins(left, top, right, bottom);
        return new QContentsMargins(left.intValue(), top.intValue(), right.intValue(), bottom.intValue());
    }

/**
Sets the <tt>margins</tt> around the contents of the widget. The
margins are used by the layout system, and may be used by subclasses
to specify the area to draw in (e.g. excluding the frame).
<p>
Changing the margins will trigger a resizeEvent().
*/

    @QtBlockedSlot
    public final void setContentsMargins(QContentsMargins margins) {
        setContentsMargins(margins.left, margins.top, margins.right, margins.bottom);
    }

}
