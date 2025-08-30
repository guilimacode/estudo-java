package guilimacode.estudojava.javacore.associacao.domain;

public class ProfessorEx {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public ProfessorEx(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public ProfessorEx(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("\n===================");
        System.out.println("Informações do Professor:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (this.seminarios == null) return;
        System.out.println("Seminarios ministrados:");
        for (Seminario seminario : this.seminarios){
            System.out.println(seminario.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
