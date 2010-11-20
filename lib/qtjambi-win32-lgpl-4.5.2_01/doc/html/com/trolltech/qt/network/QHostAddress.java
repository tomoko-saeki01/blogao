package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QHostAddress class provides an IP address. This class holds an IPv4 or IPv6 address in a platform- and protocol-independent manner. <p>QHostAddress is normally used with the {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, {@link com.trolltech.qt.network.QTcpServer QTcpServer}, and {@link com.trolltech.qt.network.QUdpSocket QUdpSocket} to connect to a host or to set up a server. <p>A host address is set with {@link com.trolltech.qt.network.QHostAddress#setAddress(com.trolltech.qt.network.QIPv6Address) setAddress()}, checked for its type using isIPv4Address() or isIPv6Address(), and retrieved with {@link com.trolltech.qt.network.QHostAddress#toIPv4Address() toIPv4Address()}, {@link com.trolltech.qt.network.QHostAddress#toIPv6Address() toIPv6Address()}, or {@link com.trolltech.qt.network.QHostAddress#toString() toString()}. <p>The class also supports common predefined addresses: {@link com.trolltech.qt.network.QHostAddress.SpecialAddress Null }, {@link com.trolltech.qt.network.QHostAddress.SpecialAddress LocalHost }, {@link com.trolltech.qt.network.QHostAddress.SpecialAddress LocalHostIPv6 }, {@link com.trolltech.qt.network.QHostAddress.SpecialAddress Broadcast }, and {@link com.trolltech.qt.network.QHostAddress.SpecialAddress Any }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, {@link com.trolltech.qt.network.QTcpServer QTcpServer}, and {@link com.trolltech.qt.network.QUdpSocket QUdpSocket}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QHostAddress extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
    public enum SpecialAddress implements com.trolltech.qt.QtEnumerator {
/**
 The null address object. Equivalent to QHostAddress().
*/

        Null(0),
/**
 The IPv4 broadcast address. Equivalent to {@link com.trolltech.qt.network.QHostAddress QHostAddress}("255.255.255.255").
*/

        Broadcast(1),
/**
 The IPv4 localhost address. Equivalent to {@link com.trolltech.qt.network.QHostAddress QHostAddress}("127.0.0.1").
*/

        LocalHost(2),
/**
 The IPv6 localhost address. Equivalent to {@link com.trolltech.qt.network.QHostAddress QHostAddress}("::1").
*/

        LocalHostIPv6(3),
/**
 The IPv4 any-address. Equivalent to {@link com.trolltech.qt.network.QHostAddress QHostAddress}("0.0.0.0").
*/

        Any(4),
/**
 The IPv6 any-address. Equivalent to {@link com.trolltech.qt.network.QHostAddress QHostAddress}("::").
*/

        AnyIPv6(5);

        SpecialAddress(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QHostAddress$SpecialAddress constant with the specified <tt>int</tt>.</brief>
*/

        public static SpecialAddress resolve(int value) {
            return (SpecialAddress) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Null;
            case 1: return Broadcast;
            case 2: return LocalHost;
            case 3: return LocalHostIPv6;
            case 4: return Any;
            case 5: return AnyIPv6;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a host address object with the IP address 0. .0.0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostAddress#clear() clear()}. <br></DD></DT>
*/

    public QHostAddress(){
        super((QPrivateConstructor)null);
        __qt_QHostAddress();
    }

    native void __qt_QHostAddress();

/**
Constructs a QHostAddress object for <tt>address</tt>.
*/

    public QHostAddress(com.trolltech.qt.network.QHostAddress.SpecialAddress address){
        super((QPrivateConstructor)null);
        __qt_QHostAddress_SpecialAddress(address.value());
    }

    native void __qt_QHostAddress_SpecialAddress(int address);

/**
Constructs a copy of the given <tt>address</tt>.
*/

    public QHostAddress(com.trolltech.qt.network.QHostAddress copy){
        super((QPrivateConstructor)null);
        __qt_QHostAddress_QHostAddress(copy == null ? 0 : copy.nativeId());
    }

    native void __qt_QHostAddress_QHostAddress(long copy);

/**
Creates a QHostAddress from the specified <tt>ip6Addr</tt> address.
*/

    public QHostAddress(com.trolltech.qt.network.QIPv6Address ip6Addr){
        super((QPrivateConstructor)null);
        __qt_QHostAddress_QIPv6Address(ip6Addr == null ? 0 : ip6Addr.nativeId());
    }

    native void __qt_QHostAddress_QIPv6Address(long ip6Addr);

/**
Constructs an IPv4 or IPv6 address based on the string <tt>address</tt> (e. ., "127.0.0.1"). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostAddress#setAddress(com.trolltech.qt.network.QIPv6Address) setAddress()}. <br></DD></DT>
*/

    public QHostAddress(java.lang.String address){
        super((QPrivateConstructor)null);
        __qt_QHostAddress_String(address);
    }

    native void __qt_QHostAddress_String(java.lang.String address);

/**
Constructs a host address object with the IPv4 address <tt>ip4Addr</tt>.
*/

    public QHostAddress(int ip4Addr){
        super((QPrivateConstructor)null);
        __qt_QHostAddress_int(ip4Addr);
    }

    native void __qt_QHostAddress_int(int ip4Addr);

/**
Sets the host address to 0.0.0.0.
*/

    @QtBlockedSlot
    public final void clear()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
Returns true if this IP is in the subnet described by the network prefix <tt>subnet</tt> and netmask <tt>netmask</tt>. <p>An IP is considered to belong to a subnet if it is contained between the lowest and the highest address in that subnet. In the case of IP version 4, the lowest address is the network address, while the highest address is the broadcast address. <p>The <tt>subnet</tt> argument does not have to be the actual network address (the lowest address in the subnet). It can be any valid IP belonging to that subnet. In particular, if it is equal to the IP address held by this object, this function will always return true (provided the netmask is a valid value). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostAddress#parseSubnet(java.lang.String) parseSubnet()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isInSubnet(com.trolltech.qt.network.QHostAddress subnet, int netmask)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isInSubnet_QHostAddress_int(nativeId(), subnet == null ? 0 : subnet.nativeId(), netmask);
    }
    @QtBlockedSlot
    native boolean __qt_isInSubnet_QHostAddress_int(long __this__nativeId, long subnet, int netmask);

/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final boolean isInSubnet(com.trolltech.qt.QPair<com.trolltech.qt.network.QHostAddress, java.lang.Integer> subnet)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isInSubnet_QPair(nativeId(), subnet);
    }
    @QtBlockedSlot
    native boolean __qt_isInSubnet_QPair(long __this__nativeId, com.trolltech.qt.QPair<com.trolltech.qt.network.QHostAddress, java.lang.Integer> subnet);

/**
Returns true if this host address is null (INADDR_ANY or in6addr_any). The default constructor creates a null address, and that address is not valid for any host or interface.
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

/**
<brief>Writes thisQHostAddress
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.network.QHostAddress.SpecialAddress address)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_SpecialAddress(nativeId(), address.value());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_SpecialAddress(long __this__nativeId, int address);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.network.QHostAddress address)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QHostAddress(nativeId(), address == null ? 0 : address.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QHostAddress(long __this__nativeId, long address);

/**
<brief>Reads a QHostAddress
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long arg__1);

/**
Returns the network layer protocol of the host address.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QAbstractSocket.NetworkLayerProtocol protocol()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QAbstractSocket.NetworkLayerProtocol.resolve(__qt_protocol(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_protocol(long __this__nativeId);

/**
Returns the scope ID of an IPv6 address. For IPv4 addresses, or if the address does not contain a scope ID, an empty QString is returned. <p>The IPv6 scope ID specifies the scope of reachability for non-global IPv6 addresses, limiting the area in which the address can be used. All IPv6 addresses are associated with such a reachability scope. The scope ID is used to disambiguate addresses that are not guaranteed to be globally unique. <p>IPv6 specifies the following four levels of reachability: <ul><li> Node-local: Addresses that are only used for communicating with services on the same interface (e.g., the loopback interface "::1").</li><li> Link-local: Addresses that are local to the network interface (link). There is always one link-local address for each IPv6 interface on your host. Link-local addresses ("fe80...") are generated from the MAC address of the local network adaptor, and are not guaranteed to be unique.</li><li> Site-local: Addresses that are local to the site / private network (e.g., the company intranet). Site-local addresses ("fec0...") are usually distributed by the site router, and are not guaranteed to be unique outside of the local site.</li><li> Global: For globally routable addresses, such as public servers on the Internet.</li></ul> When using a link-local or site-local address for IPv6 connections, you must specify the scope ID. The scope ID for a link-local address is usually the same as the interface name (e.g., "eth0", "en1") or number (e.g., "1", "2"). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostAddress#setScopeId(java.lang.String) setScopeId()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String scopeId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_scopeId(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_scopeId(long __this__nativeId);

/**
Sets the address of this QHostAddress to <tt>ip6Addr</tt>.
*/

    @QtBlockedSlot
    public final void setAddress(com.trolltech.qt.network.QIPv6Address ip6Addr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAddress_QIPv6Address(nativeId(), ip6Addr == null ? 0 : ip6Addr.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setAddress_QIPv6Address(long __this__nativeId, long ip6Addr);

/**
This is an overloaded member function, provided for convenience. <p>Sets the IPv4 or IPv6 address specified by the string representation specified by <tt>address</tt> (e.g. "127.0.0.1"). Returns true and sets the address if the address was successfully parsed; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean setAddress(java.lang.String address)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setAddress_String(nativeId(), address);
    }
    @QtBlockedSlot
    native boolean __qt_setAddress_String(long __this__nativeId, java.lang.String address);

/**
Set the IPv4 address specified by <tt>ip4Addr</tt>.
*/

    @QtBlockedSlot
    public final void setAddress(int ip4Addr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAddress_int(nativeId(), ip4Addr);
    }
    @QtBlockedSlot
    native void __qt_setAddress_int(long __this__nativeId, int ip4Addr);

/**
Sets the IPv6 scope ID of the address to <tt>id</tt>. If the address protocol is not IPv6, this function does nothing. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostAddress#scopeId() scopeId()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setScopeId(java.lang.String id)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setScopeId_String(nativeId(), id);
    }
    @QtBlockedSlot
    native void __qt_setScopeId_String(long __this__nativeId, java.lang.String id);

/**
Returns the IPv4 address as a number. <p>For example, if the address is 127.0.0.1, the returned value is 2130706433 (i.e. 0x7f000001). <p>This value is only valid if isIp4Addr() returns true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostAddress#toString() toString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int toIPv4Address()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toIPv4Address(nativeId());
    }
    @QtBlockedSlot
    native int __qt_toIPv4Address(long __this__nativeId);

/**
Returns the IPv6 address as a Q_IPV6ADDR structure. The structure consists of 16 unsigned characters. <pre class="snippet">
        QIPv6Address addr = hostAddr.toIPv6Address();
        // addr contains 16 unsigned characters

        for (int i = 0; i &lt; 16; ++i) {
            // process addr.c[i]
        }
</pre> This value is only valid if isIPv6Address() returns true. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostAddress#toString() toString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QIPv6Address toIPv6Address()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toIPv6Address(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QIPv6Address __qt_toIPv6Address(long __this__nativeId);

/**
<brief>Returns a string representation of the <tt>this QHostAddress</tt>. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString(long __this__nativeId);

/**
Parses the IP and subnet information contained in <tt>subnet</tt> and returns the network prefix for that network and its prefix length. <p>The IP address and the netmask must be separated by a slash (/). <p>This function supports arguments in the form: <ul><li> 123.123.123.123/n where n is any value between 0 and 32</li><li> 123.123.123.123/255.255.255.255</li><li> &lt;ipv6-address&gt;/n where n is any value between 0 and 128</li></ul> For IP version 4, this function accepts as well missing trailing components (i.e., less than 4 octets, like "192.168.1"), followed or not by a dot. If the netmask is also missing in that case, it is set to the number of octets actually passed (in the example above, it would be 24, for 3 octets). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostAddress#isInSubnet(com.trolltech.qt.network.QHostAddress, int) isInSubnet()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.QPair<com.trolltech.qt.network.QHostAddress, java.lang.Integer> parseSubnet(java.lang.String subnet);

/**
@exclude
*/

    public static native QHostAddress fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QHostAddress(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QHostAddress array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QHostAddress.SpecialAddress)
        return operator_equal((com.trolltech.qt.network.QHostAddress.SpecialAddress) other);
    else if (other instanceof com.trolltech.qt.network.QHostAddress)
        return operator_equal((com.trolltech.qt.network.QHostAddress) other);
        return false;
    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    public int hashCode() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hashCode(nativeId());
    }
    native int __qt_hashCode(long __this_nativeId);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QHostAddress clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QHostAddress __qt_clone(long __this_nativeId);
}
