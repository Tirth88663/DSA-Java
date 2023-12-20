import java.util.Scanner;

public class LargestAmoungAll {
    //Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int largest = 0;
        while (input!=0){
            if (input>largest){
                largest = input;
            }
            input = in.nextInt();
        }
        System.out.println("Largest number : " + largest);
    }
}
