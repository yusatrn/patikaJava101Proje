package Main;

import java.util.Scanner;

public class Main {

    public static int don(int sayı, boolean durum, int sayac) {
        if (durum) {
            System.out.print(sayı + " ");
            if (sayı > 0) {
                sayac++;
                return don(sayı - 5, true, sayac);

            } else if (sayı <= 0) {
                sayac--;
                return don(sayı, false, sayac);
            }
            } else {
                System.out.print(sayı + " ");
                if (sayac > 0) {
                    sayac--;
                    return don(sayı + 5, false, sayac);
                }
            System.out.println(" ");
            }
            return 0;
        }

        public static void main (String[]args) {
            int sayac = 1, sayı=1;
            boolean durum = true;
            while (sayı!=0) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Sayı Giriniz : ");
                sayı=scanner.nextInt();
                if (sayı==0) {
                    System.out.print("Çıkış Yapılıyor");
                    break;
                }
                don(sayı, durum, sayac);

            }
        }
    }
