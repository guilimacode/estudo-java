package guilimacode.estudojava.introducao;

import java.sql.SQLOutput;

public class EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        int idade = 23;

        if (idade < 15) {
            System.out.println("Você pertence a categoria infantil!");
        } else if (idade >= 15 && idade <= 18) {
            System.out.println("Você pertence a categoria juvenil!");
        } else {
            System.out.println("Você pertence a categoria adulta!");
        }

        double salarioAnual = 44000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorASerPago;

        if (salarioAnual >= 0 && salarioAnual <= 34.712) {
            valorASerPago = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34.713 && salarioAnual <= 68.507) {
            valorASerPago = salarioAnual * segundaFaixa;
        }  else {
            valorASerPago = salarioAnual * terceiraFaixa;
        }
        System.out.println("Valor a ser pago em imposto: " + valorASerPago);
    }
}
