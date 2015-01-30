
package persistence;

import java.io.Serializable;
import java.util.Date;
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

    public ActionUtilisateurAvecArgentTransfert(Compte actionAvecArgentTransfertCompteFROM, Compte actionAvecArgentTransfertCompteTO, float ActionUtilisateurAvecArgentMontant, Date actionUtilisateurDate, Date actionUtilisateurTime, String actionUtilisateurType, String actionUtilisateurProprietaireType, Utilisateur actionUtilisateurProprietaire) {
        super(ActionUtilisateurAvecArgentMontant, actionUtilisateurDate, actionUtilisateurTime, actionUtilisateurType, actionUtilisateurProprietaireType, actionUtilisateurProprietaire);
        this.actionAvecArgentTransfertCompteFROM = actionAvecArgentTransfertCompteFROM;
        this.actionAvecArgentTransfertCompteTO = actionAvecArgentTransfertCompteTO;
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
    
    
    
}
