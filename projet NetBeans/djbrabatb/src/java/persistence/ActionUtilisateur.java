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
public abstract class ActionUtilisateur implements Serializable {

    public ActionUtilisateur() {
    }
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actionUtilisateurID;
    
    
    @Temporal(TemporalType.DATE)
    private Date actionUtilisateurDate;
    
    
    @Temporal(TemporalType.TIME)
    private Date actionUtilisateurTime;
    
    @Size(max = 50)
    private String actionUtilisateurType;
    
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
    
    
    @ManyToOne
    private Utilisateur actionUtilisateurProprietaire;
    
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
