import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationArray {
    //1929. Concatenation of Array
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i <a.length; i++) {
            a[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(a)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}
