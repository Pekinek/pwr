package com.pwr;

public class Trojkat {
    private int a, b, c;

    public Trojkat(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        sortuj();
    }

    public void drukuj(){
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
    }

    private void sortuj(){
        int tmp;
        if(a>=b){
            tmp = a;
            a = b;
            b = tmp;
        }
        if(b>=c){
            tmp = b;
            b = c;
            c = tmp;
        }
        if(a>=b){
            tmp = a;
            a = b;
            b = tmp;
        }
    }

    public boolean czyMoznaZbudowac(){
        return a + b >= c;
    }

    public void info(){
        if(!czyMoznaZbudowac()){
            System.out.println("Nie można zbudować tego trójkąta");
        } else{
            System.out.println("Jest to trójkąt " + dlugosciBokow() + " i " + katyTrojkata());
        }
    }

    private String dlugosciBokow(){
        String opis;
        if((a == b) && (b == c)){
            opis = "równoboczny";
        }
        else if((a == b) || (b == c) || (a == c)){
            opis = "równoramienny";
        } else {
            opis = "różnoboczny";
        }
        return opis;
    }

    private String katyTrojkata(){
        String opis;
        if(((a * a) + (b * b)) > (c * c)){
            opis="ostrokątny";
        } else if(((a * a) + (b * b)) == (c * c)){
            opis="prostokątny";
        } else {
            opis="rozwartokątny";
        }
        return opis;
    }


}
