import java.util.Arrays;
import java.util.Scanner;

public class Ucuncu {

    public static void main(String[] args) {

         //Ədədləri tərsinə çap etmək
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        while (n > 0) {
//            n--;
//            System.out.println(n);
//        }

         //Ədədin rəqəmləri cəmi
//        System.out.print("Bir ədəd daxil edin: ");
//        int n = sc.nextInt();
//        int cem = 0;
//
//        while (n > 0) {
//            int qaliq = n % 10;
//            cem = cem + qaliq;
//            n = n / 10;
//        }
//
//        System.out.println("Rəqəmlərin cəmi: " + cem);
//
            //Palindrom
//        int n = sc.nextInt();
//        int original =n;
//        int reversed = 0;
//        while (n>0) {
//            int qaliq = n % 10;
//            reversed = reversed * 10 + qaliq;
//            n /= 10;
//        }
//            if(reversed == original){
//                System.out.println("Palindroumdur");
//            } else{
//                System.out.println("Palindrom deyil");
//            }


            //Cəmin hasilə nisbəti
//        System.out.print("Bir ədəd daxil edin: ");
//        int n = sc.nextInt();
//        int cem = 0;
//        int hasil = 1;
//
//        while (n > 0) {
//            int qaliq = n % 10;
//            cem += qaliq;
//            hasil *= qaliq;
//            n /= 10;
//        }
//
//        if (hasil == 0) {
//            System.out.println("Rəqəmlərdən biri 0 olduğu üçün hasil 0 oldu. Nisbət hesablanmır.");
//        } else {
//            double nisbet = (double) cem / hasil;
//            System.out.println("Ədədin rəqəmlərinin cəmi: " + cem);
//            System.out.println("Ədədin rəqəmlərinin hasili: " + hasil);
//            System.out.println("Cəmin hasilə nisbəti: " + nisbet);}

//                        Ədədin ikinci rəqəmini tapmaq
//        System.out.print("Bir ədəd daxil edin: ");
//        int n = sc.nextInt();
//        n = Math.abs(n);
//        String ededStr = Integer.toString(n);
//
//        if (ededStr.length() < 2) {
//            System.out.println("Ədədin ikinci rəqəmi yoxdur.");
//        } else {
//            char ikinciReqem = ededStr.charAt(1);
//            System.out.println("Ədədin ikinci rəqəmi: " + ikinciReqem);
//        }

             //Mükəmməl ədədlər
//        System.out.println("0-dan 500-ə qədər mükəmməl ədədlər:");
//
//        for (int n = 1; n <= 500; n++) {
//            int cem = 0;
//
//            for (int i = 1; i < n; i++) {
//                if (n % i == 0) {
//                    cem += i;
//                }
//            }
//
//            if (cem == n) {
//                System.out.println(n);
//            }
//        }
    }
}
