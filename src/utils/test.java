/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entity.competition;
import entity.CondidatVideo;
import entity.enumerations;
import entity.enumerations.categorie;
import entity.utilisateur;


import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import services.competitionService;
import services.voteService;

/**
 *
 * @author chad0w2
 */
public class test {
    public static void main(String[] args) {
      
        DataSource ds = DataSource.getInstance();
     Date d =Date.valueOf("2020-02-12");
     //   System.out.println(ds.hashCode());
     
         List <competition> list = new ArrayList<>();
        //first step cnx is OK 
        utilisateur admin = new utilisateur(1,"admin","prenom","admin1","super_user");
        CondidatVideo vidoe1= new CondidatVideo(1,"admin1","mytalent","music",1,101);
        competition cp = new competition("competition 3", "dance",d);
        competitionService cs = new competitionService();
        voteService vs = new voteService();
    
      
      List <CondidatVideo> condidatvideos= new ArrayList<>();
        
    //    cs.getListcompetition();
// cs.ajouterCompetition(cp);
list=(cs.getListcompetitionexpire());
   //   System.out.println(list);
  //     cs.affichierCompetition(1); // u still have prob with ps (?) 
    
     //u dont need delete for competition
     
 //  vs.addvote(vidoe1, admin);
   //to try thin again u must add another user , or delete the vote from the table
    }
    
}
