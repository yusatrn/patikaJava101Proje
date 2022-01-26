package Main;

import java.util.Scanner;

public class Main {

    public static int  asal (int sayı){
        int sayac=0;
        if (sayı==1)
            System.out.print("Sayı Asaldır");
        for (int i=1;i<=sayı;i++)
        {
            if (sayı%i==0)
                sayac++;
        }
        return sayac;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayı=1;
        System.out.println("Çıkmak için 0 yazınız ");
        while (sayı!=0){
            System.out.print("Sayı Giriniz : ");
            sayı=scanner.nextInt();
            if (sayı==0) {
                System.out.println("Çıkış yapılıyor");
                break;
            }
                if (asal(sayı)>2)
                System.out.println(sayı+" Sayı Asal Değildir");
            else
                System.out.println(sayı + " Sayı Asaldır");
        }


    }
}
