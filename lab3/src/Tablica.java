import java.util.Random;

/**
 * Created by Michał on 2015-11-19.
 */
public class Tablica{
    private int[] tablica;
    private int rozmiar;

    public Tablica(int rozmiar){
        this.rozmiar = rozmiar;
        tablica = new int[rozmiar];
    }

    public void wypelnij(int zakres){
        Random r = new Random();
        for(int i=0; i<rozmiar; i++){
            tablica[i] = r.nextInt(zakres);
        }
    }

    public void wyswietl(){
        for(int i=0; i<rozmiar; i++){
            System.out.print(tablica[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

    public void minMax(){
        int indeksMin = 0;
        int indeksMax = 0;
        for(int i=0; i<rozmiar; i++){
            if(tablica[i] > tablica[indeksMax]){
                indeksMax = i;
            }
            if(tablica[i] < tablica[indeksMin]){
                indeksMin = i;
            }
        }
        System.out.println("Minimalna wartość: " + tablica[indeksMin] + ", Indeks: " + indeksMin);
        System.out.println("Maksymalna wartość: " + tablica[indeksMax] + ", Indeks: " + indeksMax);
    }

    public boolean czyWystepuje(int liczba, int zakres){
        if(zakres > rozmiar) zakres = rozmiar;
        for(int i = 0; i<zakres; i++){
            if(liczba == tablica[i]){
                return true;
            }
        }
        return false;
    }

    public boolean czyRoznowartosciowa(){
        for(int i=0; i<rozmiar; i++){
            for(int j=i+1; j<rozmiar; j++){
                if(tablica[i] == tablica[j]) return false;
            }
        }
        return true;
    }

    public void usunWszystkie(int liczba){
        for(int i=0; i<rozmiar; i++){
            if(tablica[i] == liczba){
                tablica[i] = tablica[rozmiar-1];
                tablica[rozmiar-1] = 0;
                rozmiar--;
            }
        }
    }
}
