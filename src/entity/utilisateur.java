/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Timestamp;

/**
 *
 * @author chad0w2
 */
public class utilisateur {
    
    int id_Utilisateur;
    String nom;
    String prenom;
    String psudo;
    String image;
    Timestamp date_naiss;
    String type_compte;
    
     String mail;
     String mdp;
         int nb_abonnes;
         int nb_abonnements;
         int nb_pub;

    public utilisateur() {
    }

    public int getId_Utilisateur() {
        return id_Utilisateur;
    }

    public void setId_Utilisateur(int id_Utilisateur) {
        this.id_Utilisateur = id_Utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPsudo() {
        return psudo;
    }

    public void setPsudo(String psudo) {
        this.psudo = psudo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Timestamp getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(Timestamp date_naiss) {
        this.date_naiss = date_naiss;
    }

    public String getType_compte() {
        return type_compte;
    }

    public void setType_compte(String type_compte) {
        this.type_compte = type_compte;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getNb_abonnes() {
        return nb_abonnes;
    }

    public void setNb_abonnes(int nb_abonnes) {
        this.nb_abonnes = nb_abonnes;
    }

    public int getNb_abonnements() {
        return nb_abonnements;
    }

    public void setNb_abonnements(int nb_abonnements) {
        this.nb_abonnements = nb_abonnements;
    }

    public int getNb_pub() {
        return nb_pub;
    }

    public void setNb_pub(int nb_pub) {
        this.nb_pub = nb_pub;
    }

    @Override
    public String toString() {
        return "utilisateur{" + "id_Utilisateur=" + id_Utilisateur + ", nom=" + nom + ", prenom=" + prenom + ", psudo=" + psudo + ", image=" + image + ", date_naiss=" + date_naiss + ", type_compte=" + type_compte + ", mail=" + mail + ", mdp=" + mdp + ", nb_abonnes=" + nb_abonnes + ", nb_abonnements=" + nb_abonnements + ", nb_pub=" + nb_pub + '}';
    }

    public utilisateur(int id_Utilisateur, String nom, String prenom, String psudo, String type_compte) {
        this.id_Utilisateur = id_Utilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.psudo = psudo;
        this.type_compte = type_compte;
    }
    
}
