/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Entities.Publication;
import java.sql.SQLException;
import java.util.List;
import java.sql.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import IService.IPublicationService;
import utils.DataSource;


/**
 *
 * @author House
 */
public class ServicePublication implements IPublicationService<Publication> {

    private Connection con;
    private Statement ste;

    public ServicePublication() {
         Connection con = DataSource.getInstance().getCnx();

    }

    
    public void ajouter(Publication t) throws SQLException {
        ste = con.createStatement();
        String requeteInsert = "INSERT INTO `publication` (`id`, `nom`, `prenom`, `age`) VALUES (NULL, '" + t.getIdPublication()+ "', '" + t.getPseudo()+ "', '" + t.getTitre()+ "', "
                + "'" + t.getVideo()+ "', '" + t.getDatePublication()+ "', '" + t.getCategorie()+ "');";
        ste.executeUpdate(requeteInsert);
    }
    
        
    @Override
    public void ajouterPublication(Publication p) throws SQLException
    {
    PreparedStatement pre=con.prepareStatement("INSERT INTO `publication` ( `titre`, `video`,`datePublication`, `categorie`) VALUES ( ?, ?, CURRENT_TIMESTAMP, ?);");
    
    
    pre.setString(1, p.getTitre());
    pre.setString(2, p.getVideo());
    pre.setString(3, p.getCategorie());
    pre.executeUpdate();
    }
            

    @Override
    public void supprimerPublication(int id) throws SQLException {
        try {
            
            String req = "delete from publication where idPublication=? ";
            PreparedStatement pre = con.prepareStatement(req);            
            pre.setInt(1, id);
            pre.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicePublication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean update(Publication t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Publication> readAll() throws SQLException {
    List<Publication> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from publication");
     while (rs.next()) {
        
            
               int idPublication=rs.getInt(1);
               String pseudo=rs.getString(2);
               String titre=rs.getString(3);
               String video=rs.getString(4);
               Timestamp date = rs.getTimestamp("datePublication");
               String categorie=rs.getString(6);
               Publication p=new Publication(idPublication, pseudo, titre, video, date, categorie);
     arr.add(p);
     }
    return arr;
    }
}
