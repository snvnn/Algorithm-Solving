import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br. readLine();
        StringTokenizer st = new StringTokenizer(line);
        int dimension = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken())+1;
        int col = Integer.parseInt(st.nextToken())+1;

        int length = 1;
        for (int i = 0; i < dimension; i++) {
            length *= 2;
        }
        int order = length * length;
        int ans = 0;

        while(length > 0){
            length /= 2;
            order /= 4;

            if (row > length && col > length){
                row -= length;
                col -= length;
                ans += order*3;
            } else if (row > length && col <= length) {
                row -= length;
                ans += order*2;
            } else if (row <= length && col > length) {
                col -= length;
                ans += order;
            } else if (row <= length && col <= length){
            }

        }
        System.out.println(ans);
    }
}