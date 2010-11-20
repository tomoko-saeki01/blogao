package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
This class is internal to Qt Jambi.This class is internal to Qt Jambi.

@exclude
*/
@QtJambiGeneratedClass
public class QFutureWatcherBase extends com.trolltech.qt.core.QObject
{
/**

*/

    public final Signal0 canceled = new Signal0();

    private final void canceled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_canceled(nativeId());
    }
    native void __qt_canceled(long __this__nativeId);
/**

*/

    public final Signal0 finished = new Signal0();

    private final void finished()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_finished(nativeId());
    }
    native void __qt_finished(long __this__nativeId);
/**
 <p><DT><b>See also.</b><br><DD>setPaused(). <br></DD></DT>
*/

    public final Signal0 paused = new Signal0();

    private final void paused()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_paused(nativeId());
    }
    native void __qt_paused(long __this__nativeId);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: minimum), java.lang.Integer(named: maximum)&gt;:<p>
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> progressRangeChanged = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void progressRangeChanged(int minimum, int maximum)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_progressRangeChanged_int_int(nativeId(), minimum, maximum);
    }
    native void __qt_progressRangeChanged_int_int(long __this__nativeId, int minimum, int maximum);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.String(named: progressText)&gt;:<p>
*/

    public final Signal1<java.lang.String> progressTextChanged = new Signal1<java.lang.String>();

    private final void progressTextChanged(java.lang.String progressText)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_progressTextChanged_String(nativeId(), progressText);
    }
    native void __qt_progressTextChanged_String(long __this__nativeId, java.lang.String progressText);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: progressValue)&gt;:<p>
*/

    public final Signal1<java.lang.Integer> progressValueChanged = new Signal1<java.lang.Integer>();

    private final void progressValueChanged(int progressValue)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_progressValueChanged_int(nativeId(), progressValue);
    }
    native void __qt_progressValueChanged_int(long __this__nativeId, int progressValue);
/**
<p>This signal takes 1 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: resultIndex)&gt;:<p>
*/

    public final Signal1<java.lang.Integer> resultReadyAt = new Signal1<java.lang.Integer>();

    private final void resultReadyAt(int resultIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resultReadyAt_int(nativeId(), resultIndex);
    }
    native void __qt_resultReadyAt_int(long __this__nativeId, int resultIndex);
/**
<p>This signal takes 2 generic argument(s). We list their type and the name they go by in the description of this signal. &lt;java.lang.Integer(named: beginIndex), java.lang.Integer(named: endIndex)&gt;:<p>
*/

    public final Signal2<java.lang.Integer, java.lang.Integer> resultsReadyAt = new Signal2<java.lang.Integer, java.lang.Integer>();

    private final void resultsReadyAt(int beginIndex, int endIndex)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resultsReadyAt_int_int(nativeId(), beginIndex, endIndex);
    }
    native void __qt_resultsReadyAt_int_int(long __this__nativeId, int beginIndex, int endIndex);
/**

*/

    public final Signal0 resumed = new Signal0();

    private final void resumed()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resumed(nativeId());
    }
    native void __qt_resumed(long __this__nativeId);
/**

*/

    public final Signal0 started = new Signal0();

    private final void started()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_started(nativeId());
    }
    native void __qt_started(long __this__nativeId);


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QFutureWatcherBase() {
        this((com.trolltech.qt.core.QObject)null);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public QFutureWatcherBase(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QFutureWatcherBase_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QFutureWatcherBase_QObject(long parent);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public final void cancel()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_cancel(nativeId());
    }
    native void __qt_cancel(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void connectOutputInterface()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_connectOutputInterface(nativeId());
    }
    @QtBlockedSlot
    native void __qt_connectOutputInterface(long __this__nativeId);


/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void disconnectOutputInterface() {
        disconnectOutputInterface((boolean)false);
    }
/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    protected final void disconnectOutputInterface(boolean pendingAssignment)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_disconnectOutputInterface_boolean(nativeId(), pendingAssignment);
    }
    @QtBlockedSlot
    native void __qt_disconnectOutputInterface_boolean(long __this__nativeId, boolean pendingAssignment);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean isCanceled()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isCanceled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isCanceled(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean isFinished()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isFinished(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isFinished(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean isPaused()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isPaused(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isPaused(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean isRunning()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isRunning(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isRunning(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final boolean isStarted()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isStarted(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isStarted(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public final void pause()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_pause(nativeId());
    }
    native void __qt_pause(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int progressMaximum()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_progressMaximum(nativeId());
    }
    @QtBlockedSlot
    native int __qt_progressMaximum(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int progressMinimum()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_progressMinimum(nativeId());
    }
    @QtBlockedSlot
    native int __qt_progressMinimum(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final java.lang.String progressText()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_progressText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_progressText(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final int progressValue()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_progressValue(nativeId());
    }
    @QtBlockedSlot
    native int __qt_progressValue(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public final void resume()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_resume(nativeId());
    }
    native void __qt_resume(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public final void setPaused(boolean paused)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPaused_boolean(nativeId(), paused);
    }
    native void __qt_setPaused_boolean(long __this__nativeId, boolean paused);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void setPendingResultsLimit(int limit)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPendingResultsLimit_int(nativeId(), limit);
    }
    @QtBlockedSlot
    native void __qt_setPendingResultsLimit_int(long __this__nativeId, int limit);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public final void togglePaused()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_togglePaused(nativeId());
    }
    native void __qt_togglePaused(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public final void waitForFinished()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_waitForFinished(nativeId());
    }
    @QtBlockedSlot
    native void __qt_waitForFinished(long __this__nativeId);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @QtBlockedSlot
    public boolean event(com.trolltech.qt.core.QEvent event)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_event_QEvent(nativeId(), event == null ? 0 : event.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_event_QEvent(long __this__nativeId, long event);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    public static native QFutureWatcherBase fromNativePointer(QNativePointer nativePointer);

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

    protected QFutureWatcherBase(QPrivateConstructor p) { super(p); } 
}
