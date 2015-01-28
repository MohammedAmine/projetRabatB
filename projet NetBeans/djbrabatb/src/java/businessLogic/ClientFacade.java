/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import persistence.Client;
import persistence.CompteCourant;

/**
 *
 * @author mohammedamine
 */
@Stateless
public class ClientFacade extends AbstractFacade<Client> {

    @PersistenceContext(unitName = "djbrabatbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientFacade() {
        super(Client.class);
    }
    
    /**
     *
     * @param compteSource
     * @param compteCible
     * @param montantTransfert
     */
    public void transfererArgent (CompteCourant compteSource,CompteCourant compteCible, float montantTransfert){
        
    }
    
    

}
