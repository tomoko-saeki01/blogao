package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QDir class provides access to directory structures and their contents. A QDir is used to manipulate path names, access information regarding paths and files, and manipulate the underlying file system. It can also be used to access Qt's {@link <a href="../resources.html">resource system</a>}. <p>Qt uses "/" as a universal directory separator in the same way that "/" is used as a path separator in URLs. If you always use "/" as a directory separator, Qt will translate your paths to conform to the underlying operating system. <p>A QDir can point to a file using either a relative or an absolute path. Absolute paths begin with the directory separator (optionally preceded by a drive specification under Windows). Relative file names begin with a directory name or a file name and specify a path relative to the current directory. <p>Examples of absolute paths: <pre class="snippet">
    new QDir("/home/user/Documents");
    new QDir("C:/Documents and Settings");
</pre> On Windows, the second example above will be translated to <tt>C:\Documents and Settings</tt> when used to access files. <p>Examples of relative paths: <pre class="snippet">
    new QDir("images/landscape.png");
</pre> You can use the {@link com.trolltech.qt.core.QDir#isRelative() isRelative()} or {@link com.trolltech.qt.core.QDir#isAbsolute() isAbsolute()} functions to check if a QDir is using a relative or an absolute file path. Call {@link com.trolltech.qt.core.QDir#makeAbsolute() makeAbsolute()} to convert a relative QDir to an absolute one.<a name="navigation-and-directory-operations"><h2>Navigation and Directory Operations</h2> A directory's path can be obtained with the {@link com.trolltech.qt.core.QDir#path() path()} function, and a new path set with the {@link com.trolltech.qt.core.QDir#setPath(java.lang.String) setPath()} function. The absolute path to a directory is found by calling {@link com.trolltech.qt.core.QDir#absolutePath() absolutePath()}. <p>The name of a directory is found using the {@link com.trolltech.qt.core.QDir#dirName() dirName()} function. This typically returns the last element in the absolute path that specifies the location of the directory. However, it can also return "." if the QDir represents the current directory. <pre class="snippet">
    new QDir("Documents/Letters/Applications").dirName(); // "Applications"
    new QDir().dirName();                                 // "."
</pre> The path for a directory can also be changed with the {@link com.trolltech.qt.core.QDir#cd(java.lang.String) cd()} and {@link com.trolltech.qt.core.QDir#cdUp() cdUp()} functions, both of which operate like familiar shell commands. When {@link com.trolltech.qt.core.QDir#cd(java.lang.String) cd()} is called with the name of an existing directory, the QDir object changes directory so that it represents that directory instead. The {@link com.trolltech.qt.core.QDir#cdUp() cdUp()} function changes the directory of the QDir object so that it refers to its parent directory; i.e. cd("..") is equivalent to {@link com.trolltech.qt.core.QDir#cdUp() cdUp()}. <p>Directories can be created with {@link com.trolltech.qt.core.QDir#mkdir(java.lang.String) mkdir()}, renamed with {@link com.trolltech.qt.core.QDir#rename(java.lang.String, java.lang.String) rename()}, and removed with {@link com.trolltech.qt.core.QDir#rmdir(java.lang.String) rmdir()}. <p>You can test for the presence of a directory with a given name by using {@link com.trolltech.qt.core.QDir#exists() exists()}, and the properties of a directory can be tested with {@link com.trolltech.qt.core.QDir#isReadable() isReadable()}, {@link com.trolltech.qt.core.QDir#isAbsolute() isAbsolute()}, {@link com.trolltech.qt.core.QDir#isRelative() isRelative()}, and {@link com.trolltech.qt.core.QDir#isRoot() isRoot()}. <p>The {@link com.trolltech.qt.core.QDir#refresh() refresh()} function re-reads the directory's data from disk.<a name="files-and-directory-contents"><h2>Files and Directory Contents</h2> Directories contain a number of entries, representing files, directories, and symbolic links. The number of entries in a directory is returned by {@link com.trolltech.qt.core.QDir#count() count()}. A string list of the names of all the entries in a directory can be obtained with {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()}. If you need information about each entry, use {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()} to obtain a list of {@link com.trolltech.qt.core.QFileInfo QFileInfo} objects. <p>Paths to files and directories within a directory can be constructed using {@link com.trolltech.qt.core.QDir#filePath(java.lang.String) filePath()} and {@link com.trolltech.qt.core.QDir#absoluteFilePath(java.lang.String) absoluteFilePath()}. The {@link com.trolltech.qt.core.QDir#filePath(java.lang.String) filePath()} function returns a path to the specified file or directory relative to the path of the QDir object; {@link com.trolltech.qt.core.QDir#absoluteFilePath(java.lang.String) absoluteFilePath()} returns an absolute path to the specified file or directory. Neither of these functions checks for the existence of files or directory; they only construct paths. <pre class="snippet">
    QDir directory = new QDir("Documents/Letters");
    String path = directory.filePath("contents.txt");
    String absolutePath = directory.absoluteFilePath("contents.txt");
</pre> Files can be removed by using the {@link com.trolltech.qt.core.QDir#remove(java.lang.String) remove()} function. Directories cannot be removed in the same way as files; use {@link com.trolltech.qt.core.QDir#rmdir(java.lang.String) rmdir()} to remove them instead. <p>It is possible to reduce the number of entries returned by {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()} and {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()} by applying filters to a QDir object. You can apply a name filter to specify a pattern with wildcards that file names need to match, an attribute filter that selects properties of entries and can distinguish between files and directories, and a sort order. <p>Name filters are lists of strings that are passed to {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()}. Attribute filters consist of a bitwise OR combination of Filters, and these are specified when calling {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}. The sort order is specified using {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()} with a bitwise OR combination of SortFlags. <p>You can test to see if a filename matches a filter using the {@link com.trolltech.qt.core.QDir#match(java.lang.String, java.lang.String) match()} function. <p>Filter and sort order flags may also be specified when calling {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()} and {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()} in order to override previously defined behavior.<a name="the-current-directory-and-other-special-paths"><h2>The Current Directory and Other Special Paths</h2> Access to some common directories is provided with a number of static functions that return QDir objects. There are also corresponding functions for these that return strings: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> QDir</center></th><th><center> QString</center></th><th><center> Return Value</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.QDir#current() current()}</td><td> {@link com.trolltech.qt.core.QDir#currentPath() currentPath()}</td><td> The application's working directory</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QDir#home() home()}</td><td> {@link com.trolltech.qt.core.QDir#homePath() homePath()}</td><td> The user's home directory</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.QDir#root() root()}</td><td> {@link com.trolltech.qt.core.QDir#rootPath() rootPath()}</td><td> The root directory</td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QDir#temp() temp()}</td><td> {@link com.trolltech.qt.core.QDir#tempPath() tempPath()}</td><td> The system's temporary directory</td></tr></table> The {@link com.trolltech.qt.core.QDir#setCurrent(java.lang.String) setCurrent()} static function can also be used to set the application's working directory. <p>If you want to find the directory containing the application's executable, see {@link com.trolltech.qt.core.QCoreApplication#applicationDirPath() QCoreApplication::applicationDirPath()}. <p>The {@link com.trolltech.qt.core.QDir#drives() drives()} static function provides a list of root directories for each device that contains a filing system. On Unix systems this returns a list containing a single root directory "/"; on Windows the list will usually contain <tt>C:/</tt>, and possibly other drive letters such as <tt>D:/</tt>, depending on the configuration of the user's system.<a name="path-manipulation-and-strings"><h2>Path Manipulation and Strings</h2> Paths containing "." elements that reference the current directory at that point in the path, ".." elements that reference the parent directory, and symbolic links can be reduced to a canonical form using the {@link com.trolltech.qt.core.QDir#canonicalPath() canonicalPath()} function. <p>Paths can also be simplified by using {@link com.trolltech.qt.core.QDir#cleanPath(java.lang.String) cleanPath()} to remove redundant "/" and ".." elements. <p>It is sometimes necessary to be able to show a path in the native representation for the user's platform. The static {@link com.trolltech.qt.core.QDir#toNativeSeparators(java.lang.String) toNativeSeparators()} function returns a copy of the specified path in which each directory separator is replaced by the appropriate separator for the underlying operating system.<a name="examples"><h2>Examples</h2> Check if a directory exists: <pre class="snippet">
        QDir dir = new QDir("example");
        if (!dir.exists())
            System.err.println("Cannot find the example directory");
</pre> (We could also use the static convenience function {@link com.trolltech.qt.core.QFile#exists() QFile::exists()}.) <p>Traversing directories and reading a file: <pre class="snippet">
        QDir dir = QDir.root();                 // "/"
        if (!dir.cd("tmp")) {                    // "/tmp"
            System.err.println("Cannot find the \"/tmp\" directory");
        } else {
            QFile file = new QFile(dir.filePath("ex1.txt")); // "/tmp/ex1.txt"
            if (!file.open(QIODevice.OpenModeFlag.ReadWrite))
                System.err.println("Cannot create the file " + file.fileName());
        }
</pre> A program that lists all the files in the current directory (excluding symbolic links), sorted by size, smallest first: <pre class="snippet">

public static void main(String args[])
{
    QDir dir = new QDir();
    dir.setFilter(new QDir.Filters(QDir.Filter.Files, QDir.Filter.Hidden,
                                   QDir.Filter.NoSymLinks));
    dir.setSorting(new QDir.SortFlags(QDir.SortFlag.Size,
                                      QDir.SortFlag.Reversed));

    List&lt;QFileInfo&gt; list = dir.entryInfoList();
    for (QFileInfo fileInfo : list) {
        System.out.println(String.valueOf(fileInfo.size()) + " " +
                           fileInfo.fileName() + "\n");
    }
}
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo QFileInfo}, {@link com.trolltech.qt.core.QFile QFile}, {@link com.trolltech.qt.gui.QFileDialog QFileDialog}, {@link com.trolltech.qt.core.QCoreApplication#applicationDirPath() QApplication::applicationDirPath()}, and {@link <a href="../qtjambi-findfiles.html">Find Files Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDir extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes the filtering options available to {@link com.trolltech.qt.core.QDir QDir}; e.g. for {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()} and {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()}. The filter value is specified by combining values from the following list using the bitwise OR operator: Functions that use Filter enum values to filter lists of files and directories will include symbolic links to files and directories unless you set the {@link com.trolltech.qt.core.QDir.Filter NoSymLinks } value. <p>A default constructed {@link com.trolltech.qt.core.QDir QDir} will not filter out files based on their permissions, so {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()} and {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()} will return all files that are readable, writable, executable, or any combination of the three. This makes the default easy to write, and at the same time useful. <p>For example, setting the <tt>Readable</tt>, <tt>Writable</tt>, and <tt>Files</tt> flags allows all files to be listed for which the application has read access, write access or both. If the <tt>Dirs</tt> and <tt>Drives</tt> flags are also included in this combination then all drives, directories, all files that the application can read, write, or execute, and symlinks to such files/directories can be listed. <p>To retrieve the permissons for a directory, use the {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()} function to get the associated {@link com.trolltech.qt.core.QFileInfo QFileInfo} objects and then use the QFileInfo::permissons() to obtain the permissions and ownership for each file.
*/

    public enum Filter implements com.trolltech.qt.QtEnumerator {
/**
 List directories that match the filters.
*/

        Dirs(1),
/**
 List files.
*/

        Files(2),
/**
 List disk drives (ignored under Unix).
*/

        Drives(4),
/**
 Do not list symbolic links (ignored by operating systems that don't support symbolic links).
*/

        NoSymLinks(8),
/**
 List directories, files, drives and symlinks (this does not list broken symlinks unless you specify System).
*/

        AllEntries(7),
        TypeMask(15),
/**
 List files for which the application has read access. The Readable value needs to be combined with Dirs or Files.
*/

        Readable(16),
/**
 List files for which the application has write access. The Writable value needs to be combined with Dirs or Files.
*/

        Writable(32),
/**
 List files for which the application has execute access. The Executable value needs to be combined with Dirs or Files.
*/

        Executable(64),
        PermissionMask(112),
/**
 Only list files that have been modified (ignored under Unix).
*/

        Modified(128),
/**
 List hidden files (on Unix, files starting with a .).
*/

        Hidden(256),
/**
 List system files (on Unix, FIFOs, sockets and device files)
*/

        System(512),
        AccessMask(1008),
/**
 List all directories; i.e. don't apply the filters to directory names.
*/

        AllDirs(1024),
/**
 The filter should be case sensitive.
*/

        CaseSensitive(2048),
/**
 Do not list the special entries "." and "..".
*/

        NoDotAndDotDot(4096),
        NoFilter(-1);

        Filter(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.QDir$Filters with the specified <tt>com.trolltech.qt.core.QDir$Filter[]</tt> QDir$Filter values set.</brief>
*/

        public static Filters createQFlags(Filter ... values) {
            return new Filters(values);
        }
/**
<brief>Returns the QDir$Filter constant with the specified <tt>int</tt>.</brief>
*/

        public static Filter resolve(int value) {
            return (Filter) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return Dirs;
            case 2: return Files;
            case 4: return Drives;
            case 8: return NoSymLinks;
            case 7: return AllEntries;
            case 15: return TypeMask;
            case 16: return Readable;
            case 32: return Writable;
            case 64: return Executable;
            case 112: return PermissionMask;
            case 128: return Modified;
            case 256: return Hidden;
            case 512: return System;
            case 1008: return AccessMask;
            case 1024: return AllDirs;
            case 2048: return CaseSensitive;
            case 4096: return NoDotAndDotDot;
            case -1: return NoFilter;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class Filters extends com.trolltech.qt.QFlags<Filter> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QDir-Filters with the specified <tt>com.trolltech.qt.core.QDir.Filter[]</tt>. flags set.</brief>
*/

        public Filters(Filter ... args) { super(args); }
        public Filters(int value) { setValue(value); }
    }
/**
This enum describes the sort options available to {@link com.trolltech.qt.core.QDir QDir}, e.g. for {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()} and {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()}. The sort value is specified by OR-ing together values from the following list: You can only specify one of the first four. <p>If you specify both {@link com.trolltech.qt.core.QDir.SortFlag DirsFirst } and Reversed, directories are still put first, but in reverse order; the files will be listed after the directories, again in reverse order.
*/


    public enum SortFlag implements com.trolltech.qt.QtEnumerator {
/**
 Sort by name.
*/

        Name(0),
/**
 Sort by time (modification time).
*/

        Time(1),
/**
 Sort by file size.
*/

        Size(2),
        SortByMask(3),
/**
 Put the directories first, then the files.
*/

        DirsFirst(4),
/**
 Reverse the sort order.
*/

        Reversed(8),
/**
 Sort case-insensitively.
*/

        IgnoreCase(16),
/**
 Put the files first, then the directories.
*/

        DirsLast(32),
/**
 Sort items appropriately using the current locale settings.
*/

        LocaleAware(64),
/**
 Sort by file type (extension).
*/

        Type(128),
/**
 Not sorted by default.
*/

        NoSort(-1);

        SortFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.QDir$SortFlags with the specified <tt>com.trolltech.qt.core.QDir$SortFlag[]</tt> QDir$SortFlag values set.</brief>
*/

        public static SortFlags createQFlags(SortFlag ... values) {
            return new SortFlags(values);
        }
/**
<brief>Returns the QDir$SortFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static SortFlag resolve(int value) {
            return (SortFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Name;
            case 1: return Time;
            case 2: return Size;
            case 3: return SortByMask;
            case 4: return DirsFirst;
            case 8: return Reversed;
            case 16: return IgnoreCase;
            case 32: return DirsLast;
            case 64: return LocaleAware;
            case 128: return Type;
            case -1: return NoSort;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class SortFlags extends com.trolltech.qt.QFlags<SortFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QDir-SortFlags with the specified <tt>com.trolltech.qt.core.QDir.SortFlag[]</tt>. flags set.</brief>
*/

        public SortFlags(SortFlag ... args) { super(args); }
        public SortFlags(int value) { setValue(value); }
    }



/**
Constructs a QDir object that is a copy of the QDir object for directory <tt>dir</tt>. <p><DT><b>See also:</b><br><DD>operator=(). <br></DD></DT>
*/

    public QDir(com.trolltech.qt.core.QDir arg__1){
        super((QPrivateConstructor)null);
        __qt_QDir_QDir(arg__1 == null ? 0 : arg__1.nativeId());
    }

    native void __qt_QDir_QDir(long arg__1);


/**
Constructs a QDir pointing to the given directory <tt>path</tt>. If path is empty the program's working directory, ("."), is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#currentPath() currentPath()}. <br></DD></DT>
*/

    public QDir() {
        this((java.lang.String)null);
    }
/**
Constructs a QDir pointing to the given directory <tt>path</tt>. If path is empty the program's working directory, ("."), is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#currentPath() currentPath()}. <br></DD></DT>
*/

    public QDir(java.lang.String path){
        super((QPrivateConstructor)null);
        __qt_QDir_String(path);
    }

    native void __qt_QDir_String(java.lang.String path);


/**
This is an overloaded method provided for convenience.
*/

    public QDir(java.lang.String path, java.lang.String nameFilter, com.trolltech.qt.core.QDir.SortFlags sort, com.trolltech.qt.core.QDir.Filter ... filter) {
        this(path, nameFilter, sort, new com.trolltech.qt.core.QDir.Filters(filter));
    }

/**
Constructs a QDir with path <tt>path</tt>, that filters its entries by name using <tt>nameFilter</tt> and by attributes using <tt>filters</tt>. It also sorts the names using <tt>sort</tt>. <p>The default <tt>nameFilter</tt> is an empty string, which excludes nothing; the default <tt>filters</tt> is {@link com.trolltech.qt.core.QDir.Filter AllEntries }, which also means exclude nothing. The default <tt>sort</tt> is {@link com.trolltech.qt.core.QDir.SortFlag Name } | {@link com.trolltech.qt.core.QDir.SortFlag IgnoreCase }, i.e. sort by name case-insensitively. <p>If <tt>path</tt> is an empty string, QDir uses "." (the current directory). If <tt>nameFilter</tt> is an empty string, QDir uses the name filter "*" (all files). <p>Note that <tt>path</tt> need not exist. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#exists() exists()}, {@link com.trolltech.qt.core.QDir#setPath(java.lang.String) setPath()}, setNameFilter(), {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, and {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}. <br></DD></DT>
*/

    public QDir(java.lang.String path, java.lang.String nameFilter, com.trolltech.qt.core.QDir.SortFlags sort) {
        this(path, nameFilter, sort, new com.trolltech.qt.core.QDir.Filters(7));
    }

/**
Constructs a QDir with path <tt>path</tt>, that filters its entries by name using <tt>nameFilter</tt> and by attributes using <tt>filters</tt>. It also sorts the names using <tt>sort</tt>. <p>The default <tt>nameFilter</tt> is an empty string, which excludes nothing; the default <tt>filters</tt> is {@link com.trolltech.qt.core.QDir.Filter AllEntries }, which also means exclude nothing. The default <tt>sort</tt> is {@link com.trolltech.qt.core.QDir.SortFlag Name } | {@link com.trolltech.qt.core.QDir.SortFlag IgnoreCase }, i.e. sort by name case-insensitively. <p>If <tt>path</tt> is an empty string, QDir uses "." (the current directory). If <tt>nameFilter</tt> is an empty string, QDir uses the name filter "*" (all files). <p>Note that <tt>path</tt> need not exist. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#exists() exists()}, {@link com.trolltech.qt.core.QDir#setPath(java.lang.String) setPath()}, setNameFilter(), {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, and {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}. <br></DD></DT>
*/

    public QDir(java.lang.String path, java.lang.String nameFilter) {
        this(path, nameFilter, new com.trolltech.qt.core.QDir.SortFlags(SortFlag.Name, SortFlag.IgnoreCase), new com.trolltech.qt.core.QDir.Filters(7));
    }
/**
Constructs a QDir with path <tt>path</tt>, that filters its entries by name using <tt>nameFilter</tt> and by attributes using <tt>filters</tt>. It also sorts the names using <tt>sort</tt>. <p>The default <tt>nameFilter</tt> is an empty string, which excludes nothing; the default <tt>filters</tt> is {@link com.trolltech.qt.core.QDir.Filter AllEntries }, which also means exclude nothing. The default <tt>sort</tt> is {@link com.trolltech.qt.core.QDir.SortFlag Name } | {@link com.trolltech.qt.core.QDir.SortFlag IgnoreCase }, i.e. sort by name case-insensitively. <p>If <tt>path</tt> is an empty string, QDir uses "." (the current directory). If <tt>nameFilter</tt> is an empty string, QDir uses the name filter "*" (all files). <p>Note that <tt>path</tt> need not exist. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#exists() exists()}, {@link com.trolltech.qt.core.QDir#setPath(java.lang.String) setPath()}, setNameFilter(), {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, and {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}. <br></DD></DT>
*/

    public QDir(java.lang.String path, java.lang.String nameFilter, com.trolltech.qt.core.QDir.SortFlags sort, com.trolltech.qt.core.QDir.Filters filter){
        super((QPrivateConstructor)null);
        __qt_QDir_String_String_SortFlags_Filters(path, nameFilter, sort.value(), filter.value());
    }

    native void __qt_QDir_String_String_SortFlags_Filters(java.lang.String path, java.lang.String nameFilter, int sort, int filter);

/**
Returns the absolute path name of a file in the directory. Does not check if the file actually exists in the directory; but see {@link com.trolltech.qt.core.QDir#exists() exists()}. Redundant multiple separators or "." and ".." directories in <tt>fileName</tt> are not removed (see {@link com.trolltech.qt.core.QDir#cleanPath(java.lang.String) cleanPath()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#relativeFilePath(java.lang.String) relativeFilePath()}, {@link com.trolltech.qt.core.QDir#filePath(java.lang.String) filePath()}, and {@link com.trolltech.qt.core.QDir#canonicalPath() canonicalPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String absoluteFilePath(java.lang.String fileName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_absoluteFilePath_String(nativeId(), fileName);
    }
    @QtBlockedSlot
    native java.lang.String __qt_absoluteFilePath_String(long __this__nativeId, java.lang.String fileName);

/**
Returns the absolute path (a path that starts with "/" or with a drive specification), which may contain symbolic links, but never contains redundant ".", ".." or multiple separators. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#setPath(java.lang.String) setPath()}, {@link com.trolltech.qt.core.QDir#canonicalPath() canonicalPath()}, {@link com.trolltech.qt.core.QDir#exists() exists()}, {@link com.trolltech.qt.core.QDir#cleanPath(java.lang.String) cleanPath()}, {@link com.trolltech.qt.core.QDir#dirName() dirName()}, and {@link com.trolltech.qt.core.QDir#absoluteFilePath(java.lang.String) absoluteFilePath()}. <br></DD></DT>
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
Returns the canonical path, i. . a path without symbolic links or redundant "." or ".." elements. <p>On systems that do not have symbolic links this function will always return the same string that {@link com.trolltech.qt.core.QDir#absolutePath() absolutePath()} returns. If the canonical path does not exist (normally due to dangling symbolic links) {@link com.trolltech.qt.core.QDir#canonicalPath() canonicalPath()} returns an empty string. <p>Example: <pre class="snippet">
        String bin = "/local/bin";         // where /local/bin is a symlink to /usr/bin
        QDir binDir = new QDir(bin);
        String canonicalBin = binDir.canonicalPath();
        // canonicalBin now equals "/usr/bin"

        String ls = "/local/bin/ls";       // where ls is the executable "ls"
        QDir lsDir = new QDir(ls);
        String canonicalLs = lsDir.canonicalPath();
        // canonicalLS now equals "/usr/bin/ls".
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#path() path()}, {@link com.trolltech.qt.core.QDir#absolutePath() absolutePath()}, {@link com.trolltech.qt.core.QDir#exists() exists()}, {@link com.trolltech.qt.core.QDir#cleanPath(java.lang.String) cleanPath()}, {@link com.trolltech.qt.core.QDir#dirName() dirName()}, and {@link com.trolltech.qt.core.QDir#absoluteFilePath(java.lang.String) absoluteFilePath()}. <br></DD></DT>
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
Changes the QDir's directory to <tt>dirName</tt>. <p>Returns true if the new directory exists and is readable; otherwise returns false. Note that the logical {@link com.trolltech.qt.core.QDir#cd(java.lang.String) cd()} operation is not performed if the new directory does not exist. <p>Calling cd("..") is equivalent to calling {@link com.trolltech.qt.core.QDir#cdUp() cdUp()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#cdUp() cdUp()}, {@link com.trolltech.qt.core.QDir#isReadable() isReadable()}, {@link com.trolltech.qt.core.QDir#exists() exists()}, and {@link com.trolltech.qt.core.QDir#path() path()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean cd(java.lang.String dirName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cd_String(nativeId(), dirName);
    }
    @QtBlockedSlot
    native boolean __qt_cd_String(long __this__nativeId, java.lang.String dirName);

/**
Changes directory by moving one directory up from the QDir's current directory. <p>Returns true if the new directory exists and is readable; otherwise returns false. Note that the logical {@link com.trolltech.qt.core.QDir#cdUp() cdUp()} operation is not performed if the new directory does not exist. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#cd(java.lang.String) cd()}, {@link com.trolltech.qt.core.QDir#isReadable() isReadable()}, {@link com.trolltech.qt.core.QDir#exists() exists()}, and {@link com.trolltech.qt.core.QDir#path() path()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean cdUp()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cdUp(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_cdUp(long __this__nativeId);

/**
Returns the total number of directories and files in the directory. <p>Equivalent to {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()}.{@link com.trolltech.qt.core.QDir#count() count()}. <p><DT><b>See also:</b><br><DD>operator[](), and {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int count()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
Returns the name of the directory; this is not the same as the path, e. . a directory with the name "mail", might have the path "/var/spool/mail". If the directory has no name (e.g. it is the root directory) an empty string is returned. <p>No check is made to ensure that a directory with this name actually exists; but see {@link com.trolltech.qt.core.QDir#exists() exists()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#path() path()}, {@link com.trolltech.qt.core.QDir#filePath(java.lang.String) filePath()}, {@link com.trolltech.qt.core.QDir#absolutePath() absolutePath()}, and {@link com.trolltech.qt.core.QDir#absoluteFilePath(java.lang.String) absoluteFilePath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String dirName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dirName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_dirName(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QFileInfo> entryInfoList(com.trolltech.qt.core.QDir.Filters filters, com.trolltech.qt.core.QDir.SortFlag ... sort) {
        return this.entryInfoList(filters, new com.trolltech.qt.core.QDir.SortFlags(sort));
    }

/**
This is an overloaded member function, provided for convenience. <p>Returns a list of {@link com.trolltech.qt.core.QFileInfo QFileInfo} objects for all the files and directories in the directory, ordered according to the name and attribute filters previously set with {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()} and {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, and sorted according to the flags set with {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}. <p>The attribute filter and sorting specifications can be overridden using the <tt>filters</tt> and <tt>sort</tt> arguments. <p>Returns an empty list if the directory is unreadable, does not exist, or if nothing matches the specification. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()}, {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()}, {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}, {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, {@link com.trolltech.qt.core.QDir#isReadable() isReadable()}, and {@link com.trolltech.qt.core.QDir#exists() exists()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QFileInfo> entryInfoList(com.trolltech.qt.core.QDir.Filters filters) {
        return entryInfoList(filters, new com.trolltech.qt.core.QDir.SortFlags(-1));
    }

/**
Returns a list of QFileInfo objects for all the files and directories
in the directory, ordered according to the name and attribute filters
previously set with setNameFilters() and setFilter(), and sorted according
to the flags set with setSorting().
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QFileInfo> entryInfoList() {
        return entryInfoList(new com.trolltech.qt.core.QDir.Filters(-1), new com.trolltech.qt.core.QDir.SortFlags(-1));
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns a list of {@link com.trolltech.qt.core.QFileInfo QFileInfo} objects for all the files and directories in the directory, ordered according to the name and attribute filters previously set with {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()} and {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, and sorted according to the flags set with {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}. <p>The attribute filter and sorting specifications can be overridden using the <tt>filters</tt> and <tt>sort</tt> arguments. <p>Returns an empty list if the directory is unreadable, does not exist, or if nothing matches the specification. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()}, {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()}, {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}, {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, {@link com.trolltech.qt.core.QDir#isReadable() isReadable()}, and {@link com.trolltech.qt.core.QDir#exists() exists()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QFileInfo> entryInfoList(com.trolltech.qt.core.QDir.Filters filters, com.trolltech.qt.core.QDir.SortFlags sort)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_entryInfoList_Filters_SortFlags(nativeId(), filters.value(), sort.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QFileInfo> __qt_entryInfoList_Filters_SortFlags(long __this__nativeId, int filters, int sort);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QFileInfo> entryInfoList(java.util.List<java.lang.String> nameFilters, com.trolltech.qt.core.QDir.Filters filters, com.trolltech.qt.core.QDir.SortFlag ... sort) {
        return this.entryInfoList(nameFilters, filters, new com.trolltech.qt.core.QDir.SortFlags(sort));
    }

/**
Returns a list of {@link com.trolltech.qt.core.QFileInfo QFileInfo} objects for all the files and directories in the directory, ordered according to the name and attribute filters previously set with {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()} and {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, and sorted according to the flags set with {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}. <p>The name filter, file attribute filter, and sorting specification can be overridden using the <tt>nameFilters</tt>, <tt>filters</tt>, and <tt>sort</tt> arguments. <p>Returns an empty list if the directory is unreadable, does not exist, or if nothing matches the specification. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()}, {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()}, {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}, {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, {@link com.trolltech.qt.core.QDir#isReadable() isReadable()}, and {@link com.trolltech.qt.core.QDir#exists() exists()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QFileInfo> entryInfoList(java.util.List<java.lang.String> nameFilters, com.trolltech.qt.core.QDir.Filters filters) {
        return entryInfoList(nameFilters, filters, new com.trolltech.qt.core.QDir.SortFlags(-1));
    }

/**
Returns a list of QFileInfo objects for all the files and
directories in the directory, ordered according to the name
and attribute filters previously set with setNameFilters()
and setFilter(), and sorted according to the flags set with
setSorting().

The <tt>nameFilters</tt> is specified as an argument.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QFileInfo> entryInfoList(java.util.List<java.lang.String> nameFilters) {
        return entryInfoList(nameFilters, new com.trolltech.qt.core.QDir.Filters(-1), new com.trolltech.qt.core.QDir.SortFlags(-1));
    }
/**
Returns a list of {@link com.trolltech.qt.core.QFileInfo QFileInfo} objects for all the files and directories in the directory, ordered according to the name and attribute filters previously set with {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()} and {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, and sorted according to the flags set with {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}. <p>The name filter, file attribute filter, and sorting specification can be overridden using the <tt>nameFilters</tt>, <tt>filters</tt>, and <tt>sort</tt> arguments. <p>Returns an empty list if the directory is unreadable, does not exist, or if nothing matches the specification. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()}, {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()}, {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}, {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, {@link com.trolltech.qt.core.QDir#isReadable() isReadable()}, and {@link com.trolltech.qt.core.QDir#exists() exists()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QFileInfo> entryInfoList(java.util.List<java.lang.String> nameFilters, com.trolltech.qt.core.QDir.Filters filters, com.trolltech.qt.core.QDir.SortFlags sort)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_entryInfoList_List_Filters_SortFlags(nativeId(), nameFilters, filters.value(), sort.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QFileInfo> __qt_entryInfoList_List_Filters_SortFlags(long __this__nativeId, java.util.List<java.lang.String> nameFilters, int filters, int sort);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> entryList(com.trolltech.qt.core.QDir.Filters filters, com.trolltech.qt.core.QDir.SortFlag ... sort) {
        return this.entryList(filters, new com.trolltech.qt.core.QDir.SortFlags(sort));
    }

/**
This is an overloaded member function, provided for convenience. <p>Returns a list of the names of all the files and directories in the directory, ordered according to the name and attribute filters previously set with {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()} and {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, and sorted according to the flags set with {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}. <p>The attribute filter and sorting specifications can be overridden using the <tt>filters</tt> and <tt>sort</tt> arguments. <p>Returns an empty list if the directory is unreadable, does not exist, or if nothing matches the specification. <p><b>Note:</b> To list symlinks that point to non existing files, {@link com.trolltech.qt.core.QDir.Filter System } must be passed to the filter. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()}, {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()}, {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}, and {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> entryList(com.trolltech.qt.core.QDir.Filters filters) {
        return entryList(filters, new com.trolltech.qt.core.QDir.SortFlags(-1));
    }

/**
Returns a list of the names of all the files and directories in
the directory, ordered according to the name and attribute filters
previously set with setNameFilters() and setFilter(), and sorted
according to the flags set with setSorting().
<p>
Returns an empty list if the directory is unreadable, does not
exist, or if nothing matches the specification.
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> entryList() {
        return entryList(new com.trolltech.qt.core.QDir.Filters(-1), new com.trolltech.qt.core.QDir.SortFlags(-1));
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns a list of the names of all the files and directories in the directory, ordered according to the name and attribute filters previously set with {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()} and {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, and sorted according to the flags set with {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}. <p>The attribute filter and sorting specifications can be overridden using the <tt>filters</tt> and <tt>sort</tt> arguments. <p>Returns an empty list if the directory is unreadable, does not exist, or if nothing matches the specification. <p><b>Note:</b> To list symlinks that point to non existing files, {@link com.trolltech.qt.core.QDir.Filter System } must be passed to the filter. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()}, {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()}, {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}, and {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> entryList(com.trolltech.qt.core.QDir.Filters filters, com.trolltech.qt.core.QDir.SortFlags sort)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_entryList_Filters_SortFlags(nativeId(), filters.value(), sort.value());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_entryList_Filters_SortFlags(long __this__nativeId, int filters, int sort);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> entryList(java.util.List<java.lang.String> nameFilters, com.trolltech.qt.core.QDir.Filters filters, com.trolltech.qt.core.QDir.SortFlag ... sort) {
        return this.entryList(nameFilters, filters, new com.trolltech.qt.core.QDir.SortFlags(sort));
    }

/**
Returns a list of the names of all the files and directories in the directory, ordered according to the name and attribute filters previously set with {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()} and {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, and sorted according to the flags set with {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}. <p>The name filter, file attribute filter, and sorting specification can be overridden using the <tt>nameFilters</tt>, <tt>filters</tt>, and <tt>sort</tt> arguments. <p>Returns an empty list if the directory is unreadable, does not exist, or if nothing matches the specification. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()}, {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()}, {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}, and {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> entryList(java.util.List<java.lang.String> nameFilters, com.trolltech.qt.core.QDir.Filters filters) {
        return entryList(nameFilters, filters, new com.trolltech.qt.core.QDir.SortFlags(-1));
    }

/**
Returns a list of the names of all the files and
directories in the directory, ordered according to the name
and attribute filters previously set with setNameFilters()
and setFilter(), and sorted according to the flags set with
setSorting().
<p>
The name filter attribute specification
is overridden using the <tt>nameFilters</tt> argument.
<p>
Returns an empty list if the directory is unreadable, does not
exist, or if nothing matches the specification.
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> entryList(java.util.List<java.lang.String> nameFilters) {
        return entryList(nameFilters, new com.trolltech.qt.core.QDir.Filters(-1), new com.trolltech.qt.core.QDir.SortFlags(-1));
    }
/**
Returns a list of the names of all the files and directories in the directory, ordered according to the name and attribute filters previously set with {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()} and {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}, and sorted according to the flags set with {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}. <p>The name filter, file attribute filter, and sorting specification can be overridden using the <tt>nameFilters</tt>, <tt>filters</tt>, and <tt>sort</tt> arguments. <p>Returns an empty list if the directory is unreadable, does not exist, or if nothing matches the specification. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()}, {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()}, {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}, and {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> entryList(java.util.List<java.lang.String> nameFilters, com.trolltech.qt.core.QDir.Filters filters, com.trolltech.qt.core.QDir.SortFlags sort)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_entryList_List_Filters_SortFlags(nativeId(), nameFilters, filters.value(), sort.value());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_entryList_List_Filters_SortFlags(long __this__nativeId, java.util.List<java.lang.String> nameFilters, int filters, int sort);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if the directory exists; otherwise returns false. (If a file with the same name is found this function will return false). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#exists() QFileInfo::exists()}, and {@link com.trolltech.qt.core.QFile#exists() QFile::exists()}. <br></DD></DT>
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
Returns true if the file called <tt>name</tt> exists; otherwise returns false. Unless <tt>name</tt> contains an absolute file path, the file name is assumed to be relative to the current directory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#exists() QFileInfo::exists()}, and {@link com.trolltech.qt.core.QFile#exists() QFile::exists()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean exists(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exists_String(nativeId(), name);
    }
    @QtBlockedSlot
    native boolean __qt_exists_String(long __this__nativeId, java.lang.String name);

/**
Returns the path name of a file in the directory. Does not check if the file actually exists in the directory; but see {@link com.trolltech.qt.core.QDir#exists() exists()}. If the QDir is relative the returned path name will also be relative. Redundant multiple separators or "." and ".." directories in <tt>fileName</tt> are not removed (see {@link com.trolltech.qt.core.QDir#cleanPath(java.lang.String) cleanPath()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#dirName() dirName()}, {@link com.trolltech.qt.core.QDir#absoluteFilePath(java.lang.String) absoluteFilePath()}, {@link com.trolltech.qt.core.QDir#isRelative() isRelative()}, and {@link com.trolltech.qt.core.QDir#canonicalPath() canonicalPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String filePath(java.lang.String fileName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_filePath_String(nativeId(), fileName);
    }
    @QtBlockedSlot
    native java.lang.String __qt_filePath_String(long __this__nativeId, java.lang.String fileName);

/**
Returns the value set by {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDir.Filters filter()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QDir.Filters(__qt_filter(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_filter(long __this__nativeId);

/**
Returns true if the directory's path is absolute; otherwise returns false. See {@link com.trolltech.qt.core.QDir#isAbsolutePath(java.lang.String) isAbsolutePath()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#isRelative() isRelative()}, {@link com.trolltech.qt.core.QDir#makeAbsolute() makeAbsolute()}, and {@link com.trolltech.qt.core.QDir#cleanPath(java.lang.String) cleanPath()}. <br></DD></DT>
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
Returns true if the directory is readable and we can open files by name; otherwise returns false. <p><b>Warning:</b> A false value from this function is not a guarantee that files in the directory are not accessible. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFileInfo#isReadable() QFileInfo::isReadable()}. <br></DD></DT>
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
Returns true if the directory path is relative; otherwise returns false. (Under Unix a path is relative if it does not start with a "/"). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#makeAbsolute() makeAbsolute()}, {@link com.trolltech.qt.core.QDir#isAbsolute() isAbsolute()}, {@link com.trolltech.qt.core.QDir#isAbsolutePath(java.lang.String) isAbsolutePath()}, and {@link com.trolltech.qt.core.QDir#cleanPath(java.lang.String) cleanPath()}. <br></DD></DT>
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
Returns true if the directory is the root directory; otherwise returns false. <p>Note: If the directory is a symbolic link to the root directory this function returns false. If you want to test for this use {@link com.trolltech.qt.core.QDir#canonicalPath() canonicalPath()}, e.g. <pre class="snippet">
        QDir dir = new QDir("/tmp/root_link");
        String dirPath = dir.canonicalPath();
        if (new QDir(dirPath).isRoot())
            System.err.println("It is a root link");
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#root() root()}, and {@link com.trolltech.qt.core.QDir#rootPath() rootPath()}. <br></DD></DT>
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
Converts the directory path to an absolute path. If it is already absolute nothing happens. Returns true if the conversion succeeded; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#isAbsolute() isAbsolute()}, {@link com.trolltech.qt.core.QDir#isAbsolutePath(java.lang.String) isAbsolutePath()}, {@link com.trolltech.qt.core.QDir#isRelative() isRelative()}, and {@link com.trolltech.qt.core.QDir#cleanPath(java.lang.String) cleanPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean makeAbsolute()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_makeAbsolute(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_makeAbsolute(long __this__nativeId);

/**
Creates a sub-directory called <tt>dirName</tt>. <p>Returns true on success; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#rmdir(java.lang.String) rmdir()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean mkdir(java.lang.String dirName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mkdir_String(nativeId(), dirName);
    }
    @QtBlockedSlot
    native boolean __qt_mkdir_String(long __this__nativeId, java.lang.String dirName);

/**
Creates the directory path <tt>dirPath</tt>. <p>The function will create all parent directories necessary to create the directory. <p>Returns true if successful; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#rmpath(java.lang.String) rmpath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean mkpath(java.lang.String dirPath)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mkpath_String(nativeId(), dirPath);
    }
    @QtBlockedSlot
    native boolean __qt_mkpath_String(long __this__nativeId, java.lang.String dirPath);

/**
Returns the string list set by {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> nameFilters()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nameFilters(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_nameFilters(long __this__nativeId);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.core.QDir dir)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QDir(nativeId(), dir == null ? 0 : dir.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QDir(long __this__nativeId, long dir);

    @QtBlockedSlot
    private final java.lang.String operator_subscript(int arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_subscript_int(nativeId(), arg__1);
    }
    @QtBlockedSlot
    native java.lang.String __qt_operator_subscript_int(long __this__nativeId, int arg__1);

/**
Returns the path. This may contain symbolic links, but never contains redundant ".", ".." or multiple separators. <p>The returned path can be either absolute or relative (see {@link com.trolltech.qt.core.QDir#setPath(java.lang.String) setPath()}). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#setPath(java.lang.String) setPath()}, {@link com.trolltech.qt.core.QDir#absolutePath() absolutePath()}, {@link com.trolltech.qt.core.QDir#exists() exists()}, {@link com.trolltech.qt.core.QDir#cleanPath(java.lang.String) cleanPath()}, {@link com.trolltech.qt.core.QDir#dirName() dirName()}, {@link com.trolltech.qt.core.QDir#absoluteFilePath(java.lang.String) absoluteFilePath()}, {@link com.trolltech.qt.core.QDir#toNativeSeparators(java.lang.String) toNativeSeparators()}, and {@link com.trolltech.qt.core.QDir#makeAbsolute() makeAbsolute()}. <br></DD></DT>
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
Refreshes the directory information.
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
Returns the path to <tt>fileName</tt> relative to the directory. <pre class="snippet">
        QDir dir = new QDir("/home/bob");
        String s;

        s = dir.relativeFilePath("images/file.jpg");     // s is "images/file.jpg"
        s = dir.relativeFilePath("/home/mary/file.txt"); // s is "../mary/file.txt"
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#absoluteFilePath(java.lang.String) absoluteFilePath()}, {@link com.trolltech.qt.core.QDir#filePath(java.lang.String) filePath()}, and {@link com.trolltech.qt.core.QDir#canonicalPath() canonicalPath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String relativeFilePath(java.lang.String fileName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_relativeFilePath_String(nativeId(), fileName);
    }
    @QtBlockedSlot
    native java.lang.String __qt_relativeFilePath_String(long __this__nativeId, java.lang.String fileName);

/**
Removes the file, <tt>fileName</tt>. <p>Returns true if the file is removed successfully; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean remove(java.lang.String fileName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_remove_String(nativeId(), fileName);
    }
    @QtBlockedSlot
    native boolean __qt_remove_String(long __this__nativeId, java.lang.String fileName);

/**
Renames a file or directory from <tt>oldName</tt> to <tt>newName</tt>, and returns true if successful; otherwise returns false. <p>On most file systems, {@link com.trolltech.qt.core.QDir#rename(java.lang.String, java.lang.String) rename()} fails only if <tt>oldName</tt> does not exist, if <tt>newName</tt> and <tt>oldName</tt> are not on the same partition or if a file with the new name already exists. However, there are also other reasons why {@link com.trolltech.qt.core.QDir#rename(java.lang.String, java.lang.String) rename()} can fail. For example, on at least one file system {@link com.trolltech.qt.core.QDir#rename(java.lang.String, java.lang.String) rename()} fails if <tt>newName</tt> points to an open file.
*/

    @QtBlockedSlot
    public final boolean rename(java.lang.String oldName, java.lang.String newName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rename_String_String(nativeId(), oldName, newName);
    }
    @QtBlockedSlot
    native boolean __qt_rename_String_String(long __this__nativeId, java.lang.String oldName, java.lang.String newName);

/**
Removes the directory specified by <tt>dirName</tt>. <p>The directory must be empty for {@link com.trolltech.qt.core.QDir#rmdir(java.lang.String) rmdir()} to succeed. <p>Returns true if successful; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#mkdir(java.lang.String) mkdir()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean rmdir(java.lang.String dirName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rmdir_String(nativeId(), dirName);
    }
    @QtBlockedSlot
    native boolean __qt_rmdir_String(long __this__nativeId, java.lang.String dirName);

/**
Removes the directory path <tt>dirPath</tt>. <p>The function will remove all parent directories in <tt>dirPath</tt>, provided that they are empty. This is the opposite of mkpath(dirPath). <p>Returns true if successful; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#mkpath(java.lang.String) mkpath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean rmpath(java.lang.String dirPath)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rmpath_String(nativeId(), dirPath);
    }
    @QtBlockedSlot
    native boolean __qt_rmpath_String(long __this__nativeId, java.lang.String dirPath);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setFilter(com.trolltech.qt.core.QDir.Filter ... filter) {
        this.setFilter(new com.trolltech.qt.core.QDir.Filters(filter));
    }
/**
Sets the filter used by {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()} and {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()} to <tt>filters</tt>. The filter is used to specify the kind of files that should be returned by {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()} and {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()}. See {@link com.trolltech.qt.core.QDir.Filter QDir::Filter }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#filter() filter()}, and {@link com.trolltech.qt.core.QDir#setNameFilters(java.util.List) setNameFilters()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFilter(com.trolltech.qt.core.QDir.Filters filter)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFilter_Filters(nativeId(), filter.value());
    }
    @QtBlockedSlot
    native void __qt_setFilter_Filters(long __this__nativeId, int filter);

/**
Sets the name filters used by {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()} and {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()} to the list of filters specified by <tt>nameFilters</tt>. <p>Each name filter is a wildcard (globbing) filter that understands <tt>*</tt> and <tt>?</tt> wildcards. (See {@link com.trolltech.qt.core.QRegExp QRegExp wildcard matching}.) <p>For example, the following code sets three name filters on a QDir to ensure that only files with extensions typically used for C++ source files are listed: <pre class="snippet">
    List&lt;String&gt; filters = new Vector&lt;String&gt;();
    filters.add("*.cpp");
    filters.add("*.cxx");
    filters.add("*.cc");
    dir.setNameFilters(filters);
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#nameFilters() nameFilters()}, and {@link com.trolltech.qt.core.QDir#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNameFilters(java.util.List<java.lang.String> nameFilters)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNameFilters_List(nativeId(), nameFilters);
    }
    @QtBlockedSlot
    native void __qt_setNameFilters_List(long __this__nativeId, java.util.List<java.lang.String> nameFilters);

/**
Sets the path of the directory to <tt>path</tt>. The path is cleaned of redundant ".", ".." and of multiple separators. No check is made to see whether a directory with this path actually exists; but you can check for yourself using {@link com.trolltech.qt.core.QDir#exists() exists()}. <p>The path can be either absolute or relative. Absolute paths begin with the directory separator "/" (optionally preceded by a drive specification under Windows). Relative file names begin with a directory name or a file name and specify a path relative to the current directory. An example of an absolute path is the string "/tmp/quartz", a relative path might look like "src/fatlib". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#path() path()}, {@link com.trolltech.qt.core.QDir#absolutePath() absolutePath()}, {@link com.trolltech.qt.core.QDir#exists() exists()}, {@link com.trolltech.qt.core.QDir#cleanPath(java.lang.String) cleanPath()}, {@link com.trolltech.qt.core.QDir#dirName() dirName()}, {@link com.trolltech.qt.core.QDir#absoluteFilePath(java.lang.String) absoluteFilePath()}, {@link com.trolltech.qt.core.QDir#isRelative() isRelative()}, and {@link com.trolltech.qt.core.QDir#makeAbsolute() makeAbsolute()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPath(java.lang.String path)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPath_String(nativeId(), path);
    }
    @QtBlockedSlot
    native void __qt_setPath_String(long __this__nativeId, java.lang.String path);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setSorting(com.trolltech.qt.core.QDir.SortFlag ... sort) {
        this.setSorting(new com.trolltech.qt.core.QDir.SortFlags(sort));
    }
/**
Sets the sort order used by {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()} and {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()}. <p>The <tt>sort</tt> is specified by OR-ing values from the enum {@link com.trolltech.qt.core.QDir.SortFlag QDir::SortFlag }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#sorting() sorting()}, and {@link com.trolltech.qt.core.QDir.SortFlag SortFlag }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSorting(com.trolltech.qt.core.QDir.SortFlags sort)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSorting_SortFlags(nativeId(), sort.value());
    }
    @QtBlockedSlot
    native void __qt_setSorting_SortFlags(long __this__nativeId, int sort);

/**
Returns the value set by {@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()} <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#setSorting(com.trolltech.qt.core.QDir.SortFlag[]) setSorting()}, and {@link com.trolltech.qt.core.QDir.SortFlag SortFlag }. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDir.SortFlags sorting()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QDir.SortFlags(__qt_sorting(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_sorting(long __this__nativeId);

/**
Adds <tt>path</tt> to the search path for <tt>prefix</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#setSearchPaths(java.lang.String, java.util.List) setSearchPaths()}. <br></DD></DT>
*/

    public native static void addSearchPath(java.lang.String prefix, java.lang.String path);

/**
Removes all multiple directory separators "/" and resolves any ". s or ".."s found in the path, <tt>path</tt>. <p>Symbolic links are kept. This function does not return the canonical path, but rather the simplest version of the input. For example, "./local" becomes "local", "local/../bin" becomes "bin" and "/local/usr/../bin" becomes "/local/bin". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#absolutePath() absolutePath()}, and {@link com.trolltech.qt.core.QDir#canonicalPath() canonicalPath()}. <br></DD></DT>
*/

    public native static java.lang.String cleanPath(java.lang.String path);

/**
Use {@link com.trolltech.qt.core.QDir#toNativeSeparators(java.lang.String) QDir::toNativeSeparators()} instead.
*/

    public native static java.lang.String convertSeparators(java.lang.String pathName);

/**
Returns the application's current directory. <p>The directory is constructed using the absolute path of the current directory, ensuring that its {@link com.trolltech.qt.core.QDir#path() path()} will be the same as its {@link com.trolltech.qt.core.QDir#absolutePath() absolutePath()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#setCurrent(java.lang.String) setCurrent()}, {@link com.trolltech.qt.core.QDir#currentPath() currentPath()}, {@link com.trolltech.qt.core.QDir#home() home()}, {@link com.trolltech.qt.core.QDir#root() root()}, and {@link com.trolltech.qt.core.QDir#temp() temp()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QDir current();

/**
Returns the absolute path of the application's current directory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#current() current()}, {@link com.trolltech.qt.core.QDir#homePath() homePath()}, {@link com.trolltech.qt.core.QDir#rootPath() rootPath()}, and {@link com.trolltech.qt.core.QDir#tempPath() tempPath()}. <br></DD></DT>
*/

    public native static java.lang.String currentPath();

/**
Returns a list of the root directories on this system. <p>On Windows this returns a list of {@link com.trolltech.qt.core.QFileInfo QFileInfo} objects containing "C:/", "D:/", etc. On other operating systems, it returns a list containing just one root directory (i.e. "/"). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#root() root()}, and {@link com.trolltech.qt.core.QDir#rootPath() rootPath()}. <br></DD></DT>
*/

    public native static java.util.List<com.trolltech.qt.core.QFileInfo> drives();

/**
Returns <tt>pathName</tt> using '/' as file separator. On Windows, for instance, fromNativeSeparators("<tt>c:\\winnt\\system32</tt>") returns "c:/winnt/system32". <p>The returned string may be the same as the argument on some operating systems, for example on Unix. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#toNativeSeparators(java.lang.String) toNativeSeparators()}, and {@link com.trolltech.qt.core.QDir#separator() separator()}. <br></DD></DT>
*/

    public native static java.lang.String fromNativeSeparators(java.lang.String pathName);

/**
Returns the user's home directory. <p>The directory is constructed using the absolute path of the home directory, ensuring that its {@link com.trolltech.qt.core.QDir#path() path()} will be the same as its {@link com.trolltech.qt.core.QDir#absolutePath() absolutePath()}. <p>See {@link com.trolltech.qt.core.QDir#homePath() homePath()} for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#drives() drives()}, {@link com.trolltech.qt.core.QDir#current() current()}, {@link com.trolltech.qt.core.QDir#root() root()}, and {@link com.trolltech.qt.core.QDir#temp() temp()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QDir home();

/**
Returns the absolute path of the user's home directory. <p>Under Windows this function will return the directory of the current user's profile. Typically, this is: <pre class="snippet">
        C:/Documents and Settings/Username
</pre> Use the {@link com.trolltech.qt.core.QDir#toNativeSeparators(java.lang.String) toNativeSeparators()} function to convert the separators to the ones that are appropriate for the underlying operating system. <p>If the directory of the current user's profile does not exist or cannot be retrieved, the following alternatives will be checked (in the given order) until an existing and available path is found: <ol><li> The path specified by the <tt>USERPROFILE</tt> environment variable.</li><li> The path formed by concatenating the <tt>HOMEDRIVE</tt> and <tt>HOMEPATH</tt> environment variables.</li><li> The path specified by the <tt>HOME</tt> environment variable.</li><li> The path returned by the {@link com.trolltech.qt.core.QDir#rootPath() rootPath()} function (which uses the <tt>SystemDrive</tt> environment variable)</li><li> The <tt>C:/</tt> directory.</li></ol> Under non-Windows operating systems the <tt>HOME</tt> environment variable is used if it exists, otherwise the path returned by the {@link com.trolltech.qt.core.QDir#rootPath() rootPath()} function is used. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#home() home()}, {@link com.trolltech.qt.core.QDir#currentPath() currentPath()}, {@link com.trolltech.qt.core.QDir#rootPath() rootPath()}, and {@link com.trolltech.qt.core.QDir#tempPath() tempPath()}. <br></DD></DT>
*/

    public native static java.lang.String homePath();

/**
Returns true if <tt>path</tt> is absolute; returns false if it is relative. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#isAbsolute() isAbsolute()}, {@link com.trolltech.qt.core.QDir#isRelativePath(java.lang.String) isRelativePath()}, {@link com.trolltech.qt.core.QDir#makeAbsolute() makeAbsolute()}, and {@link com.trolltech.qt.core.QDir#cleanPath(java.lang.String) cleanPath()}. <br></DD></DT>
*/

    public native static boolean isAbsolutePath(java.lang.String path);

/**
Returns true if <tt>path</tt> is relative; returns false if it is absolute. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#isRelative() isRelative()}, {@link com.trolltech.qt.core.QDir#isAbsolutePath(java.lang.String) isAbsolutePath()}, and {@link com.trolltech.qt.core.QDir#makeAbsolute() makeAbsolute()}. <br></DD></DT>
*/

    public native static boolean isRelativePath(java.lang.String path);

/**
Returns true if the <tt>fileName</tt> matches the wildcard (glob) pattern <tt>filter</tt>; otherwise returns false. The <tt>filter</tt> may contain multiple patterns separated by spaces or semicolons. The matching is case insensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp QRegExp wildcard matching}, {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) QRegExp::exactMatch()}, {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()}, and {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()}. <br></DD></DT>
*/

    public native static boolean match(java.lang.String filter, java.lang.String fileName);

/**
This is an overloaded member function, provided for convenience. <p>Returns true if the <tt>fileName</tt> matches any of the wildcard (glob) patterns in the list of <tt>filters</tt>; otherwise returns false. The matching is case insensitive. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp QRegExp wildcard matching}, {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) QRegExp::exactMatch()}, {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryList()}, and {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) entryInfoList()}. <br></DD></DT>
*/

    public native static boolean match(java.util.List<java.lang.String> filters, java.lang.String fileName);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public native static java.util.List<java.lang.String> nameFiltersFromString(java.lang.String nameFilter);

/**
Returns the root directory. <p>The directory is constructed using the absolute path of the root directory, ensuring that its {@link com.trolltech.qt.core.QDir#path() path()} will be the same as its {@link com.trolltech.qt.core.QDir#absolutePath() absolutePath()}. <p>See {@link com.trolltech.qt.core.QDir#rootPath() rootPath()} for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#drives() drives()}, {@link com.trolltech.qt.core.QDir#current() current()}, {@link com.trolltech.qt.core.QDir#home() home()}, and {@link com.trolltech.qt.core.QDir#temp() temp()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QDir root();

/**
Returns the absolute path of the root directory. <p>For Unix operating systems this returns "/". For Windows file systems this normally returns "c:/". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#root() root()}, {@link com.trolltech.qt.core.QDir#drives() drives()}, {@link com.trolltech.qt.core.QDir#currentPath() currentPath()}, {@link com.trolltech.qt.core.QDir#homePath() homePath()}, and {@link com.trolltech.qt.core.QDir#tempPath() tempPath()}. <br></DD></DT>
*/

    public native static java.lang.String rootPath();

/**
Returns the search paths for <tt>prefix</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#setSearchPaths(java.lang.String, java.util.List) setSearchPaths()}, and {@link com.trolltech.qt.core.QDir#addSearchPath(java.lang.String, java.lang.String) addSearchPath()}. <br></DD></DT>
*/

    public native static java.util.List<java.lang.String> searchPaths(java.lang.String prefix);

/**
Returns the native directory separator. "/" under Unix (including Mac OS X) and "\" under Windows. <p>You do not need to use this function to build file paths. If you always use "/", Qt will translate your paths to conform to the underlying operating system. If you want to display paths to the user using their operating system's separator use {@link com.trolltech.qt.core.QDir#toNativeSeparators(java.lang.String) toNativeSeparators()}.
*/

    public native static char separator();

/**
Sets the application's current working directory to <tt>path</tt>. Returns true if the directory was successfully changed; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#current() current()}, {@link com.trolltech.qt.core.QDir#currentPath() currentPath()}, {@link com.trolltech.qt.core.QDir#home() home()}, {@link com.trolltech.qt.core.QDir#root() root()}, and {@link com.trolltech.qt.core.QDir#temp() temp()}. <br></DD></DT>
*/

    public native static boolean setCurrent(java.lang.String path);

/**
Sets or replaces Qt's search paths for file names with the prefix <tt>prefix</tt> to <tt>searchPaths</tt>. <p>To specify a prefix for a file name, prepend the prefix followed by a single colon (e.g., "images:undo.png", "xmldocs:books.xml"). <tt>prefix</tt> can only contain letters or numbers (e.g., it cannot contain a colon, nor a slash). <p>Qt uses this search path to locate files with a known prefix. The search path entries are tested in order, starting with the first entry. <pre class="snippet">
        List&lt;String&gt; imagesSearchPaths = new Vector&lt;String&gt;();
        imagesSearchPaths.add(QDir.homePath() + "/images");

        List&lt;String&gt; docSearchPaths = new Vector&lt;String&gt;();
        docSearchPaths.add(":/embeddedDocuments");

        QDir.setSearchPaths("icons", imagesSearchPaths);
        QDir.setSearchPaths("docs", docSearchPaths);
        //...
        QPixmap pixmap = new QPixmap("icons:undo.png"); // will look for undo.png in QDir.homePath() + "/images"
        QFile file = new QFile("docs:design.odf"); // will look in the :/embeddedDocuments resource path
</pre> File name prefix must be at least 2 characters long to avoid conflicts with Windows drive letters. <p>Search paths may contain paths to {@link <a href="../resources.html">The Qt Resource System</a>}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#searchPaths(java.lang.String) searchPaths()}. <br></DD></DT>
*/

    public native static void setSearchPaths(java.lang.String prefix, java.util.List<java.lang.String> searchPaths);

/**
Returns the system's temporary directory. <p>The directory is constructed using the absolute path of the temporary directory, ensuring that its {@link com.trolltech.qt.core.QDir#path() path()} will be the same as its {@link com.trolltech.qt.core.QDir#absolutePath() absolutePath()}. <p>See {@link com.trolltech.qt.core.QDir#tempPath() tempPath()} for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#drives() drives()}, {@link com.trolltech.qt.core.QDir#current() current()}, {@link com.trolltech.qt.core.QDir#home() home()}, and {@link com.trolltech.qt.core.QDir#root() root()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QDir temp();

/**
Returns the absolute path of the system's temporary directory. <p>On Unix/Linux systems this is usually <tt>/tmp</tt>; on Windows this is usually the path in the <tt>TEMP</tt> or <tt>TMP</tt> environment variable. Whether a directory separator is added to the end or not, depends on the operating system. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#temp() temp()}, {@link com.trolltech.qt.core.QDir#currentPath() currentPath()}, {@link com.trolltech.qt.core.QDir#homePath() homePath()}, and {@link com.trolltech.qt.core.QDir#rootPath() rootPath()}. <br></DD></DT>
*/

    public native static java.lang.String tempPath();

/**
Returns <tt>pathName</tt> with the '/' separators converted to separators that are appropriate for the underlying operating system. <p>On Windows, toNativeSeparators("c:/winnt/system32") returns "c:\winnt\system32". <p>The returned string may be the same as the argument on some operating systems, for example on Unix. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#fromNativeSeparators(java.lang.String) fromNativeSeparators()}, and {@link com.trolltech.qt.core.QDir#separator() separator()}. <br></DD></DT>
*/

    public native static java.lang.String toNativeSeparators(java.lang.String pathName);

/**
@exclude
*/

    public static native QDir fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDir(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QDir array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QDir)
        return operator_equal((com.trolltech.qt.core.QDir) other);
        return false;
    }


/**
Returns the file name at position <tt>i</tt> in the list of file
names.  Returns an empty string if pos is out of range or if the
entryList() function failed.
*/

    @com.trolltech.qt.QtBlockedSlot
    public String at(int i) {
        return operator_subscript(i);
    }


/**
<brief>Returns a string representation of the <tt>this QDir</tt>. </brief>
*/

    @Override
    public String toString() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString(nativeId());
    }
    native String __qt_toString(long __this_nativeId);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QDir clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QDir __qt_clone(long __this_nativeId);
}
