package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QCompleter class provides completions based on an item model. You can use QCompleter to provide auto completions in any Qt widget, such as {@link com.trolltech.qt.gui.QLineEdit QLineEdit} and {@link com.trolltech.qt.gui.QComboBox QComboBox}. When the user starts typing a word, QCompleter suggests possible ways of completing the word, based on a word list. The word list is provided as a {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}. (For simple applications, where the word list is static, you can pass a QStringList to QCompleter's constructor.) <ul><li> {@link <a href="#basic-usage">Basic Usage</a>}</li><li> {@link <a href="#iterating-through-completions">Iterating Through Completions</a>}</li><li> {@link <a href="#the-completion-model">The Completion Model</a>}</li><li> {@link <a href="#handling-tree-models">Handling Tree Models</a>}</li></ul><a name="basic-usage"><h2>Basic Usage</h2> A QCompleter is used typically with a {@link com.trolltech.qt.gui.QLineEdit QLineEdit} or {@link com.trolltech.qt.gui.QComboBox QComboBox}. For example, here's how to provide auto completions from a simple word list in a {@link com.trolltech.qt.gui.QLineEdit QLineEdit}: <pre class="snippet">
        List&lt;String&gt; wordList = new Vector&lt;String&gt;();
        wordList.add("alpha");
        wordList.add("omega");
        wordList.add("omicron");
        wordList.add("zeta");

        QLineEdit lineEdit = new QLineEdit();

        QCompleter completer = new QCompleter(wordList);
        completer.setCaseSensitivity(Qt.CaseSensitivity.CaseInsensitive);
        lineEdit.setCompleter(completer);
        </pre> A {@link com.trolltech.qt.gui.QDirModel QDirModel} can be used to provide auto completion of file names. For example: <pre class="snippet">
        QCompleter completer2 = new QCompleter();
        completer2.setModel(new QDirModel(completer2));
        lineEdit.setCompleter(completer2);
        </pre> To set the model on which QCompleter should operate, call {@link com.trolltech.qt.gui.QCompleter#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()}. By default, QCompleter will attempt to match the {@link QCompleter#completionPrefix() completion prefix} (i.e., the word that the user has started typing) against the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::EditRole } data stored in column 0 in the model case sensitively. This can be changed using {@link com.trolltech.qt.gui.QCompleter#setCompletionRole(int) setCompletionRole()}, {@link com.trolltech.qt.gui.QCompleter#setCompletionColumn(int) setCompletionColumn()}, and {@link com.trolltech.qt.gui.QCompleter#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}. <p>If the model is sorted on the column and role that are used for completion, you can call {@link com.trolltech.qt.gui.QCompleter#setModelSorting(com.trolltech.qt.gui.QCompleter.ModelSorting) setModelSorting()} with either {@link com.trolltech.qt.gui.QCompleter.ModelSorting QCompleter::CaseSensitivelySortedModel } or {@link com.trolltech.qt.gui.QCompleter.ModelSorting QCompleter::CaseInsensitivelySortedModel } as the argument. On large models, this can lead to significant performance improvements, because QCompleter can then use binary search instead of linear search. <p>The model can be a {@link com.trolltech.qt.core.QAbstractListModel list model}, a {@link com.trolltech.qt.gui.QAbstractTableModel table model}, or a {@link com.trolltech.qt.core.QAbstractItemModel tree model}. Completion on tree models is slightly more involved and is covered in the Handling Tree Models section below. <p>The {@link com.trolltech.qt.gui.QCompleter#completionMode() completionMode()} determines the mode used to provide completions to the user.<a name="iterating-through-completions"><h2>Iterating Through Completions</h2> To retrieve a single candidate string, call {@link com.trolltech.qt.gui.QCompleter#setCompletionPrefix(java.lang.String) setCompletionPrefix()} with the text that needs to be completed and call {@link com.trolltech.qt.gui.QCompleter#currentCompletion() currentCompletion()}. You can iterate through the list of completions as below: <pre class="snippet">
            for (int i = 0; completer.setCurrentRow(i); i++)
                System.out.println(completer.currentCompletion() + " is match number " + i);
        </pre> {@link com.trolltech.qt.gui.QCompleter#completionCount() completionCount()} returns the total number of completions for the current prefix. {@link com.trolltech.qt.gui.QCompleter#completionCount() completionCount()} should be avoided when possible, since it requires a scan of the entire model.<a name="the-completion-model"><h2>The Completion Model</h2> {@link com.trolltech.qt.gui.QCompleter#completionModel() completionModel()} return a list model that contains all possible completions for the current completion prefix, in the order in which they appear in the model. This model can be used to display the current completions in a custom view. Calling {@link com.trolltech.qt.gui.QCompleter#setCompletionPrefix(java.lang.String) setCompletionPrefix()} automatically refreshes the completion model.<a name="handling-tree-models"><h2>Handling Tree Models</h2> QCompleter can look for completions in tree models, assuming that any item (or sub-item or sub-sub-item) can be unambiguously represented as a string by specifying the path to the item. The completion is then performed one level at a time. <p>Let's take the example of a user typing in a file system path. The model is a (hierarchical) {@link com.trolltech.qt.gui.QDirModel QDirModel}. The completion occurs for every element in the path. For example, if the current text is <tt>C:\Wind</tt>, QCompleter might suggest <tt>Windows</tt> to complete the current path element. Similarly, if the current text is <tt>C:\Windows\Sy</tt>, QCompleter might suggest <tt>System</tt>. <p>For this kind of completion to work, QCompleter needs to be able to split the path into a list of strings that are matched at each level. For <tt>C:\Windows\Sy</tt>, it needs to be split as "C:", "Windows" and "Sy". The default implementation of {@link com.trolltech.qt.gui.QCompleter#splitPath(java.lang.String) splitPath()}, splits the {@link QCompleter#completionPrefix() completionPrefix} using {@link com.trolltech.qt.core.QDir#separator() QDir::separator()} if the model is a {@link com.trolltech.qt.gui.QDirModel QDirModel}. <p>To provide completions, QCompleter needs to know the path from an index. This is provided by {@link com.trolltech.qt.gui.QCompleter#pathFromIndex(com.trolltech.qt.core.QModelIndex) pathFromIndex()}. The default implementation of {@link com.trolltech.qt.gui.QCompleter#pathFromIndex(com.trolltech.qt.core.QModelIndex) pathFromIndex()}, returns the data for the {@link com.trolltech.qt.core.Qt.ItemDataRole edit role } for list models and the absolute file path if the mode is a {@link com.trolltech.qt.gui.QDirModel QDirModel}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, {@link com.trolltech.qt.gui.QComboBox QComboBox}, and {@link <a href="../tools-completer.html">Completer Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QCompleter extends com.trolltech.qt.core.QObject
{

    private Object __rcModel = null;

    private Object __rcWidget = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    
/**
This enum specifies how the items in the model are sorted. <p><DT><b>See also:</b><br><DD>setModelSorting(). <br></DD></DT>
*/
@QtBlockedEnum
    public enum ModelSorting implements com.trolltech.qt.QtEnumerator {
/**
 The model is unsorted.
*/

        UnsortedModel(0),
/**
 The model is sorted case sensitively.
*/

        CaseSensitivelySortedModel(1),
/**
 The model is sorted case insensitively.
*/

        CaseInsensitivelySortedModel(2);

        ModelSorting(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QCompleter$ModelSorting constant with the specified <tt>int</tt>.</brief>
*/

        public static ModelSorting resolve(int value) {
            return (ModelSorting) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return UnsortedModel;
            case 1: return CaseSensitivelySortedModel;
            case 2: return CaseInsensitivelySortedModel;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum specifies how completions are provided to the user. <p><DT><b>See also:</b><br><DD>setCompletionMode(). <br></DD></DT>
*/
@QtBlockedEnum
    public enum CompletionMode implements com.trolltech.qt.QtEnumerator {
/**
 Current completions are displayed in a popup window.
*/

        PopupCompletion(0),
/**
 All possible completions are displayed in a popup window with the most likely suggestion indicated as current.
*/

        UnfilteredPopupCompletion(1),
/**
 Completions appear inline (as selected text).
*/

        InlineCompletion(2);

        CompletionMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QCompleter$CompletionMode constant with the specified <tt>int</tt>.</brief>
*/

        public static CompletionMode resolve(int value) {
            return (CompletionMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return PopupCompletion;
            case 1: return UnfilteredPopupCompletion;
            case 2: return InlineCompletion;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: text)&gt;:<p> This signal is sent when an item in the {@link com.trolltech.qt.gui.QCompleter#popup() popup()} is activated by the user (by clicking or pressing return). The item's <tt>text</tt> is given.
*/

    public final Signal1<com.trolltech.qt.core.QModelIndex> activatedIndex = new Signal1<com.trolltech.qt.core.QModelIndex>();

    private final void activatedIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activatedIndex_QModelIndex(nativeId(), index);
    }
    native void __qt_activatedIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: text)&gt;:<p> This signal is sent when an item in the {@link com.trolltech.qt.gui.QCompleter#popup() popup()} is activated by the user (by clicking or pressing return). The item's <tt>text</tt> is given.
*/

    public final Signal1<java.lang.String> activated = new Signal1<java.lang.String>();

    private final void activated(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activated_String(nativeId(), text);
    }
    native void __qt_activated_String(long __this__nativeId, java.lang.String text);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QModelIndex(named: text)&gt;:<p> This signal is sent when an item in the {@link com.trolltech.qt.gui.QCompleter#popup() popup()} is highlighted by the user. It is also sent if {@link com.trolltech.qt.gui.QCompleter#complete() complete()} is called with the {@link com.trolltech.qt.gui.QCompleter#completionMode() completionMode()} set to QCOmpleter::InlineCompletion. The item's <tt>text</tt> is given.
*/

    public final Signal1<com.trolltech.qt.core.QModelIndex> highlightedIndex = new Signal1<com.trolltech.qt.core.QModelIndex>();

    private final void highlightedIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_highlightedIndex_QModelIndex(nativeId(), index);
    }
    native void __qt_highlightedIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: text)&gt;:<p> This signal is sent when an item in the {@link com.trolltech.qt.gui.QCompleter#popup() popup()} is highlighted by the user. It is also sent if {@link com.trolltech.qt.gui.QCompleter#complete() complete()} is called with the {@link com.trolltech.qt.gui.QCompleter#completionMode() completionMode()} set to QCOmpleter::InlineCompletion. The item's <tt>text</tt> is given.
*/

    public final Signal1<java.lang.String> highlighted = new Signal1<java.lang.String>();

    private final void highlighted(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_highlighted_String(nativeId(), text);
    }
    native void __qt_highlighted_String(long __this__nativeId, java.lang.String text);


/**
Constructs a completer object with the given <tt>parent</tt> that provides completions from the specified <tt>model</tt>.
*/

    public QCompleter(com.trolltech.qt.core.QAbstractItemModel model) {
        this(model, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a completer object with the given <tt>parent</tt> that provides completions from the specified <tt>model</tt>.
*/

    public QCompleter(com.trolltech.qt.core.QAbstractItemModel model, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QCompleter_QAbstractItemModel_QObject(model == null ? 0 : model.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QCompleter_QAbstractItemModel_QObject(long model, long parent);


/**
Constructs a completer object with the given <tt>parent</tt>.
*/

    public QCompleter() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a completer object with the given <tt>parent</tt>.
*/

    public QCompleter(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QCompleter_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QCompleter_QObject(long parent);


/**
Constructs a QCompleter object with the given <tt>parent</tt> that uses the specified <tt>list</tt> as a source of possible completions.
*/

    public QCompleter(java.util.List<java.lang.String> completions) {
        this(completions, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QCompleter object with the given <tt>parent</tt> that uses the specified <tt>list</tt> as a source of possible completions.
*/

    public QCompleter(java.util.List<java.lang.String> completions, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QCompleter_List_QObject(completions, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QCompleter_List_QObject(java.util.List<java.lang.String> completions, long parent);

/**
This property holds the case sensitivity of the matching. The default is {@link com.trolltech.qt.core.Qt.CaseSensitivity Qt::CaseSensitive }. <p><DT><b>See also:</b><br><DD>{@link QCompleter#completionColumn() completionColumn}, {@link QCompleter#completionRole() completionRole}, and {@link QCompleter#modelSorting() modelSorting}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="caseSensitivity")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.CaseSensitivity caseSensitivity()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.CaseSensitivity.resolve(__qt_caseSensitivity(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_caseSensitivity(long __this__nativeId);


/**
For {@link com.trolltech.qt.gui.QCompleter.CompletionMode QCompleter::PopupCompletion } and QCompletion::UnfilteredPopupCompletion modes, calling this function displays the popup displaying the current completions. By default, if <tt>rect</tt> is not specified, the popup is displayed on the bottom of the {@link com.trolltech.qt.gui.QCompleter#widget() widget()}. If <tt>rect</tt> is specified the popup is displayed on the left edge of the rectangle. <p>For {@link com.trolltech.qt.gui.QCompleter.CompletionMode QCompleter::InlineCompletion } mode, the {@link com.trolltech.qt.gui.QCompleter#highlighted highlighted() } signal is fired with the current completion.
*/

    public final void complete() {
        complete((com.trolltech.qt.core.QRect)new com.trolltech.qt.core.QRect());
    }
/**
For {@link com.trolltech.qt.gui.QCompleter.CompletionMode QCompleter::PopupCompletion } and QCompletion::UnfilteredPopupCompletion modes, calling this function displays the popup displaying the current completions. By default, if <tt>rect</tt> is not specified, the popup is displayed on the bottom of the {@link com.trolltech.qt.gui.QCompleter#widget() widget()}. If <tt>rect</tt> is specified the popup is displayed on the left edge of the rectangle. <p>For {@link com.trolltech.qt.gui.QCompleter.CompletionMode QCompleter::InlineCompletion } mode, the {@link com.trolltech.qt.gui.QCompleter#highlighted highlighted() } signal is fired with the current completion.
*/

    public final void complete(com.trolltech.qt.core.QRect rect)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_complete_QRect(nativeId(), rect == null ? 0 : rect.nativeId());
    }
    native void __qt_complete_QRect(long __this__nativeId, long rect);

/**
This property holds the column in the model in which completions are searched for.  If the {@link com.trolltech.qt.gui.QCompleter#popup() popup()} is a {@link com.trolltech.qt.gui.QListView QListView}, it is automatically setup to display this column. <p>By default, the match column is 0. <p><DT><b>See also:</b><br><DD>{@link QCompleter#completionRole() completionRole}, and {@link QCompleter#caseSensitivity() caseSensitivity}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="completionColumn")
    @QtBlockedSlot
    public final int completionColumn()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_completionColumn(nativeId());
    }
    @QtBlockedSlot
    native int __qt_completionColumn(long __this__nativeId);

/**
Returns the number of completions for the current prefix. For an unsorted model with a large number of items this can be expensive. Use {@link com.trolltech.qt.gui.QCompleter#setCurrentRow(int) setCurrentRow()} and {@link com.trolltech.qt.gui.QCompleter#currentCompletion() currentCompletion()} to iterate through all the completions.
*/

    @QtBlockedSlot
    public final int completionCount()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_completionCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_completionCount(long __this__nativeId);

/**
This property holds how the completions are provided to the user. The default value is {@link com.trolltech.qt.gui.QCompleter.CompletionMode QCompleter::PopupCompletion }.
*/

    @com.trolltech.qt.QtPropertyReader(name="completionMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QCompleter.CompletionMode completionMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QCompleter.CompletionMode.resolve(__qt_completionMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_completionMode(long __this__nativeId);

/**
Returns the completion model. The completion model is a read-only list model that contains all the possible matches for the current completion prefix. The completion model is auto-updated to reflect the current completions. <p><DT><b>See also:</b><br><DD>{@link QCompleter#completionPrefix() completionPrefix}, and {@link com.trolltech.qt.gui.QCompleter#model() model()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QAbstractItemModel completionModel()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_completionModel(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QAbstractItemModel __qt_completionModel(long __this__nativeId);

/**
This property holds the completion prefix used to provide completions.  The {@link com.trolltech.qt.gui.QCompleter#completionModel() completionModel()} is updated to reflect the list of possible matches for <tt>prefix</tt>.
*/

    @com.trolltech.qt.QtPropertyReader(name="completionPrefix")
    @QtBlockedSlot
    public final java.lang.String completionPrefix()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_completionPrefix(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_completionPrefix(long __this__nativeId);

/**
This property holds the item role to be used to query the contents of items for matching.  The default role is {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::EditRole }. <p><DT><b>See also:</b><br><DD>{@link QCompleter#completionColumn() completionColumn}, and {@link QCompleter#caseSensitivity() caseSensitivity}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="completionRole")
    @QtBlockedSlot
    public final int completionRole()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_completionRole(nativeId());
    }
    @QtBlockedSlot
    native int __qt_completionRole(long __this__nativeId);

/**
Returns the current completion string. This includes the {@link QCompleter#completionPrefix() completionPrefix}. When used alongside {@link com.trolltech.qt.gui.QCompleter#setCurrentRow(int) setCurrentRow()}, it can be used to iterate through all the matches. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#setCurrentRow(int) setCurrentRow()}, and {@link com.trolltech.qt.gui.QCompleter#currentIndex() currentIndex()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String currentCompletion()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentCompletion(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_currentCompletion(long __this__nativeId);

/**
Returns the model index of the current completion in the {@link com.trolltech.qt.gui.QCompleter#completionModel() completionModel()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#setCurrentRow(int) setCurrentRow()}, {@link com.trolltech.qt.gui.QCompleter#currentCompletion() currentCompletion()}, and {@link com.trolltech.qt.gui.QCompleter#model() model()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QModelIndex currentIndex()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentIndex(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_currentIndex(long __this__nativeId);

/**
Returns the current row. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#setCurrentRow(int) setCurrentRow()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int currentRow()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentRow(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentRow(long __this__nativeId);

/**
Returns the model that provides completion strings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()}, and {@link com.trolltech.qt.gui.QCompleter#completionModel() completionModel()}. <br></DD></DT>
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
This property holds the way the model is sorted. By default, no assumptions are made about the order of the items in the model that provides the completions. <p>If the model's data for the {@link com.trolltech.qt.gui.QCompleter#completionColumn() completionColumn()} and {@link com.trolltech.qt.gui.QCompleter#completionRole() completionRole()} is sorted in ascending order, you can set this property to {@link com.trolltech.qt.gui.QCompleter.ModelSorting CaseSensitivelySortedModel } or {@link com.trolltech.qt.gui.QCompleter.ModelSorting CaseInsensitivelySortedModel }. On large models, this can lead to significant performance improvements because the completer object can then use a binary search algorithm instead of linear search algorithm. <p>The sort order (i.e ascending or descending order) of the model is determined dynamically by inspecting the contents of the model. <p><b>Note:</b> The performance improvements described above cannot take place when the completer's {@link QCompleter#caseSensitivity() caseSensitivity} is different to the case sensitivity used by the model's when sorting. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}, and {@link com.trolltech.qt.gui.QCompleter.ModelSorting QCompleter::ModelSorting }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="modelSorting")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QCompleter.ModelSorting modelSorting()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QCompleter.ModelSorting.resolve(__qt_modelSorting(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_modelSorting(long __this__nativeId);

/**
Returns the popup used to display completions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#setPopup(com.trolltech.qt.gui.QAbstractItemView) setPopup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemView popup()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_popup(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractItemView __qt_popup(long __this__nativeId);

/**
This property holds the case sensitivity of the matching. The default is {@link com.trolltech.qt.core.Qt.CaseSensitivity Qt::CaseSensitive }. <p><DT><b>See also:</b><br><DD>{@link QCompleter#completionColumn() completionColumn}, {@link QCompleter#completionRole() completionRole}, and {@link QCompleter#modelSorting() modelSorting}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="caseSensitivity")
    @QtBlockedSlot
    public final void setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity caseSensitivity)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCaseSensitivity_CaseSensitivity(nativeId(), caseSensitivity.value());
    }
    @QtBlockedSlot
    native void __qt_setCaseSensitivity_CaseSensitivity(long __this__nativeId, int caseSensitivity);

/**
This property holds the column in the model in which completions are searched for.  If the {@link com.trolltech.qt.gui.QCompleter#popup() popup()} is a {@link com.trolltech.qt.gui.QListView QListView}, it is automatically setup to display this column. <p>By default, the match column is 0. <p><DT><b>See also:</b><br><DD>{@link QCompleter#completionRole() completionRole}, and {@link QCompleter#caseSensitivity() caseSensitivity}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="completionColumn")
    @QtBlockedSlot
    public final void setCompletionColumn(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCompletionColumn_int(nativeId(), column);
    }
    @QtBlockedSlot
    native void __qt_setCompletionColumn_int(long __this__nativeId, int column);

/**
This property holds how the completions are provided to the user. The default value is {@link com.trolltech.qt.gui.QCompleter.CompletionMode QCompleter::PopupCompletion }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="completionMode")
    @QtBlockedSlot
    public final void setCompletionMode(com.trolltech.qt.gui.QCompleter.CompletionMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCompletionMode_CompletionMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setCompletionMode_CompletionMode(long __this__nativeId, int mode);

/**
This property holds the completion prefix used to provide completions.  The {@link com.trolltech.qt.gui.QCompleter#completionModel() completionModel()} is updated to reflect the list of possible matches for <tt>prefix</tt>.
*/

    @com.trolltech.qt.QtPropertyWriter(name="completionPrefix")
    public final void setCompletionPrefix(java.lang.String prefix)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCompletionPrefix_String(nativeId(), prefix);
    }
    native void __qt_setCompletionPrefix_String(long __this__nativeId, java.lang.String prefix);

/**
This property holds the item role to be used to query the contents of items for matching.  The default role is {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::EditRole }. <p><DT><b>See also:</b><br><DD>{@link QCompleter#completionColumn() completionColumn}, and {@link QCompleter#caseSensitivity() caseSensitivity}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="completionRole")
    @QtBlockedSlot
    public final void setCompletionRole(int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCompletionRole_int(nativeId(), role);
    }
    @QtBlockedSlot
    native void __qt_setCompletionRole_int(long __this__nativeId, int role);

/**
Sets the current row to the <tt>row</tt> specified. Returns true if successful; otherwise returns false. <p>This function may be used along with {@link com.trolltech.qt.gui.QCompleter#currentCompletion() currentCompletion()} to iterate through all the possible completions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#currentRow() currentRow()}, {@link com.trolltech.qt.gui.QCompleter#currentCompletion() currentCompletion()}, and {@link com.trolltech.qt.gui.QCompleter#completionCount() completionCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setCurrentRow(int row)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setCurrentRow_int(nativeId(), row);
    }
    @QtBlockedSlot
    native boolean __qt_setCurrentRow_int(long __this__nativeId, int row);

/**
Sets the model which provides completions to <tt>model</tt>. The <tt>model</tt> can be list model or a tree model. If a model has been already previously set and it has the QCompleter as its parent, it is deleted. <p>For convenience, if <tt>model</tt> is a {@link com.trolltech.qt.gui.QDirModel QDirModel}, QCompleter switches its {@link QCompleter#caseSensitivity() caseSensitivity} to {@link com.trolltech.qt.core.Qt.CaseSensitivity Qt::CaseInsensitive } on Windows and {@link com.trolltech.qt.core.Qt.CaseSensitivity Qt::CaseSensitive } on other platforms. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#completionModel() completionModel()}, {@link QCompleter#modelSorting() modelSorting}, and Handling Tree Models. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setModel(com.trolltech.qt.core.QAbstractItemModel c)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcModel = c;
        }
        __qt_setModel_QAbstractItemModel(nativeId(), c == null ? 0 : c.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setModel_QAbstractItemModel(long __this__nativeId, long c);

/**
This property holds the way the model is sorted. By default, no assumptions are made about the order of the items in the model that provides the completions. <p>If the model's data for the {@link com.trolltech.qt.gui.QCompleter#completionColumn() completionColumn()} and {@link com.trolltech.qt.gui.QCompleter#completionRole() completionRole()} is sorted in ascending order, you can set this property to {@link com.trolltech.qt.gui.QCompleter.ModelSorting CaseSensitivelySortedModel } or {@link com.trolltech.qt.gui.QCompleter.ModelSorting CaseInsensitivelySortedModel }. On large models, this can lead to significant performance improvements because the completer object can then use a binary search algorithm instead of linear search algorithm. <p>The sort order (i.e ascending or descending order) of the model is determined dynamically by inspecting the contents of the model. <p><b>Note:</b> The performance improvements described above cannot take place when the completer's {@link QCompleter#caseSensitivity() caseSensitivity} is different to the case sensitivity used by the model's when sorting. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}, and {@link com.trolltech.qt.gui.QCompleter.ModelSorting QCompleter::ModelSorting }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="modelSorting")
    @QtBlockedSlot
    public final void setModelSorting(com.trolltech.qt.gui.QCompleter.ModelSorting sorting)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setModelSorting_ModelSorting(nativeId(), sorting.value());
    }
    @QtBlockedSlot
    native void __qt_setModelSorting_ModelSorting(long __this__nativeId, int sorting);

/**
Sets the popup used to display completions to <tt>popup</tt>. QCompleter takes ownership of the view. <p>A {@link com.trolltech.qt.gui.QListView QListView} is automatically created when the {@link com.trolltech.qt.gui.QCompleter#completionMode() completionMode()} is set to {@link com.trolltech.qt.gui.QCompleter.CompletionMode QCompleter::PopupCompletion } or {@link com.trolltech.qt.gui.QCompleter.CompletionMode QCompleter::UnfilteredPopupCompletion }. The default popup displays the {@link com.trolltech.qt.gui.QCompleter#completionColumn() completionColumn()}. <p>Ensure that this function is called before the view settings are modified. This is required since view's properties may require that a model has been set on the view (for example, hiding columns in the view requires a model to be set on the view). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#popup() popup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPopup(com.trolltech.qt.gui.QAbstractItemView popup)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (popup != null) {
            popup.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (popup == null)
            throw new NullPointerException("Argument 'popup': null not expected.");
        __qt_setPopup_QAbstractItemView(nativeId(), popup == null ? 0 : popup.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPopup_QAbstractItemView(long __this__nativeId, long popup);

/**
Sets the widget for which completion are provided for to <tt>widget</tt>. This function is automatically called when a QCompleter is set on a {@link com.trolltech.qt.gui.QLineEdit QLineEdit} using {@link com.trolltech.qt.gui.QLineEdit#setCompleter(com.trolltech.qt.gui.QCompleter) QLineEdit::setCompleter()} or on a {@link com.trolltech.qt.gui.QComboBox QComboBox} using {@link com.trolltech.qt.gui.QComboBox#setCompleter(com.trolltech.qt.gui.QCompleter) QComboBox::setCompleter()}. The widget needs to be set explicitly when providing completions for custom widgets. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#widget() widget()}, {@link com.trolltech.qt.gui.QCompleter#setModel(com.trolltech.qt.core.QAbstractItemModel) setModel()}, and {@link com.trolltech.qt.gui.QCompleter#setPopup(com.trolltech.qt.gui.QAbstractItemView) setPopup()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcWidget = widget;
        }
        __qt_setWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setWidget_QWidget(long __this__nativeId, long widget);

/**
This property holds the completions wrap around when navigating through items. The default is true.
*/

    @com.trolltech.qt.QtPropertyWriter(name="wrapAround")
    public final void setWrapAround(boolean wrap)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWrapAround_boolean(nativeId(), wrap);
    }
    native void __qt_setWrapAround_boolean(long __this__nativeId, boolean wrap);

/**
Returns the widget for which the completer object is providing completions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#setWidget(com.trolltech.qt.gui.QWidget) setWidget()}. <br></DD></DT>
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
This property holds the completions wrap around when navigating through items. The default is true.
*/

    @com.trolltech.qt.QtPropertyReader(name="wrapAround")
    @QtBlockedSlot
    public final boolean wrapAround()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_wrapAround(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_wrapAround(long __this__nativeId);

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
    public boolean eventFilter(com.trolltech.qt.core.QObject o, com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_eventFilter_QObject_QEvent(nativeId(), o == null ? 0 : o.nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_eventFilter_QObject_QEvent(long __this__nativeId, long o, long e);

/**
Returns the path for the given <tt>index</tt>. The completer object uses this to obtain the completion text from the underlying model. <p>The default implementation returns the {@link com.trolltech.qt.core.Qt.ItemDataRole edit role } of the item for list models. It returns the absolute file path if the model is a {@link com.trolltech.qt.gui.QDirModel QDirModel}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#splitPath(java.lang.String) splitPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.String pathFromIndex(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pathFromIndex_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native java.lang.String __qt_pathFromIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
Splits the given <tt>path</tt> into strings that are used to match at each level in the {@link com.trolltech.qt.gui.QCompleter#model() model()}. <p>The default implementation of {@link com.trolltech.qt.gui.QCompleter#splitPath(java.lang.String) splitPath()} splits a file system path based on {@link com.trolltech.qt.core.QDir#separator() QDir::separator()} when the sourceModel() is a {@link com.trolltech.qt.gui.QDirModel QDirModel}. <p>When used with list models, the first item in the returned list is used for matching. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QCompleter#pathFromIndex(com.trolltech.qt.core.QModelIndex) pathFromIndex()}, and Handling Tree Models. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> splitPath(java.lang.String path)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_splitPath_String(nativeId(), path);
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_splitPath_String(long __this__nativeId, java.lang.String path);

/**
@exclude
*/

    public static native QCompleter fromNativePointer(QNativePointer nativePointer);

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

    protected QCompleter(QPrivateConstructor p) { super(p); } 
}
