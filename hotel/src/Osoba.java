
public class Osoba {
    private String imie;
    private String nazwisko;
    private String pesel;

    public Osoba(String imie, String nazwisko, String pesel){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }
}
