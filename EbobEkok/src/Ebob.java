import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {
        int s1,s2;
        int ekok=1,ebob=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Sayıyı Giriniz : ");
        s1=scanner.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        s2=scanner.nextInt();
        int i=s1;
        while (i>1){
            if (s1%i==0 && s2%i==0){
                ebob=i;
                ekok=(s1*s2)/ebob;
                break;
            }
            i--;
        }
        System.out.println("Ebob : "+ebob+" Ekok : "+ekok);
    }
}
