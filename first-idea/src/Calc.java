import java.util.Scanner;

public class Calc {
    //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char op = in.next().trim().charAt(0);
        int a = in.nextInt();
        int b=in.nextInt();
        if(op == '+'){
            System.out.println(a+b);
        } else if (op == '-') {
            System.out.println(a-b);
        } else if (op == '*') {
            System.out.println(a*b);
        } else if (op=='/') {
            System.out.println(a/b);
        } else {
            System.out.println("Enter Valid Input");
        }
    }
}
