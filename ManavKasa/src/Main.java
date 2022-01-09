import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        double hesap;
        int a,e,d,m,p;
        System.out.print("Armut Kaç Kilo ? :" );
        a=b.nextInt();
        System.out.print("Elma Kaç Kilo ? :" );
        e=b.nextInt();
        System.out.print("Domates Kaç Kilo ? :" );
        d=b.nextInt();
        System.out.print("Muz Kaç Kilo ? :" );
        m=b.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? :" );
        p=b.nextInt();
        hesap=(a*2.14)+(e*3.67)+(d*1.11)+(m*0.95)+(p*5.00);
        System.out.println("Toplam Tutar = " +hesap + " TL");
    }
}
