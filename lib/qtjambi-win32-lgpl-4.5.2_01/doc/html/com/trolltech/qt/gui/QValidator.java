package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QValidator class provides validation of input text. The class itself is abstract. Two subclasses, {@link com.trolltech.qt.gui.QIntValidator QIntValidator} and {@link com.trolltech.qt.gui.QDoubleValidator QDoubleValidator}, provide basic numeric-range checking, and {@link com.trolltech.qt.gui.QRegExpValidator QRegExpValidator} provides general checking using a custom regular expression. <p>If the built-in validators aren't sufficient, you can subclass QValidator. The class has two virtual functions: {@link com.trolltech.qt.gui.QValidator#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()} and {@link com.trolltech.qt.gui.QValidator#fixup(java.lang.String) fixup()}. <p>{@link com.trolltech.qt.gui.QValidator#validate(com.trolltech.qt.gui.QValidator.QValidationData) validate()} must be implemented by every subclass. It returns {@link com.trolltech.qt.gui.QValidator.State Invalid }, {@link com.trolltech.qt.gui.QValidator.State Intermediate } or {@link com.trolltech.qt.gui.QValidator.State Acceptable } depending on whether its argument is valid (for the subclass's definition of valid). <p>These three states require some explanation. An {@link com.trolltech.qt.gui.QValidator.State Invalid } string is clearly invalid. {@link com.trolltech.qt.gui.QValidator.State Intermediate } is less obvious: the concept of validity is difficult to apply when the string is incomplete (still being edited). QValidator defines {@link com.trolltech.qt.gui.QValidator.State Intermediate } as the property of a string that is neither clearly invalid nor acceptable as a final result. {@link com.trolltech.qt.gui.QValidator.State Acceptable } means that the string is acceptable as a final result. One might say that any string that is a plausible intermediate state during entry of an {@link com.trolltech.qt.gui.QValidator.State Acceptable } string is {@link com.trolltech.qt.gui.QValidator.State Intermediate }. <p>Here are some examples: <ul><li> For a line edit that accepts integers from 10 to 1000 inclusive, 42 and 123 are {@link com.trolltech.qt.gui.QValidator.State Acceptable }, the empty string and 5 are {@link com.trolltech.qt.gui.QValidator.State Intermediate }, and "asdf" and 1114 is {@link com.trolltech.qt.gui.QValidator.State Invalid }.</li><li> For an editable combobox that accepts URLs, any well-formed URL is {@link com.trolltech.qt.gui.QValidator.State Acceptable }, "http://qtsoftware.com/," is {@link com.trolltech.qt.gui.QValidator.State Intermediate } (it might be a cut and paste action that accidentally took in a comma at the end), the empty string is {@link com.trolltech.qt.gui.QValidator.State Intermediate } (the user might select and delete all of the text in preparation for entering a new URL) and "http:///./" is {@link com.trolltech.qt.gui.QValidator.State Invalid }.</li><li> For a spin box that accepts lengths, "11cm" and "1in" are {@link com.trolltech.qt.gui.QValidator.State Acceptable }, "11" and the empty string are {@link com.trolltech.qt.gui.QValidator.State Intermediate }, and "http://qtsoftware.com" and "hour" are {@link com.trolltech.qt.gui.QValidator.State Invalid }.</li></ul> {@link com.trolltech.qt.gui.QValidator#fixup(java.lang.String) fixup()} is provided for validators that can repair some user errors. The default implementation does nothing. {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, for example, will call {@link com.trolltech.qt.gui.QValidator#fixup(java.lang.String) fixup()} if the user presses Enter (or Return) and the content is not currently valid. This allows the {@link com.trolltech.qt.gui.QValidator#fixup(java.lang.String) fixup()} function the opportunity of performing some magic to make an {@link com.trolltech.qt.gui.QValidator.State Invalid } string {@link com.trolltech.qt.gui.QValidator.State Acceptable }. <p>A validator has a locale, set with {@link com.trolltech.qt.gui.QValidator#setLocale(com.trolltech.qt.core.QLocale) setLocale()}. It is typically used to parse localized data. For example, {@link com.trolltech.qt.gui.QIntValidator QIntValidator} and {@link com.trolltech.qt.gui.QDoubleValidator QDoubleValidator} use it to parse localized representations of integers and doubles. <p>QValidator is typically used with {@link com.trolltech.qt.gui.QLineEdit QLineEdit}, {@link com.trolltech.qt.gui.QSpinBox QSpinBox} and {@link com.trolltech.qt.gui.QComboBox QComboBox}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIntValidator QIntValidator}, {@link com.trolltech.qt.gui.QDoubleValidator QDoubleValidator}, {@link com.trolltech.qt.gui.QRegExpValidator QRegExpValidator}, and {@link <a href="../qtjambi-lineedits.html">Line Edits Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QValidator extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QValidator {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QValidator.State validate(com.trolltech.qt.gui.QValidator.QValidationData arg__1) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return com.trolltech.qt.gui.QValidator.State.resolve(super.__qt_validate_nativepointer_nativepointer(nativeId(), arg__1));
        }
    }

    
/**
This enum type defines the states in which a validated string can exist.
*/
@QtBlockedEnum
    public enum State implements com.trolltech.qt.QtEnumerator {
/**
 The string is clearly invalid.
*/

        Invalid(0),
/**
 The string is a plausible intermediate value.
*/

        Intermediate(1),
/**
 The string is acceptable as a final result; i.e. it is valid.
*/

        Acceptable(2);

        State(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QValidator$State constant with the specified <tt>int</tt>.</brief>
*/

        public static State resolve(int value) {
            return (State) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Invalid;
            case 1: return Intermediate;
            case 2: return Acceptable;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Sets up the validator. The <tt>parent</tt> parameter is passed on to the {@link com.trolltech.qt.core.QObject QObject} constructor.
*/

    public QValidator(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QValidator_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QValidator_QObject(long parent);

/**
Returns the locale for the validator. The locale is by default initialized to the same as QLocale(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QValidator#setLocale(com.trolltech.qt.core.QLocale) setLocale()}, and QLocale::QLocale(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QLocale locale()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_locale(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QLocale __qt_locale(long __this__nativeId);

/**
Sets the <tt>locale</tt> that will be used for the validator. Unless setLocale has been called, the validator will use the default locale set with {@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) QLocale::setDefault()}. If a default locale has not been set, it is the operating system's locale. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QValidator#locale() locale()}, and {@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) QLocale::setDefault()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLocale(com.trolltech.qt.core.QLocale locale)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLocale_QLocale(nativeId(), locale == null ? 0 : locale.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLocale_QLocale(long __this__nativeId, long locale);

/**
This function attempts to change <tt>input</tt> to be valid according to this validator's rules. It need not result in a valid string: callers of this function must re-test afterwards; the default does nothing. <p>Reimplementations of this function can change <tt>input</tt> even if they do not produce a valid string. For example, an ISBN validator might want to delete every character except digits and "-", even if the result is still not a valid ISBN; a surname validator might want to remove whitespace from the start and end of the string, even if the resulting string is not in the list of accepted surnames.
*/

    @QtBlockedSlot
    public java.lang.String fixup(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fixup_nativepointer(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native java.lang.String __qt_fixup_nativepointer(long __this__nativeId, java.lang.String arg__1);

/**
This virtual function returns {@link com.trolltech.qt.gui.QValidator.State Invalid } if <tt>input</tt> is invalid according to this validator's rules, {@link com.trolltech.qt.gui.QValidator.State Intermediate } if it is likely that a little more editing will make the input acceptable (e.g. the user types "4" into a widget which accepts integers between 10 and 99), and {@link com.trolltech.qt.gui.QValidator.State Acceptable } if the input is valid. <p>The function can change both <tt>input</tt> and <tt>pos</tt> (the cursor position) if required.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QValidator.State validate(com.trolltech.qt.gui.QValidator.QValidationData arg__1);
    @QtBlockedSlot
    native int __qt_validate_nativepointer_nativepointer(long __this__nativeId, com.trolltech.qt.gui.QValidator.QValidationData arg__1);

/**
@exclude
*/

    public static native QValidator fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QValidator(QPrivateConstructor p) { super(p); } 

    public static class QValidationData {
        public QValidationData(String input, int pos) {
            string = input;
            position = pos;
        }

        public String string;
        public int position;
    }

}
