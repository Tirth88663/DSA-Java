import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int factorial = 0;
        for (int i = num - 1; i > 1; i--) {
            factorial = num * i;
        }
        System.out.println("Factorial : " + factorial);
    }
}
