import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int leaderboard = scanner.nextInt();
        int score = scanner.nextInt();
        int cutline = scanner.nextInt();

        int[] rank = new int[cutline];

        for (int i = 0; i < leaderboard; i++) {
            rank[i] = scanner.nextInt();
        }
        for (int i = leaderboard; i < rank.length; i++) {
            rank[i] = -1;
        }

        int temp = 1;

        for (int i = 0; i < rank.length; i++) {
            if(rank[i] > score){
                temp++;
            }
        }

        if (temp > cutline)
            System.out.println(-1);
        else if (temp <= cutline) {
            if(score <= rank[cutline-1]){
                System.out.println(-1);
            }
            else{
                System.out.println(temp);
            }
        }
    }
}
