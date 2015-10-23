package src.com.pwr;


public class Podzielniki {

    public static void liczbyBedaceSumaPodzielnikow(int zakres){
        for(int i = 1; i<zakres; i++){
            if(Podzielniki.czyJestSumaPodzielnikow(i)){
                System.out.print(i+", ");
            }
        }

    }


    public static boolean czyJestSumaPodzielnikow(int a){
        int suma=0;
        if(a == 1) return true;
        for(int i=1; i<a; i++){
            if(a%i == 0){
                suma = suma + i;
            }
        }
        if(suma == a){
            return true;
        } else {
            return false;
        }
    }
}
