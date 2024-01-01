import java.util.Arrays;

public class SmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        //1365. How Many Numbers Are Smaller Than the Current Number
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            result[i] = smallerCount(nums, i);
        }
        return result;
    }
    public static int smallerCount(int[] nums, int index){
        int count =0;
        for(int i=0; i< nums.length;i++){
            if(nums[index]>nums[i]){
                count++;
            }
        }
        return count;
    }
}
