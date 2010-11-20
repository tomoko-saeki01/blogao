package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QComboBox widget is a combined button and popup list. A QComboBox provides a means of presenting a list of options to the user in a way that takes up the minimum amount of screen space. <p>A combobox is a selection widget that displays the current item, and can pop up a list of selectable items. A combobox may be editable, allowing the user to modify each item in the list. <p>Comboboxes can contain pixmaps as well as strings; the {@link com.trolltech.qt.gui.QComboBox#insertItem(int, com.trolltech.qt.gui.QIcon, java.lang.String) insertItem()} and {@link com.trolltech.qt.gui.QComboBox#setItemText(int, java.lang.String) setItemText()} functions are suitably overloaded. For editable comboboxes, the function {@link com.trolltech.qt.gui.QComboBox#clearEditText() clearEditText()} is provided, to clear the displayed string without changing the combobox's contents. <p>There are two signals emitted if the current item of a combobox changes, {@link com.trolltech.qt.gui.QComboBox#currentIndexChanged currentIndexChanged() } and {@link com.trolltech.qt.gui.QComboBox#activated activated() }. {@link com.trolltech.qt.gui.QComboBox#currentIndexChanged currentIndexChanged() } is always emitted regardless if the change was done programmatically or by user interaction, while {@link com.trolltech.qt.gui.QComboBox#activated activated() } is only emitted when the change is caused by user interaction. The {@link com.trolltech.qt.gui.QComboBox#highlighted highlighted() } signal is emitted when the user highlights an item in the combobox popup list. All three signals exist in two versions, one with a QString argument and one with an <tt>int</tt> argument. If the user selectes or highlights a pixmap, only the <tt>int</tt> signals are emitted. Whenever the text of an editable combobox is changed the {@link com.trolltech.qt.gui.QComboBox#editTextChanged editTextChanged() } signal is emitted. <p>When the user enters a new string in an editable combobox, the widget may or may not insert it, and it can insert it in several locations. The default policy is is {@link com.trolltech.qt.gui.QComboBox.InsertPolicy AtBottom } but you can change this using {@link com.trolltech.qt.gui.QComboBox#setInsertPolicy(com.trolltech.qt.gui.QComboBox.InsertPolicy) setInsertPolicy()}. <p>It is possible to constrain the input to an editable combobox using {@link com.trolltech.qt.gui.QValidator QValidator}; see {@link com.trolltech.qt.gui.QComboBox#setValidator(com.trolltech.qt.gui.QValidator) setValidator()}. By default, any input is accepted. <p>A combobox can be populated using the insert functions, {@link com.trolltech.qt.gui.QComboBox#insertItem(int, com.trolltech.qt.gui.QIcon, java.lang.String) insertItem()} and {@link com.trolltech.qt.gui.QComboBox#insertItems(int, java.util.List) insertItems()} for example. Items can be changed with {@link com.trolltech.qt.gui.QComboBox#setItemText(int, java.lang.String) setItemText()}. An item can be removed with {@link com.trolltech.qt.gui.QComboBox#removeItem(int) removeItem()} and all items can be removed with {@link com.trolltech.qt.gui.QComboBox#clear() clear()}. The text of the current item is returned by {@link com.trolltech.qt.gui.QComboBox#currentText() currentText()}, and the text of a numbered item is returned with text(). The current item can be set with {@link com.trolltech.qt.gui.QComboBox#setCurrentIndex(int) setCurrentIndex()}. The number of items in the combobox is returned by {@link com.trolltech.qt.gui.QComboBox#count() count()}; the maximum number of items can be set with {@link com.trolltech.qt.gui.QComboBox#setMaxCount(int) setMaxCount()}. You can allow editing using {@link com.trolltech.qt.gui.QComboBox#setEditable(boolean) setEditable()}. For editable comboboxes you can set auto-completion using {@link com.trolltech.qt.gui.QComboBox#setCompleter(com.trolltech.qt.gui.QCompleter) setCompleter()} and whether or not the user can add duplicates is set with {@link com.trolltech.qt.gui.QComboBox#setDuplicatesEnabled(boolean) setDuplicatesEnabled()}. <p>QComboBox uses the {@link <a href="../model-view-programming.html">model/view framework</a>} for its popup list and to store its items. By default a {@link com.trolltech.qt.gui.QStandardItemModel QStandardItemModel} stores the items and a {@link com.trolltech.qt.gui.QListView QListView} subclass displays the popuplist. You can access the model and view directly (with {@link com.trolltech.qt.gui.QComboBox#model() model()} and {@link com.trolltech.qt.gui.QComboBox#view() view()}), but QComboBox also provides functions to set and get item data (e.g., {@link com.trolltech.qt.gui.QComboBox#setItemData(int, java.lang.Object) setItemData()} and {@link com.trolltech.qt.gui.QComboBox#itemText(int) itemText()}). You can also set a new model and view (with {@link com.trolltech.qt.gui.QComboBox#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()} and {@link com.trolltech.qt.gui.QComboBox#setView(com.trolltech.qt.gui.QAbstractItemView) setView()}). For the text and icon in the combobox label, the data in the model that has the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole } and {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DecorationRole } is used. <br><center><img src="../images/qstyle-comboboxes.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit QLineEdit}, {@link com.trolltech.qt.gui.QSpinBox QSpinBox}, {@link com.trolltech.qt.gui.QRadioButton QRadioButton}, {@link com.trolltech.qt.gui.QButtonGroup QButtonGroup}, and {@link <a href="../guibooks.html">GUI Design Handbook: Combo Box, Drop-Down List Box</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QComboBox extends com.trolltech.qt.gui.QWidget
{

    private Object __rcModel = null;

    private Object __rcCompleter = null;

    private Object __rcValidator = null;
/**
This enum specifies what the {@link com.trolltech.qt.gui.QComboBox QComboBox} should do when a new string is entered by the user.
*/

    public enum InsertPolicy implements com.trolltech.qt.QtEnumerator {
/**
 The string will not be inserted into the combobox.
*/

        NoInsert(0),
/**
 The string will be inserted as the first item in the combobox.
*/

        InsertAtTop(1),
/**
 The current item will be replaced by the string.
*/

        InsertAtCurrent(2),
/**
 The string will be inserted after the last item in the combobox.
*/

        InsertAtBottom(3),
/**
 The string is inserted after the current item in the combobox.
*/

        InsertAfterCurrent(4),
/**
 The string is inserted before the current item in the combobox.
*/

        InsertBeforeCurrent(5),
/**
 The string is inserted in the alphabetic order in the combobox.
*/

        InsertAlphabetically(6);

        InsertPolicy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QComboBox$InsertPolicy constant with the specified <tt>int</tt>.</brief>
*/

        public static InsertPolicy resolve(int value) {
            return (InsertPolicy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoInsert;
            case 1: return InsertAtTop;
            case 2: return InsertAtCurrent;
            case 3: return InsertAtBottom;
            case 4: return InsertAfterCurrent;
            case 5: return InsertBeforeCurrent;
            case 6: return InsertAlphabetically;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum specifies how the size hint of the {@link com.trolltech.qt.gui.QComboBox QComboBox} should adjust when new content is added or content changes.
*/

    public enum SizeAdjustPolicy implements com.trolltech.qt.QtEnumerator {
/**
 The combobox will always adjust to the contents
*/

        AdjustToContents(0),
/**
 The combobox will adjust to its contents the first time it is shown.
*/

        AdjustToContentsOnFirstShow(1),
/**
 Use {@link com.trolltech.qt.gui.QComboBox.SizeAdjustPolicy AdjustToContents } or {@link com.trolltech.qt.gui.QComboBox.SizeAdjustPolicy AdjustToContentsOnFirstShow } instead.
*/

        AdjustToMinimumContentsLength(2),
/**
 The combobox will adjust to {@link QComboBox#minimumContentsLength() minimumContentsLength} plus space for an icon. For performance reasons use this policy on large models.
*/

        AdjustToMinimumContentsLengthWithIcon(3);

        SizeAdjustPolicy(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QComboBox$SizeAdjustPolicy constant with the specified <tt>int</tt>.</brief>
*/

        public static SizeAdjustPolicy resolve(int value) {
            return (SizeAdjustPolicy) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AdjustToContents;
            case 1: return AdjustToContentsOnFirstShow;
            case 2: return AdjustToMinimumContentsLength;
            case 3: return AdjustToMinimumContentsLengthWithIcon;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: index)&gt;:<p> This signal is sent when the user chooses an item in the combobox. The item's <tt>index</tt> is passed. Note that this signal is sent even when the choice is not changed. If you need to know when the choice actually changes, use signal {@link com.trolltech.qt.gui.QComboBox#currentIndexChanged currentIndexChanged() }.
*/

    public final Signal1<java.lang.String> activated = new Signal1<java.lang.String>();

    private final void activated(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activated_String(nativeId(), arg__1);
    }
    native void __qt_activated_String(long __this__nativeId, java.lang.String arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: index)&gt;:<p> This signal is sent when the user chooses an item in the combobox. The item's <tt>index</tt> is passed. Note that this signal is sent even when the choice is not changed. If you need to know when the choice actually changes, use signal {@link com.trolltech.qt.gui.QComboBox#currentIndexChanged currentIndexChanged() }.
*/

    public final Signal1<java.lang.Integer> activatedIndex = new Signal1<java.lang.Integer>();

    private final void activatedIndex(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activatedIndex_int(nativeId(), index);
    }
    native void __qt_activatedIndex_int(long __this__nativeId, int index);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: arg__1)&gt;:<p>
*/

    public final Signal1<java.lang.String> currentStringChanged = new Signal1<java.lang.String>();

    private final void currentStringChanged(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentStringChanged_String(nativeId(), arg__1);
    }
    native void __qt_currentStringChanged_String(long __this__nativeId, java.lang.String arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: index)&gt;:<p> This signal is sent whenever the {@link QComboBox#currentIndex() currentIndex} in the combobox changes either through user interaction or programmatically. The item's <tt>index</tt> is passed or -1 if the combobox becomes empty or the {@link QComboBox#currentIndex() currentIndex} was reset.
*/

    public final Signal1<java.lang.Integer> currentIndexChanged = new Signal1<java.lang.Integer>();

    private final void currentIndexChanged(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentIndexChanged_int(nativeId(), index);
    }
    native void __qt_currentIndexChanged_int(long __this__nativeId, int index);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: text)&gt;:<p> This signal is emitted when the text in the combobox's line edit widget is changed. The new text is specified by <tt>text</tt>.
*/

    public final Signal1<java.lang.String> editTextChanged = new Signal1<java.lang.String>();

    private final void editTextChanged(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_editTextChanged_String(nativeId(), arg__1);
    }
    native void __qt_editTextChanged_String(long __this__nativeId, java.lang.String arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: index)&gt;:<p> This signal is sent when an item in the combobox popup list is highlighted by the user. The item's <tt>index</tt> is passed.
*/

    public final Signal1<java.lang.String> highlighted = new Signal1<java.lang.String>();

    private final void highlighted(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_highlighted_String(nativeId(), arg__1);
    }
    native void __qt_highlighted_String(long __this__nativeId, java.lang.String arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: index)&gt;:<p> This signal is sent when an item in the combobox popup list is highlighted by the user. The item's <tt>index</tt> is passed.
*/

    public final Signal1<java.lang.Integer> highlightedIndex = new Signal1<java.lang.Integer>();

    private final void highlightedIndex(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_highlightedIndex_int(nativeId(), index);
    }
    native void __qt_highlightedIndex_int(long __this__nativeId, int index);


/**
Constructs a combobox with the given <tt>parent</tt>, using the default model {@link com.trolltech.qt.gui.QStandardItemModel QStandardItemModel}.
*/

    public QComboBox() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a combobox with the given <tt>parent</tt>, using the default model {@link com.trolltech.qt.gui.QStandardItemModel QStandardItemModel}.
*/

    public QComboBox(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QComboBox_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QComboBox_QWidget(long parent);


/**
Adds an item to the combobox with the given <tt>icon</tt> and <tt>text</tt>, and containing the specified <tt>userData</tt> (stored in the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::UserRole }). The item is appended to the list of existing items.
*/

    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QIcon icon, java.lang.String text) {
        addItem(icon, text, (java.lang.Object)null);
    }
/**
Adds an item to the combobox with the given <tt>icon</tt> and <tt>text</tt>, and containing the specified <tt>userData</tt> (stored in the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::UserRole }). The item is appended to the list of existing items.
*/

    @QtBlockedSlot
    public final void addItem(com.trolltech.qt.gui.QIcon icon, java.lang.String text, java.lang.Object userData)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addItem_QIcon_String_Object(nativeId(), icon == null ? 0 : icon.nativeId(), text, userData);
    }
    @QtBlockedSlot
    native void __qt_addItem_QIcon_String_Object(long __this__nativeId, long icon, java.lang.String text, java.lang.Object userData);


/**
Adds an item to the combobox with the given <tt>text</tt>, and containing the specified <tt>userData</tt> (stored in the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::UserRole }). The item is appended to the list of existing items.
*/

    @QtBlockedSlot
    public final void addItem(java.lang.String text) {
        addItem(text, (java.lang.Object)null);
    }
/**
Adds an item to the combobox with the given <tt>text</tt>, and containing the specified <tt>userData</tt> (stored in the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::UserRole }). The item is appended to the list of existing items.
*/

    @QtBlockedSlot
    public final void addItem(java.lang.String text, java.lang.Object userData)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addItem_String_Object(nativeId(), text, userData);
    }
    @QtBlockedSlot
    native void __qt_addItem_String_Object(long __this__nativeId, java.lang.String text, java.lang.Object userData);

/**
Adds each of the strings in the given <tt>texts</tt> to the combobox. Each item is appended to the list of existing items in turn.
*/

    @QtBlockedSlot
    public final void addItems(java.util.List<java.lang.String> texts)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addItems_List(nativeId(), texts);
    }
    @QtBlockedSlot
    native void __qt_addItems_List(long __this__nativeId, java.util.List<java.lang.String> texts);

/**
Clears the combobox, removing all items. <p>Note: If you have set an external model on the combobox this model will still be cleared when calling this function.
*/

    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    native void __qt_clear(long __this__nativeId);

/**
Clears the contents of the line edit used for editing in the combobox.
*/

    public final void clearEditText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clearEditText(nativeId());
    }
    native void __qt_clearEditText(long __this__nativeId);

/**
Returns the completer that is used to auto complete text input for the combobox. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#setCompleter(com.trolltech.qt.gui.QCompleter) setCompleter()}, and {@link QComboBox#isEditable() editable}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QCompleter completer()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_completer(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QCompleter __qt_completer(long __this__nativeId);

/**
This property holds the number of items in the combobox. By default, for an empty combo box, this property has a value of 0.
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
This property holds the index of the current item in the combobox.  The current index can change when inserting or removing items. <p>By default, for an empty combo box or a combo box in which no current item is set, this property has a value of -1.
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
This property holds the text of the current item. By default, for an empty combo box or a combo box in which no current item is set, this property contains an empty string.
*/

    @com.trolltech.qt.QtPropertyReader(name="currentText")
    @QtBlockedSlot
    public final java.lang.String currentText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_currentText(long __this__nativeId);

/**
This property holds whether the user can enter duplicate items into the combobox. Note that it is always possible to programmatically insert duplicate items into the combobox. <p>By default, this property is false (duplicates are not allowed).
*/

    @com.trolltech.qt.QtPropertyReader(name="duplicatesEnabled")
    @QtBlockedSlot
    public final boolean duplicatesEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_duplicatesEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_duplicatesEnabled(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final int findData(java.lang.Object data, int role, com.trolltech.qt.core.Qt.MatchFlag ... flags) {
        return this.findData(data, role, new com.trolltech.qt.core.Qt.MatchFlags(flags));
    }

/**
Returns the index of the item containing the given <tt>data</tt> for the given <tt>role</tt>; otherwise returns -1. <p>The <tt>flags</tt> specify how the items in the combobox are searched.
*/

    @QtBlockedSlot
    public final int findData(java.lang.Object data, int role) {
        return findData(data, role, new com.trolltech.qt.core.Qt.MatchFlags(16));
    }

/**
Returns the index of the item containing the given <tt>data</tt> for the given <tt>role</tt>; otherwise returns -1. <p>The <tt>flags</tt> specify how the items in the combobox are searched.
*/

    @QtBlockedSlot
    public final int findData(java.lang.Object data) {
        return findData(data, (int)32, new com.trolltech.qt.core.Qt.MatchFlags(16));
    }
/**
Returns the index of the item containing the given <tt>data</tt> for the given <tt>role</tt>; otherwise returns -1. <p>The <tt>flags</tt> specify how the items in the combobox are searched.
*/

    @QtBlockedSlot
    public final int findData(java.lang.Object data, int role, com.trolltech.qt.core.Qt.MatchFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_findData_Object_int_MatchFlags(nativeId(), data, role, flags.value());
    }
    @QtBlockedSlot
    native int __qt_findData_Object_int_MatchFlags(long __this__nativeId, java.lang.Object data, int role, int flags);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final int findText(java.lang.String text, com.trolltech.qt.core.Qt.MatchFlag ... flags) {
        return this.findText(text, new com.trolltech.qt.core.Qt.MatchFlags(flags));
    }

/**
Returns the index of the item containing the given <tt>text</tt>; otherwise returns -1. <p>The <tt>flags</tt> specify how the items in the combobox are searched.
*/

    @QtBlockedSlot
    public final int findText(java.lang.String text) {
        return findText(text, new com.trolltech.qt.core.Qt.MatchFlags(16));
    }
/**
Returns the index of the item containing the given <tt>text</tt>; otherwise returns -1. <p>The <tt>flags</tt> specify how the items in the combobox are searched.
*/

    @QtBlockedSlot
    public final int findText(java.lang.String text, com.trolltech.qt.core.Qt.MatchFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_findText_String_MatchFlags(nativeId(), text, flags.value());
    }
    @QtBlockedSlot
    native int __qt_findText_String_MatchFlags(long __this__nativeId, java.lang.String text, int flags);

/**
This property holds whether the combo box draws itself with a frame. If enabled (the default) the combo box draws itself inside a frame, otherwise the combo box draws itself without any frame.
*/

    @com.trolltech.qt.QtPropertyReader(name="frame")
    @QtBlockedSlot
    public final boolean hasFrame()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasFrame(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasFrame(long __this__nativeId);

/**
This property holds the size of the icons shown in the combobox.  Unless explicitly set this returns the default value of the current style. This size is the maximum size that icons can have; icons of smaller size are not scaled up.
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
    private final void initStyleOption(com.trolltech.qt.QNativePointer option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initStyleOption_nativepointer(nativeId(), option);
    }
    @QtBlockedSlot
    native void __qt_initStyleOption_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer option);


/**
Inserts the <tt>icon</tt>, <tt>text</tt> and <tt>userData</tt> (stored in the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::UserRole }) into the combobox at the given <tt>index</tt>. <p>If the index is equal to or higher than the total number of items, the new item is appended to the list of existing items. If the index is zero or negative, the new item is prepended to the list of existing items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#insertItems(int, java.util.List) insertItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertItem(int index, com.trolltech.qt.gui.QIcon icon, java.lang.String text) {
        insertItem(index, icon, text, (java.lang.Object)null);
    }
/**
Inserts the <tt>icon</tt>, <tt>text</tt> and <tt>userData</tt> (stored in the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::UserRole }) into the combobox at the given <tt>index</tt>. <p>If the index is equal to or higher than the total number of items, the new item is appended to the list of existing items. If the index is zero or negative, the new item is prepended to the list of existing items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#insertItems(int, java.util.List) insertItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertItem(int index, com.trolltech.qt.gui.QIcon icon, java.lang.String text, java.lang.Object userData)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertItem_int_QIcon_String_Object(nativeId(), index, icon == null ? 0 : icon.nativeId(), text, userData);
    }
    @QtBlockedSlot
    native void __qt_insertItem_int_QIcon_String_Object(long __this__nativeId, int index, long icon, java.lang.String text, java.lang.Object userData);


/**
Inserts the <tt>text</tt> and <tt>userData</tt> (stored in the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::UserRole }) into the combobox at the given <tt>index</tt>. <p>If the index is equal to or higher than the total number of items, the new item is appended to the list of existing items. If the index is zero or negative, the new item is prepended to the list of existing items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#insertItems(int, java.util.List) insertItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertItem(int index, java.lang.String text) {
        insertItem(index, text, (java.lang.Object)null);
    }
/**
Inserts the <tt>text</tt> and <tt>userData</tt> (stored in the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::UserRole }) into the combobox at the given <tt>index</tt>. <p>If the index is equal to or higher than the total number of items, the new item is appended to the list of existing items. If the index is zero or negative, the new item is prepended to the list of existing items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#insertItems(int, java.util.List) insertItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertItem(int index, java.lang.String text, java.lang.Object userData)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertItem_int_String_Object(nativeId(), index, text, userData);
    }
    @QtBlockedSlot
    native void __qt_insertItem_int_String_Object(long __this__nativeId, int index, java.lang.String text, java.lang.Object userData);

/**
Inserts the strings from the <tt>list</tt> into the combobox as separate items, starting at the <tt>index</tt> specified. <p>If the index is equal to or higher than the total number of items, the new items are appended to the list of existing items. If the index is zero or negative, the new items are prepended to the list of existing items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#insertItem(int, com.trolltech.qt.gui.QIcon, java.lang.String) insertItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertItems(int index, java.util.List<java.lang.String> texts)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertItems_int_List(nativeId(), index, texts);
    }
    @QtBlockedSlot
    native void __qt_insertItems_int_List(long __this__nativeId, int index, java.util.List<java.lang.String> texts);

/**
This property holds the policy used to determine where user-inserted items should appear in the combobox. The default value is {@link com.trolltech.qt.gui.QComboBox.InsertPolicy AtBottom }, indicating that new items will appear at the bottom of the list of items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox.InsertPolicy InsertPolicy }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="insertPolicy")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QComboBox.InsertPolicy insertPolicy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QComboBox.InsertPolicy.resolve(__qt_insertPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_insertPolicy(long __this__nativeId);

/**
Inserts a separator item into the combobox at the given <tt>index</tt>. <p>If the index is equal to or higher than the total number of items, the new item is appended to the list of existing items. If the index is zero or negative, the new item is prepended to the list of existing items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#insertItem(int, com.trolltech.qt.gui.QIcon, java.lang.String) insertItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void insertSeparator(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertSeparator_int(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_insertSeparator_int(long __this__nativeId, int index);

/**
This property holds whether the combo box can be edited by the user. By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="editable")
    @QtBlockedSlot
    public final boolean isEditable()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEditable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEditable(long __this__nativeId);


/**
Returns the data for the given <tt>role</tt> in the given <tt>index</tt> in the combobox, or {@link com.trolltech.qt.QVariant.Type QVariant::Invalid } if there is no data for this role. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#setItemData(int, java.lang.Object) setItemData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object itemData(int index) {
        return itemData(index, (int)32);
    }
/**
Returns the data for the given <tt>role</tt> in the given <tt>index</tt> in the combobox, or {@link com.trolltech.qt.QVariant.Type QVariant::Invalid } if there is no data for this role. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#setItemData(int, java.lang.Object) setItemData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object itemData(int index, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemData_int_int(nativeId(), index, role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_itemData_int_int(long __this__nativeId, int index, int role);

/**
Returns the item delegate used by the popup list view. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#setItemDelegate(com.trolltech.qt.gui.QAbstractItemDelegate) setItemDelegate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemDelegate itemDelegate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemDelegate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractItemDelegate __qt_itemDelegate(long __this__nativeId);

/**
Returns the icon for the given <tt>index</tt> in the combobox. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#setItemIcon(int, com.trolltech.qt.gui.QIcon) setItemIcon()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon itemIcon(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemIcon_int(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_itemIcon_int(long __this__nativeId, int index);

/**
Returns the text for the given <tt>index</tt> in the combobox. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#setItemText(int, java.lang.String) setItemText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String itemText(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemText_int(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_itemText_int(long __this__nativeId, int index);

/**
Returns the line edit used to edit items in the combobox, or 0 if there is no line edit. <p>Only editable combo boxes have a line edit. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#setLineEdit(com.trolltech.qt.gui.QLineEdit) setLineEdit()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QLineEdit lineEdit()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineEdit(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QLineEdit __qt_lineEdit(long __this__nativeId);

/**
This property holds the maximum number of items allowed in the combobox. <b>Note:</b> If you set the maximum number to be less then the current amount of items in the combobox, the extra items will be truncated. This also applies if you have set an external model on the combobox. <p>By default, this property's value is derived from the highest signed integer available (typically 2147483647).
*/

    @com.trolltech.qt.QtPropertyReader(name="maxCount")
    @QtBlockedSlot
    public final int maxCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maxCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maxCount(long __this__nativeId);

/**
This property holds the maximum allowed size on screen of the combo box, measured in items. By default, this property has a value of 10. <p><b>Note:</b> This property is ignored for non-editable comboboxes in Mac style.
*/

    @com.trolltech.qt.QtPropertyReader(name="maxVisibleItems")
    @QtBlockedSlot
    public final int maxVisibleItems()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maxVisibleItems(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maxVisibleItems(long __this__nativeId);

/**
This property holds the minimum number of characters that should fit into the combobox.  The default value is 0. <p>If this property is set to a positive value, the minimumSizeHint() and sizeHint() take it into account. <p><DT><b>See also:</b><br><DD>{@link QComboBox#sizeAdjustPolicy() sizeAdjustPolicy}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="minimumContentsLength")
    @QtBlockedSlot
    public final int minimumContentsLength()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumContentsLength(nativeId());
    }
    @QtBlockedSlot
    native int __qt_minimumContentsLength(long __this__nativeId);

/**
Returns the model used by the combobox. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QAbstractItemModel model()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_model(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QAbstractItemModel __qt_model(long __this__nativeId);

/**
This property holds the column in the model that is visible.  If set prior to populating the combo box, the pop-up view will not be affected and will show the first column (using this property's default value). <p>By default, this property has a value of 0.
*/

    @com.trolltech.qt.QtPropertyReader(name="modelColumn")
    @QtBlockedSlot
    public final int modelColumn()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_modelColumn(nativeId());
    }
    @QtBlockedSlot
    native int __qt_modelColumn(long __this__nativeId);

/**
Removes the item at the given <tt>index</tt> from the combobox. This will update the current index if the index is removed.
*/

    @QtBlockedSlot
    public final void removeItem(int index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeItem_int(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_removeItem_int(long __this__nativeId, int index);

/**
Returns the root model item index for the items in the combobox. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#setRootModelIndex(com.trolltech.qt.core.QModelIndex) setRootModelIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex rootModelIndex()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rootModelIndex(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_rootModelIndex(long __this__nativeId);

/**
Sets the <tt>completer</tt> to use instead of the current completer. If <tt>completer</tt> is 0, auto completion is disabled. <p>By default, for an editable combo box, a {@link com.trolltech.qt.gui.QCompleter QCompleter} that performs case insensitive inline completion is automatically created. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#completer() completer()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCompleter(com.trolltech.qt.gui.QCompleter c)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcCompleter = c;
        }
        __qt_setCompleter_QCompleter(nativeId(), c == null ? 0 : c.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCompleter_QCompleter(long __this__nativeId, long c);

/**
This property holds the index of the current item in the combobox.  The current index can change when inserting or removing items. <p>By default, for an empty combo box or a combo box in which no current item is set, this property has a value of -1.
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
This property holds whether the user can enter duplicate items into the combobox. Note that it is always possible to programmatically insert duplicate items into the combobox. <p>By default, this property is false (duplicates are not allowed).
*/

    @com.trolltech.qt.QtPropertyWriter(name="duplicatesEnabled")
    @QtBlockedSlot
    public final void setDuplicatesEnabled(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDuplicatesEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setDuplicatesEnabled_boolean(long __this__nativeId, boolean enable);

/**
Sets the <tt>text</tt> in the combobox's text edit.
*/

    public final void setEditText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEditText_String(nativeId(), text);
    }
    native void __qt_setEditText_String(long __this__nativeId, java.lang.String text);

/**
This property holds whether the combo box can be edited by the user. By default, this property is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="editable")
    @QtBlockedSlot
    public final void setEditable(boolean editable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEditable_boolean(nativeId(), editable);
    }
    @QtBlockedSlot
    native void __qt_setEditable_boolean(long __this__nativeId, boolean editable);

/**
This property holds whether the combo box draws itself with a frame. If enabled (the default) the combo box draws itself inside a frame, otherwise the combo box draws itself without any frame.
*/

    @com.trolltech.qt.QtPropertyWriter(name="frame")
    @QtBlockedSlot
    public final void setFrame(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFrame_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setFrame_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds the size of the icons shown in the combobox.  Unless explicitly set this returns the default value of the current style. This size is the maximum size that icons can have; icons of smaller size are not scaled up.
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
This property holds the policy used to determine where user-inserted items should appear in the combobox. The default value is {@link com.trolltech.qt.gui.QComboBox.InsertPolicy AtBottom }, indicating that new items will appear at the bottom of the list of items. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox.InsertPolicy InsertPolicy }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="insertPolicy")
    @QtBlockedSlot
    public final void setInsertPolicy(com.trolltech.qt.gui.QComboBox.InsertPolicy policy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInsertPolicy_InsertPolicy(nativeId(), policy.value());
    }
    @QtBlockedSlot
    native void __qt_setInsertPolicy_InsertPolicy(long __this__nativeId, int policy);


/**
Sets the data <tt>role</tt> for the item on the given <tt>index</tt> in the combobox to the specified <tt>value</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#itemData(int) itemData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemData(int index, java.lang.Object value) {
        setItemData(index, value, (int)32);
    }
/**
Sets the data <tt>role</tt> for the item on the given <tt>index</tt> in the combobox to the specified <tt>value</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#itemData(int) itemData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemData(int index, java.lang.Object value, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemData_int_Object_int(nativeId(), index, value, role);
    }
    @QtBlockedSlot
    native void __qt_setItemData_int_Object_int(long __this__nativeId, int index, java.lang.Object value, int role);

/**
Sets the item <tt>delegate</tt> for the popup list view. The combobox takes ownership of the delegate. <p><b>Warning:</b> You should not share the same instance of a delegate between comboboxes, widget mappers or views. Doing so can cause incorrect or unintuitive editing behavior since each view connected to a given delegate may receive the {@link com.trolltech.qt.gui.QAbstractItemDelegate#closeEditor closeEditor() } signal, and attempt to access, modify or close an editor that has already been closed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#itemDelegate() itemDelegate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemDelegate(com.trolltech.qt.gui.QAbstractItemDelegate delegate)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (delegate != null) {
            delegate.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (delegate == null)
            throw new NullPointerException("Argument 'delegate': null not expected.");
        __qt_setItemDelegate_QAbstractItemDelegate(nativeId(), delegate == null ? 0 : delegate.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItemDelegate_QAbstractItemDelegate(long __this__nativeId, long delegate);

/**
Sets the <tt>icon</tt> for the item on the given <tt>index</tt> in the combobox. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#itemIcon(int) itemIcon()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemIcon(int index, com.trolltech.qt.gui.QIcon icon)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemIcon_int_QIcon(nativeId(), index, icon == null ? 0 : icon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItemIcon_int_QIcon(long __this__nativeId, int index, long icon);

/**
Sets the <tt>text</tt> for the item on the given <tt>index</tt> in the combobox. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#itemText(int) itemText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemText(int index, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemText_int_String(nativeId(), index, text);
    }
    @QtBlockedSlot
    native void __qt_setItemText_int_String(long __this__nativeId, int index, java.lang.String text);

/**
Sets the line <tt>edit</tt> to use instead of the current line edit widget. <p>The combo box takes ownership of the line edit. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#lineEdit() lineEdit()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setLineEdit(com.trolltech.qt.gui.QLineEdit edit)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (edit == null)
            throw new NullPointerException("Argument 'edit': null not expected.");
        __qt_setLineEdit_QLineEdit(nativeId(), edit == null ? 0 : edit.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setLineEdit_QLineEdit(long __this__nativeId, long edit);

/**
This property holds the maximum number of items allowed in the combobox. <b>Note:</b> If you set the maximum number to be less then the current amount of items in the combobox, the extra items will be truncated. This also applies if you have set an external model on the combobox. <p>By default, this property's value is derived from the highest signed integer available (typically 2147483647).
*/

    @com.trolltech.qt.QtPropertyWriter(name="maxCount")
    @QtBlockedSlot
    public final void setMaxCount(int max)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaxCount_int(nativeId(), max);
    }
    @QtBlockedSlot
    native void __qt_setMaxCount_int(long __this__nativeId, int max);

/**
This property holds the maximum allowed size on screen of the combo box, measured in items. By default, this property has a value of 10. <p><b>Note:</b> This property is ignored for non-editable comboboxes in Mac style.
*/

    @com.trolltech.qt.QtPropertyWriter(name="maxVisibleItems")
    @QtBlockedSlot
    public final void setMaxVisibleItems(int maxItems)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaxVisibleItems_int(nativeId(), maxItems);
    }
    @QtBlockedSlot
    native void __qt_setMaxVisibleItems_int(long __this__nativeId, int maxItems);

/**
This property holds the minimum number of characters that should fit into the combobox.  The default value is 0. <p>If this property is set to a positive value, the minimumSizeHint() and sizeHint() take it into account. <p><DT><b>See also:</b><br><DD>{@link QComboBox#sizeAdjustPolicy() sizeAdjustPolicy}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="minimumContentsLength")
    @QtBlockedSlot
    public final void setMinimumContentsLength(int characters)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimumContentsLength_int(nativeId(), characters);
    }
    @QtBlockedSlot
    native void __qt_setMinimumContentsLength_int(long __this__nativeId, int characters);

/**
Sets the model to be <tt>model</tt>. <tt>model</tt> must not be 0. If you want to clear the contents of a model, call {@link com.trolltech.qt.gui.QComboBox#clear() clear()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#model() model()}, and {@link com.trolltech.qt.gui.QComboBox#clear() clear()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setModel(com.trolltech.qt.core.QAbstractItemModel model)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (model == null)
            throw new NullPointerException("Argument 'model': null not expected.");
        {
            __rcModel = model;
        }
        __qt_setModel_QAbstractItemModel(nativeId(), model == null ? 0 : model.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setModel_QAbstractItemModel(long __this__nativeId, long model);

/**
This property holds the column in the model that is visible.  If set prior to populating the combo box, the pop-up view will not be affected and will show the first column (using this property's default value). <p>By default, this property has a value of 0.
*/

    @com.trolltech.qt.QtPropertyWriter(name="modelColumn")
    @QtBlockedSlot
    public final void setModelColumn(int visibleColumn)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setModelColumn_int(nativeId(), visibleColumn);
    }
    @QtBlockedSlot
    native void __qt_setModelColumn_int(long __this__nativeId, int visibleColumn);

/**
Sets the root model item <tt>index</tt> for the items in the combobox. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#rootModelIndex() rootModelIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setRootModelIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRootModelIndex_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native void __qt_setRootModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This property holds the policy describing how the size of the combobox changes when the content changes. The default value is {@link com.trolltech.qt.gui.QComboBox.SizeAdjustPolicy AdjustToContentsOnFirstShow }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox.SizeAdjustPolicy SizeAdjustPolicy }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="sizeAdjustPolicy")
    @QtBlockedSlot
    public final void setSizeAdjustPolicy(com.trolltech.qt.gui.QComboBox.SizeAdjustPolicy policy)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSizeAdjustPolicy_SizeAdjustPolicy(nativeId(), policy.value());
    }
    @QtBlockedSlot
    native void __qt_setSizeAdjustPolicy_SizeAdjustPolicy(long __this__nativeId, int policy);

/**
Sets the <tt>validator</tt> to use instead of the current validator. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#validator() validator()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setValidator(com.trolltech.qt.gui.QValidator v)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcValidator = v;
        }
        __qt_setValidator_QValidator(nativeId(), v == null ? 0 : v.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setValidator_QValidator(long __this__nativeId, long v);

/**
Sets the view to be used in the combobox popup to the given <tt>itemView</tt>. The combobox takes ownership of the view. <p>Note: If you want to use the convenience views (like {@link com.trolltech.qt.gui.QListWidget QListWidget}, {@link com.trolltech.qt.gui.QTableWidget QTableWidget} or {@link com.trolltech.qt.gui.QTreeWidget QTreeWidget}), make sure to call {@link com.trolltech.qt.gui.QComboBox#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()} on the combobox with the convenience widgets model before calling this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#view() view()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setView(com.trolltech.qt.gui.QAbstractItemView itemView)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (itemView == null)
            throw new NullPointerException("Argument 'itemView': null not expected.");
        __qt_setView_QAbstractItemView(nativeId(), itemView == null ? 0 : itemView.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setView_QAbstractItemView(long __this__nativeId, long itemView);

/**
This property holds the policy describing how the size of the combobox changes when the content changes. The default value is {@link com.trolltech.qt.gui.QComboBox.SizeAdjustPolicy AdjustToContentsOnFirstShow }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox.SizeAdjustPolicy SizeAdjustPolicy }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="sizeAdjustPolicy")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QComboBox.SizeAdjustPolicy sizeAdjustPolicy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QComboBox.SizeAdjustPolicy.resolve(__qt_sizeAdjustPolicy(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_sizeAdjustPolicy(long __this__nativeId);

/**
Returns the validator that is used to constrain text input for the combobox. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#setValidator(com.trolltech.qt.gui.QValidator) setValidator()}, and {@link QComboBox#isEditable() editable}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QValidator validator()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_validator(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QValidator __qt_validator(long __this__nativeId);

/**
Returns the list view used for the combobox popup. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#setView(com.trolltech.qt.gui.QAbstractItemView) setView()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemView view()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_view(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractItemView __qt_view(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QContextMenuEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QContextMenuEvent(long __this__nativeId, long e);

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
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void hideEvent(com.trolltech.qt.gui.QHideEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hideEvent_QHideEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_hideEvent_QHideEvent(long __this__nativeId, long e);

/**
Hides the list of items in the combobox if it is currently visible and resets the internal state, so that if the custom pop-up was shown inside the reimplemented {@link com.trolltech.qt.gui.QComboBox#showPopup() showPopup()}, then you also need to reimplement the {@link com.trolltech.qt.gui.QComboBox#hidePopup() hidePopup()} function to hide your custom pop-up and call the base class implementation to reset the internal state whenever your custom pop-up widget is hidden. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#showPopup() showPopup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void hidePopup()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_hidePopup(nativeId());
    }
    @QtBlockedSlot
    native void __qt_hidePopup(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyReleaseEvent(com.trolltech.qt.gui.QKeyEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyReleaseEvent_QKeyEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyReleaseEvent_QKeyEvent(long __this__nativeId, long e);

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
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void showEvent(com.trolltech.qt.gui.QShowEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showEvent_QShowEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_showEvent_QShowEvent(long __this__nativeId, long e);

/**
Displays the list of items in the combobox. If the list is empty then the no items will be shown. <p>If you reimplement this function to show a custom pop-up, make sure you call {@link com.trolltech.qt.gui.QComboBox#hidePopup() hidePopup()} to reset the internal state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QComboBox#hidePopup() hidePopup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void showPopup()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_showPopup(nativeId());
    }
    @QtBlockedSlot
    native void __qt_showPopup(long __this__nativeId);

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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void wheelEvent(com.trolltech.qt.gui.QWheelEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_wheelEvent_QWheelEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_wheelEvent_QWheelEvent(long __this__nativeId, long e);

/**
@exclude
*/

    public static native QComboBox fromNativePointer(QNativePointer nativePointer);

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

    protected QComboBox(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.init_style_option - START
/**
Initialize <tt>option</tt> with the values from this QComboBox. This method is
useful for subclasses when they need a QStyleOptionComboBox, but don't want to
fill in all the information themselves.
*/

    protected final void initStyleOption(QStyleOptionComboBox option) {
        initStyleOption(option.nativePointer());
    }
    // TEMPLATE - gui.init_style_option - END

}
