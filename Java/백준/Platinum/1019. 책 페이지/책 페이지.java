import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] strNum = Integer.toString(num).split("");
        int[] arr = new int[10];
        int temp;
        int index = 1;

        if(strNum.length==1){
            temp = Integer.parseInt(strNum[0]);
            for (int i = 1; i <= temp; i++) {
                arr[i]++;
            }
        } else {
            for (int i = strNum.length-1; i >= 0; i--) {
                temp = Integer.parseInt(strNum[i]);
                int left = num / (index*10);
                int right = 0;
                if(index > 1)
                    right = num % index;

                int leftAdder = index * left;
                int rightAdder = right + 1;

                if(i==strNum.length-1){
                    for (int j = 1; j <= temp; j++) {
                        arr[j]++;
                    }
                    for (int j = 0; j <= 9; j++) {
                        arr[j] += left;
                    }
                } else if (i==0){
                    for (int j = 1; j <= temp-1; j++) {
                        arr[j] += index;
                    }
                    arr[temp] += rightAdder;
                } else{
                    if(temp == 0){
                        leftAdder -= index;
                        temp += 10;
                    }
                    for (int j = 1; j <= temp-1; j++) {
                        arr[j] += index;
                    }
                    for (int j = 0; j <= 9; j++) {
                        arr[j] += leftAdder;
                    }
                    temp %= 10;
                    arr[temp] += rightAdder;
                }
                index *= 10;
            }
        }


        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[9]);

    }
}
