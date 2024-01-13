import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9);

        List<Integer> uniqueEvenNumbers = numbers.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        int sum = uniqueEvenNumbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Уникальные четные элементы: " + uniqueEvenNumbers);
        System.out.println("Сумма четных элементов: " + sum);
    }
}
