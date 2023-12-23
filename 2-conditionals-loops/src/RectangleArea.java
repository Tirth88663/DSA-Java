import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double height = in.nextDouble();
        double width = in.nextDouble();
        System.out.println("Area of Rectangle : " + height*width);
    }
}
