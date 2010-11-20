package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;



/**
The QXmlResultItems class iterates through the results of evaluating an XQuery in {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery}. QXmlResultItems presents the evaluation of an associated query as a sequence of {@link com.trolltech.qt.xmlpatterns.QXmlItem QXmlItems}. The sequence is traversed by repeatedly calling {@link com.trolltech.qt.xmlpatterns.QXmlResultItems#next() next()}, which actually produces the sequence by lazy evaluation of the query. <pre class="snippet">
  QXmlQuery query = new QXmlQuery();
  query.setQuery("&lt;e/&gt;, 1, 'two'");
  QXmlResultItems result = new QXmlResultItems();

  if(query.isValid())
  {
    query.evaluateToResult(result);
    QXmlItem item = result.next();
    while(!item.isNull())
    {
        // Use item
        item = result.next();
    }

    if(result.hasError())
        throw new RuntimeException("Runtime error!");
  }
</pre> An effect of letting {@link com.trolltech.qt.xmlpatterns.QXmlResultItems#next() next()} produce the sequence by lazy evaluation is that a query error can occur on any call to {@link com.trolltech.qt.xmlpatterns.QXmlResultItems#next() next()}. If an error occurs, both {@link com.trolltech.qt.xmlpatterns.QXmlResultItems#next() next()} and {@link com.trolltech.qt.xmlpatterns.QXmlResultItems#current() current()} will return the null {@link com.trolltech.qt.xmlpatterns.QXmlItem QXmlItem}, and {@link com.trolltech.qt.xmlpatterns.QXmlResultItems#hasError() hasError()} will return true. <p>QXmlResultItems can be thought of as an "iterator" that traverses the sequence of query results once, in the forward direction. Each call to {@link com.trolltech.qt.xmlpatterns.QXmlResultItems#next() next()} advances the iterator to the next {@link com.trolltech.qt.xmlpatterns.QXmlItem QXmlItem} in the sequence and returns it, and {@link com.trolltech.qt.xmlpatterns.QXmlResultItems#current() current()} always returns the {@link com.trolltech.qt.xmlpatterns.QXmlItem QXmlItem} that {@link com.trolltech.qt.xmlpatterns.QXmlResultItems#next() next()} returned the last time it was called. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlItem#isNode() QXmlItem::isNode()}, {@link com.trolltech.qt.xmlpatterns.QXmlItem#isAtomicValue() QXmlItem::isAtomicValue()}, and {@link com.trolltech.qt.xmlpatterns.QXmlNodeModelIndex QXmlNodeModelIndex}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QXmlResultItems extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.xmlpatterns.QtJambi_LibraryInitializer.init();
    }

/**
Constructs an instance of QXmlResultItems.
*/

    public QXmlResultItems(){
        super((QPrivateConstructor)null);
        __qt_QXmlResultItems();
    }

    native void __qt_QXmlResultItems();

/**
Returns the current item. The current item is the last item that was produced and returned by {@link com.trolltech.qt.xmlpatterns.QXmlResultItems#next() next()}. <p>Returns a null {@link com.trolltech.qt.xmlpatterns.QXmlItem QXmlItem} if there is no associated {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery}.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xmlpatterns.QXmlItem current()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_current(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlItem __qt_current(long __this__nativeId);

/**
If an error occurred during evaluation of the query, true is returned. <p>Returns false if query evaluation has been done.
*/

    @QtBlockedSlot
    public final boolean hasError()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasError(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasError(long __this__nativeId);

/**
Returns the next result in the sequence produced by lazy evaluation of the associated query. When the returned {@link com.trolltech.qt.xmlpatterns.QXmlItem QXmlItem} is null, either the evaluation terminated normally without producing another result, or an error occurred. Call {@link com.trolltech.qt.xmlpatterns.QXmlResultItems#hasError() hasError()} to determine whether the null item was caused by normal termination or by an error. <p>Returns a null {@link com.trolltech.qt.xmlpatterns.QXmlItem QXmlItem} if there is no associated {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery}.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xmlpatterns.QXmlItem next()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_next(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlItem __qt_next(long __this__nativeId);

/**
@exclude
*/

    public static native QXmlResultItems fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlResultItems(QPrivateConstructor p) { super(p); } 
}
