package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QTextCodecPlugin class provides an abstract base for custom {@link com.trolltech.qt.core.QTextCodec QTextCodec} plugins. The text codec plugin is a simple plugin interface that makes it easy to create custom text codecs that can be loaded dynamically into applications. <p>Writing a text codec plugin is achieved by subclassing this base class, reimplementing the pure virtual functions {@link com.trolltech.qt.gui.QTextCodecPlugin#names() names()}, {@link com.trolltech.qt.gui.QTextCodecPlugin#aliases() aliases()}, {@link com.trolltech.qt.gui.QTextCodecPlugin#createForName(com.trolltech.qt.core.QByteArray) createForName()}, {@link com.trolltech.qt.gui.QTextCodecPlugin#mibEnums() mibEnums()} and {@link com.trolltech.qt.gui.QTextCodecPlugin#createForMib(int) createForMib()}, and exporting the class with the Q_EXPORT_PLUGIN2() macro. See {@link <a href="../plugins-howto.html">How to Create Qt Plugins</a>} for details. <p>See the IANA character-sets encoding file for more information on mime names and mib enums.
*/
@QtJambiGeneratedClass
public abstract class QTextCodecPlugin extends com.trolltech.qt.core.QObject
    implements com.trolltech.qt.gui.QAbstractTextCodecFactoryInterface,
            com.trolltech.qt.core.QAbstractFactoryInterface
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QTextCodecPlugin {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public java.util.List<com.trolltech.qt.core.QByteArray> aliases() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_aliases(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QTextCodec createForMib(int mib) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_createForMib_int(nativeId(), mib);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QTextCodec createForName(com.trolltech.qt.core.QByteArray name) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_createForName_QByteArray(nativeId(), name == null ? 0 : name.nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.util.List<java.lang.Integer> mibEnums() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_mibEnums(nativeId());
        }

        @Override
        @QtBlockedSlot
        public java.util.List<com.trolltech.qt.core.QByteArray> names() {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_names(nativeId());
        }
    }



/**
Constructs a text codec plugin with the given <tt>parent</tt>. This is invoked automatically by the Q_EXPORT_PLUGIN2() macro.
*/

    public QTextCodecPlugin() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a text codec plugin with the given <tt>parent</tt>. This is invoked automatically by the Q_EXPORT_PLUGIN2() macro.
*/

    public QTextCodecPlugin(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QTextCodecPlugin_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QTextCodecPlugin_QObject(long parent);

/**
Creates a {@link com.trolltech.qt.core.QTextCodec QTextCodec} object for the codec called <tt>name</tt>. The <tt>name</tt> must come from the list of encodings returned by {@link com.trolltech.qt.gui.QTextCodecPlugin#names() names()}. Encoding names are case sensitive. <p>Example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
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

    @Deprecated
    @QtBlockedSlot
    public final com.trolltech.qt.core.QTextCodec create(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_create_String(nativeId(), name);
    }
    @Deprecated
    @QtBlockedSlot
    final com.trolltech.qt.core.QTextCodec __qt_create_String(long __this__nativeId, java.lang.String name)
    {
        throw new com.trolltech.qt.QNoImplementationException();
    }


/**
Returns the list of keys this abstract factory supports. Each key represents an object the factory can produce.
*/

    @Deprecated
    @QtBlockedSlot
    public final java.util.List<java.lang.String> keys()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_keys(nativeId());
    }
    @Deprecated
    @QtBlockedSlot
    final java.util.List<java.lang.String> __qt_keys(long __this__nativeId)
    {
        throw new com.trolltech.qt.QNoImplementationException();
    }


/**
Returns the list of aliases supported by this plugin.
*/

    @QtBlockedSlot
    public abstract java.util.List<com.trolltech.qt.core.QByteArray> aliases();
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QByteArray> __qt_aliases(long __this__nativeId);

/**
Creates a {@link com.trolltech.qt.core.QTextCodec QTextCodec} object for the mib enum <tt>mib</tt>. <p>See the IANA character-sets encoding file for more information. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCodecPlugin#mibEnums() mibEnums()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QTextCodec createForMib(int mib);
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextCodec __qt_createForMib_int(long __this__nativeId, int mib);

/**
Creates a {@link com.trolltech.qt.core.QTextCodec QTextCodec} object for the codec called <tt>name</tt>. The <tt>name</tt> must come from the list of encodings returned by {@link com.trolltech.qt.gui.QTextCodecPlugin#names() names()}. Encoding names are case sensitive. <p>Example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
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
    public abstract com.trolltech.qt.core.QTextCodec createForName(com.trolltech.qt.core.QByteArray name);
    @QtBlockedSlot
    native com.trolltech.qt.core.QTextCodec __qt_createForName_QByteArray(long __this__nativeId, long name);

/**
Returns the list of mib enums supported by this plugin. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCodecPlugin#createForMib(int) createForMib()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<java.lang.Integer> mibEnums();
    @QtBlockedSlot
    native java.util.List<java.lang.Integer> __qt_mibEnums(long __this__nativeId);

/**
Returns the list of MIME names supported by this plugin. <p>If a codec has several names, the extra names are returned by {@link com.trolltech.qt.gui.QTextCodecPlugin#aliases() aliases()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QTextCodecPlugin#createForName(com.trolltech.qt.core.QByteArray) createForName()}, and {@link com.trolltech.qt.gui.QTextCodecPlugin#aliases() aliases()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.util.List<com.trolltech.qt.core.QByteArray> names();
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QByteArray> __qt_names(long __this__nativeId);

/**
@exclude
*/

    public static native QTextCodecPlugin fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QTextCodecPlugin(QPrivateConstructor p) { super(p); } 

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
