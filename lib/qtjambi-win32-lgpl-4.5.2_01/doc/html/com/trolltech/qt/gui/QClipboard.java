package com.trolltech.qt.gui;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QClipboard class provides access to the window system clipboard. The clipboard offers a simple mechanism to copy and paste data between applications. <p>QClipboard supports the same data types that {@link com.trolltech.qt.gui.QDrag QDrag} does, and uses similar mechanisms. For advanced clipboard usage read {@link <a href="../qtjambi-dnd.html">Drag and Drop</a>}. <p>There is a single QClipboard object in an application, accessible as {@link com.trolltech.qt.gui.QApplication#clipboard() QApplication::clipboard()}. <p>Example: <pre class="snippet">
        QClipboard clipboard = QApplication.clipboard();
        String originalText = clipboard.text();
        String newText = "new words";
        clipboard.setText(newText);
        </pre> QClipboard features some convenience functions to access common data types: {@link com.trolltech.qt.gui.QClipboard#setText(java.lang.String) setText()} allows the exchange of Unicode text and {@link com.trolltech.qt.gui.QClipboard#setPixmap(com.trolltech.qt.gui.QPixmap) setPixmap()} and {@link com.trolltech.qt.gui.QClipboard#setImage(com.trolltech.qt.gui.QImage) setImage()} allows the exchange of QPixmaps and QImages between applications. The {@link com.trolltech.qt.gui.QClipboard#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()} function is the ultimate in flexibility: it allows you to add any {@link com.trolltech.qt.core.QMimeData QMimeData} into the clipboard. There are corresponding getters for each of these, e.g. {@link com.trolltech.qt.gui.QClipboard#text() text()}, {@link com.trolltech.qt.gui.QClipboard#image() image()} and {@link com.trolltech.qt.gui.QClipboard#pixmap() pixmap()}. You can clear the clipboard by calling {@link com.trolltech.qt.gui.QClipboard#clear() clear()}. <p>A typical example of the use of these functions follows:<br><br>The following code example is written in c++.<br> <pre class="snippet">
void DropArea::paste()
{
    const QClipboard *clipboard = QApplication::clipboard();
    const QMimeData *mimeData = clipboard-&gt;mimeData();

    if (mimeData-&gt;hasImage()) {
        setPixmap(qvariant_cast&lt;QPixmap&gt;(mimeData-&gt;imageData()));
    } else if (mimeData-&gt;hasHtml()) {
        setText(mimeData-&gt;html());
        setTextFormat(Qt::RichText);
    } else if (mimeData-&gt;hasText()) {
        setText(mimeData-&gt;text());
        setTextFormat(Qt::PlainText);
    } else {
        setText(tr("Cannot display data"));
    }
</pre><a name="notes-for-x11-users"><h2>Notes for X11 Users</h2> <ul><li> The X11 Window System has the concept of a separate selection and clipboard. When text is selected, it is immediately available as the global mouse selection. The global mouse selection may later be copied to the clipboard. By convention, the middle mouse button is used to paste the global mouse selection.</li><li> X11 also has the concept of ownership; if you change the selection within a window, X11 will only notify the owner and the previous owner of the change, i.e. it will not notify all applications that the selection or clipboard data changed.</li><li> Lastly, the X11 clipboard is event driven, i.e. the clipboard will not function properly if the event loop is not running. Similarly, it is recommended that the contents of the clipboard are stored or retrieved in direct response to user-input events, e.g. mouse button or key presses and releases. You should not store or retrieve the clipboard contents in response to timer or non-user-input events.</li></ul><a name="notes-for-mac-os-x-users"><h2>Notes for Mac OS X Users</h2> Mac OS X supports a separate find buffer that holds the current search string in Find operations. This find clipboard can be accessed by specifying the {@link com.trolltech.qt.gui.QClipboard.Mode FindBuffer } mode.<a name="notes-for-windows-and-mac-os-x-users"><h2>Notes for Windows and Mac OS X Users</h2> <ul><li> Windows and Mac OS X do not support the global mouse selection; they only supports the global clipboard, i.e. they only add text to the clipboard when an explicit copy or cut is made.</li><li> Windows and Mac OS X does not have the concept of ownership; the clipboard is a fully global resource so all applications are notified of changes.</li></ul> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QApplication QApplication}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public final class QClipboard extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
    
/**
<a name="clipboard-mode"> This enum type is used to control which part of the system clipboard is used by {@link com.trolltech.qt.gui.QClipboard#mimeData() QClipboard::mimeData()}, {@link com.trolltech.qt.gui.QClipboard#setMimeData(com.trolltech.qt.core.QMimeData) QClipboard::setMimeData()} and related functions. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#supportsSelection() QClipboard::supportsSelection()}. <br></DD></DT>
*/
@QtBlockedEnum
    public enum Mode implements com.trolltech.qt.QtEnumerator {
/**
 indicates that data should be stored and retrieved from the global clipboard.
*/

        Clipboard(0),
/**
 indicates that data should be stored and retrieved from the global mouse selection. Support for <tt>Selection</tt> is provided only on systems with a global mouse selection (e.g. X11).
*/

        Selection(1),
/**
 indicates that data should be stored and retrieved from the Find buffer. This mode is used for holding search strings on Mac OS X.
*/

        FindBuffer(2),
;

        Mode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QClipboard$Mode constant with the specified <tt>int</tt>.</brief>
*/

        public static Mode resolve(int value) {
            return (Mode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Clipboard;
            case 1: return Selection;
            case 2: return FindBuffer;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QClipboard$Mode(named: mode)&gt;:<p> This signal is emitted when the data for the given clipboard <tt>mode</tt> is changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#dataChanged dataChanged() }, {@link com.trolltech.qt.gui.QClipboard#selectionChanged selectionChanged() }, and {@link com.trolltech.qt.gui.QClipboard#findBufferChanged findBufferChanged() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QClipboard.Mode> changed = new Signal1<com.trolltech.qt.gui.QClipboard.Mode>();

    private final void changed(com.trolltech.qt.gui.QClipboard.Mode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_changed_Mode(nativeId(), mode.value());
    }
    native void __qt_changed_Mode(long __this__nativeId, int mode);
/**
 This signal is emitted when the clipboard data is changed. <p>On Mac OS X and with Qt version 4.3 or higher, clipboard changes made by other applications will only be detected when the application is activated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#findBufferChanged findBufferChanged() }, {@link com.trolltech.qt.gui.QClipboard#selectionChanged selectionChanged() }, and {@link com.trolltech.qt.gui.QClipboard#changed changed() }. <br></DD></DT>
*/

    public final Signal0 dataChanged = new Signal0();

    private final void dataChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_dataChanged(nativeId());
    }
    native void __qt_dataChanged(long __this__nativeId);
/**
 This signal is emitted when the find buffer is changed. This only applies to Mac OS X. <p>With Qt version 4.3 or higher, clipboard changes made by other applications will only be detected when the application is activated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#dataChanged dataChanged() }, {@link com.trolltech.qt.gui.QClipboard#selectionChanged selectionChanged() }, and {@link com.trolltech.qt.gui.QClipboard#changed changed() }. <br></DD></DT>
*/

    public final Signal0 findBufferChanged = new Signal0();

    private final void findBufferChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_findBufferChanged(nativeId());
    }
    native void __qt_findBufferChanged(long __this__nativeId);
/**
 This signal is emitted when the selection is changed. This only applies to windowing systems that support selections, e.g. X11. Windows and Mac OS X don't support selections. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#dataChanged dataChanged() }, {@link com.trolltech.qt.gui.QClipboard#findBufferChanged findBufferChanged() }, and {@link com.trolltech.qt.gui.QClipboard#changed changed() }. <br></DD></DT>
*/

    public final Signal0 selectionChanged = new Signal0();

    private final void selectionChanged()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_selectionChanged(nativeId());
    }
    native void __qt_selectionChanged(long __this__nativeId);


/**
Clear the clipboard contents. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, this function clears the the global clipboard contents. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, this function clears the global mouse selection contents. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::FindBuffer }, this function clears the search string buffer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Mode }, and {@link com.trolltech.qt.gui.QClipboard#supportsSelection() supportsSelection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clear() {
        clear(com.trolltech.qt.gui.QClipboard.Mode.Clipboard);
    }
/**
Clear the clipboard contents. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, this function clears the the global clipboard contents. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, this function clears the global mouse selection contents. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::FindBuffer }, this function clears the search string buffer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Mode }, and {@link com.trolltech.qt.gui.QClipboard#supportsSelection() supportsSelection()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clear(com.trolltech.qt.gui.QClipboard.Mode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear_Mode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_clear_Mode(long __this__nativeId, int mode);


/**
Returns the clipboard image, or returns a null image if the clipboard does not contain an image or if it contains an image in an unsupported image format. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the image is retrieved from the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the image is retrieved from the global mouse selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#setImage(com.trolltech.qt.gui.QImage) setImage()}, {@link com.trolltech.qt.gui.QClipboard#pixmap() pixmap()}, {@link com.trolltech.qt.gui.QClipboard#mimeData() mimeData()}, and {@link com.trolltech.qt.gui.QImage#isNull() QImage::isNull()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage image() {
        return image(com.trolltech.qt.gui.QClipboard.Mode.Clipboard);
    }
/**
Returns the clipboard image, or returns a null image if the clipboard does not contain an image or if it contains an image in an unsupported image format. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the image is retrieved from the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the image is retrieved from the global mouse selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#setImage(com.trolltech.qt.gui.QImage) setImage()}, {@link com.trolltech.qt.gui.QClipboard#pixmap() pixmap()}, {@link com.trolltech.qt.gui.QClipboard#mimeData() mimeData()}, and {@link com.trolltech.qt.gui.QImage#isNull() QImage::isNull()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QImage image(com.trolltech.qt.gui.QClipboard.Mode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_image_Mode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QImage __qt_image_Mode(long __this__nativeId, int mode);


/**
Returns a reference to a {@link com.trolltech.qt.core.QMimeData QMimeData} representation of the current clipboard data. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the data is retrieved from the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the data is retrieved from the global mouse selection. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::FindBuffer }, the data is retrieved from the search string buffer. <p>The {@link com.trolltech.qt.gui.QClipboard#text() text()}, {@link com.trolltech.qt.gui.QClipboard#image() image()}, and {@link com.trolltech.qt.gui.QClipboard#pixmap() pixmap()} functions are simpler wrappers for retrieving text, image, and pixmap data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QMimeData mimeData() {
        return mimeData(com.trolltech.qt.gui.QClipboard.Mode.Clipboard);
    }
/**
Returns a reference to a {@link com.trolltech.qt.core.QMimeData QMimeData} representation of the current clipboard data. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the data is retrieved from the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the data is retrieved from the global mouse selection. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::FindBuffer }, the data is retrieved from the search string buffer. <p>The {@link com.trolltech.qt.gui.QClipboard#text() text()}, {@link com.trolltech.qt.gui.QClipboard#image() image()}, and {@link com.trolltech.qt.gui.QClipboard#pixmap() pixmap()} functions are simpler wrappers for retrieving text, image, and pixmap data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QMimeData mimeData(com.trolltech.qt.gui.QClipboard.Mode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mimeData_Mode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QMimeData __qt_mimeData_Mode(long __this__nativeId, int mode);

/**
Returns true if this clipboard object owns the clipboard data; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean ownsClipboard()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ownsClipboard(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_ownsClipboard(long __this__nativeId);

/**
Returns true if this clipboard object owns the find buffer data; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean ownsFindBuffer()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ownsFindBuffer(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_ownsFindBuffer(long __this__nativeId);

/**
Returns true if this clipboard object owns the mouse selection data; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean ownsSelection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_ownsSelection(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_ownsSelection(long __this__nativeId);


/**
Returns the clipboard pixmap, or null if the clipboard does not contain a pixmap. Note that this can lose information. For example, if the image is 24-bit and the display is 8-bit, the result is converted to 8 bits, and if the image has an alpha channel, the result just has a mask. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the pixmap is retrieved from the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the pixmap is retrieved from the global mouse selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#setPixmap(com.trolltech.qt.gui.QPixmap) setPixmap()}, {@link com.trolltech.qt.gui.QClipboard#image() image()}, {@link com.trolltech.qt.gui.QClipboard#mimeData() mimeData()}, and QPixmap::convertFromImage(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap() {
        return pixmap(com.trolltech.qt.gui.QClipboard.Mode.Clipboard);
    }
/**
Returns the clipboard pixmap, or null if the clipboard does not contain a pixmap. Note that this can lose information. For example, if the image is 24-bit and the display is 8-bit, the result is converted to 8 bits, and if the image has an alpha channel, the result just has a mask. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the pixmap is retrieved from the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the pixmap is retrieved from the global mouse selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#setPixmap(com.trolltech.qt.gui.QPixmap) setPixmap()}, {@link com.trolltech.qt.gui.QClipboard#image() image()}, {@link com.trolltech.qt.gui.QClipboard#mimeData() mimeData()}, and QPixmap::convertFromImage(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap(com.trolltech.qt.gui.QClipboard.Mode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixmap_Mode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_pixmap_Mode(long __this__nativeId, int mode);


/**
Copies the <tt>image</tt> into the clipboard. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the image is stored in the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the data is stored in the global mouse selection. <p>This is shorthand for: <pre class="snippet">
        QMimeData data = new QMimeData();
        data.setImageData(image);
        clipboard.setMimeData(data, QClipboard.Mode.Clipboard);
        </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#image() image()}, {@link com.trolltech.qt.gui.QClipboard#setPixmap(com.trolltech.qt.gui.QPixmap) setPixmap()}, and {@link com.trolltech.qt.gui.QClipboard#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setImage(com.trolltech.qt.gui.QImage arg__1) {
        setImage(arg__1, com.trolltech.qt.gui.QClipboard.Mode.Clipboard);
    }
/**
Copies the <tt>image</tt> into the clipboard. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the image is stored in the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the data is stored in the global mouse selection. <p>This is shorthand for: <pre class="snippet">
        QMimeData data = new QMimeData();
        data.setImageData(image);
        clipboard.setMimeData(data, QClipboard.Mode.Clipboard);
        </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#image() image()}, {@link com.trolltech.qt.gui.QClipboard#setPixmap(com.trolltech.qt.gui.QPixmap) setPixmap()}, and {@link com.trolltech.qt.gui.QClipboard#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setImage(com.trolltech.qt.gui.QImage arg__1, com.trolltech.qt.gui.QClipboard.Mode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setImage_QImage_Mode(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setImage_QImage_Mode(long __this__nativeId, long arg__1, int mode);


/**
Sets the clipboard data to <tt>src</tt>. Ownership of the data is transferred to the clipboard. If you want to remove the data either call {@link com.trolltech.qt.gui.QClipboard#clear() clear()} or call {@link com.trolltech.qt.gui.QClipboard#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()} again with new data. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the data is stored in the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the data is stored in the global mouse selection. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::FindBuffer }, the data is stored in the search string buffer. <p>The {@link com.trolltech.qt.gui.QClipboard#setText(java.lang.String) setText()}, {@link com.trolltech.qt.gui.QClipboard#setImage(com.trolltech.qt.gui.QImage) setImage()} and {@link com.trolltech.qt.gui.QClipboard#setPixmap(com.trolltech.qt.gui.QPixmap) setPixmap()} functions are simpler wrappers for setting text, image and pixmap data respectively. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#mimeData() mimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMimeData(com.trolltech.qt.core.QMimeData data) {
        setMimeData(data, com.trolltech.qt.gui.QClipboard.Mode.Clipboard);
    }
/**
Sets the clipboard data to <tt>src</tt>. Ownership of the data is transferred to the clipboard. If you want to remove the data either call {@link com.trolltech.qt.gui.QClipboard#clear() clear()} or call {@link com.trolltech.qt.gui.QClipboard#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()} again with new data. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the data is stored in the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the data is stored in the global mouse selection. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::FindBuffer }, the data is stored in the search string buffer. <p>The {@link com.trolltech.qt.gui.QClipboard#setText(java.lang.String) setText()}, {@link com.trolltech.qt.gui.QClipboard#setImage(com.trolltech.qt.gui.QImage) setImage()} and {@link com.trolltech.qt.gui.QClipboard#setPixmap(com.trolltech.qt.gui.QPixmap) setPixmap()} functions are simpler wrappers for setting text, image and pixmap data respectively. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#mimeData() mimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMimeData(com.trolltech.qt.core.QMimeData data, com.trolltech.qt.gui.QClipboard.Mode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (data != null) {
            data.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMimeData_QMimeData_Mode(nativeId(), data == null ? 0 : data.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setMimeData_QMimeData_Mode(long __this__nativeId, long data, int mode);


/**
Copies <tt>pixmap</tt> into the clipboard. Note that this is slower than {@link com.trolltech.qt.gui.QClipboard#setImage(com.trolltech.qt.gui.QImage) setImage()} because it needs to convert the {@link com.trolltech.qt.gui.QPixmap QPixmap} to a {@link com.trolltech.qt.gui.QImage QImage} first. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the pixmap is stored in the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the pixmap is stored in the global mouse selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#pixmap() pixmap()}, {@link com.trolltech.qt.gui.QClipboard#setImage(com.trolltech.qt.gui.QImage) setImage()}, and {@link com.trolltech.qt.gui.QClipboard#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPixmap(com.trolltech.qt.gui.QPixmap arg__1) {
        setPixmap(arg__1, com.trolltech.qt.gui.QClipboard.Mode.Clipboard);
    }
/**
Copies <tt>pixmap</tt> into the clipboard. Note that this is slower than {@link com.trolltech.qt.gui.QClipboard#setImage(com.trolltech.qt.gui.QImage) setImage()} because it needs to convert the {@link com.trolltech.qt.gui.QPixmap QPixmap} to a {@link com.trolltech.qt.gui.QImage QImage} first. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the pixmap is stored in the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the pixmap is stored in the global mouse selection. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#pixmap() pixmap()}, {@link com.trolltech.qt.gui.QClipboard#setImage(com.trolltech.qt.gui.QImage) setImage()}, and {@link com.trolltech.qt.gui.QClipboard#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPixmap(com.trolltech.qt.gui.QPixmap arg__1, com.trolltech.qt.gui.QClipboard.Mode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPixmap_QPixmap_Mode(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setPixmap_QPixmap_Mode(long __this__nativeId, long arg__1, int mode);


/**
Copies <tt>text</tt> into the clipboard as plain text. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the text is stored in the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the text is stored in the global mouse selection. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::FindBuffer }, the text is stored in the search string buffer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#text() text()}, and {@link com.trolltech.qt.gui.QClipboard#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setText(java.lang.String arg__1) {
        setText(arg__1, com.trolltech.qt.gui.QClipboard.Mode.Clipboard);
    }
/**
Copies <tt>text</tt> into the clipboard as plain text. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the text is stored in the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the text is stored in the global mouse selection. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::FindBuffer }, the text is stored in the search string buffer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#text() text()}, and {@link com.trolltech.qt.gui.QClipboard#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setText(java.lang.String arg__1, com.trolltech.qt.gui.QClipboard.Mode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String_Mode(nativeId(), arg__1, mode.value());
    }
    @QtBlockedSlot
    native void __qt_setText_String_Mode(long __this__nativeId, java.lang.String arg__1, int mode);

/**
Returns true if the clipboard supports a separate search buffer; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean supportsFindBuffer()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportsFindBuffer(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_supportsFindBuffer(long __this__nativeId);

/**
Returns true if the clipboard supports mouse selection; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean supportsSelection()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportsSelection(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_supportsSelection(long __this__nativeId);


/**
Returns the clipboard text as plain text, or an empty string if the clipboard does not contain any text. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the text is retrieved from the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the text is retrieved from the global mouse selection. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::FindBuffer }, the text is retrieved from the search string buffer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#setText(java.lang.String) setText()}, and {@link com.trolltech.qt.gui.QClipboard#mimeData() mimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text() {
        return text(com.trolltech.qt.gui.QClipboard.Mode.Clipboard);
    }
/**
Returns the clipboard text as plain text, or an empty string if the clipboard does not contain any text. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the text is retrieved from the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the text is retrieved from the global mouse selection. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::FindBuffer }, the text is retrieved from the search string buffer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#setText(java.lang.String) setText()}, and {@link com.trolltech.qt.gui.QClipboard#mimeData() mimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text(com.trolltech.qt.gui.QClipboard.Mode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text_Mode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text_Mode(long __this__nativeId, int mode);

    @QtBlockedSlot
    private final java.lang.String text(com.trolltech.qt.QNativePointer subtype, com.trolltech.qt.gui.QClipboard.Mode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text_nativepointer_Mode(nativeId(), subtype, mode.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text_nativepointer_Mode(long __this__nativeId, com.trolltech.qt.QNativePointer subtype, int mode);

/**
@exclude
*/

    public static native QClipboard fromNativePointer(QNativePointer nativePointer);

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

    protected QClipboard(QPrivateConstructor p) { super(p); } 

    public static class Text {
        public String text;
        public String subtype;
    }

/**
Returns the clipboard text in subtype <tt>subtype</tt>, or an empty string if the clipboard does not contain any text. If <tt>subtype</tt> is null, any subtype is acceptable, and <tt>subtype</tt> is set to the chosen subtype. <p>The <tt>mode</tt> argument is used to control which part of the system clipboard is used. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Clipboard }, the text is retrieved from the global clipboard. If <tt>mode</tt> is {@link com.trolltech.qt.gui.QClipboard.Mode QClipboard::Selection }, the text is retrieved from the global mouse selection. <p>Common values for <tt>subtype</tt> are "plain" and "html". <p>Note that calling this function repeatedly, for instance from a key event handler, may be slow. In such cases, you should use the <tt>dataChanged()</tt> signal instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard#setText(java.lang.String) setText()}, and {@link com.trolltech.qt.gui.QClipboard#mimeData() mimeData()}. <br></DD></DT>
*/

    public final Text text(String subtype, Mode mode) {
        QNativePointer np = new QNativePointer(QNativePointer.Type.String);
        np.setStringValue(subtype != null ? subtype : "");

        Text returned = new Text();
        returned.text = text(np, mode);
        returned.subtype = np.stringValue();
        return returned;
    }

/**
Returns the clipboard text as plain text, or an empty string if the
clipboard does not contain any text.
<p>
The <tt>mode</tt> argument is used to control which part of the system
clipboard is used.  If <tt>mode</tt> is QClipboard.Clipboard, the text
is retrieved from the global clipboard.  If <tt>mode</tt> is
QClipboard::Selection, the text is retrieved from the global mouse
selection. If <tt>mode</tt> is QClipboard.FindBuffer, the text is
retrieved from the search string buffer.
*/

    public final Text text(String subtype) {
        return text(subtype, Mode.Clipboard);
    }

}
