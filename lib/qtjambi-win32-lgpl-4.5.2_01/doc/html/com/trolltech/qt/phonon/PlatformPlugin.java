package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public abstract class PlatformPlugin extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.phonon.PlatformPluginInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.phonon.PlatformPlugin {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public java.lang.String applicationName() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_applicationName(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QObject createBackend() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_createBackend(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QObject createBackend(java.lang.String library, java.lang.String version) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_createBackend_String_String(nativeId(), library, version);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.phonon.AbstractMediaStream createMediaStream(com.trolltech.qt.core.QUrl url, com.trolltech.qt.core.QObject parent) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_createMediaStream_QUrl_QObject(nativeId(), url == null ? 0 : url.nativeId(), parent == null ? 0 : parent.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QIcon icon(java.lang.String name) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_icon_String(nativeId(), name);
        }

        @Override
        @QtBlockedSlot
        public boolean isMimeTypeAvailable(java.lang.String mimeType) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_isMimeTypeAvailable_String(nativeId(), mimeType);
        }

        @Override
        @QtBlockedSlot
        public double loadVolume(java.lang.String outputName) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_loadVolume_String(nativeId(), outputName);
        }

        @Override
        @QtBlockedSlot
        public void notification(java.lang.String notificationName, java.lang.String text, java.util.List<java.lang.String> actions, com.trolltech.qt.core.QObject receiver, java.lang.String actionSlot) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_notification_nativepointer_String_List_QObject_nativepointer(nativeId(), notificationName, text, actions, receiver == null ? 0 : receiver.nativeId(), actionSlot);
        }

        @Override
        @QtBlockedSlot
        public java.util.List<java.lang.Integer> objectDescriptionIndexes(com.trolltech.qt.phonon.Phonon.ObjectDescriptionType type) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_objectDescriptionIndexes_ObjectDescriptionType(nativeId(), type.value());
        }

        @Override
        @QtBlockedSlot
        public java.util.HashMap<com.trolltech.qt.core.QByteArray, java.lang.Object> objectDescriptionProperties(com.trolltech.qt.phonon.Phonon.ObjectDescriptionType type, int index) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_objectDescriptionProperties_ObjectDescriptionType_int(nativeId(), type.value(), index);
        }

        @Override
        @QtBlockedSlot
        public void saveVolume(java.lang.String outputName, double volume) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_saveVolume_String_double(nativeId(), outputName, volume);
        }
    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public PlatformPlugin(){
        super((QPrivateConstructor)null);
        __qt_PlatformPlugin();
    }

    native void __qt_PlatformPlugin();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract java.lang.String applicationName();
    @QtBlockedSlot
    native java.lang.String __qt_applicationName(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QObject createBackend();
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_createBackend(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QObject createBackend(java.lang.String library, java.lang.String version);
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_createBackend_String_String(long __this__nativeId, java.lang.String library, java.lang.String version);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.phonon.AbstractMediaStream createMediaStream(com.trolltech.qt.core.QUrl url, com.trolltech.qt.core.QObject parent);
    @QtBlockedSlot
    native com.trolltech.qt.phonon.AbstractMediaStream __qt_createMediaStream_QUrl_QObject(long __this__nativeId, long url, long parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<com.trolltech.qt.QPair<com.trolltech.qt.core.QByteArray, java.lang.String>> deviceAccessListFor(com.trolltech.qt.phonon.AudioOutputDevice arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_deviceAccessListFor_AudioOutputDevice(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.QPair<com.trolltech.qt.core.QByteArray, java.lang.String>> __qt_deviceAccessListFor_AudioOutputDevice(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QIcon icon(java.lang.String name);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_icon_String(long __this__nativeId, java.lang.String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract boolean isMimeTypeAvailable(java.lang.String mimeType);
    @QtBlockedSlot
    native boolean __qt_isMimeTypeAvailable_String(long __this__nativeId, java.lang.String mimeType);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract double loadVolume(java.lang.String outputName);
    @QtBlockedSlot
    native double __qt_loadVolume_String(long __this__nativeId, java.lang.String outputName);


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void notification(java.lang.String notificationName, java.lang.String text, java.util.List<java.lang.String> actions, com.trolltech.qt.core.QObject receiver) {
        notification(notificationName, text, actions, receiver, (java.lang.String)null);
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void notification(java.lang.String notificationName, java.lang.String text, java.util.List<java.lang.String> actions) {
        notification(notificationName, text, actions, (com.trolltech.qt.core.QObject)null, (java.lang.String)null);
    }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void notification(java.lang.String notificationName, java.lang.String text) {
        notification(notificationName, text, (java.util.List<java.lang.String>)null, (com.trolltech.qt.core.QObject)null, (java.lang.String)null);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void notification(java.lang.String notificationName, java.lang.String text, java.util.List<java.lang.String> actions, com.trolltech.qt.core.QObject receiver, java.lang.String actionSlot);
    @QtBlockedSlot
    native void __qt_notification_nativepointer_String_List_QObject_nativepointer(long __this__nativeId, java.lang.String notificationName, java.lang.String text, java.util.List<java.lang.String> actions, long receiver, java.lang.String actionSlot);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.Integer> objectDescriptionIndexes(com.trolltech.qt.phonon.Phonon.ObjectDescriptionType type);
    @QtBlockedSlot
    native java.util.List<java.lang.Integer> __qt_objectDescriptionIndexes_ObjectDescriptionType(long __this__nativeId, int type);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract java.util.HashMap<com.trolltech.qt.core.QByteArray, java.lang.Object> objectDescriptionProperties(com.trolltech.qt.phonon.Phonon.ObjectDescriptionType type, int index);
    @QtBlockedSlot
    native java.util.HashMap<com.trolltech.qt.core.QByteArray, java.lang.Object> __qt_objectDescriptionProperties_ObjectDescriptionType_int(long __this__nativeId, int type, int index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract void saveVolume(java.lang.String outputName, double volume);
    @QtBlockedSlot
    native void __qt_saveVolume_String_double(long __this__nativeId, java.lang.String outputName, double volume);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native PlatformPlugin fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected PlatformPlugin(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_PlatformPlugin(long ptr);
}
