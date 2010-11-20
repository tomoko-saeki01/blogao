package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QVBoxLayout class lines up widgets vertically. This class is used to construct vertical box layout objects. See {@link com.trolltech.qt.gui.QBoxLayout QBoxLayout} for details. <p>The simplest use of the class is like this: <pre class="snippet">
        QWidget window = new QWidget();
    
        QPushButton button1 = new QPushButton("One");
    
        QPushButton button2 = new QPushButton("Two");
        QPushButton button3 = new QPushButton("Three");
        QPushButton button4 = new QPushButton("Four");
        QPushButton button5 = new QPushButton("Five");
    <br>
        QVBoxLayout layout = new QVBoxLayout();
    
        layout.addWidget(button1);
        layout.addWidget(button2);
        layout.addWidget(button3);
        layout.addWidget(button4);
        layout.addWidget(button5);

        window.setLayout(layout);
    
        window.show();
    </pre> First, we create the widgets we want in the layout. Then, we create the QVBoxLayout object and add the widgets into the layout. Finally, we call {@link com.trolltech.qt.gui.QWidget#setLayout(com.trolltech.qt.gui.QLayout) QWidget::setLayout()} to install the QVBoxLayout object onto the widget. At that point, the widgets in the layout are reparented to have <tt>window</tt> as their parent. <br><center><img src="../images/qvboxlayout-with-5-children.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QHBoxLayout QHBoxLayout}, {@link com.trolltech.qt.gui.QGridLayout QGridLayout}, {@link com.trolltech.qt.gui.QStackedLayout QStackedLayout}, {@link <a href="../qtjambi-layout.html">Layout Classes</a>}, and {@link <a href="../layouts-basiclayouts.html">Basic Layouts Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QVBoxLayout extends com.trolltech.qt.gui.QBoxLayout
{

/**
Constructs a new vertical box. You must add it to another layout.
*/

    public QVBoxLayout(){
        super((QPrivateConstructor)null);
        __qt_QVBoxLayout();
    }

    native void __qt_QVBoxLayout();

/**
Constructs a new top-level vertical box with parent <tt>parent</tt>.
*/

    public QVBoxLayout(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QVBoxLayout_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QVBoxLayout_QWidget(long parent);

/**
@exclude
*/

    public static native QVBoxLayout fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QVBoxLayout(QPrivateConstructor p) { super(p); } 
}
