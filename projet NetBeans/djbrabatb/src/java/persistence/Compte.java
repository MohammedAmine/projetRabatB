/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import persistence.CompteCourant;
import persistence.CompteEpargne;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mohammedamine
 */
@Entity
@Table(name = "COMPTE")
@NamedQueries({
    @NamedQuery(name = "Compte.findAll", query = "SELECT c FROM Compte c"),
    @NamedQuery(name = "Compte.findByCompteID", query = "SELECT c FROM Compte c WHERE c.compteID = :compteID")})
public class Compte implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    public Compte() {
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
     * héritage vers CompteEpargne
     */
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "compte")
    private CompteEpargne compteEpargne;
    
    /**
     * héritage vers CompteCourant
     */
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "compte")
    private CompteCourant compteCourant;
    
    
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
