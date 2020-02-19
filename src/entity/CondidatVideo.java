/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Timestamp;

/**
 *
 * @author D hichem
 */
public class CondidatVideo {
    
    private int idCondidatVideo;
    private String pseudo;
    private String titre;
    private String video;
    private Timestamp datePublication;
    private String categorie;
    private int idCompetition;
    private int vote_count;

    

   

   
    

    public int getIdCondidatVideo() {
        return idCondidatVideo;
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

    public int getIdCompetition() {
        return idCompetition;
    }

    public int getVote_count() {
        return vote_count;
    }
    
    

    public void setIdPublication(int idPublication) {
        this.idCondidatVideo = idPublication;
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

    public void setIdCondidatVideo(int idCondidatVideo) {
        this.idCondidatVideo = idCondidatVideo;
    }

    public void setIdCompetition(int idCompetition) {
        this.idCompetition = idCompetition;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public CondidatVideo() {
    }

  
    public CondidatVideo(int idCondidatVideo, String pseudo, String titre, String video, Timestamp datePublication, String categorie, int idCompetition, int vote_count) {
        this.idCondidatVideo = idCondidatVideo;
        this.pseudo = pseudo;
        this.titre = titre;
        this.video = video;
        this.datePublication = datePublication;
        this.categorie = categorie;
        this.idCompetition = idCompetition;
        this.vote_count = vote_count;
    }

    public CondidatVideo(int idCondidatVideo, String pseudo, String titre, String categorie, int idCompetition, int vote_count) {
        this.idCondidatVideo = idCondidatVideo;
        this.pseudo = pseudo;
        this.titre = titre;
        this.categorie = categorie;
        this.idCompetition = idCompetition;
        this.vote_count = vote_count;
    }
    
    

    @Override
    public String toString() {
        return "CondidatVideo{" + "idPublication=" + idCondidatVideo + ", pseudo=" + pseudo + ", titre=" + titre + ", video=" 
                + video + ", datePublication=" + datePublication + ", categorie=" + categorie + ", idCompetition=" + idCompetition + 
                ", vote_count=" + vote_count + '}' + "\n";
    }
    
}
