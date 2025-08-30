package guilimacode.estudojava.javacore.associacao.test;

import guilimacode.estudojava.javacore.associacao.domain.Time;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();

        scan.nextLine();

        System.out.println("Digite seu time: ");
        Time time = new Time(scan.nextLine());

        System.out.println("Digite seu salário: ");
        double salario = scan.nextDouble();

        System.out.println("Informações do Jogador: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Time: " + time.getNome());
        System.out.println("Salãrio: R$ " + salario);
    }
}
