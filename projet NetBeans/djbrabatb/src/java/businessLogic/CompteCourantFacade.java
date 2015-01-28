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

/**
 *
 * @author mohammedamine
 */
@Stateless
public class CompteCourantFacade extends AbstractFacade<CompteCourant> implements CompteCourantFacadeLocal {
    @PersistenceContext(unitName = "djbrabatbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompteCourantFacade() {
        super(CompteCourant.class);
    }
    
    @Override
    public void retirerArgentCompteCourant(CompteCourant CompteSource, float montantRetrait){
        
    }
    
}
