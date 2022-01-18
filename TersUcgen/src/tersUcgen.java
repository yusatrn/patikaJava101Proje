import java.util.Scanner;

public class tersUcgen {

    public static void main(String[] args) {
        int sayı;
        System.out.print("Basamak Sayısı Giriniz ");
        Scanner scanner = new Scanner(System.in);
        sayı=scanner.nextInt();
       for (int i =sayı;i>0;i--){
           for(int j = sayı ; j > i - 1 ; j--){
               System.out.print(" ");
           }

           for(int k = 1 ; k <= 2 * i - 1 ; k++){
               System.out.print("*");
           }
           System.out.println();
       }

    }
}
