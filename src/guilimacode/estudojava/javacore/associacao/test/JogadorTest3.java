package guilimacode.estudojava.javacore.associacao.test;

import guilimacode.estudojava.javacore.associacao.domain.Jogador;
import guilimacode.estudojava.javacore.associacao.domain.Time;

public class JogadorTest3 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Guilherme");
        Time time = new Time("Inter Miami");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("-------JOGADOR--------");
        jogador.imprime();
        jogador2.imprime();

        System.out.println("------TIME-------");
        time.imprime();
    }
}
