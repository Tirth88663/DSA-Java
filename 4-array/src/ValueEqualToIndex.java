import java.util.ArrayList;

public class ValueEqualToIndex {
    public static void main(String[] args) {
        int[] arr = {15, 2, 45, 12, 7};
        int n = 5;
        System.out.println(valueEqualToIndex(arr, n));
    }
    public static ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i+1 == arr[i]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
