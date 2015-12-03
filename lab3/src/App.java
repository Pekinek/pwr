/**
 * Created by Michał on 2015-11-19.
 */
public class App {
    public static void main(String[] args){
        testujTab2();
    }

    public static void testujTab1(){
        Tablica t = new Tablica(10);
        t.wypelnij(40);
        t.wyswietl();
        t.minMax();
        System.out.println("Czy 5 wystepuje na pierwszych 10 pozycjach? " + t.czyWystepuje(5, 10));
        System.out.println("Czy różnowartościowa?: " + t.czyRoznowartosciowa());
        t.usunWszystkie(5);
        t.wyswietl();
    }

    public static void testujTab2(){
        Tablica2 t = new Tablica2(4, 6, 10);
        t.wyswietlKolumnami();
        t.wyswietlWierszami();
        t.sumaElementow();
        t.wartoscMaksymalna();
        System.out.println("Czy wystepuje?: " + t.czyWystepuje(15)[1] + " " + t.czyWystepuje(15)[0]);
        t.najwiekszyWiersz();
    }
}
