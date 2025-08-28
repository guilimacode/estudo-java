package guilimacode.estudojava.javacore.associacao.test;

import guilimacode.estudojava.javacore.associacao.domain.Jogador;
import guilimacode.estudojava.javacore.associacao.domain.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Time time = new Time("Inter Miami");

        jogador1.setTime(time);
        jogador1.imprime();

    }
}
