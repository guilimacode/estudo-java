package guilimacode.estudojava.javacore.construtores.test;


import guilimacode.estudojava.javacore.construtores.domain.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new Serie("Dark", "TV", 34, "Suspense");
        serie.imprime();
    }
}
