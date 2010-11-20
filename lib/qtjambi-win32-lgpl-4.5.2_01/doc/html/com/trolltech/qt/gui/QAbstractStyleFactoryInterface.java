package com.trolltech.qt.gui;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public interface QAbstractStyleFactoryInterface extends QtJambiInterface, com.trolltech.qt.core.QAbstractFactoryInterface
{

/**
Creates and returns a {@link com.trolltech.qt.gui.QStyle QStyle} object for the given style <tt>key</tt>. <p>The style key is usually the class name of the required style. Note that the keys are case insensitive. For example: <pre class="snippet">
    List&lt;String&gt; keys()
    {
        List&lt;String&gt; keyList = new Vector&lt;String&gt;();
        keyList.add("Rocket");
        keyList.add("StarBuster");

        return keyList;
    }
    <br>
    QStyle create(String key)
    {
        String lcKey = key;

        if (lcKey.equals("rocket")) {
            return new RocketStyle();
        } else if (lcKey.equals("starbuster")) {
            return new StarBusterStyle();
        }
        return null;
    
    }
    </pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStylePlugin#keys() keys()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QStyle create(java.lang.String key);

/**
Returns the list of style keys this plugin supports. <p>These keys are usually the class names of the custom styles that are implemented in the plugin. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QStylePlugin#create(java.lang.String) create()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> keys();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public long __qt_cast_to_QAbstractStyleFactory(long ptr);
}
