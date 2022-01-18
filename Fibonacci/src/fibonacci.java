import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int say,a,b=1,c=0;
        System.out.print("Seri uzunluğu giriniz : ");
        Scanner scanner = new Scanner(System.in);
        say=scanner.nextInt();
        for (int i=0;i<say;i++)
        {

            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;

        }
    }
}
