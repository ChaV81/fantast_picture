package Service;

import java.util.Arrays;
import java.util.List;

import Entite.Image;
import Entite.Notes;
import Entite.Users;

public class Modele  {
	Image chat = new Image("Gros chat", "C:\\Users\\Eleve\\Desktop\\workspace_JAVA\\fantast_picture\\src\\assets\\menkoun.jpg");
	Image parapente = new Image("Parapente", "C:\\Users\\Eleve\\Desktop\\workspace_JAVA\\fantast_picture\\src\\assets\\parapente.jpg");
	Image montagne = new Image("Face nord des grandes jorasse", "C:\\Users\\Eleve\\Desktop\\workspace_JAVA\\fantast_picture\\src\\assets\\jorasse.jpg");
	
	Users bob = new Users("Bob", "Bob123");
	Users kevin = new Users("Kevin", "Kevin123");
	
	Notes bNote1 = new Notes(chat, bob, 12);
	Notes bNote2 = new Notes(parapente, bob, 13);
	Notes bNote3 = new Notes(montagne, bob, 14);
	
	Notes kNote1 = new Notes(chat, kevin, 15);
	Notes kNote2 = new Notes(parapente, kevin, 16);
	Notes kNote3 = new Notes(montagne, kevin, 11);
	
	private List<Image> imageList = Arrays.asList(chat,parapente,montagne);
	
	public List<Image> getImageList() {
        return imageList;
    }
	
    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }
    
    private List<Users> usersList = Arrays.asList(bob,kevin);
    
    public List<Users> getUsersList() {
        return usersList;
    }
	
    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }
    
}
