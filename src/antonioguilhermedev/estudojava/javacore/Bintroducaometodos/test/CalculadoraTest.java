package antonioguilhermedev.estudojava.javacore.Bintroducaometodos.test;

import antonioguilhermedev.estudojava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10, 20);

        double result = calculadora.divideDoisNumeros(10,5);
        System.out.println(result);
    }
}
