import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num1 = br.readLine();
        int testcase = Integer.parseInt(num1);
        HashMap<Integer, Integer> keyarr = new HashMap<>();
        HashMap<Integer, Integer> valarr = new HashMap<>();

        for (int i = 0; i < testcase; i++) {
            String temp = br.readLine();
            int tempNum = Integer.parseInt(temp);
            keyarr.put(i,tempNum);
            valarr.put(tempNum,i);
        }

        StringBuilder output = new StringBuilder();

        for (int i = -1000000; i <= 1000000; i++) {
            if(valarr.containsKey(i)){
                output.append(keyarr.get(valarr.get(i))).append("\n");
            }
        }

        bw.write(output.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
