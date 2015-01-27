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
 */
@Entity
@Table(name = "ACTIONUTILISATEURAVECARGENTTRANSFERT")
public class ActionUtilisateurAvecArgentTransfert extends ActionUtilisateurAvecArgent implements Serializable {

    public ActionUtilisateurAvecArgentTransfert() {
    }
    private static final long serialVersionUID = 1L;
    
    /**
     * héritage depuis ActionUtilisateurAvecArgent
     */
    @OneToOne
    private ActionUtilisateurAvecArgent actionUtilisateurAvecArgent;
}
