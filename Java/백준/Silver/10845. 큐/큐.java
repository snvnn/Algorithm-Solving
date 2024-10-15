import java.io.*;
import java.util.*;

public class Main{
    public static class Queue{
        private ArrayList<Integer> arr = new ArrayList<>();
        public void push(int e){
            arr.add(e);
        }

        public int pop(){
            if(arr.size()!=0){
                int temp = arr.get(0);
                arr.remove(0);
                return temp;
            }
            else
                return -1;
        }

        public int empty(){
            if(arr.size()==0)
                return 1;
            else
                return 0;
        }

        public int front(){
            if(arr.size()!=0){
                return arr.get(0);
            }
            else
                return -1;
        }

        public int back(){
            if(arr.size()!=0){
                return arr.get(arr.size()-1);
            }
            else
                return -1;
        }

        public int size(){
            return arr.size();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String l1 = br.readLine();
        int instruments = Integer.parseInt(l1);

        Queue queue = new Queue();

        for (int i = 0; i < instruments; i++) {
            String temp = br.readLine();
            StringTokenizer st = new StringTokenizer(temp);
            String command = st.nextToken();
            if(command.equals("push")){
                int e = Integer.parseInt(st.nextToken());
                queue.push(e);
            } else if (command.equals("pop")) {
                bw.write(Integer.toString(queue.pop())+"\n");
            } else if (command.equals("size")) {
                bw.write(Integer.toString(queue.size())+"\n");
            } else if (command.equals("empty")) {
                bw.write(Integer.toString(queue.empty())+"\n");
            } else if (command.equals("front")) {
                bw.write(Integer.toString(queue.front())+"\n");
            } else if (command.equals("back")) {
                bw.write(Integer.toString(queue.back())+"\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}