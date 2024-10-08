import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++) {
            int a = scanner.nextInt();
            long[] temp = {0,0,0,1,1};
            long ans = 0;

            for (int j = 0; j < a; j++) {
                if(j == 4)
                    temp[4] = 0;
                temp[j%5] += temp[(j+4)%5];
                ans = temp[j%5];
            }

            System.out.println(ans);
        }
    }
}