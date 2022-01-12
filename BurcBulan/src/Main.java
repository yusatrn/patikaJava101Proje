import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            int gun,ay;
        Scanner deger = new Scanner(System.in);
        System.out.print("Lütfen doğdunuz ay giriniz = ");
        ay=deger.nextInt();
        System.out.print("Lütfen doğdunuz günü giriniz = ");
        gun=deger.nextInt();
        if (ay==1){
            if (gun<22){
                System.out.println("Burcunuz Oğlak");
            }
            else {
                System.out.println("Burcunuz Kova");
            }

        }
       else if (ay==2){
            if (gun<20){
                System.out.println("Burcunuz Kova");
            }
            else
                System.out.println("Burcunuz Balık");
        }
       else if (ay==3){
            if (gun<21){
                System.out.println("Burcunuz Balık");
            }
            else
                System.out.println("Burcunuz Koç");
        }
        else if (ay==4){
            if (gun<20)
                System.out.println("Burcunuz Koç");
            else
                System.out.println("Burcunuz Boğa");
        }
        else if (ay==5){
            if (gun<21)
                System.out.println("Burcunuz Boğa");
            else
                System.out.println("Burcunuz İkizler");
        }
        else if (ay==6){
            if (gun<22)
                System.out.println("Burcunuz İkizler");
            else
                System.out.println("Burcunuz Yengeç");
        }
       else if (ay==7){
            if (gun<22)
                System.out.println("Burcunuz Yengeç");
            else
                System.out.println("Burcunuz Aslan");
        }
        else if (ay==8){
            if (gun<20)
                System.out.println("Burcunuz Koç");
            else
                System.out.println("Burcunuz Boğa");
        }
        else if(ay == 8){
            if(gun < 23){
                System.out.println("Aslan");
            }
            else{
                System.out.println("Başak");
            }
        }
        else if(ay == 9){
            if(gun < 23){
                System.out.println("Başak");
            }
            else{
                System.out.println("Terazi");
            }
        }
        else if(ay == 10){
            if(gun < 23){
                System.out.println("Terazi");
            }
            else{
                System.out.println("Akrep");
            }
        }
        else if(ay ==11){
            if(gun < 22){
                System.out.println("Akrep");
            }
            else{
                System.out.println("Yay");
            }
        }
        else   if(ay == 12){
            if(gun < 22){
                System.out.println("Yay");
            }
            else{
                System.out.println("Oğlak");
            }
        }
        else
            System.out.println("Hatalı Ay Girişi Yaptınız");
    }
}
