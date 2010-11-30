package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QNetworkAddressEntry class stores one IP address supported by a network interface, along with its associated netmask and broadcast address. Each network interface can contain zero or more IP addresses, which in turn can be associated with a netmask and/or a broadcast address (depending on support from the operating system). <p>This class represents one such group.
*/
@QtJambiGeneratedClass
public class QNetworkAddressEntry extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty QNetworkAddressEntry object.
*/

    public QNetworkAddressEntry(){
        super((QPrivateConstructor)null);
        __qt_QNetworkAddressEntry();
    }

    native void __qt_QNetworkAddressEntry();

/**
Constructs a QNetworkAddressEntry object that is a copy of the object <tt>other</tt>.
*/

    public QNetworkAddressEntry(com.trolltech.qt.network.QNetworkAddressEntry other){
        super((QPrivateConstructor)null);
        __qt_QNetworkAddressEntry_QNetworkAddressEntry(other == null ? 0 : other.nativeId());
    }

    native void __qt_QNetworkAddressEntry_QNetworkAddressEntry(long other);

/**
Returns the broadcast address associated with the IPv4 address and netmask. It can usually be derived from those two by setting to 1 the bits of the IP address where the netmask contains a 0. (In other words, by bitwise-OR'ing the IP address with the inverse of the netmask) <p>This member is always empty for IPv6 addresses, since the concept of broadcast has been abandoned in that system in favor of multicast. In particular, the group of hosts corresponding to all the nodes in the local network can be reached by the "all-nodes" special multicast group (address FF02::1). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAddressEntry#setBroadcast(com.trolltech.qt.network.QHostAddress) setBroadcast()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QHostAddress broadcast()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_broadcast(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QHostAddress __qt_broadcast(long __this__nativeId);

/**
This function returns one IPv4 or IPv6 address found, that was found in a network interface. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAddressEntry#setIp(com.trolltech.qt.network.QHostAddress) setIp()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QHostAddress ip()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ip(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QHostAddress __qt_ip(long __this__nativeId);

/**
Returns the netmask associated with the IP address. The netmask is expressed in the form of an IP address, such as 255.255.0.0. <p>For IPv6 addresses, the prefix length is converted to an address where the number of bits set to 1 is equal to the prefix length. For a prefix length of 64 bits (the most common value), the netmask will be expressed as a {@link com.trolltech.qt.network.QHostAddress QHostAddress} holding the address FFFF:FFFF:FFFF:FFFF:: <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAddressEntry#setNetmask(com.trolltech.qt.network.QHostAddress) setNetmask()}, and {@link com.trolltech.qt.network.QNetworkAddressEntry#prefixLength() prefixLength()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QHostAddress netmask()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_netmask(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QHostAddress __qt_netmask(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.network.QNetworkAddressEntry other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QNetworkAddressEntry(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QNetworkAddressEntry(long __this__nativeId, long other);

/**
Returns the prefix length of this IP address. The prefix length matches the number of bits set to 1 in the netmask (see {@link com.trolltech.qt.network.QNetworkAddressEntry#netmask() netmask()}). For IPv4 addresses, the value is between 0 and 32. For IPv6 addresses, it's contained between 0 and 128 and is the preferred form of representing addresses. <p>This function returns -1 if the prefix length could not be determined (i.e., {@link com.trolltech.qt.network.QNetworkAddressEntry#netmask() netmask()} returns a null QHostAddress()). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAddressEntry#setPrefixLength(int) setPrefixLength()}, and {@link com.trolltech.qt.network.QNetworkAddressEntry#netmask() netmask()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int prefixLength()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_prefixLength(nativeId());
    }
    @QtBlockedSlot
    native int __qt_prefixLength(long __this__nativeId);

/**
Sets the broadcast IP address of this QNetworkAddressEntry object to <tt>newBroadcast</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAddressEntry#broadcast() broadcast()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setBroadcast(com.trolltech.qt.network.QHostAddress newBroadcast)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBroadcast_QHostAddress(nativeId(), newBroadcast == null ? 0 : newBroadcast.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBroadcast_QHostAddress(long __this__nativeId, long newBroadcast);

/**
Sets the IP address the QNetworkAddressEntry object contains to <tt>newIp</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAddressEntry#ip() ip()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setIp(com.trolltech.qt.network.QHostAddress newIp)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIp_QHostAddress(nativeId(), newIp == null ? 0 : newIp.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIp_QHostAddress(long __this__nativeId, long newIp);

/**
Sets the netmask that this QNetworkAddressEntry object contains to <tt>newNetmask</tt>. Setting the netmask also sets the prefix length to match the new netmask. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAddressEntry#netmask() netmask()}, and {@link com.trolltech.qt.network.QNetworkAddressEntry#setPrefixLength(int) setPrefixLength()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNetmask(com.trolltech.qt.network.QHostAddress newNetmask)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNetmask_QHostAddress(nativeId(), newNetmask == null ? 0 : newNetmask.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setNetmask_QHostAddress(long __this__nativeId, long newNetmask);

/**
Sets the prefix length of this IP address to <tt>length</tt>. The value of <tt>length</tt> must be valid for this type of IP address: between 0 and 32 for IPv4 addresses, between 0 and 128 for IPv6 addresses. Setting to any invalid value is equivalent to setting to -1, which means "no prefix length". <p>Setting the prefix length also sets the netmask (see {@link com.trolltech.qt.network.QNetworkAddressEntry#netmask() netmask()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QNetworkAddressEntry#prefixLength() prefixLength()}, and {@link com.trolltech.qt.network.QNetworkAddressEntry#setNetmask(com.trolltech.qt.network.QHostAddress) setNetmask()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPrefixLength(int length)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPrefixLength_int(nativeId(), length);
    }
    @QtBlockedSlot
    native void __qt_setPrefixLength_int(long __this__nativeId, int length);

/**
@exclude
*/

    public static native QNetworkAddressEntry fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QNetworkAddressEntry(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QNetworkAddressEntry array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QNetworkAddressEntry)
        return operator_equal((com.trolltech.qt.network.QNetworkAddressEntry) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QNetworkAddressEntry clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QNetworkAddressEntry __qt_clone(long __this_nativeId);
}
