import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int heat;
    boolean kayak=false,sinema=false,piknik=false,yüzme=false;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Değerini Giriniz =");
        heat=input.nextInt();
        if (heat<5){
            kayak=true;
        }
        if (heat>=5 && heat<=25)
            sinema=true;
        if (heat>=15 && heat<=25)
            piknik=true;
        if (heat>25)
            yüzme=true;

        if (kayak==true) {
            System.out.println("Kayak yapmaya gidelirsiniz");
        }
        else if (sinema==true){
            System.out.println("Sinemaya gidebilirsiniz");
            if (piknik==true)
            {
                System.out.println("Pinkik yapmaya gidebilirsiniz");

            }
        }

        else if (yüzme==true) {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
