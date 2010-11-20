package com.trolltech.qt.phonon;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public abstract class AbstractAddon extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.phonon.AbstractAddonInterface
{

    static {
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.phonon.AbstractAddon {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public boolean hasInterface(com.trolltech.qt.phonon.AbstractAddon.Interface iface) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_hasInterface_Interface(nativeId(), iface.value());
        }

        @Override
        @QtBlockedSlot
        public java.lang.Object interfaceCall(com.trolltech.qt.phonon.AbstractAddon.Interface iface, int command, java.util.List<java.lang.Object> arguments) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_interfaceCall_Interface_int_List(nativeId(), iface.value(), command, arguments);
        }
    }
/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/


    public enum SubtitleCommand implements com.trolltech.qt.QtEnumerator {
        availableSubtitles(0),
        currentSubtitle(1),
        setCurrentSubtitle(2);

        SubtitleCommand(int value) { this.value = value; }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public int value() { return value; }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public static SubtitleCommand resolve(int value) {
            return (SubtitleCommand) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return availableSubtitles;
            case 1: return currentSubtitle;
            case 2: return setCurrentSubtitle;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/

    public enum TitleCommand implements com.trolltech.qt.QtEnumerator {
        availableTitles(0),
        title(1),
        setTitle(2),
        autoplayTitles(3),
        setAutoplayTitles(4);

        TitleCommand(int value) { this.value = value; }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public int value() { return value; }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public static TitleCommand resolve(int value) {
            return (TitleCommand) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return availableTitles;
            case 1: return title;
            case 2: return setTitle;
            case 3: return autoplayTitles;
            case 4: return setAutoplayTitles;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/

    public enum Interface implements com.trolltech.qt.QtEnumerator {
        NavigationInterface(1),
        ChapterInterface(2),
        AngleInterface(3),
        TitleInterface(4),
        SubtitleInterface(5),
        AudioChannelInterface(6);

        Interface(int value) { this.value = value; }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public int value() { return value; }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public static Interface resolve(int value) {
            return (Interface) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return NavigationInterface;
            case 2: return ChapterInterface;
            case 3: return AngleInterface;
            case 4: return TitleInterface;
            case 5: return SubtitleInterface;
            case 6: return AudioChannelInterface;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/

    public enum AudioChannelCommand implements com.trolltech.qt.QtEnumerator {
        availableAudioChannels(0),
        currentAudioChannel(1),
        setCurrentAudioChannel(2);

        AudioChannelCommand(int value) { this.value = value; }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public int value() { return value; }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public static AudioChannelCommand resolve(int value) {
            return (AudioChannelCommand) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return availableAudioChannels;
            case 1: return currentAudioChannel;
            case 2: return setCurrentAudioChannel;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/

    public enum ChapterCommand implements com.trolltech.qt.QtEnumerator {
        availableChapters(0),
        chapter(1),
        setChapter(2);

        ChapterCommand(int value) { this.value = value; }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public int value() { return value; }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public static ChapterCommand resolve(int value) {
            return (ChapterCommand) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return availableChapters;
            case 1: return chapter;
            case 2: return setChapter;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/

    public enum NavigationCommand implements com.trolltech.qt.QtEnumerator {
        Menu1Button(0);

        NavigationCommand(int value) { this.value = value; }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public int value() { return value; }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public static NavigationCommand resolve(int value) {
            return (NavigationCommand) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Menu1Button;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/

    public enum AngleCommand implements com.trolltech.qt.QtEnumerator {
        availableAngles(0),
        angle(1),
        setAngle(2);

        AngleCommand(int value) { this.value = value; }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public int value() { return value; }

/**
This method is internal to Qt Jambi. 

	@exclude
*/

        public static AngleCommand resolve(int value) {
            return (AngleCommand) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return availableAngles;
            case 1: return angle;
            case 2: return setAngle;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public AbstractAddon(){
        super((QPrivateConstructor)null);
        __qt_AbstractAddon();
    }

    native void __qt_AbstractAddon();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract boolean hasInterface(com.trolltech.qt.phonon.AbstractAddon.Interface iface);
    @QtBlockedSlot
    native boolean __qt_hasInterface_Interface(long __this__nativeId, int iface);


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.lang.Object interfaceCall(com.trolltech.qt.phonon.AbstractAddon.Interface iface, int command) {
        return interfaceCall(iface, command, (java.util.List<java.lang.Object>)null);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract java.lang.Object interfaceCall(com.trolltech.qt.phonon.AbstractAddon.Interface iface, int command, java.util.List<java.lang.Object> arguments);
    @QtBlockedSlot
    native java.lang.Object __qt_interfaceCall_Interface_int_List(long __this__nativeId, int iface, int command, java.util.List<java.lang.Object> arguments);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native AbstractAddon fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected AbstractAddon(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_AbstractAddon(long ptr);
}
