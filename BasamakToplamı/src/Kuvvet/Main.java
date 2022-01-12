package Kuvvet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      int a,numberCounter=0,basDeger=0,sonuc=0,copy;
        Scanner deger = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        a=deger.nextInt();
        copy=a;
        while (copy != 0) {
            copy /= 10;
            numberCounter++;
        }
        copy=a;
        for(int i=0;i<numberCounter;i++){
            basDeger=a%10;
            sonuc+=basDeger;
            a /=10;

        }
        System.out.println(copy+" Sayısının basamak toplamı : " + sonuc);

    }
}
