import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int regions = scanner.nextInt();
        int[] budgets = new int[regions];

        int max = 0;

        for (int i = 0; i < budgets.length; i++) {
            budgets[i] = scanner.nextInt();
            if(budgets[i] > max)
                max = budgets[i];
        }
        int total = scanner.nextInt();

        int left = 0;
        int limit = 0;

        while(left <= max){
            int mid = (left + max) / 2;
            int sum = 0;
            for (int i = 0; i < regions; i++) {
                if(budgets[i] >=  mid)
                    sum += mid;
                else
                    sum += budgets[i];
            }

            if(sum > total)
                max = mid-1;
            else{
                left = mid + 1;
                limit = Math.max(mid, limit);
            }
        }
        System.out.println(limit);
    }
}
