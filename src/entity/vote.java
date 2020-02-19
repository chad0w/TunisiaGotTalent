/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author chad0w2
 */
public class vote {
    int voter_id;
    int idCondidatVideo;
    int id_competition;
    String categorie;

    public int getVoter_id() {
        return voter_id;
    }

    public void setVoter_id(int voter_id) {
        this.voter_id = voter_id;
    }

    public int getidCondidatVideo() {
        return idCondidatVideo;
    }

    public void setidCondidatVideo(int idCondidatVideo) {
        this.idCondidatVideo = idCondidatVideo;
    }

    public int getId_competition() {
        return id_competition;
    }

    public void setId_competition(int id_competition) {
        this.id_competition = id_competition;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public vote() {
    }

    @Override
    public String toString() {
        return "vote{" + "voter_id=" + voter_id + ", idCondidatVideo=" + idCondidatVideo + ", id_competition=" + id_competition + ", categorie=" + categorie + '}';
    }
    
    
}
