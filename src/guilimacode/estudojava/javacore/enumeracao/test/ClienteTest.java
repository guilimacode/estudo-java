package guilimacode.estudojava.javacore.enumeracao.test;

import guilimacode.estudojava.javacore.enumeracao.domain.Cliente;
import guilimacode.estudojava.javacore.enumeracao.domain.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pessoa A", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Pessoa B", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}
