
package persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author mohammedamine
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u"),
    @NamedQuery(name = "Utilisateur.findByUtilisateurID", query = "SELECT u FROM Utilisateur u WHERE u.utilisateurID = :utilisateurID"),
    @NamedQuery(name = "Utilisateur.findByUtilisateurLogin", query = "SELECT u FROM Utilisateur u WHERE u.utilisateurLogin = :utilisateurLogin")})

public abstract class Utilisateur implements Serializable {

    /**
     * constructeur sans paramètres
     */
    public Utilisateur() {
    }

    /**
     * 
     * @param utilisateurLogin 
     */
    public Utilisateur(String utilisateurLogin) {
        this.utilisateurLogin = utilisateurLogin; 
       this.utilisateurDateCreation = new Date();
    }
    
    /**
     * 
     * @param utilisateurLogin
     * @param utilisateurType
     */
    public Utilisateur(String utilisateurLogin, String utilisateurType) {
        this.utilisateurLogin = utilisateurLogin; 
        this.utilisateurType = utilisateurType;
               
        this.utilisateurDateCreation = new Date();
    }

    
    
    /**
     * utilisateur ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int utilisateurID;
    
    
    /**
     * utilisateur Login
     */
    
    @Size(max = 50,min = 3)
    @Column
    private String utilisateurLogin;
    
    /**
     * date de création de l'utilisateur
     */
    @Temporal(TemporalType.DATE)
    @Column
    private Date utilisateurDateCreation;
    
    /**
     * type utilisateur
     */
    @Column
    private String utilisateurType;

    private static final long serialVersionUID = 1L;
    
    
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

    public String getUtilisateurLogin() {
        return utilisateurLogin;
    }

    public void setUtilisateurLogin(String utilisateurLogin) {
        this.utilisateurLogin = utilisateurLogin;
    }

    public Date getUtilisateurDateCreation() {
        return utilisateurDateCreation;
    }

    public void setUtilisateurDateCreation(Date utilisateurDateCreation) {
        this.utilisateurDateCreation = utilisateurDateCreation;
    }

    public String getUtilisateurType() {
        return utilisateurType;
    }

    public void setUtilisateurType(String utilisateurType) {
        this.utilisateurType = utilisateurType;
    }

    public List<ActionUtilisateur> getUtilisateurListeActions() {
        return utilisateurListeActions;
    }

    public void setUtilisateurListeActions(List<ActionUtilisateur> utilisateurListeActions) {
        this.utilisateurListeActions = utilisateurListeActions;
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
