/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import java.util.List;
import javax.ejb.Local;
import persistence.ActionUtilisateurAvecArgentTransfert;

/**
 *
 * @author mohammedamine
 */
@Local
public interface ActionUtilisateurAvecArgentTransfertFacadeLocal {

    void create(ActionUtilisateurAvecArgentTransfert actionUtilisateurAvecArgentTransfert);

    void edit(ActionUtilisateurAvecArgentTransfert actionUtilisateurAvecArgentTransfert);

    void remove(ActionUtilisateurAvecArgentTransfert actionUtilisateurAvecArgentTransfert);

    ActionUtilisateurAvecArgentTransfert find(Object id);

    List<ActionUtilisateurAvecArgentTransfert> findAll();

    List<ActionUtilisateurAvecArgentTransfert> findRange(int[] range);

    int count();
    
}
