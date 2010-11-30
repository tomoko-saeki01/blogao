package com.trolltech.qt.gui;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QLabel widget provides a text or image display. QLabel is used for displaying text or an image. No user interaction functionality is provided. The visual appearance of the label can be configured in various ways, and it can be used for specifying a focus mnemonic key for another widget. <p>A QLabel can contain any of the following content types: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Content</center></th><th><center> Setting</center></th></tr></thead><tr valign="top" class="even"><td> Plain text</td><td> Pass a QString to {@link com.trolltech.qt.gui.QLabel#setText(java.lang.String) setText()}.</td></tr><tr valign="top" class="odd"><td> Rich text</td><td> Pass a QString that contains rich text to {@link com.trolltech.qt.gui.QLabel#setText(java.lang.String) setText()}.</td></tr><tr valign="top" class="even"><td> A pixmap</td><td> Pass a {@link com.trolltech.qt.gui.QPixmap QPixmap} to {@link com.trolltech.qt.gui.QLabel#setPixmap(com.trolltech.qt.gui.QPixmap) setPixmap()}.</td></tr><tr valign="top" class="odd"><td> A movie</td><td> Pass a {@link com.trolltech.qt.gui.QMovie QMovie} to {@link com.trolltech.qt.gui.QLabel#setMovie(com.trolltech.qt.gui.QMovie) setMovie()}.</td></tr><tr valign="top" class="even"><td> A number</td><td> Pass an int or a double to {@link com.trolltech.qt.gui.QLabel#setNum(double) setNum()}, which converts the number to plain text.</td></tr><tr valign="top" class="odd"><td> Nothing</td><td> The same as an empty plain text. This is the default. Set by {@link com.trolltech.qt.gui.QLabel#clear() clear()}.</td></tr></table> When the content is changed using any of these functions, any previous content is cleared. <p>By default, labels display {@link QLabel#alignment() left-aligned, vertically-centered} text and images, where any tabs in the text to be displayed are {@link com.trolltech.qt.core.Qt.TextFlag automatically expanded }. However, the look of a QLabel can be adjusted and fine-tuned in several ways. <p>The positioning of the content within the QLabel widget area can be tuned with {@link com.trolltech.qt.gui.QLabel#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()} and {@link com.trolltech.qt.gui.QLabel#setIndent(int) setIndent()}. Text content can also wrap lines along word boundaries with {@link com.trolltech.qt.gui.QLabel#setWordWrap(boolean) setWordWrap()}. For example, this code sets up a sunken panel with a two-line text in the bottom right corner (both lines being flush with the right side of the label): <pre class="snippet">
    QLabel label = new QLabel();
    label.setFrameStyle(QFrame.Shadow.Sunken.value() | QFrame.Shape.Panel.value() );
    label.setText("first line\nsecond line");
    label.setAlignment(Qt.AlignmentFlag.AlignBottom, Qt.AlignmentFlag.AlignRight);
</pre> The properties and functions QLabel inherits from {@link com.trolltech.qt.gui.QFrame QFrame} can also be used to specify the widget frame to be used for any given label. <p>A QLabel is often used as a label for an interactive widget. For this use QLabel provides a useful mechanism for adding an mnemonic (see {@link com.trolltech.qt.gui.QKeySequence QKeySequence}) that will set the keyboard focus to the other widget (called the QLabel's "buddy"). For example: <pre class="snippet">
    QLineEdit phoneEdit = new QLineEdit();
    QLabel phoneLabel = new QLabel("Phone:");
    phoneLabel.setBuddy(phoneEdit);
</pre> In this example, keyboard focus is transferred to the label's buddy (the {@link com.trolltech.qt.gui.QLineEdit QLineEdit}) when the user presses Alt+P. If the buddy was a button (inheriting from {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton}), triggering the mnemonic would emulate a button click. <table align="center" border="0" cellpadding="2" cellspacing="1" width="100%"><tr valign="top" class="even"><td>  <br><center><img src="../images/macintosh-label.png"></center><br></td><td> A label shown in the {@link <a href="../gallery-macintosh.html">Macintosh widget style</a>}.</td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/plastique-label.png"></center><br></td><td> A label shown in the {@link <a href="../gallery-plastique.html">Plastique widget style</a>}.</td></tr><tr valign="top" class="even"><td>  <br><center><img src="../images/windowsxp-label.png"></center><br></td><td> A label shown in the {@link <a href="../gallery-windowsxp.html">Windows XP widget style</a>}.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLineEdit QLineEdit}, {@link com.trolltech.qt.gui.QTextEdit QTextEdit}, {@link com.trolltech.qt.gui.QPixmap QPixmap}, {@link com.trolltech.qt.gui.QMovie QMovie}, and {@link <a href="../guibooks.html">GUI Design Handbook: Label</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QLabel extends com.trolltech.qt.gui.QFrame
{

    private Object __rcMovie = null;

    private Object __rcBuddy = null;
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: link)&gt;:<p> This signal is emitted when the user clicks a link. The URL referred to by the anchor is passed in <tt>link</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#linkHovered linkHovered() }. <br></DD></DT>
*/

    public final Signal1<java.lang.String> linkActivated = new Signal1<java.lang.String>();

    private final void linkActivated(java.lang.String link)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_linkActivated_String(nativeId(), link);
    }
    native void __qt_linkActivated_String(long __this__nativeId, java.lang.String link);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: link)&gt;:<p> This signal is emitted when the user hovers over a link. The URL referred to by the anchor is passed in <tt>link</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#linkActivated linkActivated() }. <br></DD></DT>
*/

    public final Signal1<java.lang.String> linkHovered = new Signal1<java.lang.String>();

    private final void linkHovered(java.lang.String link)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_linkHovered_String(nativeId(), link);
    }
    native void __qt_linkHovered_String(long __this__nativeId, java.lang.String link);


/**
This is an overloaded method provided for convenience.
*/

    public QLabel(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... f) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(f));
    }

/**
Constructs an empty label. <p>The <tt>parent</tt> and widget flag <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QFrame QFrame} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}, {@link com.trolltech.qt.gui.QFrame#setFrameStyle(int) setFrameStyle()}, and {@link com.trolltech.qt.gui.QLabel#setIndent(int) setIndent()}. <br></DD></DT>
*/

    public QLabel(com.trolltech.qt.gui.QWidget parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs an empty label. <p>The <tt>parent</tt> and widget flag <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QFrame QFrame} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}, {@link com.trolltech.qt.gui.QFrame#setFrameStyle(int) setFrameStyle()}, and {@link com.trolltech.qt.gui.QLabel#setIndent(int) setIndent()}. <br></DD></DT>
*/

    public QLabel() {
        this((com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs an empty label. <p>The <tt>parent</tt> and widget flag <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QFrame QFrame} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}, {@link com.trolltech.qt.gui.QFrame#setFrameStyle(int) setFrameStyle()}, and {@link com.trolltech.qt.gui.QLabel#setIndent(int) setIndent()}. <br></DD></DT>
*/

    public QLabel(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags f){
        super((QPrivateConstructor)null);
        __qt_QLabel_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), f.value());
    }

    native void __qt_QLabel_QWidget_WindowFlags(long parent, int f);


/**
This is an overloaded method provided for convenience.
*/

    public QLabel(java.lang.String text, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... f) {
        this(text, parent, new com.trolltech.qt.core.Qt.WindowFlags(f));
    }

/**
Constructs a label that displays the text, <tt>text</tt>. <p>The <tt>parent</tt> and widget flag <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QFrame QFrame} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#setText(java.lang.String) setText()}, {@link com.trolltech.qt.gui.QLabel#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}, {@link com.trolltech.qt.gui.QFrame#setFrameStyle(int) setFrameStyle()}, and {@link com.trolltech.qt.gui.QLabel#setIndent(int) setIndent()}. <br></DD></DT>
*/

    public QLabel(java.lang.String text, com.trolltech.qt.gui.QWidget parent) {
        this(text, parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a label that displays the text, <tt>text</tt>. <p>The <tt>parent</tt> and widget flag <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QFrame QFrame} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#setText(java.lang.String) setText()}, {@link com.trolltech.qt.gui.QLabel#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}, {@link com.trolltech.qt.gui.QFrame#setFrameStyle(int) setFrameStyle()}, and {@link com.trolltech.qt.gui.QLabel#setIndent(int) setIndent()}. <br></DD></DT>
*/

    public QLabel(java.lang.String text) {
        this(text, (com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a label that displays the text, <tt>text</tt>. <p>The <tt>parent</tt> and widget flag <tt>f</tt>, arguments are passed to the {@link com.trolltech.qt.gui.QFrame QFrame} constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#setText(java.lang.String) setText()}, {@link com.trolltech.qt.gui.QLabel#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}, {@link com.trolltech.qt.gui.QFrame#setFrameStyle(int) setFrameStyle()}, and {@link com.trolltech.qt.gui.QLabel#setIndent(int) setIndent()}. <br></DD></DT>
*/

    public QLabel(java.lang.String text, com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags f){
        super((QPrivateConstructor)null);
        __qt_QLabel_String_QWidget_WindowFlags(text, parent == null ? 0 : parent.nativeId(), f.value());
    }

    native void __qt_QLabel_String_QWidget_WindowFlags(java.lang.String text, long parent, int f);

/**
This property holds the alignment of the label's contents. By default, the contents of the label are left-aligned and vertically-centered. <p><DT><b>See also:</b><br><DD>{@link QLabel#text() text}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="alignment")
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
Returns this label's buddy, or 0 if no buddy is currently set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#setBuddy(com.trolltech.qt.gui.QWidget) setBuddy()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget buddy()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_buddy(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_buddy(long __this__nativeId);

/**
Clears any label contents.
*/

    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    native void __qt_clear(long __this__nativeId);

/**
This property holds whether the label will scale its contents to fill all available space.  When enabled and the label shows a pixmap, it will scale the pixmap to fill the available space. <p>This property's default is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="scaledContents")
    @QtBlockedSlot
    public final boolean hasScaledContents()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasScaledContents(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasScaledContents(long __this__nativeId);

/**
This property holds the label's text indent in pixels. If a label displays text, the indent applies to the left edge if {@link com.trolltech.qt.gui.QLabel#alignment() alignment()} is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }, to the right edge if {@link com.trolltech.qt.gui.QLabel#alignment() alignment()} is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight }, to the top edge if {@link com.trolltech.qt.gui.QLabel#alignment() alignment()} is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignTop }, and to to the bottom edge if {@link com.trolltech.qt.gui.QLabel#alignment() alignment()} is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignBottom }. <p>If indent is negative, or if no indent has been set, the label computes the effective indent as follows: If frameWidth() is 0, the effective indent becomes 0. If frameWidth() is greater than 0, the effective indent becomes half the width of the "x" character of the widget's current font(). <p>By default, the indent is -1, meaning that an effective indent is calculating in the manner described above. <p><DT><b>See also:</b><br><DD>{@link QLabel#alignment() alignment}, {@link QLabel#margin() margin}, frameWidth(), and font(). <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="indent")
    @QtBlockedSlot
    public final int indent()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indent(nativeId());
    }
    @QtBlockedSlot
    native int __qt_indent(long __this__nativeId);

/**
This property holds the width of the margin. The margin is the distance between the innermost pixel of the frame and the outermost pixel of contents. <p>The default margin is 0. <p><DT><b>See also:</b><br><DD>{@link QLabel#indent() indent}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="margin")
    @QtBlockedSlot
    public final int margin()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_margin(nativeId());
    }
    @QtBlockedSlot
    native int __qt_margin(long __this__nativeId);

/**
Returns a pointer to the label's movie, or 0 if no movie has been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#setMovie(com.trolltech.qt.gui.QMovie) setMovie()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QMovie movie()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_movie(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QMovie __qt_movie(long __this__nativeId);

/**
Specifies whether QLabel should automatically open links using {@link com.trolltech.qt.gui.QDesktopServices#openUrl(com.trolltech.qt.core.QUrl) QDesktopServices::openUrl()} instead of emitting the {@link com.trolltech.qt.gui.QLabel#linkActivated linkActivated() } signal. <p><b>Note:</b> The {@link QLabel#textInteractionFlags() textInteractionFlags} set on the label need to include either LinksAccessibleByMouse or LinksAccessibleByKeyboard. <p>The default value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#textInteractionFlags() textInteractionFlags()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="openExternalLinks")
    @QtBlockedSlot
    public final boolean openExternalLinks()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_openExternalLinks(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_openExternalLinks(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer picture_private()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_picture_private(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_picture_private(long __this__nativeId);

    @QtBlockedSlot
    private final com.trolltech.qt.QNativePointer pixmap_private()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixmap_private(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.QNativePointer __qt_pixmap_private(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... arg__1) {
        this.setAlignment(new com.trolltech.qt.core.Qt.Alignment(arg__1));
    }
/**
This property holds the alignment of the label's contents. By default, the contents of the label are left-aligned and vertically-centered. <p><DT><b>See also:</b><br><DD>{@link QLabel#text() text}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="alignment")
    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.Alignment arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_Alignment(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setAlignment_Alignment(long __this__nativeId, int arg__1);

/**
Sets this label's buddy to <tt>buddy</tt>. <p>When the user presses the shortcut key indicated by this label, the keyboard focus is transferred to the label's buddy widget. <p>The buddy mechanism is only available for QLabels that contain text in which one character is prefixed with an ampersand, '&'. This character is set as the shortcut key. See the {@link com.trolltech.qt.gui.QKeySequence#mnemonic(java.lang.String) QKeySequence::mnemonic()} documentation for details (to display an actual ampersand, use '&&'). <p>In a dialog, you might create two data entry widgets and a label for each, and set up the geometry layout so each label is just to the left of its data entry widget (its "buddy"), for example: <pre class="snippet">
    QLineEdit nameEd  = new QLineEdit();
    QLabel    nameLb  = new QLabel("Name:");
    nameLb.setBuddy(nameEd);
    QLineEdit phoneEd = new QLineEdit();
    QLabel    phoneLb = new QLabel("Phone:");
    phoneLb.setBuddy(phoneEd);
    // (layout setup not shown)
</pre> With the code above, the focus jumps to the Name field when the user presses Alt+N, and to the Phone field when the user presses Alt+P. <p>To unset a previously set buddy, call this function with <tt>buddy</tt> set to 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#buddy() buddy()}, {@link com.trolltech.qt.gui.QLabel#setText(java.lang.String) setText()}, {@link com.trolltech.qt.gui.QShortcut QShortcut}, and {@link com.trolltech.qt.gui.QLabel#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBuddy(com.trolltech.qt.gui.QWidget arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcBuddy = arg__1;
        }
        __qt_setBuddy_QWidget(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBuddy_QWidget(long __this__nativeId, long arg__1);

/**
This property holds the label's text indent in pixels. If a label displays text, the indent applies to the left edge if {@link com.trolltech.qt.gui.QLabel#alignment() alignment()} is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }, to the right edge if {@link com.trolltech.qt.gui.QLabel#alignment() alignment()} is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignRight }, to the top edge if {@link com.trolltech.qt.gui.QLabel#alignment() alignment()} is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignTop }, and to to the bottom edge if {@link com.trolltech.qt.gui.QLabel#alignment() alignment()} is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignBottom }. <p>If indent is negative, or if no indent has been set, the label computes the effective indent as follows: If frameWidth() is 0, the effective indent becomes 0. If frameWidth() is greater than 0, the effective indent becomes half the width of the "x" character of the widget's current font(). <p>By default, the indent is -1, meaning that an effective indent is calculating in the manner described above. <p><DT><b>See also:</b><br><DD>{@link QLabel#alignment() alignment}, {@link QLabel#margin() margin}, frameWidth(), and font(). <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="indent")
    @QtBlockedSlot
    public final void setIndent(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIndent_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setIndent_int(long __this__nativeId, int arg__1);

/**
This property holds the width of the margin. The margin is the distance between the innermost pixel of the frame and the outermost pixel of contents. <p>The default margin is 0. <p><DT><b>See also:</b><br><DD>{@link QLabel#indent() indent}. <br></DD></DT>
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
Sets the label contents to <tt>movie</tt>. Any previous content is cleared. The label does NOT take ownership of the movie. <p>The buddy shortcut, if any, is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#movie() movie()}, and {@link com.trolltech.qt.gui.QLabel#setBuddy(com.trolltech.qt.gui.QWidget) setBuddy()}. <br></DD></DT>
*/

    public final void setMovie(com.trolltech.qt.gui.QMovie movie)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcMovie = movie;
        }
        __qt_setMovie_QMovie(nativeId(), movie == null ? 0 : movie.nativeId());
    }
    native void __qt_setMovie_QMovie(long __this__nativeId, long movie);

/**
This is an overloaded member function, provided for convenience. <p>Sets the label contents to plain text containing the textual representation of double <tt>num</tt>. Any previous content is cleared. Does nothing if the double's string representation is the same as the current contents of the label. <p>The buddy shortcut, if any, is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#setText(java.lang.String) setText()}, QString::setNum(), and {@link com.trolltech.qt.gui.QLabel#setBuddy(com.trolltech.qt.gui.QWidget) setBuddy()}. <br></DD></DT>
*/

    public final void setNum(double arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNum_double(nativeId(), arg__1);
    }
    native void __qt_setNum_double(long __this__nativeId, double arg__1);

/**
Sets the label contents to plain text containing the textual representation of integer <tt>num</tt>. Any previous content is cleared. Does nothing if the integer's string representation is the same as the current contents of the label. <p>The buddy shortcut, if any, is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#setText(java.lang.String) setText()}, QString::setNum(), and {@link com.trolltech.qt.gui.QLabel#setBuddy(com.trolltech.qt.gui.QWidget) setBuddy()}. <br></DD></DT>
*/

    public final void setNum(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNum_int(nativeId(), arg__1);
    }
    native void __qt_setNum_int(long __this__nativeId, int arg__1);

/**
Specifies whether QLabel should automatically open links using {@link com.trolltech.qt.gui.QDesktopServices#openUrl(com.trolltech.qt.core.QUrl) QDesktopServices::openUrl()} instead of emitting the {@link com.trolltech.qt.gui.QLabel#linkActivated linkActivated() } signal. <p><b>Note:</b> The {@link QLabel#textInteractionFlags() textInteractionFlags} set on the label need to include either LinksAccessibleByMouse or LinksAccessibleByKeyboard. <p>The default value is false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#textInteractionFlags() textInteractionFlags()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="openExternalLinks")
    @QtBlockedSlot
    public final void setOpenExternalLinks(boolean open)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOpenExternalLinks_boolean(nativeId(), open);
    }
    @QtBlockedSlot
    native void __qt_setOpenExternalLinks_boolean(long __this__nativeId, boolean open);

/**
Sets the label contents to <tt>picture</tt>. Any previous content is cleared. <p>The buddy shortcut, if any, is disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#picture() picture()}, and {@link com.trolltech.qt.gui.QLabel#setBuddy(com.trolltech.qt.gui.QWidget) setBuddy()}. <br></DD></DT>
*/

    public final void setPicture(com.trolltech.qt.gui.QPicture arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPicture_QPicture(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_setPicture_QPicture(long __this__nativeId, long arg__1);

/**
This property holds the label's pixmap. If no pixmap has been set this will return 0. <p>Setting the pixmap clears any previous content. The buddy shortcut, if any, is disabled.
*/

    @com.trolltech.qt.QtPropertyWriter(name="pixmap")
    public final void setPixmap(com.trolltech.qt.gui.QPixmap arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPixmap_QPixmap(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_setPixmap_QPixmap(long __this__nativeId, long arg__1);

/**
This property holds whether the label will scale its contents to fill all available space.  When enabled and the label shows a pixmap, it will scale the pixmap to fill the available space. <p>This property's default is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="scaledContents")
    @QtBlockedSlot
    public final void setScaledContents(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScaledContents_boolean(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native void __qt_setScaledContents_boolean(long __this__nativeId, boolean arg__1);

/**
This property holds the label's text. If no text has been set this will return an empty string. Setting the text clears any previous content. <p>The text will be interpreted either as plain text or as rich text, depending on the text format setting; see {@link com.trolltech.qt.gui.QLabel#setTextFormat(com.trolltech.qt.core.Qt.TextFormat) setTextFormat()}. The default setting is {@link com.trolltech.qt.core.Qt.TextFormat Qt::AutoText }; i.e. QLabel will try to auto-detect the format of the text set. <p>If a buddy has been set, the buddy mnemonic key is updated from the new text. <p>Note that QLabel is well-suited to display small rich text documents, such as small documents that get their document specific settings (font, text color, link color) from the label's palette and font properties. For large documents, use {@link com.trolltech.qt.gui.QTextEdit QTextEdit} in read-only mode instead. {@link com.trolltech.qt.gui.QTextEdit QTextEdit} can also provide a scroll bar when necessary. <p><b>Note:</b> This function enables mouse tracking if <tt>text</tt> contains rich text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#setTextFormat(com.trolltech.qt.core.Qt.TextFormat) setTextFormat()}, {@link com.trolltech.qt.gui.QLabel#setBuddy(com.trolltech.qt.gui.QWidget) setBuddy()}, and {@link QLabel#alignment() alignment}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="text")
    public final void setText(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String(nativeId(), arg__1);
    }
    native void __qt_setText_String(long __this__nativeId, java.lang.String arg__1);

/**
This property holds the label's text format. See the {@link com.trolltech.qt.core.Qt.TextFormat Qt::TextFormat } enum for an explanation of the possible options. <p>The default format is {@link com.trolltech.qt.core.Qt.TextFormat Qt::AutoText }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#text() text()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="textFormat")
    @QtBlockedSlot
    public final void setTextFormat(com.trolltech.qt.core.Qt.TextFormat arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextFormat_TextFormat(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native void __qt_setTextFormat_TextFormat(long __this__nativeId, int arg__1);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setTextInteractionFlags(com.trolltech.qt.core.Qt.TextInteractionFlag ... flags) {
        this.setTextInteractionFlags(new com.trolltech.qt.core.Qt.TextInteractionFlags(flags));
    }
/**
Specifies how the label should interact with user input if it displays text. <p>If the flags contain {@link com.trolltech.qt.core.Qt.TextInteractionFlag Qt::LinksAccessibleByKeyboard } the focus policy is also automatically set to {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::StrongFocus }. If {@link com.trolltech.qt.core.Qt.TextInteractionFlag Qt::TextSelectableByKeyboard } is set then the focus policy is set to {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::ClickFocus }. <p>The default value is {@link com.trolltech.qt.core.Qt.TextInteractionFlag Qt::LinksAccessibleByMouse }.
*/

    @com.trolltech.qt.QtPropertyWriter(name="textInteractionFlags")
    @QtBlockedSlot
    public final void setTextInteractionFlags(com.trolltech.qt.core.Qt.TextInteractionFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextInteractionFlags_TextInteractionFlags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_setTextInteractionFlags_TextInteractionFlags(long __this__nativeId, int flags);

/**
This property holds the label's word-wrapping policy. If this property is true then label text is wrapped where necessary at word-breaks; otherwise it is not wrapped at all. <p>By default, word wrap is disabled. <p><DT><b>See also:</b><br><DD>{@link QLabel#text() text}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="wordWrap")
    @QtBlockedSlot
    public final void setWordWrap(boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWordWrap_boolean(nativeId(), on);
    }
    @QtBlockedSlot
    native void __qt_setWordWrap_boolean(long __this__nativeId, boolean on);

/**
This property holds the label's text. If no text has been set this will return an empty string. Setting the text clears any previous content. <p>The text will be interpreted either as plain text or as rich text, depending on the text format setting; see {@link com.trolltech.qt.gui.QLabel#setTextFormat(com.trolltech.qt.core.Qt.TextFormat) setTextFormat()}. The default setting is {@link com.trolltech.qt.core.Qt.TextFormat Qt::AutoText }; i.e. QLabel will try to auto-detect the format of the text set. <p>If a buddy has been set, the buddy mnemonic key is updated from the new text. <p>Note that QLabel is well-suited to display small rich text documents, such as small documents that get their document specific settings (font, text color, link color) from the label's palette and font properties. For large documents, use {@link com.trolltech.qt.gui.QTextEdit QTextEdit} in read-only mode instead. {@link com.trolltech.qt.gui.QTextEdit QTextEdit} can also provide a scroll bar when necessary. <p><b>Note:</b> This function enables mouse tracking if <tt>text</tt> contains rich text. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#setTextFormat(com.trolltech.qt.core.Qt.TextFormat) setTextFormat()}, {@link com.trolltech.qt.gui.QLabel#setBuddy(com.trolltech.qt.gui.QWidget) setBuddy()}, and {@link QLabel#alignment() alignment}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="text")
    @QtBlockedSlot
    public final java.lang.String text()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
This property holds the label's text format. See the {@link com.trolltech.qt.core.Qt.TextFormat Qt::TextFormat } enum for an explanation of the possible options. <p>The default format is {@link com.trolltech.qt.core.Qt.TextFormat Qt::AutoText }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QLabel#text() text()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="textFormat")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.TextFormat textFormat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.TextFormat.resolve(__qt_textFormat(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_textFormat(long __this__nativeId);

/**
Specifies how the label should interact with user input if it displays text. <p>If the flags contain {@link com.trolltech.qt.core.Qt.TextInteractionFlag Qt::LinksAccessibleByKeyboard } the focus policy is also automatically set to {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::StrongFocus }. If {@link com.trolltech.qt.core.Qt.TextInteractionFlag Qt::TextSelectableByKeyboard } is set then the focus policy is set to {@link com.trolltech.qt.core.Qt.FocusPolicy Qt::ClickFocus }. <p>The default value is {@link com.trolltech.qt.core.Qt.TextInteractionFlag Qt::LinksAccessibleByMouse }.
*/

    @com.trolltech.qt.QtPropertyReader(name="textInteractionFlags")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.TextInteractionFlags textInteractionFlags()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.TextInteractionFlags(__qt_textInteractionFlags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_textInteractionFlags(long __this__nativeId);

/**
This property holds the label's word-wrapping policy. If this property is true then label text is wrapped where necessary at word-breaks; otherwise it is not wrapped at all. <p>By default, word wrap is disabled. <p><DT><b>See also:</b><br><DD>{@link QLabel#text() text}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="wordWrap")
    @QtBlockedSlot
    public final boolean wordWrap()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_wordWrap(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_wordWrap(long __this__nativeId);

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
    protected void contextMenuEvent(com.trolltech.qt.gui.QContextMenuEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_contextMenuEvent_QContextMenuEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_contextMenuEvent_QContextMenuEvent(long __this__nativeId, long ev);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusInEvent(com.trolltech.qt.gui.QFocusEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusInEvent_QFocusEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusInEvent_QFocusEvent(long __this__nativeId, long ev);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void focusOutEvent(com.trolltech.qt.gui.QFocusEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_focusOutEvent_QFocusEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_focusOutEvent_QFocusEvent(long __this__nativeId, long ev);

/**
This method is internal to Qt Jambi. 

	@exclude
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void keyPressEvent(com.trolltech.qt.gui.QKeyEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_keyPressEvent_QKeyEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_keyPressEvent_QKeyEvent(long __this__nativeId, long ev);

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
    protected void mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseMoveEvent_QMouseEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseMoveEvent_QMouseEvent(long __this__nativeId, long ev);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mousePressEvent(com.trolltech.qt.gui.QMouseEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mousePressEvent_QMouseEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mousePressEvent_QMouseEvent(long __this__nativeId, long ev);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void mouseReleaseEvent(com.trolltech.qt.gui.QMouseEvent ev)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mouseReleaseEvent_QMouseEvent(nativeId(), ev == null ? 0 : ev.nativeId());
    }
    @QtBlockedSlot
    native void __qt_mouseReleaseEvent_QMouseEvent(long __this__nativeId, long ev);

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
    public com.trolltech.qt.core.QSize sizeHint()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sizeHint(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_sizeHint(long __this__nativeId);

/**
@exclude
*/

    public static native QLabel fromNativePointer(QNativePointer nativePointer);

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

    protected QLabel(QPrivateConstructor p) { super(p); } 

    // TEMPLATE - gui.getter_returning_nativepointer - START
/**
Returns the label's picture or null if the label doesn't have a picture.
*/

    public final QPicture picture() {
        QNativePointer np = picture_private();
        QPicture tmp = np == null ? null : QPicture.fromNativePointer(np);
        return tmp == null ? null : new QPicture(tmp);
    }

    // TEMPLATE - gui.getter_returning_nativepointer - END


    // TEMPLATE - gui.getter_returning_nativepointer - START
/**
Returns the label's pixmap or null if the label doesn't have a picture.
*/

    public final QPixmap pixmap() {
        QNativePointer np = pixmap_private();
        QPixmap tmp = np == null ? null : QPixmap.fromNativePointer(np);
        return tmp == null ? null : new QPixmap(tmp);
    }

    // TEMPLATE - gui.getter_returning_nativepointer - END

}
