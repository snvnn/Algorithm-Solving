import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        int cases;
        int num;

        for (int i = 0; i < testcase; i++) {
            num = scanner.nextInt();
            cases = 0;
            cases = 1 + num/2 + num/3;

            for (int j = 1; num > 3*j; j++) {
                int temp = (num - 3*j) / 2;
                cases += temp;
            }

            System.out.println(cases);
        }
    }
}