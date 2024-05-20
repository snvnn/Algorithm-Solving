import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int temp = 0;
        int count = 0;
        boolean fillable = false;

        int[] blocks = new int[width];
        for (int i = 0; i < width; i++) {
            blocks[i] = scanner.nextInt();
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(blocks[0] > 0)
                    fillable = true;

                if(blocks[j] > 0) {
                    if(fillable)
                        count += temp;
                    fillable = true;
                    temp = 0;
                }
                else{
                    temp++;
                }
                blocks[j]--;
            }
            temp = 0;
            fillable = false;
        }

        System.out.println(count);
    }
}
