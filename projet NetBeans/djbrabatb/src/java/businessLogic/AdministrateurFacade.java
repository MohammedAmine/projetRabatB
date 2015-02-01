/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import persistence.Administrateur;

/**
 *
 * @author mohammedamine
 */
@Stateless
public class AdministrateurFacade extends AbstractFacade<Administrateur> {
    @PersistenceContext(unitName = "djbrabatbPU")
    private EntityManager em;

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    public AdministrateurFacade() {
        super(Administrateur.class);
    }
    
}
