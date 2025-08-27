package guilimacode.estudojava.javacore.sobrecargametodos.test;

import guilimacode.estudojava.javacore.sobrecargametodos.domain.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new Serie();
        serie.init("Dark", "TV", 34, "Suspense");
        serie.imprime();
    }
}
