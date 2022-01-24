package Main;

public class Main {
    static int fibo (int sayı)
    {
        if (sayı==1 || sayı== 2)
            return 1;

        return fibo(sayı-1)+fibo(sayı-2);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(fibo(6));
    }
}
