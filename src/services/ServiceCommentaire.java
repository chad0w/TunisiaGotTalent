/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Entities.Commentaire;
import IService.ICommentaireService;
import java.sql.SQLException;
import java.util.List;
import java.sql.*;
import utils.DataSource;
import java.util.ArrayList;
import IService.IPublicationService;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author D hichem
 */
public class ServiceCommentaire implements ICommentaireService<Commentaire> {
    
    
    private Connection con;
    private Statement ste;

    public ServiceCommentaire() {
        Connection con = DataSource.getInstance().getCnx();

    }
    

    @Override
    public void ajouterCommentaire(Commentaire c) throws SQLException {
        PreparedStatement pre=con.prepareStatement("INSERT INTO `commentaire` ( `pseudo`, `contenu`,`dateCommentaire` ) VALUES ( ?, ?, CURRENT_TIMESTAMP );");
    
    
    pre.setString(1, c.getPseudo());
    pre.setString(2, c.getContenu());

    pre.executeUpdate();
    }

    @Override
    public void supprimerCommentaire(int id) throws SQLException {
       try {
            
            String req = "delete from commentaire where idCommentaire=? ";
            PreparedStatement pre = con.prepareStatement(req);           
            pre.setInt(1, id);
            pre.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicePublication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifierCommentaire(Commentaire t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Commentaire> readAll() throws SQLException {
        List<Commentaire> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from commentaire");
     while (rs.next()) {
        
    
               String pseudo=rs.getString(2);
               String contenu=rs.getString(3);
               Timestamp date = rs.getTimestamp("datecommentaire");

               Commentaire c=new Commentaire(pseudo, contenu, date);
     arr.add(c);
     }
    return arr;
    
    }
    
}
