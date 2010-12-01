package com.trolltech.qt.gui;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QFileDialog class provides a dialog that allow users to select files or directories. The QFileDialog class enables a user to traverse the file system in order to select one or many files or a directory. <p>The easiest way to create a QFileDialog is to use the static functions. On Windows, these static functions will call the native Windows file dialog, and on Mac OS X these static function will call the native Mac OS X file dialog. <pre class="snippet">
  String fileName = QFileDialog.getOpenFileName(this,
      tr("Open Image"), "/home/jana", new QFileDialog.Filter(tr("Image Files (*.png *.jpg *.bmp)")));
</pre> In the above example, a modal QFileDialog is created using a static function. The dialog initially displays the contents of the "/home/jana" directory, and displays files matching the patterns given in the string "Image Files (*.png *.jpg *.bmp)". The parent of the file dialog is set to this, and the window title is set to "Open Image". <p>If you want to use multiple filters, separate each one with two semicolons. For example: <pre class="snippet">
  String filter = "Images (*.png *.xpm *.jpg);;Text files (*.txt);;XML files (*.xml)";
</pre> You can create your own QFileDialog without using the static functions. By calling {@link com.trolltech.qt.gui.QFileDialog#setFileMode(com.trolltech.qt.gui.QFileDialog.FileMode) setFileMode()}, you can specify what the user must select in the dialog: <pre class="snippet">
  QFileDialog dialog = new QFileDialog(this);
  dialog.setFileMode(QFileDialog.FileMode.AnyFile);
</pre> In the above example, the mode of the file dialog is set to {@link com.trolltech.qt.gui.QFileDialog.FileMode AnyFile }, meaning that the user can select any file, or even specify a file that doesn't exist. This mode is useful for creating a "Save As" file dialog. Use {@link com.trolltech.qt.gui.QFileDialog.FileMode ExistingFile } if the user must select an existing file, or {@link com.trolltech.qt.gui.QFileDialog.FileMode Directory } if only a directory may be selected. See the {@link com.trolltech.qt.gui.QFileDialog.FileMode QFileDialog::FileMode } enum for the complete list of modes. <p>The {@link QFileDialog#fileMode() fileMode} property contains the mode of operation for the dialog; this indicates what types of objects the user is expected to select. Use {@link com.trolltech.qt.gui.QFileDialog#setNameFilter(java.lang.String) setNameFilter()} to set the dialog's file filter. For example: <pre class="snippet">
  dialog.setFilter(tr("Images (*.png *.xpm *.jpg)"));
</pre> In the above example, the filter is set to <tt>"Images (*.png *.xpm *.jpg)"</tt>, this means that only files with the extension <tt>png</tt>, <tt>xpm</tt>, or <tt>jpg</tt> will be shown in the QFileDialog. You can apply several filters by using {@link com.trolltech.qt.gui.QFileDialog#setNameFilters(java.util.List) setNameFilters()}. Use {@link com.trolltech.qt.gui.QFileDialog#selectNameFilter(java.lang.String) selectNameFilter()} to select one of the filters you've given as the file dialog's default filter. <p>The file dialog has two view modes: {@link com.trolltech.qt.gui.QFileDialog.ViewMode List } and {@link com.trolltech.qt.gui.QFileDialog.ViewMode Detail }. {@link com.trolltech.qt.gui.QFileDialog.ViewMode List } presents the contents of the current directory as a list of file and directory names. {@link com.trolltech.qt.gui.QFileDialog.ViewMode Detail } also displays a list of file and directory names, but provides additional information alongside each name, such as the file size and modification date. Set the mode with {@link com.trolltech.qt.gui.QFileDialog#setViewMode(com.trolltech.qt.gui.QFileDialog.ViewMode) setViewMode()}: <pre class="snippet">
  dialog.setViewMode(QFileDialog.ViewMode.Detail);
</pre> The last important function you will need to use when creating your own file dialog is {@link com.trolltech.qt.gui.QFileDialog#selectedFiles() selectedFiles()}. <pre class="snippet">
  java.util.List fileNames;
  if (dialog.exec() != 0)
      fileNames = dialog.selectedFiles();
</pre> In the above example, a modal file dialog is created and shown. If the user clicked OK, the file they selected is put in <tt>fileName</tt>. <p>The dialog's working directory can be set with {@link com.trolltech.qt.gui.QFileDialog#setDirectory(com.trolltech.qt.core.QDir) setDirectory()}. Each file in the current directory can be selected using the {@link com.trolltech.qt.gui.QFileDialog#selectFile(java.lang.String) selectFile()} function. <p>The {@link <a href="../dialogs-standarddialogs.html">Standard Dialogs</a>} example shows how to use QFileDialog as well as other built-in Qt dialogs. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDir QDir}, {@link com.trolltech.qt.core.QFileInfo QFileInfo}, {@link com.trolltech.qt.core.QFile QFile}, {@link com.trolltech.qt.gui.QPrintDialog QPrintDialog}, {@link com.trolltech.qt.gui.QColorDialog QColorDialog}, {@link com.trolltech.qt.gui.QFontDialog QFontDialog}, {@link <a href="../dialogs-standarddialogs.html">Standard Dialogs Example</a>}, and {@link <a href="../qtjambi-application.html">Application Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFileDialog extends com.trolltech.qt.gui.QDialog
{

    private Object __rcItemDelegate = null;

    private Object __rcIconProvider = null;
/**
This enum is used to indicate what the user may select in the file dialog; i.e. what the dialog will return if the user clicks OK. This value is obsolete since Qt 4.5: <p><DT><b>See also:</b><br><DD>setFileMode(). <br></DD></DT>
*/

    public enum FileMode implements com.trolltech.qt.QtEnumerator {
/**
 The name of a file, whether it exists or not.
*/

        AnyFile(0),
/**
 The name of a single existing file.
*/

        ExistingFile(1),
/**
 The name of a directory. Both files and directories are displayed.
*/

        Directory(2),
/**
 The names of zero or more existing files.
*/

        ExistingFiles(3),
/**
 Use <tt>Directory</tt> and setOption({@link com.trolltech.qt.gui.QFileDialog.Option ShowDirsOnly }, true) instead.
*/

        DirectoryOnly(4);

        FileMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFileDialog$FileMode constant with the specified <tt>int</tt>.</brief>
*/

        public static FileMode resolve(int value) {
            return (FileMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AnyFile;
            case 1: return ExistingFile;
            case 2: return Directory;
            case 3: return ExistingFiles;
            case 4: return DirectoryOnly;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This value is obsolete and does nothing since Qt 4.5:
*/

    public enum Option implements com.trolltech.qt.QtEnumerator {
/**
 Only show directories in the file dialog. By default both files and directories are shown. (Valid only in the {@link com.trolltech.qt.gui.QFileDialog.FileMode Directory } file mode.)
*/

        ShowDirsOnly(1),
/**
 Don't resolve symlinks in the file dialog. By default symlinks are resolved.
*/

        DontResolveSymlinks(2),
/**
 Don't ask for confirmation if an existing file is selected. By default confirmation is requested.
*/

        DontConfirmOverwrite(4),
/**
 In previous versions of Qt, the static functions would create a sheet by default if the static function was given a parent. This is no longer supported in Qt 4.5, The static functions will always be an application modal dialog. If you want to use sheets, use QFileDialog::open() instead.
*/

        DontUseSheet(8),
/**
 Don't use the native file dialog. By default on Mac OS X and Windows, the native file dialog is used.
*/

        DontUseNativeDialog(16),
/**
 Indicates that the model is readonly.
*/

        ReadOnly(32),
/**
 Indicates if the is hidden or not.
*/

        HideNameFilterDetails(64);

        Option(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.gui.QFileDialog$Options with the specified <tt>com.trolltech.qt.gui.QFileDialog$Option[]</tt> QFileDialog$Option values set.</brief>
*/

        public static Options createQFlags(Option ... values) {
            return new Options(values);
        }
/**
<brief>Returns the QFileDialog$Option constant with the specified <tt>int</tt>.</brief>
*/

        public static Option resolve(int value) {
            return (Option) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return ShowDirsOnly;
            case 2: return DontResolveSymlinks;
            case 4: return DontConfirmOverwrite;
            case 8: return DontUseSheet;
            case 16: return DontUseNativeDialog;
            case 32: return ReadOnly;
            case 64: return HideNameFilterDetails;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class Options extends com.trolltech.qt.QFlags<Option> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QFileDialog-Options with the specified <tt>com.trolltech.qt.gui.QFileDialog.Option[]</tt>. flags set.</brief>
*/

        public Options(Option ... args) { super(args); }
        public Options(int value) { setValue(value); }
    }

    @QtBlockedEnum
    public enum DialogLabel implements com.trolltech.qt.QtEnumerator {
/**

*/

        LookIn(0),
/**

*/

        FileName(1),
/**

*/

        FileType(2),
/**

*/

        Accept(3),
/**

*/

        Reject(4);

        DialogLabel(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFileDialog$DialogLabel constant with the specified <tt>int</tt>.</brief>
*/

        public static DialogLabel resolve(int value) {
            return (DialogLabel) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return LookIn;
            case 1: return FileName;
            case 2: return FileType;
            case 3: return Accept;
            case 4: return Reject;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the view mode of the file dialog; i.e. what information about each file will be displayed. <p><DT><b>See also:</b><br><DD>setViewMode(). <br></DD></DT>
*/

    public enum ViewMode implements com.trolltech.qt.QtEnumerator {
/**
 Displays an icon, a name, and details for each item in the directory.
*/

        Detail(0),
/**
 Displays only an icon and a name for each item in the directory.
*/

        List(1);

        ViewMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFileDialog$ViewMode constant with the specified <tt>int</tt>.</brief>
*/

        public static ViewMode resolve(int value) {
            return (ViewMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Detail;
            case 1: return List;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public enum AcceptMode implements com.trolltech.qt.QtEnumerator {
/**

*/

        AcceptOpen(0),
/**

*/

        AcceptSave(1);

        AcceptMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QFileDialog$AcceptMode constant with the specified <tt>int</tt>.</brief>
*/

        public static AcceptMode resolve(int value) {
            return (AcceptMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AcceptOpen;
            case 1: return AcceptSave;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: path)&gt;:<p> When the current file changes, this signal is emitted with the new file name as the <tt>path</tt> parameter. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#filesSelected filesSelected() }. <br></DD></DT>
*/

    public final Signal1<java.lang.String> currentChanged = new Signal1<java.lang.String>();

    private final void currentChanged(java.lang.String path)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentChanged_String(nativeId(), path);
    }
    native void __qt_currentChanged_String(long __this__nativeId, java.lang.String path);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: directory)&gt;:<p> This signal is emitted when the user enters a <tt>directory</tt>.
*/

    public final Signal1<java.lang.String> directoryEntered = new Signal1<java.lang.String>();

    private final void directoryEntered(java.lang.String directory)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_directoryEntered_String(nativeId(), directory);
    }
    native void __qt_directoryEntered_String(long __this__nativeId, java.lang.String directory);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: file)&gt;:<p> When the selection changes and the dialog is accepted, this signal is emitted with the (possibly empty) selected <tt>file</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#currentChanged currentChanged() }, and {@link com.trolltech.qt.gui.QDialog.DialogCode QDialog::Accepted }. <br></DD></DT>
*/

    public final Signal1<java.lang.String> fileSelected = new Signal1<java.lang.String>();

    private final void fileSelected(java.lang.String file)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fileSelected_String(nativeId(), file);
    }
    native void __qt_fileSelected_String(long __this__nativeId, java.lang.String file);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.util.List<java.lang.String>(named: selected)&gt;:<p> When the selection changes and the dialog is accepted, this signal is emitted with the (possibly empty) list of <tt>selected</tt> files. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#currentChanged currentChanged() }, and {@link com.trolltech.qt.gui.QDialog.DialogCode QDialog::Accepted }. <br></DD></DT>
*/

    public final Signal1<java.util.List<java.lang.String>> filesSelected = new Signal1<java.util.List<java.lang.String>>();

    private final void filesSelected(java.util.List<java.lang.String> files)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_filesSelected_List(nativeId(), files);
    }
    native void __qt_filesSelected_List(long __this__nativeId, java.util.List<java.lang.String> files);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: filter)&gt;:<p> This signal is emitted when the user selects a <tt>filter</tt>.
*/

    public final Signal1<java.lang.String> filterSelected = new Signal1<java.lang.String>();

    private final void filterSelected(java.lang.String filter)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_filterSelected_String(nativeId(), filter);
    }
    native void __qt_filterSelected_String(long __this__nativeId, java.lang.String filter);


/**

*/

    public QFileDialog(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowType ... f) {
        this(parent, new com.trolltech.qt.core.Qt.WindowFlags(f));
    }
/**
Constructs a file dialog with the given <tt>parent</tt> and widget <tt>flags</tt>.
*/

    public QFileDialog(com.trolltech.qt.gui.QWidget parent, com.trolltech.qt.core.Qt.WindowFlags f){
        super((QPrivateConstructor)null);
        __qt_QFileDialog_QWidget_WindowFlags(parent == null ? 0 : parent.nativeId(), f.value());
    }

    native void __qt_QFileDialog_QWidget_WindowFlags(long parent, int f);


/**
Constructs a file dialog with the given <tt>parent</tt> and <tt>caption</tt> that initially displays the contents of the specified <tt>directory</tt>. The contents of the directory are filtered before being shown in the dialog, using a semicolon-separated list of filters specified by <tt>filter</tt>.
*/

    public QFileDialog(com.trolltech.qt.gui.QWidget parent, java.lang.String caption, java.lang.String directory) {
        this(parent, caption, directory, (java.lang.String)null);
    }

/**
Constructs a file dialog with the given <tt>parent</tt> and <tt>caption</tt> that initially displays the contents of the specified <tt>directory</tt>. The contents of the directory are filtered before being shown in the dialog, using a semicolon-separated list of filters specified by <tt>filter</tt>.
*/

    public QFileDialog(com.trolltech.qt.gui.QWidget parent, java.lang.String caption) {
        this(parent, caption, (java.lang.String)null, (java.lang.String)null);
    }

/**
Constructs a file dialog with the given <tt>parent</tt> and <tt>caption</tt> that initially displays the contents of the specified <tt>directory</tt>. The contents of the directory are filtered before being shown in the dialog, using a semicolon-separated list of filters specified by <tt>filter</tt>.
*/

    public QFileDialog(com.trolltech.qt.gui.QWidget parent) {
        this(parent, (java.lang.String)null, (java.lang.String)null, (java.lang.String)null);
    }

/**
Constructs a file dialog with the given <tt>parent</tt> and <tt>caption</tt> that initially displays the contents of the specified <tt>directory</tt>. The contents of the directory are filtered before being shown in the dialog, using a semicolon-separated list of filters specified by <tt>filter</tt>.
*/

    public QFileDialog() {
        this((com.trolltech.qt.gui.QWidget)null, (java.lang.String)null, (java.lang.String)null, (java.lang.String)null);
    }
/**
Constructs a file dialog with the given <tt>parent</tt> and <tt>caption</tt> that initially displays the contents of the specified <tt>directory</tt>. The contents of the directory are filtered before being shown in the dialog, using a semicolon-separated list of filters specified by <tt>filter</tt>.
*/

    public QFileDialog(com.trolltech.qt.gui.QWidget parent, java.lang.String caption, java.lang.String directory, java.lang.String filter){
        super((QPrivateConstructor)null);
        __qt_QFileDialog_QWidget_String_String_String(parent == null ? 0 : parent.nativeId(), caption, directory, filter);
    }

    native void __qt_QFileDialog_QWidget_String_String_String(long parent, java.lang.String caption, java.lang.String directory, java.lang.String filter);

/**
This property holds the accept mode of the dialog. The action mode defines whether the dialog is for opening or saving files. <p>By default, this property is set to {@link com.trolltech.qt.gui.QFileDialog.AcceptMode AcceptOpen }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog.AcceptMode AcceptMode }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="acceptMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFileDialog.AcceptMode acceptMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFileDialog.AcceptMode.resolve(__qt_acceptMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_acceptMode(long __this__nativeId);

/**
<p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setConfirmOverwrite(boolean) setConfirmOverwrite()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="confirmOverwrite")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final boolean confirmOverwrite()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_confirmOverwrite(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_confirmOverwrite(long __this__nativeId);

/**
This property holds suffix added to the filename if no other suffix was specified. This property specifies a string that will be added to the filename if it has no suffix already. The suffix is typically used to indicate the file type (e.g. "txt" indicates a text file).
*/

    @com.trolltech.qt.QtPropertyReader(name="defaultSuffix")
    @QtBlockedSlot
    public final java.lang.String defaultSuffix()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_defaultSuffix(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_defaultSuffix(long __this__nativeId);

/**
Returns the directory currently being displayed in the dialog. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setDirectory(com.trolltech.qt.core.QDir) setDirectory()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDir directory()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_directory(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDir __qt_directory(long __this__nativeId);

/**
This property holds the file mode of the dialog. The file mode defines the number and type of items that the user is expected to select in the dialog. <p>By default, this property is set to {@link com.trolltech.qt.gui.QFileDialog.FileMode AnyFile }. <p>This function will set the labels for the {@link com.trolltech.qt.gui.QFileDialog.DialogLabel FileName } and {@link com.trolltech.qt.gui.QFileDialog.DialogLabel Accept }{@link com.trolltech.qt.gui.QFileDialog.DialogLabel DialogLabel }s. It is possible to set custom text after the call to {@link com.trolltech.qt.gui.QFileDialog#setFileMode(com.trolltech.qt.gui.QFileDialog.FileMode) setFileMode()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog.FileMode FileMode }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="fileMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFileDialog.FileMode fileMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFileDialog.FileMode.resolve(__qt_fileMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_fileMode(long __this__nativeId);

/**
Returns the filter that is used when displaying files. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setFilter(com.trolltech.qt.core.QDir.Filter[]) setFilter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDir.Filters filter()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QDir.Filters(__qt_filter(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_filter(long __this__nativeId);

/**
Use {@link com.trolltech.qt.gui.QFileDialog#nameFilters() nameFilters()} instead. <p><DT><b>See also:</b><br><DD>setFilters(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> filters()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_filters(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_filters(long __this__nativeId);

/**
Returns the browsing history of the filedialog as a list of paths. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setHistory(java.util.List) setHistory()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> history()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_history(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_history(long __this__nativeId);

/**
Returns the icon provider used by the filedialog. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setIconProvider(com.trolltech.qt.gui.QFileIconProvider) setIconProvider()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFileIconProvider iconProvider()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_iconProvider(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFileIconProvider __qt_iconProvider(long __this__nativeId);

/**

*/

    @QtBlockedSlot
    public final boolean isNameFilterDetailsVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNameFilterDetailsVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNameFilterDetailsVisible(long __this__nativeId);

/**

*/

    @com.trolltech.qt.QtPropertyReader(name="readOnly")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final boolean isReadOnly()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isReadOnly(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isReadOnly(long __this__nativeId);

/**
Returns the item delegate used to render the items in the views in the filedialog. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setItemDelegate(com.trolltech.qt.gui.QAbstractItemDelegate) setItemDelegate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractItemDelegate itemDelegate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemDelegate(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractItemDelegate __qt_itemDelegate(long __this__nativeId);

/**
Returns the text shown in the filedialog in the specified <tt>label</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setLabelText(com.trolltech.qt.gui.QFileDialog.DialogLabel, java.lang.String) setLabelText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String labelText(com.trolltech.qt.gui.QFileDialog.DialogLabel label)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_labelText_DialogLabel(nativeId(), label.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_labelText_DialogLabel(long __this__nativeId, int label);

/**
Returns the file type filters that are in operation on this file dialog. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setNameFilters(java.util.List) setNameFilters()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> nameFilters()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_nameFilters(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_nameFilters(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void open()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_open(nativeId());
    }
    @QtBlockedSlot
    native void __qt_open(long __this__nativeId);

/**
This property holds the various options that affect the look and feel of the dialog. By default, all options are disabled. <p>Options should be set before showing the dialog. Setting them while the dialog is visible is not guaranteed to have an immediate effect on the dialog (depending on the option and on the platform). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setOption(com.trolltech.qt.gui.QFileDialog.Option) setOption()}, and {@link com.trolltech.qt.gui.QFileDialog#testOption(com.trolltech.qt.gui.QFileDialog.Option) testOption()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="options")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFileDialog.Options options()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.gui.QFileDialog.Options(__qt_options(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_options(long __this__nativeId);

/**
Returns the proxy model used by the file dialog. By default no proxy is set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setProxyModel(com.trolltech.qt.gui.QAbstractProxyModel) setProxyModel()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QAbstractProxyModel proxyModel()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_proxyModel(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAbstractProxyModel __qt_proxyModel(long __this__nativeId);

/**
<p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setResolveSymlinks(boolean) setResolveSymlinks()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="resolveSymlinks")
    @com.trolltech.qt.QtPropertyDesignable("false")
    @QtBlockedSlot
    public final boolean resolveSymlinks()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_resolveSymlinks(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_resolveSymlinks(long __this__nativeId);

/**
Restores the dialogs's layout, history and current directory to the <tt>state</tt> specified. <p>Typically this is used in conjunction with {@link com.trolltech.qt.core.QSettings QSettings} to restore the size from a past session. <p>Returns false if there are errors
*/

    @QtBlockedSlot
    public final boolean restoreState(com.trolltech.qt.core.QByteArray state)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_restoreState_QByteArray(nativeId(), state == null ? 0 : state.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_restoreState_QByteArray(long __this__nativeId, long state);

/**
Saves the state of the dialog's layout, history and current directory. <p>Typically this is used in conjunction with {@link com.trolltech.qt.core.QSettings QSettings} to remember the size for a future session. A version number is stored as part of the data.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray saveState()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_saveState(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_saveState(long __this__nativeId);

/**
Selects the given <tt>filename</tt> in the file dialog. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#selectedFiles() selectedFiles()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void selectFile(java.lang.String filename)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectFile_String(nativeId(), filename);
    }
    @QtBlockedSlot
    native void __qt_selectFile_String(long __this__nativeId, java.lang.String filename);

/**
Use {@link com.trolltech.qt.gui.QFileDialog#selectNameFilter(java.lang.String) selectNameFilter()} instead.
*/

    @QtBlockedSlot
    public final void selectFilter(java.lang.String filter)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectFilter_String(nativeId(), filter);
    }
    @QtBlockedSlot
    native void __qt_selectFilter_String(long __this__nativeId, java.lang.String filter);

/**
Sets the current file type <tt>filter</tt>. Multiple filters can be passed in <tt>filter</tt> by separating them with semicolons or spaces. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setNameFilter(java.lang.String) setNameFilter()}, {@link com.trolltech.qt.gui.QFileDialog#setNameFilters(java.util.List) setNameFilters()}, and {@link com.trolltech.qt.gui.QFileDialog#selectedNameFilter() selectedNameFilter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void selectNameFilter(java.lang.String filter)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectNameFilter_String(nativeId(), filter);
    }
    @QtBlockedSlot
    native void __qt_selectNameFilter_String(long __this__nativeId, java.lang.String filter);

/**
Returns a list of strings containing the absolute paths of the selected files in the dialog. If no files are selected, or the mode is not {@link com.trolltech.qt.gui.QFileDialog.FileMode ExistingFiles } or {@link com.trolltech.qt.gui.QFileDialog.FileMode ExistingFile }, {@link com.trolltech.qt.gui.QFileDialog#selectedFiles() selectedFiles()} contains the current path in the viewport. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#selectedNameFilter() selectedNameFilter()}, and {@link com.trolltech.qt.gui.QFileDialog#selectFile(java.lang.String) selectFile()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> selectedFiles()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedFiles(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_selectedFiles(long __this__nativeId);

/**
Use {@link com.trolltech.qt.gui.QFileDialog#selectedNameFilter() selectedNameFilter()} instead.
*/

    @QtBlockedSlot
    public final java.lang.String selectedFilter()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedFilter(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_selectedFilter(long __this__nativeId);

/**
Returns the filter that the user selected in the file dialog. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#selectedFiles() selectedFiles()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String selectedNameFilter()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_selectedNameFilter(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_selectedNameFilter(long __this__nativeId);

/**
This property holds the accept mode of the dialog. The action mode defines whether the dialog is for opening or saving files. <p>By default, this property is set to {@link com.trolltech.qt.gui.QFileDialog.AcceptMode AcceptOpen }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog.AcceptMode AcceptMode }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="acceptMode")
    @QtBlockedSlot
    public final void setAcceptMode(com.trolltech.qt.gui.QFileDialog.AcceptMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAcceptMode_AcceptMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setAcceptMode_AcceptMode(long __this__nativeId, int mode);

/**
<p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#confirmOverwrite() confirmOverwrite()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="confirmOverwrite")
    @QtBlockedSlot
    public final void setConfirmOverwrite(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setConfirmOverwrite_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setConfirmOverwrite_boolean(long __this__nativeId, boolean enabled);

/**
This property holds suffix added to the filename if no other suffix was specified. This property specifies a string that will be added to the filename if it has no suffix already. The suffix is typically used to indicate the file type (e.g. "txt" indicates a text file).
*/

    @com.trolltech.qt.QtPropertyWriter(name="defaultSuffix")
    @QtBlockedSlot
    public final void setDefaultSuffix(java.lang.String suffix)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefaultSuffix_String(nativeId(), suffix);
    }
    @QtBlockedSlot
    native void __qt_setDefaultSuffix_String(long __this__nativeId, java.lang.String suffix);

/**
Set the current directory of this QFileDialog to <tt>directory</tt>.
*/

    @QtBlockedSlot
    public final void setDirectory(com.trolltech.qt.core.QDir directory)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDirectory_QDir(nativeId(), directory == null ? 0 : directory.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDirectory_QDir(long __this__nativeId, long directory);

/**
Sets the file dialog's current <tt>directory</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#directory() directory()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDirectory(java.lang.String directory)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDirectory_String(nativeId(), directory);
    }
    @QtBlockedSlot
    native void __qt_setDirectory_String(long __this__nativeId, java.lang.String directory);

/**
This property holds the file mode of the dialog. The file mode defines the number and type of items that the user is expected to select in the dialog. <p>By default, this property is set to {@link com.trolltech.qt.gui.QFileDialog.FileMode AnyFile }. <p>This function will set the labels for the {@link com.trolltech.qt.gui.QFileDialog.DialogLabel FileName } and {@link com.trolltech.qt.gui.QFileDialog.DialogLabel Accept }{@link com.trolltech.qt.gui.QFileDialog.DialogLabel DialogLabel }s. It is possible to set custom text after the call to {@link com.trolltech.qt.gui.QFileDialog#setFileMode(com.trolltech.qt.gui.QFileDialog.FileMode) setFileMode()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog.FileMode FileMode }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="fileMode")
    @QtBlockedSlot
    public final void setFileMode(com.trolltech.qt.gui.QFileDialog.FileMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFileMode_FileMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setFileMode_FileMode(long __this__nativeId, int mode);


/**

*/

    @QtBlockedSlot
    public final void setFilter(com.trolltech.qt.core.QDir.Filter ... filters) {
        this.setFilter(new com.trolltech.qt.core.QDir.Filters(filters));
    }
/**
Sets the filter used by the model to <tt>filters</tt>. The filter is used to specify the kind of files that should be shown. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#filter() filter()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFilter(com.trolltech.qt.core.QDir.Filters filters)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFilter_Filters(nativeId(), filters.value());
    }
    @QtBlockedSlot
    native void __qt_setFilter_Filters(long __this__nativeId, int filters);

/**
Use {@link com.trolltech.qt.gui.QFileDialog#setNameFilter(java.lang.String) setNameFilter()} instead.
*/

    @QtBlockedSlot
    public final void setFilter(java.lang.String filter)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFilter_String(nativeId(), filter);
    }
    @QtBlockedSlot
    native void __qt_setFilter_String(long __this__nativeId, java.lang.String filter);

/**
Use {@link com.trolltech.qt.gui.QFileDialog#setNameFilters(java.util.List) setNameFilters()} instead. <p><DT><b>See also:</b><br><DD>filters(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFilters(java.util.List<java.lang.String> filters)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFilters_List(nativeId(), filters);
    }
    @QtBlockedSlot
    native void __qt_setFilters_List(long __this__nativeId, java.util.List<java.lang.String> filters);

/**
Sets the browsing history of the filedialog to contain the given <tt>paths</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#history() history()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHistory(java.util.List<java.lang.String> paths)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHistory_List(nativeId(), paths);
    }
    @QtBlockedSlot
    native void __qt_setHistory_List(long __this__nativeId, java.util.List<java.lang.String> paths);

/**
Sets the icon provider used by the filedialog to the specified <tt>provider</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#iconProvider() iconProvider()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setIconProvider(com.trolltech.qt.gui.QFileIconProvider provider)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcIconProvider = provider;
        }
        __qt_setIconProvider_QFileIconProvider(nativeId(), provider == null ? 0 : provider.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setIconProvider_QFileIconProvider(long __this__nativeId, long provider);

/**
Sets the item delegate used to render items in the views in the file dialog to the given <tt>delegate</tt>. <p><b>Warning:</b> You should not share the same instance of a delegate between views. Doing so can cause incorrect or unintuitive editing behavior since each view connected to a given delegate may receive the {@link com.trolltech.qt.gui.QAbstractItemDelegate#closeEditor closeEditor() } signal, and attempt to access, modify or close an editor that has already been closed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#itemDelegate() itemDelegate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setItemDelegate(com.trolltech.qt.gui.QAbstractItemDelegate delegate)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcItemDelegate = delegate;
        }
        __qt_setItemDelegate_QAbstractItemDelegate(nativeId(), delegate == null ? 0 : delegate.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setItemDelegate_QAbstractItemDelegate(long __this__nativeId, long delegate);

/**
Sets the <tt>text</tt> shown in the filedialog in the specified <tt>label</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#labelText(com.trolltech.qt.gui.QFileDialog.DialogLabel) labelText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setLabelText(com.trolltech.qt.gui.QFileDialog.DialogLabel label, java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setLabelText_DialogLabel_String(nativeId(), label.value(), text);
    }
    @QtBlockedSlot
    native void __qt_setLabelText_DialogLabel_String(long __this__nativeId, int label, java.lang.String text);

/**
Sets the filter used in the file dialog to the given <tt>filter</tt>. <p>If <tt>filter</tt> contains a pair of parentheses containing one or more of <b>anything*something</b>, separated by spaces, then only the text contained in the parentheses is used as the filter. This means that these calls are all equivalent: <pre class="snippet">
       dialog.setFilter("All C++ files (*.cpp *.cc *.C *.cxx *.c++)");
       dialog.setFilter("*.cpp;*.cc;*.C;*.cxx;*.c++");
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setNameFilters(java.util.List) setNameFilters()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNameFilter(java.lang.String filter)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNameFilter_String(nativeId(), filter);
    }
    @QtBlockedSlot
    native void __qt_setNameFilter_String(long __this__nativeId, java.lang.String filter);

/**
<p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#isNameFilterDetailsVisible() isNameFilterDetailsVisible()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNameFilterDetailsVisible(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNameFilterDetailsVisible_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setNameFilterDetailsVisible_boolean(long __this__nativeId, boolean enabled);

/**
Sets the <tt>filters</tt> used in the file dialog. <pre class="snippet">
      java.util.ArrayList&lt;String&gt; filters = new java.util.ArrayList&lt;String&gt;();
      filters.add("Image files (*.png *.xpm *.jpg)");
      filters.add("Text files (*.txt)");
      filters.add("Any files (*)");

      QFileDialog dlg = new QFileDialog(this);
      dlg.setFilters(filters);
      dlg.exec();
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#nameFilters() nameFilters()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNameFilters(java.util.List<java.lang.String> filters)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNameFilters_List(nativeId(), filters);
    }
    @QtBlockedSlot
    native void __qt_setNameFilters_List(long __this__nativeId, java.util.List<java.lang.String> filters);


/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QFileDialog#options() options}, and {@link com.trolltech.qt.gui.QFileDialog#testOption(com.trolltech.qt.gui.QFileDialog.Option) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QFileDialog.Option option) {
        setOption(option, (boolean)true);
    }
/**
Sets the given <tt>option</tt> to be enabled if <tt>on</tt> is true; otherwise, clears the given <tt>option</tt>. <p><DT><b>See also:</b><br><DD>{@link QFileDialog#options() options}, and {@link com.trolltech.qt.gui.QFileDialog#testOption(com.trolltech.qt.gui.QFileDialog.Option) testOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setOption(com.trolltech.qt.gui.QFileDialog.Option option, boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOption_Option_boolean(nativeId(), option.value(), on);
    }
    @QtBlockedSlot
    native void __qt_setOption_Option_boolean(long __this__nativeId, int option, boolean on);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QFileDialog.Option ... options) {
        this.setOptions(new com.trolltech.qt.gui.QFileDialog.Options(options));
    }
/**
This property holds the various options that affect the look and feel of the dialog. By default, all options are disabled. <p>Options should be set before showing the dialog. Setting them while the dialog is visible is not guaranteed to have an immediate effect on the dialog (depending on the option and on the platform). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setOption(com.trolltech.qt.gui.QFileDialog.Option) setOption()}, and {@link com.trolltech.qt.gui.QFileDialog#testOption(com.trolltech.qt.gui.QFileDialog.Option) testOption()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="options")
    @QtBlockedSlot
    public final void setOptions(com.trolltech.qt.gui.QFileDialog.Options options)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setOptions_Options(nativeId(), options.value());
    }
    @QtBlockedSlot
    native void __qt_setOptions_Options(long __this__nativeId, int options);

/**
Sets the model for the views to the given <tt>proxyModel</tt>. This is useful if you want to modify the underlying model; for example, to add columns, filter data or add drives. <p>Any existing proxy model will be removed, but not deleted. The file dialog will take ownership of the <tt>proxyModel</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#proxyModel() proxyModel()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setProxyModel(com.trolltech.qt.gui.QAbstractProxyModel model)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setProxyModel_QAbstractProxyModel(nativeId(), model == null ? 0 : model.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setProxyModel_QAbstractProxyModel(long __this__nativeId, long model);

/**
<p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#isReadOnly() isReadOnly()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="readOnly")
    @QtBlockedSlot
    public final void setReadOnly(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setReadOnly_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setReadOnly_boolean(long __this__nativeId, boolean enabled);

/**
<p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#resolveSymlinks() resolveSymlinks()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="resolveSymlinks")
    @QtBlockedSlot
    public final void setResolveSymlinks(boolean enabled)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setResolveSymlinks_boolean(nativeId(), enabled);
    }
    @QtBlockedSlot
    native void __qt_setResolveSymlinks_boolean(long __this__nativeId, boolean enabled);

/**
Sets the <tt>urls</tt> that are located in the sidebar. <p>For instance:<br><br>The following code example is written in c++.<br> <pre class="snippet">
    QList&lt;QUrl&gt; urls;
    urls &lt;&lt; QUrl::fromLocalFile("/home/gvatteka/dev/qt-45")
         &lt;&lt; QUrl::fromLocalFile(QDesktopServices::storageLocation(QDesktopServices::MusicLocation));

    QFileDialog dialog;
    dialog.setSidebarUrls(urls);
    dialog.setFileMode(QFileDialog::AnyFile);
    if(dialog.exec()) {
        // ...
    }
</pre> The file dialog will then look like this: <br><center><img src="../images/filedialogurls.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#sidebarUrls() sidebarUrls()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setSidebarUrls(java.util.List<com.trolltech.qt.core.QUrl> urls)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSidebarUrls_List(nativeId(), urls);
    }
    @QtBlockedSlot
    native void __qt_setSidebarUrls_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QUrl> urls);

/**
This property holds the way files and directories are displayed in the dialog. By default, the <tt>Detail</tt> mode is used to display information about files and directories. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog.ViewMode ViewMode }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="viewMode")
    @QtBlockedSlot
    public final void setViewMode(com.trolltech.qt.gui.QFileDialog.ViewMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setViewMode_ViewMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setViewMode_ViewMode(long __this__nativeId, int mode);

/**
Returns a list of urls that are currently in the sidebar <p><DT><b>See also.</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#setSidebarUrls(java.util.List) setSidebarUrls()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QUrl> sidebarUrls()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sidebarUrls(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QUrl> __qt_sidebarUrls(long __this__nativeId);

/**
Returns true if the given <tt>option</tt> is enabled; otherwise, returns false. <p><DT><b>See also:</b><br><DD>{@link QFileDialog#options() options}, and {@link com.trolltech.qt.gui.QFileDialog#setOption(com.trolltech.qt.gui.QFileDialog.Option) setOption()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean testOption(com.trolltech.qt.gui.QFileDialog.Option option)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_testOption_Option(nativeId(), option.value());
    }
    @QtBlockedSlot
    native boolean __qt_testOption_Option(long __this__nativeId, int option);

/**
This property holds the way files and directories are displayed in the dialog. By default, the <tt>Detail</tt> mode is used to display information about files and directories. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog.ViewMode ViewMode }. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="viewMode")
    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFileDialog.ViewMode viewMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.gui.QFileDialog.ViewMode.resolve(__qt_viewMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_viewMode(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void accept()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_accept(nativeId());
    }
    @QtBlockedSlot
    native void __qt_accept(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected void changeEvent(com.trolltech.qt.core.QEvent e)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changeEvent_QEvent(nativeId(), e == null ? 0 : e.nativeId());
    }
    @QtBlockedSlot
    native void __qt_changeEvent_QEvent(long __this__nativeId, long e);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void done(int result)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_done_int(nativeId(), result);
    }
    @QtBlockedSlot
    native void __qt_done_int(long __this__nativeId, int result);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setVisible_boolean(nativeId(), visible);
    }
    @QtBlockedSlot
    native void __qt_setVisible_boolean(long __this__nativeId, boolean visible);


/**

*/

    public static java.lang.String getExistingDirectory(com.trolltech.qt.gui.QWidget parent, java.lang.String caption, java.lang.String dir, com.trolltech.qt.gui.QFileDialog.Option ... options) {
        return com.trolltech.qt.gui.QFileDialog.getExistingDirectory(parent, caption, dir, new com.trolltech.qt.gui.QFileDialog.Options(options));
    }

/**
This is a convenience static function that will return an existing directory selected by the user. <pre class="snippet">
    String dir = QFileDialog.getExistingDirectory(this, tr("Open Directory"),
                                                    "/home",
                                                    QFileDialog.Option.createQFlags(
                                                    QFileDialog.Option.ShowDirsOnly,
                                                    QFileDialog.Option.DontResolveSymlinks));
</pre> This function creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <p>The dialog's working directory is set to <tt>dir</tt>, and the caption is set to <tt>caption</tt>. Either of these may be an empty string in which case the current directory and a default caption will be used respectively. <p>The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. Note that {@link com.trolltech.qt.gui.QFileDialog.Option ShowDirsOnly } must be set to ensure a native file dialog. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. On Mac OS X, the <tt>dir</tt> argument is ignored, the native dialog always displays the last visited directory. On Windows CE, if the device has no native file dialog, a QFileDialog will be used. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. If <tt>options</tt> includes {@link com.trolltech.qt.gui.QFileDialog.Option DontResolveSymlinks }, the file dialog will treat symlinks as regular directories. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any QTimers, and if parent is not 0 then it will position the dialog just under the parent's title bar. <p><b>Warning:</b> Do not delete <tt>parent</tt> during the execution of the dialog. If you want to do this, you should create the dialog yourself using one of the QFileDialog constructors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileName()}, {@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileNames()}, and {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getSaveFileName()}. <br></DD></DT>
*/

    public static java.lang.String getExistingDirectory(com.trolltech.qt.gui.QWidget parent, java.lang.String caption, java.lang.String dir) {
        return getExistingDirectory(parent, caption, dir, new com.trolltech.qt.gui.QFileDialog.Options(1));
    }

/**
This is a convenience static function that will return an existing directory selected by the user. <pre class="snippet">
    String dir = QFileDialog.getExistingDirectory(this, tr("Open Directory"),
                                                    "/home",
                                                    QFileDialog.Option.createQFlags(
                                                    QFileDialog.Option.ShowDirsOnly,
                                                    QFileDialog.Option.DontResolveSymlinks));
</pre> This function creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <p>The dialog's working directory is set to <tt>dir</tt>, and the caption is set to <tt>caption</tt>. Either of these may be an empty string in which case the current directory and a default caption will be used respectively. <p>The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. Note that {@link com.trolltech.qt.gui.QFileDialog.Option ShowDirsOnly } must be set to ensure a native file dialog. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. On Mac OS X, the <tt>dir</tt> argument is ignored, the native dialog always displays the last visited directory. On Windows CE, if the device has no native file dialog, a QFileDialog will be used. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. If <tt>options</tt> includes {@link com.trolltech.qt.gui.QFileDialog.Option DontResolveSymlinks }, the file dialog will treat symlinks as regular directories. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any QTimers, and if parent is not 0 then it will position the dialog just under the parent's title bar. <p><b>Warning:</b> Do not delete <tt>parent</tt> during the execution of the dialog. If you want to do this, you should create the dialog yourself using one of the QFileDialog constructors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileName()}, {@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileNames()}, and {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getSaveFileName()}. <br></DD></DT>
*/

    public static java.lang.String getExistingDirectory(com.trolltech.qt.gui.QWidget parent, java.lang.String caption) {
        return getExistingDirectory(parent, caption, (java.lang.String)null, new com.trolltech.qt.gui.QFileDialog.Options(1));
    }

/**
This is a convenience static function that will return an existing directory selected by the user. <pre class="snippet">
    String dir = QFileDialog.getExistingDirectory(this, tr("Open Directory"),
                                                    "/home",
                                                    QFileDialog.Option.createQFlags(
                                                    QFileDialog.Option.ShowDirsOnly,
                                                    QFileDialog.Option.DontResolveSymlinks));
</pre> This function creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <p>The dialog's working directory is set to <tt>dir</tt>, and the caption is set to <tt>caption</tt>. Either of these may be an empty string in which case the current directory and a default caption will be used respectively. <p>The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. Note that {@link com.trolltech.qt.gui.QFileDialog.Option ShowDirsOnly } must be set to ensure a native file dialog. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. On Mac OS X, the <tt>dir</tt> argument is ignored, the native dialog always displays the last visited directory. On Windows CE, if the device has no native file dialog, a QFileDialog will be used. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. If <tt>options</tt> includes {@link com.trolltech.qt.gui.QFileDialog.Option DontResolveSymlinks }, the file dialog will treat symlinks as regular directories. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any QTimers, and if parent is not 0 then it will position the dialog just under the parent's title bar. <p><b>Warning:</b> Do not delete <tt>parent</tt> during the execution of the dialog. If you want to do this, you should create the dialog yourself using one of the QFileDialog constructors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileName()}, {@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileNames()}, and {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getSaveFileName()}. <br></DD></DT>
*/

    public static java.lang.String getExistingDirectory(com.trolltech.qt.gui.QWidget parent) {
        return getExistingDirectory(parent, (java.lang.String)null, (java.lang.String)null, new com.trolltech.qt.gui.QFileDialog.Options(1));
    }

/**
This is a convenience static function that will return an existing directory selected by the user. <pre class="snippet">
    String dir = QFileDialog.getExistingDirectory(this, tr("Open Directory"),
                                                    "/home",
                                                    QFileDialog.Option.createQFlags(
                                                    QFileDialog.Option.ShowDirsOnly,
                                                    QFileDialog.Option.DontResolveSymlinks));
</pre> This function creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <p>The dialog's working directory is set to <tt>dir</tt>, and the caption is set to <tt>caption</tt>. Either of these may be an empty string in which case the current directory and a default caption will be used respectively. <p>The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. Note that {@link com.trolltech.qt.gui.QFileDialog.Option ShowDirsOnly } must be set to ensure a native file dialog. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. On Mac OS X, the <tt>dir</tt> argument is ignored, the native dialog always displays the last visited directory. On Windows CE, if the device has no native file dialog, a QFileDialog will be used. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. If <tt>options</tt> includes {@link com.trolltech.qt.gui.QFileDialog.Option DontResolveSymlinks }, the file dialog will treat symlinks as regular directories. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any QTimers, and if parent is not 0 then it will position the dialog just under the parent's title bar. <p><b>Warning:</b> Do not delete <tt>parent</tt> during the execution of the dialog. If you want to do this, you should create the dialog yourself using one of the QFileDialog constructors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileName()}, {@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileNames()}, and {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getSaveFileName()}. <br></DD></DT>
*/

    public static java.lang.String getExistingDirectory() {
        return getExistingDirectory((com.trolltech.qt.gui.QWidget)null, (java.lang.String)null, (java.lang.String)null, new com.trolltech.qt.gui.QFileDialog.Options(1));
    }
/**
This is a convenience static function that will return an existing directory selected by the user. <pre class="snippet">
    String dir = QFileDialog.getExistingDirectory(this, tr("Open Directory"),
                                                    "/home",
                                                    QFileDialog.Option.createQFlags(
                                                    QFileDialog.Option.ShowDirsOnly,
                                                    QFileDialog.Option.DontResolveSymlinks));
</pre> This function creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <p>The dialog's working directory is set to <tt>dir</tt>, and the caption is set to <tt>caption</tt>. Either of these may be an empty string in which case the current directory and a default caption will be used respectively. <p>The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. Note that {@link com.trolltech.qt.gui.QFileDialog.Option ShowDirsOnly } must be set to ensure a native file dialog. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. On Mac OS X, the <tt>dir</tt> argument is ignored, the native dialog always displays the last visited directory. On Windows CE, if the device has no native file dialog, a QFileDialog will be used. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. If <tt>options</tt> includes {@link com.trolltech.qt.gui.QFileDialog.Option DontResolveSymlinks }, the file dialog will treat symlinks as regular directories. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any QTimers, and if parent is not 0 then it will position the dialog just under the parent's title bar. <p><b>Warning:</b> Do not delete <tt>parent</tt> during the execution of the dialog. If you want to do this, you should create the dialog yourself using one of the QFileDialog constructors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileName()}, {@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileNames()}, and {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getSaveFileName()}. <br></DD></DT>
*/

    public static java.lang.String getExistingDirectory(com.trolltech.qt.gui.QWidget parent, java.lang.String caption, java.lang.String dir, com.trolltech.qt.gui.QFileDialog.Options options)    {
        return __qt_getExistingDirectory_QWidget_String_String_Options(parent == null ? 0 : parent.nativeId(), caption, dir, options.value());
    }
    native static java.lang.String __qt_getExistingDirectory_QWidget_String_String_Options(long parent, java.lang.String caption, java.lang.String dir, int options);


    private static java.lang.String getOpenFileName(com.trolltech.qt.gui.QWidget parent, java.lang.String caption, java.lang.String dir, java.lang.String filter, com.trolltech.qt.QNativePointer selectedFilter, com.trolltech.qt.gui.QFileDialog.Option ... options) {
        return com.trolltech.qt.gui.QFileDialog.getOpenFileName(parent, caption, dir, filter, selectedFilter, new com.trolltech.qt.gui.QFileDialog.Options(options));
    }
    private static java.lang.String getOpenFileName(com.trolltech.qt.gui.QWidget parent, java.lang.String caption, java.lang.String dir, java.lang.String filter, com.trolltech.qt.QNativePointer selectedFilter, com.trolltech.qt.gui.QFileDialog.Options options)    {
        return __qt_getOpenFileName_QWidget_String_String_String_nativepointer_Options(parent == null ? 0 : parent.nativeId(), caption, dir, filter, selectedFilter, options.value());
    }
    native static java.lang.String __qt_getOpenFileName_QWidget_String_String_String_nativepointer_Options(long parent, java.lang.String caption, java.lang.String dir, java.lang.String filter, com.trolltech.qt.QNativePointer selectedFilter, int options);


    private static java.util.List<java.lang.String> getOpenFileNames(com.trolltech.qt.gui.QWidget parent, java.lang.String caption, java.lang.String dir, java.lang.String filter, com.trolltech.qt.QNativePointer selectedFilter, com.trolltech.qt.gui.QFileDialog.Option ... options) {
        return com.trolltech.qt.gui.QFileDialog.getOpenFileNames(parent, caption, dir, filter, selectedFilter, new com.trolltech.qt.gui.QFileDialog.Options(options));
    }
    private static java.util.List<java.lang.String> getOpenFileNames(com.trolltech.qt.gui.QWidget parent, java.lang.String caption, java.lang.String dir, java.lang.String filter, com.trolltech.qt.QNativePointer selectedFilter, com.trolltech.qt.gui.QFileDialog.Options options)    {
        return __qt_getOpenFileNames_QWidget_String_String_String_nativepointer_Options(parent == null ? 0 : parent.nativeId(), caption, dir, filter, selectedFilter, options.value());
    }
    native static java.util.List<java.lang.String> __qt_getOpenFileNames_QWidget_String_String_String_nativepointer_Options(long parent, java.lang.String caption, java.lang.String dir, java.lang.String filter, com.trolltech.qt.QNativePointer selectedFilter, int options);


    private static java.lang.String getSaveFileName(com.trolltech.qt.gui.QWidget parent, java.lang.String caption, java.lang.String dir, java.lang.String filter, com.trolltech.qt.QNativePointer selectedFilter, com.trolltech.qt.gui.QFileDialog.Option ... options) {
        return com.trolltech.qt.gui.QFileDialog.getSaveFileName(parent, caption, dir, filter, selectedFilter, new com.trolltech.qt.gui.QFileDialog.Options(options));
    }
    private static java.lang.String getSaveFileName(com.trolltech.qt.gui.QWidget parent, java.lang.String caption, java.lang.String dir, java.lang.String filter, com.trolltech.qt.QNativePointer selectedFilter, com.trolltech.qt.gui.QFileDialog.Options options)    {
        return __qt_getSaveFileName_QWidget_String_String_String_nativepointer_Options(parent == null ? 0 : parent.nativeId(), caption, dir, filter, selectedFilter, options.value());
    }
    native static java.lang.String __qt_getSaveFileName_QWidget_String_String_String_nativepointer_Options(long parent, java.lang.String caption, java.lang.String dir, java.lang.String filter, com.trolltech.qt.QNativePointer selectedFilter, int options);

/**
@exclude
*/

    public static native QFileDialog fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFileDialog(QPrivateConstructor p) { super(p); } 

    public static class Filter {
        public Filter(String filter) {
            this.filter = filter;
        }

        public String filter;
        public String selectedFilter = "";
    };


    // TEMPLATE - gui.filedialog_get_xxx_filename - START
/**
This is a convenience static function that returns an existing file selected by the user. If the user presses Cancel, it returns a null string. <pre class="snippet">
    String fName = QFileDialog.getOpenFileName(this, tr("Open File"),
                                                    "/home",
                                                    new QFileDialog.Filter(tr("Images (*.png *.xpm *.jpg)")));
</pre> The function creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <p>The file dialog's working directory will be set to <tt>dir</tt>. If <tt>dir</tt> includes a file name, the file will be selected. Only files that match the given <tt>filter</tt> are shown. The filter selected is set to <tt>selectedFilter</tt>. The parameters <tt>dir</tt>, <tt>selectedFilter</tt>, and <tt>filter</tt> may be empty strings. The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. <p>The dialog's caption is set to <tt>caption</tt>. If <tt>caption</tt> is not specified then a default caption will be used. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any {@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) QTimers}, and if parent is not 0 then it will position the dialog just under the parent's title bar. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. If <tt>options</tt> includes {@link com.trolltech.qt.gui.QFileDialog.Option DontResolveSymlinks }, the file dialog will treat symlinks as regular directories. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileNames()}, {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getSaveFileName()}, and {@link com.trolltech.qt.gui.QFileDialog#getExistingDirectory(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Option[]) getExistingDirectory()}. <br></DD></DT>
*/

    public static String getOpenFileName(QWidget parent, String caption, String dir, Filter filter, Options options) {
        QNativePointer np = filter != null ? new QNativePointer(QNativePointer.Type.String) : null;
        String returned = getOpenFileName(parent, caption, dir, filter != null ? filter.filter : "", np, options);
        if (filter != null)
            filter.selectedFilter = np.stringValue();
        return returned;
    }

/**
This is a convenience static function that returns an existing file selected by the user. If the user presses Cancel, it returns a null string. <pre class="snippet">
    String fName = QFileDialog.getOpenFileName(this, tr("Open File"),
                                                    "/home",
                                                    new QFileDialog.Filter(tr("Images (*.png *.xpm *.jpg)")));
</pre> The function creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <p>The file dialog's working directory will be set to <tt>dir</tt>. If <tt>dir</tt> includes a file name, the file will be selected. Only files that match the given <tt>filter</tt> are shown. The filter selected is set to <tt>selectedFilter</tt>. The parameters <tt>dir</tt>, <tt>selectedFilter</tt>, and <tt>filter</tt> may be empty strings. The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. <p>The dialog's caption is set to <tt>caption</tt>. If <tt>caption</tt> is not specified then a default caption will be used. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any {@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) QTimers}, and if parent is not 0 then it will position the dialog just under the parent's title bar. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. If <tt>options</tt> includes {@link com.trolltech.qt.gui.QFileDialog.Option DontResolveSymlinks }, the file dialog will treat symlinks as regular directories. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileNames()}, {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getSaveFileName()}, and {@link com.trolltech.qt.gui.QFileDialog#getExistingDirectory(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Option[]) getExistingDirectory()}. <br></DD></DT>
*/

    public static String getOpenFileName(QWidget parent, String caption, String dir, Filter filter, Option ... options) {
        QNativePointer np = filter != null ? new QNativePointer(QNativePointer.Type.String) : null;
        String returned = getOpenFileName(parent, caption, dir, filter != null ? filter.filter : "", np, options);
        if (filter != null)
            filter.selectedFilter = np.stringValue();
        return returned;
    }

/**
This is a convenience static function that returns an existing file selected by the user. If the user presses Cancel, it returns a null string. <pre class="snippet">
    String fName = QFileDialog.getOpenFileName(this, tr("Open File"),
                                                    "/home",
                                                    new QFileDialog.Filter(tr("Images (*.png *.xpm *.jpg)")));
</pre> The function creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <p>The file dialog's working directory will be set to <tt>dir</tt>. If <tt>dir</tt> includes a file name, the file will be selected. Only files that match the given <tt>filter</tt> are shown. The filter selected is set to <tt>selectedFilter</tt>. The parameters <tt>dir</tt>, <tt>selectedFilter</tt>, and <tt>filter</tt> may be empty strings. The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. <p>The dialog's caption is set to <tt>caption</tt>. If <tt>caption</tt> is not specified then a default caption will be used. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any {@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) QTimers}, and if parent is not 0 then it will position the dialog just under the parent's title bar. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. If <tt>options</tt> includes {@link com.trolltech.qt.gui.QFileDialog.Option DontResolveSymlinks }, the file dialog will treat symlinks as regular directories. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileNames()}, {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getSaveFileName()}, and {@link com.trolltech.qt.gui.QFileDialog#getExistingDirectory(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Option[]) getExistingDirectory()}. <br></DD></DT>
*/

    public static String getOpenFileName(QWidget parent, String caption, String dir, Filter filter) {
        return getOpenFileName(parent, caption, dir, filter, new Options(0));
    }

/**
This is an overloaded function provided for convenience.
*/

    public static String getOpenFileName(QWidget parent, String caption, String dir) {
        return getOpenFileName(parent, caption, dir, null);
    }

/**
This is an overloaded function provided for convenience.
*/

    public static String getOpenFileName(QWidget parent, String caption) {
        return getOpenFileName(parent, caption, "");
    }

/**
This is an overloaded function provided for convenience.
*/

    public static String getOpenFileName(QWidget parent) {
        return getOpenFileName(parent, "");
    }

/**
This is an overloaded function provided for convenience.
*/

    public static String getOpenFileName() {
        return getOpenFileName(null);
    }

    // TEMPLATE - gui.filedialog_get_xxx_filename - END


    // TEMPLATE - gui.filedialog_get_xxx_filename - START
/**
This is a convenience static function that will return one or more existing files selected by the user. <pre class="snippet">
    java.util.List&lt;String&gt; files = QFileDialog.getOpenFileNames(
                            this,
                            "Select one or more files to open",
                            "/home",
                            new QFileDialog.Filter("Images (*.png *.xpm *.jpg)"));
</pre> This function creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <p>The file dialog's working directory will be set to <tt>dir</tt>. If <tt>dir</tt> includes a file name, the file will be selected. The filter is set to <tt>filter</tt> so that only those files which match the filter are shown. The filter selected is set to <tt>selectedFilter</tt>. The parameters <tt>dir</tt>, <tt>selectedFilter</tt> and <tt>filter</tt> may be empty strings. <p>The dialog's caption is set to <tt>caption</tt>. If <tt>caption</tt> is not specified then a default caption will be used. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. On Mac OS X, the <tt>dir</tt> argument is ignored, the native dialog always displays the last visited directory. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any {@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) QTimers}, and if parent is not 0 then it will position the dialog just under the parent's title bar. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. <p>Note that if you want to iterate over the list of files, you should iterate over a copy. For example: <pre class="snippet">
    java.util.List&lt;String&gt; list = files;
    java.util.ListIterator it = list.listIterator();
    while(it.hasNext()) {
        myProcessing(it.next());
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileName()}, {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getSaveFileName()}, and {@link com.trolltech.qt.gui.QFileDialog#getExistingDirectory(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Option[]) getExistingDirectory()}. <br></DD></DT>
*/

    public static java.util.List<String> getOpenFileNames(QWidget parent, String caption, String dir, Filter filter, Options options) {
        QNativePointer np = filter != null ? new QNativePointer(QNativePointer.Type.String) : null;
        java.util.List<String> returned = getOpenFileNames(parent, caption, dir, filter != null ? filter.filter : "", np, options);
        if (filter != null)
            filter.selectedFilter = np.stringValue();
        return returned;
    }

/**
This is a convenience static function that will return one or more existing files selected by the user. <pre class="snippet">
    java.util.List&lt;String&gt; files = QFileDialog.getOpenFileNames(
                            this,
                            "Select one or more files to open",
                            "/home",
                            new QFileDialog.Filter("Images (*.png *.xpm *.jpg)"));
</pre> This function creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <p>The file dialog's working directory will be set to <tt>dir</tt>. If <tt>dir</tt> includes a file name, the file will be selected. The filter is set to <tt>filter</tt> so that only those files which match the filter are shown. The filter selected is set to <tt>selectedFilter</tt>. The parameters <tt>dir</tt>, <tt>selectedFilter</tt> and <tt>filter</tt> may be empty strings. <p>The dialog's caption is set to <tt>caption</tt>. If <tt>caption</tt> is not specified then a default caption will be used. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. On Mac OS X, the <tt>dir</tt> argument is ignored, the native dialog always displays the last visited directory. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any {@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) QTimers}, and if parent is not 0 then it will position the dialog just under the parent's title bar. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. <p>Note that if you want to iterate over the list of files, you should iterate over a copy. For example: <pre class="snippet">
    java.util.List&lt;String&gt; list = files;
    java.util.ListIterator it = list.listIterator();
    while(it.hasNext()) {
        myProcessing(it.next());
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileName()}, {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getSaveFileName()}, and {@link com.trolltech.qt.gui.QFileDialog#getExistingDirectory(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Option[]) getExistingDirectory()}. <br></DD></DT>
*/

    public static java.util.List<String> getOpenFileNames(QWidget parent, String caption, String dir, Filter filter, Option ... options) {
        QNativePointer np = filter != null ? new QNativePointer(QNativePointer.Type.String) : null;
        java.util.List<String> returned = getOpenFileNames(parent, caption, dir, filter != null ? filter.filter : "", np, options);
        if (filter != null)
            filter.selectedFilter = np.stringValue();
        return returned;
    }

/**
This is a convenience static function that will return one or more existing files selected by the user. <pre class="snippet">
    java.util.List&lt;String&gt; files = QFileDialog.getOpenFileNames(
                            this,
                            "Select one or more files to open",
                            "/home",
                            new QFileDialog.Filter("Images (*.png *.xpm *.jpg)"));
</pre> This function creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <p>The file dialog's working directory will be set to <tt>dir</tt>. If <tt>dir</tt> includes a file name, the file will be selected. The filter is set to <tt>filter</tt> so that only those files which match the filter are shown. The filter selected is set to <tt>selectedFilter</tt>. The parameters <tt>dir</tt>, <tt>selectedFilter</tt> and <tt>filter</tt> may be empty strings. <p>The dialog's caption is set to <tt>caption</tt>. If <tt>caption</tt> is not specified then a default caption will be used. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. On Mac OS X, the <tt>dir</tt> argument is ignored, the native dialog always displays the last visited directory. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any {@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) QTimers}, and if parent is not 0 then it will position the dialog just under the parent's title bar. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. <p>Note that if you want to iterate over the list of files, you should iterate over a copy. For example: <pre class="snippet">
    java.util.List&lt;String&gt; list = files;
    java.util.ListIterator it = list.listIterator();
    while(it.hasNext()) {
        myProcessing(it.next());
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileName()}, {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getSaveFileName()}, and {@link com.trolltech.qt.gui.QFileDialog#getExistingDirectory(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Option[]) getExistingDirectory()}. <br></DD></DT>
*/

    public static java.util.List<String> getOpenFileNames(QWidget parent, String caption, String dir, Filter filter) {
        return getOpenFileNames(parent, caption, dir, filter, new Options(0));
    }

/**
This is an overloaded function provided for convenience.
*/

    public static java.util.List<String> getOpenFileNames(QWidget parent, String caption, String dir) {
        return getOpenFileNames(parent, caption, dir, null);
    }

/**
This is an overloaded function provided for convenience.
*/

    public static java.util.List<String> getOpenFileNames(QWidget parent, String caption) {
        return getOpenFileNames(parent, caption, "");
    }

/**
This is an overloaded function provided for convenience.
*/

    public static java.util.List<String> getOpenFileNames(QWidget parent) {
        return getOpenFileNames(parent, "");
    }

/**
This is an overloaded function provided for convenience.
*/

    public static java.util.List<String> getOpenFileNames() {
        return getOpenFileNames(null);
    }

    // TEMPLATE - gui.filedialog_get_xxx_filename - END


    // TEMPLATE - gui.filedialog_get_xxx_filename - START
/**
This is a convenience static function that will return a file name selected by the user. The file does not have to exist. <p>It creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <pre class="snippet">
    String saveName = QFileDialog.getSaveFileName(this, tr("Save File"),
                               "/home/jana/untitled.png",
                               new QFileDialog.Filter(tr("Images (*.png *.xpm *.jpg)")));
</pre> The file dialog's working directory will be set to <tt>dir</tt>. If <tt>dir</tt> includes a file name, the file will be selected. Only files that match the <tt>filter</tt> are shown. The filter selected is set to <tt>selectedFilter</tt>. The parameters <tt>dir</tt>, <tt>selectedFilter</tt>, and <tt>filter</tt> may be empty strings. The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. <p>The default filter can be chosen by setting <tt>selectedFilter</tt> to the desired value. <p>The dialog's caption is set to <tt>caption</tt>. If <tt>caption</tt> is not specified then a default caption will be used. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) QTimers}, and if parent is not 0 then it will position the dialog just under the parent's title bar. On Mac OS X, the filter argument is ignored. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. If <tt>options</tt> includes {@link com.trolltech.qt.gui.QFileDialog.Option DontResolveSymlinks }, the file dialog will treat symlinks as regular directories. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileName()}, {@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileNames()}, and {@link com.trolltech.qt.gui.QFileDialog#getExistingDirectory(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Option[]) getExistingDirectory()}. <br></DD></DT>
*/

    public static String getSaveFileName(QWidget parent, String caption, String dir, Filter filter, Options options) {
        QNativePointer np = filter != null ? new QNativePointer(QNativePointer.Type.String) : null;
        String returned = getSaveFileName(parent, caption, dir, filter != null ? filter.filter : "", np, options);
        if (filter != null)
            filter.selectedFilter = np.stringValue();
        return returned;
    }

/**
This is a convenience static function that will return a file name selected by the user. The file does not have to exist. <p>It creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <pre class="snippet">
    String saveName = QFileDialog.getSaveFileName(this, tr("Save File"),
                               "/home/jana/untitled.png",
                               new QFileDialog.Filter(tr("Images (*.png *.xpm *.jpg)")));
</pre> The file dialog's working directory will be set to <tt>dir</tt>. If <tt>dir</tt> includes a file name, the file will be selected. Only files that match the <tt>filter</tt> are shown. The filter selected is set to <tt>selectedFilter</tt>. The parameters <tt>dir</tt>, <tt>selectedFilter</tt>, and <tt>filter</tt> may be empty strings. The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. <p>The default filter can be chosen by setting <tt>selectedFilter</tt> to the desired value. <p>The dialog's caption is set to <tt>caption</tt>. If <tt>caption</tt> is not specified then a default caption will be used. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) QTimers}, and if parent is not 0 then it will position the dialog just under the parent's title bar. On Mac OS X, the filter argument is ignored. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. If <tt>options</tt> includes {@link com.trolltech.qt.gui.QFileDialog.Option DontResolveSymlinks }, the file dialog will treat symlinks as regular directories. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileName()}, {@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileNames()}, and {@link com.trolltech.qt.gui.QFileDialog#getExistingDirectory(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Option[]) getExistingDirectory()}. <br></DD></DT>
*/

    public static String getSaveFileName(QWidget parent, String caption, String dir, Filter filter, Option ... options) {
        QNativePointer np = filter != null ? new QNativePointer(QNativePointer.Type.String) : null;
        String returned = getSaveFileName(parent, caption, dir, filter != null ? filter.filter : "", np, options);
        if (filter != null)
            filter.selectedFilter = np.stringValue();
        return returned;
    }

/**
This is a convenience static function that will return a file name selected by the user. The file does not have to exist. <p>It creates a modal file dialog with the given <tt>parent</tt> widget. If the parent is not 0, the dialog will be shown centered over the parent widget. <pre class="snippet">
    String saveName = QFileDialog.getSaveFileName(this, tr("Save File"),
                               "/home/jana/untitled.png",
                               new QFileDialog.Filter(tr("Images (*.png *.xpm *.jpg)")));
</pre> The file dialog's working directory will be set to <tt>dir</tt>. If <tt>dir</tt> includes a file name, the file will be selected. Only files that match the <tt>filter</tt> are shown. The filter selected is set to <tt>selectedFilter</tt>. The parameters <tt>dir</tt>, <tt>selectedFilter</tt>, and <tt>filter</tt> may be empty strings. The <tt>options</tt> argument holds various options about how to run the dialog, see the {@link com.trolltech.qt.gui.QFileDialog.Option QFileDialog::Option } enum for more information on the flags you can pass. <p>The default filter can be chosen by setting <tt>selectedFilter</tt> to the desired value. <p>The dialog's caption is set to <tt>caption</tt>. If <tt>caption</tt> is not specified then a default caption will be used. <p>Under Windows and Mac OS X, this static function will use the native file dialog and not a QFileDialog. <p>Note that on Windows the dialog will spin a blocking modal event loop that will not dispatch any {@link com.trolltech.qt.gui.QFileDialog#getSaveFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) QTimers}, and if parent is not 0 then it will position the dialog just under the parent's title bar. On Mac OS X, the filter argument is ignored. <p>Under Unix/X11, the normal behavior of the file dialog is to resolve and follow symlinks. For example, if <tt>/usr/tmp</tt> is a symlink to <tt>/var/tmp</tt>, the file dialog will change to <tt>/var/tmp</tt> after entering <tt>/usr/tmp</tt>. If <tt>options</tt> includes {@link com.trolltech.qt.gui.QFileDialog.Option DontResolveSymlinks }, the file dialog will treat symlinks as regular directories. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QFileDialog#getOpenFileName(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileName()}, {@link com.trolltech.qt.gui.QFileDialog#getOpenFileNames(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Filter, com.trolltech.qt.gui.QFileDialog.Options) getOpenFileNames()}, and {@link com.trolltech.qt.gui.QFileDialog#getExistingDirectory(com.trolltech.qt.gui.QWidget, java.lang.String, java.lang.String, com.trolltech.qt.gui.QFileDialog.Option[]) getExistingDirectory()}. <br></DD></DT>
*/

    public static String getSaveFileName(QWidget parent, String caption, String dir, Filter filter) {
        return getSaveFileName(parent, caption, dir, filter, new Options(0));
    }

/**
This is an overloaded function provided for convenience.
*/

    public static String getSaveFileName(QWidget parent, String caption, String dir) {
        return getSaveFileName(parent, caption, dir, null);
    }

/**
This is an overloaded function provided for convenience.
*/

    public static String getSaveFileName(QWidget parent, String caption) {
        return getSaveFileName(parent, caption, "");
    }

/**
This is an overloaded function provided for convenience.
*/

    public static String getSaveFileName(QWidget parent) {
        return getSaveFileName(parent, "");
    }

/**
This is an overloaded function provided for convenience.
*/

    public static String getSaveFileName() {
        return getSaveFileName(null);
    }

    // TEMPLATE - gui.filedialog_get_xxx_filename - END

}
