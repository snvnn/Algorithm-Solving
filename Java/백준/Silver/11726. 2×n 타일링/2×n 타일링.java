import java.util.*;

public class Main{
    public static long check(int a){
        long[] dp = new long[a+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] %= 10007;
        }

        return dp[a];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(check(num));
    }
}