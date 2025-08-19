package antonioguilhermedev.estudojava.javacore.Aintroducaoclasses.test;

import antonioguilhermedev.estudojava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Mustang";
        carro.cor = "Azul";
        carro.ano = 1982;

        Carro carro2 = new Carro();
        carro2.modelo = "Fiesta";
        carro2.cor = "Preto";
        carro2.ano = 2005;

        System.out.println("MODELO: " + carro.modelo + " COR: " + carro.cor + " ANO: " + carro.ano);
        System.out.println("MODELO: " + carro2.modelo + " COR: " + carro2.cor + " ANO: " + carro2.ano);
    }

}
