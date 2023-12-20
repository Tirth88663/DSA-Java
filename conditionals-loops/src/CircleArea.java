import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double area = Math.PI * Math.pow(r,2);
        System.out.println("Area of Circle : " +area);
    }
}