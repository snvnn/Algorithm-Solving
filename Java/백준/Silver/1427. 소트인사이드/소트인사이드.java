import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();

        String[] numArr = num.split("");
        Arrays.sort(numArr);

        for (int i = numArr.length; i > 0; i--) {
            System.out.print(numArr[i-1]);
        };
    }
}