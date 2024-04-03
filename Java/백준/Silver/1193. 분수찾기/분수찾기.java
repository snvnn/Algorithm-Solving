import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x = 0;
        int y = 0;
        int count = 0;

        for (int i = 1; i <= 5000; i++) {
            for (int j = 1; j <= i; j++) {
                if(count == num)
                    break;
                if(i%2 == 0){
                    x = j;
                    y = i-j+1;
                } else if (i%2 == 1) {
                    x = i-j+1;
                    y = j;
                }
                count++;
            }
            if(count == num)
                break;
        }

        System.out.println(x + "/" + y);
    }
}
