import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long root = (long)Math.sqrt(n);

        if(root*root < n)
            System.out.println(root+1);
        else
            System.out.println(root);

    }
}
