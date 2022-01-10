import java.util.Scanner;

public class sifre {
    static String kullanıcı="patika";
    static String sifre="1456";
    public static void main(String[] args) {

        String hatalısifre=null,kullanıcı2,sifre2,yeni;
        Scanner input= new Scanner(System.in);
        int secim;
        System.out.println("Hoşgeldiniz Giriş Yapmak İçin 1 Seçiniz");
        secim=input.nextInt();
        if (secim==1){
            System.out.println("Kullanıcı Adını Giriniz");
            kullanıcı2= input.next();
            System.out.println("Şifrenizi Giriniz");
            sifre2=input.next();
            if (kullanıcı2.equals(kullanıcı) && sifre2.equals(sifre)){
                System.out.println("Giriş Başarılı İyi Günler dilerim "+kullanıcı);

            }
            else {
                System.out.println("Hatalı Giriş Yaptınız");
                hatalısifre=sifre2;
                System.out.println("Şifrenizi Sıfırlamak İster misiniz ?");
                System.out.println("1-Evet sıfırla\n 2-Hayır");
                secim=input.nextInt();
                switch (secim){
                    case 1:
                        System.out.println("Yeni Şifrenizi Giriniz"+input.nextLine());
                        yeni=input.next();
                        if (hatalısifre.equals(sifre) || yeni.equals(sifre)){
                            System.out.println("Şifreniz eskisi ile aynı olamaz");
                        }
                        else {
                            System.out.println("Şifre oluşturuldu");
                        }
                        break;
                    case 2:
                        System.out.println("İyi günler tekrar bekleriz");
                        break;
                }
            }
        }

    }
}
