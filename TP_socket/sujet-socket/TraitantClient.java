import java.net.Socket;

import java.io.*;

public class TraitantClient extends Thread{
	Socket sc;
	
	public TraitantClient(Socket s){
		sc = s;
	}
	
	public void run(){
		try{
			byte[] buff  = new byte[1024];
			InputStream is = sc.getInputStream();
			is.read(buff);
			int randomServer = LoadBalancer.rand.nextInt(LoadBalancer.nbHosts);

			Socket sw = new Socket(LoadBalancer.hosts[randomServer], LoadBalancer.ports[randomServer]);
			OutputStream os = sw.getOutputStream();
			os.write(buff);
			sw.getInputStream().read(buff);
			sc.getOutputStream().write(buff);
			sw.close();
			sc.close();
			
		}catch (IOException ex) { }
		
	}
	
	
}