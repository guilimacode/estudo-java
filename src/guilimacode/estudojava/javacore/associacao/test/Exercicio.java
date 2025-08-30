package guilimacode.estudojava.javacore.associacao.test;

import guilimacode.estudojava.javacore.associacao.domain.Aluno;
import guilimacode.estudojava.javacore.associacao.domain.Local;
import guilimacode.estudojava.javacore.associacao.domain.ProfessorEx;
import guilimacode.estudojava.javacore.associacao.domain.Seminario;

public class Exercicio {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Felipe", 20);
        Aluno aluno2 = new Aluno("Julia", 23);
        Aluno aluno3 = new Aluno("Maria", 21);

        ProfessorEx professor = new ProfessorEx("Gilberto", "Machine Learning");

        Local local1 = new Local("Centro de Eventos");
        Local local2 = new Local("Casa da Cultura");

        Seminario seminario1 = new Seminario("A evolução da inteligencia artifical", local1);
        Seminario seminario2 = new Seminario("A inteligencia artificial e seus impactos na arte", local2);

        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario1);
        aluno3.setSeminario(seminario2);

        Seminario[] seminariosIA = {seminario1, seminario2};
        professor.setSeminarios(seminariosIA);

        seminario1.setProfessor(professor);
        seminario2.setProfessor(professor);

        Aluno[] alunos1 = {aluno1, aluno2};
        Aluno[] alunos2 = {aluno3};

        seminario1.setAlunos(alunos1);
        seminario2.setAlunos(alunos2);

        seminario1.imprime();
        seminario2.imprime();

        professor.imprime();

        aluno1.imprime();
        aluno2.imprime();
        aluno3.imprime();


    }
}
