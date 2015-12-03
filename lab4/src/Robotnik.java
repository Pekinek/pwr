/**
 * Created by Michał on 2015-12-03.
 */
public class Robotnik extends Pracownik {
    public final static int LIMIT = 160;

    private int przepracowaneGodziny;
    private double stawkaGodzinowa;


    public Robotnik(String nazwisko, double etat, int przepracowaneGodziny, double stawkaGodzinowa){
        super(nazwisko, etat);
        this.przepracowaneGodziny=przepracowaneGodziny;
        this.stawkaGodzinowa=stawkaGodzinowa;
    }

    public double wyplata(){
        double wyplata = przepracowaneGodziny*stawkaGodzinowa;
        if(przepracowaneGodziny > etat*LIMIT){
            wyplata += (przepracowaneGodziny - (etat * LIMIT)) * 0.5 * stawkaGodzinowa;
        }
        return wyplata;
    }
}
