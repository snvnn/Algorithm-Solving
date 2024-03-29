    import java.util.*;

    public class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int players = scanner.nextInt();
            String game = scanner.next();
            String[] playerList = new String[players];

            for (int i = 0; i < players; i++) {
                playerList[i] = scanner.next();
            }

            Set<String> playerSet = new HashSet<>(Arrays.asList(playerList));
            String[] uniquePlayers = playerSet.toArray(new String[0]);
            
            if(game.equals("Y"))
                System.out.println(uniquePlayers.length);
            else if(game.equals("F"))
                System.out.println(uniquePlayers.length/2);
            else if(game.equals("O"))
                System.out.println(uniquePlayers.length/3);
        }
    }