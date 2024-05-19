import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();

        int digits = num.length();

        int output = Integer.parseInt(num);
        output *= digits;
        
        StringBuilder a = new StringBuilder();
        if(digits > 1) {
            for (int i = 1; i < digits; i++) {
                a.append(Integer.toString(i));
            }

            String sub = String.valueOf(a);
            output -= Integer.parseInt(sub) * 9;
        }


        System.out.println(output);
    }
}
