import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1= input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2=input.nextInt();

        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
        System.out.print("Seçiminiz : ");
        select=input.nextInt();

        switch (select)
        {
            case 1:
                System.out.println("Toplam :"+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma : "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma : " +(n1*n2));
                break;
            case 4:
                if (n2==0 || n1==0)
                    System.out.println("0 Sayı bölünemez");
                else
                System.out.println("Bölme : "+(n1/n2));
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız tekrar deneyiniz..");
                break;
        }
    }
}
