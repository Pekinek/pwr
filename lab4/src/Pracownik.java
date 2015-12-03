/**
 * Created by Michał on 2015-12-03.
 */
public abstract class Pracownik {
    protected String nazwisko;
    protected double etat;

    public Pracownik(String nazwisko, double etat){
        this.nazwisko=nazwisko;
        this.etat=etat;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getEtat() {
        return etat;
    }

    public boolean czyUrzednik(){
        return this instanceof Urzednik;
    }

    public boolean czyRobotnik(){
        return this instanceof Robotnik;
    }

    public abstract double wyplata();

}
