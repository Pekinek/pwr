public class Rkwadratowe {
    private double a, b, c;

    public Rkwadratowe(){
        a = 1;
        b = 1;
        c = -2;
    }

    public void pobierzDane(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void wyswietlDane(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public void obliczPierwiastki(){
        if((a == 0) && (b == 0) && (c == 0)){
            System.out.println("Tożsamość");
        } else if((a == 0) && (b == 0) && (c != 0)){
            System.out.println("Sprzeczność");
        } else if(a == 0){
            System.out.println("x = " + (-c/b));
        } else{
            double delta = (b * b) - (4 * a * c);
            if(delta <0){
                System.out.println("Brak rozwiązań");
            } else if (delta == 0) {
                double rozwiazanie = -b / (2*a);
                System.out.println("x = " + rozwiazanie);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
