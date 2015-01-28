
package businessLogic;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *Cette classe initialise la base de données, c'est un EJB singleton instancié une seule fois par
 * le conteneur EJB au déploiement de l'application
 */
@Singleton
@Startup
public class InitialisationBD {

    public InitialisationBD() {
    }
    
    /**
     * Cette méthode est excecutée au déploiement de l'application, après que l'injection de dépendance
     * soit effectuée
     */
    @PostConstruct
    public void initialiserBD(){
        System.out.println("InitialiserBD()");
    }
    
    
}
