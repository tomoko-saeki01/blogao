package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTabletEvent class contains parameters that describe a Tablet event. Tablet Events are generated from a Wacom tablet. Most of the time you will want to deal with events from the tablet as if they were events from a mouse; for example, you would retrieve the cursor position with {@link com.trolltech.qt.gui.QTabletEvent#x() x()}, {@link com.trolltech.qt.gui.QTabletEvent#y() y()}, {@link com.trolltech.qt.gui.QTabletEvent#pos() pos()}, {@link com.trolltech.qt.gui.QTabletEvent#globalX() globalX()}, {@link com.trolltech.qt.gui.QTabletEvent#globalY() globalY()}, and {@link com.trolltech.qt.gui.QTabletEvent#globalPos() globalPos()}. In some situations you may wish to retrieve the extra information provided by the tablet device driver; for example, you might want to do subpixeling with higher resolution coordinates or you may want to adjust color brightness based on pressure. QTabletEvent allows you to read the {@link com.trolltech.qt.gui.QTabletEvent#pressure() pressure()}, the {@link com.trolltech.qt.gui.QTabletEvent#xTilt() xTilt()}, and {@link com.trolltech.qt.gui.QTabletEvent#yTilt() yTilt()}, as well as the type of device being used with {@link com.trolltech.qt.gui.QTabletEvent#device() device()} (see {@link com.trolltech.qt.gui.QTabletEvent.TabletDevice TabletDevice }). It can also give you the minimum and maximum values for each device's pressure and high resolution coordinates. <p>A tablet event contains a special accept flag that indicates whether the receiver wants the event. You should call {@link com.trolltech.qt.core.QEvent#accept() QTabletEvent::accept()} if you handle the tablet event; otherwise it will be sent to the parent widget. The exception are {@link com.trolltech.qt.core.QEvent.Type TabletEnterProximity } and {@link com.trolltech.qt.core.QEvent.Type TabletLeaveProximity } events, these are only sent to {@link com.trolltech.qt.gui.QApplication QApplication} and don't check whether or not they are accepted. <p>The {@link QWidget#setEnabled(boolean) QWidget::setEnabled()} function can be used to enable or disable mouse and keyboard events for a widget. <p>The event handler {@link com.trolltech.qt.gui.QWidget#tabletEvent(com.trolltech.qt.gui.QTabletEvent) QWidget::tabletEvent()} receives all three types of tablet events. Qt will first send a tabletEvent then, if it is not accepted, it will send a mouse event. This allows applications that don't utilize tablets to use a tablet like a mouse, while also enabling those who want to use both tablets and mouses differently.<a name="notes-for-x11-users"><h2>Notes for X11 Users</h2> Qt uses the following hard-coded names to identify tablet devices from the xorg.conf file on X11 (apart from IRIX): 'stylus', 'pen', and 'eraser'. If the devices have other names, they will not be picked up Qt.
*/
@QtJambiGeneratedClass
public class QTabletEvent extends com.trolltech.qt.gui.QInputEvent
{
/**
This enum defines what type of device is generating the event.
*/

    public enum TabletDevice implements com.trolltech.qt.QtEnumerator {
/**
 No device, or an unknown device.
*/

        NoDevice(0),
/**
 A Puck (a device that is similar to a flat mouse with a transparent circle with cross-hairs).
*/

        Puck(1),
/**
 A Stylus.
*/

        Stylus(2),
/**
 An airbrush
*/

        Airbrush(3),
/**
 A 4D Mouse.
*/

        FourDMouse(4),
        XFreeEraser(5),
/**
 A special stylus that also knows about rotation (a 6D stylus).
*/

        RotationStylus(6);

        TabletDevice(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTabletEvent$TabletDevice constant with the specified <tt>int</tt>.</brief>
*/

        public static TabletDevice resolve(int value) {
            return (TabletDevice) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoDevice;
            case 1: return Puck;
            case 2: return Stylus;
            case 3: return Airbrush;
            case 4: return FourDMouse;
            case 5: return XFreeEraser;
            case 6: return RotationStylus;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum defines what type of point is generating the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#pointerType() pointerType()}. <br></DD></DT>
*/

    public enum PointerType implements com.trolltech.qt.QtEnumerator {
/**
 An unknown device.
*/

        UnknownPointer(0),
/**
 Tip end of a stylus-like device (the narrow end of the pen).
*/

        Pen(1),
/**
 Any puck-like device.
*/

        Cursor(2),
/**
 Eraser end of a stylus-like device (the broad end of the pen).
*/

        Eraser(3);

        PointerType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QTabletEvent$PointerType constant with the specified <tt>int</tt>.</brief>
*/

        public static PointerType resolve(int value) {
            return (PointerType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return UnknownPointer;
            case 1: return Pen;
            case 2: return Cursor;
            case 3: return Eraser;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Construct a tablet event of the given <tt>type</tt>. <p>The <tt>pos</tt> parameter indicates where the event occurred in the widget; <tt>globalPos</tt> is the corresponding position in absolute coordinates. The <tt>hiResGlobalPos</tt> contains a high resolution measurement of the position. <p><tt>pressure</tt> contains the pressure exerted on the <tt>device</tt>. <p><tt>pointerType</tt> describes the type of pen that is being used. <p><tt>xTilt</tt> and <tt>yTilt</tt> contain the device's degree of tilt from the x and y axes respectively. <p><tt>keyState</tt> specifies which keyboard modifiers are pressed (e.g., <b>Ctrl</b>). <p>The <tt>uniqueID</tt> parameter contains the unique ID for the current device. <p>The <tt>z</tt> parameter contains the coordinate of the device on the tablet, this is usually given by a wheel on 4D mouse. If the device does not support a Z-axis, pass zero here. <p>The <tt>tangentialPressure</tt> paramater contins the tangential pressure of an air brush. If the device does not support tangential pressure, pass 0 here. <p><tt>rotation</tt> contains the device's rotation in degrees. 4D mice support rotation. If the device does not support rotation, pass 0 here. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#pos() pos()}, {@link com.trolltech.qt.gui.QTabletEvent#globalPos() globalPos()}, {@link com.trolltech.qt.gui.QTabletEvent#device() device()}, {@link com.trolltech.qt.gui.QTabletEvent#pressure() pressure()}, {@link com.trolltech.qt.gui.QTabletEvent#xTilt() xTilt()}, {@link com.trolltech.qt.gui.QTabletEvent#yTilt() yTilt()}, {@link com.trolltech.qt.gui.QTabletEvent#uniqueId() uniqueId()}, {@link com.trolltech.qt.gui.QTabletEvent#rotation() rotation()}, {@link com.trolltech.qt.gui.QTabletEvent#tangentialPressure() tangentialPressure()}, and {@link com.trolltech.qt.gui.QTabletEvent#z() z()}. <br></DD></DT>
*/

    public QTabletEvent(com.trolltech.qt.core.QEvent.Type t, com.trolltech.qt.core.QPoint pos, com.trolltech.qt.core.QPoint globalPos, com.trolltech.qt.core.QPointF hiResGlobalPos, int device, int pointerType, double pressure, int xTilt, int yTilt, double tangentialPressure, double rotation, int z, com.trolltech.qt.core.Qt.KeyboardModifiers keyState, long uniqueID){
        super((QPrivateConstructor)null);
        __qt_QTabletEvent_Type_QPoint_QPoint_QPointF_int_int_double_int_int_double_double_int_KeyboardModifiers_long(t.value(), pos == null ? 0 : pos.nativeId(), globalPos == null ? 0 : globalPos.nativeId(), hiResGlobalPos == null ? 0 : hiResGlobalPos.nativeId(), device, pointerType, pressure, xTilt, yTilt, tangentialPressure, rotation, z, keyState.value(), uniqueID);
    }

    native void __qt_QTabletEvent_Type_QPoint_QPoint_QPointF_int_int_double_int_int_double_double_int_KeyboardModifiers_long(int t, long pos, long globalPos, long hiResGlobalPos, int device, int pointerType, double pressure, int xTilt, int yTilt, double tangentialPressure, double rotation, int z, int keyState, long uniqueID);

/**
Returns the type of device that generated the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent.TabletDevice TabletDevice }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTabletEvent.TabletDevice device()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTabletEvent.TabletDevice.resolve(__qt_device(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_device(long __this__nativeId);

/**
Returns the global position of the device at the time of the event. This is important on asynchronous windows systems like X11; whenever you move your widgets around in response to mouse events, {@link com.trolltech.qt.gui.QTabletEvent#globalPos() globalPos()} can differ significantly from the current position {@link com.trolltech.qt.gui.QCursor#pos() QCursor::pos()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#globalX() globalX()}, {@link com.trolltech.qt.gui.QTabletEvent#globalY() globalY()}, and {@link com.trolltech.qt.gui.QTabletEvent#hiResGlobalPos() hiResGlobalPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint globalPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_globalPos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_globalPos(long __this__nativeId);

/**
Returns the global x position of the mouse pointer at the time of the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#globalY() globalY()}, {@link com.trolltech.qt.gui.QTabletEvent#globalPos() globalPos()}, and {@link com.trolltech.qt.gui.QTabletEvent#hiResGlobalX() hiResGlobalX()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int globalX()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_globalX(nativeId());
    }
    @QtBlockedSlot
    native int __qt_globalX(long __this__nativeId);

/**
Returns the global y position of the tablet device at the time of the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#globalX() globalX()}, {@link com.trolltech.qt.gui.QTabletEvent#globalPos() globalPos()}, and {@link com.trolltech.qt.gui.QTabletEvent#hiResGlobalY() hiResGlobalY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int globalY()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_globalY(nativeId());
    }
    @QtBlockedSlot
    native int __qt_globalY(long __this__nativeId);

/**
The high precision coordinates delivered from the tablet expressed. Sub pixeling information is in the fractional part of the {@link com.trolltech.qt.core.QPointF QPointF}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#globalPos() globalPos()}, {@link com.trolltech.qt.gui.QTabletEvent#hiResGlobalX() hiResGlobalX()}, and {@link com.trolltech.qt.gui.QTabletEvent#hiResGlobalY() hiResGlobalY()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPointF hiResGlobalPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hiResGlobalPos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_hiResGlobalPos(long __this__nativeId);

/**
The high precision x position of the tablet device.
*/

    @QtBlockedSlot
    public final double hiResGlobalX()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hiResGlobalX(nativeId());
    }
    @QtBlockedSlot
    native double __qt_hiResGlobalX(long __this__nativeId);

/**
The high precision y position of the tablet device.
*/

    @QtBlockedSlot
    public final double hiResGlobalY()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hiResGlobalY(nativeId());
    }
    @QtBlockedSlot
    native double __qt_hiResGlobalY(long __this__nativeId);

/**
Returns the type of point that generated the event.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QTabletEvent.PointerType pointerType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QTabletEvent.PointerType.resolve(__qt_pointerType(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_pointerType(long __this__nativeId);

/**
Returns the position of the device, relative to the widget that received the event. <p>If you move widgets around in response to mouse events, use {@link com.trolltech.qt.gui.QTabletEvent#globalPos() globalPos()} instead of this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#x() x()}, {@link com.trolltech.qt.gui.QTabletEvent#y() y()}, and {@link com.trolltech.qt.gui.QTabletEvent#globalPos() globalPos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint pos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_pos(long __this__nativeId);

/**
Returns the pressure for the device. 0.0 indicates that the stylus is not on the tablet, 1.0 indicates the maximum amount of pressure for the stylus. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#tangentialPressure() tangentialPressure()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double pressure()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pressure(nativeId());
    }
    @QtBlockedSlot
    native double __qt_pressure(long __this__nativeId);

/**
Returns the rotation of the current device in degress. This is usually given by a 4D Mouse. If the device doesn't support rotation this value is always 0.0.
*/

    @QtBlockedSlot
    public final double rotation()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rotation(nativeId());
    }
    @QtBlockedSlot
    native double __qt_rotation(long __this__nativeId);

/**
Returns the tangential pressure for the device. This is typically given by a finger wheel on an airbrush tool. The range is from -1.0 to 1.0. 0.0 indicates a neutral position. Current airbrushes can only move in the positive direction from the neutrual position. If the device does not support tangential pressure, this value is always 0.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#pressure() pressure()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final double tangentialPressure()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_tangentialPressure(nativeId());
    }
    @QtBlockedSlot
    native double __qt_tangentialPressure(long __this__nativeId);

/**
Returns a unique ID for the current device, making it possible to differentiate between multiple devices being used at the same time on the tablet. <p>Support of this feature is dependent on the tablet. <p>Values for the same device may vary from OS to OS. <p>Later versions of the Wacom driver for Linux will now report the ID information. If you have a tablet that supports unique ID and are not getting the information on Linux, consider upgrading your driver. <p>As of Qt 4.2, the unique ID is the same regardless of the orientation of the pen. Earlier versions would report a different value when using the eraser-end versus the pen-end of the stylus on some OS's. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#pointerType() pointerType()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long uniqueId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_uniqueId(nativeId());
    }
    @QtBlockedSlot
    native long __qt_uniqueId(long __this__nativeId);

/**
Returns the x position of the device, relative to the widget that received the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#y() y()}, and {@link com.trolltech.qt.gui.QTabletEvent#pos() pos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int x()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_x(nativeId());
    }
    @QtBlockedSlot
    native int __qt_x(long __this__nativeId);

/**
Returns the angle between the device (a pen, for example) and the perpendicular in the direction of the x axis. Positive values are towards the tablet's physical right. The angle is in the range -60 to +60 degrees. <br><center><img src="../images/qtabletevent-tilt.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#yTilt() yTilt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int xTilt()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_xTilt(nativeId());
    }
    @QtBlockedSlot
    native int __qt_xTilt(long __this__nativeId);

/**
Returns the y position of the device, relative to the widget that received the event. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#x() x()}, and {@link com.trolltech.qt.gui.QTabletEvent#pos() pos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int y()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_y(nativeId());
    }
    @QtBlockedSlot
    native int __qt_y(long __this__nativeId);

/**
Returns the angle between the device (a pen, for example) and the perpendicular in the direction of the y axis. Positive values are towards the bottom of the tablet. The angle is within the range -60 to +60 degrees. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#xTilt() xTilt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int yTilt()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_yTilt(nativeId());
    }
    @QtBlockedSlot
    native int __qt_yTilt(long __this__nativeId);

/**
Returns the z position of the device. Typically this is represented by a wheel on a 4D Mouse. If the device does not support a Z-axis, this value is always zero. This is <b>not</b> the same as pressure. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTabletEvent#pressure() pressure()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int z()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_z(nativeId());
    }
    @QtBlockedSlot
    native int __qt_z(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setMYT(int mYT)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMYT_int(nativeId(), mYT);
    }
    @QtBlockedSlot
    native void __qt_setMYT_int(long __this__nativeId, int mYT);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final int mYT()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mYT(nativeId());
    }
    @QtBlockedSlot
    native int __qt_mYT(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setMGPos(com.trolltech.qt.core.QPoint mGPos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMGPos_QPoint(nativeId(), mGPos == null ? 0 : mGPos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMGPos_QPoint(long __this__nativeId, long mGPos);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QPoint mGPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mGPos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_mGPos(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setMXT(int mXT)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMXT_int(nativeId(), mXT);
    }
    @QtBlockedSlot
    native void __qt_setMXT_int(long __this__nativeId, int mXT);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final int mXT()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mXT(nativeId());
    }
    @QtBlockedSlot
    native int __qt_mXT(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setMUnique(long mUnique)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMUnique_long(nativeId(), mUnique);
    }
    @QtBlockedSlot
    native void __qt_setMUnique_long(long __this__nativeId, long mUnique);

/**

*/

    @QtBlockedSlot
    protected final long mUnique()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mUnique(nativeId());
    }
    @QtBlockedSlot
    native long __qt_mUnique(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setMTangential(double mTangential)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMTangential_double(nativeId(), mTangential);
    }
    @QtBlockedSlot
    native void __qt_setMTangential_double(long __this__nativeId, double mTangential);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final double mTangential()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mTangential(nativeId());
    }
    @QtBlockedSlot
    native double __qt_mTangential(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setMPointerType(int mPointerType)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMPointerType_int(nativeId(), mPointerType);
    }
    @QtBlockedSlot
    native void __qt_setMPointerType_int(long __this__nativeId, int mPointerType);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final int mPointerType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mPointerType(nativeId());
    }
    @QtBlockedSlot
    native int __qt_mPointerType(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected final void setMHiResGlobalPos(com.trolltech.qt.core.QPointF mHiResGlobalPos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMHiResGlobalPos_QPointF(nativeId(), mHiResGlobalPos == null ? 0 : mHiResGlobalPos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMHiResGlobalPos_QPointF(long __this__nativeId, long mHiResGlobalPos);

/**

*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QPointF mHiResGlobalPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mHiResGlobalPos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPointF __qt_mHiResGlobalPos(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setMPos(com.trolltech.qt.core.QPoint mPos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMPos_QPoint(nativeId(), mPos == null ? 0 : mPos.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMPos_QPoint(long __this__nativeId, long mPos);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final com.trolltech.qt.core.QPoint mPos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mPos(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_mPos(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setMPress(double mPress)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMPress_double(nativeId(), mPress);
    }
    @QtBlockedSlot
    native void __qt_setMPress_double(long __this__nativeId, double mPress);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final double mPress()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mPress(nativeId());
    }
    @QtBlockedSlot
    native double __qt_mPress(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setMDev(int mDev)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMDev_int(nativeId(), mDev);
    }
    @QtBlockedSlot
    native void __qt_setMDev_int(long __this__nativeId, int mDev);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final int mDev()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mDev(nativeId());
    }
    @QtBlockedSlot
    native int __qt_mDev(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setMRot(double mRot)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMRot_double(nativeId(), mRot);
    }
    @QtBlockedSlot
    native void __qt_setMRot_double(long __this__nativeId, double mRot);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final double mRot()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mRot(nativeId());
    }
    @QtBlockedSlot
    native double __qt_mRot(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void setMZ(int mZ)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMZ_int(nativeId(), mZ);
    }
    @QtBlockedSlot
    native void __qt_setMZ_int(long __this__nativeId, int mZ);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final int mZ()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mZ(nativeId());
    }
    @QtBlockedSlot
    native int __qt_mZ(long __this__nativeId);

/**
@exclude
*/

    public static native QTabletEvent fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTabletEvent(QPrivateConstructor p) { super(p); } 

/**
<brief>Returns a string representation of the <tt>this QTabletEvent</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
