import java.util.Scanner;

// name as input and print a greeting message for that particular name.
public class Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Welcome " + name);
    }
}
