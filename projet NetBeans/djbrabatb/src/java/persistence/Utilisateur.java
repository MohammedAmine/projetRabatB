/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mohammedamine
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u"),
    @NamedQuery(name = "Utilisateur.findByUtilisateurID", query = "SELECT u FROM Utilisateur u WHERE u.utilisateurID = :utilisateurID"),
    @NamedQuery(name = "Utilisateur.findByUtilisateurLogin", query = "SELECT u FROM Utilisateur u WHERE u.utilisateurLogin = :utilisateurLogin")})

public abstract class Utilisateur implements Serializable {

    public Utilisateur() {
    }

    private static final long serialVersionUID = 1L;
    
    /**
     * utilisateur ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int utilisateurID;
    
    
    /**
     * utilisateur Login
     */
    @Size(max = 50)
    private String utilisateurLogin;
    
    /**
     * date de création de l'utilisateur
     */
    @Temporal(TemporalType.DATE)
    private Date utilisateurDateCreation;
    
    
    //heritage vers Client
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "utilisateur")
    private Client client;
    
    //heritage vers Administrateur
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "utilisateur")
    private Administrateur administrateur;
    
    /**
     * 
     * liste des actions de l'utilisateur 
     */
    @OneToMany(mappedBy = "actionUtilisateurProprietaire")
    private List<ActionUtilisateur> utilisateurListeActions;
    
    

    public int getUtilisateurID() {
        return utilisateurID;
    }

    public void setUtilisateurID(int utilisateurID) {
        this.utilisateurID = utilisateurID;
    }
    
    

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) utilisateurID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the utilisateurID fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if (this.utilisateurID != other.utilisateurID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistence.Utilisateur[ id=" + utilisateurID + " ]";
    }

}
