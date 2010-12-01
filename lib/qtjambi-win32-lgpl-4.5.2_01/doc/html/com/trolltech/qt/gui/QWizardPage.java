package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QWizardPage class is the base class for wizard pages. {@link com.trolltech.qt.gui.QWizard QWizard} represents a wizard. Each page is a QWizardPage. When you create your own wizards, you can use QWizardPage directly, or you can subclass it for more control. <p>A page has the following attributes, which are rendered by {@link com.trolltech.qt.gui.QWizard QWizard}: a {@link QWizardPage#title() title}, a {@link QWizardPage#subTitle() subTitle}, and a {@link com.trolltech.qt.gui.QWizardPage#setPixmap(com.trolltech.qt.gui.QWizard.WizardPixmap, com.trolltech.qt.gui.QPixmap) set of pixmaps}. See {@link com.trolltech.qt.gui.QWizard Elements of a Wizard Page} for details. Once a page is added to the wizard (using {@link com.trolltech.qt.gui.QWizard#addPage(com.trolltech.qt.gui.QWizardPage) QWizard::addPage()} or {@link com.trolltech.qt.gui.QWizard#setPage(int, com.trolltech.qt.gui.QWizardPage) QWizard::setPage()}), {@link com.trolltech.qt.gui.QWizardPage#wizard() wizard()} returns a pointer to the associated {@link com.trolltech.qt.gui.QWizard QWizard} object. <p>Page provides five virtual functions that can be reimplemented to provide custom behavior: <ul><li> {@link com.trolltech.qt.gui.QWizardPage#initializePage() initializePage()} is called to initialize the page's contents when the user clicks the wizard's <b>Next</b> button. If you want to derive the page's default from what the user entered on previous pages, this is the function to reimplement.</li><li> {@link com.trolltech.qt.gui.QWizardPage#cleanupPage() cleanupPage()} is called to reset the page's contents when the user clicks the wizard's <b>Back</b> button.</li><li> {@link com.trolltech.qt.gui.QWizardPage#validatePage() validatePage()} validates the page when the user clicks <b>Next</b> or <b>Finish</b>. It is often used to show an error message if the user has entered incomplete or invalid information.</li><li> {@link com.trolltech.qt.gui.QWizardPage#nextId() nextId()} returns the ID of the next page. It is useful when {@link com.trolltech.qt.gui.QWizard creating non-linear wizards}, which allow different traversal paths based on the information provided by the user.</li><li> {@link com.trolltech.qt.gui.QWizardPage#isComplete() isComplete()} is called to determine whether the <b>Next</b> and/or <b>Finish</b> button should be enabled or disabled. If you reimplement {@link com.trolltech.qt.gui.QWizardPage#isComplete() isComplete()}, also make sure that {@link com.trolltech.qt.gui.QWizardPage#completeChanged completeChanged() } is emitted whenever the complete state changes.</li></ul> Normally, the <b>Next</b> button and the <b>Finish</b> button of a wizard are mutually exclusive. If {@link com.trolltech.qt.gui.QWizardPage#isFinalPage() isFinalPage()} returns true, <b>Finish</b> is available; otherwise, <b>Next</b> is available. By default, {@link com.trolltech.qt.gui.QWizardPage#isFinalPage() isFinalPage()} is true only when {@link com.trolltech.qt.gui.QWizardPage#nextId() nextId()} returns -1. If you want to show <b>Next</b> and <b>Final</b> simultaneously for a page (letting the user perform an "early finish"), call setFinalPage(true) on that page. For wizards that support early finishes, you might also want to set the {@link com.trolltech.qt.gui.QWizard.WizardOption HaveNextButtonOnLastPage } and {@link com.trolltech.qt.gui.QWizard.WizardOption HaveFinishButtonOnEarlyPages } options on the wizard. <p>In many wizards, the contents of a page may affect the default values of the fields of a later page. To make it easy to communicate between pages, {@link com.trolltech.qt.gui.QWizard QWizard} supports a {@link com.trolltech.qt.gui.QWizard "field" mechanism} that allows you to register a field (e.g., a {@link com.trolltech.qt.gui.QLineEdit QLineEdit}) on a page and to access its value from any page. Fields are global to the entire wizard and make it easy for any single page to access information stored by another page, without having to put all the logic in {@link com.trolltech.qt.gui.QWizard QWizard} or having the pages know explicitly about each other. Fields are registered using {@link com.trolltech.qt.gui.QWizardPage#registerField(java.lang.String, com.trolltech.qt.gui.QWidget) registerField()} and can be accessed at any time using {@link com.trolltech.qt.gui.QWizardPage#field(java.lang.String) field()} and {@link com.trolltech.qt.gui.QWizardPage#setField(java.lang.String, java.lang.Object) setField()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard QWizard}, {@link <a href="../dialogs-classwizard.html">Class Wizard Example</a>}, and {@link <a href="../dialogs-licensewizard.html">License Wizard Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QWizardPage extends com.trolltech.qt.gui.QWidget
{
/**
 This signal is emitted whenever the complete state of the page (i. ., the value of {@link com.trolltech.qt.gui.QWizardPage#isComplete() isComplete()}) changes. <p>If you reimplement {@link com.trolltech.qt.gui.QWizardPage#isComplete() isComplete()}, make sure to emit {@link com.trolltech.qt.gui.QWizardPage#completeChanged completeChanged() } whenever the value of {@link com.trolltech.qt.gui.QWizardPage#isComplete() isComplete()} changes, to ensure that {@link com.trolltech.qt.gui.QWizard QWizard} updates the enabled or disabled state of its buttons. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#isComplete() isComplete()}. <br></DD></DT>
*/

    public final Signal0 completeChanged = new Signal0();

    private final void completeChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_completeChanged(nativeId());
    }
    native void __qt_completeChanged(long __this__nativeId);


/**
Constructs a wizard page with the given <tt>parent</tt>. <p>When the page is inserted into a wizard using {@link com.trolltech.qt.gui.QWizard#addPage(com.trolltech.qt.gui.QWizardPage) QWizard::addPage()} or {@link com.trolltech.qt.gui.QWizard#setPage(int, com.trolltech.qt.gui.QWizardPage) QWizard::setPage()}, the parent is automatically set to be the wizard. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#wizard() wizard()}. <br></DD></DT>
*/

    public QWizardPage() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
/**
Constructs a wizard page with the given <tt>parent</tt>. <p>When the page is inserted into a wizard using {@link com.trolltech.qt.gui.QWizard#addPage(com.trolltech.qt.gui.QWizardPage) QWizard::addPage()} or {@link com.trolltech.qt.gui.QWizard#setPage(int, com.trolltech.qt.gui.QWizardPage) QWizard::setPage()}, the parent is automatically set to be the wizard. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#wizard() wizard()}. <br></DD></DT>
*/

    public QWizardPage(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QWizardPage_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QWizardPage_QWidget(long parent);

/**
Returns the text on button <tt>which</tt> on this page. <p>If a text has ben set using {@link com.trolltech.qt.gui.QWizardPage#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) setButtonText()}, this text is returned. Otherwise, if a text has been set using {@link com.trolltech.qt.gui.QWizard#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) QWizard::setButtonText()}, this text is returned. <p>By default, the text on buttons depends on the {@link QWizard#wizardStyle() QWizard::wizardStyle}. For example, on Mac OS X, the <b>Next</b> button is called <b>Continue</b>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) setButtonText()}, {@link com.trolltech.qt.gui.QWizard#buttonText(com.trolltech.qt.gui.QWizard.WizardButton) QWizard::buttonText()}, and {@link com.trolltech.qt.gui.QWizard#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) QWizard::setButtonText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String buttonText(com.trolltech.qt.gui.QWizard.WizardButton which)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_buttonText_WizardButton(nativeId(), which.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_buttonText_WizardButton(long __this__nativeId, int which);

/**
Returns the value of the field called <tt>name</tt>. <p>This function can be used to access fields on any page of the wizard. It is equivalent to calling {@link com.trolltech.qt.gui.QWizardPage#wizard() wizard()}-&gt;{@link com.trolltech.qt.gui.QWizard#field(java.lang.String) field(name}<tt>name</tt>). <p>Example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
void OutputFilesPage::initializePage()
{
    QString className = field("className").toString();
    headerLineEdit-&gt;setText(className.toLower() + ".h");
    implementationLineEdit-&gt;setText(className.toLower() + ".cpp");
    outputDirLineEdit-&gt;setText(QDir::convertSeparators(QDir::tempPath()));
}
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#field(java.lang.String) QWizard::field()}, {@link com.trolltech.qt.gui.QWizardPage#setField(java.lang.String, java.lang.Object) setField()}, and {@link com.trolltech.qt.gui.QWizardPage#registerField(java.lang.String, com.trolltech.qt.gui.QWidget) registerField()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final java.lang.Object field(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_field_String(nativeId(), name);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_field_String(long __this__nativeId, java.lang.String name);

/**
Returns true if this page is a commit page; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#setCommitPage(boolean) setCommitPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isCommitPage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCommitPage(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCommitPage(long __this__nativeId);

/**
This function is called by {@link com.trolltech.qt.gui.QWizard QWizard} to determine whether the <b>Finish</b> button should be shown for this page or not. <p>By default, it returns true if there is no next page (i.e., {@link com.trolltech.qt.gui.QWizardPage#nextId() nextId()} returns -1); otherwise, it returns false. <p>By explicitly calling setFinalPage(true), you can let the user perform an "early finish". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#isComplete() isComplete()}, and {@link com.trolltech.qt.gui.QWizard.WizardOption QWizard::HaveFinishButtonOnEarlyPages }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isFinalPage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFinalPage(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFinalPage(long __this__nativeId);

/**
Returns the pixmap set for role <tt>which</tt>. <p>Pixmaps can also be set for the entire wizard using {@link com.trolltech.qt.gui.QWizard#setPixmap(com.trolltech.qt.gui.QWizard.WizardPixmap, com.trolltech.qt.gui.QPixmap) QWizard::setPixmap()}, in which case they apply for all pages that don't specify a pixmap. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#setPixmap(com.trolltech.qt.gui.QWizard.WizardPixmap, com.trolltech.qt.gui.QPixmap) setPixmap()}, {@link com.trolltech.qt.gui.QWizard#pixmap(com.trolltech.qt.gui.QWizard.WizardPixmap) QWizard::pixmap()}, and {@link com.trolltech.qt.gui.QWizard Elements of a Wizard Page}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap(com.trolltech.qt.gui.QWizard.WizardPixmap which)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixmap_WizardPixmap(nativeId(), which.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_pixmap_WizardPixmap(long __this__nativeId, int which);

    @QtBlockedSlot
    private final void registerField(java.lang.String name, com.trolltech.qt.gui.QWidget widget, com.trolltech.qt.QNativePointer property, com.trolltech.qt.QNativePointer changedSignal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_registerField_String_QWidget_nativepointer_nativepointer(nativeId(), name, widget == null ? 0 : widget.nativeId(), property, changedSignal);
    }
    @QtBlockedSlot
    native void __qt_registerField_String_QWidget_nativepointer_nativepointer(long __this__nativeId, java.lang.String name, long widget, com.trolltech.qt.QNativePointer property, com.trolltech.qt.QNativePointer changedSignal);

/**
Sets the text on button <tt>which</tt> to be <tt>text</tt> on this page. <p>By default, the text on buttons depends on the {@link QWizard#wizardStyle() QWizard::wizardStyle}, but may be redefined for the wizard as a whole using {@link com.trolltech.qt.gui.QWizard#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) QWizard::setButtonText()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#buttonText(com.trolltech.qt.gui.QWizard.WizardButton) buttonText()}, {@link com.trolltech.qt.gui.QWizard#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) QWizard::setButtonText()}, and {@link com.trolltech.qt.gui.QWizard#buttonText(com.trolltech.qt.gui.QWizard.WizardButton) QWizard::buttonText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setButtonText(com.trolltech.qt.gui.QWizard.WizardButton which, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setButtonText_WizardButton_String(nativeId(), which.value(), text);
    }
    @QtBlockedSlot
    native void __qt_setButtonText_WizardButton_String(long __this__nativeId, int which, java.lang.String text);

/**
Sets this page to be a commit page if <tt>commitPage</tt> is true; otherwise, sets it to be a normal page. <p>A commit page is a page that represents an action which cannot be undone by clicking <b>Back</b> or <b>Cancel</b>. <p>A <b>Commit</b> button replaces the <b>Next</b> button on a commit page. Clicking this button simply calls {@link com.trolltech.qt.gui.QWizard#next() QWizard::next()} just like clicking <b>Next</b> does. <p>A page entered directly from a commit page has its <b>Back</b> button disabled. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#isCommitPage() isCommitPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCommitPage(boolean commitPage)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCommitPage_boolean(nativeId(), commitPage);
    }
    @QtBlockedSlot
    native void __qt_setCommitPage_boolean(long __this__nativeId, boolean commitPage);

/**
Sets the value of the field called <tt>name</tt> to <tt>value</tt>. <p>This function can be used to set fields on any page of the wizard. It is equivalent to calling {@link com.trolltech.qt.gui.QWizardPage#wizard() wizard()}-&gt;{@link com.trolltech.qt.gui.QWizard#setField(java.lang.String, java.lang.Object) setField(name}<tt>name</tt>, <tt>value</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#setField(java.lang.String, java.lang.Object) QWizard::setField()}, {@link com.trolltech.qt.gui.QWizardPage#field(java.lang.String) field()}, and {@link com.trolltech.qt.gui.QWizardPage#registerField(java.lang.String, com.trolltech.qt.gui.QWidget) registerField()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setField(java.lang.String name, java.lang.Object value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setField_String_Object(nativeId(), name, value);
    }
    @QtBlockedSlot
    native void __qt_setField_String_Object(long __this__nativeId, java.lang.String name, java.lang.Object value);

/**
Explicitly sets this page to be final if <tt>finalPage</tt> is true. <p>After calling setFinalPage(true), {@link com.trolltech.qt.gui.QWizardPage#isFinalPage() isFinalPage()} returns true and the <b>Finish</b> button is visible (and enabled if {@link com.trolltech.qt.gui.QWizardPage#isComplete() isComplete()} returns true). <p>After calling setFinalPage(false), {@link com.trolltech.qt.gui.QWizardPage#isFinalPage() isFinalPage()} returns true if {@link com.trolltech.qt.gui.QWizardPage#nextId() nextId()} returns -1; otherwise, it returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#isFinalPage() isFinalPage()}, {@link com.trolltech.qt.gui.QWizardPage#isComplete() isComplete()}, and {@link com.trolltech.qt.gui.QWizard.WizardOption QWizard::HaveFinishButtonOnEarlyPages }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFinalPage(boolean finalPage)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFinalPage_boolean(nativeId(), finalPage);
    }
    @QtBlockedSlot
    native void __qt_setFinalPage_boolean(long __this__nativeId, boolean finalPage);

/**
Sets the pixmap for role <tt>which</tt> to <tt>pixmap</tt>. <p>The pixmaps are used by {@link com.trolltech.qt.gui.QWizard QWizard} when displaying a page. Which pixmaps are actually used depend on the {@link com.trolltech.qt.gui.QWizard wizard style}. <p>Pixmaps can also be set for the entire wizard using {@link com.trolltech.qt.gui.QWizard#setPixmap(com.trolltech.qt.gui.QWizard.WizardPixmap, com.trolltech.qt.gui.QPixmap) QWizard::setPixmap()}, in which case they apply for all pages that don't specify a pixmap. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#pixmap(com.trolltech.qt.gui.QWizard.WizardPixmap) pixmap()}, {@link com.trolltech.qt.gui.QWizard#setPixmap(com.trolltech.qt.gui.QWizard.WizardPixmap, com.trolltech.qt.gui.QPixmap) QWizard::setPixmap()}, and {@link com.trolltech.qt.gui.QWizard Elements of a Wizard Page}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPixmap(com.trolltech.qt.gui.QWizard.WizardPixmap which, com.trolltech.qt.gui.QPixmap pixmap)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPixmap_WizardPixmap_QPixmap(nativeId(), which.value(), pixmap == null ? 0 : pixmap.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPixmap_WizardPixmap_QPixmap(long __this__nativeId, int which, long pixmap);

/**
This property holds the subtitle of the page. The subtitle is shown by the {@link com.trolltech.qt.gui.QWizard QWizard}, between the title and the actual page. Subtitles are optional. In {@link com.trolltech.qt.gui.QWizard.WizardStyle ClassicStyle } and {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle }, using subtitles is necessary to make the header appear. In {@link com.trolltech.qt.gui.QWizard.WizardStyle MacStyle }, the subtitle is shown as a text label just above the actual page. <p>The subtitle may be plain text or HTML, depending on the value of the {@link QWizard#subTitleFormat() QWizard::subTitleFormat} property. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QWizardPage#title() title}, {@link com.trolltech.qt.gui.QWizard.WizardOption QWizard::IgnoreSubTitles }, and {@link com.trolltech.qt.gui.QWizard Elements of a Wizard Page}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="subTitle")
    @QtBlockedSlot
    public final void setSubTitle(java.lang.String subTitle)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSubTitle_String(nativeId(), subTitle);
    }
    @QtBlockedSlot
    native void __qt_setSubTitle_String(long __this__nativeId, java.lang.String subTitle);

/**
This property holds the title of the page. The title is shown by the {@link com.trolltech.qt.gui.QWizard QWizard}, above the actual page. All pages should have a title. <p>The title may be plain text or HTML, depending on the value of the {@link QWizard#titleFormat() QWizard::titleFormat} property. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QWizardPage#subTitle() subTitle}, and {@link com.trolltech.qt.gui.QWizard Elements of a Wizard Page}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="title")
    @QtBlockedSlot
    public final void setTitle(java.lang.String title)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTitle_String(nativeId(), title);
    }
    @QtBlockedSlot
    native void __qt_setTitle_String(long __this__nativeId, java.lang.String title);

/**
This property holds the subtitle of the page. The subtitle is shown by the {@link com.trolltech.qt.gui.QWizard QWizard}, between the title and the actual page. Subtitles are optional. In {@link com.trolltech.qt.gui.QWizard.WizardStyle ClassicStyle } and {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle }, using subtitles is necessary to make the header appear. In {@link com.trolltech.qt.gui.QWizard.WizardStyle MacStyle }, the subtitle is shown as a text label just above the actual page. <p>The subtitle may be plain text or HTML, depending on the value of the {@link QWizard#subTitleFormat() QWizard::subTitleFormat} property. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QWizardPage#title() title}, {@link com.trolltech.qt.gui.QWizard.WizardOption QWizard::IgnoreSubTitles }, and {@link com.trolltech.qt.gui.QWizard Elements of a Wizard Page}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="subTitle")
    @QtBlockedSlot
    public final java.lang.String subTitle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subTitle(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_subTitle(long __this__nativeId);

/**
This property holds the title of the page. The title is shown by the {@link com.trolltech.qt.gui.QWizard QWizard}, above the actual page. All pages should have a title. <p>The title may be plain text or HTML, depending on the value of the {@link QWizard#titleFormat() QWizard::titleFormat} property. <p>By default, this property contains an empty string. <p><DT><b>See also:</b><br><DD>{@link QWizardPage#subTitle() subTitle}, and {@link com.trolltech.qt.gui.QWizard Elements of a Wizard Page}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="title")
    @QtBlockedSlot
    public final java.lang.String title()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_title(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_title(long __this__nativeId);

/**
Returns the wizard associated with this page, or 0 if this page hasn't been inserted into a {@link com.trolltech.qt.gui.QWizard QWizard} yet. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#addPage(com.trolltech.qt.gui.QWizardPage) QWizard::addPage()}, and {@link com.trolltech.qt.gui.QWizard#setPage(int, com.trolltech.qt.gui.QWizardPage) QWizard::setPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QWizard wizard()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_wizard(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWizard __qt_wizard(long __this__nativeId);

/**
This virtual function is called by {@link com.trolltech.qt.gui.QWizard#cleanupPage(int) QWizard::cleanupPage()} when the user leaves the page by clicking <b>Back</b> (unless the {@link com.trolltech.qt.gui.QWizard.WizardOption QWizard::IndependentPages } option is set). <p>The default implementation resets the page's fields to their original values (the values they had before {@link com.trolltech.qt.gui.QWizardPage#initializePage() initializePage()} was called). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#cleanupPage(int) QWizard::cleanupPage()}, {@link com.trolltech.qt.gui.QWizardPage#initializePage() initializePage()}, and {@link com.trolltech.qt.gui.QWizard.WizardOption QWizard::IndependentPages }. <br></DD></DT>
*/

    @QtBlockedSlot
    public void cleanupPage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cleanupPage(nativeId());
    }
    @QtBlockedSlot
    native void __qt_cleanupPage(long __this__nativeId);

/**
This virtual function is called by {@link com.trolltech.qt.gui.QWizard#initializePage(int) QWizard::initializePage()} to prepare the page just before it is shown either as a result of {@link com.trolltech.qt.gui.QWizard#restart() QWizard::restart()} being called, or as a result of the user clicking <b>Next</b>. (However, if the {@link com.trolltech.qt.gui.QWizard.WizardOption QWizard::IndependentPages } option is set, this function is only called the first time the page is shown.) <p>By reimplementing this function, you can ensure that the page's fields are properly initialized based on fields from previous pages. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
void OutputFilesPage::initializePage()
{
    QString className = field("className").toString();
    headerLineEdit-&gt;setText(className.toLower() + ".h");
    implementationLineEdit-&gt;setText(className.toLower() + ".cpp");
    outputDirLineEdit-&gt;setText(QDir::convertSeparators(QDir::tempPath()));
}
</pre> The default implementation does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#initializePage(int) QWizard::initializePage()}, {@link com.trolltech.qt.gui.QWizardPage#cleanupPage() cleanupPage()}, and {@link com.trolltech.qt.gui.QWizard.WizardOption QWizard::IndependentPages }. <br></DD></DT>
*/

    @QtBlockedSlot
    public void initializePage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initializePage(nativeId());
    }
    @QtBlockedSlot
    native void __qt_initializePage(long __this__nativeId);

/**
This virtual function is called by {@link com.trolltech.qt.gui.QWizard QWizard} to determine whether the <b>Next</b> or <b>Finish</b> button should be enabled or disabled. <p>The default implementation returns true if all {@link com.trolltech.qt.gui.QWizard mandatory fields} are filled; otherwise, it returns false. <p>If you reimplement this function, make sure to emit {@link com.trolltech.qt.gui.QWizardPage#completeChanged completeChanged() }, from the rest of your implementation, whenever the value of {@link com.trolltech.qt.gui.QWizardPage#isComplete() isComplete()} changes. This ensures that {@link com.trolltech.qt.gui.QWizard QWizard} updates the enabled or disabled state of its buttons. An example of the reimplementation is available here. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#completeChanged completeChanged() }, and {@link com.trolltech.qt.gui.QWizardPage#isFinalPage() isFinalPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean isComplete()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isComplete(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isComplete(long __this__nativeId);

/**
This virtual function is called by {@link com.trolltech.qt.gui.QWizard#nextId() QWizard::nextId()} to find out which page to show when the user clicks the <b>Next</b> button. <p>The return value is the ID of the next page, or -1 if no page follows. <p>By default, this function returns the lowest ID greater than the ID of the current page, or -1 if there is no such ID. <p>By reimplementing this function, you can specify a dynamic page order. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
int IntroPage::nextId() const
 
{
    if (evaluateRadioButton-&gt;isChecked()) {
        return LicenseWizard::Page_Evaluate;
    } else {
        return LicenseWizard::Page_Register;
    }
}
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#nextId() QWizard::nextId()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public int nextId()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nextId(nativeId());
    }
    @QtBlockedSlot
    native int __qt_nextId(long __this__nativeId);

/**
This virtual function is called by {@link com.trolltech.qt.gui.QWizard#validateCurrentPage() QWizard::validateCurrentPage()} when the user clicks <b>Next</b> or <b>Finish</b> to perform some last-minute validation. If it returns true, the next page is shown (or the wizard finishes); otherwise, the current page stays up. <p>The default implementation returns true. <p>When possible, it is usually better style to disable the <b>Next</b> or <b>Finish</b> button (by specifying {@link com.trolltech.qt.gui.QWizard mandatory fields} or reimplementing {@link com.trolltech.qt.gui.QWizardPage#isComplete() isComplete()}) than to reimplement {@link com.trolltech.qt.gui.QWizardPage#validatePage() validatePage()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#validateCurrentPage() QWizard::validateCurrentPage()}, and {@link com.trolltech.qt.gui.QWizardPage#isComplete() isComplete()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean validatePage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_validatePage(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_validatePage(long __this__nativeId);

/**
@exclude
*/

    public static native QWizardPage fromNativePointer(QNativePointer nativePointer);

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

    protected QWizardPage(QPrivateConstructor p) { super(p); } 

/**
Creates a field called <tt>name</tt> associated with the given <tt>property</tt> of the given <tt>widget</tt>. From then on, that property becomes accessible using {@link com.trolltech.qt.gui.QWizardPage#field(java.lang.String) field()} and {@link com.trolltech.qt.gui.QWizardPage#setField(java.lang.String, java.lang.Object) setField()}. <p>Fields are global to the entire wizard and make it easy for any single page to access information stored by another page, without having to put all the logic in {@link com.trolltech.qt.gui.QWizard QWizard} or having the pages know explicitly about each other. <p>If <tt>name</tt> ends with an asterisk (<tt>*</tt>), the field is a mandatory field. When a page has mandatory fields, the <b>Next</b> and/or <b>Finish</b> buttons are enabled only when all mandatory fields are filled. This requires a <tt>changedSignal</tt> to be specified, to tell {@link com.trolltech.qt.gui.QWizard QWizard} to recheck the value stored by the mandatory field. <p>{@link com.trolltech.qt.gui.QWizard QWizard} knows the most common Qt widgets. For these (or their subclasses), you don't need to specify a <tt>property</tt> or a <tt>changedSignal</tt>. The table below lists these widgets: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Widget</center></th><th><center> Property</center></th><th><center> Change Notification Signal</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton}</td><td> bool {@link QAbstractButton#isChecked() checked}</td><td> {@link com.trolltech.qt.gui.QAbstractButton#toggled  }</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QAbstractSlider QAbstractSlider}</td><td> int {@link QAbstractSlider#value() value}</td><td> {@link com.trolltech.qt.gui.QAbstractSlider#valueChanged  }</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QComboBox QComboBox}</td><td> int {@link QComboBox#currentIndex() }</td><td> {@link com.trolltech.qt.gui.QComboBox#currentIndexChanged  }</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit}</td><td> {@link com.trolltech.qt.core.QDateTime QDateTime}{@link QDateTimeEdit#dateTime() }</td><td> {@link com.trolltech.qt.gui.QDateTimeEdit#dateTimeChanged  }</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QLineEdit QLineEdit}</td><td> QString{@link QLineEdit#text() text}</td><td> {@link com.trolltech.qt.gui.QLineEdit#textChanged  }</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QListWidget QListWidget}</td><td> int {@link QListWidget#currentRow() }</td><td> {@link com.trolltech.qt.gui.QListWidget#currentRowChanged  }</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QSpinBox QSpinBox}</td><td> int {@link QSpinBox#value() value}</td><td> {@link com.trolltech.qt.gui.QSpinBox#valueChanged  }</td></tr></table> You can use QWizard::setDefaultProperty() to add entries to this table or to override existing entries. <p>To consider a field "filled", {@link com.trolltech.qt.gui.QWizard QWizard} simply checks that their current value doesn't equal their original value (the value they had before {@link com.trolltech.qt.gui.QWizardPage#initializePage() initializePage()} was called). For {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, it also checks that {@link QLineEdit#hasAcceptableInput() } returns true, to honor any validator or mask. <p>{@link com.trolltech.qt.gui.QWizard QWizard}'s mandatory field mechanism is provided for convenience. It can be bypassed by reimplementing {@link com.trolltech.qt.gui.QWizardPage#isComplete() QWizardPage::isComplete()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#field(java.lang.String) field()}, {@link com.trolltech.qt.gui.QWizardPage#setField(java.lang.String, java.lang.Object) setField()}, and QWizard::setDefaultProperty(). <br></DD></DT>
*/

    protected final void registerField(String name, QWidget widget) {
        registerField(name, widget, (com.trolltech.qt.QNativePointer) null, (com.trolltech.qt.QNativePointer) null);
    }

/**
Creates a field called <tt>name</tt> associated with the given <tt>property</tt> of the given <tt>widget</tt>. From then on, that property becomes accessible using {@link com.trolltech.qt.gui.QWizardPage#field(java.lang.String) field()} and {@link com.trolltech.qt.gui.QWizardPage#setField(java.lang.String, java.lang.Object) setField()}. <p>Fields are global to the entire wizard and make it easy for any single page to access information stored by another page, without having to put all the logic in {@link com.trolltech.qt.gui.QWizard QWizard} or having the pages know explicitly about each other. <p>If <tt>name</tt> ends with an asterisk (<tt>*</tt>), the field is a mandatory field. When a page has mandatory fields, the <b>Next</b> and/or <b>Finish</b> buttons are enabled only when all mandatory fields are filled. This requires a <tt>changedSignal</tt> to be specified, to tell {@link com.trolltech.qt.gui.QWizard QWizard} to recheck the value stored by the mandatory field. <p>{@link com.trolltech.qt.gui.QWizard QWizard} knows the most common Qt widgets. For these (or their subclasses), you don't need to specify a <tt>property</tt> or a <tt>changedSignal</tt>. The table below lists these widgets: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Widget</center></th><th><center> Property</center></th><th><center> Change Notification Signal</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QAbstractButton QAbstractButton}</td><td> bool {@link QAbstractButton#isChecked() checked}</td><td> {@link com.trolltech.qt.gui.QAbstractButton#toggled  }</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QAbstractSlider QAbstractSlider}</td><td> int {@link QAbstractSlider#value() value}</td><td> {@link com.trolltech.qt.gui.QAbstractSlider#valueChanged  }</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QComboBox QComboBox}</td><td> int {@link QComboBox#currentIndex() }</td><td> {@link com.trolltech.qt.gui.QComboBox#currentIndexChanged  }</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QDateTimeEdit QDateTimeEdit}</td><td> {@link com.trolltech.qt.core.QDateTime QDateTime}{@link QDateTimeEdit#dateTime() }</td><td> {@link com.trolltech.qt.gui.QDateTimeEdit#dateTimeChanged  }</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QLineEdit QLineEdit}</td><td> QString{@link QLineEdit#text() text}</td><td> {@link com.trolltech.qt.gui.QLineEdit#textChanged  }</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.gui.QListWidget QListWidget}</td><td> int {@link QListWidget#currentRow() }</td><td> {@link com.trolltech.qt.gui.QListWidget#currentRowChanged  }</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.gui.QSpinBox QSpinBox}</td><td> int {@link QSpinBox#value() value}</td><td> {@link com.trolltech.qt.gui.QSpinBox#valueChanged  }</td></tr></table> You can use QWizard::setDefaultProperty() to add entries to this table or to override existing entries. <p>To consider a field "filled", {@link com.trolltech.qt.gui.QWizard QWizard} simply checks that their current value doesn't equal their original value (the value they had before {@link com.trolltech.qt.gui.QWizardPage#initializePage() initializePage()} was called). For {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, it also checks that {@link QLineEdit#hasAcceptableInput() } returns true, to honor any validator or mask. <p>{@link com.trolltech.qt.gui.QWizard QWizard}'s mandatory field mechanism is provided for convenience. It can be bypassed by reimplementing {@link com.trolltech.qt.gui.QWizardPage#isComplete() QWizardPage::isComplete()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#field(java.lang.String) field()}, {@link com.trolltech.qt.gui.QWizardPage#setField(java.lang.String, java.lang.Object) setField()}, and QWizard::setDefaultProperty(). <br></DD></DT>
*/

    protected final void registerField(String name, QWidget widget, String property) {
        registerField(name, widget, QNativePointer.createCharPointer(property), null);
    }

    /**
     * Creates a field called <code>name</code> associated with the given
     * property of the given widget. From then on, that property becomes
     * accessible using <code>field()</code> and <code>setField()</code>.
     * Fields are global to the entire wizard and make it easy for any single
     * page to access information stored by another page, without having to put
     * all the logic in <code>QWizard</code> or having the pages know
     * explicitly about each other. If name ends with an asterisk (*), the field
     * is a mandatory field. When a page has mandatory fields, the Next and/or
     * Finish buttons are enabled only when all mandatory fields are filled.
     * This requires a <code>changedSignal</code> to be specified, to tell
     * QWizard to recheck the value stored by the mandatory field.
     *
     * QWizard knows the most common Qt widgets. For these (or their
     * subclasses), you don't need to specify a <code>property</code> or a
     * <code>changedSignal</code>. The table below lists these widgets:
     *
     * <code>QAbstractButton</code> (for which the relevant property is the
     * <code>checked</code> property), <code>QAbstractSlider</code> (the
     * <code>value</code> property), <code>QComboBox</code> (<code>currentIndex</code>
     * property), <code>QDateTimeEdit</code>(<code>dateTime</code>
     * property), <code>QLineEdit</code>(<code>text</code> property),
     * <code>QListWidget</code>(<code>currentRow</code> property), or
     * <code>QSpinBox</code>(<code>value</code> property).
     *
     * @param name
     *            The name which will be used to access the field. Names ending
     *            with an asterisk signify mandatory fields.
     * @param widget
     *            The widget whose property will be accessed using this field.
     * @param property
     *            The name of the property associated with the field.
     * @param changedSignal
     *            The name of a signal which is emitted when the associated
     *            property's value changes.
     *
     * @see com.trolltech.qt.gui.QWizardPage#field
     * @see com.trolltech.qt.gui.QWizardPage#setField
     */
    protected final void registerField(String name, QWidget widget, String property, String changedSignal) {
        String signalSignature = com.trolltech.qt.internal.MetaObjectTools.cppSignalSignature(widget, changedSignal);
        if (signalSignature.length() == 0)
            throw new QNoSuchSignalException("Signal '" + changedSignal
            + "' does not exist or has argument types that cannot be converted to Qt Jambi or java.lang types.");
        registerField(name, widget, com.trolltech.qt.QNativePointer.createCharPointer(property), com.trolltech.qt.QNativePointer
            .createCharPointer(com.trolltech.qt.internal.QtJambiInternal.SignalPrefix + signalSignature));
    }

}
