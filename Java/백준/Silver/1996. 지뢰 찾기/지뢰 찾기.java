import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] map = new String[n][n];
        int[][] intmap = new int[n][n];

        for (int i = 0; i < n; i++) {
            String temp = scanner.next();
            map[i] = temp.split("");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j].equals("."))
                    intmap[i][j] = 0;
                else
                    intmap[i][j] = Integer.parseInt(map[i][j]);
            }
        }

        if(n == 1){
            if(intmap[0][0] == 0)
                System.out.println(0);
            else
                System.out.println("*");
        } else{
            int temp;
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(intmap[i][j] != 0){
                        output.append("*");
                    }
                    else{
                        if(j == 0){
                            if(i == 0){
                                temp = intmap[i][j+1] + intmap[i+1][j] + intmap[i+1][j+1];
                            } else if (i == n-1) {
                                temp = intmap[i-1][j] + intmap[i-1][j+1] + intmap[i][j+1];
                            } else{
                                temp = intmap[i-1][j] + intmap[i-1][j+1] + intmap[i][j+1]
                                        + intmap[i+1][j] + intmap[i+1][j+1];
                            }
                        }else if(j == n-1){
                            if(i == 0){
                                temp = intmap[i][j-1] + intmap[i+1][j-1] + intmap[i+1][j];
                            } else if (i == n-1) {
                                temp = intmap[i-1][j-1] + intmap[i-1][j] + intmap[i][j-1];
                            } else{
                                temp = intmap[i-1][j-1] + intmap[i-1][j] + intmap[i][j-1]
                                        + intmap[i+1][j-1] + intmap[i+1][j];
                            }
                        }else{
                            if(i ==0) {
                                temp = intmap[i][j-1] + intmap[i][j+1]
                                        +intmap[i+1][j-1] + intmap[i+1][j] + intmap[i+1][j+1];
                            } else if (i == n-1) {
                                temp = intmap[i-1][j-1] + intmap[i-1][j] + intmap[i-1][j+1]
                                        +intmap[i][j-1] + intmap[i][j+1];
                            } else{
                                temp = intmap[i-1][j-1] + intmap[i-1][j] + intmap[i-1][j+1]
                                        +intmap[i][j-1] + intmap[i][j+1]
                                        +intmap[i+1][j-1] + intmap[i+1][j] + intmap[i+1][j+1];
                            }
                        }

                        if(temp >= 10)
                            output.append("M");
                        else
                            output.append(temp);
                    }
                }
                output.append("\n");
            }
            System.out.println(output);
        }
    }
}
