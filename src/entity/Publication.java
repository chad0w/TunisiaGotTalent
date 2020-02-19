/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
import java.sql.Timestamp;

/**
 *
 * @author House
 */
public class Publication {
    private int idPublication;
    private String pseudo;
    private String titre;
    private String video;
    private Timestamp datePublication;
    private String categorie;

    
    public Publication(int idPublication, String pseudo, String titre, String video, Timestamp datePublication, String categorie) {
        this.idPublication = idPublication;
        this.pseudo = pseudo;
        this.titre = titre;
        this.video = video;
        this.datePublication = datePublication;
        this.categorie = categorie;
    }
    

    public Publication(String pseudo, String titre, String video, Timestamp datePublication, String categorie) {
        this.pseudo = pseudo;
        this.titre = titre;
        this.video = video;
        this.datePublication = datePublication;
        this.categorie = categorie;
    }

    public Publication(String titre, String video, String categorie) {
        this.titre = titre;
        this.video = video;
        this.categorie = categorie;
    }
    

    public int getIdPublication() {
        return idPublication;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getTitre() {
        return titre;
    }
    
    public String getVideo() {
        return video;
    }

    public Timestamp getDatePublication() {
        return datePublication;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setIdPublication(int idPublication) {
        this.idPublication = idPublication;
    }

    public void setPseudo(String Pseudo) {
        this.pseudo = Pseudo;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    public void setVideo(String video) {
        this.video = video;
    }

    public void setDatePublication(Timestamp datePublication) {
        this.datePublication = datePublication;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Publication{" + "idPublication=" + idPublication + ", pseudo=" + pseudo + ", titre=" + titre + ", video=" + video + ", datePublication=" + datePublication + ", categorie=" + categorie + '}' + "\n";
    }

   
    
    
    

    
    
}
