package antonioguilhermedev.estudojava.introducao;

public class Arrays {
    public static void main(String[] args) {
        int []idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;

        System.out.println("Idade: " +idades[0]);

        String []nomes = new String[3];
        nomes[0] = "Antonio";
        nomes[1] = "Maria";
        nomes[2] = "João";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        int []numeros = {1,2,3,4,5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int []numeros2 = new int[]{5,4,3,2,1};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        int []numeros3 = {1,2,3,4,5,6,7,8,9,10};

        for (int j : numeros3) {
            System.out.println(j);
        }

    }
}
