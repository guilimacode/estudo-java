package guilimacode.estudojava.javacore.modificadorfinal.test;

import guilimacode.estudojava.javacore.modificadorfinal.domain.Carro;
import guilimacode.estudojava.javacore.modificadorfinal.domain.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Ford");
        Comprador comprador2 = new Comprador();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Fernando");
        System.out.println(carro.COMPRADOR);
    }
}
