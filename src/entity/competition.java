/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;
// try both of them , i think that u should use sql.date with timestamp only
//import java.util.Date;

/**
 *
 * @author chad0w2
 */
public class competition {
    int id ;
    String titre;
    String categorie;
    Date date_debut;
    // to do !! u can make datevote/result manual or auto ( after 3 week , 1 week )
    
    Date date_vote;
    Date date_resultat;

    public competition() {
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_vote() {
        return date_vote;
    }

    public void setDate_vote(Date date_vote) {
        this.date_vote = date_vote;
    }

    public Date getDate_resultat() {
        return date_resultat;
    }

    public void setDate_resultat(Date date_resultat) {
        this.date_resultat = date_resultat;
    }

    public competition(String titre, String categorie, Date date_debut) {
        this.titre = titre;
        this.categorie = categorie;
        this.date_debut = date_debut;
    }
    public competition(String titre, String categorie, Date date_debut,int id) {
        this.titre = titre;
        this.categorie = categorie;
        this.date_debut = date_debut;
        this.id=id;
    
    }

    @Override
    public String toString() {
        return "competition{" + "id=" + id + ", titre=" + titre + ", categorie=" + categorie + ", date_debut=" + date_debut + ", date_vote=" + date_vote + ", date_resultat=" + date_resultat + '}';
    }
    
}
