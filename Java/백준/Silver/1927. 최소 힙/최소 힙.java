import java.util.*;

public class Main {
    public static class Heap{
        private ArrayList<Integer> arr = new ArrayList<>();

        public void add(int e){
            arr.add(e);
            perlocateUp(arr.size()-1);
        }

        private void perlocateUp(int i){
            int parent = (i-1) / 2;
            if(i>0 && arr.get(i)<arr.get(parent)){
                swap(i, parent);
                perlocateUp(parent);
            }
        }

        private void perlocateDown(int i){
            int child = i * 2 + 1;
            if (child >= arr.size()) return;
            int right = i * 2 + 2;

            if (right < arr.size() && arr.get(child) > arr.get(right)) {
                child = right;
            }

            if (child < arr.size() && arr.get(i) > arr.get(child)) {
                swap(i, child);
                perlocateDown(child);
            }
        }

        private void swap(int left, int right){
            int temp = arr.get(left);
            arr.set(left, arr.get(right));  // set()으로 교환
            arr.set(right, temp);
        }

        public void pop(){
            int ans = arr.get(0);
            int temp = arr.size()-1;
            swap(0, temp);
            arr.remove(temp);
            perlocateDown(0);
            System.out.println(ans);
        }

        public int getSize(){
            return arr.size();
        }

    }
    public static void main(String[] args){
        Heap heap = new Heap();
        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();
        for (int i = 0; i < lines; i++) {
            int a = scanner.nextInt();
            if(a == 0){
                if(heap.getSize() == 0)
                    System.out.println(0);
                else
                    heap.pop();
            } else
                heap.add(a);
        }

    }
}
