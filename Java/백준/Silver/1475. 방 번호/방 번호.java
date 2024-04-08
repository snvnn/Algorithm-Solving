import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] sets = new int[11];
        for (int i = 0; i < 11; i++) {
            sets[i] = 0;
        }
        String number = scanner.next();
        String[] digits = number.split("");


        for (int i = 0; i < digits.length; i++) {
            sets[Integer.parseInt(digits[i])]++;
        }

        int temp = sets[9] + sets[6];
        temp = temp/2 + temp%2;

        sets[9] = temp;
        sets[6] = temp;

        int max = 0;
        for (int i = 0; i < sets.length; i++) {
            if(sets[i] > max)
                max = sets[i];
        }

        if(max >= temp)
            System.out.println(max);
        else System.out.println(temp);
    }
}
