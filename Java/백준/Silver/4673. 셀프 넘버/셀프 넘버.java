import java.util.*;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = 1;
        }
        int temp;
        int n;

        for (int i = 1; i < 10000; i++) {
            n = i;
            temp = i;
            temp += i/1000;
            i = i%1000;
            temp += i/100;
            i = i%100;
            temp += i/10 +i%10;
            i = n;

            if(temp <= 10000)
                arr[temp-1] = 0;
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            if(arr[i] == 1) {
                output.append(i+1);
                output.append("\n");
            }
        }

        System.out.println(output);
    }
}
