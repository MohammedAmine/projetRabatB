
package persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * classe CompteCourant
 */
@Entity
@DiscriminatorValue("COR")

@NamedQueries({
    @NamedQuery(name = "Comptecourant.findAll", query = "SELECT c FROM CompteCourant c"),
    @NamedQuery(name = "Comptecourant.findByCompteCourantID", query = "SELECT c FROM CompteCourant c WHERE c.compteID = :compteCourantID")
    })
public class CompteCourant extends Compte implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * constructeur sans paramaètres
     */
    public CompteCourant() {
    }

    /**
     * constructeur pour date de création, solde, et propriétaire
     * @param compteDateCreation date de création
     * @param compteSolde solde
     * @param compteProprietaire propiétaire
     */
    public CompteCourant(Date compteDateCreation, Float compteSolde,Client compteProprietaire) {
        
        super(compteDateCreation, compteSolde, compteProprietaire);
    }
    
    
    

}
