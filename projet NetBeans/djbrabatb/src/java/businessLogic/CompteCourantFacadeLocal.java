/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import java.util.List;
import javax.ejb.Local;
import persistence.CompteCourant;

/**
 *
 * @author mohammedamine
 */
@Local
public interface CompteCourantFacadeLocal {

    void create(CompteCourant compteCourant);

    void edit(CompteCourant compteCourant);

    void remove(CompteCourant compteCourant);

    CompteCourant find(Object id);

    List<CompteCourant> findAll();

    List<CompteCourant> findRange(int[] range);

    int count();
    
}
