import java.util.Scanner;

public class Main {
    public static int[] memo;

    public static int memoi(int n) {
        memo[1] = 0;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + 1;
            if (i % 2 == 0) {
                memo[i] = Math.min(memo[i], memo[i / 2] + 1);
            }
            if (i % 3 == 0) {
                memo[i] = Math.min(memo[i], memo[i / 3] + 1);
            }
        }
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        memo = new int[num + 1];

        System.out.println(memoi(num));
    }
}