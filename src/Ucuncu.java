import java.util.Scanner;

import static java.lang.System.*;

public class Ucuncu {
    private static Object heightM;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        System.out.println("Weight:" + " " + "kq");

        float weight = scanner.nextFloat();
        System.out.println("Height:" + " " + "sm");
        int height = scanner.nextInt();
        double heightM = height / 100.0;
        double bmi = weight/(heightM*heightM);
        System.out.println("BMI:"  + bmi);
      if (bmi<18.5){
          System.out.println("Zeif cekili");
      } else if (bmi>=18.5 && bmi <25) {
          System.out.println("Normal cekili");
      }
      else if (bmi >=25 && bmi < 29.9){
          System.out.println("Artiq cekili");
      }
        else {
          System.out.println("Obez");
        }
    }
}