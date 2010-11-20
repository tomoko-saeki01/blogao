package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QFile class provides an interface for reading from and writing to files. QFile is an I/O device for reading and writing text and binary files and {@link <a href="../resources.html">resources</a>}. A QFile may be used by itself or, more conveniently, with a {@link com.trolltech.qt.core.QTextStream QTextStream} or {@link com.trolltech.qt.core.QDataStream QDataStream}. <p>The file name is usually passed in the constructor, but it can be set at any time using {@link com.trolltech.qt.core.QFile#setFileName(java.lang.String) setFileName()}. QFile expects the file separator to be '/' regardless of operating system. The use of other separators (e.g., '\') is not supported. <p>You can check for a file's existence using {@link com.trolltech.qt.core.QFile#exists() exists()}, and remove a file using {@link com.trolltech.qt.core.QFile#remove() remove()}. (More advanced file system related operations are provided by {@link com.trolltech.qt.core.QFileInfo QFileInfo} and {@link com.trolltech.qt.core.QDir QDir}.) <p>The file is opened with {@link com.trolltech.qt.core.QFile#open(int, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) open()}, closed with close(), and flushed with {@link com.trolltech.qt.core.QFile#flush() flush()}. Data is usually read and written using {@link com.trolltech.qt.core.QDataStream QDataStream} or {@link com.trolltech.qt.core.QTextStream QTextStream}, but you can also call the {@link com.trolltech.qt.core.QIODevice QIODevice}-inherited functions {@link com.trolltech.qt.core.QIODevice#read(long) read()}, {@link com.trolltech.qt.core.QIODevice#readLine() readLine()}, {@link com.trolltech.qt.core.QIODevice#readAll() readAll()}, {@link com.trolltech.qt.core.QIODevice#write(com.trolltech.qt.core.QByteArray) write()}. QFile also inherits getChar(), putChar(), and ungetChar(), which work one character at a time. <p>The size of the file is returned by size(). You can get the current file position using {@link com.trolltech.qt.core.QIODevice#pos() pos()}, or move to a new file position using {@link com.trolltech.qt.core.QIODevice#seek(long) seek()}. If you've reached the end of the file, atEnd() returns true.<a name="reading-files-directly"><h2>Reading Files Directly</h2> The following example reads a text file line by line: <pre class="snippet">
        QFile file = new QFile("in.txt");
        if (!file.open(new QIODevice.OpenMode(QIODevice.OpenModeFlag.ReadOnly,
                                              QIODevice.OpenModeFlag.Text)))
            return;

        while (!file.atEnd()) {
            QByteArray line = file.readLine();
            process_line(line);
        }
    </pre> The {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::Text } flag passed to {@link com.trolltech.qt.core.QFile#open(int, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) open()} tells Qt to convert Windows-style line terminators ("\r\n") into C++-style terminators ("\n"). By default, QFile assumes binary, i.e. it doesn't perform any conversion on the bytes stored in the file.<a name="using-streams-to-read-files"><h2>Using Streams to Read Files</h2> The next example uses {@link com.trolltech.qt.core.QTextStream QTextStream} to read a text file line by line: <pre class="snippet">
        QFile file = new QFile("in.txt");
        if (!file.open(new QIODevice.OpenMode(QIODevice.OpenModeFlag.ReadOnly,
                                              QIODevice.OpenModeFlag.Text)))
            return;

        QTextStream in = new QTextStream(file);
        while (!in.atEnd()) {
            String line = in.readLine();
            process_line(line);
        }
    </pre> {@link com.trolltech.qt.core.QTextStream QTextStream} takes care of converting the 8-bit data stored on disk into a 16-bit Unicode QString. By default, it assumes that the user system's local 8-bit encoding is used (e.g., ISO 8859-1 for most of Europe; see {@link com.trolltech.qt.core.QTextCodec#codecForLocale() QTextCodec::codecForLocale()} for details). This can be changed using setCodec(). <p>To write text, we can use operator&lt;&lt;(), which is overloaded to take a {@link com.trolltech.qt.core.QTextStream QTextStream} on the left and various data types (including QString) on the right: <pre class="snippet">
        QFile file = new QFile("out.txt");
        if (!file.open(new QIODevice.OpenMode(QIODevice.OpenModeFlag.ReadOnly,
                                              QIODevice.OpenModeFlag.Text)))
            return;

        QTextStream out = new QTextStream(file);
        out.writeString("The magic number is: " + 49 + "\n");
    </pre> {@link com.trolltech.qt.core.QDataStream QDataStream} is similar, in that you can use operator&lt;&lt;() to write data and operator&gt;&gt;() to read it back. See the class documentation for details. <p>When you use QFile, {@link com.trolltech.qt.core.QFileInfo QFileInfo}, and {@link com.trolltech.qt.core.QDir QDir} to access the file system with Qt, you can use Unicode file names. On Unix, these file names are converted to an 8-bit encoding. If you want to use standard C++ APIs (<tt>&lt;cstdio&gt;</tt> or <tt>&lt;iostream&gt;</tt>) or platform-specific APIs to access files instead of QFile, you can use the {@link com.trolltech.qt.core.QFile#encodeName(java.lang.String) encodeName()} and {@link com.trolltech.qt.core.QFile#decodeName(com.trolltech.qt.core.QByteArray) decodeName()} functions to convert between Unicode file names and 8-bit file names. <p>On Unix, there are some special system files (e.g. in <tt>/proc</tt>) for which size() will always return 0, yet you may still be able to read more data from such a file; the data is generated in direct response to you calling {@link com.trolltech.qt.core.QIODevice#read(long) read()}. In this case, however, you cannot use atEnd() to determine if there is more data to read (since atEnd() will return true for a file that claims to have size 0). Instead, you should either call {@link com.trolltech.qt.core.QIODevice#readAll() readAll()}, or call {@link com.trolltech.qt.core.QIODevice#read(long) read()} or {@link com.trolltech.qt.core.QIODevice#readLine() readLine()} repeatedly until no more data can be read. The next example uses {@link com.trolltech.qt.core.QTextStream QTextStream} to read <tt>/proc/modules</tt> line by line: <pre class="snippet">
        QFile file = new QFile("/proc/modules");
        if (!file.open(new QIODevice.OpenMode(QIODevice.OpenModeFlag.ReadOnly,
                                              QIODevice.OpenModeFlag.Text)))
            return;

        QTextStream in = new QTextStream(file);
        String line = in.readLine();
        while (line != null) {
            process_line(line);
            line = in.readLine();
        }
    </pre><a name="signals"><h2>Signals</h2> Unlike other {@link com.trolltech.qt.core.QIODevice QIODevice} implementations, such as {@link com.trolltech.qt.network.QTcpSocket QTcpSocket}, QFile does not emit the {@link com.trolltech.qt.core.QIODevice#aboutToClose aboutToClose() }, {@link com.trolltech.qt.core.QIODevice#bytesWritten bytesWritten() }, or {@link com.trolltech.qt.core.QIODevice#readyRead readyRead() } signals. This implementation detail means that QFile is not suitable for reading and writing certain types of files, such as device files on Unix platforms.<a name="platform-specific-issues"><h2>Platform Specific Issues</h2> File permissions are handled differently on Linux/Mac OS X and Windows. In a non {@link com.trolltech.qt.core.QIODevice#isWritable() writable} directory on Linux, files cannot be created. This is not always the case on Windows, where, for instance, the 'My Documents' directory usually is not writable, but it is still possible to create files in it. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTextStream QTextStream}, {@link com.trolltech.qt.core.QDataStream QDataStream}, {@link com.trolltech.qt.core.QFileInfo QFileInfo}, {@link com.trolltech.qt.core.QDir QDir}, and {@link <a href="../resources.html">The Qt Resource System</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFile extends com.trolltech.qt.core.QIODevice
{
    
/**
This enum describes the errors that may be returned by the {@link com.trolltech.qt.core.QFile#error() error()} function.
*/
@QtBlockedEnum
    public enum FileError implements com.trolltech.qt.QtEnumerator {
/**
 No error occurred.
*/

        NoError(0),
/**
 An error occurred when reading from the file.
*/

        ReadError(1),
/**
 An error occurred when writing to the file.
*/

        WriteError(2),
/**
 A fatal error occurred.
*/

        FatalError(3),
/**

*/

        ResourceError(4),
/**
 The file could not be opened.
*/

        OpenError(5),
/**
 The operation was aborted.
*/

        AbortError(6),
/**
 A timeout occurred.
*/

        TimeOutError(7),
/**
 An unspecified error occurred.
*/

        UnspecifiedError(8),
/**
 The file could not be removed.
*/

        RemoveError(9),
/**
 The file could not be renamed.
*/

        RenameError(10),
/**
 The position in the file could not be changed.
*/

        PositionError(11),
/**
 The file could not be resized.
*/

        ResizeError(12),
/**
 The file could not be accessed.
*/

        PermissionsError(13),
/**
 The file could not be copied.
*/

        CopyError(14);

        FileError(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFile$FileError constant with the specified <tt>int</tt>.</brief>
*/

        public static FileError resolve(int value) {
            return (FileError) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoError;
            case 1: return ReadError;
            case 2: return WriteError;
            case 3: return FatalError;
            case 4: return ResourceError;
            case 5: return OpenError;
            case 6: return AbortError;
            case 7: return TimeOutError;
            case 8: return UnspecifiedError;
            case 9: return RemoveError;
            case 10: return RenameError;
            case 11: return PositionError;
            case 12: return ResizeError;
            case 13: return PermissionsError;
            case 14: return CopyError;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum describes special options that may be used by the map() function.
*/
@QtBlockedEnum
    public enum MemoryMapFlags implements com.trolltech.qt.QtEnumerator {
/**
 No options.
*/

        NoOptions(0);

        MemoryMapFlags(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFile$MemoryMapFlags constant with the specified <tt>int</tt>.</brief>
*/

        public static MemoryMapFlags resolve(int value) {
            return (MemoryMapFlags) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoOptions;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    
/**
This enum is used by the permission() function to report the permissions and ownership of a file. The values may be OR-ed together to test multiple permissions and ownership values. <b>Warning:</b> Because of differences in the platforms supported by Qt, the semantics of {@link com.trolltech.qt.core.QFile.Permission ReadUser }, {@link com.trolltech.qt.core.QFile.Permission WriteUser } and {@link com.trolltech.qt.core.QFile.Permission ExeUser } are platform-dependent: On Unix, the rights of the owner of the file are returned and on Windows the rights of the current user are returned. This behavior might change in a future Qt version. <p>Note that Qt does not by default check for permissions on NTFS file systems, as this may decrease the performance of file handling considerably. It is possible to force permission checking on NTFS by including the following code in your source:<br><br>The following code example is written in c++.<br> <pre class="snippet">
extern Q_CORE_EXPORT int qt_ntfs_permission_lookup;
</pre> Permission checking is then turned on and off by incrementing and decrementing <tt>qt_ntfs_permission_lookup</tt> by 1.<br><br>The following code example is written in c++.<br> <pre class="snippet">
qt_ntfs_permission_lookup++; // turn checking on
qt_ntfs_permission_lookup--; // turn it off again
*/
@QtBlockedEnum
    public enum Permission implements com.trolltech.qt.QtEnumerator {
/**
 The file is readable by the owner of the file.
*/

        ReadOwner(16384),
/**
 The file is writable by the owner of the file.
*/

        WriteOwner(8192),
/**
 The file is executable by the owner of the file.
*/

        ExeOwner(4096),
/**
 The file is readable by the user.
*/

        ReadUser(1024),
/**
 The file is writable by the user.
*/

        WriteUser(512),
/**
 The file is executable by the user.
*/

        ExeUser(256),
/**
 The file is readable by the group.
*/

        ReadGroup(64),
/**
 The file is writable by the group.
*/

        WriteGroup(32),
/**
 The file is executable by the group.
*/

        ExeGroup(16),
/**
 The file is readable by anyone.
*/

        ReadOther(4),
/**
 The file is writable by anyone.
*/

        WriteOther(2),
/**
 The file is executable by anyone.
*/

        ExeOther(1);

        Permission(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.QFile$Permissions with the specified <tt>com.trolltech.qt.core.QFile$Permission[]</tt> QFile$Permission values set.</brief></pre>
*/

        public static Permissions createQFlags(Permission ... values) {
            return new Permissions(values);
        }
/**
<brief>Returns the QFile$Permission constant with the specified <tt>int</tt>.</brief>
*/

        public static Permission resolve(int value) {
            return (Permission) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 16384: return ReadOwner;
            case 8192: return WriteOwner;
            case 4096: return ExeOwner;
            case 1024: return ReadUser;
            case 512: return WriteUser;
            case 256: return ExeUser;
            case 64: return ReadGroup;
            case 32: return WriteGroup;
            case 16: return ExeGroup;
            case 4: return ReadOther;
            case 2: return WriteOther;
            case 1: return ExeOther;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class Permissions extends com.trolltech.qt.QFlags<Permission> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QFile-Permissions with the specified <tt>com.trolltech.qt.core.QFile.Permission[]</tt>. flags set.</brief>
*/

        public Permissions(Permission ... args) { super(args); }
        public Permissions(int value) { setValue(value); }
    }



/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QFile(){
        super((QPrivateConstructor)null);
        __qt_QFile();
    }

    native void __qt_QFile();

/**
Constructs a new file object with the given <tt>parent</tt>.
*/

    public QFile(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QFile_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QFile_QObject(long parent);

/**
Constructs a new file object to represent the file with the given <tt>name</tt>.
*/

    public QFile(java.lang.String name){
        super((QPrivateConstructor)null);
        __qt_QFile_String(name);
    }

    native void __qt_QFile_String(java.lang.String name);

/**
Constructs a new file object with the given <tt>parent</tt> to represent the file with the specified <tt>name</tt>.
*/

    public QFile(java.lang.String name, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QFile_String_QObject(name, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QFile_String_QObject(java.lang.String name, long parent);

/**
Copies the file currently specified by {@link com.trolltech.qt.core.QFile#fileName() fileName()} to a file called <tt>newName</tt>. Returns true if successful; otherwise returns false. <p>Note that if a file with the name <tt>newName</tt> already exists, {@link com.trolltech.qt.core.QFile#copy(java.lang.String) copy()} returns false (i.e. QFile will not overwrite it). <p>The source file is closed before it is copied. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean copy(java.lang.String newName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_copy_String(nativeId(), newName);
    }
    @QtBlockedSlot
    native boolean __qt_copy_String(long __this__nativeId, java.lang.String newName);

/**
Returns the file error status. <p>The I/O device status returns an error code. For example, if {@link com.trolltech.qt.core.QFile#open(int, com.trolltech.qt.core.QIODevice.OpenModeFlag[]) open()} returns false, or a read/write operation returns -1, this function can be called to find out the reason why the operation failed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#unsetError() unsetError()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QFile.FileError error()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QFile.FileError.resolve(__qt_error(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_error(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if the file specified by {@link com.trolltech.qt.core.QFile#fileName() fileName()} exists; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#fileName() fileName()}, and {@link com.trolltech.qt.core.QFile#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean exists()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exists(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_exists(long __this__nativeId);

/**
Returns the name set by {@link com.trolltech.qt.core.QFile#setFileName(java.lang.String) setFileName()} or to the QFile constructors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#setFileName(java.lang.String) setFileName()}, and {@link com.trolltech.qt.core.QFileInfo#fileName() QFileInfo::fileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fileName()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fileName(long __this__nativeId);

/**
Flushes any buffered data to the file. Returns true if successful; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean flush()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_flush(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_flush(long __this__nativeId);

/**
Returns the file handle of the file. <p>This is a small positive integer, suitable for use with C library functions such as fdopen() and fcntl(). On systems that use file descriptors for sockets (i.e. Unix systems, but not Windows) the handle can be used with {@link com.trolltech.qt.core.QSocketNotifier QSocketNotifier} as well. <p>If the file is not open, or there is an error, {@link com.trolltech.qt.core.QFile#handle() handle()} returns -1. <p>This function is not supported on Windows CE. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QSocketNotifier QSocketNotifier}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int handle()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_handle(nativeId());
    }
    @QtBlockedSlot
    native int __qt_handle(long __this__nativeId);

/**
Creates a link named <tt>linkName</tt> that points to the file currently specified by {@link com.trolltech.qt.core.QFile#fileName() fileName()}. What a link is depends on the underlying filesystem (be it a shortcut on Windows or a symbolic link on Unix). Returns true if successful; otherwise returns false. <p>This function will not overwrite an already existing entity in the file system; in this case, <tt>link()</tt> will return false and set {@link com.trolltech.qt.core.QFile#error() error()} to return {@link com.trolltech.qt.core.QFile.FileError RenameError }. <p><b>Note:</b> To create a valid link on Windows, <tt>linkName</tt> must have a <tt>.lnk</tt> file extension. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean link(java.lang.String newName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_link_String(nativeId(), newName);
    }
    @QtBlockedSlot
    native boolean __qt_link_String(long __this__nativeId, java.lang.String newName);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final boolean open(int fd, com.trolltech.qt.core.QIODevice.OpenModeFlag ... flags) {
        return this.open(fd, new com.trolltech.qt.core.QIODevice.OpenMode(flags));
    }
/**
This is an overloaded member function, provided for convenience. <p>Opens the existing file descripter <tt>fd</tt> in the given <tt>mode</tt>. Returns true if successful; otherwise returns false. <p>When a QFile is opened using this function, close() does not actually close the file. <p>The QFile that is opened using this function is automatically set to be in raw mode; this means that the file input/output functions are slow. If you run into performance issues, you should try to use one of the other open functions. <p><b>Warning:</b> If <tt>fd</tt> is 0 (<tt>stdin</tt>), 1 (<tt>stdout</tt>), or 2 (<tt>stderr</tt>), you may not be able to {@link com.trolltech.qt.core.QIODevice#seek(long) seek()}. size() is set to <tt>LLONG_MAX</tt> (in <tt>&lt;climits&gt;</tt>). <p><b>Warning:</b> For Windows CE you may not be able to call {@link com.trolltech.qt.core.QIODevice#seek(long) seek()}, setSize(), fileTime(). size() is set to <tt>0</tt>. <p><b>Warning:</b> Since this function opens the file without specifying the file name, you cannot use this QFile with a {@link com.trolltech.qt.core.QFileInfo QFileInfo}. <p><DT><b>See also:</b><br><DD>close(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean open(int fd, com.trolltech.qt.core.QIODevice.OpenMode flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_open_int_OpenMode(nativeId(), fd, flags.value());
    }
    @QtBlockedSlot
    native boolean __qt_open_int_OpenMode(long __this__nativeId, int fd, int flags);

/**
Returns the complete OR-ed together combination of {@link com.trolltech.qt.core.QFile.Permission QFile::Permission } for the file. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#setPermissions(com.trolltech.qt.core.QFile.Permission[]) setPermissions()}, and {@link com.trolltech.qt.core.QFile#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QFile.Permissions permissions()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QFile.Permissions(__qt_permissions(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_permissions(long __this__nativeId);

/**
Removes the file specified by {@link com.trolltech.qt.core.QFile#fileName() fileName()}. Returns true if successful; otherwise returns false. <p>The file is closed before it is removed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean remove()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_remove(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_remove(long __this__nativeId);

/**
Renames the file currently specified by {@link com.trolltech.qt.core.QFile#fileName() fileName()} to <tt>newName</tt>. Returns true if successful; otherwise returns false. <p>If a file with the name <tt>newName</tt> already exists, {@link com.trolltech.qt.core.QFile#rename(java.lang.String) rename()} returns false (i.e., QFile will not overwrite it). <p>The file is closed before it is renamed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean rename(java.lang.String newName)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rename_String(nativeId(), newName);
    }
    @QtBlockedSlot
    native boolean __qt_rename_String(long __this__nativeId, java.lang.String newName);

/**
Sets the file size (in bytes) <tt>sz</tt>. Returns true if the file if the resize succeeds; false otherwise. If <tt>sz</tt> is larger than the file currently is the new bytes will be set to 0, if <tt>sz</tt> is smaller the file is simply truncated. <p><DT><b>See also:</b><br><DD>size(), and {@link com.trolltech.qt.core.QFile#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean resize(long sz)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resize_long(nativeId(), sz);
    }
    @QtBlockedSlot
    native boolean __qt_resize_long(long __this__nativeId, long sz);

/**
Sets the <tt>name</tt> of the file. The name can have no path, a relative path, or an absolute path. <p>Do not call this function if the file has already been opened. <p>If the file name has no path or a relative path, the path used will be the application's current directory path at the time of the open() call. <p>Example: <pre class="snippet">
        QFile file = new QFile();
        QDir.setCurrent("/tmp");
        file.setFileName("readme.txt");
        QDir.setCurrent("/home");
        file.open(QIODevice.OpenModeFlag.ReadOnly);      // opens "/home/readme.txt" under Unix
</pre> Note that the directory separator "/" works for all operating systems supported by Qt. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#fileName() fileName()}, {@link com.trolltech.qt.core.QFileInfo QFileInfo}, and {@link com.trolltech.qt.core.QDir QDir}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFileName(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFileName_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setFileName_String(long __this__nativeId, java.lang.String name);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final boolean setPermissions(com.trolltech.qt.core.QFile.Permission ... permissionSpec) {
        return this.setPermissions(new com.trolltech.qt.core.QFile.Permissions(permissionSpec));
    }
/**
Sets the permissions for the file to the <tt>permissions</tt> specified. Returns true if successful, or false if the permissions cannot be modified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#permissions() permissions()}, and {@link com.trolltech.qt.core.QFile#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean setPermissions(com.trolltech.qt.core.QFile.Permissions permissionSpec)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setPermissions_Permissions(nativeId(), permissionSpec.value());
    }
    @QtBlockedSlot
    native boolean __qt_setPermissions_Permissions(long __this__nativeId, int permissionSpec);

/**
This is an overloaded member function, provided for convenience. <p>Returns the absolute path of the file or directory a symlink (or shortcut on Windows) points to, or a an empty string if the object isn't a symbolic link. <p>This name may not represent an existing file; it is only a string. {@link com.trolltech.qt.core.QFile#exists() QFile::exists()} returns true if the symlink points to an existing file. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#fileName() fileName()}, and {@link com.trolltech.qt.core.QFile#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String symLinkTarget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_symLinkTarget(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_symLinkTarget(long __this__nativeId);

/**
Sets the file's error to {@link com.trolltech.qt.core.QFile.FileError QFile::NoError }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#error() error()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void unsetError()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unsetError(nativeId());
    }
    @QtBlockedSlot
    native void __qt_unsetError(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean atEnd()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_atEnd(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_atEnd(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void close()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_close(nativeId());
    }
    @QtBlockedSlot
    native void __qt_close(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QAbstractFileEngine fileEngine()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileEngine(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QAbstractFileEngine __qt_fileEngine(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean isSequential()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSequential(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSequential(long __this__nativeId);

/**
Opens the file using OpenMode<tt>mode</tt>, returning true if successful; otherwise false. <p>The <tt>mode</tt> must be {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::ReadOnly }, {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::WriteOnly }, or {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::ReadWrite }. It may also have additional flags, such as {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::Text } and {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::Unbuffered }. <p><b>Note:</b> In {@link com.trolltech.qt.core.QIODevice.OpenModeFlag WriteOnly } or {@link com.trolltech.qt.core.QIODevice.OpenModeFlag ReadWrite } mode, if the relevant file does not already exist, this function will try to create a new file before opening it. <p><b>Note:</b> Because of limitations in the native API, QFile ignores the Unbuffered flag on Windows. <p><DT><b>See also:</b><br><DD>QIODevice::OpenMode, and {@link com.trolltech.qt.core.QFile#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean open(com.trolltech.qt.core.QIODevice.OpenMode flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_open_OpenMode(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native boolean __qt_open_OpenMode(long __this__nativeId, int flags);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long pos()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos(nativeId());
    }
    @QtBlockedSlot
    native long __qt_pos(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected int readData(byte[] data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readData_nativepointer_long(nativeId(), data);
    }
    @QtBlockedSlot
    native int __qt_readData_nativepointer_long(long __this__nativeId, byte[] data);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected int readLineData(byte[] data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_readLineData_nativepointer_long(nativeId(), data);
    }
    @QtBlockedSlot
    native int __qt_readLineData_nativepointer_long(long __this__nativeId, byte[] data);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean seek(long offset)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_seek_long(nativeId(), offset);
    }
    @QtBlockedSlot
    native boolean __qt_seek_long(long __this__nativeId, long offset);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public long size()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native long __qt_size(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected int writeData(byte[] data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_writeData_nativepointer_long(nativeId(), data);
    }
    @QtBlockedSlot
    native int __qt_writeData_nativepointer_long(long __this__nativeId, byte[] data);

/**
This is an overloaded member function, provided for convenience. <p>Copies the file <tt>fileName</tt> to <tt>newName</tt>. Returns true if successful; otherwise returns false. <p>If a file with the name <tt>newName</tt> already exists, {@link com.trolltech.qt.core.QFile#copy(java.lang.String) copy()} returns false (i.e., QFile will not overwrite it). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#rename(java.lang.String) rename()}. <br></DD></DT>
*/

    public native static boolean copy(java.lang.String fileName, java.lang.String newName);

/**
This does the reverse of {@link com.trolltech.qt.core.QFile#encodeName(java.lang.String) QFile::encodeName()} using <tt>localFileName</tt>. <p><DT><b>See also:</b><br><DD>setDecodingFunction(), and {@link com.trolltech.qt.core.QFile#encodeName(java.lang.String) encodeName()}. <br></DD></DT>
*/

    public static java.lang.String decodeName(com.trolltech.qt.core.QByteArray localFileName)    {
        return __qt_decodeName_QByteArray(localFileName == null ? 0 : localFileName.nativeId());
    }
    native static java.lang.String __qt_decodeName_QByteArray(long localFileName);

    private native static java.lang.String decodeName(com.trolltech.qt.QNativePointer localFileName);

/**
By default, this function converts <tt>fileName</tt> to the local 8-bit encoding determined by the user's locale. This is sufficient for file names that the user chooses. File names hard-coded into the application should only use 7-bit ASCII filename characters. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#decodeName(com.trolltech.qt.core.QByteArray) decodeName()}, and setEncodingFunction(). <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QByteArray encodeName(java.lang.String fileName);

/**
Returns true if the file specified by <tt>fileName</tt> exists; otherwise returns false.
*/

    public native static boolean exists(java.lang.String fileName);

/**
This is an overloaded member function, provided for convenience. <p>Creates a link named <tt>linkName</tt> that points to the file <tt>fileName</tt>. What a link is depends on the underlying filesystem (be it a shortcut on Windows or a symbolic link on Unix). Returns true if successful; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#link(java.lang.String) link()}. <br></DD></DT>
*/

    public native static boolean link(java.lang.String oldname, java.lang.String newName);

/**
This is an overloaded member function, provided for convenience. <p>Returns the complete OR-ed together combination of {@link com.trolltech.qt.core.QFile.Permission QFile::Permission } for <tt>fileName</tt>.
*/

    public static com.trolltech.qt.core.QFile.Permissions permissions(java.lang.String filename)    {
        return new com.trolltech.qt.core.QFile.Permissions(__qt_permissions_String(filename));
    }
    native static int __qt_permissions_String(java.lang.String filename);

/**
This is an overloaded member function, provided for convenience. <p>Removes the file specified by the <tt>fileName</tt> given. <p>Returns true if successful; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#remove() remove()}. <br></DD></DT>
*/

    public native static boolean remove(java.lang.String fileName);

/**
This is an overloaded member function, provided for convenience. <p>Renames the file <tt>oldName</tt> to <tt>newName</tt>. Returns true if successful; otherwise returns false. <p>If a file with the name <tt>newName</tt> already exists, {@link com.trolltech.qt.core.QFile#rename(java.lang.String) rename()} returns false (i.e., QFile will not overwrite it). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#rename(java.lang.String) rename()}. <br></DD></DT>
*/

    public native static boolean rename(java.lang.String oldName, java.lang.String newName);

/**
This is an overloaded member function, provided for convenience. <p>Sets <tt>fileName</tt> to size (in bytes) <tt>sz</tt>. Returns true if the file if the resize succeeds; false otherwise. If <tt>sz</tt> is larger than <tt>fileName</tt> currently is the new bytes will be set to 0, if <tt>sz</tt> is smaller the file is simply truncated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFile#resize(long) resize()}. <br></DD></DT>
*/

    public native static boolean resize(java.lang.String filename, long sz);


/**
This is an overloaded method provided for convenience.
*/

    public static boolean setPermissions(java.lang.String filename, com.trolltech.qt.core.QFile.Permission ... permissionSpec) {
        return com.trolltech.qt.core.QFile.setPermissions(filename, new com.trolltech.qt.core.QFile.Permissions(permissionSpec));
    }
/**
This is an overloaded member function, provided for convenience. <p>Sets the permissions for <tt>fileName</tt> file to <tt>permissions</tt>.
*/

    public static boolean setPermissions(java.lang.String filename, com.trolltech.qt.core.QFile.Permissions permissionSpec)    {
        return __qt_setPermissions_String_Permissions(filename, permissionSpec.value());
    }
    native static boolean __qt_setPermissions_String_Permissions(java.lang.String filename, int permissionSpec);

/**
Returns the absolute path of the file or directory referred to by the symlink (or shortcut on Windows) specified by <tt>fileName</tt>, or returns an empty string if the <tt>fileName</tt> does not correspond to a symbolic link. <p>This name may not represent an existing file; it is only a string. {@link com.trolltech.qt.core.QFile#exists() QFile::exists()} returns true if the symlink points to an existing file.
*/

    public native static java.lang.String symLinkTarget(java.lang.String fileName);

/**
@exclude
*/

    public static native QFile fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFile(QPrivateConstructor p) { super(p); } 

/**
Returns the Unicode version of the given <tt>localFileName</tt>. See
encodeName() for details.
*/

    public static String decodeName(String localFileName) {
        return decodeName(com.trolltech.qt.QNativePointer.createCharPointer(localFileName));
    }

}
