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
public class resultat {
    int id_competition;
    String psudo;
    int id_condidatvideo;
    String categorie;
    int votecount;

    public resultat(int id_competition, String psudo, int id_condidatvideo, String categorie, int votecount) {
        this.id_competition = id_competition;
        this.psudo = psudo;
        this.id_condidatvideo = id_condidatvideo;
        this.categorie = categorie;
        this.votecount = votecount;
    }

    public resultat() {
    }

    public int getId_competition() {
        return id_competition;
    }

    public void setId_competition(int id_competition) {
        this.id_competition = id_competition;
    }

    public String getPsudo() {
        return psudo;
    }

    public void setPsudo(String psudo) {
        this.psudo = psudo;
    }

    public int getId_condidatvideo() {
        return id_condidatvideo;
    }

    public void setId_condidatvideo(int id_condidatvideo) {
        this.id_condidatvideo = id_condidatvideo;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getVotecount() {
        return votecount;
    }

    public void setVotecount(int votecount) {
        this.votecount = votecount;
    }

    @Override
    public String toString() {
        return "resultat{" + "id_competition=" + id_competition + ", psudo=" + psudo + ", id_condidatvideo=" + id_condidatvideo + ", categorie=" + categorie + ", votecount=" + votecount + '}'+"/n";
    }
    
}
