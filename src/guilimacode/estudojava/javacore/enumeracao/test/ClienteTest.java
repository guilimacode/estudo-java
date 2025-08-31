package guilimacode.estudojava.javacore.enumeracao.test;

import guilimacode.estudojava.javacore.enumeracao.domain.Cliente;
import guilimacode.estudojava.javacore.enumeracao.domain.TipoCliente;
import guilimacode.estudojava.javacore.enumeracao.domain.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pessoa A", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Pessoa B", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
