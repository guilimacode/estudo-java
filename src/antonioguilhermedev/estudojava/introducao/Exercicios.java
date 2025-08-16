package antonioguilhermedev.estudojava.introducao;

public class Exercicios {
    public static void main(String[] args) {
        // Exercício 1: Conversor de Moedas
         double valorDolar = 10.0;
         double cotacaoAtual = 5.40;
         double valorReal =  valorDolar * cotacaoAtual;

         System.out.println("Valor em real: R$ " + valorReal);

        // Exercício 2: Cálculo de Média

        double n1 = 7.5;
        double n2 = 4.9;
        double n3 = 8.5;
        double media = (n1 + n2 + n3) / 3;

        System.out.println("Média do aluno: " + media);

        // Exercício 3: Informações Pessoais

        String nome = "Guilherme";
        int idade = 19;
        double altura = 1.75;
        boolean matriculado = true;

        System.out.println("Nome do aluno: " + nome + "\nAltura do aluno: " + altura + "\nIdade do aluno: " + idade + "\nEstá matriculado? " + matriculado);

        // Exercício 4: Verificador de Idade

        idade = 17;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Exercício 5: Par ou Ímpar

        int numero = 20;

        if (numero % 2 == 0) {
            System.out.println("PAR!");
        } else {
            System.out.println("Impar");
        }

        // Exercício 6: Classificação de Triângulos

        double ladoA = 7.5;
        double ladoB = 7.5;
        double ladoC = 7.5;

        if (ladoA == ladoB && ladoB == ladoC){
            System.out.println("Triangulo Equilátero");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC){
            System.out.println("Trangulo Isóceles");
        } else {
            System.out.println("Triangulo escaleno");
        }

        // Exercício 7: Contagem Regressiva

        for (int i = 10; i >= 1; i--) {
            System.out.println(i + "!");
        }
        System.out.println("Lançar!");

        // Exercício 8: Soma de 1 a 100

        int total = 0;

        for (int i = 1; i <= 100; i++) {
            total = total + i;
        }
        System.out.println(total);

        // Exercício 09: Tabuada de Multiplicação

        int numeroTabuada = 233;

        for (int i = 1; i <= 10; i++){
            System.out.println(numeroTabuada + " X " + i + " = " + (numeroTabuada * i));
        }

        // Exercicio 10:  Sequência de Fibonacci

        int n1Fibonacci = 0;
        int n2Fibonacci = 1;
        int limite = 10;

        System.out.print(n1Fibonacci + " " + n2Fibonacci);

        for (int i = 0; i <= limite; i++){
           int proximoTermo = n1Fibonacci + n2Fibonacci;

           System.out.println(proximoTermo);

           n1Fibonacci = n2Fibonacci;
           n2Fibonacci = proximoTermo;
        }

    }
}
