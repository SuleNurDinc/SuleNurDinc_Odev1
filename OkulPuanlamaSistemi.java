package OkulPuanlamaSistemi;

import java.util.Random;

public class OkulPuanlamaSistemi {
    public static void main(String[] args) {
        Random random = new Random();
        int puan = random.nextInt(100);
        System.out.println("Puaniniz:" + puan);
        if(puan>=0 && puan<=35)
        {
            System.out.println("Sule FF harf notu ile basarisiz oldu.");
        }
        else if(puan<=50)
        {
            System.out.println("Sule DC harf notu ile gecti.");
        }
        else if(puan<=70)
        {
            System.out.println("Sule BB harf notu ile gecti.");
        }
        else if(puan<=100)
        {
            System.out.println("Sule AA harf notu ile gecti.");
        }

    }
}
