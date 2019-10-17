package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static int sumaCifara(int br) {
        int suma=0;
        while (br != 0) {
            suma += br % 10;
            br /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {

        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesi cijeli broj: ");
        int vel =  ulaz.nextInt();
        for (int i = 1; i < vel; i++)
            if (i % sumaCifara(i) == 0)
                System.out.println(i);
    }
}
