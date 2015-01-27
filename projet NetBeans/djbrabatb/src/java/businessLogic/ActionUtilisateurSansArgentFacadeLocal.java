/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import java.util.List;
import javax.ejb.Local;
import persistence.ActionUtilisateurSansArgent;

/**
 *
 * @author mohammedamine
 */
@Local
public interface ActionUtilisateurSansArgentFacadeLocal {

    void create(ActionUtilisateurSansArgent actionUtilisateurSansArgent);

    void edit(ActionUtilisateurSansArgent actionUtilisateurSansArgent);

    void remove(ActionUtilisateurSansArgent actionUtilisateurSansArgent);

    ActionUtilisateurSansArgent find(Object id);

    List<ActionUtilisateurSansArgent> findAll();

    List<ActionUtilisateurSansArgent> findRange(int[] range);

    int count();
    
}
