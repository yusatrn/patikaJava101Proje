import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km;
        double Kmhesap;
        Scanner veri = new Scanner(System.in);
        System.out.print("Mesafeyi Km olarak giriniz.. ");
        km=veri.nextInt();
        Kmhesap=10+(km*2.20);
        if (Kmhesap<20){
            System.out.println("Minimum ödenecek tutar 20 TL");
        }
        else {
            System.out.println("Ödenecek tutar: "+ Kmhesap);
        }
 public static void log(){
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String log = scan.next();

        boolean x=true;
        for(int i=0;i<attendeesOfMeeting.size();i++){
            if (log.equals(attendeesOfMeeting.get(i).getName())){
                pUser=attendeesOfMeeting.get(i);
                System.out.println(pUser.getName()+" has logged in.");
                x=false;
            } 
        }
        if(x){
            System.out.println("there is no such person.");
            log();
        }

    }

    }
}
