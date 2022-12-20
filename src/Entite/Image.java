package Entite;

public class Image {
	private String nom;
	private String url;
	
	// Constructeur
	public Image(String nom, String url) {
		this.nom = nom;
		this.url = url;
	}
	
	//getter and setter 
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
