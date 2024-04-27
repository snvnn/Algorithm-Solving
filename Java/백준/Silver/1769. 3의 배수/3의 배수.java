import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int count = 0;
        int val = 0;

        while(true){
            if(num.length() < 2){
                val = Integer.parseInt(num);
                break;
            }
            int sum = 0;
            if(count == 0) {
                String[] digits = num.split("");
                for (int i = 0; i < digits.length; i++) {
                    sum += Integer.parseInt(digits[i]);
                }
                val = sum;
            }
            if(count!=0){
                String[] digits = Integer.toString(val).split("");
                for (int i = 0; i < digits.length; i++) {
                    sum += Integer.parseInt(digits[i]);
                }
                val = sum;
            }
            count++;
            if(val < 10)
                break;

        }
        System.out.println(count);
        if(val%3 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
