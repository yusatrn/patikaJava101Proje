package Atm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,kucuk,buyuk,sayı;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n=scanner.nextInt();
        int i=1;
        System.out.print("1. Sayıyı Giriniz : ");
        sayı=scanner.nextInt();
        kucuk=sayı;
        buyuk=sayı;
        do {
            System.out.print(i+" Sayıyı Giriniz : ");
            sayı=scanner.nextInt();
            if (sayı<kucuk){
                kucuk=sayı;
            }
            if (sayı>kucuk){
                buyuk=sayı;
            }
            i++;
        }
        while (n!=i);
        System.out.println("En küçük sayı : "+kucuk);
        System.out.println("En büyük sayı : "+ buyuk);


    }
}
