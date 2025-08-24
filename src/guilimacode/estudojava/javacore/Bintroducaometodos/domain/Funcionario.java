package guilimacode.estudojava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salario == null) {
            return;
        }

        for (double valor : this.salario) {
            System.out.println(valor + " ");
        }

    }

    public void calcularMediaSalario() {
        double somaSalario = 0.0;
        double mediaSalario = 0.0;

        if (salario == null) {
            return;
        }

        for (double salario : salario) {
            somaSalario += salario;
        }
        mediaSalario = somaSalario / this.salario.length;
        System.out.println("Média salárial: "  + mediaSalario);
    }
}

