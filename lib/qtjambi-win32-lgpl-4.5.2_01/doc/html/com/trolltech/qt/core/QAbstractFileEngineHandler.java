package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QAbstractFileEngineHandler class provides a way to register custom file engines with your application. QAbstractFileEngineHandler is a factory for creating {@link com.trolltech.qt.core.QAbstractFileEngine QAbstractFileEngine} objects (file engines), which are used internally by {@link com.trolltech.qt.core.QFile QFile}, {@link com.trolltech.qt.core.QFileInfo QFileInfo}, and {@link com.trolltech.qt.core.QDir QDir} when working with files and directories. <p>When you open a file, Qt chooses a suitable file engine by passing the file name from {@link com.trolltech.qt.core.QFile QFile} or {@link com.trolltech.qt.core.QDir QDir} through an internal list of registered file engine handlers. The first handler to recognize the file name is used to create the engine. Qt provides internal file engines for working with regular files and resources, but you can also register your own {@link com.trolltech.qt.core.QAbstractFileEngine QAbstractFileEngine} subclasses. <p>To install an application-specific file engine, you subclass QAbstractFileEngineHandler and reimplement {@link com.trolltech.qt.core.QAbstractFileEngineHandler#create(java.lang.String) create()}. When you instantiate the handler (e.g. by creating an instance on the stack or on the heap), it will automatically register with Qt. (The latest registered handler takes precedence over existing handlers.) <p>For example: <pre class="snippet">
    public static class ZipEngineHandler extends QAbstractFileEngineHandler
    {
        public QAbstractFileEngine create(String fileName)
        {
            // ZipEngineHandler returns a ZipEngine for all .zip files
            if (fileName.toLowerCase().endsWith(".zip")) {
                return new ZipEngine(fileName);
            } else {
                return null;
            }
        }
    }

    // ...

    public static void main(String args[])
    {
        QApplication.initialize(args);

        ZipEngineHandler engine = new ZipEngineHandler();

        MainWindow window = new MainWindow(null);
        window.show();

        QApplication.exec();
    }
</pre> When the handler is destroyed, it is automatically removed from Qt. <p>The most common approach to registering a handler is to create an instance as part of the start-up phase of your application. It is also possible to limit the scope of the file engine handler to a particular area of interest (e.g. a special file dialog that needs a custom file engine). By creating the handler inside a local scope, you can precisely control the area in which your engine will be applied without disturbing file operations in other parts of your application. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine QAbstractFileEngine}, and {@link com.trolltech.qt.core.QAbstractFileEngine#create(java.lang.String) QAbstractFileEngine::create()}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAbstractFileEngineHandler extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.core.QAbstractFileEngineHandler {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QAbstractFileEngine create(java.lang.String fileName) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_create_String(nativeId(), fileName);
        }
    }


/**
Constructs a file handler and registers it with Qt. Once created this handler's {@link com.trolltech.qt.core.QAbstractFileEngineHandler#create(java.lang.String) create()} function will be called (along with all the other handlers) for any paths used. The most recently created handler that recognizes the given path (i.e. that returns a {@link com.trolltech.qt.core.QAbstractFileEngine QAbstractFileEngine}) is used for the new path. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngineHandler#create(java.lang.String) create()}. <br></DD></DT>
*/

    public QAbstractFileEngineHandler(){
        super((QPrivateConstructor)null);
        __qt_QAbstractFileEngineHandler();
    }

    native void __qt_QAbstractFileEngineHandler();

/**
Creates a file engine for file <tt>fileName</tt>. Returns 0 if this file handler cannot handle <tt>fileName</tt>. <p>Example: <pre class="snippet">
    public QAbstractFileEngine create(String fileName)
    {
        // ZipEngineHandler returns a ZipEngine for all .zip files
        if (fileName.toLowerCase().endsWith(".zip")) {
            return new ZipEngine(fileName);
        } else {
            return null;
        }
    }
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QAbstractFileEngine#create(java.lang.String) QAbstractFileEngine::create()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QAbstractFileEngine create(java.lang.String fileName);
    @QtBlockedSlot
    native com.trolltech.qt.core.QAbstractFileEngine __qt_create_String(long __this__nativeId, java.lang.String fileName);

/**
@exclude
*/

    public static native QAbstractFileEngineHandler fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAbstractFileEngineHandler(QPrivateConstructor p) { super(p); } 
}
