import java.util.Scanner;

public class Palindrome {
    //To find out whether the given String is Palindrome or not.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length()-i-1)) {
                if (i==str.length()-1){
                    System.out.println("Palindrome");
                }
            }
        }
    }
}

