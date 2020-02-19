/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entity.CondidatVideo;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import services.voteService;
import entity.utilisateur;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author chad0w2
 */
public class Cometition_card_viewController implements Initializable {

    @FXML
    private ImageView photo;
    @FXML
    private Label pseudo;
    @FXML
    private Label titre;
    @FXML
    private Label vote;
    @FXML
    private Label categorie;
    
    
    private CondidatVideo card;
    private  utilisateur u;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void fill(){
        // photo.setImage(new Image(card.getPhotoUrl()));
        
       pseudo.setText(card.getPseudo());
        vote.setText(Integer.toString(card.getVote_count()));
        categorie.setText(card.getCategorie());
        
    }
    public  CondidatVideo getCard(){
        return card;
    }
   
    public void setCard(CondidatVideo card ){
        this.card=card;
    }
    public  void voter(MouseEvent event){
       Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("voter");
        alert.setHeaderText("voter " );
        alert.setContentText("Vous voulez vraiment voter pour cette video ?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            new voteService().addvote(card, u);
            fill();
         //   evenements = new ServiceEvenement().getSimpleEvenements();
          //  actuliserTable();
        }
        if (result.get() == ButtonType.CANCEL) {
            alert.close();
        }  
    }
}
