package Entite;

public class Users {
	private String nom;
	private String login;
	
	// Constructeur
		public Users(String nom, String login) {
			this.nom = nom;
			this.login = login;
		}
	
	// getter and setter
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	
}
