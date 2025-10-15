import java.util.Scanner;

public class Ucbucaq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a =");
        int a = scanner.nextInt();
        System.out.println("b=");
        int b = scanner.nextInt();
        System.out.println("c=");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b != c) {
                System.out.println("Beraberyanli ucbucaq");
            } else if ((a != b) && (b != c) && (a != c)) {
                System.out.println("Muxtelifterefli ucbucaq");

            } else if ((a == c) && (b == c)) {
                System.out.println("Beraberterefli ucbucaq");
            } else {
                System.out.println("Xeta!");
            }
        }
    }
}
