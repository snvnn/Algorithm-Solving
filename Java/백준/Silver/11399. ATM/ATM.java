import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] queue = new int[num];
        int[] timelist = new int[1000];

        for (int i = 0; i < queue.length; i++) {
            queue[i] = scanner.nextInt();
            timelist[queue[i]-1]++;
        }
        int[] newQueue = new int[num];

        int j = 0;
        for (int i = 0; i < timelist.length; i++) {
            while(timelist[i] > 0){
                newQueue[j] = i+1;
                j++;
                timelist[i]--;
            }
        }

        j = newQueue.length;
        for (int i = 0; i < newQueue.length; i++) {
            newQueue[i] *= j;
            j--;
        }

        int sum = 0;
        for (int i = 0; i < newQueue.length; i++) {
            sum += newQueue[i];
        }

        System.out.println(sum);
    }
}