/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistence;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author mohammedamine
 * ActionUtilisateurSansArgent
 */
@Entity
@Table(name = "ACTIONUTILISATEURSANSARGENT")
@NamedQueries({
@NamedQuery(name = "ActionUtilisateurSansArgent.findAll", query = "SELECT c FROM ActionUtilisateurSansArgent c"),
@NamedQuery(name = "ActionUtilisateurSansArgent.findByActionUtilisateurSansArgentID", query = "SELECT c FROM ActionUtilisateurSansArgent c WHERE c.actionUtilisateurID = :actionUtilisateurSansArgentID"),
@NamedQuery(name = "ActionUtilisateurSansArgent.findByActionUtilisateurSansArgentProprietaireID", query = "SELECT c FROM ActionUtilisateurSansArgent c WHERE c.actionUtilisateurProprietaire = :actionUtilisateurSansArgentProprietaire")
})
public class ActionUtilisateurSansArgent extends ActionUtilisateur implements Serializable {
    
    /**
     * héritage depuis ActionUtilisateur 
     */
    @OneToOne
    private ActionUtilisateur actionUtilisateur;

    public ActionUtilisateurSansArgent() {
    }
    private static final long serialVersionUID = 1L;
  

    
}
