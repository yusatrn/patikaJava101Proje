package Kuvvet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayı = scan.nextInt();
        System.out.print("4'ün Kuvvetleri : ");
        for (int i = 1; i <=sayı ; i*=4) {
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.print("5'ün Kuvvetleri : ");
        for (int i = 1; i <=sayı ; i*=5) {
            System.out.print(" "+i);
        }    }
}
