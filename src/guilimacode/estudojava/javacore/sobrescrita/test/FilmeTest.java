package guilimacode.estudojava.javacore.sobrescrita.test;

import guilimacode.estudojava.javacore.sobrescrita.domain.Filme;

public class FilmeTest {
    public static void main(String[] args) {
        Filme filme = new Filme("Sociedade dos Poetas Mortos");
        System.out.println(filme.toString());
    }
}
