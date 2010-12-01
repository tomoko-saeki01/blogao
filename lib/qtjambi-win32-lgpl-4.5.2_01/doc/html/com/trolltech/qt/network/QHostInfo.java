package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QHostInfo class provides static functions for host name lookups. QHostInfo uses the lookup mechanisms provided by the operating system to find the IP address(es) associated with a host name, or the host name associated with an IP address. The class provides two static convenience functions: one that works asynchronously and emits a signal once the host is found, and one that blocks and returns a QHostInfo object. <p>To look up a host's IP addresses asynchronously, call {@link com.trolltech.qt.network.QHostInfo#lookupHost(java.lang.String, com.trolltech.qt.core.QObject, java.lang.String) lookupHost()}, which takes the host name or IP address, a receiver object, and a slot signature as arguments and returns an ID. You can abort the lookup by calling {@link com.trolltech.qt.network.QHostInfo#abortHostLookup(int) abortHostLookup()} with the lookup ID. <p>Example: <pre class="snippet">
        // To find the IP address of www.trolltech.com
        QHostInfo.lookupHost("www.trolltech.com",
                 this, "printResults(QHostInfo)");

        // To find the host name for 4.2.2.1
        QHostInfo.lookupHost("4.2.2.1",
                 this, "printResults(QHostInfo)");
</pre> The slot is invoked when the results are ready. (If you use Qt for Embedded Linux and disabled multithreading support by defining <tt>QT_NO_THREAD</tt>, {@link com.trolltech.qt.network.QHostInfo#lookupHost(java.lang.String, com.trolltech.qt.core.QObject, java.lang.String) lookupHost()} will block until the lookup has finished.) The results are stored in a QHostInfo object. Call {@link com.trolltech.qt.network.QHostInfo#addresses() addresses()} to get the list of IP addresses for the host, and {@link com.trolltech.qt.network.QHostInfo#hostName() hostName()} to get the host name that was looked up. <p>If the lookup failed, {@link com.trolltech.qt.network.QHostInfo#error() error()} returns the type of error that occurred. {@link com.trolltech.qt.network.QHostInfo#errorString() errorString()} gives a human-readable description of the lookup error. <p>If you want a blocking lookup, use the {@link com.trolltech.qt.network.QHostInfo#fromName(java.lang.String) QHostInfo::fromName()} function: <pre class="snippet">
        QHostInfo info = QHostInfo.fromName("www.trolltech.com");
</pre> QHostInfo supports Internationalized Domain Names (IDNs) through the IDNA and Punycode standards. <p>To retrieve the name of the local host, use the static {@link com.trolltech.qt.network.QHostInfo#localHostName() QHostInfo::localHostName()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QAbstractSocket QAbstractSocket}, and </DD></DT>
*/
@QtJambiGeneratedClass
public class QHostInfo extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the various errors that can occur when trying to resolve a host name. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#error() error()}, and {@link com.trolltech.qt.network.QHostInfo#setError(com.trolltech.qt.network.QHostInfo.HostInfoError) setError()}. <br></DD></DT>
*/

    public enum HostInfoError implements com.trolltech.qt.QtEnumerator {
/**
 The lookup was successful.
*/

        NoError(0),
/**
 No IP addresses were found for the host.
*/

        HostNotFound(1),
/**
 An unknown error occurred.
*/

        UnknownError(2);

        HostInfoError(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QHostInfo$HostInfoError constant with the specified <tt>int</tt>.</brief>
*/

        public static HostInfoError resolve(int value) {
            return (HostInfoError) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoError;
            case 1: return HostNotFound;
            case 2: return UnknownError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a copy of <tt>other</tt>.
*/

    public QHostInfo(com.trolltech.qt.network.QHostInfo d){
        super((QPrivateConstructor)null);
        __qt_QHostInfo_QHostInfo(d == null ? 0 : d.nativeId());
    }

    native void __qt_QHostInfo_QHostInfo(long d);


/**
Constructs an empty host info object with lookup ID <tt>id</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#lookupId() lookupId()}. <br></DD></DT>
*/

    public QHostInfo() {
        this((int)-1);
    }
/**
Constructs an empty host info object with lookup ID <tt>id</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#lookupId() lookupId()}. <br></DD></DT>
*/

    public QHostInfo(int lookupId){
        super((QPrivateConstructor)null);
        __qt_QHostInfo_int(lookupId);
    }

    native void __qt_QHostInfo_int(int lookupId);

/**
Returns the list of IP addresses associated with {@link com.trolltech.qt.network.QHostInfo#hostName() hostName()}. This list may be empty. <p>Example: <pre class="snippet">
        QHostInfo info = new QHostInfo();
        // ...
        if (!info.addresses().isEmpty()) {
        QHostAddress address = info.addresses().get(0);
        // use the first IP address
        }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#setAddresses(java.util.List) setAddresses()}, {@link com.trolltech.qt.network.QHostInfo#hostName() hostName()}, and {@link com.trolltech.qt.network.QHostInfo#error() error()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.network.QHostAddress> addresses()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addresses(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.network.QHostAddress> __qt_addresses(long __this__nativeId);

/**
Returns the type of error that occurred if the host name lookup failed; otherwise returns {@link com.trolltech.qt.network.QHostInfo.HostInfoError NoError }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#setError(com.trolltech.qt.network.QHostInfo.HostInfoError) setError()}, and {@link com.trolltech.qt.network.QHostInfo#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QHostInfo.HostInfoError error()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.network.QHostInfo.HostInfoError.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
If the lookup failed, this function returns a human readable description of the error; otherwise "Unknown error" is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#setErrorString(java.lang.String) setErrorString()}, and {@link com.trolltech.qt.network.QHostInfo#error() error()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String errorString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_errorString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
Returns the name of the host whose IP addresses were looked up. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#setHostName(java.lang.String) setHostName()}, and {@link com.trolltech.qt.network.QHostInfo#localHostName() localHostName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String hostName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hostName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_hostName(long __this__nativeId);

/**
Returns the ID of this lookup. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#setLookupId(int) setLookupId()}, {@link com.trolltech.qt.network.QHostInfo#abortHostLookup(int) abortHostLookup()}, and {@link com.trolltech.qt.network.QHostInfo#hostName() hostName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lookupId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lookupId(nativeId());
    }
    @QtBlockedSlot
    native int __qt_lookupId(long __this__nativeId);

/**
Sets the list of addresses in this QHostInfo to <tt>addresses</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#addresses() addresses()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAddresses(java.util.List<com.trolltech.qt.network.QHostAddress> addresses)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAddresses_List(nativeId(), addresses);
    }
    @QtBlockedSlot
    native void __qt_setAddresses_List(long __this__nativeId, java.util.List<com.trolltech.qt.network.QHostAddress> addresses);

/**
Sets the error type of this QHostInfo to <tt>error</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#error() error()}, and {@link com.trolltech.qt.network.QHostInfo#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setError(com.trolltech.qt.network.QHostInfo.HostInfoError error)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setError_HostInfoError(nativeId(), error.value());
    }
    @QtBlockedSlot
    native void __qt_setError_HostInfoError(long __this__nativeId, int error);

/**
Sets the human readable description of the error that occurred to <tt>str</tt> if the lookup failed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#errorString() errorString()}, and {@link com.trolltech.qt.network.QHostInfo#setError(com.trolltech.qt.network.QHostInfo.HostInfoError) setError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setErrorString(java.lang.String errorString)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setErrorString_String(nativeId(), errorString);
    }
    @QtBlockedSlot
    native void __qt_setErrorString_String(long __this__nativeId, java.lang.String errorString);

/**
Sets the host name of this QHostInfo to <tt>hostName</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#hostName() hostName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHostName(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHostName_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setHostName_String(long __this__nativeId, java.lang.String name);

/**
Sets the ID of this lookup to <tt>id</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#lookupId() lookupId()}, and {@link com.trolltech.qt.network.QHostInfo#lookupHost(java.lang.String, com.trolltech.qt.core.QObject, java.lang.String) lookupHost()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLookupId(int id)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLookupId_int(nativeId(), id);
    }
    @QtBlockedSlot
    native void __qt_setLookupId_int(long __this__nativeId, int id);

/**
Aborts the host lookup with the ID <tt>id</tt>, as returned by {@link com.trolltech.qt.network.QHostInfo#lookupHost(java.lang.String, com.trolltech.qt.core.QObject, java.lang.String) lookupHost()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#lookupHost(java.lang.String, com.trolltech.qt.core.QObject, java.lang.String) lookupHost()}, and {@link com.trolltech.qt.network.QHostInfo#lookupId() lookupId()}. <br></DD></DT>
*/

    public native static void abortHostLookup(int lookupId);

/**
Looks up the IP address(es) for the given host <tt>name</tt>. The function blocks during the lookup which means that execution of the program is suspended until the results of the lookup are ready. Returns the result of the lookup in a QHostInfo object. <p>If you pass a literal IP address to <tt>name</tt> instead of a host name, QHostInfo will search for the domain name for the IP (i.e., QHostInfo will perform a reverse lookup). On success, the returned QHostInfo will contain both the resolved domain name and IP addresses for the host name. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#lookupHost(java.lang.String, com.trolltech.qt.core.QObject, java.lang.String) lookupHost()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.network.QHostInfo fromName(java.lang.String name);

/**
Returns the DNS domain of this machine. <p>Note: DNS domains are not related to domain names found in Windows networks. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#hostName() hostName()}. <br></DD></DT>
*/

    public native static java.lang.String localDomainName();

/**
Returns the host name of this machine. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QHostInfo#hostName() hostName()}. <br></DD></DT>
*/

    public native static java.lang.String localHostName();

    private static int lookupHost(java.lang.String name, com.trolltech.qt.core.QObject receiver, com.trolltech.qt.QNativePointer member)    {
        return __qt_lookupHost_String_QObject_nativepointer(name, receiver == null ? 0 : receiver.nativeId(), member);
    }
    native static int __qt_lookupHost_String_QObject_nativepointer(java.lang.String name, long receiver, com.trolltech.qt.QNativePointer member);

/**
@exclude
*/

    public static native QHostInfo fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QHostInfo(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QHostInfo array[]);

    /**
     * Looks up the IP address(es) associated with host name <code>name</code>,
     * and returns an ID for the lookup. When the result of the lookup is ready,
     * the specified method in <code>receiver</code> is called with a
     * <code>QHostInfo</code> argument. The <code>QHostInfo</code> object can
     * then be inspected to get the results of the lookup.
     *
     * @param name The host name.
     * @param receiver The object on which the method will be called.
     * @param methodName The name of a method which takes a single <code>QHostInfo</code> argument.
     */
        public static int lookupHost(String name, com.trolltech.qt.core.QObject receiver, String methodName)
    {
        methodName = com.trolltech.qt.internal.QtJambiInternal.SlotPrefix + methodName + "(QHostInfo)";
        return lookupHost(name, receiver, com.trolltech.qt.QNativePointer.createCharPointer(methodName));
    }

    /**
     * Looks up the IP address(es) associated with host name <code>name</code>,
     * and returns an ID for the lookup. When the result of the lookup is ready,
     * the specified signal is emitted with a <code>QHostInfo</code> argument.
     * The <code>QHostInfo</code> object can then be inspected to get the results
     * of the lookup.
     *
     * @param name The host name.
     * @param signal The signal to emit. Must take a single <code>QHostInfo</code>
     *               argument, and must be contained in a <code>QObject</code>
     *               subclass.
     */
        public static int lookupHost(String name, com.trolltech.qt.QSignalEmitter.Signal1<QHostInfo> signal)
    {
        if (!(signal.containingObject() instanceof com.trolltech.qt.core.QObject)) {
            throw new IllegalArgumentException("Only signals contained in QObject subclasses are supported. "
                + "Signal's class is '" + signal.containingObject().getClass() + "'.");
        }

        String methodName = com.trolltech.qt.internal.QtJambiInternal.SignalPrefix + signal.name() + "(QHostInfo)";
        return lookupHost(name, (com.trolltech.qt.core.QObject)signal.containingObject(),
            com.trolltech.qt.QNativePointer.createCharPointer(methodName));
    }


    @Override
    public QHostInfo clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QHostInfo __qt_clone(long __this_nativeId);
}
