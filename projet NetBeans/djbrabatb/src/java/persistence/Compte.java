
package persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * classe Compte
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@NamedQueries({
    @NamedQuery(name = "Compte.findAll", query = "SELECT c FROM Compte c"),
    @NamedQuery(name = "Compte.findByCompteID", query = "SELECT c FROM Compte c WHERE c.compteID = :compteID")})
public class Compte implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * constructeur sans paramètres
     */
    public Compte() {
    }

    /**
     * constructeur pour date de creation, solde et propriétaire du compte
     * @param compteSolde solde
     * @param compteProprietaire propriétaire du compte
     */
    public Compte( Float compteSolde,Client compteProprietaire) {
        
        this.compteProprietaire=compteProprietaire;
        this.compteSolde = compteSolde;
        this.compteDateCreation=new Date();
    }

    public Compte(Date compteDateCreation, Float compteSolde, Client compteProprietaire, List<ActionUtilisateur> compteListeActionsUtilisateurs) {
        this.compteDateCreation = compteDateCreation;
        this.compteSolde = compteSolde;
        this.compteProprietaire = compteProprietaire;
        this.compteListeActionsUtilisateurs = compteListeActionsUtilisateurs;
    }
    
    
    
    /**
     * ID du compte
     */
    @Id
    @NotNull
    @Column
    private Integer compteID;
    
    /**
     * date de création du Compte
     */
    @Column
    @Temporal(TemporalType.DATE)
    private Date compteDateCreation;
   
    /**
     * solde du compte
     */
    @Column
    private Float compteSolde;
    
    
    /**
     * le client propriétaire du compte
     */
    @ManyToOne
    private Client compteProprietaire;
    
    
    /**
     * 
     * liste des actions su le compte 
     */
    @OneToMany(mappedBy = "actionUtilisateurCompte")
    private List<ActionUtilisateur> compteListeActionsUtilisateurs;

    public Integer getCompteID() {
        return compteID;
    }

    public void setCompteID(Integer compteID) {
        this.compteID = compteID;
    }

    public Date getCompteDateCreation() {
        return compteDateCreation;
    }

    public void setCompteDateCreation(Date compteDateCreation) {
        this.compteDateCreation = compteDateCreation;
    }

    public Float getCompteSolde() {
        return compteSolde;
    }

    public void setCompteSolde(Float compteSolde) {
        this.compteSolde = compteSolde;
    }

    public Client getCompteProprietaire() {
        return compteProprietaire;
    }

    public void setCompteProprietaire(Client compteProprietaire) {
        this.compteProprietaire = compteProprietaire;
    }

    public List<ActionUtilisateur> getCompteListeActionsUtilisateurs() {
        return compteListeActionsUtilisateurs;
    }

    public void setCompteListeActionsUtilisateurs(List<ActionUtilisateur> compteListeActionsUtilisateurs) {
        this.compteListeActionsUtilisateurs = compteListeActionsUtilisateurs;
    }
    

    

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compteID != null ? compteID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compte)) {
            return false;
        }
        Compte other = (Compte) object;
        if ((this.compteID == null && other.compteID != null) || (this.compteID!= null && !this.compteID.equals(other.compteID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Compte[ compteid=" + compteID + " ]";
    }
    
}
