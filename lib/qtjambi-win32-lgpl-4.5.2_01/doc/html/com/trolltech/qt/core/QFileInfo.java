package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QFileInfo class provides system-independent file information. QFileInfo provides information about a file's name and position (path) in the file system, its access rights and whether it is a directory or symbolic link, etc. The file's size and last modified/read times are also available. QFileInfo can also be used to obtain information about a Qt {@link <a href="../resources.html">resource</a>}. <p>A QFileInfo can point to a file with either a relative or an absolute file path. Absolute file paths begin with the directory separator "/" (or with a drive specification on Windows). Relative file names begin with a directory name or a file name and specify a path relative to the current working directory. An example of an absolute path is the string "/tmp/quartz". A relative path might look like "src/fatlib". You can use the function {@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()} to check whether a QFileInfo is using a relative or an absolute file path. You can call the function {@link com.trolltech.qt.core.QFileInfo#makeAbsolute() makeAbsolute()} to convert a relative QFileInfo's path to an absolute path. <p>The file that the QFileInfo works on is set in the constructor or later with {@link com.trolltech.qt.core.QFileInfo#setFile(com.trolltech.qt.core.QDir, java.lang.String) setFile()}. Use {@link com.trolltech.qt.core.QFileInfo#exists() exists()} to see if the file exists and {@link com.trolltech.qt.core.QFileInfo#size() size()} to get its size. <p>The file's type is obtained with {@link com.trolltech.qt.core.QFileInfo#isFile() isFile()}, {@link com.trolltech.qt.core.QFileInfo#isDir() isDir()} and {@link com.trolltech.qt.core.QFileInfo#isSymLink() isSymLink()}. The {@link com.trolltech.qt.core.QFileInfo#symLinkTarget() symLinkTarget()} function provides the name of the file the symlink points to. <p>On Unix (including Mac OS X), the symlink has the same {@link com.trolltech.qt.core.QFileInfo#size() size()} has the file it points to, because Unix handles symlinks transparently; similarly, opening a symlink using {@link com.trolltech.qt.core.QFile QFile} effectively opens the link's target. For example: <pre class="snippet">
        QFileInfo info1 = new QFileInfo("/home/bob/bin/untabify");
        info1.isSymLink();          // returns true
        info1.absoluteFilePath();   // returns "/home/bob/bin/untabify"
        info1.size();               // returns 56201
        info1.symLinkTarget();      // returns "/opt/pretty++/bin/untabify"

        QFileInfo info2 = new QFileInfo(info1.symLinkTarget());
        info1.isSymLink();          // returns false
        info1.absoluteFilePath();   // returns "/opt/pretty++/bin/untabify"
        info1.size();               // returns 56201
</pre> On Windows, symlinks (shortcuts) are <tt>.lnk</tt> files. The reported {@link com.trolltech.qt.core.QFileInfo#size() size()} is that of the symlink (not the link's target), and opening a symlink using {@link com.trolltech.qt.core.QFile QFile} opens the <tt>.lnk</tt> file. For example: <pre class="snippet">
        QFileInfo info1 = new QFileInfo("C:\\Documents and Settings\\Bob\\untabify.lnk");
        info1.isSymLink();          // returns true
        info1.absoluteFilePath();   // returns "C:/Documents and Settings/Bob/untabify.lnk"
        info1.size();               // returns 743
        info1.symLinkTarget();      // returns "C:/Pretty++/untabify"

        QFileInfo info2 = new QFileInfo(info1.symLinkTarget());
        info1.isSymLink();          // returns false
        info1.absoluteFilePath();   // returns "C:/Pretty++/untabify"
        info1.size();               // returns 63942
</pre> Elements of the file's name can be extracted with {@link com.trolltech.qt.core.QFileInfo#path() path()} and {@link com.trolltech.qt.core.QFileInfo#fileName() fileName()}. The {@link com.trolltech.qt.core.QFileInfo#fileName() fileName()}'s parts can be extracted with {@link com.trolltech.qt.core.QFileInfo#baseName() baseName()}, {@link com.trolltech.qt.core.QFileInfo#suffix() suffix()} or {@link com.trolltech.qt.core.QFileInfo#completeSuffix() completeSuffix()}. QFileInfo objects to directories created by Qt classes will not have a trailing file separator. If you wish to use trailing separators in your own file info objects, just append one to the file name given to the constructors or {@link com.trolltech.qt.core.QFileInfo#setFile(com.trolltech.qt.core.QDir, java.lang.String) setFile()}. <p>The file's dates are returned by {@link com.trolltech.qt.core.QFileInfo#created() created()}, {@link com.trolltech.qt.core.QFileInfo#lastModified() lastModified()} and {@link com.trolltech.qt.core.QFileInfo#lastRead() lastRead()}. Information about the file's access permissions is obtained with {@link com.trolltech.qt.core.QFileInfo#isReadable() isReadable()}, {@link com.trolltech.qt.core.QFileInfo#isWritable() isWritable()} and {@link com.trolltech.qt.core.QFileInfo#isExecutable() isExecutable()}. The file's ownership is available from {@link com.trolltech.qt.core.QFileInfo#owner() owner()}, {@link com.trolltech.qt.core.QFileInfo#ownerId() ownerId()}, {@link com.trolltech.qt.core.QFileInfo#group() group()} and {@link com.trolltech.qt.core.QFileInfo#groupId() groupId()}. You can examine a file's permissions and ownership in a single statement using the {@link com.trolltech.qt.core.QFileInfo#permission(com.trolltech.qt.core.QFile.Permission[]) permission()} function.<a name="performance-issues"><h2>Performance Issues</h2> Some of QFileInfo's functions query the file system, but for performance reasons, some functions only operate on the file name itself. For example: To return the absolute path of a relative file name, {@link com.trolltech.qt.core.QFileInfo#absolutePath() absolutePath()} has to query the file system. The {@link com.trolltech.qt.core.QFileInfo#path() path()} function, however, can work on the file name directly, and so it is faster. <p><b>Note:</b> To speed up performance, QFileInfo caches information about the file. <p>To speed up performance, QFileInfo caches information about the file. Because files can be changed by other users or programs, or even by other parts of the same program, there is a function that refreshes the file information: {@link com.trolltech.qt.core.QFileInfo#refresh() refresh()}. If you want to switch off a QFileInfo's caching and force it to access the file system every time you request information from it call setCaching(false). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir QDir}, and {@link com.trolltech.qt.core.QFile QFile}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFileInfo extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty QFileInfo object. <p>Note that an empty QFileInfo object contain no file reference. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#setFile(com.trolltech.qt.core.QDir, java.lang.String) setFile()}. <br></DD></DT>
*/

    public QFileInfo(){
        super((QPrivateConstructor)null);
        __qt_QFileInfo();
    }

    native void __qt_QFileInfo();

/**
Constructs a new QFileInfo that gives information about the given <tt>file</tt> in the directory <tt>dir</tt>. <p>If <tt>dir</tt> has a relative path, the QFileInfo will also have a relative path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}. <br></DD></DT>
*/

    public QFileInfo(com.trolltech.qt.core.QDir dir, java.lang.String file){
        super((QPrivateConstructor)null);
        __qt_QFileInfo_QDir_String(dir == null ? 0 : dir.nativeId(), file);
    }

    native void __qt_QFileInfo_QDir_String(long dir, java.lang.String file);

/**
Constructs a new QFileInfo that gives information about file <tt>file</tt>. <p>If the <tt>file</tt> has a relative path, the QFileInfo will also have a relative path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}. <br></DD></DT>
*/

    public QFileInfo(com.trolltech.qt.core.QFile file){
        super((QPrivateConstructor)null);
        __qt_QFileInfo_QFile(file == null ? 0 : file.nativeId());
    }

    native void __qt_QFileInfo_QFile(long file);

/**
Constructs a new QFileInfo that is a copy of the given <tt>fileinfo</tt>.
*/

    public QFileInfo(com.trolltech.qt.core.QFileInfo fileinfo){
        super((QPrivateConstructor)null);
        __qt_QFileInfo_QFileInfo(fileinfo == null ? 0 : fileinfo.nativeId());
    }

    native void __qt_QFileInfo_QFileInfo(long fileinfo);

/**
Constructs a new QFileInfo that gives information about the given file. The <tt>file</tt> can also include an absolute or relative path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#setFile(com.trolltech.qt.core.QDir, java.lang.String) setFile()}, {@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}, {@link com.trolltech.qt.core.QDir#setCurrent(java.lang.String) QDir::setCurrent()}, and {@link com.trolltech.qt.core.QDir#isRelativePath(java.lang.String) QDir::isRelativePath()}. <br></DD></DT>
*/

    public QFileInfo(java.lang.String file){
        super((QPrivateConstructor)null);
        __qt_QFileInfo_String(file);
    }

    native void __qt_QFileInfo_String(java.lang.String file);

/**
Returns the file's absolute path as a {@link com.trolltech.qt.core.QDir QDir} object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#dir() dir()}, {@link com.trolltech.qt.core.QFileInfo#filePath() filePath()}, {@link com.trolltech.qt.core.QFileInfo#fileName() fileName()}, and {@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDir absoluteDir()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_absoluteDir(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDir __qt_absoluteDir(long __this__nativeId);

/**
Returns an absolute path including the file name. <p>The absolute path name consists of the full path and the file name. On Unix this will always begin with the root, '/', directory. On Windows this will always begin 'D:/' where D is a drive letter, except for network shares that are not mapped to a drive letter, in which case the path will begin '//sharename/'. QFileInfo will uppercase drive letters. Note that {@link com.trolltech.qt.core.QDir QDir} does not do this. The code snippet below shows this.Error parsing snippet.</pre> This function returns the same as {@link com.trolltech.qt.core.QFileInfo#filePath() filePath()}, unless {@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()} is true. In contrast to {@link com.trolltech.qt.core.QFileInfo#canonicalFilePath() canonicalFilePath()}, symbolic links or redundant "." or ".." elements are not necessarily removed. <p>If the QFileInfo is empty it returns {@link com.trolltech.qt.core.QDir#currentPath() QDir::currentPath()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#filePath() filePath()}, {@link com.trolltech.qt.core.QFileInfo#canonicalFilePath() canonicalFilePath()}, and {@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String absoluteFilePath()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_absoluteFilePath(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_absoluteFilePath(long __this__nativeId);

/**
Returns a file's path absolute path. This doesn't include the file name. <p>On Unix the absolute path will always begin with the root, '/', directory. On Windows this will always begin 'D:/' where D is a drive letter, except for network shares that are not mapped to a drive letter, in which case the path will begin '//sharename/'. <p>This function returns the same as {@link com.trolltech.qt.core.QFileInfo#filePath() filePath()}, unless {@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()} is true. In contrast to {@link com.trolltech.qt.core.QFileInfo#canonicalPath() canonicalPath()} symbolic links or redundant "." or ".." elements are not necessarily removed. <p><b>Warning:</b> If the QFileInfo object was created with an empty QString, the behavior of this function is undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#absoluteFilePath() absoluteFilePath()}, {@link com.trolltech.qt.core.QFileInfo#path() path()}, {@link com.trolltech.qt.core.QFileInfo#canonicalPath() canonicalPath()}, {@link com.trolltech.qt.core.QFileInfo#fileName() fileName()}, and {@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String absolutePath()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_absolutePath(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_absolutePath(long __this__nativeId);

/**
Returns the base name of the file without the path. <p>The base name consists of all characters in the file up to (but not including) the first '.' character. <p>Example: <pre class="snippet">
        QFileInfo fi = new QFileInfo("/tmp/archive.tar.gz");
        String base = fi.baseName();  // base = "archive"
</pre> The base name of a file is computed equally on all platforms, independent of file naming conventions (e.g., ".bashrc" on Unix has an empty base name, and the suffix is "bashrc"). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#fileName() fileName()}, {@link com.trolltech.qt.core.QFileInfo#suffix() suffix()}, {@link com.trolltech.qt.core.QFileInfo#completeSuffix() completeSuffix()}, and {@link com.trolltech.qt.core.QFileInfo#completeBaseName() completeBaseName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String baseName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_baseName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_baseName(long __this__nativeId);

/**
Returns the name of the bundle. <p>On Mac OS X this returns the proper localized name for a bundle if the path {@link com.trolltech.qt.core.QFileInfo#isBundle() isBundle()}. On all other platforms an empty QString is returned. <p>Example: <pre class="snippet">
        QFileInfo fi = new QFileInfo("/Applications/Safari.app");
        String bundle = fi.bundleName();                // name = "Safari"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isBundle() isBundle()}, {@link com.trolltech.qt.core.QFileInfo#filePath() filePath()}, {@link com.trolltech.qt.core.QFileInfo#baseName() baseName()}, and extension(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String bundleName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_bundleName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_bundleName(long __this__nativeId);

/**
Returns true if caching is enabled; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#setCaching(boolean) setCaching()}, and {@link com.trolltech.qt.core.QFileInfo#refresh() refresh()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean caching()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_caching(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_caching(long __this__nativeId);

/**
Returns the canonical path including the file name, i. . an absolute path without symbolic links or redundant "." or ".." elements. <p>If the file does not exist, {@link com.trolltech.qt.core.QFileInfo#canonicalFilePath() canonicalFilePath()} returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#filePath() filePath()}, {@link com.trolltech.qt.core.QFileInfo#absoluteFilePath() absoluteFilePath()}, and {@link com.trolltech.qt.core.QFileInfo#dir() dir()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String canonicalFilePath()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canonicalFilePath(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_canonicalFilePath(long __this__nativeId);

/**
Returns the file's path canonical path (excluding the file name), i. . an absolute path without symbolic links or redundant "." or ".." elements. <p>If the file does not exist, {@link com.trolltech.qt.core.QFileInfo#canonicalPath() canonicalPath()} returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#path() path()}, and {@link com.trolltech.qt.core.QFileInfo#absolutePath() absolutePath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String canonicalPath()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canonicalPath(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_canonicalPath(long __this__nativeId);

/**
Returns the complete base name of the file without the path. <p>The complete base name consists of all characters in the file up to (but not including) the last '.' character. <p>Example: <pre class="snippet">
        QFileInfo fi = new QFileInfo("/tmp/archive.tar.gz");
        String base = fi.completeBaseName();  // base = "archive.tar"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#fileName() fileName()}, {@link com.trolltech.qt.core.QFileInfo#suffix() suffix()}, {@link com.trolltech.qt.core.QFileInfo#completeSuffix() completeSuffix()}, and {@link com.trolltech.qt.core.QFileInfo#baseName() baseName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String completeBaseName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_completeBaseName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_completeBaseName(long __this__nativeId);

/**
Returns the complete suffix of the file. <p>The complete suffix consists of all characters in the file after (but not including) the first '.'. <p>Example: <pre class="snippet">
        QFileInfo fi = new QFileInfo("/tmp/archive.tar.gz");
        String ext = fi.completeSuffix();  // ext = "tar.gz"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#fileName() fileName()}, {@link com.trolltech.qt.core.QFileInfo#suffix() suffix()}, {@link com.trolltech.qt.core.QFileInfo#baseName() baseName()}, and {@link com.trolltech.qt.core.QFileInfo#completeBaseName() completeBaseName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String completeSuffix()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_completeSuffix(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_completeSuffix(long __this__nativeId);

/**
Returns the date and time when the file was created. <p>On most Unix systems, this function returns the time of the last status change. A status change occurs when the file is created, but it also occurs whenever the user writes or sets inode information (for example, changing the file permissions). <p>If neither creation time nor "last status change" time are not available, returns the same as {@link com.trolltech.qt.core.QFileInfo#lastModified() lastModified()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#lastModified() lastModified()}, and {@link com.trolltech.qt.core.QFileInfo#lastRead() lastRead()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime created()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_created(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_created(long __this__nativeId);

/**
Returns the path of the object's parent directory as a {@link com.trolltech.qt.core.QDir QDir} object. <p><b>Note:</b> The {@link com.trolltech.qt.core.QDir QDir} returned always corresponds to the object's parent directory, even if the QFileInfo represents a directory. <p>For each of the follwing, {@link com.trolltech.qt.core.QFileInfo#dir() dir()} returns a {@link com.trolltech.qt.core.QDir QDir} for <tt>"~/examples/191697"</tt>.<br><br>The following code example is written in c++.<br> <pre class="snippet">
    QFileInfo fileInfo1("~/examples/191697/.");
    QFileInfo fileInfo2("~/examples/191697/..");
    QFileInfo fileInfo3("~/examples/191697/main.cpp");
</pre> For each of the follwing, {@link com.trolltech.qt.core.QFileInfo#dir() dir()} returns a {@link com.trolltech.qt.core.QDir QDir} for <tt>"."</tt>.<br><br>The following code example is written in c++.<br> <pre class="snippet">    
    QFileInfo fileInfo4(".");
    QFileInfo fileInfo5("..");
    QFileInfo fileInfo6("main.cpp");
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#absolutePath() absolutePath()}, {@link com.trolltech.qt.core.QFileInfo#filePath() filePath()}, {@link com.trolltech.qt.core.QFileInfo#fileName() fileName()}, {@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}, and {@link com.trolltech.qt.core.QFileInfo#absoluteDir() absoluteDir()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDir dir()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dir(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDir __qt_dir(long __this__nativeId);

/**
Returns true if the file exists; otherwise returns false. <p><b>Note:</b> If the file is a symlink that points to a non existing file, false is returned.
*/

    @QtBlockedSlot
    public final boolean exists()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exists(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_exists(long __this__nativeId);

/**
Returns the name of the file, excluding the path. <p>Example: <pre class="snippet">
        QFileInfo fi = new QFileInfo("/tmp/archive.tar.gz");
        String name = fi.fileName();                // name = "archive.tar.gz"
</pre> Note that, if this QFileInfo object is given a path ending in a slash, the name of the file is considered empty. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}, {@link com.trolltech.qt.core.QFileInfo#filePath() filePath()}, {@link com.trolltech.qt.core.QFileInfo#baseName() baseName()}, and extension(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fileName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fileName(long __this__nativeId);

/**
Returns the file name, including the path (which may be absolute or relative). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#absoluteFilePath() absoluteFilePath()}, {@link com.trolltech.qt.core.QFileInfo#canonicalFilePath() canonicalFilePath()}, and {@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String filePath()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_filePath(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_filePath(long __this__nativeId);

/**
Returns the group of the file. On Windows, on systems where files do not have groups, or if an error occurs, an empty string is returned. <p>This function can be time consuming under Unix (in the order of milliseconds). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#groupId() groupId()}, {@link com.trolltech.qt.core.QFileInfo#owner() owner()}, and {@link com.trolltech.qt.core.QFileInfo#ownerId() ownerId()}. <br></DD></DT>
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
Returns the id of the group the file belongs to. <p>On Windows and on systems where files do not have groups this function always returns (uint) -2. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#group() group()}, {@link com.trolltech.qt.core.QFileInfo#owner() owner()}, and {@link com.trolltech.qt.core.QFileInfo#ownerId() ownerId()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int groupId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_groupId(nativeId());
    }
    @QtBlockedSlot
    native int __qt_groupId(long __this__nativeId);

/**
Returns true if the file path name is absolute, otherwise returns false if the path is relative. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isAbsolute()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isAbsolute(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isAbsolute(long __this__nativeId);

/**
Returns true if this object points to a bundle or to a symbolic link to a bundle on Mac OS X; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isDir() isDir()}, {@link com.trolltech.qt.core.QFileInfo#isSymLink() isSymLink()}, and {@link com.trolltech.qt.core.QFileInfo#isFile() isFile()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isBundle()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isBundle(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isBundle(long __this__nativeId);

/**
Returns true if this object points to a directory or to a symbolic link to a directory; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isFile() isFile()}, {@link com.trolltech.qt.core.QFileInfo#isSymLink() isSymLink()}, and {@link com.trolltech.qt.core.QFileInfo#isBundle() isBundle()}. <br></DD></DT>
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
Returns true if the file is executable; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isReadable() isReadable()}, {@link com.trolltech.qt.core.QFileInfo#isWritable() isWritable()}, and {@link com.trolltech.qt.core.QFileInfo#permission(com.trolltech.qt.core.QFile.Permission[]) permission()}. <br></DD></DT>
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
Returns true if this object points to a file or to a symbolic link to a file. Returns false if the object points to something which isn't a file, such as a directory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isDir() isDir()}, {@link com.trolltech.qt.core.QFileInfo#isSymLink() isSymLink()}, and {@link com.trolltech.qt.core.QFileInfo#isBundle() isBundle()}. <br></DD></DT>
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
Returns true if this is a `hidden' file; otherwise returns false. <p><b>Note:</b> This function returns true for the special entries "." and ".." on Unix, even though QDir::entryList threats them as shown.
*/

    @QtBlockedSlot
    public final boolean isHidden()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isHidden(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isHidden(long __this__nativeId);

/**
Returns true if the user can read the file; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isWritable() isWritable()}, {@link com.trolltech.qt.core.QFileInfo#isExecutable() isExecutable()}, and {@link com.trolltech.qt.core.QFileInfo#permission(com.trolltech.qt.core.QFile.Permission[]) permission()}. <br></DD></DT>
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
Returns true if the file path name is relative, otherwise returns false if the path is absolute (e. . under Unix a path is absolute if it begins with a "/"). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isAbsolute() isAbsolute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isRelative()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRelative(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isRelative(long __this__nativeId);

/**
Returns true if the object points to a directory or to a symbolic link to a directory, and that directory is the root directory; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean isRoot()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRoot(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isRoot(long __this__nativeId);

/**
Returns true if this object points to a symbolic link (or to a shortcut on Windows); otherwise returns false. <p>On Unix (including Mac OS X), opening a symlink effectively opens the {@link com.trolltech.qt.core.QFileInfo#symLinkTarget() link's target}. On Windows, it opens the <tt>.lnk</tt> file itself. <p>Example: <pre class="snippet">
        QFileInfo info = new QFileInfo(fileName);
        if (info.isSymLink())
            fileName = info.symLinkTarget();
</pre> <b>Note:</b> If the symlink points to a non existing file, {@link com.trolltech.qt.core.QFileInfo#exists() exists()} returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isFile() isFile()}, {@link com.trolltech.qt.core.QFileInfo#isDir() isDir()}, and {@link com.trolltech.qt.core.QFileInfo#symLinkTarget() symLinkTarget()}. <br></DD></DT>
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
Returns true if the user can write to the file; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isReadable() isReadable()}, {@link com.trolltech.qt.core.QFileInfo#isExecutable() isExecutable()}, and {@link com.trolltech.qt.core.QFileInfo#permission(com.trolltech.qt.core.QFile.Permission[]) permission()}. <br></DD></DT>
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
Returns the date and time when the file was last modified. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#created() created()}, and {@link com.trolltech.qt.core.QFileInfo#lastRead() lastRead()}. <br></DD></DT>
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
Returns the date and time when the file was last read (accessed). <p>On platforms where this information is not available, returns the same as {@link com.trolltech.qt.core.QFileInfo#lastModified() lastModified()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#created() created()}, and {@link com.trolltech.qt.core.QFileInfo#lastModified() lastModified()}. <br></DD></DT>
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
Converts the file's path to an absolute path if it is not already in that form. Returns true to indicate that the path was converted; otherwise returns false to indicate that the path was already absolute. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#filePath() filePath()}, and {@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean makeAbsolute()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_makeAbsolute(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_makeAbsolute(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.core.QFileInfo fileinfo)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QFileInfo(nativeId(), fileinfo == null ? 0 : fileinfo.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QFileInfo(long __this__nativeId, long fileinfo);

/**
Returns the owner of the file. On systems where files do not have owners, or if an error occurs, an empty string is returned. <p>This function can be time consuming under Unix (in the order of milliseconds). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#ownerId() ownerId()}, {@link com.trolltech.qt.core.QFileInfo#group() group()}, and {@link com.trolltech.qt.core.QFileInfo#groupId() groupId()}. <br></DD></DT>
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
Returns the id of the owner of the file. <p>On Windows and on systems where files do not have owners this function returns ((uint) -2). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#owner() owner()}, {@link com.trolltech.qt.core.QFileInfo#group() group()}, and {@link com.trolltech.qt.core.QFileInfo#groupId() groupId()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int ownerId()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ownerId(nativeId());
    }
    @QtBlockedSlot
    native int __qt_ownerId(long __this__nativeId);

/**
Returns the file's path. This doesn't include the file name. <p>Note that, if this QFileInfo object is given a path ending in a slash, the name of the file is considered empty and this function will return the entire path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#filePath() filePath()}, {@link com.trolltech.qt.core.QFileInfo#absolutePath() absolutePath()}, {@link com.trolltech.qt.core.QFileInfo#canonicalPath() canonicalPath()}, {@link com.trolltech.qt.core.QFileInfo#dir() dir()}, {@link com.trolltech.qt.core.QFileInfo#fileName() fileName()}, and {@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String path()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_path(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_path(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final boolean permission(com.trolltech.qt.core.QFile.Permission ... permissions) {
        return this.permission(new com.trolltech.qt.core.QFile.Permissions(permissions));
    }
/**
Tests for file permissions. The <tt>permissions</tt> argument can be several flags of type QFile::Permissions OR-ed together to check for permission combinations. <p>On systems where files do not have permissions this function always returns true. <p>Example: <pre class="snippet">
        QFileInfo fi = new QFileInfo("/tmp/archive.tar.gz");
        QFile.Permissions permissions1
            = new QFile.Permissions(QFile.Permission.WriteUser, QFile.Permission.ReadGroup);
        if (fi.permission(permissions1))
            System.out.println("I can change the file; my group can read the file");
        QFile.Permissions permissions2
            = new QFile.Permissions(QFile.Permission.WriteGroup, QFile.Permission.WriteOther);
        if (fi.permission(permissions2))
            System.out.println("The group or others can change the file");
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isReadable() isReadable()}, {@link com.trolltech.qt.core.QFileInfo#isWritable() isWritable()}, and {@link com.trolltech.qt.core.QFileInfo#isExecutable() isExecutable()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean permission(com.trolltech.qt.core.QFile.Permissions permissions)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_permission_Permissions(nativeId(), permissions.value());
    }
    @QtBlockedSlot
    native boolean __qt_permission_Permissions(long __this__nativeId, int permissions);

/**
Returns the complete OR-ed together combination of QFile.:Permissions for the file.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QFile.Permissions permissions()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QFile.Permissions(__qt_permissions(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_permissions(long __this__nativeId);

/**
Refreshes the information about the file, i.e. reads in information from the file system the next time a cached property is fetched. <p><b>Note:</b> On Windows CE, there might be a delay for the file system driver to detect changes on the file.
*/

    @QtBlockedSlot
    public final void refresh()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_refresh(nativeId());
    }
    @QtBlockedSlot
    native void __qt_refresh(long __this__nativeId);

/**
If <tt>enable</tt> is true, enables caching of file information. If <tt>enable</tt> is false caching is disabled. <p>When caching is enabled, QFileInfo reads the file information from the file system the first time it's needed, but generally not later. <p>Caching is enabled by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#refresh() refresh()}, and {@link com.trolltech.qt.core.QFileInfo#caching() caching()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCaching(boolean on)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCaching_boolean(nativeId(), on);
    }
    @QtBlockedSlot
    native void __qt_setCaching_boolean(long __this__nativeId, boolean on);

/**
This is an overloaded member function, provided for convenience. <p>Sets the file that the QFileInfo provides information about to <tt>file</tt> in directory <tt>dir</tt>. <p>If <tt>file</tt> includes a relative path, the QFileInfo will also have a relative path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFile(com.trolltech.qt.core.QDir dir, java.lang.String file)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFile_QDir_String(nativeId(), dir == null ? 0 : dir.nativeId(), file);
    }
    @QtBlockedSlot
    native void __qt_setFile_QDir_String(long __this__nativeId, long dir, java.lang.String file);

/**
This is an overloaded member function, provided for convenience. <p>Sets the file that the QFileInfo provides information about to <tt>file</tt>. <p>If <tt>file</tt> includes a relative path, the QFileInfo will also have a relative path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setFile(com.trolltech.qt.core.QFile file)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFile_QFile(nativeId(), file == null ? 0 : file.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setFile_QFile(long __this__nativeId, long file);

/**
Sets the file that the QFileInfo provides information about to <tt>file</tt>. <p>The <tt>file</tt> can also include an absolute or relative file path. Absolute paths begin with the directory separator (e.g. "/" under Unix) or a drive specification (under Windows). Relative file names begin with a directory name or a file name and specify a path relative to the current directory. <p>Example: <pre class="snippet">
    String absolute = "/local/bin";
    String relative = "local/bin";
    QFileInfo absFile = new QFileInfo(absolute);
    QFileInfo relFile = new QFileInfo(relative);

    QDir.setCurrent(QDir.rootPath());
    // absFile and relFile now point to the same file

    QDir.setCurrent("/tmp");
    // absFile now points to "/local/bin",
    // while relFile points to "/tmp/local/bin"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isFile() isFile()}, {@link com.trolltech.qt.core.QFileInfo#isRelative() isRelative()}, {@link com.trolltech.qt.core.QDir#setCurrent(java.lang.String) QDir::setCurrent()}, and {@link com.trolltech.qt.core.QDir#isRelativePath(java.lang.String) QDir::isRelativePath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFile(java.lang.String file)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFile_String(nativeId(), file);
    }
    @QtBlockedSlot
    native void __qt_setFile_String(long __this__nativeId, java.lang.String file);

/**
Returns the file size in bytes. If the file does not exist or cannot be fetched, 0 is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#exists() exists()}. <br></DD></DT>
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
Returns the suffix of the file. <p>The suffix consists of all characters in the file after (but not including) the last '.'. <p>Example: <pre class="snippet">
        QFileInfo fi = new QFileInfo("/tmp/archive.tar.gz");
        String ext = fi.suffix();  // ext = "gz"
</pre> The suffix of a file is computed equally on all platforms, independent of file naming conventions (e.g., ".bashrc" on Unix has an empty base name, and the suffix is "bashrc"). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#fileName() fileName()}, {@link com.trolltech.qt.core.QFileInfo#completeSuffix() completeSuffix()}, {@link com.trolltech.qt.core.QFileInfo#baseName() baseName()}, and {@link com.trolltech.qt.core.QFileInfo#completeBaseName() completeBaseName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String suffix()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_suffix(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_suffix(long __this__nativeId);

/**
Returns the absolute path to the file or directory a symlink (or shortcut on Windows) points to, or a an empty string if the object isn't a symbolic link. <p>This name may not represent an existing file; it is only a string. {@link com.trolltech.qt.core.QFileInfo#exists() QFileInfo::exists()} returns true if the symlink points to an existing file. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#exists() exists()}, {@link com.trolltech.qt.core.QFileInfo#isSymLink() isSymLink()}, {@link com.trolltech.qt.core.QFileInfo#isDir() isDir()}, and {@link com.trolltech.qt.core.QFileInfo#isFile() isFile()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String symLinkTarget()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_symLinkTarget(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_symLinkTarget(long __this__nativeId);

/**
@exclude
*/

    public static native QFileInfo fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFileInfo(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QFileInfo array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QFileInfo)
        return operator_equal((com.trolltech.qt.core.QFileInfo) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QFileInfo clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QFileInfo __qt_clone(long __this_nativeId);
}
