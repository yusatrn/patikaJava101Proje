import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c;
        double d,alan;
        Scanner deger = new Scanner(System.in);
        System.out.println("1.Kenarı Giriniz");
        a= deger.nextInt();
        System.out.println("2.Kenarı Giriniz");
        b= deger.nextInt();
        System.out.println("3.Kenara Giriniz");
        c= deger.nextInt();
        d=(a+b+c)/2;
        System.out.println("Üçgenini Çevresi = "+(2*d));
        alan=d*(d-a)*(d-b)*(d-c);
        System.out.println("Üçgenin Alanı = "+Math.sqrt(alan));
    }
}
