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
     * @param actionUtilisateurType
     * @param actionUtilisateurProprietaireType
     * @param actionUtilisateurProprietaire
     */
    public ActionUtilisateurAvecArgent(float ActionUtilisateurAvecArgentMontant, String actionUtilisateurType, String actionUtilisateurProprietaireType, Utilisateur actionUtilisateurProprietaire) {
       
        super( actionUtilisateurType, actionUtilisateurProprietaireType, actionUtilisateurProprietaire);
        
        this.ActionUtilisateurAvecArgentMontant = ActionUtilisateurAvecArgentMontant;
    }

    /**
     * 
     * @param ActionUtilisateurAvecArgentMontant
     * @param actionUtilisateurID
     * @param actionUtilisateurType
     * @param actionUtilisateurProprietaireType
     * @param actionUtilisateurProprietaire
     * @param actionUtilisateurCompte
     */
    public ActionUtilisateurAvecArgent(float ActionUtilisateurAvecArgentMontant, int actionUtilisateurID, String actionUtilisateurType, String actionUtilisateurProprietaireType, Utilisateur actionUtilisateurProprietaire, Compte actionUtilisateurCompte) {
        super(actionUtilisateurID, actionUtilisateurType, actionUtilisateurProprietaireType, actionUtilisateurProprietaire, actionUtilisateurCompte);
        this.ActionUtilisateurAvecArgentMontant = ActionUtilisateurAvecArgentMontant;
    }

    public ActionUtilisateurAvecArgent(String actionUtilisateurProprietaireType) {
        super(actionUtilisateurProprietaireType);
    }

    public ActionUtilisateurAvecArgent(Utilisateur actionUtilisateurProprietaire) {
        super(actionUtilisateurProprietaire);
    }

    public ActionUtilisateurAvecArgent(Compte actionUtilisateurCompte) {
        super(actionUtilisateurCompte);
    }
    
    /**
     * montant
     */
    private float ActionUtilisateurAvecArgentMontant;

    /**
     * 
     * @return 
     */
    public float getActionUtilisateurAvecArgentMontant() {
        return ActionUtilisateurAvecArgentMontant;
    }

    /**
     * 
     * @param ActionUtilisateurAvecArgentMontant 
     */
    public void setActionUtilisateurAvecArgentMontant(float ActionUtilisateurAvecArgentMontant) {
        this.ActionUtilisateurAvecArgentMontant = ActionUtilisateurAvecArgentMontant;
    }
    
    

}
