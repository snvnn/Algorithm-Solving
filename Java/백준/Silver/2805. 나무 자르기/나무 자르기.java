import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input1 = reader.readLine().split(" ");
        int[] trees = new int[Integer.parseInt(input1[0])];
        int need = Integer.parseInt(input1[1]);

        String[] input2 = reader.readLine().split(" ");
        int max = 0;
        int ans = 0;

        for (int i = 0; i < trees.length; i++) {
            trees[i] = Integer.parseInt(input2[i]);
            if (trees[i] > max)
                max = trees[i];
        }

        int left = 0;
        while (left <= max) {
            int pivot = (left + max) / 2;
            long sum = 0;

            for (int i = 0; i < trees.length; i++) {
                if (trees[i] > pivot) {
                    sum += trees[i] - pivot;
                }
            }

            if (sum < need) {
                max = pivot - 1;
            } else {
                left = pivot + 1;
                ans = Math.max(pivot, ans);
            }
        }

        System.out.println(ans);
    }
}
