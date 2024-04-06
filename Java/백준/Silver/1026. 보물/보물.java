import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr1[i] * arr2[n-i-1];
        }
        System.out.println(sum);
    }
}
