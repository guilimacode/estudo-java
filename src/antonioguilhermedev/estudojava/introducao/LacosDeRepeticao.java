package antonioguilhermedev.estudojava.introducao;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        count = 1;

        do {
            System.out.println("dentro do while");
            count++;
        } while (count <= 10);


        for (int i = 0; i < 10; i++) {
            System.out.println("For" + i);
        }
    }
}
