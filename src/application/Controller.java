package application;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Entite.Image;
import Entite.Users;
import Service.Modele;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller implements Initializable{
	private Modele modele;
	
	@FXML
	private ListView listeContainer;
	
	@FXML
	private ImageView imageContainer;
	
	@FXML
	private Label nomLabel;
	
	@FXML 
	private Label loginLabel;
	
	@FXML
	private Label noteLabel;
	
	@FXML
	private TextField nomInput;
	
	@FXML 
	private TextField loginInput;
	
	@FXML
	private TextField noteInput;
	
	@FXML 
	private Button loginBtn;
	
	@FXML 
	private Button noteBtn; 
	
	private void init() {
		this.modele = new Modele();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		this.init();
		for(Image image : modele.getImageList())
        {
            this.listeContainer.getItems().add(image.getNom());
        }
	}
	public void handle(MouseEvent event) {
		for(Image image : modele.getImageList())
        {
            if(image.getNom().equals(this.listeContainer.getSelectionModel().getSelectedItem())) {
            	javafx.scene.image.Image imageToSet = new javafx.scene.image.Image(image.getUrl());
                this.imageContainer.setImage(imageToSet);
            }
        }
    }
	
	public void userLogin() {
		String nomEntre = nomInput.getText();
		String pwdEntre = loginInput.getText();
		for(Users userLogin : modele.getUsersList())
        {
            if(userLogin.getNom().equals(nomEntre) && userLogin.getLogin().equals(pwdEntre)) {
            	System.out.println("Ok");
            }
            else {
            	System.out.println("mauvaise connection");
            }
        }
    }
}
