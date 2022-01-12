import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int yıl;
        Scanner deger = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yıl=deger.nextInt();
        if ((yıl%4==0)&&(yıl%400!=0)&&(yıl%100!=0)){
            System.out.println(yıl+" Artık bir yıldır ");
        }
        else if((yıl%400==0)&& (yıl%100==0)&&(yıl%4==0))
        {
            System.out.println(yıl+" Artık bir yıldır");
        }
        else
            System.out.println(yıl+" Artık bir yıl değildir");
    }
}
