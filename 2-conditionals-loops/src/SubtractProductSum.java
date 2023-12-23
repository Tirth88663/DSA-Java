import java.util.Scanner;

public class SubtractProductSum {
    // Subtract the Product and Sum of Digits of an Integer
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        int product = 1;
        while (num>0){
            sum += num % 10;
            product *= num%10;
            num/=10;
        }
        System.out.println(product-sum);
    }
}
