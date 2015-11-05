public class Main {
    public static void main(String[] args){
        Main main = new Main();
        main.testerTest();
    }

    private void testerTest(){
        Tester.drukujLiczbyPierwsze(100);
    }

    private void rkwadratoweTest(){
        Rkwadratowe r = new Rkwadratowe();
        r.obliczPierwiastki();

        r.pobierzDane(1, 2, 1);
        r.obliczPierwiastki();

        r.pobierzDane(0, -5, 20);
        r.obliczPierwiastki();

        r.pobierzDane(1, 7, 12);
        r.obliczPierwiastki();

        r.pobierzDane(1, 4, 4);
        r.obliczPierwiastki();

        r.pobierzDane(1, 5, 6);
        r.obliczPierwiastki();

        r.pobierzDane(0, 0, 0);
        r.obliczPierwiastki();

        r.pobierzDane(0, 0, 7);
        r.obliczPierwiastki();
    }
}
