import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int[][] mat = new int[height][width];
        int max = 0;
        int temp;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < height-3; i++) {
            for (int j = 0; j < width; j++) {
                temp = mat[i][j] + mat[i+1][j] + mat[i+2][j] + mat[i+3][j];

                if(temp > max)
                    max = temp;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width-3; j++) {
                temp = mat[i][j] + mat[i][j+1] + mat[i][j+2] + mat[i][j+3];

                if(temp > max)
                    max = temp;
            }
        }


        for (int i = 0; i < height-2; i++) {
            for (int j = 0; j < width-1; j++) {
                temp = Math.max(mat[i][j]+mat[i][j+1]+mat[i+1][j]+mat[i+1][j+1],
                        mat[i+1][j]+mat[i+1][j+1]+mat[i+2][j]+mat[i+2][j+1]);

                temp = Math.max(mat[i][j]+mat[i][j+1]+mat[i+1][j]+mat[i+2][j],
                        temp);
                temp = Math.max(mat[i][j]+mat[i+2][j+1]+mat[i+1][j]+mat[i+2][j],
                        temp);
                temp = Math.max(mat[i][j]+mat[i][j+1]+mat[i+1][j+1]+mat[i+2][j+1],
                        temp);
                temp = Math.max(mat[i+2][j]+mat[i][j+1]+mat[i+1][j+1]+mat[i+2][j+1],
                        temp);

                temp = Math.max(mat[i][j]+mat[i+1][j]+mat[i+1][j+1]+mat[i+2][j+1],
                        temp);
                temp = Math.max(mat[i][j+1]+mat[i+1][j]+mat[i+1][j+1]+mat[i+2][j],
                        temp);

                temp = Math.max(mat[i][j]+mat[i+1][j]+mat[i+1][j+1]+mat[i+2][j],
                        temp);
                temp = Math.max(mat[i][j+1]+mat[i+1][j+1]+mat[i+1][j]+mat[i+2][j+1],
                        temp);

                if(temp > max)
                    max = temp;
            }
        }

        for (int i = 0; i < height-1; i++) {
            for (int j = 0; j < width-2; j++) {
                temp = Math.max(mat[i][j]+mat[i][j+1]+mat[i][j+2]+mat[i+1][j],
                        mat[i+1][j]+mat[i+1][j+1]+mat[i+1][j+2]+mat[i][j]);
                temp = Math.max(mat[i][j]+mat[i][j+1]+mat[i][j+2]+mat[i+1][j+2],
                        temp);
                temp = Math.max(mat[i+1][j]+mat[i+1][j+1]+mat[i+1][j+2]+mat[i][j+2],
                        temp);

                temp = Math.max(mat[i][j]+mat[i][j+1]+mat[i+1][j+1]+mat[i+1][j+2],
                        temp);
                temp = Math.max(mat[i+1][j]+mat[i+1][j+1]+mat[i][j+1]+mat[i][j+2],
                        temp);

                temp = Math.max(mat[i][j]+mat[i][j+1]+mat[i][j+2]+mat[i+1][j+1],
                        temp);
                temp = Math.max(mat[i+1][j]+mat[i+1][j+1]+mat[i+1][j+2]+mat[i][j+1],
                        temp);

                if(temp > max)
                    max = temp;
            }
        }

        System.out.println(max);
    }
}
