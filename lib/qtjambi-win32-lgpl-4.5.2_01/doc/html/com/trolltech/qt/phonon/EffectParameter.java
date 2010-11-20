package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class EffectParameter extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }
    public enum Hint implements com.trolltech.qt.QtEnumerator {
        ToggledHint(4),
        LogarithmicHint(16),
        IntegerHint(32);

        Hint(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.phonon.EffectParameter$Hints with the specified <tt>com.trolltech.qt.phonon.EffectParameter$Hint[]</tt> EffectParameter$Hint values set.</brief>
*/

        public static Hints createQFlags(Hint ... values) {
            return new Hints(values);
        }
/**
<brief>Returns the EffectParameter$Hint constant with the specified <tt>int</tt>.</brief>
*/

        public static Hint resolve(int value) {
            return (Hint) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 4: return ToggledHint;
            case 16: return LogarithmicHint;
            case 32: return IntegerHint;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class Hints extends com.trolltech.qt.QFlags<Hint> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a EffectParameter-Hints with the specified <tt>com.trolltech.qt.phonon.EffectParameter.Hint[]</tt>. flags set.</brief>
*/

        public Hints(Hint ... args) { super(args); }
        public Hints(int value) { setValue(value); }
    }



/**
This is an overloaded method provided for convenience.
*/

    public EffectParameter(com.trolltech.qt.phonon.EffectParameter rhs){
        super((QPrivateConstructor)null);
        __qt_EffectParameter_EffectParameter(rhs == null ? 0 : rhs.nativeId());
    }

    native void __qt_EffectParameter_EffectParameter(long rhs);


/**
This is an overloaded method provided for convenience.
*/

    public EffectParameter(int parameterId, java.lang.String name, com.trolltech.qt.phonon.EffectParameter.Hints hints, java.lang.Object defaultValue, java.lang.Object min, java.lang.Object max, java.util.List<java.lang.Object> values) {
        this(parameterId, name, hints, defaultValue, min, max, values, (java.lang.String)null);
    }
/**
This is an overloaded method provided for convenience.
*/

    public EffectParameter(int parameterId, java.lang.String name, com.trolltech.qt.phonon.EffectParameter.Hints hints, java.lang.Object defaultValue, java.lang.Object min, java.lang.Object max, java.util.List<java.lang.Object> values, java.lang.String description){
        super((QPrivateConstructor)null);
        __qt_EffectParameter_int_String_Hints_Object_Object_Object_List_String(parameterId, name, hints.value(), defaultValue, min, max, values, description);
    }

    native void __qt_EffectParameter_int_String_Hints_Object_Object_Object_List_String(int parameterId, java.lang.String name, int hints, java.lang.Object defaultValue, java.lang.Object min, java.lang.Object max, java.util.List<java.lang.Object> values, java.lang.String description);

/**
The default value.
*/

    @QtBlockedSlot
    public final java.lang.Object defaultValue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_defaultValue(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_defaultValue(long __this__nativeId);

/**
The parameter may come with a description (LADSPA doesn't have a field for this, so don't expect many effects to provide a description). <p>The description can be used for a tooltip or WhatsThis help. <p>Returns A text describing the parameter.
*/

    @QtBlockedSlot
    public final java.lang.String description()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_description(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_description(long __this__nativeId);

/**
Returns whether the parameter should be displayed using a logarithmic scale. This is particularly useful for frequencies and gains.
*/

    @QtBlockedSlot
    public final boolean isLogarithmicControl()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isLogarithmicControl(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isLogarithmicControl(long __this__nativeId);

/**
The maximum value to be used for the control to edit the parameter. <p>If the returned {@link com.trolltech.qt.QVariant QVariant} is invalid the value is not bounded from above.
*/

    @QtBlockedSlot
    public final java.lang.Object maximumValue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumValue(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_maximumValue(long __this__nativeId);

/**
The minimum value to be used for the control to edit the parameter. <p>If the returned {@link com.trolltech.qt.QVariant QVariant} is invalid the value is not bounded from below.
*/

    @QtBlockedSlot
    public final java.lang.Object minimumValue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimumValue(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_minimumValue(long __this__nativeId);

/**
The name of the parameter. Can be used as the label. <p>Returns A label for the parameter.
*/

    @QtBlockedSlot
    public final java.lang.String name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.phonon.EffectParameter rhs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_EffectParameter(nativeId(), rhs == null ? 0 : rhs.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_EffectParameter(long __this__nativeId, long rhs);

/**
The possible values to be used for the control to edit the parameter. <p>if the value of this parameter is to be picked from predefined values this returns the list (otherwise it returns an empty QVariantList).
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.Object> possibleValues()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_possibleValues(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.Object> __qt_possibleValues(long __this__nativeId);

/**
Returns the parameter type. <p>Common types are {@link com.trolltech.qt.QVariant.Type QVariant::Int }, {@link com.trolltech.qt.QVariant.Type QVariant::Double }, {@link com.trolltech.qt.QVariant.Type QVariant::Bool } and {@link com.trolltech.qt.QVariant.Type QVariant::String }. When {@link com.trolltech.qt.QVariant.Type QVariant::String } is returned you get the possible values from possibleValues.
*/

    @QtBlockedSlot
    public final int type()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_type(nativeId());
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
@exclude
*/

    public static native EffectParameter fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected EffectParameter(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(EffectParameter array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.phonon.EffectParameter)
        return operator_equal((com.trolltech.qt.phonon.EffectParameter) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public EffectParameter clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native EffectParameter __qt_clone(long __this_nativeId);
}
