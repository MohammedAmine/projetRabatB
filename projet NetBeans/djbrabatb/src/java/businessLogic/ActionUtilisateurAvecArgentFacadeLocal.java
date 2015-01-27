/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import java.util.List;
import javax.ejb.Local;
import persistence.ActionUtilisateurAvecArgent;

/**
 *
 * @author mohammedamine
 */
@Local
public interface ActionUtilisateurAvecArgentFacadeLocal {

    void create(ActionUtilisateurAvecArgent actionUtilisateurAvecArgent);

    void edit(ActionUtilisateurAvecArgent actionUtilisateurAvecArgent);

    void remove(ActionUtilisateurAvecArgent actionUtilisateurAvecArgent);

    ActionUtilisateurAvecArgent find(Object id);

    List<ActionUtilisateurAvecArgent> findAll();

    List<ActionUtilisateurAvecArgent> findRange(int[] range);

    int count();
    
}
