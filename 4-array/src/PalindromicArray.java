public class PalindromicArray {
    public static void main(String[] args) {
        int[] a = {111, 222, 333, 444, 555};
        int n =5;
        System.out.println(palinArray(a, n));
    }

    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if(!palindrome(a[i])){
                return 0;
            }
        }
        return 1;
    }
    public static boolean palindrome(int x){
        int temp = x;
        int num =0;
        int r =0;
        while(temp>0){
            r =temp%10;
            num = (num*10) + r;
            temp/=10;
        }
        return num==x;
    }
}
