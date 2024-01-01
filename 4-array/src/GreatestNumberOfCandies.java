import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        //1431. Kids With the Greatest Number of Candies
        int[] candies = {2,3,5,1,3};
        int extra = 3;
        System.out.println(kidsWithCandies(candies, extra));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);

        for(int i=0;i<candies.length; i++){
            int sum = candies[i] + extraCandies;

            if(sum >= Arrays.stream(candies).max().getAsInt()){
                result.add(true);
            } else{
                result.add(false);
            }
        }

        return result;
    }
}
