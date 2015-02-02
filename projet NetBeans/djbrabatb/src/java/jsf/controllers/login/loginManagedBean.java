package jsf.controllers.login;

import businessLogic.AdministrateurFacade;
import businessLogic.ClientFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Named;
import javax.validation.constraints.Size;
import persistence.Administrateur;
import persistence.Client;

/**
 *
 */
@Named("loginManagedBean")
@SessionScoped
public class LoginManagedBean implements Serializable {

    /**
     *
     */
    @EJB
    private AdministrateurFacade administrateurFacade;

    /**
     *
     */
    @EJB
    private ClientFacade clientFacade;

    /**
     * variable requesterUtilisateurID
     */
    @Size(min = 5, max = 25, message = "Taille du login : 5-25 caracatères !")
    private String requesterUtilisateurLogin;

    /**
     * variable requesterUtilisateurType
     */
    private String requesterUtilisateurType;

    /**
     * administrateur
     */
    private Administrateur administrateurLoged;

    /**
     * client
     */
    private Client clientLoged;

    /**
     *
     */
    private int utilisateurLogedID;

    public int getUtilisateurLogedID() {

        return utilisateurLogedID;
    }

    public void setUtilisateurLogedID(int utilisateurLogedID) {
        this.utilisateurLogedID = utilisateurLogedID;
    }

    /**
     *
     */
    public LoginManagedBean() {
    }

    /**
     *
     * @return String page suivante
     */
    public String logIn() {

        if ("CLIENT".equals(this.requesterUtilisateurType)) {

            List<Client> listeClients = (List<Client>) clientFacade.getEntityManager().createQuery("select c from Client c where c.utilisateurLogin=:requesterUtilisateurLogin").setParameter("requesterUtilisateurLogin", requesterUtilisateurLogin).getResultList();

            if (!listeClients.isEmpty()) {
                this.clientLoged = listeClients.get(0);
                this.utilisateurLogedID = clientLoged.getUtilisateurID();
                System.out.println("Client " + clientLoged.getUtilisateurID() + " : " + clientLoged.getClientNom() + " " + clientLoged.getClientPrenom() + " authentifié avec le login " + clientLoged.getUtilisateurLogin());
                // ajouter le message de succes : client logé !
                FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Bonjour " + clientLoged.getClientNom(), "Bienvenue dans votre espace client"));
                return "/jsf/pages/acceuil/acceuilClient?utilisateurLogedID=" + this.clientLoged.getUtilisateurID() + "&amp;faces-redirect=true";
            }
        }

        if ("ADMINISTRATEUR".equals(this.requesterUtilisateurType)) {

            List<Administrateur> listeAdministrateurs = (List<Administrateur>) administrateurFacade.getEntityManager().createQuery("select a from Administrateur a where a.utilisateurLogin=:requesterUtilisateurLogin").setParameter("requesterUtilisateurLogin", requesterUtilisateurLogin).getResultList();
            

            if (!listeAdministrateurs.isEmpty()) {

                this.administrateurLoged = listeAdministrateurs.get(0);
                this.utilisateurLogedID = administrateurLoged.getUtilisateurID();
                System.out.println("Administrateur " + administrateurLoged.getUtilisateurID() + " :  authentifié avec le login " + administrateurLoged.getUtilisateurLogin());
                // ajouter le message de succes : admin logé !
                FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Bonjour " + administrateurLoged.getUtilisateurLogin(), "Bienvenue dans votre espace administrateur"));
                return "/jsf/pages/acceuil/acceuilAdministrateur?utilisateurLogedID=" + this.administrateurLoged.getUtilisateurID() + "&amp;faces-redirect=true";
            }
        }

        // ajouter le message d'erreur : aucun utilisateur trouvé
        FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
        FacesContext.getCurrentInstance().addMessage("loginInputText:formLogin", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Utilisateur inexistant", "Aucun utilisateur n'est enregistré avec ce login"));

        return "login?faces-redirect=true";
    }

    public String getRequesterUtilisateurLogin() {
        return requesterUtilisateurLogin;
    }

    public void setRequesterUtilisateurLogin(String requesterUtilisateurLogin) {
        this.requesterUtilisateurLogin = requesterUtilisateurLogin;
    }

    public String getRequesterUtilisateurType() {
        return requesterUtilisateurType;
    }

    public void setRequesterUtilisateurType(String requesterUtilisateurType) {
        this.requesterUtilisateurType = requesterUtilisateurType;
    }

    public Administrateur getAdministrateurLoged() {
        return administrateurLoged;
    }

    public void setAdministrateurLoged(Administrateur administrateurLoged) {
        this.administrateurLoged = administrateurLoged;
    }

    public Client getClientLoged() {
        return clientLoged;
    }

    public void setClientLoged(Client clientLoged) {
        this.clientLoged = clientLoged;
    }

}
