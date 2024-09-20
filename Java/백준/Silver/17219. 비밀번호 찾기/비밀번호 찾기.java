import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException  {
        HashMap<String, String> passKeys = new HashMap<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nums = bf.readLine();
        StringTokenizer st1 = new StringTokenizer(nums);
        int pages = Integer.parseInt(st1.nextToken());
        int searches = Integer.parseInt(st1.nextToken());

        for (int i = 0; i < pages; i++) {
            String temp = bf.readLine();
            StringTokenizer st2 = new StringTokenizer(temp);
            String website = st2.nextToken();
            String passwd = st2.nextToken();
            passKeys.put(website,passwd);
        }

        for (int i = 0; i < searches; i++) {
            String query = bf.readLine();
            String out = passKeys.get(query);
            bw.write(out+"\n");
            bw.flush();
        }
        bw.close();
    }
}