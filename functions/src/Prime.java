import java.util.Arrays;
import java.util.Scanner;

public class Prime {
    //Write a function that returns all prime numbers between two given numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(checkPrime(num));

    }

    private static int checkPrime(int num) {
        int t = 2;
        if(num<=1){
            return 1;
        }
        for (int i = 2; i*i <=num ; i++) {
            if(num%i!=0){
                System.out.println("Prime");
                return 0;
            }
        }
        return 0;
    }
}
