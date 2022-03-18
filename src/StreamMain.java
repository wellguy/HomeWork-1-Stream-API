import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    static List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    static List<Integer> newList = list.stream()
            .filter(x -> x > 0)
            .filter(x -> x % 2 == 0)
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());

    static void printlist () {
        System.out.println(newList);
    }
}

