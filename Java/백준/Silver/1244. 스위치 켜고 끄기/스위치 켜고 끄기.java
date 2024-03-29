import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int switches = scanner.nextInt();
        int[] status = new int[switches];

        for (int i = 0; i < status.length; i++) {
            status[i] = scanner.nextInt();
        }

        int students = scanner.nextInt();
        int gender;
        int radix;

        for (int i = 0; i < students; i++) {
            gender = scanner.nextInt();
            radix = scanner.nextInt();
            if(gender == 1){
                for (int j = radix-1 ; j < status.length; j += radix) {
                    status[j] ++;
                    status[j] %= 2;
                }
            }
            else if(gender == 2){
                int max = radix;
                int min = radix - 2;
                status[radix-1] ++;
                status[radix-1] %= 2;
                while(true){
                    if(max < status.length && min >=0){
                        if(status[max] == status[min]){
                            status[max]++;
                            status[min]++;
                            status[max] %= 2;
                            status[min] %= 2;
                            max++;
                            min--;
                        }
                        else
                            break;
                    }
                    else
                        break;
                }
            }
        }

        for (int i = 0; i < status.length; i++) {
            if((i+1)%20 == 0)
                System.out.println(status[i]);
            else
                System.out.print(status[i] + " ");
        }

    }
}
