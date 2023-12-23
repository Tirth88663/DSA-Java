import java.util.Scanner;

public class SumOfAllNumbers {
    /*
    Write a program to print the sum of negative numbers, sum of positive even numbers
    and the sum of positive odd numbers from a list of numbers (N) entered by the user.
    The list terminates when the user enters a zero.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int negativeSum =0;
        int positiveOddSum=0;
        int positiveEvenSum=0;

        while (a!=0){
            //sum of negative numbers
            if (a<0){
                negativeSum+=a;
            } else if (a % 2 != 0) { //Sum of positive odd numbers
                positiveOddSum+=a;
            } else { //Sum of positive even numbers
                positiveEvenSum+=a;
            }
            a = in.nextInt();
        }
        System.out.println("sum of negative numbers : " + negativeSum);
        System.out.println("Sum of positive odd numbers : " + positiveOddSum);
        System.out.println("Sum of positive even numbers : " + positiveEvenSum);
    }
}
