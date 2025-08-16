package antonioguilhermedev.estudojava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizado = idade >= 18;

        if (isAutorizado) {
            System.out.println("Autorizado");
        } else  {
            System.out.println("Nao Autorizado");
        }

        boolean c = false;

        if (c = true) {
            System.out.println("C");
        }

        int hora = 16;

        if (hora >= 5 && hora <= 12) {
            System.out.println("Bom dia!");
        } else if (hora > 12 && hora < 18 ) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa Noite!");
        }
    }
}
