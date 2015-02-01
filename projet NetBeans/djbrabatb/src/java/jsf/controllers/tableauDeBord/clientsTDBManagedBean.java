/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsf.controllers.tableauDeBord;

import businessLogic.ClientFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import jsf.controllers.login.LoginManagedBean;
import persistence.Client;

/**
 *
 * @author mohammedamine
 */

// a ne pas utiliser
@Named("clientsTDBManagedBean")
@SessionScoped
public class clientsTDBManagedBean implements Serializable {
    
    @EJB
    private ClientFacade clientFacade;
    
    @EJB
    private LoginManagedBean loginManagedBean;
    
    private List<Client> items=null;


    public List<Client> getItems(){
        /*  items =clientFacade.getEntityManager().createNamedQuery("Client.findAll").getResultList().subList(0, 10);
        System.out.println("Bonjour "+loginManagedBean.getUtilisateurLoged().getUtilisateurLogin());
        System.out.println("total des clients "+items.size());
        System.out.println("exemple de client "+items.get(0).getClientNom());
                */
        return items;
    }
    
    public clientsTDBManagedBean() {
       
    }
    
    
}
