package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QTemporaryFile class is an I/O device that operates on temporary files. QTemporaryFile is used to create unique temporary files safely. The file itself is created by calling {@link com.trolltech.qt.core.QTemporaryFile#open() open()}. The name of the temporary file is guaranteed to be unique (i.e., you are guaranteed to not overwrite an existing file), and the file will subsequently be removed upon destruction of the QTemporaryFile object. This is an important technique that avoids data corruption for applications that store data in temporary files. The file name is either auto-generated, or created based on a template, which is passed to QTemporaryFile's constructor. <p>Example: <pre class="snippet">
        {
            QTemporaryFile file = new QTemporaryFile();
            if (file.open()) {
                // file.fileName() returns the unique file name
            }

            // the QTemporaryFile destructor removes the temporary file
        }
</pre> Reopening a QTemporaryFile after calling close() is safe. For as long as the QTemporaryFile object itself is not destroyed, the unique temporary file will exist and be kept open internally by QTemporaryFile. <p>The file name of the temporary file can be found by calling fileName(). Note that this is only defined while the file is open; the function returns an empty string before the file is opened and after it is closed. <p>A temporary file will have some static part of the name and some part that is calculated to be unique. The default filename <tt>qt_temp</tt> will be placed into the temporary path as returned by {@link com.trolltech.qt.core.QDir#tempPath() QDir::tempPath()}. If you specify your own filename, a relative file path will not be placed in the temporary directory by default, but be relative to the current working directory. <p>Specified filenames can contain the following template <tt>XXXXXX</tt> (six upper case "X" characters), which will be replaced by the auto-generated portion of the filename. Note that the template is case sensitive. If the template is not present in the filename, QTemporaryFile appends the generated part to the filename given. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir#tempPath() QDir::tempPath()}, and {@link com.trolltech.qt.core.QFile QFile}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QTemporaryFile extends com.trolltech.qt.core.QFile
{

/**
Constructs a QTemporaryFile in {@link com.trolltech.qt.core.QDir#tempPath() QDir::tempPath()}, using the file template "qt_temp.XXXXXX". The file is stored in the system's temporary directory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTemporaryFile#setFileTemplate(java.lang.String) setFileTemplate()}, and {@link com.trolltech.qt.core.QDir#tempPath() QDir::tempPath()}. <br></DD></DT>
*/

    public QTemporaryFile(){
        super((QPrivateConstructor)null);
        __qt_QTemporaryFile();
    }

    native void __qt_QTemporaryFile();

/**
Constructs a QTemporaryFile (with the given <tt>parent</tt>) in {@link com.trolltech.qt.core.QDir#tempPath() QDir::tempPath()}, using the file template "qt_temp.XXXXXX". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTemporaryFile#setFileTemplate(java.lang.String) setFileTemplate()}. <br></DD></DT>
*/

    public QTemporaryFile(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QTemporaryFile_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTemporaryFile_QObject(long parent);

/**
Constructs a QTemporaryFile with a template filename of <tt>templateName</tt>. Upon opening the temporary file this will be used to create a unique filename. <p>If the <tt>templateName</tt> does not contain XXXXXX it will automatically be appended and used as the dynamic portion of the filename. <p>If <tt>templateName</tt> is a relative path, the path will be relative to the current working directory. You can use {@link com.trolltech.qt.core.QDir#tempPath() QDir::tempPath()} to construct <tt>templateName</tt> if you want use the system's temporary directory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTemporaryFile#open() open()}, and {@link com.trolltech.qt.core.QTemporaryFile#fileTemplate() fileTemplate()}. <br></DD></DT>
*/

    public QTemporaryFile(java.lang.String templateName){
        super((QPrivateConstructor)null);
        __qt_QTemporaryFile_String(templateName);
    }

    native void __qt_QTemporaryFile_String(java.lang.String templateName);

/**
Constructs a QTemporaryFile with a template filename of <tt>templateName</tt> and the specified <tt>parent</tt>. Upon opening the temporary file this will be used to create a unique filename. <p>If the <tt>templateName</tt> does not contain XXXXXX it will automatically be appended and used as the dynamic portion of the filename. <p>If <tt>templateName</tt> is a relative path, the path will be relative to the current working directory. You can use {@link com.trolltech.qt.core.QDir#tempPath() QDir::tempPath()} to construct <tt>templateName</tt> if you want use the system's temporary directory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTemporaryFile#open() open()}, and {@link com.trolltech.qt.core.QTemporaryFile#fileTemplate() fileTemplate()}. <br></DD></DT>
*/

    public QTemporaryFile(java.lang.String templateName, com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QTemporaryFile_String_QObject(templateName, parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTemporaryFile_String_QObject(java.lang.String templateName, long parent);

/**
Returns true if the QTemporaryFile is in auto remove mode. Auto-remove mode will automatically delete the filename from disk upon destruction. This makes it very easy to create your QTemporaryFile object on the stack, fill it with data, read from it, and finally on function return it will automatically clean up after itself. <p>Auto-remove is on by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTemporaryFile#setAutoRemove(boolean) setAutoRemove()}, and {@link com.trolltech.qt.core.QFile#remove() remove()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean autoRemove()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_autoRemove(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_autoRemove(long __this__nativeId);

/**
Returns the complete unique filename backing the QTemporaryFile object. This string is null before the QTemporaryFile is opened, afterwards it will contain the {@link com.trolltech.qt.core.QTemporaryFile#fileTemplate() fileTemplate()} plus additional characters to make it unique. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTemporaryFile#fileTemplate() fileTemplate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String uniqueFilename()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_uniqueFilename(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_uniqueFilename(long __this__nativeId);

/**
Returns the set file template. The default file template will be called qt_temp and be placed in {@link com.trolltech.qt.core.QDir#tempPath() QDir::tempPath()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTemporaryFile#setFileTemplate(java.lang.String) setFileTemplate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String fileTemplate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fileTemplate(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_fileTemplate(long __this__nativeId);

/**
A QTemporaryFile will always be opened in {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::ReadWrite } mode, this allows easy access to the data in the file. This function will return true upon success and will set the fileName() to the unique filename used. <p><DT><b>See also:</b><br><DD>fileName(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean open()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_open(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_open(long __this__nativeId);

/**
Sets the QTemporaryFile into auto-remove mode if <tt>b</tt> is true. <p>Auto-remove is on by default. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTemporaryFile#autoRemove() autoRemove()}, and {@link com.trolltech.qt.core.QFile#remove() remove()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setAutoRemove(boolean b)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAutoRemove_boolean(nativeId(), b);
    }
    @QtBlockedSlot
    native void __qt_setAutoRemove_boolean(long __this__nativeId, boolean b);

/**
Sets the static portion of the file name to <tt>name</tt>. If the file template ends in XXXXXX that will automatically be replaced with the unique part of the filename, otherwise a filename will be determined automatically based on the static portion specified. <p>If <tt>name</tt> contains a relative file path, the path will be relative to the current working directory. You can use {@link com.trolltech.qt.core.QDir#tempPath() QDir::tempPath()} to construct <tt>name</tt> if you want use the system's temporary directory. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTemporaryFile#fileTemplate() fileTemplate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFileTemplate(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFileTemplate_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setFileTemplate_String(long __this__nativeId, java.lang.String name);

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
    public boolean open(com.trolltech.qt.core.QIODevice.OpenMode flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_open_OpenMode(nativeId(), flags.value());
    }
    @QtBlockedSlot
    native boolean __qt_open_OpenMode(long __this__nativeId, int flags);

/**
If <tt>file</tt> is not on a local disk, a temporary file is created on a local disk, <tt>file</tt> is copied into the temporary local file, and a pointer to the temporary local file is returned. If <tt>file</tt> is already on a local disk, a copy is not created and 0 is returned.
*/

    public static com.trolltech.qt.core.QTemporaryFile createLocalFile(com.trolltech.qt.core.QFile file)    {
        return __qt_createLocalFile_QFile(file == null ? 0 : file.nativeId());
    }
    native static com.trolltech.qt.core.QTemporaryFile __qt_createLocalFile_QFile(long file);

/**
This is an overloaded member function, provided for convenience. <p>Works on the given <tt>fileName</tt> rather than an existing {@link com.trolltech.qt.core.QFile QFile} object.
*/

    public native static com.trolltech.qt.core.QTemporaryFile createLocalFile(java.lang.String fileName);

/**
@exclude
*/

    public static native QTemporaryFile fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTemporaryFile(QPrivateConstructor p) { super(p); } 
}
