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

/**
 * classe ActionUtilisateurAvecArgent
 */
@Entity
@DiscriminatorValue("AAR")

public abstract class ActionUtilisateurAvecArgent extends ActionUtilisateur implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public ActionUtilisateurAvecArgent() {
    }
    
    /**
     * 
     * @param ActionUtilisateurAvecArgentMontant
     * @param actionUtilisateurDate
     * @param actionUtilisateurTime
     * @param actionUtilisateurType
     * @param actionUtilisateurProprietaireType
     * @param actionUtilisateurProprietaire
     */
    public ActionUtilisateurAvecArgent(float ActionUtilisateurAvecArgentMontant, Date actionUtilisateurDate, Date actionUtilisateurTime, String actionUtilisateurType, String actionUtilisateurProprietaireType, Utilisateur actionUtilisateurProprietaire) {
       
        super(actionUtilisateurDate, actionUtilisateurTime, actionUtilisateurType, actionUtilisateurProprietaireType, actionUtilisateurProprietaire);
        
        this.ActionUtilisateurAvecArgentMontant = ActionUtilisateurAvecArgentMontant;
    }

    /**
     * montant
     */
    private float ActionUtilisateurAvecArgentMontant;
    

}
