import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computers = scanner.nextInt();
        int pairs = scanner.nextInt();
        List<List<Integer>> network = new ArrayList<>();


        for (int i = 0; i < computers; i++) {
            network.add(new ArrayList<>());
        }


        for (int i = 0; i < pairs; i++) {
            int left = scanner.nextInt() - 1;
            int right = scanner.nextInt() - 1;
            network.get(left).add(right);
            network.get(right).add(left);
        }

        boolean[] infected = new boolean[computers];
        infected[0] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : network.get(current)) {
                if (!infected[neighbor]) {
                    infected[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        int count = 0;
        for (int i = 1; i < computers; i++) {
            if (infected[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
