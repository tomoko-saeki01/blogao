package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionHeader class is used to describe the parameters for drawing a header. QStyleOptionHeader contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw the item views' header pane, header sort arrow, and header label. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionHeader extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionHeader.StyleOptionType StyleOptionType }. <br></DD></DT>
*/

    public enum StyleOptionVersion implements com.trolltech.qt.QtEnumerator {
/**
 1
*/

        Version(1);

        StyleOptionVersion(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionHeader$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionVersion resolve(int value) {
            return (StyleOptionVersion) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Version;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum lets you know where the section's position is in relation to the other sections. <p><DT><b>See also:</b><br><DD>position. <br></DD></DT>
*/

    public enum SectionPosition implements com.trolltech.qt.QtEnumerator {
/**
 At the beginining of the header
*/

        Beginning(0),
/**
 In the middle of the header
*/

        Middle(1),
/**
 At the end of the header
*/

        End(2),
/**
 Only one header section
*/

        OnlyOneSection(3);

        SectionPosition(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionHeader$SectionPosition constant with the specified <tt>int</tt>.</brief>
*/

        public static SectionPosition resolve(int value) {
            return (SectionPosition) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Beginning;
            case 1: return Middle;
            case 2: return End;
            case 3: return OnlyOneSection;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum lets you know where the section's position is in relation to the selected section. <p><DT><b>See also:</b><br><DD>selectedPosition. <br></DD></DT>
*/

    public enum SelectedPosition implements com.trolltech.qt.QtEnumerator {
/**
 Not adjacent to the selected section
*/

        NotAdjacent(0),
/**
 The next section is selected
*/

        NextIsSelected(1),
/**
 The previous section is selected
*/

        PreviousIsSelected(2),
/**
 Both the next and previous section are selected
*/

        NextAndPreviousAreSelected(3);

        SelectedPosition(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionHeader$SelectedPosition constant with the specified <tt>int</tt>.</brief>
*/

        public static SelectedPosition resolve(int value) {
            return (SelectedPosition) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NotAdjacent;
            case 1: return NextIsSelected;
            case 2: return PreviousIsSelected;
            case 3: return NextAndPreviousAreSelected;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionHeader.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_Header } for this class).
*/

        Type(8);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionHeader$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 8: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
Indicates which direction the sort indicator should be drawn <p><DT><b>See also.</b><br><DD>sortIndicator. <br></DD></DT>
*/

    public enum SortIndicator implements com.trolltech.qt.QtEnumerator {
/**
 No sort indicator is needed
*/

        None(0),
/**
 Draw an up indicator
*/

        SortUp(1),
/**
 Draw a down indicator
*/

        SortDown(2);

        SortIndicator(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionHeader$SortIndicator constant with the specified <tt>int</tt>.</brief>
*/

        public static SortIndicator resolve(int value) {
            return (SortIndicator) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return None;
            case 1: return SortUp;
            case 2: return SortDown;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QStyleOptionHeader, initializing the members variables to their default values.
*/

    public QStyleOptionHeader(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionHeader();
    }

    native void __qt_QStyleOptionHeader();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionHeader(com.trolltech.qt.gui.QStyleOptionHeader other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionHeader_QStyleOptionHeader(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionHeader_QStyleOptionHeader(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionHeader(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionHeader_int(version);
    }

    native void __qt_QStyleOptionHeader_int(int version);

/**
This variable holds which section of the header is being painted. The default value is 0.
*/

    @QtBlockedSlot
    public final void setSection(int section)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSection_int(nativeId(), section);
    }
    @QtBlockedSlot
    native void __qt_setSection_int(long __this__nativeId, int section);

/**
This variable holds which section of the header is being painted. The default value is 0.
*/

    @QtBlockedSlot
    public final int section()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_section(nativeId());
    }
    @QtBlockedSlot
    native int __qt_section(long __this__nativeId);

/**
This variable holds the direction the sort indicator should be drawn. The default value is {@link com.trolltech.qt.gui.QStyleOptionHeader.SortIndicator QStyleOptionHeader::None }.
*/

    @QtBlockedSlot
    public final void setSortIndicator(com.trolltech.qt.gui.QStyleOptionHeader.SortIndicator sortIndicator)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSortIndicator_SortIndicator(nativeId(), sortIndicator.value());
    }
    @QtBlockedSlot
    native void __qt_setSortIndicator_SortIndicator(long __this__nativeId, int sortIndicator);

/**
This variable holds the direction the sort indicator should be drawn. The default value is {@link com.trolltech.qt.gui.QStyleOptionHeader.SortIndicator QStyleOptionHeader::None }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionHeader.SortIndicator sortIndicator()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStyleOptionHeader.SortIndicator.resolve(__qt_sortIndicator(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_sortIndicator(long __this__nativeId);

/**
This variable holds the section's position in relation to the other sections. The default value is {@link com.trolltech.qt.gui.QStyleOptionHeader.SectionPosition QStyleOptionHeader::Beginning }.
*/

    @QtBlockedSlot
    public final void setPosition(com.trolltech.qt.gui.QStyleOptionHeader.SectionPosition position)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPosition_SectionPosition(nativeId(), position.value());
    }
    @QtBlockedSlot
    native void __qt_setPosition_SectionPosition(long __this__nativeId, int position);

/**
This variable holds the section's position in relation to the other sections. The default value is {@link com.trolltech.qt.gui.QStyleOptionHeader.SectionPosition QStyleOptionHeader::Beginning }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionHeader.SectionPosition position()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStyleOptionHeader.SectionPosition.resolve(__qt_position(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_position(long __this__nativeId);

/**
This variable holds the icon of the header. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename.
*/

    @QtBlockedSlot
    public final void setIcon(com.trolltech.qt.gui.QIcon icon)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIcon_QIcon(nativeId(), icon == null ? 0 : icon.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIcon_QIcon(long __this__nativeId, long icon);

/**
This variable holds the icon of the header. The default value is an empty icon, i.e. an icon with neither a pixmap nor a filename.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon icon()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_icon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final void setTextAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... textAlignment) {
        this.setTextAlignment(new com.trolltech.qt.core.Qt.Alignment(textAlignment));
    }
/**
This variable holds the alignment flags for the text of the header. The default value is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }.
*/

    @QtBlockedSlot
    public final void setTextAlignment(com.trolltech.qt.core.Qt.Alignment textAlignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setTextAlignment_Alignment(nativeId(), textAlignment.value());
    }
    @QtBlockedSlot
    native void __qt_setTextAlignment_Alignment(long __this__nativeId, int textAlignment);

/**
This variable holds the alignment flags for the text of the header. The default value is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment textAlignment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_textAlignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_textAlignment(long __this__nativeId);

/**
This variable holds the text of the header. The default value is an empty string.
*/

    @QtBlockedSlot
    public final void setText(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setText_String(long __this__nativeId, java.lang.String text);

/**
This variable holds the text of the header. The default value is an empty string.
*/

    @QtBlockedSlot
    public final java.lang.String text()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
This variable holds the section's position in relation to the selected section. The default value is {@link com.trolltech.qt.gui.QStyleOptionHeader.SelectedPosition QStyleOptionHeader::NotAdjacent }
*/

    @QtBlockedSlot
    public final void setSelectedPosition(com.trolltech.qt.gui.QStyleOptionHeader.SelectedPosition selectedPosition)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSelectedPosition_SelectedPosition(nativeId(), selectedPosition.value());
    }
    @QtBlockedSlot
    native void __qt_setSelectedPosition_SelectedPosition(long __this__nativeId, int selectedPosition);

/**
This variable holds the section's position in relation to the selected section. The default value is {@link com.trolltech.qt.gui.QStyleOptionHeader.SelectedPosition QStyleOptionHeader::NotAdjacent }
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionHeader.SelectedPosition selectedPosition()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStyleOptionHeader.SelectedPosition.resolve(__qt_selectedPosition(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_selectedPosition(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final void setIconAlignment(com.trolltech.qt.core.Qt.AlignmentFlag ... iconAlignment) {
        this.setIconAlignment(new com.trolltech.qt.core.Qt.Alignment(iconAlignment));
    }
/**
This variable holds the alignment flags for the icon of the header. The default value is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }.
*/

    @QtBlockedSlot
    public final void setIconAlignment(com.trolltech.qt.core.Qt.Alignment iconAlignment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIconAlignment_Alignment(nativeId(), iconAlignment.value());
    }
    @QtBlockedSlot
    native void __qt_setIconAlignment_Alignment(long __this__nativeId, int iconAlignment);

/**
This variable holds the alignment flags for the icon of the header. The default value is {@link com.trolltech.qt.core.Qt.AlignmentFlag Qt::AlignLeft }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Alignment iconAlignment()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.Alignment(__qt_iconAlignment(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_iconAlignment(long __this__nativeId);

/**
This variable holds the header's orientation (horizontal or vertical). The default orientation is {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }
*/

    @QtBlockedSlot
    public final void setOrientation(com.trolltech.qt.core.Qt.Orientation orientation)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOrientation_Orientation(nativeId(), orientation.value());
    }
    @QtBlockedSlot
    native void __qt_setOrientation_Orientation(long __this__nativeId, int orientation);

/**
This variable holds the header's orientation (horizontal or vertical). The default orientation is {@link com.trolltech.qt.core.Qt.Orientation Qt::Horizontal }
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.Orientation orientation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.Orientation.resolve(__qt_orientation(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_orientation(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionHeader fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionHeader(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionHeader array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionHeader clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionHeader __qt_clone(long __this_nativeId);
}
