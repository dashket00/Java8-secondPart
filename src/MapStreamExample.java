import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStreamExample {
    public static void main(String[] args) {
        Map<Integer, String> dataMap = new HashMap<>();
        dataMap.put(1, "John");
        dataMap.put(2, "Alice");
        dataMap.put(3, "Gerald");
        dataMap.put(5, "Bob");
        dataMap.put(8, "Charlie");
        dataMap.put(9, "David");
        dataMap.put(13, "Eva");
        dataMap.put(15, "Robert");

        List<String> filteredAndReversedNames = dataMap.entrySet().stream()
                .filter(entry -> List.of(1, 2, 5, 8, 9, 13).contains(entry.getKey()))
                .filter(entry -> entry.getValue().length() % 2 != 0)
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())
                .toList();

        System.out.println("Отфильтрованные и задом наперед имена: " + filteredAndReversedNames);
    }
}
