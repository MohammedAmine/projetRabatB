/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import java.util.List;
import javax.ejb.Local;
import persistence.ActionUtilisateur;

/**
 *
 * @author mohammedamine
 */
@Local
public interface ActionUtilisateurFacadeLocal {

    void create(ActionUtilisateur actionUtilisateur);

    void edit(ActionUtilisateur actionUtilisateur);

    void remove(ActionUtilisateur actionUtilisateur);

    ActionUtilisateur find(Object id);

    List<ActionUtilisateur> findAll();

    List<ActionUtilisateur> findRange(int[] range);

    int count();
    
}
