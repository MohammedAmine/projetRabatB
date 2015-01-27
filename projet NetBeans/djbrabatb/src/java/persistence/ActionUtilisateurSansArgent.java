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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author mohammedamine
 * ActionUtilisateurSansArgent
 */
@Entity
@Table(name = "ACTIONUTILISATEURSANSARGENT")
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
