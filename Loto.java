/**
 * Date: 20/11/13
 * Time: 10:58
 */
public class Loto {


    private Joueur joueur;

    public Loto() {

        joueur = new Joueur();
    }

    public void tirage() {

        do {

            uneGrille();
        }
        while (perdu());

        resultats();
    }

    public void uneGrille() {

        joueur.jouer();
    }

    public boolean perdu() {

        boolean perdu = true;

        if(joueur.aGagne()) {

            perdu = false;
        }

        return perdu;
    }

    public void resultats() {

        if(joueur.aGagne()) {

            System.out.print("Le jackpot est sorti au bout de " + " tirages");
        }
    }
}
