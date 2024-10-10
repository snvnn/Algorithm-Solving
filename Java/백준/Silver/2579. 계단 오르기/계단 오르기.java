import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int stairs = scanner.nextInt();
        int[] points = new int[stairs];
        int[] dp = new int[stairs];

        int sum = 0;
        for (int i = 0; i < points.length; i++) {
            int temp = scanner.nextInt();
            points[i] = temp;
            sum += temp;
        }

        if(stairs <= 2)
            System.out.println(sum);
        else{
            dp[0] = points[0];
            dp[1] = points[0]+points[1];

            for (int i = 2; i < points.length; i++) {
                if(i==2)
                    dp[i] = Math.max(points[i-1]+points[i], points[i-2]+points[i]);
                else
                    dp[i] = Math.max(dp[i-3]+points[i-1]+points[i], dp[i-2]+points[i]);
            }
            System.out.println(dp[dp.length-1]);
        }
    }
}