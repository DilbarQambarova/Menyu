import java.util.Scanner;
import java.util.WeakHashMap;

public class dsdssd {
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
            if (sechim.equalsIgnoreCase("toplama")) {
                System.out.println("Nəticə:" + (a + b));
            } else if (sechim.equalsIgnoreCase("Çıxma")) {
                System.out.println("Nəticə:" + (a - b));
            } else if (sechim.equalsIgnoreCase("Vurma")) {
                System.out.println("Nəticə:" + (a * b));
            } else if (sechim.equalsIgnoreCase("Bölmə")) {
                System.out.println("Nəticə:" + (a / b));
            } else {
                System.out.println("xəta");
            }
        }
    }
}