package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTabWidget class provides a stack of tabbed widgets. A tab widget provides a tab bar (see {@link com.trolltech.qt.gui.QTabBar QTabBar}) and a "page area" that is used to display pages related to each tab. By default, the tab bar is shown above the page area, but different configurations are available (see {@link com.trolltech.qt.gui.QTabWidget.TabPosition TabPosition }). Each tab is associated with a different widget (called a page). Only the current page is shown in the page area; all the other pages are hidden. The user can show a different page by clicking on its tab or by pressing its Alt+letter shortcut if it has one. <p>The normal way to use QTabWidget is to do the following: <ol><li> Create a QTabWidget.</li><li> Create a {@link com.trolltech.qt.gui.QWidget QWidget} for each of the pages in the tab dialog, but do not specify parent widgets for them.</li><li> Insert child widgets into the page widget, using layouts to position them as normal.</li><li> Call {@link com.trolltech.qt.gui.QTabWidget#addTab(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) addTab()} or {@link com.trolltech.qt.gui.QTabWidget#insertTab(int, com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) insertTab()} to put the page widgets into the tab widget, giving each tab a suitable label with an optional keyboard shortcut.</li></ol> The position of the tabs is defined by {@link QTabWidget#tabPosition() tabPosition}, their shape by {@link QTabWidget#tabShape() tabShape}. <p>The signal {@link com.trolltech.qt.gui.QTabWidget#currentChanged currentChanged() } is emitted when the user selects a page. <p>The current page index is available as {@link com.trolltech.qt.gui.QTabWidget#currentIndex() currentIndex()}, the current page widget with {@link com.trolltech.qt.gui.QTabWidget#currentWidget() currentWidget()}. You can retrieve a pointer to a page widget with a given index using {@link com.trolltech.qt.gui.QTabWidget#widget(int) widget()}, and can find the index position of a widget with {@link com.trolltech.qt.gui.QTabWidget#indexOf(com.trolltech.qt.gui.QWidget) indexOf()}. Use {@link com.trolltech.qt.gui.QTabWidget#setCurrentWidget(com.trolltech.qt.gui.QWidget) setCurrentWidget()} or {@link com.trolltech.qt.gui.QTabWidget#setCurrentIndex(int) setCurrentIndex()} to show a particular page. <p>You can change a tab's text and icon using {@link com.trolltech.qt.gui.QTabWidget#setTabText(int, java.lang.String) setTabText()} or {@link com.trolltech.qt.gui.QTabWidget#setTabIcon(int, com.trolltech.qt.gui.QIcon) setTabIcon()}. A tab and its associated page can be removed with {@link com.trolltech.qt.gui.QTabWidget#removeTab(int) removeTab()}. <p>Each tab is either enabled or disabled at any given time (see {@link com.trolltech.qt.gui.QTabWidget#setTabEnabled(int, boolean) setTabEnabled()}). If a tab is enabled, the tab text is drawn normally and the user can select that tab. If it is disabled, the tab is drawn in a different way and the user cannot select that tab. Note that even if a tab is disabled, the page can still be visible, for example if all of the tabs happen to be disabled. <p>Tab widgets can be a very good way to split up a complex dialog. An alternative is to use a {@link com.trolltech.qt.gui.QStackedWidget QStackedWidget} for which you provide some means of navigating between pages, for example, a {@link com.trolltech.qt.gui.QToolBar QToolBar} or a {@link com.trolltech.qt.gui.QListWidget QListWidget}. <p>Most of the functionality in QTabWidget is provided by a {@link com.trolltech.qt.gui.QTabBar QTabBar} (at the top, providing the tabs) and a {@link com.trolltech.qt.gui.QStackedWidget QStackedWidget} (most of the area, organizing the individual pages). <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/windowsxp-tabwidget.png"></center><br></td><td>  <br><center><img src="../images/macintosh-tabwidget.png"></center><br></td><td>  <br><center><img src="../images/plastique-tabwidget.png"></center><br></td></tr><tr valign="top" class="odd"><td> A Windows XP style tab widget.</td><td> A Macintosh style tab widget.</td><td> A Plastique style tab widget.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar QTabBar}, {@link com.trolltech.qt.gui.QStackedWidget QStackedWidget}, {@link com.trolltech.qt.gui.QToolBox QToolBox}, and {@link <a href="../dialogs-tabdialog.html">Tab Dialog Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTabWidget extends com.trolltech.qt.gui.QWidget
{
/**
This enum type defines the shape of the tabs.
*/

    public enum TabShape implements com.trolltech.qt.QtEnumerator {
/**
 The tabs are drawn with a rounded look. This is the default shape.
*/

        Rounded(0),
/**
 The tabs are drawn with a triangular look.
*/

        Triangular(1);

        TabShape(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTabWidget$TabShape constant with the specified <tt>int</tt>.</brief>
*/

        public static TabShape resolve(int value) {
            return (TabShape) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Rounded;
            case 1: return Triangular;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type defines where {@link com.trolltech.qt.gui.QTabWidget QTabWidget} draws the tab row:
*/

    public enum TabPosition implements com.trolltech.qt.QtEnumerator {
/**
 The tabs are drawn above the pages.
*/

        North(0),
/**
 The tabs are drawn below the pages.
*/

        South(1),
/**
 The tabs are drawn to the left of the pages.
*/

        West(2),
/**
 The tabs are drawn to the right of the pages.
*/

        East(3);

        TabPosition(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTabWidget$TabPosition constant with the specified <tt>int</tt>.</brief>
*/

        public static TabPosition resolve(int value) {
            return (TabPosition) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return North;
            case 1: return South;
            case 2: return West;
            case 3: return East;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: index)&gt;:<p> This signal is emitted whenever the current page index changes. The parameter is the new current page <tt>index</tt> position, or -1 if there isn't a new one (for example, if there are no widgets in the QTabWidget) <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#currentWidget() currentWidget()}, and {@link QTabWidget#currentIndex() currentIndex}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> currentChanged = new Signal1<java.lang.Integer>();

    private final void currentChanged(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentChanged_int(nativeId(), index);
    }
    native void __qt_currentChanged_int(long __this__nativeId, int index);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: index)&gt;:<p> This signal is emitted when the close button on a tab is clicked. The <tt>index</tt> is the index that should be removed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#setTabsClosable(boolean) setTabsClosable()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> tabCloseRequested = new Signal1<java.lang.Integer>();

    private final void tabCloseRequested(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_tabCloseRequested_int(nativeId(), index);
    }
    native void __qt_tabCloseRequested_int(long __this__nativeId, int index);


/**
Constructs a tabbed widget with parent <tt>parent</tt>.
*/

    public QTabWidget() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a tabbed widget with parent <tt>parent</tt>.
*/

    public QTabWidget(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QTabWidget_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTabWidget_QWidget(long parent);

/**
This is an overloaded member function, provided for convenience. <p>Adds a tab with the given <tt>page</tt>, <tt>icon</tt>, and <tt>label</tt> to the tab widget, and returns the index of the tab in the tab bar. <p>This function is the same as {@link com.trolltech.qt.gui.QTabWidget#addTab(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) addTab()}, but with an additional <tt>icon</tt>.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int addTab(com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.gui.QIcon icon, java.lang.String label)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addTab_QWidget_QIcon_String(nativeId(), widget == null ? 0 : widget.nativeId(), icon == null ? 0 : icon.nativeId(), label);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_addTab_QWidget_QIcon_String(long __this__nativeId, long widget, long icon, java.lang.String label);

/**
Adds a tab with the given <tt>page</tt> and <tt>label</tt> to the tab widget, and returns the index of the tab in the tab bar. <p>If the tab's <tt>label</tt> contains an ampersand, the letter following the ampersand is used as a shortcut for the tab, e.g. if the label is "Bro&wse" then Alt+W becomes a shortcut which will move the focus to this tab. <p><b>Note:</b> If you call {@link com.trolltech.qt.gui.QTabWidget#addTab(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) addTab()} after {@link com.trolltech.qt.gui.QWidget#show() show()}, the layout system will try to adjust to the changes in its widgets hierarchy and may cause flicker. To prevent this, you can set the {@link QWidget#updatesEnabled() QWidget::updatesEnabled} property to false prior to changes; remember to set the property to true when the changes are done, making the widget receive paint events again. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#insertTab(int, com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) insertTab()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int addTab(com.trolltech.qt.gui.QWidget widget, java.lang.String arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addTab_QWidget_String(nativeId(), widget == null ? 0 : widget.nativeId(), arg__2);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_addTab_QWidget_String(long __this__nativeId, long widget, java.lang.String arg__2);

/**
Removes all the pages, but does not delete them. Calling this function is equivalent to calling {@link com.trolltech.qt.gui.QTabWidget#removeTab(int) removeTab()} until the tab widget is empty.
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
Returns the widget shown in the <tt>corner</tt> of the tab widget or 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#setCornerWidget(com.trolltech.qt.gui.QWidget) setCornerWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget cornerWidget() {
        return cornerWidget(com.trolltech.qt.core.Qt.Corner.TopRightCorner);
    }
/**
Returns the widget shown in the <tt>corner</tt> of the tab widget or 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#setCornerWidget(com.trolltech.qt.gui.QWidget) setCornerWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget cornerWidget(com.trolltech.qt.core.Qt.Corner corner)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cornerWidget_Corner(nativeId(), corner.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_cornerWidget_Corner(long __this__nativeId, int corner);

/**
This property holds the number of tabs in the tab bar. By default, this property contains a value of 0.
*/

    @com.trolltech.qt.QtPropertyReader(name="count")
    @QtBlockedSlot
    public final int count()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
This property holds the index position of the current tab page. The current index is -1 if there is no current widget. <p>By default, this property contains a value of -1 because there are initially no tabs in the widget.
*/

    @com.trolltech.qt.QtPropertyReader(name="currentIndex")
    @QtBlockedSlot
    public final int currentIndex()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentIndex(long __this__nativeId);

/**
Returns a pointer to the page currently being displayed by the tab dialog. The tab dialog does its best to make sure that this value is never 0 (but if you try hard enough, it can be). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#currentIndex() currentIndex()}, and {@link com.trolltech.qt.gui.QTabWidget#setCurrentWidget(com.trolltech.qt.gui.QWidget) setCurrentWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget currentWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_currentWidget(long __this__nativeId);

/**
This property holds Whether or not the tab widget is rendered in a mode suitable for document pages. This is the same as document mode on Mac OS X.. When this property is set the tab widget frame is not rendered. This mode is useful for showing document-type pages where the page covers most of the tab widget area. <p><DT><b>See also:</b><br><DD>{@link QTabWidget#elideMode() elideMode}, {@link QTabBar#documentMode() QTabBar::documentMode}, {@link QTabBar#usesScrollButtons() QTabBar::usesScrollButtons}, and {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_TabBar_PreferNoArrows }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="documentMode")
    @QtBlockedSlot
    public final boolean documentMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_documentMode(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_documentMode(long __this__nativeId);

/**
This property holds how to elide text in the tab bar. This property controls how items are elided when there is not enough space to show them for a given tab bar size. <p>By default the value is style dependant. <p><DT><b>See also:</b><br><DD>{@link QTabBar#elideMode() QTabBar::elideMode}, {@link QTabWidget#usesScrollButtons() usesScrollButtons}, and {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_TabBar_ElideMode }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="elideMode")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.TextElideMode elideMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.TextElideMode.resolve(__qt_elideMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_elideMode(long __this__nativeId);

/**
This property holds The size for icons in the tab bar. The default value is style-dependent. This is the maximum size that the icons will have. Icons are not scaled up if they are of smaller size. <p><DT><b>See also:</b><br><DD>{@link QTabBar#iconSize() QTabBar::iconSize}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="iconSize")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize iconSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_iconSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_iconSize(long __this__nativeId);

/**
Returns the index position of the page occupied by the widget <tt>w</tt>, or -1 if the widget cannot be found.
*/

    @QtBlockedSlot
    public final int indexOf(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOf_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native int __qt_indexOf_QWidget(long __this__nativeId, long widget);

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
This is an overloaded member function, provided for convenience. <p>Inserts a tab with the given <tt>label</tt>, <tt>page</tt>, and <tt>icon</tt> into the tab widget at the specified <tt>index</tt>, and returns the index of the inserted tab in the tab bar. <p>This function is the same as {@link com.trolltech.qt.gui.QTabWidget#insertTab(int, com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) insertTab()}, but with an additional <tt>icon</tt>.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int insertTab(int index, com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.gui.QIcon icon, java.lang.String label)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertTab_int_QWidget_QIcon_String(nativeId(), index, widget == null ? 0 : widget.nativeId(), icon == null ? 0 : icon.nativeId(), label);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_insertTab_int_QWidget_QIcon_String(long __this__nativeId, int index, long widget, long icon, java.lang.String label);

/**
Inserts a tab with the given <tt>label</tt> and <tt>page</tt> into the tab widget at the specified <tt>index</tt>, and returns the index of the inserted tab in the tab bar. <p>The label is displayed in the tab and may vary in appearance depending on the configuration of the tab widget. <p>If the tab's <tt>label</tt> contains an ampersand, the letter following the ampersand is used as a shortcut for the tab, e.g. if the label is "Bro&wse" then Alt+W becomes a shortcut which will move the focus to this tab. <p>If <tt>index</tt> is out of range, the tab is simply appended. Otherwise it is inserted at the specified position. <p>If the QTabWidget was empty before this function is called, the new page becomes the current page. Inserting a new tab at an index less than or equal to the current index will increment the current index, but keep the current page. <p><b>Note:</b> If you call {@link com.trolltech.qt.gui.QTabWidget#insertTab(int, com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) insertTab()} after {@link com.trolltech.qt.gui.QWidget#show() show()}, the layout system will try to adjust to the changes in its widgets hierarchy and may cause flicker. To prevent this, you can set the {@link QWidget#updatesEnabled() QWidget::updatesEnabled} property to false prior to changes; remember to set the property to true when the changes are done, making the widget receive paint events again. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#addTab(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) addTab()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int insertTab(int index, com.trolltech.qt.gui.QWidget widget, java.lang.String arg__3)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertTab_int_QWidget_String(nativeId(), index, widget == null ? 0 : widget.nativeId(), arg__3);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_insertTab_int_QWidget_String(long __this__nativeId, int index, long widget, java.lang.String arg__3);

/**
This property holds This property holds whether the user can move the tabs within the tabbar area.  By default, this property is false;
*/

    @com.trolltech.qt.QtPropertyReader(name="movable")
    @QtBlockedSlot
    public final boolean isMovable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isMovable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isMovable(long __this__nativeId);

/**
Returns true if the the page at position <tt>index</tt> is enabled; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#setTabEnabled(int, boolean) setTabEnabled()}, and {@link QWidget#isEnabled() QWidget::isEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isTabEnabled(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isTabEnabled_int(nativeId(), index);
    }
    @QtBlockedSlot
    native boolean __qt_isTabEnabled_int(long __this__nativeId, int index);

/**
Removes the tab at position <tt>index</tt> from this stack of widgets. The page widget itself is not deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#addTab(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) addTab()}, and {@link com.trolltech.qt.gui.QTabWidget#insertTab(int, com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) insertTab()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeTab(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeTab_int(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_removeTab_int(long __this__nativeId, int index);


/**
Sets the given <tt>widget</tt> to be shown in the specified <tt>corner</tt> of the tab widget. The geometry of the widget is determined based on the widget's sizeHint() and the {@link com.trolltech.qt.gui.QWidget#style() style()}. <p>Only the horizontal element of the <tt>corner</tt> will be used. <p>Passing 0 shows no widget in the corner. <p>Any previously set corner widget is hidden. <p>All widgets set here will be deleted by the tab widget when it is destroyed unless you separately reparent the widget after setting some other corner widget (or 0). <p>Note: Corner widgets are designed for {@link com.trolltech.qt.gui.QTabWidget.TabPosition North } and {@link com.trolltech.qt.gui.QTabWidget.TabPosition South } tab positions; other orientations are known to not work properly. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#cornerWidget() cornerWidget()}, and {@link com.trolltech.qt.gui.QTabWidget#setTabPosition(com.trolltech.qt.gui.QTabWidget.TabPosition) setTabPosition()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCornerWidget(com.trolltech.qt.gui.QWidget w) {
        setCornerWidget(w, com.trolltech.qt.core.Qt.Corner.TopRightCorner);
    }
/**
Sets the given <tt>widget</tt> to be shown in the specified <tt>corner</tt> of the tab widget. The geometry of the widget is determined based on the widget's sizeHint() and the {@link com.trolltech.qt.gui.QWidget#style() style()}. <p>Only the horizontal element of the <tt>corner</tt> will be used. <p>Passing 0 shows no widget in the corner. <p>Any previously set corner widget is hidden. <p>All widgets set here will be deleted by the tab widget when it is destroyed unless you separately reparent the widget after setting some other corner widget (or 0). <p>Note: Corner widgets are designed for {@link com.trolltech.qt.gui.QTabWidget.TabPosition North } and {@link com.trolltech.qt.gui.QTabWidget.TabPosition South } tab positions; other orientations are known to not work properly. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#cornerWidget() cornerWidget()}, and {@link com.trolltech.qt.gui.QTabWidget#setTabPosition(com.trolltech.qt.gui.QTabWidget.TabPosition) setTabPosition()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setCornerWidget(com.trolltech.qt.gui.QWidget w, com.trolltech.qt.core.Qt.Corner corner)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCornerWidget_QWidget_Corner(nativeId(), w == null ? 0 : w.nativeId(), corner.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setCornerWidget_QWidget_Corner(long __this__nativeId, long w, int corner);

/**
This property holds the index position of the current tab page. The current index is -1 if there is no current widget. <p>By default, this property contains a value of -1 because there are initially no tabs in the widget.
*/

    @com.trolltech.qt.QtPropertyWriter(name="currentIndex")
    public final void setCurrentIndex(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentIndex_int(nativeId(), index);
    }
    native void __qt_setCurrentIndex_int(long __this__nativeId, int index);

/**
Makes <tt>widget</tt> the current widget. The <tt>widget</tt> used must be a page in this tab widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#addTab(com.trolltech.qt.gui.QWidget, com.trolltech.qt.gui.QIcon, java.lang.String) addTab()}, {@link com.trolltech.qt.gui.QTabWidget#setCurrentIndex(int) setCurrentIndex()}, and {@link com.trolltech.qt.gui.QTabWidget#currentWidget() currentWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    public final void setCurrentWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    native void __qt_setCurrentWidget_QWidget(long __this__nativeId, long widget);

/**
This property holds Whether or not the tab widget is rendered in a mode suitable for document pages. This is the same as document mode on Mac OS X.. When this property is set the tab widget frame is not rendered. This mode is useful for showing document-type pages where the page covers most of the tab widget area. <p><DT><b>See also:</b><br><DD>{@link QTabWidget#elideMode() elideMode}, {@link QTabBar#documentMode() QTabBar::documentMode}, {@link QTabBar#usesScrollButtons() QTabBar::usesScrollButtons}, and {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_TabBar_PreferNoArrows }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="documentMode")
    @QtBlockedSlot
    public final void setDocumentMode(boolean set)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDocumentMode_boolean(nativeId(), set);
    }
    @QtBlockedSlot
    native void __qt_setDocumentMode_boolean(long __this__nativeId, boolean set);

/**
This property holds how to elide text in the tab bar. This property controls how items are elided when there is not enough space to show them for a given tab bar size. <p>By default the value is style dependant. <p><DT><b>See also:</b><br><DD>{@link QTabBar#elideMode() QTabBar::elideMode}, {@link QTabWidget#usesScrollButtons() usesScrollButtons}, and {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_TabBar_ElideMode }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="elideMode")
    @QtBlockedSlot
    public final void setElideMode(com.trolltech.qt.core.Qt.TextElideMode arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setElideMode_TextElideMode(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setElideMode_TextElideMode(long __this__nativeId, int arg__1);

/**
This property holds The size for icons in the tab bar. The default value is style-dependent. This is the maximum size that the icons will have. Icons are not scaled up if they are of smaller size. <p><DT><b>See also:</b><br><DD>{@link QTabBar#iconSize() QTabBar::iconSize}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="iconSize")
    @QtBlockedSlot
    public final void setIconSize(com.trolltech.qt.core.QSize size)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIconSize_QSize(nativeId(), size == null ? 0 : size.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIconSize_QSize(long __this__nativeId, long size);

/**
This property holds This property holds whether the user can move the tabs within the tabbar area.  By default, this property is false;
*/

    @com.trolltech.qt.QtPropertyWriter(name="movable")
    @QtBlockedSlot
    public final void setMovable(boolean movable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMovable_boolean(nativeId(), movable);
    }
    @QtBlockedSlot
    native void __qt_setMovable_boolean(long __this__nativeId, boolean movable);

/**
Replaces the dialog's {@link com.trolltech.qt.gui.QTabBar QTabBar} heading with the tab bar <tt>tb</tt>. Note that this must be called before any tabs have been added, or the behavior is undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#tabBar() tabBar()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    protected final void setTabBar(com.trolltech.qt.gui.QTabBar arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabBar_QTabBar(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setTabBar_QTabBar(long __this__nativeId, long arg__1);

/**
If <tt>enable</tt> is true, the page at position <tt>index</tt> is enabled; otherwise the page at position <tt>index</tt> is disabled. The page's tab is redrawn appropriately. <p>QTabWidget uses {@link QWidget#setEnabled(boolean) QWidget::setEnabled()} internally, rather than keeping a separate flag. <p>Note that even a disabled tab/page may be visible. If the page is visible already, QTabWidget will not hide it; if all the pages are disabled, QTabWidget will show one of them. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#isTabEnabled(int) isTabEnabled()}, and {@link QWidget#setEnabled(boolean) QWidget::setEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTabEnabled(int index, boolean arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabEnabled_int_boolean(nativeId(), index, arg__2);
    }
    @QtBlockedSlot
    native void __qt_setTabEnabled_int_boolean(long __this__nativeId, int index, boolean arg__2);

/**
This is an overloaded member function, provided for convenience. <p>Sets the <tt>icon</tt> for the tab at position <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#tabIcon(int) tabIcon()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTabIcon(int index, com.trolltech.qt.gui.QIcon icon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabIcon_int_QIcon(nativeId(), index, icon == null ? 0 : icon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTabIcon_int_QIcon(long __this__nativeId, int index, long icon);

/**
This property holds the position of the tabs in this tab widget. Possible values for this property are described by the {@link com.trolltech.qt.gui.QTabWidget.TabPosition TabPosition } enum. <p>By default, this property is set to {@link com.trolltech.qt.gui.QTabWidget.TabPosition North }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget.TabPosition TabPosition }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="tabPosition")
    @QtBlockedSlot
    public final void setTabPosition(com.trolltech.qt.gui.QTabWidget.TabPosition arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabPosition_TabPosition(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setTabPosition_TabPosition(long __this__nativeId, int arg__1);

/**
This property holds the shape of the tabs in this tab widget. Possible values for this property are {@link com.trolltech.qt.gui.QTabWidget.TabShape QTabWidget::Rounded } (default) or {@link com.trolltech.qt.gui.QTabWidget.TabShape QTabWidget::Triangular }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget.TabShape TabShape }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="tabShape")
    @QtBlockedSlot
    public final void setTabShape(com.trolltech.qt.gui.QTabWidget.TabShape s)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabShape_TabShape(nativeId(), s.value());
    }
    @QtBlockedSlot
    native void __qt_setTabShape_TabShape(long __this__nativeId, int s);

/**
Defines a new <tt>label</tt> for the page at position <tt>index</tt>'s tab. <p>If the provided text contains an ampersand character ('&'), a shortcut is automatically created for it. The character that follows the '&' will be used as the shortcut key. Any previous shortcut will be overwritten, or cleared if no shortcut is defined by the text. See the {@link com.trolltech.qt.gui.QShortcut QShortcut} documentation for details (to display an actual ampersand, use '&&'). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#tabText(int) tabText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTabText(int index, java.lang.String arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabText_int_String(nativeId(), index, arg__2);
    }
    @QtBlockedSlot
    native void __qt_setTabText_int_String(long __this__nativeId, int index, java.lang.String arg__2);

/**
Sets the tab tool tip for the page at position <tt>index</tt> to <tt>tip</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#tabToolTip(int) tabToolTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTabToolTip(int index, java.lang.String tip)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabToolTip_int_String(nativeId(), index, tip);
    }
    @QtBlockedSlot
    native void __qt_setTabToolTip_int_String(long __this__nativeId, int index, java.lang.String tip);

/**
Sets the What's This help text for the page at position <tt>index</tt> to <tt>text</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#tabWhatsThis(int) tabWhatsThis()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTabWhatsThis(int index, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabWhatsThis_int_String(nativeId(), index, text);
    }
    @QtBlockedSlot
    native void __qt_setTabWhatsThis_int_String(long __this__nativeId, int index, java.lang.String text);

/**
This property holds whether close buttons are automatically added to each tab.  <p><DT><b>See also:</b><br><DD>{@link QTabBar#tabsClosable() QTabBar::tabsClosable()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="tabsClosable")
    @QtBlockedSlot
    public final void setTabsClosable(boolean closeable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabsClosable_boolean(nativeId(), closeable);
    }
    @QtBlockedSlot
    native void __qt_setTabsClosable_boolean(long __this__nativeId, boolean closeable);

/**
This property holds Whether or not a tab bar should use buttons to scroll tabs when it has many tabs.  When there are too many tabs in a tab bar for its size, the tab bar can either choose to expand its size or to add buttons that allow you to scroll through the tabs. <p>By default the value is style dependant. <p><DT><b>See also:</b><br><DD>{@link QTabWidget#elideMode() elideMode}, {@link QTabBar#usesScrollButtons() QTabBar::usesScrollButtons}, and {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_TabBar_PreferNoArrows }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="usesScrollButtons")
    @QtBlockedSlot
    public final void setUsesScrollButtons(boolean useButtons)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUsesScrollButtons_boolean(nativeId(), useButtons);
    }
    @QtBlockedSlot
    native void __qt_setUsesScrollButtons_boolean(long __this__nativeId, boolean useButtons);

/**
Returns the current {@link com.trolltech.qt.gui.QTabBar QTabBar}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#setTabBar(com.trolltech.qt.gui.QTabBar) setTabBar()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QTabBar tabBar()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabBar(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTabBar __qt_tabBar(long __this__nativeId);

/**
Returns the icon for the tab on the page at position <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#setTabIcon(int, com.trolltech.qt.gui.QIcon) setTabIcon()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon tabIcon(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabIcon_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_tabIcon_int(long __this__nativeId, int index);

/**
This property holds the position of the tabs in this tab widget. Possible values for this property are described by the {@link com.trolltech.qt.gui.QTabWidget.TabPosition TabPosition } enum. <p>By default, this property is set to {@link com.trolltech.qt.gui.QTabWidget.TabPosition North }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget.TabPosition TabPosition }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="tabPosition")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTabWidget.TabPosition tabPosition()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTabWidget.TabPosition.resolve(__qt_tabPosition(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_tabPosition(long __this__nativeId);

/**
This property holds the shape of the tabs in this tab widget. Possible values for this property are {@link com.trolltech.qt.gui.QTabWidget.TabShape QTabWidget::Rounded } (default) or {@link com.trolltech.qt.gui.QTabWidget.TabShape QTabWidget::Triangular }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget.TabShape TabShape }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="tabShape")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTabWidget.TabShape tabShape()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTabWidget.TabShape.resolve(__qt_tabShape(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_tabShape(long __this__nativeId);

/**
Returns the label text for the tab on the page at position <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#setTabText(int, java.lang.String) setTabText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String tabText(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabText_int(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_tabText_int(long __this__nativeId, int index);

/**
Returns the tab tool tip for the page at position <tt>index</tt> or an empty string if no tool tip has been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#setTabToolTip(int, java.lang.String) setTabToolTip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String tabToolTip(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabToolTip_int(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_tabToolTip_int(long __this__nativeId, int index);

/**
Returns the What's This help text for the page at position <tt>index</tt>, or an empty string if no help text has been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#setTabWhatsThis(int, java.lang.String) setTabWhatsThis()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String tabWhatsThis(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabWhatsThis_int(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_tabWhatsThis_int(long __this__nativeId, int index);

/**
This property holds whether close buttons are automatically added to each tab.  <p><DT><b>See also:</b><br><DD>{@link QTabBar#tabsClosable() QTabBar::tabsClosable()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="tabsClosable")
    @QtBlockedSlot
    public final boolean tabsClosable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabsClosable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_tabsClosable(long __this__nativeId);

/**
This property holds Whether or not a tab bar should use buttons to scroll tabs when it has many tabs.  When there are too many tabs in a tab bar for its size, the tab bar can either choose to expand its size or to add buttons that allow you to scroll through the tabs. <p>By default the value is style dependant. <p><DT><b>See also:</b><br><DD>{@link QTabWidget#elideMode() elideMode}, {@link QTabBar#usesScrollButtons() QTabBar::usesScrollButtons}, and {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_TabBar_PreferNoArrows }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="usesScrollButtons")
    @QtBlockedSlot
    public final boolean usesScrollButtons()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_usesScrollButtons(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_usesScrollButtons(long __this__nativeId);

/**
Returns the tab page at index position <tt>index</tt> or 0 if the <tt>index</tt> is out of range.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget widget(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widget_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widget_int(long __this__nativeId, int index);

/**
This method is internal to Qt Jambi. 

	@exclude
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
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

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
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
*/

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
This virtual handler is called after a new tab was added or inserted at position <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#tabRemoved(int) tabRemoved()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void tabInserted(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_tabInserted_int(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_tabInserted_int(long __this__nativeId, int index);

/**
This virtual handler is called after a tab was removed from position <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget#tabInserted(int) tabInserted()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void tabRemoved(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_tabRemoved_int(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_tabRemoved_int(long __this__nativeId, int index);

/**
@exclude
*/

    public static native QTabWidget fromNativePointer(QNativePointer nativePointer);

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

    protected QTabWidget(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QTabWidget. This method
is useful for subclasses when they need a QStyleOptionSlider, but don't want
to fill in all the information themselves.
*/

    protected final void initStyleOption(QStyleOptionTabWidgetFrame option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
