/**
 * Created by Michał on 2015-12-03.
 */
public class Firma {
    public final static int SIZE = 15;
    private Pracownik[] baza;


    public Firma(){
        baza = new Pracownik[SIZE];
        baza[0] = new Urzednik("Mocek", 1, 2500, 0.05);
        baza[1] = new Robotnik("Kowalski", 0.5, 90, 12);
        baza[2] = new Robotnik("Andrzejewski", 1, 160, 14);
        baza[3] = new Urzednik("Krowicki", 1.25, 2000, 0.1);
        baza[4] = new Urzednik("Krągły", 1, 3000, 0.15);
    }

    public Pracownik znajdz(String nazwisko){
        for(Pracownik p: baza){
            if(p != null){
                if(p.getNazwisko().equals(nazwisko)){
                    return p;
                }
            }
        }
        return null;
    }

    public void dodaj(Pracownik pracownik){
        for(Pracownik p: baza){
            if(p!= null && pracownik.getNazwisko().equals(p.getNazwisko())){
                System.out.println("Pracownik o tym nazwisku istnieje!");
                return;
            }
        }

        for(int i=0; i<SIZE; i++){
            if(baza[i] == null){
                baza[i] = pracownik;
                System.out.println("Dodano pracownika!");
                return;
            }
        }

        System.out.println("Baza jest pełna");
    }

    public void usun(String nazwisko){
        for(int i=0; i<SIZE; i++){
            if(baza[i] != null){
                if(baza[i].getNazwisko().equals(nazwisko)){
                    baza[i] = null;
                }
            }
        }
    }

    public int iluUrzednikow(){
        int ilosc=0;
        for(Pracownik p: baza){
            if(p != null && p.czyUrzednik()){
                ilosc++;
            }
        }
        return ilosc;
    }

    public int iluRobotnikow(){
        int ilosc=0;
        for(Pracownik p: baza){
            if(p != null && p.czyRobotnik()){
                ilosc++;
            }
        }
        return ilosc;
    }

    public double sumaWyplatUrzednikow(){
        int suma=0;
        for(Pracownik p: baza){
            if(p != null && p.czyUrzednik()){
                suma += p.wyplata();
            }
        }
        return suma;
    }

    public double sumaWyplatRobotnikow(){
        int suma=0;
        for(Pracownik p: baza){
            if(p != null && p.czyRobotnik()){
                suma += p.wyplata();
            }
        }
        return suma;
    }

    public void listaPracownikow(){
        System.out.println("Lp\tnazwisko\t\tgrupa\t\tetat");
        int lp = 1;
        String grupa;
        for(Pracownik p: baza){
            if(p!=null) {
                if (p.czyUrzednik()) grupa = "Urzednik";
                else grupa = "Robotnik";
                System.out.println(lp + "\t" + p.getNazwisko() + "\t\t" + grupa + "\t\t" + p.getEtat());
                lp++;
            }
        }
    }

    public void listaUrzednikow(){
        System.out.println("Lp\tnazwisko\t\tetat");
        int lp = 1;
        String grupa;
        for(Pracownik p: baza){
            if(p!=null && p.czyUrzednik()) {
                System.out.println(lp + "\t" + p.getNazwisko() + "\t\t" + p.getEtat());
                lp++;
            }
        }
    }

    public void listaRobotnikow(){
        System.out.println("Lp\tnazwisko\t\tetat");
        int lp = 1;
        String grupa;
        for(Pracownik p: baza){
            if(p!=null && p.czyRobotnik()) {
                System.out.println(lp + "\t" + p.getNazwisko() + "\t\t" + p.getEtat());
                lp++;
            }
        }
    }

    public void listaPlac(){
        System.out.println("Lp\tnazwisko\t\tgrupa\t\tetat\t\tpłaca");
        int lp = 1;
        String grupa;
        for(Pracownik p: baza){
            if(p!=null) {
                if (p.czyUrzednik()) grupa = "Urzednik";
                else grupa = "Robotnik";
                System.out.println(lp + "\t" + p.getNazwisko() + "\t\t" + grupa + "\t\t" + p.getEtat()+"\t\t" + p.wyplata());
                lp++;
            }
        }
    }

}
