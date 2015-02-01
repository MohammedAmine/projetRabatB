

package jsf.controllers.acceuil;

import businessLogic.ClientFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import persistence.Client;

/**
 *
 * @author mohammedamine
 */
@Named("AcceuilClientManagedBean")
@RequestScoped
public class AcceuilClientManagedBean implements Serializable{

    /**
     * 
     */
    @EJB
    private ClientFacade clientFacade;
    
    /**
     * 
     */
    private int utilisateurLogedID;
    
    /**
     * 
     */
    private Client clientLoged;
    
    /**
     * 
     */
    private String utilisateurLogedNom;
    
   
    /**
     * rapatrie le client de la base grace à l'ID utilisateur passé par viewparam
     */
    public void getCli(){

        List<Client> listeClients=(List<Client>) clientFacade.getEntityManager().createQuery("select c from Client c where c.utilisateurLogin=:utilisateurLogedID").setParameter("utilisateurLogedID", utilisateurLogedID).getResultList();
           
           if (!listeClients.isEmpty()){
               this.clientLoged=listeClients.get(0);
               this.utilisateurLogedNom=clientLoged.getClientNom();
           }
    }
    
    /**
     * 
     */
    public AcceuilClientManagedBean() {
        
    }

    /**
     * 
     * @return 
     */
    public int getUtilisateurLogedID() {
        return utilisateurLogedID;
    }

    /**
     * 
     * @param utilisateurLogedID 
     */
    public void setUtilisateurLogedID(int utilisateurLogedID) {
        this.utilisateurLogedID = utilisateurLogedID;
    }

    /**
     * 
     * @return 
     */
    public Client getClientLoged() {
        return clientLoged;
    }

    /**
     * 
     * @param clientLoged 
     */
    public void setClientLoged(Client clientLoged) {
        this.clientLoged = clientLoged;
    }

    public String getUtilisateurLogedNom() {
        return utilisateurLogedNom;
    }

    public void setUtilisateurLogedNom(String utilisateurLogedNom) {
        this.utilisateurLogedNom = utilisateurLogedNom;
    }
    
    
    
    
    
}
