import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();
        String[] array = new String[testcase];
        String[] larray = new String[testcase];

        for(int i = 0; i < testcase; i++){
            array[i] = scanner.next();
            larray[i] = "";
        }

        Arrays.sort(array);

        List<String> rArray = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                rArray.add(array[i-1]);
            }
        }

        rArray.add(array[array.length-1]);
        String[] uArray = rArray.toArray(new String[rArray.size()]);

        Arrays.sort(uArray);

        int k = 0;

        for (int i = 1; i < 51; i++) {
            for (int j = 0; j < uArray.length; j++) {
                if(uArray[j].length() == i) {
                    larray[k] = uArray[j];
                    k++;
                }
            }
        }

        for (String s : larray) {
            if (!s.isEmpty()) {
                System.out.println(s);
            }
        }
    }
}
