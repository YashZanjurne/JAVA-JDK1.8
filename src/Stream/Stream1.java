// Solving problem without using Stream Api


package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {

        // Creating list using List.Of Method...
        List<Integer>list1 = List.of(1,2,3,4,5,6,7,8,9,10);


        // Creating list using Regular method....
        List<Integer>list2= new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(16);
        list2.add(17);
        list2.add(18);
        list2.add(19);
        list2.add(20);

        // Creating List using Arrays.aslist...
        List<Integer>list3 = Arrays.asList(21,22,23,24,25,26,27,28,29,30);

        // Find only Even numbers using old method...
        System.out.println("Even using regular mathod");
         List<Integer>listEven= new ArrayList<>();
        for(Integer i : list1){
            if(i%2==0){
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);

        // Find Even Numbers Using StreamApI...
        System.out.println("Using Stream");
        Stream<Integer>stream = list2.stream();
      List<Integer>list2Even=  stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list2);
        System.out.println(list2Even);

        System.out.println("Using Stream Sort code");
        // Find even Using StreamAPI short method...
         List<Integer> list3Even = list3.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list3);
        System.out.println(list3Even);
    }
}
