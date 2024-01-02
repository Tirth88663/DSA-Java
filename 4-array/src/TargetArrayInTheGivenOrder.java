import java.util.ArrayList;
import java.util.Arrays;

public class TargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        //1389. Create Target Array in the Given Order
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            temp.add(index[i], nums[i]);
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }
        return result;
    }
}
