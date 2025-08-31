package guilimacode.estudojava.javacore.modificadorfinal.test;

import guilimacode.estudojava.javacore.modificadorfinal.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Ford");
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
