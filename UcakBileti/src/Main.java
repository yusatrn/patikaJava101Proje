import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int yas,mesafe;
        double yasindirimli,tutar,indirimli,gidisdonus,toplam,ikiyon;
        Scanner deger = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden yazınız : ");
        mesafe=deger.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        yas=deger.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        ikiyon=deger.nextInt();
        tutar=mesafe*0.10;
        if (mesafe<0 || yas<0 ||  (ikiyon!=1 && ikiyon !=2) ) {
            System.out.println("Hatalı Giriş Yaptınız");
        }
        else {
            if (yas < 12) {
                yasindirimli = tutar * 0.50;
                indirimli = tutar - yasindirimli;
                if (ikiyon ==2) {
                    gidisdonus = indirimli * 0.20;
                    toplam = (indirimli - gidisdonus) * 2;
                    System.out.println("Toplam Tutarınız : " + toplam);

                } else {
                    System.out.println("Toplam Tutarınız : " + indirimli);
                }
            } else if (yas >= 12 && yas < 24) {
                yasindirimli = tutar * 0.10;
                indirimli = tutar - yasindirimli;
                if (ikiyon == 2) {
                    gidisdonus = indirimli * 0.20;
                    toplam = (indirimli - gidisdonus) * 2;
                    System.out.println("Toplam Tutarınız : " + toplam);

                } else {
                    System.out.println("Toplam Tutarınız : " + indirimli);
                }
            } else if (yas >= 65) {
                yasindirimli = tutar * 0.30;
                indirimli = tutar - yasindirimli;
                if (ikiyon == 2) {
                    gidisdonus = indirimli * 0.20;
                    toplam = (indirimli - gidisdonus) * 2;
                    System.out.println("Toplam Tutarınız : " + toplam);

                } else {
                    System.out.println("Toplam Tutarınız : " + indirimli);
                }
            } else {
                if (ikiyon == 2) {
                    gidisdonus = tutar * 0.20;
                    toplam = (tutar - gidisdonus) * 2;
                    System.out.println("Toplam Tutarınız : " + toplam);

                } else {
                    System.out.println("Toplam Tutarınız : " + tutar);
                }
            }


        }

    }
}
