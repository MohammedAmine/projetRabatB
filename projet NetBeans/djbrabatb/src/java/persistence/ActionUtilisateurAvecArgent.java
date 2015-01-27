/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name = "ACTIONUTILISATEURAVECARGENT")
public abstract class ActionUtilisateurAvecArgent extends ActionUtilisateur implements Serializable {

    private static final long serialVersionUID = 1L;

    public ActionUtilisateurAvecArgent() {
    }

    /**
    *heritage depuis ActionUtilisateur
    */
    @OneToOne
    private ActionUtilisateur actionUtilisateur;
    
    /**
     * heritage vers ActionUtilisateur
     */
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "actionUtilisateurAvecArgent")
    private ActionUtilisateur actionUtilisateurAvecArgentDepot;
    
    /**
     * heritage vers ActionUtilisateurAvecArgentRetrait
     */
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "actionUtilisateurAvecArgent")
    private ActionUtilisateurAvecArgentRetrait actionUtilisateurAvecArgentRetrait;
    
    /**
     * heritage vers ActionUtilisateurAvecArgentTransfert
     */    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "actionUtilisateurAvecArgent")
    private ActionUtilisateurAvecArgentTransfert actionUtilisateurAvecArgentTransfert;
    
    /**
     * Le montant de l'ActionUtilisateurAvecArgent
     */
    @Column
    private float ActionUtilisateurAvecArgentMontant;

}
