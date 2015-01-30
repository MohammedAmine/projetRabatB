package businessLogic;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import persistence.Administrateur;
import persistence.Client;

/**
 * Cette classe initialise la base de données, c'est un EJB singleton instancié
 * une seule fois par le conteneur EJB au déploiement de l'application
 */
@Singleton
@Startup
public class InitialisationBD {
    @EJB
    private ClientFacade clientFacade;
    @EJB
    private AdministrateurFacade administrateurFacade;
    
    /**
     * injection ejb client
     */
     
     
     /**
      * injection ejb administrateur
      */
    

    /**
     * constructeur sans paramètres
     */
    public InitialisationBD() {
    }

    /**
     * Cette méthode est excecutée au déploiement de l'application, après que
     * l'injection de dépendance soit effectuée
     */
    @PostConstruct
    public void initialiserBD() {

        Client client;
        
        Administrateur administrateur;
        
        System.out.println("InitialiserBD()");
        
        for(int i=0;i<100;i++){
            client= new Client("monAdresse" + i, "email" + i + "@email.com", "monNom" + i, "monPrenom" + i, "0000" + i, "monLogin" + i);
            clientFacade.create(client);
        }
        
        System.out.println("Creation des clients (100) SUCCESS");
        
        for(int i=0;i<3;i++){
            administrateur = new Administrateur("admin"+i);
            administrateurFacade.create(administrateur);
        }
        
        System.out.println("Creation des administrateurs (3) SUCCESS");
        
        System.out.println("InitialiserBD() terminée");

    }

}
