import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tutar,kdvOran,kdvTutar,kdvFiyat;
        Scanner deger = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz");
        tutar=deger.nextDouble();
        if (tutar>0 & tutar<1000){
            kdvOran=0.18;
        }
        else {
            kdvOran=0.08;
        }
        kdvTutar=kdvOran*tutar;
        kdvFiyat=kdvTutar+tutar;
        System.out.println("KDV'siz Fiyat = "+tutar);
        System.out.println("KDV oranı = "+kdvOran);
        System.out.println("KDV tutarı = "+kdvTutar);
        System.out.println("KDV'li Fiyat = "+kdvFiyat);    }
}
