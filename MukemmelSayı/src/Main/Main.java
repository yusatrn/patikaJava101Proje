package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayı,bolen,toplam=0,i;
        System.out.print("Bir sayı giriniz : ");
        Scanner deger = new Scanner(System.in);
        sayı=deger.nextInt();
        for (i=1;i<sayı;i++){
            if (sayı%i==0)
                toplam+=i;
        }
        if (toplam==sayı)
            System.out.println(sayı+" Mukemmel Sayıdır");
        else
            System.out.println(sayı+" Mukemmel Sayı Değildir");

    }
}
