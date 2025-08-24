package guilimacode.estudojava.introducao;

public class LacosDeRepeticaoExercicios {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int valorMax = 50;

        for  (int i = 0; i <= valorMax; i++) {
            if (i == 25) {
                break;
            }
            System.out.println(i);
        }

       double valorTotal = 40000D;

       for (int parcela = 1; parcela <= valorTotal; parcela++) {
           double valorParcela = valorTotal / parcela;
           if (valorParcela < 1000) {
               break;
           }
           System.out.println("Parcela " + parcela + ": R$ " + valorParcela);
       }
    }
}
