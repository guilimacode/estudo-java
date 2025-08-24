package guilimacode.estudojava.javacore.Bintroducaometodos.test;

import guilimacode.estudojava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario joao = new  Funcionario();
        joao.nome = "Joao";
        joao.idade = 48;
        joao.salario = new double[]{1400, 2000, 3280};

        joao.imprimeDados();
        joao.calcularMediaSalario();
    }
}
