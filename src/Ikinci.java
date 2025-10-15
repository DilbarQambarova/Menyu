import java.util.Scanner;
      public class Ikinci {
        public static <string> void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("a:");
            int a = sc.nextInt();
            System.out.println("b:");
            double b  = sc.nextDouble();
            System.out.println("c:");
            float c = sc.nextFloat();
            System.out.println("d:");
            long d  = sc.nextLong();
            System.out.println("e:");
            short e = sc.nextShort();
            System.out.println("f:");
            byte f = sc.nextByte();
            System.out.println("g:");
            boolean g = sc.nextBoolean();
            System.out.println("h:");
            String h = sc.nextLine();
            System.out.println("Butun deyerler:" + a + b + c + d + e + f + g + h);
    }
}
