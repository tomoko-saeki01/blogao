package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QAccessibleInterface class defines an interface that exposes information about accessible objects. Accessibility tools (also called AT Clients), such as screen readers or braille displays, require high-level information about accessible objects in an application. Accessible objects provide specialized input and output methods, making it possible for users to use accessibility tools with enabled applications (AT Servers). <p>Every element that the user needs to interact with or react to is an accessible object, and should provide this information. These are mainly visual objects, such as widgets and widget elements, but can also be content, such as sounds. <p>The AT client uses three basic concepts to acquire information about any accessible object in an application: <ul><li> Properties The client can read information about accessible objects. In some cases the client can also modify these properties; such as text in a line edit.</li><li> Actions The client can invoke actions like pressing a button or .</li><li> Relationships and Navigation The client can traverse from one accessible object to another, using the relationships between objects.</li></ul> The QAccessibleInterface defines the API for these three concepts.<a name="relationships-and-navigation"><h2>Relationships and Navigation</h2> The functions {@link com.trolltech.qt.gui.QAccessibleInterface#childCount() childCount()} and {@link com.trolltech.qt.gui.QAccessibleInterface#indexOfChild(com.trolltech.qt.gui.QAccessibleInterface) indexOfChild()} return the number of children of an accessible object and the index a child object has in its parent. The {@link com.trolltech.qt.gui.QAccessibleInterface#childAt(int, int) childAt()} function returns the index of a child at a given position. <p>The {@link com.trolltech.qt.gui.QAccessibleInterface#relationTo(int, com.trolltech.qt.gui.QAccessibleInterface, int) relationTo()} function provides information about how two different objects relate to each other, and {@link com.trolltech.qt.gui.QAccessibleInterface#navigate(com.trolltech.qt.gui.QAccessible.RelationFlag, int) navigate()} allows traversing from one object to another object with a given relationship.<a name="properties"><h2>Properties</h2> The central property of an accessible objects is what {@link com.trolltech.qt.gui.QAccessibleInterface#role(int) role()} it has. Different objects can have the same role, e.g. both the "Add line" element in a scroll bar and the <tt>OK</tt> button in a dialog have the same role, "button". The role implies what kind of interaction the user can perform with the user interface element. <p>An object's {@link com.trolltech.qt.gui.QAccessibleInterface#state(int) state()} property is a combination of different state flags and can describe both how the object's state differs from a "normal" state, e.g. it might be unavailable, and also how it behaves, e.g. it might be selectable. <p>The {@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) text()} property provides textual information about the object. An object usually has a name, but can provide extended information such as a description, help text, or information about any keyboard accelerators it provides. Some objects allow changing the {@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) text()} property through the {@link com.trolltech.qt.gui.QAccessibleInterface#setText(com.trolltech.qt.gui.QAccessible.Text, int, java.lang.String) setText()} function, but this information is in most cases read-only. <p>The {@link com.trolltech.qt.gui.QAccessibleInterface#rect(int) rect()} property provides information about the geometry of an accessible object. This information is usually only available for visual objects.<a name="actions-and-selection"><h2>Actions and Selection</h2> To enable the user to interact with an accessible object the object must expose information about the actions that it can perform. {@link com.trolltech.qt.gui.QAccessibleInterface#userActionCount(int) userActionCount()} returns the number of actions supported by an accessible object, and {@link com.trolltech.qt.gui.QAccessibleInterface#actionText(int, com.trolltech.qt.gui.QAccessible.Text, int) actionText()} returns textual information about those actions. {@link com.trolltech.qt.gui.QAccessibleInterface#doAction(int, int, java.util.List) doAction()} invokes an action. <p>Objects that support selections can define actions to change the selection.<a name="objects-and-children"><h3>Objects and children</h3> A QAccessibleInterface provides information about the accessible object, and can also provide information for the children of that object if those children don't provide a QAccessibleInterface implementation themselves. This is practical if the object has many similar children (e.g. items in a list view), or if the children are an integral part of the object itself, for example, the different sections in a scroll bar. <p>If an accessible object provides information about its children through one QAccessibleInterface, the children are referenced using indexes. The index is 1-based for the children, i.e. 0 refers to the object itself, 1 to the first child, 2 to the second child, and so on. <p>All functions in QAccessibleInterface that take a child index relate to the object itself if the index is 0, or to the child specified. If a child provides its own interface implementation (which can be retrieved through navigation) asking the parent for information about that child will usually not succeed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessible QAccessible}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public abstract class QAccessibleInterface extends com.trolltech.qt.gui.QAccessible
{

    private static class ConcreteWrapper extends com.trolltech.qt.gui.QAccessibleInterface {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public java.lang.String actionText(int action, com.trolltech.qt.gui.QAccessible.Text t, int child) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_actionText_int_Text_int(nativeId(), action, t.value(), child);
        }

        @Override
        @QtBlockedSlot
        public int childAt(int x, int y) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_childAt_int_int(nativeId(), x, y);
        }

        @Override
        @QtBlockedSlot
        public int childCount() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_childCount(nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean doAction(int action, int child, java.util.List<java.lang.Object> params) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_doAction_int_int_List(nativeId(), action, child, params);
        }

        @Override
        @QtBlockedSlot
        public int indexOfChild(com.trolltech.qt.gui.QAccessibleInterface arg__1) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_indexOfChild_QAccessibleInterface(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
        }

        @Override
        @QtBlockedSlot
        public boolean isValid() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_isValid(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessibleInterface.Target navigate(com.trolltech.qt.gui.QAccessible.RelationFlag relation, int index) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_navigate_RelationFlag_int_nativepointer(nativeId(), relation.value(), index);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QObject object() {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_object(nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.core.QRect rect(int child) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_rect_int(nativeId(), child);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessible.Relation relationTo(int child, com.trolltech.qt.gui.QAccessibleInterface other, int otherChild) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return new com.trolltech.qt.gui.QAccessible.Relation(super.__qt_relationTo_int_QAccessibleInterface_int(nativeId(), child, other == null ? 0 : other.nativeId(), otherChild));
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessible.Role role(int child) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return com.trolltech.qt.gui.QAccessible.Role.resolve(super.__qt_role_int(nativeId(), child));
        }

        @Override
        @QtBlockedSlot
        public void setText(com.trolltech.qt.gui.QAccessible.Text t, int child, java.lang.String text) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_setText_Text_int_String(nativeId(), t.value(), child, text);
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QAccessible.State state(int child) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return new com.trolltech.qt.gui.QAccessible.State(super.__qt_state_int(nativeId(), child));
        }

        @Override
        @QtBlockedSlot
        public java.lang.String text(com.trolltech.qt.gui.QAccessible.Text t, int child) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_text_Text_int(nativeId(), t.value(), child);
        }

        @Override
        @QtBlockedSlot
        public int userActionCount(int child) {
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_userActionCount_int(nativeId(), child);
        }
    }


/**
This is an overloaded method provided for convenience.
*/

    public QAccessibleInterface(){
        super((QPrivateConstructor)null);
        __qt_QAccessibleInterface();
    }

    native void __qt_QAccessibleInterface();

/**
Invokes a <tt>method</tt> on <tt>child</tt> with the given parameters <tt>params</tt> and returns the result of the operation as {@link com.trolltech.qt.QVariant QVariant}. <p>Note that the type of the returned {@link com.trolltech.qt.QVariant QVariant} depends on the action. <p>Returns an invalid {@link com.trolltech.qt.QVariant QVariant} if the object doesn't support the action.
*/

    @QtBlockedSlot
    public final java.lang.Object invokeMethod(com.trolltech.qt.gui.QAccessible.Method method, int child, java.util.List<java.lang.Object> params)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_invokeMethod_Method_int_List(nativeId(), method.value(), child, params);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_invokeMethod_Method_int_List(long __this__nativeId, int method, int child, java.util.List<java.lang.Object> params);

/**
Returns a QSet of {@link com.trolltech.qt.gui.QAccessible.Method Method }s that are supported by this accessible interface. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessible.Method QAccessible::Method }, and {@link com.trolltech.qt.gui.QAccessibleInterface#invokeMethod(com.trolltech.qt.gui.QAccessible.Method, int, java.util.List) invokeMethod()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.Set<com.trolltech.qt.gui.QAccessible.Method> supportedMethods()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_supportedMethods(nativeId());
    }
    @QtBlockedSlot
    native java.util.Set<com.trolltech.qt.gui.QAccessible.Method> __qt_supportedMethods(long __this__nativeId);

/**
Returns the text property <tt>t</tt> of the action <tt>action</tt> supported by the object, or of the object's child if <tt>child</tt> is not 0. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) text()}, and {@link com.trolltech.qt.gui.QAccessibleInterface#userActionCount(int) userActionCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.lang.String actionText(int action, com.trolltech.qt.gui.QAccessible.Text t, int child);
    @QtBlockedSlot
    native java.lang.String __qt_actionText_int_Text_int(long __this__nativeId, int action, int t, int child);

/**
Returns the 1-based index of the child that contains the screen coordinates (<tt>x</tt>, <tt>y</tt>). This function returns 0 if the point is positioned on the object itself. If the tested point is outside the boundaries of the object this function returns -1. <p>This function is only relyable for visible objects (invisible object might not be laid out correctly). <p>All visual objects provide this information. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#rect(int) rect()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract int childAt(int x, int y);
    @QtBlockedSlot
    native int __qt_childAt_int_int(long __this__nativeId, int x, int y);

/**
Returns the number of children that belong to this object. A child can provide accessibility information on its own (e.g. a child widget), or be a sub-element of this accessible object. <p>All objects provide this information. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#indexOfChild(com.trolltech.qt.gui.QAccessibleInterface) indexOfChild()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract int childCount();
    @QtBlockedSlot
    native int __qt_childCount(long __this__nativeId);

/**
Asks the object, or the object's <tt>child</tt> if <tt>child</tt> is not 0, to execute <tt>action</tt> using the parameters, <tt>params</tt>. Returns true if the action could be executed; otherwise returns false. <p><tt>action</tt> can be a predefined or a custom action. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#userActionCount(int) userActionCount()}, and {@link com.trolltech.qt.gui.QAccessibleInterface#actionText(int, com.trolltech.qt.gui.QAccessible.Text, int) actionText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean doAction(int action, int child, java.util.List<java.lang.Object> params);
    @QtBlockedSlot
    native boolean __qt_doAction_int_int_List(long __this__nativeId, int action, int child, java.util.List<java.lang.Object> params);

/**
Returns the 1-based index of the object <tt>child</tt> in this object's children list, or -1 if <tt>child</tt> is not a child of this object. 0 is not a possible return value. <p>All objects provide this information about their children. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#childCount() childCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract int indexOfChild(com.trolltech.qt.gui.QAccessibleInterface arg__1);
    @QtBlockedSlot
    native int __qt_indexOfChild_QAccessibleInterface(long __this__nativeId, long arg__1);

/**
Returns true if all the data necessary to use this interface implementation is valid (e. . all pointers are non-null); otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#object() object()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract boolean isValid();
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Navigates from this object to an object that has a relationship <tt>relation</tt> to this object, and returns the respective object in <tt>target</tt>. It is the caller's responsibility to delete *<tt>target</tt> after use. <p>If an object is found, <tt>target</tt> is set to point to the object, and the index of the child of <tt>target</tt> is returned. The return value is 0 if <tt>target</tt> itself is the requested object. <tt>target</tt> is set to null if this object is the target object (i.e. the requested object is a handled by this object). <p>If no object is found <tt>target</tt> is set to null, and the return value is -1. <p>The <tt>entry</tt> parameter has two different meanings: <ul><li> Hierarchical and Logical relationships -- if multiple objects with the requested relationship exist <tt>entry</tt> specifies which one to return. <tt>entry</tt> is 1-based, e.g. use 1 to get the first (and possibly only) object with the requested relationship. <p>The following code demonstrates how to use this function to navigate to the first child of an object:<br><br>The following code example is written in c++.<br> <pre class="snippet">
QAccessibleInterface *child = 0;
int targetChild = object-&gt;navigate(Accessible::Child, 1, &child);
if (child) {
    // ...
    delete child;
}
</li></pre><li> Geometric relationships -- the index of the child from which to start navigating in the specified direction. <tt>entry</tt> can be 0 to navigate to a sibling of this object, or non-null to navigate within contained children that don't provide their own accessible information.</li></ul> Note that the <tt>Descendent</tt> value for <tt>relation</tt> is not supported. <p>All objects support navigation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#relationTo(int, com.trolltech.qt.gui.QAccessibleInterface, int) relationTo()}, and {@link com.trolltech.qt.gui.QAccessibleInterface#childCount() childCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QAccessibleInterface.Target navigate(com.trolltech.qt.gui.QAccessible.RelationFlag relation, int index);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QAccessibleInterface.Target __qt_navigate_RelationFlag_int_nativepointer(long __this__nativeId, int relation, int index);

/**
Returns a pointer to the {@link com.trolltech.qt.core.QObject QObject} this interface implementation provides information for. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QObject object();
    @QtBlockedSlot
    native com.trolltech.qt.core.QObject __qt_object(long __this__nativeId);

/**
Returns the geometry of the object, or of the object's child if <tt>child</tt> is not 0. The geometry is in screen coordinates. <p>This function is only reliable for visible objects (invisible objects might not be laid out correctly). <p>All visual objects provide this information. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#childAt(int, int) childAt()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.core.QRect rect(int child);
    @QtBlockedSlot
    native com.trolltech.qt.core.QRect __qt_rect_int(long __this__nativeId, int child);

/**
Returns the relationship between this object's <tt>child</tt> and the <tt>other</tt> object's <tt>otherChild</tt>. If <tt>child</tt> is 0 the object's own relation is returned. <p>The returned value indicates the relation of the called object to the <tt>other</tt> object, e.g. if this object is a child of <tt>other</tt> the return value will be <tt>Child</tt>. <p>The return value is a combination of the bit flags in the QAccessible::Relation enumeration. <p>All objects provide this information. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#indexOfChild(com.trolltech.qt.gui.QAccessibleInterface) indexOfChild()}, and {@link com.trolltech.qt.gui.QAccessibleInterface#navigate(com.trolltech.qt.gui.QAccessible.RelationFlag, int) navigate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QAccessible.Relation relationTo(int child, com.trolltech.qt.gui.QAccessibleInterface other, int otherChild);
    @QtBlockedSlot
    native int __qt_relationTo_int_QAccessibleInterface_int(long __this__nativeId, int child, long other, int otherChild);

/**
Returns the role of the object, or of the object's child if <tt>child</tt> is not 0. The role of an object is usually static. <p>All accessible objects have a role. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) text()}, and {@link com.trolltech.qt.gui.QAccessibleInterface#state(int) state()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QAccessible.Role role(int child);
    @QtBlockedSlot
    native int __qt_role_int(long __this__nativeId, int child);

/**
Sets the text property <tt>t</tt> of the object, or of the object's child if <tt>child</tt> is not 0, to <tt>text</tt>. <p>Note that the text properties of most objects are read-only. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) text()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract void setText(com.trolltech.qt.gui.QAccessible.Text t, int child, java.lang.String text);
    @QtBlockedSlot
    native void __qt_setText_Text_int_String(long __this__nativeId, int t, int child, java.lang.String text);

/**
Returns the current state of the object, or of the object's child if <tt>child</tt> is not 0. The returned value is a combination of the flags in the {@link com.trolltech.qt.gui.QAccessible.StateFlag QAccessible::StateFlag } enumeration. <p>All accessible objects have a state. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#text(com.trolltech.qt.gui.QAccessible.Text, int) text()}, and {@link com.trolltech.qt.gui.QAccessibleInterface#role(int) role()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QAccessible.State state(int child);
    @QtBlockedSlot
    native int __qt_state_int(long __this__nativeId, int child);

/**
Returns the value of the text property <tt>t</tt> of the object, or of the object's child if <tt>child</tt> is not 0. <p>The {@link com.trolltech.qt.gui.QAccessible.Text Name } is a string used by clients to identify, find, or announce an accessible object for the user. All objects must have a name that is unique within their container. The name can be used differently by clients, so the name should both give a short description of the object and be unique. <p>An accessible object's {@link com.trolltech.qt.gui.QAccessible.Text Description } provides textual information about an object's visual appearance. The description is primarily used to provide greater context for vision-impaired users, but is also used for context searching or other applications. Not all objects have a description. An "OK" button would not need a description, but a tool button that shows a picture of a smiley would. <p>The {@link com.trolltech.qt.gui.QAccessible.Text Value } of an accessible object represents visual information contained by the object, e.g. the text in a line edit. Usually, the value can be modified by the user. Not all objects have a value, e.g. static text labels don't, and some objects have a state that already is the value, e.g. toggle buttons. <p>The {@link com.trolltech.qt.gui.QAccessible.Text Help } text provides information about the function and usage of an accessible object. Not all objects provide this information. <p>The {@link com.trolltech.qt.gui.QAccessible.Text Accelerator } is a keyboard shortcut that activates the object's default action. A keyboard shortcut is the underlined character in the text of a menu, menu item or widget, and is either the character itself, or a combination of this character and a modifier key like Alt, Ctrl or Shift. Command controls like tool buttons also have shortcut keys and usually display them in their tooltip. <p>All objects provide a string for {@link com.trolltech.qt.gui.QAccessible.Text Name }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#setText(com.trolltech.qt.gui.QAccessible.Text, int, java.lang.String) setText()}, {@link com.trolltech.qt.gui.QAccessibleInterface#role(int) role()}, and {@link com.trolltech.qt.gui.QAccessibleInterface#state(int) state()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract java.lang.String text(com.trolltech.qt.gui.QAccessible.Text t, int child);
    @QtBlockedSlot
    native java.lang.String __qt_text_Text_int(long __this__nativeId, int t, int child);

/**
Returns the number of custom actions of the object, or of the object's child if <tt>child</tt> is not 0. <p>The <tt>Action</tt> type enumerates predefined actions: these are not included in the returned value. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAccessibleInterface#actionText(int, com.trolltech.qt.gui.QAccessible.Text, int) actionText()}, and {@link com.trolltech.qt.gui.QAccessibleInterface#doAction(int, int, java.util.List) doAction()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public abstract int userActionCount(int child);
    @QtBlockedSlot
    native int __qt_userActionCount_int(long __this__nativeId, int child);

/**
@exclude
*/

    public static native QAccessibleInterface fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QAccessibleInterface(QPrivateConstructor p) { super(p); } 

    public static class Target {
        public Target(int childIndex, QAccessibleInterface target) {
            this.childIndex = childIndex;
            this.target = target;
        }

        public QAccessibleInterface target;
        public int childIndex;
    }

}
