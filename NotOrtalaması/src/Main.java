import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik,ort;
        Scanner not = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz");
        mat= not.nextInt();
        System.out.println("Fizik Notunuzu Giriniz");
        fizik= not.nextInt();
        System.out.println("Kimya Notunuzu Giriniz");
        kimya= not.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz");
        turkce= not.nextInt();
        System.out.println("Tarih Notunuzu Giriniz");
        tarih= not.nextInt();
        System.out.println("Müzik Notunuzu Giriniz");
        muzik= not.nextInt();
        ort=(mat+kimya+turkce+fizik+tarih+muzik)/6;
        System.out.println("Not Ortalamanız : " +ort);
        while (ort>60){
            System.out.println("Sınıfı geçtiniz");
            break;
        }
        while (ort<60){
            System.out.println("Sınıfta kaldınız");
            break;
        }

    }
}
