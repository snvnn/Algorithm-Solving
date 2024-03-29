import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int min = 5000;

        for(int i = 0; i < 2000; i++){
            for(int j = 0; j < 2000; j++){
                if((i*3 + j*5) == a) {
                    if ((i + j) < min)
                        min = i + j;
                }
            }
        }

        if(min == 5000)
            System.out.println("-1");
        else if(min < 5000)
            System.out.println(min);

        scanner.close();
    }
}
