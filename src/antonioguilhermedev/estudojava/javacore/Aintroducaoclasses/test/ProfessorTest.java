package antonioguilhermedev.estudojava.javacore.Aintroducaoclasses.test;

import antonioguilhermedev.estudojava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Matias";
        professor.sexo = 'M';
        professor.idade = 53;

        System.out.println("Nome: " + professor.nome + "Idade: " + professor.idade +  "Sexo: " + professor.sexo);
    }
}
