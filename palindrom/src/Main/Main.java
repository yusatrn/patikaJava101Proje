package Main;

import java.util.Scanner;

public class Main {
    static boolean isPalindorm(int number){
    int temp=number,reverseNumber=0,lastnumber;
        while (temp!=0){
            System.out.println("=========================");
            System.out.println("Sayı = "+temp);
            lastnumber=temp%10;
            System.out.println("Son basamak = "+lastnumber);
            reverseNumber=(reverseNumber*10)+lastnumber;
            System.out.println("Yeni Sayı = "+reverseNumber);
            temp/=10;
        }
        if (number==reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
            if (isPalindorm(scanner.nextInt())==true)
                System.out.println(" Sayı Palindromdur ");
            else
                System.out.println("Sayı Palindrom değildir ");

    }
}
