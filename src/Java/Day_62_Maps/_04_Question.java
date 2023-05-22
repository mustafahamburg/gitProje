package Java.Day_62_Maps;

import java.util.*;

public class _04_Question {
    public static void main(String[] args) {

     /* Kullaniciya...
        1-Ekleme
        2-Listeleme
        3-Arama
        4-Duzeltme
        5-Silme
        seceneklerini vererek userneme(key),passwoerd-usertyp(mudur,calisan) dsn olusan bir Map tanimlayiniz.
        kullanicinin secimine gore her islemi ayri methodda yaptiriniz
        mainde sadecec secenekler ve methodlarin cagrilmasi olsun
      */

        Map<String, Map<String,String>> users=new HashMap<>();
        Scanner oku=new Scanner(System.in);
        int secim=0;

        do {
            System.out.println("***MENU***");
            System.out.println("1-Ekleme");
            System.out.println("2-Listeleme");
            System.out.println("3-Arama");
            System.out.println("4-Duzeltme");
            System.out.println("5-Silme");
            System.out.print("Seciminiz = ");
            secim= oku.nextInt();

            switch (secim)
            {
                case 1:Ekleme(users);break;
                case 2:Listeleme(users);break;
                case 3:Arama(users);break;
                case 4:Duzeltme(users);break;
               // case 5:Silme(users);break;
                default:
                    System.out.println("Yanlis sayi girdiniz");

            }

            System.out.println("Tum kullanicilar "+users);

        }while (secim<6);

    }
    private static void Ekleme(Map<String,Map<String,String>> users){
        Scanner sc=new Scanner(System.in);

        System.out.println("Username= ");
        String username=sc.nextLine();

        System.out.println("Password= ");
        String password=sc.nextLine();

        System.out.println("UserType= ");
        String userType=sc.nextLine();

        Map<String,String> user=new HashMap<>();
        user.put("username",username);
        user.put("password",password);
        users.put(username,user);

    }
    private static void Listeleme(Map<String,Map<String,String>> users){

        Map<String,Map<String,String>>sortUsersL=new LinkedHashMap<>(users);// bu ayni kalacak
        Map<String,Map<String,String>>sortUsersT=new TreeMap<>(users);
        // key kismi kucukten buyuge gore siralanarak saklamnacak

    }
    private static void Arama(Map<String,Map<String,String>> users){
        Scanner oku=new Scanner(System.in);
        System.out.println("Aranan anahtar kelimeyi giriniz");
        String arananKelime= oku.nextLine();

        if (users.containsKey("username")){

            System.out.println("users.containsValue(\"Ahmet\") = " + users.containsValue("Ahmet"));
        }
    }
    private static void Duzeltme(Map<String,Map<String,String>> users){
        users.get("object").replace("String key","Yeni deger");
        users.get("Ahmet").put("Samet","Yeni deger verildi");

    }


}
