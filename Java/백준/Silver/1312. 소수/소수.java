import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            if(i == n)
                System.out.println(a/b);
            a %=b;
            a *= 10;
        }
    }
}
