import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int points = 1;

        for (int i = 0; i < 4; i++) {
            points *= (num - i);
            points /= (i+1);
        }

        System.out.println(points);
    }
}
