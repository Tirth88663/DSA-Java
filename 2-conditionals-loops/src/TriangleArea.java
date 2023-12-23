import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double base = in.nextDouble();
        double height = in.nextDouble();

        double area = 0.5*base*height;
        System.out.println("Triangle Area : " + area);
    }
}
