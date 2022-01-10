import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int mat,fizik,turkce,kimya,muzik,say=0;
    double avare=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuz : ");
        mat=input.nextInt();
        if (mat>0 && mat<=100) {
            avare += mat;
            say++;
        }
        System.out.print("Fizik notunuz : ");
        fizik=input.nextInt();
        if (fizik>0 && fizik<=100) {
            avare += fizik;
            say++;
        }
        System.out.print("Türkçe notunuz : ");
        turkce=input.nextInt();
        if (turkce>0 && turkce<=100) {
            avare += turkce;
            say++;
        }
        System.out.print("Kimya notunuz : ");
        kimya=input.nextInt();
        if (kimya>0 && kimya<=100) {
            avare += kimya;
            say++;
        }
        System.out.print("Muzik notunuz : ");
        muzik=input.nextInt();
        if (muzik>0 && muzik<=100) {
            avare += muzik;
            say++;
        }
        avare=avare/say;
        if (avare <=55){
            System.out.println("Başarısız oldunuz seneye tekrar deneyiniz");
        }
         else {
            System.out.println("Tebrikler Sınıfı Geçtiniz.. ");
        }
        System.out.println("Ortalamanız : "+avare);

    }
}
