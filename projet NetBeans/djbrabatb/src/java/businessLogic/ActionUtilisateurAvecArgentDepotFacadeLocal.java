/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import java.util.List;
import javax.ejb.Local;
import persistence.ActionUtilisateurAvecArgentDepot;

/**
 *
 * @author mohammedamine
 */
@Local
public interface ActionUtilisateurAvecArgentDepotFacadeLocal {

    void create(ActionUtilisateurAvecArgentDepot actionUtilisateurAvecArgentDepot);

    void edit(ActionUtilisateurAvecArgentDepot actionUtilisateurAvecArgentDepot);

    void remove(ActionUtilisateurAvecArgentDepot actionUtilisateurAvecArgentDepot);

    ActionUtilisateurAvecArgentDepot find(Object id);

    List<ActionUtilisateurAvecArgentDepot> findAll();

    List<ActionUtilisateurAvecArgentDepot> findRange(int[] range);

    int count();
    
}
