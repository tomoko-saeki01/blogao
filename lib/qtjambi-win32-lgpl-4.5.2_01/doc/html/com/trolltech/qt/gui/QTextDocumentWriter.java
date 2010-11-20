package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextDocumentWriter class provides a format-independent interface for writing a {@link com.trolltech.qt.gui.QTextDocument QTextDocument} to files or other devices. To write a document, construct a QTextDocumentWriter object with either a file name or a device object, and specify the document format to be written. You can construct a writer and set the format using {@link com.trolltech.qt.gui.QTextDocumentWriter#setFormat(com.trolltech.qt.core.QByteArray) setFormat()} later. <p>Call {@link com.trolltech.qt.gui.QTextDocumentWriter#write(com.trolltech.qt.gui.QTextDocument) write()} to write the document to the device. If the document is successfully written, this function returns true. However, if an error occurs when writing the document, it will return false. <p>Call {@link com.trolltech.qt.gui.QTextDocumentWriter#supportedDocumentFormats() supportedDocumentFormats()} for a list of formats that QTextDocumentWriter can write. <p>Since the capabilities of the supported output formats vary considerably, the writer simply outputs the appropriate subset of objects for each format. This typically includes the formatted text and images contained in a document.
*/
@QtJambiGeneratedClass
public class QTextDocumentWriter extends com.trolltech.qt.QtJambiObject
{

    private Object __rcDevice = null;

    private Object __rcCodec = null;

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an empty QTextDocumentWriter object. Before writing, you must call {@link com.trolltech.qt.gui.QTextDocumentWriter#setFormat(com.trolltech.qt.core.QByteArray) setFormat()} to set a document format, then {@link com.trolltech.qt.gui.QTextDocumentWriter#setDevice(com.trolltech.qt.core.QIODevice) setDevice()} or {@link com.trolltech.qt.gui.QTextDocumentWriter#setFileName(java.lang.String) setFileName()}.
*/

    public QTextDocumentWriter(){
        super((QPrivateConstructor)null);
        __qt_QTextDocumentWriter();
    }

    native void __qt_QTextDocumentWriter();

/**
Constructs a QTextDocumentWriter object to write to the given <tt>device</tt> in the document format specified by <tt>format</tt>.
*/

    public QTextDocumentWriter(com.trolltech.qt.core.QIODevice device, com.trolltech.qt.core.QByteArray format){
        super((QPrivateConstructor)null);
        __qt_QTextDocumentWriter_QIODevice_QByteArray(device == null ? 0 : device.nativeId(), format == null ? 0 : format.nativeId());
    }

    native void __qt_QTextDocumentWriter_QIODevice_QByteArray(long device, long format);


/**
Constructs an QTextDocumentWriter object that will write to a file with the name <tt>fileName</tt>, using the document format specified by <tt>format</tt>. If <tt>format</tt> is not provided, QTextDocumentWriter will detect the document format by inspecting the extension of <tt>fileName</tt>.
*/

    public QTextDocumentWriter(java.lang.String fileName) {
        this(fileName, (com.trolltech.qt.core.QByteArray)new com.trolltech.qt.core.QByteArray());
    }
/**
Constructs an QTextDocumentWriter object that will write to a file with the name <tt>fileName</tt>, using the document format specified by <tt>format</tt>. If <tt>format</tt> is not provided, QTextDocumentWriter will detect the document format by inspecting the extension of <tt>fileName</tt>.
*/

    public QTextDocumentWriter(java.lang.String fileName, com.trolltech.qt.core.QByteArray format){
        super((QPrivateConstructor)null);
        __qt_QTextDocumentWriter_String_QByteArray(fileName, format == null ? 0 : format.nativeId());
    }

    native void __qt_QTextDocumentWriter_String_QByteArray(java.lang.String fileName, long format);

/**
Returns the codec that is currently assigned to the writer. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentWriter#setCodec(com.trolltech.qt.core.QTextCodec) setCodec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextCodec codec()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_codec(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextCodec __qt_codec(long __this__nativeId);

/**
Returns the device currently assigned, or 0 if no device has been assigned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentWriter#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QIODevice device()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_device(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QIODevice __qt_device(long __this__nativeId);

/**
If the currently assigned device is a {@link com.trolltech.qt.core.QFile QFile}, or if {@link com.trolltech.qt.gui.QTextDocumentWriter#setFileName(java.lang.String) setFileName()} has been called, this function returns the name of the file to be written to. In all other cases, it returns an empty string. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentWriter#setFileName(java.lang.String) setFileName()}, and {@link com.trolltech.qt.gui.QTextDocumentWriter#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
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
Returns the format used for writing documents. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentWriter#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QByteArray format()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_format(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QByteArray __qt_format(long __this__nativeId);

/**
Sets the codec for this stream to <tt>codec</tt>. The codec is used for encoding any data that is written. By default, QTextDocumentWriter uses UTF-8. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentWriter#codec() codec()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCodec(com.trolltech.qt.core.QTextCodec codec)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcCodec = codec;
        }
        __qt_setCodec_QTextCodec(nativeId(), codec == null ? 0 : codec.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCodec_QTextCodec(long __this__nativeId, long codec);

/**
Sets the writer's device to the <tt>device</tt> specified. If a device has already been set, the old device is removed but otherwise left unchanged. <p>If the device is not already open, QTextDocumentWriter will attempt to open the device in {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::WriteOnly } mode by calling open(). <p><b>Note:</b> This will not work for certain devices, such as {@link com.trolltech.qt.core.QProcess QProcess}, {@link com.trolltech.qt.network.QTcpSocket QTcpSocket} and {@link com.trolltech.qt.network.QUdpSocket QUdpSocket}, where some configuration is required before the device can be opened. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentWriter#device() device()}, and {@link com.trolltech.qt.gui.QTextDocumentWriter#setFileName(java.lang.String) setFileName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDevice(com.trolltech.qt.core.QIODevice device)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcDevice = device;
        }
        __qt_setDevice_QIODevice(nativeId(), device == null ? 0 : device.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDevice_QIODevice(long __this__nativeId, long device);

/**
Sets the name of the file to be written to <tt>fileName</tt>. Internally, QTextDocumentWriter will create a {@link com.trolltech.qt.core.QFile QFile} and open it in {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::WriteOnly } mode, and use this file when writing the document. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentWriter#fileName() fileName()}, and {@link com.trolltech.qt.gui.QTextDocumentWriter#setDevice(com.trolltech.qt.core.QIODevice) setDevice()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFileName(java.lang.String fileName)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFileName_String(nativeId(), fileName);
    }
    @QtBlockedSlot
    native void __qt_setFileName_String(long __this__nativeId, java.lang.String fileName);

/**
Sets the format used to write documents to the <tt>format</tt> specified. <tt>format</tt> is a case insensitive text string. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
        QTextDocumentWriter writer;
        writer.setFormat("odf"); // same as writer.setFormat("ODF");
</pre> You can call {@link com.trolltech.qt.gui.QTextDocumentWriter#supportedDocumentFormats() supportedDocumentFormats()} for the full list of formats QTextDocumentWriter supports. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentWriter#format() format()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setFormat(com.trolltech.qt.core.QByteArray format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFormat_QByteArray(nativeId(), format == null ? 0 : format.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFormat_QByteArray(long __this__nativeId, long format);

/**
Writes the given <tt>document</tt> to the assigned device or file and returns true if successful; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean write(com.trolltech.qt.gui.QTextDocument document)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_write_QTextDocument(nativeId(), document == null ? 0 : document.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_write_QTextDocument(long __this__nativeId, long document);

/**
Writes the document fragment specified by <tt>fragment</tt> to the assigned device or file and returns true if successful; otherwise returns false.
*/

    @QtBlockedSlot
    public final boolean write(com.trolltech.qt.gui.QTextDocumentFragment fragment)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_write_QTextDocumentFragment(nativeId(), fragment == null ? 0 : fragment.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_write_QTextDocumentFragment(long __this__nativeId, long fragment);

/**
Returns the list of document formats supported by QTextDocumentWriter. <p>By default, Qt can write the following formats: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Format</center></th><th><center> Description</center></th></tr></thead><tr valign="top" class="even"><td> plaintext</td><td> Plain text</td></tr><tr valign="top" class="odd"><td> HTML</td><td> HyperText Markup Language</td></tr><tr valign="top" class="even"><td> ODF</td><td> OpenDocument Format</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextDocumentWriter#setFormat(com.trolltech.qt.core.QByteArray) setFormat()}. <br></DD></DT>
*/

    public native static java.util.List<com.trolltech.qt.core.QByteArray> supportedDocumentFormats();

/**
@exclude
*/

    public static native QTextDocumentWriter fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextDocumentWriter(QPrivateConstructor p) { super(p); } 
}
