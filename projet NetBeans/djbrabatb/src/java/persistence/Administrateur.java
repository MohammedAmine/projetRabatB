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

@Table(name = "ADMINISTRATEUR")
public class Administrateur extends Utilisateur implements Serializable {

    /**
     * heritage depuis utilisateur
     */
    @OneToOne
    private Utilisateur utilisateur;

    public Administrateur() {
    }
    private static final long serialVersionUID = 1L;

}
