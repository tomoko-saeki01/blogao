package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QIcon class provides scalable icons in different modes and states. A QIcon can generate smaller, larger, active, and disabled pixmaps from the set of pixmaps it is given. Such pixmaps are used by Qt widgets to show an icon representing a particular action. <p>The simplest use of QIcon is to create one from a {@link com.trolltech.qt.gui.QPixmap QPixmap} file or resource, and then use it, allowing Qt to work out all the required icon styles and sizes. For example: <pre class="snippet">
        QToolButton button = new QToolButton();
        button.setIcon(new QIcon("open.xpm"));
</pre> To undo a QIcon, simply set a null icon in its place: <pre class="snippet">
        button.setIcon(null);
</pre> Use the {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() QImageReader::supportedImageFormats()} and {@link com.trolltech.qt.gui.QImageWriter#supportedImageFormats() QImageWriter::supportedImageFormats()} functions to retrieve a complete list of the supported file formats. <p>When you retrieve a pixmap using pixmap({@link com.trolltech.qt.core.QSize QSize}, Mode, State), and no pixmap for this given size, mode and state has been added with {@link com.trolltech.qt.gui.QIcon#addFile(java.lang.String, com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) addFile()} or {@link com.trolltech.qt.gui.QIcon#addPixmap(com.trolltech.qt.gui.QPixmap, com.trolltech.qt.gui.QIcon.Mode) addPixmap()}, then QIcon will generate one on the fly. This pixmap generation happens in a {@link com.trolltech.qt.gui.QIconEngineV2 QIconEngineV2}. The default engine scales pixmaps down if required, but never up, and it uses the current style to calculate a disabled appearance. By using custom icon engines, you can customize every aspect of generated icons. With {@link com.trolltech.qt.gui.QIconEnginePluginV2 QIconEnginePluginV2} it is possible to register different icon engines for different file suffixes, making it possible for third parties to provide additional icon engines to those included with Qt. <p><b>Note:</b> Since Qt 4.2, an icon engine that supports SVG is included.<a name="making-classes-that-use-qicon"><h2>Making Classes that Use QIcon</h2> If you write your own widgets that have an option to set a small pixmap, consider allowing a QIcon to be set for that pixmap. The Qt class {@link com.trolltech.qt.gui.QToolButton QToolButton} is an example of such a widget. <p>Provide a method to set a QIcon, and when you draw the icon, choose whichever pixmap is appropriate for the current state of your widget. For example: <pre class="snippet">
    void drawIcon(QPainter ainter, QPoint pos)
    {
        QPixmap pixmap = icon.pixmap(new QSize(22, 22),
                                     isEnabled() ? QIcon.Mode.Normal : QIcon.Mode.Disabled,
                                     isOn() ? QIcon.State.On : QIcon.State.Off);
        painter.drawPixmap(pos, pixmap);
    }
</pre> You might also make use of the <tt>Active</tt> mode, perhaps making your widget <tt>Active</tt> when the mouse is over the widget (see {@link com.trolltech.qt.gui.QWidget#enterEvent(com.trolltech.qt.core.QEvent) QWidget::enterEvent()}), while the mouse is pressed pending the release that will activate the function, or when it is the currently selected item. If the widget can be toggled, the "On" mode might be used to draw a different icon. <br><center><img src="../images/icon.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link <a href="../guibooks.html">GUI Design Handbook: Iconic Label</a>}, and {@link <a href="../qtjambi-icons.html">Icons Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QIcon extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
This enum type describes the mode for which a pixmap is intended to be used. The currently defined modes are:
*/

    public enum Mode implements com.trolltech.qt.QtEnumerator {
/**
 Display the pixmap when the user is not interacting with the icon, but the functionality represented by the icon is available.
*/

        Normal(0),
/**
 Display the pixmap when the functionality represented by the icon is not available.
*/

        Disabled(1),
/**
 Display the pixmap when the functionality represented by the icon is available and the user is interacting with the icon, for example, moving the mouse over it or clicking it.
*/

        Active(2),
/**
 Display the pixmap when the item represented by the icon is selected.
*/

        Selected(3);

        Mode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QIcon$Mode constant with the specified <tt>int</tt>.</brief>
*/

        public static Mode resolve(int value) {
            return (Mode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Normal;
            case 1: return Disabled;
            case 2: return Active;
            case 3: return Selected;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum describes the state for which a pixmap is intended to be used. The state can be:
*/

    public enum State implements com.trolltech.qt.QtEnumerator {
/**
 Display the pixmap when the widget is in an "on" state
*/

        On(0),
/**
 Display the pixmap when the widget is in an "off" state
*/

        Off(1);

        State(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QIcon$State constant with the specified <tt>int</tt>.</brief>
*/

        public static State resolve(int value) {
            return (State) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return On;
            case 1: return Off;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a null icon.
*/

    public QIcon(){
        super((QPrivateConstructor)null);
        __qt_QIcon();
    }

    native void __qt_QIcon();

/**
Creates an icon with a specific icon <tt>engine</tt>. The icon takes ownership of the engine.
*/

    public QIcon(com.trolltech.qt.gui.QIconEngine engine){
        super((QPrivateConstructor)null);
        if (engine != null) {
            engine.disableGarbageCollection();
        }
        __qt_QIcon_QIconEngine(engine == null ? 0 : engine.nativeId());
    }

    native void __qt_QIcon_QIconEngine(long engine);

/**
Creates an icon with a specific icon <tt>engine</tt>. The icon takes ownership of the engine.
*/

    public QIcon(com.trolltech.qt.gui.QIconEngineV2 engine){
        super((QPrivateConstructor)null);
        if (engine != null) {
            engine.disableGarbageCollection();
        }
        __qt_QIcon_QIconEngineV2(engine == null ? 0 : engine.nativeId());
    }

    native void __qt_QIcon_QIconEngineV2(long engine);

/**
Constructs a copy of <tt>other</tt>. This is very fast.
*/

    public QIcon(com.trolltech.qt.gui.QIcon other){
        super((QPrivateConstructor)null);
        __qt_QIcon_QIcon(other == null ? 0 : other.nativeId());
    }

    native void __qt_QIcon_QIcon(long other);

/**
Constructs an icon from a <tt>pixmap</tt>.
*/

    public QIcon(com.trolltech.qt.gui.QPixmap pixmap){
        super((QPrivateConstructor)null);
        __qt_QIcon_QPixmap(pixmap == null ? 0 : pixmap.nativeId());
    }

    native void __qt_QIcon_QPixmap(long pixmap);

/**
Constructs an icon from the file with the given <tt>fileName</tt>. The file will be loaded on demand. <p>If <tt>fileName</tt> contains a relative path (e.g. the filename only) the relevant file must be found relative to the runtime working directory. <p>The file name can be either refer to an actual file on disk or to one of the application's embedded resources. See the {@link <a href="../resources.html">Resource System</a>} overview for details on how to embed images and other resource files in the application's executable. <p>Use the {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() QImageReader::supportedImageFormats()} and {@link com.trolltech.qt.gui.QImageWriter#supportedImageFormats() QImageWriter::supportedImageFormats()} functions to retrieve a complete list of the supported file formats.
*/

    public QIcon(java.lang.String fileName){
        super((QPrivateConstructor)null);
        __qt_QIcon_String(fileName);
    }

    native void __qt_QIcon_String(java.lang.String fileName);


/**
Returns the actual size of the icon for the requested <tt>size</tt>, <tt>mode</tt>, and <tt>state</tt>. The result might be smaller than requested, but never larger. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#pixmap(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) pixmap()}, and {@link com.trolltech.qt.gui.QIcon#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, com.trolltech.qt.core.Qt.Alignment, com.trolltech.qt.gui.QIcon.Mode) paint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize actualSize(com.trolltech.qt.core.QSize size, com.trolltech.qt.gui.QIcon.Mode mode) {
        return actualSize(size, mode, com.trolltech.qt.gui.QIcon.State.Off);
    }

/**
Returns the actual size of the icon for the requested <tt>size</tt>, <tt>mode</tt>, and <tt>state</tt>. The result might be smaller than requested, but never larger. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#pixmap(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) pixmap()}, and {@link com.trolltech.qt.gui.QIcon#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, com.trolltech.qt.core.Qt.Alignment, com.trolltech.qt.gui.QIcon.Mode) paint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize actualSize(com.trolltech.qt.core.QSize size) {
        return actualSize(size, com.trolltech.qt.gui.QIcon.Mode.Normal, com.trolltech.qt.gui.QIcon.State.Off);
    }
/**
Returns the actual size of the icon for the requested <tt>size</tt>, <tt>mode</tt>, and <tt>state</tt>. The result might be smaller than requested, but never larger. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#pixmap(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) pixmap()}, and {@link com.trolltech.qt.gui.QIcon#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, com.trolltech.qt.core.Qt.Alignment, com.trolltech.qt.gui.QIcon.Mode) paint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QSize actualSize(com.trolltech.qt.core.QSize size, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_actualSize_QSize_Mode_State(nativeId(), size == null ? 0 : size.nativeId(), mode.value(), state.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_actualSize_QSize_Mode_State(long __this__nativeId, long size, int mode, int state);


/**
Adds an image from the file with the given <tt>fileName</tt> to the icon, as a specialization for <tt>size</tt>, <tt>mode</tt> and <tt>state</tt>. The file will be loaded on demand. Note: custom icon engines are free to ignore additionally added pixmaps. <p>If <tt>fileName</tt> contains a relative path (e.g. the filename only) the relevant file must be found relative to the runtime working directory. <p>The file name can be either refer to an actual file on disk or to one of the application's embedded resources. See the {@link <a href="../resources.html">Resource System</a>} overview for details on how to embed images and other resource files in the application's executable. <p>Use the {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() QImageReader::supportedImageFormats()} and {@link com.trolltech.qt.gui.QImageWriter#supportedImageFormats() QImageWriter::supportedImageFormats()} functions to retrieve a complete list of the supported file formats. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#addPixmap(com.trolltech.qt.gui.QPixmap, com.trolltech.qt.gui.QIcon.Mode) addPixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addFile(java.lang.String fileName, com.trolltech.qt.core.QSize size, com.trolltech.qt.gui.QIcon.Mode mode) {
        addFile(fileName, size, mode, com.trolltech.qt.gui.QIcon.State.Off);
    }

/**
Adds an image from the file with the given <tt>fileName</tt> to the icon, as a specialization for <tt>size</tt>, <tt>mode</tt> and <tt>state</tt>. The file will be loaded on demand. Note: custom icon engines are free to ignore additionally added pixmaps. <p>If <tt>fileName</tt> contains a relative path (e.g. the filename only) the relevant file must be found relative to the runtime working directory. <p>The file name can be either refer to an actual file on disk or to one of the application's embedded resources. See the {@link <a href="../resources.html">Resource System</a>} overview for details on how to embed images and other resource files in the application's executable. <p>Use the {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() QImageReader::supportedImageFormats()} and {@link com.trolltech.qt.gui.QImageWriter#supportedImageFormats() QImageWriter::supportedImageFormats()} functions to retrieve a complete list of the supported file formats. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#addPixmap(com.trolltech.qt.gui.QPixmap, com.trolltech.qt.gui.QIcon.Mode) addPixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addFile(java.lang.String fileName, com.trolltech.qt.core.QSize size) {
        addFile(fileName, size, com.trolltech.qt.gui.QIcon.Mode.Normal, com.trolltech.qt.gui.QIcon.State.Off);
    }

/**
Adds an image from the file with the given <tt>fileName</tt> to the icon, as a specialization for <tt>size</tt>, <tt>mode</tt> and <tt>state</tt>. The file will be loaded on demand. Note: custom icon engines are free to ignore additionally added pixmaps. <p>If <tt>fileName</tt> contains a relative path (e.g. the filename only) the relevant file must be found relative to the runtime working directory. <p>The file name can be either refer to an actual file on disk or to one of the application's embedded resources. See the {@link <a href="../resources.html">Resource System</a>} overview for details on how to embed images and other resource files in the application's executable. <p>Use the {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() QImageReader::supportedImageFormats()} and {@link com.trolltech.qt.gui.QImageWriter#supportedImageFormats() QImageWriter::supportedImageFormats()} functions to retrieve a complete list of the supported file formats. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#addPixmap(com.trolltech.qt.gui.QPixmap, com.trolltech.qt.gui.QIcon.Mode) addPixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addFile(java.lang.String fileName) {
        addFile(fileName, (com.trolltech.qt.core.QSize)new com.trolltech.qt.core.QSize(), com.trolltech.qt.gui.QIcon.Mode.Normal, com.trolltech.qt.gui.QIcon.State.Off);
    }
/**
Adds an image from the file with the given <tt>fileName</tt> to the icon, as a specialization for <tt>size</tt>, <tt>mode</tt> and <tt>state</tt>. The file will be loaded on demand. Note: custom icon engines are free to ignore additionally added pixmaps. <p>If <tt>fileName</tt> contains a relative path (e.g. the filename only) the relevant file must be found relative to the runtime working directory. <p>The file name can be either refer to an actual file on disk or to one of the application's embedded resources. See the {@link <a href="../resources.html">Resource System</a>} overview for details on how to embed images and other resource files in the application's executable. <p>Use the {@link com.trolltech.qt.gui.QImageReader#supportedImageFormats() QImageReader::supportedImageFormats()} and {@link com.trolltech.qt.gui.QImageWriter#supportedImageFormats() QImageWriter::supportedImageFormats()} functions to retrieve a complete list of the supported file formats. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#addPixmap(com.trolltech.qt.gui.QPixmap, com.trolltech.qt.gui.QIcon.Mode) addPixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addFile(java.lang.String fileName, com.trolltech.qt.core.QSize size, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addFile_String_QSize_Mode_State(nativeId(), fileName, size == null ? 0 : size.nativeId(), mode.value(), state.value());
    }
    @QtBlockedSlot
    native void __qt_addFile_String_QSize_Mode_State(long __this__nativeId, java.lang.String fileName, long size, int mode, int state);


/**
Adds <tt>pixmap</tt> to the icon, as a specialization for <tt>mode</tt> and <tt>state</tt>. <p>Custom icon engines are free to ignore additionally added pixmaps. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#addFile(java.lang.String, com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) addFile()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addPixmap(com.trolltech.qt.gui.QPixmap pixmap, com.trolltech.qt.gui.QIcon.Mode mode) {
        addPixmap(pixmap, mode, com.trolltech.qt.gui.QIcon.State.Off);
    }

/**
Adds <tt>pixmap</tt> to the icon, as a specialization for <tt>mode</tt> and <tt>state</tt>. <p>Custom icon engines are free to ignore additionally added pixmaps. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#addFile(java.lang.String, com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) addFile()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addPixmap(com.trolltech.qt.gui.QPixmap pixmap) {
        addPixmap(pixmap, com.trolltech.qt.gui.QIcon.Mode.Normal, com.trolltech.qt.gui.QIcon.State.Off);
    }
/**
Adds <tt>pixmap</tt> to the icon, as a specialization for <tt>mode</tt> and <tt>state</tt>. <p>Custom icon engines are free to ignore additionally added pixmaps. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#addFile(java.lang.String, com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) addFile()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void addPixmap(com.trolltech.qt.gui.QPixmap pixmap, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addPixmap_QPixmap_Mode_State(nativeId(), pixmap == null ? 0 : pixmap.nativeId(), mode.value(), state.value());
    }
    @QtBlockedSlot
    native void __qt_addPixmap_QPixmap_Mode_State(long __this__nativeId, long pixmap, int mode, int state);


/**
Returns a list of available icon sizes for the specified <tt>mode</tt> and <tt>state</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QSize> availableSizes(com.trolltech.qt.gui.QIcon.Mode mode) {
        return availableSizes(mode, com.trolltech.qt.gui.QIcon.State.Off);
    }

/**
Returns a list of available icon sizes for the specified <tt>mode</tt> and <tt>state</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QSize> availableSizes() {
        return availableSizes(com.trolltech.qt.gui.QIcon.Mode.Normal, com.trolltech.qt.gui.QIcon.State.Off);
    }
/**
Returns a list of available icon sizes for the specified <tt>mode</tt> and <tt>state</tt>.
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QSize> availableSizes(com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_availableSizes_Mode_State(nativeId(), mode.value(), state.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QSize> __qt_availableSizes_Mode_State(long __this__nativeId, int mode, int state);

/**
Returns a number that identifies the contents of this QIcon object. Distinct QIcon objects can have the same key if they refer to the same contents. <p>The {@link com.trolltech.qt.gui.QIcon#cacheKey() cacheKey()} will change when the icon is altered via {@link com.trolltech.qt.gui.QIcon#addPixmap(com.trolltech.qt.gui.QPixmap, com.trolltech.qt.gui.QIcon.Mode) addPixmap()} or {@link com.trolltech.qt.gui.QIcon#addFile(java.lang.String, com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) addFile()}. <p>Cache keys are mostly useful in conjunction with caching. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QPixmap#cacheKey() QPixmap::cacheKey()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final long cacheKey()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cacheKey(nativeId());
    }
    @QtBlockedSlot
    native long __qt_cacheKey(long __this__nativeId);

/**
Returns true if the icon is empty; otherwise returns false. <p>An icon is empty if it has neither a pixmap nor a filename. <p>Note: Even a non-null icon might not be able to create valid pixmaps, eg. if the file does not exist or cannot be read.
*/

    @QtBlockedSlot
    public final boolean isNull()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isNull(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isNull(long __this__nativeId);

/**
<brief>Writes thisQIcon
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long arg__1);

/**
<brief>Reads a QIcon
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long arg__1);


/**
Uses the <tt>painter</tt> to paint the icon with specified <tt>alignment</tt>, required <tt>mode</tt>, and <tt>state</tt> into the rectangle <tt>rect</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#actualSize(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) actualSize()}, and {@link com.trolltech.qt.gui.QIcon#pixmap(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) pixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void paint(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRect rect, com.trolltech.qt.core.Qt.Alignment alignment, com.trolltech.qt.gui.QIcon.Mode mode) {
        paint(painter, rect, alignment, mode, com.trolltech.qt.gui.QIcon.State.Off);
    }

/**
Uses the <tt>painter</tt> to paint the icon with specified <tt>alignment</tt>, required <tt>mode</tt>, and <tt>state</tt> into the rectangle <tt>rect</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#actualSize(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) actualSize()}, and {@link com.trolltech.qt.gui.QIcon#pixmap(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) pixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void paint(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRect rect, com.trolltech.qt.core.Qt.Alignment alignment) {
        paint(painter, rect, alignment, com.trolltech.qt.gui.QIcon.Mode.Normal, com.trolltech.qt.gui.QIcon.State.Off);
    }

/**
Uses the <tt>painter</tt> to paint the icon with specified <tt>alignment</tt>, required <tt>mode</tt>, and <tt>state</tt> into the rectangle <tt>rect</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#actualSize(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) actualSize()}, and {@link com.trolltech.qt.gui.QIcon#pixmap(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) pixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void paint(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRect rect) {
        paint(painter, rect, new com.trolltech.qt.core.Qt.Alignment(132), com.trolltech.qt.gui.QIcon.Mode.Normal, com.trolltech.qt.gui.QIcon.State.Off);
    }
/**
Uses the <tt>painter</tt> to paint the icon with specified <tt>alignment</tt>, required <tt>mode</tt>, and <tt>state</tt> into the rectangle <tt>rect</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QIcon#actualSize(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) actualSize()}, and {@link com.trolltech.qt.gui.QIcon#pixmap(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) pixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void paint(com.trolltech.qt.gui.QPainter painter, com.trolltech.qt.core.QRect rect, com.trolltech.qt.core.Qt.Alignment alignment, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paint_QPainter_QRect_Alignment_Mode_State(nativeId(), painter == null ? 0 : painter.nativeId(), rect == null ? 0 : rect.nativeId(), alignment.value(), mode.value(), state.value());
    }
    @QtBlockedSlot
    native void __qt_paint_QPainter_QRect_Alignment_Mode_State(long __this__nativeId, long painter, long rect, int alignment, int mode, int state);


/**
This is an overloaded member function, provided for convenience. <p>Paints the icon into the rectangle {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>).
*/

    @QtBlockedSlot
    public final void paint(com.trolltech.qt.gui.QPainter painter, int x, int y, int w, int h, com.trolltech.qt.core.Qt.Alignment alignment, com.trolltech.qt.gui.QIcon.Mode mode) {
        paint(painter, x, y, w, h, alignment, mode, com.trolltech.qt.gui.QIcon.State.Off);
    }

/**
This is an overloaded member function, provided for convenience. <p>Paints the icon into the rectangle {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>).
*/

    @QtBlockedSlot
    public final void paint(com.trolltech.qt.gui.QPainter painter, int x, int y, int w, int h, com.trolltech.qt.core.Qt.Alignment alignment) {
        paint(painter, x, y, w, h, alignment, com.trolltech.qt.gui.QIcon.Mode.Normal, com.trolltech.qt.gui.QIcon.State.Off);
    }

/**
This is an overloaded member function, provided for convenience. <p>Paints the icon into the rectangle {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>).
*/

    @QtBlockedSlot
    public final void paint(com.trolltech.qt.gui.QPainter painter, int x, int y, int w, int h) {
        paint(painter, x, y, w, h, new com.trolltech.qt.core.Qt.Alignment(132), com.trolltech.qt.gui.QIcon.Mode.Normal, com.trolltech.qt.gui.QIcon.State.Off);
    }
/**
This is an overloaded member function, provided for convenience. <p>Paints the icon into the rectangle {@link com.trolltech.qt.core.QRect QRect}(<tt>x</tt>, <tt>y</tt>, <tt>w</tt>, <tt>h</tt>).
*/

    @QtBlockedSlot
    public final void paint(com.trolltech.qt.gui.QPainter painter, int x, int y, int w, int h, com.trolltech.qt.core.Qt.Alignment alignment, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paint_QPainter_int_int_int_int_Alignment_Mode_State(nativeId(), painter == null ? 0 : painter.nativeId(), x, y, w, h, alignment.value(), mode.value(), state.value());
    }
    @QtBlockedSlot
    native void __qt_paint_QPainter_int_int_int_int_Alignment_Mode_State(long __this__nativeId, long painter, int x, int y, int w, int h, int alignment, int mode, int state);


/**
Returns a pixmap with the requested <tt>size</tt>, <tt>mode</tt>, and <tt>state</tt>, generating one if necessary. The pixmap might be smaller than requested, but never larger. <p><DT><b>See also:</b><br><DD>setPixmap(), {@link com.trolltech.qt.gui.QIcon#actualSize(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) actualSize()}, and {@link com.trolltech.qt.gui.QIcon#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, com.trolltech.qt.core.Qt.Alignment, com.trolltech.qt.gui.QIcon.Mode) paint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap(com.trolltech.qt.core.QSize size, com.trolltech.qt.gui.QIcon.Mode mode) {
        return pixmap(size, mode, com.trolltech.qt.gui.QIcon.State.Off);
    }

/**
Returns a pixmap with the requested <tt>size</tt>, <tt>mode</tt>, and <tt>state</tt>, generating one if necessary. The pixmap might be smaller than requested, but never larger. <p><DT><b>See also:</b><br><DD>setPixmap(), {@link com.trolltech.qt.gui.QIcon#actualSize(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) actualSize()}, and {@link com.trolltech.qt.gui.QIcon#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, com.trolltech.qt.core.Qt.Alignment, com.trolltech.qt.gui.QIcon.Mode) paint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap(com.trolltech.qt.core.QSize size) {
        return pixmap(size, com.trolltech.qt.gui.QIcon.Mode.Normal, com.trolltech.qt.gui.QIcon.State.Off);
    }
/**
Returns a pixmap with the requested <tt>size</tt>, <tt>mode</tt>, and <tt>state</tt>, generating one if necessary. The pixmap might be smaller than requested, but never larger. <p><DT><b>See also:</b><br><DD>setPixmap(), {@link com.trolltech.qt.gui.QIcon#actualSize(com.trolltech.qt.core.QSize, com.trolltech.qt.gui.QIcon.Mode) actualSize()}, and {@link com.trolltech.qt.gui.QIcon#paint(com.trolltech.qt.gui.QPainter, com.trolltech.qt.core.QRect, com.trolltech.qt.core.Qt.Alignment, com.trolltech.qt.gui.QIcon.Mode) paint()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap(com.trolltech.qt.core.QSize size, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixmap_QSize_Mode_State(nativeId(), size == null ? 0 : size.nativeId(), mode.value(), state.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_pixmap_QSize_Mode_State(long __this__nativeId, long size, int mode, int state);


/**
This is an overloaded member function, provided for convenience. <p>Returns a pixmap of size {@link com.trolltech.qt.core.QSize QSize}(<tt>extent</tt>, <tt>extent</tt>). The pixmap might be smaller than requested, but never larger.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap(int extent, com.trolltech.qt.gui.QIcon.Mode mode) {
        return pixmap(extent, mode, com.trolltech.qt.gui.QIcon.State.Off);
    }

/**
This is an overloaded member function, provided for convenience. <p>Returns a pixmap of size {@link com.trolltech.qt.core.QSize QSize}(<tt>extent</tt>, <tt>extent</tt>). The pixmap might be smaller than requested, but never larger.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap(int extent) {
        return pixmap(extent, com.trolltech.qt.gui.QIcon.Mode.Normal, com.trolltech.qt.gui.QIcon.State.Off);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns a pixmap of size {@link com.trolltech.qt.core.QSize QSize}(<tt>extent</tt>, <tt>extent</tt>). The pixmap might be smaller than requested, but never larger.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap(int extent, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixmap_int_Mode_State(nativeId(), extent, mode.value(), state.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_pixmap_int_Mode_State(long __this__nativeId, int extent, int mode, int state);


/**
This is an overloaded member function, provided for convenience. <p>Returns a pixmap of size {@link com.trolltech.qt.core.QSize QSize}(<tt>w</tt>, <tt>h</tt>). The pixmap might be smaller than requested, but never larger.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap(int w, int h, com.trolltech.qt.gui.QIcon.Mode mode) {
        return pixmap(w, h, mode, com.trolltech.qt.gui.QIcon.State.Off);
    }

/**
This is an overloaded member function, provided for convenience. <p>Returns a pixmap of size {@link com.trolltech.qt.core.QSize QSize}(<tt>w</tt>, <tt>h</tt>). The pixmap might be smaller than requested, but never larger.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap(int w, int h) {
        return pixmap(w, h, com.trolltech.qt.gui.QIcon.Mode.Normal, com.trolltech.qt.gui.QIcon.State.Off);
    }
/**
This is an overloaded member function, provided for convenience. <p>Returns a pixmap of size {@link com.trolltech.qt.core.QSize QSize}(<tt>w</tt>, <tt>h</tt>). The pixmap might be smaller than requested, but never larger.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap(int w, int h, com.trolltech.qt.gui.QIcon.Mode mode, com.trolltech.qt.gui.QIcon.State state)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixmap_int_int_Mode_State(nativeId(), w, h, mode.value(), state.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_pixmap_int_int_Mode_State(long __this__nativeId, int w, int h, int mode, int state);

/**
@exclude
*/

    public static native QIcon fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QIcon(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QIcon array[]);

/**
This method is reimplemented for internal reasons
*/

    @Override
    public QIcon clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QIcon __qt_clone(long __this_nativeId);
}
