/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import entity.CondidatVideo;
import entity.competition;
import entity.resultat;
import entity.utilisateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DataSource;

/**
 *
 * @author chad0w2
 */
public class resultatservice {
     Connection cn = DataSource.getInstance().getCnx();
    
   
    
    // add resultat ( etat 0 ,now >  date_fin ) -> (etat 1 , add in result )
    // u must add search by etat in competitionService !!
  
     
     
    //view resultat
    
    public List<resultat> getListResultat() {
        List<resultat> list = new ArrayList<>();
        String request = "select * from resultat";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(request);

            while (rs.next()) {
                resultat r = new resultat();
                r.setId_competition(rs.getInt(1));
                r.setPsudo(rs.getString(2));
                r.setId_condidatvideo(rs.getInt(3));
                r.setCategorie(rs.getString(4));
                r.setVotecount(rs.getInt(5));
                list.add(r);
            }

        } catch (SQLException ex) {
            Logger.getLogger(resultatservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(list.toString());
        return list;

    }
    // u need another req to get the video with highest vote in the competition or ...
    
       public void addresultat( competition cp) {
        try {
            //string req1="select"
            String req = "INSERT INTO resultat (id_cometition, psudo, id_dondidatvideo, categorie,vote_count) VALUES (?,?,?,?,?)";

            PreparedStatement pre = cn.prepareStatement(req);
            System.out.println(cp);
         //   System.out.println(c);
      //      pre.setInt(1, u.getId_Utilisateur());
           // pre.setInt(1, u.getId_Utilisateur()); MA3ADECH FAMA id_user ( RABI YEHDI ELLI KEN SBAB )
//            pre.setInt(2, c.getIdCondidatVideo());
//            pre.setInt(3, c.getIdCompetition());
//            pre.setString(4, c.getCategorie());
            pre.executeUpdate();
            
           
            } catch (SQLException ex) {
           Logger.getLogger(voteService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" u can only vote once in the same competition !!");
        
            }
    }
  

    
    
}
