import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int kilo;
        double boy,kitle;
        Scanner deger = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz = ");
        kilo=deger.nextInt();
        System.out.print("Boyunuzu giriniz = ");
        boy=deger.nextDouble();
        kitle=kilo/boy*boy;
        System.out.println("Vücut Kitle İndeksiniz = "+kitle);

    }
}
