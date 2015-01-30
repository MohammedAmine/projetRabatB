
package jsf.controllers.login;

import businessLogic.UtilisateurFacade;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 */

@Named("loginManagedBean")
@SessionScoped
public class loginManagedBean implements Serializable{
    @EJB
    private UtilisateurFacade utilisateurFacade;
    
    /**
     * injection ejb utilisateur
     */
    

    /**
     * variable requesterUtilisateurID
     */
    private String requesterUtilisateurLogin;

    /**
     * getter
     * @return Utilisateur
     */
    public String getRequesterUtilisateurLogin() {
        return requesterUtilisateurLogin;
    }

    /**
     * setter
     * @param requesterUtilisateurLogin
     */
    public void setRequesterUtilisateurLogin(String requesterUtilisateurLogin) {
        this.requesterUtilisateurLogin= requesterUtilisateurLogin;
    }
    
    /**
     * 
     */
    public loginManagedBean() {
    }
   
    /**
     * 
     * @return String page suivante
     */
    public String authentifier(){
        
        /*
        
        List<Utilisateur> lUtilisateur=(List<Utilisateur>) UtilisateurFacade.getEntityManager().createNamedQuery("Utilisateur.findByUtilisateurLogin").setParameter("utilisateurLogin",requesterUtilisateurLogin).getResultList();
        
        if(!lUtilisateur.isEmpty()) {
            
            if(lUtilisateur.get(0).getUtilisateurType().equalsIgnoreCase("ADMINISTRATEUR")){
            //jpeux aussi connaitre l'ID et le passer à la page suivante
                return "/jsf/pages/acceuil/acceuilAdministrateur";
            
            }
            
            if(lUtilisateur.get(0).getUtilisateurType().equalsIgnoreCase("CLIENT")){
            //jpeux aussi connaitre l'ID et le passer à la page suivante
                return "/jsf/pages/acceuil/acceuilClient";
            
            }
                
            
        } 
        */
        return "login";
    }
}
