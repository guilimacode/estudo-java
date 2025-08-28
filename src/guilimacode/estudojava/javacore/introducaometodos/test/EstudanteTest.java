package guilimacode.estudojava.javacore.introducaometodos.test;

import guilimacode.estudojava.javacore.introducaometodos.domain.Estudante;
import guilimacode.estudojava.javacore.introducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Guilherme";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        estudante2.nome = "Julia";
        estudante2.idade = 23;
        estudante2.sexo = 'F';

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprimeEstudante(estudante1);
        impressora.imprimeEstudante(estudante2);

        estudante1.Imprime();
        estudante2.Imprime();


    }
}
