/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import persistence.Compte;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author retina
 */
@Entity
@Table(name = "COMPTEEPARGNE")
@NamedQueries({
    @NamedQuery(name = "CompteEpargne.findAll", query = "SELECT c FROM CompteEpargne c"),
    @NamedQuery(name = "CompteEpargne.findByCompteEpargneID", query = "SELECT c FROM CompteEpargne c WHERE c.compteID = :compteEpargneID"),
    @NamedQuery(name = "CompteEpargne.findByCompteEpargneEtat", query = "SELECT c FROM CompteEpargne c WHERE c.compteEpargneEtat = :compteEpargneEtat")})
public class CompteEpargne extends Compte implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * héritage depuis Compte
     */
    @OneToOne
    Compte compte;

    /**
     * état du CompteEpargne
     */
    @Column
    private String compteEpargneEtat;

    /**
     * taux journalier du CompteEpargne
     */
    @Column
    private float compteEpargneTauxJournalier;

    public CompteEpargne() {
        
    }

}
