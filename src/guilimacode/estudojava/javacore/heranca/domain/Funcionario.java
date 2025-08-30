package guilimacode.estudojava.javacore.heranca.domain;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Salario: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

}
