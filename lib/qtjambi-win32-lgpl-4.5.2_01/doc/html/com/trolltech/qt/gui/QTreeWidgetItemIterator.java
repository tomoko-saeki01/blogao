package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTreeWidgetItemIterator class provides a way to iterate over the items in a {@link com.trolltech.qt.gui.QTreeWidget QTreeWidget} instance. The iterator will walk the items in a pre-order traversal order, thus visiting the parent node before it continues to the child nodes. <p>For example, the following code examples each item in a tree, checking the text in the first column against a user-specified search string: <pre class="snippet">
    QTreeWidgetItemIterator it = new QTreeWidgetItemIterator(treeWidget);
    while (it.current() != null) {
        if (it.current().text(0).equals(itemText))
            treeWidget.setItemSelected(it, true);
        it.next();
    }
</pre> It is also possible to filter out certain types of node by passing certain {@link com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlag flags } to the constructor of QTreeWidgetItemIterator. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidget QTreeWidget}, {@link <a href="../model-view-programming.html">Model/View Programming</a>}, and {@link com.trolltech.qt.gui.QTreeWidgetItem QTreeWidgetItem}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTreeWidgetItemIterator extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
These flags can be passed to a {@link com.trolltech.qt.gui.QTreeWidgetItemIterator QTreeWidgetItemIterator} constructor (OR-ed together if more than one is used), so that the iterator will only iterate over items that match the given flags.
*/

    public enum IteratorFlag implements com.trolltech.qt.QtEnumerator {
/**

*/

        All(0),
/**

*/

        Hidden(1),
/**

*/

        NotHidden(2),
/**

*/

        Selected(4),
/**

*/

        Unselected(8),
/**

*/

        Selectable(16),
/**

*/

        NotSelectable(32),
/**

*/

        DragEnabled(64),
/**

*/

        DragDisabled(128),
/**

*/

        DropEnabled(256),
/**

*/

        DropDisabled(512),
/**

*/

        HasChildren(1024),
/**

*/

        NoChildren(2048),
/**

*/

        Checked(4096),
/**

*/

        NotChecked(8192),
/**

*/

        Enabled(16384),
/**

*/

        Disabled(32768),
/**

*/

        Editable(65536),
/**

*/

        NotEditable(131072),
/**

*/

        UserFlag(16777216);

        IteratorFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QTreeWidgetItemIterator$IteratorFlags with the specified <tt>com.trolltech.qt.gui.QTreeWidgetItemIterator$IteratorFlag[]</tt> QTreeWidgetItemIterator$IteratorFlag values set.</brief>
*/

        public static IteratorFlags createQFlags(IteratorFlag ... values) {
            return new IteratorFlags(values);
        }
/**
<brief>Returns the QTreeWidgetItemIterator$IteratorFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static IteratorFlag resolve(int value) {
            return (IteratorFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return All;
            case 1: return Hidden;
            case 2: return NotHidden;
            case 4: return Selected;
            case 8: return Unselected;
            case 16: return Selectable;
            case 32: return NotSelectable;
            case 64: return DragEnabled;
            case 128: return DragDisabled;
            case 256: return DropEnabled;
            case 512: return DropDisabled;
            case 1024: return HasChildren;
            case 2048: return NoChildren;
            case 4096: return Checked;
            case 8192: return NotChecked;
            case 16384: return Enabled;
            case 32768: return Disabled;
            case 65536: return Editable;
            case 131072: return NotEditable;
            case 16777216: return UserFlag;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class IteratorFlags extends com.trolltech.qt.QFlags<IteratorFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QTreeWidgetItemIterator-IteratorFlags with the specified <tt>com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlag[]</tt>. flags set.</brief>
*/

        public IteratorFlags(IteratorFlag ... args) { super(args); }
        public IteratorFlags(int value) { setValue(value); }
    }




    public QTreeWidgetItemIterator(com.trolltech.qt.gui.QTreeWidget widget, com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlag ... flags) {
        this(widget, new com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlags(flags));
    }

/**
Constructs an iterator for the given <tt>widget</tt> that uses the specified <tt>flags</tt> to determine which items are found during iteration. The iterator is set to point to the first top-level item contained in the widget, or the next matching item if the top-level item doesn't match the flags. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlag QTreeWidgetItemIterator::IteratorFlag }. <br></DD></DT>
*/

    public QTreeWidgetItemIterator(com.trolltech.qt.gui.QTreeWidget widget) {
        this(widget, new com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlags(0));
    }
    public QTreeWidgetItemIterator(com.trolltech.qt.gui.QTreeWidget widget, com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlags flags){
        super((QPrivateConstructor)null);
        __qt_QTreeWidgetItemIterator_QTreeWidget_IteratorFlags(widget == null ? 0 : widget.nativeId(), flags.value());
    }

    native void __qt_QTreeWidgetItemIterator_QTreeWidget_IteratorFlags(long widget, int flags);


/**
This is an overloaded method provided for convenience.
*/

/**
This is an overloaded method provided for convenience.
*/

    public QTreeWidgetItemIterator(com.trolltech.qt.gui.QTreeWidgetItem item, com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlag ... flags) {
        this(item, new com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlags(flags));
    }

/**
Constructs an iterator for the given <tt>item</tt> that uses the specified <tt>flags</tt> to determine which items are found during iteration. The iterator is set to point to <tt>item</tt>, or the next matching item if <tt>item</tt> doesn't match the flags. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlag QTreeWidgetItemIterator::IteratorFlag }. <br></DD></DT>
*/

    public QTreeWidgetItemIterator(com.trolltech.qt.gui.QTreeWidgetItem item) {
        this(item, new com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlags(0));
    }
/**
Constructs an iterator for the given <tt>item</tt> that uses the specified <tt>flags</tt> to determine which items are found during iteration. The iterator is set to point to <tt>item</tt>, or the next matching item if <tt>item</tt> doesn't match the flags. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlag QTreeWidgetItemIterator::IteratorFlag }. <br></DD></DT>
*/

/**
Constructs an iterator for the given <tt>widget</tt> that uses the specified <tt>flags</tt> to determine which items are found during iteration. The iterator is set to point to the first top-level item contained in the widget, or the next matching item if the top-level item doesn't match the flags. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlag QTreeWidgetItemIterator::IteratorFlag }. <br></DD></DT>
*/

    public QTreeWidgetItemIterator(com.trolltech.qt.gui.QTreeWidgetItem item, com.trolltech.qt.gui.QTreeWidgetItemIterator.IteratorFlags flags){
        super((QPrivateConstructor)null);
        __qt_QTreeWidgetItemIterator_QTreeWidgetItem_IteratorFlags(item == null ? 0 : item.nativeId(), flags.value());
    }

    native void __qt_QTreeWidgetItemIterator_QTreeWidgetItem_IteratorFlags(long item, int flags);

/**
Constructs an iterator for the same {@link com.trolltech.qt.gui.QTreeWidget QTreeWidget} as <tt>it</tt>. The current iterator item is set to point on the current item of <tt>it</tt>.
*/

    public QTreeWidgetItemIterator(com.trolltech.qt.gui.QTreeWidgetItemIterator it){
        super((QPrivateConstructor)null);
        __qt_QTreeWidgetItemIterator_QTreeWidgetItemIterator(it == null ? 0 : it.nativeId());
    }

    native void __qt_QTreeWidgetItemIterator_QTreeWidgetItemIterator(long it);

    @QtBlockedSlot
    private final com.trolltech.qt.gui.QTreeWidgetItem operator_multiply()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_multiply(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTreeWidgetItem __qt_operator_multiply(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_increment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_increment(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_increment(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_add_assign(int n)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_add_assign_int(nativeId(), n);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_add_assign_int(long __this__nativeId, int n);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_decrement()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_decrement(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_decrement(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer operator_subtract_assign(int n)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_subtract_assign_int(nativeId(), n);
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_operator_subtract_assign_int(long __this__nativeId, int n);

/**
@exclude
*/

    public static native QTreeWidgetItemIterator fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTreeWidgetItemIterator(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTreeWidgetItemIterator array[]);

/**
This function advances the iterator by <tt>i</tt> items.
*/

    @QtBlockedSlot
    public final void next(int i) {
        operator_add_assign(i);
    }

/**
Makes the iterator go backwards by <tt>i</tt> items.
*/

    @QtBlockedSlot
    public final void previous(int i) {
        operator_subtract_assign(i);
    }

/**
Advances the iterator by one item.
*/

    @QtBlockedSlot
    public final void next() {
        operator_increment();
    }

/**
Makes the iterator go backwards by one item.
*/

    @QtBlockedSlot
    public final void previous() {
        operator_decrement();
    }

/**
Returns the current item.
*/

    @QtBlockedSlot
    public final QTreeWidgetItem current() {
        return operator_multiply();
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTreeWidgetItemIterator clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTreeWidgetItemIterator __qt_clone(long __this_nativeId);
}
