import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        //A person is eligible to vote if his/her age is greater than or equal to 18.
        // Define a method to find out if he/she is eligible to vote.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();
        System.out.println(elegible(age));
    }

    private static boolean elegible(int age) {
        return age >= 18;
    }
}
