package com.trolltech.qt.xmlpatterns;

import com.trolltech.qt.*;



/**
The QXmlQuery class performs XQueries on XML data, or on non-XML data modeled to look like XML. The QXmlQuery class compiles and executes queries written in the XQuery language. QXmlQuery is typically used to query XML data, but it can also query non-XML data that has been modeled to look like XML. <p>Using QXmlQuery to query XML data, as in the snippet below, is simple because it can use the built-in {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel XML data model} as its delegate to the underlying query engine for traversing the data. The built-in data model is specified in XQuery 1.0 and XPath 2.0 Data Model. <pre class="snippet">
  QXmlQuery query = new QXmlQuery();
  query.setQuery("doc('index.html')/html/body/p[1]");

  QXmlSerializerPointer serializer(new QXmlSerializer(query, myOutputDevice));
  query.evaluateToReceiver(serializer);
</pre> The example uses QXmlQuery to match the first paragraph of an XML document and then {@link com.trolltech.qt.xmlpatterns.QXmlSerializer output the result} to a device as XML. <p>Using QXmlQuery to query non-XML data requires writing a subclass of {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel QAbstractXmlNodeModel} to use as a replacement for the built-in XML data model. The custom data model will be able to traverse the non-XML data as required by the {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel QAbstractXmlNodeModel} interface. An instance of this custom data model then becomes the delegate used by the query engine to traverse the non-XML data. For an example of how to use QXmlQuery to query non-XML data, see the documentation for {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel QAbstractXmlNodeModel}.<a name="running-xqueries"><h2>Running XQueries</h2> To run a query set up with QXmlQuery, call one of the evaluation functions. <ul><li> evaluateTo({@link com.trolltech.qt.xmlpatterns.QAbstractXmlReceiver QAbstractXmlReceiver} *) is called with a pointer to an XML {@link com.trolltech.qt.xmlpatterns.QAbstractXmlReceiver receiver}, which receives the query results as a sequence of callbacks. The receiver callback class is like the callback class used for translating the output of a SAX parser. {@link com.trolltech.qt.xmlpatterns.QXmlSerializer QXmlSerializer}, for example, is a receiver callback class for translating the sequence of callbacks for output as unformatted XML text.</li></ul> <ul><li> evaluateTo({@link com.trolltech.qt.xmlpatterns.QXmlResultItems QXmlResultItems} *) is called with a pointer to an iterator for an empty sequence of query {@link com.trolltech.qt.xmlpatterns.QXmlResultItems result items}. The Java-like iterator allows the query results to be accessed sequentially.</li></ul> <ul><li> evaluateTo(QStringList *) is like evaluateTo({@link com.trolltech.qt.xmlpatterns.QXmlResultItems QXmlResultItems} *), but the query must evaluate to a sequence of strings.</li></ul><a name="running-xpath-expressions"><h2>Running XPath Expressions</h2> The XPath language is a subset of the XQuery language, so running an XPath expression is the same as running an XQuery query. Pass the XPath expression to QXmlQuery using {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()}.<a name="running-xslt-stylesheets"><h2>Running XSLT stylesheets</h2> Running an XSLT stylesheet is like running an XQuery, except that when you construct your QXmlQuery, you must pass {@link com.trolltech.qt.xmlpatterns.QXmlQuery.QueryLanguage QXmlQuery::XSLT20 } to tell QXmlQuery to interpret whatever it gets from {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()} as an XSLT stylesheet instead of as an XQuery. You must also set the input document by calling {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setFocus(com.trolltech.qt.core.QIODevice) setFocus()}.Error parsing snippet.</pre> <b>Note:</b> Currently, {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setFocus(com.trolltech.qt.core.QIODevice) setFocus()} must be called before{@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()} when using XSLT. <p>Another way to run an XSLT stylesheet is to use the <tt>xmlpatterns</tt> command line utility.<pre>xmlpatterns myStylesheet.xsl myInput.xml</pre> <b>Note:</b> For the current release, XSLT support should be considered experimental. See section {@link <a href="../qtxmlpatterns.html#xslt-2-0">XSLT conformance</a>} for details. <p>Stylesheet parameters are bound using {@link com.trolltech.qt.xmlpatterns.QXmlQuery#bindVariable(java.lang.String, com.trolltech.qt.core.QIODevice) bindVariable()}.<a name="binding-a-query-to-a-starting-node"><h2>Binding A Query To A Starting Node</h2> When a query is run on XML data, as in the snippet above, the <tt>doc()</tt> function returns the node in the built-in data model where the query evaluation will begin. But when a query is run on a custom node model containing non-XML data, one of the {@link com.trolltech.qt.xmlpatterns.QXmlQuery#bindVariable(java.lang.String, com.trolltech.qt.core.QIODevice) bindVariable()} functions must be called to bind a variable name to a starting node in the custom model. A $variable reference is used in the XQuery text to access the starting node in the custom model. It is not necessary to declare the variable name external in the query. See the example in the documentation for {@link com.trolltech.qt.xmlpatterns.QAbstractXmlNodeModel QAbstractXmlNodeModel}.<a name="reentrancy-and-thread-safety"><h2>Reentrancy and Thread-Safety</h2> QXmlQuery is reentrant but not thread-safe. It is safe to use the QxmlQuery copy constructor to create a copy of a query and run the same query multiple times. Behind the scenes, QXmlQuery will reuse resources such as opened files and compiled queries to the extent possible. But it is not safe to use the same instance of QXmlQuery in multiple threads.<a name="error-handling"><h2>Error Handling</h2> Errors can occur during query evaluation. Examples include type errors and file loading errors. When an error occurs: <ul><li> The error message is sent to the {@link com.trolltech.qt.xmlpatterns.QXmlQuery#messageHandler() messageHandler()}.</li><li> {@link com.trolltech.qt.xmlpatterns.QXmlResultItems#hasError() QXmlResultItems::hasError()} will return <tt>true</tt>, or {@link com.trolltech.qt.xmlpatterns.QXmlQuery#evaluateTo(com.trolltech.qt.core.QIODevice) evaluateTo()} will return <tt>false</tt>;</li><li> The results of the evaluation are undefined.</li></ul><a name="resource-management"><h2>Resource Management</h2> When a query runs, it parses documents, allocating internal data structures to hold them, and it may load other resources over the network. It reuses these allocated resources when possible, to avoid having to reload and reparse them. <p>When {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()} is called, the query text is compiled into an internal data structure and optimized. The optimized form can then be reused for multiple evaluations of the query. Since the compile-and-optimize process can be expensive, repeating it for the same query should be avoided by using a separate instance of QXmlQuery for each query text. <p>Once a document has been parsed, its internal representation is maintained in the QXmlQuery instance and shared among multiple QXmlQuery instances. <p>An instance of {@link com.trolltech.qt.core.QCoreApplication QCoreApplication} must exist before QXmlQuery can be used.<a name="event-handling"><h2>Event Handling</h2> When QXmlQuery accesses resources (e.g., calling <tt>fn:doc()</tt> to load a file, or accessing a device via a bound variable), the event loop is used, which means events will be processed. To avoid processing events when QXmlQuery accesses resources, create your QXmlQuery instance in a separate thread.
*/
@QtJambiGeneratedClass
public class QXmlQuery extends com.trolltech.qt.QtJambiObject
{

    private Object __rcFocusDevice = null;

    private Object __rcMessageHandler = null;

    private Object __rcNetworkAccessManager = null;

    private Object __rcUriResolver = null;

    static {
        com.trolltech.qt.xmlpatterns.QtJambi_LibraryInitializer.init();
    }
/**
Specifies whether you want {@link com.trolltech.qt.xmlpatterns.QXmlQuery QXmlQuery} to interpret the input to {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()} as an XQuery or as an XSLT stylesheet. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()}. <br></DD></DT>
*/

    public enum QueryLanguage implements com.trolltech.qt.QtEnumerator {
/**
 XQuery 1.0.
*/

        XQuery10(1),
/**
 XSLT 2.0
*/

        XSLT20(2);

        QueryLanguage(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QXmlQuery$QueryLanguage constant with the specified <tt>int</tt>.</brief>
*/

        public static QueryLanguage resolve(int value) {
            return (QueryLanguage) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return XQuery10;
            case 2: return XSLT20;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an invalid, empty query that cannot be used until {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()} is called. <p><b>Note:</b> This constructor must not be used if you intend to use this QXmlQuery to process XSL-T stylesheets. The other constructor must be used in that case.
*/

    public QXmlQuery(){
        super((QPrivateConstructor)null);
        __qt_QXmlQuery();
    }

    native void __qt_QXmlQuery();


/**
Constructs a query that will be used to run Xqueries or XSL-T stylesheets, depending on the value of <tt>queryLanguage</tt>. It will use <tt>np</tt> as its name pool. <p><b>Note:</b> If your QXmlQuery will process XSL-T stylesheets, this constructor must be used. The default constructor can only create instances of QXmlQuery for running XQueries. <p><b>Note:</b> The XSL-T support in this release is considered experimental. See the {@link <a href="../qtxmlpatterns.html#xslt-2-0">XSLT conformance</a>} for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#queryLanguage() queryLanguage()}. <br></DD></DT>
*/

    public QXmlQuery(com.trolltech.qt.xmlpatterns.QXmlQuery.QueryLanguage queryLanguage) {
        this(queryLanguage, (com.trolltech.qt.xmlpatterns.QXmlNamePool)new com.trolltech.qt.xmlpatterns.QXmlNamePool());
    }
/**
Constructs a query that will be used to run Xqueries or XSL-T stylesheets, depending on the value of <tt>queryLanguage</tt>. It will use <tt>np</tt> as its name pool. <p><b>Note:</b> If your QXmlQuery will process XSL-T stylesheets, this constructor must be used. The default constructor can only create instances of QXmlQuery for running XQueries. <p><b>Note:</b> The XSL-T support in this release is considered experimental. See the {@link <a href="../qtxmlpatterns.html#xslt-2-0">XSLT conformance</a>} for details. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#queryLanguage() queryLanguage()}. <br></DD></DT>
*/

    public QXmlQuery(com.trolltech.qt.xmlpatterns.QXmlQuery.QueryLanguage queryLanguage, com.trolltech.qt.xmlpatterns.QXmlNamePool np){
        super((QPrivateConstructor)null);
        __qt_QXmlQuery_QueryLanguage_QXmlNamePool(queryLanguage.value(), np == null ? 0 : np.nativeId());
    }

    native void __qt_QXmlQuery_QueryLanguage_QXmlNamePool(int queryLanguage, long np);

/**
Constructs a query that will use <tt>np</tt> as its name pool. The query cannot be evaluated until {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()} has been called.
*/

    public QXmlQuery(com.trolltech.qt.xmlpatterns.QXmlNamePool np){
        super((QPrivateConstructor)null);
        __qt_QXmlQuery_QXmlNamePool(np == null ? 0 : np.nativeId());
    }

    native void __qt_QXmlQuery_QXmlNamePool(long np);

/**
Constructs a QXmlQuery that is a copy of <tt>other</tt>. The new instance will share resources with the existing query to the extent possible.
*/

    public QXmlQuery(com.trolltech.qt.xmlpatterns.QXmlQuery other){
        super((QPrivateConstructor)null);
        __qt_QXmlQuery_QXmlQuery(other == null ? 0 : other.nativeId());
    }

    native void __qt_QXmlQuery_QXmlQuery(long other);

/**
This is an overloaded member function, provided for convenience. <p>If <tt>localName</tt> is a valid {@link com.trolltech.qt.xmlpatterns.QXmlName#isNCName(java.lang.String) NCName}, this function is equivalent to the following snippet. <pre class="snippet">
    query.bindVariable(new QXmlName(query.namePool(), localName), device);
</pre> A {@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName} is constructed from <tt>localName</tt>, and is passed to the appropriate overload along with <tt>device</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlName#isNCName(java.lang.String) QXmlName::isNCName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void bindVariable(java.lang.String localName, com.trolltech.qt.core.QIODevice arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_bindVariable_String_QIODevice(nativeId(), localName, arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native void __qt_bindVariable_String_QIODevice(long __this__nativeId, java.lang.String localName, long arg__2);

/**
This is an overloaded member function, provided for convenience. <p>This function constructs a {@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName} from <tt>localName</tt> using the query's {@link com.trolltech.qt.xmlpatterns.QXmlNamePool namespace}. The function then behaves as the overloaded function. It is equivalent to the following snippet. <pre class="snippet">
    query.bindVariable(new QXmlName(query.namePool(), localName), value);
</pre>
*/

    @QtBlockedSlot
    public final void bindVariable(java.lang.String localName, com.trolltech.qt.xmlpatterns.QXmlItem value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_bindVariable_String_QXmlItem(nativeId(), localName, value == null ? 0 : value.nativeId());
    }
    @QtBlockedSlot
    native void __qt_bindVariable_String_QXmlItem(long __this__nativeId, java.lang.String localName, long value);

/**
This is an overloaded member function, provided for convenience. <p>Has the same behavior and effects as the function being overloaded, but takes the variable name <tt>localName</tt> as a QString. <tt>query</tt> is used as in the overloaded function.
*/

    @QtBlockedSlot
    public final void bindVariable(java.lang.String localName, com.trolltech.qt.xmlpatterns.QXmlQuery query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_bindVariable_String_QXmlQuery(nativeId(), localName, query == null ? 0 : query.nativeId());
    }
    @QtBlockedSlot
    native void __qt_bindVariable_String_QXmlQuery(long __this__nativeId, java.lang.String localName, long query);

/**
Binds the variable <tt>name</tt> to the <tt>device</tt> so that $<tt>name</tt> can be used from within the query to refer to the <tt>device</tt>. The {@link com.trolltech.qt.core.QIODevice QIODevice}<tt>device</tt> is exposed to the query as a URI of type <tt>xs:anyURI</tt>, which can be passed to the <tt>fn:doc()</tt> function to be read. E.g., this function can be used to pass an XML document in memory to <tt>fn:doc</tt>. <pre class="snippet">
    QByteArray myDocument = new QByteArray();
    QBuffer buffer = new QBuffer(myDocument); // This is a QIODevice.
    buffer.open(QIODevice.OpenModeFlag.ReadOnly);
    QXmlQuery query = new QXmlQuery();
    query.bindVariable("myDocument", buffer);
    query.setQuery("declare variable $myDocument external; doc($myDocument)");
</pre> The caller must ensure that <tt>device</tt> has been opened with at least {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::ReadOnly } prior to this binding. Otherwise, behavior is undefined. <p>If the query will access an XML document contained in a QString, use a {@link com.trolltech.qt.core.QBuffer QBuffer} as shown in the following snippet. Suppose myQString contains <tt>&lt;document&gt;content&lt;/document&gt;</tt><br><br>The following code example is written in c++.<br> <pre class="snippet">
    QBuffer device;
    device.setData(myQString.toUtf8());
    device.open(QIODevice::ReadOnly);

    QXmlQuery query;
    query.setQuery("doc($inputDocument)/query[theDocument]");
    query.bindVariable("inputDocument", &device);
</pre> <tt>name</tt> must not be null. <tt>name</tt>.isNull() must return false. If <tt>name</tt> has already been bound, its previous binding will be overridden. The URI that <tt>name</tt> evaluates to is arbitrary and may change. <p>If the type of the variable binding changes (e.g., if a previous binding by the same name was a {@link com.trolltech.qt.QVariant QVariant}, or if there was no previous binding), {@link com.trolltech.qt.xmlpatterns.QXmlQuery#isValid() isValid()} will return <tt>false</tt>, and recompilation of the query text is required. To recompile the query, call {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()}. For this reason, {@link com.trolltech.qt.xmlpatterns.QXmlQuery#bindVariable(java.lang.String, com.trolltech.qt.core.QIODevice) bindVariable()} should be called before {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()}, if possible. <p><b>Note:</b><tt>device</tt> must not be deleted while this QXmlQuery exists.
*/

    @QtBlockedSlot
    public final void bindVariable(com.trolltech.qt.xmlpatterns.QXmlName name, com.trolltech.qt.core.QIODevice arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_bindVariable_QXmlName_QIODevice(nativeId(), name == null ? 0 : name.nativeId(), arg__2 == null ? 0 : arg__2.nativeId());
    }
    @QtBlockedSlot
    native void __qt_bindVariable_QXmlName_QIODevice(long __this__nativeId, long name, long arg__2);

/**
Binds the variable <tt>name</tt> to the <tt>value</tt> so that $<tt>name</tt> can be used from within the query to refer to the <tt>value</tt>. <p><tt>name</tt> must not be null. <tt>name</tt>.isNull() must return false. If <tt>name</tt> has already been bound by a previous {@link com.trolltech.qt.xmlpatterns.QXmlQuery#bindVariable(java.lang.String, com.trolltech.qt.core.QIODevice) bindVariable()} call, its previous binding will be overridden. <p>If <tt>value</tt> is null so that <tt>value</tt>.isNull() returns true, and <tt>name</tt> already has a binding, the effect is to remove the existing binding for <tt>name</tt>. <p>To bind a value of type QString or {@link com.trolltech.qt.core.QUrl QUrl}, wrap the value in a {@link com.trolltech.qt.QVariant QVariant} such that {@link com.trolltech.qt.xmlpatterns.QXmlItem QXmlItem}'s {@link com.trolltech.qt.QVariant QVariant} constructor is called. <p>All strings processed by the query must be valid XQuery strings, which means they must contain only XML 1.0 characters. However, this requirement is not checked. If the query processes an invalid string, the behavior is undefined. <p><DT><b>See also:</b><br><DD>QVariant::isValid(), {@link <a href="../qtxmlpatterns.html">How QVariant maps to XQuery's Data Model</a>}, and {@link com.trolltech.qt.xmlpatterns.QXmlItem#isNull() QXmlItem::isNull()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void bindVariable(com.trolltech.qt.xmlpatterns.QXmlName name, com.trolltech.qt.xmlpatterns.QXmlItem value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_bindVariable_QXmlName_QXmlItem(nativeId(), name == null ? 0 : name.nativeId(), value == null ? 0 : value.nativeId());
    }
    @QtBlockedSlot
    native void __qt_bindVariable_QXmlName_QXmlItem(long __this__nativeId, long name, long value);

/**
Binds the result of the query <tt>query</tt>, to a variable by name <tt>name</tt>. <p>Evaluation of <tt>query</tt> will be commenced when this function is called. <p>If <tt>query</tt> is invalid, behavior is undefined. <tt>query</tt> will be copied. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void bindVariable(com.trolltech.qt.xmlpatterns.QXmlName name, com.trolltech.qt.xmlpatterns.QXmlQuery query)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_bindVariable_QXmlName_QXmlQuery(nativeId(), name == null ? 0 : name.nativeId(), query == null ? 0 : query.nativeId());
    }
    @QtBlockedSlot
    native void __qt_bindVariable_QXmlName_QXmlQuery(long __this__nativeId, long name, long query);

/**
Evaluates the query or stylesheet, and writes the output to <tt>target</tt>. <p>{@link com.trolltech.qt.xmlpatterns.QXmlSerializer QXmlSerializer} is used to write the output to <tt>target</tt>. In a future release, it is expected that this function will be changed to respect serialization options set in the stylesheet. <p>If an error occurs during the evaluation, error messages are sent to {@link com.trolltech.qt.xmlpatterns.QXmlQuery#messageHandler() messageHandler()} and <tt>false</tt> is returned. <p>If <tt>target</tt> is <tt>null</tt>, or is not opened in at least {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::WriteOnly } mode, the behavior is undefined. QXmlQuery does not take ownership of <tt>target</tt>. <p>This is an overloaded member function, provided for convenience.
*/

    @QtBlockedSlot
    public final boolean evaluateTo(com.trolltech.qt.core.QIODevice target)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_evaluateTo_QIODevice(nativeId(), target == null ? 0 : target.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_evaluateTo_QIODevice(long __this__nativeId, long target);

    @QtBlockedSlot
    private final boolean evaluateTo_private(com.trolltech.qt.QNativePointer output)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_evaluateTo_private_nativepointer(nativeId(), output);
    }
    @QtBlockedSlot
    native boolean __qt_evaluateTo_private_nativepointer(long __this__nativeId, com.trolltech.qt.QNativePointer output);

/**
Starts the evaluation and makes it available in <tt>result</tt>. If <tt>result</tt> is null, the behavior is undefined. The evaluation takes place incrementally (lazy evaluation), as the caller uses {@link com.trolltech.qt.xmlpatterns.QXmlResultItems#next() QXmlResultItems::next()} to get the next result. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlResultItems#next() QXmlResultItems::next()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void evaluateTo(com.trolltech.qt.xmlpatterns.QXmlResultItems result)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_evaluateTo_QXmlResultItems(nativeId(), result == null ? 0 : result.nativeId());
    }
    @QtBlockedSlot
    native void __qt_evaluateTo_QXmlResultItems(long __this__nativeId, long result);

/**
Returns the name of the XSL-T stylesheet template that the processor will call first when running an XSL-T stylesheet. This function only applies when using QXmlQuery to process XSL-T stylesheets. By default, no initial template is set. In that case, a default constructed {@link com.trolltech.qt.xmlpatterns.QXmlName QXmlName} is returned. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#setInitialTemplateName(java.lang.String) setInitialTemplateName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xmlpatterns.QXmlName initialTemplateName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_initialTemplateName(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlName __qt_initialTemplateName(long __this__nativeId);

/**
Returns true if this query is valid. Examples of invalid queries are ones that contain syntax errors or that have not had {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()} called for them yet.
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);

/**
Returns the message handler that handles compile and runtime messages for this QXmlQuery. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#setMessageHandler(com.trolltech.qt.xmlpatterns.QAbstractMessageHandler) setMessageHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xmlpatterns.QAbstractMessageHandler messageHandler()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_messageHandler(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QAbstractMessageHandler __qt_messageHandler(long __this__nativeId);

/**
Returns the name pool used by this QXmlQuery for constructing {@link com.trolltech.qt.xmlpatterns.QXmlName names}. There is no setter for the name pool, because mixing name pools causes errors due to name confusion.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xmlpatterns.QXmlNamePool namePool()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_namePool(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlNamePool __qt_namePool(long __this__nativeId);

/**
Returns the network manager, or 0 if it has not been set. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#setNetworkAccessManager(com.trolltech.qt.network.QNetworkAccessManager) setNetworkAccessManager()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.network.QNetworkAccessManager networkAccessManager()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_networkAccessManager(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.network.QNetworkAccessManager __qt_networkAccessManager(long __this__nativeId);

/**
Assigns <tt>other</tt> to this QXmlQuery instance.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xmlpatterns.QXmlQuery operator_assign(com.trolltech.qt.xmlpatterns.QXmlQuery other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_assign_QXmlQuery(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QXmlQuery __qt_operator_assign_QXmlQuery(long __this__nativeId, long other);

/**
Returns a value indicating what this QXmlQuery is being used for. The default is {@link com.trolltech.qt.xmlpatterns.QXmlQuery.QueryLanguage QXmlQuery::XQuery10 }, which means the QXmlQuery is being used for running XQuery and XPath queries. {@link com.trolltech.qt.xmlpatterns.QXmlQuery.QueryLanguage QXmlQuery::XSLT20 } can also be returned, which indicates the QXmlQuery is for running XSL-T spreadsheets.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xmlpatterns.QXmlQuery.QueryLanguage queryLanguage()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.xmlpatterns.QXmlQuery.QueryLanguage.resolve(__qt_queryLanguage(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_queryLanguage(long __this__nativeId);

/**
Sets the focus to be the <tt>document</tt> read from the {@link com.trolltech.qt.core.QIODevice QIODevice} and returns true. If <tt>document</tt> cannot be loaded, false is returned. <p>QXmlQuery does not take ownership of <tt>document</tt>. The user guarantees that a document is available from the <tt>document</tt> device and that the document is not empty. The device must be opened in at least read-only mode. <tt>document</tt> must stay in scope as long as the current query is active. <p>This is an overloaded member function, provided for convenience.
*/

    @QtBlockedSlot
    public final boolean setFocus(com.trolltech.qt.core.QIODevice document)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcFocusDevice = document;
        }
        return __qt_setFocus_QIODevice(nativeId(), document == null ? 0 : document.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_setFocus_QIODevice(long __this__nativeId, long document);

/**
This is an overloaded member function, provided for convenience. <p>Sets the focus to be the document located at <tt>documentURI</tt> and returns true. If <tt>documentURI</tt> cannot be loaded, false is returned. It is undefined at what time the document may be loaded. When loading the document, the message handler and URI resolver set on this QXmlQuery are used. <p>If <tt>documentURI</tt> is empty or is not a valid URI, the behavior of this function is undefined.
*/

    @QtBlockedSlot
    public final boolean setFocus(com.trolltech.qt.core.QUrl documentURI)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_setFocus_QUrl(nativeId(), documentURI == null ? 0 : documentURI.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_setFocus_QUrl(long __this__nativeId, long documentURI);

/**
Sets the focus to <tt>item</tt>. The focus is the set of items that the context item expression and path expressions navigate from. For example, in the expression p/span, the element that p evaluates to is the focus for the following expression, span. <p>The focus can be accessed using the context item expression, i.e., dot ("."). <p>By default, the focus is not set and is undefined. It will therefore result in a dynamic error, <tt>XPDY0002</tt>, if the focus is attempted to be accessed. The focus must be set before the query is set with {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()}. <p>There is no behavior defined for setting an item which is null.
*/

    @QtBlockedSlot
    public final void setFocus(com.trolltech.qt.xmlpatterns.QXmlItem item)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFocus_QXmlItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFocus_QXmlItem(long __this__nativeId, long item);

/**
This is an overloaded member function, provided for convenience. <p>Sets the name of the initial template to <tt>localName</tt>, which must be a valid {@link com.trolltech.qt.xmlpatterns.QXmlName#localName(com.trolltech.qt.xmlpatterns.QXmlNamePool) local name}. The initial template is the one the processor calls first, instead of attempting to match a template to the context node (if any). If an initial template is not set, the standard order of template invocation will be used. <p>This function only applies when using QXmlQuery to process XSL-T stylesheets. The name becomes part of the compiled stylesheet. Therefore, this function must be called before calling {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()}. <p>If <tt>localName</tt> is not a valid {@link com.trolltech.qt.xmlpatterns.QXmlName#localName(com.trolltech.qt.xmlpatterns.QXmlNamePool) local name}, the effect is undefined. If the stylesheet has no template named <tt>localName</tt>, the processor will use the standard order of template invocation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#initialTemplateName() initialTemplateName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setInitialTemplateName(java.lang.String name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInitialTemplateName_String(nativeId(), name);
    }
    @QtBlockedSlot
    native void __qt_setInitialTemplateName_String(long __this__nativeId, java.lang.String name);

/**
Sets the <tt>name</tt> of the initial template. The initial template is the one the processor calls first, instead of attempting to match a template to the context node (if any). If an initial template is not set, the standard order of template invocation will be used. <p>This function only applies when using QXmlQuery to process XSL-T stylesheets. The name becomes part of the compiled stylesheet. Therefore, this function must be called before calling {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()}. <p>If the stylesheet has no template named <tt>name</tt>, the processor will use the standard order of template invocation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#initialTemplateName() initialTemplateName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setInitialTemplateName(com.trolltech.qt.xmlpatterns.QXmlName name)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setInitialTemplateName_QXmlName(nativeId(), name == null ? 0 : name.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setInitialTemplateName_QXmlName(long __this__nativeId, long name);

/**
Changes the {@link com.trolltech.qt.xmlpatterns.QAbstractMessageHandler message handler} for this QXmlQuery to <tt>aMessageHandler</tt>. The query sends all compile and runtime messages to this message handler. QXmlQuery does not take ownership of <tt>aMessageHandler</tt>. <p>Normally, the default message handler is sufficient. It writes compile and runtime messages to stderr. The default message handler includes color codes if stderr can render colors. <p>Note that changing the message handler after the query has been compiled has no effect, i.e. the query uses the same message handler at runtime that it uses at compile time. <p>When QXmlQuery calls {@link com.trolltech.qt.xmlpatterns.QAbstractMessageHandler#message(com.trolltech.qt.core.Global.QtMsgType, java.lang.String, com.trolltech.qt.core.QUrl) QAbstractMessageHandler::message()}, the arguments are as follows: <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> message() argument</center></th><th><center> Semantics</center></th></tr></thead><tr valign="top" class="even"><td> {@link null.QtMsgType QtMsgType } type</td><td> Only {@link null.QtMsgType QtWarningMsg } and {@link null.QtMsgType QtFatalMsg } are used. The former identifies a compile or runtime warning, while the latter identifies a dynamic or static error.</td></tr><tr valign="top" class="odd"><td> const QString & description</td><td> An XHTML document which is the actual message. It is translated into the current language.</td></tr><tr valign="top" class="even"><td> const {@link com.trolltech.qt.core.QUrl QUrl} &identifier</td><td> Identifies the error with a URI, where the fragment is the error code, and the rest of the URI is the error namespace.</td></tr><tr valign="top" class="odd"><td> const {@link com.trolltech.qt.xmlpatterns.QSourceLocation QSourceLocation} & sourceLocation</td><td> Identifies where the error occurred.</td></tr></table> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#messageHandler() messageHandler()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMessageHandler(com.trolltech.qt.xmlpatterns.QAbstractMessageHandler messageHandler)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcMessageHandler = messageHandler;
        }
        __qt_setMessageHandler_QAbstractMessageHandler(nativeId(), messageHandler == null ? 0 : messageHandler.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setMessageHandler_QAbstractMessageHandler(long __this__nativeId, long messageHandler);

/**
Sets the network manager to <tt>newManager</tt>. QXmlQuery does not take ownership of <tt>newManager</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#networkAccessManager() networkAccessManager()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNetworkAccessManager(com.trolltech.qt.network.QNetworkAccessManager newManager)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcNetworkAccessManager = newManager;
        }
        __qt_setNetworkAccessManager_QNetworkAccessManager(nativeId(), newManager == null ? 0 : newManager.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setNetworkAccessManager_QNetworkAccessManager(long __this__nativeId, long newManager);


/**
Sets this QXmlQuery to an XQuery read from the <tt>sourceCode</tt> device. The device must have been opened with at least {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::ReadOnly }. <p><tt>documentURI</tt> represents the query obtained from the <tt>sourceCode</tt> device. It is the base URI of the static context, as defined in the XQuery language. It is used internally to resolve relative URIs that appear in the query, and for message reporting. <tt>documentURI</tt> can be empty. If it is empty, the {@link com.trolltech.qt.core.QCoreApplication#applicationFilePath() application file path} is used. If it is not empty, it may be either relative or absolute. If it is relative, it is resolved itself against the {@link com.trolltech.qt.core.QCoreApplication#applicationFilePath() application file path} before it is used. If <tt>documentURI</tt> is neither a valid URI nor empty, the result is undefined. <p>If the query contains a static error (e.g. syntax error), an error message is sent to the {@link com.trolltech.qt.xmlpatterns.QXmlQuery#messageHandler() messageHandler()}, and {@link com.trolltech.qt.xmlpatterns.QXmlQuery#isValid() isValid()} will return false. <p>Variables must be bound before {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()} is called. <p>The encoding of the XQuery in <tt>sourceCode</tt> is detected internally using the rules for setting and detecting encoding of XQuery files, which are explained in the XQuery language. <p>If <tt>sourceCode</tt> is <tt>null</tt> or not readable, or if <tt>documentURI</tt> is not a valid URI, behavior is undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#isValid() isValid()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setQuery(com.trolltech.qt.core.QIODevice sourceCode) {
        setQuery(sourceCode, (com.trolltech.qt.core.QUrl)new com.trolltech.qt.core.QUrl());
    }
/**
Sets this QXmlQuery to an XQuery read from the <tt>sourceCode</tt> device. The device must have been opened with at least {@link com.trolltech.qt.core.QIODevice.OpenModeFlag QIODevice::ReadOnly }. <p><tt>documentURI</tt> represents the query obtained from the <tt>sourceCode</tt> device. It is the base URI of the static context, as defined in the XQuery language. It is used internally to resolve relative URIs that appear in the query, and for message reporting. <tt>documentURI</tt> can be empty. If it is empty, the {@link com.trolltech.qt.core.QCoreApplication#applicationFilePath() application file path} is used. If it is not empty, it may be either relative or absolute. If it is relative, it is resolved itself against the {@link com.trolltech.qt.core.QCoreApplication#applicationFilePath() application file path} before it is used. If <tt>documentURI</tt> is neither a valid URI nor empty, the result is undefined. <p>If the query contains a static error (e.g. syntax error), an error message is sent to the {@link com.trolltech.qt.xmlpatterns.QXmlQuery#messageHandler() messageHandler()}, and {@link com.trolltech.qt.xmlpatterns.QXmlQuery#isValid() isValid()} will return false. <p>Variables must be bound before {@link com.trolltech.qt.xmlpatterns.QXmlQuery#setQuery(com.trolltech.qt.core.QIODevice) setQuery()} is called. <p>The encoding of the XQuery in <tt>sourceCode</tt> is detected internally using the rules for setting and detecting encoding of XQuery files, which are explained in the XQuery language. <p>If <tt>sourceCode</tt> is <tt>null</tt> or not readable, or if <tt>documentURI</tt> is not a valid URI, behavior is undefined. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#isValid() isValid()}. <br></DD></DT>
*/

    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    public final void setQuery(com.trolltech.qt.core.QIODevice sourceCode, com.trolltech.qt.core.QUrl documentURI)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQuery_QIODevice_QUrl(nativeId(), sourceCode == null ? 0 : sourceCode.nativeId(), documentURI == null ? 0 : documentURI.nativeId());
    }
    @SuppressWarnings("unchecked")
    @QtBlockedSlot
    native void __qt_setQuery_QIODevice_QUrl(long __this__nativeId, long sourceCode, long documentURI);


/**
This is an overloaded member function, provided for convenience. <p>The behavior and requirements of this function are the same as for setQuery({@link com.trolltech.qt.core.QIODevice QIODevice}*, const {@link com.trolltech.qt.core.QUrl QUrl}&), after the XQuery has been read from the IO device into a string. Because <tt>sourceCode</tt> is already a Unicode string, detection of its encoding is unnecessary.
*/

    @QtBlockedSlot
    public final void setQuery(java.lang.String sourceCode) {
        setQuery(sourceCode, (com.trolltech.qt.core.QUrl)new com.trolltech.qt.core.QUrl());
    }
/**
This is an overloaded member function, provided for convenience. <p>The behavior and requirements of this function are the same as for setQuery({@link com.trolltech.qt.core.QIODevice QIODevice}*, const {@link com.trolltech.qt.core.QUrl QUrl}&), after the XQuery has been read from the IO device into a string. Because <tt>sourceCode</tt> is already a Unicode string, detection of its encoding is unnecessary.
*/

    @QtBlockedSlot
    public final void setQuery(java.lang.String sourceCode, com.trolltech.qt.core.QUrl documentURI)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQuery_String_QUrl(nativeId(), sourceCode, documentURI == null ? 0 : documentURI.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setQuery_String_QUrl(long __this__nativeId, java.lang.String sourceCode, long documentURI);


/**
Sets this QXmlQuery to the XQuery read from the <tt>queryURI</tt>. Use {@link com.trolltech.qt.xmlpatterns.QXmlQuery#isValid() isValid()} after calling this function. If an error occurred reading <tt>queryURI</tt>, e.g., the query does not exist, cannot be read, or is invalid, {@link com.trolltech.qt.xmlpatterns.QXmlQuery#isValid() isValid()} will return false. <p>The supported URI schemes are the same as those in the XQuery function <tt>fn:doc</tt>, except that queryURI can be the object of a variable binding. <p><tt>baseURI</tt> is the Base URI of the static context, as defined in the XQuery language. It is used internally to resolve relative URIs that appear in the query, and for message reporting. If <tt>baseURI</tt> is empty, <tt>queryURI</tt> is used. Otherwise, <tt>baseURI</tt> is used, and it is resolved against the {@link com.trolltech.qt.core.QCoreApplication#applicationFilePath() application file path} if it is relative. <p>If <tt>queryURI</tt> is empty or invalid, or if <tt>baseURI</tt> is invalid, the behavior of this function is undefined.
*/

    @QtBlockedSlot
    public final void setQuery(com.trolltech.qt.core.QUrl queryURI) {
        setQuery(queryURI, (com.trolltech.qt.core.QUrl)new com.trolltech.qt.core.QUrl());
    }
/**
Sets this QXmlQuery to the XQuery read from the <tt>queryURI</tt>. Use {@link com.trolltech.qt.xmlpatterns.QXmlQuery#isValid() isValid()} after calling this function. If an error occurred reading <tt>queryURI</tt>, e.g., the query does not exist, cannot be read, or is invalid, {@link com.trolltech.qt.xmlpatterns.QXmlQuery#isValid() isValid()} will return false. <p>The supported URI schemes are the same as those in the XQuery function <tt>fn:doc</tt>, except that queryURI can be the object of a variable binding. <p><tt>baseURI</tt> is the Base URI of the static context, as defined in the XQuery language. It is used internally to resolve relative URIs that appear in the query, and for message reporting. If <tt>baseURI</tt> is empty, <tt>queryURI</tt> is used. Otherwise, <tt>baseURI</tt> is used, and it is resolved against the {@link com.trolltech.qt.core.QCoreApplication#applicationFilePath() application file path} if it is relative. <p>If <tt>queryURI</tt> is empty or invalid, or if <tt>baseURI</tt> is invalid, the behavior of this function is undefined.
*/

    @QtBlockedSlot
    public final void setQuery(com.trolltech.qt.core.QUrl queryURI, com.trolltech.qt.core.QUrl baseURI)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setQuery_QUrl_QUrl(nativeId(), queryURI == null ? 0 : queryURI.nativeId(), baseURI == null ? 0 : baseURI.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setQuery_QUrl_QUrl(long __this__nativeId, long queryURI, long baseURI);

/**
Sets the URI resolver to <tt>resolver</tt>. QXmlQuery does not take ownership of <tt>resolver</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#uriResolver() uriResolver()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setUriResolver(com.trolltech.qt.xmlpatterns.QAbstractUriResolver resolver)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        {
            __rcUriResolver = resolver;
        }
        __qt_setUriResolver_QAbstractUriResolver(nativeId(), resolver == null ? 0 : resolver.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setUriResolver_QAbstractUriResolver(long __this__nativeId, long resolver);

/**
Returns the query's URI resolver. If no URI resolver has been set, {@link <a href="../qtxmlpatterns.html">QtXmlPatterns</a>} will use the URIs in queries as they are. <p>The URI resolver provides a level of abstraction, or polymorphic URIs. A resolver can rewrite logical URIs to physical ones, or it can translate obsolete or invalid URIs to valid ones. <p>{@link <a href="../qtxmlpatterns.html">QtXmlPatterns</a>} calls the URI resolver for all URIs it encounters, except for namespaces. Specifically, all builtin functions that deal with URIs (<tt>fn:doc()</tt>, and <tt>fn:doc-available()</tt>). <p>In the case of <tt>fn:doc()</tt>, the absolute URI is the base URI in the static context (which most likely is the location of the query). Rather than use the URI the user specified, the return value of {@link com.trolltech.qt.xmlpatterns.QAbstractUriResolver#resolve(com.trolltech.qt.core.QUrl, com.trolltech.qt.core.QUrl) QAbstractUriResolver::resolve()} will be used. <p>When {@link <a href="../qtxmlpatterns.html">QtXmlPatterns</a>} calls {@link com.trolltech.qt.xmlpatterns.QAbstractUriResolver#resolve(com.trolltech.qt.core.QUrl, com.trolltech.qt.core.QUrl) QAbstractUriResolver::resolve()} the absolute URI is the URI mandated by the XQuery language, and the relative URI is the URI specified by the user. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.xmlpatterns.QXmlQuery#setUriResolver(com.trolltech.qt.xmlpatterns.QAbstractUriResolver) setUriResolver()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.xmlpatterns.QAbstractUriResolver uriResolver()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_uriResolver(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.xmlpatterns.QAbstractUriResolver __qt_uriResolver(long __this__nativeId);

/**
@exclude
*/

    public static native QXmlQuery fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QXmlQuery(QPrivateConstructor p) { super(p); } 

/**
This is an overloaded method provided for convenience.
*/

    public final String evaluateTo()
    {
        QNativePointer result = new QNativePointer(QNativePointer.Type.String);

        boolean ok = evaluateTo_private(result);

        return ok ? result.stringValue() : null;
    }

}
