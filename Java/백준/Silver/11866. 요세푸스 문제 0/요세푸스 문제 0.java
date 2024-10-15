import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        int index = 0;
        k--;
        System.out.print("<");
        while(!arr.isEmpty()) {
            index += k;
            index %= arr.size();
            System.out.print(arr.get(index));
            if(arr.size()!=1)
                System.out.print(", ");
            arr.remove(index);
        }
        System.out.println(">");
    }
}