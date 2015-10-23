package com.pwr;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.testujPodzielniki();
    }

    private void testujBook(){
        Book b1 = new Book("Potop", "H. Sienkiewicz", 400);
        b1.drukuj();
        b1.setSygnatura("hehe");
        System.out.println("Czy wypożyczona?" + b1.czyWypozyczona());
        b1.drukuj();
        b1.wypozycz();
        b1.drukuj();
        b1.wypozycz();
        b1.drukuj();
        b1.zwrot();
        b1.drukuj();
    }

    private void testujTrojkat(){
        Trojkat t1 = new Trojkat(5, 3, 1);
        t1.info();
        t1 = new Trojkat(4, 3, 5);
        t1.info();
        t1 = new Trojkat(3, 4, 6);
        t1.info();
        t1 = new Trojkat(4, 4, 4);
        t1.info();
        t1 = new Trojkat(5, 7, 5);
        t1.info();
    }

    private void testujPodzielniki(){
        Podzielniki.liczbyBedaceSumaPodzielnikow(100000);
    }
}
