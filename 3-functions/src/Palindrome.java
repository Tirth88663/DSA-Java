import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Write a function to find if a number is a palindrome or not.
        // Take number as parameter.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(palindrome(a));
    }

    static boolean palindrome(int a) {
        int l =count(a);
        int temp = a;
        int ans =0;
        for (int i = 0; i < l; i++) {
            int t =temp%10;
            temp/=10;
            ans = ans*10 + t;
        }
        return ans == a;
    }

    static int count(int a) {
        int count = 0;
        while (a!=0){
            a/=10;
            count++;
        }
        return count;
    }
}
