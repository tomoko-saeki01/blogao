/*
 *
 * Copyright (c) 2007, Sun Microsystems, Inc.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *  * Neither the name of Sun Microsystems nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
// Stub class generated by jcrmic, do not edit.
// Contents subject to change without notice.
package com.sun.javacard.samples.RMIDemo;

public final class Purse_Stub extends javax.microedition.jcrmi.RemoteStub implements com.sun.javacard.samples.RMIDemo.Purse,
    java.rmi.Remote {
    // constructor
    public Purse_Stub() {
        super();
    }

    public byte[] getAccountNumber() throws java.rmi.RemoteException {
        try {
            Object result = ref.invoke("getAccountNumber()[B", null);

            return (byte[])result;
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.RemoteException("undeclared checked exception", e);
        }
    }

    public void setAccountNumber(byte[] param1)
        throws java.rmi.RemoteException, javacard.framework.UserException {
        try {
            ref.invoke("setAccountNumber([B)V", new java.lang.Object[] { param1 });
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (javacard.framework.UserException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.RemoteException("undeclared checked exception", e);
        }
    }

    public void credit(short param1)
        throws java.rmi.RemoteException, javacard.framework.UserException {
        try {
            ref.invoke("credit(S)V", new java.lang.Object[] { new Short(param1) });
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (javacard.framework.UserException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.RemoteException("undeclared checked exception", e);
        }
    }

    public void debit(short param1)
        throws java.rmi.RemoteException, javacard.framework.UserException {
        try {
            ref.invoke("debit(S)V", new java.lang.Object[] { new Short(param1) });
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (javacard.framework.UserException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.RemoteException("undeclared checked exception", e);
        }
    }

    public short getBalance() throws java.rmi.RemoteException {
        try {
            Object result = ref.invoke("getBalance()S", null);

            return ((Short)result).shortValue();
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.RemoteException("undeclared checked exception", e);
        }
    }
}