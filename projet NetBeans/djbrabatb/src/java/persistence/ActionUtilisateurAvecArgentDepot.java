/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author mohammedamine
 */
@Entity
@DiscriminatorValue("DPT")

public class ActionUtilisateurAvecArgentDepot extends ActionUtilisateurAvecArgent implements Serializable {

     private static final long serialVersionUID = 1L;
     
     /**
      * 
      */
    public ActionUtilisateurAvecArgentDepot() {
    }

    /**
     * 
     * @param actionAvecArgentDepotCompteTO
     * @param ActionUtilisateurAvecArgentMontant
     * @param actionUtilisateurDate
     * @param actionUtilisateurTime
     * @param actionUtilisateurType
     * @param actionUtilisateurProprietaireType
     * @param actionUtilisateurProprietaire 
     */
    public ActionUtilisateurAvecArgentDepot(Compte actionAvecArgentDepotCompteTO, float ActionUtilisateurAvecArgentMontant, Date actionUtilisateurDate, Date actionUtilisateurTime, String actionUtilisateurType, String actionUtilisateurProprietaireType, Utilisateur actionUtilisateurProprietaire) {
        super(ActionUtilisateurAvecArgentMontant, actionUtilisateurDate, actionUtilisateurTime, actionUtilisateurType, actionUtilisateurProprietaireType, actionUtilisateurProprietaire);
        this.actionAvecArgentDepotCompteTO = actionAvecArgentDepotCompteTO;
    }
    
    
   
    
    /**
     * compte cible pour le depot d'argent
     */
    @OneToOne
    private Compte actionAvecArgentDepotCompteTO;
}