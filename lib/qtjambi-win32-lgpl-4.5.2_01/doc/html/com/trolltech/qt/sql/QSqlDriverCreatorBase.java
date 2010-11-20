package com.trolltech.qt.sql;

import com.trolltech.qt.*;



/**
The QSqlDriverCreatorBase class is the base class for SQL driver factories. Reimplement {@link com.trolltech.qt.sql.QSqlDriverCreatorBase#createObject() createObject()} to return an instance of the specific {@link com.trolltech.qt.sql.QSqlDriver QSqlDriver} subclass that you want to provide. <p>See {@link com.trolltech.qt.sql.QSqlDatabase#registerSqlDriver(java.lang.String, com.trolltech.qt.sql.QSqlDriverCreatorBase) QSqlDatabase::registerSqlDriver()} for details. <p><DT><b>See also:</b><br><DD>QSqlDriverCreator. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QSqlDriverCreatorBase extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.sql.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.qt.sql.QSqlDriverCreatorBase {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.sql.QSqlDriver createObject() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_createObject(nativeId());
        }
    }


/**
Creates a new QSqlDriverCreatorBase. Currently, this does nothing.
*/

    public QSqlDriverCreatorBase(){
        super((QPrivateConstructor)null);
        __qt_QSqlDriverCreatorBase();
    }

    native void __qt_QSqlDriverCreatorBase();

/**
Reimplement this function to returns a new instance of a {@link com.trolltech.qt.sql.QSqlDriver QSqlDriver} subclass.
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.sql.QSqlDriver createObject();
    @QtBlockedSlot
    native com.trolltech.qt.sql.QSqlDriver __qt_createObject(long __this__nativeId);

/**
@exclude
*/

    public static native QSqlDriverCreatorBase fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSqlDriverCreatorBase(QPrivateConstructor p) { super(p); } 
}
