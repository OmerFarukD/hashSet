import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // HashMap : Anahtar - değer çiftleri şeklinde verileri saklamamızı sağlar.
        //hashSetMetod();
       // hashMapMetod();
        uygulama();
    }

    public static void hashSetMetod(){
        // HashSet :  HashSet tekrarlanamayan verileri saklamamıza yarar.

        HashSet<String> isimler = new HashSet<>();
        isimler.add("Ömer");
        isimler.add("Faruk");
        isimler.add("Doğan");
        isimler.add("Ömer");
        isimler.add("Faruk");
        isimler.add("Doğan");

        for(String isim : isimler){
            System.out.println(isim);
        }
    }

    public static void hashMapMetod(){
        // todo: Bir manav uygulamasının meyve adı ve değerilerini ekrana gösteren uygulamayı yazınız.
        //   Meyve adı (String) -> Değeri(Double)

        HashMap<String,Double> meyveler = new HashMap<>();
        meyveler.put("Elma",35.45);
        meyveler.put("Armut",25.35);
        meyveler.put("Karpuz",10.25);
        meyveler.put("Üzüm",10.55);

        System.out.println(meyveler.get("Elma"));

        // Manav hashMap inde Kayısı var mı yok mu kopntrolü

        System.out.println("Manav uygulamamızda Kayısı var mı : "+ meyveler.containsKey("Kayısı"));
        System.out.println("Manav uygulamamızda Karpuz var mı : "+ meyveler.containsKey("Karpuz"));
        System.out.println("Manav uygulamamızda değeri 35.45 olan bir ürün var mı : "+meyveler.containsValue(35.45));
        System.out.println("Manav uygulamamda kaç tane meyve var : "+meyveler.size());
       // meyveler.remove("Üzüm");
        System.out.println("Manav uygulamamda kaç tane meyve var : "+meyveler.size());


        // todo: sözlükler üzerinde döngüler
        // Anahtar verilerini kullanarak döngü oluşturmak
        for (String key : meyveler.keySet()){
            System.out.println("Meyve adı : "+ key+" , Değeri : "+meyveler.get(key));
        }
        System.out.println("**********************************************************************************");
        // Map.Entry yöntemi kullanrak
        for (Map.Entry<String,Double> entry : meyveler.entrySet()){
            System.out.println("Meyve adı : "+ entry.getKey()+" , Değeri : "+entry.getValue());
        }
    }

    // todo : kullanıcıdan kaç adet meyve girmesini isteyiniz.
    // sonrasında kullanıcının istediği kadar meyve ve değerini alınız.
    // girilen meyvelerin değerlerini ekrana çıktı olarak gösteriniz.
    public static void uygulama(){
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> meyveler;
        int adet = adetAl(scanner);
        meyveler = meyveAl(scanner,adet);
        ekranaYazdir(meyveler);
    }

    public static  int adetAl(Scanner scanner){
        System.out.println("Lütfen girmek istediğiniz meyve adetini yazınız.");
        int adet = scanner.nextInt();
        scanner.nextLine();
        return adet;
    }

    public static HashMap<String,Integer> meyveAl(Scanner scanner,int adet){

        HashMap<String,Integer> meyveler = new HashMap<>();
        for (int i =0 ; i<adet; i++){
            System.out.println("Lütfen "+(i+1) +". meyve adını giriniz : ");
            String ad = scanner.nextLine();


            System.out.println("Lütfen "+(i+1) +". meyve değerini giriniz : ");
            int deger = scanner.nextInt();
            scanner.nextLine();

            meyveler.put(ad,deger);
        }

        return meyveler;
    }

    public static void ekranaYazdir(HashMap<String,Integer> fruits){

        for (String key : fruits.keySet()){
            System.out.println("Meyve adı : "+ key+" , Değeri : "+fruits.get(key));
        }

    }


}