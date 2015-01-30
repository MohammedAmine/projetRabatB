
package persistence;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * classe ActionUtilisateurAvecArgentRetrait
 */
@Entity
@DiscriminatorValue("RTR")

public class ActionUtilisateurAvecArgentRetrait extends ActionUtilisateurAvecArgent implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * 
     */
    public ActionUtilisateurAvecArgentRetrait() {
    }

    /**
     * 
     * @param actionAvecArgentDepotCompteFROM
     * @param ActionUtilisateurAvecArgentMontant
     * @param actionUtilisateurType
     * @param actionUtilisateurProprietaireType
     * @param actionUtilisateurProprietaire 
     */
    public ActionUtilisateurAvecArgentRetrait(Compte actionAvecArgentDepotCompteFROM, float ActionUtilisateurAvecArgentMontant, String actionUtilisateurType, String actionUtilisateurProprietaireType, Utilisateur actionUtilisateurProprietaire) {
        super(ActionUtilisateurAvecArgentMontant, actionUtilisateurType, actionUtilisateurProprietaireType, actionUtilisateurProprietaire);
        this.actionAvecArgentDepotCompteFROM = actionAvecArgentDepotCompteFROM;
    }

    public ActionUtilisateurAvecArgentRetrait(Compte actionAvecArgentDepotCompteFROM) {
        this.actionAvecArgentDepotCompteFROM = actionAvecArgentDepotCompteFROM;
    }

    

    public ActionUtilisateurAvecArgentRetrait(Compte actionAvecArgentDepotCompteFROM, float ActionUtilisateurAvecArgentMontant, int actionUtilisateurID, String actionUtilisateurType, String actionUtilisateurProprietaireType, Utilisateur actionUtilisateurProprietaire, Compte actionUtilisateurCompte) {
        super(ActionUtilisateurAvecArgentMontant, actionUtilisateurID, actionUtilisateurType, actionUtilisateurProprietaireType, actionUtilisateurProprietaire, actionUtilisateurCompte);
        this.actionAvecArgentDepotCompteFROM = actionAvecArgentDepotCompteFROM;
    }

    public ActionUtilisateurAvecArgentRetrait(Compte actionAvecArgentDepotCompteFROM, String actionUtilisateurProprietaireType) {
        super(actionUtilisateurProprietaireType);
        this.actionAvecArgentDepotCompteFROM = actionAvecArgentDepotCompteFROM;
    }

    public ActionUtilisateurAvecArgentRetrait(Compte actionAvecArgentDepotCompteFROM, Utilisateur actionUtilisateurProprietaire) {
        super(actionUtilisateurProprietaire);
        this.actionAvecArgentDepotCompteFROM = actionAvecArgentDepotCompteFROM;
    }

    public ActionUtilisateurAvecArgentRetrait(Compte actionAvecArgentDepotCompteFROM, Compte actionUtilisateurCompte) {
        super(actionUtilisateurCompte);
        this.actionAvecArgentDepotCompteFROM = actionAvecArgentDepotCompteFROM;
    }
    
    
    /**
     * compte source pour le depot retrait
     */
    @OneToOne
    private Compte actionAvecArgentDepotCompteFROM;

    public Compte getActionAvecArgentDepotCompteFROM() {
        return actionAvecArgentDepotCompteFROM;
    }

    public void setActionAvecArgentDepotCompteFROM(Compte actionAvecArgentDepotCompteFROM) {
        this.actionAvecArgentDepotCompteFROM = actionAvecArgentDepotCompteFROM;
    }
    
    
}
