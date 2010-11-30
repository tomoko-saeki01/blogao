package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QStyleOptionToolBar class is used to describe the parameters for drawing a toolbar. QStyleOptionToolBar contains all the information that {@link com.trolltech.qt.gui.QStyle QStyle} functions need to draw {@link com.trolltech.qt.gui.QToolBar QToolBar}. <p>For performance reasons, the access to the member variables is direct (i.e., using the <tt>.</tt> or <tt>-&gt;</tt> operator). This low-level feel makes the structures straightforward to use and emphasizes that these are simply parameters used by the style functions. <p>The QStyleOptionToolBar class holds the lineWidth and the midLineWidth for drawing the widget. It also stores information about which area the toolbar should be located in, whether it is movable or not, which position the toolbar line should have (positionOfLine), and the toolbar's position within the line (positionWithinLine). <p>In addition, the class provides a couple of enums: The {@link com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarFeature ToolBarFeature } enum is used to describe whether a toolbar is movable or not, and the {@link com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarPosition ToolBarPosition } enum is used to describe the position of a toolbar line, as well as the toolbar's position within the line. <p>For an example demonstrating how style options can be used, see the {@link <a href="../qtjambi-styles.html">Styles</a>} example. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOption QStyleOption}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QStyleOptionToolBar extends com.trolltech.qt.gui.QStyleOption
    implements java.lang.Cloneable
{
/**
This enum is used to hold information about the version of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The version is used by {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclasses to implement extensions without breaking compatibility. If you use qstyleoption_cast(), you normally do not need to check it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionToolBar.StyleOptionType StyleOptionType }. <br></DD></DT>
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
<brief>Returns the QStyleOptionToolBar$StyleOptionVersion constant with the specified <tt>int</tt>.</brief>
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
This enum is used to hold information about the type of the style option, and is defined for each {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass. The type is used internally by {@link com.trolltech.qt.gui.QStyleOption QStyleOption}, its subclasses, and qstyleoption_cast() to determine the type of style option. In general you do not need to worry about this unless you want to create your own {@link com.trolltech.qt.gui.QStyleOption QStyleOption} subclass and your own styles. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStyleOptionToolBar.StyleOptionVersion StyleOptionVersion }. <br></DD></DT>
*/

    public enum StyleOptionType implements com.trolltech.qt.QtEnumerator {
/**
 The type of style option provided ({@link com.trolltech.qt.gui.QStyleOption.OptionType SO_ToolBar } for this class).
*/

        Type(16);

        StyleOptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionToolBar$StyleOptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static StyleOptionType resolve(int value) {
            return (StyleOptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 16: return Type;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
See the description for details.  <br><center><img src=". /images/qstyleoptiontoolbar-position.png"></center><br> This enum is used to describe the position of a toolbar line, as well as the toolbar's position within the line. <p>The order of the positions within a line starts at the top of a vertical line, and from the left within a horizontal line. The order of the positions for the lines is always from the the parent widget's boundary edges. <p><DT><b>See also:</b><br><DD>positionWithinLine, and positionOfLine. <br></DD></DT>
*/

    public enum ToolBarPosition implements com.trolltech.qt.QtEnumerator {
/**
 The toolbar is located at the beginning of the line, or the toolbar line is the first of several lines. There can only be one toolbar (and only one line) with this position.
*/

        Beginning(0),
/**
 The toolbar is located in the middle of the line, or the toolbar line is in the middle of several lines. There can several toolbars (and lines) with this position.
*/

        Middle(1),
/**
 The toolbar is located at the end of the line, or the toolbar line is the last of several lines. There can only be one toolbar (and only one line) with this position.
*/

        End(2),
/**
 There is only one toolbar or line. This is the default value of the positionOfLine and positionWithinLine variables.
*/

        OnlyOne(3);

        ToolBarPosition(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QStyleOptionToolBar$ToolBarPosition constant with the specified <tt>int</tt>.</brief>
*/

        public static ToolBarPosition resolve(int value) {
            return (ToolBarPosition) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Beginning;
            case 1: return Middle;
            case 2: return End;
            case 3: return OnlyOne;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum is used to describe whether a toolbar is movable or not. <p><DT><b>See also:</b><br><DD>features, and {@link QToolBar#isMovable() QToolBar::isMovable()}. <br></DD></DT>
*/

    public enum ToolBarFeature implements com.trolltech.qt.QtEnumerator {
/**
 The toolbar cannot be moved. The default value.
*/

        None(0),
/**
 The toolbar is movable, and a handle will appear when holding the cursor over the toolbar's boundary.
*/

        Movable(1);

        ToolBarFeature(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QStyleOptionToolBar$ToolBarFeatures with the specified <tt>com.trolltech.qt.gui.QStyleOptionToolBar$ToolBarFeature[]</tt> QStyleOptionToolBar$ToolBarFeature values set.</brief>
*/

        public static ToolBarFeatures createQFlags(ToolBarFeature ... values) {
            return new ToolBarFeatures(values);
        }
/**
<brief>Returns the QStyleOptionToolBar$ToolBarFeature constant with the specified <tt>int</tt>.</brief>
*/

        public static ToolBarFeature resolve(int value) {
            return (ToolBarFeature) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return None;
            case 1: return Movable;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class ToolBarFeatures extends com.trolltech.qt.QFlags<ToolBarFeature> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QStyleOptionToolBar-ToolBarFeatures with the specified <tt>com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarFeature[]</tt>. flags set.</brief>
*/

        public ToolBarFeatures(ToolBarFeature ... args) { super(args); }
        public ToolBarFeatures(int value) { setValue(value); }
    }



/**
Constructs a QStyleOptionToolBar, initializing the members variables to their default values.
*/

    public QStyleOptionToolBar(){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionToolBar();
    }

    native void __qt_QStyleOptionToolBar();

/**
Constructs a copy of the <tt>other</tt> style option.
*/

    public QStyleOptionToolBar(com.trolltech.qt.gui.QStyleOptionToolBar other){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionToolBar_QStyleOptionToolBar(other == null ? 0 : other.nativeId());
    }

    native void __qt_QStyleOptionToolBar_QStyleOptionToolBar(long other);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionToolBar(int version){
        super((QPrivateConstructor)null);
        __qt_QStyleOptionToolBar_int(version);
    }

    native void __qt_QStyleOptionToolBar_int(int version);

/**
This variable holds the line width for drawing the toolbar. <p>The default value is 0.
*/

    @QtBlockedSlot
    public final void setLineWidth(int lineWidth)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLineWidth_int(nativeId(), lineWidth);
    }
    @QtBlockedSlot
    native void __qt_setLineWidth_int(long __this__nativeId, int lineWidth);

/**
This variable holds the line width for drawing the toolbar. <p>The default value is 0.
*/

    @QtBlockedSlot
    public final int lineWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lineWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lineWidth(long __this__nativeId);

/**
This variable holds the position of the toolbar within a line. <p>The default value is {@link com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarPosition QStyleOptionToolBar::OnlyOne }.
*/

    @QtBlockedSlot
    public final void setPositionWithinLine(com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarPosition positionWithinLine)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPositionWithinLine_ToolBarPosition(nativeId(), positionWithinLine.value());
    }
    @QtBlockedSlot
    native void __qt_setPositionWithinLine_ToolBarPosition(long __this__nativeId, int positionWithinLine);

/**
This variable holds the position of the toolbar within a line. <p>The default value is {@link com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarPosition QStyleOptionToolBar::OnlyOne }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarPosition positionWithinLine()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarPosition.resolve(__qt_positionWithinLine(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_positionWithinLine(long __this__nativeId);

/**
This variable holds the position of the toolbar line. <p>The default value is {@link com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarPosition QStyleOptionToolBar::OnlyOne }.
*/

    @QtBlockedSlot
    public final void setPositionOfLine(com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarPosition positionOfLine)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPositionOfLine_ToolBarPosition(nativeId(), positionOfLine.value());
    }
    @QtBlockedSlot
    native void __qt_setPositionOfLine_ToolBarPosition(long __this__nativeId, int positionOfLine);

/**
This variable holds the position of the toolbar line. <p>The default value is {@link com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarPosition QStyleOptionToolBar::OnlyOne }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarPosition positionOfLine()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarPosition.resolve(__qt_positionOfLine(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_positionOfLine(long __this__nativeId);


/**

*/

    @QtBlockedSlot
    public final void setFeatures(com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarFeature ... features) {
        this.setFeatures(new com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarFeatures(features));
    }
/**
This variable holds whether the toolbar is movable or not. <p>The default value is {@link com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarFeature None }.
*/

    @QtBlockedSlot
    public final void setFeatures(com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarFeatures features)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFeatures_ToolBarFeatures(nativeId(), features.value());
    }
    @QtBlockedSlot
    native void __qt_setFeatures_ToolBarFeatures(long __this__nativeId, int features);

/**
This variable holds whether the toolbar is movable or not. <p>The default value is {@link com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarFeature None }.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarFeatures features()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QStyleOptionToolBar.ToolBarFeatures(__qt_features(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_features(long __this__nativeId);

/**
This variable holds the location for drawing the toolbar. <p>The default value is {@link com.trolltech.qt.core.Qt.ToolBarArea Qt::TopToolBarArea }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ToolBarArea Qt::ToolBarArea }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setToolBarArea(com.trolltech.qt.core.Qt.ToolBarArea toolBarArea)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolBarArea_ToolBarArea(nativeId(), toolBarArea.value());
    }
    @QtBlockedSlot
    native void __qt_setToolBarArea_ToolBarArea(long __this__nativeId, int toolBarArea);

/**
This variable holds the location for drawing the toolbar. <p>The default value is {@link com.trolltech.qt.core.Qt.ToolBarArea Qt::TopToolBarArea }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.Qt.ToolBarArea Qt::ToolBarArea }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.ToolBarArea toolBarArea()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.ToolBarArea.resolve(__qt_toolBarArea(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_toolBarArea(long __this__nativeId);

/**
This variable holds the mid-line width for drawing the toolbar. <p>The default value is 0.
*/

    @QtBlockedSlot
    public final void setMidLineWidth(int midLineWidth)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMidLineWidth_int(nativeId(), midLineWidth);
    }
    @QtBlockedSlot
    native void __qt_setMidLineWidth_int(long __this__nativeId, int midLineWidth);

/**
This variable holds the mid-line width for drawing the toolbar. <p>The default value is 0.
*/

    @QtBlockedSlot
    public final int midLineWidth()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_midLineWidth(nativeId());
    }
    @QtBlockedSlot
    native int __qt_midLineWidth(long __this__nativeId);

/**
@exclude
*/

    public static native QStyleOptionToolBar fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QStyleOptionToolBar(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QStyleOptionToolBar array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QStyleOptionToolBar clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QStyleOptionToolBar __qt_clone(long __this_nativeId);
}
