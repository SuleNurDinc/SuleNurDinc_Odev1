package ManavKasaProgrami;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        /*
        Meyveler ve KG Fiyatları
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        */
        int armutKg = 3;
        int elmaKg = 2;
        int domatesKg = 2;
        int muzKg = 1;
        int patlicanKg = 1;

        System.out.println("Armut Kaç Kilo? : "+ armutKg);
        System.out.println("Elma Kaç Kilo? : "+ elmaKg);
        System.out.println("Domates Kaç Kilo? : "+ domatesKg);
        System.out.println("Muz Kaç Kilo? : "+muzKg);
        System.out.println("Patlıcan Kaç Kilo? : "+patlicanKg);


        double toplam = armutKg*2.14 + elmaKg*3.67 + domatesKg*1.11 + muzKg*0.95 + patlicanKg*5.00;

        System.out.print("Toplam Tutar : " + toplam + " TL");



    }
}
