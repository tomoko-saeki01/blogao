package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTabBar class provides a tab bar, e. . for use in tabbed dialogs. QTabBar is straightforward to use; it draws the tabs using one of the predefined {@link com.trolltech.qt.gui.QTabBar.Shape shapes }, and emits a signal when a tab is selected. It can be subclassed to tailor the look and feel. Qt also provides a ready-made {@link com.trolltech.qt.gui.QTabWidget QTabWidget}. <p>Each tab has a {@link com.trolltech.qt.gui.QTabBar#tabText(int) tabText()}, an optional {@link com.trolltech.qt.gui.QTabBar#tabIcon(int) tabIcon()}, an optional {@link com.trolltech.qt.gui.QTabBar#tabToolTip(int) tabToolTip()}, optional {@link com.trolltech.qt.gui.QTabBar#tabWhatsThis(int) tabWhatsThis()} and optional {@link com.trolltech.qt.gui.QTabBar#tabData(int) tabData()}. The tabs's attributes can be changed with {@link com.trolltech.qt.gui.QTabBar#setTabText(int, java.lang.String) setTabText()}, {@link com.trolltech.qt.gui.QTabBar#setTabIcon(int, com.trolltech.qt.gui.QIcon) setTabIcon()}, {@link com.trolltech.qt.gui.QTabBar#setTabToolTip(int, java.lang.String) setTabToolTip()}, setTabWhatsThis and {@link com.trolltech.qt.gui.QTabBar#setTabData(int, java.lang.Object) setTabData()}. Each tabs can be enabled or disabled individually with {@link com.trolltech.qt.gui.QTabBar#setTabEnabled(int, boolean) setTabEnabled()}. <p>Each tab can display text in a distinct color. The current text color for a tab can be found with the {@link com.trolltech.qt.gui.QTabBar#tabTextColor(int) tabTextColor()} function. Set the text color for a particular tab with {@link com.trolltech.qt.gui.QTabBar#setTabTextColor(int, com.trolltech.qt.gui.QColor) setTabTextColor()}. <p>Tabs are added using {@link com.trolltech.qt.gui.QTabBar#addTab(com.trolltech.qt.gui.QIcon, java.lang.String) addTab()}, or inserted at particular positions using {@link com.trolltech.qt.gui.QTabBar#insertTab(int, com.trolltech.qt.gui.QIcon, java.lang.String) insertTab()}. The total number of tabs is given by {@link com.trolltech.qt.gui.QTabBar#count() count()}. Tabs can be removed from the tab bar with {@link com.trolltech.qt.gui.QTabBar#removeTab(int) removeTab()}. Combining {@link com.trolltech.qt.gui.QTabBar#removeTab(int) removeTab()} and {@link com.trolltech.qt.gui.QTabBar#insertTab(int, com.trolltech.qt.gui.QIcon, java.lang.String) insertTab()} allows you to move tabs to different positions. <p>The {@link QTabBar#shape() shape} property defines the tabs' appearance. The choice of shape is a matter of taste, although tab dialogs (for preferences and similar) invariably use {@link com.trolltech.qt.gui.QTabBar.Shape RoundedNorth }. Tab controls in windows other than dialogs almost always use either {@link com.trolltech.qt.gui.QTabBar.Shape RoundedSouth } or {@link com.trolltech.qt.gui.QTabBar.Shape TriangularSouth }. Many spreadsheets and other tab controls in which all the pages are essentially similar use {@link com.trolltech.qt.gui.QTabBar.Shape TriangularSouth }, whereas {@link com.trolltech.qt.gui.QTabBar.Shape RoundedSouth } is used mostly when the pages are different (e.g. a multi-page tool palette). The default in QTabBar is {@link com.trolltech.qt.gui.QTabBar.Shape RoundedNorth }. <p>The most important part of QTabBar's API is the {@link com.trolltech.qt.gui.QTabBar#currentChanged currentChanged() } signal. This is emitted whenever the current tab changes (even at startup, when the current tab changes from 'none'). There is also a slot, {@link com.trolltech.qt.gui.QTabBar#setCurrentIndex(int) setCurrentIndex()}, which can be used to select a tab programmatically. The function {@link com.trolltech.qt.gui.QTabBar#currentIndex() currentIndex()} returns the index of the current tab, {@link QTabBar#count() count} holds the number of tabs. <p>QTabBar creates automatic mnemonic keys in the manner of {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton}; e.g. if a tab's label is "&Graphics", Alt+G becomes a shortcut key for switching to that tab. <p>The following virtual functions may need to be reimplemented in order to tailor the look and feel or store extra data with each tab: <ul><li> {@link com.trolltech.qt.gui.QTabBar#tabSizeHint(int) tabSizeHint()} calcuates the size of a tab.</li><li> {@link com.trolltech.qt.gui.QTabBar#tabInserted(int) tabInserted()} notifies that a new tab was added.</li><li> {@link com.trolltech.qt.gui.QTabBar#tabRemoved(int) tabRemoved()} notifies that a tab was removed.</li><li> {@link com.trolltech.qt.gui.QTabBar#tabLayoutChange() tabLayoutChange()} notifies that the tabs have been re-laid out.</li><li> {@link com.trolltech.qt.gui.QWidget#paintEvent(com.trolltech.qt.gui.QPaintEvent) paintEvent()} paints all tabs.</li></ul> For subclasses, you might also need the {@link com.trolltech.qt.gui.QTabBar#tabRect(int) tabRect()} functions which returns the visual geometry of a single tab. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/plastique-tabbar.png"></center><br></td><td> A tab bar shown in the Plastique widget style.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/plastique-tabbar-truncated.png"></center><br></td><td> A truncated tab bar shown in the Plastique widget style.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabWidget QTabWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTabBar extends com.trolltech.qt.gui.QWidget
{
    
/**
This enum type lists the behavior of {@link com.trolltech.qt.gui.QTabBar QTabBar} when a tab is removed and the tab being removed is also the current tab.
*/
@QtBlockedEnum
    public enum SelectionBehavior implements com.trolltech.qt.QtEnumerator {
/**
 Select the tab to the left of the one being removed.
*/

        SelectLeftTab(0),
/**
 Select the tab to the right of the one being removed.
*/

        SelectRightTab(1),
/**
 Select the previously selected tab.
*/

        SelectPreviousTab(2);

        SelectionBehavior(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTabBar$SelectionBehavior constant with the specified <tt>int</tt>.</brief>
*/

        public static SelectionBehavior resolve(int value) {
            return (SelectionBehavior) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SelectLeftTab;
            case 1: return SelectRightTab;
            case 2: return SelectPreviousTab;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum type lists the location of the widget on a tab.
*/
@QtBlockedEnum
    public enum ButtonPosition implements com.trolltech.qt.QtEnumerator {
/**
 Left side of the tab.
*/

        LeftSide(0),
/**
 Right side of the tab.
*/

        RightSide(1);

        ButtonPosition(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTabBar$ButtonPosition constant with the specified <tt>int</tt>.</brief>
*/

        public static ButtonPosition resolve(int value) {
            return (ButtonPosition) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return LeftSide;
            case 1: return RightSide;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum type lists the built-in shapes supported by {@link com.trolltech.qt.gui.QTabBar QTabBar}. Treat these as hints as some styles may not render some of the shapes. However, position should be honored.
*/

    public enum Shape implements com.trolltech.qt.QtEnumerator {
/**
 The normal rounded look above the pages
*/

        RoundedNorth(0),
/**
 The normal rounded look below the pages
*/

        RoundedSouth(1),
/**
 The normal rounded look on the left side of the pages
*/

        RoundedWest(2),
/**
 The normal rounded look on the right side the pages
*/

        RoundedEast(3),
/**
 Triangular tabs above the pages.
*/

        TriangularNorth(4),
/**
 Triangular tabs similar to those used in the Excel spreadsheet, for example
*/

        TriangularSouth(5),
/**
 Triangular tabs on the left of the pages.
*/

        TriangularWest(6),
/**
 Triangular tabs on the right of the pages.
*/

        TriangularEast(7);

        Shape(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTabBar$Shape constant with the specified <tt>int</tt>.</brief>
*/

        public static Shape resolve(int value) {
            return (Shape) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return RoundedNorth;
            case 1: return RoundedSouth;
            case 2: return RoundedWest;
            case 3: return RoundedEast;
            case 4: return TriangularNorth;
            case 5: return TriangularSouth;
            case 6: return TriangularWest;
            case 7: return TriangularEast;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: index)&gt;:<p> This signal is emitted when the tab bar's current tab changes. The new current has the given <tt>index</tt>, or -1 if there isn't a new one (for example, if there are no tab in the QTabBar)
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
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: index)&gt;:<p> This signal is emitted when the close button on a tab is clicked. The <tt>index</tt> is the index that should be removed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#setTabsClosable(boolean) setTabsClosable()}. <br></DD></DT>
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
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: from), java.lang.Integer(named: to)&gt;:<p> This signal is emitted when the tab has moved the tab at index position <tt>from</tt> to index position <tt>to</tt>. <p>note: {@link com.trolltech.qt.gui.QTabWidget QTabWidget} will automatically move the page when this signal is emitted from its tab bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#moveTab(int, int) moveTab()}. <br></DD></DT>
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> tabMoved = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void tabMoved(int from, int to)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_tabMoved_int_int(nativeId(), from, to);
    }
    native void __qt_tabMoved_int_int(long __this__nativeId, int from, int to);


/**
Creates a new tab bar with the given <tt>parent</tt>.
*/

    public QTabBar() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Creates a new tab bar with the given <tt>parent</tt>.
*/

    public QTabBar(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QTabBar_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTabBar_QWidget(long parent);

/**
This is an overloaded member function, provided for convenience. <p>Adds a new tab with icon <tt>icon</tt> and text <tt>text</tt>. Returns the new tab's index.
*/

    @QtBlockedSlot
    public final int addTab(com.trolltech.qt.gui.QIcon icon, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addTab_QIcon_String(nativeId(), icon == null ? 0 : icon.nativeId(), text);
    }
    @QtBlockedSlot
    native int __qt_addTab_QIcon_String(long __this__nativeId, long icon, java.lang.String text);

/**
Adds a new tab with text <tt>text</tt>. Returns the new tab's index.
*/

    @QtBlockedSlot
    public final int addTab(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addTab_String(nativeId(), text);
    }
    @QtBlockedSlot
    native int __qt_addTab_String(long __this__nativeId, java.lang.String text);

/**
This property holds the number of tabs in the tab bar.
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
This property holds the index of the tab bar's visible tab. The current index is -1 if there is no current tab.
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
This property holds Whether or not the tab bar is rendered in a mode suitable for the main window.  This property is used as a hint for styles to draw the tabs in a different way then they would normally look in a tab widget. On Mac OS X this will look similar to the tabs in Safari or Leopard's Terminal.app. <p><DT><b>See also:</b><br><DD>{@link QTabWidget#documentMode() QTabWidget::documentMode}. <br></DD></DT>
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
This property defines whether or not tab bar should draw its base.  If true then QTabBar draws a base in relation to the styles overlab. Otherwise only the tabs are drawn. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) QStyle::pixelMetric()}, {@link com.trolltech.qt.gui.QStyle.PixelMetric QStyle::PM_TabBarBaseOverlap }, and {@link com.trolltech.qt.gui.QStyleOptionTabBarBaseV2 QStyleOptionTabBarBaseV2}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="drawBase")
    @QtBlockedSlot
    public final boolean drawBase()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_drawBase(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_drawBase(long __this__nativeId);

/**
This property holds how to elide text in the tab bar. This property controls how items are elided when there is not enough space to show them for a given tab bar size. <p>By default the value is style dependent. <p><DT><b>See also:</b><br><DD>{@link QTabWidget#elideMode() QTabWidget::elideMode}, {@link QTabBar#usesScrollButtons() usesScrollButtons}, and {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_TabBar_ElideMode }. <br></DD></DT>
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
This property holds When expanding is true QTabBar will expand the tabs to use the empty space.  By default the value is true. <p><DT><b>See also:</b><br><DD>{@link QTabWidget#documentMode() QTabWidget::documentMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="expanding")
    @QtBlockedSlot
    public final boolean expanding()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_expanding(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_expanding(long __this__nativeId);

/**
This property holds The size for icons in the tab bar. The default value is style-dependent. <tt>iconSize</tt> is a maximum size; icons that are smaller are not scaled up. <p><DT><b>See also:</b><br><DD>{@link QTabWidget#iconSize() QTabWidget::iconSize}. <br></DD></DT>
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

    @QtBlockedSlot
    private final void initStyleOption(com.trolltech.qt.QNativePointer option, int tabIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer_int(nativeId(), option, tabIndex);
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer_int(long __this__nativeId, com.trolltech.qt.QNativePointer option, int tabIndex);

/**
This is an overloaded member function, provided for convenience. <p>Inserts a new tab with icon <tt>icon</tt> and text <tt>text</tt> at position <tt>index</tt>. If <tt>index</tt> is out of range, the new tab is appended. Returns the new tab's index. <p>If the QTabBar was empty before this function is called, the inserted tab becomes the current tab. <p>Inserting a new tab at an index less than or equal to the current index will increment the current index, but keep the current tab.
*/

    @QtBlockedSlot
    public final int insertTab(int index, com.trolltech.qt.gui.QIcon icon, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertTab_int_QIcon_String(nativeId(), index, icon == null ? 0 : icon.nativeId(), text);
    }
    @QtBlockedSlot
    native int __qt_insertTab_int_QIcon_String(long __this__nativeId, int index, long icon, java.lang.String text);

/**
Inserts a new tab with text <tt>text</tt> at position <tt>index</tt>. If <tt>index</tt> is out of range, the new tab is appened. Returns the new tab's index.
*/

    @QtBlockedSlot
    public final int insertTab(int index, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertTab_int_String(nativeId(), index, text);
    }
    @QtBlockedSlot
    native int __qt_insertTab_int_String(long __this__nativeId, int index, java.lang.String text);

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
Returns true if the tab at position <tt>index</tt> is enabled; otherwise returns false.
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
Moves the item at index position <tt>from</tt> to index position <tt>to</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#tabMoved tabMoved() }, and {@link com.trolltech.qt.gui.QTabBar#tabLayoutChange() tabLayoutChange()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void moveTab(int from, int to)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveTab_int_int(nativeId(), from, to);
    }
    @QtBlockedSlot
    native void __qt_moveTab_int_int(long __this__nativeId, int from, int to);

/**
Removes the tab at position <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar.SelectionBehavior SelectionBehavior }. <br></DD></DT>
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
This property holds What tab should be set as current when removeTab is called if the removed tab is also the current tab.  By default the value is {@link com.trolltech.qt.gui.QTabBar.SelectionBehavior SelectRightTab }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#removeTab(int) removeTab()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="selectionBehaviorOnRemove")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTabBar.SelectionBehavior selectionBehaviorOnRemove()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTabBar.SelectionBehavior.resolve(__qt_selectionBehaviorOnRemove(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_selectionBehaviorOnRemove(long __this__nativeId);

/**
This property holds the index of the tab bar's visible tab. The current index is -1 if there is no current tab.
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
This property holds Whether or not the tab bar is rendered in a mode suitable for the main window.  This property is used as a hint for styles to draw the tabs in a different way then they would normally look in a tab widget. On Mac OS X this will look similar to the tabs in Safari or Leopard's Terminal.app. <p><DT><b>See also:</b><br><DD>{@link QTabWidget#documentMode() QTabWidget::documentMode}. <br></DD></DT>
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
This property defines whether or not tab bar should draw its base.  If true then QTabBar draws a base in relation to the styles overlab. Otherwise only the tabs are drawn. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) QStyle::pixelMetric()}, {@link com.trolltech.qt.gui.QStyle.PixelMetric QStyle::PM_TabBarBaseOverlap }, and {@link com.trolltech.qt.gui.QStyleOptionTabBarBaseV2 QStyleOptionTabBarBaseV2}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="drawBase")
    @QtBlockedSlot
    public final void setDrawBase(boolean drawTheBase)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDrawBase_boolean(nativeId(), drawTheBase);
    }
    @QtBlockedSlot
    native void __qt_setDrawBase_boolean(long __this__nativeId, boolean drawTheBase);

/**
This property holds how to elide text in the tab bar. This property controls how items are elided when there is not enough space to show them for a given tab bar size. <p>By default the value is style dependent. <p><DT><b>See also:</b><br><DD>{@link QTabWidget#elideMode() QTabWidget::elideMode}, {@link QTabBar#usesScrollButtons() usesScrollButtons}, and {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_TabBar_ElideMode }. <br></DD></DT>
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
This property holds When expanding is true QTabBar will expand the tabs to use the empty space.  By default the value is true. <p><DT><b>See also:</b><br><DD>{@link QTabWidget#documentMode() QTabWidget::documentMode}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="expanding")
    @QtBlockedSlot
    public final void setExpanding(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExpanding_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setExpanding_boolean(long __this__nativeId, boolean enabled);

/**
This property holds The size for icons in the tab bar. The default value is style-dependent. <tt>iconSize</tt> is a maximum size; icons that are smaller are not scaled up. <p><DT><b>See also:</b><br><DD>{@link QTabWidget#iconSize() QTabWidget::iconSize}. <br></DD></DT>
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
This property holds What tab should be set as current when removeTab is called if the removed tab is also the current tab.  By default the value is {@link com.trolltech.qt.gui.QTabBar.SelectionBehavior SelectRightTab }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#removeTab(int) removeTab()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="selectionBehaviorOnRemove")
    @QtBlockedSlot
    public final void setSelectionBehaviorOnRemove(com.trolltech.qt.gui.QTabBar.SelectionBehavior behavior)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectionBehaviorOnRemove_SelectionBehavior(nativeId(), behavior.value());
    }
    @QtBlockedSlot
    native void __qt_setSelectionBehaviorOnRemove_SelectionBehavior(long __this__nativeId, int behavior);

/**
This property holds the shape of the tabs in the tab bar. Possible values for this property are described by the Shape enum.
*/

    @com.trolltech.qt.QtPropertyWriter(name="shape")
    @QtBlockedSlot
    public final void setShape(com.trolltech.qt.gui.QTabBar.Shape shape)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setShape_Shape(nativeId(), shape.value());
    }
    @QtBlockedSlot
    native void __qt_setShape_Shape(long __this__nativeId, int shape);

/**
Sets <tt>widget</tt> on the tab <tt>index</tt>. The widget is placed on the left or right hand side depending upon the <tt>position</tt>. <p>Any previously set widget in <tt>position</tt> is hidden. <p>The tab bar will take ownership of the widget and so all widgets set here will be deleted by the tab bar when it is destroyed unless you separately reparent the widget after setting some other widget (or 0). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#tabButton(int, com.trolltech.qt.gui.QTabBar.ButtonPosition) tabButton()}, and {@link com.trolltech.qt.gui.QTabBar#tabsClosable() tabsClosable()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setTabButton(int index, com.trolltech.qt.gui.QTabBar.ButtonPosition position, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabButton_int_ButtonPosition_QWidget(nativeId(), index, position.value(), widget == null ? 0 : widget.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setTabButton_int_ButtonPosition_QWidget(long __this__nativeId, int index, int position, long widget);

/**
Sets the data of the tab at position <tt>index</tt> to <tt>data</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#tabData(int) tabData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTabData(int index, java.lang.Object data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabData_int_Object(nativeId(), index, data);
    }
    @QtBlockedSlot
    native void __qt_setTabData_int_Object(long __this__nativeId, int index, java.lang.Object data);

/**
If <tt>enabled</tt> is true then the tab at position <tt>index</tt> is enabled; otherwise the item at position <tt>index</tt> is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#isTabEnabled(int) isTabEnabled()}. <br></DD></DT>
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
Sets the icon of the tab at position <tt>index</tt> to <tt>icon</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#tabIcon(int) tabIcon()}. <br></DD></DT>
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
Sets the text of the tab at position <tt>index</tt> to <tt>text</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#tabText(int) tabText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTabText(int index, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabText_int_String(nativeId(), index, text);
    }
    @QtBlockedSlot
    native void __qt_setTabText_int_String(long __this__nativeId, int index, java.lang.String text);

/**
Sets the color of the text in the tab with the given <tt>index</tt> to the specified <tt>color</tt>. <p>If an invalid color is specified, the tab will use the QTabBar foreground role instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#tabTextColor(int) tabTextColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTabTextColor(int index, com.trolltech.qt.gui.QColor color)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabTextColor_int_QColor(nativeId(), index, color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setTabTextColor_int_QColor(long __this__nativeId, int index, long color);

/**
Sets the tool tip of the tab at position <tt>index</tt> to <tt>tip</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#tabToolTip(int) tabToolTip()}. <br></DD></DT>
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
Sets the What's This help text of the tab at position <tt>index</tt> to <tt>text</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#tabWhatsThis(int) tabWhatsThis()}. <br></DD></DT>
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
This property holds Whether or not a tab bar should place close buttons on each tab. When {@link QTabBar#tabsClosable() tabsClosable} is set to true a close button will appear on the tab on either the left or right hand side depending upon the style. When the button is clicked the tab the signal tabCloseRequested will be emitted. <p>By default the value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#setTabButton(int, com.trolltech.qt.gui.QTabBar.ButtonPosition, com.trolltech.qt.gui.QWidget) setTabButton()}, and {@link com.trolltech.qt.gui.QTabBar#tabRemoved(int) tabRemoved()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="tabsClosable")
    @QtBlockedSlot
    public final void setTabsClosable(boolean closable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabsClosable_boolean(nativeId(), closable);
    }
    @QtBlockedSlot
    native void __qt_setTabsClosable_boolean(long __this__nativeId, boolean closable);

/**
This property holds Whether or not a tab bar should use buttons to scroll tabs when it has many tabs.  When there are too many tabs in a tab bar for its size, the tab bar can either choose to expand its size or to add buttons that allow you to scroll through the tabs. <p>By default the value is style dependant. <p><DT><b>See also:</b><br><DD>{@link QTabBar#elideMode() elideMode}, {@link QTabWidget#usesScrollButtons() QTabWidget::usesScrollButtons}, and {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_TabBar_PreferNoArrows }. <br></DD></DT>
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
This property holds the shape of the tabs in the tab bar. Possible values for this property are described by the Shape enum.
*/

    @com.trolltech.qt.QtPropertyReader(name="shape")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTabBar.Shape shape()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTabBar.Shape.resolve(__qt_shape(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_shape(long __this__nativeId);

/**
Returns the index of the tab that covers <tt>position</tt> or -1 if no tab covers <tt>position</tt>;
*/

    @QtBlockedSlot
    public final int tabAt(com.trolltech.qt.core.QPoint pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabAt_QPoint(nativeId(), pos == null ? 0 : pos.nativeId());
    }
    @QtBlockedSlot
    native int __qt_tabAt_QPoint(long __this__nativeId, long pos);

/**
Returns the widget set a tab <tt>index</tt> and <tt>position</tt> or 0 if one is not set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#setTabButton(int, com.trolltech.qt.gui.QTabBar.ButtonPosition, com.trolltech.qt.gui.QWidget) setTabButton()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget tabButton(int index, com.trolltech.qt.gui.QTabBar.ButtonPosition position)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabButton_int_ButtonPosition(nativeId(), index, position.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_tabButton_int_ButtonPosition(long __this__nativeId, int index, int position);

/**
Returns the datad of the tab at position <tt>index</tt>, or a null variant if <tt>index</tt> is out of range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#setTabData(int, java.lang.Object) setTabData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object tabData(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabData_int(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_tabData_int(long __this__nativeId, int index);

/**
Returns the icon of the tab at position <tt>index</tt>, or a null icon if <tt>index</tt> is out of range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#setTabIcon(int, com.trolltech.qt.gui.QIcon) setTabIcon()}. <br></DD></DT>
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
Returns the visual rectangle of the of the tab at position <tt>index</tt>, or a null rectangle if <tt>index</tt> is out of range.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRect tabRect(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabRect_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_tabRect_int(long __this__nativeId, int index);

/**
Returns the text of the tab at position <tt>index</tt>, or an empty string if <tt>index</tt> is out of range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#setTabText(int, java.lang.String) setTabText()}. <br></DD></DT>
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
Returns the text color of the tab with the given <tt>index</tt>, or a invalid color if <tt>index</tt> is out of range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#setTabTextColor(int, com.trolltech.qt.gui.QColor) setTabTextColor()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor tabTextColor(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabTextColor_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_tabTextColor_int(long __this__nativeId, int index);

/**
Returns the tool tip of the tab at position <tt>index</tt>, or an empty string if <tt>index</tt> is out of range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#setTabToolTip(int, java.lang.String) setTabToolTip()}. <br></DD></DT>
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
Returns the What's This help text of the tab at position <tt>index</tt>, or an empty string if <tt>index</tt> is out of range. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#setTabWhatsThis(int, java.lang.String) setTabWhatsThis()}. <br></DD></DT>
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
This property holds Whether or not a tab bar should place close buttons on each tab. When {@link QTabBar#tabsClosable() tabsClosable} is set to true a close button will appear on the tab on either the left or right hand side depending upon the style. When the button is clicked the tab the signal tabCloseRequested will be emitted. <p>By default the value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#setTabButton(int, com.trolltech.qt.gui.QTabBar.ButtonPosition, com.trolltech.qt.gui.QWidget) setTabButton()}, and {@link com.trolltech.qt.gui.QTabBar#tabRemoved(int) tabRemoved()}. <br></DD></DT>
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
This property holds Whether or not a tab bar should use buttons to scroll tabs when it has many tabs.  When there are too many tabs in a tab bar for its size, the tab bar can either choose to expand its size or to add buttons that allow you to scroll through the tabs. <p>By default the value is style dependant. <p><DT><b>See also:</b><br><DD>{@link QTabBar#elideMode() elideMode}, {@link QTabWidget#usesScrollButtons() QTabWidget::usesScrollButtons}, and {@link com.trolltech.qt.gui.QStyle.StyleHint QStyle::SH_TabBar_PreferNoArrows }. <br></DD></DT>
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
    protected void hideEvent(com.trolltech.qt.gui.QHideEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideEvent_QHideEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_hideEvent_QHideEvent(long __this__nativeId, long arg__1);

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
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
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
This virtual handler is called after a new tab was added or inserted at position <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#tabRemoved(int) tabRemoved()}. <br></DD></DT>
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
This virtual handler is called whenever the tab layout changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#tabRect(int) tabRect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void tabLayoutChange()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_tabLayoutChange(nativeId());
    }
    @QtBlockedSlot
    native void __qt_tabLayoutChange(long __this__nativeId);

/**
This virtual handler is called after a tab was removed from position <tt>index</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabBar#tabInserted(int) tabInserted()}. <br></DD></DT>
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
Returns the size hint for the tab at position <tt>index</tt>.
*/

    @QtBlockedSlot
    protected com.trolltech.qt.core.QSize tabSizeHint(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabSizeHint_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_tabSizeHint_int(long __this__nativeId, int index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void wheelEvent(com.trolltech.qt.gui.QWheelEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wheelEvent_QWheelEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_wheelEvent_QWheelEvent(long __this__nativeId, long event);

/**
@exclude
*/

    public static native QTabBar fromNativePointer(QNativePointer nativePointer);

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

    protected QTabBar(QPrivateConstructor p) { super(p); } 

/**
Initialize <tt>option</tt> with the values from the tab at <tt>tabIndex</tt>.
This method is useful for subclasses when they need a QStyleOptionTab or
QStyleOptionTabV2, but don't want to fill in all the information themselves.
This function will check the version of the QStyleOptionTab and fill in the
additional values for a QStyleOptionTabV2.
*/

    public final void initStyleOption(QStyleOptionTab option, int tabIndex) {
        initStyleOption(option.nativePointer(), tabIndex);
    }

}
