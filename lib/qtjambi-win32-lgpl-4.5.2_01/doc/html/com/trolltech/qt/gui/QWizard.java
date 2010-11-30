package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QWizard class provides a framework for wizards. A wizard (also called an assistant on Mac OS X) is a special type of input dialog that consists of a sequence of pages. A wizard's purpose is to guide the user through a process step by step. Wizards are useful for complex or infrequent tasks that users may find difficult to learn. <p>QWizard inherits {@link com.trolltech.qt.gui.QDialog QDialog} and represents a wizard. Each page is a {@link com.trolltech.qt.gui.QWizardPage QWizardPage} (a {@link com.trolltech.qt.gui.QWidget QWidget} subclass). To create your own wizards, you can use these classes directly, or you can subclass them for more control. <p>Topics: <ul><li> {@link <a href="#a-trivial-example">A Trivial Example</a>}</li><li> {@link <a href="#wizard-look-and-feel">Wizard Look and Feel</a>}</li><li> {@link <a href="#elements-of-a-wizard-page">Elements of a Wizard Page</a>}</li><li> {@link <a href="#registering-and-using-fields">Registering and Using Fields</a>}</li><li> {@link <a href="#creating-linear-wizards">Creating Linear Wizards</a>}</li><li> {@link <a href="#creating-non-linear-wizards">Creating Non-Linear Wizards</a>}</li></ul><a name="a-trivial-example"><h2>A Trivial Example</h2> The following example illustrates how to create wizard pages and add them to a wizard. For more advanced examples, see {@link <a href="../dialogs-classwizard.html">Class Wizard</a>} and {@link <a href="../dialogs-licensewizard.html">License Wizard</a>}.<br><br>The following code example is written in c++.<br> <pre class="snippet">
QWizardPage *createIntroPage()
{
    QWizardPage *page = new QWizardPage;
    page-&gt;setTitle("Introduction");

    QLabel *label = new QLabel("This wizard will help you register your copy "
                               "of Super Product Two.");
    label-&gt;setWordWrap(true);

    QVBoxLayout *layout = new QVBoxLayout;
    layout-&gt;addWidget(label);
    page-&gt;setLayout(layout);

    return page;
}



QWizardPage *createRegistrationPage()

{
...
}
 <br> 
QWizardPage *createConclusionPage()

{
...
}
 <br>
int main(int argc, char *argv[])
 
{
    QApplication app(argc, argv);

    QString translatorFileName = QLatin1String("qt_");
    translatorFileName += QLocale::system().name();
    QTranslator *translator = new QTranslator(&app);
    if (translator-&gt;load(translatorFileName, QLibraryInfo::location(QLibraryInfo::TranslationsPath)))
        app.installTranslator(translator);


    QWizard wizard;
    wizard.addPage(createIntroPage());
    wizard.addPage(createRegistrationPage());
    wizard.addPage(createConclusionPage());

    wizard.setWindowTitle("Trivial Wizard");
    wizard.show();

    return app.exec();
}
</pre><a name="wizard-look-and-feel"><h2>Wizard Look and Feel</h2> QWizard supports four wizard looks: <ul><li> {@link com.trolltech.qt.gui.QWizard.WizardStyle ClassicStyle }</li><li> {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle }</li><li> {@link com.trolltech.qt.gui.QWizard.WizardStyle MacStyle }</li><li> {@link com.trolltech.qt.gui.QWizard.WizardStyle AeroStyle }</li></ul> You can explicitly set the look to use using {@link com.trolltech.qt.gui.QWizard#setWizardStyle(com.trolltech.qt.gui.QWizard.WizardStyle) setWizardStyle()} (e.g., if you want the same look on all platforms). <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> {@link com.trolltech.qt.gui.QWizard.WizardStyle ClassicStyle }</center></th><th><center> {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle }</center></th><th><center> {@link com.trolltech.qt.gui.QWizard.WizardStyle MacStyle }</center></th><th><center> {@link com.trolltech.qt.gui.QWizard.WizardStyle AeroStyle }</center></th></tr></thead><tr valign="top" class="even"><td>  <br><center><img src="../images/qtwizard-classic1.png"></center><br></td><td>  <br><center><img src="../images/qtwizard-modern1.png"></center><br></td><td>  <br><center><img src="../images/qtwizard-mac1.png"></center><br></td><td>  <br><center><img src="../images/qtwizard-aero1.png"></center><br></td></tr><tr valign="top" class="odd"><td>  <br><center><img src="../images/qtwizard-classic2.png"></center><br></td><td>  <br><center><img src="../images/qtwizard-modern2.png"></center><br></td><td>  <br><center><img src="../images/qtwizard-mac2.png"></center><br></td><td>  <br><center><img src="../images/qtwizard-aero2.png"></center><br></td></tr></table> Note: {@link com.trolltech.qt.gui.QWizard.WizardStyle AeroStyle } has effect only on a Windows Vista system with alpha compositing enabled. {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle } is used as a fallback when this condition is not met. <p>In addition to the wizard style, there are several options that control the look and feel of the wizard. These can be set using {@link com.trolltech.qt.gui.QWizard#setOption(com.trolltech.qt.gui.QWizard.WizardOption) setOption()} or {@link com.trolltech.qt.gui.QWizard#setOptions(com.trolltech.qt.gui.QWizard.WizardOption[]) setOptions()}. For example, {@link com.trolltech.qt.gui.QWizard.WizardOption HaveHelpButton } makes QWizard show a <b>Help</b> button along with the other wizard buttons. <p>You can even change the order of the wizard buttons to any arbitrary order using {@link com.trolltech.qt.gui.QWizard#setButtonLayout(java.util.List) setButtonLayout()}, and you can add up to three custom buttons (e.g., a <b>Print</b> button) to the button row. This is achieved by calling {@link com.trolltech.qt.gui.QWizard#setButton(com.trolltech.qt.gui.QWizard.WizardButton, com.trolltech.qt.gui.QAbstractButton) setButton()} or {@link com.trolltech.qt.gui.QWizard#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) setButtonText()} with {@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton1 }, {@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton2 }, or {@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton3 } to set up the button, and by enabling the {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton1 }, {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton2 }, or {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton3 } options. Whenever the user clicks a custom button, {@link com.trolltech.qt.gui.QWizard#customButtonClicked customButtonClicked() } is emitted. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
        wizard()-&gt;setButtonText(QWizard::CustomButton1, tr("&Print"));
        wizard()-&gt;setOption(QWizard::HaveCustomButton1, true);
        connect(wizard(), SIGNAL(customButtonClicked(int)),
                this, SLOT(printButtonClicked()));
</pre><a name="elements-of-a-wizard-page"><h2>Elements of a Wizard Page</h2> Wizards consist of a sequence of {@link com.trolltech.qt.gui.QWizardPage QWizardPage}s. At any time, only one page is shown. A page has the following attributes: <ul><li> A {@link QWizardPage#title() title}.</li><li> A {@link QWizardPage#subTitle() subTitle}.</li><li> A set of pixmaps, which may or may not be honored, depending on the wizard's style: <ul><li> {@link com.trolltech.qt.gui.QWizard.WizardPixmap WatermarkPixmap } (used by {@link com.trolltech.qt.gui.QWizard.WizardStyle ClassicStyle } and {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle })</li><li> {@link com.trolltech.qt.gui.QWizard.WizardPixmap BannerPixmap } (used by {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle })</li><li> {@link com.trolltech.qt.gui.QWizard.WizardPixmap LogoPixmap } (used by {@link com.trolltech.qt.gui.QWizard.WizardStyle ClassicStyle } and {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle })</li><li> {@link com.trolltech.qt.gui.QWizard.WizardPixmap BackgroundPixmap } (used by {@link com.trolltech.qt.gui.QWizard.WizardStyle MacStyle })</li></ul></li></ul> The diagram belows shows how QWizard renders these attributes, assuming they are all present and {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle } is used: <br><center><img src="../images/qtwizard-nonmacpage.png"></center><br> When a {@link QWizardPage#subTitle() subTitle} is set, QWizard displays it in a header, in which case it also uses the {@link com.trolltech.qt.gui.QWizard.WizardPixmap BannerPixmap } and the {@link com.trolltech.qt.gui.QWizard.WizardPixmap LogoPixmap } to decorate the header. The {@link com.trolltech.qt.gui.QWizard.WizardPixmap WatermarkPixmap } is displayed on the left side, below the header. At the bottom, there is a row of buttons allowing the user to navigate through the pages. <p>The page itself (the {@link com.trolltech.qt.gui.QWizardPage QWizardPage} widget) occupies the area between the header, the watermark, and the button row. Typically, the page is a {@link com.trolltech.qt.gui.QWizardPage QWizardPage} on which a {@link com.trolltech.qt.gui.QGridLayout QGridLayout} is installed, with standard child widgets ({@link com.trolltech.qt.gui.QLabel QLabel}s, {@link com.trolltech.qt.gui.QLineEdit QLineEdit}s, etc.). <p>If the wizard's style is {@link com.trolltech.qt.gui.QWizard.WizardStyle MacStyle }, the page looks radically different: <br><center><img src="../images/qtwizard-macpage.png"></center><br> The watermark, banner, and logo pixmaps are ignored by the {@link com.trolltech.qt.gui.QWizard.WizardStyle MacStyle }. If the {@link com.trolltech.qt.gui.QWizard.WizardPixmap BackgroundPixmap } is set, it is used as the background for the wizard; otherwise, a default "assistant" image is used. <p>The title and subtitle are set by calling {@link QWizardPage#setTitle(java.lang.String) QWizardPage::setTitle()} and {@link QWizardPage#setSubTitle(java.lang.String) QWizardPage::setSubTitle()} on the individual pages. They may be plain text or HTML (see {@link QWizard#titleFormat() titleFormat} and {@link QWizard#subTitleFormat() subTitleFormat}). The pixmaps can be set globally for the entire wizard using {@link com.trolltech.qt.gui.QWizard#setPixmap(com.trolltech.qt.gui.QWizard.WizardPixmap, com.trolltech.qt.gui.QPixmap) setPixmap()}, or on a per-page basis using {@link com.trolltech.qt.gui.QWizardPage#setPixmap(com.trolltech.qt.gui.QWizard.WizardPixmap, com.trolltech.qt.gui.QPixmap) QWizardPage::setPixmap()}.<a name="field-mechanism"><a name="registering-and-using-fields"><h2>Registering and Using Fields</h2> In many wizards, the contents of a page may affect the default values of the fields of a later page. To make it easy to communicate between pages, QWizard supports a "field" mechanism that allows you to register a field (e.g., a {@link com.trolltech.qt.gui.QLineEdit QLineEdit}) on a page and to access its value from any page. It is also possible to specify mandatory fields (i.e., fields that must be filled before the user can advance to the next page). <p>To register a field, call {@link com.trolltech.qt.gui.QWizardPage#registerField(java.lang.String, com.trolltech.qt.gui.QWidget) QWizardPage::registerField()} field. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet"> 
ClassInfoPage::ClassInfoPage(QWidget *parent)
    : QWizardPage(parent)
{
...
    classNameLabel = new QLabel(tr("&Class name:"));
    classNameLineEdit = new QLineEdit;
    classNameLabel-&gt;setBuddy(classNameLineEdit);

    baseClassLabel = new QLabel(tr("B&ase class:"));
    baseClassLineEdit = new QLineEdit;
    baseClassLabel-&gt;setBuddy(baseClassLineEdit);

    qobjectMacroCheckBox = new QCheckBox(tr("Generate Q_OBJECT &macro"));

 
    registerField("className*", classNameLineEdit);
    registerField("baseClass", baseClassLineEdit);
    registerField("qobjectMacro", qobjectMacroCheckBox);
...
}
</pre> The above code registers three fields, <tt>className</tt>, <tt>baseClass</tt>, and <tt>qobjectMacro</tt>, which are associated with three child widgets. The asterisk (<tt>*</tt>) next to <tt>className</tt> denotes a mandatory field.<a name="initialize-page"> The fields of any page are accessible from any other page. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
void OutputFilesPage::initializePage()
{
    QString className = field("className").toString();
    headerLineEdit-&gt;setText(className.toLower() + ".h");
    implementationLineEdit-&gt;setText(className.toLower() + ".cpp");
    outputDirLineEdit-&gt;setText(QDir::convertSeparators(QDir::tempPath()));
}
</pre> Here, we call {@link com.trolltech.qt.gui.QWizardPage#field(java.lang.String) QWizardPage::field()} to access the contents of the <tt>className</tt> field (which was defined in the <tt>ClassInfoPage</tt>) and use it to initialize the <tt>OuputFilePage</tt>. The field's contents is returned as a {@link com.trolltech.qt.QVariant QVariant}. <p>When we create a field using {@link com.trolltech.qt.gui.QWizardPage#registerField(java.lang.String, com.trolltech.qt.gui.QWidget) QWizardPage::registerField()}, we pass a unique field name and a widget. We can also provide a Qt property name and a "changed" signal (a signal that is emitted when the property changes) as third and fourth arguments; however, this is not necessary for the most common Qt widgets, such as {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, {@link com.trolltech.qt.gui.QCheckBox QCheckBox}, and {@link com.trolltech.qt.gui.QComboBox QComboBox}, because QWizard knows which properties to look for.<a name="mandatory-fields"> If an asterisk (<tt>*</tt>) is appended to the name when the property is registered, the field is a mandatory field. When a page has mandatory fields, the <b>Next</b> and/or <b>Finish</b> buttons are enabled only when all mandatory fields are filled. <p>To consider a field "filled", QWizard simply checks that the field's current value doesn't equal the original value (the value it had when {@link com.trolltech.qt.gui.QWizard#initializePage(int) initializePage()} was called). For {@link com.trolltech.qt.gui.QLineEdit QLineEdit} and {@link com.trolltech.qt.gui.QAbstractSpinBox QAbstractSpinBox} subclasses, QWizard also checks that {@link QLineEdit#hasAcceptableInput() hasAcceptableInput()} returns true, to honor any validator or mask. <p>QWizard's mandatory field mechanism is provided for convenience. A more powerful (but also more cumbersome) alternative is to reimplement {@link com.trolltech.qt.gui.QWizardPage#isComplete() QWizardPage::isComplete()} and to emit the {@link com.trolltech.qt.gui.QWizardPage#completeChanged QWizardPage::completeChanged() } signal whenever the page becomes complete or incomplete. <p>The enabled/disabled state of the <b>Next</b> and/or <b>Finish</b> buttons is one way to perform validation on the user input. Another way is to reimplement {@link com.trolltech.qt.gui.QWizard#validateCurrentPage() validateCurrentPage()} (or {@link com.trolltech.qt.gui.QWizardPage#validatePage() QWizardPage::validatePage()}) to perform some last-minute validation (and show an error message if the user has entered incomplete or invalid information). If the function returns true, the next page is shown (or the wizard finishes); otherwise, the current page stays up.<a name="creating-linear-wizards"><h2>Creating Linear Wizards</h2> Most wizards have a linear structure, with page 1 followed by page 2 and so on until the last page. The {@link <a href="../dialogs-classwizard.html">Class Wizard</a>} example is such a wizard. With QWizard, linear wizards are created by instantiating the {@link com.trolltech.qt.gui.QWizardPage QWizardPage}s and inserting them using {@link com.trolltech.qt.gui.QWizard#addPage(com.trolltech.qt.gui.QWizardPage) addPage()}. By default, the pages are shown in the order in which they were added. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet"> 
ClassWizard::ClassWizard(QWidget *parent)
    : QWizard(parent)
{
    addPage(new IntroPage);
    addPage(new ClassInfoPage);
    addPage(new CodeStylePage);
    addPage(new OutputFilesPage);
    addPage(new ConclusionPage);
...
}
 </pre> When a page is about to be shown, QWizard calls {@link com.trolltech.qt.gui.QWizard#initializePage(int) initializePage()} (which in turn calls {@link com.trolltech.qt.gui.QWizardPage#initializePage() QWizardPage::initializePage()}) to fill the page with default values. By default, this function does nothing, but it can be reimplemented to initialize the page's contents based on other pages' fields (see the example above). <p>If the user presses <b>Back</b>, {@link com.trolltech.qt.gui.QWizard#cleanupPage(int) cleanupPage()} is called (which in turn calls {@link com.trolltech.qt.gui.QWizardPage#cleanupPage() QWizardPage::cleanupPage()}). The default implementation resets the page's fields to their original values (the values they had before {@link com.trolltech.qt.gui.QWizard#initializePage(int) initializePage()} was called). If you want the <b>Back</b> button to be non-destructive and keep the values entered by the user, simply enable the {@link com.trolltech.qt.gui.QWizard.WizardOption IndependentPages } option.<a name="creating-non-linear-wizards"><h2>Creating Non-Linear Wizards</h2> Some wizards are more complex in that they allow different traversal paths based on the information provided by the user. The {@link <a href="../dialogs-licensewizard.html">License Wizard</a>} example illustrates this. It provides five wizard pages; depending on which options are selected, the user can reach different pages. <br><center><img src="../images/licensewizard-flow.png"></center><br> In complex wizards, pages are identified by IDs. These IDs are typically defined using an enum. For example: <pre class="snippet"> 
class LicenseWizard : public QWizard
{
...
    enum { Page_Intro, Page_Evaluate, Page_Register, Page_Details,
           Page_Conclusion };
...
};
 </pre> The pages are inserted using {@link com.trolltech.qt.gui.QWizard#setPage(int, com.trolltech.qt.gui.QWizardPage) setPage()}, which takes an ID and an instance of {@link com.trolltech.qt.gui.QWizardPage QWizardPage} (or of a subclass):<br><br>The following code example is written in c++.<br> <pre class="snippet"> 
LicenseWizard::LicenseWizard(QWidget *parent)
    : QWizard(parent)
{

    setPage(Page_Intro, new IntroPage);
    setPage(Page_Evaluate, new EvaluatePage);
    setPage(Page_Register, new RegisterPage);
    setPage(Page_Details, new DetailsPage);
    setPage(Page_Conclusion, new ConclusionPage);
...
}
 </pre> By default, the pages are shown in increasing ID order. To provide a dynamic order that depends on the options chosen by the user, we must reimplement {@link com.trolltech.qt.gui.QWizardPage#nextId() QWizardPage::nextId()}. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
int IntroPage::nextId() const
 
{
    if (evaluateRadioButton-&gt;isChecked()) {
        return LicenseWizard::Page_Evaluate;
    } else {
        return LicenseWizard::Page_Register;
    }
}
<br>
int EvaluatePage::nextId() const
{
    return LicenseWizard::Page_Conclusion;
}
<br>
int RegisterPage::nextId() const
{
    if (upgradeKeyLineEdit-&gt;text().isEmpty()) {
        return LicenseWizard::Page_Details;
    } else {
        return LicenseWizard::Page_Conclusion;
    }
}
<br>
int DetailsPage::nextId() const
{
    return LicenseWizard::Page_Conclusion;
}
<br>
int ConclusionPage::nextId() const
{
    return -1;
}
</pre> It would also be possible to put all the logic in one place, in a {@link com.trolltech.qt.gui.QWizard#nextId() QWizard::nextId()} reimplementation. For example: <pre class="snippet">
    public int nextId()
    {
        switch (currentId()) {
        case Page_Intro:
            if (QVariant.toBoolean(field("intro.evaluate"))) {
                return Page_Evaluate;
            } else {
                return Page_Register;
            }
        case Page_Evaluate:
            return Page_Conclusion;
        case Page_Register:
            if (QVariant.toString(field("register.upgradeKey")).length() == 0) {
                return Page_Details;
            } else {
                return Page_Conclusion;
            }
        case Page_Details:
            return Page_Conclusion;
        case Page_Conclusion:
        default:
            return -1;
        }
    }
</pre> To start at another page than the page with the lowest ID, call {@link com.trolltech.qt.gui.QWizard#setStartId(int) setStartId()}. <p>To test whether a page has been visited or not, call {@link com.trolltech.qt.gui.QWizard#hasVisitedPage(int) hasVisitedPage()}. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
void ConclusionPage::initializePage()
{
    QString licenseText;

    if (wizard()-&gt;hasVisitedPage(LicenseWizard::Page_Evaluate)) {
        licenseText = tr("&lt;u&gt;Evaluation License Agreement:&lt;/u&gt; "
                         "You can use this software for 30 days and make one "
                         "backup, but you are not allowed to distribute it.");
    } else if (wizard()-&gt;hasVisitedPage(LicenseWizard::Page_Details)) {
        licenseText = tr("&lt;u&gt;First-Time License Agreement:&lt;/u&gt; "
                         "You can use this software subject to the license "
                         "you will receive by email.");
    } else {
        licenseText = tr("&lt;u&gt;Upgrade License Agreement:&lt;/u&gt; "
                         "This software is licensed under the terms of your "
                         "current license.");
    }
    bottomLabel-&gt;setText(licenseText);
}
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage QWizardPage}, {@link <a href="../dialogs-classwizard.html">Class Wizard Example</a>}, and {@link <a href="../dialogs-licensewizard.html">License Wizard Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QWizard extends com.trolltech.qt.gui.QDialog
{
    
/**
This enum specifies the buttons in a wizard. The following value is only useful when calling {@link com.trolltech.qt.gui.QWizard#setButtonLayout(java.util.List) setButtonLayout()}: <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#setButton(com.trolltech.qt.gui.QWizard.WizardButton, com.trolltech.qt.gui.QAbstractButton) setButton()}, {@link com.trolltech.qt.gui.QWizard#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) setButtonText()}, {@link com.trolltech.qt.gui.QWizard#setButtonLayout(java.util.List) setButtonLayout()}, and {@link com.trolltech.qt.gui.QWizard#customButtonClicked customButtonClicked() }. <br></DD></DT>
*/
@QtBlockedEnum
    public enum WizardButton implements com.trolltech.qt.QtEnumerator {
/**
 The <b>Back</b> button (<b>Go Back</b> on Mac OS X)
*/

        BackButton(0),
/**
 The <b>Next</b> button (<b>Continue</b> on Mac OS X)
*/

        NextButton(1),
/**
 The <b>Commit</b> button
*/

        CommitButton(2),
/**
 The <b>Finish</b> button (<b>Done</b> on Mac OS X)
*/

        FinishButton(3),
/**
 The <b>Cancel</b> button (see also {@link com.trolltech.qt.gui.QWizard.WizardOption NoCancelButton })
*/

        CancelButton(4),
/**
 The <b>Help</b> button (see also {@link com.trolltech.qt.gui.QWizard.WizardOption HaveHelpButton })
*/

        HelpButton(5),
/**
 The first user-defined button (see also {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton1 })
*/

        CustomButton1(6),
/**
 The second user-defined button (see also {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton2 })
*/

        CustomButton2(7),
/**
 The third user-defined button (see also {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton3 })
*/

        CustomButton3(8),
/**
 A horizontal stretch in the button layout
*/

        Stretch(9),
        NoButton(-1),
;

        WizardButton(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWizard$WizardButton constant with the specified <tt>int</tt>.</brief>
*/

        public static WizardButton resolve(int value) {
            return (WizardButton) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return BackButton;
            case 1: return NextButton;
            case 2: return CommitButton;
            case 3: return FinishButton;
            case 4: return CancelButton;
            case 5: return HelpButton;
            case 6: return CustomButton1;
            case 7: return CustomButton2;
            case 8: return CustomButton3;
            case 9: return Stretch;
            case -1: return NoButton;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum specifies the different looks supported by {@link com.trolltech.qt.gui.QWizard QWizard}. <p><DT><b>See also:</b><br><DD>setWizardStyle(), {@link com.trolltech.qt.gui.QWizard.WizardOption WizardOption }, and {@link com.trolltech.qt.gui.QWizard Wizard Look and Feel}. <br></DD></DT>
*/

    public enum WizardStyle implements com.trolltech.qt.QtEnumerator {
/**
 Classic Windows look
*/

        ClassicStyle(0),
/**
 Modern Windows look
*/

        ModernStyle(1),
/**
 Mac OS X look
*/

        MacStyle(2),
/**
 Windows Aero look
*/

        AeroStyle(3),
        NStyles(4);

        WizardStyle(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWizard$WizardStyle constant with the specified <tt>int</tt>.</brief>
*/

        public static WizardStyle resolve(int value) {
            return (WizardStyle) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ClassicStyle;
            case 1: return ModernStyle;
            case 2: return MacStyle;
            case 3: return AeroStyle;
            case 4: return NStyles;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum specifies the pixmaps that can be associated with a page. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#setPixmap(com.trolltech.qt.gui.QWizard.WizardPixmap, com.trolltech.qt.gui.QPixmap) setPixmap()}, {@link com.trolltech.qt.gui.QWizardPage#setPixmap(com.trolltech.qt.gui.QWizard.WizardPixmap, com.trolltech.qt.gui.QPixmap) QWizardPage::setPixmap()}, and {@link com.trolltech.qt.gui.QWizard Elements of a Wizard Page}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum WizardPixmap implements com.trolltech.qt.QtEnumerator {
/**
 The tall pixmap on the left side of a {@link com.trolltech.qt.gui.QWizard.WizardStyle ClassicStyle } or {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle } page
*/

        WatermarkPixmap(0),
/**
 The small pixmap on the right side of a {@link com.trolltech.qt.gui.QWizard.WizardStyle ClassicStyle } or {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle } page header
*/

        LogoPixmap(1),
/**
 The pixmap that occupies the background of a {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle } page header
*/

        BannerPixmap(2),
/**
 The pixmap that occupies the background of a {@link com.trolltech.qt.gui.QWizard.WizardStyle MacStyle } wizard
*/

        BackgroundPixmap(3),
        NPixmaps(4);

        WizardPixmap(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QWizard$WizardPixmap constant with the specified <tt>int</tt>.</brief>
*/

        public static WizardPixmap resolve(int value) {
            return (WizardPixmap) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return WatermarkPixmap;
            case 1: return LogoPixmap;
            case 2: return BannerPixmap;
            case 3: return BackgroundPixmap;
            case 4: return NPixmaps;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum specifies various options that affect the look and feel of a wizard. <p><DT><b>See also:</b><br><DD>setOptions(), {@link com.trolltech.qt.gui.QWizard#setOption(com.trolltech.qt.gui.QWizard.WizardOption) setOption()}, and {@link com.trolltech.qt.gui.QWizard#testOption(com.trolltech.qt.gui.QWizard.WizardOption) testOption()}. <br></DD></DT>
*/

    public enum WizardOption implements com.trolltech.qt.QtEnumerator {
/**
 The pages are independent of each other (i.e., they don't derive values from each other).
*/

        IndependentPages(1),
/**
 Don't show any subtitles, even if they are set.
*/

        IgnoreSubTitles(2),
/**
 Extend any {@link com.trolltech.qt.gui.QWizard.WizardPixmap WatermarkPixmap } all the way down to the window's edge.
*/

        ExtendedWatermarkPixmap(4),
/**
 Don't make the <b>Next</b> or <b>Finish</b> button the dialog's {@link QPushButton#setDefault(boolean) default button}.
*/

        NoDefaultButton(8),
/**
 Don't show the <b>Back</b> button on the start page.
*/

        NoBackButtonOnStartPage(16),
/**
 Don't show the <b>Back</b> button on the last page.
*/

        NoBackButtonOnLastPage(32),
/**
 Disable the <b>Back</b> button on the last page.
*/

        DisabledBackButtonOnLastPage(64),
/**
 Show the (disabled) <b>Next</b> button on the last page.
*/

        HaveNextButtonOnLastPage(128),
/**
 Show the (disabled) <b>Finish</b> button on non-final pages.
*/

        HaveFinishButtonOnEarlyPages(256),
/**
 Don't show the <b>Cancel</b> button.
*/

        NoCancelButton(512),
/**
 Put the <b>Cancel</b> button on the left of <b>Back</b> (rather than on the right of <b>Finish</b> or <b>Next</b>).
*/

        CancelButtonOnLeft(1024),
/**
 Show the <b>Help</b> button.
*/

        HaveHelpButton(2048),
/**
 Put the <b>Help</b> button on the far right of the button layout (rather than on the far left).
*/

        HelpButtonOnRight(4096),
/**
 Show the first user-defined button ({@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton1 }).
*/

        HaveCustomButton1(8192),
/**
 Show the second user-defined button ({@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton2 }).
*/

        HaveCustomButton2(16384),
/**
 Show the third user-defined button ({@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton3 }).
*/

        HaveCustomButton3(32768);

        WizardOption(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QWizard$WizardOptions with the specified <tt>com.trolltech.qt.gui.QWizard$WizardOption[]</tt> QWizard$WizardOption values set.</brief>
*/

        public static WizardOptions createQFlags(WizardOption ... values) {
            return new WizardOptions(values);
        }
/**
<brief>Returns the QWizard$WizardOption constant with the specified <tt>int</tt>.</brief>
*/

        public static WizardOption resolve(int value) {
            return (WizardOption) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return IndependentPages;
            case 2: return IgnoreSubTitles;
            case 4: return ExtendedWatermarkPixmap;
            case 8: return NoDefaultButton;
            case 16: return NoBackButtonOnStartPage;
            case 32: return NoBackButtonOnLastPage;
            case 64: return DisabledBackButtonOnLastPage;
            case 128: return HaveNextButtonOnLastPage;
            case 256: return HaveFinishButtonOnEarlyPages;
            case 512: return NoCancelButton;
            case 1024: return CancelButtonOnLeft;
            case 2048: return HaveHelpButton;
            case 4096: return HelpButtonOnRight;
            case 8192: return HaveCustomButton1;
            case 16384: return HaveCustomButton2;
            case 32768: return HaveCustomButton3;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class WizardOptions extends com.trolltech.qt.QFlags<WizardOption> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QWizard-WizardOptions with the specified <tt>com.trolltech.qt.gui.QWizard.WizardOption[]</tt>. flags set.</brief>
*/

        public WizardOptions(WizardOption ... args) { super(args); }
        public WizardOptions(int value) { setValue(value); }
    }


/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: id)&gt;:<p> This signal is emitted when the current page changes, with the new current <tt>id</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#currentId() currentId()}, and {@link com.trolltech.qt.gui.QWizard#currentPage() currentPage()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> currentIdChanged = new Signal1<java.lang.Integer>();

    private final void currentIdChanged(int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentIdChanged_int(nativeId(), id);
    }
    native void __qt_currentIdChanged_int(long __this__nativeId, int id);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: which)&gt;:<p> This signal is emitted when the user clicks a custom button. <tt>which</tt> can be {@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton1 }, {@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton2 }, or {@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton3 }. <p>By default, no custom button is shown. Call {@link com.trolltech.qt.gui.QWizard#setOption(com.trolltech.qt.gui.QWizard.WizardOption) setOption()} with {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton1 }, {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton2 }, or {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton3 } to have one, and use {@link com.trolltech.qt.gui.QWizard#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) setButtonText()} or {@link com.trolltech.qt.gui.QWizard#setButton(com.trolltech.qt.gui.QWizard.WizardButton, com.trolltech.qt.gui.QAbstractButton) setButton()} to configure it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#helpRequested helpRequested() }. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> customButtonClicked = new Signal1<java.lang.Integer>();

    private final void customButtonClicked(int which)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_customButtonClicked_int(nativeId(), which);
    }
    native void __qt_customButtonClicked_int(long __this__nativeId, int which);
/**
 This signal is emitted when the user clicks the <b>Help</b> button. <p>By default, no <b>Help</b> button is shown. Call setOption({@link com.trolltech.qt.gui.QWizard.WizardOption HaveHelpButton }, true) to have one. <p>Example:<br><br>The following code example is written in c++.<br> <pre class="snippet">  
LicenseWizard::LicenseWizard(QWidget *parent)
    : QWizard(parent)
{
...
    setOption(HaveHelpButton, true);

    connect(this, SIGNAL(helpRequested()), this, SLOT(showHelp()));
...
}
 <br>
void LicenseWizard::showHelp()
 
{
    static QString lastHelpMessage;

    QString message;

    switch (currentId()) {
    case Page_Intro:
        message = tr("The decision you make here will affect which page you "
                     "get to see next.");
        break;
... 
    default:
        message = tr("This help is likely not to be of any help.");
    }
<br>
    QMessageBox::information(this, tr("License Wizard Help"), message);
<br>
}
 </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#customButtonClicked customButtonClicked() }. <br></DD></DT>
*/

    public final Signal0 helpRequested = new Signal0();

    private final void helpRequested()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_helpRequested(nativeId());
    }
    native void __qt_helpRequested(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    public QWizard(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... flags) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(flags));
    }

/**
Constructs a wizard with the given <tt>parent</tt> and window <tt>flags</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QObject#parent() parent()}, and windowFlags(). <br></DD></DT>
*/

    public QWizard(com.trolltech.qt.gui.QWidget parent) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }

/**
Constructs a wizard with the given <tt>parent</tt> and window <tt>flags</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QObject#parent() parent()}, and windowFlags(). <br></DD></DT>
*/

    public QWizard() {
        this((com.trolltech.qt.gui.QWidget)null, new com.trolltech.qt.core.Qt.WindowFlags(0));
    }
/**
Constructs a wizard with the given <tt>parent</tt> and window <tt>flags</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QObject#parent() parent()}, and windowFlags(). <br></DD></DT>
*/

    public QWizard(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags flags){
        super((QPrivateConstructor)null);
        __qt_QWizard_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), flags.value());
    }

    native void __qt_QWizard_QWidget_WindowFlags(long parent, int flags);

/**
Adds the given <tt>page</tt> to the wizard, and returns the page's ID. <p>The ID is guaranteed to be larger than any other ID in the QWizard so far. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#setPage(int, com.trolltech.qt.gui.QWizardPage) setPage()}, and {@link com.trolltech.qt.gui.QWizard#page(int) page()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final int addPage(com.trolltech.qt.gui.QWizardPage page)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (page == null)
            throw new NullPointerException("Argument 'page': null not expected.");
        return __qt_addPage_QWizardPage(nativeId(), page == null ? 0 : page.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native int __qt_addPage_QWizardPage(long __this__nativeId, long page);

/**
Goes back to the previous page. <p>This is equivalent to pressing the <b>Back</b> button. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#next() next()}, {@link com.trolltech.qt.gui.QDialog#accept() accept()}, {@link com.trolltech.qt.gui.QDialog#reject() reject()}, and {@link com.trolltech.qt.gui.QWizard#restart() restart()}. <br></DD></DT>
*/

    public final void back()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_back(nativeId());
    }
    native void __qt_back(long __this__nativeId);

/**
Returns the button corresponding to role <tt>which</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#setButton(com.trolltech.qt.gui.QWizard.WizardButton, com.trolltech.qt.gui.QAbstractButton) setButton()}, and {@link com.trolltech.qt.gui.QWizard#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) setButtonText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractButton button(com.trolltech.qt.gui.QWizard.WizardButton which)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_button_WizardButton(nativeId(), which.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractButton __qt_button_WizardButton(long __this__nativeId, int which);

/**
Returns the text on button <tt>which</tt>. <p>If a text has ben set using {@link com.trolltech.qt.gui.QWizard#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) setButtonText()}, this text is returned. <p>By default, the text on buttons depends on the {@link QWizard#wizardStyle() wizardStyle}. For example, on Mac OS X, the <b>Next</b> button is called <b>Continue</b>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#button(com.trolltech.qt.gui.QWizard.WizardButton) button()}, {@link com.trolltech.qt.gui.QWizard#setButton(com.trolltech.qt.gui.QWizard.WizardButton, com.trolltech.qt.gui.QAbstractButton) setButton()}, {@link com.trolltech.qt.gui.QWizard#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) setButtonText()}, {@link com.trolltech.qt.gui.QWizardPage#buttonText(com.trolltech.qt.gui.QWizard.WizardButton) QWizardPage::buttonText()}, and {@link com.trolltech.qt.gui.QWizardPage#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) QWizardPage::setButtonText()}. <br></DD></DT>
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
This property holds the ID of the current page. This property cannot be set directly. To change the current page, call {@link com.trolltech.qt.gui.QWizard#next() next()}, {@link com.trolltech.qt.gui.QWizard#back() back()}, or {@link com.trolltech.qt.gui.QWizard#restart() restart()}. <p>By default, this property has a value of -1, indicating that no page is currently shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#currentIdChanged currentIdChanged() }, and {@link com.trolltech.qt.gui.QWizard#currentPage() currentPage()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="currentId")
    @QtBlockedSlot
    public final int currentId()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentId(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentId(long __this__nativeId);

/**
Returns a pointer to the current page, or 0 if there is no current page (e. ., before the wizard is shown). <p>This is equivalent to calling page({@link com.trolltech.qt.gui.QWizard#currentId() currentId()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#page(int) page()}, {@link com.trolltech.qt.gui.QWizard#currentId() currentId()}, and {@link com.trolltech.qt.gui.QWizard#restart() restart()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWizardPage currentPage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentPage(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWizardPage __qt_currentPage(long __this__nativeId);

/**
Returns the value of the field called <tt>name</tt>. <p>This function can be used to access fields on any page of the wizard. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#registerField(java.lang.String, com.trolltech.qt.gui.QWidget) QWizardPage::registerField()}, {@link com.trolltech.qt.gui.QWizardPage#field(java.lang.String) QWizardPage::field()}, and {@link com.trolltech.qt.gui.QWizard#setField(java.lang.String, java.lang.Object) setField()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object field(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_field_String(nativeId(), name);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_field_String(long __this__nativeId, java.lang.String name);

/**
Returns true if the page history contains page <tt>id</tt>; otherwise, returns false. <p>Pressing <b>Back</b> marks the current page as "unvisited" again. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#visitedPages() visitedPages()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasVisitedPage(int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasVisitedPage_int(nativeId(), id);
    }
    @QtBlockedSlot
    native boolean __qt_hasVisitedPage_int(long __this__nativeId, int id);

/**
Advances to the next page. <p>This is equivalent to pressing the <b>Next</b> or <b>Commit</b> button. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#nextId() nextId()}, {@link com.trolltech.qt.gui.QWizard#back() back()}, {@link com.trolltech.qt.gui.QDialog#accept() accept()}, {@link com.trolltech.qt.gui.QDialog#reject() reject()}, and {@link com.trolltech.qt.gui.QWizard#restart() restart()}. <br></DD></DT>
*/

    public final void next()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_next(nativeId());
    }
    native void __qt_next(long __this__nativeId);

/**
This property holds the various options that affect the look and feel of the wizard. By default, the following options are set (depending on the platform): <ul><li> Windows: {@link com.trolltech.qt.gui.QWizard.WizardOption HelpButtonOnRight }.</li><li> Mac OS X: {@link com.trolltech.qt.gui.QWizard.WizardOption NoDefaultButton } and {@link com.trolltech.qt.gui.QWizard.WizardOption NoCancelButton }.</li><li> X11 and QWS (Qt for Embedded Linux): none.</li></ul> <p><DT><b>See also:</b><br><DD>{@link QWizard#wizardStyle() wizardStyle}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="options")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWizard.WizardOptions options()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QWizard.WizardOptions(__qt_options(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_options(long __this__nativeId);

/**
Returns the page with the given <tt>id</tt>, or 0 if there is no such page. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#addPage(com.trolltech.qt.gui.QWizardPage) addPage()}, and {@link com.trolltech.qt.gui.QWizard#setPage(int, com.trolltech.qt.gui.QWizardPage) setPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWizardPage page(int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_page_int(nativeId(), id);
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWizardPage __qt_page_int(long __this__nativeId, int id);

/**
Returns the list of page IDs.
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.Integer> pageIds()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pageIds(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.Integer> __qt_pageIds(long __this__nativeId);

/**
Returns the pixmap set for role <tt>which</tt>. <p>By default, the only pixmap that is set is the {@link com.trolltech.qt.gui.QWizard.WizardPixmap BackgroundPixmap } on Mac OS X. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#setPixmap(com.trolltech.qt.gui.QWizard.WizardPixmap, com.trolltech.qt.gui.QPixmap) setPixmap()}, {@link com.trolltech.qt.gui.QWizardPage#pixmap(com.trolltech.qt.gui.QWizard.WizardPixmap) QWizardPage::pixmap()}, and Elements of a Wizard Page. <br></DD></DT>
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

/**
Removes the page with the given <tt>id</tt>. {@link com.trolltech.qt.gui.QWizard#cleanupPage(int) cleanupPage()} will be called if necessary. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#addPage(com.trolltech.qt.gui.QWizardPage) addPage()}, and {@link com.trolltech.qt.gui.QWizard#setPage(int, com.trolltech.qt.gui.QWizardPage) setPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void removePage(int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removePage_int(nativeId(), id);
    }
    @QtBlockedSlot
    native void __qt_removePage_int(long __this__nativeId, int id);

/**
Restarts the wizard at the start page. This function is called automatically when the wizard is shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#startId() startId()}. <br></DD></DT>
*/

    public final void restart()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_restart(nativeId());
    }
    native void __qt_restart(long __this__nativeId);

/**
Sets the button corresponding to role <tt>which</tt> to <tt>button</tt>. <p>To add extra buttons to the wizard (e.g., a <b>Print</b> button), one way is to call {@link com.trolltech.qt.gui.QWizard#setButton(com.trolltech.qt.gui.QWizard.WizardButton, com.trolltech.qt.gui.QAbstractButton) setButton()} with {@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton1 } to {@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton3 }, and make the buttons visible using the {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton1 } to {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton3 } options. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#button(com.trolltech.qt.gui.QWizard.WizardButton) button()}, {@link com.trolltech.qt.gui.QWizard#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) setButtonText()}, {@link com.trolltech.qt.gui.QWizard#setButtonLayout(java.util.List) setButtonLayout()}, and {@link QWizard#options() options}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setButton(com.trolltech.qt.gui.QWizard.WizardButton which, com.trolltech.qt.gui.QAbstractButton button)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setButton_WizardButton_QAbstractButton(nativeId(), which.value(), button == null ? 0 : button.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setButton_WizardButton_QAbstractButton(long __this__nativeId, int which, long button);

/**
Sets the order in which buttons are displayed to <tt>layout</tt>, where <tt>layout</tt> is a list of {@link com.trolltech.qt.gui.QWizard.WizardButton WizardButton }s. <p>The default layout depends on the options (e.g., whether {@link com.trolltech.qt.gui.QWizard.WizardOption HelpButtonOnRight }) that are set. You can call this function if you need more control over the buttons' layout than what {@link QWizard#options() options} already provides. <p>You can specify horizontal stretches in the layout using {@link com.trolltech.qt.gui.QWizard.WizardButton Stretch }. <p>Example: <pre class="snippet">
    public MyWizard(QWidget parent)
    {
        super(parent);
        // ...
        List&lt;QWizard.WizardButton&gt; layout = new LinkedList&lt;QWizard.WizardButton&gt;();
        layout.add(QWizard.WizardButton.Stretch);
        layout.add(QWizard.WizardButton.BackButton);
        layout.add(QWizard.WizardButton.CancelButton);
        layout.add(QWizard.WizardButton.NextButton);
        layout.add(QWizard.WizardButton.FinishButton);
        setButtonLayout(layout);
        // ...
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#setButton(com.trolltech.qt.gui.QWizard.WizardButton, com.trolltech.qt.gui.QAbstractButton) setButton()}, {@link com.trolltech.qt.gui.QWizard#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) setButtonText()}, and {@link com.trolltech.qt.gui.QWizard#setOptions(com.trolltech.qt.gui.QWizard.WizardOption[]) setOptions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setButtonLayout(java.util.List<com.trolltech.qt.gui.QWizard.WizardButton> layout)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setButtonLayout_List(nativeId(), layout);
    }
    @QtBlockedSlot
    native void __qt_setButtonLayout_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QWizard.WizardButton> layout);

/**
Sets the text on button <tt>which</tt> to be <tt>text</tt>. <p>By default, the text on buttons depends on the {@link QWizard#wizardStyle() wizardStyle}. For example, on Mac OS X, the <b>Next</b> button is called <b>Continue</b>. <p>To add extra buttons to the wizard (e.g., a <b>Print</b> button), one way is to call {@link com.trolltech.qt.gui.QWizard#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) setButtonText()} with {@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton1 }, {@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton2 }, or {@link com.trolltech.qt.gui.QWizard.WizardButton CustomButton3 } to set their text, and make the buttons visible using the {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton1 }, {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton2 }, and/or {@link com.trolltech.qt.gui.QWizard.WizardOption HaveCustomButton3 } options. <p>Button texts may also be set on a per-page basis using {@link com.trolltech.qt.gui.QWizardPage#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) QWizardPage::setButtonText()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#buttonText(com.trolltech.qt.gui.QWizard.WizardButton) buttonText()}, {@link com.trolltech.qt.gui.QWizard#setButton(com.trolltech.qt.gui.QWizard.WizardButton, com.trolltech.qt.gui.QAbstractButton) setButton()}, {@link com.trolltech.qt.gui.QWizard#button(com.trolltech.qt.gui.QWizard.WizardButton) button()}, {@link com.trolltech.qt.gui.QWizard#setButtonLayout(java.util.List) setButtonLayout()}, {@link com.trolltech.qt.gui.QWizard#setOptions(com.trolltech.qt.gui.QWizard.WizardOption[]) setOptions()}, and {@link com.trolltech.qt.gui.QWizardPage#setButtonText(com.trolltech.qt.gui.QWizard.WizardButton, java.lang.String) QWizardPage::setButtonText()}. <br></DD></DT>
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
Sets the value of the field called <tt>name</tt> to <tt>value</tt>. <p>This function can be used to set fields on any page of the wizard. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#registerField(java.lang.String, com.trolltech.qt.gui.QWidget) QWizardPage::registerField()}, {@link com.trolltech.qt.gui.QWizardPage#setField(java.lang.String, java.lang.Object) QWizardPage::setField()}, and {@link com.trolltech.qt.gui.QWizard#field(java.lang.String) field()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setField(java.lang.String name, java.lang.Object value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setField_String_Object(nativeId(), name, value);
    }
    @QtBlockedSlot
    native void __qt_setField_String_Object(long __this__nativeId, java.lang.String name, java.lang.Object value);


/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QWizard#options() options}, {@link com.trolltech.qt.gui.QWizard#testOption(com.trolltech.qt.gui.QWizard.WizardOption) testOption()}, and {@link com.trolltech.qt.gui.QWizard#setWizardStyle(com.trolltech.qt.gui.QWizard.WizardStyle) setWizardStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QWizard.WizardOption option) {
        setOption(option, (boolean)true);
    }
/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QWizard#options() options}, {@link com.trolltech.qt.gui.QWizard#testOption(com.trolltech.qt.gui.QWizard.WizardOption) testOption()}, and {@link com.trolltech.qt.gui.QWizard#setWizardStyle(com.trolltech.qt.gui.QWizard.WizardStyle) setWizardStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QWizard.WizardOption option, boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOption_WizardOption_boolean(nativeId(), option.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setOption_WizardOption_boolean(long __this__nativeId, int option, boolean on);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QWizard.WizardOption ... options) {
        this.setOptions(new com.trolltech.qt.gui.QWizard.WizardOptions(options));
    }
/**
This property holds the various options that affect the look and feel of the wizard. By default, the following options are set (depending on the platform): <ul><li> Windows: {@link com.trolltech.qt.gui.QWizard.WizardOption HelpButtonOnRight }.</li><li> Mac OS X: {@link com.trolltech.qt.gui.QWizard.WizardOption NoDefaultButton } and {@link com.trolltech.qt.gui.QWizard.WizardOption NoCancelButton }.</li><li> X11 and QWS (Qt for Embedded Linux): none.</li></ul> <p><DT><b>See also:</b><br><DD>{@link QWizard#wizardStyle() wizardStyle}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="options")
    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QWizard.WizardOptions options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOptions_WizardOptions(nativeId(), options.value());
    }
    @QtBlockedSlot
    native void __qt_setOptions_WizardOptions(long __this__nativeId, int options);

/**
Adds the given <tt>page</tt> to the wizard with the given <tt>id</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#addPage(com.trolltech.qt.gui.QWizardPage) addPage()}, and {@link com.trolltech.qt.gui.QWizard#page(int) page()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setPage(int id, com.trolltech.qt.gui.QWizardPage page)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (page == null)
            throw new NullPointerException("Argument 'page': null not expected.");
        __qt_setPage_int_QWizardPage(nativeId(), id, page == null ? 0 : page.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setPage_int_QWizardPage(long __this__nativeId, int id, long page);

/**
Sets the pixmap for role <tt>which</tt> to <tt>pixmap</tt>. <p>The pixmaps are used by QWizard when displaying a page. Which pixmaps are actually used depend on the wizard style. <p>Pixmaps can also be set for a specific page using {@link com.trolltech.qt.gui.QWizardPage#setPixmap(com.trolltech.qt.gui.QWizard.WizardPixmap, com.trolltech.qt.gui.QPixmap) QWizardPage::setPixmap()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#pixmap(com.trolltech.qt.gui.QWizard.WizardPixmap) pixmap()}, {@link com.trolltech.qt.gui.QWizardPage#setPixmap(com.trolltech.qt.gui.QWizard.WizardPixmap, com.trolltech.qt.gui.QPixmap) QWizardPage::setPixmap()}, and Elements of a Wizard Page. <br></DD></DT>
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
This property holds the ID of the first page. If this property isn't explicitly set, this property defaults to the lowest page ID in this wizard, or -1 if no page has been inserted yet. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#restart() restart()}, and {@link com.trolltech.qt.gui.QWizard#nextId() nextId()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="startId")
    @QtBlockedSlot
    public final void setStartId(int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStartId_int(nativeId(), id);
    }
    @QtBlockedSlot
    native void __qt_setStartId_int(long __this__nativeId, int id);

/**
This property holds the text format used by page subtitles. The default format is {@link com.trolltech.qt.core.Qt.TextFormat Qt::AutoText }. <p><DT><b>See also:</b><br><DD>{@link QWizardPage#title() QWizardPage::title}, and {@link QWizard#titleFormat() titleFormat}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="subTitleFormat")
    @QtBlockedSlot
    public final void setSubTitleFormat(com.trolltech.qt.core.Qt.TextFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSubTitleFormat_TextFormat(nativeId(), format.value());
    }
    @QtBlockedSlot
    native void __qt_setSubTitleFormat_TextFormat(long __this__nativeId, int format);

/**
This property holds the text format used by page titles. The default format is {@link com.trolltech.qt.core.Qt.TextFormat Qt::AutoText }. <p><DT><b>See also:</b><br><DD>{@link QWizardPage#title() QWizardPage::title}, and {@link QWizard#subTitleFormat() subTitleFormat}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="titleFormat")
    @QtBlockedSlot
    public final void setTitleFormat(com.trolltech.qt.core.Qt.TextFormat format)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTitleFormat_TextFormat(nativeId(), format.value());
    }
    @QtBlockedSlot
    native void __qt_setTitleFormat_TextFormat(long __this__nativeId, int format);

/**
This property holds the look and feel of the wizard. By default, QWizard uses the {@link com.trolltech.qt.gui.QWizard.WizardStyle AeroStyle } on a Windows Vista system with alpha compositing enabled, regardless of the current widget style. If this is not the case, the default wizard style depends on the current widget style as follows: {@link com.trolltech.qt.gui.QWizard.WizardStyle MacStyle } is the default if the current widget style is QMacStyle, {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle } is the default if the current widget style is {@link com.trolltech.qt.gui.QWindowsStyle QWindowsStyle}, and {@link com.trolltech.qt.gui.QWizard.WizardStyle ClassicStyle } is the default in all other cases. <p><DT><b>See also:</b><br><DD>Wizard Look and Feel, and {@link QWizard#options() options}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="wizardStyle")
    @QtBlockedSlot
    public final void setWizardStyle(com.trolltech.qt.gui.QWizard.WizardStyle style)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWizardStyle_WizardStyle(nativeId(), style.value());
    }
    @QtBlockedSlot
    native void __qt_setWizardStyle_WizardStyle(long __this__nativeId, int style);

/**
This property holds the ID of the first page. If this property isn't explicitly set, this property defaults to the lowest page ID in this wizard, or -1 if no page has been inserted yet. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#restart() restart()}, and {@link com.trolltech.qt.gui.QWizard#nextId() nextId()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="startId")
    @QtBlockedSlot
    public final int startId()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startId(nativeId());
    }
    @QtBlockedSlot
    native int __qt_startId(long __this__nativeId);

/**
This property holds the text format used by page subtitles. The default format is {@link com.trolltech.qt.core.Qt.TextFormat Qt::AutoText }. <p><DT><b>See also:</b><br><DD>{@link QWizardPage#title() QWizardPage::title}, and {@link QWizard#titleFormat() titleFormat}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="subTitleFormat")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.TextFormat subTitleFormat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.TextFormat.resolve(__qt_subTitleFormat(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_subTitleFormat(long __this__nativeId);

/**
Returns true if the given <tt>option</tt> is enabled; otherwise, returns false. <p><DT><b>See also:</b><br><DD>{@link QWizard#options() options}, {@link com.trolltech.qt.gui.QWizard#setOption(com.trolltech.qt.gui.QWizard.WizardOption) setOption()}, and {@link com.trolltech.qt.gui.QWizard#setWizardStyle(com.trolltech.qt.gui.QWizard.WizardStyle) setWizardStyle()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testOption(com.trolltech.qt.gui.QWizard.WizardOption option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testOption_WizardOption(nativeId(), option.value());
    }
    @QtBlockedSlot
    native boolean __qt_testOption_WizardOption(long __this__nativeId, int option);

/**
This property holds the text format used by page titles. The default format is {@link com.trolltech.qt.core.Qt.TextFormat Qt::AutoText }. <p><DT><b>See also:</b><br><DD>{@link QWizardPage#title() QWizardPage::title}, and {@link QWizard#subTitleFormat() subTitleFormat}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="titleFormat")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.TextFormat titleFormat()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.TextFormat.resolve(__qt_titleFormat(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_titleFormat(long __this__nativeId);

/**
Returns the list of IDs of visited pages, in the order in which the pages were visited. <p>Pressing <b>Back</b> marks the current page as "unvisited" again. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizard#hasVisitedPage(int) hasVisitedPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.Integer> visitedPages()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_visitedPages(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.Integer> __qt_visitedPages(long __this__nativeId);

/**
This property holds the look and feel of the wizard. By default, QWizard uses the {@link com.trolltech.qt.gui.QWizard.WizardStyle AeroStyle } on a Windows Vista system with alpha compositing enabled, regardless of the current widget style. If this is not the case, the default wizard style depends on the current widget style as follows: {@link com.trolltech.qt.gui.QWizard.WizardStyle MacStyle } is the default if the current widget style is QMacStyle, {@link com.trolltech.qt.gui.QWizard.WizardStyle ModernStyle } is the default if the current widget style is {@link com.trolltech.qt.gui.QWindowsStyle QWindowsStyle}, and {@link com.trolltech.qt.gui.QWizard.WizardStyle ClassicStyle } is the default in all other cases. <p><DT><b>See also:</b><br><DD>Wizard Look and Feel, and {@link QWizard#options() options}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="wizardStyle")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWizard.WizardStyle wizardStyle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QWizard.WizardStyle.resolve(__qt_wizardStyle(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_wizardStyle(long __this__nativeId);

/**
This virtual function is called by QWizard to clean up page <tt>id</tt> just before the user leaves it by clicking <b>Back</b> (unless the {@link com.trolltech.qt.gui.QWizard.WizardOption QWizard::IndependentPages } option is set). <p>The default implementation calls {@link com.trolltech.qt.gui.QWizardPage#cleanupPage() QWizardPage::cleanupPage()} on page(<tt>id</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#cleanupPage() QWizardPage::cleanupPage()}, and {@link com.trolltech.qt.gui.QWizard#initializePage(int) initializePage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void cleanupPage(int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cleanupPage_int(nativeId(), id);
    }
    @QtBlockedSlot
    native void __qt_cleanupPage_int(long __this__nativeId, int id);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void done(int result)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_done_int(nativeId(), result);
    }
    @QtBlockedSlot
    native void __qt_done_int(long __this__nativeId, int result);

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
This virtual function is called by QWizard to prepare page <tt>id</tt> just before it is shown either as a result of {@link com.trolltech.qt.gui.QWizard#restart() QWizard::restart()} being called, or as a result of the user clicking <b>Next</b>. (However, if the {@link com.trolltech.qt.gui.QWizard.WizardOption QWizard::IndependentPages } option is set, this function is only called the first time the page is shown.) <p>By reimplementing this function, you can ensure that the page's fields are properly initialized based on fields from previous pages. <p>The default implementation calls {@link com.trolltech.qt.gui.QWizardPage#initializePage() QWizardPage::initializePage()} on page(<tt>id</tt>). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#initializePage() QWizardPage::initializePage()}, and {@link com.trolltech.qt.gui.QWizard#cleanupPage(int) cleanupPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void initializePage(int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initializePage_int(nativeId(), id);
    }
    @QtBlockedSlot
    native void __qt_initializePage_int(long __this__nativeId, int id);

/**
This virtual function is called by QWizard to find out which page to show when the user clicks the <b>Next</b> button. <p>The return value is the ID of the next page, or -1 if no page follows. <p>The default implementation calls {@link com.trolltech.qt.gui.QWizardPage#nextId() QWizardPage::nextId()} on the {@link com.trolltech.qt.gui.QWizard#currentPage() currentPage()}. <p>By reimplementing this function, you can specify a dynamic page order. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#nextId() QWizardPage::nextId()}, and {@link com.trolltech.qt.gui.QWizard#currentPage() currentPage()}. <br></DD></DT>
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
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void paintEvent(com.trolltech.qt.gui.QPaintEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paintEvent_QPaintEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_paintEvent_QPaintEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void resizeEvent(com.trolltech.qt.gui.QResizeEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resizeEvent_QResizeEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native void __qt_resizeEvent_QResizeEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), visible);
    }
    @QtBlockedSlot
    native void __qt_setVisible_boolean(long __this__nativeId, boolean visible);

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
This virtual function is called by QWizard when the user clicks <b>Next</b> or <b>Finish</b> to perform some last-minute validation. If it returns true, the next page is shown (or the wizard finishes); otherwise, the current page stays up. <p>The default implementation calls {@link com.trolltech.qt.gui.QWizardPage#validatePage() QWizardPage::validatePage()} on the {@link com.trolltech.qt.gui.QWizard#currentPage() currentPage()}. <p>When possible, it is usually better style to disable the <b>Next</b> or <b>Finish</b> button (by specifying mandatory fields or by reimplementing {@link com.trolltech.qt.gui.QWizardPage#isComplete() QWizardPage::isComplete()}) than to reimplement {@link com.trolltech.qt.gui.QWizard#validateCurrentPage() validateCurrentPage()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWizardPage#validatePage() QWizardPage::validatePage()}, and {@link com.trolltech.qt.gui.QWizard#currentPage() currentPage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean validateCurrentPage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_validateCurrentPage(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_validateCurrentPage(long __this__nativeId);

/**
@exclude
*/

    public static native QWizard fromNativePointer(QNativePointer nativePointer);

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

    protected QWizard(QPrivateConstructor p) { super(p); } 
}
