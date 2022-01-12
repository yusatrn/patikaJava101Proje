package Kuvvet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);

        int n;

        System.out.print("Sayı giriniz: ");
        n = deger.nextInt();

        double result = 0;

        for(int i = 1; i<=n;i++){
            result += (1.0/i);
        }

        System.out.println("Sonuç: "+ result);
    }
}
