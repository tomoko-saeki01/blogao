package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QSignalMapper class bundles signals from identifiable senders. This class collects a set of parameterless signals, and re-emits them with integer, string or widget parameters corresponding to the object that sent the signal. <p>The class supports the mapping of particular strings or integers with particular objects using {@link com.trolltech.qt.core.QSignalMapper#setMapping(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QObject) setMapping()}. The objects' signals can then be connected to the {@link com.trolltech.qt.core.QSignalMapper#map() map()} slot which will emit the mapped() signal with the string or integer associated with the original signalling object. Mappings can be removed later using {@link com.trolltech.qt.core.QSignalMapper#removeMappings(com.trolltech.qt.core.QObject) removeMappings()}. <p>Example: Suppose we want to create a custom widget that contains a group of buttons (like a tool palette). One approach is to connect each button's <tt>clicked()</tt> signal to its own custom slot; but in this example we want to connect all the buttons to a single slot and parameterize the slot by the button that was clicked. <p>Here's the definition of a simple custom widget that has a single signal, <tt>clicked()</tt>, which is emitted with the text of the button that was clicked: <pre class="snippet">
class ButtonWidget extends QWidget
{
    ...

    public ButtonWidget(List&lt;String&gt; texts) {...};

    public Signal1&lt;String&gt; clicked = new Qignal1&lt;String&gt;();

    private QSignalMapper signalMapper;

}
</pre> The only function that we need to implement is the constructor: <pre class="snippet">
    public buttonwidget(List&lt;String&gt; texts)
    {
        signalMapper = new QSignalMapper(this);

        QGridLayout gridLayout = new QGridLayout();
        for (int i = 0; i &lt; texts.size(); ++i) {
            QPushButton button = new QPushButton(texts.get(i));
            button.clicked.connect(signalMapper, "map()");
            
            signalMapper.setMapping(button, texts.get(i));
            gridLayout.addWidget(button, i / 3, i % 3);
        }

        signalMapper.mappedString.connect(
    
                this, "clicked(String)");

        setLayout(gridLayout);
    }
    </pre> A list of texts is passed to the constructor. A signal mapper is constructed and for each text in the list a {@link com.trolltech.qt.gui.QPushButton QPushButton} is created. We connect each button's <tt>clicked()</tt> signal to the signal mapper's {@link com.trolltech.qt.core.QSignalMapper#map() map()} slot, and create a mapping in the signal mapper from each button to the button's text. Finally we connect the signal mapper's mapped() signal to the custom widget's <tt>clicked()</tt> signal. When the user clicks a button, the custom widget will emit a single <tt>clicked()</tt> signal whose argument is the text of the button the user clicked. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QObject QObject}, {@link com.trolltech.qt.gui.QButtonGroup QButtonGroup}, and {@link com.trolltech.qt.gui.QActionGroup QActionGroup}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSignalMapper extends com.trolltech.qt.core.QObject
{

    private java.util.Collection<Object> __rcMappings = new java.util.ArrayList<Object>();
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.QObject(named: i)&gt;:<p> This signal is emitted when {@link com.trolltech.qt.core.QSignalMapper#map() map()} is signalled from an object that has an integer mapping set. The object's mapped integer is passed in <tt>i</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSignalMapper#setMapping(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QObject) setMapping()}. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.QObject> mappedQObject = new Signal1<com.trolltech.qt.core.QObject>();

    private final void mappedQObject(com.trolltech.qt.core.QObject arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mappedQObject_QObject(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_mappedQObject_QObject(long __this__nativeId, long arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: i)&gt;:<p> This signal is emitted when {@link com.trolltech.qt.core.QSignalMapper#map() map()} is signalled from an object that has an integer mapping set. The object's mapped integer is passed in <tt>i</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSignalMapper#setMapping(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QObject) setMapping()}. <br></DD></DT>
*/

    public final Signal1<java.lang.String> mappedString = new Signal1<java.lang.String>();

    private final void mappedString(java.lang.String arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mappedString_String(nativeId(), arg__1);
    }
    native void __qt_mappedString_String(long __this__nativeId, java.lang.String arg__1);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: i)&gt;:<p> This signal is emitted when {@link com.trolltech.qt.core.QSignalMapper#map() map()} is signalled from an object that has an integer mapping set. The object's mapped integer is passed in <tt>i</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSignalMapper#setMapping(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QObject) setMapping()}. <br></DD></DT>
*/

    public final Signal1<java.lang.Integer> mappedInteger = new Signal1<java.lang.Integer>();

    private final void mappedInteger(int arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mappedInteger_int(nativeId(), arg__1);
    }
    native void __qt_mappedInteger_int(long __this__nativeId, int arg__1);


/**
Constructs a QSignalMapper with parent <tt>parent</tt>.
*/

    public QSignalMapper() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a QSignalMapper with parent <tt>parent</tt>.
*/

    public QSignalMapper(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSignalMapper_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSignalMapper_QObject(long parent);

/**
This slot emits signals based on which object sends signals to it.
*/

    public final void map()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_map(nativeId());
    }
    native void __qt_map(long __this__nativeId);

/**
This slot emits signals based on the <tt>sender</tt> object.
*/

    public final void map(com.trolltech.qt.core.QObject sender)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_map_QObject(nativeId(), sender == null ? 0 : sender.nativeId());
    }
    native void __qt_map_QObject(long __this__nativeId, long sender);

/**
This function overloads {@link com.trolltech.qt.core.QSignalMapper#mapping(com.trolltech.qt.core.QObject) mapping()}. <p>Returns the sender {@link com.trolltech.qt.core.QObject QObject} that is associated with the <tt>object</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QObject mapping(com.trolltech.qt.core.QObject object)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapping_QObject(nativeId(), object == null ? 0 : object.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_mapping_QObject(long __this__nativeId, long object);

/**
Returns the signal sender associated with the string <tt>text</tt>.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QObject mapping(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapping_String(nativeId(), text);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_mapping_String(long __this__nativeId, java.lang.String text);

/**
Returns the sender {@link com.trolltech.qt.core.QObject QObject} that is associated with the <tt>id</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSignalMapper#setMapping(com.trolltech.qt.core.QObject, com.trolltech.qt.core.QObject) setMapping()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QObject mapping(int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapping_int(nativeId(), id);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_mapping_int(long __this__nativeId, int id);

/**
Removes all mappings for <tt>sender</tt>. <p>This is done automatically when mapped objects are destroyed.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void removeMappings(com.trolltech.qt.core.QObject sender)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (sender != null) {
            while (__rcMappings.remove(sender)) ;
        }
        __qt_removeMappings_QObject(nativeId(), sender == null ? 0 : sender.nativeId());
        if (__rcObjectForObject.containsKey(sender)) __rcObjectForObject.remove(sender);
        if (__rcWidgetForObject.containsKey(sender)) __rcWidgetForObject.remove(sender);


    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_removeMappings_QObject(long __this__nativeId, long sender);

/**
Adds a mapping so that when {@link com.trolltech.qt.core.QSignalMapper#map() map()} is signalled from the <tt>sender</tt>, the signal mapped(<tt>object</tt> ) is emitted. <p>There may be at most one object for each sender.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setMapping(com.trolltech.qt.core.QObject sender, com.trolltech.qt.core.QObject object)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (sender != null) {
            __rcMappings.add(sender);
        }
        __qt_setMapping_QObject_QObject(nativeId(), sender == null ? 0 : sender.nativeId(), object == null ? 0 : object.nativeId());
        if (object == null)
            __rcObjectForObject.remove(sender);
        else
            __rcObjectForObject.put(sender,object);


    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setMapping_QObject_QObject(long __this__nativeId, long sender, long object);

/**
Adds a mapping so that when {@link com.trolltech.qt.core.QSignalMapper#map() map()} is signalled from the <tt>sender</tt>, the signal mapped(<tt>text</tt> ) is emitted. <p>There may be at most one text for each sender.
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setMapping(com.trolltech.qt.core.QObject sender, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (sender != null) {
            __rcMappings.add(sender);
        }
        __qt_setMapping_QObject_String(nativeId(), sender == null ? 0 : sender.nativeId(), text);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setMapping_QObject_String(long __this__nativeId, long sender, java.lang.String text);

/**
Adds a mapping so that when {@link com.trolltech.qt.core.QSignalMapper#map() map()} is signalled from the given <tt>sender</tt>, the signal mapped(<tt>id</tt>) is emitted. <p>There may be at most one integer ID for each sender. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSignalMapper#mapping(com.trolltech.qt.core.QObject) mapping()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setMapping(com.trolltech.qt.core.QObject sender, int id)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        if (sender != null) {
            __rcMappings.add(sender);
        }
        __qt_setMapping_QObject_int(nativeId(), sender == null ? 0 : sender.nativeId(), id);
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setMapping_QObject_int(long __this__nativeId, long sender, int id);

/**
@exclude
*/

    public static native QSignalMapper fromNativePointer(QNativePointer nativePointer);

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

    protected QSignalMapper(QPrivateConstructor p) { super(p); } 

    private java.util.Hashtable<QObject, QObject> __rcObjectForObject = new java.util.Hashtable<QObject, QObject>();

    private java.util.Hashtable<QObject, Object> __rcWidgetForObject = new java.util.Hashtable<QObject, Object>();

}
