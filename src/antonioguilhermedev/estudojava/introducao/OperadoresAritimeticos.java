package antonioguilhermedev.estudojava.introducao;

import javax.xml.transform.Source;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        System.out.println(numero1 + numero2);

        System.out.println(numero2 - numero1);
        System.out.println(numero1 - numero2);

        System.out.println(numero2 / numero1);
        System.out.println(numero1 / (double) numero2);

        System.out.println(numero1 % numero2);
        System.out.println(numero2 % (double) numero1);
    }
}
