package guilimacode.estudojava.javacore.construtores.domain;

public class Serie {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String diretor;

    public Serie(String nome, String tipo, int episodios,  String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Serie(String nome, String tipo, int episodios,  String genero, String diretor) {
        this(nome, tipo, episodios, genero);
        this.diretor = diretor;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.diretor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}

