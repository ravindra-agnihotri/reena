package encapsulation;

public class Leena {
    /**
     * encapsulation - having a private variable in class(it can only be accessed by class members)
     * and making it accessed outside of class by means of getter and setter methods
     */
    static private int atm= 50000;

    public static int getAtm() {
        return atm;
    }

    public static void setAtm(int paise) {
        Leena.atm = paise;
    }

    public static void aai(){

    }

    public static void baba(){

    }
}
