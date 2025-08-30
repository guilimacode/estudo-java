package guilimacode.estudojava.javacore.heranca.test;

import guilimacode.estudojava.javacore.heranca.domain.Endereco;
import guilimacode.estudojava.javacore.heranca.domain.Funcionario;
import guilimacode.estudojava.javacore.heranca.domain.Pessoa;

public class HerancaTest1 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua A");
        endereco.setCep("023433-234");

        Pessoa pessoa = new Pessoa("Pessoa A");
        pessoa.setCpf("1234567890");
        pessoa.setEndereco(endereco);
        pessoa.imprimir();

        System.out.println("\n===============\n");

        Funcionario funcionario = new Funcionario("Fabio Akita", "1234567890", endereco, 5000);
        funcionario.imprimir();
        funcionario.relatorioPagamento();
    }
}
