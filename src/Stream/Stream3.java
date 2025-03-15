// Square of numbers even numbers present in list...

package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
    public static void main(String[] args) {
        List<Integer>list = List.of(1,2,3,4,5,6,7,8,9,10);

       List<Integer>listEven =list.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println(listEven);

      List<Integer>list1 =   listEven.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(list1);
    }
}
