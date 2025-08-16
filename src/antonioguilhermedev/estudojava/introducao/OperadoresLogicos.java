package antonioguilhermedev.estudojava.introducao;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 20;
        float salario = 4500F;
        boolean isAllowed = idade >= 30 && salario >= 4500F;
        boolean isNotAllowed = idade < 30 && salario >= 3500F;

        System.out.println(isAllowed);
        System.out.println(isNotAllowed);

        double totalAmountCC = 200;
        double totalAmountPP = 10000;
        float productPrice = 7840;

        boolean isProductPurchasable = totalAmountCC > productPrice || totalAmountPP > productPrice;
        System.out.println(isProductPurchasable);

    }
}
