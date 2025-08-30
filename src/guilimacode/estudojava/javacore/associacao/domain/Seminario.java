package guilimacode.estudojava.javacore.associacao.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private ProfessorEx professor;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, ProfessorEx professor, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.professor = professor;
        this.local = local;
    }

    public void imprime(){
        System.out.println("\n===================");
        System.out.println("Informações do seminario:");
        System.out.println("Titulo: " + this.titulo);
        if (alunos == null) return;
        System.out.println("Alunos:");
        for (Aluno aluno : this.alunos){
            System.out.println(aluno.getNome());
        }
        if (professor == null) return;
        System.out.println("Professor: " + this.professor.getNome());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public ProfessorEx getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorEx professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}

