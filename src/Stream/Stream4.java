package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        List<Integer>list=List.of(11,22,33,44,57,89,45,67,76,45);
      List<Integer>evenlist=  list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(evenlist);


    }
}
