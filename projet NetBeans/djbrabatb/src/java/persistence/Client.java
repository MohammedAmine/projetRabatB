/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author mohammedamine
 */
@Entity

@Table(name = "CLIENT")
public class Client extends Utilisateur implements Serializable {
    
    /**
     * heritage depuis Utilisateur
     */
    @OneToOne
    private Utilisateur utilisateur;

    public Client() {
    }
    private static final long serialVersionUID = 1L;
           
    @Size(max = 50)
    private String clientAdresse;
     
    @Size(max = 50)
    private String clientEmail;
    
    @Size(max = 50)
    private String clientNom;
    
    @Size(max = 50)
    private String clientPrenom;
    
    @Size(max = 50)
    private String clientTelephone;
    
    
    

  
    @OneToMany(mappedBy = "compteProprietaire")
    private List<Compte> clientListeComptes;

    
    
}
