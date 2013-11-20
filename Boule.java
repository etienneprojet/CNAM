/**
 * Date: 20/11/13
 * Time: 11:00
 */
public class Boule {


    private final int VALEUR_MAX_NUM = 49;
    private int boule;

    public Boule() {

        boule = 1;
    }

    public void lancer() {

        boule = (int) (Math.random() * VALEUR_MAX_NUM) + 1;
    }

    public int valeurBoule() {

        return boule;
    }
}
