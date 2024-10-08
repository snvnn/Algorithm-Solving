import java.util.*;

public class Main{
    public static String reverse(String token){
        String[] arr = token.split("");
        StringBuilder reversed = new StringBuilder();

        for (int i = arr.length-1; i >= 0; i--) {
            reversed.append(arr[i]);
        }
        return reversed.toString();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 1; i < word.length()-1; i++) {
            for (int j = i+1; j < word.length(); j++) {
                String temp1 = word.substring(0,i);
                String temp2 = word.substring(i,j);
                String temp3 = word.substring(j);

                String temp = reverse(temp1) +
                        reverse(temp2) +
                        reverse(temp3);

                if(arrayList.isEmpty()){
                    arrayList.add(temp);
                } else if(temp.compareTo(arrayList.get(0))<0){
                    arrayList.clear();
                    arrayList.add(temp);
                }
            }
        }
        System.out.println(arrayList.get(0));
    }
}