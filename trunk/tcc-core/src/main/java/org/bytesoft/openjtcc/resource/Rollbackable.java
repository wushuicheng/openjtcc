package org.bytesoft.openjtcc.resource;

import java.rmi.RemoteException;

import javax.transaction.HeuristicCommitException;
import javax.transaction.HeuristicMixedException;
import javax.transaction.SystemException;

public interface Rollbackable {
	public void rollback() throws HeuristicMixedException, HeuristicCommitException, SystemException, RemoteException;
}
