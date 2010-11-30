package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QDrag class provides support for MIME-based drag and drop data transfer. Drag and drop is an intuitive way for users to copy or move data around in an application, and is used in many desktop environments as a mechanism for copying data between applications. Drag and drop support in Qt is centered around the QDrag class that handles most of the details of a drag and drop operation. <p>The data to be transferred by the drag and drop operation is contained in a {@link com.trolltech.qt.core.QMimeData QMimeData} object. This is specified with the {@link com.trolltech.qt.gui.QDrag#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()} function in the following way: <pre class="snippet">
            QDrag drag = new QDrag(this);
            QMimeData mimeData = new QMimeData();

            mimeData.setText(commentEdit.toPlainText());
            drag.setMimeData(mimeData);
    </pre> Note that {@link com.trolltech.qt.gui.QDrag#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()} assigns ownership of the {@link com.trolltech.qt.core.QMimeData QMimeData} object to the QDrag object. The QDrag must be constructed on the heap with a parent {@link com.trolltech.qt.gui.QWidget QWidget} to ensure that Qt can clean up after the drag and drop operation has been completed. <p>A pixmap can be used to represent the data while the drag is in progress, and will move with the cursor to the drop target. This pixmap typically shows an icon that represents the MIME type of the data being transferred, but any pixmap can be set with {@link com.trolltech.qt.gui.QDrag#setPixmap(com.trolltech.qt.gui.QPixmap) setPixmap()}. The cursor's hot spot can be given a position relative to the top-left corner of the pixmap with the {@link com.trolltech.qt.gui.QDrag#setHotSpot(com.trolltech.qt.core.QPoint) setHotSpot()} function. The following code positions the pixmap so that the cursor's hot spot points to the center of its bottom edge: <pre class="snippet">
        drag.setHotSpot(new QPoint(drag.pixmap().width()/2,
                                   drag.pixmap().height()));
    </pre> <b>Note:</b> On X11, the pixmap may not be able to keep up with the mouse movements if the hot spot causes the pixmap to be displayed directly under the cursor. <p>The source and target widgets can be found with {@link com.trolltech.qt.gui.QDrag#source() source()} and {@link com.trolltech.qt.gui.QDrag#target() target()}. These functions are often used to determine whether drag and drop operations started and finished at the same widget, so that special behavior can be implemented. <p>QDrag only deals with the drag and drop operation itself. It is up to the developer to decide when a drag operation begins, and how a QDrag object should be constructed and used. For a given widget, it is often necessary to reimplement {@link com.trolltech.qt.gui.QWidget#mousePressEvent(com.trolltech.qt.gui.QMouseEvent) mousePressEvent()} to determine whether the user has pressed a mouse button, and reimplement {@link com.trolltech.qt.gui.QWidget#mouseMoveEvent(com.trolltech.qt.gui.QMouseEvent) mouseMoveEvent()} to check whether a QDrag is required. <p><DT><b>See also:</b><br><DD>{@link <a href="../qtjambi-dnd.html">Drag and Drop</a>}, {@link com.trolltech.qt.gui.QClipboard QClipboard}, {@link com.trolltech.qt.core.QMimeData QMimeData}, QWindowsMime, QMacPasteboardMime, {@link <a href="../qtjambi-draggableicons.html">Draggable Icons Example</a>}, {@link <a href="../qtjambi-draggabletext.html">Draggable Text Example</a>}, {@link <a href="../draganddrop-dropsite.html">Drop Site Example</a>}, and {@link <a href="../qtjambi-fridgemagnets.html">Fridge Magnets Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QDrag extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.qt.gui.QtJambi_LibraryInitializer.init();
    }
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.core.Qt$DropAction(named: action)&gt;:<p> This signal is emitted when the <tt>action</tt> associated with the drag changes. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDrag#targetChanged targetChanged() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.core.Qt.DropAction> actionChanged = new Signal1<com.trolltech.qt.core.Qt.DropAction>();

    private final void actionChanged(com.trolltech.qt.core.Qt.DropAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_actionChanged_DropAction(nativeId(), action.value());
    }
    native void __qt_actionChanged_DropAction(long __this__nativeId, int action);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;com.trolltech.qt.gui.QWidget(named: newTarget)&gt;:<p> This signal is emitted when the target of the drag and drop operation changes, with <tt>newTarget</tt> the new target. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDrag#target() target()}, and {@link com.trolltech.qt.gui.QDrag#actionChanged actionChanged() }. <br></DD></DT>
*/

    public final Signal1<com.trolltech.qt.gui.QWidget> targetChanged = new Signal1<com.trolltech.qt.gui.QWidget>();

    private final void targetChanged(com.trolltech.qt.gui.QWidget newTarget)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_targetChanged_QWidget(nativeId(), newTarget == null ? 0 : newTarget.nativeId());
    }
    native void __qt_targetChanged_QWidget(long __this__nativeId, long newTarget);

/**
Constructs a new drag object for the widget specified by <tt>dragSource</tt>.
*/

    public QDrag(com.trolltech.qt.gui.QWidget dragSource){
        super((QPrivateConstructor)null);
        __qt_QDrag_QWidget(dragSource == null ? 0 : dragSource.nativeId());
    }

    native void __qt_QDrag_QWidget(long dragSource);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.DropAction exec(com.trolltech.qt.core.Qt.DropAction ... supportedActions) {
        return this.exec(new com.trolltech.qt.core.Qt.DropActions(supportedActions));
    }

/**
Starts the drag and drop operation and returns a value indicating the requested drop action when it is completed. The drop actions that the user can choose from are specified in <tt>supportedActions</tt>. The default proposed action will be selected among the allowed actions in the following order: Move, Copy and Link. <p><b>Note:</b> On Linux and Mac OS X, the drag and drop operation can take some time, but this function does not block the event loop. Other events are still delivered to the application while the operation is performed. On Windows, the Qt event loop is blocked while during the operation.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.DropAction exec() {
        return exec(new com.trolltech.qt.core.Qt.DropActions(2));
    }
/**
Starts the drag and drop operation and returns a value indicating the requested drop action when it is completed. The drop actions that the user can choose from are specified in <tt>supportedActions</tt>. The default proposed action will be selected among the allowed actions in the following order: Move, Copy and Link. <p><b>Note:</b> On Linux and Mac OS X, the drag and drop operation can take some time, but this function does not block the event loop. Other events are still delivered to the application while the operation is performed. On Windows, the Qt event loop is blocked while during the operation.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.DropAction exec(com.trolltech.qt.core.Qt.DropActions supportedActions)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.DropAction.resolve(__qt_exec_DropActions(nativeId(), supportedActions.value()));
    }
    @QtBlockedSlot
    native int __qt_exec_DropActions(long __this__nativeId, int supportedActions);

/**
Starts the drag and drop operation and returns a value indicating the requested drop action when it is completed. The drop actions that the user can choose from are specified in <tt>supportedActions</tt>. <p>The <tt>defaultDropAction</tt> determines which action will be proposed when the user performs a drag without using modifier keys. <p><b>Note:</b> On Linux and Mac OS X, the drag and drop operation can take some time, but this function does not block the event loop. Other events are still delivered to the application while the operation is performed. On Windows, the Qt event loop is blocked while during the operation.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.DropAction exec(com.trolltech.qt.core.Qt.DropActions supportedActions, com.trolltech.qt.core.Qt.DropAction defaultAction)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.DropAction.resolve(__qt_exec_DropActions_DropAction(nativeId(), supportedActions.value(), defaultAction.value()));
    }
    @QtBlockedSlot
    native int __qt_exec_DropActions_DropAction(long __this__nativeId, int supportedActions, int defaultAction);

/**
Returns the position of the hot spot relative to the top-left corner of the cursor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDrag#setHotSpot(com.trolltech.qt.core.QPoint) setHotSpot()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QPoint hotSpot()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hotSpot(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QPoint __qt_hotSpot(long __this__nativeId);

/**
Returns the MIME data that is encapsulated by the drag object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDrag#setMimeData(com.trolltech.qt.core.QMimeData) setMimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QMimeData mimeData()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mimeData(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QMimeData __qt_mimeData(long __this__nativeId);

/**
Returns the pixmap used to represent the data in a drag and drop operation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDrag#setPixmap(com.trolltech.qt.gui.QPixmap) setPixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QPixmap pixmap()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pixmap(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QPixmap __qt_pixmap(long __this__nativeId);

/**
Sets the drag <tt>cursor</tt> for the <tt>action</tt>. This allows you to override the default native cursors. To revert to using the native cursor for <tt>action</tt> pass in a null {@link com.trolltech.qt.gui.QPixmap QPixmap} as <tt>cursor</tt>. <p>The <tt>action</tt> can only be CopyAction, MoveAction or LinkAction. All other values of DropAction are ignored.
*/

    @QtBlockedSlot
    public final void setDragCursor(com.trolltech.qt.gui.QPixmap cursor, com.trolltech.qt.core.Qt.DropAction action)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDragCursor_QPixmap_DropAction(nativeId(), cursor == null ? 0 : cursor.nativeId(), action.value());
    }
    @QtBlockedSlot
    native void __qt_setDragCursor_QPixmap_DropAction(long __this__nativeId, long cursor, int action);

/**
Sets the position of the hot spot relative to the top-left corner of the pixmap used to the point specified by <tt>hotspot</tt>. <p><b>Note:</b> on X11, the pixmap may not be able to keep up with the mouse movements if the hot spot causes the pixmap to be displayed directly under the cursor. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDrag#hotSpot() hotSpot()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setHotSpot(com.trolltech.qt.core.QPoint hotspot)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHotSpot_QPoint(nativeId(), hotspot == null ? 0 : hotspot.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setHotSpot_QPoint(long __this__nativeId, long hotspot);

/**
Sets the data to be sent to the given MIME <tt>data</tt>. Ownership of the data is transferred to the QDrag object. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDrag#mimeData() mimeData()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMimeData(com.trolltech.qt.core.QMimeData data)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (data != null) {
            data.disableGarbageCollection();
        }
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMimeData_QMimeData(nativeId(), data == null ? 0 : data.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMimeData_QMimeData(long __this__nativeId, long data);

/**
Sets <tt>pixmap</tt> as the pixmap used to represent the data in a drag and drop operation. You can only set a pixmap before the drag is started. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QDrag#pixmap() pixmap()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPixmap(com.trolltech.qt.gui.QPixmap arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPixmap_QPixmap(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setPixmap_QPixmap(long __this__nativeId, long arg__1);

/**
Returns the source of the drag object. This is the widget where the drag and drop operation originated.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget source()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_source(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_source(long __this__nativeId);

/**
Returns the target of the drag and drop operation. This is the widget where the drag object was dropped.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QWidget target()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_target(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_target(long __this__nativeId);

/**
@exclude
*/

    public static native QDrag fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QDrag(QPrivateConstructor p) { super(p); } 
}
