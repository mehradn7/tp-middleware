import java.io.*;

public class SFicheImpl implements SFiche {
	private String nom;
	private String email;
	
	public SFicheImpl(String name, String mail){
		this.nom = name;
		this.email = mail;
	 }

	public String getNom (){
		return this.nom;
	}
	public String getEmail (){
		return this.email;
	}
}
