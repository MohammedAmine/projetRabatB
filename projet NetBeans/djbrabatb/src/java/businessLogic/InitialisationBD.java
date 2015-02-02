package businessLogic;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import persistence.Administrateur;
import persistence.Client;
import persistence.Compte;
import persistence.CompteCourant;
import persistence.CompteEpargne;

/**
 * Cette classe initialise la base de données, c'est un EJB singleton instancié
 * une seule fois par le conteneur EJB au déploiement de l'application
 */
@Singleton
@Startup
public class InitialisationBD {

    /**
     * injection ejb client
     */
    @EJB
    private ClientFacade clientFacade;

    /**
     * injection ejb administrateur
     */
    @EJB
    private AdministrateurFacade administrateurFacade;

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

        CompteCourant compteCourant;

        CompteEpargne compteEpargne;

        float soldeCompte;
        
        List<Compte> listeComptes;

        System.out.println("Initialisation de la base de données...");

        // créer des clients et comptes
        for (int i = 0; i < 100; i++) {

            
            listeComptes = new LinkedList<>();
            
            // créer un compte épargne
            compteEpargne = new CompteEpargne("OUVERT", (float) 1.1);
            soldeCompte = (float) 0.0;
            compteEpargne.setCompteSolde(soldeCompte);
            listeComptes.add(compteEpargne);

            // créer 3 comptes courants
            for (int j = 0; j < 3; j++) {

                compteCourant = new CompteCourant();
                soldeCompte = (float) ((float) Math.random() * Math.random() * 10000);
                compteCourant.setCompteSolde(soldeCompte);
                listeComptes.add(compteCourant);
            }

            // créer un client
            //client = new Client("monAdresse" + i, "email" + i + "@email.com", "monNom" + i, "monPrenom" + i, "0000" + i,listeComptes,"monLogin" + i);
            client = new Client("monAdresse" + i, "email" + i + "@email.com", "monNom" + i, "monPrenom" + i, "0000" + i,"monLogin" + i);
            // enregistrer le client
            clientFacade.create(client);

        }

        System.out.println("Creation des clients (100) SUCCESS");
        System.out.println("    |---- Creation des comptes SUCCESS");
        System.out.println("        |---- Creation 1 compte épargne par client SUCCESS");
        System.out.println("        |---- Creation 3 comptes courants par client SUCCESS");

        // créer des administrateur
        for (int i = 0; i < 3; i++) {
            administrateur = new Administrateur("admin" + i);
            administrateurFacade.create(administrateur);
        }

        System.out.println("Creation des administrateurs (3) SUCCESS");

        //crees des depots 
        //creer des retrait
        //creer des transferts

        System.out.println("Initialisation de la base de données terminée.");

    }

}
