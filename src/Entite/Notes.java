package Entite;

public class Notes {
	private Image image;
	private Users user;
	private int note;
	
	// Constructeur
		public Notes(Image image, Users user, int note) {
			this.image = image;
			this.user = user;
			this.note = note;
		}
		
	// getter and setter
	public Image getImage() {
		return image;
	}
	public void setImage(int id_image) {
		this.image = image;
	}
	public Users getUser() {
		return user;
	}
	public void setId_user(int id_user) {
		this.user = user;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}

}
