package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public abstract class QAbstractTextCodecFactory extends com.trolltech.qt.QtJambiObject
    implements com.trolltech.qt.gui.QAbstractTextCodecFactoryInterface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAbstractTextCodecFactory {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QTextCodec create(java.lang.String key) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_create_String(nativeId(), key);
        }

        @Override
        @QtBlockedSlot
        public java.util.List<java.lang.String> keys() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_keys(nativeId());
        }
    }


/**

*/

    public QAbstractTextCodecFactory(){
        super((QPrivateConstructor)null);
        __qt_QAbstractTextCodecFactory();
    }

    native void __qt_QAbstractTextCodecFactory();

/**
Creates a {@link com.trolltech.qt.core.QTextCodec QTextCodec} object for the codec called <tt>key</tt>. The <tt>key</tt> must come from the list of encodings returned by {@link com.trolltech.qt.gui.QTextCodecPlugin#names() names()}. Encoding names are case sensitive. <p>Example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
QList&lt;QByteArray&gt; MyCodecPlugin::names() const
{
    return QList&lt;QByteArray&gt; &lt;&lt; "IBM01140" &lt;&lt; "hp15-tw";
}

QTextCodec *MyCodecPlugin::createForName(const QByteArray &name)
{
    if (name == "IBM01140") {
        return new Ibm01140Codec;
    } else if (name == "hp15-tw") {
        return new Hp15TwCodec;
    }
    return 0;
}
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCodecPlugin#names() names()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QTextCodec create(java.lang.String key);
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextCodec __qt_create_String(long __this__nativeId, java.lang.String key);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.String> keys();
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_keys(long __this__nativeId);

/**
@exclude
*/

    public static native QAbstractTextCodecFactory fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractTextCodecFactory(QPrivateConstructor p) { super(p); } 

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractTextCodecFactory(long ptr);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot public native long __qt_cast_to_QAbstractFactory(long ptr);
}
