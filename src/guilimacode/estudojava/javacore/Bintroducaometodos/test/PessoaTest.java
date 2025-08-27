package guilimacode.estudojava.javacore.Bintroducaometodos.test;

import guilimacode.estudojava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(18);
        pessoa.setNome("Maria");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
