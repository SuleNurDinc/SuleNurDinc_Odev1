import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Vize Notunuzu Giriniz:");
        int midterm = scan.nextInt(); //kullaniciden vize notu alinir.
        System.out.print("Lutfen Final Notunuzu Giriniz:");
        int final_ = scan.nextInt(); //kullaniciden final notu alinir.

        int grade = midterm * 40 / 100 + final_ * 60 /100; //ogrencinin yil sonu notu hesaplanir.
        System.out.println("Yil sonu notunuz:"+grade);

        //yil sonu notuna gore harf notu hesaplamasi yapilir.
        if(grade>= 0 && grade<20){
            System.out.println("Harf Notunuz FF.");
        }

        else if(grade>= 20 && grade<50){
            System.out.println("Harf Notunuz CB.");
        }

        else if(grade>= 50 && grade<70){
            System.out.println("Harf Notunuz BB.");
        }
        else if(grade>= 70 && grade<=100){
            System.out.println("Harf Notunuz AA.");
        }

    }
}
