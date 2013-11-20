/**
 * Date: 20/11/13
 * Time: 11:15
 */
public class Jackpot {

    private boolean un;
    private boolean deux;
    private boolean trois;
    private boolean quatre;
    private boolean cinq;
    private boolean six;

    public Jackpot() {

        this(false, false, false, false, false, false);
    }

    public Jackpot(boolean un, boolean deux, boolean trois, boolean quatre, boolean cinq, boolean six) {

        this.un = un;
        this.deux = deux;
        this.trois = trois;
        this.quatre = quatre;
        this.cinq = cinq;
        this.six = six;
    }

    public void mesNums(int valeur) {

        switch (valeur) {
            case 1 :
                un = true;
                break;
            case 2 :
                deux = true;
                break;
            case 3 :
                trois = true;
                break;
            case 4 :
                quatre = true;
                break;
            case 5 :
                cinq = true;
                break;
            case 6 :
                six = true;
                break;
            default :
                System.out.print(" pas de jackpot");
        }
    }

    public boolean jackpot() {

        return un && deux && trois && quatre && cinq && six;
    }
}
