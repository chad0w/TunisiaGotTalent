/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IService;


import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author House
 */
public interface IPublicationService<Publicatio> {
    void ajouterPublication(Publicatio p) throws SQLException;
    void supprimerPublication(int id) throws SQLException;
    boolean update(Publicatio p) throws SQLException;
    List<Publicatio> readAll() throws SQLException;
    
}

