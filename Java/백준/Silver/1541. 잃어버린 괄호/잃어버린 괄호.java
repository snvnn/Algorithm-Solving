import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        String[] splited = line.split("-");
        int[] parsed = new int[splited.length];

        for (int i = 0; i < splited.length; i++) {
            if(splited[i].contains("+")){
                String[] temparr = splited[i].split("\\+");
                for (int j = 0; j < temparr.length; j++) {
                    parsed[i] += Integer.parseInt(temparr[j]);
                }
            } else{
                parsed[i] = Integer.parseInt(splited[i]);
            }
        }

        int sum = parsed[0];

        for (int i = 1; i < parsed.length; i++) {
            sum -= parsed[i];
        }

        System.out.println(sum);
    }
}