import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int quotient;
        int count = 10;

        for (int i = 0; i <= n; i++) {
            quotient = a / b;
            if(i == n)
                System.out.println(quotient);
            a %=b;
            a *= count;
        }
    }
}
