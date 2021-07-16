import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Kirtasiye {
    public static void main(String[] args) {
        int sum=0,variety_num;
        //Kirtasiyedeki ürünleri giriyoruz.
        HashMap<String,Integer> products = new HashMap<>();
        products.put("Defter",50);
        products.put("Kalem",100);
        products.put("Silgi",70);
        products.put("Kitap",25);



        Collection<Integer> product_num= products.values(); //HashMap'in value'larini product_num'a atiyoruz.
        for(int product:product_num){ //Kirtasiye kac cesit urun oldugunu buluyoruz.
            sum += product;
        }
        System.out.println("Toplam alinan urun sayisi:"+ sum);

        Set<String> urunAdi = products.keySet(); // HashMap'teki keyleri urunAdi'ne atıyoruz.
        for(String urun:urunAdi) { //Urunleri ve urunlerin sayilarini bastiriyoruz.
            System.out.println( urun+ " sayisi:"+ products.get(urun));
        }

        variety_num=urunAdi.size(); //urun_Adi HashMap'in keylerini iceriyor. .size() ile kac tane urunumuz olduğunu buluyoruz.
        System.out.println("Kirtasiyede bulunan urun cesidi sayisi:"+variety_num);

    }
}

