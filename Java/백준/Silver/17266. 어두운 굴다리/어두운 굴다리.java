import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int lights = scanner.nextInt();
        int[] spots = new int[lights];
        int height = -1;
        int gap;

        for (int i = 0; i < spots.length; i++) {
            spots[i] = scanner.nextInt();
        }

        if(length == 0)
            height = 0;
        else{
            height = spots[0];

            if(spots.length > 1) {
                for (int i = 1; i < spots.length; i++) {
                    gap = spots[i] - spots[i - 1];
                    if (gap % 2 == 1) {
                        gap /= 2;
                        gap++;
                    } else
                        gap /= 2;

                    if (gap > height)
                        height = gap;
                }
            }

            if(length - spots[spots.length-1] > height)
                height = length - spots[spots.length-1];

        }

        System.out.println(height);
    }
}
