import java.util.Arrays;

public class RichestCustomerWealth {
    //1672. Richest Customer Wealth
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println(maximumWealth(a));
    }
    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for (int[] i : accounts) { // for array i in array accounts(2d/3d array)
            int sum = 0;
            for (int j : i) { // for int j in 1d array i
                sum += j;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
