
package persistence;

import java.io.Serializable;
import java.util.Date;
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
     * @param actionUtilisateurDate
     * @param actionUtilisateurTime
     * @param actionUtilisateurType
     * @param actionUtilisateurProprietaireType
     * @param actionUtilisateurProprietaire 
     */
    public ActionUtilisateurAvecArgentRetrait(Compte actionAvecArgentDepotCompteFROM, float ActionUtilisateurAvecArgentMontant, Date actionUtilisateurDate, Date actionUtilisateurTime, String actionUtilisateurType, String actionUtilisateurProprietaireType, Utilisateur actionUtilisateurProprietaire) {
        super(ActionUtilisateurAvecArgentMontant, actionUtilisateurDate, actionUtilisateurTime, actionUtilisateurType, actionUtilisateurProprietaireType, actionUtilisateurProprietaire);
        this.actionAvecArgentDepotCompteFROM = actionAvecArgentDepotCompteFROM;
    }
    
    
    /**
     * compte source pour le depot retrait
     */
    @OneToOne
    private Compte actionAvecArgentDepotCompteFROM;
}
