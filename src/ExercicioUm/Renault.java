package ExercicioUm;

public class Renault extends Carro {
    public Renault(String marca, String cor, int ano, double  valor, int porta, double velocidade){
        super("Renault", cor, ano, valor, porta, 0);
    }

    @Override
    public void iniciarPartida(){
        System.out.println("Iniciando motor...Minha velocidade está: " + velocidade + "km/h");
    }

    @Override
    public void freiar(){
        if (!(velocidade == 0)){
            velocidade = velocidade -5;
            System.out.println("Freiando...Minha velocidade está em: " + velocidade + "km/h");
        } else {
            System.out.println("Velocidade já está no minimo");
        }

    }

    @Override
    public void acelerar(){
        velocidade = velocidade + 10;
        System.out.println("Acelerando...Minha velovidade está em: " + velocidade + "km/h");
    }
}
