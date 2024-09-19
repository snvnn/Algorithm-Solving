import java.util.*;

public class Main {
    public static int fibonacci(int n){
        if(n==1)
            return 1;
        else if(n==0)
            return 0;
        else{
        int prev = 0;
        int temp = 1;
        int next = 0;
        for (int i = 0; i < n-1; i++) {
            next = prev + temp;
            prev = temp;
            temp = next;
        }
        return next;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            int temp = scanner.nextInt();
            if(temp == 0)
                System.out.println("1 0");
            else
                System.out.println(fibonacci(temp-1) + " " +fibonacci(temp));
        }
    }
}