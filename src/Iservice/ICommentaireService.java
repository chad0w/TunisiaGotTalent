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
 * @author D hichem
 */
public interface ICommentaireService<Commentaire> {
    void ajouterCommentaire(Commentaire c) throws SQLException;
    void supprimerCommentaire(int id) throws SQLException;
    void modifierCommentaire(Commentaire c) throws SQLException;
    List<Commentaire> readAll() throws SQLException;
    
}
