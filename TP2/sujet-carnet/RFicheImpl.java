import java.io.*;
import java.rmi.*;
import java.rmi.server.*;

public class RFicheImpl extends UnicastRemoteObject implements RFiche {
	private String nom;
	private String email;
	
	public RFicheImpl(String name, String mail)throws RemoteException{
		try{
		this.nom = name;
		this.email = mail;
		}catch(Exception e){e.printStackTrace();}
	 }

	public String getNom ()throws RemoteException{
		String res = "";
		try{
			res = this.nom;
		}catch (Exception e){e.printStackTrace();}
		return res;
	}
	public String getEmail ()throws RemoteException{
		String res = "";
		try{
			res = this.email;
		}catch (Exception e){e.printStackTrace();}
	return res;
}
}
