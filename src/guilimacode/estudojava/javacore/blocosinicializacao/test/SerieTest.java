package guilimacode.estudojava.javacore.blocosinicializacao.test;

import guilimacode.estudojava.javacore.blocosinicializacao.domain.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new  Serie("Breaking Bad");
        for (int episodio : serie.getEpisodios()) {
            System.out.println(episodio + " ");
        }
    }
}
