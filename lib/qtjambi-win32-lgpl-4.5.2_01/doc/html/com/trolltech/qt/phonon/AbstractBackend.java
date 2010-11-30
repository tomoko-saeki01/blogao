package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public abstract class AbstractBackend extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.phonon.AbstractBackendInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.phonon.AbstractBackend {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public java.util.List<java.lang.String> availableMimeTypes() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_availableMimeTypes(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean connectNodes(com.trolltech.qt.core.QObject arg__1, com.trolltech.qt.core.QObject arg__2) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_connectNodes_QObject_QObject(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QObject createObject(com.trolltech.qt.phonon.AbstractBackend.Class c, com.trolltech.qt.core.QObject parent, java.util.List<java.lang.Object> args) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_createObject_Class_QObject_List(nativeId(), c.value(), parent == null ? 0 : parent.nativeId(), args);
        }

        @Override
        @QtBlockedSlot
        public boolean disconnectNodes(com.trolltech.qt.core.QObject arg__1, com.trolltech.qt.core.QObject arg__2) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_disconnectNodes_QObject_QObject(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean endConnectionChange(java.util.Set<com.trolltech.qt.core.QObject> arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_endConnectionChange_Set(nativeId(), arg__1);
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
        public boolean startConnectionChange(java.util.Set<com.trolltech.qt.core.QObject> arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_startConnectionChange_Set(nativeId(), arg__1);
        }
    }
/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/


    public enum Class implements com.trolltech.qt.QtEnumerator {
        MediaObjectClass(0),
        VolumeFaderEffectClass(1),
        AudioOutputClass(2),
        AudioDataOutputClass(3),
        VisualizationClass(4),
        VideoDataOutputClass(5),
        EffectClass(6),
        VideoWidgetClass(7);

        Class(int value) { this.value = value; }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public int value() { return value; }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public static Class resolve(int value) {
            return (Class) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return MediaObjectClass;
            case 1: return VolumeFaderEffectClass;
            case 2: return AudioOutputClass;
            case 3: return AudioDataOutputClass;
            case 4: return VisualizationClass;
            case 5: return VideoDataOutputClass;
            case 6: return EffectClass;
            case 7: return VideoWidgetClass;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public AbstractBackend(){
        super((QPrivateConstructor)null);
        __qt_AbstractBackend();
    }

    native void __qt_AbstractBackend();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> availableMimeTypes();
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_availableMimeTypes(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract boolean connectNodes(com.trolltech.qt.core.QObject arg__1, com.trolltech.qt.core.QObject arg__2);
    @QtBlockedSlot
    native boolean __qt_connectNodes_QObject_QObject(long __this__nativeId, long arg__1, long arg__2);


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QObject createObject(com.trolltech.qt.phonon.AbstractBackend.Class c, com.trolltech.qt.core.QObject parent) {
        return createObject(c, parent, (java.util.List<java.lang.Object>)null);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QObject createObject(com.trolltech.qt.phonon.AbstractBackend.Class c, com.trolltech.qt.core.QObject parent, java.util.List<java.lang.Object> args);
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_createObject_Class_QObject_List(long __this__nativeId, int c, long parent, java.util.List<java.lang.Object> args);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract boolean disconnectNodes(com.trolltech.qt.core.QObject arg__1, com.trolltech.qt.core.QObject arg__2);
    @QtBlockedSlot
    native boolean __qt_disconnectNodes_QObject_QObject(long __this__nativeId, long arg__1, long arg__2);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract boolean endConnectionChange(java.util.Set<com.trolltech.qt.core.QObject> arg__1);
    @QtBlockedSlot
    native boolean __qt_endConnectionChange_Set(long __this__nativeId, java.util.Set<com.trolltech.qt.core.QObject> arg__1);

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
    public abstract boolean startConnectionChange(java.util.Set<com.trolltech.qt.core.QObject> arg__1);
    @QtBlockedSlot
    native boolean __qt_startConnectionChange_Set(long __this__nativeId, java.util.Set<com.trolltech.qt.core.QObject> arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native AbstractBackend fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected AbstractBackend(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_AbstractBackend(long ptr);
}
