package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QMimeData class provides a container for data that records information about its MIME type. QMimeData is used to describe information that can be stored in the {@link com.trolltech.qt.gui.QClipboard clipboard}, and transferred via the {@link <a href="../qtjambi-dnd.html">drag and drop</a>} mechanism. QMimeData objects associate the data that they hold with the corresponding MIME types to ensure that information can be safely transferred between applications, and copied around within the same application. <p>QMimeData objects are usually created using <tt>new</tt> and supplied to {@link com.trolltech.qt.gui.QDrag QDrag} or {@link com.trolltech.qt.gui.QClipboard QClipboard} objects. This is to enable Qt to manage the memory that they use. <p>A single QMimeData object can store the same data using several different formats at the same time. The {@link com.trolltech.qt.core.QMimeData#formats() formats()} function returns a list of the available formats in order of preference. The {@link com.trolltech.qt.core.QMimeData#data(java.lang.String) data()} function returns the raw data associated with a MIME type, and {@link com.trolltech.qt.core.QMimeData#setData(java.lang.String, com.trolltech.qt.core.QByteArray) setData()} allows you to set the data for a MIME type. <p>For the most common MIME types, QMimeData provides convenience functions to access the data: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Tester</center></th><th><center> Getter</center></th><th><center> Setter</center></th><th><center> MIME Types</center></th></tr></thead><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.QMimeData#hasText() hasText()}</td><td> {@link com.trolltech.qt.core.QMimeData#text() text()}</td><td> {@link com.trolltech.qt.core.QMimeData#setText(java.lang.String) setText()}</td><td> <tt>text/plain</tt></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QMimeData#hasHtml() hasHtml()}</td><td> {@link com.trolltech.qt.core.QMimeData#html() html()}</td><td> {@link com.trolltech.qt.core.QMimeData#setHtml(java.lang.String) setHtml()}</td><td> <tt>text/html</tt></td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.QMimeData#hasUrls() hasUrls()}</td><td> {@link com.trolltech.qt.core.QMimeData#urls() urls()}</td><td> {@link com.trolltech.qt.core.QMimeData#setUrls(java.util.List) setUrls()}</td><td> <tt>text/uri-list</tt></td></tr><tr valign="top" class="odd"><td> {@link com.trolltech.qt.core.QMimeData#hasImage() hasImage()}</td><td> {@link com.trolltech.qt.core.QMimeData#imageData() imageData()}</td><td> {@link com.trolltech.qt.core.QMimeData#setImageData(java.lang.Object) setImageData()}</td><td> <tt>image/</tt> *</td></tr><tr valign="top" class="even"><td> {@link com.trolltech.qt.core.QMimeData#hasColor() hasColor()}</td><td> {@link com.trolltech.qt.core.QMimeData#colorData() colorData()}</td><td> {@link com.trolltech.qt.core.QMimeData#setColorData(java.lang.Object) setColorData()}</td><td> <tt>application/x-color</tt></td></tr></table> For example, if your write a widget that accepts URL drags, you would end up writing code like this:<br><br>The following code example is written in c++.<br> <pre class="snippet">
void MyWidget::dragEnterEvent(QDragEnterEvent *event)
{
    if (event-&gt;mimeData()-&gt;hasUrls())
        event-&gt;acceptProposedAction();
}

void MyWidget::dropEvent(QDropEvent *event)
{
    if (event-&gt;mimeData()-&gt;hasUrls()) {
        foreach (QUrl url, event-&gt;mimeData()-&gt;urls()) {
            ...
        }
    }
}
</pre> There are three approaches for storing custom data in a QMimeData object: <ol><li> Custom data can be stored directly in a QMimeData object as a {@link com.trolltech.qt.core.QByteArray QByteArray} using {@link com.trolltech.qt.core.QMimeData#setData(java.lang.String, com.trolltech.qt.core.QByteArray) setData()}. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
QByteArray csvData = ...;

QMimeData *mimeData = new QMimeData;
mimeData-&gt;setData("text/csv", csvData);
</li></pre><li> We can subclass QMimeData and reimplement {@link com.trolltech.qt.core.QMimeData#hasFormat(java.lang.String) hasFormat()}, {@link com.trolltech.qt.core.QMimeData#formats() formats()}, and {@link com.trolltech.qt.core.QMimeData#retrieveData(java.lang.String, int) retrieveData()}.</li><li> If the drag and drop operation occurs withing a single application, we can subclass QMimeData and add extra data in it, and use a qobject_cast() in the receiver's drop event handler. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
void MyWidget::dropEvent(QDropEvent *event)
{
    const MyMimeData *myData =
            qobject_cast&lt;const MyMimeData *&gt;(event-&gt;mimeData());
    if (myData) {
        // access myData's data directly (not through QMimeData's API)
    }
}
</li></ol></pre><a name="platform-specific-mime-types"><h2>Platform-Specific MIME Types</h2> On Windows, {@link com.trolltech.qt.core.QMimeData#formats() formats()} will also return custom formats available in the MIME data, using the <tt>x-qt-windows-mime</tt> subtype to indicate that they represent data in non-standard formats. The formats will take the following form:<br><br>The following code example is written in c++.<br> <pre class="snippet">
application/x-qt-windows-mime;value="&lt;custom type&gt;"
</pre> The following are examples of custom MIME types:<br><br>The following code example is written in c++.<br> <pre class="snippet">
application/x-qt-windows-mime;value="FileGroupDescriptor"
application/x-qt-windows-mime;value="FileContents"
</pre> The <tt>value</tt> declaration of each format describes the way in which the data is encoded. <p>On Windows, the MIME format does not always map directly to the clipboard formats. Qt provides QWindowsMime to map clipboard formats to open-standard MIME formats. Similarly, the QMacPasteboardMime maps MIME to Mac flavors. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QClipboard QClipboard}, {@link com.trolltech.qt.gui.QDragEnterEvent QDragEnterEvent}, {@link com.trolltech.qt.gui.QDragMoveEvent QDragMoveEvent}, {@link com.trolltech.qt.gui.QDropEvent QDropEvent}, {@link com.trolltech.qt.gui.QDrag QDrag}, QWindowsMime, QMacPasteboardMime, and {@link <a href="../qtjambi-dnd.html">Drag and Drop</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QMimeData extends com.trolltech.qt.core.QObject
{

/**
Constructs a new MIME data object with no data in it.
*/

    public QMimeData(){
        super((QPrivateConstructor)null);
        __qt_QMimeData();
    }

    native void __qt_QMimeData();

/**
Removes all the MIME type and data entries in the object.
*/

    @QtBlockedSlot
    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
Returns a color if the data stored in the object represents a color (MIME type <tt>application/x-color</tt>); otherwise returns a null variant. <p>A {@link com.trolltech.qt.QVariant QVariant} is used because QMimeData belongs to the {@link <a href="../qtcore.html">QtCore</a>} library, whereas {@link com.trolltech.qt.gui.QColor QColor} belongs to {@link <a href="../qtgui.html">QtGui</a>}. To convert the {@link com.trolltech.qt.QVariant QVariant} to a {@link com.trolltech.qt.gui.QColor QColor}, simply use qvariant_cast(). For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
if (event-&gt;mimeData()-&gt;hasColor()) {
    QColor color = qvariant_cast&lt;QColor&gt;(event-&gt;mimeData()-&gt;colorData());
    ...
}
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#hasColor() hasColor()}, {@link com.trolltech.qt.core.QMimeData#setColorData(java.lang.Object) setColorData()}, and {@link com.trolltech.qt.core.QMimeData#data(java.lang.String) data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object colorData()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_colorData(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_colorData(long __this__nativeId);

/**
Returns the data stored in the object in the format described by the MIME type specified by <tt>mimeType</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#setData(java.lang.String, com.trolltech.qt.core.QByteArray) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray data(java.lang.String mimetype)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_String(nativeId(), mimetype);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_data_String(long __this__nativeId, java.lang.String mimetype);

/**
Returns true if the object can return a color (MIME type <tt>application/x-color</tt>); otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#setColorData(java.lang.Object) setColorData()}, {@link com.trolltech.qt.core.QMimeData#colorData() colorData()}, and {@link com.trolltech.qt.core.QMimeData#hasFormat(java.lang.String) hasFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasColor()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasColor(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasColor(long __this__nativeId);

/**
Returns true if the object can return HTML (MIME type <tt>text/html</tt>); otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#setHtml(java.lang.String) setHtml()}, {@link com.trolltech.qt.core.QMimeData#html() html()}, and {@link com.trolltech.qt.core.QMimeData#hasFormat(java.lang.String) hasFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasHtml()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasHtml(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasHtml(long __this__nativeId);

/**
Returns true if the object can return an image; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#setImageData(java.lang.Object) setImageData()}, {@link com.trolltech.qt.core.QMimeData#imageData() imageData()}, and {@link com.trolltech.qt.core.QMimeData#hasFormat(java.lang.String) hasFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasImage()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasImage(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasImage(long __this__nativeId);

/**
Returns true if the object can return plain text (MIME type <tt>text/plain</tt>); otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#setText(java.lang.String) setText()}, {@link com.trolltech.qt.core.QMimeData#text() text()}, {@link com.trolltech.qt.core.QMimeData#hasHtml() hasHtml()}, and {@link com.trolltech.qt.core.QMimeData#hasFormat(java.lang.String) hasFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasText(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasText(long __this__nativeId);

/**
Returns true if the object can return a list of urls; otherwise returns false. <p>URLs correspond to the MIME type <tt>text/uri-list</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#setUrls(java.util.List) setUrls()}, {@link com.trolltech.qt.core.QMimeData#urls() urls()}, and {@link com.trolltech.qt.core.QMimeData#hasFormat(java.lang.String) hasFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasUrls()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasUrls(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasUrls(long __this__nativeId);

/**
Returns a string if the data stored in the object is HTML (MIME type <tt>text/html</tt>); otherwise returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#setHtml(java.lang.String) setHtml()}, {@link com.trolltech.qt.core.QMimeData#hasHtml() hasHtml()}, and {@link com.trolltech.qt.core.QMimeData#setData(java.lang.String, com.trolltech.qt.core.QByteArray) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String html()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_html(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_html(long __this__nativeId);

/**
Returns a {@link com.trolltech.qt.QVariant QVariant} storing a {@link com.trolltech.qt.gui.QImage QImage} if the object can return an image; otherwise returns a null variant. <p>A {@link com.trolltech.qt.QVariant QVariant} is used because QMimeData belongs to the {@link <a href="../qtcore.html">QtCore</a>} library, whereas {@link com.trolltech.qt.gui.QImage QImage} belongs to {@link <a href="../qtgui.html">QtGui</a>}. To convert the {@link com.trolltech.qt.QVariant QVariant} to a {@link com.trolltech.qt.gui.QImage QImage}, simply use qvariant_cast(). For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
if (event-&gt;mimeData()-&gt;hasImage()) {
    QImage image = qvariant_cast&lt;QImage&gt;(event-&gt;mimeData()-&gt;imageData());
    ...
}
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#setImageData(java.lang.Object) setImageData()}, and {@link com.trolltech.qt.core.QMimeData#hasImage() hasImage()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.Object imageData()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_imageData(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_imageData(long __this__nativeId);

/**
Removes the data entry for <tt>mimeType</tt> in the object.
*/

    @QtBlockedSlot
    public final void removeFormat(java.lang.String mimetype)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeFormat_String(nativeId(), mimetype);
    }
    @QtBlockedSlot
    native void __qt_removeFormat_String(long __this__nativeId, java.lang.String mimetype);

/**
Sets the color data in the object to the given <tt>color</tt>. <p>Colors correspond to the MIME type <tt>application/x-color</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#colorData() colorData()}, {@link com.trolltech.qt.core.QMimeData#hasColor() hasColor()}, and {@link com.trolltech.qt.core.QMimeData#setData(java.lang.String, com.trolltech.qt.core.QByteArray) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setColorData(java.lang.Object color)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setColorData_Object(nativeId(), color);
    }
    @QtBlockedSlot
    native void __qt_setColorData_Object(long __this__nativeId, java.lang.Object color);

/**
Sets the data associated with the MIME type given by <tt>mimeType</tt> to the specified <tt>data</tt>. <p>For the most common types of data, you can call the higher-level functions {@link com.trolltech.qt.core.QMimeData#setText(java.lang.String) setText()}, {@link com.trolltech.qt.core.QMimeData#setHtml(java.lang.String) setHtml()}, {@link com.trolltech.qt.core.QMimeData#setUrls(java.util.List) setUrls()}, {@link com.trolltech.qt.core.QMimeData#setImageData(java.lang.Object) setImageData()}, and {@link com.trolltech.qt.core.QMimeData#setColorData(java.lang.Object) setColorData()} instead. <p>Note that if you want to use a custom data type in an item view drag and drop operation, you must register it as a Qt meta type, using the Q_DECLARE_METATYPE() macro, and implement stream operators for it. The stream operators must then be registered with the qRegisterMetaTypeStreamOperators() function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#data(java.lang.String) data()}, {@link com.trolltech.qt.core.QMimeData#hasFormat(java.lang.String) hasFormat()}, QMetaType, and qRegisterMetaTypeStreamOperators(). <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setData(java.lang.String mimetype, com.trolltech.qt.core.QByteArray data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setData_String_QByteArray(nativeId(), mimetype, data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setData_String_QByteArray(long __this__nativeId, java.lang.String mimetype, long data);

/**
Sets <tt>html</tt> as the HTML (MIME type <tt>text/html</tt>) used to represent the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#html() html()}, {@link com.trolltech.qt.core.QMimeData#hasHtml() hasHtml()}, {@link com.trolltech.qt.core.QMimeData#setText(java.lang.String) setText()}, and {@link com.trolltech.qt.core.QMimeData#setData(java.lang.String, com.trolltech.qt.core.QByteArray) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHtml(java.lang.String html)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHtml_String(nativeId(), html);
    }
    @QtBlockedSlot
    native void __qt_setHtml_String(long __this__nativeId, java.lang.String html);

/**
Sets the data in the object to the given <tt>image</tt>. <p>A {@link com.trolltech.qt.QVariant QVariant} is used because QMimeData belongs to the {@link <a href="../qtcore.html">QtCore</a>} library, whereas {@link com.trolltech.qt.gui.QImage QImage} belongs to {@link <a href="../qtgui.html">QtGui</a>}. The conversion from {@link com.trolltech.qt.gui.QImage QImage} to {@link com.trolltech.qt.QVariant QVariant} is implicit. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
mimeData-&gt;setImageData(QImage("beautifulfjord.png"));
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#imageData() imageData()}, {@link com.trolltech.qt.core.QMimeData#hasImage() hasImage()}, and {@link com.trolltech.qt.core.QMimeData#setData(java.lang.String, com.trolltech.qt.core.QByteArray) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setImageData(java.lang.Object image)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setImageData_Object(nativeId(), image);
    }
    @QtBlockedSlot
    native void __qt_setImageData_Object(long __this__nativeId, java.lang.Object image);

/**
Sets <tt>text</tt> as the plain text (MIME type <tt>text/plain</tt>) used to represent the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#text() text()}, {@link com.trolltech.qt.core.QMimeData#hasText() hasText()}, {@link com.trolltech.qt.core.QMimeData#setHtml(java.lang.String) setHtml()}, and {@link com.trolltech.qt.core.QMimeData#setData(java.lang.String, com.trolltech.qt.core.QByteArray) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setText(java.lang.String text)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setText_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setText_String(long __this__nativeId, java.lang.String text);

/**
Sets the URLs stored in the MIME data object to those specified by <tt>urls</tt>. <p>URLs correspond to the MIME type <tt>text/uri-list</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#urls() urls()}, {@link com.trolltech.qt.core.QMimeData#hasUrls() hasUrls()}, and {@link com.trolltech.qt.core.QMimeData#setData(java.lang.String, com.trolltech.qt.core.QByteArray) setData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUrls(java.util.List<com.trolltech.qt.core.QUrl> urls)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setUrls_List(nativeId(), urls);
    }
    @QtBlockedSlot
    native void __qt_setUrls_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QUrl> urls);

/**
Returns a plain text (MIME type <tt>text/plain</tt>) representation of the data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#setText(java.lang.String) setText()}, {@link com.trolltech.qt.core.QMimeData#hasText() hasText()}, {@link com.trolltech.qt.core.QMimeData#html() html()}, and {@link com.trolltech.qt.core.QMimeData#data(java.lang.String) data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String text()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_text(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_text(long __this__nativeId);

/**
Returns a list of URLs contained within the MIME data object. <p>URLs correspond to the MIME type <tt>text/uri-list</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#setUrls(java.util.List) setUrls()}, {@link com.trolltech.qt.core.QMimeData#hasUrls() hasUrls()}, and {@link com.trolltech.qt.core.QMimeData#data(java.lang.String) data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.core.QUrl> urls()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_urls(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QUrl> __qt_urls(long __this__nativeId);

/**
Returns a list of formats supported by the object. This is a list of MIME types for which the object can return suitable data. The formats in the list are in a priority order. <p>For the most common types of data, you can call the higher-level functions {@link com.trolltech.qt.core.QMimeData#hasText() hasText()}, {@link com.trolltech.qt.core.QMimeData#hasHtml() hasHtml()}, {@link com.trolltech.qt.core.QMimeData#hasUrls() hasUrls()}, {@link com.trolltech.qt.core.QMimeData#hasImage() hasImage()}, and {@link com.trolltech.qt.core.QMimeData#hasColor() hasColor()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#hasFormat(java.lang.String) hasFormat()}, {@link com.trolltech.qt.core.QMimeData#setData(java.lang.String, com.trolltech.qt.core.QByteArray) setData()}, and {@link com.trolltech.qt.core.QMimeData#data(java.lang.String) data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> formats()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_formats(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_formats(long __this__nativeId);

/**
Returns true if the object can return data for the MIME type specified by <tt>mimeType</tt>; otherwise returns false. <p>For the most common types of data, you can call the higher-level functions {@link com.trolltech.qt.core.QMimeData#hasText() hasText()}, {@link com.trolltech.qt.core.QMimeData#hasHtml() hasHtml()}, {@link com.trolltech.qt.core.QMimeData#hasUrls() hasUrls()}, {@link com.trolltech.qt.core.QMimeData#hasImage() hasImage()}, and {@link com.trolltech.qt.core.QMimeData#hasColor() hasColor()} instead. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#formats() formats()}, {@link com.trolltech.qt.core.QMimeData#setData(java.lang.String, com.trolltech.qt.core.QByteArray) setData()}, and {@link com.trolltech.qt.core.QMimeData#data(java.lang.String) data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public boolean hasFormat(java.lang.String mimetype)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasFormat_String(nativeId(), mimetype);
    }
    @QtBlockedSlot
    native boolean __qt_hasFormat_String(long __this__nativeId, java.lang.String mimetype);

/**
Returns a variant with the given <tt>type</tt> containing data for the MIME type specified by <tt>mimeType</tt>. If the object does not support the MIME type or variant type given, a null variant is returned instead. <p>This function is called by the general {@link com.trolltech.qt.core.QMimeData#data(java.lang.String) data()} getter and by the convenience getters ({@link com.trolltech.qt.core.QMimeData#text() text()}, {@link com.trolltech.qt.core.QMimeData#html() html()}, {@link com.trolltech.qt.core.QMimeData#urls() urls()}, {@link com.trolltech.qt.core.QMimeData#imageData() imageData()}, and {@link com.trolltech.qt.core.QMimeData#colorData() colorData()}). You can reimplement it if you want to store your data using a custom data structure (instead of a {@link com.trolltech.qt.core.QByteArray QByteArray}, which is what {@link com.trolltech.qt.core.QMimeData#setData(java.lang.String, com.trolltech.qt.core.QByteArray) setData()} provides). You would then also need to reimplement {@link com.trolltech.qt.core.QMimeData#hasFormat(java.lang.String) hasFormat()} and {@link com.trolltech.qt.core.QMimeData#formats() formats()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QMimeData#data(java.lang.String) data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected java.lang.Object retrieveData(java.lang.String mimetype, int preferredType)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_retrieveData_String_int(nativeId(), mimetype, preferredType);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_retrieveData_String_int(long __this__nativeId, java.lang.String mimetype, int preferredType);

/**
@exclude
*/

    public static native QMimeData fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QMimeData(QPrivateConstructor p) { super(p); } 
}
