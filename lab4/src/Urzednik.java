/**
 * Created by Michał on 2015-12-03.
 */
public class Urzednik extends Pracownik {
    private double placaPodstawowa;
    private double premia;

    public Urzednik(String nazwisko, double etat, double placaPodstawowa, double premia){
        super(nazwisko, etat);
        this.placaPodstawowa=placaPodstawowa;
        this.premia=premia;
    }

    public double wyplata(){
        return placaPodstawowa * etat * (1+premia);
    }
}
