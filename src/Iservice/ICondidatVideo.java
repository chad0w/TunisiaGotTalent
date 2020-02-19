/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IService;

import entity.CondidatVideo;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author D hichem
 */
public interface ICondidatVideo<CondidatVideo> {
    void ajouterCondidatVideo(CondidatVideo c) throws SQLException;
    void supprimerCondidatVideo(int id) throws SQLException;
    
    List<CondidatVideo> readAll() throws SQLException;
    
}
