/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import java.util.List;
import javax.ejb.Local;
import persistence.ActionUtilisateurAvecArgentRetrait;

/**
 *
 * @author mohammedamine
 */
@Local
public interface ActionUtilisateurAvecArgentRetraitFacadeLocal {

    void create(ActionUtilisateurAvecArgentRetrait actionUtilisateurAvecArgentRetrait);

    void edit(ActionUtilisateurAvecArgentRetrait actionUtilisateurAvecArgentRetrait);

    void remove(ActionUtilisateurAvecArgentRetrait actionUtilisateurAvecArgentRetrait);

    ActionUtilisateurAvecArgentRetrait find(Object id);

    List<ActionUtilisateurAvecArgentRetrait> findAll();

    List<ActionUtilisateurAvecArgentRetrait> findRange(int[] range);

    int count();
    
}
