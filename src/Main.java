
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenyu:");
            System.out.println("1. Valyuta çevirici");
            System.out.println("2. Bədən kütlə indeksi");
            System.out.println("3. Vergi hesablayıcı");
            System.out.println("4. Qiymət kalkulyatoru");
            System.out.println("5. Taksi haqqı hesablayıcı");
            System.out.println("6. Üçbucaq növü təyini");

            int sechim = scanner.nextInt();
            scanner.nextLine(); // Enter düyməsini təmizləmək üçün

            if (sechim == 0) {
                System.out.println("Proqram dayandırıldı. Sağ olun!");
                break;
            }

            switch (sechim) {
                case 1:
                    // Valyuta çevirici
                    System.out.print("Məbləği daxil edin: ");
                    double mebleg = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Valyutanı daxil edin (AZN/USD/EUR): ");
                    String valyuta = scanner.nextLine();
                    System.out.print("Çevriləcəyi valyutanı daxil edin (AZN/USD/EUR): ");
                    String valyuta2 = scanner.nextLine();

                    double azntousd = 0.59;
                    double usdtoazn = 1.70;
                    double azntoeur = 0.54;
                    double eurtoazn = 1.85;
                    double usdtoeur = 0.92;
                    double eurtousd = 1.09;

                    if (valyuta.equalsIgnoreCase("azn") && valyuta2.equalsIgnoreCase("usd")) {
                        System.out.println(mebleg * azntousd + " USD");
                    } else if (valyuta.equalsIgnoreCase("usd") && valyuta2.equalsIgnoreCase("azn")) {
                        System.out.println(mebleg * usdtoazn + " AZN");
                    } else if (valyuta.equalsIgnoreCase("azn") && valyuta2.equalsIgnoreCase("eur")) {
                        System.out.println(mebleg * azntoeur + " EUR");
                    } else if (valyuta.equalsIgnoreCase("eur") && valyuta2.equalsIgnoreCase("azn")) {
                        System.out.println(mebleg * eurtoazn + " AZN");
                    } else if (valyuta.equalsIgnoreCase("usd") && valyuta2.equalsIgnoreCase("eur")) {
                        System.out.println(mebleg * usdtoeur + " EUR");
                    } else if (valyuta.equalsIgnoreCase("eur") && valyuta2.equalsIgnoreCase("usd")) {
                        System.out.println(mebleg * eurtousd + " USD");
                    } else {
                        System.out.println("Xəta! Düzgün valyuta daxil edin.");
                    }
                    break;

                case 2:
                    // BMI
                    System.out.print("Çəki (kq): ");
                    double weight = scanner.nextDouble();
                    System.out.print("Boy (sm): ");
                    int height = scanner.nextInt();
                    double heightM = height / 100.0;
                    double bmi = weight / (heightM * heightM);
                    System.out.println("Bədən kütlə indeksi: " + bmi);

                    if (bmi < 18.5) {
                        System.out.println("Zəif çəki");
                    } else if (bmi < 25) {
                        System.out.println("Normal çəki");
                    } else if (bmi < 30) {
                        System.out.println("Artıq çəki");
                    } else {
                        System.out.println("Obez");
                    }
                    break;

                case 3:
                    // Vergi hesablayıcı
                    System.out.print("Aylıq maaşınızı daxil edin: ");
                    double ayliqmaas = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Rezidentsiniz? (bəli/xeyr): ");
                    String cavab = scanner.nextLine();

                    double tax;
                    double netmaas;

                    if (cavab.equals("bəli")) {
                        if (ayliqmaas <= 500) tax = 0;
                        else if (ayliqmaas <= 2000) tax = ayliqmaas * 0.10;
                        else tax = ayliqmaas * 0.15;
                    } else {
                        tax = ayliqmaas * 0.20;
                    }

                    netmaas = ayliqmaas - tax;
                    System.out.println("Vergi: " + tax + " AZN, Net maaş: " + netmaas + " AZN");
                    break;

                case 4:
                    System.out.print("Balınızı daxil edin: ");
                    int score = scanner.nextInt();
                    if (score >= 90) System.out.println("Sizin qiymətiniz: A");
                    else if (score >= 80) System.out.println("Sizin qiymətiniz: B");
                    else if (score >= 70) System.out.println("Sizin qiymətiniz: C");
                    else if (score >= 60) System.out.println("Sizin qiymətiniz: D");
                    else System.out.println("Sizin qiymətiniz: F");
                    break;

                case 5:
                    System.out.print("Məsafəni km olaraq daxil edin: ");
                    double km = scanner.nextDouble();
                    System.out.print("Yaşınızı daxil edin: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Gecə vaxtıdırmı? (bəli/xeyr): ");
                    String answer = scanner.nextLine();

                    double acilis = 1.0;
                    double kmQiymet = 0.7;
                    if (answer.equals("bəli")) kmQiymet += 0.1;

                    double qiymet = acilis + (km * kmQiymet);
                    if (age < 12) qiymet *= 0.5;
                    else if (age >= 65) qiymet *= 0.7;

                    System.out.printf("Qiymət: %.2f AZN\n", qiymet);
                    break;

                case 6:
                    // Üçbucaq növü
                    System.out.print("a = ");
                    int a = scanner.nextInt();
                    System.out.print("b = ");
                    int b = scanner.nextInt();
                    System.out.print("c = ");
                    int c = scanner.nextInt();

                    if (a + b > c && a + c > b && b + c > a) {
                        if (a == b && b == c) System.out.println("Bərabərtərəfli üçbucaq");
                        else if (a == b || a == c || b == c) System.out.println("Bərabəryanlı üçbucaq");
                        else System.out.println("Müxtəliftərəfli üçbucaq");
                    } else {
                        System.out.println("Bu tərəflərlə üçbucaq düzəlmir!");
                    }
                    break;

                default:
                    System.out.println("Yanlış seçim etdiniz. Yenidən cəhd edin.");
            }
        }

    }
}