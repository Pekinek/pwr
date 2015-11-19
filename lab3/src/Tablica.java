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
        for(int element: tablica){
            System.out.print(element);
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
        for(int i = 0; i<zakres; i++){
            if(liczba == tablica[i]){
                return true;
            }
        }
        return false;
    }

    public boolean czyRoznowartosciowa(){
        for(int i=0; i<rozmiar; i++){
            for
        }
    }
}
