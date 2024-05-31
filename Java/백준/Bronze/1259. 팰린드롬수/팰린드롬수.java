import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        while(a != 0){
            String sa = Integer.toString(a);
            String reverse = "";
            for(int i = sa.length() - 1; i >= 0; i--){
                reverse = reverse + sa.charAt(i);
            }
            if(sa.equals(reverse))
                System.out.println("yes");
            else
                System.out.println("no");
            
            a = scanner.nextInt();
        }

        scanner.close();
    }
}
