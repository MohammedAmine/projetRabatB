/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistence;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * classe Administrateur
 */
@Entity
@DiscriminatorValue("ADM")

public class Administrateur extends Utilisateur implements Serializable {
    
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Administrateur() {    
        
    }

    /**
     *
     * @param utilisateurLogin 
     */
    public Administrateur(String utilisateurLogin) {
        super(utilisateurLogin,"ADMINISTRATEUR");
    }

    
    

    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    
    
}
