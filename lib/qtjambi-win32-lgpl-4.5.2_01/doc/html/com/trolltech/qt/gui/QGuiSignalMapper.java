package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
<brief>These docs are exluded. </brief>This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public class QGuiSignalMapper extends com.trolltech.qt.core.QSignalMapper
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QWidget(named: widget)&gt;:<p>
*/

    public final Signal1<com.trolltech.qt.gui.QWidget> mappedQWidget = new Signal1<com.trolltech.qt.gui.QWidget>();

    private final void mappedQWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_mappedQWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    native void __qt_mappedQWidget_QWidget(long __this__nativeId, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGuiSignalMapper(){
        super((QPrivateConstructor)null);
        __qt_QGuiSignalMapper();
    }

    native void __qt_QGuiSignalMapper();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QGuiSignalMapper(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QGuiSignalMapper_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QGuiSignalMapper_QObject(long parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QObject mapping(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapping_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_mapping_QWidget(long __this__nativeId, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setMapping(com.trolltech.qt.core.QObject sender, com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        java.util.Collection<Object> __rcTmp = (java.util.Collection<Object>)com.trolltech.qt.GeneratorUtilities.fetchField(this,
                                                                         com.trolltech.qt.core.QSignalMapper.class,
                                                                         "__rcMappings");
        if (sender != null) {
            __rcTmp.add(sender);
        }
        __qt_setMapping_QObject_QWidget(nativeId(), sender == null ? 0 : sender.nativeId(), widget == null ? 0 : widget.nativeId());
        java.util.Hashtable<com.trolltech.qt.core.QObject, Object> __rcWidgetForObject = (java.util.Hashtable<com.trolltech.qt.core.QObject, Object>) com.trolltech.qt.GeneratorUtilities.fetchField(this, com.trolltech.qt.core.QSignalMapper.class, "__rcWidgetForObject");
        if (widget == null)
            __rcWidgetForObject.remove(sender);
        else
            __rcWidgetForObject.put(sender,widget);


    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setMapping_QObject_QWidget(long __this__nativeId, long sender, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native QGuiSignalMapper fromNativePointer(QNativePointer nativePointer);

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

    protected QGuiSignalMapper(QPrivateConstructor p) { super(p); } 
}
