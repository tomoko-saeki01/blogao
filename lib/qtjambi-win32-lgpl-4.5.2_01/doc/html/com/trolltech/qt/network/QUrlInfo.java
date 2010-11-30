package com.trolltech.qt.network;

import com.trolltech.qt.*;



/**
The QUrlInfo class stores information about URLs. The information about a URL that can be retrieved includes {@link com.trolltech.qt.network.QUrlInfo#name() name()}, {@link com.trolltech.qt.network.QUrlInfo#permissions() permissions()}, {@link com.trolltech.qt.network.QUrlInfo#owner() owner()}, {@link com.trolltech.qt.network.QUrlInfo#group() group()}, {@link com.trolltech.qt.network.QUrlInfo#size() size()}, {@link com.trolltech.qt.network.QUrlInfo#lastModified() lastModified()}, {@link com.trolltech.qt.network.QUrlInfo#lastRead() lastRead()}, {@link com.trolltech.qt.network.QUrlInfo#isDir() isDir()}, {@link com.trolltech.qt.network.QUrlInfo#isFile() isFile()}, {@link com.trolltech.qt.network.QUrlInfo#isSymLink() isSymLink()}, {@link com.trolltech.qt.network.QUrlInfo#isWritable() isWritable()}, {@link com.trolltech.qt.network.QUrlInfo#isReadable() isReadable()} and {@link com.trolltech.qt.network.QUrlInfo#isExecutable() isExecutable()}. <p>You can create your own QUrlInfo objects passing in all the relevant information in the constructor, and you can modify a QUrlInfo; for each getter mentioned above there is an equivalent setter. Note that setting values does not affect the underlying resource that the QUrlInfo provides information about; for example if you call setWritable(true) on a read-only resource the only thing changed is the QUrlInfo object, not the resource. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QUrl QUrl}, and {@link <a href="../network-ftp.html">FTP Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QUrlInfo extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.network.QtJambi_LibraryInitializer.init();
    }
/**
This enum is used by the {@link com.trolltech.qt.network.QUrlInfo#permissions() permissions()} function to report the permissions of a file.
*/

    public enum PermissionSpec implements com.trolltech.qt.QtEnumerator {
/**
 The file is readable by the owner of the file.
*/

        ReadOwner(256),
/**
 The file is writable by the owner of the file.
*/

        WriteOwner(128),
/**
 The file is executable by the owner of the file.
*/

        ExeOwner(64),
/**
 The file is readable by the group.
*/

        ReadGroup(32),
/**
 The file is writable by the group.
*/

        WriteGroup(16),
/**
 The file is executable by the group.
*/

        ExeGroup(8),
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

        PermissionSpec(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QUrlInfo$PermissionSpec constant with the specified <tt>int</tt>.</brief>
*/

        public static PermissionSpec resolve(int value) {
            return (PermissionSpec) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 256: return ReadOwner;
            case 128: return WriteOwner;
            case 64: return ExeOwner;
            case 32: return ReadGroup;
            case 16: return WriteGroup;
            case 8: return ExeGroup;
            case 4: return ReadOther;
            case 2: return WriteOther;
            case 1: return ExeOther;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an invalid QUrlInfo object with default values. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    public QUrlInfo(){
        super((QPrivateConstructor)null);
        __qt_QUrlInfo();
    }

    native void __qt_QUrlInfo();

/**
Constructs a QUrlInfo object by specifying all the URL's information. <p>The information that is passed is the <tt>name</tt>, file <tt>permissions</tt>, <tt>owner</tt> and <tt>group</tt> and the file's <tt>size</tt>. Also passed is the <tt>lastModified</tt> date/time and the <tt>lastRead</tt> date/time. Flags are also passed, specifically, <tt>isDir</tt>, <tt>isFile</tt>, <tt>isSymLink</tt>, <tt>isWritable</tt>, <tt>isReadable</tt> and <tt>isExecutable</tt>.
*/

    public QUrlInfo(java.lang.String name, int permissions, java.lang.String owner, java.lang.String group, long size, com.trolltech.qt.core.QDateTime lastModified, com.trolltech.qt.core.QDateTime lastRead, boolean isDir, boolean isFile, boolean isSymLink, boolean isWritable, boolean isReadable, boolean isExecutable){
        super((QPrivateConstructor)null);
        __qt_QUrlInfo_String_int_String_String_long_QDateTime_QDateTime_boolean_boolean_boolean_boolean_boolean_boolean(name, permissions, owner, group, size, lastModified == null ? 0 : lastModified.nativeId(), lastRead == null ? 0 : lastRead.nativeId(), isDir, isFile, isSymLink, isWritable, isReadable, isExecutable);
    }

    native void __qt_QUrlInfo_String_int_String_String_long_QDateTime_QDateTime_boolean_boolean_boolean_boolean_boolean_boolean(java.lang.String name, int permissions, java.lang.String owner, java.lang.String group, long size, long lastModified, long lastRead, boolean isDir, boolean isFile, boolean isSymLink, boolean isWritable, boolean isReadable, boolean isExecutable);

/**
Constructs a QUrlInfo object by specifying all the URL's information. <p>The information that is passed is the <tt>url</tt>, file <tt>permissions</tt>, <tt>owner</tt> and <tt>group</tt> and the file's <tt>size</tt>. Also passed is the <tt>lastModified</tt> date/time and the <tt>lastRead</tt> date/time. Flags are also passed, specifically, <tt>isDir</tt>, <tt>isFile</tt>, <tt>isSymLink</tt>, <tt>isWritable</tt>, <tt>isReadable</tt> and <tt>isExecutable</tt>.
*/

    public QUrlInfo(com.trolltech.qt.core.QUrl url, int permissions, java.lang.String owner, java.lang.String group, long size, com.trolltech.qt.core.QDateTime lastModified, com.trolltech.qt.core.QDateTime lastRead, boolean isDir, boolean isFile, boolean isSymLink, boolean isWritable, boolean isReadable, boolean isExecutable){
        super((QPrivateConstructor)null);
        __qt_QUrlInfo_QUrl_int_String_String_long_QDateTime_QDateTime_boolean_boolean_boolean_boolean_boolean_boolean(url == null ? 0 : url.nativeId(), permissions, owner, group, size, lastModified == null ? 0 : lastModified.nativeId(), lastRead == null ? 0 : lastRead.nativeId(), isDir, isFile, isSymLink, isWritable, isReadable, isExecutable);
    }

    native void __qt_QUrlInfo_QUrl_int_String_String_long_QDateTime_QDateTime_boolean_boolean_boolean_boolean_boolean_boolean(long url, int permissions, java.lang.String owner, java.lang.String group, long size, long lastModified, long lastRead, boolean isDir, boolean isFile, boolean isSymLink, boolean isWritable, boolean isReadable, boolean isExecutable);

/**
Copy constructor, copies <tt>ui</tt> to this URL info object.
*/

    public QUrlInfo(com.trolltech.qt.network.QUrlInfo ui){
        super((QPrivateConstructor)null);
        __qt_QUrlInfo_QUrlInfo(ui == null ? 0 : ui.nativeId());
    }

    native void __qt_QUrlInfo_QUrlInfo(long ui);

/**
Returns the group of the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#setGroup(java.lang.String) setGroup()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String group()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_group(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_group(long __this__nativeId);

/**
Returns true if the URL is a directory; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isDir()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isDir(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isDir(long __this__nativeId);

/**
Returns true if the URL is executable; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isExecutable()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isExecutable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isExecutable(long __this__nativeId);

/**
Returns true if the URL is a file; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isFile()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFile(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFile(long __this__nativeId);

/**
Returns true if the URL is readable; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isReadable()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isReadable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isReadable(long __this__nativeId);

/**
Returns true if the URL is a symbolic link; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isSymLink()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSymLink(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSymLink(long __this__nativeId);

/**
Returns true if the URL info is valid; otherwise returns false. Valid means that the QUrlInfo contains real information. <p>You should always check if the URL info is valid before relying on the values.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns true if the URL is writable; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isWritable()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isWritable(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isWritable(long __this__nativeId);

/**
Returns the last modification date of the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#setLastModified(com.trolltech.qt.core.QDateTime) setLastModified()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime lastModified()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastModified(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_lastModified(long __this__nativeId);

/**
Returns the date when the URL was last read. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#setLastRead(com.trolltech.qt.core.QDateTime) setLastRead()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime lastRead()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastRead(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_lastRead(long __this__nativeId);

/**
Returns the file name of the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#setName(java.lang.String) setName()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.network.QUrlInfo i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QUrlInfo(nativeId(), i == null ? 0 : i.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QUrlInfo(long __this__nativeId, long i);

/**
Returns the owner of the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#setOwner(java.lang.String) setOwner()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String owner()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_owner(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_owner(long __this__nativeId);

/**
Returns the permissions of the URL. You can use the <tt>PermissionSpec</tt> flags to test for certain permissions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#setPermissions(int) setPermissions()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int permissions()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_permissions(nativeId());
    }
    @QtBlockedSlot
    native int __qt_permissions(long __this__nativeId);

/**
Specifies that the object the URL refers to was last read at <tt>dt</tt>. <p>If you call this function for an invalid URL info, this function turns it into a valid one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#lastRead() lastRead()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLastRead(com.trolltech.qt.core.QDateTime dt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLastRead_QDateTime(nativeId(), dt == null ? 0 : dt.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLastRead_QDateTime(long __this__nativeId, long dt);

/**
Returns the size of the URL. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#setSize(long) setSize()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long size()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_size(nativeId());
    }
    @QtBlockedSlot
    native long __qt_size(long __this__nativeId);

/**
If <tt>b</tt> is true then the URL is set to be a directory; if <tt>b</tt> is false then the URL is set not to be a directory (which normally means it is a file). (Note that a URL can refer to both a file and a directory even though most file systems do not support this.) <p>If you call this function for an invalid URL info, this function turns it into a valid one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#isDir() isDir()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setDir(boolean b)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDir_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setDir_boolean(long __this__nativeId, boolean b);

/**
If <tt>b</tt> is true then the URL is set to be a file; if \b is false then the URL is set not to be a file (which normally means it is a directory). (Note that a URL can refer to both a file and a directory even though most file systems do not support this.) <p>If you call this function for an invalid URL info, this function turns it into a valid one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#isFile() isFile()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setFile(boolean b)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFile_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setFile_boolean(long __this__nativeId, boolean b);

/**
Specifies that the owning group of the URL is called <tt>s</tt>. <p>If you call this function for an invalid URL info, this function turns it into a valid one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#group() group()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setGroup(java.lang.String s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setGroup_String(nativeId(), s);
    }
    @QtBlockedSlot
    native void __qt_setGroup_String(long __this__nativeId, java.lang.String s);

/**
Specifies that the object the URL refers to was last modified at <tt>dt</tt>. <p>If you call this function for an invalid URL info, this function turns it into a valid one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#lastModified() lastModified()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setLastModified(com.trolltech.qt.core.QDateTime dt)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLastModified_QDateTime(nativeId(), dt == null ? 0 : dt.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setLastModified_QDateTime(long __this__nativeId, long dt);

/**
Sets the name of the URL to <tt>name</tt>. The name is the full text, for example, "http://doc.trolltech.com/qurlinfo.html". <p>If you call this function for an invalid URL info, this function turns it into a valid one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#name() name()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setName(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setName_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setName_String(long __this__nativeId, java.lang.String name);

/**
Specifies that the owner of the URL is called <tt>s</tt>. <p>If you call this function for an invalid URL info, this function turns it into a valid one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#owner() owner()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setOwner(java.lang.String s)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOwner_String(nativeId(), s);
    }
    @QtBlockedSlot
    native void __qt_setOwner_String(long __this__nativeId, java.lang.String s);

/**
Specifies that the URL has access permissions <tt>p</tt>. <p>If you call this function for an invalid URL info, this function turns it into a valid one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#permissions() permissions()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setPermissions(int p)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPermissions_int(nativeId(), p);
    }
    @QtBlockedSlot
    native void __qt_setPermissions_int(long __this__nativeId, int p);

/**
Specifies that the URL is readable if <tt>b</tt> is true and not readable if <tt>b</tt> is false. <p>If you call this function for an invalid URL info, this function turns it into a valid one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#isReadable() isReadable()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setReadable(boolean b)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setReadable_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setReadable_boolean(long __this__nativeId, boolean b);

/**
Specifies the <tt>size</tt> of the URL. <p>If you call this function for an invalid URL info, this function turns it into a valid one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#size() size()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setSize(long size)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSize_long(nativeId(), size);
    }
    @QtBlockedSlot
    native void __qt_setSize_long(long __this__nativeId, long size);

/**
Specifies that the URL refers to a symbolic link if <tt>b</tt> is true and that it does not if <tt>b</tt> is false. <p>If you call this function for an invalid URL info, this function turns it into a valid one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#isSymLink() isSymLink()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setSymLink(boolean b)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSymLink_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setSymLink_boolean(long __this__nativeId, boolean b);

/**
Specifies that the URL is writable if <tt>b</tt> is true and not writable if <tt>b</tt> is false. <p>If you call this function for an invalid URL info, this function turns it into a valid one. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.network.QUrlInfo#isWritable() isWritable()}, and {@link com.trolltech.qt.network.QUrlInfo#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setWritable(boolean b)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWritable_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setWritable_boolean(long __this__nativeId, boolean b);

/**
Returns true if <tt>i1</tt> equals to <tt>i2</tt>; otherwise returns false. The objects are compared by the value, which is specified by <tt>sortBy</tt>. This must be one of {@link com.trolltech.qt.core.QDir.SortFlag QDir::Name }, {@link com.trolltech.qt.core.QDir.SortFlag QDir::Time } or {@link com.trolltech.qt.core.QDir.SortFlag QDir::Size }.
*/

    public static boolean equal(com.trolltech.qt.network.QUrlInfo i1, com.trolltech.qt.network.QUrlInfo i2, int sortBy)    {
        return __qt_equal_QUrlInfo_QUrlInfo_int(i1 == null ? 0 : i1.nativeId(), i2 == null ? 0 : i2.nativeId(), sortBy);
    }
    native static boolean __qt_equal_QUrlInfo_QUrlInfo_int(long i1, long i2, int sortBy);

/**
Returns true if <tt>i1</tt> is greater than <tt>i2</tt>; otherwise returns false. The objects are compared by the value, which is specified by <tt>sortBy</tt>. This must be one of {@link com.trolltech.qt.core.QDir.SortFlag QDir::Name }, {@link com.trolltech.qt.core.QDir.SortFlag QDir::Time } or {@link com.trolltech.qt.core.QDir.SortFlag QDir::Size }.
*/

    public static boolean greaterThan(com.trolltech.qt.network.QUrlInfo i1, com.trolltech.qt.network.QUrlInfo i2, int sortBy)    {
        return __qt_greaterThan_QUrlInfo_QUrlInfo_int(i1 == null ? 0 : i1.nativeId(), i2 == null ? 0 : i2.nativeId(), sortBy);
    }
    native static boolean __qt_greaterThan_QUrlInfo_QUrlInfo_int(long i1, long i2, int sortBy);

/**
Returns true if <tt>i1</tt> is less than <tt>i2</tt>; otherwise returns false. The objects are compared by the value, which is specified by <tt>sortBy</tt>. This must be one of {@link com.trolltech.qt.core.QDir.SortFlag QDir::Name }, {@link com.trolltech.qt.core.QDir.SortFlag QDir::Time } or {@link com.trolltech.qt.core.QDir.SortFlag QDir::Size }.
*/

    public static boolean lessThan(com.trolltech.qt.network.QUrlInfo i1, com.trolltech.qt.network.QUrlInfo i2, int sortBy)    {
        return __qt_lessThan_QUrlInfo_QUrlInfo_int(i1 == null ? 0 : i1.nativeId(), i2 == null ? 0 : i2.nativeId(), sortBy);
    }
    native static boolean __qt_lessThan_QUrlInfo_QUrlInfo_int(long i1, long i2, int sortBy);

/**
@exclude
*/

    public static native QUrlInfo fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QUrlInfo(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QUrlInfo array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.network.QUrlInfo)
        return operator_equal((com.trolltech.qt.network.QUrlInfo) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QUrlInfo clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QUrlInfo __qt_clone(long __this_nativeId);
}
