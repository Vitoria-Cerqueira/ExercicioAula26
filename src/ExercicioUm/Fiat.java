package ExercicioUm;

public class Fiat extends Carro {
    public Fiat(String marca, String cor, int ano, double valor, int porta, double velocidade) {
        super("Fiat", cor, ano, valor, porta, 3);
    }
//    public void setVelocidade(double velocidade){
//        this.velocidade = velocidade;
//    }
    @Override
    public void iniciarPartida(){
        System.out.println("Iniciando motor...Minha velocidade está em: " + velocidade + "km/h");
    }
    public void freiar(){
        if (!(velocidade <= 6)){
            velocidade = velocidade -6;
            System.out.println("Freaindo...Minha velocidade está em: " + velocidade + "km/h");
        }else {
            System.out.println("Limite de velocidade, carro parado");
        }
    }
    @Override
    public void acelerar(){
        velocidade = velocidade + 12;
        System.out.println("Acelerando...Minha velocidade está em: " + velocidade + "km/h");
    }

}
