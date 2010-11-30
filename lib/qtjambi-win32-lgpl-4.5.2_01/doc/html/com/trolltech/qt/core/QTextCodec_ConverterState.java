package com.trolltech.qt.core;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QTextCodec_ConverterState extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }


/**

*/

    public QTextCodec_ConverterState(com.trolltech.qt.core.QTextCodec.ConversionFlag ... f) {
        this(new com.trolltech.qt.core.QTextCodec.ConversionFlags(f));
    }

/**
Constructs a ConverterState object.
*/

    public QTextCodec_ConverterState() {
        this(new com.trolltech.qt.core.QTextCodec.ConversionFlags(0));
    }
/**
Constructs a ConverterState object initialized with the given <tt>f</tt>.
*/

    public QTextCodec_ConverterState(com.trolltech.qt.core.QTextCodec.ConversionFlags f){
        super((QPrivateConstructor)null);
        __qt_QTextCodec_ConverterState_ConversionFlags(f.value());
    }

    native void __qt_QTextCodec_ConverterState_ConversionFlags(int f);


/**

*/

    @QtBlockedSlot
    public final void setFlags(com.trolltech.qt.core.QTextCodec.ConversionFlag ... flags) {
        this.setFlags(new com.trolltech.qt.core.QTextCodec.ConversionFlags(flags));
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setFlags(com.trolltech.qt.core.QTextCodec.ConversionFlags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFlags_ConversionFlags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_setFlags_ConversionFlags(long __this__nativeId, int flags);

/**
Returns the ConversionFlags of this ConverterState object.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextCodec.ConversionFlags flags()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QTextCodec.ConversionFlags(__qt_flags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_flags(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setRemainingChars(int remainingChars)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRemainingChars_int(nativeId(), remainingChars);
    }
    @QtBlockedSlot
    native void __qt_setRemainingChars_int(long __this__nativeId, int remainingChars);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int remainingChars()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_remainingChars(nativeId());
    }
    @QtBlockedSlot
    native int __qt_remainingChars(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setInvalidChars(int invalidChars)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInvalidChars_int(nativeId(), invalidChars);
    }
    @QtBlockedSlot
    native void __qt_setInvalidChars_int(long __this__nativeId, int invalidChars);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int invalidChars()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_invalidChars(nativeId());
    }
    @QtBlockedSlot
    native int __qt_invalidChars(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setState_data(int[] state_data)    {
        if (state_data.length != 3)
            throw new IllegalArgumentException("Wrong number of elements in array. Found: " + state_data.length + ", expected: 3");

        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setState_data_int_3(nativeId(), state_data);
    }
    @QtBlockedSlot
    native void __qt_setState_data_int_3(long __this__nativeId, int[] state_data);

    @QtBlockedSlot
    public final int[] state_data()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_state_data(nativeId());
    }
    @QtBlockedSlot
    native int[] __qt_state_data(long __this__nativeId);

/**
@exclude
*/

    public static native QTextCodec_ConverterState fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextCodec_ConverterState(QPrivateConstructor p) { super(p); } 
}
