package Main;

import java.util.Scanner;

public class Main {
    static int uslu(int sayı, int us){
        if (us == 0)
            return 1;
        return sayı * uslu(sayı, us - 1);


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban Değeri Giriniz : ");
        int taban =scanner.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        int us= scanner.nextInt();
        System.out.println("Sonuç : "+ uslu(taban,us));
    }
}
