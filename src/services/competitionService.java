/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.competition;
import java.sql.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DataSource;


/**
 *
 * @author chad0w2
 */
public class competitionService {
     Connection c = DataSource.getInstance().getCnx();
  
     
     
           java.util.Date uDate = new java.util.Date();
          DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
   
     public void ajouterCompetition(competition cpt){
          // r is cpt !!
         try {
             Statement st = c.createStatement();
             String req = "INSERT INTO competition (date_debut,categorie,titre) VALUES ( ?,?,?)";
             
             PreparedStatement ps = c.prepareStatement(req);
              ps.setDate(1, (Date) cpt.getDate_debut());
              ps.setString(2,cpt.getCategorie());
              ps.setString(3,cpt.getTitre());
            
              ps.executeUpdate();
              System.out.println("competition added with suc !");
              
         } catch (SQLException ex) {
             Logger.getLogger(competitionService.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
     }
    public competition affichierCompetition(int id){
         competition r=new competition();
         try {
            
            
             Statement st = c.createStatement();
             String req = "SELECT * from competition where id=?";
             PreparedStatement ps = c.prepareStatement(req);
           ps.setInt(1, id);
             ResultSet rs = st.executeQuery(req);
             while (rs.next()) {
                 r.setId(rs.getInt("id"));
                 r.setDate_debut(rs.getDate("date_debut"));
                 r.setDate_vote(rs.getDate("date_vote"));
                 r.setDate_resultat(rs.getDate("date_resultat"));
                 r.setCategorie(rs.getString("categorie"));
                 r.setTitre(rs.getString("titre"));
                 System.out.println(r.toString());
             }
             
         } catch (SQLException ex) {
             Logger.getLogger(competitionService.class.getName()).log(Level.SEVERE, null, ex);
         }
             
        return r;  
}
    
    
public List<competition> getListcompetition(){
    List <competition> list = new ArrayList<>();
    String request = "select * from competition";
        try {
            Statement st= c.createStatement();
            ResultSet rs= st.executeQuery(request);
            
             while(rs.next()){
            competition r = new competition();
            r.setId(rs.getInt("id"));
                 r.setDate_debut(rs.getDate("date_debut"));
                 r.setDate_vote(rs.getDate("date_vote"));
                 r.setDate_resultat(rs.getDate("date_resultat"));
                 r.setCategorie(rs.getString("categorie"));
                 r.setTitre(rs.getString("titre"));
                 System.out.println(r.toString());
            list.add(r);
        }
            
            
        } catch (SQLException ex) {
         Logger.getLogger(competitionService.class.getName()).log(Level.SEVERE, null, ex);
          }
   //  System.out.println(list.toString());   
    return list;
   
}

    public List<competition> getListcompetitionOncore(){
    List <competition> list = new ArrayList<>();
    // etat 0 or 1
    // u must redo this with prepared statement for GUI ..
    String request = "select * from competition where etat=0";
        try {
            Statement st= c.createStatement();
            ResultSet rs= st.executeQuery(request);
            
             while(rs.next()){
            competition r = new competition();
            r.setId(rs.getInt("id"));
                 r.setDate_debut(rs.getDate("date_debut"));
                 r.setDate_vote(rs.getDate("date_vote"));
                 r.setDate_resultat(rs.getDate("date_resultat"));
                 r.setCategorie(rs.getString("categorie"));
                 r.setTitre(rs.getString("titre"));
                 System.out.println(r.toString());
            list.add(r);
        }
            
            
        } catch (SQLException ex) {
         Logger.getLogger(competitionService.class.getName()).log(Level.SEVERE, null, ex);
          }
   //  System.out.println(list.toString());   
    return list;
   
}

    //-----------------------------------------------------------------
    //etat 0 and now > date_fin 
     public List<competition> getListcompetitionexpire(){
         
          
     
         
    List <competition> list = new ArrayList<>();
    // etat 0 or 1
    // u must redo this with prepared statement for GUI ..
    String request = "select * from competition where etat=0";
        try {
            Statement st= c.createStatement();
            ResultSet rs= st.executeQuery(request);
            
             while(rs.next()){
                 
            competition r = new competition();
            
             
            
            r.setId(rs.getInt("id"));
                 r.setDate_debut(rs.getDate("date_debut"));
                 r.setDate_vote(rs.getDate("date_vote"));
                 r.setDate_resultat(rs.getDate("date_resultat"));
                 r.setCategorie(rs.getString("categorie"));
                 r.setTitre(rs.getString("titre"));
              
                 System.out.println(r.toString());
                //   Date d =Date.valueOf(r.getDate_resultat());
         
    
      //  System.out.println(d.before(uDate));  
             if (r.getDate_resultat().before(uDate)){
                 break;
             }
                 
            list.add(r);
        }
            
            
        } catch (SQLException ex) {
         Logger.getLogger(competitionService.class.getName()).log(Level.SEVERE, null, ex);
          }
   //  System.out.println(list.toString());   
    return list;
   
}

    }
     
     

