package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QObject class is the base class of all Qt objects. QObject is the heart of the {@link <a href="../object.html">Qt object model</a>}. The central feature in this model is a very powerful mechanism for seamless object communication called {@link <a href="../qtjambi-signalsandslots.html">signals and slots</a>}. You can connect a signal to a slot with connect() and destroy the connection with disconnect(). To avoid never ending notification loops you can temporarily block signals with blockSignals(). The protected functions connectNotify() and disconnectNotify() make it possible to track connections. <p>QObjects organize themselves in object trees. When you create a QObject with another object as parent, the object will automatically add itself to the parent's {@link com.trolltech.qt.core.QObject#children() children()} list. The parent takes ownership of the object i.e. it will automatically delete its children in its destructor. You can look for an object by name and optionally type using {@link com.trolltech.qt.core.QObject#findChild() findChild()} or {@link com.trolltech.qt.core.QObject#findChildren() findChildren()}. <p>Every object has an {@link com.trolltech.qt.core.QObject#objectName() objectName()} and its class name can be found via the corresponding metaObject() (see QMetaObject::className()). You can determine whether the object's class inherits another class in the QObject inheritance hierarchy by using the inherits() function. <p>When an object is deleted, it emits a destroyed() signal. You can catch this signal to avoid dangling references to QObjects. <p>QObjects can receive events through {@link com.trolltech.qt.core.QObject#event(com.trolltech.qt.core.QEvent) event()} and filter the events of other objects. See {@link com.trolltech.qt.core.QObject#installEventFilter(com.trolltech.qt.core.QObject) installEventFilter()} and {@link com.trolltech.qt.core.QObject#eventFilter(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QEvent) eventFilter()} for details. A convenience handler, {@link com.trolltech.qt.core.QObject#childEvent(com.trolltech.qt.core.QChildEvent) childEvent()}, can be reimplemented to catch child events. <p>Events are delivered in the thread in which the object was created; see {@link <a href="../qtjambi-threads.html">Thread Support in Qt</a>} and thread() for details. Note that event processing is not done at all for QObjects with no thread affinity (thread() returns zero). Use the {@link com.trolltech.qt.core.QObject#moveToThread(java.lang.Thread) moveToThread()} function to change the thread affinity for an object and its children (the object cannot be moved if it has a parent). <p>Last but not least, QObject provides the basic timer support in Qt; see {@link com.trolltech.qt.core.QTimer QTimer} for high-level support for timers. <p>Notice that the Q_OBJECT macro is mandatory for any object that implements signals, slots or properties. You also need to run the {@link <a href="../moc.html">Meta Object Compiler</a>} on the source file. We strongly recommend the use of this macro in all subclasses of QObject regardless of whether or not they actually use signals, slots and properties, since failure to do so may lead certain functions to exhibit strange behavior. <p>All Qt widgets inherit QObject. The convenience function {@link com.trolltech.qt.core.QObject#isWidgetType() isWidgetType()} returns whether an object is actually a widget. It is much faster than qobject_cast&lt;{@link com.trolltech.qt.gui.QWidget QWidget} *&gt;(obj) or obj-&gt;inherits("{@link com.trolltech.qt.gui.QWidget QWidget}"). <p>Some QObject functions, e.g. {@link com.trolltech.qt.core.QObject#children() children()}, return a QObjectList. QObjectList is a typedef for QList&lt;QObject *&gt;.<a name="no-copy-constructor"><a name="no-copy-constructor-or-assignment-operator"><h2>No copy constructor or assignment operator</h2> QObject has neither a copy constructor nor an assignment operator. This is by design. Actually, they are declared, but in a <tt>private</tt> section with the macro Q_DISABLE_COPY(). In fact, all Qt classes derived from QObject (direct or indirect) use this macro to declare their copy constructor and assignment operator to be private. The reasoning is found in the discussion on {@link <a href="../object.html">Identity vs Value</a>} on the {@link <a href="../object.html">Qt Object Model</a>} page. <p>The main consequence is that you should use pointers to QObject (or to your QObject subclass) where you might otherwise be tempted to use your QObject subclass as a value. For example, without a copy constructor, you can't use a subclass of QObject as the value to be stored in one of the container classes. You must store pointers.<a name="auto-connection"><h3>Auto-Connection</h3> Qt's meta-object system provides a mechanism to automatically connect signals and slots between QObject subclasses and their children. As long as objects are defined with suitable object names, and slots follow a simple naming convention, this connection can be performed at run-time by the QMetaObject::connectSlotsByName() function. <p>{@link <a href="../uic.html">uic</a>} generates code that invokes this function to enable auto-connection to be performed between widgets on forms created with Qt Designer. More information about using auto-connection with Qt Designer is given in the {@link <a href="../designer-using-a-ui-file.html">Using a Designer .ui File in Your Application</a>} section of the Qt Designer manual.<a name="dynamic-properties"><h3>Dynamic Properties</h3> From Qt 4.2, dynamic properties can be added to and removed from QObject instances at run-time. Dynamic properties do not need to be declared at compile-time, yet they provide the same advantages as static properties and are manipulated using the same API - using {@link com.trolltech.qt.core.QObject#property(java.lang.String) property()} to read them and {@link com.trolltech.qt.core.QObject#setProperty(java.lang.String, java.lang.Object) setProperty()} to write them. <p>From Qt 4.3, dynamic properties are supported by {@link <a href="../designer-widget-mode.html">Qt Designer</a>}, and both standard Qt widgets and user-created forms can be given dynamic properties. <p>{Object Trees and Object Ownership} <p><DT><b>See also:</b><br><DD>QMetaObject, QPointer, QObjectCleanupHandler, and Q_DISABLE_COPY(). <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QObject extends com.trolltech.qt.QtJambiObject
{

    private java.util.Collection<Object> __rcEventFilters = new java.util.ArrayList<Object>();

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }


/**

*/

    public QObject() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**

*/

    public QObject(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QObject_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QObject_QObject(long parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean blockSignals(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_blockSignals_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native boolean __qt_blockSignals_boolean(long __this__nativeId, boolean b);

/**

*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QObject> children()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_children(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QObject> __qt_children(long __this__nativeId);

/**

*/

    public final void disposeLater()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_disposeLater(nativeId());
    }
    native void __qt_disposeLater(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final void dumpObjectInfo()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dumpObjectInfo(nativeId());
    }
    @QtBlockedSlot
    native void __qt_dumpObjectInfo(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final void dumpObjectTree()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dumpObjectTree(nativeId());
    }
    @QtBlockedSlot
    native void __qt_dumpObjectTree(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QByteArray> dynamicPropertyNames()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dynamicPropertyNames(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QByteArray> __qt_dynamicPropertyNames(long __this__nativeId);

/**

*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void installEventFilter(com.trolltech.qt.core.QObject arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (arg__1 != null) {
            __rcEventFilters.add(arg__1);
        }
        __qt_installEventFilter_QObject(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_installEventFilter_QObject(long __this__nativeId, long arg__1);

/**

*/

    @QtBlockedSlot
    public final boolean isWidgetType()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isWidgetType(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isWidgetType(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final void killTimer(int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_killTimer_int(nativeId(), id);
    }
    @QtBlockedSlot
    native void __qt_killTimer_int(long __this__nativeId, int id);

/**

*/

    @QtBlockedSlot
    public final void moveToThread(java.lang.Thread thread)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_moveToThread_Thread(nativeId(), thread);
    }
    @QtBlockedSlot
    native void __qt_moveToThread_Thread(long __this__nativeId, java.lang.Thread thread);

/**

*/

    @com.trolltech.qt.QtPropertyReader(name="objectName")
    @QtBlockedSlot
    public final java.lang.String objectName()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_objectName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_objectName(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QObject parent()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parent(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_parent(long __this__nativeId);

    @QtBlockedSlot
    private final java.lang.Object property(com.trolltech.qt.QNativePointer name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_property_nativepointer(nativeId(), name);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_property_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer name);

/**

*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeEventFilter(com.trolltech.qt.core.QObject arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (arg__1 != null) {
            while (__rcEventFilters.remove(arg__1)) ;
        }
        __qt_removeEventFilter_QObject(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeEventFilter_QObject(long __this__nativeId, long arg__1);

/**

*/

    @com.trolltech.qt.QtPropertyWriter(name="objectName")
    @QtBlockedSlot
    public final void setObjectName(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setObjectName_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setObjectName_String(long __this__nativeId, java.lang.String name);

/**

*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setParent(com.trolltech.qt.core.QObject arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setParent_QObject(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setParent_QObject(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final boolean setProperty(com.trolltech.qt.QNativePointer name, java.lang.Object value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setProperty_nativepointer_Object(nativeId(), name, value);
    }
    @QtBlockedSlot
    native boolean __qt_setProperty_nativepointer_Object(long __this__nativeId, com.trolltech.qt.QNativePointer name, java.lang.Object value);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean signalsBlocked()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_signalsBlocked(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_signalsBlocked(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final int startTimer(int interval)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_startTimer_int(nativeId(), interval);
    }
    @QtBlockedSlot
    native int __qt_startTimer_int(long __this__nativeId, int interval);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.lang.Thread thread()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_thread(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Thread __qt_thread(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    protected void childEvent(com.trolltech.qt.core.QChildEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_childEvent_QChildEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_childEvent_QChildEvent(long __this__nativeId, long arg__1);

/**

*/

    @QtBlockedSlot
    protected void customEvent(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_customEvent_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_customEvent_QEvent(long __this__nativeId, long arg__1);

/**

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

*/

    @QtBlockedSlot
    public boolean eventFilter(com.trolltech.qt.core.QObject arg__1, com.trolltech.qt.core.QEvent arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_eventFilter_QObject_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_eventFilter_QObject_QEvent(long __this__nativeId, long arg__1, long arg__2);

/**

*/

    @QtBlockedSlot
    protected void timerEvent(com.trolltech.qt.core.QTimerEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_timerEvent_QTimerEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_timerEvent_QTimerEvent(long __this__nativeId, long arg__1);

/**
@exclude
*/

    public static native QObject fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QObject(QPrivateConstructor p) { super(p); } 

/**
Returns all children of this QObject, or an empty list if it has no
children.
*/

    @com.trolltech.qt.QtBlockedSlot
    public final java.util.List<QObject> findChildren() {
        return findChildren(null, (QRegExp) null);
    }

/**
This functions searches for descendant(s) of this QObject.
*/

    @com.trolltech.qt.QtBlockedSlot
    public final java.util.List<QObject> findChildren(Class<?> cl) {
        return findChildren(cl, (QRegExp) null);
    }

/**
This functions searches for descendant(s) of this QObject.
*/

    @com.trolltech.qt.QtBlockedSlot
    public final java.util.List<QObject> findChildren(Class<?> cl, String name) {
        return com.trolltech.qt.internal.QtJambiInternal.findChildren(this, cl, name);
    }

/**
This functions searches for descendant(s) of this QObject.
*/

    @com.trolltech.qt.QtBlockedSlot
    public final java.util.List<QObject> findChildren(Class<?> cl, QRegExp name) {
        return com.trolltech.qt.internal.QtJambiInternal.findChildren(this, cl, name);
    }

/**
Returns a child of this object, or 0 if there is no such object.
The search is performed recursively.
<p>
If there is more than one child matching the search, the most
direct ancestor is returned. If there are several direct
ancestors, it is undefined which one will be returned. In that
case, findChildren() should be used.
*/

    @com.trolltech.qt.QtBlockedSlot
    public final QObject findChild() {
        return findChild(null, null);
    }

/**
This functions searches for descendant(s) of this QObject.
*/

    @com.trolltech.qt.QtBlockedSlot
    public final QObject findChild(Class<?> cl) {
        return findChild(cl, null);
    }

/**
This functions searches for descendant(s) of this QObject.
*/

    @com.trolltech.qt.QtBlockedSlot
    public final QObject findChild(Class<?> cl, String name) {
        return com.trolltech.qt.internal.QtJambiInternal.findChild(this, cl, name);
    }

/**
Sets the value of the object's <tt>name</tt> property to
<tt>value</tt>.
<p>
If the property is defined in the class using Q_PROPERTY then
true is returned on success and false otherwise. If the property
is not defined using Q_PROPERTY, and therefore not listed in the
meta-object, it is added as a dynamic property and false is returned.
<p>
Information about all available properties is provided through the
metaObject() and dynamicPropertyNames().
<p>
Dynamic properties can be queried again using property() and can be
removed by setting the property value to an invalid QVariant.
Changing the value of a dynamic property causes a
QDynamicPropertyChangeEvent
to be sent to the object.
<p>
<b>Note:</b> Dynamic properties starting with "_q_" are reserved for
internal purposes.
*/

    @com.trolltech.qt.QtBlockedSlot
        public final void setProperty(String name, Object value)
    {
        setProperty(QNativePointer.createCharPointer(name), value);
    }

/**
Returns the value of the object's <tt>name</tt> property.
<p>
If no such property exists, the returned object is invalid.
<p>
Information about all available properties is provided through the
metaObject() and dynamicPropertyNames().
*/

    @com.trolltech.qt.QtBlockedSlot
        public final Object property(String name)
    {
        return property(QNativePointer.createCharPointer(name));
    }

/**
Returns the property that has the <tt>USER</tt> flag set to true. <p><DT><b>See also:</b><br><DD>QMetaProperty::isUser(). <br></DD></DT>
*/

    @com.trolltech.qt.QtBlockedSlot
        public final QtProperty userProperty()
    {
        return com.trolltech.qt.internal.QtJambiInternal.userProperty(nativeId());
    }

/**
This functions searches for descendant(s) of this QObject.
*/

    @com.trolltech.qt.QtBlockedSlot
        public final java.util.List<com.trolltech.qt.QtProperty> properties()
    {
        return com.trolltech.qt.internal.QtJambiInternal.properties(nativeId());
    }

/**
Finds property <tt>name</tt> and returns its index; otherwise returns -1.
*/

    @com.trolltech.qt.QtBlockedSlot
    public final int indexOfProperty(String name) {
        return com.trolltech.qt.internal.QtJambiInternal.indexOfProperty(nativeId(), name);
    }

/**
Searches recursively for all child objects of the given object, and connects
matching signals from them to slots of object that follow the following form.
<p>
<code>
void on_<widget name>_<signal name>(<signal parameters>);
</code>
<p>
Let's assume our object has a child object of type QPushButton with the object
name button1. The slot to catch the button's <tt>clicked</tt> signal would be:
<p>
<code>
void on_button1_clicked()
</code>
*/

    @com.trolltech.qt.QtBlockedSlot
    public final void connectSlotsByName() {
        com.trolltech.qt.internal.QtJambiInternal.connectSlotsByName(this);
    }


/**
<brief>Returns a string representation of the <tt>this QObject</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);
}
