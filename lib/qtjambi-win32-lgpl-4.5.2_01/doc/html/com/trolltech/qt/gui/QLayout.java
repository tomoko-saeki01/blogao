package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QLayout class is the base class of geometry managers. This is an abstract base class inherited by the concrete classes {@link com.trolltech.qt.gui.QBoxLayout QBoxLayout}, {@link com.trolltech.qt.gui.QGridLayout QGridLayout}, {@link com.trolltech.qt.gui.QFormLayout QFormLayout}, and {@link com.trolltech.qt.gui.QStackedLayout QStackedLayout}. <p>For users of QLayout subclasses or of {@link com.trolltech.qt.gui.QMainWindow QMainWindow} there is seldom any need to use the basic functions provided by QLayout, such as {@link com.trolltech.qt.gui.QLayout#setSizeConstraint(com.trolltech.qt.gui.QLayout.SizeConstraint) setSizeConstraint()} or {@link com.trolltech.qt.gui.QLayout#setMenuBar(com.trolltech.qt.gui.QWidget) setMenuBar()}. See {@link <a href="../qtjambi-layout.html">Layout Classes</a>} for more information. <p>To make your own layout manager, implement the functions {@link com.trolltech.qt.gui.QLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface) addItem()}, {@link com.trolltech.qt.gui.QLayoutItem#sizeHint() sizeHint()}, {@link com.trolltech.qt.gui.QLayoutItem#setGeometry(com.trolltech.qt.core.QRect) setGeometry()}, {@link com.trolltech.qt.gui.QLayout#itemAt(int) itemAt()} and {@link com.trolltech.qt.gui.QLayout#takeAt(int) takeAt()}. You should also implement {@link com.trolltech.qt.gui.QLayout#minimumSize() minimumSize()} to ensure your layout isn't resized to zero size if there is too little space. To support children whose heights depend on their widths, implement {@link com.trolltech.qt.gui.QLayoutItem#hasHeightForWidth() hasHeightForWidth()} and {@link com.trolltech.qt.gui.QLayoutItem#heightForWidth(int) heightForWidth()}. See the {@link <a href="../layouts-borderlayout.html">Border Layout</a>} and {@link <a href="../layouts-flowlayout.html">Flow Layout</a>} examples for more information about implementing custom layout managers. <p>Geometry management stops when the layout manager is deleted. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem QLayoutItem}, {@link <a href="../qtjambi-layout.html">Layout Classes</a>}, {@link <a href="../layouts-basiclayouts.html">Basic Layouts Example</a>}, {@link <a href="../layouts-borderlayout.html">Border Layout Example</a>}, and {@link <a href="../layouts-flowlayout.html">Flow Layout Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QLayout extends com.trolltech.qt.core.QObject
    implements com.trolltech.qt.gui.QLayoutItemInterface
{

    private Object __rcMenuBar = null;

    private java.util.Collection<Object> __rcWidgets = new java.util.ArrayList<Object>();

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QLayout {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void addItem(com.trolltech.qt.gui.QLayoutItemInterface arg__1) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_addItem_QLayoutItem(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
        }

        @Override
        @QtBlockedSlot
        public int count() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_count(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QLayoutItemInterface itemAt(int index) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            com.trolltech.qt.gui.QLayoutItemInterface __qt_return_value = super.__qt_itemAt_int(nativeId(), index);
            if (__qt_return_value != null) {
                __qt_return_value.disableGarbageCollection();
            }
            return __qt_return_value;
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QSize sizeHint() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_sizeHint(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QLayoutItemInterface takeAt(int index) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_takeAt_int(nativeId(), index);
        }
    }
/**
The possible values are. <p><DT><b>See also:</b><br><DD>setSizeConstraint(). <br></DD></DT>
*/


    public enum SizeConstraint implements com.trolltech.qt.QtEnumerator {
/**
 The main widget's minimum size is set to {@link com.trolltech.qt.gui.QLayout#minimumSize() minimumSize()}, unless the widget already has a minimum size.
*/

        SetDefaultConstraint(0),
/**
 The widget is not constrained.
*/

        SetNoConstraint(1),
/**
 The main widget's minimum size is set to {@link com.trolltech.qt.gui.QLayout#minimumSize() minimumSize()}; it cannot be smaller.
*/

        SetMinimumSize(2),
/**
 The main widget's size is set to {@link com.trolltech.qt.gui.QLayoutItem#sizeHint() sizeHint()}; it cannot be resized at all.
*/

        SetFixedSize(3),
/**
 The main widget's maximum size is set to {@link com.trolltech.qt.gui.QLayout#maximumSize() maximumSize()}; it cannot be larger.
*/

        SetMaximumSize(4),
/**
 The main widget's minimum size is set to {@link com.trolltech.qt.gui.QLayout#minimumSize() minimumSize()} and its maximum size is set to {@link com.trolltech.qt.gui.QLayout#maximumSize() maximumSize()}.
*/

        SetMinAndMaxSize(5);

        SizeConstraint(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QLayout$SizeConstraint constant with the specified <tt>int</tt>.</brief>
*/

        public static SizeConstraint resolve(int value) {
            return (SizeConstraint) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return SetDefaultConstraint;
            case 1: return SetNoConstraint;
            case 2: return SetMinimumSize;
            case 3: return SetFixedSize;
            case 4: return SetMaximumSize;
            case 5: return SetMinAndMaxSize;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a new child QLayout. <p>This layout has to be inserted into another layout before geometry management will work.
*/

    public QLayout(){
        super((QPrivateConstructor)null);
        __qt_QLayout();
    }

    native void __qt_QLayout();

/**
Constructs a new top-level QLayout, with parent <tt>parent</tt>. <tt>parent</tt> may not be 0. <p>There can be only one top-level layout for a widget. It is returned by {@link com.trolltech.qt.gui.QWidget#layout() QWidget::layout()}.
*/

    public QLayout(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QLayout_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QLayout_QWidget(long parent);

/**
Redoes the layout for {@link com.trolltech.qt.gui.QLayout#parentWidget() parentWidget()} if necessary. <p>You should generally not need to call this because it is automatically called at the most appropriate times. It returns true if the layout was redone. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#update() update()}, and {@link com.trolltech.qt.gui.QWidget#updateGeometry() QWidget::updateGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean activate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_activate(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_activate(long __this__nativeId);

/**
This function is called from <tt>addLayout()</tt> or <tt>insertLayout()</tt> functions in subclasses to add layout <tt>l</tt> as a sub-layout. <p>The only scenario in which you need to call it directly is if you implement a custom layout that supports nested layouts. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QBoxLayout#addLayout(com.trolltech.qt.gui.QLayout) QBoxLayout::addLayout()}, {@link com.trolltech.qt.gui.QBoxLayout#insertLayout(int, com.trolltech.qt.gui.QLayout) QBoxLayout::insertLayout()}, and {@link com.trolltech.qt.gui.QGridLayout#addLayout(com.trolltech.qt.gui.QLayout, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) QGridLayout::addLayout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void addChildLayout(com.trolltech.qt.gui.QLayout l)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (l != null) {
            l.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addChildLayout_QLayout(nativeId(), l == null ? 0 : l.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addChildLayout_QLayout(long __this__nativeId, long l);

/**
This function is called from <tt>addWidget()</tt> functions in subclasses to add <tt>w</tt> as a child widget. <p>If <tt>w</tt> is already in a layout, this function will give a warning and remove <tt>w</tt> from the layout. This function must therefore be called before adding <tt>w</tt> to the layout's data structure.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    protected final void addChildWidget(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (w == null)
            throw new NullPointerException("Argument 'w': null not expected.");
        if (w != null) {
            __rcWidgets.add(w);
        }
        __qt_addChildWidget_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addChildWidget_QWidget(long __this__nativeId, long w);

/**
Adds widget <tt>w</tt> to this layout in a manner specific to the layout. This function uses {@link com.trolltech.qt.gui.QLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface) addItem()}.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void addWidget(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (w == null)
            throw new NullPointerException("Argument 'w': null not expected.");
        if (w != null) {
            __rcWidgets.add(w);
        }
        __qt_addWidget_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_addWidget_QWidget(long __this__nativeId, long w);

/**
Returns the alignment of this item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment alignment()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_alignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_alignment(long __this__nativeId);

/**
Returns the rectangle that should be covered when the geometry of this layout is set to <tt>r</tt>, provided that this layout supports {@link com.trolltech.qt.gui.QLayout#setAlignment(com.trolltech.qt.core.Qt.Alignment) setAlignment()}. <p>The result is derived from {@link com.trolltech.qt.gui.QLayoutItem#sizeHint() sizeHint()} and expanding(). It is never larger than <tt>r</tt>.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QRect alignmentRect(com.trolltech.qt.core.QRect arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_alignmentRect_QRect(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_alignmentRect_QRect(long __this__nativeId, long arg__1);

/**
Returns the layout's {@link com.trolltech.qt.gui.QLayoutItem#geometry() geometry()} rectangle, but taking into account the contents margins. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#setContentsMargins(int, int, int, int) setContentsMargins()}, and {@link com.trolltech.qt.gui.QLayout#getContentsMargins() getContentsMargins()}. <br></DD></DT>
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
Returns the control type(s) for the layout item. For a {@link com.trolltech.qt.gui.QWidgetItem QWidgetItem}, the control type comes from the widget's size policy; for a {@link com.trolltech.qt.gui.QLayoutItem QLayoutItem}, the control types is derived from the layout's contents. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSizePolicy#controlType() QSizePolicy::controlType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QSizePolicy.ControlTypes controlTypes()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QSizePolicy.ControlTypes(__qt_controlTypes(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_controlTypes(long __this__nativeId);

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
Returns true if the layout is enabled; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#setEnabled(boolean) setEnabled()}. <br></DD></DT>
*/

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
Returns the menu bar set for this layout, or 0 if no menu bar is set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#setMenuBar(com.trolltech.qt.gui.QWidget) setMenuBar()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget menuBar()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_menuBar(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_menuBar(long __this__nativeId);

/**
Returns the parent widget of this layout, or 0 if this layout is not installed on any widget. <p>If the layout is a sub-layout, this function returns the parent widget of the parent layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QObject#parent() parent()}. <br></DD></DT>
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
Removes the layout item <tt>item</tt> from the layout. It is the caller's responsibility to delete the item. <p>Notice that <tt>item</tt> can be a layout (since QLayout inherits {@link com.trolltech.qt.gui.QLayoutItem QLayoutItem}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#removeWidget(com.trolltech.qt.gui.QWidget) removeWidget()}, and {@link com.trolltech.qt.gui.QLayout#addItem(com.trolltech.qt.gui.QLayoutItemInterface) addItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removeItem(com.trolltech.qt.gui.QLayoutItemInterface arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (arg__1 != null) {
            arg__1.reenableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeItem_QLayoutItem(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_removeItem_QLayoutItem(long __this__nativeId, long arg__1);

/**
Removes the widget <tt>widget</tt> from the layout. After this call, it is the caller's responsibility to give the widget a reasonable geometry or to put the widget back into a layout. <p><b>Note:</b> The ownership of <tt>widget</tt> remains the same as when it was added. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#removeItem(com.trolltech.qt.gui.QLayoutItemInterface) removeItem()}, {@link QWidget#setGeometry(com.trolltech.qt.core.QRect) QWidget::setGeometry()}, and {@link com.trolltech.qt.gui.QLayout#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeWidget(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (w == null)
            throw new NullPointerException("Argument 'w': null not expected.");
        if (w != null) {
            while (__rcWidgets.remove(w)) ;
        }
        __qt_removeWidget_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeWidget_QWidget(long __this__nativeId, long w);

/**
Sets the alignment of this item to <tt>alignment</tt>. <p><b>Note:</b> Item alignment is only supported by {@link com.trolltech.qt.gui.QLayoutItem QLayoutItem} subclasses where it would have a visual effect. Except for {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}, which provides blank space for layouts, all public Qt classes that inherit {@link com.trolltech.qt.gui.QLayoutItem QLayoutItem} support item alignment. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#alignment() alignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.Alignment alignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_Alignment(nativeId(), alignment.value());
    }
    @QtBlockedSlot
    native void __qt_setAlignment_Alignment(long __this__nativeId, int alignment);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final boolean setAlignment(com.trolltech.qt.gui.QLayout l, com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        return this.setAlignment(l, new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
This is an overloaded member function, provided for convenience. <p>Sets the alignment for the layout <tt>l</tt> to <tt>alignment</tt> and returns true if <tt>l</tt> is found in this layout (not including child layouts); otherwise returns false.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final boolean setAlignment(com.trolltech.qt.gui.QLayout l, com.trolltech.qt.core.Qt.Alignment alignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setAlignment_QLayout_Alignment(nativeId(), l == null ? 0 : l.nativeId(), alignment.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native boolean __qt_setAlignment_QLayout_Alignment(long __this__nativeId, long l, int alignment);


/**
This is an overloaded method provided for convenience.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final boolean setAlignment(com.trolltech.qt.gui.QWidget w, com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        return this.setAlignment(w, new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
Sets the alignment for widget <tt>w</tt> to <tt>alignment</tt> and returns true if <tt>w</tt> is found in this layout (not including child layouts); otherwise returns false.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final boolean setAlignment(com.trolltech.qt.gui.QWidget w, com.trolltech.qt.core.Qt.Alignment alignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setAlignment_QWidget_Alignment(nativeId(), w == null ? 0 : w.nativeId(), alignment.value());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native boolean __qt_setAlignment_QWidget_Alignment(long __this__nativeId, long w, int alignment);

/**
Sets the <tt>left</tt>, <tt>top</tt>, <tt>right</tt>, and <tt>bottom</tt> margins to use around the layout. <p>By default, QLayout uses the values provided by the style. On most platforms, the margin is 11 pixels in all directions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#getContentsMargins() getContentsMargins()}, {@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) QStyle::pixelMetric()}, {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutLeftMargin }, {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutTopMargin }, {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutRightMargin }, and {@link com.trolltech.qt.gui.QStyle.PixelMetric PM_LayoutBottomMargin }. <br></DD></DT>
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
Enables this layout if <tt>enable</tt> is true, otherwise disables it. <p>An enabled layout adjusts dynamically to changes; a disabled layout acts as if it did not exist. <p>By default all layouts are enabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#isEnabled() isEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setEnabled(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEnabled_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setEnabled_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds the width of the outside border of the layout. Use {@link com.trolltech.qt.gui.QLayout#setContentsMargins(int, int, int, int) setContentsMargins()} and {@link com.trolltech.qt.gui.QLayout#getContentsMargins() getContentsMargins()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#contentsRect() contentsRect()}, and spacing. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="margin")
    @QtBlockedSlot
    public final void setMargin(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMargin_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setMargin_int(long __this__nativeId, int arg__1);

/**
Tells the geometry manager to place the menu bar <tt>widget</tt> at the top of {@link com.trolltech.qt.gui.QLayout#parentWidget() parentWidget()}, outside QWidget::contentsMargins(). All child widgets are placed below the bottom edge of the menu bar. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#menuBar() menuBar()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMenuBar(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcMenuBar = w;
        }
        __qt_setMenuBar_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMenuBar_QWidget(long __this__nativeId, long w);

/**
This property holds the resize mode of the layout. The default mode is {@link com.trolltech.qt.gui.QLayout.SizeConstraint SetDefaultConstraint }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="sizeConstraint")
    @QtBlockedSlot
    public final void setSizeConstraint(com.trolltech.qt.gui.QLayout.SizeConstraint arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizeConstraint_SizeConstraint(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setSizeConstraint_SizeConstraint(long __this__nativeId, int arg__1);

/**
This property holds the spacing between widgets inside the layout. If no value is explicitly set, the layout's spacing is inherited from the parent layout, or from the style settings for the parent widget. <p>For {@link com.trolltech.qt.gui.QGridLayout QGridLayout} and {@link com.trolltech.qt.gui.QFormLayout QFormLayout}, it is possible to set different horizontal and vertical spacings using {@link QGridLayout#setHorizontalSpacing(int) setHorizontalSpacing()} and {@link QGridLayout#setVerticalSpacing(int) setVerticalSpacing()}. In that case, spacing() returns -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#contentsRect() contentsRect()}, {@link com.trolltech.qt.gui.QLayout#getContentsMargins() getContentsMargins()}, {@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) QStyle::layoutSpacing()}, and {@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) QStyle::pixelMetric()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWidgetSpacing(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWidgetSpacing_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setWidgetSpacing_int(long __this__nativeId, int arg__1);

/**
This property holds the resize mode of the layout. The default mode is {@link com.trolltech.qt.gui.QLayout.SizeConstraint SetDefaultConstraint }.
*/

    @com.trolltech.qt.QtPropertyReader(name="sizeConstraint")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLayout.SizeConstraint sizeConstraint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QLayout.SizeConstraint.resolve(__qt_sizeConstraint(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_sizeConstraint(long __this__nativeId);

/**
This property holds the spacing between widgets inside the layout. If no value is explicitly set, the layout's spacing is inherited from the parent layout, or from the style settings for the parent widget. <p>For {@link com.trolltech.qt.gui.QGridLayout QGridLayout} and {@link com.trolltech.qt.gui.QFormLayout QFormLayout}, it is possible to set different horizontal and vertical spacings using {@link QGridLayout#setHorizontalSpacing(int) setHorizontalSpacing()} and {@link QGridLayout#setVerticalSpacing(int) setVerticalSpacing()}. In that case, spacing() returns -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#contentsRect() contentsRect()}, {@link com.trolltech.qt.gui.QLayout#getContentsMargins() getContentsMargins()}, {@link com.trolltech.qt.gui.QStyle#layoutSpacing(com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.gui.QSizePolicy.ControlType, com.trolltech.qt.core.Qt.Orientation, com.trolltech.qt.gui.QStyleOption, com.trolltech.qt.gui.QWidget) QStyle::layoutSpacing()}, and {@link com.trolltech.qt.gui.QStyle#pixelMetric(com.trolltech.qt.gui.QStyle.PixelMetric, com.trolltech.qt.gui.QStyleOption) QStyle::pixelMetric()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int widgetSpacing()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widgetSpacing(nativeId());
    }
    @QtBlockedSlot
    native int __qt_widgetSpacing(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int totalHeightForWidth(int w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_totalHeightForWidth_int(nativeId(), w);
    }
    @QtBlockedSlot
    native int __qt_totalHeightForWidth_int(long __this__nativeId, int w);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize totalMaximumSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_totalMaximumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_totalMaximumSize(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize totalMinimumSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_totalMinimumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_totalMinimumSize(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize totalSizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_totalSizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_totalSizeHint(long __this__nativeId);

/**
Updates the layout for {@link com.trolltech.qt.gui.QLayout#parentWidget() parentWidget()}. <p>You should generally not need to call this because it is automatically called at the most appropriate times. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#activate() activate()}, and {@link com.trolltech.qt.gui.QLayoutItem#invalidate() invalidate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void update()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_update(nativeId());
    }
    @QtBlockedSlot
    native void __qt_update(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void widgetEvent(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_widgetEvent_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_widgetEvent_QEvent(long __this__nativeId, long arg__1);

/**
Implemented in subclasses to add an <tt>item</tt>. How it is added is specific to each subclass. <p>This function is not usually called in application code. To add a widget to a layout, use the {@link com.trolltech.qt.gui.QLayout#addWidget(com.trolltech.qt.gui.QWidget) addWidget()} function; to add a child layout, use the addLayout() function provided by the relevant QLayout subclass. <p><b>Note:</b> The ownership of <tt>item</tt> is transferred to the layout, and it's the layout's responsibility to delete it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#addWidget(com.trolltech.qt.gui.QWidget) addWidget()}, {@link com.trolltech.qt.gui.QBoxLayout#addLayout(com.trolltech.qt.gui.QLayout) QBoxLayout::addLayout()}, and {@link com.trolltech.qt.gui.QGridLayout#addLayout(com.trolltech.qt.gui.QLayout, int, int, com.trolltech.qt.core.Qt.AlignmentFlag[]) QGridLayout::addLayout()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void addItem(com.trolltech.qt.gui.QLayoutItemInterface arg__1);
    @QtBlockedSlot
    native void __qt_addItem_QLayoutItem(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void childEvent(com.trolltech.qt.core.QChildEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_childEvent_QChildEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_childEvent_QChildEvent(long __this__nativeId, long e);

/**
Must be implemented in subclasses to return the number of items in the layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#itemAt(int) itemAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract int count();
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
Returns whether this layout item can make use of more space than {@link com.trolltech.qt.gui.QLayoutItem#sizeHint() sizeHint()}. A value of {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } or {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } means that it wants to grow in only one dimension, whereas {@link com.trolltech.qt.core.Qt.Orientation Qt::Vertical } | {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal } means that it wants to grow in both dimensions.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.Qt.Orientations expandingDirections()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Orientations(__qt_expandingDirections(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_expandingDirections(long __this__nativeId);

/**
Returns the rectangle covered by this layout item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#setGeometry(com.trolltech.qt.core.QRect) setGeometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QRect geometry()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_geometry(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_geometry(long __this__nativeId);

/**
Returns true if this layout's preferred height depends on its width; otherwise returns false. The default implementation returns false. <p>Reimplement this function in layout managers that support height for width. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#heightForWidth(int) heightForWidth()}, and {@link com.trolltech.qt.gui.QWidget#heightForWidth(int) QWidget::heightForWidth()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean hasHeightForWidth()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasHeightForWidth(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasHeightForWidth(long __this__nativeId);

/**
Returns the preferred height for this layout item, given the width <tt>w</tt>. <p>The default implementation returns -1, indicating that the preferred height is independent of the width of the item. Using the function {@link com.trolltech.qt.gui.QLayoutItem#hasHeightForWidth() hasHeightForWidth()} will typically be much faster than calling this function and testing for -1. <p>Reimplement this function in layout managers that support height for width. A typical implementation will look like this: <pre class="snippet">
    public int heightForWidth(int w)
    {
        if (cache_dirty || cached_width != w) {
            int h = calculateHeightForWidth(w);
            cached_hfw = h;
            return h;
        }
        return cached_hfw;
    }
</pre> Caching is strongly recommended; without it layout will take exponential time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#hasHeightForWidth() hasHeightForWidth()}. <br></DD></DT>
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
Searches for widget <tt>widget</tt> in this layout (not including child layouts). <p>Returns the index of <tt>widget</tt>, or -1 if <tt>widget</tt> is not found. <p>The default implementation iterates over all items using {@link com.trolltech.qt.gui.QLayout#itemAt(int) itemAt()}
*/

    @QtBlockedSlot
    public int indexOf(com.trolltech.qt.gui.QWidget arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexOf_QWidget(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native int __qt_indexOf_QWidget(long __this__nativeId, long arg__1);

/**
Invalidates any cached information in this layout item.
*/

    @QtBlockedSlot
    public void invalidate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_invalidate(nativeId());
    }
    @QtBlockedSlot
    native void __qt_invalidate(long __this__nativeId);

/**
Implemented in subclasses to return whether this item is empty, i.e. whether it contains any widgets.
*/

    @QtBlockedSlot
    public boolean isEmpty()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);

/**
Must be implemented in subclasses to return the layout item at <tt>index</tt>. If there is no such item, the function must return 0. Items are numbered consecutively from 0. If an item is deleted, other items will be renumbered. <p>This function can be used to iterate over a layout. The following code will draw a rectangle for each layout item in the layout structure of the widget. <pre class="snippet">
        static void paintLayout(QPainter painter, QLayoutItemInterface item)
        {
            QLayout layout = item.layout();
            if (layout!=null) {
                for (int i = 0; i &lt; layout.count(); ++i)
                    paintLayout(painter, layout.itemAt(i));
            }
            painter.drawRect(layout.geometry());
        }

        protected void paintEvent(QPaintEvent event)
        {
            QPainter painter = new QPainter(this);
            if (layout() != null)
                paintLayout(painter, layout());
        }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#count() count()}, and {@link com.trolltech.qt.gui.QLayout#takeAt(int) takeAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QLayoutItemInterface itemAt(int index);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayoutItemInterface __qt_itemAt_int(long __this__nativeId, int index);

/**
If this item is a QLayout, it is returned as a QLayout; otherwise 0 is returned. This function provides type-safe casting.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QLayout layout()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_layout(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayout __qt_layout(long __this__nativeId);

/**
Implemented in subclasses to return the maximum size of this item.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize maximumSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_maximumSize(long __this__nativeId);

/**
Returns the minimum height this widget needs for the given width, <tt>w</tt>. The default implementation simply returns heightForWidth(<tt>w</tt>).
*/

    @QtBlockedSlot
    public int minimumHeightForWidth(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumHeightForWidth_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native int __qt_minimumHeightForWidth_int(long __this__nativeId, int arg__1);

/**
Implemented in subclasses to return the minimum size of this item.
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize minimumSize()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumSize(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_minimumSize(long __this__nativeId);

/**
Implemented in subclasses to set this item's geometry to <tt>r</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayoutItem#geometry() geometry()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setGeometry(com.trolltech.qt.core.QRect arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGeometry_QRect(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setGeometry_QRect(long __this__nativeId, long arg__1);

/**
Implemented in subclasses to return the preferred size of this item.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QSize sizeHint();
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
If this item is a {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}, it is returned as a {@link com.trolltech.qt.gui.QSpacerItem QSpacerItem}; otherwise 0 is returned. This function provides type-safe casting.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QSpacerItem spacerItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_spacerItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QSpacerItem __qt_spacerItem(long __this__nativeId);

/**
Must be implemented in subclasses to remove the layout item at <tt>index</tt> from the layout, and return the item. If there is no such item, the function must do nothing and return 0. Items are numbered consecutively from 0. If an item is deleted, other items will be renumbered. <p>The following code fragment shows a safe way to remove all items from a layout: <pre class="snippet">
        QLayoutItemInterface child = null;
        while ((child = layout.takeAt(0)) != null) {
            //...
            //delete child;
        }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLayout#itemAt(int) itemAt()}, and {@link com.trolltech.qt.gui.QLayout#count() count()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QLayoutItemInterface takeAt(int index);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLayoutItemInterface __qt_takeAt_int(long __this__nativeId, int index);

/**
If this item is a {@link com.trolltech.qt.gui.QWidget QWidget}, it is returned as a {@link com.trolltech.qt.gui.QWidget QWidget}; otherwise 0 is returned. This function provides type-safe casting.
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QWidget widget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_widget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_widget(long __this__nativeId);

/**
Returns a size that satisfies all size constraints on <tt>widget</tt>, including {@link com.trolltech.qt.gui.QLayoutItem#heightForWidth(int) heightForWidth()} and that is as close as possible to <tt>size</tt>.
*/

    public static com.trolltech.qt.core.QSize closestAcceptableSize(com.trolltech.qt.gui.QWidget w, com.trolltech.qt.core.QSize s)    {
        return __qt_closestAcceptableSize_QWidget_QSize(w == null ? 0 : w.nativeId(), s == null ? 0 : s.nativeId());
    }
    native static com.trolltech.qt.core.QSize __qt_closestAcceptableSize_QWidget_QSize(long w, long s);

/**
@exclude
*/

    public static native QLayout fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QLayout(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QLayoutItem(long ptr);

/**
Returns the contents margins of this QLayout.
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
Sets the contents margins of this QLayout to <tt>margins</tt>.
*/

    @QtBlockedSlot
    public final void setContentsMargins(QContentsMargins margins) {
        setContentsMargins(margins.left, margins.top, margins.right, margins.bottom);
    }

}
