package guilimacode.estudojava.javacore.introducaometodos.test;

import guilimacode.estudojava.javacore.introducaometodos.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(18);
        pessoa.setNome("Maria");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
