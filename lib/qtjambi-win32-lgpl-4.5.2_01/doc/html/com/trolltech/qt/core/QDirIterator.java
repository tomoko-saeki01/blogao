package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QDirIterator class provides an iterator for directory entrylists. You can use QDirIterator to navigate entries of a directory one at a time. It is similar to {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryList()} and {@link com.trolltech.qt.core.QDir#entryInfoList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryInfoList()}, but because it lists entries one at a time instead of all at once, it scales better and is more suitable for large directories. It also supports listing directory contents recursively, and following symbolic links. Unlike {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryList()}, QDirIterator does not support sorting. <p>The QDirIterator constructor takes a {@link com.trolltech.qt.core.QDir QDir} or a directory as argument. After construction, the iterator is located before the first directory entry. Here's how to iterate over all the entries sequentially: <pre class="snippet">
        QDirIterator it = new QDirIterator("/etc",
            new QDirIterator.IteratorFlags(QDirIterator.IteratorFlag.Subdirectories));
        while (it.hasNext()) {
            System.out.println(it.next());

            // /etc/.
            // /etc/..
            // /etc/X11
            // /etc/X11/fs
            // ...
        }
</pre> The {@link com.trolltech.qt.core.QDirIterator#next() next()} function returns the path to the next directory entry and advances the iterator. You can also call {@link com.trolltech.qt.core.QDirIterator#filePath() filePath()} to get the current file path without advancing the iterator. The {@link com.trolltech.qt.core.QDirIterator#fileName() fileName()} function returns only the name of the file, similar to how {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryList()} works. You can also call {@link com.trolltech.qt.core.QDirIterator#fileInfo() fileInfo()} to get a {@link com.trolltech.qt.core.QFileInfo QFileInfo} for the current entry. <p>Unlike Qt's container iterators, QDirIterator is uni-directional (i.e., you cannot iterate directories in reverse order) and does not allow random access. <p>QDirIterator works with all supported file engines, and is implemented using {@link com.trolltech.qt.core.QAbstractFileEngineIterator QAbstractFileEngineIterator}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir QDir}, {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryList()}, and {@link com.trolltech.qt.core.QAbstractFileEngineIterator QAbstractFileEngineIterator}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDirIterator extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
This enum describes flags that you can combine to configure the behavior of {@link com.trolltech.qt.core.QDirIterator QDirIterator}.
*/

    public enum IteratorFlag implements com.trolltech.qt.QtEnumerator {
/**
 The default value, representing no flags. The iterator will return entries for the assigned path.
*/

        NoIteratorFlags(0),
/**
 When combined with Subdirectories, this flag enables iterating through all subdirectories of the assigned path, following all symbolic links. Symbolic link loops (e.g., "link" =&gt; "." or "link" =&gt; "..") are automatically detected and ignored.
*/

        FollowSymlinks(1),
/**
 List entries inside all subdirectories as well.
*/

        Subdirectories(2);

        IteratorFlag(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.QDirIterator$IteratorFlags with the specified <tt>com.trolltech.qt.core.QDirIterator$IteratorFlag[]</tt> QDirIterator$IteratorFlag values set.</brief>
*/

        public static IteratorFlags createQFlags(IteratorFlag ... values) {
            return new IteratorFlags(values);
        }
/**
<brief>Returns the QDirIterator$IteratorFlag constant with the specified <tt>int</tt>.</brief>
*/

        public static IteratorFlag resolve(int value) {
            return (IteratorFlag) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return NoIteratorFlags;
            case 1: return FollowSymlinks;
            case 2: return Subdirectories;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class IteratorFlags extends com.trolltech.qt.QFlags<IteratorFlag> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QDirIterator-IteratorFlags with the specified <tt>com.trolltech.qt.core.QDirIterator.IteratorFlag[]</tt>. flags set.</brief>
*/

        public IteratorFlags(IteratorFlag ... args) { super(args); }
        public IteratorFlags(int value) { setValue(value); }
    }




/**
This is an overloaded method provided for convenience.
*/

    public QDirIterator(com.trolltech.qt.core.QDir dir, com.trolltech.qt.core.QDirIterator.IteratorFlag ... flags) {
        this(dir, new com.trolltech.qt.core.QDirIterator.IteratorFlags(flags));
    }

/**
Constructs a QDirIterator that can iterate over <tt>dir</tt>'s entrylist, using <tt>dir</tt>'s name filters and regular filters. You can pass options via <tt>flags</tt> to decide how the directory should be iterated. <p>By default, <tt>flags</tt> is {@link com.trolltech.qt.core.QDirIterator.IteratorFlag NoIteratorFlags }, which provides the same behavior as in {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryList()}. <p>The sorting in <tt>dir</tt> is ignored. <p><b>Note:</b> To list symlinks that point to non existing files, {@link com.trolltech.qt.core.QDir.Filter QDir::System } must be passed to the flags. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#hasNext() hasNext()}, {@link com.trolltech.qt.core.QDirIterator#next() next()}, and IteratorFlags. <br></DD></DT>
*/

    public QDirIterator(com.trolltech.qt.core.QDir dir) {
        this(dir, new com.trolltech.qt.core.QDirIterator.IteratorFlags(0));
    }
/**
Constructs a QDirIterator that can iterate over <tt>dir</tt>'s entrylist, using <tt>dir</tt>'s name filters and regular filters. You can pass options via <tt>flags</tt> to decide how the directory should be iterated. <p>By default, <tt>flags</tt> is {@link com.trolltech.qt.core.QDirIterator.IteratorFlag NoIteratorFlags }, which provides the same behavior as in {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryList()}. <p>The sorting in <tt>dir</tt> is ignored. <p><b>Note:</b> To list symlinks that point to non existing files, {@link com.trolltech.qt.core.QDir.Filter QDir::System } must be passed to the flags. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#hasNext() hasNext()}, {@link com.trolltech.qt.core.QDirIterator#next() next()}, and IteratorFlags. <br></DD></DT>
*/

    public QDirIterator(com.trolltech.qt.core.QDir dir, com.trolltech.qt.core.QDirIterator.IteratorFlags flags){
        super((QPrivateConstructor)null);
        __qt_QDirIterator_QDir_IteratorFlags(dir == null ? 0 : dir.nativeId(), flags.value());
    }

    native void __qt_QDirIterator_QDir_IteratorFlags(long dir, int flags);


/**
This is an overloaded method provided for convenience.
*/

    public QDirIterator(java.lang.String path, com.trolltech.qt.core.QDir.Filters filter, com.trolltech.qt.core.QDirIterator.IteratorFlag ... flags) {
        this(path, filter, new com.trolltech.qt.core.QDirIterator.IteratorFlags(flags));
    }

/**
Constructs a QDirIterator that can iterate over <tt>path</tt>, with no name filtering and <tt>filters</tt> for entry filtering. You can pass options via <tt>flags</tt> to decide how the directory should be iterated. <p>By default, <tt>filters</tt> is {@link com.trolltech.qt.core.QDir.Filter QDir::NoFilter }, and <tt>flags</tt> is {@link com.trolltech.qt.core.QDirIterator.IteratorFlag NoIteratorFlags }, which provides the same behavior as in {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryList()}. <p><b>Note:</b> To list symlinks that point to non existing files, {@link com.trolltech.qt.core.QDir.Filter QDir::System } must be passed to the flags. <p><b>Warning:</b> This constructor expects <tt>flags</tt> to be left at its default value. Use the constructors that do not take the <tt>filters</tt> argument instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#hasNext() hasNext()}, {@link com.trolltech.qt.core.QDirIterator#next() next()}, and IteratorFlags. <br></DD></DT>
*/

    public QDirIterator(java.lang.String path, com.trolltech.qt.core.QDir.Filters filter) {
        this(path, filter, new com.trolltech.qt.core.QDirIterator.IteratorFlags(0));
    }
/**
Constructs a QDirIterator that can iterate over <tt>path</tt>, with no name filtering and <tt>filters</tt> for entry filtering. You can pass options via <tt>flags</tt> to decide how the directory should be iterated. <p>By default, <tt>filters</tt> is {@link com.trolltech.qt.core.QDir.Filter QDir::NoFilter }, and <tt>flags</tt> is {@link com.trolltech.qt.core.QDirIterator.IteratorFlag NoIteratorFlags }, which provides the same behavior as in {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryList()}. <p><b>Note:</b> To list symlinks that point to non existing files, {@link com.trolltech.qt.core.QDir.Filter QDir::System } must be passed to the flags. <p><b>Warning:</b> This constructor expects <tt>flags</tt> to be left at its default value. Use the constructors that do not take the <tt>filters</tt> argument instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#hasNext() hasNext()}, {@link com.trolltech.qt.core.QDirIterator#next() next()}, and IteratorFlags. <br></DD></DT>
*/

    public QDirIterator(java.lang.String path, com.trolltech.qt.core.QDir.Filters filter, com.trolltech.qt.core.QDirIterator.IteratorFlags flags){
        super((QPrivateConstructor)null);
        __qt_QDirIterator_String_Filters_IteratorFlags(path, filter.value(), flags.value());
    }

    native void __qt_QDirIterator_String_Filters_IteratorFlags(java.lang.String path, int filter, int flags);


/**
This is an overloaded method provided for convenience.
*/

    public QDirIterator(java.lang.String path, com.trolltech.qt.core.QDirIterator.IteratorFlag ... flags) {
        this(path, new com.trolltech.qt.core.QDirIterator.IteratorFlags(flags));
    }

/**
Constructs a QDirIterator that can iterate over <tt>path</tt>. You can pass options via <tt>flags</tt> to decide how the directory should be iterated. <p>By default, <tt>flags</tt> is {@link com.trolltech.qt.core.QDirIterator.IteratorFlag NoIteratorFlags }, which provides the same behavior as in {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryList()}. <p><b>Note:</b> To list symlinks that point to non existing files, {@link com.trolltech.qt.core.QDir.Filter QDir::System } must be passed to the flags. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#hasNext() hasNext()}, {@link com.trolltech.qt.core.QDirIterator#next() next()}, and IteratorFlags. <br></DD></DT>
*/

    public QDirIterator(java.lang.String path) {
        this(path, new com.trolltech.qt.core.QDirIterator.IteratorFlags(0));
    }
/**
Constructs a QDirIterator that can iterate over <tt>path</tt>. You can pass options via <tt>flags</tt> to decide how the directory should be iterated. <p>By default, <tt>flags</tt> is {@link com.trolltech.qt.core.QDirIterator.IteratorFlag NoIteratorFlags }, which provides the same behavior as in {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryList()}. <p><b>Note:</b> To list symlinks that point to non existing files, {@link com.trolltech.qt.core.QDir.Filter QDir::System } must be passed to the flags. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#hasNext() hasNext()}, {@link com.trolltech.qt.core.QDirIterator#next() next()}, and IteratorFlags. <br></DD></DT>
*/

    public QDirIterator(java.lang.String path, com.trolltech.qt.core.QDirIterator.IteratorFlags flags){
        super((QPrivateConstructor)null);
        __qt_QDirIterator_String_IteratorFlags(path, flags.value());
    }

    native void __qt_QDirIterator_String_IteratorFlags(java.lang.String path, int flags);


/**
This is an overloaded method provided for convenience.
*/

    public QDirIterator(java.lang.String path, java.util.List<java.lang.String> nameFilters, com.trolltech.qt.core.QDir.Filters filters, com.trolltech.qt.core.QDirIterator.IteratorFlag ... flags) {
        this(path, nameFilters, filters, new com.trolltech.qt.core.QDirIterator.IteratorFlags(flags));
    }

/**
Constructs a QDirIterator that can iterate over <tt>path</tt>, using <tt>nameFilters</tt> and <tt>filters</tt>. You can pass options via <tt>flags</tt> to decide how the directory should be iterated. <p>By default, <tt>flags</tt> is {@link com.trolltech.qt.core.QDirIterator.IteratorFlag NoIteratorFlags }, which provides the same behavior as {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryList()}. <p><b>Note:</b> To list symlinks that point to non existing files, {@link com.trolltech.qt.core.QDir.Filter QDir::System } must be passed to the flags. <p><b>Warning:</b> This constructor expects <tt>flags</tt> to be left at its default value. Use the constructors that do not take the <tt>filters</tt> argument instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#hasNext() hasNext()}, {@link com.trolltech.qt.core.QDirIterator#next() next()}, and IteratorFlags. <br></DD></DT>
*/

    public QDirIterator(java.lang.String path, java.util.List<java.lang.String> nameFilters, com.trolltech.qt.core.QDir.Filters filters) {
        this(path, nameFilters, filters, new com.trolltech.qt.core.QDirIterator.IteratorFlags(0));
    }

/**
Constructs a QDirIterator that can iterate over <tt>path</tt>, using <tt>nameFilters</tt> and <tt>filters</tt>. You can pass options via <tt>flags</tt> to decide how the directory should be iterated. <p>By default, <tt>flags</tt> is {@link com.trolltech.qt.core.QDirIterator.IteratorFlag NoIteratorFlags }, which provides the same behavior as {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryList()}. <p><b>Note:</b> To list symlinks that point to non existing files, {@link com.trolltech.qt.core.QDir.Filter QDir::System } must be passed to the flags. <p><b>Warning:</b> This constructor expects <tt>flags</tt> to be left at its default value. Use the constructors that do not take the <tt>filters</tt> argument instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#hasNext() hasNext()}, {@link com.trolltech.qt.core.QDirIterator#next() next()}, and IteratorFlags. <br></DD></DT>
*/

    public QDirIterator(java.lang.String path, java.util.List<java.lang.String> nameFilters) {
        this(path, nameFilters, new com.trolltech.qt.core.QDir.Filters(-1), new com.trolltech.qt.core.QDirIterator.IteratorFlags(0));
    }
/**
Constructs a QDirIterator that can iterate over <tt>path</tt>, using <tt>nameFilters</tt> and <tt>filters</tt>. You can pass options via <tt>flags</tt> to decide how the directory should be iterated. <p>By default, <tt>flags</tt> is {@link com.trolltech.qt.core.QDirIterator.IteratorFlag NoIteratorFlags }, which provides the same behavior as {@link com.trolltech.qt.core.QDir#entryList(com.trolltech.qt.core.QDir.Filters, com.trolltech.qt.core.QDir.SortFlag[]) QDir::entryList()}. <p><b>Note:</b> To list symlinks that point to non existing files, {@link com.trolltech.qt.core.QDir.Filter QDir::System } must be passed to the flags. <p><b>Warning:</b> This constructor expects <tt>flags</tt> to be left at its default value. Use the constructors that do not take the <tt>filters</tt> argument instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#hasNext() hasNext()}, {@link com.trolltech.qt.core.QDirIterator#next() next()}, and IteratorFlags. <br></DD></DT>
*/

    public QDirIterator(java.lang.String path, java.util.List<java.lang.String> nameFilters, com.trolltech.qt.core.QDir.Filters filters, com.trolltech.qt.core.QDirIterator.IteratorFlags flags){
        super((QPrivateConstructor)null);
        __qt_QDirIterator_String_List_Filters_IteratorFlags(path, nameFilters, filters.value(), flags.value());
    }

    native void __qt_QDirIterator_String_List_Filters_IteratorFlags(java.lang.String path, java.util.List<java.lang.String> nameFilters, int filters, int flags);

/**
Returns a {@link com.trolltech.qt.core.QFileInfo QFileInfo} for the current directory entry. If the current entry is invalid (i.e., isValid() returns false), a null {@link com.trolltech.qt.core.QFileInfo QFileInfo} is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#filePath() filePath()}, and {@link com.trolltech.qt.core.QDirIterator#fileName() fileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QFileInfo fileInfo()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileInfo(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QFileInfo __qt_fileInfo(long __this__nativeId);

/**
Returns the file name for the current directory entry, without the path prepended. If the current entry is invalid (i.e., isValid() returns false), a null QString is returned. <p>This function is provided for the convenience when iterating single directories. For recursive iteration, you should call {@link com.trolltech.qt.core.QDirIterator#filePath() filePath()} or {@link com.trolltech.qt.core.QDirIterator#fileInfo() fileInfo()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#filePath() filePath()}, and {@link com.trolltech.qt.core.QDirIterator#fileInfo() fileInfo()}. <br></DD></DT>
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
Returns the full file path for the current directory entry. If the current entry is invalid (i.e., isValid() returns false), a null QString is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#fileInfo() fileInfo()}, and {@link com.trolltech.qt.core.QDirIterator#fileName() fileName()}. <br></DD></DT>
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
Returns true if there is at least one more entry in the directory; otherwise, false is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#next() next()}, {@link com.trolltech.qt.core.QDirIterator#fileName() fileName()}, {@link com.trolltech.qt.core.QDirIterator#filePath() filePath()}, and {@link com.trolltech.qt.core.QDirIterator#fileInfo() fileInfo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasNext()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasNext(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasNext(long __this__nativeId);

/**
Advances the iterator to the next entry, and returns the file path of this new entry. If {@link com.trolltech.qt.core.QDirIterator#hasNext() hasNext()} returns false, this function does nothing, and returns a null QString. <p>You can call {@link com.trolltech.qt.core.QDirIterator#fileName() fileName()} or {@link com.trolltech.qt.core.QDirIterator#filePath() filePath()} to get the current entry file name or path, or {@link com.trolltech.qt.core.QDirIterator#fileInfo() fileInfo()} to get a {@link com.trolltech.qt.core.QFileInfo QFileInfo} for the current entry. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#hasNext() hasNext()}, {@link com.trolltech.qt.core.QDirIterator#fileName() fileName()}, {@link com.trolltech.qt.core.QDirIterator#filePath() filePath()}, and {@link com.trolltech.qt.core.QDirIterator#fileInfo() fileInfo()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String next()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_next(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_next(long __this__nativeId);

/**
Returns the base directory of the iterator.
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
@exclude
*/

    public static native QDirIterator fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDirIterator(QPrivateConstructor p) { super(p); } 
}
