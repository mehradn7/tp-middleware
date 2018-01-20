import java.rmi.server.*;
import java.util.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;

public class CarnetImpl extends UnicastRemoteObject implements Carnet{
	private HashMap<String, RFiche> hmap;
	
	public CarnetImpl() throws RemoteException{
		try{
		this.hmap = new HashMap<String, RFiche>();
		}catch(Exception e){e.printStackTrace();}
	}
	
	
	public void Ajouter(SFiche sf) throws RemoteException{
		RFiche rf = new RFicheImpl(sf.getNom(), sf.getEmail());
		hmap.put(sf.getNom(), rf);
	}
	public RFiche Consulter(String n) throws RemoteException{
		RFiche res = new RFicheImpl("","");
		try{
			res = hmap.get(n);
		}catch (Exception e){e.printStackTrace();}
		return res;
	}
	
	public static void main(String args[]) {
		try{
			//Registry reg = LocateRegistry.createRegistry(port);
			//URL = "//" + InetAddr
			Naming.rebind("//" + "localhost" + "/carnet1", new CarnetImpl());
			Naming.rebind("//" + "localhost" + "/carnet2", new CarnetImpl());
		}catch(Exception e){e.printStackTrace();}

	}

}

