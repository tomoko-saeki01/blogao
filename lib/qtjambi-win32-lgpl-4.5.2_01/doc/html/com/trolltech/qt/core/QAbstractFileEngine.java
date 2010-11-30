package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QAbstractFileEngine class provides an abstraction for accessing the filesystem. The {@link com.trolltech.qt.core.QDir QDir}, {@link com.trolltech.qt.core.QFile QFile}, and {@link com.trolltech.qt.core.QFileInfo QFileInfo} classes all make use of a QAbstractFileEngine internally. If you create your own QAbstractFileEngine subclass (and register it with Qt by creating a {@link com.trolltech.qt.core.QAbstractFileEngineHandler QAbstractFileEngineHandler} subclass), your file engine will be used when the path is one that your file engine handles. <p>A QAbstractFileEngine refers to one file or one directory. If the referent is a file, the {@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}, {@link com.trolltech.qt.core.QAbstractFileEngine#rename(java.lang.String) rename()}, and {@link com.trolltech.qt.core.QAbstractFileEngine#remove() remove()} functions are applicable. If the referent is a directory the {@link com.trolltech.qt.core.QAbstractFileEngine#mkdir(java.lang.String, boolean) mkdir()}, {@link com.trolltech.qt.core.QAbstractFileEngine#rmdir(java.lang.String, boolean) rmdir()}, and {@link com.trolltech.qt.core.QAbstractFileEngine#entryList(com.trolltech.qt.core.QDir.Filters, java.util.List) entryList()} functions are applicable. In all cases the {@link com.trolltech.qt.core.QAbstractFileEngine#caseSensitive() caseSensitive()}, {@link com.trolltech.qt.core.QAbstractFileEngine#isRelativePath() isRelativePath()}, {@link com.trolltech.qt.core.QAbstractFileEngine#fileFlags(com.trolltech.qt.core.QAbstractFileEngine.FileFlag[]) fileFlags()}, {@link com.trolltech.qt.core.QAbstractFileEngine#ownerId(com.trolltech.qt.core.QAbstractFileEngine.FileOwner) ownerId()}, {@link com.trolltech.qt.core.QAbstractFileEngine#owner(com.trolltech.qt.core.QAbstractFileEngine.FileOwner) owner()}, and {@link com.trolltech.qt.core.QAbstractFileEngine#fileTime(com.trolltech.qt.core.QAbstractFileEngine.FileTime) fileTime()} functions are applicable. <p>A QAbstractFileEngine subclass can be created to do synchronous network I/O based file system operations, local file system operations, or to operate as a resource system to access file based resources. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngineHandler QAbstractFileEngineHandler}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QAbstractFileEngine extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
These values are used to request a file name in a particular format. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#fileName() fileName()}, and {@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    public enum FileName implements com.trolltech.qt.QtEnumerator {
/**
 The same filename that was passed to the {@link com.trolltech.qt.core.QAbstractFileEngine QAbstractFileEngine}.
*/

        DefaultName(0),
/**
 The name of the file excluding the path.
*/

        BaseName(1),
/**
 The path to the file excluding the base name.
*/

        PathName(2),
/**
 The absolute path to the file (including the base name).
*/

        AbsoluteName(3),
/**
 The absolute path to the file (excluding the base name).
*/

        AbsolutePathName(4),
/**
 The full file name of the file that this file is a link to. (This will be empty if this file is not a link.)
*/

        LinkName(5),
/**
 Often very similar to {@link com.trolltech.qt.core.QAbstractFileEngine.FileName LinkName }. Will return the true path to the file.
*/

        CanonicalName(6),
/**
 Same as {@link com.trolltech.qt.core.QAbstractFileEngine.FileName CanonicalName }, excluding the base name.
*/

        CanonicalPathName(7),
/**
 Returns the name of the bundle implies {@link com.trolltech.qt.core.QAbstractFileEngine.FileFlag BundleType } is set.
*/

        BundleName(8);

        FileName(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractFileEngine$FileName constant with the specified <tt>int</tt>.</brief>
*/

        public static FileName resolve(int value) {
            return (FileName) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return DefaultName;
            case 1: return BaseName;
            case 2: return PathName;
            case 3: return AbsoluteName;
            case 4: return AbsolutePathName;
            case 5: return LinkName;
            case 6: return CanonicalName;
            case 7: return CanonicalPathName;
            case 8: return BundleName;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
These are used by the {@link com.trolltech.qt.core.QAbstractFileEngine#fileTime(com.trolltech.qt.core.QAbstractFileEngine.FileTime) fileTime()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    public enum FileTime implements com.trolltech.qt.QtEnumerator {
/**
 When the file was created.
*/

        CreationTime(0),
/**
 When the file was most recently modified.
*/

        ModificationTime(1),
/**
 When the file was most recently accessed (e.g. read or written to).
*/

        AccessTime(2);

        FileTime(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractFileEngine$FileTime constant with the specified <tt>int</tt>.</brief>
*/

        public static FileTime resolve(int value) {
            return (FileTime) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CreationTime;
            case 1: return ModificationTime;
            case 2: return AccessTime;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
<p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#owner(com.trolltech.qt.core.QAbstractFileEngine.FileOwner) owner()}, {@link com.trolltech.qt.core.QAbstractFileEngine#ownerId(com.trolltech.qt.core.QAbstractFileEngine.FileOwner) ownerId()}, and {@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    public enum FileOwner implements com.trolltech.qt.QtEnumerator {
/**
 The user who owns the file.
*/

        OwnerUser(0),
/**
 The group who owns the file.
*/

        OwnerGroup(1);

        FileOwner(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractFileEngine$FileOwner constant with the specified <tt>int</tt>.</brief>
*/

        public static FileOwner resolve(int value) {
            return (FileOwner) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return OwnerUser;
            case 1: return OwnerGroup;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the types of extensions that the file engine can support. Before using these extensions, you must verify that the extension is supported (i.e., call {@link com.trolltech.qt.core.QAbstractFileEngine#supportsExtension(com.trolltech.qt.core.QAbstractFileEngine.Extension) supportsExtension()}).
*/

    public enum Extension implements com.trolltech.qt.QtEnumerator {
/**
 Whether the current file position is at the end of the file or not. This extension allows file engines that implement local buffering to report end-of-file status without having to check the size of the file. It is also useful for sequential files, where the size of the file cannot be used to determine whether or not you have reached the end. This extension returns true if the file is at the end; otherwise it returns false. The input and output arguments to extension() are ignored.
*/

        AtEndExtension(0),
/**
 Whether the file engine provides a fast implementation for {@link com.trolltech.qt.core.QAbstractFileEngine#readLine(com.trolltech.qt.QNativePointer, long) readLine()} or not. If {@link com.trolltech.qt.core.QAbstractFileEngine#readLine(com.trolltech.qt.QNativePointer, long) readLine()} remains unimplemented in the file engine, {@link com.trolltech.qt.core.QAbstractFileEngine QAbstractFileEngine} will provide an implementation based on calling {@link com.trolltech.qt.core.QAbstractFileEngine#read(com.trolltech.qt.QNativePointer, long) read()} repeatedly. If {@link com.trolltech.qt.core.QAbstractFileEngine#supportsExtension(com.trolltech.qt.core.QAbstractFileEngine.Extension) supportsExtension()} returns false for this extension, however, {@link com.trolltech.qt.core.QIODevice QIODevice} can provide a faster implementation by making use of its internal buffer. For engines that already provide a fast {@link com.trolltech.qt.core.QAbstractFileEngine#readLine(com.trolltech.qt.QNativePointer, long) readLine()} implementation, returning false for this extension can avoid unnnecessary double-buffering in {@link com.trolltech.qt.core.QIODevice QIODevice}.
*/

        FastReadLineExtension(1),
/**
 Whether the file engine provides the ability to map a file to memory.
*/

        MapExtension(2),
/**
 Whether the file engine provides the ability to unmap memory that was previously mapped.
*/

        UnMapExtension(3),
        CustomEnum(0);

        Extension(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QAbstractFileEngine$Extension constant with the specified <tt>int</tt>.</brief>
*/

        public static Extension resolve(int value) {
            return (Extension) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AtEndExtension;
            case 1: return FastReadLineExtension;
            case 2: return MapExtension;
            case 3: return UnMapExtension;
            }
            if (enumCache == null)
                enumCache = new java.util.HashMap<Integer, Extension>();
            Extension e = enumCache.get(value);
            if (e == null) {
                e = (Extension) com.trolltech.qt.GeneratorUtilities.createExtendedEnum(value, CustomEnum.ordinal(), Extension.class, CustomEnum.name());
                enumCache.put(value, e);
            }
            return e;
        }
        private final int value;

        private static java.util.HashMap<Integer, Extension> enumCache;    }
/**
The permissions and types of a file, suitable for OR'ing together. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#fileFlags(com.trolltech.qt.core.QAbstractFileEngine.FileFlag[]) fileFlags()}, and {@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    public enum FileFlag implements com.trolltech.qt.QtEnumerator {
/**
 The owner of the file has permission to read it.
*/

        ReadOwnerPerm(16384),
/**
 The owner of the file has permission to write to it.
*/

        WriteOwnerPerm(8192),
/**
 The owner of the file has permission to execute it.
*/

        ExeOwnerPerm(4096),
/**
 The current user has permission to read the file.
*/

        ReadUserPerm(1024),
/**
 The current user has permission to write to the file.
*/

        WriteUserPerm(512),
/**
 The current user has permission to execute the file.
*/

        ExeUserPerm(256),
/**
 Members of the current user's group have permission to read the file.
*/

        ReadGroupPerm(64),
/**
 Members of the current user's group have permission to write to the file.
*/

        WriteGroupPerm(32),
/**
 Members of the current user's group have permission to execute the file.
*/

        ExeGroupPerm(16),
/**
 All users have permission to read the file.
*/

        ReadOtherPerm(4),
/**
 All users have permission to write to the file.
*/

        WriteOtherPerm(2),
/**
 All users have permission to execute the file.
*/

        ExeOtherPerm(1),
/**
 The file is a link to another file (or link) in the file system (i.e. not a file or directory).
*/

        LinkType(65536),
/**
 The file is a regular file to the file system (i. . not a link or directory)
*/

        FileType(131072),
/**
 The file is a directory in the file system (i. . not a link or file).
*/

        DirectoryType(262144),
/**
 The file is a Mac OS X bundle implies {@link com.trolltech.qt.core.QAbstractFileEngine.FileFlag DirectoryType }
*/

        BundleType(524288),
/**
 The file is hidden.
*/

        HiddenFlag(1048576),
/**
 The file resides on the local disk and can be passed to standard file functions.
*/

        LocalDiskFlag(2097152),
/**
 The file actually exists in the file system.
*/

        ExistsFlag(4194304),
/**
 The file or the file pointed to is the root of the filesystem.
*/

        RootFlag(8388608),
/**
 Passing this flag will force the file engine to refresh all flags.
*/

        Refresh(16777216),
        PermsMask(65535),
        TypesMask(983040),
        FlagsMask(267386880),
        FileInfoAll(268435455);

        FileFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.QAbstractFileEngine$FileFlags with the specified <tt>com.trolltech.qt.core.QAbstractFileEngine$FileFlag[]</tt> QAbstractFileEngine$FileFlag values set.</brief>
*/

        public static FileFlags createQFlags(FileFlag ... values) {
            return new FileFlags(values);
        }
/**
<brief>Returns the QAbstractFileEngine$FileFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static FileFlag resolve(int value) {
            return (FileFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 16384: return ReadOwnerPerm;
            case 8192: return WriteOwnerPerm;
            case 4096: return ExeOwnerPerm;
            case 1024: return ReadUserPerm;
            case 512: return WriteUserPerm;
            case 256: return ExeUserPerm;
            case 64: return ReadGroupPerm;
            case 32: return WriteGroupPerm;
            case 16: return ExeGroupPerm;
            case 4: return ReadOtherPerm;
            case 2: return WriteOtherPerm;
            case 1: return ExeOtherPerm;
            case 65536: return LinkType;
            case 131072: return FileType;
            case 262144: return DirectoryType;
            case 524288: return BundleType;
            case 1048576: return HiddenFlag;
            case 2097152: return LocalDiskFlag;
            case 4194304: return ExistsFlag;
            case 8388608: return RootFlag;
            case 16777216: return Refresh;
            case 65535: return PermsMask;
            case 983040: return TypesMask;
            case 267386880: return FlagsMask;
            case 268435455: return FileInfoAll;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class FileFlags extends com.trolltech.qt.QFlags<FileFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QAbstractFileEngine-FileFlags with the specified <tt>com.trolltech.qt.core.QAbstractFileEngine.FileFlag[]</tt>. flags set.</brief>
*/

        public FileFlags(FileFlag ... args) { super(args); }
        public FileFlags(int value) { setValue(value); }
    }



/**
Constructs a new QAbstractFileEngine that does not refer to any file or directory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    protected QAbstractFileEngine(){
        super((QPrivateConstructor)null);
        __qt_QAbstractFileEngine();
    }

    native void __qt_QAbstractFileEngine();

/**
Returns true if the current position is at the end of the file; otherwise, returns false. <p>This function bases its behavior on calling extension() with {@link com.trolltech.qt.core.QAbstractFileEngine.Extension AtEndExtension }. If the engine does not support this extension, false is returned. <p><DT><b>See also:</b><br><DD>extension(), {@link com.trolltech.qt.core.QAbstractFileEngine#supportsExtension(com.trolltech.qt.core.QAbstractFileEngine.Extension) supportsExtension()}, and QFile::atEnd(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean atEnd()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_atEnd(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_atEnd(long __this__nativeId);

/**
Returns the {@link com.trolltech.qt.core.QFile.FileError QFile::FileError } that resulted from the last failed operation. If {@link com.trolltech.qt.core.QFile.FileError QFile::UnspecifiedError } is returned, {@link com.trolltech.qt.core.QFile QFile} will use its own idea of the error status. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setError(com.trolltech.qt.core.QFile.FileError, java.lang.String) setError()}, {@link com.trolltech.qt.core.QFile.FileError QFile::FileError }, and {@link com.trolltech.qt.core.QAbstractFileEngine#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QFile.FileError error()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QFile.FileError.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
Returns the human-readable message appropriate to the current error reported by {@link com.trolltech.qt.core.QAbstractFileEngine#error() error()}. If no suitable string is available, an empty string is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#error() error()}. <br></DD></DT>
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
Sets the error type to <tt>error</tt>, and the error string to <tt>errorString</tt>. Call this function to set the error values returned by the higher-level classes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#error() QFile::error()}, {@link com.trolltech.qt.core.QIODevice#errorString() QIODevice::errorString()}, and {@link com.trolltech.qt.core.QIODevice#setErrorString(java.lang.String) QIODevice::setErrorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void setError(com.trolltech.qt.core.QFile.FileError error, java.lang.String str)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setError_FileError_String(nativeId(), error.value(), str);
    }
    @QtBlockedSlot
    native void __qt_setError_FileError_String(long __this__nativeId, int error, java.lang.String str);

/**
Should return true if the underlying file system is case-sensitive; otherwise return false. <p>This virtual function must be reimplemented by all subclasses.
*/

    @QtBlockedSlot
    public boolean caseSensitive()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_caseSensitive(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_caseSensitive(long __this__nativeId);

/**
Closes the file, returning true if successful; otherwise returns false. <p>The default implementation always returns false.
*/

    @QtBlockedSlot
    public boolean close()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_close(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_close(long __this__nativeId);

/**
Copies the contents of this file to a file with the name <tt>newName</tt>. Returns true on success; otherwise, false is returned.
*/

    @QtBlockedSlot
    public boolean copy(java.lang.String newName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_copy_String(nativeId(), newName);
    }
    @QtBlockedSlot
    native boolean __qt_copy_String(long __this__nativeId, java.lang.String newName);

/**
Requests that a list of all the files matching the <tt>filters</tt> list based on the <tt>filterNames</tt> in the file engine's directory are returned. <p>Should return an empty list if the file engine refers to a file rather than a directory, or if the directory is unreadable or does not exist or if nothing matches the specifications. <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> entryList(com.trolltech.qt.core.QDir.Filters filters, java.util.List<java.lang.String> filterNames)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_entryList_Filters_List(nativeId(), filters.value(), filterNames);
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_entryList_Filters_List(long __this__nativeId, int filters, java.util.List<java.lang.String> filterNames);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QAbstractFileEngine.FileFlags fileFlags(com.trolltech.qt.core.QAbstractFileEngine.FileFlag ... type) {
        return this.fileFlags(new com.trolltech.qt.core.QAbstractFileEngine.FileFlags(type));
    }

/**
This function should return the set of OR'd flags that are true for the file engine's file, and that are in the <tt>type</tt>'s OR'd members. <p>In your reimplementation you can use the <tt>type</tt> argument as an optimization hint and only return the OR'd set of members that are true and that match those in <tt>type</tt>; in other words you can ignore any members not mentioned in <tt>type</tt>, thus avoiding some potentially expensive lookups or system calls. <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QAbstractFileEngine.FileFlags fileFlags() {
        return fileFlags(new com.trolltech.qt.core.QAbstractFileEngine.FileFlags(268435455));
    }
/**
This function should return the set of OR'd flags that are true for the file engine's file, and that are in the <tt>type</tt>'s OR'd members. <p>In your reimplementation you can use the <tt>type</tt> argument as an optimization hint and only return the OR'd set of members that are true and that match those in <tt>type</tt>; in other words you can ignore any members not mentioned in <tt>type</tt>, thus avoiding some potentially expensive lookups or system calls. <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QAbstractFileEngine.FileFlags fileFlags(com.trolltech.qt.core.QAbstractFileEngine.FileFlags type)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QAbstractFileEngine.FileFlags(__qt_fileFlags_FileFlags(nativeId(), type.value()));
    }
    @QtBlockedSlot
    native int __qt_fileFlags_FileFlags(long __this__nativeId, int type);


/**
Return the file engine's current file name in the format specified by <tt>file</tt>. <p>If you don't handle some <tt>FileName</tt> possibilities, return the file name set in {@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()} when an unhandled format is requested. <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}, and {@link com.trolltech.qt.core.QAbstractFileEngine.FileName FileName }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fileName() {
        return fileName(com.trolltech.qt.core.QAbstractFileEngine.FileName.DefaultName);
    }
/**
Return the file engine's current file name in the format specified by <tt>file</tt>. <p>If you don't handle some <tt>FileName</tt> possibilities, return the file name set in {@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()} when an unhandled format is requested. <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}, and {@link com.trolltech.qt.core.QAbstractFileEngine.FileName FileName }. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.String fileName(com.trolltech.qt.core.QAbstractFileEngine.FileName file)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileName_FileName(nativeId(), file.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fileName_FileName(long __this__nativeId, int file);

/**
If <tt>time</tt> is <tt>CreationTime</tt>, return when the file was created. If <tt>time</tt> is <tt>ModificationTime</tt>, return when the file was most recently modified. If <tt>time</tt> is <tt>AccessTime</tt>, return when the file was most recently accessed (e.g. read or written). If the time cannot be determined return QDateTime() (an invalid date time). <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}, {@link com.trolltech.qt.core.QDateTime QDateTime}, {@link com.trolltech.qt.core.QDateTime#isValid() QDateTime::isValid()}, and {@link com.trolltech.qt.core.QAbstractFileEngine.FileTime FileTime }. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QDateTime fileTime(com.trolltech.qt.core.QAbstractFileEngine.FileTime time)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileTime_FileTime(nativeId(), time.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_fileTime_FileTime(long __this__nativeId, int time);

/**
Flushes the open file, returning true if successful; otherwise returns false. <p>The default implementation always returns false.
*/

    @QtBlockedSlot
    public boolean flush()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_flush(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_flush(long __this__nativeId);

/**
Returns the native file handle for this file engine. This handle must be used with care; its value and type are platform specific, and using it will most likely lead to non-portable code.
*/

    @QtBlockedSlot
    public int handle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handle(nativeId());
    }
    @QtBlockedSlot
    native int __qt_handle(long __this__nativeId);

/**
Return true if the file referred to by this file engine has a relative path; otherwise return false. <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean isRelativePath()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRelativePath(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isRelativePath(long __this__nativeId);

/**
Returns true if the file is a sequential access device; returns false if the file is a direct access device. <p>Operations involving {@link com.trolltech.qt.core.QAbstractFileEngine#size() size()} and seek(int) are not valid on sequential devices.
*/

    @QtBlockedSlot
    public boolean isSequential()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSequential(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSequential(long __this__nativeId);

/**
Creates a link from the file currently specified by {@link com.trolltech.qt.core.QAbstractFileEngine#fileName() fileName()} to <tt>newName</tt>. What a link is depends on the underlying filesystem (be it a shortcut on Windows or a symbolic link on Unix). Returns true if successful; otherwise returns false.
*/

    @QtBlockedSlot
    public boolean link(java.lang.String newName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_link_String(nativeId(), newName);
    }
    @QtBlockedSlot
    native boolean __qt_link_String(long __this__nativeId, java.lang.String newName);

/**
Requests that the directory <tt>dirName</tt> be created. If <tt>createParentDirectories</tt> is true, then any sub-directories in <tt>dirName</tt> that don't exist must be created. If <tt>createParentDirectories</tt> is false then any sub-directories in <tt>dirName</tt> must already exist for the function to succeed. If the operation succeeds return true; otherwise return false. <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}, {@link com.trolltech.qt.core.QAbstractFileEngine#rmdir(java.lang.String, boolean) rmdir()}, and {@link com.trolltech.qt.core.QAbstractFileEngine#isRelativePath() isRelativePath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean mkdir(java.lang.String dirName, boolean createParentDirectories)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mkdir_String_boolean(nativeId(), dirName, createParentDirectories);
    }
    @QtBlockedSlot
    native boolean __qt_mkdir_String_boolean(long __this__nativeId, java.lang.String dirName, boolean createParentDirectories);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final boolean open(com.trolltech.qt.core.QIODevice.OpenModeFlag ... openMode) {
        return this.open(new com.trolltech.qt.core.QIODevice.OpenMode(openMode));
    }
/**
Opens the file in the specified <tt>mode</tt>. Returns true if the file was successfully opened; otherwise returns false. <p>The <tt>mode</tt> is an OR combination of QIODevice::OpenMode and QIODevice::HandlingMode values.
*/

    @QtBlockedSlot
    public boolean open(com.trolltech.qt.core.QIODevice.OpenMode openMode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_open_OpenMode(nativeId(), openMode.value());
    }
    @QtBlockedSlot
    native boolean __qt_open_OpenMode(long __this__nativeId, int openMode);

/**
If <tt>owner</tt> is <tt>OwnerUser</tt> return the name of the user who owns the file. If <tt>owner</tt> is <tt>OwnerGroup</tt> return the name of the group that own the file. If you can't determine the owner return QString(). <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#ownerId(com.trolltech.qt.core.QAbstractFileEngine.FileOwner) ownerId()}, {@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}, and {@link com.trolltech.qt.core.QAbstractFileEngine.FileOwner FileOwner }. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.String owner(com.trolltech.qt.core.QAbstractFileEngine.FileOwner arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_owner_FileOwner(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_owner_FileOwner(long __this__nativeId, int arg__1);

/**
If <tt>owner</tt> is <tt>OwnerUser</tt> return the ID of the user who owns the file. If <tt>owner</tt> is <tt>OwnerGroup</tt> return the ID of the group that own the file. If you can't determine the owner return -2. <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#owner(com.trolltech.qt.core.QAbstractFileEngine.FileOwner) owner()}, {@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}, and {@link com.trolltech.qt.core.QAbstractFileEngine.FileOwner FileOwner }. <br></DD></DT>
*/

    @QtBlockedSlot
    public int ownerId(com.trolltech.qt.core.QAbstractFileEngine.FileOwner arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ownerId_FileOwner(nativeId(), arg__1.value());
    }
    @QtBlockedSlot
    native int __qt_ownerId_FileOwner(long __this__nativeId, int arg__1);

/**
Returns the current file position. <p>This is the position of the data read/write head of the file.
*/

    @QtBlockedSlot
    public long pos()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native long __qt_pos(long __this__nativeId);

/**
Reads a number of characters from the file into <tt>data</tt>. At most <tt>maxlen</tt> characters will be read. <p>Returns -1 if a fatal error occurs, or 0 if there are no bytes to read.
*/

    @QtBlockedSlot
    public long read(com.trolltech.qt.QNativePointer data, long maxlen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_read_nativepointer_long(nativeId(), data, maxlen);
    }
    @QtBlockedSlot
    native long __qt_read_nativepointer_long(long __this__nativeId, com.trolltech.qt.QNativePointer data, long maxlen);

/**
This function reads one line, terminated by a '\n' character, from the file info <tt>data</tt>. At most <tt>maxlen</tt> characters will be read. The end-of-line character is included.
*/

    @QtBlockedSlot
    public long readLine(com.trolltech.qt.QNativePointer data, long maxlen)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readLine_nativepointer_long(nativeId(), data, maxlen);
    }
    @QtBlockedSlot
    native long __qt_readLine_nativepointer_long(long __this__nativeId, com.trolltech.qt.QNativePointer data, long maxlen);

/**
Requests that the file is deleted from the file system. If the operation succeeds return true; otherwise return false. <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}, and {@link com.trolltech.qt.core.QAbstractFileEngine#rmdir(java.lang.String, boolean) rmdir()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean remove()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_remove(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_remove(long __this__nativeId);

/**
Requests that the file be renamed to <tt>newName</tt> in the file system. If the operation succeeds return true; otherwise return false. <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean rename(java.lang.String newName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rename_String(nativeId(), newName);
    }
    @QtBlockedSlot
    native boolean __qt_rename_String(long __this__nativeId, java.lang.String newName);

/**
Requests that the directory <tt>dirName</tt> is deleted from the file system. When <tt>recurseParentDirectories</tt> is true, then any empty parent-directories in <tt>dirName</tt> must also be deleted. If <tt>recurseParentDirectories</tt> is false, only the <tt>dirName</tt> leaf-node should be deleted. In most file systems a directory cannot be deleted using this function if it is non-empty. If the operation succeeds return true; otherwise return false. <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setFileName(java.lang.String) setFileName()}, {@link com.trolltech.qt.core.QAbstractFileEngine#remove() remove()}, {@link com.trolltech.qt.core.QAbstractFileEngine#mkdir(java.lang.String, boolean) mkdir()}, and {@link com.trolltech.qt.core.QAbstractFileEngine#isRelativePath() isRelativePath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean rmdir(java.lang.String dirName, boolean recurseParentDirectories)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rmdir_String_boolean(nativeId(), dirName, recurseParentDirectories);
    }
    @QtBlockedSlot
    native boolean __qt_rmdir_String_boolean(long __this__nativeId, java.lang.String dirName, boolean recurseParentDirectories);

/**
Sets the file position to the given <tt>offset</tt>. Returns true if the position was successfully set; otherwise returns false. <p>The offset is from the beginning of the file, unless the file is sequential. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#isSequential() isSequential()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean seek(long pos)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_seek_long(nativeId(), pos);
    }
    @QtBlockedSlot
    native boolean __qt_seek_long(long __this__nativeId, long pos);

/**
Sets the file engine's file name to <tt>file</tt>. This file name is the file that the rest of the virtual functions will operate on. <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#fileName() fileName()}, and {@link com.trolltech.qt.core.QAbstractFileEngine#rename(java.lang.String) rename()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setFileName(java.lang.String file)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFileName_String(nativeId(), file);
    }
    @QtBlockedSlot
    native void __qt_setFileName_String(long __this__nativeId, java.lang.String file);

/**
Requests that the file's permissions be set to <tt>perms</tt>. The argument perms will be set to the OR-ed together combination of QAbstractFileEngine::FileInfo, with only the {@link com.trolltech.qt.core.QAbstractFileEngine.FileFlag QAbstractFileEngine::PermsMask } being honored. If the operations succceeds return true; otherwise return false; <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#size() size()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean setPermissions(int perms)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setPermissions_int(nativeId(), perms);
    }
    @QtBlockedSlot
    native boolean __qt_setPermissions_int(long __this__nativeId, int perms);

/**
Requests that the file be set to size <tt>size</tt>. If <tt>size</tt> is larger than the current file then it is filled with 0's, if smaller it is simply truncated. If the operations succceeds return true; otherwise return false; <p>This virtual function must be reimplemented by all subclasses. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#size() size()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean setSize(long size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setSize_long(nativeId(), size);
    }
    @QtBlockedSlot
    native boolean __qt_setSize_long(long __this__nativeId, long size);

/**
Returns the size of the file. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#setSize(long) setSize()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public long size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native long __qt_size(long __this__nativeId);

/**
This virtual function returns true if the file engine supports <tt>extension</tt>; otherwise, false is returned. By default, no extensions are supported. <p><DT><b>See also:</b><br><DD>extension(). <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean supportsExtension(com.trolltech.qt.core.QAbstractFileEngine.Extension extension)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportsExtension_Extension(nativeId(), extension.value());
    }
    @QtBlockedSlot
    native boolean __qt_supportsExtension_Extension(long __this__nativeId, int extension);

/**
Writes <tt>len</tt> bytes from <tt>data</tt> to the file. Returns the number of characters written on success; otherwise returns -1.
*/

    @QtBlockedSlot
    public long write(com.trolltech.qt.QNativePointer data, long len)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_write_nativepointer_long(nativeId(), data, len);
    }
    @QtBlockedSlot
    native long __qt_write_nativepointer_long(long __this__nativeId, com.trolltech.qt.QNativePointer data, long len);

/**
Creates and returns a QAbstractFileEngine suitable for processing <tt>fileName</tt>. <p>You should not need to call this function; use {@link com.trolltech.qt.core.QFile QFile}, {@link com.trolltech.qt.core.QFileInfo QFileInfo} or {@link com.trolltech.qt.core.QDir QDir} directly instead. <p>If you reimplemnt this function, it should only return file engines that knows how to handle <tt>fileName</tt>; otherwise, it should return 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngineHandler QAbstractFileEngineHandler}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QAbstractFileEngine create(java.lang.String fileName);

/**
@exclude
*/

    public static native QAbstractFileEngine fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractFileEngine(QPrivateConstructor p) { super(p); } 

    /**
     * Adds <tt>path</tt> to the set of paths in which Qt Jambi should search for resources. Resources
     * can be accessed using the "classpath:" scheme.
     */
        public static void addSearchPathForResourceEngine(String path)
    {
        com.trolltech.qt.internal.QClassPathEngine.addSearchPath(path);
    }

    /**
     * Removes <tt>path</tt> from the set of paths in which Qt Jambi searches
     * for resources.
     */
        public static void removeSearchPathForResourceEngine(String path)
    {
        com.trolltech.qt.internal.QClassPathEngine.removeSearchPath(path);
    }

}
