package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QHBoxLayout class lines up widgets horizontally. This class is used to construct horizontal box layout objects. See {@link com.trolltech.qt.gui.QBoxLayout QBoxLayout} for details. <p>The simplest use of the class is like this: <pre class="snippet">
        QWidget window = new QWidget();
    
        QPushButton button1 = new QPushButton("One");
    
        QPushButton button2 = new QPushButton("Two");
        QPushButton button3 = new QPushButton("Three");
        QPushButton button4 = new QPushButton("Four");
        QPushButton button5 = new QPushButton("Five");
    <br>
        QHBoxLayout layout = new QHBoxLayout();
    
        layout.addWidget(button1);
        layout.addWidget(button2);
        layout.addWidget(button3);
        layout.addWidget(button4);
        layout.addWidget(button5);

        window.setLayout(layout);
    
        window.show();
    </pre> First, we create the widgets we want in the layout. Then, we create the QHBoxLayout object and add the widgets into the layout. Finally, we call {@link com.trolltech.qt.gui.QWidget#setLayout(com.trolltech.qt.gui.QLayout) QWidget::setLayout()} to install the QHBoxLayout object onto the widget. At that point, the widgets in the layout are reparented to have <tt>window</tt> as their parent. <br><center><img src="../images/qhboxlayout-with-5-children.png"></center><br> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QVBoxLayout QVBoxLayout}, {@link com.trolltech.qt.gui.QGridLayout QGridLayout}, {@link com.trolltech.qt.gui.QStackedLayout QStackedLayout}, {@link <a href="../qtjambi-layout.html">Layout Classes</a>}, and {@link <a href="../layouts-basiclayouts.html">Basic Layouts Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QHBoxLayout extends com.trolltech.qt.gui.QBoxLayout
{

/**
Constructs a new horizontal box. You must add it to another layout.
*/

    public QHBoxLayout(){
        super((QPrivateConstructor)null);
        __qt_QHBoxLayout();
    }

    native void __qt_QHBoxLayout();

/**
Constructs a new top-level horizontal box with parent <tt>parent</tt>.
*/

    public QHBoxLayout(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QHBoxLayout_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QHBoxLayout_QWidget(long parent);

/**
@exclude
*/

    public static native QHBoxLayout fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QHBoxLayout(QPrivateConstructor p) { super(p); } 
}
