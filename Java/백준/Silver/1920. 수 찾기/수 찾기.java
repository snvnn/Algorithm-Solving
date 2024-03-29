    import java.util.*;

    public class Main {
        public static int binarySearch(int[] arr, int target){
            int low = 0;
            int high = arr.length -1;
            int mid;

            while(low <= high) {
                mid = (low + high) / 2;

                if (arr[mid] == target)
                    return 1;
                else if (arr[mid] > target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
                    return 0;
        }

        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            int[] arr1 = new int[num1];
            for (int i = 0; i < num1; i++) {
                arr1[i] = scanner.nextInt();
            }

            Arrays.sort(arr1);

            int num2 = scanner.nextInt();
            int[] arr2 = new int[num2];
            for (int i = 0; i < num2; i++) {
                arr2[i] = scanner.nextInt();
            }

            for (int i = 0; i < arr2.length; i++){
                System.out.println(binarySearch(arr1, arr2[i]));
            }
        }
    }
