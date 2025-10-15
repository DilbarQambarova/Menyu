import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Balınızı daxil edin:");
        int score = scanner.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("Sizin qiymetiniz:A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Sizin qiymetiniz:B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Sizin qiymetiniz:C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Sizin qiymetiniz:D");
        } else if (score < 60) {
            System.out.println("Sizin qiymetiniz:F");
        } else {
            {
                System.out.println("Xeta!");
            }

        }
    }
}