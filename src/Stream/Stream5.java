import java.util.*;
import java.util.stream.Collectors;

public class Stream5 {
    public static void main(String[] args) {
        // 1. Using Lambda Expression for Sorting a List
        List<String> names = Arrays.asList("Yash", "Sunil", "Zanjurne", "Java", "MCA");
        names.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println("Sorted Names: " + names);

        // 2. Using Stream API to Filter and Collect Data
        List<Integer> numbers = Arrays.asList(10, 25, 30, 40, 50, 60);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // 3. Using Optional to Avoid NullPointerException
        Optional<String> optionalName = names.stream().filter(n -> n.startsWith("J")).findFirst();
        optionalName.ifPresent(name -> System.out.println("First Name Starting with J: " + name));

        // 4. Using Functional Interface - Runnable with Lambda
        Runnable runnable = () -> System.out.println("Running in a separate thread using Lambda!");
        new Thread(runnable).start();
    }
}

