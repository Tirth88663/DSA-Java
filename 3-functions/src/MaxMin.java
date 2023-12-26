import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        //Define two methods to print the maximum and the minimum number respectively
        // among three numbers entered by the user.
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = maximum(a,b,c);
        int min = minimum (a,b,c);
        System.out.println("Max : " + max + " " + "Min : " + min);
    }

    static int minimum(int a, int b, int c) {
        if(a<b){
            if(a<c){
                return a;
            } else {
                return c;
            }
        } else{
            if(b<c){
                return b;
            } else {
                return c;
            }
        }
    }

    static int maximum(int a, int b, int c) {
        if (a >b) {
            if(a>c){
                return a;
            }else{
                return c;
            }
        } else{
            if(b >c){
                return b;
            } else {
                return  c;
            }
        }
    }
}