/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.CondidatVideo;
import entity.utilisateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DataSource;

/**
 *
 * @author chad0w2
 */
public class voteService {
    
    
    Connection con = DataSource.getInstance().getCnx();
     
     public void addvote(CondidatVideo c, utilisateur u) {
        try {
            String req = "INSERT INTO vote (voter_id, idCondidatVideo, id_competition, categorie) VALUES (?,?,?,?)";

            PreparedStatement pre = con.prepareStatement(req);
            System.out.println(u);
            System.out.println(c);
            pre.setInt(1, u.getId_Utilisateur());
           // pre.setInt(1, u.getId_Utilisateur()); MA3ADECH FAMA id_user ( RABI YEHDI ELLI KEN SBAB )
            pre.setInt(2, c.getIdCondidatVideo());
            pre.setInt(3, c.getIdCompetition());
            pre.setString(4, c.getCategorie());
            pre.executeUpdate();
            
             int count = c.getVote_count() + 1;
            String req2 = "update condidatvideo set vote_count=? where idCondidatVideo=? ";
            PreparedStatement pre2 = con.prepareStatement(req2);
           
            System.out.println("vote_count : "+ count);
            pre2.setInt(1, count);
            pre2.setInt(2, c.getIdCondidatVideo());
            pre2.executeUpdate();
            } catch (SQLException ex) {
           Logger.getLogger(voteService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" u can only vote once in the same competition !!");
        
            }
    }
    //btw u deleted the fk !!
     public void addvote2(CondidatVideo c, utilisateur u) { 
     }
    
}
