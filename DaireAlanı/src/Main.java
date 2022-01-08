import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int r;
        double pi =3.14,olcu;
        Scanner inp = new Scanner(System.in);
        System.out.println("Yarıçap bulunur");
        r = inp.nextInt();
        System.out.println("Ölçüyü giriniz");
        olcu = inp.nextDouble();
        double dilim= (pi*(r*r)*olcu)/360;
        System.out.println("Dairenin dilim alanını = "+dilim);
    }
}
