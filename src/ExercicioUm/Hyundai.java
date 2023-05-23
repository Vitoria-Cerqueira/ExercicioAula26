package ExercicioUm;

public class Hyundai extends Carro{
    public Hyundai(String marca, String cor, int ano, double valor, int porta, double velocidade) {
        super("Hyundai", cor, ano, valor, porta, 5);
    }

    @Override
    public void iniciarPartida(){
        System.out.println("Iniciando motor...Minha velocidade está: " + velocidade + "km/h");
    }
    @Override
    public void freiar(){
        if (!(velocidade <= 2)){
            velocidade = velocidade -2;
            System.out.println("Freaindo...Minha velocidade está em: " + velocidade + "km/h");
        }else {
            System.out.println("Limite de velocidade, carro parado");
        }
    }
    @Override
    public void acelerar(){
        velocidade = velocidade + 15;
        System.out.println("Acelerando...Minha velocidade está em: " + velocidade + "km/h");
    }
}
