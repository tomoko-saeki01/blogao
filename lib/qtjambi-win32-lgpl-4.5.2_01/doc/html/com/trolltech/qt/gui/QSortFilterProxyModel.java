package com.trolltech.qt.gui;

import com.trolltech.qt.*;



/**
The QSortFilterProxyModel class provides support for sorting and filtering data passed between another model and a view. QSortFilterProxyModel can be used for sorting items, filtering out items, or both. The model transforms the structure of a source model by mapping the model indexes it supplies to new indexes, corresponding to different locations, for views to use. This approach allows a given source model to be restructured as far as views are concerned without requiring any transformations on the underlying data, and without duplicating the data in memory. <p>Let's assume that we want to sort and filter the items provided by a custom model. The code to set up the model and the view, without sorting and filtering, would look like this: <pre class="snippet">
        QTreeView treeView = new QTreeView();

        MyItemModel model = new MyItemModel(this);

        treeView.setModel(model);
</pre> To add sorting and filtering support to <tt>MyItemModel</tt>, we need to create a QSortFilterProxyModel, call {@link com.trolltech.qt.gui.QAbstractProxyModel#setSourceModel(com.trolltech.qt.core.QAbstractItemModel) setSourceModel()} with the <tt>MyItemModel</tt> as argument, and install the QSortFilterProxyModel on the view: <pre class="snippet"> 
        QTreeView treeView = new QTreeView();

        MyItemModel sourceModel = new MyItemModel(this);
        QSortFilterProxyModel proxyModel = new QSortFilterProxyModel(this);

        proxyModel.setSourceModel(sourceModel);
        treeView.setModel(proxyModel);
</pre> At this point, neither sorting nor filtering is enabled; the original data is displayed in the view. Any changes made through the QSortFilterProxyModel are applied to the original model. <p>The QSortFilterProxyModel acts as a wrapper for the original model. If you need to convert source QModelIndexes to sorted/filtered model indexes or vice versa, use mapToSource(), mapFromSource(), {@link com.trolltech.qt.gui.QAbstractProxyModel#mapSelectionToSource(com.trolltech.qt.gui.QItemSelection) mapSelectionToSource()}, and {@link com.trolltech.qt.gui.QAbstractProxyModel#mapSelectionFromSource(com.trolltech.qt.gui.QItemSelection) mapSelectionFromSource()}. <p><b>Note:</b> By default, the model does not dynamically re-sort and re-filter data whenever the original model changes. This behavior can be changed by setting the {@link QSortFilterProxyModel#dynamicSortFilter() dynamicSortFilter} property. <p>The {@link <a href="../itemviews-basicsortfiltermodel.html">Basic Sort/Filter Model</a>} and {@link <a href="../qtjambi-customfilter.html">Custom Sort/Filter Model</a>} examples illustrate how to use QSortFilterProxyModel to perform basic sorting and filtering and how to subclass it to implement custom behavior.<a name="sorting"><h2>Sorting</h2> {@link com.trolltech.qt.gui.QTableView QTableView} and {@link com.trolltech.qt.gui.QTreeView QTreeView} have a {@link QTreeView#isSortingEnabled() sortingEnabled} property that controls whether the user can sort the view by clicking the view's horizontal header. For example: <pre class="snippet">
        treeView.setSortingEnabled(true);
</pre> When this feature is on (the default is off), clicking on a header section sorts the items according to that column. By clicking repeatedly, the user can alternate between ascending and descending order. <br><center><img src="../images/qsortfilterproxymodel-sorting.png"></center><br> Behind the scene, the view calls the {@link com.trolltech.qt.core.QAbstractItemModel#sort(int) sort()} virtual function on the model to reorder the data in the model. To make your data sortable, you can either implement {@link com.trolltech.qt.core.QAbstractItemModel#sort(int) sort()} in your model, or you use a QSortFilterProxyModel to wrap your model -- QSortFilterProxyModel provides a generic {@link com.trolltech.qt.core.QAbstractItemModel#sort(int) sort()} reimplementation that operates on the {@link com.trolltech.qt.gui.QSortFilterProxyModel#sortRole() sortRole()} ({@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole } by default) of the items and that understands several data types, including <tt>int</tt>, QString, and {@link com.trolltech.qt.core.QDateTime QDateTime}. For hierarchical models, sorting is applied recursively to all child items. String comparisons are case sensitive by default; this can be changed by setting the {@link QSortFilterProxyModel#sortCaseSensitivity() sortCaseSensitivity} property. <p>Custom sorting behavior is achieved by subclassing QSortFilterProxyModel and reimplementing {@link com.trolltech.qt.gui.QSortFilterProxyModel#lessThan(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) lessThan()}, which is used to compare items. For example:<br><br>The following code example is written in c++.<br> <pre class="snippet">
bool MySortFilterProxyModel::lessThan(const QModelIndex &left,
                                      const QModelIndex &right) const
{
    QVariant leftData = sourceModel()-&gt;data(left);
    QVariant rightData = sourceModel()-&gt;data(right);



    if (leftData.type() == QVariant::DateTime) {
        return leftData.toDateTime() &lt; rightData.toDateTime();
    } else {
        QRegExp *emailPattern = new QRegExp("([\\w\\.]*&#64;[\\w\\.]*)");

        QString leftString = leftData.toString();
        if(left.column() == 1 && emailPattern-&gt;indexIn(leftString) != -1)
            leftString = emailPattern-&gt;cap(1);

        QString rightString = rightData.toString();
        if(right.column() == 1 && emailPattern-&gt;indexIn(rightString) != -1)
            rightString = emailPattern-&gt;cap(1);

        return QString::localeAwareCompare(leftString, rightString) &lt; 0;
    }
}
</pre> (This code snippet comes from the {@link <a href="../qtjambi-customfilter.html">Custom Sort/Filter Model</a>} example.) <p>An alternative approach to sorting is to disable sorting on the view and to impose a certain order to the user. This is done by explicitly calling {@link com.trolltech.qt.core.QAbstractItemModel#sort(int) sort()} with the desired column and order as arguments on the QSortFilterProxyModel (or on the original model if it implements {@link com.trolltech.qt.core.QAbstractItemModel#sort(int) sort()}). For example: <pre class="snippet">
        proxyModel.sort(2, Qt.SortOrder.AscendingOrder);
</pre> QSortFilterProxyModel can be sorted by column -1, in which case it returns to the sort order of the underlying source model.<a name="filtering"><h2>Filtering</h2> In addition to sorting, QSortFilterProxyModel can be used to hide items that don't match a certain filter. The filter is specified using a {@link com.trolltech.qt.core.QRegExp QRegExp} object and is applied to the {@link com.trolltech.qt.gui.QSortFilterProxyModel#filterRole() filterRole()} ({@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole } by default) of each item, for a given column. The {@link com.trolltech.qt.core.QRegExp QRegExp} object can be used to match a regular expression, a wildcard pattern, or a fixed string. For example: <pre class="snippet">
        proxyModel.setFilterRegExp(new QRegExp(".png", Qt.CaseSensitivity.CaseInsensitive,
                                            QRegExp.PatternSyntax.FixedString));
        proxyModel.setFilterKeyColumn(1);
</pre> For hierarchical models, the filter is applied recursively to all children. If a parent item doesn't match the filter, none of its children will be shown. <p>A common use case is to let the user specify the filter regexp, wildcard pattern, or fixed string in a {@link com.trolltech.qt.gui.QLineEdit QLineEdit} and to connect the {@link com.trolltech.qt.gui.QLineEdit#textChanged textChanged() } signal to {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterRegExp(com.trolltech.qt.core.QRegExp) setFilterRegExp()}, {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterWildcard(java.lang.String) setFilterWildcard()}, or {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterFixedString(java.lang.String) setFilterFixedString()} to reapply the filter. <p>Custom filtering behavior can be achieved by reimplementing the {@link com.trolltech.qt.gui.QSortFilterProxyModel#filterAcceptsRow(int, com.trolltech.qt.core.QModelIndex) filterAcceptsRow()} and {@link com.trolltech.qt.gui.QSortFilterProxyModel#filterAcceptsColumn(int, com.trolltech.qt.core.QModelIndex) filterAcceptsColumn()} functions. For example, the following implementation ignores the {@link QSortFilterProxyModel#filterKeyColumn() filterKeyColumn} property and performs filtering on columns 0, 1, and 2:<br><br>The following code example is written in c++.<br> <pre class="snippet">
bool MySortFilterProxyModel::filterAcceptsRow(int sourceRow,
        const QModelIndex &sourceParent) const
{
    QModelIndex index0 = sourceModel()-&gt;index(sourceRow, 0, sourceParent);
    QModelIndex index1 = sourceModel()-&gt;index(sourceRow, 1, sourceParent);
    QModelIndex index2 = sourceModel()-&gt;index(sourceRow, 2, sourceParent);

    return (sourceModel()-&gt;data(index0).toString().contains(filterRegExp())
            || sourceModel()-&gt;data(index1).toString().contains(filterRegExp()))
           && dateInRange(sourceModel()-&gt;data(index2).toDate());
}
</pre> (This code snippet comes from the {@link <a href="../qtjambi-customfilter.html">Custom Sort/Filter Model</a>} example.) <p>If you are working with large amounts of filtering and have to invoke {@link com.trolltech.qt.gui.QSortFilterProxyModel#invalidateFilter() invalidateFilter()} repeatedly, using {@link com.trolltech.qt.core.QAbstractItemModel#reset() reset()} may be more efficient, depending on the implementation of your model. However, note that {@link com.trolltech.qt.core.QAbstractItemModel#reset() reset()} returns the proxy model to its original state, losing selection information, and will cause the proxy model to be repopulated.<a name="subclassing"><h2>Subclassing</h2> <b>Note:</b> Some general guidelines for subclassing models are available in the {@link <a href="../model-view-model-subclassing.html">Model Subclassing Reference</a>}. <p>Since {@link com.trolltech.qt.gui.QAbstractProxyModel QAbstractProxyModel} and its subclasses are derived from {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, much of the same advice about subclassing normal models also applies to proxy models. In addition, it is worth noting that many of the default implementations of functions in this class are written so that they call the equivalent functions in the relevant source model. This simple proxying mechanism may need to be overridden for source models with more complex behavior; for example, if the source model provides a custom {@link com.trolltech.qt.core.QAbstractItemModel#hasChildren() hasChildren()} implementation, you should also provide one in the proxy model. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QAbstractProxyModel QAbstractProxyModel}, {@link com.trolltech.qt.core.QAbstractItemModel QAbstractItemModel}, {@link <a href="../model-view-programming.html">Model/View Programming</a>}, {@link <a href="../itemviews-basicsortfiltermodel.html">Basic Sort/Filter Model Example</a>}, and {@link <a href="../qtjambi-customfilter.html">Custom Sort/Filter Model Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QSortFilterProxyModel extends com.trolltech.qt.gui.QAbstractProxyModel
{

    private Object __rcSourceModel = null;


/**
Constructs a sorting filter model with the given <tt>parent</tt>.
*/

    public QSortFilterProxyModel() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
Constructs a sorting filter model with the given <tt>parent</tt>.
*/

    public QSortFilterProxyModel(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QSortFilterProxyModel_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QSortFilterProxyModel_QObject(long parent);

/**
This property holds whether the proxy model is dynamically sorted and filtered whenever the contents of the source model change. The default value is false.
*/

    @com.trolltech.qt.QtPropertyReader(name="dynamicSortFilter")
    @QtBlockedSlot
    public final boolean dynamicSortFilter()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dynamicSortFilter(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_dynamicSortFilter(long __this__nativeId);

/**
This property holds the case sensitivity of the {@link com.trolltech.qt.core.QRegExp QRegExp} pattern used to filter the contents of the source model. By default, the filter is case sensitive. <p><DT><b>See also:</b><br><DD>{@link QSortFilterProxyModel#filterRegExp() filterRegExp}, and {@link QSortFilterProxyModel#sortCaseSensitivity() sortCaseSensitivity}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="filterCaseSensitivity")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.CaseSensitivity filterCaseSensitivity()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.CaseSensitivity.resolve(__qt_filterCaseSensitivity(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_filterCaseSensitivity(long __this__nativeId);

/**
This property holds the column where the key used to filter the contents of the source model is read from.  The default value is 0. If the value is -1, the keys will be read from all columns.
*/

    @com.trolltech.qt.QtPropertyReader(name="filterKeyColumn")
    @QtBlockedSlot
    public final int filterKeyColumn()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_filterKeyColumn(nativeId());
    }
    @QtBlockedSlot
    native int __qt_filterKeyColumn(long __this__nativeId);

/**
This property holds the {@link com.trolltech.qt.core.QRegExp QRegExp} used to filter the contents of the source model. Setting this property overwrites the current {@link QSortFilterProxyModel#filterCaseSensitivity() filterCaseSensitivity}. By default, the {@link com.trolltech.qt.core.QRegExp QRegExp} is an empty string matching all contents. <p><DT><b>See also:</b><br><DD>{@link QSortFilterProxyModel#filterCaseSensitivity() filterCaseSensitivity}, {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterWildcard(java.lang.String) setFilterWildcard()}, and {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterFixedString(java.lang.String) setFilterFixedString()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="filterRegExp")
    @QtBlockedSlot
    public final com.trolltech.qt.core.QRegExp filterRegExp()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_filterRegExp(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QRegExp __qt_filterRegExp(long __this__nativeId);

/**
This property holds the item role that is used to query the source model's data when filtering items. The default value is {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSortFilterProxyModel#filterAcceptsRow(int, com.trolltech.qt.core.QModelIndex) filterAcceptsRow()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="filterRole")
    @QtBlockedSlot
    public final int filterRole()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_filterRole(nativeId());
    }
    @QtBlockedSlot
    native int __qt_filterRole(long __this__nativeId);

/**
Invalidates the current sorting and filtering. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSortFilterProxyModel#invalidateFilter() invalidateFilter()}. <br></DD></DT>
*/

    public final void invalidate()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_invalidate(nativeId());
    }
    native void __qt_invalidate(long __this__nativeId);

/**
Invalidates the current filtering. <p>This function should be called if you are implementing custom filtering (e.g. {@link com.trolltech.qt.gui.QSortFilterProxyModel#filterAcceptsRow(int, com.trolltech.qt.core.QModelIndex) filterAcceptsRow()}), and your filter parameters have changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSortFilterProxyModel#invalidate() invalidate()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected final void invalidateFilter()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_invalidateFilter(nativeId());
    }
    @QtBlockedSlot
    native void __qt_invalidateFilter(long __this__nativeId);

/**
This property holds the local aware setting used for comparing strings when sorting. By default, sorting is not local aware. <p><DT><b>See also:</b><br><DD>{@link QSortFilterProxyModel#sortCaseSensitivity() sortCaseSensitivity}, and {@link com.trolltech.qt.gui.QSortFilterProxyModel#lessThan(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) lessThan()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="isSortLocaleAware")
    @QtBlockedSlot
    public final boolean isSortLocaleAware()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isSortLocaleAware(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isSortLocaleAware(long __this__nativeId);

/**
This property holds whether the proxy model is dynamically sorted and filtered whenever the contents of the source model change. The default value is false.
*/

    @com.trolltech.qt.QtPropertyWriter(name="dynamicSortFilter")
    @QtBlockedSlot
    public final void setDynamicSortFilter(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDynamicSortFilter_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setDynamicSortFilter_boolean(long __this__nativeId, boolean enable);

/**
This property holds the case sensitivity of the {@link com.trolltech.qt.core.QRegExp QRegExp} pattern used to filter the contents of the source model. By default, the filter is case sensitive. <p><DT><b>See also:</b><br><DD>{@link QSortFilterProxyModel#filterRegExp() filterRegExp}, and {@link QSortFilterProxyModel#sortCaseSensitivity() sortCaseSensitivity}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="filterCaseSensitivity")
    @QtBlockedSlot
    public final void setFilterCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity cs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFilterCaseSensitivity_CaseSensitivity(nativeId(), cs.value());
    }
    @QtBlockedSlot
    native void __qt_setFilterCaseSensitivity_CaseSensitivity(long __this__nativeId, int cs);

/**
Sets the fixed string used to filter the contents of the source model to the given <tt>pattern</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setFilterCaseSensitivity()}, {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterRegExp(com.trolltech.qt.core.QRegExp) setFilterRegExp()}, {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterWildcard(java.lang.String) setFilterWildcard()}, and {@link com.trolltech.qt.gui.QSortFilterProxyModel#filterRegExp() filterRegExp()}. <br></DD></DT>
*/

    public final void setFilterFixedString(java.lang.String pattern)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFilterFixedString_String(nativeId(), pattern);
    }
    native void __qt_setFilterFixedString_String(long __this__nativeId, java.lang.String pattern);

/**
This property holds the column where the key used to filter the contents of the source model is read from.  The default value is 0. If the value is -1, the keys will be read from all columns.
*/

    @com.trolltech.qt.QtPropertyWriter(name="filterKeyColumn")
    @QtBlockedSlot
    public final void setFilterKeyColumn(int column)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFilterKeyColumn_int(nativeId(), column);
    }
    @QtBlockedSlot
    native void __qt_setFilterKeyColumn_int(long __this__nativeId, int column);

/**
This property holds the {@link com.trolltech.qt.core.QRegExp QRegExp} used to filter the contents of the source model. Setting this property overwrites the current {@link QSortFilterProxyModel#filterCaseSensitivity() filterCaseSensitivity}. By default, the {@link com.trolltech.qt.core.QRegExp QRegExp} is an empty string matching all contents. <p><DT><b>See also:</b><br><DD>{@link QSortFilterProxyModel#filterCaseSensitivity() filterCaseSensitivity}, {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterWildcard(java.lang.String) setFilterWildcard()}, and {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterFixedString(java.lang.String) setFilterFixedString()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="filterRegExp")
    @QtBlockedSlot
    public final void setFilterRegExp(com.trolltech.qt.core.QRegExp regExp)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFilterRegExp_QRegExp(nativeId(), regExp == null ? 0 : regExp.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFilterRegExp_QRegExp(long __this__nativeId, long regExp);

/**
This property holds the {@link com.trolltech.qt.core.QRegExp QRegExp} used to filter the contents of the source model. Setting this property overwrites the current {@link QSortFilterProxyModel#filterCaseSensitivity() filterCaseSensitivity}. By default, the {@link com.trolltech.qt.core.QRegExp QRegExp} is an empty string matching all contents. <p><DT><b>See also:</b><br><DD>{@link QSortFilterProxyModel#filterCaseSensitivity() filterCaseSensitivity}, {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterWildcard(java.lang.String) setFilterWildcard()}, and {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterFixedString(java.lang.String) setFilterFixedString()}. <br></DD></DT>
*/

    public final void setFilterRegExp(java.lang.String pattern)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFilterRegExp_String(nativeId(), pattern);
    }
    native void __qt_setFilterRegExp_String(long __this__nativeId, java.lang.String pattern);

/**
This property holds the item role that is used to query the source model's data when filtering items. The default value is {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSortFilterProxyModel#filterAcceptsRow(int, com.trolltech.qt.core.QModelIndex) filterAcceptsRow()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="filterRole")
    @QtBlockedSlot
    public final void setFilterRole(int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFilterRole_int(nativeId(), role);
    }
    @QtBlockedSlot
    native void __qt_setFilterRole_int(long __this__nativeId, int role);

/**
Sets the wildcard expression used to filter the contents of the source model to the given <tt>pattern</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setFilterCaseSensitivity()}, {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterRegExp(com.trolltech.qt.core.QRegExp) setFilterRegExp()}, {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterFixedString(java.lang.String) setFilterFixedString()}, and {@link com.trolltech.qt.gui.QSortFilterProxyModel#filterRegExp() filterRegExp()}. <br></DD></DT>
*/

    public final void setFilterWildcard(java.lang.String pattern)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFilterWildcard_String(nativeId(), pattern);
    }
    native void __qt_setFilterWildcard_String(long __this__nativeId, java.lang.String pattern);

/**
This property holds the case sensitivity setting used for comparing strings when sorting. By default, sorting is case sensitive. <p><DT><b>See also:</b><br><DD>{@link QSortFilterProxyModel#filterCaseSensitivity() filterCaseSensitivity}, and {@link com.trolltech.qt.gui.QSortFilterProxyModel#lessThan(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) lessThan()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="sortCaseSensitivity")
    @QtBlockedSlot
    public final void setSortCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity cs)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSortCaseSensitivity_CaseSensitivity(nativeId(), cs.value());
    }
    @QtBlockedSlot
    native void __qt_setSortCaseSensitivity_CaseSensitivity(long __this__nativeId, int cs);

/**
This property holds the local aware setting used for comparing strings when sorting. By default, sorting is not local aware. <p><DT><b>See also:</b><br><DD>{@link QSortFilterProxyModel#sortCaseSensitivity() sortCaseSensitivity}, and {@link com.trolltech.qt.gui.QSortFilterProxyModel#lessThan(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) lessThan()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="isSortLocaleAware")
    @QtBlockedSlot
    public final void setSortLocaleAware(boolean on)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSortLocaleAware_boolean(nativeId(), on);
    }
    @QtBlockedSlot
    native void __qt_setSortLocaleAware_boolean(long __this__nativeId, boolean on);

/**
This property holds the item role that is used to query the source model's data when sorting items. The default value is {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSortFilterProxyModel#lessThan(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) lessThan()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyWriter(name="sortRole")
    @QtBlockedSlot
    public final void setSortRole(int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSortRole_int(nativeId(), role);
    }
    @QtBlockedSlot
    native void __qt_setSortRole_int(long __this__nativeId, int role);

/**
This property holds the case sensitivity setting used for comparing strings when sorting. By default, sorting is case sensitive. <p><DT><b>See also:</b><br><DD>{@link QSortFilterProxyModel#filterCaseSensitivity() filterCaseSensitivity}, and {@link com.trolltech.qt.gui.QSortFilterProxyModel#lessThan(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) lessThan()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="sortCaseSensitivity")
    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.CaseSensitivity sortCaseSensitivity()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.CaseSensitivity.resolve(__qt_sortCaseSensitivity(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_sortCaseSensitivity(long __this__nativeId);

/**
the column currently used for sorting This returns the most recently used sort column.
*/

    @QtBlockedSlot
    public final int sortColumn()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sortColumn(nativeId());
    }
    @QtBlockedSlot
    native int __qt_sortColumn(long __this__nativeId);

/**
the order currently used for sorting This returns the most recently used sort order.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.SortOrder sortOrder()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.SortOrder.resolve(__qt_sortOrder(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_sortOrder(long __this__nativeId);

/**
This property holds the item role that is used to query the source model's data when sorting items. The default value is {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSortFilterProxyModel#lessThan(com.trolltech.qt.core.QModelIndex, com.trolltech.qt.core.QModelIndex) lessThan()}. <br></DD></DT>
*/

    @com.trolltech.qt.QtPropertyReader(name="sortRole")
    @QtBlockedSlot
    public final int sortRole()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_sortRole(nativeId());
    }
    @QtBlockedSlot
    native int __qt_sortRole(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QModelIndex buddy(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_buddy_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_buddy_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean canFetchMore(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_canFetchMore_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native boolean __qt_canFetchMore_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int columnCount(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_columnCount_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native int __qt_columnCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object data(com.trolltech.qt.core.QModelIndex index, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_data_QModelIndex_int(nativeId(), index, role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_data_QModelIndex_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, int role);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean dropMimeData(com.trolltech.qt.core.QMimeData data, com.trolltech.qt.core.Qt.DropAction action, int row, int column, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dropMimeData_QMimeData_DropAction_int_int_QModelIndex(nativeId(), data == null ? 0 : data.nativeId(), action.value(), row, column, parent);
    }
    @QtBlockedSlot
    native boolean __qt_dropMimeData_QMimeData_DropAction_int_int_QModelIndex(long __this__nativeId, long data, int action, int row, int column, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void fetchMore(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_fetchMore_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native void __qt_fetchMore_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
Returns true if the item in the column indicated by the given <tt>source_column</tt> and <tt>source_parent</tt> should be included in the model; otherwise returns false. <p>The default implementation returns true if the value held by the relevant item matches the filter string, wildcard string or regular expression. <p><b>Note:</b> By default, the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole } is used to determine if the row should be accepted or not. This can be changed by setting the {@link QSortFilterProxyModel#filterRole() filterRole} property. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSortFilterProxyModel#filterAcceptsRow(int, com.trolltech.qt.core.QModelIndex) filterAcceptsRow()}, {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterFixedString(java.lang.String) setFilterFixedString()}, {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterRegExp(com.trolltech.qt.core.QRegExp) setFilterRegExp()}, and {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterWildcard(java.lang.String) setFilterWildcard()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean filterAcceptsColumn(int source_column, com.trolltech.qt.core.QModelIndex source_parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_filterAcceptsColumn_int_QModelIndex(nativeId(), source_column, source_parent);
    }
    @QtBlockedSlot
    native boolean __qt_filterAcceptsColumn_int_QModelIndex(long __this__nativeId, int source_column, com.trolltech.qt.core.QModelIndex source_parent);

/**
Returns true if the item in the row indicated by the given <tt>source_row</tt> and <tt>source_parent</tt> should be included in the model; otherwise returns false. <p>The default implementation returns true if the value held by the relevant item matches the filter string, wildcard string or regular expression. <p><b>Note:</b> By default, the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole } is used to determine if the row should be accepted or not. This can be changed by setting the {@link QSortFilterProxyModel#filterRole() filterRole} property. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.gui.QSortFilterProxyModel#filterAcceptsColumn(int, com.trolltech.qt.core.QModelIndex) filterAcceptsColumn()}, {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterFixedString(java.lang.String) setFilterFixedString()}, {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterRegExp(com.trolltech.qt.core.QRegExp) setFilterRegExp()}, and {@link com.trolltech.qt.gui.QSortFilterProxyModel#setFilterWildcard(java.lang.String) setFilterWildcard()}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean filterAcceptsRow(int source_row, com.trolltech.qt.core.QModelIndex source_parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_filterAcceptsRow_int_QModelIndex(nativeId(), source_row, source_parent);
    }
    @QtBlockedSlot
    native boolean __qt_filterAcceptsRow_int_QModelIndex(long __this__nativeId, int source_row, com.trolltech.qt.core.QModelIndex source_parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.Qt.ItemFlags flags(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.ItemFlags(__qt_flags_QModelIndex(nativeId(), index));
    }
    @QtBlockedSlot
    native int __qt_flags_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean hasChildren(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasChildren_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native boolean __qt_hasChildren_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.lang.Object headerData(int section, com.trolltech.qt.core.Qt.Orientation orientation, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_headerData_int_Orientation_int(nativeId(), section, orientation.value(), role);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_headerData_int_Orientation_int(long __this__nativeId, int section, int orientation, int role);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QModelIndex index(int row, int column, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_index_int_int_QModelIndex(nativeId(), row, column, parent);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_index_int_int_QModelIndex(long __this__nativeId, int row, int column, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean insertColumns(int column, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertColumns_int_int_QModelIndex(nativeId(), column, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_insertColumns_int_int_QModelIndex(long __this__nativeId, int column, int count, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean insertRows(int row, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertRows_int_int_QModelIndex(nativeId(), row, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_insertRows_int_int_QModelIndex(long __this__nativeId, int row, int count, com.trolltech.qt.core.QModelIndex parent);

/**
Returns true if the value of the item referred to by the given index <tt>left</tt> is less than the value of the item referred to by the given index <tt>right</tt>, otherwise returns false. <p>This function is used as the &lt; operator when sorting, and handles the following {@link com.trolltech.qt.QVariant QVariant} types: <ul><li> {@link com.trolltech.qt.QVariant.Type QVariant::Int }</li><li> {@link com.trolltech.qt.QVariant.Type QVariant::UInt }</li><li> {@link com.trolltech.qt.QVariant.Type QVariant::LongLong }</li><li> {@link com.trolltech.qt.QVariant.Type QVariant::ULongLong }</li><li> {@link com.trolltech.qt.QVariant.Type QVariant::Double }</li><li> {@link com.trolltech.qt.QVariant.Type QVariant::Char }</li><li> {@link com.trolltech.qt.QVariant.Type QVariant::Date }</li><li> {@link com.trolltech.qt.QVariant.Type QVariant::Time }</li><li> {@link com.trolltech.qt.QVariant.Type QVariant::DateTime }</li><li> {@link com.trolltech.qt.QVariant.Type QVariant::String }</li></ul> Any other type will be converted to a QString using {@link com.trolltech.qt.QVariant#toString(java.lang.Object) QVariant::toString()}. <p>Comparison of QStrings is case sensitive by default; this can be changed using the {@link QSortFilterProxyModel#sortCaseSensitivity() sortCaseSensitivity} property. <p>By default, the {@link com.trolltech.qt.core.Qt.ItemDataRole Qt::DisplayRole } associated with the QModelIndexes is used for comparisons. This can be changed by setting the {@link QSortFilterProxyModel#sortRole() sortRole} property. <p><b>Note:</b> The indices passed in correspond to the source model. <p><DT><b>See also:</b><br><DD>{@link QSortFilterProxyModel#sortRole() sortRole}, {@link QSortFilterProxyModel#sortCaseSensitivity() sortCaseSensitivity}, and {@link QSortFilterProxyModel#dynamicSortFilter() dynamicSortFilter}. <br></DD></DT>
*/

    @QtBlockedSlot
    protected boolean lessThan(com.trolltech.qt.core.QModelIndex left, com.trolltech.qt.core.QModelIndex right)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lessThan_QModelIndex_QModelIndex(nativeId(), left, right);
    }
    @QtBlockedSlot
    native boolean __qt_lessThan_QModelIndex_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex left, com.trolltech.qt.core.QModelIndex right);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QModelIndex mapFromSource(com.trolltech.qt.core.QModelIndex sourceIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapFromSource_QModelIndex(nativeId(), sourceIndex);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_mapFromSource_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex sourceIndex);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QItemSelection mapSelectionFromSource(com.trolltech.qt.gui.QItemSelection sourceSelection)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapSelectionFromSource_QItemSelection(nativeId(), sourceSelection == null ? 0 : sourceSelection.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelection __qt_mapSelectionFromSource_QItemSelection(long __this__nativeId, long sourceSelection);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.gui.QItemSelection mapSelectionToSource(com.trolltech.qt.gui.QItemSelection proxySelection)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapSelectionToSource_QItemSelection(nativeId(), proxySelection == null ? 0 : proxySelection.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QItemSelection __qt_mapSelectionToSource_QItemSelection(long __this__nativeId, long proxySelection);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QModelIndex mapToSource(com.trolltech.qt.core.QModelIndex proxyIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mapToSource_QModelIndex(nativeId(), proxyIndex);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_mapToSource_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex proxyIndex);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<com.trolltech.qt.core.QModelIndex> match(com.trolltech.qt.core.QModelIndex start, int role, java.lang.Object value, int hits, com.trolltech.qt.core.Qt.MatchFlags flags)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_match_QModelIndex_int_Object_int_MatchFlags(nativeId(), start, role, value, hits, flags.value());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.qt.core.QModelIndex> __qt_match_QModelIndex_int_Object_int_MatchFlags(long __this__nativeId, com.trolltech.qt.core.QModelIndex start, int role, java.lang.Object value, int hits, int flags);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QMimeData mimeData(java.util.List<com.trolltech.qt.core.QModelIndex> indexes)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mimeData_List(nativeId(), indexes);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QMimeData __qt_mimeData_List(long __this__nativeId, java.util.List<com.trolltech.qt.core.QModelIndex> indexes);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public java.util.List<java.lang.String> mimeTypes()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_mimeTypes(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_mimeTypes(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QModelIndex parent(com.trolltech.qt.core.QModelIndex child)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parent_QModelIndex(nativeId(), child);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QModelIndex __qt_parent_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex child);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean removeColumns(int column, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeColumns_int_int_QModelIndex(nativeId(), column, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_removeColumns_int_int_QModelIndex(long __this__nativeId, int column, int count, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean removeRows(int row, int count, com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_removeRows_int_int_QModelIndex(nativeId(), row, count, parent);
    }
    @QtBlockedSlot
    native boolean __qt_removeRows_int_int_QModelIndex(long __this__nativeId, int row, int count, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public int rowCount(com.trolltech.qt.core.QModelIndex parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rowCount_QModelIndex(nativeId(), parent);
    }
    @QtBlockedSlot
    native int __qt_rowCount_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean setData(com.trolltech.qt.core.QModelIndex index, java.lang.Object value, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setData_QModelIndex_Object_int(nativeId(), index, value, role);
    }
    @QtBlockedSlot
    native boolean __qt_setData_QModelIndex_Object_int(long __this__nativeId, com.trolltech.qt.core.QModelIndex index, java.lang.Object value, int role);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean setHeaderData(int section, com.trolltech.qt.core.Qt.Orientation orientation, java.lang.Object value, int role)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setHeaderData_int_Orientation_Object_int(nativeId(), section, orientation.value(), value, role);
    }
    @QtBlockedSlot
    native boolean __qt_setHeaderData_int_Orientation_Object_int(long __this__nativeId, int section, int orientation, java.lang.Object value, int role);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void setSourceModel(com.trolltech.qt.core.QAbstractItemModel sourceModel)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcSourceModel = sourceModel;
        }
        __qt_setSourceModel_QAbstractItemModel(nativeId(), sourceModel == null ? 0 : sourceModel.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setSourceModel_QAbstractItemModel(long __this__nativeId, long sourceModel);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public void sort(int column, com.trolltech.qt.core.Qt.SortOrder order)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_sort_int_SortOrder(nativeId(), column, order.value());
    }
    @QtBlockedSlot
    native void __qt_sort_int_SortOrder(long __this__nativeId, int column, int order);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.QSize span(com.trolltech.qt.core.QModelIndex index)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_span_QModelIndex(nativeId(), index);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QSize __qt_span_QModelIndex(long __this__nativeId, com.trolltech.qt.core.QModelIndex index);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public com.trolltech.qt.core.Qt.DropActions supportedDropActions()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.Qt.DropActions(__qt_supportedDropActions(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_supportedDropActions(long __this__nativeId);

/**
@exclude
*/

    public static native QSortFilterProxyModel fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QSortFilterProxyModel(QPrivateConstructor p) { super(p); } 
}
