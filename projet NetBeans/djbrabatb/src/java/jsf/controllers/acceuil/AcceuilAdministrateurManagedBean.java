/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsf.controllers.acceuil;

import businessLogic.AdministrateurFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import persistence.Administrateur;

/**
 *
 * @author mohammedamine
 */
@Named("AcceuilAdministrateurManagedBean")
@RequestScoped
public class AcceuilAdministrateurManagedBean implements Serializable{

    /**
     * 
     */
    @EJB
    private AdministrateurFacade administrateurFacade;
    
    /**
     * 
     */
    private int utilisateurLogedID;
    
    /**
     * 
     */
    private Administrateur administrateurLoged;
    
    /**
     * 
     */
    private String utilisateurLogedLogin;

    public String getUtilisateurLogedLogin() {
        return utilisateurLogedLogin;
    }

    public void setUtilisateurLogedLogin(String utilisateurLogedLogin) {
        this.utilisateurLogedLogin = utilisateurLogedLogin;
    }
    
   
    /**
     * rapatrie le client de la base grace à l'ID utilisateur passé par viewparam
     */
    public void getAdm(){

        List<Administrateur> listeAdministrateurs=(List<Administrateur>) administrateurFacade.getEntityManager().createQuery("select a from Administrateur a where a.utilisateurLogin=:utilisateurLogedID").setParameter("utilisateurLogedID", utilisateurLogedID).getResultList();
           
           if (!listeAdministrateurs.isEmpty()){
               this.administrateurLoged=listeAdministrateurs.get(0);
               this.utilisateurLogedLogin=this.administrateurLoged.getUtilisateurLogin();
           }
    }
    
    /**
     * 
     */
    public AcceuilAdministrateurManagedBean() {
        
    }

    public int getUtilisateurLogedID() {
        return utilisateurLogedID;
    }

    public void setUtilisateurLogedID(int utilisateurLogedID) {
        this.utilisateurLogedID = utilisateurLogedID;
    }

    public Administrateur getAdministrateurLoged() {
        return administrateurLoged;
    }

    public void setAdministrateurLoged(Administrateur administrateurLoged) {
        this.administrateurLoged = administrateurLoged;
    }

    
    
    
    
}

