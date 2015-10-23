package com.pwr;


public class Book {
    private String tytul;
    private String autor;
    private String sygnatura = "";
    private int strony;
    private int wypozyczone;

    public Book(String tytul, String autor, int strony){
        this.tytul = tytul;
        this.autor = autor;
        this.strony = strony;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setSygnatura(String sygnatura) {
        this.sygnatura = sygnatura;
    }

    public String getSygnatura() {
        return sygnatura;
    }

    public int getStrony() {
        return strony;
    }

    public void drukuj(){
        System.out.println("Tytul: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Strony: " + strony);
        if("".equals(sygnatura)){
            System.out.println("Sygnatura: ZZZZ");
        } else {
            System.out.println("Sygnatura: " + sygnatura);
        }
        System.out.println("Wypozyczona: " + czyWypozyczona());
    }

    public void wypozyczone(){
        wypozyczone = 1;
    }

    public void zwrot(){
        wypozyczone = 0;
    }

    public void wypozycz(){
        if(wypozyczone == 1){
            System.out.println("Tytul wypozyczony");
        } else {
            System.out.println("OK");
            wypozyczone = 1;
        }
    }

    public boolean czyWypozyczona(){
        return wypozyczone == 1;
    }
}
