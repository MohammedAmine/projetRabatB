
package persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * classe ActionUtilisateurSansArgent
 */
@Entity
@DiscriminatorValue("SAR")

@NamedQueries({
    @NamedQuery(name = "ActionUtilisateurSansArgent.findAll", query = "SELECT c FROM ActionUtilisateurSansArgent c"),
    @NamedQuery(name = "ActionUtilisateurSansArgent.findByActionUtilisateurSansArgentID", query = "SELECT c FROM ActionUtilisateurSansArgent c WHERE c.actionUtilisateurID = :actionUtilisateurSansArgentID"),
    @NamedQuery(name = "ActionUtilisateurSansArgent.findByActionUtilisateurSansArgentProprietaireID", query = "SELECT c FROM ActionUtilisateurSansArgent c WHERE c.actionUtilisateurProprietaire = :actionUtilisateurSansArgentProprietaire")
})
public class ActionUtilisateurSansArgent extends ActionUtilisateur implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * compte sur lequel l'action sans argent est effectuée
     */
    @ManyToOne
    CompteEpargne actionCompteSansArgent;

    /**
     *
     */
    public ActionUtilisateurSansArgent() {
    }

    /**
     *
     * @param actionUtilisateurDate
     * @param actionUtilisateurTime
     * @param actionUtilisateurProprietaire
     * @param actionUtilisateurType
     * @param actionUtilisateurProprietaireType
     * @param actionCompteSansArgent
     */
    public ActionUtilisateurSansArgent(Date actionUtilisateurDate, Date actionUtilisateurTime, String actionUtilisateurType, String actionUtilisateurProprietaireType, Utilisateur actionUtilisateurProprietaire, CompteEpargne actionCompteSansArgent) {

        super(actionUtilisateurDate, actionUtilisateurTime, actionUtilisateurType, actionUtilisateurProprietaireType, actionUtilisateurProprietaire);
        this.actionCompteSansArgent = actionCompteSansArgent;
    }

}
