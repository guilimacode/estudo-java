package guilimacode.estudojava.javacore.modificadorstatic.domain;

public class Carro {
    private String marca;
    private double velocidade;
    public static double velocidadeLimite = 250;

    public void imprime(){
        System.out.println("----------------------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidade Máxima: " + this.velocidade);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public Carro(String marca, double velocidade) {
        this.marca = marca;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

}
