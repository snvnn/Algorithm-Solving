import java.util.*;
import java.io.*;

public class Main {
    public static class Stack {
        private ArrayList<Integer> arr = new ArrayList<>();
        public int top(){
            if (arr.isEmpty())
                return -1;
            else {
                return arr.get(arr.size()-1);
            }
        }

        public int pop(){
            if (arr.isEmpty())
                return -1;
            else{
                int temp = arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
                return temp;
            }
        }

        public int empty(){
            if(arr.isEmpty())
                return 1;
            else
                return 0;
        }

        public int size(){
            return arr.size();
        }

        public void push(int e){
            arr.add(e);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int instructions = Integer.parseInt(a);
        Stack stack = new Stack();

        for (int i = 0; i < instructions; i++) {
            String line = reader.readLine();
            String[] command = line.split(" ");
            if(command.length == 1){
                switch (command[0]){
                    case "pop":
                        System.out.println(stack.pop());
                        break;
                    case "top":
                        System.out.println(stack.top());
                        break;
                    case "empty":
                        System.out.println(stack.empty());
                        break;
                    case "size":
                        System.out.println(stack.size());
                        break;
                }
            }
            else if(command.length == 2){
                stack.push(Integer.parseInt(command[1]));
            }
        }
    }
}
