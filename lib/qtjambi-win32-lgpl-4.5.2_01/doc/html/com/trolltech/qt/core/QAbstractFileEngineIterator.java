package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QAbstractFileEngineIterator class provides an iterator interface for custom file engines. If all you want is to iterate over entries in a directory, see {@link com.trolltech.qt.core.QDirIterator QDirIterator} instead. This class is only for custom file engine authors. <p>QAbstractFileEngineIterator is a unidirectional single-use virtual iterator that plugs into {@link com.trolltech.qt.core.QDirIterator QDirIterator}, providing transparent proxy iteration for custom file engines. <p>You can subclass QAbstractFileEngineIterator to provide an iterator when writing your own file engine. To plug the iterator into your file system, you simply return an instance of this subclass from a reimplementation of QAbstractFileEngine::beginEntryList(). <p>Example: <pre class="snippet">
    class CustomFileEngine extends QAbstractFileEngine
    {
        QAbstractFileEngineIterator beginEntryList(QDir.Filters filters, java.util.List&lt;String&gt; nameFilters)
        {
            return new CustomFileEngineIterator(filters, nameFilters);
        }
        //...
    }
</pre> QAbstractFileEngineIterator is associated with a path, name filters, and entry filters. The path is the directory that the iterator lists entries in. The name filters and entry filters are provided for file engines that can optimize directory listing at the iterator level (e.g., network file systems that need to minimize network traffic), but they can also be ignored by the iterator subclass; QAbstractFileEngineIterator already provides the required filtering logics in the matchesFilters() function. You can call dirName() to get the directory name, {@link com.trolltech.qt.core.QAbstractFileEngineIterator#nameFilters() nameFilters()} to get a stringlist of name filters, and {@link com.trolltech.qt.core.QAbstractFileEngineIterator#filters() filters()} to get the entry filters. <p>The pure virual function {@link com.trolltech.qt.core.QAbstractFileEngineIterator#hasNext() hasNext()} returns true if the current directory has at least one more entry (i.e., the directory name is valid and accessible, and we have not reached the end of the entry list), and false otherwise. Reimplement {@link com.trolltech.qt.core.QAbstractFileEngineIterator#next() next()} to seek to the next entry. <p>The pure virtual function {@link com.trolltech.qt.core.QAbstractFileEngineIterator#currentFileName() currentFileName()} returns the name of the current entry without advancing the iterator. The {@link com.trolltech.qt.core.QAbstractFileEngineIterator#currentFilePath() currentFilePath()} function is provided for convenience; it returns the full path of the current entry. <p>Here is an example of how to implement an interator that returns each of three fixed entries in sequence. <pre class="snippet">
    class CustomIterator extends QAbstractFileEngineIterator
    {
        private java.util.List&lt;String&gt; entries;
        private int index;

        public CustomIterator(java.util.List&lt;String&gt; nameFilters, QDir.Filters filters)
        {
            super(filters, nameFilters);
            index = 0;

            // In a real iterator, these entries are fetched from the
            // file system based on the value of path().
            entries.add("entry1");
            entries.add("entry2");
            entries.add("entry3");
        }

        public boolean hasNext()
        {
            return index &lt; entries.size() - 1;
        }

        public String next()
        {
           if (!hasNext())
               return "";
           ++index;
           return currentFilePath();
        }

        public String currentFileName()
        {
            return entries.get(index);
        }
    }
</pre> Note: QAbstractFileEngineIterator does not deal with QDir::IteratorFlags; it simply returns entries for a single directory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator QDirIterator}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractFileEngineIterator extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.core.QAbstractFileEngineIterator {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public java.lang.String currentFileName() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_currentFileName(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean hasNext() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_hasNext(nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.lang.String next() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_next(nativeId());
        }
    }


/**
Constructs a QAbstractFileEngineIterator, using the entry filters <tt>filters</tt>, and wildcard name filters <tt>nameFilters</tt>.
*/

    public QAbstractFileEngineIterator(com.trolltech.qt.core.QDir.Filters filters, java.util.List<java.lang.String> nameFilters){
        super((QPrivateConstructor)null);
        __qt_QAbstractFileEngineIterator_Filters_List(filters.value(), nameFilters);
    }

    native void __qt_QAbstractFileEngineIterator_Filters_List(int filters, java.util.List<java.lang.String> nameFilters);

/**
Returns the path to the current directory entry. It's the same as prepending {@link com.trolltech.qt.core.QAbstractFileEngineIterator#path() path()} to the return value of {@link com.trolltech.qt.core.QAbstractFileEngineIterator#currentFileName() currentFileName()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngineIterator#currentFileName() currentFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String currentFilePath()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentFilePath(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_currentFilePath(long __this__nativeId);

/**
Returns the entry filters for this iterator. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#filter() QDir::filter()}, {@link com.trolltech.qt.core.QAbstractFileEngineIterator#nameFilters() nameFilters()}, and {@link com.trolltech.qt.core.QAbstractFileEngineIterator#path() path()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDir.Filters filters()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QDir.Filters(__qt_filters(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_filters(long __this__nativeId);

/**
Returns the name filters for this iterator. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#nameFilters() QDir::nameFilters()}, {@link com.trolltech.qt.core.QAbstractFileEngineIterator#filters() filters()}, and {@link com.trolltech.qt.core.QAbstractFileEngineIterator#path() path()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> nameFilters()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nameFilters(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_nameFilters(long __this__nativeId);

/**
Returns the path for this iterator. {@link com.trolltech.qt.core.QDirIterator QDirIterator} is responsible for assigning this path; it cannot change during the iterator's lifetime. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngineIterator#nameFilters() nameFilters()}, and {@link com.trolltech.qt.core.QAbstractFileEngineIterator#filters() filters()}. <br></DD></DT>
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
The virtual function returns a {@link com.trolltech.qt.core.QFileInfo QFileInfo} for the current directory entry. This function is provided for convenience. It can also be slightly faster that creating a {@link com.trolltech.qt.core.QFileInfo QFileInfo} object yourself, as the object returned by this function might contain cached information that {@link com.trolltech.qt.core.QFileInfo QFileInfo} otherwise would have to access through the file engine. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngineIterator#currentFileName() currentFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QFileInfo currentFileInfo()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentFileInfo(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QFileInfo __qt_currentFileInfo(long __this__nativeId);

/**
This pure virtual function returns the name of the current directory entry, excluding the path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngineIterator#currentFilePath() currentFilePath()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.lang.String currentFileName();
    @QtBlockedSlot
    native java.lang.String __qt_currentFileName(long __this__nativeId);

/**
This pure virtual function returns true if there is at least one more entry in the current directory (i. ., the iterator path is valid and accessible, and the iterator has not reached the end of the entry list). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#hasNext() QDirIterator::hasNext()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean hasNext();
    @QtBlockedSlot
    native boolean __qt_hasNext(long __this__nativeId);

/**
This pure virtual function advances the iterator to the next directory entry, and returns the file path to the current entry. <p>This function can optionally make use of {@link com.trolltech.qt.core.QAbstractFileEngineIterator#nameFilters() nameFilters()} and {@link com.trolltech.qt.core.QAbstractFileEngineIterator#filters() filters()} to optimize its performance. <p>Reimplement this function in a subclass to advance the iterator. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDirIterator#next() QDirIterator::next()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.lang.String next();
    @QtBlockedSlot
    native java.lang.String __qt_next(long __this__nativeId);

/**
@exclude
*/

    public static native QAbstractFileEngineIterator fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractFileEngineIterator(QPrivateConstructor p) { super(p); } 
}
