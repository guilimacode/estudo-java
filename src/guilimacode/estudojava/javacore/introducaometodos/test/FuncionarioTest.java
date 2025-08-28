package guilimacode.estudojava.javacore.introducaometodos.test;

import guilimacode.estudojava.javacore.introducaometodos.domain.Funcionario;

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
