package com.trolltech.qt.webkit;

import com.trolltech.qt.*;



/**
The QWebHistory class represents the history of a {@link com.trolltech.qt.webkit.QWebPage QWebPage} Each {@link com.trolltech.qt.webkit.QWebPage QWebPage} instance contains a history of visited pages that can be accessed by {@link com.trolltech.qt.webkit.QWebPage#history() QWebPage::history()}. QWebHistory represents this history and makes it possible to navigate it. <p>The history uses the concept of a current item, dividing the pages visited into those that can be visited by navigating back and forward using the {@link com.trolltech.qt.webkit.QWebHistory#back() back()} and {@link com.trolltech.qt.webkit.QWebHistory#forward() forward()} functions. The current item can be obtained by calling {@link com.trolltech.qt.webkit.QWebHistory#currentItem() currentItem()}, and an arbitrary item in the history can be made the current item by passing it to {@link com.trolltech.qt.webkit.QWebHistory#goToItem(com.trolltech.qt.webkit.QWebHistoryItem) goToItem()}. <p>A list of items describing the pages that can be visited by going back can be obtained by calling the {@link com.trolltech.qt.webkit.QWebHistory#backItems(int) backItems()} function; similarly, items describing the pages ahead of the current page can be obtained with the {@link com.trolltech.qt.webkit.QWebHistory#forwardItems(int) forwardItems()} function. The total list of items is obtained with the {@link com.trolltech.qt.webkit.QWebHistory#items() items()} function. <p>Just as with containers, functions are available to examine the history in terms of a list. Arbitrary items in the history can be obtained with {@link com.trolltech.qt.webkit.QWebHistory#itemAt(int) itemAt()}, the total number of items is given by {@link com.trolltech.qt.webkit.QWebHistory#count() count()}, and the history can be cleared with the {@link com.trolltech.qt.webkit.QWebHistory#clear() clear()} function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistoryItem QWebHistoryItem}, {@link com.trolltech.qt.webkit.QWebHistoryInterface QWebHistoryInterface}, and {@link com.trolltech.qt.webkit.QWebPage QWebPage}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public final class QWebHistory extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.qt.webkit.QtJambi_LibraryInitializer.init();
    }

/**
Set the current item to be the previous item in the history and goes to the corresponding page; i. ., goes back one history item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistory#forward() forward()}, and {@link com.trolltech.qt.webkit.QWebHistory#goToItem(com.trolltech.qt.webkit.QWebHistoryItem) goToItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void back()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_back(nativeId());
    }
    @QtBlockedSlot
    native void __qt_back(long __this__nativeId);

/**
Returns the item before the current item in the history.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebHistoryItem backItem()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_backItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebHistoryItem __qt_backItem(long __this__nativeId);

/**
Returns the list of items in the backwards history list. At most <tt>maxItems</tt> entries are returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistory#forwardItems(int) forwardItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.webkit.QWebHistoryItem> backItems(int maxItems)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_backItems_int(nativeId(), maxItems);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.webkit.QWebHistoryItem> __qt_backItems_int(long __this__nativeId, int maxItems);

/**
Returns true if there is an item preceding the current item in the history; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistory#canGoForward() canGoForward()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean canGoBack()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canGoBack(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_canGoBack(long __this__nativeId);

/**
Returns true if we have an item to go forward to; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistory#canGoBack() canGoBack()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean canGoForward()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canGoForward(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_canGoForward(long __this__nativeId);

/**
Clears the history. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistory#count() count()}, and {@link com.trolltech.qt.webkit.QWebHistory#items() items()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void clear()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

/**
Returns the total number of items in the history.
*/

    @QtBlockedSlot
    public final int count()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_count(nativeId());
    }
    @QtBlockedSlot
    native int __qt_count(long __this__nativeId);

/**
Returns the current item in the history.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebHistoryItem currentItem()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebHistoryItem __qt_currentItem(long __this__nativeId);

/**
Returns the index of the current item in history.
*/

    @QtBlockedSlot
    public final int currentItemIndex()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentItemIndex(nativeId());
    }
    @QtBlockedSlot
    native int __qt_currentItemIndex(long __this__nativeId);

/**
Sets the current item to be the next item in the history and goes to the corresponding page; i. ., goes forward one history item. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistory#back() back()}, and {@link com.trolltech.qt.webkit.QWebHistory#goToItem(com.trolltech.qt.webkit.QWebHistoryItem) goToItem()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void forward()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_forward(nativeId());
    }
    @QtBlockedSlot
    native void __qt_forward(long __this__nativeId);

/**
Returns the item after the current item in the history.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebHistoryItem forwardItem()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_forwardItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebHistoryItem __qt_forwardItem(long __this__nativeId);

/**
Returns the list of items in the forward history list. At most <tt>maxItems</tt> entries are returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistory#backItems(int) backItems()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.webkit.QWebHistoryItem> forwardItems(int maxItems)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_forwardItems_int(nativeId(), maxItems);
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.webkit.QWebHistoryItem> __qt_forwardItems_int(long __this__nativeId, int maxItems);

/**
Sets the current item to be the specified <tt>item</tt> in the history and goes to the page. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistory#back() back()}, and {@link com.trolltech.qt.webkit.QWebHistory#forward() forward()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void goToItem(com.trolltech.qt.webkit.QWebHistoryItem item)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_goToItem_QWebHistoryItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_goToItem_QWebHistoryItem(long __this__nativeId, long item);

/**
Returns the item at index <tt>i</tt> in the history.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.webkit.QWebHistoryItem itemAt(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_itemAt_int(nativeId(), i);
    }
    @QtBlockedSlot
    native com.trolltech.qt.webkit.QWebHistoryItem __qt_itemAt_int(long __this__nativeId, int i);

/**
Returns a list of all items currently in the history. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistory#count() count()}, and {@link com.trolltech.qt.webkit.QWebHistory#clear() clear()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<com.trolltech.qt.webkit.QWebHistoryItem> items()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.webkit.QWebHistoryItem> __qt_items(long __this__nativeId);

/**
Returns the maximum number of items in the history. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistory#setMaximumItemCount(int) setMaximumItemCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int maximumItemCount()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximumItemCount(nativeId());
    }
    @QtBlockedSlot
    native int __qt_maximumItemCount(long __this__nativeId);

/**
Sets the maximum number of items in the history to <tt>count</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.webkit.QWebHistory#maximumItemCount() maximumItemCount()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMaximumItemCount(int count)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximumItemCount_int(nativeId(), count);
    }
    @QtBlockedSlot
    native void __qt_setMaximumItemCount_int(long __this__nativeId, int count);

/**
@exclude
*/

    public static native QWebHistory fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QWebHistory(QPrivateConstructor p) { super(p); } 
}
