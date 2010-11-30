package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QWidgetAction class extends {@link com.trolltech.qt.gui.QAction QAction} by an interface for inserting custom widgets into action based containers, such as toolbars. Most actions in an application are represented as items in menus or buttons in toolbars. However sometimes more complex widgets are necessary. For example a zoom action in a word processor may be realized using a {@link com.trolltech.qt.gui.QComboBox QComboBox} in a {@link com.trolltech.qt.gui.QToolBar QToolBar}, presenting a range of different zoom levels. {@link com.trolltech.qt.gui.QToolBar QToolBar} provides {@link com.trolltech.qt.gui.QToolBar#insertWidget(com.trolltech.qt.gui.QAction, com.trolltech.qt.gui.QWidget) QToolBar::insertWidget()} as convenience function for inserting a single widget. However if you want to implement an action that uses custom widgets for visualization in multiple containers then you have to subclass QWidgetAction. <p>If a QWidgetAction is added for example to a {@link com.trolltech.qt.gui.QToolBar QToolBar} then {@link com.trolltech.qt.gui.QWidgetAction#createWidget(com.trolltech.qt.gui.QWidget) QWidgetAction::createWidget()} is called. Reimplementations of that function should create a new custom widget with the specified parent. <p>If the action is removed from a container widget then {@link com.trolltech.qt.gui.QWidgetAction#deleteWidget(com.trolltech.qt.gui.QWidget) QWidgetAction::deleteWidget()} is called with the previously created custom widget as argument. The default implementation hides the widget and deletes it using QObject::deleteLater(). <p>If you have only one single custom widget then you can set it as default widget using {@link com.trolltech.qt.gui.QWidgetAction#setDefaultWidget(com.trolltech.qt.gui.QWidget) setDefaultWidget()}. That widget will then be used if the action is added to a {@link com.trolltech.qt.gui.QToolBar QToolBar}, or in general to an action container that supports QWidgetAction. If a QWidgetAction with only a default widget is added to two toolbars at the same time then the default widget is shown only in the first toolbar the action was added to. QWidgetAction takes over ownership of the default widget. <p>Note that it is up to the widget to activate the action, for example by reimplementing mouse event handlers and calling {@link com.trolltech.qt.gui.QAction#trigger() QAction::trigger()}. <p><b>Mac OS X</b>: If you add a widget to a menu in the application's menu bar on Mac OS X, the widget will be added and it will function but with some limitations: <ol><li> The widget is reparented away from the {@link com.trolltech.qt.gui.QMenu QMenu} to the native menu view. If you show the menu in some other place (e.g. as a popup menu), the widget will not be there.</li><li> Focus/Keyboard handling of the widget is not possible.</li><li> Due to Apple's design, mouse tracking on the widget currently does not work.</li><li> Connecting the {@link com.trolltech.qt.gui.QAction#triggered triggered() } signal to a slot that opens a modal dialog will cause a crash in Mac OS X 10.4 (known bug acknowledged by Apple), a workaround is to use a QueuedConnection instead of a DirectConnection.</li></ol> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAction QAction}, {@link com.trolltech.qt.gui.QActionGroup QActionGroup}, and {@link com.trolltech.qt.gui.QWidget QWidget}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QWidgetAction extends com.trolltech.qt.gui.QAction
{

/**
Constructs an action with <tt>parent</tt>.
*/

    public QWidgetAction(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QWidgetAction_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QWidgetAction_QObject(long parent);

/**
Returns the list of widgets that have been using {@link com.trolltech.qt.gui.QWidgetAction#createWidget(com.trolltech.qt.gui.QWidget) createWidget()} and are currently in use by widgets the action has been added to.
*/

    @QtBlockedSlot
    protected final java.util.List<com.trolltech.qt.gui.QWidget> createdWidgets()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createdWidgets(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.gui.QWidget> __qt_createdWidgets(long __this__nativeId);

/**
Returns the default widget. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidgetAction#setDefaultWidget(com.trolltech.qt.gui.QWidget) setDefaultWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget defaultWidget()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_defaultWidget(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_defaultWidget(long __this__nativeId);

/**
Releases the specified <tt>widget</tt>. <p>Container widgets that support actions call this function when a widget action is removed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidgetAction#requestWidget(com.trolltech.qt.gui.QWidget) requestWidget()}, {@link com.trolltech.qt.gui.QWidgetAction#deleteWidget(com.trolltech.qt.gui.QWidget) deleteWidget()}, and {@link com.trolltech.qt.gui.QWidgetAction#defaultWidget() defaultWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void releaseWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_releaseWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native void __qt_releaseWidget_QWidget(long __this__nativeId, long widget);

/**
Returns a widget that represents the action, with the given <tt>parent</tt>. <p>Container widgets that support actions can call this function to request a widget as visual representation of the action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidgetAction#releaseWidget(com.trolltech.qt.gui.QWidget) releaseWidget()}, {@link com.trolltech.qt.gui.QWidgetAction#createWidget(com.trolltech.qt.gui.QWidget) createWidget()}, and {@link com.trolltech.qt.gui.QWidgetAction#defaultWidget() defaultWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget requestWidget(com.trolltech.qt.gui.QWidget parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_requestWidget_QWidget(nativeId(), parent == null ? 0 : parent.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_requestWidget_QWidget(long __this__nativeId, long parent);

/**
Sets <tt>widget</tt> to be the default widget. The ownership is transferred to QWidgetAction. Unless {@link com.trolltech.qt.gui.QWidgetAction#createWidget(com.trolltech.qt.gui.QWidget) createWidget()} is reimplemented by a subclass to return a new widget the default widget is used when a container widget requests a widget through {@link com.trolltech.qt.gui.QWidgetAction#requestWidget(com.trolltech.qt.gui.QWidget) requestWidget()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidgetAction#defaultWidget() defaultWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setDefaultWidget(com.trolltech.qt.gui.QWidget w)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (w != null) {
            w.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDefaultWidget_QWidget(nativeId(), w == null ? 0 : w.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setDefaultWidget_QWidget(long __this__nativeId, long w);

/**
This function is called whenever the action is added to a container widget that supports custom widgets. If you don't want a custom widget to be used as representation of the action in the specified <tt>parent</tt> widget then 0 should be returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidgetAction#deleteWidget(com.trolltech.qt.gui.QWidget) deleteWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected com.trolltech.qt.gui.QWidget createWidget(com.trolltech.qt.gui.QWidget parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createWidget_QWidget(nativeId(), parent == null ? 0 : parent.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_createWidget_QWidget(long __this__nativeId, long parent);

/**
This function is called whenever the action is removed from a container widget that displays the action using a custom <tt>widget</tt> previously created using {@link com.trolltech.qt.gui.QWidgetAction#createWidget(com.trolltech.qt.gui.QWidget) createWidget()}. The default implementation hides the <tt>widget</tt> and schedules it for deletion using QObject::deleteLater(). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QWidgetAction#createWidget(com.trolltech.qt.gui.QWidget) createWidget()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected void deleteWidget(com.trolltech.qt.gui.QWidget widget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_deleteWidget_QWidget(nativeId(), widget == null ? 0 : widget.nativeId());
    }
    @QtBlockedSlot
    native void __qt_deleteWidget_QWidget(long __this__nativeId, long widget);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long arg__1);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean eventFilter(com.trolltech.qt.core.QObject arg__1, com.trolltech.qt.core.QEvent arg__2)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_eventFilter_QObject_QEvent(nativeId(), arg__1 == null ? 0 : arg__1.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_eventFilter_QObject_QEvent(long __this__nativeId, long arg__1, long arg__2);

/**
@exclude
*/

    public static native QWidgetAction fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWidgetAction(QPrivateConstructor p) { super(p); } 
}
