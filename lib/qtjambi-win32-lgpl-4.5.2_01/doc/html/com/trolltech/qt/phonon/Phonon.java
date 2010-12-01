package com.trolltech.qt.phonon;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class Phonon
{

    static {
        com.trolltech.qt.QtJambi_LibraryInitializer.init();
        com.trolltech.qt.phonon.QtJambi_LibraryInitializer.init();
    }
    public enum DiscType implements com.trolltech.qt.QtEnumerator {
        NoDisc(-1),
        Cd(0),
        Dvd(1),
        Vcd(2);

        DiscType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Phonon$DiscType constant with the specified <tt>int</tt>.</brief>
*/

        public static DiscType resolve(int value) {
            return (DiscType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case -1: return NoDisc;
            case 0: return Cd;
            case 1: return Dvd;
            case 2: return Vcd;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum MetaData implements com.trolltech.qt.QtEnumerator {
        ArtistMetaData(0),
        AlbumMetaData(1),
        TitleMetaData(2),
        DateMetaData(3),
        GenreMetaData(4),
        TracknumberMetaData(5),
        DescriptionMetaData(6),
        MusicBrainzDiscIdMetaData(7);

        MetaData(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Phonon$MetaData constant with the specified <tt>int</tt>.</brief>
*/

        public static MetaData resolve(int value) {
            return (MetaData) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return ArtistMetaData;
            case 1: return AlbumMetaData;
            case 2: return TitleMetaData;
            case 3: return DateMetaData;
            case 4: return GenreMetaData;
            case 5: return TracknumberMetaData;
            case 6: return DescriptionMetaData;
            case 7: return MusicBrainzDiscIdMetaData;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum Category implements com.trolltech.qt.QtEnumerator {
        NoCategory(-1),
        NotificationCategory(0),
        MusicCategory(1),
        VideoCategory(2),
        CommunicationCategory(3),
        GameCategory(4),
        AccessibilityCategory(5),
;

        Category(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Phonon$Category constant with the specified <tt>int</tt>.</brief>
*/

        public static Category resolve(int value) {
            return (Category) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case -1: return NoCategory;
            case 0: return NotificationCategory;
            case 1: return MusicCategory;
            case 2: return VideoCategory;
            case 3: return CommunicationCategory;
            case 4: return GameCategory;
            case 5: return AccessibilityCategory;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum ObjectDescriptionType implements com.trolltech.qt.QtEnumerator {
        AudioOutputDeviceType(0),
        EffectType(1),
        AudioChannelType(2),
        SubtitleType(3),
        AudioCaptureDeviceType(4);

        ObjectDescriptionType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Phonon$ObjectDescriptionType constant with the specified <tt>int</tt>.</brief>
*/

        public static ObjectDescriptionType resolve(int value) {
            return (ObjectDescriptionType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AudioOutputDeviceType;
            case 1: return EffectType;
            case 2: return AudioChannelType;
            case 3: return SubtitleType;
            case 4: return AudioCaptureDeviceType;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum State implements com.trolltech.qt.QtEnumerator {
        LoadingState(0),
        StoppedState(1),
        PlayingState(2),
        BufferingState(3),
        PausedState(4),
        ErrorState(5);

        State(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Phonon$State constant with the specified <tt>int</tt>.</brief>
*/

        public static State resolve(int value) {
            return (State) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return LoadingState;
            case 1: return StoppedState;
            case 2: return PlayingState;
            case 3: return BufferingState;
            case 4: return PausedState;
            case 5: return ErrorState;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum ErrorType implements com.trolltech.qt.QtEnumerator {
        NoError(0),
        NormalError(1),
        FatalError(2);

        ErrorType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the Phonon$ErrorType constant with the specified <tt>int</tt>.</brief>
*/

        public static ErrorType resolve(int value) {
            return (ErrorType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoError;
            case 1: return NormalError;
            case 2: return FatalError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**

*/

    public static java.lang.String categoryToString(com.trolltech.qt.phonon.Phonon.Category c)    {
        return __qt_categoryToString_Category(c.value());
    }
    native static java.lang.String __qt_categoryToString_Category(int c);

/**

*/

    public static com.trolltech.qt.phonon.Path createPath(com.trolltech.qt.phonon.MediaNodeInterface source, com.trolltech.qt.phonon.MediaNodeInterface sink)    {
        return __qt_createPath_MediaNode_MediaNode(source == null ? 0 : source.nativeId(), sink == null ? 0 : sink.nativeId());
    }
    native static com.trolltech.qt.phonon.Path __qt_createPath_MediaNode_MediaNode(long source, long sink);


/**

*/

    public static com.trolltech.qt.phonon.MediaObject createPlayer(com.trolltech.qt.phonon.Phonon.Category category) {
        return createPlayer(category, (com.trolltech.qt.phonon.MediaSource)null);
    }
/**

*/

    public static com.trolltech.qt.phonon.MediaObject createPlayer(com.trolltech.qt.phonon.Phonon.Category category, com.trolltech.qt.phonon.MediaSource source)    {
        return __qt_createPlayer_Category_MediaSource(category.value(), source == null ? 0 : source.nativeId());
    }
    native static com.trolltech.qt.phonon.MediaObject __qt_createPlayer_Category_MediaSource(int category, long source);

    private native static com.trolltech.qt.QNativePointer phononVersion_private();

/**
Returns the Phonon version.
*/

    public String phononVersion() {
        com.trolltech.qt.QNativePointer np = phononVersion_private();
        if (np != null)
            return com.trolltech.qt.internal.QtJambiInternal.charPointerToString(np);
        else
            return null;
    }

}
