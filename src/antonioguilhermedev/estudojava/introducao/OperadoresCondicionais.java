package antonioguilhermedev.estudojava.introducao;

public class OperadoresCondicionais {
    public static void main(String[] args) {
        boolean is30BiggerThan20 = 30 > 20;
        boolean is30SmallerThan20 = 30 < 20;
        boolean isEqualTo20 = 20 == 20;
        boolean isEqualTo30 = 30 == 20;
        boolean isDifferentThan20 = 20 != 20;
        boolean isDifferentThan30 = 20 != 30;
        boolean isEqualOrBiggerThan20 = 30 >= 20;
        boolean isEqualOrSmallerThan30 = 40 <= 30;

        System.out.println(is30BiggerThan20);
        System.out.println(is30SmallerThan20);
        System.out.println(isEqualTo20);
        System.out.println(isEqualTo30);
        System.out.println(isDifferentThan20);
        System.out.println(isDifferentThan30);
        System.out.println(isEqualOrBiggerThan20);
        System.out.println(isEqualOrSmallerThan30);
    }
}
