package guilimacode.estudojava.javacore.Bintroducaometodos.test;

import guilimacode.estudojava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10, 20);

        double result = calculadora.divideDoisNumeros(10,5);
        System.out.println(result);

        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro CalculadoraTest");
        System.out.println("Num1 "+a);
        System.out.println("Num2 "+b);

        int[] numeros = {1,2,3};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(12, 21, 32, 42, 42, 564, 45);
    }
}
