// Collect elements greater than 50....

package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,23,78,98,77,67,62,34,33,54,55,12);

       List<Integer>list1= list.stream().filter(i->i>50).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list1);
    }
}
