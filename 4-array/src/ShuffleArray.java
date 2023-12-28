import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    //1470. Shuffle the Array
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Value of n : ");
        int n = in.nextInt();
        int[] nums = new int[2*n];
        System.out.println("Enter array : ");
        for (int i = 0; i < (2 * n); i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums, int n){
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[2*i]=nums[i];
            ans[2*i+1] = nums[n+i];
        }
        return ans;
    }
}
