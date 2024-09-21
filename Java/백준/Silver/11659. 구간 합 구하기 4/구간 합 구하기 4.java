import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str1);
        int length = Integer.parseInt(st1.nextToken());
        int operations = Integer.parseInt(st1.nextToken());

        int[] arr = new int[length+1];
        int[] presum = new int[length+1];

        String nums = br.readLine();
        StringTokenizer numSt = new StringTokenizer(nums);
        for (int i = 1; i <= length; i++) {
            arr[i] = Integer.parseInt(numSt.nextToken());
            presum[i] = presum[i-1] + arr[i];
        }

        for (int i = 0; i < operations; i++) {
            String temp = br.readLine();
            StringTokenizer tempSt = new StringTokenizer(temp);
            int left = Integer.parseInt(tempSt.nextToken());
            int right = Integer.parseInt(tempSt.nextToken());

            int sum = presum[right] - presum[left-1];

            bw.write(Integer.toString(sum) + "\n");
            bw.flush();

        }

        bw.close();
        br.close();
    }
}