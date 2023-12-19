import java.util.Scanner;

public class Armstrong {
    //Armstrong Number
    // 153 = 1^3 + 5^3 + 3^3
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count=0;
        int temp=num;
        int sum=0;
        while (temp>0){
            temp /= 10;
            count++;
        }

        for (int i = 0; i < count; i++) {
            temp = num%10;
            num/=10;
            sum += (int) Math.pow(temp, count);
        }
        if (sum == num ){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not");
        }
        System.out.println(sum);
    }
}
