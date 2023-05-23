package ExercicioUm;

public class Main {
    public static void main(String[] args){

        Renault logan = new Renault("", "Preto",2017,40000, 4, 0);
//        logan.iniciarPartida();
//        logan.freiar();
//        logan.acelerar();

        Fiat argo = new Fiat("", "Prata",2020, 60000,4,0);
//        argo.iniciarPartida();
//        argo.acelerar();
//        argo.freiar();

        Hyundai sonata = new Hyundai("", "Branco", 2021,80000,4,0);
        sonata.iniciarPartida();
        sonata.acelerar();
        sonata.freiar();
    }
}
