import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int h = 1;
        int w = 1;
        int i = 0;

        while((h+1)*(w+1) < n) {
            i++;
            if(i%2 == 0)
                h++;
            else
                w++;
        }

        System.out.print(2*h+2*w);
    }
}
