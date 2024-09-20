import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> name = new HashMap<>();
        HashMap<String, Integer> reverseName = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        int cases = scanner.nextInt();
        int searches = scanner.nextInt();
        int num = 0;

        // 입력 받으며 HashMap에 저장
        for (int i = 0; i < cases; i++) {
            String temp = scanner.next();
            name.put(i+1, temp);
            reverseName.put(temp, i+1);  // 값을 키로 저장
        }

        // 검색 및 리스트 추가
        for (int i = 0; i < searches; i++) {
            String temp = scanner.next();
            if(reverseName.containsKey(temp)) {  // containsValue 대신 containsKey 사용
                num++;
                list.add(temp);
            }
        }

        // 정렬 및 출력
        list.sort(Comparator.naturalOrder());
        System.out.println(num);
        list.forEach(System.out::println);  // get() 대신 forEach 사용
    }
}