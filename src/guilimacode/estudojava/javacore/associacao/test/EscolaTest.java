package guilimacode.estudojava.javacore.associacao.test;

import guilimacode.estudojava.javacore.associacao.domain.Escola;
import guilimacode.estudojava.javacore.associacao.domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Pedro");
        Professor professor2 = new Professor("Matias");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Escola A", professores);
        escola.imprime();
    }
}
