/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entity.enumerations;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import entity.competition;
import entity.enumerations.categorie;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import entity.competition;
import java.io.IOException;
import java.sql.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import services.competitionService;
/**
 * FXML Controller class
 *
 * @author chad0w2
 */
public class AddcompetitionController implements Initializable {

    @FXML
    private AnchorPane Anchor1;
    @FXML
    private TextField tftitre;
    @FXML
    private Button bValider;
    @FXML
    private Button retour;
    @FXML
    private DatePicker date_debut;
    @FXML
    private DatePicker date_vote;
    @FXML
    private DatePicker date_fin;
    @FXML
    private ComboBox<String> cbcategorie;
 
//     private ComboBox<Enumerations.BodyType> bodyTypeBox;
    

    /**
     * Initializes the controller class.
     */
    
     String categories[] = 
                   {"other" , "dance", "sport", 
                           "music"           }; 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
  //  cbcategorie.getItems().setAll(categorie.values());  
cbcategorie.setItems( FXCollections.observableArrayList(categories));
        

        
    }    

    @FXML
    private void ajouter(ActionEvent event) {
        competition  cp= new competition();
        cp.setTitre(tftitre.getText());
   //     cp.getCategorie((cbcategorie.getValue()));
       String categorie = cbcategorie.getValue();
        cp.setCategorie(categorie);
        cp.setDate_debut(java.sql.Date.valueOf(date_debut.getValue()));
        cp.setDate_vote(java.sql.Date.valueOf(date_vote.getValue()));
        cp.setDate_resultat(java.sql.Date.valueOf(date_fin.getValue()));
   
    new competitionService().ajouterCompetition(cp);
    Alert alert = new Alert(AlertType.INFORMATION);
alert.setTitle("ajout done");
alert.setHeaderText(null);
alert.setContentText("competition ajouter !");
alert.showAndWait();
    }
    
    
    
    
    @FXML
     private void Retour(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(("mainmenu.fxml")));
        AnchorPane parentContent = fxmlLoader.load();
        Anchor1.getChildren().clear();
        Anchor1.getChildren().setAll(parentContent);
    }
    
}
