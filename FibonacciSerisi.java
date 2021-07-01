package FibonacciSerisi;

import java.util.Random;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Random random = new Random();
        int sayi = random.nextInt(100), sayi1 = 0, sayi2 = 1, sayi3;
        if (sayi > 2) {
            System.out.println("Eleman sayısı " + (sayi + 1) + " olan Fibonacci dizisi: ");
            System.out.print(sayi1 + " " + sayi2);
                for (int i = 2; i <= sayi; i++) {
                    sayi3 = sayi1 + sayi2;
                    System.out.print(" " + sayi3);
                    sayi1 = sayi2;
                    sayi2 = sayi3;
                }
        }
        else {
            System.out.println(sayi);
            System.out.println("Fibonacci dizisi en az 3 eleman uzunluğunda olsun:)) ");
        }
    }
}
