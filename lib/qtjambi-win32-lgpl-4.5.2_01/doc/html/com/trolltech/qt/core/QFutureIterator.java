package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QFutureIterator class provides a Java-style const iterator for {@link com.trolltech.qt.core.QFuture QFuture}. {@link com.trolltech.qt.core.QFuture QFuture} has both {@link <a href="../containers.html">Java-style iterators</a>} and {@link <a href="../containers.html">STL-style iterators</a>}. The Java-style iterators are more high-level and easier to use than the STL-style iterators; on the other hand, they are slightly less efficient. <p>An alternative to using iterators is to use index positions. Some {@link com.trolltech.qt.core.QFuture QFuture} member functions take an index as their first parameter, making it possible to access results without using iterators. <p>QFutureIterator&lt;T&gt; allows you to iterate over a {@link com.trolltech.qt.core.QFuture QFuture}&lt;T&gt;. Note that there is no mutable iterator for {@link com.trolltech.qt.core.QFuture QFuture} (unlike the other Java-style iterators). <p>The QFutureIterator constructor takes a {@link com.trolltech.qt.core.QFuture QFuture} as its argument. After construction, the iterator is located at the very beginning of the result list (i.e. before the first result). Here's how to iterate over all the results sequentially: <pre class="snippet">
        QFuture&lt;String&gt; future = new QFuture&lt;String&gt;();
         ... 

        QFutureIterator&lt;String&gt; i = new QFutureIterator&lt;String&gt;(future);
        while (i.hasNext())
            System.out.println(i.next());
</pre> The {@link com.trolltech.qt.core.QFutureIterator#next() next()} function returns the next result (waiting for it to become available, if necessary) from the future and advances the iterator. Unlike STL-style iterators, Java-style iterators point between results rather than directly at results. The first call to {@link com.trolltech.qt.core.QFutureIterator#next() next()} advances the iterator to the position between the first and second result, and returns the first result; the second call to {@link com.trolltech.qt.core.QFutureIterator#next() next()} advances the iterator to the position between the second and third result, and returns the second result; and so on. <br><center><img src="../images/javaiterators1.png"></center><br> Here's how to iterate over the elements in reverse order: <pre class="snippet">
        QFutureIterator&lt;String&gt; i = new QFutureIterator&lt;String&gt;(future);
        i.toBack();
        while (i.hasPrevious())
            System.out.println(i.previous());
</pre> If you want to find all occurrences of a particular value, use {@link com.trolltech.qt.core.QFutureIterator#findNext(T) findNext()} or {@link com.trolltech.qt.core.QFutureIterator#findPrevious(T) findPrevious()} in a loop. <p>Multiple iterators can be used on the same future. If the future is modified while a QFutureIterator is active, the QFutureIterator will continue iterating over the original future, ignoring the modified copy. <p><DT><b>See also:</b><br><DD>QFuture::const_iterator, and {@link com.trolltech.qt.core.QFuture QFuture}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QFutureIterator<T> extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an iterator for traversing <tt>future</tt>. The iterator is set to be at the front of the result list (before the first result). <p><DT><b>See also:</b><br><DD>operator=(). <br></DD></DT>
*/

    public QFutureIterator(com.trolltech.qt.core.QFuture<T> container){
        super((QPrivateConstructor)null);
        __qt_QFutureIterator_QFuture(container == null ? 0 : container.nativeId());
    }

    native void __qt_QFutureIterator_QFuture(long container);

/**
Searches for <tt>value</tt> starting from the current iterator position forward. Returns true if <tt>value</tt> is found; otherwise returns false. <p>After the call, if <tt>value</tt> was found, the iterator is positioned just after the matching result; otherwise, the iterator is positioned at the back of the result list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureIterator#findPrevious(T) findPrevious()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean findNext(T t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_findNext_Object(nativeId(), t);
    }
    @QtBlockedSlot
    native boolean __qt_findNext_Object(long __this__nativeId, T t);

/**
Searches for <tt>value</tt> starting from the current iterator position backward. Returns true if <tt>value</tt> is found; otherwise returns false. <p>After the call, if <tt>value</tt> was found, the iterator is positioned just before the matching result; otherwise, the iterator is positioned at the front of the result list. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureIterator#findNext(T) findNext()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean findPrevious(T t)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_findPrevious_Object(nativeId(), t);
    }
    @QtBlockedSlot
    native boolean __qt_findPrevious_Object(long __this__nativeId, T t);

/**
Returns true if there is at least one result ahead of the iterator, e. ., the iterator is not at the back of the result list; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureIterator#hasPrevious() hasPrevious()}, and {@link com.trolltech.qt.core.QFutureIterator#next() next()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasNext()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasNext(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasNext(long __this__nativeId);

/**
Returns true if there is at least one result ahead of the iterator, e. ., the iterator is not at the front of the result list; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureIterator#hasNext() hasNext()}, and {@link com.trolltech.qt.core.QFutureIterator#previous() previous()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean hasPrevious()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasPrevious(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasPrevious(long __this__nativeId);

/**
Returns the next result and advances the iterator by one position. <p>Calling this function on an iterator located at the back of the result list leads to undefined results. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureIterator#hasNext() hasNext()}, {@link com.trolltech.qt.core.QFutureIterator#peekNext() peekNext()}, and {@link com.trolltech.qt.core.QFutureIterator#previous() previous()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final T next()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_next(nativeId());
    }
    @QtBlockedSlot
    native T __qt_next(long __this__nativeId);

/**
Returns the next result without moving the iterator. <p>Calling this function on an iterator located at the back of the result list leads to undefined results. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureIterator#hasNext() hasNext()}, {@link com.trolltech.qt.core.QFutureIterator#next() next()}, and {@link com.trolltech.qt.core.QFutureIterator#peekPrevious() peekPrevious()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final T peekNext()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peekNext(nativeId());
    }
    @QtBlockedSlot
    native T __qt_peekNext(long __this__nativeId);

/**
Returns the previous result without moving the iterator. <p>Calling this function on an iterator located at the front of the result list leads to undefined results. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureIterator#hasPrevious() hasPrevious()}, {@link com.trolltech.qt.core.QFutureIterator#previous() previous()}, and {@link com.trolltech.qt.core.QFutureIterator#peekNext() peekNext()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final T peekPrevious()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_peekPrevious(nativeId());
    }
    @QtBlockedSlot
    native T __qt_peekPrevious(long __this__nativeId);

/**
Returns the previous result and moves the iterator back by one position. <p>Calling this function on an iterator located at the front of the result list leads to undefined results. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureIterator#hasPrevious() hasPrevious()}, {@link com.trolltech.qt.core.QFutureIterator#peekPrevious() peekPrevious()}, and {@link com.trolltech.qt.core.QFutureIterator#next() next()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final T previous()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_previous(nativeId());
    }
    @QtBlockedSlot
    native T __qt_previous(long __this__nativeId);

/**
Moves the iterator to the back of the result list (after the last result). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureIterator#toFront() toFront()}, and {@link com.trolltech.qt.core.QFutureIterator#previous() previous()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void toBack()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toBack(nativeId());
    }
    @QtBlockedSlot
    native void __qt_toBack(long __this__nativeId);

/**
Moves the iterator to the front of the result list (before the first result). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QFutureIterator#toBack() toBack()}, and {@link com.trolltech.qt.core.QFutureIterator#next() next()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void toFront()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_toFront(nativeId());
    }
    @QtBlockedSlot
    native void __qt_toFront(long __this__nativeId);

/**
@exclude
*/

    public static native QFutureIterator fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QFutureIterator(QPrivateConstructor p) { super(p); } 
}
