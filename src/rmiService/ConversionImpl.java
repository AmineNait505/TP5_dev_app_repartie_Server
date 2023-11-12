package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion{
	
	// public si la classe ConversionServer existe ailleur du package
	public ConversionImpl() throws RemoteException{
		super(); //j'ai appeler le constructeur par defaut de unicastRemoteObject
	}
	@Override
	public double convertirMontant(double mt) throws RemoteException{
		
		return mt*3.3;
	}
	

}
