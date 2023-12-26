import java.util.Arrays;
import java.util.Scanner;

public class PermutationArray {
    // 1920. Build Array from Permutation
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(buildArray(a)));
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}