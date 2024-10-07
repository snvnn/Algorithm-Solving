import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++) {
            int outfits = scanner.nextInt();

            if(outfits == 0){
                System.out.println(outfits);
            } else {
                HashMap<String, Integer> cat = new HashMap<>();
                HashMap<Integer, String> index = new HashMap<>();
                int parts = 0;

                for (int j = 0; j < outfits; j++) {
                    String gb = scanner.next();
                    String part = scanner.next();
                    if (cat.containsKey(part)) {
                        cat.replace(part, cat.get(part), cat.get(part) + 1);
                    } else {
                        cat.put(part, 2);
                        index.put(parts, part);
                        parts++;
                    }
                }

                int answer = 1;
                for (int j = 0; j < parts; j++) {
                    String temp = index.get(j);
                    answer *= cat.get(temp);
                }

                System.out.println(answer - 1);
            }
        }
    }
}