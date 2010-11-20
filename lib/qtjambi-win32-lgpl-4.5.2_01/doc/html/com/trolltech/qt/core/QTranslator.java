package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QTranslator class provides internationalization support for text output. An object of this class contains a set of translations from a source language to a target language. QTranslator provides functions to look up translations in a translation file. Translation files are created using {@link <a href="../qtjambi-linguist-manual.html">Qt Linguist</a>}. <p>The most common use of QTranslator is to: load a translation file, install it using {@link com.trolltech.qt.core.QCoreApplication#installTranslator(com.trolltech.qt.core.QTranslator) QApplication::installTranslator()}, and use it via QObject::tr(). Here's the <tt>main()</tt> function from the {@link <a href="../linguist-hellotr.html">Hello tr()</a>} example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
int main(int argc, char *argv[])
  
{
    QApplication app(argc, argv);



    QTranslator translator;
 
    translator.load("hellotr_la");
 
    app.installTranslator(&translator);
 


    QPushButton hello(QPushButton::tr("Hello world!"));

    hello.resize(100, 30);

    hello.show();
    return app.exec();
}
</pre> Note that the translator must be created before the application's widgets. <p>Most applications will never need to do anything else with this class. The other functions provided by this class are useful for applications that work on translator files.<a name="looking-up-translations"><h2>Looking up Translations</h2> It is possible to look up a translation using {@link com.trolltech.qt.core.QTranslator#translate(java.lang.String, java.lang.String) translate()} (as tr() and {@link com.trolltech.qt.core.QCoreApplication#translate(java.lang.String, java.lang.String, java.lang.String) QApplication::translate()} do). The {@link com.trolltech.qt.core.QTranslator#translate(java.lang.String, java.lang.String) translate()} function takes up to three parameters: <ul><li> The context - usually the class name for the tr() caller.</li><li> The source text - usually the argument to tr().</li><li> The disambiguation - an optional string that helps disambiguate different uses of the same text in the same context.</li></ul> For example, the "Cancel" in a dialog might have "Anuluj" when the program runs in Polish (in this case the source text would be "Cancel"). The context would (normally) be the dialog's class name; there would normally be no comment, and the translated text would be "Anuluj". <p>But it's not always so simple. The Spanish version of a printer dialog with settings for two-sided printing and binding would probably require both "Activado" and "Activada" as translations for "Enabled". In this case the source text would be "Enabled" in both cases, and the context would be the dialog's class name, but the two items would have disambiguations such as "two-sided printing" for one and "binding" for the other. The disambiguation enables the translator to choose the appropriate gender for the Spanish version, and enables Qt to distinguish between translations.<a name="using-multiple-translations"><h2>Using Multiple Translations</h2> Multiple translation files can be installed in an application. Translations are searched for in the reverse order in which they were installed, so the most recently installed translation file is searched for translations first and the earliest translation file is searched last. The search stops as soon as a translation containing a matching string is found. <p>This mechanism makes it possible for a specific translation to be "selected" or given priority over the others; simply uninstall the translator from the application by passing it to the {@link com.trolltech.qt.core.QCoreApplication#removeTranslator(com.trolltech.qt.core.QTranslator) QApplication::removeTranslator()} function and reinstall it with {@link com.trolltech.qt.core.QCoreApplication#installTranslator(com.trolltech.qt.core.QTranslator) QApplication::installTranslator()}. It will then be the first translation to be searched for matching strings. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QCoreApplication#installTranslator(com.trolltech.qt.core.QTranslator) QApplication::installTranslator()}, {@link com.trolltech.qt.core.QCoreApplication#removeTranslator(com.trolltech.qt.core.QTranslator) QApplication::removeTranslator()}, QObject::tr(), {@link com.trolltech.qt.core.QCoreApplication#translate(java.lang.String, java.lang.String, java.lang.String) QApplication::translate()}, {@link <a href="../qtjambi-i18n-example.html">I18N Example</a>}, {@link <a href="../linguist-hellotr.html">Hello tr() Example</a>}, {@link <a href="../linguist-arrowpad.html">Arrow Pad Example</a>}, and {@link <a href="../linguist-trollprint.html">Troll Print Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTranslator extends com.trolltech.qt.core.QObject
{


/**
Constructs an empty message file object with parent <tt>parent</tt> that is not connected to any file.
*/

    public QTranslator() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs an empty message file object with parent <tt>parent</tt> that is not connected to any file.
*/

    public QTranslator(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QTranslator_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTranslator_QObject(long parent);


/**
Loads <tt>filename</tt> + <tt>suffix</tt> (". m" if the <tt>suffix</tt> is not specified), which may be an absolute file name or relative to <tt>directory</tt>. Returns true if the translation is successfully loaded; otherwise returns false. <p>The previous contents of this translator object are discarded. <p>If the file name does not exist, other file names are tried in the following order: <ol><li> File name without <tt>suffix</tt> appended.</li><li> File name with text after a character in <tt>search_delimiters</tt> stripped ("_." is the default for <tt>search_delimiters</tt> if it is an empty string) and <tt>suffix</tt>.</li><li> File name stripped without <tt>suffix</tt> appended.</li><li> File name stripped further, etc.</li></ol> For example, an application running in the fr_CA locale (French-speaking Canada) might call load("foo.fr_ca", "/opt/foolib"). {@link com.trolltech.qt.core.QTranslator#load(java.lang.String, java.lang.String, java.lang.String) load()} would then try to open the first existing readable file from this list: <ol><li> <tt>/opt/foolib/foo.fr_ca.qm</tt></li><li> <tt>/opt/foolib/foo.fr_ca</tt></li><li> <tt>/opt/foolib/foo.fr.qm</tt></li><li> <tt>/opt/foolib/foo.fr</tt></li><li> <tt>/opt/foolib/foo.qm</tt></li><li> <tt>/opt/foolib/foo</tt></li></ol>
*/

    @QtBlockedSlot
    public final boolean load(java.lang.String filename, java.lang.String directory, java.lang.String search_delimiters) {
        return load(filename, directory, search_delimiters, (java.lang.String)null);
    }

/**
Loads <tt>filename</tt> + <tt>suffix</tt> (". m" if the <tt>suffix</tt> is not specified), which may be an absolute file name or relative to <tt>directory</tt>. Returns true if the translation is successfully loaded; otherwise returns false. <p>The previous contents of this translator object are discarded. <p>If the file name does not exist, other file names are tried in the following order: <ol><li> File name without <tt>suffix</tt> appended.</li><li> File name with text after a character in <tt>search_delimiters</tt> stripped ("_." is the default for <tt>search_delimiters</tt> if it is an empty string) and <tt>suffix</tt>.</li><li> File name stripped without <tt>suffix</tt> appended.</li><li> File name stripped further, etc.</li></ol> For example, an application running in the fr_CA locale (French-speaking Canada) might call load("foo.fr_ca", "/opt/foolib"). {@link com.trolltech.qt.core.QTranslator#load(java.lang.String, java.lang.String, java.lang.String) load()} would then try to open the first existing readable file from this list: <ol><li> <tt>/opt/foolib/foo.fr_ca.qm</tt></li><li> <tt>/opt/foolib/foo.fr_ca</tt></li><li> <tt>/opt/foolib/foo.fr.qm</tt></li><li> <tt>/opt/foolib/foo.fr</tt></li><li> <tt>/opt/foolib/foo.qm</tt></li><li> <tt>/opt/foolib/foo</tt></li></ol>
*/

    @QtBlockedSlot
    public final boolean load(java.lang.String filename, java.lang.String directory) {
        return load(filename, directory, (java.lang.String)null, (java.lang.String)null);
    }

/**
Loads <tt>filename</tt> + <tt>suffix</tt> (". m" if the <tt>suffix</tt> is not specified), which may be an absolute file name or relative to <tt>directory</tt>. Returns true if the translation is successfully loaded; otherwise returns false. <p>The previous contents of this translator object are discarded. <p>If the file name does not exist, other file names are tried in the following order: <ol><li> File name without <tt>suffix</tt> appended.</li><li> File name with text after a character in <tt>search_delimiters</tt> stripped ("_." is the default for <tt>search_delimiters</tt> if it is an empty string) and <tt>suffix</tt>.</li><li> File name stripped without <tt>suffix</tt> appended.</li><li> File name stripped further, etc.</li></ol> For example, an application running in the fr_CA locale (French-speaking Canada) might call load("foo.fr_ca", "/opt/foolib"). {@link com.trolltech.qt.core.QTranslator#load(java.lang.String, java.lang.String, java.lang.String) load()} would then try to open the first existing readable file from this list: <ol><li> <tt>/opt/foolib/foo.fr_ca.qm</tt></li><li> <tt>/opt/foolib/foo.fr_ca</tt></li><li> <tt>/opt/foolib/foo.fr.qm</tt></li><li> <tt>/opt/foolib/foo.fr</tt></li><li> <tt>/opt/foolib/foo.qm</tt></li><li> <tt>/opt/foolib/foo</tt></li></ol>
*/

    @QtBlockedSlot
    public final boolean load(java.lang.String filename) {
        return load(filename, (java.lang.String)null, (java.lang.String)null, (java.lang.String)null);
    }
/**
Loads <tt>filename</tt> + <tt>suffix</tt> (". m" if the <tt>suffix</tt> is not specified), which may be an absolute file name or relative to <tt>directory</tt>. Returns true if the translation is successfully loaded; otherwise returns false. <p>The previous contents of this translator object are discarded. <p>If the file name does not exist, other file names are tried in the following order: <ol><li> File name without <tt>suffix</tt> appended.</li><li> File name with text after a character in <tt>search_delimiters</tt> stripped ("_." is the default for <tt>search_delimiters</tt> if it is an empty string) and <tt>suffix</tt>.</li><li> File name stripped without <tt>suffix</tt> appended.</li><li> File name stripped further, etc.</li></ol> For example, an application running in the fr_CA locale (French-speaking Canada) might call load("foo.fr_ca", "/opt/foolib"). {@link com.trolltech.qt.core.QTranslator#load(java.lang.String, java.lang.String, java.lang.String) load()} would then try to open the first existing readable file from this list: <ol><li> <tt>/opt/foolib/foo.fr_ca.qm</tt></li><li> <tt>/opt/foolib/foo.fr_ca</tt></li><li> <tt>/opt/foolib/foo.fr.qm</tt></li><li> <tt>/opt/foolib/foo.fr</tt></li><li> <tt>/opt/foolib/foo.qm</tt></li><li> <tt>/opt/foolib/foo</tt></li></ol>
*/

    @QtBlockedSlot
    public final boolean load(java.lang.String filename, java.lang.String directory, java.lang.String search_delimiters, java.lang.String suffix)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_load_String_String_String_String(nativeId(), filename, directory, search_delimiters, suffix);
    }
    @QtBlockedSlot
    native boolean __qt_load_String_String_String_String(long __this__nativeId, java.lang.String filename, java.lang.String directory, java.lang.String search_delimiters, java.lang.String suffix);

    @QtBlockedSlot
    private final boolean load(com.trolltech.qt.QNativePointer data, int len)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_load_nativepointer_int(nativeId(), data, len);
    }
    @QtBlockedSlot
    native boolean __qt_load_nativepointer_int(long __this__nativeId, com.trolltech.qt.QNativePointer data, int len);

/**
Returns true if this translator is empty, otherwise returns false. This function works with stripped and unstripped translation files.
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
Returns the translation for the key (<tt>context</tt>,
<tt>sourceText</tt>). If that fails, returns an empty string.
*/

    @QtBlockedSlot
    public final java.lang.String translate(java.lang.String context, java.lang.String sourceText) {
        return translate(context, sourceText, (java.lang.String)null);
    }
/**
Returns the translation for the key (<tt>context</tt>,
<tt>sourceText</tt>,
<tt>comment</tt>). If none is found, also tries (<tt>context</tt>,
<tt>sourceText</tt>, ""). If that still fails, returns an empty string.
*/

    @QtBlockedSlot
    public java.lang.String translate(java.lang.String context, java.lang.String sourceText, java.lang.String disambiguation)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_translate_nativepointer_nativepointer_nativepointer(nativeId(), context, sourceText, disambiguation);
    }
    @QtBlockedSlot
    native java.lang.String __qt_translate_nativepointer_nativepointer_nativepointer(long __this__nativeId, java.lang.String context, java.lang.String sourceText, java.lang.String disambiguation);

/**
@exclude
*/

    public static native QTranslator fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTranslator(QPrivateConstructor p) { super(p); } 

/**
Loads the .qm file data <tt>data</tt> into the translator. <p>The data is not copied. The caller must be able to guarantee that <tt>data</tt> will not be deleted or modified.
*/

    public final boolean load(byte data[]) {
        return load(com.trolltech.qt.internal.QtJambiInternal.byteArrayToNativePointer(data), data.length);
    }

}
