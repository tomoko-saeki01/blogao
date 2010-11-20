package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QNetworkInterface class provides a listing of the host's IP addresses and network interfaces. QNetworkInterface represents one network interface attached to the host where the program is being run. Each network interface may contain zero or more IP addresses, each of which is optionally associated with a netmask and/or a broadcast address. The list of such trios can be obtained with {@link com.trolltech.qt.network.QNetworkInterface#addressEntries() addressEntries()}. Alternatively, when the netmask or the broadcast addresses aren't necessary, use the {@link com.trolltech.qt.network.QNetworkInterface#allAddresses() allAddresses()} convenience function to obtain just the IP addresses. <p>QNetworkInterface also reports the interface's hardware address with {@link com.trolltech.qt.network.QNetworkInterface#hardwareAddress() hardwareAddress()}. <p>Not all operating systems support reporting all features. Only the IPv4 addresses are guaranteed to be listed by this class in all platforms. In particular, IPv6 address listing is only supported on Windows XP and more recent versions, Linux, MacOS X and the BSDs. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAddressEntry QNetworkAddressEntry}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QNetworkInterface extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
/**
Specifies the flags associated with this network interface. The possible values are: Note that one network interface cannot be both broadcast-based and point-to-point.
*/

    public enum InterfaceFlag implements com.trolltech.qt.QtEnumerator {
/**
 the network interface is active
*/

        IsUp(1),
/**
 the network interface has resources allocated
*/

        IsRunning(2),
/**
 the network interface works in broadcast mode
*/

        CanBroadcast(4),
/**
 the network interface is a loopback interface. that is, it's a virtual interface whose destination is the host computer itself
*/

        IsLoopBack(8),
/**
 the network interface is a point-to-point interface. that is, there is one, single other address that can be directly reached by it.
*/

        IsPointToPoint(16),
/**
 the network interface supports multicasting
*/

        CanMulticast(32);

        InterfaceFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.network.QNetworkInterface$InterfaceFlags with the specified <tt>com.trolltech.qt.network.QNetworkInterface$InterfaceFlag[]</tt> QNetworkInterface$InterfaceFlag values set.</brief>
*/

        public static InterfaceFlags createQFlags(InterfaceFlag ... values) {
            return new InterfaceFlags(values);
        }
/**
<brief>Returns the QNetworkInterface$InterfaceFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static InterfaceFlag resolve(int value) {
            return (InterfaceFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return IsUp;
            case 2: return IsRunning;
            case 4: return CanBroadcast;
            case 8: return IsLoopBack;
            case 16: return IsPointToPoint;
            case 32: return CanMulticast;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class InterfaceFlags extends com.trolltech.qt.QFlags<InterfaceFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QNetworkInterface-InterfaceFlags with the specified <tt>com.trolltech.qt.network.QNetworkInterface.InterfaceFlag[]</tt>. flags set.</brief>
*/

        public InterfaceFlags(InterfaceFlag ... args) { super(args); }
        public InterfaceFlags(int value) { setValue(value); }
    }



/**
Constructs an empty network interface object.
*/

    public QNetworkInterface(){
        super((QPrivateConstructor)null);
        __qt_QNetworkInterface();
    }

    native void __qt_QNetworkInterface();

/**
Creates a copy of the the QNetworkInterface object contained in <tt>other</tt>.
*/

    public QNetworkInterface(com.trolltech.qt.network.QNetworkInterface other){
        super((QPrivateConstructor)null);
        __qt_QNetworkInterface_QNetworkInterface(other == null ? 0 : other.nativeId());
    }

    native void __qt_QNetworkInterface_QNetworkInterface(long other);

/**
Returns the list of IP addresses that this interface possesses along with their associated netmasks and broadcast addresses. <p>If the netmask or broadcast address information is not necessary, you can call the {@link com.trolltech.qt.network.QNetworkInterface#allAddresses() allAddresses()} function to obtain just the IP addresses.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.network.QNetworkAddressEntry> addressEntries()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addressEntries(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.network.QNetworkAddressEntry> __qt_addressEntries(long __this__nativeId);

/**
Returns the flags associated with this network interface.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkInterface.InterfaceFlags flags()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.network.QNetworkInterface.InterfaceFlags(__qt_flags(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_flags(long __this__nativeId);

/**
Returns the low-level hardware address for this interface. On Ethernet interfaces, this will be a MAC address in string representation, separated by colons. <p>Other interface types may have other types of hardware addresses. Implementations should not depend on this function returning a valid MAC address.
*/

    @QtBlockedSlot
    public final java.lang.String hardwareAddress()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hardwareAddress(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_hardwareAddress(long __this__nativeId);

/**
Returns the human-readable name of this network interface on Windows, such as "Local Area Connection", if the name could be determined. If it couldn't, this function returns the same as {@link com.trolltech.qt.network.QNetworkInterface#name() name()}. The human-readable name is a name that the user can modify in the Windows Control Panel, so it may change during the execution of the program. <p>On Unix, this function currently always returns the same as {@link com.trolltech.qt.network.QNetworkInterface#name() name()}, since Unix systems don't store a configuration for human-readable names.
*/

    @QtBlockedSlot
    public final java.lang.String humanReadableName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_humanReadableName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_humanReadableName(long __this__nativeId);

/**
Returns the interface system index, if known. This is an integer assigned by the operating system to identify this interface and it generally doesn't change. It matches the scope ID field in IPv6 addresses. <p>If the index isn't known, this function returns 0.
*/

    @QtBlockedSlot
    public final int index()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_index(nativeId());
    }
    @QtBlockedSlot
    native int __qt_index(long __this__nativeId);

/**
Returns true if this QNetworkInterface object contains valid information about a network interface.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns the name of this network interface. On Unix systems, this is a string containing the type of the interface and optionally a sequence number, such as "eth0", "lo" or "pcn0". On Windows, it's an internal ID that cannot be changed by the user.
*/

    @QtBlockedSlot
    public final java.lang.String name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

/**
This convenience function returns all IP addresses found on the host machine. It is equivalent to calling {@link com.trolltech.qt.network.QNetworkInterface#addressEntries() addressEntries()} on all the objects returned by {@link com.trolltech.qt.network.QNetworkInterface#allInterfaces() allInterfaces()} to obtain lists of {@link com.trolltech.qt.network.QHostAddress QHostAddress} objects then calling QHostAddress::ip() on each of these.
*/

    public native static java.util.List<com.trolltech.qt.network.QHostAddress> allAddresses();

/**
Returns a listing of all the network interfaces found on the host machine.
*/

    public native static java.util.List<com.trolltech.qt.network.QNetworkInterface> allInterfaces();

/**
Returns a QNetworkInterface object for the interface whose internal ID is <tt>index</tt>. Network interfaces have a unique identifier called the "interface index" to distinguish it from other interfaces on the system. Often, this value is assigned progressively and interfaces being removed and then added again get a different value every time. <p>This index is also found in the IPv6 address' scope ID field.
*/

    public native static com.trolltech.qt.network.QNetworkInterface interfaceFromIndex(int index);

/**
Returns a QNetworkInterface object for the interface named <tt>name</tt>. If no such interface exists, this function returns an invalid QNetworkInterface object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkInterface#name() name()}, and {@link com.trolltech.qt.network.QNetworkInterface#isValid() isValid()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.network.QNetworkInterface interfaceFromName(java.lang.String name);

/**
@exclude
*/

    public static native QNetworkInterface fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QNetworkInterface(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QNetworkInterface array[]);

/**
<brief>Returns a string representation of the <tt>this QNetworkInterface</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QNetworkInterface clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QNetworkInterface __qt_clone(long __this_nativeId);
}
