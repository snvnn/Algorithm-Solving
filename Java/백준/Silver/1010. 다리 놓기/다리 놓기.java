import java.util.*;


public class Main {
    public static long combination(int left, int right) {
        int count = 1;
        int j = 1;
        for (int i = left+1; i <= right; i++) {
            count *= i;
            count /= j;
            j++;
        }

        return count;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();
        for (int i = 0; i < testcase; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            System.out.println(combination(left, right));
        }
    }
}
