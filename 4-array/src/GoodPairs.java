public class GoodPairs {
    public static void main(String[] args) {
        //1512. Number of Good Pairs
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j >i; j--) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
