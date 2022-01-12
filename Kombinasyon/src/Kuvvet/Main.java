package Kuvvet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);
        System.out.print("N değerini giriniz : ");
        int n = deger.nextInt();
        int totaln=1,totalr = 1,totalrn=1;
        for (int i=1;i<=n;i++){
            totaln=totaln*i;
        }
        System.out.print("R değerini giriniz : ");
        int r = deger.nextInt();
        for (int j =1;j<=r;j++) {
            totalr = totalr * j;
        }
        for (int i =1;i<=n-r;i++){
            totalrn=totalrn*i;
        }
        int kombinasyon = totaln / (totalr * (totalrn));

        System.out.println("C(n,r) Kombinasyon Sonucu : " +kombinasyon);
    }
}
