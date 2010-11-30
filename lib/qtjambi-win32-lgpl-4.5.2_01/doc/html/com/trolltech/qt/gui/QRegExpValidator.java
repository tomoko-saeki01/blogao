package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QRegExpValidator class is used to check a string against a regular expression. QRegExpValidator uses a regular expression (regexp) to determine whether an input string is {@link com.trolltech.qt.gui.QValidator.State Acceptable }, {@link com.trolltech.qt.gui.QValidator.State Intermediate }, or {@link com.trolltech.qt.gui.QValidator.State Invalid }. The regexp can either be supplied when the QRegExpValidator is constructed, or at a later time. <p>When QRegExpValidator determines whether a string is {@link com.trolltech.qt.gui.QValidator.State Acceptable } or not, the regexp is treated as if it begins with the start of string assertion (<b>^</b>) and ends with the end of string assertion (<b>$</b>); the match is against the entire input string, or from the given position if a start position greater than zero is given. <p>If a string is a prefix of an {@link com.trolltech.qt.gui.QValidator.State Acceptable } string, it is considered {@link com.trolltech.qt.gui.QValidator.State Intermediate }. For example, "" and "A" are {@link com.trolltech.qt.gui.QValidator.State Intermediate } for the regexp <b>[A-Z][0-9]</b> (whereas "_" would be {@link com.trolltech.qt.gui.QValidator.State Invalid }). <p>For a brief introduction to Qt's regexp engine, see {@link com.trolltech.qt.core.QRegExp QRegExp}. <p>Example of use: <pre class="snippet">
    // regexp: optional '-' followed by between 1 and 3 digits
    QRegExp rx = new QRegExp("-?\\d{1,3}");
    QValidator validator = new QRegExpValidator(rx, this);

    QLineEdit edit = new QLineEdit(this);
    edit.setValidator(validator);
</pre> Below we present some examples of validators. In practice they would normally be associated with a widget as in the example above. <pre class="snippet">
    // integers 1 to 9999
    QRegExp rx = new QRegExp("[1-9]\\d{0,3}");
    // the validator treats the regexp as "^[1-9]\\d{0,3}$"
    QRegExpValidator v = new QRegExpValidator(rx, null);
    String s;
    int pos = 0;

    s = "0";     v.validate(new QValidator.QValidationData(s, pos));    // returns Invalid
    s = "12345"; v.validate(new QValidator.QValidationData(s, pos));    // returns Invalid
    s = "1";     v.validate(new QValidator.QValidationData(s, pos));    // returns Acceptable

    rx.setPattern("\\S+");            // one or more non-whitespace characters
    v.setRegExp(rx);
    s = "myfile.txt";  v.validate(new QValidator.QValidationData(s, pos)); // Returns Acceptable
    s = "my file.txt"; v.validate(new QValidator.QValidationData(s, pos)); // Returns Invalid

    // A, B or C followed by exactly five digits followed by W, X, Y or Z
    rx.setPattern("[A-C]\\d{5}[W-Z]");
    v.setRegExp(rx);
    s = "a12345Z"; v.validate(new QValidator.QValidationData(s, pos));        // Returns Invalid
    s = "A12345Z"; v.validate(new QValidator.QValidationData(s, pos));        // Returns Acceptable
    s = "B12";     v.validate(new QValidator.QValidationData(s, pos));        // Returns Intermediate

    // match most 'readme' files
    rx.setPattern("read\\S?me(\\.(txt|asc|1st))?");
    rx.setCaseSensitivity(Qt.CaseSensitivity.CaseInsensitive);
    v.setRegExp(rx);
    s = "readme";      v.validate(new QValidator.QValidationData(s, pos)); // Returns Acceptable
    s = "README.1ST";  v.validate(new QValidator.QValidationData(s, pos)); // Returns Acceptable
    s = "read me.txt"; v.validate(new QValidator.QValidationData(s, pos)); // Returns Invalid
    s = "readm";       v.validate(new QValidator.QValidationData(s, pos)); // Returns Intermediate
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp QRegExp}, {@link com.trolltech.qt.gui.QIntValidator QIntValidator}, {@link com.trolltech.qt.gui.QDoubleValidator QDoubleValidator}, and {@link <a href="../tools-settingseditor.html">Settings Editor Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QRegExpValidator extends com.trolltech.qt.gui.QValidator
{

/**
Constructs a validator with a <tt>parent</tt> object that accepts any string (including an empty one) as valid.
*/

    public QRegExpValidator(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QRegExpValidator_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QRegExpValidator_QObject(long parent);

/**
Constructs a validator with a <tt>parent</tt> object that accepts all strings that match the regular expression <tt>rx</tt>. <p>The match is made against the entire string; e.g. if the regexp is <b>[A-Fa-f0-9]+</b> it will be treated as <b>^[A-Fa-f0-9]+$</b>.
*/

    public QRegExpValidator(com.trolltech.qt.core.QRegExp rx, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QRegExpValidator_QRegExp_QObject(rx == null ? 0 : rx.nativeId(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QRegExpValidator_QRegExp_QObject(long rx, long parent);

/**
This property holds the regular expression used for validation. By default, this property contains a regular expression with the pattern <tt>.*</tt> that matches any string.
*/

    @com.trolltech.qt.QtPropertyReader(name="regExp")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QRegExp regExp()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_regExp(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRegExp __qt_regExp(long __this__nativeId);

/**
This property holds the regular expression used for validation. By default, this property contains a regular expression with the pattern <tt>.*</tt> that matches any string.
*/

    @com.trolltech.qt.QtPropertyWriter(name="regExp")
    @QtBlockedSlot
    public final void setRegExp(com.trolltech.qt.core.QRegExp rx)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRegExp_QRegExp(nativeId(), rx == null ? 0 : rx.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setRegExp_QRegExp(long __this__nativeId, long rx);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QValidator.State validate(com.trolltech.qt.gui.QValidator.QValidationData input)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QValidator.State.resolve(__qt_validate_nativepointer_nativepointer(nativeId(), input));
    }
    @QtBlockedSlot
    native int __qt_validate_nativepointer_nativepointer(long __this__nativeId, com.trolltech.qt.gui.QValidator.QValidationData input);

/**
@exclude
*/

    public static native QRegExpValidator fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QRegExpValidator(QPrivateConstructor p) { super(p); } 
}
