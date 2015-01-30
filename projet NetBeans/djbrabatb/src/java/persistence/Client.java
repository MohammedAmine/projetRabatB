
package persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

/**
 * classe client hérite de la classe Utilisateur
 */
@Entity
@DiscriminatorValue("CLI")

@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c"),
    @NamedQuery(name = "Client.findByClientadresse", query = "SELECT c FROM Client c WHERE c.clientAdresse = :clientAdresse"),
    @NamedQuery(name = "Client.findByClientEmail", query = "SELECT c FROM Client c WHERE c.clientEmail = :clientEmail"),
    @NamedQuery(name = "Client.findByClientNom", query = "SELECT c FROM Client c WHERE c.clientNom = :clientNom"),
    @NamedQuery(name = "Client.findByClientPrenom", query = "SELECT c FROM Client c WHERE c.clientPrenom = :clientPrenom"),
    @NamedQuery(name = "Client.findByClientTelephone", query = "SELECT c FROM Client c WHERE c.clientTelephone = :clientTelephone"),
    @NamedQuery(name = "Client.findByClientID", query = "SELECT c FROM Client c WHERE c.utilisateurID = :utilisateurID")})
public class Client extends Utilisateur implements Serializable {
    

    /**
     * constructeur sans paramètres
     */
    public Client() {
    }

    public Client(String utilisateurLogin) {
        super(utilisateurLogin);
    }
    
   
    
    /**
     * 
     * @param clientAdresse
     * @param clientEmail
     * @param clientNom
     * @param clientTelephone
     * @param clientPrenom
     * @param utilisateurLogin
     */
    public Client(String clientAdresse, String clientEmail, String clientNom, String clientPrenom, String clientTelephone, String utilisateurLogin) {
        super(utilisateurLogin,"CLIENT");
        this.clientAdresse = clientAdresse;
        this.clientEmail = clientEmail;
        this.clientNom = clientNom;
        this.clientPrenom = clientPrenom;
        this.clientTelephone = clientTelephone;
    }
    
    /**
     * adresse
     */
    @Size(max = 50)
    private String clientAdresse;
    
    /**
     * email
     */
    @Size(max = 50)
    private String clientEmail;
    
    /**
     * nom
     */
    @Size(max = 50)
    private String clientNom;
    
    /**
     * prénom
     */
    @Size(max = 50)
    private String clientPrenom;
    
    /**
     * téléphone
     */
    @Size(max = 50)
    private String clientTelephone;

    /**
     * liste des comptes du client
     */
    @OneToMany(mappedBy = "compteProprietaire")
    private List<Compte> clientListeComptes;

    
    private static final long serialVersionUID = 1L;
    
    
}
