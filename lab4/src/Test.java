/**
 * Created by Michał on 2015-12-03.
 */
public class Test {
    public static void main(String args[]){
        Firma firma = new Firma();
        firma.listaPlac();

        firma.dodaj(new Robotnik("Nowy", 1, 200, 10));
        firma.listaPlac();

        firma.listaRobotnikow();
        firma.usun("Mocek");

        firma.listaPlac();
    }
}
