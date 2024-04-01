import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int period = scanner.nextInt();
        int max = 0;
        int count = 0;

        int[] visits = new int[days];

        for (int i = 0; i < days; i++) {
            visits[i] = scanner.nextInt();
            if(max < visits[i])
                max = visits[i];
        }

        if(period > 1){
            int temp = 0;
            for (int i = 0; i < period; i++) {
                temp += visits[i];
                if(temp > max) {
                    max = temp;
                    count = 1;
                }
            }

            for (int i = period; i < days; i++) {
                temp += (visits[i] - visits[i - period]);
                if(temp > max) {
                    max = temp;
                    count = 1;
                }
                else if(temp == max)
                    count ++;
            }
        }

        if(max == 0)
            System.out.println("SAD");
        else {
            System.out.println(max);
            System.out.println(count);
        }
    }
}
