/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author mohammedamine
 */
@Entity
@Table(name = "ACTIONUTILISATEUR")
@NamedQueries({
    @NamedQuery(name = "ActionUtilisateur.findAll", query = "SELECT c FROM ActionUtilisateur c"),
@NamedQuery(name = "ActionUtilisateur.findByActionUtilisateurID", query = "SELECT c FROM ActionUtilisateur c WHERE c.actionUtilisateurID = :actionUtilisateurID"),
@NamedQuery(name = "ActionUtilisateur.findByactionUtilisateurProprietaireID", query = "SELECT c FROM Utilisateur c WHERE c.utilisateurID = :actionUtilisateurProprietaireID")
})
public abstract class ActionUtilisateur implements Serializable {

    public ActionUtilisateur() {
    }
    
    private static final long serialVersionUID = 1L;
    
    /**
     * ID de ActionUtilisateur
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actionUtilisateurID;
    
    /**
     * date de ActionUtilisateur
     */
    @Temporal(TemporalType.DATE)
    @Column
    private Date actionUtilisateurDate;
    
    /**
     * heure de ActionUtilisateur
     */
    @Column
    @Temporal(TemporalType.TIME)
    private Date actionUtilisateurTime;
    
    /**
     * type de ActionUtilisateur
     */
    @Column
    @Size(max = 50)
    private String actionUtilisateurType;
    
    /**
     * type de l'utilisateur propriétaire de ActionUtilisateur
     */
    @Column
    @Size(max = 50)
    private String actionUtilisateurProprietaireType;
    
    
    /**
     * héritage vers ActionUtilisateurSansArgent
     */
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "actionUtilisateur")
    private ActionUtilisateurSansArgent actionUtilisateurSansArgent;
    
    /**
     * héritage vers ActionUtilisateurAvecArgent
     */
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "actionUtilisateur")
    private ActionUtilisateurAvecArgent actionUtilisateurAvecArgent;
    
    /**
     * Utilisateur qui est le proprietaire de ActionUtilisateur
     */
    @ManyToOne
    private Utilisateur actionUtilisateurProprietaire;
    
    /**
     * Compte sur lequel ActionUtilisateur est effectuée
     */
    @ManyToOne
    private Compte actionUtilisateurCompte;
    
    

    public int getActionUtilisateurID() {
        return actionUtilisateurID;
    }

    public void setActionUtilisateurID(int actionUtilisateurID) {
        this.actionUtilisateurID = actionUtilisateurID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) actionUtilisateurID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the actionUtilisateurID fields are not set
        if (!(object instanceof ActionUtilisateur)) {
            return false;
        }
        ActionUtilisateur other = (ActionUtilisateur) object;
        if (this.actionUtilisateurID != other.actionUtilisateurID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistence.ActionUtilisateur[ id=" + actionUtilisateurID + " ]";
    }
    
}
