import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int price = scanner.nextInt();
        int[] coins = new int[num];
        int chips = 0;
        int i;

        for (i = 0; i < coins.length; i++) {
            coins[i] = scanner.nextInt();
        }
        i = coins.length-1;
        while(price != 0){
            int temp = price / coins[i];
            price %= coins[i];
            chips += temp;
            i--;
        }

        System.out.println(chips);
    }
}