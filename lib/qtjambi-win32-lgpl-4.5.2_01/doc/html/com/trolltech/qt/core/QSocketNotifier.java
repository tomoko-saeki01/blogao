package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QSocketNotifier class provides support for monitoring activity on a file descriptor. The QSocketNotifier makes it possible to integrate Qt's event loop with other event loops based on file descriptors. For example, the {@link <a href="../http-qtsoftware-com-products-appdev-add-on-products-catalog-4-utilities-qtcorba.html">CORBA Framework</a>} uses it to process CORBA events. File descriptor action is detected in Qt's main event loop ({@link com.trolltech.qt.core.QCoreApplication#exec() QCoreApplication::exec()}).<a name="write-notifiers"> Once you have opened a device using a low-level (usually platform-specific) API, you can create a socket notifier to monitor the file descriptor. The socket notifier is enabled by default, i.e. it emits the {@link com.trolltech.qt.core.QSocketNotifier#activated activated() } signal whenever a socket event corresponding to its type occurs. Connect the {@link com.trolltech.qt.core.QSocketNotifier#activated activated() } signal to the slot you want to be called when an event corresponding to your socket notifier's type occurs. <p>There are three types of socket notifiers: read, write, and exception. The type is described by the {@link com.trolltech.qt.core.QSocketNotifier.Type Type } enum, and must be specified when constructing the socket notifier. After construction it can be determined using the {@link com.trolltech.qt.core.QSocketNotifier#type() type()} function. Note that if you need to monitor both reads and writes for the same file descriptor, you must create two socket notifiers. Note also that it is not possible to install two socket notifiers of the same type ({@link com.trolltech.qt.core.QSocketNotifier.Type Read }, {@link com.trolltech.qt.core.QSocketNotifier.Type Write }, {@link com.trolltech.qt.core.QSocketNotifier.Type Exception }) on the same socket. <p>The {@link com.trolltech.qt.core.QSocketNotifier#setEnabled(boolean) setEnabled()} function allows you to disable as well as enable the socket notifier. It is generally advisable to explicitly enable or disable the socket notifier, especially for write notifiers. A disabled notifier ignores socket events (the same effect as not creating the socket notifier). Use the {@link com.trolltech.qt.core.QSocketNotifier#isEnabled() isEnabled()} function to determine the notifier's current status. <p>Finally, you can use the {@link com.trolltech.qt.core.QSocketNotifier#socket() socket()} function to retrieve the socket identifier. Although the class is called QSocketNotifier, it is normally used for other types of devices than sockets. {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} and {@link com.trolltech.qt.network.QUdpSocket QUdpSocket} provide notification through signals, so there is normally no need to use a QSocketNotifier on them.<a name="notes-for-windows-users"><h2>Notes for Windows Users</h2> The socket passed to QSocketNotifier will become non-blocking, even if it was created as a blocking socket. The {@link com.trolltech.qt.core.QSocketNotifier#activated activated() } signal is sometimes triggered by high general activity on the host, even if there is nothing to read. A subsequent read from the socket can then fail, the error indicating that there is no data available (e.g., <tt>WSAEWOULDBLOCK</tt>). This is an operating system limitation, and not a bug in QSocketNotifier. <p>To ensure that the socket notifier handles read notifications correctly, follow these steps when you receive a notification: <ol><li> Disable the notifier.</li><li> Read data from the socket.</li><li> Re-enable the notifier if you are interested in more data (such as after having written a new command to a remote server).</li></ol> To ensure that the socket notifier handles write notifications correctly, follow these steps when you receive a notification: <ol><li> Disable the notifier.</li><li> Write as much data as you can (before <tt>EWOULDBLOCK</tt> is returned).</li><li> Re-enable notifier if you have more data to write.</li></ol> <b>Further information:</b> On Windows, Qt always disables the notifier after getting a notification, and only re-enables it if more data is expected. For example, if data is read from the socket and it can be used to read more, or if reading or writing is not possible because the socket would block, in which case it is necessary to wait before attempting to read or write again. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile QFile}, {@link com.trolltech.qt.core.QProcess QProcess}, {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, and {@link com.trolltech.qt.network.QUdpSocket QUdpSocket}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSocketNotifier extends com.trolltech.qt.core.QObject
{
    
/**
This enum describes the various types of events that a socket notifier can recognize. The type must be specified when constructing the socket notifier. <p>Note that if you need to monitor both reads and writes for the same file descriptor, you must create two socket notifiers. Note also that it is not possible to install two socket notifiers of the same type (Read, Write, Exception) on the same socket. <p><DT><b>See also:</b><br><DD>QSocketNotifier(), and {@link com.trolltech.qt.core.QSocketNotifier#type() type()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum Type implements com.trolltech.qt.QtEnumerator {
/**
 There is data to be read.
*/

        Read(0),
/**
 Data can be written.
*/

        Write(1),
/**
 An exception has occurred. We recommend against using this.
*/

        Exception(2);

        Type(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QSocketNotifier$Type constant with the specified <tt>int</tt>.</brief>
*/

        public static Type resolve(int value) {
            return (Type) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Read;
            case 1: return Write;
            case 2: return Exception;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: socket)&gt;:<p> This signal is emitted whenever the socket notifier is enabled and a socket event corresponding to its {@link com.trolltech.qt.core.QSocketNotifier.Type type } occurs. <p>The socket identifier is passed in the <tt>socket</tt> parameter. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSocketNotifier#type() type()}, and {@link com.trolltech.qt.core.QSocketNotifier#socket() socket()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> activated = new Signal1<java.lang.Integer>();

    private final void activated(int socket)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_activated_int(nativeId(), socket);
    }
    native void __qt_activated_int(long __this__nativeId, int socket);


/**
Constructs a socket notifier with the given <tt>parent</tt>. It enables the <tt>socket</tt>, and watches for events of the given <tt>type</tt>. <p>It is generally advisable to explicitly enable or disable the socket notifier, especially for write notifiers. <p><b>Note for Windows users:</b> The socket passed to QSocketNotifier will become non-blocking, even if it was created as a blocking socket. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSocketNotifier#setEnabled(boolean) setEnabled()}, and {@link com.trolltech.qt.core.QSocketNotifier#isEnabled() isEnabled()}. <br></DD></DT>
*/

    public QSocketNotifier(int socket, com.trolltech.qt.core.QSocketNotifier.Type arg__2) {
        this(socket, arg__2, (com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a socket notifier with the given <tt>parent</tt>. It enables the <tt>socket</tt>, and watches for events of the given <tt>type</tt>. <p>It is generally advisable to explicitly enable or disable the socket notifier, especially for write notifiers. <p><b>Note for Windows users:</b> The socket passed to QSocketNotifier will become non-blocking, even if it was created as a blocking socket. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSocketNotifier#setEnabled(boolean) setEnabled()}, and {@link com.trolltech.qt.core.QSocketNotifier#isEnabled() isEnabled()}. <br></DD></DT>
*/

    public QSocketNotifier(int socket, com.trolltech.qt.core.QSocketNotifier.Type arg__2, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSocketNotifier_int_Type_QObject(socket, arg__2.value(), parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSocketNotifier_int_Type_QObject(int socket, int arg__2, long parent);

/**
Returns true if the notifier is enabled; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSocketNotifier#setEnabled(boolean) setEnabled()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isEnabled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEnabled(long __this__nativeId);

/**
If <tt>enable</tt> is true, the notifier is enabled; otherwise the notifier is disabled. <p>The notifier is enabled by default, i.e. it emits the {@link com.trolltech.qt.core.QSocketNotifier#activated activated() } signal whenever a socket event corresponding to its {@link com.trolltech.qt.core.QSocketNotifier#type() type} occurs. If it is disabled, it ignores socket events (the same effect as not creating the socket notifier). <p>Write notifiers should normally be disabled immediately after the {@link com.trolltech.qt.core.QSocketNotifier#activated activated() } signal has been emitted <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSocketNotifier#isEnabled() isEnabled()}, and {@link com.trolltech.qt.core.QSocketNotifier#activated activated() }. <br></DD></DT>
*/

    public final void setEnabled(boolean arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEnabled_boolean(nativeId(), arg__1);
    }
    native void __qt_setEnabled_boolean(long __this__nativeId, boolean arg__1);

/**
Returns the socket identifier specified to the constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSocketNotifier#type() type()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int socket()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_socket(nativeId());
    }
    @QtBlockedSlot
    native int __qt_socket(long __this__nativeId);

/**
Returns the socket event type specified to the constructor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSocketNotifier#socket() socket()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSocketNotifier.Type type()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QSocketNotifier.Type.resolve(__qt_type(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_type(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long arg__1);

/**
@exclude
*/

    public static native QSocketNotifier fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSocketNotifier(QPrivateConstructor p) { super(p); } 
}
