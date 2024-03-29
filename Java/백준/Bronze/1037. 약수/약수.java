import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 1000000;

        int nums = scanner.nextInt();

        for (int i = 0; i < nums; i++) {
            int t = scanner.nextInt();
            if(t > max)
                max = t;

            if(t < min)
                min = t;
        }

        System.out.println(max*min);
    }
}
