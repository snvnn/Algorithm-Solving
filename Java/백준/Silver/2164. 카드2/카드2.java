import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int tail = left;

        int[] cards = new int[left*2];
        for (int i = 0; i < left; i++) {
            cards[i] = i+1;
        }

        for (int i = 1; cards[i] != 0; i+=2) {
            cards[tail] = cards[i];
            tail++;
        }

        System.out.println(cards[tail-1]);
    }
}