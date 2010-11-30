package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QSyntaxHighlighter class allows you to define syntax highlighting rules, and in addition you can use the class to query a document's current formatting or user data. The QSyntaxHighlighter class is a base class for implementing {@link com.trolltech.qt.gui.QTextEdit QTextEdit} syntax highlighters. A syntax highligher automatically highlights parts of the text in a {@link com.trolltech.qt.gui.QTextEdit QTextEdit}, or more generally in a {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. Syntax highlighters are often used when the user is entering text in a specific format (for example source code) and help the user to read the text and identify syntax errors. <p>To provide your own syntax highlighting, you must subclass QSyntaxHighlighter and reimplement {@link com.trolltech.qt.gui.QSyntaxHighlighter#highlightBlock(java.lang.String) highlightBlock()}. <p>When you create an instance of your QSyntaxHighlighter subclass, pass it the {@link com.trolltech.qt.gui.QTextEdit QTextEdit} or {@link com.trolltech.qt.gui.QTextDocument QTextDocument} that you want the syntax highlighting to be applied to. For example: <pre class="snippet">
           QTextEdit editor = new QTextEdit();
           MyHighlighter highlighter = new MyHighlighter(editor.document());
</pre> After this your {@link com.trolltech.qt.gui.QSyntaxHighlighter#highlightBlock(java.lang.String) highlightBlock()} function will be called automatically whenever necessary. Use your {@link com.trolltech.qt.gui.QSyntaxHighlighter#highlightBlock(java.lang.String) highlightBlock()} function to apply formatting (e.g. setting the font and color) to the text that is passed to it. QSyntaxHighlighter provides the {@link com.trolltech.qt.gui.QSyntaxHighlighter#setFormat(int, int, com.trolltech.qt.gui.QColor) setFormat()} function which applies a given {@link com.trolltech.qt.gui.QTextCharFormat QTextCharFormat} on the current text block. For example: <pre class="snippet">
        protected void highlightBlock(String text)
        {
            QTextCharFormat myClassFormat = new QTextCharFormat();
            myClassFormat.setFontWeight(QFont.Weight.Bold.value());
            myClassFormat.setForeground(new QBrush(QColor.darkMagenta));
            String pattern = "\\bMy[A-Za-z]+\\b";

            QRegExp expression = new QRegExp(pattern);
            int index = expression.indexIn(text);
            while (index &gt;= 0) {
                int length = expression.matchedLength();
                setFormat(index, length, myClassFormat);
                index = expression.indexIn(text, index + length);
             }
         }
</pre> Some syntaxes can have constructs that span several text blocks. For example, a C++ syntax highlighter should be able to cope with <tt>/</tt><tt>*...*</tt><tt>/</tt> multiline comments. To deal with these cases it is necessary to know the end state of the previous text block (e.g. "in comment"). <p>Inside your {@link com.trolltech.qt.gui.QSyntaxHighlighter#highlightBlock(java.lang.String) highlightBlock()} implementation you can query the end state of the previous text block using the {@link com.trolltech.qt.gui.QSyntaxHighlighter#previousBlockState() previousBlockState()} function. After parsing the block you can save the last state using {@link com.trolltech.qt.gui.QSyntaxHighlighter#setCurrentBlockState(int) setCurrentBlockState()}. <p>The {@link com.trolltech.qt.gui.QSyntaxHighlighter#currentBlockState() currentBlockState()} and {@link com.trolltech.qt.gui.QSyntaxHighlighter#previousBlockState() previousBlockState()} functions return an int value. If no state is set, the returned value is -1. You can designate any other value to identify any given state using the {@link com.trolltech.qt.gui.QSyntaxHighlighter#setCurrentBlockState(int) setCurrentBlockState()} function. Once the state is set the {@link com.trolltech.qt.gui.QTextBlock QTextBlock} keeps that value until it is set set again or until the corresponding paragraph of text is deleted. <p>For example, if you're writing a simple C++ syntax highlighter, you might designate 1 to signify "in comment": <pre class="snippet">
        QTextCharFormat multiLineCommentFormat = new QTextCharFormat();
        multiLineCommentFormat.setForeground(new QBrush(QColor.red));

        QRegExp startExpression = new QRegExp("/\\*");
        QRegExp endExpression = new QRegExp("\\* /");

        setCurrentBlockState(0);

        int startIndex = 0;
        if (previousBlockState() != 1)
            startIndex = startExpression.indexIn(text);

        while (startIndex &gt;= 0) {
           int endIndex = endExpression.indexIn(text, startIndex);
           int commentLength;
           if (endIndex == -1) {
               setCurrentBlockState(1);
               commentLength = text.length() - startIndex;
           } else {
               commentLength = endIndex - startIndex
                               + endExpression.matchedLength();
           }
           setFormat(startIndex, commentLength, multiLineCommentFormat);
           startIndex = startExpression.indexIn(text,
                                     startIndex + commentLength);
        }
</pre> In the example above, we first set the current block state to 0. Then, if the previous block ended within a comment, we higlight from the beginning of the current block (<tt>startIndex = 0</tt>). Otherwise, we search for the given start expression. If the specified end expression cannot be found in the text block, we change the current block state by calling {@link com.trolltech.qt.gui.QSyntaxHighlighter#setCurrentBlockState(int) setCurrentBlockState()}, and make sure that the rest of the block is higlighted. <p>In addition you can query the current formatting and user data using the {@link com.trolltech.qt.gui.QSyntaxHighlighter#format(int) format()} and {@link com.trolltech.qt.gui.QSyntaxHighlighter#currentBlockUserData() currentBlockUserData()} functions respectively. You can also attach user data to the current text block using the {@link com.trolltech.qt.gui.QSyntaxHighlighter#setCurrentBlockUserData(com.trolltech.qt.gui.QTextBlockUserData) setCurrentBlockUserData()} function. {@link com.trolltech.qt.gui.QTextBlockUserData QTextBlockUserData} can be used to store custom settings. In the case of syntax highlighting, it is in particular interesting as cache storage for information that you may figure out while parsing the paragraph's text. For an example, see the {@link com.trolltech.qt.gui.QSyntaxHighlighter#setCurrentBlockUserData(com.trolltech.qt.gui.QTextBlockUserData) setCurrentBlockUserData()} documentation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit QTextEdit}, and {@link <a href="../qtjambi-syntaxhighlighter.html">Syntax Highlighter Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QSyntaxHighlighter extends com.trolltech.qt.core.QObject
{

    private Object __rcDocument = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QSyntaxHighlighter {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        protected void highlightBlock(java.lang.String text) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_highlightBlock_String(nativeId(), text);
        }
    }


/**
Constructs a QSyntaxHighlighter with the given <tt>parent</tt>.
*/

    public QSyntaxHighlighter(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSyntaxHighlighter_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSyntaxHighlighter_QObject(long parent);

/**
Constructs a QSyntaxHighlighter and installs it on <tt>parent</tt>. The specified {@link com.trolltech.qt.gui.QTextDocument QTextDocument} also becomes the owner of the QSyntaxHighlighter.
*/

    public QSyntaxHighlighter(com.trolltech.qt.gui.QTextDocument parent){
        super((QPrivateConstructor)null);
        __qt_QSyntaxHighlighter_QTextDocument(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSyntaxHighlighter_QTextDocument(long parent);

/**
Constructs a QSyntaxHighlighter and installs it on <tt>parent</tt> 's {@link com.trolltech.qt.gui.QTextDocument QTextDocument}. The specified {@link com.trolltech.qt.gui.QTextEdit QTextEdit} also becomes the owner of the QSyntaxHighlighter.
*/

    public QSyntaxHighlighter(com.trolltech.qt.gui.QTextEdit parent){
        super((QPrivateConstructor)null);
        __qt_QSyntaxHighlighter_QTextEdit(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSyntaxHighlighter_QTextEdit(long parent);

/**
Returns the current text block.
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QTextBlock currentBlock()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentBlock(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlock __qt_currentBlock(long __this__nativeId);

/**
Returns the state of the current text block. If no value is set, the returned value is -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSyntaxHighlighter#setCurrentBlockState(int) setCurrentBlockState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final int currentBlockState()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentBlockState(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentBlockState(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.gui.QTextBlockUserData QTextBlockUserData} object previously attached to the current text block. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextBlock#userData() QTextBlock::userData()}, and {@link com.trolltech.qt.gui.QSyntaxHighlighter#setCurrentBlockUserData(com.trolltech.qt.gui.QTextBlockUserData) setCurrentBlockUserData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QTextBlockUserData currentBlockUserData()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentBlockUserData(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextBlockUserData __qt_currentBlockUserData(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.gui.QTextDocument QTextDocument} on which this syntax highlighter is installed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSyntaxHighlighter#setDocument(com.trolltech.qt.gui.QTextDocument) setDocument()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextDocument document()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_document(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextDocument __qt_document(long __this__nativeId);

/**
Returns the format at <tt>position</tt> inside the syntax highlighter's current text block. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSyntaxHighlighter#setFormat(int, int, com.trolltech.qt.gui.QColor) setFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QTextCharFormat format(int pos)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_format_int(nativeId(), pos);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QTextCharFormat __qt_format_int(long __this__nativeId, int pos);

/**
Returns the end state of the text block previous to the syntax highlighter's current block. If no value was previously set, the returned value is -1. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSyntaxHighlighter#highlightBlock(java.lang.String) highlightBlock()}, and {@link com.trolltech.qt.gui.QSyntaxHighlighter#setCurrentBlockState(int) setCurrentBlockState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final int previousBlockState()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_previousBlockState(nativeId());
    }
    @QtBlockedSlot
    native int __qt_previousBlockState(long __this__nativeId);

/**
Redoes the highlighting of the whole document.
*/

    public final void rehighlight()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rehighlight(nativeId());
    }
    native void __qt_rehighlight(long __this__nativeId);

/**
Sets the state of the current text block to <tt>newState</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSyntaxHighlighter#currentBlockState() currentBlockState()}, and {@link com.trolltech.qt.gui.QSyntaxHighlighter#highlightBlock(java.lang.String) highlightBlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setCurrentBlockState(int newState)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentBlockState_int(nativeId(), newState);
    }
    @QtBlockedSlot
    native void __qt_setCurrentBlockState_int(long __this__nativeId, int newState);

/**
Attaches the given <tt>data</tt> to the current text block. The ownership is passed to the underlying text document, i.e. the provided {@link com.trolltech.qt.gui.QTextBlockUserData QTextBlockUserData} object will be deleted if the corresponding text block gets deleted. <p>{@link com.trolltech.qt.gui.QTextBlockUserData QTextBlockUserData} can be used to store custom settings. In the case of syntax highlighting, it is in particular interesting as cache storage for information that you may figure out while parsing the paragraph's text. <p>For example while parsing the text, you can keep track of parenthesis characters that you encounter ('{[(' and the like), and store their relative position and the actual QChar in a simple class derived from {@link com.trolltech.qt.gui.QTextBlockUserData QTextBlockUserData}: <pre class="snippet">
        class ParenthesisInfo
        {
            char character;
            int position;
        }

        class BlockData extends QTextBlockUserData
        {
            List&lt;ParenthesisInfo&gt; parentheses;
        }
</pre> During cursor navigation in the associated editor, you can ask the current {@link com.trolltech.qt.gui.QTextBlock QTextBlock} (retrieved using the {@link com.trolltech.qt.gui.QTextCursor#block() QTextCursor::block()} function) if it has a user data object set and cast it to your <tt>BlockData</tt> object. Then you can check if the current cursor position matches with a previously recorded parenthesis position, and, depending on the type of parenthesis (opening or closing), find the next opening or closing parenthesis on the same level. <p>In this way you can do a visual parenthesis matching and highlight from the current cursor position to the matching parenthesis. That makes it easier to spot a missing parenthesis in your code and to find where a corresponding opening/closing parenthesis is when editing parenthesis intensive code. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSyntaxHighlighter#currentBlockUserData() currentBlockUserData()}, and {@link com.trolltech.qt.gui.QTextBlock#setUserData(com.trolltech.qt.gui.QTextBlockUserData) QTextBlock::setUserData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setCurrentBlockUserData(com.trolltech.qt.gui.QTextBlockUserData data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (data != null) {
            data.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentBlockUserData_QTextBlockUserData(nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCurrentBlockUserData_QTextBlockUserData(long __this__nativeId, long data);

/**
Installs the syntax highlighter on the given {@link com.trolltech.qt.gui.QTextDocument QTextDocument}<tt>doc</tt>. A QSyntaxHighlighter can only be used with one document at a time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSyntaxHighlighter#document() document()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDocument(com.trolltech.qt.gui.QTextDocument doc)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcDocument = doc;
        }
        __qt_setDocument_QTextDocument(nativeId(), doc == null ? 0 : doc.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDocument_QTextDocument(long __this__nativeId, long doc);

/**
This is an overloaded member function, provided for convenience. <p>The specified <tt>color</tt> is applied to the current text block from the <tt>start</tt> position for a length of <tt>count</tt> characters. <p>The other attributes of the current text block, e.g. the font and background color, are reset to default values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSyntaxHighlighter#format(int) format()}, and {@link com.trolltech.qt.gui.QSyntaxHighlighter#highlightBlock(java.lang.String) highlightBlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setFormat(int start, int count, com.trolltech.qt.gui.QColor color)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_int_int_QColor(nativeId(), start, count, color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFormat_int_int_QColor(long __this__nativeId, int start, int count, long color);

/**
This is an overloaded member function, provided for convenience. <p>The specified <tt>font</tt> is applied to the current text block from the <tt>start</tt> position for a length of <tt>count</tt> characters. <p>The other attributes of the current text block, e.g. the font and background color, are reset to default values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSyntaxHighlighter#format(int) format()}, and {@link com.trolltech.qt.gui.QSyntaxHighlighter#highlightBlock(java.lang.String) highlightBlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setFormat(int start, int count, com.trolltech.qt.gui.QFont font)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_int_int_QFont(nativeId(), start, count, font == null ? 0 : font.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFormat_int_int_QFont(long __this__nativeId, int start, int count, long font);

/**
This function is applied to the syntax highlighter's current text block (i. . the text that is passed to the {@link com.trolltech.qt.gui.QSyntaxHighlighter#highlightBlock(java.lang.String) highlightBlock()} function). <p>The specified <tt>format</tt> is applied to the text from the <tt>start</tt> position for a length of <tt>count</tt> characters (if <tt>count</tt> is 0, nothing is done). The formatting properties set in <tt>format</tt> are merged at display time with the formatting information stored directly in the document, for example as previously set with {@link com.trolltech.qt.gui.QTextCursor QTextCursor}'s functions. Note that the document itself remains unmodified by the format set through this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSyntaxHighlighter#format(int) format()}, and {@link com.trolltech.qt.gui.QSyntaxHighlighter#highlightBlock(java.lang.String) highlightBlock()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setFormat(int start, int count, com.trolltech.qt.gui.QTextCharFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_int_int_QTextCharFormat(nativeId(), start, count, format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFormat_int_int_QTextCharFormat(long __this__nativeId, int start, int count, long format);

/**
Highlights the given text block. This function is called when necessary by the rich text engine, i.e. on text blocks which have changed. <p>To provide your own syntax highlighting, you must subclass QSyntaxHighlighter and reimplement {@link com.trolltech.qt.gui.QSyntaxHighlighter#highlightBlock(java.lang.String) highlightBlock()}. In your reimplementation you should parse the block's <tt>text</tt> and call {@link com.trolltech.qt.gui.QSyntaxHighlighter#setFormat(int, int, com.trolltech.qt.gui.QColor) setFormat()} as often as necessary to apply any font and color changes that you require. For example: <pre class="snippet">
        protected void highlightBlock(String text)
        {
            QTextCharFormat myClassFormat = new QTextCharFormat();
            myClassFormat.setFontWeight(QFont.Weight.Bold.value());
            myClassFormat.setForeground(new QBrush(QColor.darkMagenta));
            String pattern = "\\bMy[A-Za-z]+\\b";

            QRegExp expression = new QRegExp(pattern);
            int index = expression.indexIn(text);
            while (index &gt;= 0) {
                int length = expression.matchedLength();
                setFormat(index, length, myClassFormat);
                index = expression.indexIn(text, index + length);
             }
         }
</pre> Some syntaxes can have constructs that span several text blocks. For example, a C++ syntax highlighter should be able to cope with <tt>/</tt><tt>*...*</tt><tt>/</tt> multiline comments. To deal with these cases it is necessary to know the end state of the previous text block (e.g. "in comment"). <p>Inside your {@link com.trolltech.qt.gui.QSyntaxHighlighter#highlightBlock(java.lang.String) highlightBlock()} implementation you can query the end state of the previous text block using the {@link com.trolltech.qt.gui.QSyntaxHighlighter#previousBlockState() previousBlockState()} function. After parsing the block you can save the last state using {@link com.trolltech.qt.gui.QSyntaxHighlighter#setCurrentBlockState(int) setCurrentBlockState()}. <p>The {@link com.trolltech.qt.gui.QSyntaxHighlighter#currentBlockState() currentBlockState()} and {@link com.trolltech.qt.gui.QSyntaxHighlighter#previousBlockState() previousBlockState()} functions return an int value. If no state is set, the returned value is -1. You can designate any other value to identify any given state using the {@link com.trolltech.qt.gui.QSyntaxHighlighter#setCurrentBlockState(int) setCurrentBlockState()} function. Once the state is set the {@link com.trolltech.qt.gui.QTextBlock QTextBlock} keeps that value until it is set set again or until the corresponding paragraph of text gets deleted. <p>For example, if you're writing a simple C++ syntax highlighter, you might designate 1 to signify "in comment". For a text block that ended in the middle of a comment you'd set 1 using setCurrentBlockState, and for other paragraphs you'd set 0. In your parsing code if the return value of {@link com.trolltech.qt.gui.QSyntaxHighlighter#previousBlockState() previousBlockState()} is 1, you would highlight the text as a C++ comment until you reached the closing <tt>*</tt><tt>/</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSyntaxHighlighter#previousBlockState() previousBlockState()}, {@link com.trolltech.qt.gui.QSyntaxHighlighter#setFormat(int, int, com.trolltech.qt.gui.QColor) setFormat()}, and {@link com.trolltech.qt.gui.QSyntaxHighlighter#setCurrentBlockState(int) setCurrentBlockState()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected abstract void highlightBlock(java.lang.String text);
    @QtBlockedSlot
    native void __qt_highlightBlock_String(long __this__nativeId, java.lang.String text);

/**
@exclude
*/

    public static native QSyntaxHighlighter fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSyntaxHighlighter(QPrivateConstructor p) { super(p); } 
}
