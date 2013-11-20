/**
 * Date: 20/11/13
 * Time: 11:06
 */
public class Joueur {

    private boolean gagne;
    private Boule[] boules;

    public Joueur() {

        gagne = false;
        boules = new Boule[6];
    }

    public void jouer() {

        for(Boule b : boules) {

            b.lancer();
        }

        Jackpot jackpot = new Jackpot();
        for (Boule b : boules) {

            jackpot.mesNums(b.valeurBoule());
        }

        if(jackpot.jackpot()){

            gagne = true;
        }
    }

    public boolean aGagne() {

        return gagne;
    }
}
