import java.util.Scanner;

public class Usd {
    //Input currency in rupees and output in USD.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter rupees : ");
        float r = in.nextFloat();
        System.out.println("$" + r/82);
    }
}
