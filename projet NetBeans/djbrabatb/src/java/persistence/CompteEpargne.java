package persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * classe CompteEpargne
 */
@Entity
@DiscriminatorValue("EPG")

@NamedQueries({
    @NamedQuery(name = "CompteEpargne.findAll", query = "SELECT c FROM CompteEpargne c"),
    @NamedQuery(name = "CompteEpargne.findByCompteEpargneID", query = "SELECT c FROM CompteEpargne c WHERE c.compteID = :compteEpargneID"),
    @NamedQuery(name = "CompteEpargne.findByCompteEpargneEtat", query = "SELECT c FROM CompteEpargne c WHERE c.compteEpargneEtat = :compteEpargneEtat")})
public class CompteEpargne extends Compte implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * constructeur sans paramètres
     */
    public CompteEpargne() {
        
    }

    public CompteEpargne(String compteEpargneEtat, float compteEpargneTauxJournalier) {
        this.compteEpargneEtat = compteEpargneEtat;
        this.compteEpargneTauxJournalier = compteEpargneTauxJournalier;
    }


    public CompteEpargne(String compteEpargneEtat, float compteEpargneTauxJournalier, Date compteDateCreation, Float compteSolde, Client compteProprietaire, List<ActionUtilisateur> compteListeActionsUtilisateurs) {
        super(compteDateCreation, compteSolde, compteProprietaire, compteListeActionsUtilisateurs);
        this.compteEpargneEtat = compteEpargneEtat;
        this.compteEpargneTauxJournalier = compteEpargneTauxJournalier;
    }

    /**
     *  constructeur pour état, taux journalier,  solde et propriétaire
     * @param compteEpargneEtat état
     * @param compteEpargneTauxJournalier taux journalier
     * @param compteSolde solde
     * @param compteProprietaire propriétaire
     */
    public CompteEpargne(String compteEpargneEtat, float compteEpargneTauxJournalier, Float compteSolde, Client compteProprietaire) {
        
        super( compteSolde, compteProprietaire);
        
        this.compteEpargneEtat = compteEpargneEtat;
        this.compteEpargneTauxJournalier = compteEpargneTauxJournalier;
    }
    
    

    /**
     * état du CompteEpargne
     */
    @Column
    private String compteEpargneEtat;

    
    /**
     * taux journalier du CompteEpargne
     */
    @Column
    private float compteEpargneTauxJournalier;

    /**
     * 
     * @return 
     */
    public String getCompteEpargneEtat() {
        return compteEpargneEtat;
    }

    /**
     * 
     * @param compteEpargneEtat
     */
    public void setCompteEpargneEtat(String compteEpargneEtat) {
        this.compteEpargneEtat = compteEpargneEtat;
    }

    /**
     * 
     * @return 
     */
    public float getCompteEpargneTauxJournalier() {
        return compteEpargneTauxJournalier;
    }

    /**
     * 
     * @param compteEpargneTauxJournalier
     */
    public void setCompteEpargneTauxJournalier(float compteEpargneTauxJournalier) {
        this.compteEpargneTauxJournalier = compteEpargneTauxJournalier;
    }

    

}
