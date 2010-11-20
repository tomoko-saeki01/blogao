package com.trolltech.qt.xml;

import com.trolltech.qt.*;



/**
The QXmlInputSource class provides the input data for the {@link com.trolltech.qt.xml.QXmlReader QXmlReader} subclasses. All subclasses of {@link com.trolltech.qt.xml.QXmlReader QXmlReader} read the input XML document from this class. <p>This class recognizes the encoding of the data by reading the encoding declaration in the XML file if it finds one, and reading the data using the corresponding encoding. If it does not find an encoding declaration, then it assumes that the data is either in UTF-8 or UTF-16, depending on whether it can find a byte-order mark. <p>There are two ways to populate the input source with data: you can construct it with a {@link com.trolltech.qt.core.QIODevice QIODevice}* so that the input source reads the data from that device. Or you can set the data explicitly with one of the {@link com.trolltech.qt.xml.QXmlInputSource#setData(com.trolltech.qt.core.QByteArray) setData()} functions. <p>Usually you either construct a QXmlInputSource that works on a {@link com.trolltech.qt.core.QIODevice QIODevice}* or you construct an empty QXmlInputSource and set the data with {@link com.trolltech.qt.xml.QXmlInputSource#setData(com.trolltech.qt.core.QByteArray) setData()}. There are only rare occasions where you would want to mix both methods. <p>The {@link com.trolltech.qt.xml.QXmlReader QXmlReader} subclasses use the {@link com.trolltech.qt.xml.QXmlInputSource#next() next()} function to read the input character by character. If you want to start from the beginning again, use {@link com.trolltech.qt.xml.QXmlInputSource#reset() reset()}. <p>The functions {@link com.trolltech.qt.xml.QXmlInputSource#data() data()} and {@link com.trolltech.qt.xml.QXmlInputSource#fetchData() fetchData()} are useful if you want to do something with the data other than parsing, e.g. displaying the raw XML file. The benefit of using the QXmlInputClass in such cases is that it tries to use the correct encoding. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlReader QXmlReader}, and {@link com.trolltech.qt.xml.QXmlSimpleReader QXmlSimpleReader}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QXmlInputSource extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.xml.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an input source which contains no data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlInputSource#setData(com.trolltech.qt.core.QByteArray) setData()}. <br></DD></DT>
*/

    public QXmlInputSource(){
        super((QPrivateConstructor)null);
        __qt_QXmlInputSource();
    }

    native void __qt_QXmlInputSource();

/**
Constructs an input source and gets the data from device <tt>dev</tt>. If <tt>dev</tt> is not open, it is opened in read-only mode. If <tt>dev</tt> is 0 or it is not possible to read from the device, the input source will contain no data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlInputSource#setData(com.trolltech.qt.core.QByteArray) setData()}, {@link com.trolltech.qt.xml.QXmlInputSource#fetchData() fetchData()}, and {@link com.trolltech.qt.core.QIODevice QIODevice}. <br></DD></DT>
*/

    public QXmlInputSource(com.trolltech.qt.core.QIODevice dev){
        super((QPrivateConstructor)null);
        __qt_QXmlInputSource_QIODevice(dev == null ? 0 : dev.nativeId());
    }

    native void __qt_QXmlInputSource_QIODevice(long dev);

/**
Returns the data the input source contains or an empty string if the input source does not contain any data. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlInputSource#setData(com.trolltech.qt.core.QByteArray) setData()}, QXmlInputSource(), and {@link com.trolltech.qt.xml.QXmlInputSource#fetchData() fetchData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.lang.String data()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_data(long __this__nativeId);

/**
This function reads more data from the device that was set during construction. If the input source already contained data, this function deletes that data first. <p>This object contains no data after a call to this function if the object was constructed without a device to read data from or if this function was not able to get more data from the device. <p>There are two occasions where a fetch is done implicitly by another function call: during construction (so that the object starts out with some initial data where available), and during a call to {@link com.trolltech.qt.xml.QXmlInputSource#next() next()} (if the data had run out). <p>You don't normally need to use this function if you use {@link com.trolltech.qt.xml.QXmlInputSource#next() next()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlInputSource#data() data()}, {@link com.trolltech.qt.xml.QXmlInputSource#next() next()}, and QXmlInputSource(). <br></DD></DT>
*/

    @QtBlockedSlot
    public void fetchData()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fetchData(nativeId());
    }
    @QtBlockedSlot
    native void __qt_fetchData(long __this__nativeId);


/**
This function reads the XML file from <tt>data</tt> and tries to recognize the encoding. It converts the raw data <tt>data</tt> into a QString and returns it. It tries its best to get the correct encoding for the XML file. <p>If <tt>beginning</tt> is true, this function assumes that the data starts at the beginning of a new XML document and looks for an encoding declaration. If <tt>beginning</tt> is false, it converts the raw data using the encoding determined from prior calls.
*/

    @QtBlockedSlot
    protected final java.lang.String fromRawData(com.trolltech.qt.core.QByteArray data) {
        return fromRawData(data, (boolean)false);
    }
/**
This function reads the XML file from <tt>data</tt> and tries to recognize the encoding. It converts the raw data <tt>data</tt> into a QString and returns it. It tries its best to get the correct encoding for the XML file. <p>If <tt>beginning</tt> is true, this function assumes that the data starts at the beginning of a new XML document and looks for an encoding declaration. If <tt>beginning</tt> is false, it converts the raw data using the encoding determined from prior calls.
*/

    @QtBlockedSlot
    protected java.lang.String fromRawData(com.trolltech.qt.core.QByteArray data, boolean beginning)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_fromRawData_QByteArray_boolean(nativeId(), data == null ? 0 : data.nativeId(), beginning);
    }
    @QtBlockedSlot
    native java.lang.String __qt_fromRawData_QByteArray_boolean(long __this__nativeId, long data, boolean beginning);

/**
Returns the next character of the input source. If this function reaches the end of available data, it returns QXmlInputSource::EndOfData. If you call {@link com.trolltech.qt.xml.QXmlInputSource#next() next()} after that, it tries to fetch more data by calling {@link com.trolltech.qt.xml.QXmlInputSource#fetchData() fetchData()}. If the {@link com.trolltech.qt.xml.QXmlInputSource#fetchData() fetchData()} call results in new data, this function returns the first character of that data; otherwise it returns QXmlInputSource::EndOfDocument. <p>Readers, such as {@link com.trolltech.qt.xml.QXmlSimpleReader QXmlSimpleReader}, will assume that the end of the XML document has been reached if the this function returns QXmlInputSource::EndOfDocument, and will check that the supplied input is well-formed. Therefore, when reimplementing this function, it is important to ensure that this behavior is duplicated. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlInputSource#reset() reset()}, {@link com.trolltech.qt.xml.QXmlInputSource#fetchData() fetchData()}, QXmlSimpleReader::parse(), and {@link com.trolltech.qt.xml.QXmlSimpleReader#parseContinue() QXmlSimpleReader::parseContinue()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public char next()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_next(nativeId());
    }
    @QtBlockedSlot
    native char __qt_next(long __this__nativeId);

/**
This function sets the position used by {@link com.trolltech.qt.xml.QXmlInputSource#next() next()} to the beginning of the data returned by {@link com.trolltech.qt.xml.QXmlInputSource#data() data()}. This is useful if you want to use the input source for more than one parse. <p><b>Note:</b> In the case that the underlying data source is a {@link com.trolltech.qt.core.QIODevice QIODevice}, the current position in the device is not automatically set to the start of input. Call QIODevice::seek(0) on the device to do this. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlInputSource#next() next()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void reset()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_reset(nativeId());
    }
    @QtBlockedSlot
    native void __qt_reset(long __this__nativeId);

/**
This is an overloaded member function, provided for convenience. <p>The data <tt>dat</tt> is passed through the correct text-codec, before it is set.
*/

    @QtBlockedSlot
    public void setData(com.trolltech.qt.core.QByteArray dat)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setData_QByteArray(nativeId(), dat == null ? 0 : dat.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setData_QByteArray(long __this__nativeId, long dat);

/**
Sets the data of the input source to <tt>dat</tt>. <p>If the input source already contains data, this function deletes that data first. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xml.QXmlInputSource#data() data()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public void setData(java.lang.String dat)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setData_String(nativeId(), dat);
    }
    @QtBlockedSlot
    native void __qt_setData_String(long __this__nativeId, java.lang.String dat);

/**
Returns true if the end of the available data has been met.
*/

    public native static char EndOfData();

/**
Returns true if the end of the XML document has been reached.
*/

    public native static char EndOfDocument();

/**
@exclude
*/

    public static native QXmlInputSource fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlInputSource(QPrivateConstructor p) { super(p); } 
}
