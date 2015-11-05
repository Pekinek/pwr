public class Tester {
    public static boolean czyPierwsza(int a){
        if(a == 1) return false;
        double b = Math.sqrt(a);
        for(int i = 2; i<=b; i++){
            if((a % i) == 0) return false;
        }
        return true;
    }

    public static void drukujLiczbyPierwsze(int a){
        for(int i = 1; i<=a; i++){
            if(czyPierwsza(i)){
                System.out.print(i +", ");
            }
        }
    }
}
