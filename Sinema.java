import java.util.Locale;
import java.util.Scanner;

public class Sinema {
    public static void main(String[] args) {
        double price = 30.0; //sinema bileti fiyatı 30 TL'dir.
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen izlemek istediginiz filmin turunu yaziniz:");
        String film_type= scan.nextLine(); //kullaniciden izleyecegi film turunu aliyoruz.
        System.out.print("Lutfen yasinizi giriniz:");
        int age = scan.nextInt(); //kullaniciden yasini aliyoruz.

        //Yas ve film turune göre fiyatta indirim uygunıp/uygulanmayacagi icin kontroller yapilir.
        if(age<18)
        {
           price -= price * 10 /100;
        }
        else if(age<25){
            price -= price * 5 /100;
        }
        film_type = film_type.toLowerCase(Locale.ROOT); //girilen film turunun tum harfleri kucuk harf yapilir.
        System.out.println(film_type);
        if(film_type.equals("korku") ){
            price -= price * 10 / 100;
        }

        System.out.println("Bilet fiyatiniz:" + price);
    }
}
