/**
 * Created by Michał on 2015-11-19.
 */
public class App {
    public static void main(String[] args){
        Tablica t = new Tablica(10);
        t.wypelnij(40);
        t.wyswietl();
        t.minMax();
        System.out.println("Czy 5 wystepuje na pierwszych 10 pozycjach? " + t.czyWystepuje(5, 10));
        System.out.println("Czy różnowartościowa?: " + t.czyRoznowartosciowa());
        t.usunWszystkie(5);
        t.wyswietl();
    }
}
