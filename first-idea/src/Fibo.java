import java.util.Scanner;

public class Fibo {
    //To calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int temp;
        for (int i = 1; i < n; i++) {
            temp =a;
            a=b;
            b +=temp;
        }
        System.out.println(b);
    }
}
