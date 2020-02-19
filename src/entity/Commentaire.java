/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Timestamp;

/**
 *
 * @author D hichem
 */
public class Commentaire {
    private int idCommentaire;
    private String pseudo;
    private String contenu;
    private Timestamp dateCommentaire;

    
    public Commentaire(String pseudo, String contenu, Timestamp dateCommentaire) {
        this.pseudo = pseudo;
        this.contenu = contenu;
        this.dateCommentaire = dateCommentaire;
    }

    public Commentaire(String pseudo, String contenu) {
        this.pseudo = pseudo;
        this.contenu = contenu;
    }

    public int getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(int idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Timestamp getDateCommentaire() {
        return dateCommentaire;
    }

    public void setDateCommentaire(Timestamp dateCommentaire) {
        this.dateCommentaire = dateCommentaire;
    }

    @Override
    public String toString() {
        return "Commentaire{" + "pseudo=" + pseudo + ", contenu=" + contenu + ", dateCommentaire=" + dateCommentaire + '}' + "\n";
    }
    
    
    
}
