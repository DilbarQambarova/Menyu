import java.util.Scanner;
import java.util.WeakHashMap;

public class kalkulyator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Birinci ədədi daxil edin:");
            int a = scanner.nextInt();
            System.out.println("İkinci ədədi daxil edin:");
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Hansı əməliyyatı etmək istəyirsiniz?" + "\n" + "1.Toplama" + "\n" + "2.Çıxma" + "\n" +
                    "3.Vurma" + "\n" + "4.Bölmə");
            String sechim = scanner.nextLine();
            scanner.nextLine();
            switch (sechim) {
                case "toplama":
                    System.out.println("Nəticə:" + (a + b));

              break;
               case "Çıxma":
                System.out.println("Nəticə:" + (a - b));

               break;
                case "Vurma":
                    System.out.println("Nəticə:" + (a * b));
                break;

            case "Bölmə":
                System.out.println("Nəticə:" + (a / b));
            break;
            }
        }
    }
}
