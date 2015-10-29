public class Hotel {

    private Pokoj[] pokoje;

    public Hotel(int iloscPokoi){
        pokoje = new Pokoj[iloscPokoi];
    }

    public void wolnePokoje(){
        for(int i=0; i<pokoje.length; i++){
            if(pokoje[i].czyWolny()){
                System.out.print(i + ", ");
            }
        }
    }


}
