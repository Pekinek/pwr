public class Pokoj {
    private Osoba osobaWynajmujaca;

    public Osoba getOsobaWynajmujaca() {
        return osobaWynajmujaca;
    }

    public void setOsobaWynajmujaca(Osoba osobaWynajmujaca) {
        this.osobaWynajmujaca = osobaWynajmujaca;
    }

    public boolean czyWolny(){
        return osobaWynajmujaca == null;
    }
    
    public void zwolnijPokoj(){
        osobaWynajmujaca = null;
    }
}
