package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextOption class provides a description of general rich text properties. QTextOption is used to encapsulate common rich text properties in a single object. It contains information about text alignment, layout direction, word wrapping, and other standard properties associated with text rendering and layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextEdit QTextEdit}, {@link com.trolltech.qt.gui.QTextDocument QTextDocument}, and {@link com.trolltech.qt.gui.QTextCursor QTextCursor}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTextOption extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum holds the different types of tabulator
*/

    public enum TabType implements com.trolltech.qt.QtEnumerator {
/**
 , A left-tab
*/

        LeftTab(0),
/**
 , A right-tab
*/

        RightTab(1),
/**
 , A centered-tab
*/

        CenterTab(2),
/**
 A tab stopping at a certain delimiter-character
*/

        DelimiterTab(3);

        TabType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextOption$TabType constant with the specified <tt>int</tt>.</brief>
*/

        public static TabType resolve(int value) {
            return (TabType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return LeftTab;
            case 1: return RightTab;
            case 2: return CenterTab;
            case 3: return DelimiterTab;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum Flag implements com.trolltech.qt.QtEnumerator {
/**
 Visualize spaces with little dots, and tabs with little arrows.
*/

        ShowTabsAndSpaces(1),
/**
 Visualize line and paragraph separators with appropriate symbol characters.
*/

        ShowLineAndParagraphSeparators(2),
/**
 While determining the line-break positions take into account the space added for drawing a separator character.
*/

        AddSpaceForLineAndParagraphSeparators(4),
/**
 Suppress all color changes in the character formats (except the main selection).
*/

        SuppressColors(8),
/**
 When this option is set, {@link com.trolltech.qt.gui.QTextLine#naturalTextWidth() QTextLine::naturalTextWidth()} and naturalTextRect() will return a value that includes the width of trailing spaces in the text; otherwise this width is excluded.
*/

        IncludeTrailingSpaces(-2147483648);

        Flag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Creates a QTextOption-Flags with the specified <tt>com.trolltech.qt.gui.QTextOption.Flag[]</tt>. flags set.</brief>
*/

/**
<brief>This function creates a com.trolltech.qt.gui.QTextOption$Flags with the specified <tt>com.trolltech.qt.gui.QTextOption$Flag[]</tt> QTextOption$Flag values set.</brief>
*/

        public static Flags createQFlags(Flag ... values) {
            return new Flags(values);
        }
/**
<brief>Returns the QTextOption$Flag constant with the specified <tt>int</tt>.</brief>
*/

        public static Flag resolve(int value) {
            return (Flag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return ShowTabsAndSpaces;
            case 2: return ShowLineAndParagraphSeparators;
            case 4: return AddSpaceForLineAndParagraphSeparators;
            case 8: return SuppressColors;
            case -2147483648: return IncludeTrailingSpaces;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class Flags extends com.trolltech.qt.QFlags<Flag> {
        private static final long serialVersionUID = 1L;
        public Flags(Flag ... args) { super(args); }
        public Flags(int value) { setValue(value); }
    }
/**
This enum describes how text is wrapped in a document.
*/


    public enum WrapMode implements com.trolltech.qt.QtEnumerator {
/**
 Text is not wrapped at all.
*/

        NoWrap(0),
/**
 Text is wrapped at word boundaries.
*/

        WordWrap(1),
/**
 Wrapping occurs at a manually specified length from the start of the line.
*/

        ManualWrap(2),
/**
 Text can be wrapped at any point on a line, even if it occurs in the middle of a word.
*/

        WrapAnywhere(3),
/**
 If possible, wrapping occurs at a word boundary; otherwise it will occur at the appropriate point on the line, even in the middle of a word.
*/

        WrapAtWordBoundaryOrAnywhere(4);

        WrapMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTextOption$WrapMode constant with the specified <tt>int</tt>.</brief>
*/

        public static WrapMode resolve(int value) {
            return (WrapMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoWrap;
            case 1: return WordWrap;
            case 2: return ManualWrap;
            case 3: return WrapAnywhere;
            case 4: return WrapAtWordBoundaryOrAnywhere;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a text option with default properties for text.
*/

    public QTextOption(){
        super((QPrivateConstructor)null);
        __qt_QTextOption();
    }

    native void __qt_QTextOption();


/**
This is an overloaded method provided for convenience.
*/

    public QTextOption(com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this(new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
Constructs a text option with the given <tt>alignment</tt> for text.
*/

    public QTextOption(com.trolltech.qt.core.Qt.Alignment alignment){
        super((QPrivateConstructor)null);
        __qt_QTextOption_Alignment(alignment.value());
    }

    native void __qt_QTextOption_Alignment(int alignment);

/**
Construct a copy of the <tt>other</tt> text option.
*/

    public QTextOption(com.trolltech.qt.gui.QTextOption o){
        super((QPrivateConstructor)null);
        __qt_QTextOption_QTextOption(o == null ? 0 : o.nativeId());
    }

    native void __qt_QTextOption_QTextOption(long o);

/**
Returns the text alignment defined by the option. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag[]) setAlignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment alignment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_alignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_alignment(long __this__nativeId);

/**
Returns the flags associated with the option. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#setFlags(com.trolltech.qt.gui.QTextOption.Flag[]) setFlags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextOption.Flags flags()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QTextOption.Flags(__qt_flags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_flags(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... alignment) {
        this.setAlignment(new com.trolltech.qt.core.Qt.Alignment(alignment));
    }
/**
Sets the option's text alignment to the specified <tt>alignment</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#alignment() alignment()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAlignment(com.trolltech.qt.core.Qt.Alignment alignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlignment_Alignment(nativeId(), alignment.value());
    }
    @QtBlockedSlot
    native void __qt_setAlignment_Alignment(long __this__nativeId, int alignment);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setFlags(com.trolltech.qt.gui.QTextOption.Flag ... flags) {
        this.setFlags(new com.trolltech.qt.gui.QTextOption.Flags(flags));
    }
/**
Sets the flags associated with the option to the given <tt>flags</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#flags() flags()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFlags(com.trolltech.qt.gui.QTextOption.Flags flags)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFlags_Flags(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native void __qt_setFlags_Flags(long __this__nativeId, int flags);

/**
Sets the tab positions for the text layout to those specified by <tt>tabStops</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#tabArray() tabArray()}, {@link com.trolltech.qt.gui.QTextOption#setTabStop(double) setTabStop()}, and {@link com.trolltech.qt.gui.QTextOption#setTabs(java.util.List) setTabs()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTabArray(java.util.List<java.lang.Double> tabStops)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabArray_List(nativeId(), tabStops);
    }
    @QtBlockedSlot
    native void __qt_setTabArray_List(long __this__nativeId, java.util.List<java.lang.Double> tabStops);

/**
Sets the default distance in device units between tab stops to the value specified by <tt>tabStop</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#tabStop() tabStop()}, {@link com.trolltech.qt.gui.QTextOption#setTabArray(java.util.List) setTabArray()}, {@link com.trolltech.qt.gui.QTextOption#setTabs(java.util.List) setTabs()}, and {@link com.trolltech.qt.gui.QTextOption#tabs() tabs()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTabStop(double tabStop)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabStop_double(nativeId(), tabStop);
    }
    @QtBlockedSlot
    native void __qt_setTabStop_double(long __this__nativeId, double tabStop);

/**
Set the Tab properties to <tt>tabStops</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#tabStop() tabStop()}, and {@link com.trolltech.qt.gui.QTextOption#tabs() tabs()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTabs(java.util.List<com.trolltech.qt.gui.QTextOption_Tab> tabStops)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTabs_List(nativeId(), tabStops);
    }
    @QtBlockedSlot
    native void __qt_setTabs_List(long __this__nativeId, java.util.List<com.trolltech.qt.gui.QTextOption_Tab> tabStops);

/**
Sets the direction of the text layout defined by the option to the given <tt>direction</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#textDirection() textDirection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setTextDirection(com.trolltech.qt.core.Qt.LayoutDirection aDirection)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextDirection_LayoutDirection(nativeId(), aDirection.value());
    }
    @QtBlockedSlot
    native void __qt_setTextDirection_LayoutDirection(long __this__nativeId, int aDirection);

/**
If <tt>enable</tt> is true then the layout will use design metrics; otherwise it will use the metrics of the paint device (which is the default behavior). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#useDesignMetrics() useDesignMetrics()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUseDesignMetrics(boolean b)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUseDesignMetrics_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setUseDesignMetrics_boolean(long __this__nativeId, boolean b);

/**
Sets the option's text wrap mode to the given <tt>mode</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#wrapMode() wrapMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setWrapMode(com.trolltech.qt.gui.QTextOption.WrapMode wrap)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWrapMode_WrapMode(nativeId(), wrap.value());
    }
    @QtBlockedSlot
    native void __qt_setWrapMode_WrapMode(long __this__nativeId, int wrap);

/**
Returns a list of tab positions defined for the text layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#setTabArray(java.util.List) setTabArray()}, and {@link com.trolltech.qt.gui.QTextOption#tabStop() tabStop()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.Double> tabArray()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabArray(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.Double> __qt_tabArray(long __this__nativeId);

/**
Returns the distance in device units between tab stops. Convenient function for the above method <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#setTabStop(double) setTabStop()}, {@link com.trolltech.qt.gui.QTextOption#tabArray() tabArray()}, {@link com.trolltech.qt.gui.QTextOption#setTabs(java.util.List) setTabs()}, and {@link com.trolltech.qt.gui.QTextOption#tabs() tabs()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double tabStop()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabStop(nativeId());
    }
    @QtBlockedSlot
    native double __qt_tabStop(long __this__nativeId);

/**
Returns a list of tab positions defined for the text layout. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#tabStop() tabStop()}, {@link com.trolltech.qt.gui.QTextOption#setTabs(java.util.List) setTabs()}, and {@link com.trolltech.qt.gui.QTextOption#setTabStop(double) setTabStop()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.gui.QTextOption_Tab> tabs()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tabs(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QTextOption_Tab> __qt_tabs(long __this__nativeId);

/**
Returns the direction of the text layout defined by the option. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#setTextDirection(com.trolltech.qt.core.Qt.LayoutDirection) setTextDirection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.LayoutDirection textDirection()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.LayoutDirection.resolve(__qt_textDirection(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_textDirection(long __this__nativeId);

/**
Returns true if the layout uses design rather than device metrics; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#setUseDesignMetrics(boolean) setUseDesignMetrics()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean useDesignMetrics()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_useDesignMetrics(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_useDesignMetrics(long __this__nativeId);

/**
Returns the text wrap mode defined by the option. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextOption#setWrapMode(com.trolltech.qt.gui.QTextOption.WrapMode) setWrapMode()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTextOption.WrapMode wrapMode()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTextOption.WrapMode.resolve(__qt_wrapMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_wrapMode(long __this__nativeId);

/**
@exclude
*/

    public static native QTextOption fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextOption(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QTextOption array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QTextOption clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QTextOption __qt_clone(long __this_nativeId);
}
