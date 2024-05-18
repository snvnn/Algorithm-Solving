import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();

        num *= 2;
        num += 0.25;

        num = Math.sqrt(num);
        num -= 0.5;

        System.out.println((int)num);
    }
}
