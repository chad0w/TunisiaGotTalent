/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import IService.ICondidatVideo;
import entity.CondidatVideo;


/**
 *
 * @author D hichem
 */
public class ServiceCondidatVideo implements ICondidatVideo<CondidatVideo>{
    private Connection con;
    private Statement ste;

    public ServiceCondidatVideo() {
       Connection con = DataSource.getInstance().getCnx();

    }
    
        
    @Override
    public void ajouterCondidatVideo(CondidatVideo c) throws SQLException
    {
    PreparedStatement pre=con.prepareStatement("INSERT INTO `condidatVideo` ( `titre`, `video`,`datePublication`, `categorie`, `idCompetition`) VALUES ( ?, ?, CURRENT_TIMESTAMP, ?, ?);");
    
    
    pre.setString(1, c.getTitre());
    pre.setString(2, c.getVideo());
    pre.setString(3, c.getCategorie());
    pre.setInt(4, c.getIdCompetition());
    // or pass competition in parametre
    
    pre.executeUpdate();
    }
            

    @Override
    public void supprimerCondidatVideo(int id) throws SQLException {
        try {
            
            String req = "delete from publication where idCondidatVideo=? ";
            PreparedStatement pre = con.prepareStatement(req);            
            pre.setInt(1, id);
            pre.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicePublication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public List<CondidatVideo> readAll() throws SQLException {
    List<CondidatVideo> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from CondidatVideo");
     while (rs.next()) {
        
            
               int idCondidatVideo=rs.getInt(1);
               String pseudo=rs.getString(2);
               String titre=rs.getString(3);
               String video=rs.getString(4);
               Timestamp date = rs.getTimestamp("datePublication");
               String categorie=rs.getString(6);
               int idCompetition=rs.getInt(7);
               int vote_count=rs.getInt(8);
               CondidatVideo p=new CondidatVideo(idCondidatVideo, pseudo, titre, video, date, categorie, idCompetition, vote_count);
     arr.add(p);
     }
    
    return arr;
    }
    
}
