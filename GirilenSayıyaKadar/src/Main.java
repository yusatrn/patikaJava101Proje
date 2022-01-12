import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayı;
        double toplam=0,ortalama,count=0;
        Scanner deger = new Scanner(System.in);
        System.out.print("Lütfen Sayıyı Giriniz : ");
        sayı=deger.nextInt();
        for (int i=1;i<= sayı;i++){
            if (i%3==0 && i%4==0){
                System.out.println("Bölünen sayılar : "+i);
                toplam+=i;
                count++;
            }
        }
        ortalama=toplam/count;
        System.out.println("Ortalama : "+ortalama);

    }
}
