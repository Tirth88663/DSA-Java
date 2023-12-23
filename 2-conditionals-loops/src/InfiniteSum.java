import java.util.Scanner;

public class InfiniteSum {
    //Take integer inputs till the user enters 0 and print the sum of all numbers
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum=0;
        while (num!=0){
            sum += num;
            num = in.nextInt();
        }
        System.out.println("Sum : " + sum);
    }
}
