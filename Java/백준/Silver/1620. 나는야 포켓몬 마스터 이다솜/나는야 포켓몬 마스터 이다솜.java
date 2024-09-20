import java.util.*;

public class Main {
    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> name = new HashMap<Integer, String>();
        HashMap<String, Integer> no = new HashMap<String, Integer>();
        HashSet<String> uniqueNames = new HashSet<>();

        int cases = scanner.nextInt();
        int searches = scanner.nextInt();
        int num = 1;
        for (int i = 0; i < cases; i++) {
            String temp = scanner.next();
            if(!uniqueNames.contains(temp)){
                uniqueNames.add(temp);
                name.put(num, temp);
                no.put(temp, num);
                num++;
            }
        }

        for (int i = 0; i < searches; i++) {
            String temp = scanner.next();
            if(isNumeric(temp)){
                int key = Integer.parseInt(temp);
                System.out.println(name.get(key));
            } else{
                System.out.println(no.get(temp));
            }
        }

    }
}
