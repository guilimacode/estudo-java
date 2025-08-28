package guilimacode.estudojava.javacore.modificadorstatic.domain;

public class Serie {
    private String nome;
    private static int[] episodios;

    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Serie(String nome) {
        this.nome = nome;
    }

    public Serie() {
        for (int episodio : Serie.episodios) {
            System.out.println(episodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
