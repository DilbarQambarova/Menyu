package Grade;

import java.util.Random;
import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String soz = "Java";
//        String daxilEdilen;
//
//        do {
//            System.out.print("Zəhmət olmasa sözü daxil edin: ");
//            daxilEdilen = sc.nextLine();
//        } while (!daxilEdilen.equals(soz));
//
//        System.out.println("OK");
//
                  //Daxil edilən ədədlərin cəmi
//       int eded = 0;
//       int cem = 0;
//        do {
//            System.out.print("Ədəd daxil edin: ");
//            eded = sc.nextInt();
//            cem += eded;
//        } while (eded != 0);
//
//        System.out.println("Daxil edilən ədədlərin cəmi: " + cem);
//    }


        //Təsadüfi ədəd
//    Random random = new Random();
//
//    int tesadufiEded = random.nextInt(10) + 1;
//    int daxilEdilen;
//    int cehdSay = 0;
//
//        do {
//        System.out.print("1–10 arasında ədəd daxil edin: ");
//        daxilEdilen = sc.nextInt();
//        cehdSay++;
//
//        if(daxilEdilen < tesadufiEded){
//            System.out.println("Yüksək ədəd seçin!");
//        } else if(daxilEdilen > tesadufiEded){
//            System.out.println("Aşağı ədəd seçin!");
//        }
//    } while(daxilEdilen != tesadufiEded);
//
//        System.out.println("Düzgün ədəd tapıldı: " + tesadufiEded);
//        System.out.println("Cəhd sayı: " + cehdSay);
//}
//

        int eded;
        int cem = 0;
        do {
            System.out.print("Ədəd daxil edin: ");
            eded = sc.nextInt();
            cem += eded;
            if (cem == 30) {

                System.out.println("Cəm 30 oldu.");
            }
        }while(cem < 30);

        if(cem > 30){
            System.out.println("Cəm 30-u keçdi: " + cem);
        }
    }
}



