package com.pwr;


public class Podzielniki {

    public static void liczbyBedaceSumaPodzielnikow(int zakres){
        for(int i = 1; i<zakres; i++){
            if(czyJestSumaPodzielnikow(i)){
                System.out.print(i+", ");
            }
        }

    }


    public static boolean czyJestSumaPodzielnikow(int a){
        if(a == 1) {
            return true;
        }
        int suma = 0;
        for(int i=1; i<a; i++){
            if((a % i) == 0){
                suma += i;
            }
        }
        return suma == a;
    }
}
