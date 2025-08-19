package antonioguilhermedev.estudojava.javacore.Aintroducaoclasses.test;

import antonioguilhermedev.estudojava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Guilherme";
        estudante.idade = 20;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
