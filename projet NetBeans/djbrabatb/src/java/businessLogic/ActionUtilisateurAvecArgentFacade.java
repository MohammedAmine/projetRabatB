/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import persistence.ActionUtilisateurAvecArgent;

/**
 *
 * @author mohammedamine
 */
@Stateless
public class ActionUtilisateurAvecArgentFacade extends AbstractFacade<ActionUtilisateurAvecArgent> {
    @PersistenceContext(unitName = "djbrabatbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ActionUtilisateurAvecArgentFacade() {
        super(ActionUtilisateurAvecArgent.class);
    }
    
}
