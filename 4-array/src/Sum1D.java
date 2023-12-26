import java.util.Arrays;
import java.util.Scanner;

public class Sum1D {
    //1480. Running Sum of 1d Array
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(a)));
    }
    public static int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}
