
package persistence;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * classe ActionUtilisateurAvecArgentTransfert
 */
@Entity
@DiscriminatorValue("TRS")

public class ActionUtilisateurAvecArgentTransfert extends ActionUtilisateurAvecArgent implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * 
     */  
    public ActionUtilisateurAvecArgentTransfert() {
    }

    /**
     *
     * @param actionAvecArgentTransfertCompteFROM
     * @param actionAvecArgentTransfertCompteTO
     * @param ActionUtilisateurAvecArgentMontant
     * @param actionUtilisateurType
     * @param actionUtilisateurProprietaireType
     * @param actionUtilisateurProprietaire
     */
    public ActionUtilisateurAvecArgentTransfert(Compte actionAvecArgentTransfertCompteFROM, Compte actionAvecArgentTransfertCompteTO, float ActionUtilisateurAvecArgentMontant, String actionUtilisateurType, String actionUtilisateurProprietaireType, Utilisateur actionUtilisateurProprietaire) {
        super(ActionUtilisateurAvecArgentMontant,  actionUtilisateurType, actionUtilisateurProprietaireType, actionUtilisateurProprietaire);
        this.actionAvecArgentTransfertCompteFROM = actionAvecArgentTransfertCompteFROM;
        this.actionAvecArgentTransfertCompteTO = actionAvecArgentTransfertCompteTO;
    }
    
    /**
     * 
     * @param actionAvecArgentTransfertCompteFROM
     */
    public ActionUtilisateurAvecArgentTransfert(Compte actionAvecArgentTransfertCompteFROM, Compte actionAvecArgentTransfertCompteTO) {
        this.actionAvecArgentTransfertCompteFROM = actionAvecArgentTransfertCompteFROM;
        this.actionAvecArgentTransfertCompteTO = actionAvecArgentTransfertCompteTO;
    }

    public ActionUtilisateurAvecArgentTransfert(String actionUtilisateurProprietaireType) {
        super(actionUtilisateurProprietaireType);
    }

    public ActionUtilisateurAvecArgentTransfert(Utilisateur actionUtilisateurProprietaire) {
        super(actionUtilisateurProprietaire);
    }

    public ActionUtilisateurAvecArgentTransfert(Compte actionUtilisateurCompte) {
        super(actionUtilisateurCompte);
    }

    
    
    
    /**
     * compte source pour le depot retrait du transfert 
     */
    @OneToOne
    private Compte actionAvecArgentTransfertCompteFROM;
    
    /**
     * compte cible pour le depot d'argent du transfert
     */
    @OneToOne
    private Compte actionAvecArgentTransfertCompteTO;

    public Compte getActionAvecArgentTransfertCompteFROM() {
        return actionAvecArgentTransfertCompteFROM;
    }

    public void setActionAvecArgentTransfertCompteFROM(Compte actionAvecArgentTransfertCompteFROM) {
        this.actionAvecArgentTransfertCompteFROM = actionAvecArgentTransfertCompteFROM;
    }

    public Compte getActionAvecArgentTransfertCompteTO() {
        return actionAvecArgentTransfertCompteTO;
    }

    public void setActionAvecArgentTransfertCompteTO(Compte actionAvecArgentTransfertCompteTO) {
        this.actionAvecArgentTransfertCompteTO = actionAvecArgentTransfertCompteTO;
    }
    
    
    
    
}
