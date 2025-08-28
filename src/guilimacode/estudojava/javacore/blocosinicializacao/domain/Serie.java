package guilimacode.estudojava.javacore.blocosinicializacao.domain;

public class Serie {
    private String nome;
    private int[] episodios;

    //1 - Alocando espaço em memória pro objeto.
    //2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado.
    //3 - Bloco de inicialização é executado.
    //4 - Construtor é executado.

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Serie(String nome) {
        this.nome = nome;
    }

    public Serie() {
        for (int episodio : this.episodios) {
            System.out.println(episodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
