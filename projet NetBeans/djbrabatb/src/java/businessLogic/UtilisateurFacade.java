/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import persistence.CompteCourant;
import persistence.Utilisateur;

/**
 *
 * @author mohammedamine
 */
@Stateless
public class UtilisateurFacade extends AbstractFacade<Utilisateur> implements UtilisateurFacadeLocal {
    @PersistenceContext(unitName = "djbrabatbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UtilisateurFacade() {
        super(Utilisateur.class);
    }
    
    /**
     * Cette méthode permet de transferer de l'argent entre deux comptes
     * @param compteSource
     * @param compteCible
     * @param montantTransfert
     */
    @Override
    public void transfererArgent (CompteCourant compteSource,CompteCourant compteCible, float montantTransfert){
        
    }
    
}
